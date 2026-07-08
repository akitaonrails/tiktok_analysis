package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C13BV;
import X.C1628920sUU;
import X.C1641640sp0;
import X.C1DRG;
import X.EnumC1641470soj;
import X.EnumC1641550sor;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1635560sfC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class FavoriteStickerListViewModel extends StickerListViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public void BQ2(C1641640sp0<CategoryEffectModel> c1641640sp0) {
        List<Effect> effects;
        EnumC1641550sor enumC1641550sor = c1641640sp0.LIZIZ;
        if (enumC1641550sor != null) {
            int i = C1628920sUU.LIZ[enumC1641550sor.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        CategoryEffectModel categoryEffectModel = c1641640sp0.LIZ;
                        if (categoryEffectModel != null && (effects = categoryEffectModel.getEffects()) != null && !effects.isEmpty()) {
                            this.LLJIJIL.setValue(EnumC1641470soj.NONE);
                            AQ2(effects);
                            return;
                        } else {
                            this.LLJIJIL.setValue(EnumC1641470soj.EMPTY);
                            this.LLIZLLLIL.setValue(C13BV.INSTANCE);
                            return;
                        }
                    }
                    return;
                }
                Throwable th = c1641640sp0.LIZJ;
                if ((th instanceof StatusCodeException) && ((StatusCodeException) th).getStatusCode() == 8) {
                    this.LLJIJIL.setValue(EnumC1641470soj.EMPTY);
                    return;
                } else {
                    this.LLJIJIL.setValue(EnumC1641470soj.ERROR);
                    return;
                }
            }
            this.LLJIJIL.setValue(EnumC1641470soj.LOADING);
        }
    }

    public FavoriteStickerListViewModel(StickerCategoryFragment stickerCategoryFragment, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, C1DRG c1drg) {
        super(stickerCategoryFragment, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg, null, false, 96);
    }
}
