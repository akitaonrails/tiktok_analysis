package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes29.dex */
public class AppStoreMessage {

    @C09CT("section")
    public Integer section;

    @C09CT("switcher")
    public Integer switcher = 1;

    @C09CT("text")
    public String text;

    @C09CT("threshold")
    public Integer threshold;

    @C09CT("title")
    public String title;

    public Integer getSection() throws C316660CbA {
        Integer num = this.section;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getSwitcher() {
        Integer num = this.switcher;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getThreshold() throws C316660CbA {
        Integer num = this.threshold;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
