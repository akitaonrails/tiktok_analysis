package com.ss.android.ugc.feed.platform.cell.interact.biz;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0O0E;
import X.C0O0F;
import X.C0R93;
import X.C0RDX;
import X.C0RQN;
import X.C0RQO;
import X.C0RUJ;
import X.C1558520qew;
import X.C1591220rVg;
import X.C19719912Dl;
import X.C2187701Ajg;
import X.C2245741Cv6;
import X.C2765015f;
import X.C339190DRl;
import X.C452501pT;
import X.C585220MxM;
import X.C692070RCr;
import X.C692090RCt;
import X.C693230RHd;
import X.C693650RIt;
import X.C693660RIu;
import X.C693670RIv;
import X.C693680RIw;
import X.C715260S3w;
import X.C720670SOr;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC697300RWu;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class BizTopAreaComponent extends BaseCellContentComponent<BizTopAreaComponent> implements InteractBizTopAreaAttachAbility, AreaContainerProtocol, C0RUJ, C0RQO, InterfaceC1554640qYg {
    public final /* synthetic */ C693650RIt LLJJJJLIIL = new C693650RIt();
    public final C01GW LLJJL = C452501pT.LIZIZ(new C585220MxM());
    public ViewTreeObserver LLJJLIIIJLLLLLLLZ;
    public C692090RCt LLJL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final C720670SOr D42() {
        int[] iArr = new int[2];
        LJJIJL().getLocationInWindow(iArr);
        return new C720670SOr(LJJIJL().getWidth(), LJJIJL().getHeight(), iArr);
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "top_container";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 443726284) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final String s81() {
        return "top_container";
    }

    @Override // X.C0RQO
    public final String Ig() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0RQN.LIZIZ(c724270Sb3 != null ? c724270Sb3.LL : null, jm());
    }

    public final ViewTreeObserver ep() {
        ViewTreeObserver viewTreeObserver = this.LLJJLIIIJLLLLLLLZ;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        ViewTreeObserver viewTreeObserver2 = LJJIJL().getViewTreeObserver();
        this.LLJJLIIIJLLLLLLLZ = viewTreeObserver2;
        return viewTreeObserver2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C01GW c01gw = C692070RCr.LIZ;
        this.LLJL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "BizTopAreaComponent", "iterateBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZ(this.LLJL, String.valueOf(jm().hashCode()), null, null);
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility
    public final void lV0() {
        LJJIJL().setTranslationZ(C339190DRl.LIZ(10));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility
    public final int xH() {
        return LJJIJL().getBottom();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility
    public final void Ag0(RelativeLayout.LayoutParams layoutParams) {
        layoutParams.addRule(8, LJJIJL().getId());
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Lk1(AwS590S0100000_11 awS590S0100000_11) {
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = null;
        }
        awS590S0100000_11.invoke(layoutParams);
        LJJIJL().requestLayout();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility
    public final void XT(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (C1591220rVg.LIZLLL()) {
            ViewTreeObserver viewTreeObserverEp = ep();
            if (viewTreeObserverEp != null) {
                viewTreeObserverEp.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                C2187701Ajg.LIZIZ(viewTreeObserverEp, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                return;
            }
            return;
        }
        C786410Ut5.C3(LJJIJL().getViewTreeObserver(), onGlobalLayoutListener);
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility
    public final void ij2(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Fragment fragmentLIZLLL;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            fragmentLIZLLL = iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(this));
        } else {
            fragmentLIZLLL = null;
        }
        if (C1591220rVg.LIZLLL()) {
            if (fragmentLIZLLL != null) {
                ViewTreeObserver viewTreeObserverEp = ep();
                if (viewTreeObserverEp != null) {
                    SAFExtensionKt.LIZ(onGlobalLayoutListener, viewTreeObserverEp, fragmentLIZLLL);
                    return;
                }
                return;
            }
            ViewTreeObserver viewTreeObserverEp2 = ep();
            if (viewTreeObserverEp2 == null) {
                return;
            }
            viewTreeObserverEp2.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserverEp2, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
            return;
        }
        if (fragmentLIZLLL != null) {
            SAFExtensionKt.LIZ(onGlobalLayoutListener, LJJIJL().getViewTreeObserver(), fragmentLIZLLL);
        } else {
            C786410Ut5.x3(LJJIJL().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("BizTopAreaComponent.onViewCreated", new C693660RIu(this));
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "BizTopAreaComponent", "onViewCreated");
        C723830SaL.LIZ(this, null, new C693230RHd(this));
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
        C2765015f.LIZ("BizTopAreaComponent.onViewCreated", new C693670RIv(this));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        boolean z;
        IAdAssemService iAdAssemService;
        C19719912Dl c19719912DlLJI;
        VideoItemParams videoItemParams2 = videoItemParams;
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("BizTopAreaComponent.onBind", new C0O0E(videoItemParams2, this));
        if (C693680RIw.LIZ() && ((Boolean) this.LLJJL.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (C0R93.LIZLLL(videoItemParams2.mEventType) && ((C2245741Cv6.LIZJ(videoItemParams2.getAweme()) || (!z && C2245741Cv6.LIZIZ(videoItemParams2.getAweme()))) && (iAdAssemService = (IAdAssemService) ServiceManager.get().getService(IAdAssemService.class)) != null && (c19719912DlLJI = iAdAssemService.LJI()) != null)) {
            C723830SaL.LJ(this, c19719912DlLJI, true, null);
        }
        C2765015f.LIZ("BizTopAreaComponent.onBind", new C0O0F(videoItemParams2, this));
        LJJIJL().setTranslationZ(C339190DRl.LIZ(0));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
        function0.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "BizTopAreaComponent", "onHolderSelected");
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
