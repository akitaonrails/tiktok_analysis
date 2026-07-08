package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C1368405Xe;
import X.C13BV;
import X.C1625940sPg;
import X.C1628790sUH;
import X.C1629100sUm;
import X.C1641640sp0;
import X.C1DRG;
import X.EnumC1641470soj;
import X.EnumC1641550sor;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1629850sVz;
import X.InterfaceC1635560sfC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public final class FavoriteRecentStickerListViewModel extends FavoriteStickerListViewModel {
    public final int LLJJJIL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final InterfaceC1629850sVz<Effect> yQ2() {
        return new C1368405Xe();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r6) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteRecentStickerListViewModel.AQ2(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public final void BQ2(C1641640sp0<CategoryEffectModel> c1641640sp0) {
        List<Effect> value;
        List<Effect> effects;
        EnumC1641550sor enumC1641550sor = c1641640sp0.LIZIZ;
        if (enumC1641550sor != null) {
            int i = C1628790sUH.LIZ[enumC1641550sor.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        CategoryEffectModel categoryEffectModel = c1641640sp0.LIZ;
                        if (categoryEffectModel != null && (effects = categoryEffectModel.getEffects()) != null && !effects.isEmpty() && (!(effects instanceof Collection) || !effects.isEmpty())) {
                            for (Effect effect : effects) {
                                if (!C1629100sUm.LJI(effect) && !C1629100sUm.LJ(effect) && (effect == null || !Intrinsics.LJFF(effect.getName(), "related_title"))) {
                                    this.LLJIJIL.setValue(EnumC1641470soj.NONE);
                                    AQ2(effects);
                                    return;
                                }
                            }
                        }
                        this.LLJIJIL.setValue(EnumC1641470soj.EMPTY);
                        this.LLIZLLLIL.setValue(C13BV.INSTANCE);
                        return;
                    }
                    return;
                }
                Throwable th = c1641640sp0.LIZJ;
                if ((th instanceof StatusCodeException) && ((StatusCodeException) th).getStatusCode() == 8 && ((value = this.LLIZLLLIL.getValue()) == null || value.isEmpty())) {
                    this.LLJIJIL.setValue(EnumC1641470soj.EMPTY);
                    return;
                } else {
                    AQ2(C13BV.INSTANCE);
                    this.LLJIJIL.setValue(EnumC1641470soj.ERROR);
                    return;
                }
            }
            this.LLJIJIL.setValue(EnumC1641470soj.LOADING);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.InterfaceC1631540sYi
    public final void XH2(String str) {
        if (a0.LJJJIL(str)) {
            return;
        }
        this.LL.getStickerRepository().LJFF().LJIJJLI(str, null, true, false).observe(this.LLJJIJIIJIL, this.LLJJJ);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final boolean xQ2(Effect effect, boolean z) {
        String strLIZIZ = null;
        if (!z) {
            if (C1625940sPg.LJIIL(this.LL, effect)) {
                String strLIZIZ2 = C1629100sUm.LIZIZ(effect);
                Effect effectLLILIL = this.LL.LLILIL();
                if (effectLLILIL != null) {
                    strLIZIZ = C1629100sUm.LIZIZ(effectLLILIL);
                }
                if (Intrinsics.LJFF(strLIZIZ2, strLIZIZ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (C1625940sPg.LJIIJJI(this.LL, effect)) {
            String strLIZIZ3 = C1629100sUm.LIZIZ(effect);
            Effect effectLLILIL2 = this.LL.LLILIL();
            if (effectLLILIL2 != null) {
                strLIZIZ = C1629100sUm.LIZIZ(effectLLILIL2);
            }
            if (Intrinsics.LJFF(strLIZIZ3, strLIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public FavoriteRecentStickerListViewModel(StickerCategoryFragment stickerCategoryFragment, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, C1DRG c1drg, int i) {
        super(stickerCategoryFragment, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg);
        this.LLJJJIL = i;
    }
}
