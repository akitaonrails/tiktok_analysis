package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class AnchorComponentInfo implements Serializable {

    @C09CT("icon_type")
    public final String iconType;

    @C09CT("anchor_module_instance_id")
    public final String instanceId;

    @C09CT("anchor_module_text")
    public final String text;

    public AnchorComponentInfo(String str, String str2, String str3) {
        this.instanceId = str;
        this.text = str2;
        this.iconType = str3;
    }
}
