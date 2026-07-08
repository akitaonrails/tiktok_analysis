package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivacyButton {

    @C09CT("action_type")
    public Integer actionType;

    @C09CT("text")
    public String text;

    public PrivacyButton() {
    }

    public PrivacyButton(String str, Integer num) {
        this.text = str;
        this.actionType = num;
    }
}
