package com.ss.android.ugc.aweme.share.shareprop;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePropCacheItem {

    @C09CT("itemId")
    public final String itemId;

    @C09CT("sceneType")
    public final int sceneType;

    @C09CT("spLevel")
    public final String spLevel;

    @C09CT("spRootD")
    public final String spRootD;

    @C09CT("spRootOd")
    public final String spRootOd;

    @C09CT("spRootShareLinkId")
    public final String spRootShareLinkId;

    @C09CT("spRootU")
    public final String spRootU;

    @C09CT("spSourceD")
    public final String spSourceD;

    @C09CT("spSourceOd")
    public final String spSourceOd;

    @C09CT("spSourceU")
    public final String spSourceU;

    @C09CT("spSourceW")
    public final String spSourceW;

    @C09CT("timestamp")
    public final long timestamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePropCacheItem)) {
            return false;
        }
        SharePropCacheItem sharePropCacheItem = (SharePropCacheItem) obj;
        return Intrinsics.LJFF(this.itemId, sharePropCacheItem.itemId) && this.sceneType == sharePropCacheItem.sceneType && Intrinsics.LJFF(this.spRootD, sharePropCacheItem.spRootD) && Intrinsics.LJFF(this.spLevel, sharePropCacheItem.spLevel) && Intrinsics.LJFF(this.spRootU, sharePropCacheItem.spRootU) && Intrinsics.LJFF(this.spRootOd, sharePropCacheItem.spRootOd) && Intrinsics.LJFF(this.spSourceD, sharePropCacheItem.spSourceD) && Intrinsics.LJFF(this.spSourceOd, sharePropCacheItem.spSourceOd) && Intrinsics.LJFF(this.spSourceU, sharePropCacheItem.spSourceU) && Intrinsics.LJFF(this.spSourceW, sharePropCacheItem.spSourceW) && Intrinsics.LJFF(this.spRootShareLinkId, sharePropCacheItem.spRootShareLinkId) && this.timestamp == sharePropCacheItem.timestamp;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.itemId.hashCode() * 31) + this.sceneType) * 31) + this.spRootD.hashCode()) * 31) + this.spLevel.hashCode()) * 31;
        String str = this.spRootU;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spRootOd;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.spSourceD;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.spSourceOd;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.spSourceU;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spSourceW;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.spRootShareLinkId;
        return ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.timestamp);
    }

    public final String toString() {
        return "SharePropCacheItem(itemId=" + this.itemId + ", sceneType=" + this.sceneType + ", spRootD=" + this.spRootD + ", spLevel=" + this.spLevel + ", spRootU=" + this.spRootU + ", spRootOd=" + this.spRootOd + ", spSourceD=" + this.spSourceD + ", spSourceOd=" + this.spSourceOd + ", spSourceU=" + this.spSourceU + ", spSourceW=" + this.spSourceW + ", spRootShareLinkId=" + this.spRootShareLinkId + ", timestamp=" + this.timestamp + ')';
    }

    public SharePropCacheItem(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j) {
        this.itemId = str;
        this.sceneType = i;
        this.spRootD = str2;
        this.spLevel = str3;
        this.spRootU = str4;
        this.spRootOd = str5;
        this.spSourceD = str6;
        this.spSourceOd = str7;
        this.spSourceU = str8;
        this.spSourceW = str9;
        this.spRootShareLinkId = str10;
        this.timestamp = j;
    }
}
