package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class FollowTabGuideStruct {

    @C09CT("follow_tab_guide_times")
    public Integer followTabGuideTimes;

    @C09CT("follow_tab_guide_word")
    public String followTabGuideWord;

    public Integer getFollowTabGuideTimes() throws C316660CbA {
        Integer num = this.followTabGuideTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getFollowTabGuideWord() throws C316660CbA {
        String str = this.followTabGuideWord;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
