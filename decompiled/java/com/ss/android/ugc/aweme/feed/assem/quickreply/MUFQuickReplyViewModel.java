package com.ss.android.ugc.aweme.feed.assem.quickreply;

import X.C0I0B;
import X.C1336205Ku;
import X.C1360460lVU;
import X.C13BV;
import X.C1954807lC;
import X.C1A1H;
import X.C1A1I;
import X.C1A1J;
import X.C1A1K;
import X.C1A1M;
import X.C1A1O;
import X.C1A1P;
import X.C1A1R;
import X.C1A1S;
import X.C1A1W;
import X.C1A1X;
import X.C1A1Y;
import X.C1A1Z;
import X.C2172601A1a;
import X.EnumC714720S1u;
import X.InterfaceC0148002o;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MUFQuickReplyViewModel extends FeedBaseViewModel<C1A1J> {
    public boolean LL;

    public final void AQ2() {
        setStateImmediate(AFwS279S0000000_33.get$arr$(121));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1A1J(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String wQ2() {
        C1A1W c1a1w = ((C1A1J) getState()).LLILLJJLI.LIZ;
        if (c1a1w instanceof C1A1Z) {
            return "homepage_friends";
        }
        if (c1a1w instanceof C1A1Y) {
            return C1A1H.LIZ(((C1A1Y) c1a1w).LIZ);
        }
        if (c1a1w instanceof C1A1X) {
            return C1A1H.LIZ(((C1A1X) c1a1w).LIZ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String xQ2() {
        C1A1W c1a1w = ((C1A1J) getState()).LLILLJJLI.LIZ;
        if (!(c1a1w instanceof C1A1Y)) {
            if ((c1a1w instanceof C1A1Z) || (c1a1w instanceof C1A1X)) {
                return "quick_reply_muf_post";
            }
            if (c1a1w instanceof C2172601A1a) {
                return null;
            }
            throw new C1954807lC();
        }
        C1A1O c1a1o = ((C1A1J) getState()).LLILLL;
        if (c1a1o == null) {
            return null;
        }
        if ((c1a1o instanceof C1A1R) || (c1a1o instanceof C1A1P)) {
            return "quick_reply_repost_single";
        }
        return null;
    }

    public static boolean yQ2(List list) {
        User user = ((UpvoteStruct) ListProtector.get(list, 0)).user;
        if (user == null || user.getFollowStatus() != 2 || !C1A1M.LIZIZ.LIZ(user.getUid())) {
            return false;
        }
        return true;
    }

    public final void BQ2(C1A1K c1a1k) {
        String strXQ2;
        setStateImmediate(new AwS612S0100000_33(c1a1k, 70));
        String strWQ2 = wQ2();
        if (strWQ2 == null || (strXQ2 = xQ2()) == null) {
            return;
        }
        C1336205Ku.LIZ(false).getQuickReplyAnalytics().LIZIZ(strWQ2, strXQ2, c1a1k.toTriggerReason(), C0I0B.LJFF.LIZIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void CQ2(EnumC714720S1u enumC714720S1u) {
        String strXQ2;
        String strWQ2 = wQ2();
        if (strWQ2 == null || (strXQ2 = xQ2()) == null) {
            return;
        }
        C1336205Ku.LIZ(false).getQuickReplyAnalytics().LJ(strWQ2, strXQ2, ((C1A1J) getState()).LL.toTriggerReason(), enumC714720S1u, C0I0B.LJFF.LIZIZ());
    }

    public final void DQ2(C1A1W c1a1w) {
        setStateImmediate(new AwS612S0100000_33(c1a1w, 71));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zQ2(C1A1K c1a1k) {
        String strXQ2;
        if (((C1A1J) getState()).LL == C1A1K.NOT_SET) {
            setStateImmediate(new AwS612S0100000_33(c1a1k, 69));
            String strWQ2 = wQ2();
            if (strWQ2 == null || (strXQ2 = xQ2()) == null) {
                return;
            }
            C1336205Ku.LIZ(false).getQuickReplyAnalytics().LIZIZ(strWQ2, strXQ2, c1a1k.toTriggerReason(), C0I0B.LJFF.LIZIZ());
            C1A1S c1a1sLIZIZ = C1A1H.LIZIZ(((C1A1J) getState()).LLILLJJLI.LIZ);
            if (c1a1sLIZIZ == null) {
                return;
            }
            C1A1M.LIZIZ.LIZJ(c1a1sLIZIZ);
        }
    }

    public static boolean vQ2(Aweme aweme, C1A1I c1a1i) {
        List list;
        User user;
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        if (c1360460lVU.LJJIIZ(aweme.getAid())) {
            return false;
        }
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aweme.getAid());
        if (upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null) {
            list = C13BV.INSTANCE;
        }
        if (!list.isEmpty() && list.size() <= 1) {
            C1A1O c1a1o = c1a1i.LIZIZ;
            if (Intrinsics.LJFF(c1a1o, C1A1R.LIZ)) {
                if (!yQ2(list)) {
                    return false;
                }
                return true;
            }
            if (c1a1o instanceof C1A1P) {
                int i = ((C1A1P) c1a1i.LIZIZ).LIZ;
                C1A1M c1a1m = C1A1M.LIZIZ;
                List<String> listLIZLLL = c1a1m.LIZLLL(i);
                if (!listLIZLLL.isEmpty() ? (user = ((UpvoteStruct) ListProtector.get(list, 0)).user) == null || user.getFollowStatus() != 2 || !listLIZLLL.contains(user.getUid()) || !c1a1m.LIZ(user.getUid()) : !yQ2(list)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void EQ2(List<UpvoteStruct> list, C1A1I c1a1i) {
        if (list.size() > 1) {
            return;
        }
        C1A1O c1a1o = c1a1i.LIZIZ;
        C1A1R c1a1r = C1A1R.LIZ;
        if (Intrinsics.LJFF(c1a1o, c1a1r)) {
            setStateImmediate(new AwS612S0100000_33(c1a1r, 215));
        } else {
            if (!(c1a1o instanceof C1A1P)) {
                return;
            }
            setStateImmediate(new AwS612S0100000_33(new C1A1P(((C1A1P) c1a1i.LIZIZ).LIZ), 215));
        }
    }
}
