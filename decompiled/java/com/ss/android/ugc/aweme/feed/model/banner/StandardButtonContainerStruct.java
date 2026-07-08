package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardButtonContainerStruct implements Serializable {

    @C09CT("buttons")
    public List<StandardComponentStruct> buttons;

    @C09CT("enable_standard_button")
    public boolean enableStandardButton;

    public StandardButtonContainerStruct() {
        this(null, false);
    }

    public StandardButtonContainerStruct(List<StandardComponentStruct> list, boolean z) {
        this.buttons = list;
        this.enableStandardButton = z;
    }
}
