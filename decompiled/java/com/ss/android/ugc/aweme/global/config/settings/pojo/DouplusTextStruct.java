package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class DouplusTextStruct {

    @C09CT("title")
    public String title;

    @C09CT("type")
    public Integer type;

    public String getTitle() throws C316660CbA {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getType() throws C316660CbA {
        Integer num = this.type;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
