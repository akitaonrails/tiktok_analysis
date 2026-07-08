package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskExtraModule implements Serializable {

    @C09CT("btn_text")
    public String btnText;

    @C09CT("pop_window")
    public MaskPopWindow popWindow;

    @C09CT("module_type")
    public int type;

    @C09CT("url")
    public String url;

    public MaskExtraModule() {
        this(0, "", "", null);
    }

    public MaskExtraModule(int i, String str, String str2, MaskPopWindow maskPopWindow) {
        this.type = i;
        this.btnText = str;
        this.url = str2;
        this.popWindow = maskPopWindow;
    }
}
