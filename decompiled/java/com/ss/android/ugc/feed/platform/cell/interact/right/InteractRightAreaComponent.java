package com.ss.android.ugc.feed.platform.cell.interact.right;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C07CT;
import X.C098300Yr;
import X.C09R7;
import X.C09RB;
import X.C09RD;
import X.C0B16;
import X.C0HHT;
import X.C0R93;
import X.C0RD6;
import X.C0RDX;
import X.C0RIF;
import X.C0RJ4;
import X.C0RJ5;
import X.C0RJN;
import X.C0RL5;
import X.C0RLC;
import X.C0RLD;
import X.C0RLE;
import X.C0RMV;
import X.C0RPT;
import X.C0RPV;
import X.C0RPZ;
import X.C0RQ6;
import X.C0RQN;
import X.C0RQO;
import X.C0RRV;
import X.C0RRW;
import X.C0RSD;
import X.C0RUJ;
import X.C0SUC;
import X.C0SXF;
import X.C1133920fc6;
import X.C1360460lVU;
import X.C13IQ;
import X.C13LE;
import X.C14TF;
import X.C1558520qew;
import X.C1601110rld;
import X.C1637806bA;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1AV2;
import X.C1AVH;
import X.C2175231ABd;
import X.C2180521AVm;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2277711EDh;
import X.C2765015f;
import X.C281310B0v;
import X.C288990BUj;
import X.C305240Bxq;
import X.C452501pT;
import X.C588450N6d;
import X.C630730OoZ;
import X.C692070RCr;
import X.C692090RCt;
import X.C693350RHp;
import X.C693480RIc;
import X.C693650RIt;
import X.C695330RPf;
import X.C695340RPg;
import X.C695350RPh;
import X.C695360RPi;
import X.C695380RPk;
import X.C695390RPl;
import X.C695400RPm;
import X.C695410RPn;
import X.C695660RQm;
import X.C697790RYr;
import X.C709020RrY;
import X.C715260S3w;
import X.C720670SOr;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC697290RWt;
import X.EnumC697300RWu;
import X.EnumC697820RYu;
import X.InterfaceC1350790lFt;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import X.InterfaceC709040Rra;
import X.ViewOnLayoutChangeListenerC738720SyM;
import X.ViewOnLayoutChangeListenerC738740SyO;
import Y.AComparatorS28S0000000_9;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.assem.clearmode.ExitClearModeAssem;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.dislike.DislikeAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoTrigger;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoTriggerRoof;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomAssemProvider;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaViewAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.view.InteractAreaRootLayout;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollButtonAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollButtonAssemV2;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollButtonAssemV2NoText;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollSwitchAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractRightAreaComponent extends BaseContainer<VContainerProtocol, InteractRightAreaComponent> implements InteractRightAreaAttachAbility, AreaContainerProtocol, C0RUJ, C0RQO, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public final /* synthetic */ C693650RIt LLJL = new C693650RIt();
    public final InterfaceC1731706qJ LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public ViewGroup LLJLLIL;
    public ViewOnLayoutChangeListenerC738720SyM LLJLLL;
    public View LLJZ;
    public ViewOnLayoutChangeListenerC738740SyO LLJZIJLIL;
    public int LLL;
    public View LLLF;
    public C630730OoZ LLLFF;
    public TouchDelegate LLLFFI;
    public View LLLFZ;
    public final List<C588450N6d> LLLI;
    public final C0RPZ LLLII;
    public final C0RQ6 LLLIIII;
    public C692090RCt LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InteractRightAreaComponent.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InteractRightAreaComponent() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C0RIF(c19719912DlLIZ), null, new C695400RPm());
        this.LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C695410RPn());
        this.LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1285));
        this.LLLI = new ArrayList();
        this.LLLII = new C0RPZ(false, false, LowScreenOptimizeAB.LIZJ().operatorRefactor);
        this.LLLIIII = C0RQ6.INTEARCT_RIGHT_AREA_COMPONENT;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final C720670SOr D42() {
        int[] iArr = new int[2];
        LJJIJL().getLocationInWindow(iArr);
        return new C720670SOr(LJJIJL().getWidth(), LJJIJL().getHeight(), iArr);
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Lk1(AwS590S0100000_11 awS590S0100000_11) {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "right_container";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final int[] cB1() {
        int[] iArr = new int[2];
        View viewFindViewById = LJJIJL().findViewById(R.id.uzq);
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -902258490) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final String s81() {
        return "right_container";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0OoZ, android.view.TouchDelegate] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent.Ap():void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final Rect Hs2() {
        C695660RQm c695660RQm = C695660RQm.LIZ;
        View viewLJJIJL = LJJIJL();
        c695660RQm.getClass();
        return C695660RQm.LIZIZ(viewLJJIJL);
    }

    @Override // X.C0RQO
    public final String Ig() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0RQN.LIZIZ(c724270Sb3 != null ? c724270Sb3.LL : null, jm());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Rect Zl() {
        return C695660RQm.LIZ(C695660RQm.LIZ, LJJIJL());
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return C098300Yr.LIZ("right_container");
    }

    public final void sp() {
        View view;
        ViewGroup viewGroup;
        ViewOnLayoutChangeListenerC738720SyM viewOnLayoutChangeListenerC738720SyM = this.LLJLLL;
        if (viewOnLayoutChangeListenerC738720SyM != null && (viewGroup = this.LLJLLIL) != null) {
            viewGroup.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738720SyM);
        }
        ViewOnLayoutChangeListenerC738740SyO viewOnLayoutChangeListenerC738740SyO = this.LLJZIJLIL;
        if (viewOnLayoutChangeListenerC738740SyO != null && (view = this.LLJZ) != null) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738740SyO);
        }
        if (LJJIJL().getTranslationY() != 0.0f) {
            C786410Ut5.ed(LJJIJL(), 0.0f);
        }
        tp();
        for (C588450N6d c588450N6d : (ArrayList) this.LLLI) {
            c588450N6d.LIZ.setClipChildren(c588450N6d.LIZIZ);
            c588450N6d.LIZ.setClipToPadding(c588450N6d.LIZJ);
        }
        ((ArrayList) this.LLLI).clear();
        this.LLJLLIL = null;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLLFZ = null;
        this.LLL = 0;
    }

    public final void tp() {
        View view = this.LLLF;
        if ((view != null ? view.getTouchDelegate() : null) == this.LLLFF && view != null) {
            view.setTouchDelegate(this.LLLFFI);
        }
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C01GW c01gw = C692070RCr.LIZ;
        this.LLLIIIIL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractRightAreaComponent", "iterateBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZ(this.LLLIIIIL, String.valueOf(jm().hashCode()), null, null);
    }

    public final RightAreaContainerVM yp() {
        return (RightAreaContainerVM) this.LLJLIL.getValue(this, LLLIIIL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final View Fd2() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void H() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).H();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONUNSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).LJLLLL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Drawable bf2() {
        ImageView imageView = (ImageView) LJJIJL().findViewById(R.id.uzq);
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Pair<Integer, Integer> nQ2() {
        View viewFindViewById = LJJIJL().findViewById(R.id.uzq);
        if (viewFindViewById != null) {
            return new Pair<>(Integer.valueOf(viewFindViewById.getLayoutParams().height), Integer.valueOf(viewFindViewById.getLayoutParams().width));
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        sp();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).onDestroyView();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        long jLJFF = C0RQN.LJFF();
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONPARENTSET, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_UNBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final View y9() {
        if (Bo()) {
            return LJJIJL();
        }
        return null;
    }

    public final void zp() {
        ViewGroup viewGroup;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (C07CT.LIZ(c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZJ : null)) {
            InteractBottomAreaViewAbility interactBottomAreaViewAbility = (InteractBottomAreaViewAbility) this.LLJLL.getValue();
            View viewBE0 = interactBottomAreaViewAbility != null ? interactBottomAreaViewAbility.BE0() : null;
            if (!(viewBE0 instanceof ViewGroup) || (viewGroup = (ViewGroup) viewBE0) == null) {
                int i = this.LLL;
                if (i < 3) {
                    this.LLL = i + 1;
                    HandlerHook.viewPost(LJJIJL(), new ARunnableS109S0100000_9(this, 177));
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(this.LLJLLIL, viewGroup)) {
                return;
            }
            if (this.LLJLLIL != null) {
                sp();
            }
            if (((ArrayList) this.LLLI).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                View viewLJJIJL = LJJIJL();
                while (viewLJJIJL instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) viewLJJIJL;
                    arrayList.add(new C588450N6d(viewGroup2, viewGroup2.getClipChildren(), viewGroup2.getClipToPadding()));
                    if (viewLJJIJL instanceof InteractAreaRootLayout) {
                        break;
                    }
                    Object parent = viewGroup2.getParent();
                    viewLJJIJL = parent instanceof View ? (View) parent : null;
                }
                List<C588450N6d> list = this.LLLI;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) list).add(it2.next());
                }
            }
            for (C588450N6d c588450N6d : (ArrayList) this.LLLI) {
                c588450N6d.LIZ.setClipChildren(false);
                c588450N6d.LIZ.setClipToPadding(false);
            }
            this.LLJZIJLIL = new ViewOnLayoutChangeListenerC738740SyO(this, 6);
            ViewOnLayoutChangeListenerC738720SyM viewOnLayoutChangeListenerC738720SyM = new ViewOnLayoutChangeListenerC738720SyM(this, viewGroup, 0);
            this.LLJLLL = viewOnLayoutChangeListenerC738720SyM;
            this.LLJLLIL = viewGroup;
            viewGroup.addOnLayoutChangeListener(viewOnLayoutChangeListenerC738720SyM);
            op(viewGroup);
            Ap();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        sp();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLLIIII;
    }

    public static View up(View view) {
        if (!view.isShown() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        if (view instanceof ViewGroup) {
            Iterator<Object> it2 = new C1133920fc6(C09RB.LJIIIZ(new C09RD((ViewGroup) view), AFwS240S0000000_9.get$arr$(677)), new AComparatorS28S0000000_9(9)).iterator();
            while (it2.hasNext()) {
                View viewUp = up((View) it2.next());
                if (viewUp != null) {
                    return viewUp;
                }
            }
        }
        if (!view.hasOnClickListeners() && !view.isClickable()) {
            return null;
        }
        return view;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C2277711EDh.LIZIZ.LJJJJIZL(view);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Kc2(View.OnLayoutChangeListener onLayoutChangeListener) {
        LJJIJL().removeOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Ko2(View.OnLayoutChangeListener onLayoutChangeListener) {
        LJJIJL().addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        Boolean bool = Boolean.TRUE;
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ISACTIVE, jLJFF);
        }
        if ((bool instanceof Boolean) && bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_enter_clear_mode", new C695330RPf(this));
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String aid = videoItemParams.getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_INTERACT_RIGHT_CREATE;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.PUTIFABSENT;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        C2765015f.LIZJ("InteractRightAreaComponent.onBind", new C695340RPg(videoItemParams, this));
        C2765015f.LIZ("InteractRightAreaComponent.onBind", new C695350RPh(videoItemParams, this));
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        if (iPostModeService == null || !iPostModeService.LJIILIIL(videoItemParams.getAweme(), videoItemParams.mEventType)) {
            Bs2(null, -1);
        }
        String aid2 = videoItemParams.getAweme().getAid();
        String end = enumC697290RWt.getEnd();
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid2, end, null, null, null, null);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Object obj2;
        boolean zIsFromEffectDiscover;
        Object obj3;
        String str;
        Object obj4;
        C2189821An6 c2189821An6;
        Object obj5;
        Object obj6;
        Object obj7;
        String from;
        Object obj8;
        C2189821An6 c2189821An62;
        ICommonFeedCustomLogic iCommonFeedCustomLogic;
        Object obj9;
        VideoMusicCoverAssem videoMusicCoverAssemLIZ;
        C2189821An6 c2189821An63;
        C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLJJJIL;
        Object objNewInstance;
        C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLJJJIL2;
        Object objNewInstance2;
        Context context;
        Context context2;
        Object obj10;
        String str2;
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("InteractRightAreaComponent.onViewCreated", new C0RJ5(this));
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractRightAreaComponent", "onViewCreated");
        C2189821An6 c2189821An64 = null;
        C723830SaL.LIZ(this, null, new C693350RHp(this));
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        zp();
        C695380RPk c695380RPk = C695380RPk.LIZ;
        C0RPZ c0rpz = this.LLLII;
        c695380RPk.getClass();
        final View viewLJJIJL = LJJIJL();
        final C0RPT c0rpt = new C0RPT(new C695360RPi(this));
        c0rpz.LJIIIZ = new C0RPV(viewLJJIJL, c0rpt) { // from class: X.0RPS
            @Override // X.C0RPV
            public final C695280RPa LIZIZ(String str3) {
                return new C695280RPa(0, 0, 15);
            }
        };
        C0RPZ c0rpz2 = this.LLLII;
        if (C1601110rld.LIZ() && C281310B0v.LIZ() && jm().LIZ == 1) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj10 = c724270Sb32.LL;
            } else {
                obj10 = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) obj10;
            if (videoItemParams != null) {
                str2 = videoItemParams.mEventType;
            } else {
                str2 = null;
            }
            if (C0R93.LIZLLL(str2)) {
                C2175231ABd.LIZ.getClass();
                if (C2175231ABd.LIZ()) {
                    ReportViewAssem reportViewAssem = new ReportViewAssem();
                    IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService != null) {
                        iFeedDebugService.LJIJJ();
                    }
                    ((ArrayList) C693480RIc.LIZIZ).add(reportViewAssem);
                }
            }
            Context context3 = getContext();
            if ((context3 != null && !C0SXF.LJIL(context3)) || C305240Bxq.LIZ.LIZJ()) {
                FeedAvatarAssemWrap feedAvatarAssemWrap = new FeedAvatarAssemWrap();
                IFeedDebugService iFeedDebugService2 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService2 != null) {
                    iFeedDebugService2.LJIJJ();
                }
                ((ArrayList) C693480RIc.LIZIZ).add(feedAvatarAssemWrap);
            }
            BaseFeedPageParams baseFeedPageParams = jm().LJ;
            if (baseFeedPageParams != null) {
                C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, baseFeedPageParams, 121));
            }
            VideoDiggAssem videoDiggAssem = new VideoDiggAssem();
            IFeedDebugService iFeedDebugService3 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService3 != null) {
                iFeedDebugService3.LJIJJ();
            }
            ArrayList arrayList = (ArrayList) C693480RIc.LIZIZ;
            arrayList.add(videoDiggAssem);
            VideoShareAssem videoShareAssem = new VideoShareAssem();
            IFeedDebugService iFeedDebugService4 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService4 != null) {
                iFeedDebugService4.LJIJJ();
            }
            arrayList.add(videoShareAssem);
            ExitClearModeAssem exitClearModeAssem = new ExitClearModeAssem();
            IFeedDebugService iFeedDebugService5 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService5 != null) {
                iFeedDebugService5.LJIJJ();
            }
            arrayList.add(exitClearModeAssem);
        } else {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            Context context4 = getContext();
            if (context4 != null) {
                zIsFromEffectDiscover = C0SUC.LIZ(context4).isFromEffectDiscover();
            } else {
                zIsFromEffectDiscover = false;
            }
            BaseFeedPageParams baseFeedPageParams2 = jm().LJ;
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            } else {
                obj3 = null;
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) obj3;
            if (videoItemParams2 != null) {
                str = videoItemParams2.mEventType;
            } else {
                str = null;
            }
            if (C0R93.LIZLLL(str)) {
                C2175231ABd.LIZ.getClass();
                if (C2175231ABd.LIZ()) {
                    ReportViewAssem reportViewAssem2 = new ReportViewAssem();
                    IFeedDebugService iFeedDebugService6 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService6 != null) {
                        iFeedDebugService6.LJIJJ();
                    }
                    ((ArrayList) C693480RIc.LIZIZ).add(reportViewAssem2);
                }
            }
            if (((Boolean) C0B16.LIZ.getValue()).booleanValue() && (context2 = getContext()) != null && !C0SXF.LJIL(context2)) {
                TakoTriggerRoof takoTriggerRoof = new TakoTriggerRoof();
                IFeedDebugService iFeedDebugService7 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService7 != null) {
                    iFeedDebugService7.LJIJJ();
                }
                ((ArrayList) C693480RIc.LIZIZ).add(takoTriggerRoof);
            }
            InterfaceC1350790lFt interfaceC1350790lFtLJIILL = C14TF.LIZIZ.LJIILL();
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj4 = c724270Sb35.LL;
            } else {
                obj4 = null;
            }
            BaseFeedPageParams baseFeedPageParams3 = ((VideoItemParams) obj4).baseFeedPageParams;
            if (baseFeedPageParams3 != null) {
                c2189821An6 = baseFeedPageParams3.param;
            } else {
                c2189821An6 = null;
            }
            if (interfaceC1350790lFtLJIILL.LJI(c2189821An6) && (context = getContext()) != null && !C0SXF.LJIL(context)) {
                TakoTrigger takoTrigger = new TakoTrigger();
                IFeedDebugService iFeedDebugService8 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService8 != null) {
                    iFeedDebugService8.LJIJJ();
                }
                ((ArrayList) C693480RIc.LIZIZ).add(takoTrigger);
            }
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIILL().LLIZ(nJ2().pageType) == C0RRW.TOP) {
                C0RRV c0rrvLJJIJIIJI = c19252910Tv.LIZLLL().LJIILL().LJJIJIIJI();
                if (c0rrvLJJIJIIJI == C0RRV.SWITCH) {
                    AutoScrollSwitchAssem autoScrollSwitchAssem = new AutoScrollSwitchAssem();
                    IFeedDebugService iFeedDebugService9 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService9 != null) {
                        iFeedDebugService9.LJIJJ();
                    }
                    ((ArrayList) C693480RIc.LIZIZ).add(autoScrollSwitchAssem);
                } else if (c0rrvLJJIJIIJI == C0RRV.BUTTON_2) {
                    AutoScrollButtonAssemV2 autoScrollButtonAssemV2 = new AutoScrollButtonAssemV2();
                    IFeedDebugService iFeedDebugService10 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService10 != null) {
                        iFeedDebugService10.LJIJJ();
                    }
                    ((ArrayList) C693480RIc.LIZIZ).add(autoScrollButtonAssemV2);
                } else if (c0rrvLJJIJIIJI == C0RRV.BUTTON_2_NO_TEXT) {
                    AutoScrollButtonAssemV2NoText autoScrollButtonAssemV2NoText = new AutoScrollButtonAssemV2NoText();
                    IFeedDebugService iFeedDebugService11 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService11 != null) {
                        iFeedDebugService11.LJIJJ();
                    }
                    ((ArrayList) C693480RIc.LIZIZ).add(autoScrollButtonAssemV2NoText);
                } else {
                    AutoScrollButtonAssem autoScrollButtonAssem = new AutoScrollButtonAssem();
                    IFeedDebugService iFeedDebugService12 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService12 != null) {
                        iFeedDebugService12.LJIJJ();
                    }
                    ((ArrayList) C693480RIc.LIZIZ).add(autoScrollButtonAssem);
                }
            }
            C2277711EDh.LIZIZ.LJIIZILJ(getContext(), c0rpz2);
            Context context5 = getContext();
            if ((context5 != null && !C0SXF.LJIL(context5)) || C305240Bxq.LIZ.LIZJ()) {
                FeedAvatarAssemWrap feedAvatarAssemWrap2 = new FeedAvatarAssemWrap();
                IFeedDebugService iFeedDebugService13 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService13 != null) {
                    iFeedDebugService13.LJIJJ();
                }
                ((ArrayList) C693480RIc.LIZIZ).add(feedAvatarAssemWrap2);
            }
            if (baseFeedPageParams2 != null) {
                C723830SaL.LIZ(this, null, new C0RL5(this, baseFeedPageParams2));
            }
            VideoDiggAssem videoDiggAssem2 = new VideoDiggAssem();
            IFeedDebugService iFeedDebugService14 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService14 != null) {
                iFeedDebugService14.LJIJJ();
            }
            ArrayList arrayList2 = (ArrayList) C693480RIc.LIZIZ;
            arrayList2.add(videoDiggAssem2);
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj5 = c724270Sb36.LL;
            } else {
                obj5 = null;
            }
            if (!C695380RPk.LIZ(((VideoItemParams) obj5).getAweme()) && C695390RPl.LIZIZ) {
                DislikeAssem dislikeAssem = new DislikeAssem();
                IFeedDebugService iFeedDebugService15 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService15 != null) {
                    iFeedDebugService15.LJIJJ();
                }
                arrayList2.add(dislikeAssem);
            }
            C01GW c01gw2 = C0RSD.LIZ;
            if (((Number) c01gw2.getValue()).intValue() == 1 && (c13iqLJJJIL2 = C1360460lVU.LIZIZ.LJJJIL()) != null && (objNewInstance2 = C09R7.LIZ(c13iqLJJJIL2).newInstance()) != null) {
                IFeedDebugService iFeedDebugService16 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService16 != null) {
                    iFeedDebugService16.LJIJJ();
                }
                arrayList2.add(objNewInstance2);
            }
            VideoCommentAssem videoCommentAssem = new VideoCommentAssem();
            IFeedDebugService iFeedDebugService17 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService17 != null) {
                iFeedDebugService17.LJIJJ();
            }
            arrayList2.add(videoCommentAssem);
            if (((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() > 0 && !C288990BUj.LIZ()) {
                VideoFavoriteAssem videoFavoriteAssem = new VideoFavoriteAssem();
                IFeedDebugService iFeedDebugService18 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService18 != null) {
                    iFeedDebugService18.LJIJJ();
                }
                arrayList2.add(videoFavoriteAssem);
            }
            C724270Sb3 c724270Sb37 = this.LLJI;
            if (c724270Sb37 != null) {
                obj6 = c724270Sb37.LL;
            } else {
                obj6 = null;
            }
            if (!C695380RPk.LIZ(((VideoItemParams) obj6).getAweme()) && C695390RPl.LIZJ) {
                DislikeAssem dislikeAssem2 = new DislikeAssem();
                IFeedDebugService iFeedDebugService19 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService19 != null) {
                    iFeedDebugService19.LJIJJ();
                }
                arrayList2.add(dislikeAssem2);
            }
            if (((Number) c01gw2.getValue()).intValue() == 2 && (c13iqLJJJIL = C1360460lVU.LIZIZ.LJJJIL()) != null && (objNewInstance = C09R7.LIZ(c13iqLJJJIL).newInstance()) != null) {
                IFeedDebugService iFeedDebugService20 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService20 != null) {
                    iFeedDebugService20.LJIJJ();
                }
                arrayList2.add(objNewInstance);
            }
            ICommonFeedCustomLogic iCommonFeedCustomLogic2 = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
            if (iCommonFeedCustomLogic2 != null) {
                iCommonFeedCustomLogic2.LIZ();
                VideoShareAssem videoShareAssem2 = new VideoShareAssem();
                IFeedDebugService iFeedDebugService21 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService21 != null) {
                    iFeedDebugService21.LJIJJ();
                }
                arrayList2.add(videoShareAssem2);
            }
            C724270Sb3 c724270Sb38 = this.LLJI;
            if (c724270Sb38 != null) {
                obj7 = c724270Sb38.LL;
            } else {
                obj7 = null;
            }
            if (!C695380RPk.LIZ(((VideoItemParams) obj7).getAweme()) && C695390RPl.LIZLLL) {
                DislikeAssem dislikeAssem3 = new DislikeAssem();
                IFeedDebugService iFeedDebugService22 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService22 != null) {
                    iFeedDebugService22.LJIJJ();
                }
                arrayList2.add(dislikeAssem3);
            }
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = new BaseCellPlaceHolderComponent("ad_descriptive_fold_button_layout");
            IFeedDebugService iFeedDebugService23 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService23 != null) {
                iFeedDebugService23.LJIJJ();
            }
            arrayList2.add(baseCellPlaceHolderComponent);
            if (baseFeedPageParams2 != null && (c2189821An63 = baseFeedPageParams2.param) != null) {
                from = c2189821An63.getFrom();
            } else {
                from = null;
            }
            if (!Intrinsics.LJFF("from_publish_add_video", from) && baseFeedPageParams2 != null && (c2189821An62 = baseFeedPageParams2.param) != null && !c2189821An62.isFromDuetModeDetail() && !zIsFromEffectDiscover && (iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null)) != null) {
                C724270Sb3 c724270Sb39 = this.LLJI;
                if (c724270Sb39 != null) {
                    obj9 = c724270Sb39.LL;
                } else {
                    obj9 = null;
                }
                iCommonFeedCustomLogic.LJIIJ();
                ICommonFeedCustomAssemProvider iCommonFeedCustomAssemProvider = (ICommonFeedCustomAssemProvider) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomAssemProvider.class, false, false, false, 14, null);
                if (iCommonFeedCustomAssemProvider != null && (videoMusicCoverAssemLIZ = iCommonFeedCustomAssemProvider.LIZ()) != null) {
                    IFeedDebugService iFeedDebugService24 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService24 != null) {
                        iFeedDebugService24.LJIJJ();
                    }
                    arrayList2.add(videoMusicCoverAssemLIZ);
                }
            }
            ExitClearModeAssem exitClearModeAssem2 = new ExitClearModeAssem();
            IFeedDebugService iFeedDebugService25 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService25 != null) {
                iFeedDebugService25.LJIJJ();
            }
            arrayList2.add(exitClearModeAssem2);
            if (c19252910Tv.LIZLLL().LJIILL().LLIZ(nJ2().pageType) == C0RRW.BOTTOM) {
                C0RRV c0rrvLJJIJIIJI2 = c19252910Tv.LIZLLL().LJIILL().LJJIJIIJI();
                if (c0rrvLJJIJIIJI2 == C0RRV.SWITCH) {
                    AutoScrollSwitchAssem autoScrollSwitchAssem2 = new AutoScrollSwitchAssem();
                    IFeedDebugService iFeedDebugService26 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService26 != null) {
                        iFeedDebugService26.LJIJJ();
                    }
                    arrayList2.add(autoScrollSwitchAssem2);
                } else if (c0rrvLJJIJIIJI2 == C0RRV.BUTTON_2) {
                    AutoScrollButtonAssemV2 autoScrollButtonAssemV22 = new AutoScrollButtonAssemV2();
                    IFeedDebugService iFeedDebugService27 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService27 != null) {
                        iFeedDebugService27.LJIJJ();
                    }
                    arrayList2.add(autoScrollButtonAssemV22);
                } else if (c0rrvLJJIJIIJI2 == C0RRV.BUTTON_2_NO_TEXT) {
                    AutoScrollButtonAssemV2NoText autoScrollButtonAssemV2NoText2 = new AutoScrollButtonAssemV2NoText();
                    IFeedDebugService iFeedDebugService28 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService28 != null) {
                        iFeedDebugService28.LJIJJ();
                    }
                    arrayList2.add(autoScrollButtonAssemV2NoText2);
                } else {
                    AutoScrollButtonAssem autoScrollButtonAssem2 = new AutoScrollButtonAssem();
                    IFeedDebugService iFeedDebugService29 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService29 != null) {
                        iFeedDebugService29.LJIJJ();
                    }
                    arrayList2.add(autoScrollButtonAssem2);
                }
            }
            ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
            if (iTakoService != null) {
                C724270Sb3 c724270Sb310 = this.LLJI;
                if (c724270Sb310 != null) {
                    obj8 = c724270Sb310.LL;
                } else {
                    obj8 = null;
                }
                BaseFeedPageParams baseFeedPageParams4 = ((VideoItemParams) obj8).baseFeedPageParams;
                if (baseFeedPageParams4 != null) {
                    c2189821An64 = baseFeedPageParams4.param;
                }
                ReusedUIAssem<? extends C03H5> reusedUIAssemLJLJJLL = iTakoService.LJLJJLL(c2189821An64);
                if (reusedUIAssemLJLJJLL != null) {
                    IFeedDebugService iFeedDebugService30 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                    if (iFeedDebugService30 != null) {
                        iFeedDebugService30.LJIJJ();
                    }
                    arrayList2.add(reusedUIAssemLJLJJLL);
                }
            }
        }
        C0RMV.LIZIZ(this);
        if (LJJIJL() instanceof ViewGroup) {
            C693480RIc.LIZ(this, this.LLLII, (ViewGroup) LJJIJL());
        }
        C0RMV.LIZ(this);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0RPr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj11) {
                return ((C695520RPy) obj11).LLILLJJLI;
            }
        }, null, new C0RLD(), 6);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0RPt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj11) {
                return ((C695520RPy) obj11).LL;
            }
        }, null, new C0RLC(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0RHs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj11) {
                return ((C709790Rsn) obj11).LLILLL;
            }
        }, null, new C0RLE(view), 6);
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
        C2765015f.LIZ("InteractRightAreaComponent.onViewCreated", new C0RJ4(this));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    public final void op(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.ely);
        if (Intrinsics.LJFF(viewFindViewById, this.LLJZ)) {
            return;
        }
        View view = this.LLJZ;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLJZIJLIL);
        }
        this.LLJZ = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(this.LLJZIJLIL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void wR(int i) {
        C2180521AVm.LIZLLL(LJJIJL(), i, (C1AV2) C1AVH.LJI.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final void Bs2(InterfaceC709040Rra interfaceC709040Rra, int i) {
        C709020RrY c709020RrY;
        if (!Bo()) {
            return;
        }
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof C709020RrY) && (c709020RrY = (C709020RrY) viewLJJIJL) != null) {
            InterfaceC709040Rra interfaceC709040Rra2 = c709020RrY.LLJJIJIIJIL;
            c709020RrY.LLIZ = interfaceC709040Rra;
            if (i < 0) {
                i = c709020RrY.LLILZLL;
            }
            c709020RrY.LLIZLLLIL = i;
            c709020RrY.LLJILJILJ = false;
            c709020RrY.LLJILLL = false;
            c709020RrY.LLJJIJIIJIL = null;
            c709020RrY.LLJJIJIL = false;
            c709020RrY.LLJJJJ = null;
            if (interfaceC709040Rra2 != null && interfaceC709040Rra2 != interfaceC709040Rra) {
                interfaceC709040Rra2.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
        this.LLLII.LIZLLL(LJJIJL(), reusedUIAssem);
        function0.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractRightAreaComponent", "onHolderSelected");
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        C01GW c01gw2 = C692070RCr.LIZ;
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }
}
