package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.C098200Yq;
import X.C0D8F;
import X.C0XSZ;
import X.C11NJ;
import X.C13R7;
import X.C13RD;
import X.C189200o6;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C318380Cdw;
import X.C324210CnL;
import X.C339800DTu;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1628910sUT;
import X.InterfaceC1635560sfC;
import X.InterfaceC20004513Ox;
import X.InterfaceC318360Cdu;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TemplateEffectsService;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MyEffectsViewModel extends FixedStickerListViewModel {
    public static final /* synthetic */ int LLJLLIL = 0;
    public final InterfaceC318360Cdu LLJJJIL;
    public final MutableLiveData<Pair<Effect, Integer>> LLJJJJ;
    public final MutableLiveData<C189200o6<Integer>> LLJJJJJIL;
    public final MutableLiveData<Pair<Effect, Integer>> LLJJJJLIIL;
    public final MutableLiveData<List<DraftEffect>> LLJJL;
    public final TemplateEffectsService LLJJLIIIJLLLLLLLZ;
    public final C11NJ LLJL;
    public NewFaceStickerListBean LLJLIL;
    public final MutableLiveData<C0D8F> LLJLILLLLZIIL;
    public final MutableLiveData LLJLL;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.InterfaceC1631540sYi
    public final void XH2(String str) {
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static IEffectCreatorService EQ2() {
        return (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLJL.LJ();
        super.onCleared();
    }

    public final void GQ2(Object obj, String str) {
        C13RD effectConfig;
        InterfaceC20004513Ox interfaceC20004513Ox;
        C13R7 c13r7;
        EffectConfiguration effectConfigurationLJJIIZ = this.LL.getStickerRepository().LJIJJ().LJJIIZ();
        if (effectConfigurationLJJIIZ == null || (effectConfig = effectConfigurationLJJIIZ.getEffectConfig()) == null || (interfaceC20004513Ox = effectConfig.LJJIFFI) == null || (c13r7 = effectConfig.LJIJI) == null) {
            return;
        }
        try {
            String strConvertObjToJson = c13r7.LIZ.convertObjToJson(obj);
            if (strConvertObjToJson != null) {
                interfaceC20004513Ox.LJIIJ(str, strConvertObjToJson, "");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C339800DTu c339800DTu = C339800DTu.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveToCache(");
            sbLIZ.append(str);
            sbLIZ.append(") failed: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIIIZZ(c339800DTu, "MyEffectsViewModel", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(java.util.List<com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect> r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel.HQ2(java.util.List, X.05Vn):java.lang.Object");
    }

    public final void FQ2(String str, String str2, List<MobileEffect> list, List<DraftEffect> list2) {
        C189200o6<Integer> c189200o6M1boximpl;
        int size;
        Integer numValueOf = null;
        int i = 0;
        if (str != null) {
            Iterator<MobileEffect> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().getEffectId(), str)) {
                    if (i2 != -1) {
                        numValueOf = Integer.valueOf(i2);
                    }
                } else {
                    i2++;
                }
            }
            Iterator<DraftEffect> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it3.next().getDraft().getEffectId(), str)) {
                    if (i != -1 && (size = list.size() + i) != -1) {
                        numValueOf = Integer.valueOf(size);
                    }
                } else {
                    i++;
                }
            }
        } else if (str2 != null) {
            Iterator<DraftEffect> it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it4.next().getDraft().getDraftId(), str2)) {
                    if (i != -1) {
                        numValueOf = Integer.valueOf(i + list.size());
                    }
                } else {
                    i++;
                }
            }
        }
        MutableLiveData<C189200o6<Integer>> mutableLiveData = this.LLJJJJJIL;
        if (numValueOf == null) {
            C098200Yq c098200Yq = new C098200Yq(new C318380Cdw(str, str2));
            C189200o6.m2constructorimpl(c098200Yq);
            c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        } else {
            C189200o6.m2constructorimpl(numValueOf);
            c189200o6M1boximpl = C189200o6.m1boximpl(numValueOf);
        }
        mutableLiveData.setValue(c189200o6M1boximpl);
    }

    public MyEffectsViewModel(EffectTemplateCategoryFragment effectTemplateCategoryFragment, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1628910sUT interfaceC1628910sUT, C324210CnL c324210CnL, C1DRG c1drg) {
        super(effectTemplateCategoryFragment, c1drg, interfaceC1625410sOp, interfaceC1624480sNK, interfaceC1628910sUT, interfaceC1635560sfC);
        this.LLJJJIL = c324210CnL;
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = new MutableLiveData<>();
        this.LLJJL = new MutableLiveData<>();
        TemplateEffectsService.LIZ.getClass();
        this.LLJJLIIIJLLLLLLLZ = C0XSZ.LIZ();
        this.LLJL = new C11NJ();
        MutableLiveData<C0D8F> mutableLiveData = new MutableLiveData<>();
        this.LLJLILLLLZIIL = mutableLiveData;
        this.LLJLL = mutableLiveData;
    }
}
