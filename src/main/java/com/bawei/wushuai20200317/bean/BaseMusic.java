package com.bawei.wushuai20200317.bean;

import java.util.List;

public class BaseMusic {

    private String name;
    private String pic_s192;
    private List<ContentBean> content;

    public BaseMusic(int ic_launcher) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic_s192() {
        return pic_s192;
    }

    public void setPic_s192(String pic_s192) {
        this.pic_s192 = pic_s192;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }


}
