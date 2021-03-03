package com.itheima.domain;

public class Home {

    private Integer id;         //住房id
    private String homeNum;     // 房间号
    private String homeMode;    //房间类型
    private Integer homePrice; //房间价格
    private String des;         //房间描述
    private Integer mid;        //图片id 外键
    private Image image;        //房间图片
    private Integer isUse;      //房间状态 ,0 表示未入住 , 1表示入住

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }

    public String getHomeMode() {
        return homeMode;
    }

    public void setHomeMode(String homeMode) {
        this.homeMode = homeMode;
    }

    public Integer getHomePrice() {
        return homePrice;
    }

    public void setHomePrice(Integer homePrice) {
        this.homePrice = homePrice;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", homeNum='" + homeNum + '\'' +
                ", homeMode='" + homeMode + '\'' +
                ", homePrice=" + homePrice +
                ", des='" + des + '\'' +
                ", mid=" + mid +
                ", image=" + image +
                ", isUse=" + isUse +
                '}';
    }
}
