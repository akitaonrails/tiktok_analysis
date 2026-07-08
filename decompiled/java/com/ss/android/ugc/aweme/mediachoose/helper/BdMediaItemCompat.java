package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C2188811AlT;
import X.C786410Ut5;
import bytedance.io.BdMediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BdMediaItemCompat extends BdMediaItem {
    public String absolutePath;
    public boolean isFavorite;
    public String ownerPackageName;

    public BdMediaItemCompat() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BdMediaItemCompat)) {
            return false;
        }
        BdMediaItemCompat bdMediaItemCompat = (BdMediaItemCompat) obj;
        return Intrinsics.LJFF(this.absolutePath, bdMediaItemCompat.absolutePath) && this.isFavorite == bdMediaItemCompat.isFavorite && Intrinsics.LJFF(this.ownerPackageName, bdMediaItemCompat.ownerPackageName);
    }

    public final int hashCode() {
        String str = this.absolutePath;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isFavorite)) * 31;
        String str2 = this.ownerPackageName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // bytedance.io.BdMediaItem
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BdMediaItemCompat(absolutePath=");
        sbLIZ.append(this.absolutePath);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.isFavorite);
        sbLIZ.append(", ownerPackageName=");
        sbLIZ.append(this.ownerPackageName);
        sbLIZ.append("), super=");
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BdMediaItemCompat(int i) {
        this.absolutePath = null;
        this.isFavorite = false;
        this.ownerPackageName = null;
    }
}
