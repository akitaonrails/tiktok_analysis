package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCardInfo {

    @C09CT("business_type")
    public final String businessType;

    @C09CT("card_type")
    public final long cardType;

    @C09CT("enable_avatar")
    public final Boolean enableAvatar;

    @C09CT("enable_download")
    public final Boolean enableDownload;

    @C09CT("enable_emoji")
    public final Boolean enableEmoji;

    @C09CT("enable_long_press_panel")
    public final Boolean enableLongPressPanel;

    @C09CT("enable_report")
    public final Boolean enableReport;

    @C09CT("enable_view_count")
    public final Boolean enableViewCount;

    @C09CT("event_params")
    public final List<BulletinCardKV> eventParams;

    @C09CT("card_info")
    public final BulletinCardUIInfo hybridCardUIInfo;

    @C09CT("lynx_card_config")
    public final BulletinHybridCardConfigStruct hybridConfigInfo;

    @C09CT("position")
    public final Integer positionType;

    @C09CT("show_time")
    public final Long showTime;

    public BulletinCardInfo() {
        this(0L, "", null, null, null, null, null, null, null, null, Boolean.TRUE, null, null);
    }

    public final BulletinCardInfo copy(long j, String str, BulletinCardUIInfo bulletinCardUIInfo, BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Long l, List<BulletinCardKV> list) {
        return new BulletinCardInfo(j, str, bulletinCardUIInfo, bulletinHybridCardConfigStruct, num, bool, bool2, bool3, bool4, bool5, bool6, l, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinCardInfo)) {
            return false;
        }
        BulletinCardInfo bulletinCardInfo = (BulletinCardInfo) obj;
        return this.cardType == bulletinCardInfo.cardType && Intrinsics.LJFF(this.businessType, bulletinCardInfo.businessType) && Intrinsics.LJFF(this.hybridCardUIInfo, bulletinCardInfo.hybridCardUIInfo) && Intrinsics.LJFF(this.hybridConfigInfo, bulletinCardInfo.hybridConfigInfo) && Intrinsics.LJFF(this.positionType, bulletinCardInfo.positionType) && Intrinsics.LJFF(this.enableEmoji, bulletinCardInfo.enableEmoji) && Intrinsics.LJFF(this.enableAvatar, bulletinCardInfo.enableAvatar) && Intrinsics.LJFF(this.enableLongPressPanel, bulletinCardInfo.enableLongPressPanel) && Intrinsics.LJFF(this.enableViewCount, bulletinCardInfo.enableViewCount) && Intrinsics.LJFF(this.enableReport, bulletinCardInfo.enableReport) && Intrinsics.LJFF(this.enableDownload, bulletinCardInfo.enableDownload) && Intrinsics.LJFF(this.showTime, bulletinCardInfo.showTime) && Intrinsics.LJFF(this.eventParams, bulletinCardInfo.eventParams);
    }

    public int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.cardType) * 31) + this.businessType.hashCode()) * 31;
        BulletinCardUIInfo bulletinCardUIInfo = this.hybridCardUIInfo;
        int iHashCode = (iY2 + (bulletinCardUIInfo == null ? 0 : bulletinCardUIInfo.hashCode())) * 31;
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct = this.hybridConfigInfo;
        int iHashCode2 = (iHashCode + (bulletinHybridCardConfigStruct == null ? 0 : bulletinHybridCardConfigStruct.hashCode())) * 31;
        Integer num = this.positionType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.enableEmoji;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableAvatar;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableLongPressPanel;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enableViewCount;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enableReport;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableDownload;
        int iHashCode9 = (iHashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l = this.showTime;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        List<BulletinCardKV> list = this.eventParams;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BulletinCardInfo(cardType=" + this.cardType + ", businessType=" + this.businessType + ", hybridCardUIInfo=" + this.hybridCardUIInfo + ", hybridConfigInfo=" + this.hybridConfigInfo + ", positionType=" + this.positionType + ", enableEmoji=" + this.enableEmoji + ", enableAvatar=" + this.enableAvatar + ", enableLongPressPanel=" + this.enableLongPressPanel + ", enableViewCount=" + this.enableViewCount + ", enableReport=" + this.enableReport + ", enableDownload=" + this.enableDownload + ", showTime=" + this.showTime + ", eventParams=" + this.eventParams + ')';
    }

    public BulletinCardInfo(long j, String str, BulletinCardUIInfo bulletinCardUIInfo, BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Long l, List<BulletinCardKV> list) {
        this.cardType = j;
        this.businessType = str;
        this.hybridCardUIInfo = bulletinCardUIInfo;
        this.hybridConfigInfo = bulletinHybridCardConfigStruct;
        this.positionType = num;
        this.enableEmoji = bool;
        this.enableAvatar = bool2;
        this.enableLongPressPanel = bool3;
        this.enableViewCount = bool4;
        this.enableReport = bool5;
        this.enableDownload = bool6;
        this.showTime = l;
        this.eventParams = list;
    }
}
