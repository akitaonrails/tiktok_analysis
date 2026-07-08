package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.C1449260noi;
import X.C1DRG;
import X.C2097608Jq;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1625880sPa;
import X.InterfaceC1628910sUT;
import X.InterfaceC1635560sfC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TemplateEffectsViewModel extends FixedStickerListViewModel {
    public final Effect LLJJJIL;
    public final InterfaceC1625880sPa LLJJJJ;
    public final MutableLiveData<Integer> LLJJJJJIL;
    public final MutableLiveData LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel
    public final List<Effect> DQ2(List<? extends Effect> list) {
        Effect effect = this.LLJJJIL;
        if (effect != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Effect effect2 = (Effect) it2.next();
                if (Intrinsics.LJFF(effect2.getEffectId(), effect.getEffectId())) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    if (effect2 != null) {
                        arrayList.remove(effect2);
                        ListProtector.add(arrayList, 1, effect2);
                        return arrayList;
                    }
                }
            }
        }
        return list;
    }

    public final void EQ2(String str) {
        String str2;
        if (str != null && (str2 = this.LLJJL) != null && !Intrinsics.LJFF(str2, str)) {
            this.LLJJJJJIL.setValue(1);
            this.LLJJL = null;
            this.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    public static void FQ2(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[1];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_success", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str != null) {
            mapLJIIJ.put("error_msg", str);
        }
        C1449260noi.LJ("get_user_effect_list_result", mapLJIIJ);
    }

    public TemplateEffectsViewModel(EffectTemplateCategoryFragment effectTemplateCategoryFragment, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1628910sUT interfaceC1628910sUT, Effect effect, C1DRG c1drg) {
        super(effectTemplateCategoryFragment, c1drg, interfaceC1625410sOp, interfaceC1624480sNK, interfaceC1628910sUT, interfaceC1635560sfC);
        this.LLJJJIL = effect;
        this.LLJJJJ = interfaceC1624480sNK.getStickerRepository().LJFF();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LLJJJJJIL = mutableLiveData;
        this.LLJJJJLIIL = mutableLiveData;
    }
}
