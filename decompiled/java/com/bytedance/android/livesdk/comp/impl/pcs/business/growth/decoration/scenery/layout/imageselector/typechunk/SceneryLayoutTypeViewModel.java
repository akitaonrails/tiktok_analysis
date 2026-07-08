package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk;

import X.AbstractC316870CbV;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1735840vGw;
import X.C1815530xLT;
import X.C1818470xQD;
import X.C1818490xQF;
import X.C316640Cb8;
import X.C317290CcB;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1815510xLR;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryLayoutTypeViewModel extends AssemListViewModel<C1735840vGw, C1818490xQF, Integer> implements InterfaceC1815510xLR {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1815530xLT.class, (Class<Object>) "BoardSceneryHierarchyData", (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1735840vGw(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1815510xLR
    public final int getLayoutType() {
        return ((C1735840vGw) getState()).LLILLJJLI;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1818490xQF> c627660Ojc) {
        setState(new C1818470xQD(c627660Ojc));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        boolean z;
        boolean z2;
        SceneryContent sceneryContent;
        ImageContent imageContent;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        BoardItem boardItem = ((C1815530xLT) this.LL.getValue()).LL;
        SceneryContent sceneryContent2 = null;
        boolean z3 = true;
        if (boardItem != null && (sceneryContent = boardItem.sceneryContent) != null && (imageContent = sceneryContent.imageContent) != null && imageContent.image != null) {
            sceneryContent2 = sceneryContent;
        }
        C1818490xQF[] c1818490xQFArr = new C1818490xQF[3];
        if (sceneryContent2 != null && sceneryContent2.sceneryType == 0) {
            z = true;
        } else {
            z = false;
        }
        c1818490xQFArr[0] = new C1818490xQF(0, z);
        if (sceneryContent2 != null && sceneryContent2.sceneryType == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1818490xQFArr[1] = new C1818490xQF(1, z2);
        if (sceneryContent2 == null || sceneryContent2.sceneryType != 3) {
            z3 = false;
        }
        c1818490xQFArr[2] = new C1818490xQF(3, z3);
        List listLJIIJJI = C1697810uHb.LJIIJJI(c1818490xQFArr);
        c317290CcB.getClass();
        return new C316640Cb8(listLJIIJJI);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }
}
