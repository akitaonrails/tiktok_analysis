package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C13BV;
import X.C1625940sPg;
import X.C1629020sUe;
import X.C1629290sV5;
import X.C1629840sVy;
import X.C1641640sp0;
import X.C1DRG;
import X.EnumC1641470soj;
import X.EnumC1641550sor;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1628910sUT;
import X.InterfaceC1629850sVz;
import X.InterfaceC1635560sfC;
import Y.AObserverS227S0100000_25;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public abstract class StickerListViewModel extends BaseStickerListViewModel {
    public final LifecycleOwner LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final AObserverS227S0100000_25 LLJJJ;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void AQ2(List<? extends Effect> list) {
        ((InterfaceC1629850sVz) this.LLJJIII.getValue()).LIZ(0, list);
        this.LLIZLLLIL.setValue(list);
    }

    public void BQ2(C1641640sp0<CategoryEffectModel> c1641640sp0) {
        List<? extends Effect> effects;
        EnumC1641550sor enumC1641550sor = c1641640sp0.LIZIZ;
        if (enumC1641550sor != null) {
            int i = C1629020sUe.LIZ[enumC1641550sor.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        CategoryEffectModel categoryEffectModel = c1641640sp0.LIZ;
                        ArrayList arrayList = null;
                        if (categoryEffectModel != null) {
                            effects = categoryEffectModel.getEffects();
                        } else {
                            effects = null;
                        }
                        if (this.LLJJIJIL) {
                            if (effects != null) {
                                arrayList = new ArrayList();
                                for (Effect effect : effects) {
                                    if (!effect.isBusiness()) {
                                        arrayList.add(effect);
                                    }
                                }
                            }
                            effects = arrayList;
                        }
                        if (categoryEffectModel != null && effects != null && !effects.isEmpty()) {
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
                this.LLJIJIL.setValue(EnumC1641470soj.ERROR);
                return;
            }
            this.LLJIJIL.setValue(EnumC1641470soj.LOADING);
        }
    }

    public void XH2(String str) {
        if (a0.LJJJIL(str)) {
            return;
        }
        this.LL.getStickerRepository().LJFF().LJIJJLI(str, null, true, false).observe(this.LLJJIJIIJIL, this.LLJJJ);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public List<Effect> wQ2(C1629840sVy<Effect> c1629840sVy, int i) {
        List<Effect> listLJ;
        Effect effectLIZIZ;
        if (i == 1) {
            List<Effect> value = this.LLIZLLLIL.getValue();
            if (value != null) {
                effectLIZIZ = C1625940sPg.LIZIZ(this.LL, value, c1629840sVy.LIZIZ);
            } else {
                effectLIZIZ = null;
            }
            return Collections.singletonList(effectLIZIZ);
        }
        List<Effect> value2 = this.LLIZLLLIL.getValue();
        if (value2 != null && (listLJ = C1625940sPg.LJ(this.LL, value2, c1629840sVy.LIZIZ, i)) != null) {
            return listLJ;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public List<Effect> vQ2(C1629840sVy<Effect> c1629840sVy, int i, int i2, int i3, int i4) {
        Pair pairLJFF;
        Pair pairLJI;
        Pair pairLJII;
        Pair pairLIZJ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i == 1) {
            List<Effect> value = this.LLIZLLLIL.getValue();
            if (value != null && (pairLIZJ = C1625940sPg.LIZJ(value, c1629840sVy.LIZIZ)) != null) {
                Object first = pairLIZJ.getFirst();
                if (first != null) {
                    arrayList.add(first);
                }
                Object second = pairLIZJ.getSecond();
                if (second != null) {
                    arrayList2.add(second);
                }
            }
        } else {
            List<Effect> value2 = this.LLIZLLLIL.getValue();
            if (value2 != null && (pairLJFF = C1625940sPg.LJFF(value2, c1629840sVy.LIZIZ, i, i3)) != null) {
                arrayList.addAll((Collection) pairLJFF.getFirst());
                arrayList2.addAll((Collection) pairLJFF.getSecond());
            }
        }
        if (i2 == 1) {
            List<Effect> value3 = this.LLIZLLLIL.getValue();
            if (value3 != null && (pairLJII = C1625940sPg.LJII(value3, c1629840sVy.LIZIZ)) != null) {
                Object first2 = pairLJII.getFirst();
                if (first2 != null) {
                    arrayList.add(first2);
                }
                Object second2 = pairLJII.getSecond();
                if (second2 != null) {
                    arrayList2.add(second2);
                }
            }
        } else {
            List<Effect> value4 = this.LLIZLLLIL.getValue();
            if (value4 != null && (pairLJI = C1625940sPg.LJI(value4, c1629840sVy.LIZIZ, i2, i4)) != null) {
                arrayList.addAll((Collection) pairLJI.getFirst());
                arrayList2.addAll((Collection) pairLJI.getSecond());
            }
        }
        Bundle bundle = c1629840sVy.LJI;
        if (bundle != null) {
            bundle.putStringArray("preload_effect_ids", (String[]) arrayList2.toArray(new String[0]));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StickerListViewModel(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, C1DRG c1drg, InterfaceC1628910sUT interfaceC1628910sUT, boolean z, int i) {
        boolean z2 = z;
        InterfaceC1628910sUT c1629290sV5 = (i & 32) != 0 ? new C1629290sV5(interfaceC1624480sNK.getStickerRepository().LJI(), null) : interfaceC1628910sUT;
        z2 = (i & 64) != 0 ? false : z2;
        super(lifecycleOwner, c1drg, interfaceC1625410sOp, interfaceC1624480sNK, c1629290sV5, interfaceC1635560sfC);
        this.LLJJIJIIJIL = lifecycleOwner;
        this.LLJJIJIL = z2;
        this.LLJJJ = new AObserverS227S0100000_25(this, 151);
    }
}
