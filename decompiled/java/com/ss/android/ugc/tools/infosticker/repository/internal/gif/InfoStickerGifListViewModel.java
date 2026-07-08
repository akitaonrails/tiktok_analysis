package com.ss.android.ugc.tools.infosticker.repository.internal.gif;

import X.AbstractC19484711Kz;
import X.C1413490mt1;
import X.C1465200oEQ;
import X.C1634630sdh;
import X.C1634680sdm;
import X.C1634690sdn;
import X.C1637890six;
import X.C19482011Jy;
import X.C201955140j;
import X.C2188811AlT;
import X.C543670LTx;
import X.InterfaceC1634040sck;
import X.InterfaceC1634480sdS;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerGifListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> {
    public final LifecycleOwner LLILZIL;
    public final InterfaceC1634040sck LLILZLL;
    public final String LLIZ;
    public InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> LLIZLLLIL;
    public final MutableLiveData<Object> LLJ;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<ProviderEffect>> wQ2() {
        C1634680sdm c1634680sdm;
        C1634680sdm c1634680sdm2;
        List<ProviderEffect> list;
        C1634630sdh c1634630sdh = C1634630sdh.LIZ;
        String str = this.LLIZ;
        c1634630sdh.getClass();
        if (!C1634690sdn.LIZ() || !Intrinsics.LJFF(str, C1634630sdh.LIZIZ) || (((c1634680sdm = C1634630sdh.LJ) != null && ((list = c1634680sdm.LIZJ) == null || list.isEmpty())) || (c1634680sdm2 = C1634630sdh.LJ) == null)) {
            InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> interfaceC1634480sdSLIZ = this.LLILZLL.LIZ();
            this.LLIZLLLIL = interfaceC1634480sdSLIZ;
            System.currentTimeMillis();
            return interfaceC1634480sdSLIZ.LIZ().LJIILL(new AfS194S0100000_25(this, 103)).LJIIL(new AfS194S0100000_25(this, 104)).LJIL(new AkS486S0100000_25(this, 13));
        }
        this.LLIZLLLIL = this.LLILZLL.LIZIZ(c1634680sdm2.LIZ, c1634680sdm2.LIZIZ);
        System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom_sticker_upload : use gif sticker list cache, size = ");
        List<ProviderEffect> list2 = c1634680sdm2.LIZJ;
        sbLIZ.append(list2 != null ? Integer.valueOf(list2.size()) : null);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        return AbstractC19484711Kz.LJIJJLI(c1634680sdm2.LIZJ);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<ProviderEffect>> xQ2() {
        C19482011Jy c19482011JyLIZ;
        InterfaceC1634480sdS<ProviderEffect, ProviderEffectModel> interfaceC1634480sdS = this.LLIZLLLIL;
        return (interfaceC1634480sdS == null || (c19482011JyLIZ = interfaceC1634480sdS.LIZ()) == null) ? AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("Illegal method invoke order, should request data before request more.")) : c19482011JyLIZ.LJIILL(new AfS194S0100000_25(this, 105)).LJIIL(new AfS194S0100000_25(this, 106)).LJIL(new AkS486S0100000_25(this, 14));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final LiveData<Object> getExtraData() {
        return this.LLJ;
    }

    public InfoStickerGifListViewModel(C1465200oEQ c1465200oEQ, InterfaceC1634040sck interfaceC1634040sck, C1413490mt1 c1413490mt1, String str) {
        super(c1465200oEQ);
        this.LLILZIL = c1465200oEQ;
        this.LLILZLL = interfaceC1634040sck;
        this.LLIZ = str;
        this.LLJ = new MutableLiveData<>();
    }

    public static void yQ2(int i, int i2, Boolean bool, String str, boolean z) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("load_more", Boolean.valueOf(z));
        c543670LTx.LIZ.put("has_more", bool);
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        if (i == 1) {
            c543670LTx.LIZ.put("error_desc", str);
            c543670LTx.LIZIZ(Integer.valueOf(i2), "error_code");
        }
        C1637890six.LJ("video_edit_sticker_panel_gif", i, c543670LTx.LJ());
    }
}
