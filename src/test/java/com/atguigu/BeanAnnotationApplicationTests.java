package com.atguigu;

import com.atguigu.entity.House;
import com.atguigu.entity.Materail;
import com.atguigu.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanAnnotationApplicationTests {

    @Autowired
    Person p;

    @Autowired
    Materail materail;

    @Autowired
    private ObjectFactory<Materail> objectFactory;

    @Autowired
    private ObjectProvider<List<House>> objectProvider;


    @Test
    public void contextLoads() {
        System.out.println(p.getAge());
        System.out.println(materail);
        System.out.println(objectFactory);
        Materail m1 = objectFactory.getObject();
        Materail m2 = objectFactory.getObject();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1==m2);


        List<House> lists = objectProvider.getObject();

        //org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        // No qualifying bean of type 'com.atguigu.entity.House' available:
        // expected single matching bean but found 2: h1,h2
        /*House sy = objectProvider.getObject("沈阳");*/

        List<House> ifAvailable = objectProvider.getIfAvailable();
        /*House ifUnique = objectProvider.getIfUnique();*/
       /* System.out.println(sy);*/
        System.out.println(ifAvailable);
       /* System.out.println(ifUnique);*/
    }

}
