package com.ss.android.ugc.feed.platform.cell.interact.biz;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HHT;
import X.C0RIE;
import X.C0RIS;
import X.C0RQN;
import X.C0RQO;
import X.C0RUJ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2765015f;
import X.C452501pT;
import X.C692070RCr;
import X.C692090RCt;
import X.C693030RGj;
import X.C693460RIa;
import X.C693630RIr;
import X.C693640RIs;
import X.C693650RIt;
import X.C715260S3w;
import X.C720670SOr;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.EnumC697300RWu;
import X.InterfaceC2217461Bqa;
import X.InterfaceC691660RBc;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class BizBottomAreaComponent extends BaseCellContentComponent<BizBottomAreaComponent> implements AreaContainerProtocol, C0RUJ, C0RQO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final /* synthetic */ C693650RIt LLJJJJLIIL = new C693650RIt();
    public final C01GW LLJJL;
    public C692090RCt LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BizBottomAreaComponent.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BizBottomAreaComponent() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C0RIE(c19719912DlLIZ), null, new C693460RIa());
        this.LLJJL = C452501pT.LIZIZ(new C0RIS(this));
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
        return "left_container_v2";
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final String s81() {
        return "left_container_v2";
    }

    @Override // X.C0RQO
    public final String Ig() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0RQN.LIZIZ(c724270Sb3 != null ? c724270Sb3.LL : null, jm());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C01GW c01gw = C692070RCr.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "BizBottomAreaComponent", "iterateBind");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZ(this.LLJJLIIIJLLLLLLLZ, String.valueOf(jm().hashCode()), null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final View Fd2() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        long jLJFF = C0RQN.LJFF();
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        long jLJFF = C0RQN.LJFF();
        super.onParentSet();
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Kc2(View.OnLayoutChangeListener onLayoutChangeListener) {
        LJJIJL().removeOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol
    public final void Ko2(View.OnLayoutChangeListener onLayoutChangeListener) {
        LJJIJL().addOnLayoutChangeListener(onLayoutChangeListener);
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("BizBottomAreaComponent.onViewCreated", new C693630RIr(this));
        C01GW c01gw = C692070RCr.LIZ;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(jm().hashCode()), "BizBottomAreaComponent", "onViewCreated");
        C723830SaL.LIZ(this, null, new C693030RGj(this));
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(jm().hashCode()), null, null);
        C2765015f.LIZ("BizBottomAreaComponent.onViewCreated", new C693640RIs(this));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }
}
