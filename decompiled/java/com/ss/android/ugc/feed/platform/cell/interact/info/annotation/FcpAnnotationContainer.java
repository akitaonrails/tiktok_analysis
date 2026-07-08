package com.ss.android.ugc.feed.platform.cell.interact.info.annotation;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C08CX;
import X.C0CGX;
import X.C0QSJ;
import X.C0RDX;
import X.C0RJE;
import X.C0RQN;
import X.C0RQO;
import X.C0RUJ;
import X.C0RWZ;
import X.C0RYN;
import X.C0RZK;
import X.C0ZP4;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C265770AbH;
import X.C299180Bo4;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C693530RIh;
import X.C693650RIt;
import X.C697950RZh;
import X.C698160Ra2;
import X.C700450Rdj;
import X.C700950ReX;
import X.C707090RoR;
import X.C715260S3w;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC697300RWu;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC697640RYc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS30S0110000_11;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.AdAIGCBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.ab.AnnotationContainerPerfConfig;
import com.ss.android.ugc.feed.platform.ab.AnnotationContainerPerformanceData;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFcpAbility;
import com.ss.android.ugc.feed.platform.cell.interact.decision.BaseFcpDecisionContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.api.ComponentElementChangeAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AIGCBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AutoDubbingConsumptionLabelAssemV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.HeatingBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.SeriesPurchaseBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpAnnotationContainer extends BaseFcpDecisionContainer<FcpAnnotationContainer> implements C0RQO, FcpContainerProtocol, InterfaceC697640RYc, ComponentElementChangeAbility, AnnotationContainerAbility, C0RUJ, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public C0RWZ LLLFF;
    public TuxTextView LLLFFI;
    public String LLLI;
    public boolean LLLII;
    public C0ZP4 LLLIIIIL;
    public boolean LLLIIIL;
    public final boolean LLLIIL;
    public List<C698160Ra2> LLLIILIL;
    public final List<String> LLLIL;
    public Set<String> LLLILZ;
    public boolean LLLILZJ;
    public final Map<String, PendingModifyPriorityProtocol> LLLILZLLLI;
    public final /* synthetic */ C693650RIt LLJLL = new C693650RIt();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1234));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1235));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1236));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(564));
    public final Set<String> LLL = new LinkedHashSet();
    public final ConcurrentHashMap<String, Function1<Boolean, Unit>> LLLF = new ConcurrentHashMap<>();
    public boolean LLLFZ = true;
    public final ARunnableS111S0100000_11 LLLIIII = new ARunnableS111S0100000_11(this, 79);

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "annotation_container";
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RQO
    public final String Ig() {
        return C0RQN.LIZIZ(null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final void Mx() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "annotation_container";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.api.ComponentElementChangeAbility
    public final void VL() {
        ip(false);
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoAnnotationContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final String getContainerKey() {
        return "annotation_container";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoAnnotationContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoAnnotationContainerScope.class);
        return arrayList;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1488075468 || iHashCode == -1344084053) {
            return this;
        }
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.AnnotationContainerAbility
    public final void XJ1() {
        new ArrayList();
        ip(true);
    }

    public FcpAnnotationContainer() {
        AnnotationContainerPerfConfig annotationContainerPerfConfig = (AnnotationContainerPerfConfig) C693530RIh.LIZIZ.getValue();
        this.LLLIIL = annotationContainerPerfConfig != null && annotationContainerPerfConfig.enable;
        this.LLLIILIL = new ArrayList();
        this.LLLIL = C13LP.LLIIII(C0CGX.LIZIZ);
        this.LLLILZ = C08CX.INSTANCE;
        this.LLLILZLLLI = new LinkedHashMap();
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
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        long jLJFF = C0RQN.LJFF();
        if (this.LLLIIL) {
            AssemSupervisor assemSupervisor = getAssemSupervisor();
            if (assemSupervisor != null && (copyOnWriteArrayList2 = assemSupervisor.LLJILLL) != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                    if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
                }
            }
        } else {
            AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
            if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                    if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                        arrayList2.add(abstractC738140SxQ2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C0RDX.LIZIZ((InterfaceC691660RBc) it3.next());
                }
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONUNSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.AnnotationContainerAbility
    public final List<String> LLILL() {
        Collection<FcpNodeProtocol> collectionValues = Xh().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            String strLLLII = ((FcpNodeProtocol) it2.next()).LLLII();
            if (strLLLII != null) {
                arrayList.add(strLLLII);
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.AnnotationContainerAbility
    public final List<String> LLLZIIL() {
        Collection<FcpNodeProtocol> collectionValues = Xh().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            String strLLLII = ((FcpNodeProtocol) it2.next()).LLLII();
            if (strLLLII != null) {
                arrayList.add(strLLLII);
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.decision.BaseFcpDecisionContainer, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        Xg(this);
        this.LLLF.clear();
        ((LinkedHashMap) this.LLLILZLLLI).clear();
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.decision.BaseFcpDecisionContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        long jLJFF = C0RQN.LJFF();
        super.unBind();
        C0ZP4 c0zp4 = this.LLLIIIIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLLIIIIL = null;
        ol();
        lm();
        this.LLL.clear();
        this.LLLIILIL = null;
        this.LLLILZ = C08CX.INSTANCE;
        this.LLLILZJ = false;
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        TuxTextView tuxTextView = this.LLLFFI;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        C01GW c01gw = C697950RZh.LIZIZ;
        AnnotationContainerPerformanceData annotationContainerPerformanceData = (AnnotationContainerPerformanceData) c01gw.getValue();
        if (annotationContainerPerformanceData == null) {
            annotationContainerPerformanceData = C697950RZh.LIZ;
        }
        if (annotationContainerPerformanceData.fcpWinnerTime) {
            this.LLLI = null;
        }
        AnnotationContainerPerformanceData annotationContainerPerformanceData2 = (AnnotationContainerPerformanceData) c01gw.getValue();
        if (annotationContainerPerformanceData2 == null) {
            annotationContainerPerformanceData2 = C697950RZh.LIZ;
        }
        if (annotationContainerPerformanceData2.coalesceTriggerPost) {
            C707090RoR.LIZ().removeCallbacks(this.LLLIIII);
            this.LLLII = false;
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_UNBIND, jLJFF);
        }
    }

    public static void kp(FcpAnnotationContainer fcpAnnotationContainer) {
        Object obj;
        fcpAnnotationContainer.getClass();
        C01GW c01gw = C697950RZh.LIZIZ;
        AnnotationContainerPerformanceData annotationContainerPerformanceData = (AnnotationContainerPerformanceData) c01gw.getValue();
        if (annotationContainerPerformanceData == null) {
            annotationContainerPerformanceData = C697950RZh.LIZ;
        }
        if (annotationContainerPerformanceData.fcpWinnerTime) {
            C724270Sb3 c724270Sb3 = fcpAnnotationContainer.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            if (aid != null && !Intrinsics.LJFF(fcpAnnotationContainer.LLLI, aid)) {
                fcpAnnotationContainer.LLLI = aid;
            } else {
                return;
            }
        }
        AnnotationContainerPerformanceData annotationContainerPerformanceData2 = (AnnotationContainerPerformanceData) c01gw.getValue();
        if (annotationContainerPerformanceData2 == null) {
            annotationContainerPerformanceData2 = C697950RZh.LIZ;
        }
        if (annotationContainerPerformanceData2.coalesceTriggerPost) {
            if (!fcpAnnotationContainer.LLLII) {
                fcpAnnotationContainer.LLLII = true;
            } else {
                return;
            }
        }
        C707090RoR.LIZIZ(fcpAnnotationContainer.LLLIIII);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.decision.BaseFcpDecisionContainer, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        long jLJFF = C0RQN.LJFF();
        C693650RIt c693650RIt = this.LLJLL;
        c693650RIt.getClass();
        long jLJFF2 = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(c693650RIt, EnumC697300RWu.M_DECISION_RESULT, jLJFF2);
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_DECISION_RESULT, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        if (this.LLLIIL) {
            AssemSupervisor assemSupervisor = getAssemSupervisor();
            if (assemSupervisor != null && (copyOnWriteArrayList2 = assemSupervisor.LLJILLL) != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                    if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
                }
                return;
            }
            return;
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                    arrayList2.add(abstractC738140SxQ2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC691660RBc) it3.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        if (this.LLLIIL) {
            AssemSupervisor assemSupervisor = getAssemSupervisor();
            if (assemSupervisor != null && (copyOnWriteArrayList2 = assemSupervisor.LLJILLL) != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                    if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC691660RBc) it2.next()).LLLI(i);
                }
                return;
            }
            return;
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                    arrayList2.add(abstractC738140SxQ2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC691660RBc) it3.next()).LLLI(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final void b62(List<Pair<String, Boolean>> list) {
        ip(true);
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

    /* JADX WARN: Code restructure failed: missing block: B:216:0x0570, code lost:
    
        r4.append((java.lang.CharSequence) r12);
        r0 = new android.text.SpannedString(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(boolean r17) {
        /*
            Method dump skipped, instruction units count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.annotation.FcpAnnotationContainer.hp(boolean):void");
    }

    public final void ip(boolean z) {
        if (this.LLL.isEmpty()) {
            return;
        }
        AnnotationContainerPerformanceData annotationContainerPerformanceData = (AnnotationContainerPerformanceData) C697950RZh.LIZIZ.getValue();
        if (annotationContainerPerformanceData == null) {
            annotationContainerPerformanceData = C697950RZh.LIZ;
        }
        if (annotationContainerPerformanceData.renderCoalesce) {
            if (!this.LLLILZJ) {
                this.LLLILZJ = true;
                C707090RoR.LIZIZ(new ARunnableS30S0110000_11(this, z, 12));
                return;
            }
            return;
        }
        hp(z);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.decision.BaseFcpDecisionContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AdAIGCBottomLabelTriggerAssem adAIGCBottomLabelTriggerAssemLIZLLL;
        long jLJFF = C0RQN.LJFF();
        super.onViewCreated(view);
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.yz(this);
        }
        if (!this.LLLIIIL) {
            AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1639);
            C0RYN c0ryn = new C0RYN(this);
            ArrayList arrayList = new ArrayList();
            IAdAssemService iAdAssemService = (IAdAssemService) PluggableExtentionKt.pluggableSpi$default(IAdAssemService.class, false, false, false, 14, null);
            if (iAdAssemService != null && (adAIGCBottomLabelTriggerAssemLIZLLL = iAdAssemService.LIZLLL(true)) != null) {
                arrayList.add(adAIGCBottomLabelTriggerAssemLIZLLL);
            }
            arrayList.add(new HeatingBottomLabelTriggerAssem(true));
            arrayList.add(new AIGCBottomLabelTriggerAssem(true));
            if (C299180Bo4.LIZ()) {
                arrayList.add(new AutoDubbingConsumptionLabelAssemV2(true));
            }
            arrayList.add(new SeriesPurchaseBottomLabelTriggerAssem(true));
            arrayList.add(new InfoBarContainerAssem(new AwS545S0100000_1(c0ryn, 1580), this, AFwS198S0000000_11.get$arr$(504), awS555S0100000_11));
            C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, (FcpAnnotationContainer) arrayList, (List<? extends FcpNodeProtocol>) 161));
            this.LLLIIIL = true;
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        if (this.LLLFZ && ((Boolean) C265770AbH.LIZ.getValue()).booleanValue()) {
            this.LLLIIIIL = C0RJE.LIZLLL(this, (VideoViewModel) this.LLJZIJLIL.getValue(), new AwS555S0100000_11(this, 1640));
            this.LLLFZ = false;
        }
        AnnotationContainerPerformanceData annotationContainerPerformanceData = (AnnotationContainerPerformanceData) C697950RZh.LIZIZ.getValue();
        if (annotationContainerPerformanceData == null) {
            annotationContainerPerformanceData = C697950RZh.LIZ;
        }
        if (annotationContainerPerformanceData.fcpWinnerTime) {
            kp(this);
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    @Override // X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        InteractAreaFcpAbility interactAreaFcpAbility;
        String strH3;
        Object obj;
        long jLJFF = C0RQN.LJFF();
        Map<String, FcpNodeProtocol> mapXh = Xh();
        Set<String> setKeySet = mapXh.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        Set<String> setLLIIJI = C13LP.LLIIJI(arrayList);
        AnnotationContainerPerformanceData annotationContainerPerformanceData = (AnnotationContainerPerformanceData) C697950RZh.LIZIZ.getValue();
        if (annotationContainerPerformanceData == null) {
            annotationContainerPerformanceData = C697950RZh.LIZ;
        }
        if (!annotationContainerPerformanceData.logicOpt || !Intrinsics.LJFF(setLLIIJI, this.LLLILZ)) {
            this.LLLILZ = setLLIIJI;
            Collection<FcpNodeProtocol> collectionValues = mapXh.values();
            ArrayList arrayList2 = new ArrayList();
            for (FcpNodeProtocol fcpNodeProtocol : collectionValues) {
                if (fcpNodeProtocol != null && (strH3 = fcpNodeProtocol.H3()) != null) {
                    if (((LinkedHashMap) this.LLLILZLLLI).get(strH3) != null) {
                        obj = ((LinkedHashMap) this.LLLILZLLLI).get(strH3);
                        if (obj != null) {
                            arrayList2.add(obj);
                        }
                    } else {
                        if (fcpNodeProtocol instanceof ComponentPriorityProtocol) {
                            final ComponentPriorityProtocol componentPriorityProtocol = (ComponentPriorityProtocol) fcpNodeProtocol;
                            final AwS125S1100000_11 awS125S1100000_11 = new AwS125S1100000_11(this, strH3, 15);
                            obj = new PendingModifyPriorityProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.info.annotation.ElementAssemBridgeKt$wrapper$1
                                @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                                public final String H3() {
                                    return componentPriorityProtocol.H3();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, X.C0RJL
                                public final boolean oh() {
                                    return componentPriorityProtocol.oh();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                                public final C700450Rdj vN0() {
                                    return componentPriorityProtocol.vN0();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                                public final InterfaceC701260Rf2 vk() {
                                    return componentPriorityProtocol.vk();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                                public final InterfaceC700000Rd0 wb1() {
                                    return componentPriorityProtocol.wb1();
                                }

                                @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
                                public final View xb() {
                                    return componentPriorityProtocol.xb();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                                public final void Bh2(boolean z) {
                                    componentPriorityProtocol.Bh2(z);
                                    Function1<Boolean, Unit> function1 = awS125S1100000_11;
                                    if (function1 != null) {
                                        function1.invoke(Boolean.valueOf(z));
                                    }
                                }
                            };
                            this.LLLILZLLLI.put(strH3, (PendingModifyPriorityProtocol) obj);
                        } else if (fcpNodeProtocol instanceof PriorityProtocol) {
                            final PriorityProtocol priorityProtocol = (PriorityProtocol) fcpNodeProtocol;
                            final AwS125S1100000_11 awS125S1100000_112 = new AwS125S1100000_11(this, strH3, 16);
                            obj = new PendingModifyPriorityProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.info.annotation.ElementAssemBridgeKt$trans2ComponentPriorityProtocol$1
                                @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                                public final String H3() {
                                    return priorityProtocol.H3();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                                public final boolean PT1() {
                                    return priorityProtocol.lk2();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                                public final boolean Qm0() {
                                    return priorityProtocol.YZ();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, X.C0RJL
                                public final boolean oh() {
                                    return priorityProtocol.oh();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                                public final C700450Rdj vN0() {
                                    return priorityProtocol.Ke1();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                                public final InterfaceC701260Rf2 vk() {
                                    return priorityProtocol.vk();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                                public final InterfaceC700000Rd0 wb1() {
                                    return priorityProtocol.wb1();
                                }

                                @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
                                public final View xb() {
                                    return priorityProtocol.xb();
                                }

                                @Override // com.ss.android.ugc.feed.platform.cell.interact.info.annotation.PendingModifyPriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                                public final void Bh2(boolean z) {
                                    Function1<Boolean, Unit> function1 = awS125S1100000_112;
                                    if (function1 != null) {
                                        function1.invoke(Boolean.valueOf(z));
                                    }
                                }
                            };
                            this.LLLILZLLLI.put(strH3, (PendingModifyPriorityProtocol) obj);
                        }
                        arrayList2.add(obj);
                    }
                }
            }
            if ((!arrayList2.isEmpty()) && (interactAreaFcpAbility = (InteractAreaFcpAbility) this.LLJLLL.getValue()) != null) {
                interactAreaFcpAbility.Th0(arrayList2);
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONFCPPOLICY, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        if (!this.LLLFZ || !((Boolean) C265770AbH.LIZ.getValue()).booleanValue()) {
            kp(this);
        }
        if (this.LLLIIL) {
            AssemSupervisor assemSupervisor = getAssemSupervisor();
            if (assemSupervisor != null) {
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2 = assemSupervisor.LLJILLL;
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                    if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
                }
            }
        } else {
            AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
            if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                    if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                        arrayList2.add(abstractC738140SxQ2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C0RDX.LIZ((InterfaceC691660RBc) it3.next(), i, aweme);
                }
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        if (this.LLLIIL) {
            AssemSupervisor assemSupervisor = getAssemSupervisor();
            if (assemSupervisor != null) {
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2 = assemSupervisor.LLJILLL;
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList2) {
                    if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
                }
            }
        } else {
            AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
            if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList) {
                    if (abstractC738140SxQ2 instanceof InterfaceC691660RBc) {
                        arrayList2.add(abstractC738140SxQ2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC691660RBc) it3.next()).T6(i, aweme);
                }
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }

    public final void ep(String str, boolean z) {
        Function1<Boolean, Unit> function1 = this.LLLF.get(str);
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!z));
        }
        this.LLLF.remove(str);
        if (!z) {
            this.LLL.add(str);
        } else {
            this.LLL.remove(str);
        }
    }

    @Override // X.InterfaceC697640RYc
    public final void rk(C0RZK c0rzk, Function1<? super Boolean, Unit> function1) {
        if (!Intrinsics.LJFF(c0rzk.LLLII(), "annotation_container") && !Intrinsics.LJFF(c0rzk.LLLII(), "info_bar")) {
            this.LLLF.put(c0rzk.LLLII(), function1);
        }
    }
}
