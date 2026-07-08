package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class AwemeFEConfigs {

    @C09CT("business_ec")
    public BusinessEC businessEc;

    @C09CT("goods_report")
    public GoodsReport goodsReport;

    @C09CT("link_plan")
    public LinkPlan linkPlan;

    @C09CT("live")
    public ShopLiveConfig live;

    @C09CT("mp_tab")
    public MpTab mpTab;

    @C09CT("seed_label")
    public String seedLabel;

    @C09CT("seeding")
    public Seeding seeding;

    @C09CT("star_atlas_order")
    public StarAtlasOrder starAtlasOrder;

    @C09CT("video_auth")
    public VideoAuth videoAuth;

    public BusinessEC getBusinessEc() throws C316660CbA {
        BusinessEC businessEC = this.businessEc;
        if (businessEC != null) {
            return businessEC;
        }
        throw new C316660CbA();
    }

    public GoodsReport getGoodsReport() throws C316660CbA {
        GoodsReport goodsReport = this.goodsReport;
        if (goodsReport != null) {
            return goodsReport;
        }
        throw new C316660CbA();
    }

    public LinkPlan getLinkPlan() throws C316660CbA {
        LinkPlan linkPlan = this.linkPlan;
        if (linkPlan != null) {
            return linkPlan;
        }
        throw new C316660CbA();
    }

    public ShopLiveConfig getLive() throws C316660CbA {
        ShopLiveConfig shopLiveConfig = this.live;
        if (shopLiveConfig != null) {
            return shopLiveConfig;
        }
        throw new C316660CbA();
    }

    public MpTab getMpTab() throws C316660CbA {
        MpTab mpTab = this.mpTab;
        if (mpTab != null) {
            return mpTab;
        }
        throw new C316660CbA();
    }

    public String getSeedLabel() throws C316660CbA {
        String str = this.seedLabel;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Seeding getSeeding() throws C316660CbA {
        Seeding seeding = this.seeding;
        if (seeding != null) {
            return seeding;
        }
        throw new C316660CbA();
    }

    public StarAtlasOrder getStarAtlasOrder() throws C316660CbA {
        StarAtlasOrder starAtlasOrder = this.starAtlasOrder;
        if (starAtlasOrder != null) {
            return starAtlasOrder;
        }
        throw new C316660CbA();
    }

    public VideoAuth getVideoAuth() throws C316660CbA {
        VideoAuth videoAuth = this.videoAuth;
        if (videoAuth != null) {
            return videoAuth;
        }
        throw new C316660CbA();
    }
}
