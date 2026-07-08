package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery;

import X.C0197004l;
import X.C1161920gLG;
import X.C1559260qg8;
import X.C1815520xLS;
import X.C1815530xLT;
import X.InterfaceC0148002o;
import X.InterfaceC1814530xJr;
import X.InterfaceC1815490xLP;
import X.InterfaceC1815500xLQ;
import X.InterfaceC1815510xLR;
import X.InterfaceC1818450xQB;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryApplyViewModel extends AssemViewModel<C0197004l> {
    public final InterfaceC1815490xLP LL;
    public final InterfaceC1815510xLR LLILLJJLI;
    public final InterfaceC1815500xLQ LLILLL;
    public final InterfaceC1818450xQB LLILZ;
    public final C1559260qg8 LLILZIL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1815530xLT.class, (Class<Object>) "BoardSceneryHierarchyData", (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0197004l(0);
    }

    public final C1815530xLT vQ2() {
        return (C1815530xLT) this.LLILZIL.getValue();
    }

    public final void wQ2() {
        InterfaceC1814530xJr boardsDisplayStateManager;
        if (this.LLILLJJLI.getLayoutType() == 0 || this.LLILLL.Hf2() == null || (boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager()) == null) {
            return;
        }
        boardsDisplayStateManager.LJIIJ(new C1815520xLS(vQ2().LL), null);
    }

    public SceneryApplyViewModel(InterfaceC1815490xLP interfaceC1815490xLP, InterfaceC1815510xLR interfaceC1815510xLR, InterfaceC1815500xLQ interfaceC1815500xLQ, InterfaceC1818450xQB interfaceC1818450xQB) {
        this.LL = interfaceC1815490xLP;
        this.LLILLJJLI = interfaceC1815510xLR;
        this.LLILLL = interfaceC1815500xLQ;
        this.LLILZ = interfaceC1818450xQB;
    }
}
