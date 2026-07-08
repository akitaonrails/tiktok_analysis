package com.ss.android.ugc.aweme.profile.api;

import X.C09CT;
import X.C11NZ;
import X.C19505711Tb;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public interface FollowRelationApi {
    public static final C19505711Tb LIZ = C19505711Tb.LIZ;

    @InterfaceC1501200pAU("/aweme/v1/user/following/list/")
    C11NZ<FollowingItemList> LIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("max_time") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("offset") int i2, @InterfaceC1501120pAM("source_type") int i3, @InterfaceC1501120pAM("address_book_access") int i4, @InterfaceC1501120pAM("page_token") String str3, @InterfaceC1501120pAM("live_sort_by") int i5, @InterfaceC1501120pAM("experiment_config") String str4);

    @InterfaceC1501200pAU("/aweme/v1/user/follower/list/")
    C11NZ<FollowerItemList> LIZIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("max_time") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("offset") int i2, @InterfaceC1501120pAM("source_type") int i3, @InterfaceC1501120pAM("address_book_access") int i4, @InterfaceC1501120pAM("page_token") String str3, @InterfaceC1501120pAM("target_user_ids") String str4);

    @InterfaceC1501240pAY("/aweme/v2/follow/feed/visit_report")
    Object LIZJ(@InterfaceC1501120pAM("to_user_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, @InterfaceC1501120pAM("extra") String str3, InterfaceC1364105Vn<? super FollowingMarkReadResponse> interfaceC1364105Vn);

    /* JADX INFO: loaded from: classes.dex */
    public static final class FollowingMarkReadResponse extends BaseResponse {

        @C09CT("report_time")
        public final Long reportTime;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowingMarkReadResponse) && Intrinsics.LJFF(this.reportTime, ((FollowingMarkReadResponse) obj).reportTime);
        }

        public final int hashCode() {
            Long l = this.reportTime;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FollowingMarkReadResponse(reportTime=");
            sbLIZ.append(this.reportTime);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public FollowingMarkReadResponse(Long l) {
            this.reportTime = l;
        }
    }
}
