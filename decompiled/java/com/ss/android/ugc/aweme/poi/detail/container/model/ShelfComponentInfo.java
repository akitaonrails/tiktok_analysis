package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class ShelfComponentInfo implements Serializable {

    @C09CT("icon_type")
    public final String iconType;

    @C09CT("instance_id")
    public final String instanceId;

    @C09CT("title")
    public final String title;

    public ShelfComponentInfo() {
        this(null, null, null);
    }

    public ShelfComponentInfo(String str, String str2, String str3) {
        this.instanceId = str;
        this.title = str2;
        this.iconType = str3;
    }
}
