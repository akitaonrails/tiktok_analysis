package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowingRelationState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS7S2110000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S2110000_19 awS7S2110000_19, Object obj) {
        FollowerRelationState followerRelationState = (FollowerRelationState) obj;
        return followerRelationState.copy(awS7S2110000_19.s0, awS7S2110000_19.s1, awS7S2110000_19.z3, "", (User) awS7S2110000_19.l2, followerRelationState.listState, followerRelationState.payload);
    }

    public static final Object invoke$1(AwS7S2110000_19 awS7S2110000_19, Object obj) {
        FollowingRelationState followingRelationState = (FollowingRelationState) obj;
        return followingRelationState.copy(awS7S2110000_19.s0, awS7S2110000_19.s1, awS7S2110000_19.z3, followingRelationState.recommendList, followingRelationState.jediListState, followingRelationState.isHotsoonHasMore, followingRelationState.vcdCount, followingRelationState.hotsoonText, followingRelationState.unreadCountMap, followingRelationState.unreadUidList, "", followingRelationState.liveSortBy, followingRelationState.listState, followingRelationState.payload, followingRelationState.refresh, followingRelationState.removeUid, (User) awS7S2110000_19.l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S2110000_19(User user, boolean z, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.z3 = z;
        this.l2 = user;
    }
}
