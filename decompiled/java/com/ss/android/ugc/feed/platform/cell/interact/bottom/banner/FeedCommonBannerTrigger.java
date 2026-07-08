package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C0RDX;
import X.C0RZB;
import X.C0S4A;
import X.C0S4B;
import X.C0SH0;
import X.C13IQ;
import X.C13LE;
import X.C1AF0;
import X.C1AV3;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C705590Rm1;
import X.C707380Rou;
import X.C707460Rp2;
import X.C718360SFu;
import X.C724240Sb0;
import X.EnumC707450Rp1;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC707420Roy;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.scope.CommonBannerProviderScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS170S0400000_11;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS289S0300000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCommonBannerTrigger extends BaseCellTriggerComponent<FeedCommonBannerTrigger> implements BottomBarPriorityProtocol, FeedCommonBannerAbility, C0S4B, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C0RZB(this));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1206));
    public final C707380Rou LLJLIL = new C707380Rou();
    public final C707460Rp2 LLJLILLLLZIIL = new C707460Rp2("trigger");
    public EnumC707450Rp1 LLJLL = EnumC707450Rp1.INITIAL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        if (this.LLJLIL.LJFF == null) {
            C1AF0.LJFF(new Throwable(), "Invalid status for mob! Banner targetProtocol is null.");
        }
        FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
        InterfaceC707420Roy interfaceC707420RoyLJFF = feedCommonBannerProtocol != null ? feedCommonBannerProtocol.LJFF() : null;
        FeedCommonBannerProtocol feedCommonBannerProtocol2 = this.LLJLIL.LJFF;
        C0SH0 c0sh0LJ = feedCommonBannerProtocol2 != null ? feedCommonBannerProtocol2.LJ() : null;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1207);
        return new C700450Rdj(new AwS170S0400000_11(awS555S0100000_11, this, interfaceC707420RoyLJFF, c0sh0LJ, 1), new AwS289S0300000_11(awS555S0100000_11, interfaceC707420RoyLJFF, this, 0), new AwS255S0300000_11(awS555S0100000_11, interfaceC707420RoyLJFF, this, 3));
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return true;
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommonBannerProviderScope.class});
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonBannerProviderScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonBannerProviderScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(FeedCommonBannerAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1707724930) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C718360SFu c718360SFu;
        EnumC707450Rp1 enumC707450Rp1 = EnumC707450Rp1.UNSELECTED;
        this.LLJLL = enumC707450Rp1;
        FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
        if (feedCommonBannerProtocol != null && (c718360SFu = feedCommonBannerProtocol.LL) != null) {
            c718360SFu.LIZ(enumC707450Rp1);
        }
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
            C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
        }
    }

    @Override // X.C0S4B
    public final C705590Rm1 j8() {
        return new C705590Rm1("", null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C718360SFu c718360SFu;
        EnumC707450Rp1 enumC707450Rp1 = EnumC707450Rp1.INITIAL;
        this.LLJLL = enumC707450Rp1;
        FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
        if (feedCommonBannerProtocol == null || (c718360SFu = feedCommonBannerProtocol.LL) == null) {
            return;
        }
        c718360SFu.LIZ(enumC707450Rp1);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public String zg() {
        String strLIZJ;
        FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
        return (feedCommonBannerProtocol == null || (strLIZJ = feedCommonBannerProtocol.LIZJ()) == null) ? "" : strLIZJ;
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.C0S4B
    public final View U7() {
        return LJJIJL().findViewById(R.id.tr7);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentSet() throws java.lang.IllegalAccessException {
        /*
            r7 = this;
            super.onParentSet()
            X.C1558520qew.LIZLLL(r7)
            X.0Rou r4 = r7.LLJLIL
            X.0Q7z r5 = X.C1558520qew.LJIIL(r7)
            r4.getClass()
            r3 = 0
            r1 = 0
            if (r5 == 0) goto L87
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r5, r0, r1)
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility) r0
            r4.LIZIZ = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService> r0 = com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService.class
            java.lang.Object r0 = X.C04TD.LIZ(r0, r3)
            if (r0 == 0) goto La3
            com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService r0 = (com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService) r0
        L27:
            X.06KX r2 = r0.LIZIZ()
            r6 = 1
            if (r2 == 0) goto L3b
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol> r1 = com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol.class
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[] r0 = new com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[r6]
            r0[r3] = r2
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            X.C1554610qYd.LIZJ(r5, r1, r0)
        L3b:
            X.14TF r0 = X.C14TF.LIZIZ
            X.06KX r2 = r0.LJLJJL(r5)
            boolean r0 = r2 instanceof com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
            if (r0 == 0) goto L54
            if (r2 == 0) goto L54
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol> r1 = com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol.class
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[] r0 = new com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[r6]
            r0[r3] = r2
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            X.C1554610qYd.LIZJ(r5, r1, r0)
        L54:
            X.1EE1 r0 = X.C1EE1.LIZIZ
            java.lang.Object r2 = r0.LJJIIZI()
            boolean r0 = r2 instanceof com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol
            if (r0 == 0) goto L6d
            if (r2 == 0) goto L6d
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol> r1 = com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol.class
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[] r0 = new com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[r6]
            r0[r3] = r2
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            X.C1554610qYd.LIZJ(r5, r1, r0)
        L6d:
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.DefaultFeedCommonBannerProtocol r2 = new com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.DefaultFeedCommonBannerProtocol
            r2.<init>(r3)
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol> r1 = com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol.class
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[] r0 = new com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol[r6]
            r0[r3] = r2
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r0)
            X.C1554610qYd.LIZJ(r5, r1, r0)
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol> r0 = com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol.class
            java.util.List r0 = X.C1554610qYd.LIZIZ(r5, r0, r3)
            if (r0 != 0) goto L89
        L87:
            X.13BV r0 = X.C13BV.INSTANCE
        L89:
            java.util.Iterator r3 = r0.iterator()
        L8d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol r2 = (com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol) r2
            java.util.HashMap<java.lang.String, com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol> r1 = r4.LJ
            java.lang.String r0 = r2.LIZJ()
            r1.put(r0, r2)
            goto L8d
        La3:
            com.ss.android.ugc.aweme.ecommerce.ECommerceFYPService r0 = new com.ss.android.ugc.aweme.ecommerce.ECommerceFYPService
            r0.<init>()
            goto L27
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger.onParentSet():void");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAbility
    public final C707380Rou qy() {
        return this.LLJLIL;
    }

    @Override // X.C0S4B
    public final C0S4A x1() {
        return C0S4A.INVALID;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        C718360SFu c718360SFu;
        tp(videoItemParams);
        EnumC707450Rp1 enumC707450Rp1 = EnumC707450Rp1.BOUND;
        this.LLJLL = enumC707450Rp1;
        FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
        if (feedCommonBannerProtocol != null && (c718360SFu = feedCommonBannerProtocol.LL) != null) {
            c718360SFu.LIZ(enumC707450Rp1);
        }
        C707460Rp2 c707460Rp2 = this.LLJLILLLLZIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind >>> ");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        c707460Rp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(4, "Feed", null, "common_banner"));
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 329));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[PHI: r4
      0x00dd: PHI (r4v2 com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct) = 
      (r4v0 com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct)
      (r4v4 com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct)
     binds: [B:49:0x00dc, B:58:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r14) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C718360SFu c718360SFu;
        EnumC707450Rp1 enumC707450Rp1 = EnumC707450Rp1.SELECTED;
        this.LLJLL = enumC707450Rp1;
        FeedCommonBannerProtocol feedCommonBannerProtocol = this.LLJLIL.LJFF;
        if (feedCommonBannerProtocol != null && (c718360SFu = feedCommonBannerProtocol.LL) != null) {
            c718360SFu.LIZ(enumC707450Rp1);
        }
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
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
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
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }
}
