package com.ss.android.ugc.aweme.sticker.repository;

import X.C0C64;
import X.C13LP;
import X.C1624340sN6;
import X.C1629220sUy;
import X.C1629230sUz;
import X.C1629250sV1;
import X.C1629270sV3;
import X.C1629320sV8;
import X.C19719612Di;
import X.C19GS;
import X.InterfaceC1627350sRx;
import X.InterfaceC1628820sUK;
import X.InterfaceC1629370sVD;
import Y.AComparatorS22S0000000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS75S1000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class TiktokStickerDataManager extends DefaultStickerDataManager {
    public final C1629320sV8 LLLIIIIL;
    public final C1629250sV1 LLLIIIL;
    public Effect LLLIIL;
    public final C1629270sV3 LLLIILIL;

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.InterfaceC1624480sNK
    public final void LJIJJ() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.InterfaceC1624480sNK
    public final C1629270sV3 LJJJIL() {
        return this.LLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.InterfaceC1624480sNK
    public final C1629320sV8 LJJLIIIJJIZ() {
        return this.LLLIIIIL;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.InterfaceC1624480sNK
    public final void LJJJJI(C1629220sUy c1629220sUy) {
        Effect effect;
        if (c1629220sUy.LJFF) {
            effect = (Effect) C13LP.LJJLIIIJL(c1629220sUy.LIZ);
        } else {
            effect = null;
        }
        this.LLLIIL = effect;
        C1629250sV1 c1629250sV1 = this.LLLIIIL;
        int i = c1629220sUy.LIZIZ;
        List<Effect> list = c1629220sUy.LIZ;
        int i2 = c1629220sUy.LIZJ;
        InterfaceC1627350sRx interfaceC1627350sRx = this.LLJJI;
        int i3 = c1629250sV1.LIZIZ;
        c1629250sV1.LIZIZ = i3 + 1;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_effect_panel_sticker_position", true, true) && i2 == 0) {
            i2 = c1629250sV1.LIZJ;
            c1629250sV1.LIZJ = i2 - 1;
        }
        c1629250sV1.LIZ.add(new C1629220sUy(list, i, i2, 56));
        Set<C1629220sUy> set = c1629250sV1.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C1629220sUy c1629220sUy2 : set) {
            if (c1629220sUy2.LIZIZ == i) {
                arrayList.add(c1629220sUy2);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(12), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C1629220sUy) it2.next()).LIZ, arrayList2);
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LJJJJI(arrayList2));
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "fix_effect_panel_sticker_position", true, true) && list.size() == 1) {
            C13LP.LJLJJLL(listLLIIII);
        }
        interfaceC1627350sRx.LIZJ().LIZJ(new C1629220sUy(listLLIIII, i, i3, 56));
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.InterfaceC1624480sNK
    public final void LJIIL(C1629230sUz c1629230sUz, AwS75S1000000_25 awS75S1000000_25) {
        final AwS234S0300000_25 awS234S0300000_25 = new AwS234S0300000_25(awS75S1000000_25, this, c1629230sUz, 40);
        LIZ(c1629230sUz.LIZ, null, new IFetchEffectListByIdsListener() { // from class: X.0sV0
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                if (effectListResponse != null) {
                    awS234S0300000_25.invoke(effectListResponse);
                }
            }
        });
    }

    public TiktokStickerDataManager(C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1628820sUK interfaceC1628820sUK, C1624340sN6 c1624340sN6, InterfaceC1629370sVD interfaceC1629370sVD, LifecycleOwner lifecycleOwner, int i) {
        super(c19gs, c1629320sV8, interfaceC1628820sUK, c1624340sN6, interfaceC1629370sVD, null, lifecycleOwner, i, 32);
        this.LLLIIIIL = c1629320sV8;
        this.LLLIIIL = new C1629250sV1();
        this.LLLIILIL = new C1629270sV3();
    }
}
