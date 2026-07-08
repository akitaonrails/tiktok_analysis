package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.C01GW;
import X.C08CX;
import X.C1158920gGQ;
import X.C1223620hwm;
import X.C1223990hxN;
import X.C1224280hxq;
import X.C1224840hyk;
import X.C291001Au;
import X.InterfaceC0148002o;
import X.InterfaceC1224320hxu;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSelectedListVM extends AssemViewModel<C1158920gGQ> implements InterfaceC1224320hxu {
    public final C01GW LL = C1223620hwm.LJ(this);
    public Set<C1224840hyk> LLILLJJLI = C08CX.INSTANCE;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158920gGQ(new C291001Au(Boolean.TRUE), C08CX.INSTANCE);
    }

    @Override // X.InterfaceC1224320hxu
    public final Set<C1224840hyk> hA1() {
        Set<C1224840hyk> set = this.LLILLJJLI;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!((C1224840hyk) obj).LLJILLL) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC1224320hxu
    public final int Vb() {
        return hA1().size();
    }

    @Override // X.InterfaceC1224320hxu
    public final Set<C1224840hyk> Ft() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1224320hxu
    public final void ct2(boolean z) {
        setState(new AwS32S0010000_18(z, 10));
    }

    @Override // X.InterfaceC1224320hxu
    public final void oq1(boolean z, Set set) {
        this.LLILLJJLI = set;
        if (z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((C1224840hyk) obj).LLJILLL) {
                    linkedHashSet.add(obj);
                }
            }
            setState(new AwS597S0100000_18(linkedHashSet, (Set<String>) 807));
        }
        C1223990hxN c1223990hxNLJFF = ((C1224280hxq) this.LL.getValue()).LJFF();
        if (hA1().size() > c1223990hxNLJFF.LIZ.LJIIJ().LJJIZ().LIZIZ()) {
            new RuntimeException("the selected count is exceed the maxSelectableCount, please do something such as disable the confirm button to let user unselected and decrease the count");
            c1223990hxNLJFF.LIZ.getTag();
        }
    }
}
