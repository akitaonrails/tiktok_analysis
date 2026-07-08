package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class ShoppingConfig {

    @C09CT("card_show_duration")
    public Integer cardShowDuration;

    @C09CT("disable_card")
    public Boolean disableCard;

    @C09CT("disable_want")
    public Boolean disableWant;

    @C09CT("enable")
    public Boolean enable;

    @C09CT("enable_float_video")
    public Boolean enableFloatVideo;

    @C09CT("enable_user")
    public Boolean enableUser;

    @C09CT("law_window")
    public Boolean lawWindow;

    @C09CT("live")
    public ShoppingLiveConfig live;

    @C09CT("newbie_help")
    public ShoppingNewbieHelp newbieHelp;

    @C09CT("order_share_intro_url")
    public String orderShareIntroUrl;

    @C09CT("preload_data_wait_duration")
    public Integer preloadDataWaitDuration = 3;

    public Integer getCardShowDuration() throws C316660CbA {
        Integer num = this.cardShowDuration;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableCard() throws C316660CbA {
        Boolean bool = this.disableCard;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableWant() throws C316660CbA {
        Boolean bool = this.disableWant;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getEnable() throws C316660CbA {
        Boolean bool = this.enable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableFloatVideo() throws C316660CbA {
        Boolean bool = this.enableFloatVideo;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableUser() throws C316660CbA {
        Boolean bool = this.enableUser;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getLawWindow() throws C316660CbA {
        Boolean bool = this.lawWindow;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public ShoppingLiveConfig getLive() throws C316660CbA {
        ShoppingLiveConfig shoppingLiveConfig = this.live;
        if (shoppingLiveConfig != null) {
            return shoppingLiveConfig;
        }
        throw new C316660CbA();
    }

    public ShoppingNewbieHelp getNewbieHelp() throws C316660CbA {
        ShoppingNewbieHelp shoppingNewbieHelp = this.newbieHelp;
        if (shoppingNewbieHelp != null) {
            return shoppingNewbieHelp;
        }
        throw new C316660CbA();
    }

    public String getOrderShareIntroUrl() throws C316660CbA {
        String str = this.orderShareIntroUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getPreloadDataWaitDuration() {
        return this.preloadDataWaitDuration;
    }
}
