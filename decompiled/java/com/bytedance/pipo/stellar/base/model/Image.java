package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Image implements Serializable {

    @C09CT("image_name")
    public final String imageName;

    @C09CT("image_url")
    public final String imageUrl;

    public Image() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return Intrinsics.LJFF(this.imageName, image.imageName) && Intrinsics.LJFF(this.imageUrl, image.imageUrl);
    }

    public int hashCode() {
        String str = this.imageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public Image(String str, String str2) {
        this.imageName = str;
        this.imageUrl = str2;
    }
}
