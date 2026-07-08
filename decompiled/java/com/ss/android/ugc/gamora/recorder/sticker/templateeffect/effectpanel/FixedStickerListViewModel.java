package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.C13BV;
import X.C1629000sUc;
import X.C1641640sp0;
import X.C1DRG;
import X.EnumC1641470soj;
import X.EnumC1641550sor;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1628910sUT;
import X.InterfaceC1635560sfC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class FixedStickerListViewModel extends StickerListViewModel {
    /* JADX WARN: Multi-variable type inference failed */
    public List<Effect> DQ2(List<? extends Effect> list) {
        return list;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void CQ2(C1641640sp0<List<Effect>> c1641640sp0) {
        EnumC1641550sor enumC1641550sor = c1641640sp0.LIZIZ;
        if (enumC1641550sor != null) {
            int i = C1629000sUc.LIZ[enumC1641550sor.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        List<Effect> list = c1641640sp0.LIZ;
                        if (list != null && !list.isEmpty()) {
                            AQ2(DQ2(list));
                            this.LLJIJIL.setValue(EnumC1641470soj.NONE);
                            return;
                        } else {
                            AQ2(C13BV.INSTANCE);
                            this.LLJIJIL.setValue(EnumC1641470soj.EMPTY);
                            return;
                        }
                    }
                    return;
                }
                AQ2(C13BV.INSTANCE);
                this.LLJIJIL.setValue(EnumC1641470soj.ERROR);
                return;
            }
            AQ2(C13BV.INSTANCE);
            this.LLJIJIL.setValue(EnumC1641470soj.LOADING);
        }
    }

    public FixedStickerListViewModel(EffectTemplateCategoryFragment effectTemplateCategoryFragment, C1DRG c1drg, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1628910sUT interfaceC1628910sUT, InterfaceC1635560sfC interfaceC1635560sfC) {
        super(effectTemplateCategoryFragment, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg, interfaceC1628910sUT, false, 64);
    }
}
