package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupInfo {

    @C09CT("bag_icon")
    public String bagIcon;

    @C09CT("bag_text")
    public String bagText;

    @C09CT("clock_icon")
    public String clockIcon;

    @C09CT("clock_text")
    public String clockText;

    @C09CT("legal_text")
    public String legalText;

    @C09CT("title")
    public String title;

    @C09CT("wallet_icon")
    public String walletIcon;

    @C09CT("wallet_text")
    public String walletText;

    public PopupInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupInfo)) {
            return false;
        }
        PopupInfo popupInfo = (PopupInfo) obj;
        return Intrinsics.LJFF(this.walletIcon, popupInfo.walletIcon) && Intrinsics.LJFF(this.walletText, popupInfo.walletText) && Intrinsics.LJFF(this.clockIcon, popupInfo.clockIcon) && Intrinsics.LJFF(this.clockText, popupInfo.clockText) && Intrinsics.LJFF(this.bagIcon, popupInfo.bagIcon) && Intrinsics.LJFF(this.bagText, popupInfo.bagText) && Intrinsics.LJFF(this.legalText, popupInfo.legalText) && Intrinsics.LJFF(this.title, popupInfo.title);
    }

    public final int hashCode() {
        String str = this.walletIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.walletText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clockIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clockText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bagIcon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bagText;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.legalText;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.title;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public PopupInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.walletIcon = str;
        this.walletText = str2;
        this.clockIcon = str3;
        this.clockText = str4;
        this.bagIcon = str5;
        this.bagText = str6;
        this.legalText = str7;
        this.title = str8;
    }
}
