package com.ss.android.ugc.slideslip.model;

import X.C0C0O;
import X.C11NJ;
import X.C11NZ;
import X.C11ON;
import X.C11PQ;
import X.C11PR;
import X.C11RO;
import X.C11S5;
import X.C1444550nh7;
import X.C1622820sKe;
import X.C1625440sOs;
import X.C1625920sPe;
import X.C1626480sQY;
import X.C1629340sVA;
import X.C1698220uIG;
import X.C19475711Hn;
import X.C2026407wk;
import X.C786410Ut5;
import X.EnumC1448980noG;
import X.InterfaceC1624480sNK;
import X.InterfaceC1626470sQX;
import X.InterfaceC1627350sRx;
import X.InterfaceC1627740sSa;
import X.InterfaceC1629300sV6;
import X.InterfaceC1645720sva;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bytebench.SlideSlipPreloadExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes26.dex */
public final class SlideSlipLoadingController implements LifecycleEventObserver {
    public final LifecycleOwner LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final InterfaceC1645720sva LLILLL;
    public final C11NZ<List<InterfaceC1626470sQX>> LLILZ;
    public final C11NZ<Effect> LLILZIL;
    public final C11NZ<Integer> LLILZLL;
    public final C11NJ LLIZ;
    public final C11PR<Boolean> LLIZLLLIL;
    public final boolean LLJ;
    public final List<Effect> LLJI;
    public final List<Effect> LLJIJIL;
    public final C11PR<Unit> LLJILJIL;

    public final void LIZ(Effect effect) {
        InterfaceC1624480sNK interfaceC1624480sNK;
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1629300sV6 interfaceC1629300sV6LJI;
        InterfaceC1627350sRx stickerRepository2;
        InterfaceC1627740sSa interfaceC1627740sSaLJIILLIIL;
        C11PQ c11pqLIZIZ;
        InterfaceC1624480sNK interfaceC1624480sNK2;
        InterfaceC1627350sRx stickerRepository3;
        InterfaceC1627740sSa interfaceC1627740sSaLJIILLIIL2;
        if (!this.LLJ ? !((interfaceC1624480sNK = this.LLILLJJLI) == null || (stickerRepository = interfaceC1624480sNK.getStickerRepository()) == null || (interfaceC1629300sV6LJI = stickerRepository.LJI()) == null || !interfaceC1629300sV6LJI.LIZ(effect)) : !((interfaceC1624480sNK2 = this.LLILLJJLI) == null || (stickerRepository3 = interfaceC1624480sNK2.getStickerRepository()) == null || (interfaceC1627740sSaLJIILLIIL2 = stickerRepository3.LJIILLIIL()) == null || !interfaceC1627740sSaLJIILLIIL2.LIZ(effect, true))) {
            ((ArrayList) this.LLJIJIL).add(effect);
            this.LLJILJIL.onNext(Unit.LIZ);
            return;
        }
        if (C0C0O.LIZ()) {
            C1625440sOs c1625440sOsLIZIZ = C1622820sKe.LIZIZ(effect, 0, EnumC1448980noG.MANUAL_SET, null, new Bundle(), null, null, 0, false, new C1625920sPe(true, false), "shoot_horizontal_carousel", 245);
            Bundle bundle = c1625440sOsLIZIZ.LJ;
            if (bundle != null) {
                C786410Ut5.LJJJI("prop_selected_from", "prop_carousel_trending", bundle);
            }
            Bundle bundle2 = c1625440sOsLIZIZ.LJ;
            if (bundle2 != null) {
                C786410Ut5.LJJJI("prop_launch_ui_point", "half_width_scroll_carousel", bundle2);
            }
            Bundle bundle3 = c1625440sOsLIZIZ.LJ;
            if (bundle3 != null) {
                bundle3.putBoolean("is_preload", true);
            }
            C1629340sVA c1629340sVA = new C1629340sVA(effect, true, c1625440sOsLIZIZ);
            InterfaceC1624480sNK interfaceC1624480sNK3 = this.LLILLJJLI;
            if (interfaceC1624480sNK3 == null || (stickerRepository2 = interfaceC1624480sNK3.getStickerRepository()) == null || (interfaceC1627740sSaLJIILLIIL = stickerRepository2.LJIILLIIL()) == null || (c11pqLIZIZ = interfaceC1627740sSaLJIILLIIL.LIZIZ(c1629340sVA, true)) == null) {
                return;
            }
            this.LLIZ.LIZ(c11pqLIZIZ.LJJLJLI(new AfS194S0100000_25(this, 87)));
            return;
        }
        InterfaceC1624480sNK interfaceC1624480sNK4 = this.LLILLJJLI;
        if (interfaceC1624480sNK4 == null) {
            return;
        }
        interfaceC1624480sNK4.LJ(effect, false, false, true, new C1698220uIG(this, 1));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2026407wk.LIZ[event.ordinal()] == 1 && ((Boolean) SlideSlipPreloadExperiment.LIZIZ.getValue()).booleanValue() && ((SlideSlipPreloadExperiment.ShootEditHCPreloadConfig) SlideSlipPreloadExperiment.LIZ.getValue()).enablePreload) {
            List<VEEffectFilterParam> preparedEffectList = this.LLILLL.getPreparedEffectList();
            if (preparedEffectList != null) {
                this.LLILLL.lo(preparedEffectList);
            }
            this.LLIZ.dispose();
        }
    }

    public SlideSlipLoadingController(C1626480sQY c1626480sQY, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1645720sva interfaceC1645720sva, C11NZ c11nz, C11ON c11on, C11ON c11on2, C11ON c11on3, C11ON c11on4, C19475711Hn c19475711Hn) {
        this.LL = c1626480sQY;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = interfaceC1645720sva;
        this.LLILZ = c11on2;
        this.LLILZIL = c11on3;
        this.LLILZLL = c11on4;
        C11NJ c11nj = new C11NJ();
        this.LLIZ = c11nj;
        this.LLIZLLLIL = new C11PQ().LJLLLL();
        this.LLJ = C1444550nh7.LIZ();
        this.LLJI = new ArrayList();
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new C11PQ().LJLLLL();
        if (((Boolean) SlideSlipPreloadExperiment.LIZIZ.getValue()).booleanValue() && ((SlideSlipPreloadExperiment.ShootEditHCPreloadConfig) SlideSlipPreloadExperiment.LIZ.getValue()).enablePreload) {
            C11NZ<R> c11nzLJLIIIL = c19475711Hn.LJLIIIL(new AkS486S0100000_25(this, 35));
            C11RO c11ro = C11S5.LIZIZ;
            c11nj.LIZ(c11nzLJLIIIL.LJL(c11ro).LJJLJLI(new AfS194S0100000_25(this, 216)));
            c11nj.LIZ(c11nz.LJJLJLI(new AfS194S0100000_25(this, 217)));
            c11nj.LIZ(c11on.LJJLJLI(new AfS194S0100000_25(this, 218)));
            c11nj.LIZ(c19475711Hn.LJLIIIL(new AkS486S0100000_25(this, 36)).LJIL(200L, TimeUnit.MILLISECONDS).LJL(c11ro).LJJLJLI(new AfS194S0100000_25(this, 219)));
        }
    }
}
