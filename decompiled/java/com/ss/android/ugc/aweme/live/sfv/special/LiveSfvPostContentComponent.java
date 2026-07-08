package com.ss.android.ugc.aweme.live.sfv.special;

import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0RD6;
import X.C0RDX;
import X.C1056680dbW;
import X.C1227904rF;
import X.C1285820jZ6;
import X.C1287390jbd;
import X.C1287400jbe;
import X.C1338140kvU;
import X.C13LP;
import X.C14LC;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1697810uHb;
import X.C1838900xxA;
import X.C1838930xxD;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C1A5L;
import X.C20441214yg;
import X.C20571815ee;
import X.C20571915ef;
import X.C20572015eg;
import X.C20572115eh;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C279320Ax8;
import X.C292401Bi;
import X.C418440Gaw;
import X.C419930GdL;
import X.C421460Gfo;
import X.C452501pT;
import X.C474500IjA;
import X.C487280J9a;
import X.C688970R0t;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1287420jbg;
import X.InterfaceC21676019sM;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.LiveFragmentDetail;
import wh6.AbS516S0200000_31;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSfvPostContentComponent extends BaseCellContentComponent<LiveSfvPostContentComponent> implements LiveSfvPostAdaptionProtocol {
    public C1838900xxA LLJZIJLIL;
    public long LLLF;
    public boolean LLLFFI;
    public float LLLI;
    public float LLLII;
    public boolean LLLIIII;
    public LiveSfvPostCardData LLLIIL;
    public final C01GW LLJJJJLIIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 779));
    public final C01GW LLJJL = C292401Bi.LIZ(new AwS575S0100000_31(this, 777));
    public final C01GW LLJJLIIIJLLLLLLLZ = C292401Bi.LIZ(new AwS575S0100000_31(this, 776));
    public final C01GW LLJL = C292401Bi.LIZ(new AwS575S0100000_31(this, 773));
    public final C01GW LLJLIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 770));
    public final C01GW LLJLILLLLZIIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 769));
    public final C01GW LLJLL = C292401Bi.LIZ(new AwS575S0100000_31(this, 771));
    public final C01GW LLJLLIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 772));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 774));
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS575S0100000_31(this, 778));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(217));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 775));
    public final C01GW LLLFZ = C292401Bi.LIZ(AFwS221S0000000_31.get$arr$(218));
    public final C20572115eh LLLIIIIL = new InterfaceC21676019sM() { // from class: X.15eh
        @Override // X.InterfaceC21676019sM
        public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // X.InterfaceC21676019sM
        public final void LJIIZILJ(boolean z) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        
            if (r1 != 3) goto L10;
         */
        @Override // X.InterfaceC21676019sM
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
            /*
                r6 = this;
                int r1 = r8.getActionMasked()
                r2 = 0
                if (r1 == 0) goto L58
                r3 = 1
                if (r1 == r3) goto L53
                r0 = 2
                if (r1 == r0) goto L11
                r0 = 3
                if (r1 == r0) goto L53
            L10:
                return r2
            L11:
                float r5 = r8.getX()
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r0 = r6.LL
                float r0 = r0.LLLI
                float r5 = r5 - r0
                float r4 = r8.getY()
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r1 = r6.LL
                float r0 = r1.LLLII
                float r4 = r4 - r0
                boolean r0 = r1.LLLIIII
                if (r0 != 0) goto L10
                float r1 = java.lang.Math.abs(r5)
                android.content.Context r0 = r7.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                float r0 = (float) r0
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 <= 0) goto L10
                float r1 = java.lang.Math.abs(r5)
                float r0 = java.lang.Math.abs(r4)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 <= 0) goto L10
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r0 = r6.LL
                r0.LLLIIII = r3
                X.0xxA r0 = r0.LLJZIJLIL
                if (r0 == 0) goto L10
                r0.LLJI = r2
                return r2
            L53:
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r0 = r6.LL
                r0.LLLIIII = r2
                return r2
            L58:
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r1 = r6.LL
                float r0 = r8.getX()
                r1.LLLI = r0
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r1 = r6.LL
                float r0 = r8.getY()
                r1.LLLII = r0
                com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent r0 = r6.LL
                r0.LLLIIII = r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C20572115eh.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
        }
    };
    public final C20572015eg LLLIIIL = new InterfaceC487330J9f() { // from class: X.15eg
        @Override // X.InterfaceC487330J9f
        public final void onConfigurationChanged(Activity activity, Configuration configuration) {
            int i = C2187451AjH.LIZ;
            C1056680dbW c1056680dbW = C1056680dbW.LIZ;
            c1056680dbW.getClass();
            C1056680dbW.LJIILLIIL = -1;
            IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LL.LLLFF.getValue();
            if (iScreenComponentAbility != null) {
                LiveSfvPostContentComponent liveSfvPostContentComponent = this.LL;
                View view = (View) liveSfvPostContentComponent.LLJL.getValue();
                C421460Gfo c421460GfoOp = liveSfvPostContentComponent.op();
                C421460Gfo c421460GfoMp = liveSfvPostContentComponent.mp();
                View view2 = (View) liveSfvPostContentComponent.LLJJLIIIJLLLLLLLZ.getValue();
                View view3 = (View) liveSfvPostContentComponent.LLJLL.getValue();
                C197039127h c197039127hHp = liveSfvPostContentComponent.hp();
                c1056680dbW.getClass();
                C1056680dbW.LIZ(iScreenComponentAbility, view, c421460GfoOp, c421460GfoMp, view2, view3, c197039127hHp);
            }
            if (C19228210Ki.LIZJ()) {
                ViewGroup.LayoutParams layoutParams = this.LL.LJJIJL().getLayoutParams();
                layoutParams.height = C19228210Ki.LIZIZ(this.LL.getContext());
                C786410Ut5.W5(this.LL.LJJIJL(), layoutParams);
            } else {
                C786410Ut5.W5(this.LL.LJJIJL(), this.LL.LJJIJL().getLayoutParams());
            }
            C1838900xxA c1838900xxA = this.LL.LLJZIJLIL;
            if (c1838900xxA != null) {
                c1838900xxA.notifyDataSetChanged();
            }
        }
    };

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLLFFI = false;
        int i = kp().LLILZ;
        if (i < 0) {
            i = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLLF;
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        long jLLLFZ = c1838900xxA != null ? c1838900xxA.LLLFZ() : 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected - itemPosition: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", C2188811AlT.LIZIZ(sbLIZ));
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = lp().findViewHolderForAdapterPosition(i);
        C1838930xxD c1838930xxD = viewHolderFindViewHolderForAdapterPosition instanceof C1838930xxD ? (C1838930xxD) viewHolderFindViewHolderForAdapterPosition : null;
        LiveFragmentDetail liveFragmentDetail = (LiveFragmentDetail) C13LP.LJJJLZIJ(i, ip().getFragments());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_special_shaped_card_show");
        c474500IjALIZ.LJJII(122, "card_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII(ip().getSubTitleStaringKey(), "card_info");
        c474500IjALIZ.LJJII(0, "is_video_play");
        c474500IjALIZ.LJJII(1, "is_uninsertion_card");
        c474500IjALIZ.LJJII((c1838930xxD == null || !c1838930xxD.LLJIJIL) ? "manual_switch" : "auto_switch", "show_type");
        c474500IjALIZ.LJJII(Long.valueOf(jLLLFZ), "video_duration");
        c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "card_duration");
        c474500IjALIZ.LJJII("homepage_hot", "enter_from");
        c474500IjALIZ.LJJII(String.valueOf(liveFragmentDetail != null ? Long.valueOf(liveFragmentDetail.fragmentId) : null), "fragment_id");
        c474500IjALIZ.LJJII(String.valueOf(liveFragmentDetail != null ? Integer.valueOf(liveFragmentDetail.fragmentTypeNew) : null), "fragment_type");
        C1838900xxA c1838900xxA2 = this.LLJZIJLIL;
        c474500IjALIZ.LJJII(Integer.valueOf((c1838900xxA2 != null ? c1838900xxA2.LLILZ : 0) + 1), "video_pos");
        c474500IjALIZ.LIZ();
        C1838900xxA c1838900xxA3 = this.LLJZIJLIL;
        if (c1838900xxA3 != null) {
            c1838900xxA3.LLLI(false);
        }
        sp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLLIIL = null;
        LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManagerKp = kp();
        RecyclerView recyclerView = liveSfvSwipeGalleryLayoutManagerKp.LLJJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(null);
            recyclerView.removeOnScrollListener(liveSfvSwipeGalleryLayoutManagerKp.LLIZLLLIL);
            try {
                liveSfvSwipeGalleryLayoutManagerKp.LLIZ.LIZIZ(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("attach ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        liveSfvSwipeGalleryLayoutManagerKp.LJIJJLI();
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", "unBind");
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.onDestroy();
        }
        this.LLJZIJLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostAdaptionProtocol
    public final void LJJIJLIJ() {
        C1578630rBN.LJIIJJI(this, new C20571915ef(this, null));
    }

    @Override // com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostAdaptionProtocol
    public final void LJLLILLLL() {
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", "onPanelHandlePageResume");
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.LLLII(true);
        }
        sp();
        tp();
        this.LLLF = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", "onHolderUnbind");
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", "onHostDestroy");
        C487280J9a.LIZJ(this.LLLIIIL);
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), LiveSfvPostAdaptionProtocol.class, this);
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", "onHostPause");
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.LLLI(true);
        }
        sp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        if (this.LLLFFI) {
            C1838900xxA c1838900xxA = this.LLJZIJLIL;
            if (c1838900xxA != null) {
                c1838900xxA.LLLII(true);
            }
            tp();
        }
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", "onHostResume");
    }

    public final C1287400jbe ep() {
        return (C1287400jbe) this.LLJLIL.getValue();
    }

    public final C197039127h hp() {
        return (C197039127h) this.LLJLLIL.getValue();
    }

    public final LiveSfvPostCardData ip() {
        Object c098200Yq;
        String cardInsertStatus;
        try {
            c098200Yq = this.LLLIIL;
            if (c098200Yq == null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                CardInsertInfo cardInsertInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getCardInsertInfo();
                if (cardInsertInfo == null || (cardInsertStatus = cardInsertInfo.getCardInsertStatus()) == null) {
                    cardInsertStatus = "";
                }
                C1227904rF.LIZ.getClass();
                Object objLIZIZ = C1227904rF.LIZIZ(cardInsertStatus, LiveSfvPostCardData.class);
                this.LLLIIL = (LiveSfvPostCardData) objLIZIZ;
                c098200Yq = (LiveSfvPostCardData) objLIZIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new LiveSfvPostCardData(null, null, null, new ArrayList());
        }
        return (LiveSfvPostCardData) c098200Yq;
    }

    public final LiveSfvSwipeGalleryLayoutManager kp() {
        return (LiveSfvSwipeGalleryLayoutManager) this.LLL.getValue();
    }

    public final RecyclerView lp() {
        return (RecyclerView) this.LLJLLL.getValue();
    }

    public final C421460Gfo mp() {
        return (C421460Gfo) this.LLJJL.getValue();
    }

    public final C421460Gfo op() {
        return (C421460Gfo) this.LLJJJJLIIL.getValue();
    }

    public final void sp() {
        if (((Number) C279320Ax8.LIZ.getValue()).intValue() == 1) {
            C786410Ut5.LLLZIIL(ep(), 8);
        }
    }

    public final void tp() {
        if (((Number) C279320Ax8.LIZ.getValue()).intValue() == 1) {
            C786410Ut5.LLLZIIL(ep(), 0);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), LiveSfvPostAdaptionProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.LLLI(true);
        }
        sp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.LLLII(true);
        }
        tp();
        this.LLLF = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_page_pause", new AwS610S0100000_31(this, 211));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C2271391DvN.LIZ((View) this.LLJLL.getValue(), (C1A5L) C2271381DvM.W0.getValue());
        C2271391DvN.LIZ(hp(), (C1A5L) C2271381DvM.V0.getValue());
        C2271391DvN.LIZ(lp(), (C1A5L) C2271381DvM.X0.getValue());
        C786410Ut5.I7(new AbS710S0100000_31(this, 9), (View) this.LLJLL.getValue());
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this.LLLIIIL);
        }
        lp().setLayoutDirection(3);
        boolean z = true;
        if (((Number) C279320Ax8.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, (View) this.LLJLILLLLZIIL.getValue());
            C1287400jbe c1287400jbeEp = ep();
            if (c1287400jbeEp != null) {
                c1287400jbeEp.LIZ(EnumC1287420jbg.SpinDiffuse, null);
                c1287400jbeEp.LIZJ();
            }
        } else {
            C786410Ut5.LLLZIIL(ep(), 8);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJLILLLLZIIL.getValue());
        }
        hp().LJJJJL(new AwS585S0100000_6(this, 123));
        op().setSavedDefaultTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        op().setWorkAroundTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))));
        mp().setSavedDefaultTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
        mp().setWorkAroundTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f))));
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLFF.getValue();
        if (iScreenComponentAbility == null || iScreenComponentAbility.LLJILLL() <= 0) {
            View view2 = (View) this.LLJZ.getValue();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.W5(view2, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (this.LLJZIJLIL == null) {
            op().setText(ip().getTitle());
            mp().setText(ip().getSubTitle());
            IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLFF.getValue();
            if (iScreenComponentAbility != null) {
                C1056680dbW c1056680dbW = C1056680dbW.LIZ;
                View view = (View) this.LLJL.getValue();
                C421460Gfo c421460GfoOp = op();
                C421460Gfo c421460GfoMp = mp();
                View view2 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
                View view3 = (View) this.LLJLL.getValue();
                C197039127h c197039127hHp = hp();
                c1056680dbW.getClass();
                C1056680dbW.LIZ(iScreenComponentAbility, view, c421460GfoOp, c421460GfoMp, view2, view3, c197039127hHp);
            }
            LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManagerKp = kp();
            RecyclerView recyclerViewLp = lp();
            if (recyclerViewLp != null) {
                liveSfvSwipeGalleryLayoutManagerKp.LLJJ = recyclerViewLp;
                liveSfvSwipeGalleryLayoutManagerKp.LLILLL = Math.max(0, 0);
                recyclerViewLp.setLayoutManager(liveSfvSwipeGalleryLayoutManagerKp);
                try {
                    liveSfvSwipeGalleryLayoutManagerKp.LLIZ.LIZIZ(recyclerViewLp);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                recyclerViewLp.addOnScrollListener(liveSfvSwipeGalleryLayoutManagerKp.LLIZLLLIL);
                this.LLLF = 0L;
                this.LLLIIII = false;
                kp().LLJILJILJ = new C419930GdL();
                C1838900xxA c1838900xxA = new C1838900xxA(lp(), new AwS610S0100000_31(this, 311));
                c1838900xxA.setData(ip().getFragments());
                c1838900xxA.setShowFooter(false);
                lp().setAdapter(c1838900xxA);
                this.LLJZIJLIL = c1838900xxA;
                lp().setEdgeEffectFactory(new C688970R0t() { // from class: X.19d3
                    @Override // X.C688970R0t
                    public final EdgeEffect LIZ(final RecyclerView recyclerView, final int i) {
                        return new EdgeEffect(recyclerView.getContext()) { // from class: X.19d0
                            @Override // android.widget.EdgeEffect
                            public final void onRelease() {
                                super.onRelease();
                                RecyclerView recyclerView2 = recyclerView;
                                int childCount = recyclerView2.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i2));
                                    if (childViewHolder == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostRecyclerViewHolder");
                                    }
                                    ((C1838930xxD) childViewHolder).LLJILJIL.LJIIIZ();
                                }
                            }

                            public final void LIZ(float f) {
                                int i2;
                                if (i == 2) {
                                    i2 = -1;
                                } else {
                                    i2 = 1;
                                }
                                float height = i2 * recyclerView.getHeight() * f * 0.2f;
                                RecyclerView recyclerView2 = recyclerView;
                                int childCount = recyclerView2.getChildCount();
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i3));
                                    if (childViewHolder != null) {
                                        C1838930xxD c1838930xxD = (C1838930xxD) childViewHolder;
                                        c1838930xxD.LLJILJIL.LIZLLL();
                                        View view4 = c1838930xxD.itemView;
                                        C786410Ut5.Jc(view4, view4.getTranslationX() + height);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostRecyclerViewHolder");
                                    }
                                }
                            }

                            @Override // android.widget.EdgeEffect
                            public final void onAbsorb(int i2) {
                                int i3;
                                super.onAbsorb(i2);
                                if (i == 2) {
                                    i3 = -1;
                                } else {
                                    i3 = 1;
                                }
                                float f = i3 * i2 * 0.5f;
                                RecyclerView recyclerView2 = recyclerView;
                                int childCount = recyclerView2.getChildCount();
                                for (int i4 = 0; i4 < childCount; i4++) {
                                    RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i4));
                                    if (childViewHolder != null) {
                                        C21616519il c21616519il = ((C1838930xxD) childViewHolder).LLJILJIL;
                                        c21616519il.LIZ = f;
                                        c21616519il.LJIIIZ();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostRecyclerViewHolder");
                                    }
                                }
                            }

                            @Override // android.widget.EdgeEffect
                            public final void onPull(float f) {
                                super.onPull(f);
                                LIZ(f);
                            }

                            @Override // android.widget.EdgeEffect
                            public final void onPull(float f, float f2) {
                                super.onPull(f, f2);
                                LIZ(f);
                            }
                        };
                    }
                });
                lp().removeOnItemTouchListener(this.LLLIIIIL);
                lp().addOnItemTouchListener(this.LLLIIIIL);
                kp().LLJILLL = new C20571815ee(this);
                C786410Ut5.I7(new AbS516S0200000_31(videoItemParams2, this, 6), hp());
                return;
            }
            liveSfvSwipeGalleryLayoutManagerKp.getClass();
            "The attach RecycleView must not null!!".toString();
            throw new IllegalArgumentException("The attach RecycleView must not null!!");
        }
    }

    public final void up(LiveFragmentDetail liveFragmentDetail) {
        boolean z;
        List<T> list;
        List<String> listLJLJJLL = liveFragmentDetail.coverThemeColor;
        if (listLJLJJLL != null && !listLJLJJLL.isEmpty()) {
            C1838900xxA c1838900xxA = this.LLJZIJLIL;
            Object obj = null;
            if (c1838900xxA != null && (list = c1838900xxA.mmItems) != 0) {
                obj = ListProtector.get(list, c1838900xxA.LLILZ);
            }
            if (Intrinsics.LJFF(liveFragmentDetail, obj)) {
                if (LiveHighlightSpecialCardConfig.LIZ().reverseColor) {
                    listLJLJJLL = C13LP.LJLJJLL(listLJLJJLL);
                }
                try {
                    if (((Number) C279320Ax8.LIZ.getValue()).intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && listLJLJJLL.size() >= 2) {
                        C1287400jbe c1287400jbeEp = ep();
                        ep().setUniforms(new C1287390jbd(1.2f, 0.0f, LiveHighlightSpecialCardConfig.LIZ().lightness, (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f)), (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(1.0f), Float.valueOf(LiveHighlightSpecialCardConfig.LIZ().scaleY)), -16777216, Color.parseColor(listLJLJJLL.get(1)), -16777216, -16777216, -16777216, 1.0f, 0.0f));
                        C786410Ut5.LLLZIIL(ep(), 0);
                        c1287400jbeEp.requestRender();
                        return;
                    }
                    if (listLJLJJLL.size() >= 4) {
                        C786410Ut5.LJLLLLLL(0, (View) this.LLJLILLLLZIIL.getValue());
                        List<C1285820jZ6> listLJIIJJI = C1697810uHb.LJIIJJI(new C1285820jZ6(Color.parseColor(listLJLJJLL.get(0)), 1.0d), new C1285820jZ6(Color.parseColor(listLJLJJLL.get(1)), 0.865385d), new C1285820jZ6(Color.parseColor(listLJLJJLL.get(2)), 0.408654d), new C1285820jZ6(Color.parseColor(listLJLJJLL.get(3)), 0.182692d), new C1285820jZ6(-16777216, 0.0d));
                        C1338140kvU c1338140kvU = new C1338140kvU();
                        c1338140kvU.LIZ = listLJIIJJI;
                        ((View) this.LLJLILLLLZIIL.getValue()).setBackground(c1338140kvU.LIZ());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateMainBackground - e: ");
                    sbLIZ.append(e);
                    C20441214yg.LJ("LiveSfvPostContentComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Long lValueOf;
        Integer numValueOf;
        C1838900xxA c1838900xxA = this.LLJZIJLIL;
        if (c1838900xxA != null) {
            c1838900xxA.LLLII(false);
        }
        tp();
        this.LLLF = SystemClock.elapsedRealtime();
        int i2 = kp().LLILZ;
        if (i2 < 0) {
            i2 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected - itemPosition: ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("LiveSfvPostContentComponent", C2188811AlT.LIZIZ(sbLIZ));
        LiveFragmentDetail liveFragmentDetail = (LiveFragmentDetail) C13LP.LJJJLZIJ(i2, ip().getFragments());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_special_shaped_card");
        c474500IjALIZ.LJJII(122, "card_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII(ip().getSubTitleStaringKey(), "card_info");
        c474500IjALIZ.LJJII(0, "is_video_play");
        c474500IjALIZ.LJJII(1, "is_uninsertion_card");
        c474500IjALIZ.LJJII("homepage_hot", "enter_from");
        C1838930xxD c1838930xxD = null;
        if (liveFragmentDetail != null) {
            lValueOf = Long.valueOf(liveFragmentDetail.fragmentId);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "fragment_id");
        if (liveFragmentDetail != null) {
            numValueOf = Integer.valueOf(liveFragmentDetail.fragmentTypeNew);
        } else {
            numValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(numValueOf), "fragment_type");
        c474500IjALIZ.LIZ();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = lp().findViewHolderForAdapterPosition(i2);
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1838930xxD) && (c1838930xxD = (C1838930xxD) viewHolderFindViewHolderForAdapterPosition) != null) {
            c1838930xxD.LLJIJIL = true;
            C1838900xxA c1838900xxA2 = this.LLJZIJLIL;
            if (c1838900xxA2 != null) {
                c1838900xxA2.LLLIIIIL(i2, c1838930xxD);
            }
        } else {
            C1838900xxA c1838900xxA3 = this.LLJZIJLIL;
            if (c1838900xxA3 != null) {
                c1838900xxA3.LLLIIIIL(i2, c1838930xxD);
            }
        }
        this.LLLFFI = true;
    }
}
