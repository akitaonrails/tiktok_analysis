package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarTooltipDO extends BaseWidgetDO {

    @C09CT("anchor_id")
    public final String anchorId;

    @C09CT("auto_dismiss")
    public final Integer autoDismiss;

    @C09CT("background")
    public final BackgroundDO background;

    @C09CT("body_offset")
    public final Float bodyOffset;

    @C09CT("close_icon")
    public final ImageDO closeIcon;

    @C09CT("event_url")
    public final String eventUrl;

    @C09CT("icon")
    public final ImageDO leadIcon;

    @C09CT("point_offset")
    public final Float pointOffset;

    @C09CT("position")
    public final String position;

    @C09CT("show_arrow")
    public final Integer showArrow;

    @C09CT("show_close")
    public final Integer showClose;

    @C09CT("stay_time")
    public final long stayTime;

    @C09CT("tap_blank_to_dismiss")
    public final Integer tapBlankToDismiss;

    @C09CT("tap_to_dismiss")
    public final Integer tapToDismiss;

    @C09CT("text")
    public final TextDO text;

    @C09CT("theme")
    public final String theme;

    public StellarTooltipDO() {
        this(null, null, null, null, null, 1, 1, null, 0L, null, null, null, null, null, null, null);
    }

    public final StellarTooltipDO copy(BackgroundDO backgroundDO, TextDO textDO, ImageDO imageDO, String str, String str2, Integer num, Integer num2, Integer num3, long j, Float f, Float f2, Integer num4, Integer num5, String str3, String str4, ImageDO imageDO2) {
        return new StellarTooltipDO(backgroundDO, textDO, imageDO, str, str2, num, num2, num3, j, f, f2, num4, num5, str3, str4, imageDO2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StellarTooltipDO)) {
            return false;
        }
        StellarTooltipDO stellarTooltipDO = (StellarTooltipDO) obj;
        return Intrinsics.LJFF(this.background, stellarTooltipDO.background) && Intrinsics.LJFF(this.text, stellarTooltipDO.text) && Intrinsics.LJFF(this.leadIcon, stellarTooltipDO.leadIcon) && Intrinsics.LJFF(this.position, stellarTooltipDO.position) && Intrinsics.LJFF(this.anchorId, stellarTooltipDO.anchorId) && Intrinsics.LJFF(this.tapToDismiss, stellarTooltipDO.tapToDismiss) && Intrinsics.LJFF(this.tapBlankToDismiss, stellarTooltipDO.tapBlankToDismiss) && Intrinsics.LJFF(this.autoDismiss, stellarTooltipDO.autoDismiss) && this.stayTime == stellarTooltipDO.stayTime && Intrinsics.LJFF(this.bodyOffset, stellarTooltipDO.bodyOffset) && Intrinsics.LJFF(this.pointOffset, stellarTooltipDO.pointOffset) && Intrinsics.LJFF(this.showArrow, stellarTooltipDO.showArrow) && Intrinsics.LJFF(this.showClose, stellarTooltipDO.showClose) && Intrinsics.LJFF(this.eventUrl, stellarTooltipDO.eventUrl) && Intrinsics.LJFF(this.theme, stellarTooltipDO.theme) && Intrinsics.LJFF(this.closeIcon, stellarTooltipDO.closeIcon);
    }

    public int hashCode() {
        BackgroundDO backgroundDO = this.background;
        int iHashCode = (backgroundDO == null ? 0 : backgroundDO.hashCode()) * 31;
        TextDO textDO = this.text;
        int iHashCode2 = (iHashCode + (textDO == null ? 0 : textDO.hashCode())) * 31;
        ImageDO imageDO = this.leadIcon;
        int iHashCode3 = (iHashCode2 + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        String str = this.position;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.anchorId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.tapToDismiss;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tapBlankToDismiss;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.autoDismiss;
        int iHashCode8 = (((iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31) + C786410Ut5.Y2(this.stayTime)) * 31;
        Float f = this.bodyOffset;
        int iHashCode9 = (iHashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.pointOffset;
        int iHashCode10 = (iHashCode9 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.showArrow;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.showClose;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.eventUrl;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.theme;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ImageDO imageDO2 = this.closeIcon;
        return iHashCode14 + (imageDO2 != null ? imageDO2.hashCode() : 0);
    }

    public String toString() {
        return "StellarTooltipDO(background=" + this.background + ", text=" + this.text + ", leadIcon=" + this.leadIcon + ", position=" + this.position + ", anchorId=" + this.anchorId + ", tapToDismiss=" + this.tapToDismiss + ", tapBlankToDismiss=" + this.tapBlankToDismiss + ", autoDismiss=" + this.autoDismiss + ", stayTime=" + this.stayTime + ", bodyOffset=" + this.bodyOffset + ", pointOffset=" + this.pointOffset + ", showArrow=" + this.showArrow + ", showClose=" + this.showClose + ", eventUrl=" + this.eventUrl + ", theme=" + this.theme + ", closeIcon=" + this.closeIcon + ')';
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final Integer getAutoDismiss() {
        return this.autoDismiss;
    }

    public final BackgroundDO getBackground() {
        return this.background;
    }

    public final Float getBodyOffset() {
        return this.bodyOffset;
    }

    public final ImageDO getCloseIcon() {
        return this.closeIcon;
    }

    public final String getEventUrl() {
        return this.eventUrl;
    }

    public final ImageDO getLeadIcon() {
        return this.leadIcon;
    }

    public final Float getPointOffset() {
        return this.pointOffset;
    }

    public final String getPosition() {
        return this.position;
    }

    public final Integer getShowArrow() {
        return this.showArrow;
    }

    public final Integer getShowClose() {
        return this.showClose;
    }

    public final long getStayTime() {
        return this.stayTime;
    }

    public final Integer getTapBlankToDismiss() {
        return this.tapBlankToDismiss;
    }

    public final Integer getTapToDismiss() {
        return this.tapToDismiss;
    }

    public final TextDO getText() {
        return this.text;
    }

    public final String getTheme() {
        return this.theme;
    }

    public StellarTooltipDO(BackgroundDO backgroundDO, TextDO textDO, ImageDO imageDO, String str, String str2, Integer num, Integer num2, Integer num3, long j, Float f, Float f2, Integer num4, Integer num5, String str3, String str4, ImageDO imageDO2) {
        super(null, null, 1, null, null);
        this.background = backgroundDO;
        this.text = textDO;
        this.leadIcon = imageDO;
        this.position = str;
        this.anchorId = str2;
        this.tapToDismiss = num;
        this.tapBlankToDismiss = num2;
        this.autoDismiss = num3;
        this.stayTime = j;
        this.bodyOffset = f;
        this.pointOffset = f2;
        this.showArrow = num4;
        this.showClose = num5;
        this.eventUrl = str3;
        this.theme = str4;
        this.closeIcon = imageDO2;
    }
}
