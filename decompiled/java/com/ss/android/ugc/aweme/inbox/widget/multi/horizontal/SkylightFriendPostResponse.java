package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SkylightFriendPostResponse extends BaseResponse implements Serializable {

    @C09CT("viewed_list")
    public final List<FriendPostBean> allReadUserBlock;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("unview_list")
    public final List<FriendPostBean> unReadBlock;

    public SkylightFriendPostResponse() {
        this(0, false, null, null);
    }

    public final SkylightFriendPostResponse copy(Integer num, boolean z, List<FriendPostBean> list, List<FriendPostBean> list2) {
        return new SkylightFriendPostResponse(num, z, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightFriendPostResponse)) {
            return false;
        }
        SkylightFriendPostResponse skylightFriendPostResponse = (SkylightFriendPostResponse) obj;
        return Intrinsics.LJFF(this.cursor, skylightFriendPostResponse.cursor) && this.hasMore == skylightFriendPostResponse.hasMore && Intrinsics.LJFF(this.unReadBlock, skylightFriendPostResponse.unReadBlock) && Intrinsics.LJFF(this.allReadUserBlock, skylightFriendPostResponse.allReadUserBlock);
    }

    public int hashCode() {
        Integer num = this.cursor;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        List<FriendPostBean> list = this.unReadBlock;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FriendPostBean> list2 = this.allReadUserBlock;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightFriendPostResponse(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", unReadBlock=");
        sbLIZ.append(this.unReadBlock);
        sbLIZ.append(", allReadUserBlock=");
        sbLIZ.append(this.allReadUserBlock);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<FriendPostBean> getAllReadUserBlock() {
        return this.allReadUserBlock;
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<FriendPostBean> getUnReadBlock() {
        return this.unReadBlock;
    }

    public SkylightFriendPostResponse(Integer num, boolean z, List<FriendPostBean> list, List<FriendPostBean> list2) {
        this.cursor = num;
        this.hasMore = z;
        this.unReadBlock = list;
        this.allReadUserBlock = list2;
    }
}
