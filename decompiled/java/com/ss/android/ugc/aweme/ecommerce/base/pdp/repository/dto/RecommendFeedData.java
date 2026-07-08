package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelGroup;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RecommendFeedData {

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("feed_list")
    public final List<ProductTile> feedList;

    @C09CT("header")
    public final PdpModuleHeader header;

    @C09CT("icon_label_group")
    public final IconLabelGroup iconLabelGroup;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("server_time")
    public final Long serverTime;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("slide_bar")
    public final SlideBar slideBar;

    @C09CT("slide_entry")
    public final SlideEntrance slideEntrance;

    public RecommendFeedData() {
        this(null, null, null, null, null, null, null, null, Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), null);
    }

    public final int hashCode() {
        IconLabelGroup iconLabelGroup = this.iconLabelGroup;
        int iHashCode = (iconLabelGroup == null ? 0 : iconLabelGroup.hashCode()) * 31;
        List<ProductTile> list = this.feedList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SlideEntrance slideEntrance = this.slideEntrance;
        int iHashCode3 = (iHashCode2 + (slideEntrance == null ? 0 : slideEntrance.hashCode())) * 31;
        PdpModuleHeader pdpModuleHeader = this.header;
        int iHashCode4 = (iHashCode3 + (pdpModuleHeader == null ? 0 : pdpModuleHeader.hashCode())) * 31;
        String str = this.sessionId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btmCode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requestId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.serverTime;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createTime;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        SlideBar slideBar = this.slideBar;
        return iHashCode10 + (slideBar != null ? slideBar.hashCode() : 0);
    }

    public RecommendFeedData(IconLabelGroup iconLabelGroup, List<ProductTile> list, SlideEntrance slideEntrance, PdpModuleHeader pdpModuleHeader, String str, String str2, String str3, String str4, Long l, Long l2, SlideBar slideBar) {
        this.iconLabelGroup = iconLabelGroup;
        this.feedList = list;
        this.slideEntrance = slideEntrance;
        this.header = pdpModuleHeader;
        this.sessionId = str;
        this.daInfo = str2;
        this.btmCode = str3;
        this.requestId = str4;
        this.serverTime = l;
        this.createTime = l2;
        this.slideBar = slideBar;
    }
}
