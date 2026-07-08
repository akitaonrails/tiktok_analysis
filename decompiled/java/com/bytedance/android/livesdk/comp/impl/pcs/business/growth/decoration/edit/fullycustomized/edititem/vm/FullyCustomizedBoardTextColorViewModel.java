package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm;

import X.C01D5;
import X.C01DC;
import X.C01DD;
import X.C01DL;
import X.C01DP;
import X.C1559260qg8;
import X.C202500qF;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class FullyCustomizedBoardTextColorViewModel extends AssemViewModel<C01D5> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C01DP.class, (Class<Object>) "FullCustomizedBoardHierarchyData", (String) 13), true);
    public boolean LLILLJJLI;

    public final C01DP wQ2() {
        return (C01DP) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        int i;
        Integer numLJFF;
        BoardItemStyle boardItemStyle = wQ2().LL.style;
        int iIntValue = (boardItemStyle == null || (numLJFF = C202500qF.LJFF(boardItemStyle.colorTheme)) == null) ? -1 : numLJFF.intValue();
        int i2 = 0;
        if (boardItemStyle != null) {
            i = boardItemStyle.alignment;
            i2 = boardItemStyle.styleType;
        } else {
            i = 0;
        }
        return new C01D5(iIntValue, i2, i, 497);
    }

    public final void vQ2() {
        if (wQ2().LIZ()) {
            withState(new C01DD(this));
            if (wQ2().LIZ()) {
                withState(new C01DC(this));
            }
            withState(new C01DL(this));
        }
    }
}
