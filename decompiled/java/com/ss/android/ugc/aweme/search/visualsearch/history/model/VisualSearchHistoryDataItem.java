package com.ss.android.ugc.aweme.search.visualsearch.history.model;

import X.AnonymousClass0020;
import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.VisualSearchTagModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class VisualSearchHistoryDataItem implements AnonymousClass0020, Serializable {

    @C09CT("bottom")
    public final double bottom;

    @C09CT("extra_info")
    public final VisualSearchHistoryExtraInfo extraInfo;

    @C09CT("from_group_context")
    public final String fromGroupContext;

    @C09CT("host_aid")
    public final String hostAid;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("is_photo")
    public final Boolean isPhoto;

    @C09CT("left")
    public final double left;

    @C09CT("pic_url")
    public final String picUrl;

    @C09CT("right")
    public final double right;

    @C09CT("tag_model")
    public final VisualSearchTagModel tagModel;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("top")
    public final double top;

    @C09CT("tos_key")
    public final String tosKey;

    @C09CT("visual_pause_time_pos")
    public final Long visualPauseTimePos;

    public VisualSearchHistoryDataItem() {
        this(System.currentTimeMillis(), System.currentTimeMillis(), "", 0.1d, 0.1d, 0.9d, 0.9d, "", null, null, null, null, null, null);
    }

    public final VisualSearchHistoryDataItem copy(long j, long j2, String str, double d, double d2, double d3, double d4, String str2, String str3, Boolean bool, Long l, String str4, VisualSearchTagModel visualSearchTagModel, VisualSearchHistoryExtraInfo visualSearchHistoryExtraInfo) {
        return new VisualSearchHistoryDataItem(j, j2, str, d, d2, d3, d4, str2, str3, bool, l, str4, visualSearchTagModel, visualSearchHistoryExtraInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchHistoryDataItem)) {
            return false;
        }
        VisualSearchHistoryDataItem visualSearchHistoryDataItem = (VisualSearchHistoryDataItem) obj;
        return this.id == visualSearchHistoryDataItem.id && this.timestamp == visualSearchHistoryDataItem.timestamp && Intrinsics.LJFF(this.picUrl, visualSearchHistoryDataItem.picUrl) && Double.compare(this.left, visualSearchHistoryDataItem.left) == 0 && Double.compare(this.top, visualSearchHistoryDataItem.top) == 0 && Double.compare(this.right, visualSearchHistoryDataItem.right) == 0 && Double.compare(this.bottom, visualSearchHistoryDataItem.bottom) == 0 && Intrinsics.LJFF(this.tosKey, visualSearchHistoryDataItem.tosKey) && Intrinsics.LJFF(this.hostAid, visualSearchHistoryDataItem.hostAid) && Intrinsics.LJFF(this.isPhoto, visualSearchHistoryDataItem.isPhoto) && Intrinsics.LJFF(this.visualPauseTimePos, visualSearchHistoryDataItem.visualPauseTimePos) && Intrinsics.LJFF(this.fromGroupContext, visualSearchHistoryDataItem.fromGroupContext) && Intrinsics.LJFF(this.tagModel, visualSearchHistoryDataItem.tagModel) && Intrinsics.LJFF(this.extraInfo, visualSearchHistoryDataItem.extraInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int iY2 = ((((((((((((((C786410Ut5.Y2(this.id) * 31) + C786410Ut5.Y2(this.timestamp)) * 31) + this.picUrl.hashCode()) * 31) + C786410Ut5.X2(this.left)) * 31) + C786410Ut5.X2(this.top)) * 31) + C786410Ut5.X2(this.right)) * 31) + C786410Ut5.X2(this.bottom)) * 31) + this.tosKey.hashCode()) * 31;
        String str = this.hostAid;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isPhoto;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.visualPauseTimePos;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.fromGroupContext;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VisualSearchTagModel visualSearchTagModel = this.tagModel;
        int iHashCode5 = (iHashCode4 + (visualSearchTagModel == null ? 0 : visualSearchTagModel.hashCode())) * 31;
        VisualSearchHistoryExtraInfo visualSearchHistoryExtraInfo = this.extraInfo;
        return iHashCode5 + (visualSearchHistoryExtraInfo != null ? visualSearchHistoryExtraInfo.hashCode() : 0);
    }

    public String toString() {
        return "VisualSearchHistoryDataItem(id=" + this.id + ", timestamp=" + this.timestamp + ", picUrl=" + this.picUrl + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", tosKey=" + this.tosKey + ", hostAid=" + this.hostAid + ", isPhoto=" + this.isPhoto + ", visualPauseTimePos=" + this.visualPauseTimePos + ", fromGroupContext=" + this.fromGroupContext + ", tagModel=" + this.tagModel + ", extraInfo=" + this.extraInfo + ')';
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final VisualSearchHistoryExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final String getFromGroupContext() {
        return this.fromGroupContext;
    }

    public final String getHostAid() {
        return this.hostAid;
    }

    public final long getId() {
        return this.id;
    }

    public final double getLeft() {
        return this.left;
    }

    public final String getPicUrl() {
        return this.picUrl;
    }

    public final double getRight() {
        return this.right;
    }

    public final VisualSearchTagModel getTagModel() {
        return this.tagModel;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final double getTop() {
        return this.top;
    }

    public final String getTosKey() {
        return this.tosKey;
    }

    public final Long getVisualPauseTimePos() {
        return this.visualPauseTimePos;
    }

    public final Boolean isPhoto() {
        return this.isPhoto;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public VisualSearchHistoryDataItem(long j, long j2, String str, double d, double d2, double d3, double d4, String str2, String str3, Boolean bool, Long l, String str4, VisualSearchTagModel visualSearchTagModel, VisualSearchHistoryExtraInfo visualSearchHistoryExtraInfo) {
        this.id = j;
        this.timestamp = j2;
        this.picUrl = str;
        this.left = d;
        this.top = d2;
        this.right = d3;
        this.bottom = d4;
        this.tosKey = str2;
        this.hostAid = str3;
        this.isPhoto = bool;
        this.visualPauseTimePos = l;
        this.fromGroupContext = str4;
        this.tagModel = visualSearchTagModel;
        this.extraInfo = visualSearchHistoryExtraInfo;
    }
}
