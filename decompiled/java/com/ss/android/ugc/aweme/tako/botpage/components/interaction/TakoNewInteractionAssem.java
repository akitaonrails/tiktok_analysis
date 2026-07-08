package com.ss.android.ugc.aweme.tako.botpage.components.interaction;

import X.C019F;
import X.C01GW;
import X.C07IA;
import X.C09R3;
import X.C0DSB;
import X.C1308910kAL;
import X.C13LC;
import X.C13LE;
import X.C14NX;
import X.C14P7;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1857280yQo;
import X.C1858230ySL;
import X.C1858330ySV;
import X.C1858340ySW;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1864540ycW;
import X.C1919007fQ;
import X.C19719912Dl;
import X.C19723912Ez;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C444960Hcc;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1857430yR3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1858700yT6;
import X.InterfaceC1860040yVG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1864670ycj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1864770yct;
import X.ViewTreeObserverOnScrollChangedListenerC1858310yST;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.w2;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNewInteractionAssem extends ReusedUISlotAssem<TakoNewInteractionAssem> implements InterfaceC712990Rxx<InterfaceC1858700yT6> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLL;
    public InterfaceC1860040yVG LLJLLIL;
    public FrameLayout LLJLLL;
    public C14NX LLJZ;
    public FrameLayout LLJZIJLIL;
    public LinearLayout LLL;
    public LinearLayout LLLF;
    public final AssemVMLazy LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;
    public final Rect LLLIIII;
    public Boolean LLLIIIIL;
    public String LLLIIIL;
    public ARunnableS127S0100000_27 LLLIIL;
    public View LLLIILIL;
    public ViewTreeObserver LLLIL;
    public ViewOnAttachStateChangeListenerC1864670ycj LLLILZ;
    public final ViewTreeObserverOnGlobalLayoutListenerC1864770yct LLLILZJ;
    public final ViewTreeObserverOnScrollChangedListenerC1858310yST LLLILZLLLI;
    public final C01GW LLLIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoNewInteractionAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoNewInteractionAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0yST] */
    public TakoNewInteractionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 790), AFwS269S0000000_27.get$arr$(222), null, true);
        this.LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 792));
        this.LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 794));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 786));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 791), AFwS269S0000000_27.get$arr$(223), null, true);
        this.LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 788));
        this.LLLFZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 793));
        this.LLLII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 787));
        this.LLLIIII = new Rect();
        this.LLLILZJ = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 2);
        this.LLLILZLLLI = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0yST
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.LL.tp();
            }
        };
        this.LLLIZZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 789));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flb;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TakoCardAbility Ap() {
        return (TakoCardAbility) this.LLJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ep() {
        /*
            r3 = this;
            X.0yQF r0 = X.C1856930yQF.LIZ
            r0.getClass()
            boolean r0 = X.C1856930yQF.LIZ()
            r2 = 0
            if (r0 != 0) goto L17
            X.0Cp7 r0 = X.C325310Cp7.LIZ
            r0.getClass()
            boolean r0 = X.C325310Cp7.LIZIZ()
            if (r0 == 0) goto L25
        L17:
            java.lang.String r0 = "generate_image"
            java.lang.Object r1 = X.C723850SaN.LJFF(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L36
        L25:
            boolean r0 = X.C07ID.LIZ()
            if (r0 != 0) goto L36
            X.07fQ r0 = X.C1919007fQ.LIZ
            r0.getClass()
            boolean r0 = X.C1919007fQ.LIZIZ()
            if (r0 == 0) goto L56
        L36:
            X.01GW r0 = r3.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            r1 = 1
            if (r0 == 0) goto L55
            X.01GW r0 = r3.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility r0 = (com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility) r0
            if (r0 == 0) goto L56
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r0 = r0.getBotInfo()
            if (r0 == 0) goto L56
            boolean r0 = r0.isCsiBot()
            if (r0 != r1) goto L56
        L55:
            r2 = 1
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem.Ep():boolean");
    }

    public final boolean zp() {
        return ((Boolean) this.LLLIZZ.getValue()).booleanValue();
    }

    public final void Ip() {
        TakoCardAbility takoCardAbilityAp;
        ViewGroup viewGroupY4;
        if (zp()) {
            return;
        }
        TakoCardAbility takoCardAbilityAp2 = Ap();
        int iLIZIZ = 0;
        if (takoCardAbilityAp2 == null || takoCardAbilityAp2.t70() != 1 || (takoCardAbilityAp = Ap()) == null || (viewGroupY4 = takoCardAbilityAp.Y4()) == null) {
            return;
        }
        int paddingStart = viewGroupY4.getPaddingStart();
        int paddingTop = viewGroupY4.getPaddingTop();
        int paddingEnd = viewGroupY4.getPaddingEnd();
        FrameLayout frameLayout = this.LLJLLL;
        if (frameLayout != null && frameLayout.getVisibility() == 8) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        viewGroupY4.setPaddingRelative(paddingStart, paddingTop, paddingEnd, iLIZIZ);
    }

    public final void Qp() {
        View view;
        if (C07IA.LIZ() || (view = this.LLJLLL) == null || this.LLLILZ != null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj = new ViewOnAttachStateChangeListenerC1864670ycj(this, 0);
        this.LLLILZ = viewOnAttachStateChangeListenerC1864670ycj;
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864670ycj);
        if (view.isAttachedToWindow()) {
            Jp(view);
            tp();
        }
    }

    public final void Up() {
        if (C07IA.LIZ()) {
            return;
        }
        sp();
        Wp();
        this.LLLIIIIL = null;
        FrameLayout frameLayout = this.LLJLLL;
        ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj = this.LLLILZ;
        if (frameLayout != null && viewOnAttachStateChangeListenerC1864670ycj != null) {
            frameLayout.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864670ycj);
        }
        this.LLLILZ = null;
    }

    public final void Wp() {
        if (C07IA.LIZ()) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.LLLIL;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct = this.LLLILZJ;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
            ViewTreeObserverOnScrollChangedListenerC1858310yST viewTreeObserverOnScrollChangedListenerC1858310yST = this.LLLILZLLLI;
            viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1858310yST);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC1858310yST, ViewTreeObserver.OnScrollChangedListener.class);
        }
        this.LLLIL = null;
    }

    public final void sp() {
        if (C07IA.LIZ()) {
            return;
        }
        FrameLayout frameLayout = this.LLJLLL;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLLIIL;
        if (frameLayout != null && aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout, aRunnableS127S0100000_27);
        }
        this.LLLIIL = null;
        this.LLLIILIL = null;
    }

    public final void tp() {
        FrameLayout frameLayout;
        if (C07IA.LIZ()) {
            return;
        }
        Fp((C07IA.LIZ() || (frameLayout = this.LLJLLL) == null) ? false : Bp(frameLayout));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Up();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        Up();
    }

    public final boolean Bp(View view) {
        if (C07IA.LIZ() || !view.isAttachedToWindow() || view.getVisibility() != 0 || !view.isShown() || view.getWidth() <= 0 || view.getHeight() <= 0 || view.getAlpha() <= 0.0f || !view.getGlobalVisibleRect(this.LLLIIII) || this.LLLIIII.width() <= 0 || this.LLLIIII.height() <= 0) {
            return false;
        }
        return true;
    }

    public final void Fp(boolean z) {
        FrameLayout frameLayout;
        if (C07IA.LIZ()) {
            return;
        }
        if (!z) {
            sp();
            if (Intrinsics.LJFF(this.LLLIIIIL, Boolean.TRUE)) {
                this.LLLIIIIL = Boolean.FALSE;
                Gp(false);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(this.LLLIIIIL, Boolean.TRUE) && !C07IA.LIZ() && (frameLayout = this.LLJLLL) != null) {
            sp();
            this.LLLIILIL = frameLayout;
            ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(this, 70);
            this.LLLIIL = aRunnableS127S0100000_27;
            HandlerHook.viewPostDelay(frameLayout, aRunnableS127S0100000_27, 100L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp(boolean r19) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem.Gp(boolean):void");
    }

    public final void Jp(View view) {
        if (C07IA.LIZ()) {
            return;
        }
        Wp();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.LLLIL = viewTreeObserver;
        C786410Ut5.x3(viewTreeObserver, this.LLLILZJ);
        ViewTreeObserverOnScrollChangedListenerC1858310yST viewTreeObserverOnScrollChangedListenerC1858310yST = this.LLLILZLLLI;
        viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1858310yST);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC1858310yST, ViewTreeObserver.OnScrollChangedListener.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewParent parent;
        FrameLayout frameLayout;
        C14NX c14nxBs1;
        C1857280yQo.LIZJ(view, C444960Hcc.LIZIZ());
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.neh);
        this.LLJZIJLIL = frameLayout2;
        InterfaceC1860040yVG interfaceC1860040yVGRA0 = null;
        if (frameLayout2 != null) {
            parent = frameLayout2.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof FrameLayout) {
            frameLayout = (FrameLayout) parent;
        } else {
            frameLayout = null;
        }
        this.LLJLLL = frameLayout;
        INimbleContainerAbility iNimbleContainerAbility = (INimbleContainerAbility) this.LLJLIL.getValue();
        if (iNimbleContainerAbility != null) {
            c14nxBs1 = iNimbleContainerAbility.Bs1(C13LE.LIZ(TakoNewInteractionAssem.class));
        } else {
            c14nxBs1 = null;
        }
        this.LLJZ = c14nxBs1;
        C0DSB.LIZIZ(this.LLJLLL);
        C14NX c14nx = this.LLJZ;
        if (c14nx != null) {
            C14P7.LJJI(c14nx);
        }
        Qp();
        this.LLL = (LinearLayout) view.findViewById(R.id.nei);
        this.LLLF = (LinearLayout) view.findViewById(R.id.nej);
        if (Ep()) {
            C0DSB.LIZIZ(this.LLL);
            C0DSB.LIZIZ(this.LLLF);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.kvs);
            C0DSB.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
            C1919007fQ.LIZ.getClass();
            if (C1919007fQ.LIZIZ()) {
                viewOnAttachStateChangeListenerC20604515jv.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            }
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864540ycW(1));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoInteractionItemCell.class);
            this.LLJLL = viewOnAttachStateChangeListenerC20604515jv;
        }
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS606S0100000_27(this, 245));
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.o72(new AwS606S0100000_27(this, 246));
        }
        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility2 != null) {
            iMessageAbility2.ME(new AwS606S0100000_27(this, 247));
        }
        TakoCardAbility takoCardAbilityAp = Ap();
        if (takoCardAbilityAp != null) {
            interfaceC1860040yVGRA0 = takoCardAbilityAp.rA0();
        }
        this.LLJLLIL = interfaceC1860040yVGRA0;
        FrameLayout frameLayout3 = this.LLJZIJLIL;
        if (frameLayout3 != null) {
            C786410Ut5.O7(frameLayout3, new ACListenerS161S0100000_27(this, 81));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1858700yT6 interfaceC1858700yT6) {
        Qp();
        TakoCardAbility takoCardAbilityAp = Ap();
        if (takoCardAbilityAp != null) {
            takoCardAbilityAp.m50();
        }
        op(this, true, false, false, 6);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1858700yT6 interfaceC1858700yT6) {
        return true;
    }

    public final int yp(EnumC1857430yR3 enumC1857430yR3) {
        if (this.LLLI) {
            if (enumC1857430yR3 == EnumC1857430yR3.SHARE) {
                return R.attr.a0d;
            }
            return R.attr.a02;
        }
        return R.attr.a1k;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1858700yT6 interfaceC1858700yT6) {
    }

    public final void Tp(Message message, int i) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        C1858330ySV c1858330ySVLIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            String str = message.uuid;
            if (str.length() > 0 && (c1858330ySVLIZ = C1858340ySW.LIZ(str)) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1858340ySW.LIZJ(jCurrentTimeMillis, str);
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str2 = c1863850ybP.LL;
                String str3 = c1863850ybP.LLILLJJLI;
                String str4 = message.uuid;
                Integer numValueOf = Integer.valueOf(c1858330ySVLIZ.LIZ + 1);
                String str5 = c1863850ybP.LLILZIL;
                String str6 = c1863850ybP.LLILZLL;
                String str7 = "";
                if (str6 == null) {
                    str6 = "";
                }
                String str8 = c1863850ybP.LLIZ;
                if (str8 != null) {
                    str7 = str8;
                }
                C1862330yYx.LJLJLLL(c1862330yYx, str2, str3, str4, numValueOf, str5, str6, str7, "switch", strNZ0, (jCurrentTimeMillis - c1858330ySVLIZ.LIZIZ) - c1858330ySVLIZ.LIZJ);
                C1858340ySW.LIZIZ(i, jCurrentTimeMillis, str);
            }
            C1858230ySL.LIZ((IMessageAbility) this.LLLFFI.getValue(), (ITakoContextAbility) this.LLLFZ.getValue(), (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null), message, i, w2.a.SWITCH_RESPONSE);
        }
    }

    public final void Vp(Message message, int i) {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        String str;
        String str2 = message.uuid;
        if (str2.length() > 0 && 1 != 0 && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LL;
            String str4 = c1863850ybP.LLILLJJLI;
            String str5 = c1863850ybP.LLILZIL;
            String str6 = c1863850ybP.LLILZLL;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            String str8 = c1863850ybP.LLIZ;
            if (str8 != null) {
                str7 = str8;
            }
            if (i == 1) {
                str = "click_response2";
            } else {
                str = "click_response1";
            }
            C1862330yYx.LJZI(c1862330yYx, str3, str4, str2, str5, str6, str7, "bottom", str, strNZ0);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final View up(C19723912Ez c19723912Ez, Context context, boolean z) {
        float fLIZIZ;
        float fLIZIZ2;
        int iIntValue;
        int i;
        float fLIZIZ3;
        float fLIZIZ4;
        EnumC1857430yR3 enumC1857430yR3 = c19723912Ez.LIZ;
        int i2 = 0;
        if (enumC1857430yR3 != EnumC1857430yR3.SAVE_VIDEO && enumC1857430yR3 != EnumC1857430yR3.POST_VIDEO) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new ViewGroup.MarginLayoutParams(-2, -2));
            if (z) {
                fLIZIZ3 = C418440Gaw.LIZIZ(0);
            } else {
                fLIZIZ3 = C418440Gaw.LIZIZ(20);
            }
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(fLIZIZ3));
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            if (z) {
                fLIZIZ4 = C418440Gaw.LIZIZ(20);
            } else {
                fLIZIZ4 = C418440Gaw.LIZIZ(12);
            }
            C426750GoL.LJIIL(tuxIconView, numValueOf, numValueOf2, Integer.valueOf(C814420VxA.LIZIZ(fLIZIZ4)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
            C419910GdJ c419910GdJ = c19723912Ez.LJ;
            if (c419910GdJ != null) {
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                c419910GdJ.LJ = Integer.valueOf(yp(c19723912Ez.LIZ));
            }
            tuxIconView.setTuxIcon(c19723912Ez.LJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(c19723912Ez, 80));
            return tuxIconView;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.MarginLayoutParams(-2, -2));
        if (z) {
            fLIZIZ = C418440Gaw.LIZIZ(0);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(20);
        }
        Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(fLIZIZ));
        Integer numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        if (z) {
            fLIZIZ2 = C418440Gaw.LIZIZ(20);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(12);
        }
        C426750GoL.LJIIL(frameLayout, numValueOf3, numValueOf4, Integer.valueOf(C814420VxA.LIZIZ(fLIZIZ2)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 6, 0);
        C786410Ut5.X6(tuxSpinner, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxSpinner.LIZ(R.raw.icon_spinner_thin, iIntValue);
        if (c19723912Ez.LJIIIZ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLZILL(tuxSpinner, i);
        frameLayout.addView(tuxSpinner);
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView2, new ViewGroup.MarginLayoutParams(-1, -1));
        C419910GdJ c419910GdJ2 = c19723912Ez.LJ;
        if (c419910GdJ2 != null) {
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ2.LJ = Integer.valueOf(yp(c19723912Ez.LIZ));
        }
        tuxIconView2.setTuxIcon(c19723912Ez.LJ);
        if (c19723912Ez.LJIIIZ) {
            i2 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        frameLayout.addView(tuxIconView2);
        C786410Ut5.O7(frameLayout, new ACListenerS161S0100000_27(c19723912Ez, 79));
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void op(com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem r26, boolean r27, boolean r28, boolean r29, int r30) {
        /*
            Method dump skipped, instruction units count: 2167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem.op(com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem, boolean, boolean, boolean, int):void");
    }
}
