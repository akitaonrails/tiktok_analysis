package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C1098604Rk;
import X.C20229014Dg;
import X.C2188811AlT;
import X.EnumC1864410ycJ;
import X.InterfaceC20228814De;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoChatContainerData implements Serializable {
    public static final int $stable = 8;

    @C09CT("expand_sheet_on_right")
    public Boolean expandSheetOnRight;

    @C09CT("open_by_saf")
    public Boolean openBySAF;

    @C09CT("screen_type")
    public EnumC1864410ycJ screenType;
    public transient C20229014Dg sevenScreenListeners;
    public transient InterfaceC20228814De sheetCallback;

    @C09CT("source_btm_token")
    public String sourceBtmToken;

    public TakoChatContainerData() {
        this(null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoChatContainerData(screenType=");
        sbLIZ.append(this.screenType);
        sbLIZ.append(", openBySAF=");
        sbLIZ.append(this.openBySAF);
        sbLIZ.append(", expandSheetOnRight=");
        sbLIZ.append(this.expandSheetOnRight);
        sbLIZ.append(", sourceBtmToken=");
        sbLIZ.append(this.sourceBtmToken);
        sbLIZ.append(", sheetCallback=");
        sbLIZ.append(this.sheetCallback);
        sbLIZ.append(", sevenScreenListeners=");
        sbLIZ.append(this.sevenScreenListeners);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean resolveOpenBySAF() {
        Boolean bool = this.openBySAF;
        return bool != null ? bool.booleanValue() : ((Boolean) C1098604Rk.LIZ.getValue()).booleanValue();
    }

    public final void setExpandSheetOnRight(Boolean bool) {
        this.expandSheetOnRight = bool;
    }

    public final void setOpenBySAF(Boolean bool) {
        this.openBySAF = bool;
    }

    public final void setScreenType(EnumC1864410ycJ enumC1864410ycJ) {
        this.screenType = enumC1864410ycJ;
    }

    public final void setSevenScreenListeners(C20229014Dg c20229014Dg) {
        this.sevenScreenListeners = c20229014Dg;
    }

    public final void setSheetCallback(InterfaceC20228814De interfaceC20228814De) {
        this.sheetCallback = interfaceC20228814De;
    }

    public final void setSourceBtmToken(String str) {
        this.sourceBtmToken = str;
    }

    public TakoChatContainerData(EnumC1864410ycJ enumC1864410ycJ, Boolean bool, Boolean bool2, String str, InterfaceC20228814De interfaceC20228814De, C20229014Dg c20229014Dg) {
        this.screenType = enumC1864410ycJ;
        this.openBySAF = bool;
        this.expandSheetOnRight = bool2;
        this.sourceBtmToken = str;
        this.sheetCallback = interfaceC20228814De;
        this.sevenScreenListeners = c20229014Dg;
    }
}
