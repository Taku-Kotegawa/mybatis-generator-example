package com.example.mybatisgeneratorexample.infrastructure.mapper.mbg;
import java.time.LocalDateTime;

import com.example.mybatisgeneratorexample.domain.model.mbg.Employee;
import com.example.mybatisgeneratorexample.domain.model.mbg.EmployeeExample;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class EmployeeMapperTest {

    private final EmployeeMapper target;

    @Autowired
    public EmployeeMapperTest(EmployeeMapper target) {
        this.target = target;
    }

    Employee createRow(String empId) {
        var row = new Employee();
        row.setCreatedBy("creater");
        row.setCreatedDate(LocalDateTime.now());
        row.setLastModifiedBy("updater");
        row.setLastModifiedDate(LocalDateTime.now());
        row.setVersion(0L);
        row.setEmail(empId + "@stnet.co.jp");
        row.setEmpId(empId);
        row.setEmpName(empId + "empName");
        row.setOrganizationId("1");
        row.setPassword("xxxx");
        row.setPositionId("2");
        row.setStatus("1");
        return row;
    }


    @Nested
    class countByExample {

        @Test
        void test001() {
            var actual = target.countByExample(null);
            assertThat(actual).isEqualTo(0);
        }

    }

    @Nested
    class updateByPrimaryKey {
    }

    @Nested
    class updateByPrimaryKeySelective {
    }

    @Nested
    class updateByExample {
    }

    @Nested
    class updateByExampleSelective {
    }

    @Nested
    class selectByPrimaryKey {
    }

    @Nested
    class selectByExample {
    }

    @Nested
    class selectByExampleWithRowbounds {
    }

    @Nested
    class insertSelective {
    }

    @Nested
    class insert {
        @Test
        void test001() {
            var row = createRow("11000975");
            target.insert(row);
        }
    }

    @Nested
    class deleteByPrimaryKey {

        @Test
        void test001() {
            var example = new EmployeeExample();
            example.or().andEmpIdEqualTo("11000975");
            var list = target.selectByExample(example);
            if (!list.isEmpty()) {
                target.deleteByPrimaryKey(list.get(0).getId());
            }
        }

    }

    @Nested
    class deleteByExample {
    }
}
