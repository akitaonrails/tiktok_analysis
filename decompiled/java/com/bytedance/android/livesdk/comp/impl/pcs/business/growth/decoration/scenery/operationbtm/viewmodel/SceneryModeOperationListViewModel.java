package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel;

import X.AbstractC316870CbV;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1815530xLT;
import X.C1818820xQm;
import X.C1818830xQn;
import X.C1818840xQo;
import X.C1818850xQp;
import X.C316640Cb8;
import X.C317290CcB;
import X.C497740JfY;
import X.C627660Ojc;
import X.EnumC1818710xQb;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1818450xQB;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryModeOperationListViewModel extends AssemListViewModel<C1818830xQn, C1818820xQm, Integer> implements InterfaceC1818450xQB {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1815530xLT.class, (Class<Object>) "BoardSceneryHierarchyData", (String) 13), true);

    public static List vQ2() {
        return C1697810uHb.LJIIJJI(new C1818820xQm("layout", C497740JfY.LJIJI(2131851167), R.attr.d4v, true, EnumC1818710xQb.LAYOUT, 16), new C1818820xQm("crop", C497740JfY.LJIJI(2131851166), R.attr.dkc, false, EnumC1818710xQb.CROP, 24));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1818830xQn(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1818450xQB
    public final EnumC1818710xQb ey0() {
        return ((C1818830xQn) getState()).LLILLJJLI;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1818820xQm> c627660Ojc) {
        setState(new C1818850xQp(c627660Ojc));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        Object next;
        Iterator it2 = vQ2().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1818820xQm) next).LLILZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        setState(new C1818840xQo((C1818820xQm) next));
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List listVQ2 = vQ2();
        c317290CcB.getClass();
        return new C316640Cb8(listVQ2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }
}
