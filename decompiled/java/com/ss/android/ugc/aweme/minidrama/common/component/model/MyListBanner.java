package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MyListBanner implements Serializable {

    @C09CT("banner_type")
    public final MyListBannerType bannerType;

    @C09CT("desc")
    public final String desc;

    @C09CT("icon")
    public final MyListBannerIcon icon;

    @C09CT("starling_key_desc")
    public final String starlingKeyDesc;

    @C09CT("starling_key_title")
    public final String starlingKeyTitle;

    @C09CT("title")
    public final String title;

    public MyListBanner() {
        this(MyListBannerType.MY_LIST_BANNER_TYPE_UNKNOWN, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListBanner)) {
            return false;
        }
        MyListBanner myListBanner = (MyListBanner) obj;
        return this.bannerType == myListBanner.bannerType && Intrinsics.LJFF(this.icon, myListBanner.icon) && Intrinsics.LJFF(this.title, myListBanner.title) && Intrinsics.LJFF(this.starlingKeyTitle, myListBanner.starlingKeyTitle) && Intrinsics.LJFF(this.desc, myListBanner.desc) && Intrinsics.LJFF(this.starlingKeyDesc, myListBanner.starlingKeyDesc);
    }

    public int hashCode() {
        MyListBannerType myListBannerType = this.bannerType;
        int iHashCode = (myListBannerType == null ? 0 : myListBannerType.hashCode()) * 31;
        MyListBannerIcon myListBannerIcon = this.icon;
        int iHashCode2 = (iHashCode + (myListBannerIcon == null ? 0 : myListBannerIcon.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.starlingKeyTitle;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.starlingKeyDesc;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyListBanner(bannerType=");
        sbLIZ.append(this.bannerType);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", starlingKeyTitle=");
        sbLIZ.append(this.starlingKeyTitle);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", starlingKeyDesc=");
        sbLIZ.append(this.starlingKeyDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MyListBanner(MyListBannerType myListBannerType, MyListBannerIcon myListBannerIcon, String str, String str2, String str3, String str4) {
        this.bannerType = myListBannerType;
        this.icon = myListBannerIcon;
        this.title = str;
        this.starlingKeyTitle = str2;
        this.desc = str3;
        this.starlingKeyDesc = str4;
    }
}
