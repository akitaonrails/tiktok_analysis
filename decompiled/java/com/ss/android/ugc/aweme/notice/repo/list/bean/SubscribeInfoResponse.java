package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscribeInfoResponse extends BaseResponse {

    @C09CT("can_popup")
    public final boolean canPopup;

    @C09CT("categories")
    public final List<CategoryInfo> categories;

    @C09CT("channel_info")
    public final ChannelInfo channelInfo;

    public SubscribeInfoResponse() {
        this(false, null, null);
    }

    public final SubscribeInfoResponse copy(boolean z, ChannelInfo channelInfo, List<CategoryInfo> list) {
        return new SubscribeInfoResponse(z, channelInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeInfoResponse)) {
            return false;
        }
        SubscribeInfoResponse subscribeInfoResponse = (SubscribeInfoResponse) obj;
        return this.canPopup == subscribeInfoResponse.canPopup && Intrinsics.LJFF(this.channelInfo, subscribeInfoResponse.channelInfo) && Intrinsics.LJFF(this.categories, subscribeInfoResponse.categories);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.canPopup) * 31;
        ChannelInfo channelInfo = this.channelInfo;
        int iHashCode = (iZ2 + (channelInfo == null ? 0 : channelInfo.hashCode())) * 31;
        List<CategoryInfo> list = this.categories;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeInfoResponse(canPopup=");
        sbLIZ.append(this.canPopup);
        sbLIZ.append(", channelInfo=");
        sbLIZ.append(this.channelInfo);
        sbLIZ.append(", categories=");
        sbLIZ.append(this.categories);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getCanPopup() {
        return this.canPopup;
    }

    public final List<CategoryInfo> getCategories() {
        return this.categories;
    }

    public final ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public SubscribeInfoResponse(boolean z, ChannelInfo channelInfo, List<CategoryInfo> list) {
        this.canPopup = z;
        this.channelInfo = channelInfo;
        this.categories = list;
    }
}
