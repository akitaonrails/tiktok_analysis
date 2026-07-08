package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C019F;
import X.C09R3;
import X.C0RJN;
import X.C0RQB;
import X.C0RTJ;
import X.C0SZ8;
import X.C0T0K;
import X.C13LE;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C2189821An6;
import X.C2217381BqS;
import X.C712430Rx3;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AAListenerS322S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListSelectViewModel;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeProfileComponent extends UISlotAssem implements LandscapeProfilePanelAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public ObjectAnimator LLJJJJ;
    public boolean LLJJJJJIL;
    public DataCenter LLJJJJLIIL;
    public final C0RTJ LLJJL;
    public final AAListenerS322S0100000_11 LLJJLIIIJLLLLLLLZ;
    public final AAListenerS322S0100000_11 LLJL;
    public final AssemVMLazy LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeProfileComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/feed/landscape/component/profile/LandscapeProfileListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LandscapeProfileComponent.class, "selectedVM", "getSelectedVM()Lcom/ss/android/ugc/aweme/feed/landscape/component/profile/LandscapeProfileListSelectViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public LandscapeProfileComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeProfileListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 421), AFwS243S0000000_11.get$arr$(208), null, true);
        this.LLJJL = new C0RTJ();
        this.LLJJLIIIJLLLLLLLZ = new AAListenerS322S0100000_11(this, 12);
        this.LLJL = new AAListenerS322S0100000_11(this, 11);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LandscapeProfileListSelectViewModel.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 422), AFwS243S0000000_11.get$arr$(209), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.d0h;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility
    public final void hide() {
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility;
        C0RJN c0rjnLIZIZ;
        C2189821An6 c2189821An6;
        HashMap<String, String> logExtra;
        hp(false);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI)) != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null && (logExtra = c2189821An6.getLogExtra()) != null) {
            logExtra.put("creator_panel_enter_group_id", "");
        }
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility == null || (c0sz8LJLIL = landscapeFeedViewPagerAbility.LJLIL()) == null || (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz8LJLIL)) == null || (landscapePanelStateNotificationAbility = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, LandscapePanelStateNotificationAbility.class, null)) == null) {
            return;
        }
        landscapePanelStateNotificationAbility.tq1(C0RQB.AUTO_PLAY_NEXT.getValue() | C0RQB.SHOW_INTRO.getValue() | C0RQB.DANMAKU_FOCUSABLE.getValue(), false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1850012184) {
            return null;
        }
        return this;
    }

    public final LandscapeProfileListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (LandscapeProfileListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility
    public final boolean LJJII() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(boolean r8) {
        /*
            r7 = this;
            android.view.View r4 = r7.LLJJIJIL
            if (r4 == 0) goto L77
            r2 = 0
            r3 = 1
            r6 = 0
            if (r8 == 0) goto L89
            r5 = 0
        La:
            float r0 = r4.getTranslationX()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L33
            if (r8 == 0) goto L7e
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L88
        L1a:
            r1 = 0
        L1b:
            X.C786410Ut5.LJLLLLLL(r1, r4)
            if (r8 == 0) goto L30
            float r0 = r7.LLJJJ
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L7b
            r0 = 4645146356283867136(0x4076e00000000000, double:366.0)
            int r0 = X.C341940Daq.LIZ(r0)
            float r2 = (float) r0
        L30:
            X.C786410Ut5.Jc(r4, r2)
        L33:
            android.animation.ObjectAnimator r0 = r7.LLJJJJ
            if (r0 == 0) goto L44
            boolean r0 = r0.isRunning()
            if (r0 != r3) goto L44
            android.animation.ObjectAnimator r0 = r7.LLJJJJ
            if (r0 == 0) goto L44
            r0.cancel()
        L44:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            r0 = 2
            float[] r1 = new float[r0]
            float r0 = r4.getTranslationX()
            r1[r6] = r0
            r1[r3] = r5
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r4, r2, r1)
            r7.LLJJJJ = r2
            if (r2 == 0) goto L65
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = X.C1619980sG4.LIZLLL()
            r2.setInterpolator(r0)
        L65:
            android.animation.ObjectAnimator r1 = r7.LLJJJJ
            if (r1 == 0) goto L70
            if (r8 == 0) goto L78
            Y.AAListenerS322S0100000_11 r0 = r7.LLJJLIIIJLLLLLLLZ
        L6d:
            r1.addListener(r0)
        L70:
            android.animation.ObjectAnimator r0 = r7.LLJJJJ
            if (r0 == 0) goto L77
            X.C786410Ut5.Pd(r0)
        L77:
            return
        L78:
            Y.AAListenerS322S0100000_11 r0 = r7.LLJL
            goto L6d
        L7b:
            float r2 = r7.LLJJJIL
            goto L30
        L7e:
            r1 = 8
            if (r8 != 0) goto L1a
            int r0 = r4.getVisibility()
            if (r0 != r1) goto L1b
        L88:
            return
        L89:
            android.content.Context r0 = r7.getContext()
            if (r0 == 0) goto L9a
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            if (r0 != r3) goto L9a
            float r0 = r7.LLJJJ
            float r5 = -r0
            goto La
        L9a:
            float r5 = r7.LLJJJ
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeProfileComponent.hp(boolean):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewModelProvider viewModelProvider;
        super.onViewCreated(view);
        this.LLJJIII = (View) view.getParent();
        if (((View) view.getParent()).getId() == R.id.s1b) {
            this.LLJJIJI = (View) this.LLJJIII.getParent();
        }
        this.LLJJIJIIJIL = view.findViewById(R.id.s5n);
        this.LLJJIJIL = view;
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS111S0100000_11(this, 38));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            viewModelProvider = new ViewModelProvider(getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.getInstance(C712430Rx3.LIZ(c19egLIZ)));
        } else {
            viewModelProvider = null;
        }
        this.LLJJJJLIIL = DataCenter.vQ2(viewModelProvider, C724240Sb0.LIZ(this));
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedViewPagerAbility.class, null);
        if (landscapeFeedViewPagerAbility != null) {
            landscapeFeedViewPagerAbility.bY0(this, new AwS625S0100000_11(this, 38));
        }
        View view3 = this.LLJJIJIIJIL;
        if (view3 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Rww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                }
            }, view3);
        }
        C723850SaN.LIZLLL(this, new AwS590S0100000_11(this, 148));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qj0(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8, X.C2189821An6 r9) {
        /*
            r7 = this;
            X.0RTJ r0 = r7.LLJJL
            com.bytedance.assem.arch.reused.proxy.MixUseReusedContainer r0 = r0.LIZ
            r6 = 0
            r5 = 0
            if (r0 == 0) goto Lb
            r0.LLJJJJLIIL(r6, r8, r5)
        Lb:
            if (r9 == 0) goto L20
            java.util.HashMap r2 = r9.getLogExtra()
            if (r2 == 0) goto L20
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = "creator_panel_enter_group_id"
            r2.put(r0, r1)
        L20:
            com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel r1 = r7.ip()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            r1.LLIZ = r0
            com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel r0 = r7.ip()
            r0.LLJ = r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel r0 = r7.ip()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLIZ
            if (r0 == 0) goto Lc0
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
        L44:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r4 = 1
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel r0 = r7.ip()
            int r1 = r0.LLIZLLLIL
            X.0RyN r0 = X.C713250RyN.LIZ
            r0.getClass()
            int r0 = X.C713250RyN.LIZ(r8)
            if (r1 != r0) goto Lb1
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r7.LLJLIL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.feed.landscape.component.LandscapeProfileComponent.LLJLILLLLZIIL
            com.bytedance.assem.arch.viewModel.AssemViewModel r3 = r1.getValue()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.getAweme()
            kotlin.jvm.internal.AwS99S0110000_11 r1 = new kotlin.jvm.internal.AwS99S0110000_11
            r0 = 8
            r1.<init>(r2, r0)
            r3.setState(r1)
        L72:
            android.view.View r0 = r7.LLJJIJI
            if (r0 == 0) goto L79
            X.C786410Ut5.LJLLLLLL(r6, r0)
        L79:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility> r0 = com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility r0 = (com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility) r0
            if (r0 == 0) goto Lad
            X.0SZ8 r0 = r0.LJLIL()
            if (r0 == 0) goto Lad
            X.0Q7z r1 = X.C0T0K.LIZIZ(r0)
            if (r1 == 0) goto Lad
            java.lang.Class<com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility> r0 = com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility.class
            X.01wD r2 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility r2 = (com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility) r2
            if (r2 == 0) goto Lad
            X.0RQB r0 = X.C0RQB.AUTO_PLAY_NEXT
            int r1 = r0.getValue()
            X.0RQB r0 = X.C0RQB.SHOW_INTRO
            int r0 = r0.getValue()
            r1 = r1 | r0
            r2.tq1(r1, r4)
        Lad:
            r7.hp(r4)
            return
        Lb1:
            com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel r0 = r7.ip()
            r0.listClear()
            com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel r0 = r7.ip()
            r0.manualListRefresh()
            goto L72
        Lc0:
            r0 = r5
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeProfileComponent.Qj0(com.ss.android.ugc.aweme.feed.model.VideoItemParams, X.1An6):void");
    }
}
