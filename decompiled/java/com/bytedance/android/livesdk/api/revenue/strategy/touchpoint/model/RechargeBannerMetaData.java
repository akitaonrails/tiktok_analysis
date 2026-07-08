package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TouchPointBackground;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBannerMetaData implements InterfaceC1992207rE {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("countdown_ts")
    public final String countdownTs;

    @C09CT("need_dismiss_dialog")
    public final Boolean needDismissDialog;

    @C09CT("panel_background")
    public final TouchPointBackground panelBackground;

    @C09CT("sub_title")
    public final Text subTitle;

    @C09CT("recharge_succ_display_data")
    public final String successDisplayData;

    @C09CT("title")
    public final Text title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargeBannerMetaData)) {
            return false;
        }
        RechargeBannerMetaData rechargeBannerMetaData = (RechargeBannerMetaData) obj;
        return Intrinsics.LJFF(this.title, rechargeBannerMetaData.title) && Intrinsics.LJFF(this.subTitle, rechargeBannerMetaData.subTitle) && Intrinsics.LJFF(this.panelBackground, rechargeBannerMetaData.panelBackground) && Intrinsics.LJFF(this.needDismissDialog, rechargeBannerMetaData.needDismissDialog) && Intrinsics.LJFF(this.successDisplayData, rechargeBannerMetaData.successDisplayData) && Intrinsics.LJFF(this.countdownTs, rechargeBannerMetaData.countdownTs);
    }

    public final int hashCode() {
        Text text = this.title;
        int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.subTitle;
        int iHashCode2 = (iHashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        TouchPointBackground touchPointBackground = this.panelBackground;
        int iHashCode3 = (iHashCode2 + (touchPointBackground == null ? 0 : touchPointBackground.hashCode())) * 31;
        Boolean bool = this.needDismissDialog;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.successDisplayData;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countdownTs;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeBannerMetaData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", panelBackground=");
        sbLIZ.append(this.panelBackground);
        sbLIZ.append(", needDismissDialog=");
        sbLIZ.append(this.needDismissDialog);
        sbLIZ.append(", successDisplayData=");
        sbLIZ.append(this.successDisplayData);
        sbLIZ.append(", countdownTs=");
        sbLIZ.append(this.countdownTs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RechargeBannerMetaData(Text text, Text text2, TouchPointBackground touchPointBackground, Boolean bool, String str, String str2) {
        this.title = text;
        this.subTitle = text2;
        this.panelBackground = touchPointBackground;
        this.needDismissDialog = bool;
        this.successDisplayData = str;
        this.countdownTs = str2;
    }
}
