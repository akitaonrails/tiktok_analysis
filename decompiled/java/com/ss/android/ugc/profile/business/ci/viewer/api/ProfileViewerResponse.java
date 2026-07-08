package com.ss.android.ugc.profile.business.ci.viewer.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ProfileViewerResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("is_authorized")
    public final boolean isAuthorized;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("unread_count")
    public final int unreadCount;

    @C09CT("viewer_list")
    public final List<ProfileViewerInfo> viewerList;

    public ProfileViewerResponse() {
        this(0, null, false, false, null, 31, null);
    }

    public final ProfileViewerResponse copy(int i, String str, boolean z, boolean z2, List<ProfileViewerInfo> list) {
        return new ProfileViewerResponse(i, str, z, z2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileViewerResponse)) {
            return false;
        }
        ProfileViewerResponse profileViewerResponse = (ProfileViewerResponse) obj;
        return this.unreadCount == profileViewerResponse.unreadCount && Intrinsics.LJFF(this.nextCursor, profileViewerResponse.nextCursor) && this.hasMore == profileViewerResponse.hasMore && this.isAuthorized == profileViewerResponse.isAuthorized && Intrinsics.LJFF(this.viewerList, profileViewerResponse.viewerList);
    }

    public int hashCode() {
        return (((((((this.unreadCount * 31) + this.nextCursor.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Z2(this.isAuthorized)) * 31) + this.viewerList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileViewerResponse(unreadCount=");
        sbLIZ.append(this.unreadCount);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", isAuthorized=");
        sbLIZ.append(this.isAuthorized);
        sbLIZ.append(", viewerList=");
        sbLIZ.append(this.viewerList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final List<ProfileViewerInfo> getViewerList() {
        return this.viewerList;
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public ProfileViewerResponse(int i, String str, boolean z, boolean z2, List<ProfileViewerInfo> list) {
        this.unreadCount = i;
        this.nextCursor = str;
        this.hasMore = z;
        this.isAuthorized = z2;
        this.viewerList = list;
    }

    public ProfileViewerResponse(int i, String str, boolean z, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) == 0 ? z2 : false, (i2 & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
