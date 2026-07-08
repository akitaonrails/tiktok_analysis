package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C1625940sPg;
import X.C1633080sbC;
import X.C2281551ESb;
import X.C228600uS;
import X.C23117093z;
import X.EnumC1641470soj;
import X.InterfaceC1624480sNK;
import X.InterfaceC1629880sW2;
import X.InterfaceC1635640sfK;
import Y.AObserverS227S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerCategoryListViewModel extends HumbleViewModel implements InterfaceC1635640sfK {
    public final LifecycleOwner LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final InterfaceC1629880sW2 LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<EnumC1641470soj> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<List<EffectCategoryModel>> LLJIJIL;
    public final MediatorLiveData LLJILJIL;

    @Override // X.InterfaceC1635640sfK
    public final void Pv2() {
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int vQ2() {
        List<EffectCategoryModel> listLJFF = C23117093z.LJFF(this.LLILLJJLI.getStickerRepository().LJFF());
        int size = listLJFF.size();
        int iLJIIZILJ = this.LLILLJJLI.LJIIZILJ();
        if (iLJIIZILJ >= 0 && iLJIIZILJ < size) {
            return this.LLILLJJLI.LJIIZILJ();
        }
        int iLIZLLL = C1625940sPg.LIZLLL(this.LLILLJJLI);
        if (iLIZLLL < 0 || iLIZLLL >= listLJFF.size()) {
            return 0;
        }
        return iLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2() {
        /*
            r4 = this;
            X.0sNK r0 = r4.LLILLJJLI
            X.0sRx r0 = r0.getStickerRepository()
            X.0sbI r0 = r0.LJFF()
            java.util.List r2 = X.C23117093z.LJFF(r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L7c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7c
        L18:
            X.0sNK r0 = r4.LLILLJJLI
            X.0sV8 r0 = r0.LJJLIIIJJIZ()
            java.lang.String r0 = r0.LIZLLL
            if (r0 == 0) goto L4c
            int r0 = r0.length()
            if (r0 == 0) goto L4c
            X.0sNK r0 = r4.LLILLJJLI
            X.0sV8 r0 = r0.LJJLIIIJJIZ()
            java.lang.String r1 = r0.LIZLLL
            if (r1 == 0) goto L47
            X.0sNK r0 = r4.LLILLJJLI
            int r0 = X.C1625940sPg.LIZ(r0, r1)
        L38:
            r4.LLILZIL = r0
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r4.LLIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
        L41:
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel>> r0 = r4.LLJIJIL
            r0.setValue(r2)
            return
        L47:
            int r0 = r4.vQ2()
            goto L38
        L4c:
            X.0sNK r0 = r4.LLILLJJLI
            java.lang.String r0 = r0.LJIIJ()
            int r0 = r0.length()
            if (r0 != 0) goto L5d
            int r0 = r4.vQ2()
            goto L38
        L5d:
            X.0sNK r1 = r4.LLILLJJLI
            java.lang.String r0 = r1.LJIIJ()
            int r0 = X.C1625940sPg.LIZ(r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r1 = r3.intValue()
            r0 = -1
            if (r1 <= r0) goto L77
            int r0 = r3.intValue()
            goto L38
        L77:
            int r0 = r4.vQ2()
            goto L38
        L7c:
            java.util.Iterator r1 = r2.iterator()
        L80:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r0 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r0
            java.lang.String r0 = r0.getKey()
            if (r0 == 0) goto L98
            int r0 = r0.length()
            if (r0 != 0) goto L80
        L98:
            X.0sNK r0 = r4.LLILLJJLI
            X.0sV8 r0 = r0.LJJLIIIJJIZ()
            java.lang.String r1 = r0.LIZLLL
            if (r1 == 0) goto Lab
            X.0sNK r0 = r4.LLILLJJLI
            int r0 = X.C1625940sPg.LIZ(r0, r1)
            r4.LLILZIL = r0
            goto L41
        Lab:
            X.0sNK r0 = r4.LLILLJJLI
            int r0 = X.C1625940sPg.LIZLLL(r0)
            r4.LLILZIL = r0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel.wQ2():void");
    }

    @Override // X.InterfaceC1635640sfK
    public final void lE() {
        this.LLILZ = System.currentTimeMillis();
        this.LLILLJJLI.getStickerRepository().LJFF().LJIIJ(null, true, true, this.LLILLJJLI.LJJLIIIJJIZ().LJFF).observe(this.LL, new AObserverS227S0100000_25(this, 45));
    }

    @Override // X.InterfaceC1635640sfK
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1635640sfK
    public final String Xs2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1635640sfK
    public final int eK2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1635640sfK
    public final MutableLiveData on1() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1635640sfK
    public final MediatorLiveData t() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1635640sfK
    public final void dS0(C1633080sbC c1633080sbC) {
        this.LLILLJJLI.getStickerRepository().LJIIIZ(c1633080sbC);
    }

    public StickerCategoryListViewModel(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1629880sW2 interfaceC1629880sW2) {
        super(lifecycleOwner);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = interfaceC1629880sW2;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLIZ = mutableLiveData;
        this.LLIZLLLIL = mutableLiveData;
        MutableLiveData<EnumC1641470soj> mutableLiveData2 = new MutableLiveData<>();
        this.LLJ = mutableLiveData2;
        this.LLJI = mutableLiveData2;
        MutableLiveData<List<EffectCategoryModel>> mutableLiveData3 = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData3;
        this.LLJILJIL = C228600uS.LIZ(mutableLiveData3);
        if (C2281551ESb.LIZIZ.LJFF().LIZ()) {
            mutableLiveData2.setValue(EnumC1641470soj.LOADING);
        }
        interfaceC1624480sNK.getStickerRepository().LJFF().LJIILL().observe(this.LL, new AObserverS227S0100000_25(this, 150));
        wQ2();
    }
}
