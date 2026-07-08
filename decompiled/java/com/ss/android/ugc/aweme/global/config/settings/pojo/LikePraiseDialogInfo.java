package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class LikePraiseDialogInfo {

    @C09CT("new_like_num")
    public Integer newLikeNum;

    @C09CT("two_dialog_interval")
    public Integer twoDialogInterval;

    public Integer getNewLikeNum() throws C316660CbA {
        Integer num = this.newLikeNum;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getTwoDialogInterval() throws C316660CbA {
        Integer num = this.twoDialogInterval;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
