package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-20:54
 */

public class ListObject<T>  {

    public ListObject(List<T> list) {
        this.list = list;
    }

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
