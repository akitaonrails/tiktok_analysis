package com.ss.android.ugc.feed.platform.cell.interact.info.annotation;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C13LP;
import X.C15438062q;
import X.C2097608Jq;
import X.C452501pT;
import X.C698160Ra2;
import X.C698180Ra4;
import X.C698680Ras;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700950ReX;
import X.C700960ReY;
import X.C701320Rf8;
import X.C724270Sb3;
import X.C866950Xzh;
import X.InterfaceC665370Q7z;
import X.InterfaceC697220RWm;
import X.InterfaceC702410Rgt;
import X.InterfaceC702840Rha;
import X.InterfaceC702850Rhb;
import X.InterfaceC703750Rj3;
import Y.AComparatorS510S0100000_11;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.AnnotationContainerAbility;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InfoBarContainerAssem extends FcpContainerAssem implements InterfaceC702840Rha<C698160Ra2>, FcpContainerProtocol {
    public final InterfaceC697220RWm LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final List<String> LLLIIIIL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final void Mx() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final String getContainerKey() {
        return "info_bar";
    }

    @Override // X.InterfaceC702840Rha
    public final List<C698160Ra2> LJJLIIIJLJLI() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C724270Sb3 c724270Sb3 = this.LLJI;
        ArrayList arrayList = new ArrayList();
        AssemSupervisor assemSupervisor = getAssemSupervisor();
        if (assemSupervisor != null && (copyOnWriteArrayList = assemSupervisor.LLJILLL) != null) {
            for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                if (interfaceC665370Q7z instanceof InterfaceC702850Rhb) {
                    InterfaceC703750Rj3 interfaceC703750Rj3Gc = ((InterfaceC702850Rhb) interfaceC665370Q7z).gc();
                    if (interfaceC703750Rj3Gc != null && (interfaceC703750Rj3Gc instanceof C698160Ra2)) {
                        arrayList.add(interfaceC703750Rj3Gc);
                    }
                } else if (interfaceC665370Q7z instanceof InterfaceC702840Rha) {
                    for (Object obj : ((InterfaceC702840Rha) interfaceC665370Q7z).LJJLIIIJLJLI()) {
                        if (obj instanceof C698160Ra2) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        FeedComponentPriorityData feedComponentPriorityDataHp = hp();
        List<String> list = feedComponentPriorityDataHp != null ? feedComponentPriorityDataHp.priorityList : null;
        int i = C698180Ra4.LIZ;
        return C13LP.LJLLLL(new AComparatorS510S0100000_11(list, 5), arrayList);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.yz(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        ((ArrayList) this.LLLIIIIL).clear();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final void b62(List<Pair<String, Boolean>> list) {
        ArrayList arrayList = new ArrayList();
        for (Pair<String, Boolean> pair : list) {
            Pair<String, Boolean> pair2 = pair;
            if (!pair2.getSecond().booleanValue()) {
                if (((ArrayList) this.LLLIIIIL).contains(pair2.getFirst())) {
                    arrayList.add(pair);
                }
            }
        }
        final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Pair) it2.next()).getFirst());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Pair<String, Boolean> pair3 : list) {
            Pair<String, Boolean> pair4 = pair3;
            if (pair4.getSecond().booleanValue()) {
                if (((ArrayList) this.LLLIIIIL).contains(pair4.getFirst())) {
                    arrayList3.add(pair3);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Pair) it3.next()).getFirst());
        }
        C700950ReX c700950ReXLIZIZ = null;
        if (!arrayList4.isEmpty()) {
            this.LLLI.gg(new C700260RdQ(new C698680Ras(null, arrayList4, "outreach", C2097608Jq.LJ()), C701320Rf8.LIZ, false, new InterfaceC702410Rgt() { // from class: X.0RZg
                @Override // X.InterfaceC702410Rgt
                public final void hl() {
                }

                @Override // X.InterfaceC702410Rgt
                public final void vg(C700950ReX c700950ReX) {
                    if (C866950Xzh.LIZIZ(arrayList2)) {
                        this.qa(c700950ReX);
                        AnnotationContainerAbility annotationContainerAbility = (AnnotationContainerAbility) this.LLLIIII.getValue();
                        if (annotationContainerAbility != null) {
                            annotationContainerAbility.XJ1();
                        }
                    }
                }
            }, 4));
            return;
        }
        if (C866950Xzh.LIZIZ(arrayList2)) {
            C700170RdH c700170RdHJ9 = this.LLLI.J9();
            if (c700170RdHJ9 != null) {
                c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdHJ9);
            }
            qa(c700950ReXLIZIZ);
            AnnotationContainerAbility annotationContainerAbility = (AnnotationContainerAbility) this.LLLIIII.getValue();
            if (annotationContainerAbility != null) {
                annotationContainerAbility.XJ1();
            }
        }
    }

    public InfoBarContainerAssem(AwS545S0100000_1 awS545S0100000_1, InterfaceC697220RWm interfaceC697220RWm, AFwS198S0000000_11 aFwS198S0000000_11, AwS555S0100000_11 awS555S0100000_11) {
        super(awS545S0100000_1, "info_bar", interfaceC697220RWm, aFwS198S0000000_11, awS555S0100000_11);
        this.LLLI = interfaceC697220RWm;
        this.LLLII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1642));
        this.LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1641));
        this.LLLIIIIL = new ArrayList();
        interfaceC697220RWm.Ah(new InterfaceC702410Rgt() { // from class: X.0RZf
            @Override // X.InterfaceC702410Rgt
            public final void hl() {
            }

            @Override // X.InterfaceC702410Rgt
            public final void vg(C700950ReX c700950ReX) {
                List<C700970ReZ> list;
                ((ArrayList) this.LL.LLLIIIIL).clear();
                if (c700950ReX != null && (list = c700950ReX.LIZIZ) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<C700970ReZ> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().LIZJ;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    ((ArrayList) this.LL.LLLIIIIL).addAll(arrayList);
                }
            }
        });
    }
}
