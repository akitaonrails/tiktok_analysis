package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes13.dex */
public class CategoryStruct {

    @C09CT("category_id")
    public String categoryId;

    @C09CT("category_name")
    public String categoryName;

    public String getCategoryId() throws C316660CbA {
        String str = this.categoryId;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getCategoryName() throws C316660CbA {
        String str = this.categoryName;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public CategoryStruct(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }
}
