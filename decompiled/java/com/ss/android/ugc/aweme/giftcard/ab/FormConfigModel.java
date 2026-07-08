package com.ss.android.ugc.aweme.giftcard.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class FormConfigModel {

    @C09CT("email_max_len")
    public final Integer emailMaxLen;

    public FormConfigModel() {
        this(255);
    }

    public FormConfigModel(Integer num) {
        this.emailMaxLen = num;
    }
}
