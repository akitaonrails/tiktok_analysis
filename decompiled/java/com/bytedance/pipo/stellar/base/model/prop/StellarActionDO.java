package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ActionSheetDO;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarActionDO implements Serializable {

    @C09CT("track_btm_id")
    public final String btm;

    @C09CT("carousel_page_change_content")
    public final CarouselPageChangeContent carouselPageChangeContent;

    @C09CT("close_content")
    public final CloseContentDO closeContent;

    @C09CT("dialog_content")
    public final DialogContentDO dialogContentDO;

    @C09CT("event_url")
    public final String eventUrl;

    @C09CT("redirect_content")
    public final RedirectContentDO redirectContent;

    @C09CT("sheet_content")
    public final ActionSheetDO sheetContent;

    @C09CT("toast_content")
    public final ToastContentDO toastContent;

    @C09CT("tool_tip_content")
    public final StellarTooltipDO tooltipContent;

    @C09CT("action_type")
    public final Integer type;

    public StellarActionDO() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StellarActionDO)) {
            return false;
        }
        StellarActionDO stellarActionDO = (StellarActionDO) obj;
        return Intrinsics.LJFF(this.type, stellarActionDO.type) && Intrinsics.LJFF(this.redirectContent, stellarActionDO.redirectContent) && Intrinsics.LJFF(this.dialogContentDO, stellarActionDO.dialogContentDO) && Intrinsics.LJFF(this.toastContent, stellarActionDO.toastContent) && Intrinsics.LJFF(this.closeContent, stellarActionDO.closeContent) && Intrinsics.LJFF(this.sheetContent, stellarActionDO.sheetContent) && Intrinsics.LJFF(this.tooltipContent, stellarActionDO.tooltipContent) && Intrinsics.LJFF(this.carouselPageChangeContent, stellarActionDO.carouselPageChangeContent) && Intrinsics.LJFF(this.btm, stellarActionDO.btm) && Intrinsics.LJFF(this.eventUrl, stellarActionDO.eventUrl);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        RedirectContentDO redirectContentDO = this.redirectContent;
        int iHashCode2 = (iHashCode + (redirectContentDO == null ? 0 : redirectContentDO.hashCode())) * 31;
        DialogContentDO dialogContentDO = this.dialogContentDO;
        int iHashCode3 = (iHashCode2 + (dialogContentDO == null ? 0 : dialogContentDO.hashCode())) * 31;
        ToastContentDO toastContentDO = this.toastContent;
        int iHashCode4 = (iHashCode3 + (toastContentDO == null ? 0 : toastContentDO.hashCode())) * 31;
        CloseContentDO closeContentDO = this.closeContent;
        int iHashCode5 = (iHashCode4 + (closeContentDO == null ? 0 : closeContentDO.hashCode())) * 31;
        ActionSheetDO actionSheetDO = this.sheetContent;
        int iHashCode6 = (iHashCode5 + (actionSheetDO == null ? 0 : actionSheetDO.hashCode())) * 31;
        StellarTooltipDO stellarTooltipDO = this.tooltipContent;
        int iHashCode7 = (iHashCode6 + (stellarTooltipDO == null ? 0 : stellarTooltipDO.hashCode())) * 31;
        CarouselPageChangeContent carouselPageChangeContent = this.carouselPageChangeContent;
        int iHashCode8 = (iHashCode7 + (carouselPageChangeContent == null ? 0 : carouselPageChangeContent.hashCode())) * 31;
        String str = this.btm;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventUrl;
        return iHashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public StellarActionDO(Integer num, RedirectContentDO redirectContentDO, DialogContentDO dialogContentDO, ToastContentDO toastContentDO, CloseContentDO closeContentDO, ActionSheetDO actionSheetDO, StellarTooltipDO stellarTooltipDO, CarouselPageChangeContent carouselPageChangeContent, String str, String str2) {
        this.type = num;
        this.redirectContent = redirectContentDO;
        this.dialogContentDO = dialogContentDO;
        this.toastContent = toastContentDO;
        this.closeContent = closeContentDO;
        this.sheetContent = actionSheetDO;
        this.tooltipContent = stellarTooltipDO;
        this.carouselPageChangeContent = carouselPageChangeContent;
        this.btm = str;
        this.eventUrl = str2;
    }
}
