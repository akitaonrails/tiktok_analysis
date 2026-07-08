package com.ss.android.ugc.aweme.repostfeed.service;

import X.AbstractC20660815t0;
import X.C01GW;
import X.C03H5;
import X.C0P0T;
import X.C0SZ8;
import X.C1360620lVk;
import X.C1360650lVn;
import X.C1360680lVq;
import X.C1360700lVs;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1567050qsh;
import X.C1578000rAM;
import X.C1578100rAW;
import X.C1583220rIm;
import X.C1583300rIu;
import X.C1583340rIy;
import X.C1583360rJ0;
import X.C1583420rJ6;
import X.C1583510rJF;
import X.C1586870rOf;
import X.C1587150rP7;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C19EG;
import X.C2188811AlT;
import X.C260630AJh;
import X.C298720BnK;
import X.C343710Ddh;
import X.C786410Ut5;
import X.EnumC1360550lVd;
import X.InterfaceC1584710rLB;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.popup.SocialPopupManager;
import com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.repostfeed.ui.RepostBackToFYPAssem;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.upvote.experiment.RepostFeedEntrancePollingExp;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import defpackage.RepostFeedEntranceVM;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedServiceImpl implements IRepostFeedService {
    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILLIIL() {
        return C13LE.LIZ(RepostBackToFYPAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LIZ() {
        C1583300rIu.LIZ.getClass();
        RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
        return repostFeedConfigLIZ != null && repostFeedConfigLIZ.usePopupManager == 1;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJ() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null || (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) == null) {
            return;
        }
        iSocial2TabProtocolAbilityLJI.rO0();
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJII() {
        C1583420rJ6.LIZ.getClass();
        C1583420rJ6.LIZIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LJIIIIZZ() {
        C1583300rIu.LIZ.getClass();
        if (!C1583300rIu.LIZIZ()) {
            return false;
        }
        C1360680lVq.LIZ.getClass();
        Keva keva = C1360680lVq.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repost_feed_shown_");
        sbLIZ.append(C1360680lVq.LIZ());
        return !keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LJIIL() {
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        return c19egLIZIZ != null && Intrinsics.LJFF(C343710Ddh.LIZ(c19egLIZIZ).CQ2(), "FRIENDS_TAB") && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null))) != null && iFriendsTabLayoutAbilityLIZLLL.uw("REPOST_FEED");
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIILL() {
        RepostFeedEntrancePollingExp.LIZ.getClass();
        RepostFeedEntrancePollingExp.RepostFeedEntrancePollingConfig repostFeedEntrancePollingConfig = (RepostFeedEntrancePollingExp.RepostFeedEntrancePollingConfig) RepostFeedEntrancePollingExp.LIZIZ.getValue();
        if (repostFeedEntrancePollingConfig == null || repostFeedEntrancePollingConfig.enable != 1 || C1360620lVk.LJFF) {
            return;
        }
        C1360620lVk.LJFF = true;
        C786410Ut5.LJLIIL(((Number) C1360620lVk.LJ.getValue()).longValue(), C1360620lVk.LIZLLL, C1360620lVk.LJI);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIJJ() {
        C1360680lVq.LIZ.getClass();
        Keva keva = C1360680lVq.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repost_feed_shown_");
        sbLIZ.append(C1360680lVq.LIZ());
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJJ() {
        C1583420rJ6.LIZ.getClass();
        C0P0T c0p0t = C1583420rJ6.LIZJ;
        if (c0p0t == null || !c0p0t.isShowing()) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LJJIII() {
        C1360680lVq.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LIZIZ(RepostFeedEntranceVM.e eVar) {
        if (eVar != null) {
            ((List) C1360620lVk.LIZJ.getValue()).remove(eVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final C1360650lVn LIZLLL(RepostFeedEntranceVM.e eVar) {
        List<RepostNewContentMeta> list;
        if (eVar != null) {
            C01GW c01gw = C1360620lVk.LIZJ;
            if (!((List) c01gw.getValue()).contains(eVar)) {
                ((List) c01gw.getValue()).add(eVar);
            }
        }
        if (!Intrinsics.LJFF(C1360620lVk.LIZ, C1360620lVk.LIZIZ)) {
            C1360620lVk.LIZ = C1360620lVk.LIZIZ;
            if (C298720BnK.LIZIZ()) {
                C1360650lVn c1360650lVn = C1360620lVk.LIZ;
                if (c1360650lVn != null) {
                    list = c1360650lVn.LIZJ;
                } else {
                    list = null;
                }
                C1360700lVs.LIZIZ(list);
            }
        }
        return C1360620lVk.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJFF(boolean z) {
        C1578000rAM.LJII = z;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIIIZ(int i) {
        C1583420rJ6.LIZ.getClass();
        C1583420rJ6.LJI = i;
        C1583420rJ6.LJ = C1583420rJ6.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIILJJIL(EnumC1360550lVd enumC1360550lVd) {
        C1360620lVk.LIZIZ(enumC1360550lVd);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final long LJIIZILJ(long j) {
        C1360680lVq.LIZ.getClass();
        long jLIZIZ = C1360680lVq.LIZIZ();
        long jCurrentTimeMillis = System.currentTimeMillis() - ((Number) C260630AJh.LIZ.getValue()).longValue();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (jLIZIZ > jCurrentTimeMillis2) {
            return jCurrentTimeMillis2;
        }
        if (jLIZIZ <= jCurrentTimeMillis) {
            return jCurrentTimeMillis;
        }
        return jLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LJIJ(Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (aid == null || a0.LJJJIL(aid)) {
            return false;
        }
        return Intrinsics.LJFF(aid, C1583340rIy.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIJI(List<String> list) {
        if (list != null) {
            C1360700lVs.LIZ.addAll(0, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIJJLI(List<RepostNewContentMeta> list) {
        C1360700lVs.LIZIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final View LJIL(Context context) {
        return new C1583360rJ0(context);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJJI(String str) {
        ArrayList<String> arrayList = C1586870rOf.LIZ;
        if (!arrayList.contains(str)) {
            ListProtector.add(arrayList, 0, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final long LJJII(boolean z) {
        if (z) {
            C1360680lVq.LIZ.getClass();
            return C1360680lVq.LIZIZ();
        }
        C1360680lVq.LIZ.getClass();
        Keva keva = C1360680lVq.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_request_time_");
        sbLIZ.append(C1360680lVq.LIZ());
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final Object LIZJ(final View view, final Fragment fragment) {
        return new C0SZ8(view, fragment) { // from class: X.0Nrw
            public final Fragment LL;
            public final View LLILLJJLI;
            public Aweme LLILLL;

            @Override // X.C0SZ8
            public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
            }

            @Override // X.C0SZ8
            public final void Ar(Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void B0(boolean z) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ BaseFeedPlayerView E() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void F0(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ ImageView F2() {
                return null;
            }

            @Override // X.C0SZ8
            public final void G() {
            }

            @Override // X.C0SZ8
            public final void K1(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
            }

            @Override // X.C0SZ8
            public final InterfaceC689860R4e K9() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void L0(int i, Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final void LJIIJ() {
            }

            @Override // X.C0SZ8
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJIJJ() {
                throw null;
            }

            @Override // X.C0SZ8, X.C0SZA
            public final InterfaceC739930T0t LJIJJLI() {
                return null;
            }

            @Override // X.C0SZ8
            public final void LJJIFFI(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIIJ() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C0SZ8 LJJIJIL(String str) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIL(C0R6M c0r6m) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIZ(C0RHA c0rha) {
            }

            @Override // X.C0SZ8
            public final void LJJJJJ(long j) {
            }

            @Override // X.C0SZ8
            public final void LJJJLIIL(int i, long j) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJJLZIJ(C1365850leB c1365850leB) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LJJLIIIJ() {
                return true;
            }

            @Override // X.C0SZ8
            public final void LJLIIIL(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJLLILLLL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJZI(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFF() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFZ(Object obj) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIIII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIIIJ(C0SYH c0syh) {
            }

            @Override // X.C0SZ8
            public final void LLIIL(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLIILZL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLIIZ() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLILII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLILLL(C1365860leC c1365860leC) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIZLLLIL() {
            }

            @Override // X.C0SZ8
            public final void LLJI(C697110RWb c697110RWb) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJ(int i, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJIJIIJIL(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJIJIL() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJIL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final void LLJL(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLIL(Long l) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLL() {
            }

            @Override // X.C0SZ8
            public final void LLJLLIL(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C0SZ8 LLJLLL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLF() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLFFI(int i, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final void LLLI(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLIIII() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLILZLLLI() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLLJIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLLIIIILLL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLIIL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLIILL(int i, String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLJ(int i, String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C584270Mvp LLLLLJIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLLLLIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLLLJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLLZL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLLLZLLIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZ() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLZLZ(Map map) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZZIL() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZ() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLZLI() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZLLLL(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLZZ(String str) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZZJLIL(View view2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLZZZIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void M(C0REZ c0rez) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void M0(C690190R5l c690190R5l) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean Nv() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View Qg(String str, boolean z) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Rl(C035D c035d) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Z(int i, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C583360MuM Z0() {
                return null;
            }

            @Override // X.C0SZ8
            public final void e1() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void ev() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void g1(int i) {
            }

            @Override // X.C0SZ8
            public final int getAwemeType() {
                return 331;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void h0(Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final void i0() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void k1(String str, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean l() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean l1() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void o(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean o1() {
                return false;
            }

            @Override // X.C0SZ8
            public final void onDestroyView() {
            }

            @Override // X.C0SZ8
            public final void onPageSelected(int i) {
            }

            @Override // X.C0SZ8
            public final void onPause() {
            }

            @Override // X.C0SZ8
            public final void onResume() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void onScrollEnd() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void p(int i) {
            }

            @Override // X.C0SZ8
            public final void q(String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View.OnTouchListener q5() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void q7(float f, int i, int i2, int i3) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void qi() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void s0() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void u1() {
            }

            @Override // X.C0SZ8
            public final void unBind() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void uq(C1365870leD c1365870leD) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
            }

            @Override // X.C0SZ8
            public final InterfaceC583650Mup x3() {
                return null;
            }

            @Override // X.C0SZ8, X.C0SZA
            public final Aweme LJIIIIZZ() {
                return getAweme();
            }

            @Override // X.C0SZ8
            public final Aweme hm() {
                return getAweme();
            }

            @Override // X.C0SZ8
            public final C0SKK LJLLLL() {
                return C0SKK.INITIALIZED;
            }

            @Override // X.C0SZ8
            public final Aweme getAweme() {
                return this.LLILLL;
            }

            @Override // X.C0SZ8
            public final void LJI(Aweme aweme) {
                this.LLILLL = aweme;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
            @Override // X.C0SZ8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIJIIJIL(int r4) {
                /*
                    r3 = this;
                    android.view.View r1 = r3.LLILLJJLI
                    boolean r0 = r1 instanceof X.C1583360rJ0
                    r2 = 0
                    if (r0 == 0) goto L21
                    if (r4 > 0) goto L5c
                    android.content.Context r1 = r1.getContext()
                    if (r1 == 0) goto L6a
                    r0 = 2131846343(0x7f1164c7, float:1.9326133E38)
                    java.lang.String r1 = r1.getString(r0)
                L16:
                    android.view.View r0 = r3.LLILLJJLI
                    X.0rJ0 r0 = (X.C1583360rJ0) r0
                    if (r1 != 0) goto L1e
                    java.lang.String r1 = ""
                L1e:
                    r0.setTitle(r1)
                L21:
                    androidx.fragment.app.Fragment r0 = r3.LL
                    X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r2)
                    java.lang.Class<com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility> r0 = com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility.class
                    X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r2)
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
                    if (r0 != 0) goto L32
                    r1 = r2
                L32:
                    com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility r1 = (com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility) r1
                    if (r1 == 0) goto L45
                    com.ss.android.ugc.aweme.detail.platform.DetailPageComponent r0 = r1.Dn1()
                    if (r0 == 0) goto L45
                    android.view.ViewGroup r1 = r0.LLLII
                    if (r1 == 0) goto L45
                    r0 = 8
                    X.C786410Ut5.LJLLLLLL(r0, r1)
                L45:
                    androidx.fragment.app.Fragment r0 = r3.LL
                    X.0Q7z r1 = X.C1578630rBN.LJ(r0)
                    if (r1 == 0) goto L5b
                    java.lang.Class<com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility> r0 = com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility.class
                    X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r2)
                    com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility r1 = (com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility) r1
                    if (r1 == 0) goto L5b
                    r0 = 1
                    r1.g82(r0)
                L5b:
                    return
                L5c:
                    android.content.Context r1 = r1.getContext()
                    if (r1 == 0) goto L6a
                    r0 = 2131846345(0x7f1164c9, float:1.9326137E38)
                    java.lang.String r1 = r1.getString(r0)
                    goto L16
                L6a:
                    r1 = r2
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C607340Nrw.LJJIJIIJIL(int):void");
            }

            @Override // X.C0SZ8
            public final void h(boolean z) {
                ILoadMoreAbility iLoadMoreAbility;
                DetailPageComponent detailPageComponentDn1;
                ViewGroup viewGroup;
                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IFeedFragmentAbility.class, null);
                if (!(interfaceC494301wDLIZ instanceof IDetailPageAbility)) {
                    interfaceC494301wDLIZ = null;
                }
                IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wDLIZ;
                if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null && (viewGroup = detailPageComponentDn1.LLLII) != null) {
                    C786410Ut5.LJLLLLLL(0, viewGroup);
                }
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LL);
                if (interfaceC665370Q7zLJ != null && (iLoadMoreAbility = (ILoadMoreAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, ILoadMoreAbility.class, null)) != null) {
                    iLoadMoreAbility.g82(false);
                }
            }

            {
                this.LL = fragment;
                this.LLILLJJLI = view;
            }

            @Override // X.C0SZ8
            public final void LJJJJ(int i, Aweme aweme) {
                LJI(aweme);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LJI(String str, String str2) {
        if (C298720BnK.LIZ() && !Intrinsics.LJFF(str, "repost_feed") && !Intrinsics.LJFF(str2, "friends_v3_repost_feeds_detail")) {
            C1360680lVq.LIZ.getClass();
            if (C1360680lVq.LIZLLL()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIIJ(View view, Fragment fragment) {
        C1583420rJ6.LIZ.getClass();
        C1583300rIu.LIZ.getClass();
        RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
        if (repostFeedConfigLIZ != null && repostFeedConfigLIZ.usePopupManager == 1) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
            if (c19egLIZIZ != null && C1583420rJ6.LIZ()) {
                LifecycleOwner lifecycleOwner = fragment;
                if (!IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor() || fragment == null) {
                    lifecycleOwner = c19egLIZIZ;
                }
                final C1578100rAW c1578100rAWLIZ = C1567050qsh.LIZ(lifecycleOwner, c19egLIZIZ);
                final AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(view, 456);
                SocialPopupManager.LIZ(new AbstractC20660815t0(c1578100rAWLIZ, awS585S0100000_6) { // from class: X.0Tek
                    public final Function1<C20656615sK, Unit> LL;

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return 2;
                    }

                    {
                        this.LL = awS585S0100000_6;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        C19EG c19egLIZIZ2;
                        IFeedSkylightCommonService iFeedSkylightCommonServiceLJ = C614770O9j.LIZIZ.LJ();
                        C688120Qyw c688120QywI2 = this.scene.i2();
                        if (c688120QywI2 != null) {
                            c19egLIZIZ2 = c688120QywI2.LIZIZ();
                        } else {
                            c19egLIZIZ2 = null;
                        }
                        if (!iFeedSkylightCommonServiceLJ.LJJIIJ(0, c19egLIZIZ2)) {
                            PopupManager.LJIIJ(C752030Tej.class, this.scene);
                            PopupManager.LJIIJ(C752020Tei.class, this.scene);
                        }
                        this.LL.invoke(c20656615sK);
                    }
                });
                return;
            }
            return;
        }
        HandlerHook.viewPostDelay(view, new ARunnableS106S0100000_6(view, 329), 2000L);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final boolean LJIILIIL(String str, String str2) {
        if (C298720BnK.LIZ() && !Intrinsics.LJFF(str, "repost_feed") && !Intrinsics.LJFF(str2, "friends_v3_repost_feeds_detail")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJIIJJI(Context context, String str, Map<String, String> map) {
        new Object() { // from class: X.0rIz
        }.getClass();
        if (context != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam("event_type", str);
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
            smartRouteBuildRoute.withParam("video_from", "from_repost_feed_entrance");
            smartRouteBuildRoute.withParam("enter_from", "repost_feed");
            smartRouteBuildRoute.withParam("extra_detail_title_text", context.getString(2131846347));
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    smartRouteBuildRoute.withParam(entry.getKey(), entry.getValue());
                }
            }
            smartRouteBuildRoute.open();
            C1583220rIm.LIZ = true;
            C1583220rIm.LIZLLL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.service.IRepostFeedService
    public final void LJJIFFI(Aweme aweme, int i, Fragment fragment) {
        StateOwner stateOwner;
        C19EG c19egLIZIZ;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        String strNk0;
        C19EG c19egLIZIZ2;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        InterfaceC1584710rLB interfaceC1584710rLBKx;
        View titleView;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL2;
        C1583420rJ6.LIZ.getClass();
        C1583300rIu.LIZ.getClass();
        if (C1583300rIu.LIZJ() && (c19egLIZIZ = (stateOwner = StateOwner.LL).LIZIZ()) != null && (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) != null && iBottomTabLayoutAbilityLJIIIZ.hv0()) {
            C19EG c19egLIZIZ3 = stateOwner.LIZIZ();
            if (c19egLIZIZ3 != null && (iFriendsTabLayoutAbilityLIZLLL2 = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ3, null))) != null) {
                strNk0 = iFriendsTabLayoutAbilityLIZLLL2.nk0();
            } else {
                strNk0 = null;
            }
            if (Intrinsics.LJFF(strNk0, "FRIENDS_FEED")) {
                if (aweme != null && C1583420rJ6.LJI <= 0 && !Intrinsics.LJFF(aweme.getAid(), C1589640rT8.LIZIZ.U1()) && C1595430rcT.LIZIZ.LIZIZ().redDotLogic().LJIJI("REPOST_FEED") > 0 && (c19egLIZIZ2 = stateOwner.LIZIZ()) != null && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ2, null))) != null && (interfaceC1584710rLBKx = iFriendsTabLayoutAbilityLIZLLL.Kx("REPOST_FEED")) != null && (titleView = interfaceC1584710rLBKx.getTitleView()) != null) {
                    C1587150rP7.LIZIZ.LJIIJ(titleView, fragment);
                }
                C1583420rJ6.LJFF = i;
                if (C1583420rJ6.LJFF == 0) {
                    C1583420rJ6.LJ = 0;
                } else {
                    if (C1583420rJ6.LJFF <= C1583420rJ6.LJ) {
                        return;
                    }
                    if (C1583420rJ6.LJI > 0) {
                        C1583420rJ6.LJI--;
                    }
                    C1583420rJ6.LJ = C1583420rJ6.LJFF;
                }
            }
        }
    }
}
