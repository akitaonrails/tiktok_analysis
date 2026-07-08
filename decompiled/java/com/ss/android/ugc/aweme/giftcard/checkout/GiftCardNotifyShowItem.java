package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GiftCardNotifyShowItem {

    @C09CT("default_choose")
    public final Boolean defaultChoose;

    @C09CT("label")
    public final String label;

    @C09CT("notify_method")
    public final String notifyMethod;

    @C09CT("placeholder")
    public final String placeholder;

    @C09CT("verify_rules")
    public final List<CheckRule> verifyRules;

    public GiftCardNotifyShowItem() {
        this(null, null, null, null, null);
    }

    public GiftCardNotifyShowItem(String str, String str2, String str3, List<CheckRule> list, Boolean bool) {
        this.notifyMethod = str;
        this.label = str2;
        this.placeholder = str3;
        this.verifyRules = list;
        this.defaultChoose = bool;
    }
}
