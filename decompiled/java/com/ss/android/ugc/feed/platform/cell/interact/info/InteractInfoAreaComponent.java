package com.ss.android.ugc.feed.platform.cell.interact.info;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C098300Yr;
import X.C0CNO;
import X.C0RDX;
import X.C0RJ3;
import X.C0RJN;
import X.C0RMV;
import X.C0RPE;
import X.C0RPF;
import X.C0RPI;
import X.C0RPJ;
import X.C0RPK;
import X.C0RPN;
import X.C0RPT;
import X.C0RPV;
import X.C0RPZ;
import X.C0RQ2;
import X.C0RQ6;
import X.C0RQN;
import X.C0RQO;
import X.C0RR7;
import X.C0RRI;
import X.C0RRN;
import X.C0RUJ;
import X.C0SKM;
import X.C0X35;
import X.C13LE;
import X.C1558520qew;
import X.C19EG;
import X.C2765015f;
import X.C289670BWz;
import X.C452501pT;
import X.C692070RCr;
import X.C692090RCt;
import X.C693360RHq;
import X.C693480RIc;
import X.C693650RIt;
import X.C694300RLg;
import X.C694330RLj;
import X.C695660RQm;
import X.C695730RQt;
import X.C695780RQy;
import X.C698920RbG;
import X.C698930RbH;
import X.C715260S3w;
import X.C720670SOr;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.EnumC697300RWu;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC691660RBc;
import X.InterfaceC710220RtU;
import X.ViewOnLayoutChangeListenerC718830SHp;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.ab.UnifyTouchDelegateScope;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaViewAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.SentinelSpaceTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomDescLabelContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractInfoAreaComponent extends BaseContainer<VContainerProtocol, InteractInfoAreaComponent> implements InteractInfoAreaAttachAbility, AreaContainerProtocol, C0RRN, C0RUJ, C0RQO, InterfaceC1554640qYg {
    public final /* synthetic */ C693650RIt LLJL = new C693650RIt();
    public final C0RPZ LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C0RPK LLJLL;
    public C0RPE LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C0RQ6 LLJZIJLIL;
    public C692090RCt LLL;
    public final List<C0RPN> LLLF;

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
        return "left_container";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2012153696) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final String s81() {
        return "left_container";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final int un1() {
        int[] iArr = new int[2];
        LJJIJL().getLocationOnScreen(iArr);
        return iArr[1];
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final void Kl2() {
        C694330RLj.LIZ.getClass();
        if (C694330RLj.LIZ()) {
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            C19EG c19egLIZ = c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZ() : null;
            C724270Sb3 c724270Sb3 = this.LLJI;
            String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
            C724270Sb3 c724270Sb32 = this.LLJI;
            boolean zLIZIZ = C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str);
            C01GW c01gw = C695730RQt.LIZ;
            C0RJN c0rjnLIZIZ2 = jm().LIZIZ();
            C19EG c19egLIZ2 = c0rjnLIZIZ2 != null ? c0rjnLIZIZ2.LIZ() : null;
            C724270Sb3 c724270Sb33 = this.LLJI;
            String str2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType;
            C724270Sb3 c724270Sb34 = this.LLJI;
            C0CNO.LIZLLL(0L, new C0RPI(C695730RQt.LIZIZ(c19egLIZ2, ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme(), str2), this, zLIZIZ, LowScreenOptimizeAB.LJ()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final Rect PR1() {
        C695660RQm c695660RQm = C695660RQm.LIZ;
        View viewFindViewById = LJJIJL().findViewById(R.id.fmv);
        c695660RQm.getClass();
        return C695660RQm.LIZIZ(viewFindViewById);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final Rect Zl() {
        return C695660RQm.LIZ(C695660RQm.LIZ, LJJIJL());
    }

    @Override // X.C0RUJ
    public final void lj() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLILLLLZIIL.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AwS62S1000000_11("left_container", 11));
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return C098300Yr.LIZ("left_container");
    }

    @Override // X.C0RRN
    public final void pf() {
        C0CNO.LIZLLL(0L, new AwS555S0100000_11(this, 1231));
    }

    @Override // X.C0RRN
    public final boolean v9() {
        InteractBottomAreaViewAbility interactBottomAreaViewAbility = (InteractBottomAreaViewAbility) this.LLJLLL.getValue();
        return interactBottomAreaViewAbility != null && interactBottomAreaViewAbility.v9();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final void w5() {
        C0RPK c0rpk = this.LLJLL;
        if (c0rpk != null) {
            c0rpk.w5();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C01GW c01gw = C692070RCr.LIZ;
        this.LLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractInfoAreaComponent", "iterateBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZ(this.LLL, String.valueOf(jm().hashCode()), null, null);
    }

    public InteractInfoAreaComponent() {
        this.LLJLIL = new C0RPZ(!(((Number) C289670BWz.LIZ.getValue()).intValue() == 1), true, LowScreenOptimizeAB.LIZJ().operatorRefactor);
        this.LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C694300RLg());
        this.LLJLLL = C452501pT.LIZIZ(new C0RJ3(this));
        this.LLJZ = C452501pT.LIZ(EnumC452301pR.NONE, new C693360RHq(this));
        this.LLJZIJLIL = C0RQ6.INTEARCT_INFO_AREA_COMPONENT;
        this.LLLF = new ArrayList();
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

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent.LJL():void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        if (C0RR7.LIZ() || LowScreenOptimizeAB.LJ() || C695730RQt.LIZ() || C0SKM.LIZ()) {
            LJJIJL().removeOnLayoutChangeListener(this.LLJLL);
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

    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent.unBind():void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLJZIJLIL;
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final void T92(ViewOnLayoutChangeListenerC718830SHp viewOnLayoutChangeListenerC718830SHp) {
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null) {
            viewLJJIJL.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC718830SHp);
            viewLJJIJL.addOnLayoutChangeListener(viewOnLayoutChangeListenerC718830SHp);
        }
    }

    @Override // X.C0RRN
    public final void Yh(View view) {
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                if ((abstractC738140SxQ instanceof BaseCellContentComponent) && Intrinsics.LJFF(((ReusedUIAssem) abstractC738140SxQ).LJJIJL(), view)) {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final void Z92(C0RPN c0rpn) {
        ((ArrayList) this.LLLF).add(c0rpn);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent.tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("InteractInfoAreaComponent.onViewCreated", new C0RPF(this));
        C0X35.LIZJ("feed_ui_to_video", "ui_to_video_commit_info_area");
        if (!C0RR7.LIZ() && !LowScreenOptimizeAB.LJ() && !C695730RQt.LIZ()) {
            if (C0SKM.LIZ()) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL instanceof LinearLayout) {
                    C0RPE c0rpe = new C0RPE((LinearLayout) viewLJJIJL, null);
                    this.LLJLLIL = c0rpe;
                    this.LLJLL = c0rpe;
                    viewLJJIJL.addOnLayoutChangeListener(c0rpe);
                }
            }
        } else {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) viewLJJIJL2;
                this.LLJLL = new C0RRI(linearLayout, this);
                if (C0SKM.LIZ()) {
                    C0RPE c0rpe2 = new C0RPE(linearLayout, this.LLJLL);
                    this.LLJLLIL = c0rpe2;
                    this.LLJLL = c0rpe2;
                }
                viewLJJIJL2.addOnLayoutChangeListener(this.LLJLL);
            }
        }
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractInfoAreaComponent", "onViewCreated");
        C0RQ2 c0rq2 = C0RQ2.LIZ;
        C0RPZ c0rpz = this.LLJLIL;
        c0rq2.getClass();
        final View viewLJJIJL3 = LJJIJL();
        final C0RPT c0rpt = new C0RPT(new C0RPJ(this));
        c0rpz.LJIIIZ = new C0RPV(viewLJJIJL3, c0rpt) { // from class: X.0RPP
            public final Set<String> LIZJ;

            @Override // X.C0RPV
            public final C695280RPa LIZIZ(String str) {
                int i;
                C01GW<Integer> c01gw2 = ConstraintSizeVM.LL;
                int iLIZ = C693770RJf.LIZ();
                if (Intrinsics.LJFF(str, VideoBottomDescLabelContainer.class.getCanonicalName())) {
                    i = ConstraintSizeVM.LLIZ;
                } else {
                    i = 0;
                }
                int i2 = iLIZ - i;
                if (this.LIZJ.contains(str)) {
                    i2 = 0;
                }
                return new C695280RPa(i2, 0, 13);
            }

            {
                String canonicalName;
                C19719912Dl c19719912DlLJIILL;
                C19719912Dl c19719912DlLJJI;
                String[] strArr = new String[10];
                strArr[0] = "ad4ad_label";
                strArr[1] = "ad_product_tile_view_stub";
                strArr[2] = FeedBottomButtonContainer.class.getCanonicalName();
                strArr[3] = FcpMetaTagContainer.class.getCanonicalName();
                strArr[4] = VideoTagContainer.class.getCanonicalName();
                strArr[5] = "intro_ll_padding";
                strArr[6] = "ad4ad_button";
                IAdComponentService iAdComponentService = (IAdComponentService) ServiceManager.get().getService(IAdComponentService.class);
                String canonicalName2 = null;
                if (iAdComponentService != null && (c19719912DlLJJI = iAdComponentService.LJJI()) != null) {
                    canonicalName = C09R7.LIZ(c19719912DlLJJI).getCanonicalName();
                } else {
                    canonicalName = null;
                }
                strArr[7] = canonicalName;
                IAdComponentService iAdComponentService2 = (IAdComponentService) ServiceManager.get().getService(IAdComponentService.class);
                if (iAdComponentService2 != null && (c19719912DlLJIILL = iAdComponentService2.LJIILL()) != null) {
                    canonicalName2 = C09R7.LIZ(c19719912DlLJIILL).getCanonicalName();
                }
                strArr[8] = canonicalName2;
                strArr[9] = SentinelSpaceTrigger.class.getCanonicalName();
                this.LIZJ = C093Y.LJ(strArr);
            }
        };
        C0RQ2.LIZ(this, this.LLJLIL);
        C0RMV.LIZIZ(this);
        if (LJJIJL() instanceof ViewGroup) {
            C693480RIc.LIZ(this, this.LLJLIL, (ViewGroup) LJJIJL());
        }
        C0RMV.LIZ(this);
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
        C2765015f.LIZ("InteractInfoAreaComponent.onViewCreated", new AwS555S0100000_11(this, 1232));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    public final void op(boolean z) {
        C698920RbG c698920RbGRy0;
        C698930RbH c698930RbH;
        String str;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZ.getValue();
        if (interactAreaCommonAbility != null && (c698920RbGRy0 = interactAreaCommonAbility.Ry0()) != null) {
            TouchDelegate touchDelegate = c698920RbGRy0.LIZ.getTouchDelegate();
            String str2 = null;
            if ((touchDelegate instanceof C698930RbH) && (c698930RbH = (C698930RbH) touchDelegate) != null) {
                c698930RbH.LIZLLL = z;
                UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ = C695780RQy.LIZIZ();
                if (unifyTouchDelegateScopeLIZIZ != null) {
                    str = unifyTouchDelegateScopeLIZIZ.standardComponentStrategy;
                } else {
                    str = null;
                }
                c698930RbH.LJ = Intrinsics.LJFF(str, "touch_delegate_strategy");
                UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ2 = C695780RQy.LIZIZ();
                if (unifyTouchDelegateScopeLIZIZ2 != null) {
                    str2 = unifyTouchDelegateScopeLIZIZ2.normalComponentStrategy;
                }
                c698930RbH.LJFF = Intrinsics.LJFF(str2, "touch_delegate_strategy");
            }
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final void xE1(int i) {
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC710220RtU interfaceC710220RtUYn;
        Aweme aweme;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C0RPE c0rpe = this.LLJLLIL;
        if (c0rpe != null) {
            LinearLayout linearLayout = c0rpe.LL;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            String aid = null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.d6(linearLayout, marginLayoutParams);
            }
            if (c0rpe.LLILZIL == null) {
                InterfaceC665370Q7z interfaceC665370Q7z = c0rpe.LLILZ;
                if (interfaceC665370Q7z != null) {
                    iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPhotoSlidesAbility.class, null);
                } else {
                    iPhotoSlidesAbility = null;
                }
                c0rpe.LLILZIL = iPhotoSlidesAbility;
                if (iPhotoSlidesAbility != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null) {
                    VideoItemParams videoItemParams = c0rpe.LLILZLL;
                    if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                        aid = aweme.getAid();
                    }
                    interfaceC710220RtUYn.LJIIIIZZ(c0rpe.LL, aid);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility
    public final void yF1(ViewOnLayoutChangeListenerC718830SHp viewOnLayoutChangeListenerC718830SHp) {
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null) {
            viewLJJIJL.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC718830SHp);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
        this.LLJLIL.LIZLLL(LJJIJL(), reusedUIAssem);
        function0.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "InteractInfoAreaComponent", "onHolderSelected");
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

    @Override // X.C0RRN
    public final boolean ln(int i, View view) {
        for (C0RPN c0rpn : (ArrayList) this.LLLF) {
            if (c0rpn.Sc(view)) {
                c0rpn.Cm(i, view);
                return true;
            }
        }
        return false;
    }
}
