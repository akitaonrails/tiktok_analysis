package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TUCActionData implements Serializable {

    @C09CT("type")
    public String actionName;

    @C09CT("extra")
    public String extra;

    public TUCActionData() {
        this("", null);
    }

    public TUCActionData(String str, String str2) {
        this.actionName = str;
        this.extra = str2;
    }
}
