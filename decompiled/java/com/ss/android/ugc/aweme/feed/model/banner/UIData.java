package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UIData implements Serializable {

    @C09CT("customized_ui_content")
    public final String customizedUiContent;

    @C09CT("standard_ui_content")
    public final Object standardUiContent;

    @C09CT("style")
    public final Integer style;

    public UIData() {
        this(null, null, null);
    }

    public UIData(Integer num, String str, Object obj) {
        this.style = num;
        this.customizedUiContent = str;
        this.standardUiContent = obj;
    }
}
