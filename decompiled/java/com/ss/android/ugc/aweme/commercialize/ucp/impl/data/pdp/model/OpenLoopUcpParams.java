package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenLoopUcpParams {

    @C09CT("ad")
    public final UcpOpenLoopAdInfo adInfo;

    @C09CT("event")
    public final String event;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("event_source")
    public final String eventSource;

    @C09CT("page")
    public final UcpPageInfo page;

    @C09CT("partner")
    public final String partner;

    @C09CT("pixel")
    public final UcpPixelInfo pixel;

    @C09CT("properties")
    public final UcpProperties properties;

    @C09CT("timestamp")
    public final String timestamp;

    @C09CT("user")
    public final UcpUserInfo user;

    public OpenLoopUcpParams() {
        this(null, "web", "ucp_ole", null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenLoopUcpParams)) {
            return false;
        }
        OpenLoopUcpParams openLoopUcpParams = (OpenLoopUcpParams) obj;
        return Intrinsics.LJFF(this.pixel, openLoopUcpParams.pixel) && Intrinsics.LJFF(this.eventSource, openLoopUcpParams.eventSource) && Intrinsics.LJFF(this.partner, openLoopUcpParams.partner) && Intrinsics.LJFF(this.page, openLoopUcpParams.page) && Intrinsics.LJFF(this.user, openLoopUcpParams.user) && Intrinsics.LJFF(this.event, openLoopUcpParams.event) && Intrinsics.LJFF(this.eventId, openLoopUcpParams.eventId) && Intrinsics.LJFF(this.timestamp, openLoopUcpParams.timestamp) && Intrinsics.LJFF(this.properties, openLoopUcpParams.properties) && Intrinsics.LJFF(this.adInfo, openLoopUcpParams.adInfo);
    }

    public final int hashCode() {
        UcpPixelInfo ucpPixelInfo = this.pixel;
        int iHashCode = (((((ucpPixelInfo == null ? 0 : ucpPixelInfo.hashCode()) * 31) + this.eventSource.hashCode()) * 31) + this.partner.hashCode()) * 31;
        UcpPageInfo ucpPageInfo = this.page;
        int iHashCode2 = (iHashCode + (ucpPageInfo == null ? 0 : ucpPageInfo.hashCode())) * 31;
        UcpUserInfo ucpUserInfo = this.user;
        int iHashCode3 = (iHashCode2 + (ucpUserInfo == null ? 0 : ucpUserInfo.hashCode())) * 31;
        String str = this.event;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timestamp;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UcpProperties ucpProperties = this.properties;
        int iHashCode7 = (iHashCode6 + (ucpProperties == null ? 0 : ucpProperties.hashCode())) * 31;
        UcpOpenLoopAdInfo ucpOpenLoopAdInfo = this.adInfo;
        return iHashCode7 + (ucpOpenLoopAdInfo != null ? ucpOpenLoopAdInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenLoopUcpParams(pixel=");
        sbLIZ.append(this.pixel);
        sbLIZ.append(", eventSource=");
        sbLIZ.append(this.eventSource);
        sbLIZ.append(", partner=");
        sbLIZ.append(this.partner);
        sbLIZ.append(", page=");
        sbLIZ.append(this.page);
        sbLIZ.append(", user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", eventId=");
        sbLIZ.append(this.eventId);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", properties=");
        sbLIZ.append(this.properties);
        sbLIZ.append(", adInfo=");
        sbLIZ.append(this.adInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OpenLoopUcpParams(UcpPixelInfo ucpPixelInfo, String str, String str2, UcpPageInfo ucpPageInfo, UcpUserInfo ucpUserInfo, String str3, String str4, String str5, UcpProperties ucpProperties, UcpOpenLoopAdInfo ucpOpenLoopAdInfo) {
        this.pixel = ucpPixelInfo;
        this.eventSource = str;
        this.partner = str2;
        this.page = ucpPageInfo;
        this.user = ucpUserInfo;
        this.event = str3;
        this.eventId = str4;
        this.timestamp = str5;
        this.properties = ucpProperties;
        this.adInfo = ucpOpenLoopAdInfo;
    }
}
