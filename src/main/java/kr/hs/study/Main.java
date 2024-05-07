package kr.hs.study;

import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.testDAO;
import kr.hs.study.dto.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        testDAO dao = ctx.getBean(testDAO.class);

        // insert
        testDTO bean1 = new testDTO();
        bean1.setId(1);
        bean1.setName("kim");

        dao.insert(bean1);

        // update
        testDTO bean2 = new testDTO();
        bean2.setId(2);
        bean2.setName("kim");

        dao.insert(bean2);

        bean2.setName("lee");

        dao.update(bean2);

        // delete
        testDTO bean3 = new testDTO();
        bean3.setId(1);
        dao.delete(bean3);

        // select
        List<testDTO> list = dao.select();
        for(testDTO item : list) {
            System.out.println("id:" + item.getId());
            System.out.println("name: " + item.getName());
        }

        ctx.close();
    }
}