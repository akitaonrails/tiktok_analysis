package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C13BV;
import X.C1625940sPg;
import X.C1629840sVy;
import X.C1DRG;
import X.C23117093z;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1628910sUT;
import X.InterfaceC1633140sbI;
import X.InterfaceC1635560sfC;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public class SharedPoolStickerListViewModel extends StickerListViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final List<Effect> wQ2(C1629840sVy<Effect> c1629840sVy, int i) {
        List<Effect> effects;
        int i2 = c1629840sVy.LIZIZ;
        int i3 = c1629840sVy.LIZJ;
        InterfaceC1633140sbI interfaceC1633140sbILJFF = this.LL.getStickerRepository().LJFF();
        List<EffectCategoryModel> listLJFF = C23117093z.LJFF(interfaceC1633140sbILJFF);
        if (i3 > 0 && listLJFF.size() > i3) {
            String key = ((EffectCategoryModel) ListProtector.get(listLJFF, i3)).getKey();
            if (key == null) {
                return C13BV.INSTANCE;
            }
            CategoryEffectModel categoryEffectModelLIZ = C23117093z.LIZ(interfaceC1633140sbILJFF, key);
            if (categoryEffectModelLIZ != null && (effects = categoryEffectModelLIZ.getEffects()) != null && !effects.isEmpty()) {
                if (i == 1) {
                    return Collections.singletonList(C1625940sPg.LIZIZ(this.LL, effects, i2));
                }
                return C1625940sPg.LJ(this.LL, effects, i2, i);
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final List<Effect> vQ2(C1629840sVy<Effect> c1629840sVy, int i, int i2, int i3, int i4) {
        List<Effect> effects;
        int i5 = c1629840sVy.LIZIZ;
        int i6 = c1629840sVy.LIZJ;
        InterfaceC1633140sbI interfaceC1633140sbILJFF = this.LL.getStickerRepository().LJFF();
        List<EffectCategoryModel> listLJFF = C23117093z.LJFF(interfaceC1633140sbILJFF);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i6 > 0 && listLJFF.size() > i6) {
            String key = ((EffectCategoryModel) ListProtector.get(listLJFF, i6)).getKey();
            if (key == null) {
                return C13BV.INSTANCE;
            }
            CategoryEffectModel categoryEffectModelLIZ = C23117093z.LIZ(interfaceC1633140sbILJFF, key);
            if (categoryEffectModelLIZ != null && (effects = categoryEffectModelLIZ.getEffects()) != null && !effects.isEmpty()) {
                if (i == 1) {
                    Pair pairLIZJ = C1625940sPg.LIZJ(effects, i5);
                    Object first = pairLIZJ.getFirst();
                    if (first != null) {
                        arrayList.add(first);
                    }
                    Object second = pairLIZJ.getSecond();
                    if (second != null) {
                        arrayList2.add(second);
                    }
                } else {
                    Pair pairLJFF = C1625940sPg.LJFF(effects, i5, i, i3);
                    arrayList.addAll((Collection) pairLJFF.getFirst());
                    arrayList2.addAll((Collection) pairLJFF.getSecond());
                }
                if (i2 == 1) {
                    Pair pairLJII = C1625940sPg.LJII(effects, i5);
                    Object first2 = pairLJII.getFirst();
                    if (first2 != null) {
                        arrayList.add(first2);
                    }
                    Object second2 = pairLJII.getSecond();
                    if (second2 != null) {
                        arrayList2.add(second2);
                    }
                } else {
                    Pair pairLJI = C1625940sPg.LJI(effects, i5, i2, i4);
                    arrayList.addAll((Collection) pairLJI.getFirst());
                    arrayList2.addAll((Collection) pairLJI.getSecond());
                }
            } else {
                return C13BV.INSTANCE;
            }
        }
        Bundle bundle = c1629840sVy.LJI;
        if (bundle != null) {
            bundle.putStringArray("preload_effect_ids", (String[]) arrayList2.toArray(new String[0]));
        }
        return arrayList;
    }

    public SharedPoolStickerListViewModel(StickerCategoryFragment stickerCategoryFragment, C1DRG c1drg, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1628910sUT interfaceC1628910sUT, InterfaceC1635560sfC interfaceC1635560sfC) {
        super(stickerCategoryFragment, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg, interfaceC1628910sUT, false, 64);
    }
}
