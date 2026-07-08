package com.ss.android.ugc.aweme.api;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ValidInfo implements Serializable {

    @C09CT("attachable")
    public final boolean attachable;

    @C09CT("is_long_url")
    public final boolean isLongUrl;

    @C09CT("toast_content")
    public final String toastContent;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidInfo)) {
            return false;
        }
        ValidInfo validInfo = (ValidInfo) obj;
        return this.attachable == validInfo.attachable && Intrinsics.LJFF(this.toastContent, validInfo.toastContent) && this.isLongUrl == validInfo.isLongUrl;
    }

    public final boolean isLongUrl() {
        return this.isLongUrl;
    }

    public ValidInfo(boolean z, String str, boolean z2) {
        this.attachable = z;
        this.toastContent = str;
        this.isLongUrl = z2;
    }
}
