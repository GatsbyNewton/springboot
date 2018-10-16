package edu.wzm.vo;

import com.alibaba.fastjson.annotation.JSONField;
import edu.wzm.tool.ParamAlias;

/**
 * @author Jimmy Wong
 * @description 重命名 POST、GET 等请求传 key-value 的参数转换成的实体类
 */
public class UserVo {

    private String name;

    @ParamAlias(name = "country_code")
    @JSONField(name = "country_code")
    private String countryCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
