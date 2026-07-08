package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class QuickShopSecondFloorInfo implements Serializable {

    @C09CT("enter_text")
    public String enterText;

    @C09CT("process_text")
    public String processText;

    @C09CT("trans_bg_text")
    public String transBgText;

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
