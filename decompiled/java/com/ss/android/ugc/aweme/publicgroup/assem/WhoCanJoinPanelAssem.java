package com.ss.android.ugc.aweme.publicgroup.assem;

import X.C019F;
import X.C01GW;
import X.C1157140gDY;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C259800zU;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.fragment.WhoCanJoinPanelFragment;
import com.ss.android.ugc.aweme.publicgroup.view.IMWhoCanJoinCell;
import com.ss.android.ugc.aweme.publicgroup.vm.IMWhoCanJoinVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WhoCanJoinPanelAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WhoCanJoinPanelAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/IMWhoCanJoinVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WhoCanJoinPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMWhoCanJoinVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 756), AFwS256S0000000_18.get$arr$(737), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 755));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.0gDY] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, X.0gDY] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object c1157140gDY;
        GroupAccessCriteria next;
        String str;
        GroupAccessCriteria groupAccessCriteria;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
        GroupAccessCriteriaCollection groupAccessCriteriaCollection = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(IMWhoCanJoinCell.class);
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gMB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1157150gDZ) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 267), 4);
        IMWhoCanJoinVM iMWhoCanJoinVM = (IMWhoCanJoinVM) this.LLIZLLLIL.getValue();
        ArrayList arrayList = new ArrayList();
        C259800zU c259800zU = new C259800zU();
        List<GroupAccessCriteriaCollection> list = iMWhoCanJoinVM.vQ2().LL.LIZ;
        if (list != null) {
            for (GroupAccessCriteriaCollection groupAccessCriteriaCollection2 : list) {
                GroupAccessCriteriaCollection groupAccessCriteriaCollection3 = iMWhoCanJoinVM.vQ2().LL.LIZIZ;
                if (groupAccessCriteriaCollection3 != null && groupAccessCriteriaCollection2.collectionId == groupAccessCriteriaCollection3.collectionId) {
                    Iterator<GroupAccessCriteria> it2 = groupAccessCriteriaCollection2.accessCriteriaSetting.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            String str2 = next.key;
                            GroupAccessCriteriaCollection groupAccessCriteriaCollection4 = iMWhoCanJoinVM.vQ2().LL.LIZIZ;
                            if (groupAccessCriteriaCollection4 != null && (groupAccessCriteria = groupAccessCriteriaCollection4.selectedAccessCriteria) != null) {
                                str = groupAccessCriteria.key;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    GroupAccessCriteria groupAccessCriteria2 = next;
                    if (groupAccessCriteria2 != null) {
                        c259800zU.element = new C1157140gDY(GroupAccessCriteriaCollection.LIZ(groupAccessCriteriaCollection2, groupAccessCriteria2), true);
                    } else {
                        c259800zU.element = new C1157140gDY(groupAccessCriteriaCollection2, true);
                    }
                    c1157140gDY = c259800zU.element;
                } else {
                    c1157140gDY = new C1157140gDY(groupAccessCriteriaCollection2, false);
                }
                arrayList.add(c1157140gDY);
            }
        }
        iMWhoCanJoinVM.setState(new AwS384S0200000_18(arrayList, (List<C1157140gDY>) c259800zU, (C259800zU<C1157140gDY>) 169));
        String str3 = WhoCanJoinPanelFragment._pnsPageId;
        String str4 = iMWhoCanJoinVM.vQ2().LLILLJJLI;
        C1157140gDY c1157140gDY2 = (C1157140gDY) c259800zU.element;
        if (c1157140gDY2 != null) {
            groupAccessCriteriaCollection = c1157140gDY2.LL;
        }
        WhoCanJoinPanelFragment.LLJI.put(str4, groupAccessCriteriaCollection);
    }
}
