package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes13.dex */
public class WelcomePageTextStruct {

    @C09CT("description")
    public String description;

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("page_num")
    public Integer pageNum;

    @C09CT("title")
    public String title;

    public String getDescription() throws C316660CbA {
        String str = this.description;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getImageUrl() throws C316660CbA {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getPageNum() throws C316660CbA {
        Integer num = this.pageNum;
        if (num != null) {
            return num;
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
}
