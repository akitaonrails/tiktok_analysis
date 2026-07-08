package com.ss.android.ugc.aweme.detail.ui;

import X.AbstractC1387200mCc;
import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C01MY;
import X.C0PEM;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1588970rS3;
import X.C1591020rVM;
import X.C1595180rc4;
import X.C1602160rnK;
import X.C1620930sHb;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C23250099c;
import X.C315201Kc;
import X.C315401Ke;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C486860J7k;
import X.C587460N2i;
import X.C607610NsN;
import X.C607700NsW;
import X.C607730NsZ;
import X.C612580O0y;
import X.C614770O9j;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1711206n0;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightAssemViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS126S0101000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowInnerFeedComponent extends DetailPageComponent {
    public final C736950SvV LLLJIL;
    public long LLLJL;
    public String LLLL;
    public boolean LLLLII;
    public long LLLLIIIILLL;
    public View LLLLIIL;
    public View LLLLIILL;
    public int LLLLIILLL;
    public int LLLLIL;
    public volatile boolean LLLLILI;
    public final C736950SvV LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final FollowInnerFeedVM Ep() {
        return (FollowInnerFeedVM) this.LLLJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        WeakReference weakReferenceBp;
        Aweme awemeLLLLLJLJLL;
        long j = this.LLLLIIIILLL;
        if (j <= 0 || System.currentTimeMillis() - j >= 100) {
            this.LLLLIIIILLL = System.currentTimeMillis();
            super.onDestroy();
            C1588970rS3 c1588970rS3 = (C1588970rS3) this.LLLLJI.getValue();
            C23250099c.LIZLLL((InterfaceC497601wk) c1588970rS3.LIZ.getValue(), null, null, new C01MY(c1588970rS3, new AwS603S0100000_24(this, 42), null), 3);
            String str = ((C612580O0y) Ep().getState()).LL;
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            String aid = (detailFragmentPanel == null || (awemeLLLLLJLJLL = detailFragmentPanel.LLLLLJLJLL()) == null) ? null : awemeLLLLLJLJLL.getAid();
            if (this.LLLJL > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLJL;
                C607610NsN c607610NsN = C607610NsN.LIZ;
                String str2 = this.LLLL;
                if (str2 == null) {
                    str2 = "return";
                }
                int size = ((CopyOnWriteArraySet) Ep().LLIZ.getValue()).size();
                int size2 = ((CopyOnWriteArraySet) Ep().LLILZLL.getValue()).size();
                if (str == null) {
                    str = "";
                }
                String str3 = aid != null ? aid : "";
                c607610NsN.getClass();
                C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C315201Kc(str2, str3, size, size2, jCurrentTimeMillis, str, null), 3);
                if ((!FollowingSkylightAbilityOptConfig.LIZ() || jCurrentTimeMillis > ((Number) FollowingSkylightAbilityOptConfig.LJI.getValue()).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) && (weakReferenceBp = Bp()) != null && weakReferenceBp.get() != null) {
                    C614770O9j.LIZIZ.LJ().LJIILJJIL(getFragment(), C587460N2i.LIZ(C724240Sb0.LIZ(this), "Following") ? "publish_landing" : "auto", new C1595180rc4("homepage_folllow_refresh", "click_top_icon", true), null);
                }
            }
            FollowInnerFeedVM followInnerFeedVMEp = Ep();
            C23250099c.LIZLLL(followInnerFeedVMEp.getAssemVMScope(), C0PEM.LIZJ, null, new C607700NsW(followInnerFeedVMEp, null), 2);
            this.LLLL = null;
            this.LLLJL = 0L;
        }
    }

    public FollowInnerFeedComponent() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(101);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowInnerFeedVM.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(60);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24((AbstractC738140SxQ) this, 268);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLLJIL = new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_24, c451610HnL, c723700Sa8);
        this.LLLLILI = true;
        AFwS213S0000000_24 aFwS213S0000000_242 = AFwS213S0000000_24.get$arr$(100);
        this.LLLLJ = new C736950SvV(C13LE.LIZ(FollowingInnerSkylightAssemViewModel.class), aFwS213S0000000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(61), new AwS568S0100000_24((AbstractC738140SxQ) this, 269), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(99));
        this.LLLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 267));
    }

    public static WeakReference Bp() {
        C19EG c19egLIZIZ;
        Fragment fragmentKi;
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (fragmentKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("Following")) != null) {
                    return new WeakReference(fragmentKi);
                }
            } else {
                i++;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void LJIJ() {
        super.LJIJ();
        Fp(this.LLLLIILLL, this.LLLLIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        VerticalViewPager verticalViewPager;
        super.onStart();
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null && (verticalViewPager = detailFragmentPanel.LLJJIJI) != null) {
            verticalViewPager.LIZJ((C1620930sHb) this.LLLLL.getValue());
        }
        this.LLLJL = System.currentTimeMillis();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        VerticalViewPager verticalViewPager;
        super.onStop();
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || (verticalViewPager = detailFragmentPanel.LLJJIJI) == null) {
            return;
        }
        verticalViewPager.LIZLLL((C1620930sHb) this.LLLLL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final boolean Eb2(AwS568S0100000_24 awS568S0100000_24) {
        this.LLLL = "slide";
        return super.Eb2(awS568S0100000_24);
    }

    public final void Gp(boolean z) {
        int i;
        VerticalViewPager verticalViewPager;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null && (verticalViewPager = detailFragmentPanel.LLJJIJI) != null) {
            int visibility = verticalViewPager.getVisibility();
            verticalViewPager.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, verticalViewPager);
        }
        View view = this.LLLLIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iIntValue2;
        String str;
        String uid;
        Integer followSkylightTotalCount;
        Integer followSkylightIndex;
        super.onViewCreated(view);
        if (!Ep().LLIZLLLIL) {
            final FollowInnerFeedVM followInnerFeedVMEp = Ep();
            Context context = view.getContext();
            followInnerFeedVMEp.LLIZLLLIL = true;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            c20603715jn.LJIIJ = true;
            c20603715jn.LIZ = 1;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            followInnerFeedVMEp.setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(followInnerFeedVMEp) { // from class: X.0Oh6
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.ifc));
        this.LLLLIIL = view.findViewById(R.id.ujn);
        this.LLLLIILL = view.findViewById(R.id.trk);
        C723850SaN.LIZLLL(this, new AwS126S0101000_18(this, 5));
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0raf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612580O0y) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 22), 4);
        C2189821An6 c2189821An6 = this.LLJJL;
        String uid2 = c2189821An6.getUid();
        DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
        if (navArgModel != null && (followSkylightIndex = navArgModel.getFollowSkylightIndex()) != null) {
            iIntValue = followSkylightIndex.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLLLIILLL = iIntValue;
        DetailNavArgModel navArgModel2 = c2189821An6.getNavArgModel();
        if (navArgModel2 != null && (followSkylightTotalCount = navArgModel2.getFollowSkylightTotalCount()) != null) {
            iIntValue2 = followSkylightTotalCount.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLLLIL = iIntValue2;
        FollowInnerFeedVM followInnerFeedVMEp2 = Ep();
        if (uid2 == null) {
            str = "";
        } else {
            str = uid2;
        }
        followInnerFeedVMEp2.getClass();
        followInnerFeedVMEp2.withState(new AwS123S1100000_9(followInnerFeedVMEp2, str, 13));
        FollowingInnerSkylightAssemViewModel followingInnerSkylightAssemViewModel = (FollowingInnerSkylightAssemViewModel) this.LLLLJ.getValue();
        if (uid2 != null) {
            int i = -1;
            int i2 = 0;
            for (Object obj : (ArrayList) followingInnerSkylightAssemViewModel.LL) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof SkylightFollowingUserItem) {
                        SkylightFollowingUserItem skylightFollowingUserItem = (SkylightFollowingUserItem) interfaceC1891350zJl;
                        User user = skylightFollowingUserItem.followingUser;
                        if (user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        if (Intrinsics.LJFF(uid, uid2)) {
                            SkylightFollowingUserRedDot skylightFollowingUserRedDot = skylightFollowingUserItem.redDot;
                            if (skylightFollowingUserRedDot != null) {
                                skylightFollowingUserRedDot.setStatus(0);
                            }
                            skylightFollowingUserItem.LL = true;
                            i = i2;
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            followingInnerSkylightAssemViewModel.LLILLJJLI = i;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C486860J7k.LIZIZ(c19egLIZ).LQ2(new C1591020rVM() { // from class: X.0rZk
                @Override // X.C1591020rVM, X.InterfaceC1210210hb9
                public final boolean LJJIL(float f, float f2, int i4) {
                    return this.LIZIZ.LLLLILI;
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0rad
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                C612580O0y c612580O0y = (C612580O0y) obj2;
                c612580O0y.getClass();
                return C627260Oiy.LIZLLL(c612580O0y);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 23), 4);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0rae
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                C612580O0y c612580O0y = (C612580O0y) obj2;
                c612580O0y.getClass();
                return C627260Oiy.LIZJ(c612580O0y);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 24), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Fp(int i, int i2) {
        C607730NsZ c607730NsZ;
        Aweme aweme;
        String aid;
        if (this.LLLLII) {
            return;
        }
        C612580O0y c612580O0y = (C612580O0y) Ep().getState();
        String str = c612580O0y.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        List<C607730NsZ> list = c612580O0y.getListState().LLILZ;
        if (list != null && (c607730NsZ = (C607730NsZ) C13LP.LJJJLL(list)) != null && (aweme = c607730NsZ.LLILLJJLI) != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        C607610NsN c607610NsN = C607610NsN.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - Ep().LLJ;
        c607610NsN.getClass();
        C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C315401Ke(str, jCurrentTimeMillis, str2, i2, i, null), 3);
        this.LLLLII = true;
    }
}
