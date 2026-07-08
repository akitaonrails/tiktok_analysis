package com.ss.android.ugc.aweme.minis.report.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisData {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("is_native_game")
    public final Boolean isNativeGame;

    @C09CT("load_type")
    public final String loadType;

    @C09CT("minis_category")
    public final String minisCategory;

    @C09CT("minis_sdk_version")
    public final String minisSDKVersion;

    @C09CT("minis_version")
    public final String minisVersion;

    @C09CT("network_type")
    public final String networkType;

    @C09CT("ttoclid")
    public final String ttoclid;

    public MinisData() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisData)) {
            return false;
        }
        MinisData minisData = (MinisData) obj;
        return Intrinsics.LJFF(this.minisSDKVersion, minisData.minisSDKVersion) && Intrinsics.LJFF(this.networkType, minisData.networkType) && Intrinsics.LJFF(this.isNativeGame, minisData.isNativeGame) && Intrinsics.LJFF(this.enterFrom, minisData.enterFrom) && Intrinsics.LJFF(this.enterMethod, minisData.enterMethod) && Intrinsics.LJFF(this.minisCategory, minisData.minisCategory) && Intrinsics.LJFF(this.minisVersion, minisData.minisVersion) && Intrinsics.LJFF(this.loadType, minisData.loadType) && Intrinsics.LJFF(this.ttoclid, minisData.ttoclid);
    }

    public final int hashCode() {
        String str = this.minisSDKVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.networkType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isNativeGame;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.enterFrom;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minisCategory;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.minisVersion;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.loadType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ttoclid;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisData(minisSDKVersion=");
        sbLIZ.append(this.minisSDKVersion);
        sbLIZ.append(", networkType=");
        sbLIZ.append(this.networkType);
        sbLIZ.append(", isNativeGame=");
        sbLIZ.append(this.isNativeGame);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", minisCategory=");
        sbLIZ.append(this.minisCategory);
        sbLIZ.append(", minisVersion=");
        sbLIZ.append(this.minisVersion);
        sbLIZ.append(", loadType=");
        sbLIZ.append(this.loadType);
        sbLIZ.append(", ttoclid=");
        sbLIZ.append(this.ttoclid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisData(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.minisSDKVersion = str;
        this.networkType = str2;
        this.isNativeGame = bool;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.minisCategory = str5;
        this.minisVersion = str6;
        this.loadType = str7;
        this.ttoclid = str8;
    }
}
