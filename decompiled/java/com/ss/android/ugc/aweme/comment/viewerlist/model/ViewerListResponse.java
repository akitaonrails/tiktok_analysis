package com.ss.android.ugc.aweme.comment.viewerlist.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC330550CxZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import com.ss.android.ugc.aweme.story.model.StoryInteractionWrap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ViewerListResponse extends BaseResponse implements Serializable, InterfaceC330550CxZ {
    public static final int $stable = 8;
    public final String LL;
    public long LLILLJJLI;
    public final long LLILLL;
    public final Boolean LLILZ;
    public final int LLILZIL;
    public final Long LLILZLL;
    public List<StoryInteractionUser> LLIZ;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("interaction_infos")
    public List<StoryInteractionWrap> interactionWrapList;

    @C09CT("is_auth")
    public final boolean isAuth;

    @C09CT("offset")
    public final long offset;

    @C09CT("show_entrance")
    public final boolean showEntrance;

    @C09CT("total_count")
    public final long totalCount;

    @C09CT("view_count_data")
    public final ViewCountData viewCountData;

    @C09CT("viewer_list")
    public final List<User> viewerList;

    public ViewerListResponse() {
        this(false, 0L, 0L, null, false, false, 0L, null, null, ViewerListResponse.class.getName());
    }

    public final ViewerListResponse copy(boolean z, long j, long j2, List<User> list, boolean z2, boolean z3, long j3, List<StoryInteractionWrap> list2, ViewCountData viewCountData, String str) {
        return new ViewerListResponse(z, j, j2, list, z2, z3, j3, list2, viewCountData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewerListResponse)) {
            return false;
        }
        ViewerListResponse viewerListResponse = (ViewerListResponse) obj;
        return this.hasMore == viewerListResponse.hasMore && this.cursor == viewerListResponse.cursor && this.offset == viewerListResponse.offset && Intrinsics.LJFF(this.viewerList, viewerListResponse.viewerList) && this.showEntrance == viewerListResponse.showEntrance && this.isAuth == viewerListResponse.isAuth && this.totalCount == viewerListResponse.totalCount && Intrinsics.LJFF(this.interactionWrapList, viewerListResponse.interactionWrapList) && Intrinsics.LJFF(this.viewCountData, viewerListResponse.viewCountData) && Intrinsics.LJFF(this.LL, viewerListResponse.LL);
    }

    @Override // X.InterfaceC330550CxZ
    public StoryAnalytics getStoryAnalytics() {
        return null;
    }

    public int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.hasMore) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Y2(this.offset)) * 31;
        List<User> list = this.viewerList;
        int iHashCode = (((((((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.showEntrance)) * 31) + C786410Ut5.Z2(this.isAuth)) * 31) + C786410Ut5.Y2(this.totalCount)) * 31;
        List<StoryInteractionWrap> list2 = this.interactionWrapList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ViewCountData viewCountData = this.viewCountData;
        return ((iHashCode2 + (viewCountData != null ? viewCountData.hashCode() : 0)) * 31) + this.LL.hashCode();
    }

    @Override // X.InterfaceC330550CxZ
    public boolean isShowLikeListLimit() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerListResponse(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(", viewerList=");
        sbLIZ.append(this.viewerList);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.showEntrance);
        sbLIZ.append(", isAuth=");
        sbLIZ.append(this.isAuth);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", interactionWrapList=");
        sbLIZ.append(this.interactionWrapList);
        sbLIZ.append(", viewCountData=");
        sbLIZ.append(this.viewCountData);
        sbLIZ.append(", javaClassName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC330550CxZ
    public List<StoryInteractionUser> getInteractionUserList() {
        User next;
        List<StoryInteractionUser> list = this.LLIZ;
        if (list != null) {
            return list;
        }
        List<StoryInteractionWrap> list2 = this.interactionWrapList;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StoryInteractionWrap storyInteractionWrap : list2) {
            List<User> list3 = this.viewerList;
            if (list3 != null) {
                Iterator<User> it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getUid(), storyInteractionWrap.uid)) {
                        break;
                    }
                }
                User user = next;
                if (user != null) {
                    Integer num = storyInteractionWrap.type;
                    int iIntValue = num != null ? num.intValue() : 0;
                    String str = storyInteractionWrap.emojiContent;
                    String str2 = storyInteractionWrap.conversationId;
                    Long l = storyInteractionWrap.messageId;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    Long l2 = storyInteractionWrap.flipCount;
                    arrayList.add(new StoryInteractionUser(user, new StoryInteraction(iIntValue, str, str2, jLongValue, l2 != null ? l2.longValue() : 0L, false, null, null)));
                }
            }
        }
        this.LLIZ = arrayList;
        return arrayList;
    }

    @Override // X.InterfaceC330550CxZ
    public long getTotal() {
        long j = this.LLILLJJLI;
        long j2 = this.totalCount;
        return j < j2 ? j2 : j;
    }

    public final long getCursor() {
        return this.cursor;
    }

    @Override // X.InterfaceC330550CxZ
    public int getExpiryPeriod() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC330550CxZ
    public boolean getHasMore() {
        return this.hasMore;
    }

    public final List<StoryInteractionWrap> getInteractionWrapList() {
        return this.interactionWrapList;
    }

    @Override // X.InterfaceC330550CxZ
    public String getJavaClassName() {
        return this.LL;
    }

    @Override // X.InterfaceC330550CxZ
    public long getNextCursor() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC330550CxZ
    public long getOffset() {
        return this.offset;
    }

    public final boolean getShowEntrance() {
        return this.showEntrance;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final ViewCountData getViewCountData() {
        return this.viewCountData;
    }

    public final List<User> getViewerList() {
        return this.viewerList;
    }

    @Override // X.InterfaceC330550CxZ
    public Long getViewersCount() {
        return this.LLILZLL;
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    @Override // X.InterfaceC330550CxZ
    public Boolean isFullViewer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC330550CxZ
    public void setInteractionUserList(List<StoryInteractionUser> list) {
        this.LLIZ = list;
    }

    public final void setInteractionWrapList(List<StoryInteractionWrap> list) {
        this.interactionWrapList = list;
    }

    @Override // X.InterfaceC330550CxZ
    public void setTotal(long j) {
        this.LLILLJJLI = j;
    }

    public ViewerListResponse(boolean z, long j, long j2, List<User> list, boolean z2, boolean z3, long j3, List<StoryInteractionWrap> list2, ViewCountData viewCountData, String str) {
        this.hasMore = z;
        this.cursor = j;
        this.offset = j2;
        this.viewerList = list;
        this.showEntrance = z2;
        this.isAuth = z3;
        this.totalCount = j3;
        this.interactionWrapList = list2;
        this.viewCountData = viewCountData;
        this.LL = str;
        this.LLILLL = j;
        this.LLILZ = Boolean.FALSE;
        this.LLILZIL = 7;
        this.LLILZLL = 0L;
    }
}
