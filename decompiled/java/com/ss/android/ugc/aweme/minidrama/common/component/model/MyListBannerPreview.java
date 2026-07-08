package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MyListBannerPreview implements Serializable {

    @C09CT("data")
    public final String data;

    @C09CT("meta_key")
    public final String metaKey;

    @C09CT("preview_type")
    public final Integer previewType;

    public MyListBannerPreview() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListBannerPreview)) {
            return false;
        }
        MyListBannerPreview myListBannerPreview = (MyListBannerPreview) obj;
        return Intrinsics.LJFF(this.data, myListBannerPreview.data) && Intrinsics.LJFF(this.previewType, myListBannerPreview.previewType) && Intrinsics.LJFF(this.metaKey, myListBannerPreview.metaKey);
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.previewType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.metaKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyListBannerPreview(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", previewType=");
        sbLIZ.append(this.previewType);
        sbLIZ.append(", metaKey=");
        sbLIZ.append(this.metaKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MyListBannerPreview(String str, Integer num, String str2) {
        this.data = str;
        this.previewType = num;
        this.metaKey = str2;
    }
}
