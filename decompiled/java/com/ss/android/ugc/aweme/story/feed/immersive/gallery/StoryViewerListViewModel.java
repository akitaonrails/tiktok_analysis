package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.AbstractC316870CbV;
import X.C09R9;
import X.C1336205Ku;
import X.C13LE;
import X.C14EU;
import X.C2201941BFw;
import X.C330690Cxn;
import X.C622680Oba;
import X.C627660Ojc;
import X.C727350Sg1;
import X.C728910SiX;
import X.C730060SkO;
import X.C730090SkR;
import X.C730120SkU;
import X.C869590Y9l;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1910450zoZ;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC330550CxZ;
import X.InterfaceC330680Cxm;
import X.InterfaceC360001aY;
import X.InterfaceC736910SvR;
import X.InterfaceC897380ZIi;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerListViewModel extends AssemListViewModel<C730090SkR, InterfaceC360001aY, Long> {
    public static final /* synthetic */ int LLIZ = 0;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C330690Cxn.class));
    public final C897520ZIw LLILLJJLI;
    public C727350Sg1 LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C730090SkR(new C627660Ojc(null, null, null, null, 15), null, null, false, null, null, 48, 0, 0, 0L, 0L, false, false, null, null);
    }

    public final InterfaceC736910SvR<InterfaceC330680Cxm> wQ2() {
        return (InterfaceC736910SvR) this.LL.getValue();
    }

    public StoryViewerListViewModel() {
        InterfaceC897380ZIi.LIZIZ.getClass();
        this.LLILLJJLI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.STORY_VIEWER, false);
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C897520ZIw c897520ZIw = this.LLILLJJLI;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC360001aY> c627660Ojc) {
        setState(new AwS590S0100000_11(c627660Ojc, (C627660Ojc<InterfaceC360001aY>) 251));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return vQ2(0L, 0L, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onSyncDiggStateEvent(C730120SkU c730120SkU) {
        Aweme aweme;
        String aid;
        String str;
        C728910SiX c728910SiX = ((C730090SkR) getState()).LLILLJJLI;
        if (c728910SiX != null && (aweme = c728910SiX.LIZ) != null && (aid = aweme.getAid()) != null && ((InterfaceC330680Cxm) wQ2().getOperator()).LLLZL(aweme) && c730120SkU != null && (str = c730120SkU.LIZ) != null) {
            C730060SkO.LIZ(str, aid, c730120SkU, new AwS127S1200000_11(this, str, c730120SkU, 3), new AwS377S0200000_11(this, c730120SkU, 63));
        }
    }

    public final boolean zQ2(Aweme aweme) {
        return ((InterfaceC330680Cxm) wQ2().getOperator()).e(aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        return vQ2(((C730090SkR) getState()).LLJI, ((C730090SkR) getState()).LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void CQ2(Context context, User user, StoryInteraction storyInteraction) {
        long j;
        boolean z;
        C869590Y9l c869590Y9l;
        int i;
        boolean z2;
        String str;
        String str2;
        String authorUid;
        Integer numValueOf;
        String aid;
        long jValueOf;
        Aweme aweme;
        Aweme aweme2;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        this.LLILZ = System.currentTimeMillis();
        if (jCurrentTimeMillis < 700) {
            return;
        }
        long msgId = 0;
        if (storyInteraction != null) {
            j = storyInteraction.flipCount;
        } else {
            j = 0;
        }
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C869590Y9l c869590Y9l2 = null;
        if (storyInteraction != null) {
            c869590Y9l = storyInteraction.msg;
            i = storyInteraction.type;
        } else {
            c869590Y9l = null;
            i = 0;
        }
        if (!z && i != 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        IMUser.Companion.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(context, C2201941BFw.LIZJ(user));
        C727350Sg1 c727350Sg1 = this.LLILLL;
        if (c727350Sg1 != null) {
            str = c727350Sg1.feedEnterFrom;
        } else {
            str = null;
        }
        enterChatParams.setEnterFromForMob(str);
        if (this.LLILZLL) {
            str2 = "views_list_panel";
        } else {
            str2 = "story_views_list_panel";
        }
        enterChatParams.setEnterMethodForMob(str2);
        enterChatParams.setEnterFrom(0);
        C728910SiX c728910SiX = ((C730090SkR) getState()).LLILLJJLI;
        if (c728910SiX == null || (aweme2 = c728910SiX.LIZ) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
            authorUid = "";
        }
        enterChatParams.setAuthorId(authorUid);
        if (user != null) {
            numValueOf = Integer.valueOf(user.getFollowStatusRelation());
        } else {
            numValueOf = null;
        }
        enterChatParams.setFollowStatusRelation(numValueOf);
        C728910SiX c728910SiX2 = ((C730090SkR) getState()).LLILLJJLI;
        if (c728910SiX2 != null && (aweme = c728910SiX2.LIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        enterChatParams.setGroupId(aid);
        enterChatParams.setQuickChat(true);
        if (z2) {
            if (c869590Y9l != null) {
                msgId = c869590Y9l.getMsgId();
            }
            jValueOf = Long.valueOf(msgId);
        } else {
            jValueOf = 0L;
        }
        enterChatParams.setScrollToMsgId(jValueOf);
        if (z2) {
            c869590Y9l2 = c869590Y9l;
        }
        enterChatParams.setStoryViewerListReplyMsg(c869590Y9l2);
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:34:0x007e, B:35:0x0081, B:37:0x0095, B:42:0x00a0, B:44:0x00af), top: B:56:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:34:0x007e, B:35:0x0081, B:37:0x0095, B:42:0x00a0, B:44:0x00af), top: B:56:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(long r21, long r23, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r25) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel.vQ2(long, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC330550CxZ xQ2(long j, long j2, Function1<? super InterfaceC330550CxZ, Unit> function1) {
        Aweme aweme;
        boolean z;
        boolean z2;
        C728910SiX c728910SiX = ((C730090SkR) getState()).LLILLJJLI;
        if (c728910SiX != null && (aweme = c728910SiX.LIZ) != null) {
            String aid = aweme.getAid();
            List<StoryInsertUser> list = null;
            if (aid == null) {
                return null;
            }
            if (j == 0) {
                InterfaceC330680Cxm interfaceC330680Cxm = (InterfaceC330680Cxm) wQ2().getOperator();
                C728910SiX c728910SiX2 = ((C730090SkR) getState()).LLILLJJLI;
                if (c728910SiX2 != null) {
                    list = c728910SiX2.LIZIZ;
                }
                C728910SiX c728910SiX3 = ((C730090SkR) getState()).LLILLJJLI;
                if (c728910SiX3 != null) {
                    z2 = c728910SiX3.LJI;
                } else {
                    z2 = false;
                }
                return interfaceC330680Cxm.O(aid, aweme, j, j2, list, function1, z2);
            }
            InterfaceC330680Cxm interfaceC330680Cxm2 = (InterfaceC330680Cxm) wQ2().getOperator();
            C728910SiX c728910SiX4 = ((C730090SkR) getState()).LLILLJJLI;
            if (c728910SiX4 != null) {
                list = c728910SiX4.LIZIZ;
            }
            C728910SiX c728910SiX5 = ((C730090SkR) getState()).LLILLJJLI;
            if (c728910SiX5 != null) {
                z = c728910SiX5.LJI;
            } else {
                z = false;
            }
            return interfaceC330680Cxm2.LLLZ(aid, aweme, j, j2, list, function1, z);
        }
        throw new RuntimeException("no story info onFetch");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[PHI: r4
      0x0031: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v7 java.lang.String) binds: [B:13:0x002f, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r4
      0x0035: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v6 java.lang.String) binds: [B:13:0x002f, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[PHI: r3 r4
      0x0038: PHI (r3v2 java.lang.String) = (r3v4 java.lang.String), (r3v5 java.lang.String) binds: [B:17:0x0036, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0038: PHI (r4v3 java.lang.String) = (r4v5 java.lang.String), (r4v6 java.lang.String) binds: [B:17:0x0036, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(java.lang.String r18, java.lang.Long r19, java.lang.Integer r20, kotlin.jvm.functions.Function1<? super X.C2344009Gk, kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel.AQ2(java.lang.String, java.lang.Long, java.lang.Integer, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(long r12, X.InterfaceC330550CxZ r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.InterfaceC330550CxZ, ? extends java.util.List<? extends X.InterfaceC360001aY>>> r16) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel.yQ2(long, X.0CxZ, com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }
}
