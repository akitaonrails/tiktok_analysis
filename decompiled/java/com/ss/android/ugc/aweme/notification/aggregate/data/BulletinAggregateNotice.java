package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.bulletin.KeyValueHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BulletinAggregateNotice implements InterfaceC1891350zJl {

    @C09CT("bulletin_channel_info")
    public final BulletinChannelInfo channelInfo;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("extra")
    public final List<KeyValueHolder> eventTrackingExtra;

    @C09CT("invite_id")
    public final String inviteId;

    @C09CT("scheme_url")
    public final String schemeUrl;

    @C09CT("bulletin_channel_invited_ui")
    public final TemplateAggregateUiInfo uiInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinAggregateNotice)) {
            return false;
        }
        BulletinAggregateNotice bulletinAggregateNotice = (BulletinAggregateNotice) obj;
        return Intrinsics.LJFF(this.inviteId, bulletinAggregateNotice.inviteId) && Intrinsics.LJFF(this.createTime, bulletinAggregateNotice.createTime) && Intrinsics.LJFF(this.schemeUrl, bulletinAggregateNotice.schemeUrl) && Intrinsics.LJFF(this.uiInfo, bulletinAggregateNotice.uiInfo) && Intrinsics.LJFF(this.channelInfo, bulletinAggregateNotice.channelInfo) && Intrinsics.LJFF(this.eventTrackingExtra, bulletinAggregateNotice.eventTrackingExtra);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.inviteId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.createTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.schemeUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TemplateAggregateUiInfo templateAggregateUiInfo = this.uiInfo;
        int iHashCode4 = (iHashCode3 + (templateAggregateUiInfo == null ? 0 : templateAggregateUiInfo.hashCode())) * 31;
        BulletinChannelInfo bulletinChannelInfo = this.channelInfo;
        int iHashCode5 = (iHashCode4 + (bulletinChannelInfo == null ? 0 : bulletinChannelInfo.hashCode())) * 31;
        List<KeyValueHolder> list = this.eventTrackingExtra;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinAggregateNotice(inviteId=");
        sbLIZ.append(this.inviteId);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", schemeUrl=");
        sbLIZ.append(this.schemeUrl);
        sbLIZ.append(", uiInfo=");
        sbLIZ.append(this.uiInfo);
        sbLIZ.append(", channelInfo=");
        sbLIZ.append(this.channelInfo);
        sbLIZ.append(", eventTrackingExtra=");
        sbLIZ.append(this.eventTrackingExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public BulletinAggregateNotice(String str, Long l, String str2, TemplateAggregateUiInfo templateAggregateUiInfo, BulletinChannelInfo bulletinChannelInfo, List<KeyValueHolder> list) {
        this.inviteId = str;
        this.createTime = l;
        this.schemeUrl = str2;
        this.uiInfo = templateAggregateUiInfo;
        this.channelInfo = bulletinChannelInfo;
        this.eventTrackingExtra = list;
    }
}
