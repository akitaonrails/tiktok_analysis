package com.ss.android.ugc.aweme.detail.panel;

import X.AbstractC1255880imo;
import X.C01GW;
import X.C0AWL;
import X.C0AWO;
import X.C0AWZ;
import X.C0HTT;
import X.C0R9L;
import X.C0RMB;
import X.C0S1K;
import X.C0SR4;
import X.C0SZ8;
import X.C0SZG;
import X.C1008770cMF;
import X.C1189504l3;
import X.C11JF;
import X.C128Y;
import X.C1336205Ku;
import X.C13LP;
import X.C13LQ;
import X.C1558520qew;
import X.C1600700rky;
import X.C1600750rl3;
import X.C1602160rnK;
import X.C1605650rsx;
import X.C1606370ru7;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C1787206zG;
import X.C1843500y4a;
import X.C2113808Pw;
import X.C21593719f5;
import X.C2188811AlT;
import X.C2189821An6;
import X.C281310B0v;
import X.C337180DJs;
import X.C418440Gaw;
import X.C420470GeD;
import X.C452501pT;
import X.C711450RvT;
import X.C712460Rx6;
import X.C714460S0u;
import X.C729510SjV;
import X.C730000SkI;
import X.C735840Sti;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1615506Uf;
import X.EnumC1985807qC;
import X.EnumC713160RyE;
import X.InterfaceC1209750haP;
import X.InterfaceC214902198i;
import X.InterfaceC665370Q7z;
import X.InterfaceC729990SkH;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class StoryMixedFeedDetailPanel extends StoryDetailFragmentPanel implements StoryDetailAbility {
    public static final /* synthetic */ int S0 = 0;
    public final C2189821An6 A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public boolean F0;
    public View G0;
    public View H0;
    public TuxTextView I0;
    public View J0;
    public TuxTextView K0;
    public InterfaceC1209750haP L0;
    public Bundle M0;
    public C11JF N0;
    public C420470GeD O0;
    public final C01GW P0;
    public final C01GW Q0;
    public long R0;

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final void Xt2() {
        this.B0 = false;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean p0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final void yI1() {
        this.E0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0haU] */
    public final InterfaceC1209750haP I0() {
        if (!C0S1K.LIZIZ.LIZ(LLLLLJLJLL(), EnumC713160RyE.DETAIL, null)) {
            return null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", this.LLLLIIIILLL.getEventType(), bundle);
        C786410Ut5.LJJJI("enter_position", C1609930rzr.LJIL(this.LLLLIIIILLL), bundle);
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        C786410Ut5.LJJJI("group_id", awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null, bundle);
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        C786410Ut5.LJJJI("author_id", awemeLLLLLJLJLL2 != null ? AwemeExtKt.getAuthorUid(awemeLLLLLJLJLL2) : null, bundle);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        Aweme awemeLLLLLJLJLL3 = LLLLLJLJLL();
        User author = awemeLLLLLJLJLL3 != null ? awemeLLLLLJLJLL3.getAuthor() : null;
        c735840Sti.getClass();
        C786410Ut5.LJJJI("follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author)), bundle);
        bundle.putBoolean("is_story_immersive_feed", M0());
        this.M0 = bundle;
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        Fragment fragment = getFragment();
        return imChatService.LJIJJ(fragment != null ? fragment.getView() : null, getChildFragmentManager(), bundle, LLLLLJLJLL(), new C0SZG() { // from class: X.0haU
            @Override // X.C0SZG
            public final void LIZ() {
            }

            @Override // X.C0SZG
            public final void LIZIZ(View view, CharSequence charSequence) {
                C1336205Ku.LIZ(false).getQuickDmService().onQuickReplyEmojiSendAnimations(view, charSequence.toString(), null, new AwS556S0100000_12(this.LIZ, 416));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC728550Shx, X.InterfaceC1212360hec
    public final void LJ() {
        if (N0(this.A0.getFrom())) {
            return;
        }
        super.LJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final String LL() {
        if (((Number) C0AWZ.LIZ.getValue()).intValue() == 0 || C712460Rx6.LIZ(this.A0)) {
            return null;
        }
        return "scene_story_feed";
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final Aweme LLLLLJLJLL() {
        if (!N0(this.A0.getFrom())) {
            return super.LLLLLJLJLL();
        }
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null) {
            return c0sz8LJLIL.LJIIIIZZ();
        }
        return null;
    }

    public final boolean M0() {
        return ((Boolean) this.P0.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.C14LF
    public final void Nb() {
        if (((Boolean) this.Q0.getValue()).booleanValue() || !M0()) {
            return;
        }
        C337180DJs.LIZJ(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void Ng1() {
        if (N0(this.A0.getFrom())) {
            return;
        }
        C420470GeD c420470GeD = this.O0;
        if (c420470GeD != null) {
            c420470GeD.LIZ();
        }
        super.Ng1();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e2  */
    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XZ() {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel.XZ():void");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean h() {
        return C712460Rx6.LIZ(this.A0) ? C1787206zG.LIZ() : C281310B0v.LIZ() && !F0();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean v() {
        if (N0(this.A0.getFrom())) {
            return false;
        }
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        Boolean boolValueOf;
        boolean zIsFinishing;
        InterfaceC214902198i interfaceC214902198i;
        super.Cu1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showBottomView current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        View viewLIZJ = null;
        sbLIZ.append(awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL2 != null ? Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C128Y c128yLIZIZ = C1606370ru7.LIZIZ(getFragment());
        if (!(c128yLIZIZ instanceof InterfaceC214902198i) || (interfaceC214902198i = (InterfaceC214902198i) c128yLIZIZ) == null) {
            Activity activity = this.activity;
            if (activity == null) {
                boolValueOf = null;
                if (this.activity != null || !Intrinsics.LJFF(boolValueOf, Boolean.FALSE) || getFragment() == null || this.LLLL.booleanValue()) {
                    return;
                }
                if (this.L0 == null) {
                    this.L0 = I0();
                }
                if (this.G0 != null) {
                    XZ();
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createCreatorBottomView current aweme id =  ");
                Aweme awemeLLLLLJLJLL3 = LLLLLJLJLL();
                sbLIZ2.append(awemeLLLLLJLJLL3 != null ? awemeLLLLLJLJLL3.getAid() : null);
                sbLIZ2.append(" and aweme type is ");
                Aweme awemeLLLLLJLJLL4 = LLLLLJLJLL();
                sbLIZ2.append(awemeLLLLLJLJLL4 != null ? Integer.valueOf(awemeLLLLLJLJLL4.getAwemeType()) : null);
                C2188811AlT.LIZIZ(sbLIZ2);
                ViewGroup viewGroup = (ViewGroup) getFragment().getView();
                if (viewGroup instanceof FrameLayout) {
                    C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                    viewLIZJ = c1618440sDa.LJJ().LIZJ("detail_feed_story_normal_creator_bottom", getContext(), getFragment(), R.layout.blo, null, viewGroup, false, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(57)));
                    layoutParams.gravity = 80;
                    this.H0 = viewLIZJ.findViewById(R.id.ngc);
                    this.I0 = (TuxTextView) viewLIZJ.findViewById(R.id.yyi);
                    O0();
                    if (C729510SjV.LJIJ(LLLLLJLJLL())) {
                        View view = this.H0;
                        if (view != null && view.getVisibility() != 4) {
                            C786410Ut5.LJLLLLLL(4, view);
                        }
                    } else {
                        View view2 = this.H0;
                        if (view2 != null && view2.getVisibility() != 0) {
                            C786410Ut5.LJLLLLLL(0, view2);
                        }
                    }
                    this.J0 = viewLIZJ.findViewById(R.id.y4f);
                    this.K0 = (TuxTextView) viewLIZJ.findViewById(R.id.w9r);
                    if (c1618440sDa.LJJIFFI().LJIIIIZZ()) {
                        View view3 = this.J0;
                        if (view3 != null) {
                            C786410Ut5.LJLLLLLL(0, view3);
                        }
                        View view4 = this.J0;
                        if (view4 != null) {
                            C786410Ut5.I7(new ACListenerS154S0100000_19((Object) this, 103), view4);
                        }
                    } else {
                        View view5 = this.J0;
                        if (view5 != null) {
                            C786410Ut5.LJLLLLLL(8, view5);
                        }
                    }
                    C786410Ut5.LJLLLLLL(8, viewLIZJ);
                    viewGroup.addView(viewLIZJ, layoutParams);
                }
                this.G0 = viewLIZJ;
                return;
            }
            zIsFinishing = activity.isFinishing();
        } else {
            zIsFinishing = SAFExtensionKt.LJIIZILJ(interfaceC214902198i);
        }
        boolValueOf = Boolean.valueOf(zIsFinishing);
        if (this.activity != null) {
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        super.LLJJJJLIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL2 != null ? Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
    }

    public final void O0() {
        AwemeStatistics statistics;
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        String strLIZIZ = (awemeLLLLLJLJLL == null || (statistics = awemeLLLLLJLJLL.getStatistics()) == null) ? null : C1843500y4a.LIZIZ(statistics.getPlayCount());
        TuxTextView tuxTextView = this.I0;
        if (tuxTextView != null) {
            if (strLIZIZ == null) {
                strLIZIZ = CardStruct.IStatusCode.DEFAULT;
            }
            tuxTextView.setText(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void T() {
        super.T();
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS112S0100000_12((Object) this, 163));
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void UJ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStoryPageSelected current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL2 != null ? Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void adaptation() {
        super.adaptation();
        if (((Boolean) this.Q0.getValue()).booleanValue() || !M0()) {
            return;
        }
        C337180DJs.LIZ(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w
    public final void initPanel() {
        IDetailPageAbility iDetailPageAbilityLIZ;
        super.initPanel();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initPanel current aweme id = ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        sbLIZ.append(awemeLLLLLJLJLL2 != null ? Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C281310B0v.LIZ() && M0() && ((!F0() || C1189504l3.LIZ()) && (iDetailPageAbilityLIZ = C1600700rky.LIZ(getFragment())) != null)) {
            iDetailPageAbilityLIZ.y62(false);
        }
        if (M0()) {
            C337180DJs.LIZ(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDetach() {
        super.onDetach();
        InterfaceC665370Q7z interfaceC665370Q7zK0 = k0();
        if (interfaceC665370Q7zK0 != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zK0, StoryDetailAbility.class, null);
        }
        if (this.O0 == null || !((Boolean) C0AWL.LIZ.getValue()).booleanValue()) {
            return;
        }
        C21593719f5.LLJJJJLIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onResume() throws Throwable {
        super.onResume();
        C730000SkI.LIZIZ.LIZJ(249372176, 3);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.C14LF
    public final void y() {
        super.y();
        if (((Boolean) this.Q0.getValue()).booleanValue() || !M0()) {
            return;
        }
        C337180DJs.LIZ(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final int Um0() {
        return this.E0;
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final boolean cg0() {
        return this.C0;
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final boolean vn2() {
        return this.B0;
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final boolean xF0() {
        return this.D0;
    }

    public StoryMixedFeedDetailPanel(C2189821An6 c2189821An6) {
        super(c2189821An6);
        this.A0 = c2189821An6;
        this.B0 = true;
        this.P0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 136));
        this.Q0 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(60));
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final void AB2(boolean z) {
        this.D0 = z;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC728550Shx
    public final void G90(Pair<Integer, ? extends Aweme> pair) {
        Aweme second;
        String aid;
        Integer numValueOf = null;
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        if (L0(second, "onDetailSuccess")) {
            return;
        }
        C420470GeD c420470GeD = this.O0;
        if (c420470GeD != null) {
            c420470GeD.LIZ();
        }
        super.G90(pair);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetailSuccess current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        if (awemeLLLLLJLJLL != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        if (awemeLLLLLJLJLL2 != null) {
            numValueOf = Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJLL(C0SZ8 c0sz8) {
        InterfaceC1209750haP interfaceC1209750haP;
        super.LLJLL(c0sz8);
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        if (awemeLLLLLJLJLL != null && (interfaceC1209750haP = this.L0) != null) {
            interfaceC1209750haP.LJLJJI(awemeLLLLLJLJLL);
        }
    }

    public final boolean N0(String str) {
        if (M0() && C1618440sDa.LIZIZ.LJJIIJ().LJIILLIIL(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final void N20(int i) {
        if (this.E0 == 0) {
            this.E0 = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        if (N0(this.A0.getFrom())) {
            return;
        }
        C420470GeD c420470GeD = this.O0;
        if (c420470GeD != null) {
            c420470GeD.LIZ();
        }
        super.Uq2(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1255930imt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1(int r7) {
        /*
            r6 = this;
            X.1An6 r0 = r6.A0
            boolean r0 = X.C712460Rx6.LIZ(r0)
            if (r0 == 0) goto Lc
            super.Y1(r7)
            return
        Lc:
            X.1An6 r0 = r6.A0
            java.lang.String r0 = r0.getFrom()
            boolean r0 = X.C1600750rl3.LJ(r0)
            if (r0 != 0) goto L1c
            super.Y1(r7)
            return
        L1c:
            X.0SR4 r0 = r6.LLJL
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.LJJJZ(r7)
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r6.LLJJIJIIJIL
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LJIIIIZZ()
            X.0SZ8 r5 = r6.LJLIL()
            r2 = 0
            if (r5 == 0) goto L80
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
            if (r0 == 0) goto L4c
            r0 = r5
            com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility r0 = (com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility) r0
            if (r0 == 0) goto L4c
            X.0RyY r0 = r0.Fz2()
            if (r0 == 0) goto L4c
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r0)
            if (r1 == 0) goto L4c
            java.lang.Class<com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility> r0 = com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            if (r0 != 0) goto L6a
        L4c:
            X.0SZ8 r1 = r5.LLJLLL()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility r1 = (com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility) r1
            if (r1 == 0) goto L7e
            X.0RyY r0 = r1.Fz2()
            if (r0 == 0) goto L7e
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r0)
            if (r1 == 0) goto L7e
            java.lang.Class<com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility> r0 = com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
        L6a:
            com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility r0 = (com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility) r0
            if (r0 == 0) goto L80
            boolean r1 = r0.Ka0()
            r0 = 1
            if (r1 != r0) goto L80
        L75:
            X.0RRP r0 = X.C0RRP.O_D_AWEME_2
            X.C583420MuS.LIZIZ(r3, r0, r2)
            r6.LLFZ()
            return
        L7e:
            r0 = r2
            goto L6a
        L80:
            X.0SR4 r0 = r6.LLJL
            r0.LJJJJLI(r7, r4)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel.Y1(int):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void i0(Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUpInsightBottomView current aweme id =  ");
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        super.i0(aweme);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC21613819iK
    public final void iG(int i) {
        super.iG(i);
        DetailFragmentPanel.a0(this.G0, getFragment().getView(), i);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final List<Aweme> p(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        List<Aweme> listP = super.p(abstractC1255880imo);
        if (listP == null) {
            return null;
        }
        C1008770cMF.LIZ(listP);
        if ((!listP.isEmpty()) && N0(this.A0.getFrom())) {
            return listP.subList(0, 1);
        }
        return listP;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC728550Shx
    public final void qJ1(Exception exc) {
        String aid;
        super.qJ1(exc);
        C420470GeD c420470GeD = this.O0;
        if (c420470GeD != null) {
            c420470GeD.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetailFailed current aweme id =  ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        Integer numValueOf = null;
        if (awemeLLLLLJLJLL != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        if (awemeLLLLLJLJLL2 != null) {
            numValueOf = Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC21613819iK
    public final void xv(boolean z) {
        super.xv(z);
        DetailFragmentPanel.a0(this.G0, getFragment().getView(), 0);
    }

    @Override // com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility
    public final void z61(boolean z) {
        this.C0 = z;
    }

    public final boolean L0(Object obj, String str) {
        Aweme aweme;
        InterfaceC214902198i interfaceC214902198i;
        Boolean boolValueOf = null;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        boolean zLIZ = C712460Rx6.LIZ(this.A0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackToPostDetail, from = ");
        sbLIZ.append(str);
        sbLIZ.append(", hasFallBackToPost = ");
        sbLIZ.append(this.F0);
        sbLIZ.append(", isStoryInProfile = ");
        sbLIZ.append(zLIZ);
        sbLIZ.append(", isStoryToNormal = ");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.getIsStoryToNormal());
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.F0 && !zLIZ && aweme != null && aweme.getIsStoryToNormal()) {
            this.F0 = true;
            C1618440sDa.LIZIZ.LJIJI(aweme);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//aweme/detail");
            smartRouteBuildRoute.withParam("story_to_post_aid", aweme.getAid());
            smartRouteBuildRoute.withParam("video_from", "STORY_TO_POST");
            smartRouteBuildRoute.withParam("enter_from", this.LLLLIIIILLL.getEventType());
            smartRouteBuildRoute.withParam("previous_page", this.LLLLIIIILLL.getPreviousPage());
            smartRouteBuildRoute.withParam("userid", AwemeExtKt.getAuthorUid(aweme));
            smartRouteBuildRoute.open();
            C128Y c128yLIZIZ = C1606370ru7.LIZIZ(getFragment());
            if ((c128yLIZIZ instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) c128yLIZIZ) != null) {
                interfaceC214902198i.finish();
            } else {
                this.activity.finish();
            }
        }
        return this.F0;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        Object objLJJJLL;
        String aid;
        int size;
        Integer numValueOf = null;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (L0(objLJJJLL, "onRefreshResult") || N0(this.A0.getFrom())) {
            return;
        }
        super.LLJJJIL(list, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshResult current aweme id = ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        if (awemeLLLLLJLJLL != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        if (awemeLLLLLJLJLL2 != null) {
            numValueOf = Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" and list size is ");
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
        if (Intrinsics.LJFF(getEventType(), "chat")) {
            e0();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        String aid;
        int size;
        if (N0(this.A0.getFrom())) {
            return;
        }
        super.Pj(list, z);
        C420470GeD c420470GeD = this.O0;
        if (c420470GeD != null) {
            c420470GeD.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMoreResult current aweme id = ");
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        Integer numValueOf = null;
        if (awemeLLLLLJLJLL != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" and aweme type is ");
        Aweme awemeLLLLLJLJLL2 = LLLLLJLJLL();
        if (awemeLLLLLJLJLL2 != null) {
            numValueOf = Integer.valueOf(awemeLLLLLJLJLL2.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" and list size is ");
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        XZ();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void d0(List<Aweme> list, boolean z) {
        Object objLJJJLL;
        String authorUid;
        InterfaceC729990SkH interfaceC729990SkHLJJIZ;
        Aweme aweme = null;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (L0(objLJJJLL, "setAdapterData")) {
            return;
        }
        C420470GeD c420470GeD = this.O0;
        if (c420470GeD != null) {
            c420470GeD.LIZ();
        }
        if (!C712460Rx6.LIZ(this.A0) && C1600750rl3.LJ(this.A0.getFrom()) && (interfaceC729990SkHLJJIZ = C1618440sDa.LIZIZ.LJJIZ()) != null) {
            interfaceC729990SkHLJJIZ.LJFF(SystemClock.uptimeMillis(), "user_data_to_ui_dur_us");
        }
        if (list != null) {
            int size = list.size();
            int i = this.LLJLILLLLZIIL;
            if (size > i) {
                aweme = (Aweme) ListProtector.get(list, i);
            }
        }
        if (!z && aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, authorUid);
        }
        super.d0(list, z);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC21613819iK
    public final void lQ(float f, int i) {
        super.lQ(f, i);
        View view = this.G0;
        if (view != null && view.getVisibility() == 0) {
            DetailFragmentPanel.a0(this.G0, getFragment().getView(), (int) (f * i));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onAttach(Activity activity, Fragment fragment) {
        super.onAttach(activity, fragment);
        InterfaceC665370Q7z interfaceC665370Q7zK0 = k0();
        if (interfaceC665370Q7zK0 != null) {
            C1558520qew.LJII(interfaceC665370Q7zK0, this, StoryDetailAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.StoryDetailFragmentPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        final C711450RvT c711450RvT;
        Integer num;
        super.onViewCreated(view, bundle);
        C730000SkI.LIZIZ.LIZJ(249372176, 2);
        C0SR4 c0sr4 = this.LLJL;
        C420470GeD c420470GeD = null;
        if ((c0sr4 instanceof C711450RvT) && (c711450RvT = (C711450RvT) c0sr4) != null) {
            String str = this.LLLLIIIILLL.getExtra().get("story_extra_cell_preload_type");
            if (Intrinsics.LJFF(str, "1")) {
                num = 15;
            } else if (Intrinsics.LJFF(str, "2")) {
                num = 16;
            }
            if (num != null) {
                final int iIntValue = num.intValue();
                HandlerHook.viewPost(this.LLJJIJI, new Runnable() { // from class: X.0RwT
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
                    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            r17 = this;
                            r1 = r17
                            X.0RvT r11 = r1
                            com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel r0 = r2
                            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r13 = r0.LLJJIJI
                            int r12 = r3
                            r11.getClass()
                            java.lang.Class<com.ss.android.ugc.aweme.IDetailFeedSafService> r5 = com.ss.android.ugc.aweme.IDetailFeedSafService.class
                            r6 = 0
                            r9 = 14
                            r10 = 0
                            r7 = r6
                            r8 = r6
                            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
                            com.ss.android.ugc.aweme.IDetailFeedSafService r0 = (com.ss.android.ugc.aweme.IDetailFeedSafService) r0
                            r2 = 0
                            if (r0 == 0) goto L7d
                            androidx.fragment.app.Fragment r1 = r0.LIZ(r13)
                        L22:
                            boolean r0 = r1 instanceof X.InterfaceC214902198i
                            if (r0 == 0) goto L7b
                            X.198i r1 = (X.InterfaceC214902198i) r1
                        L28:
                            if (r1 == 0) goto L6e
                            boolean r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIZILJ(r1)
                            if (r0 != 0) goto L6c
                            boolean r0 = r1.SL()
                            if (r0 != 0) goto L6c
                            r0 = 0
                        L37:
                            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                        L3b:
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                            if (r0 == 0) goto La3
                            android.util.SparseArray<java.util.concurrent.ConcurrentLinkedQueue<android.view.View>> r0 = r11.LLJJLIIIJLLLLLLLZ
                            java.lang.Object r5 = r0.get(r12)
                            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
                            if (r5 != 0) goto L57
                            java.util.concurrent.ConcurrentLinkedQueue r5 = new java.util.concurrent.ConcurrentLinkedQueue
                            r5.<init>()
                            android.util.SparseArray<java.util.concurrent.ConcurrentLinkedQueue<android.view.View>> r0 = r11.LLJJLIIIJLLLLLLLZ
                            r0.put(r12, r5)
                        L57:
                            r14 = r6
                            r15 = r6
                            r16 = r10
                            android.view.View r4 = r11.LJJJJJL(r12, r13, r14, r15, r16)
                            X.0SZ8 r3 = X.C0SR4.LJJLIIIIJ(r4)
                            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
                            if (r0 == 0) goto La0
                            com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell r3 = (com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell) r3
                            if (r3 == 0) goto La0
                            goto L7f
                        L6c:
                            r0 = 1
                            goto L37
                        L6e:
                            android.content.Context r0 = r11.LLILZIL
                            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
                            if (r0 == 0) goto L3b
                            boolean r0 = r0.isFinishing()
                            goto L37
                        L7b:
                            r1 = r2
                            goto L28
                        L7d:
                            r1 = r2
                            goto L22
                        L7f:
                            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = new com.ss.android.ugc.aweme.feed.model.VideoItemParams     // Catch: java.lang.Throwable -> L9c
                            r2.<init>()     // Catch: java.lang.Throwable -> L9c
                            com.ss.android.ugc.aweme.feed.model.Aweme r1 = new com.ss.android.ugc.aweme.feed.model.Aweme     // Catch: java.lang.Throwable -> L9c
                            r1.<init>()     // Catch: java.lang.Throwable -> L9c
                            java.lang.String r0 = "FAKE_DETAIL_AWEME"
                            r1.setAid(r0)     // Catch: java.lang.Throwable -> L9c
                            r2.setAweme(r1)     // Catch: java.lang.Throwable -> L9c
                            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r11.LLJI     // Catch: java.lang.Throwable -> L9c
                            java.lang.String r0 = r0.eventType     // Catch: java.lang.Throwable -> L9c
                            r2.setEventType(r0)     // Catch: java.lang.Throwable -> L9c
                            r3.SN1(r6, r2)     // Catch: java.lang.Throwable -> L9c
                            goto La0
                        L9c:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        La0:
                            r5.offer(r4)
                        La3:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC712070RwT.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("StoryMixedFeedDetailPanel@ca80.onViewCreated$1$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("StoryMixedFeedDetailPanel@ca80.onViewCreated$1$1$1");
                    }
                });
            }
        }
        if (C13LQ.LJJIJIIJI(this.A0.getFrom(), C0RMB.LJII) < 0) {
            C01GW c01gw = C0AWO.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                if (view != null) {
                    c420470GeD = (C420470GeD) view.findViewById(R.id.nnp);
                }
                this.O0 = c420470GeD;
                if (c420470GeD != null) {
                    if (((Number) c01gw.getValue()).intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c420470GeD.setEnableAnimation(z);
                }
                C420470GeD c420470GeD2 = this.O0;
                if (c420470GeD2 != null) {
                    if (c420470GeD2.getVisibility() != 0) {
                        int visibility = c420470GeD2.getVisibility();
                        c420470GeD2.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c420470GeD2);
                    }
                    if (c420470GeD2.LLILLL) {
                        c420470GeD2.LL.LIZIZ();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void U(List<Aweme> list, boolean z, EnumC1985807qC enumC1985807qC) {
        if (C1618440sDa.LIZIZ.LJJIJL(getFragment(), this.LLLLIIIILLL, Zc(), getEventType(), enumC1985807qC)) {
            return;
        }
        super.U(list, z, enumC1985807qC);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(Context context, LayoutInflater layoutInflater, C0HTT c0htt, Fragment fragment, C714460S0u c714460S0u, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        if (M0() && context != null && layoutInflater != null && c0htt != null && fragment != null && baseFeedPageParams != null && c0r9l != null) {
            return new C711450RvT(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
        }
        return super.LJJLIIIJLJLI(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
    }
}
