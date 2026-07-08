package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UgChannelPopup {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("campaign_list")
    public List<String> campaignList = new ArrayList();

    @C09CT("campaign_name")
    public String campaignName;

    @C09CT("content")
    public String content;

    @C09CT("h5_link")
    public String h5Link;

    @C09CT("image_style")
    public Integer imageStyle;

    @C09CT("link_schema")
    public String linkSchema;

    @C09CT("resource_url")
    public UrlModel resourceUrl;

    @C09CT("show_for_all")
    public Boolean showForAll;

    @C09CT("title")
    public String title;

    public String getButtonText() throws C316660CbA {
        String str = this.buttonText;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getCampaignName() throws C316660CbA {
        String str = this.campaignName;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getContent() throws C316660CbA {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getH5Link() throws C316660CbA {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getImageStyle() throws C316660CbA {
        Integer num = this.imageStyle;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getLinkSchema() throws C316660CbA {
        String str = this.linkSchema;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public UrlModel getResourceUrl() throws C316660CbA {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public Boolean getShowForAll() throws C316660CbA {
        Boolean bool = this.showForAll;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public String getTitle() throws C316660CbA {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public List<String> getCampaignList() {
        return this.campaignList;
    }
}
