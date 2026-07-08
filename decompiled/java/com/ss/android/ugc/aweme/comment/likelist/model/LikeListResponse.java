package com.ss.android.ugc.aweme.comment.likelist.model;

import X.C09CT;
import X.C15438062q;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC330550CxZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListResponse extends BaseResponse implements Serializable, InterfaceC330550CxZ {
    public static final int $stable = 8;
    public final String LL;
    public long LLILLJJLI;
    public final long LLILLL;
    public final Boolean LLILZ;
    public final int LLILZIL;
    public final Long LLILZLL;
    public final boolean LLIZ;
    public List<StoryInteractionUser> LLIZLLLIL;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("is_show_limit")
    public final boolean isShowLimit;

    @C09CT("like_list")
    public List<User> likeList;

    @C09CT("offset")
    public final long offset;

    public LikeListResponse() {
        this(false, 0L, 0L, null, false, LikeListResponse.class.getName());
    }

    public final LikeListResponse copy(boolean z, long j, long j2, List<User> list, boolean z2, String str) {
        return new LikeListResponse(z, j, j2, list, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeListResponse)) {
            return false;
        }
        LikeListResponse likeListResponse = (LikeListResponse) obj;
        return this.hasMore == likeListResponse.hasMore && this.cursor == likeListResponse.cursor && this.offset == likeListResponse.offset && Intrinsics.LJFF(this.likeList, likeListResponse.likeList) && this.isShowLimit == likeListResponse.isShowLimit && Intrinsics.LJFF(this.LL, likeListResponse.LL);
    }

    @Override // X.InterfaceC330550CxZ
    public StoryAnalytics getStoryAnalytics() {
        return null;
    }

    public int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.hasMore) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Y2(this.offset)) * 31;
        List<User> list = this.likeList;
        return ((((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.isShowLimit)) * 31) + this.LL.hashCode();
    }

    @Override // X.InterfaceC330550CxZ
    public List<StoryInteractionUser> getInteractionUserList() {
        List<StoryInteractionUser> list = this.LLIZLLLIL;
        if (list != null) {
            return list;
        }
        List<User> list2 = this.likeList;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (User user : list2) {
            StoryInteraction.Companion.getClass();
            arrayList.add(new StoryInteractionUser(user, new StoryInteraction(2, null, null, 0L, 0L, false, null, null)));
        }
        this.LLIZLLLIL = arrayList;
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeListResponse{likeList:");
        List<User> list = this.likeList;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        sbLIZ.append(", hasMore:");
        sbLIZ.append(getHasMore());
        sbLIZ.append(", cursor:");
        sbLIZ.append(this.cursor);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    @Override // X.InterfaceC330550CxZ
    public String getJavaClassName() {
        return this.LL;
    }

    public final List<User> getLikeList() {
        return this.likeList;
    }

    @Override // X.InterfaceC330550CxZ
    public long getNextCursor() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC330550CxZ
    public long getOffset() {
        return this.offset;
    }

    @Override // X.InterfaceC330550CxZ
    public long getTotal() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC330550CxZ
    public Long getViewersCount() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC330550CxZ
    public Boolean isFullViewer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC330550CxZ
    public boolean isShowLikeListLimit() {
        return this.LLIZ;
    }

    public final boolean isShowLimit() {
        return this.isShowLimit;
    }

    @Override // X.InterfaceC330550CxZ
    public void setInteractionUserList(List<StoryInteractionUser> list) {
        this.LLIZLLLIL = list;
    }

    public final void setLikeList(List<User> list) {
        this.likeList = list;
    }

    @Override // X.InterfaceC330550CxZ
    public void setTotal(long j) {
        this.LLILLJJLI = j;
    }

    public LikeListResponse(boolean z, long j, long j2, List<User> list, boolean z2, String str) {
        this.hasMore = z;
        this.cursor = j;
        this.offset = j2;
        this.likeList = list;
        this.isShowLimit = z2;
        this.LL = str;
        this.LLILLL = j;
        this.LLILZ = Boolean.FALSE;
        this.LLILZIL = 7;
        this.LLILZLL = 0L;
        this.LLIZ = z2;
    }
}
