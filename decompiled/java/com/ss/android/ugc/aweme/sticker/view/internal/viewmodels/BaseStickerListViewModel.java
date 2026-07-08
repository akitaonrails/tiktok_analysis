package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C01GW;
import X.C05XI;
import X.C0AUU;
import X.C0LCS;
import X.C11NJ;
import X.C13BV;
import X.C1449000noI;
import X.C1622820sKe;
import X.C1624200sMs;
import X.C1625440sOs;
import X.C1625460sOu;
import X.C1625940sPg;
import X.C1626430sQT;
import X.C1629830sVx;
import X.C1629840sVy;
import X.C1DRG;
import X.C443120HZe;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1448980noG;
import X.EnumC1641420soe;
import X.EnumC1641470soj;
import X.InterfaceC1623680sM2;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1625550sP3;
import X.InterfaceC1625560sP4;
import X.InterfaceC1628910sUT;
import X.InterfaceC1629850sVz;
import X.InterfaceC1631540sYi;
import X.InterfaceC1635560sfC;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.services.EffectPrefetchPreloadConfig;
import com.ss.android.ugc.aweme.sticker.ab.FixFirstCollectEffectPreloadConfig;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public abstract class BaseStickerListViewModel extends HumbleViewModel implements InterfaceC1631540sYi<Effect> {
    public final InterfaceC1624480sNK LL;
    public final InterfaceC1625410sOp LLILLJJLI;
    public final InterfaceC1635560sfC LLILLL;
    public final C1DRG LLILZ;
    public final InterfaceC1628910sUT LLILZIL;
    public final C01GW LLILZLL;
    public final C11NJ LLIZ;
    public final MutableLiveData<List<Effect>> LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData<Effect> LLJI;
    public final MutableLiveData<EnumC1641470soj> LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData<Integer> LLJILJILJ;
    public final MutableLiveData<C0LCS<Effect>> LLJILLL;
    public final MutableLiveData<C0LCS<Effect>> LLJJ;
    public final C1629830sVx LLJJI;
    public final C01GW LLJJIII;
    public final boolean LLJJIJI;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract List<Effect> vQ2(C1629840sVy<Effect> c1629840sVy, int i, int i2, int i3, int i4);

    public abstract List<Effect> wQ2(C1629840sVy<Effect> c1629840sVy, int i);

    @Override // X.InterfaceC1631540sYi
    public final LiveData<C443120HZe<Effect, EnumC1641420soe, Integer>> kS0() {
        return this.LLILZIL.LIZ();
    }

    public InterfaceC1629850sVz<Effect> yQ2() {
        return new C05XI();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LLIZ.LJ();
    }

    @Override // X.InterfaceC1631540sYi
    public final MutableLiveData E81() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1631540sYi
    public final MutableLiveData Ke0() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1631540sYi
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1631540sYi
    public final MutableLiveData<Boolean> LLLIIIL() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1631540sYi
    public final MutableLiveData Xp0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1631540sYi
    public final LiveData<List<Effect>> he() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1631540sYi
    public final MutableLiveData oI2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1631540sYi
    public final MutableLiveData<Integer> sk0() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1631540sYi
    public final int Gp(Effect effect) {
        return ((InterfaceC1629850sVz) this.LLJJIII.getValue()).Gp(effect);
    }

    @Override // X.InterfaceC1631540sYi
    public final void IF0(C1629840sVy<Effect> c1629840sVy) {
        String[] stringArray;
        EffectPrefetchPreloadConfig effectPrefetchPreloadConfig = EffectPrefetchPreloadConfig.INSTANCE;
        if (effectPrefetchPreloadConfig.propPanelPreloadEnabled() || effectPrefetchPreloadConfig.propPanelPrefetchEnabled()) {
            List<Effect> listVQ2 = vQ2(c1629840sVy, effectPrefetchPreloadConfig.leftPrefetchCount(), effectPrefetchPreloadConfig.rightPrefetchCount(), effectPrefetchPreloadConfig.leftPreloadCount(), effectPrefetchPreloadConfig.rightPreloadCount());
            Bundle bundle = c1629840sVy.LJI;
            if (bundle != null) {
                stringArray = bundle.getStringArray("preload_effect_ids");
            } else {
                stringArray = null;
            }
            this.LLILLJJLI.LIZLLL(listVQ2, stringArray);
        }
    }

    @Override // X.InterfaceC1631540sYi
    public final void ax0(C1629840sVy<Effect> c1629840sVy) {
        boolean z;
        String key;
        String name;
        String string;
        Effect effect = c1629840sVy.LIZ;
        int i = c1629840sVy.LIZIZ;
        int i2 = c1629840sVy.LIZJ;
        boolean z2 = c1629840sVy.LIZLLL;
        boolean z3 = c1629840sVy.LJ;
        boolean z4 = c1629840sVy.LJFF;
        Bundle bundle = c1629840sVy.LJI;
        InterfaceC1625560sP4 interfaceC1625560sP4 = c1629840sVy.LJII;
        Function0<Unit> function0 = c1629840sVy.LJIIIIZZ;
        Function0<Unit> function02 = c1629840sVy.LJIIIZ;
        if (C1624200sMs.LJIIIIZZ(this.LL.LLILIL())) {
            return;
        }
        boolean zXQ2 = xQ2(effect, z3);
        if (z2) {
            z = zXQ2;
        } else {
            z = false;
        }
        EffectCategoryModel effectCategoryModelLJIIIIZZ = C1625940sPg.LJIIIIZZ(this.LL, i2);
        String str = "";
        if ((bundle == null || (key = bundle.getString("tab_key")) == null) && (effectCategoryModelLJIIIIZZ == null || (key = effectCategoryModelLJIIIIZZ.getKey()) == null)) {
            key = "";
        }
        if (bundle != null && (string = bundle.getString("tab_name")) != null) {
            str = string;
        } else if (effectCategoryModelLJIIIIZZ != null && (name = effectCategoryModelLJIIIIZZ.getName()) != null) {
            str = name;
        }
        this.LL.LJII().LJIIIZ(new C1449000noI(effect, i2, i, z, z3, false, false, "effect_panel", str, key, 1120));
        if (zXQ2 && !z3) {
            if (z2) {
                if (function0 != null) {
                    function0.invoke();
                }
                InterfaceC1625410sOp interfaceC1625410sOp = this.LLILLJJLI;
                EnumC1448980noG enumC1448980noG = EnumC1448980noG.UI_CLICK;
                if (bundle != null) {
                    C786410Ut5.LJJJI("action_type", "panel_click_cancel", bundle);
                } else {
                    bundle = null;
                }
                interfaceC1625410sOp.LIZJ(new C1625460sOu(i, bundle, enumC1448980noG, effect, true));
                return;
            }
            return;
        }
        if (C1626430sQT.LIZIZ(this.LL, effect, false)) {
            if (!zXQ2) {
                zQ2(function02, effect, i, c1629840sVy, z4, bundle, i2, this.LLJJI, interfaceC1625560sP4, this.LL);
                return;
            }
            return;
        }
        zQ2(function02, effect, i, c1629840sVy, z4, bundle, i2, this.LLJJI, interfaceC1625560sP4, this.LL);
    }

    @Override // X.InterfaceC1631540sYi
    public final Pair Nl0(Effect effect, boolean z) {
        return this.LLILZIL.LIZIZ(effect, z);
    }

    public boolean xQ2(Effect effect, boolean z) {
        if (!z) {
            return C1625940sPg.LJIIL(this.LL, effect);
        }
        return C1625940sPg.LJIIJJI(this.LL, effect);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0sVx] */
    public BaseStickerListViewModel(LifecycleOwner lifecycleOwner, C1DRG c1drg, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1628910sUT interfaceC1628910sUT, InterfaceC1635560sfC interfaceC1635560sfC) {
        boolean z;
        super(lifecycleOwner);
        this.LL = interfaceC1624480sNK;
        this.LLILLJJLI = interfaceC1625410sOp;
        this.LLILLL = interfaceC1635560sfC;
        this.LLILZ = c1drg;
        this.LLILZIL = interfaceC1628910sUT;
        this.LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1170));
        this.LLIZ = new C11NJ();
        this.LLIZLLLIL = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.TRUE);
        this.LLJ = mutableLiveData;
        this.LLJI = new MutableLiveData<>();
        new MutableLiveData();
        this.LLJIJIL = new MutableLiveData<>();
        this.LLJILJIL = new MutableLiveData<>(Boolean.FALSE);
        this.LLJILJILJ = new MutableLiveData<>(-1);
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new MutableLiveData<>();
        this.LLJJI = new InterfaceC1625550sP3() { // from class: X.0sVx
            @Override // X.InterfaceC1625550sP3
            public final void LJIIIIZZ(Effect effect) {
                BaseStickerListViewModel baseStickerListViewModel = this.LL;
                baseStickerListViewModel.LLILZIL.LIZJ(effect, EnumC1641420soe.DOWNLOADING, null, true);
            }

            @Override // X.InterfaceC1625550sP3
            public final void onSuccess(Effect effect) {
                BaseStickerListViewModel baseStickerListViewModel = this.LL;
                baseStickerListViewModel.LLILZIL.LIZJ(effect, EnumC1641420soe.DOWNLOAD_SUCCESS, null, true);
                C1638230sjV.LIZ.LJI(effect, "effect_icon");
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJII(int i, Effect effect) {
                BaseStickerListViewModel baseStickerListViewModel = this.LL;
                baseStickerListViewModel.LLILZIL.LIZJ(effect, EnumC1641420soe.DOWNLOADING, Integer.valueOf(i), true);
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJIILLIIL(Effect effect, ExceptionResult exceptionResult) {
                BaseStickerListViewModel baseStickerListViewModel = this.LL;
                baseStickerListViewModel.LLILZIL.LIZJ(effect, EnumC1641420soe.DOWNLOAD_FAILED, null, true);
                this.LL.LLJILLL.setValue(new C0LCS<>(effect));
                if ((!Intrinsics.LJFF("10001", exceptionResult.getMsg()) && !Intrinsics.LJFF("10029", exceptionResult.getMsg())) || Intrinsics.LJFF("10028", exceptionResult.getMsg())) {
                    this.LL.LLJJ.setValue(new C0LCS<>(effect));
                }
            }
        };
        this.LLJJIII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1221));
        if (!C0AUU.LIZLLL() && !C0AUU.LIZJ()) {
            z = false;
        } else {
            z = true;
        }
        this.LLJJIJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    public final void zQ2(Function0 function0, Effect effect, int i, C1629840sVy c1629840sVy, boolean z, Bundle bundle, int i2, C1629830sVx c1629830sVx, InterfaceC1625560sP4 interfaceC1625560sP4, InterfaceC1624480sNK interfaceC1624480sNK) {
        List<Effect> listVQ2;
        ?? arrayList;
        C1625440sOs c1625440sOsLIZIZ;
        UrlModel fileUrl;
        AwS269S0300000_25 awS269S0300000_25 = new AwS269S0300000_25(function0, (Function0<Unit>) this, (BaseStickerListViewModel) effect, (Effect) 33);
        EnumC1448980noG enumC1448980noG = EnumC1448980noG.UI_CLICK;
        if (z) {
            EffectPrefetchPreloadConfig effectPrefetchPreloadConfig = EffectPrefetchPreloadConfig.INSTANCE;
            if (!effectPrefetchPreloadConfig.propPanelPreloadEnabled() && !effectPrefetchPreloadConfig.propPanelPrefetchEnabled()) {
                listVQ2 = wQ2(c1629840sVy, this.LL.LJJLIIIJJIZ().LIZJ);
            } else {
                listVQ2 = vQ2(c1629840sVy, effectPrefetchPreloadConfig.leftPrefetchCount(), effectPrefetchPreloadConfig.rightPrefetchCount(), effectPrefetchPreloadConfig.leftPreloadCount(), effectPrefetchPreloadConfig.rightPreloadCount());
            }
            if (FixFirstCollectEffectPreloadConfig.isEnabled()) {
                arrayList = new ArrayList();
                for (Effect effect2 : listVQ2) {
                    Effect effect3 = effect2;
                    if (effect3 != null && (fileUrl = effect3.getFileUrl()) != null && fileUrl.isValid()) {
                        arrayList.add(effect2);
                    }
                }
            }
            c1625440sOsLIZIZ = C1622820sKe.LIZIZ(effect, i, enumC1448980noG, arrayList, bundle, c1629830sVx, interfaceC1625560sP4, i2, false, interfaceC1624480sNK.LJIJI(), "effect_panel", 128);
            if (!this.LLJJIJI && this.LLILZLL.getValue() != null) {
                InterfaceC1623680sM2 interfaceC1623680sM2 = (InterfaceC1623680sM2) this.LLILZLL.getValue();
                if (interfaceC1623680sM2 != null) {
                    interfaceC1623680sM2.Nc1(c1625440sOsLIZIZ, awS269S0300000_25, AFwS214S0000000_25.get$arr$(422));
                    return;
                }
                return;
            }
            awS269S0300000_25.invoke();
            this.LLILLJJLI.LIZJ(c1625440sOsLIZIZ);
        }
        listVQ2 = C13BV.INSTANCE;
        arrayList = listVQ2;
        c1625440sOsLIZIZ = C1622820sKe.LIZIZ(effect, i, enumC1448980noG, arrayList, bundle, c1629830sVx, interfaceC1625560sP4, i2, false, interfaceC1624480sNK.LJIJI(), "effect_panel", 128);
        if (!this.LLJJIJI) {
        }
        awS269S0300000_25.invoke();
        this.LLILLJJLI.LIZJ(c1625440sOsLIZIZ);
    }
}
