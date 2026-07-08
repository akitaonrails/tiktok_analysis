package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class CategoryPageTextStruct {

    @C09CT("description")
    public String description;

    @C09CT("title")
    public String title;

    public String getDescription() throws C316660CbA {
        String str = this.description;
        if (str != null) {
            return str;
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
