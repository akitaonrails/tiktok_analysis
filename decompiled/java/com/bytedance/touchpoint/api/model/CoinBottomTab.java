package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class CoinBottomTab extends C1893670zNV {

    @C09CT("icon_url")
    public String iconURL;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("lottie_file_md5")
    public String lottieMd5;

    @C09CT("lottie_name")
    public String lottieName;

    @C09CT("lottie_file_zip")
    public String lottieUrl;

    @C09CT("need_login_gate")
    public boolean needLoginGate;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("play_times")
    public int playTimes;

    @C09CT("title")
    public Title title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinBottomTab)) {
            return false;
        }
        CoinBottomTab coinBottomTab = (CoinBottomTab) obj;
        return Intrinsics.LJFF(this.iconURL, coinBottomTab.iconURL) && Intrinsics.LJFF(this.jumpLink, coinBottomTab.jumpLink) && Intrinsics.LJFF(this.notificationName, coinBottomTab.notificationName) && Intrinsics.LJFF(this.title, coinBottomTab.title) && this.needLoginGate == coinBottomTab.needLoginGate && Intrinsics.LJFF(this.lottieUrl, coinBottomTab.lottieUrl) && Intrinsics.LJFF(this.lottieMd5, coinBottomTab.lottieMd5) && Intrinsics.LJFF(this.lottieName, coinBottomTab.lottieName) && this.playTimes == coinBottomTab.playTimes;
    }

    public final int hashCode() {
        int iHashCode = ((((this.iconURL.hashCode() * 31) + this.jumpLink.hashCode()) * 31) + this.notificationName.hashCode()) * 31;
        Title title = this.title;
        return ((((((((((iHashCode + (title == null ? 0 : title.hashCode())) * 31) + C786410Ut5.Z2(this.needLoginGate)) * 31) + this.lottieUrl.hashCode()) * 31) + this.lottieMd5.hashCode()) * 31) + this.lottieName.hashCode()) * 31) + this.playTimes;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoinBottomTab(iconURL=");
        sbLIZ.append(this.iconURL);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", needLoginGate=");
        sbLIZ.append(this.needLoginGate);
        sbLIZ.append(", lottieUrl=");
        sbLIZ.append(this.lottieUrl);
        sbLIZ.append(", lottieMd5=");
        sbLIZ.append(this.lottieMd5);
        sbLIZ.append(", lottieName=");
        sbLIZ.append(this.lottieName);
        sbLIZ.append(", playTimes=");
        sbLIZ.append(this.playTimes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CoinBottomTab(String str, String str2, String str3, Title title, boolean z, String str4, String str5, String str6, int i) {
        this.iconURL = str;
        this.jumpLink = str2;
        this.notificationName = str3;
        this.title = title;
        this.needLoginGate = z;
        this.lottieUrl = str4;
        this.lottieMd5 = str5;
        this.lottieName = str6;
        this.playTimes = i;
    }
}
