package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiShareInfo implements Serializable {

    @C09CT("share_desc")
    public final String shareDesc;

    @C09CT("share_url")
    public final String shareUrl;

    public PoiShareInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiShareInfo)) {
            return false;
        }
        PoiShareInfo poiShareInfo = (PoiShareInfo) obj;
        return Intrinsics.LJFF(this.shareDesc, poiShareInfo.shareDesc) && Intrinsics.LJFF(this.shareUrl, poiShareInfo.shareUrl);
    }

    public PoiShareInfo(String str, String str2) {
        this.shareDesc = str;
        this.shareUrl = str2;
    }
}
