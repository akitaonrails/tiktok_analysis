package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.C0C64;
import X.C11NJ;
import X.C11S5;
import X.C1465200oEQ;
import X.C1634340sdE;
import X.C1634400sdK;
import X.C1701940uOG;
import X.C790050Uyx;
import X.C790060Uyy;
import X.InterfaceC1423450n95;
import X.InterfaceC1633960scc;
import X.InterfaceC1634040sck;
import X.InterfaceC1636810shD;
import X.InterfaceC1640330smt;
import X.InterfaceC1640420sn2;
import X.InterfaceC1640680snS;
import X.InterfaceC1640760sna;
import X.InterfaceC790070Uyz;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectStateViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.gif.InfoStickerGifListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.socialavatar.InfoStickerSocialAvatarListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.socialavatar.InfoStickerSocialAvatarStateViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailStateViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetListViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerViewModel extends HumbleViewModel implements InterfaceC1640760sna {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC1633960scc LLILLL;
    public final InterfaceC1634040sck LLILZ;
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> LLILZIL;
    public final InterfaceC1640420sn2<Effect> LLILZLL;
    public final InterfaceC1640330smt<Effect> LLIZ;
    public final InterfaceC1640420sn2<Effect> LLIZLLLIL;
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> LLJ;
    public final InterfaceC1640420sn2<Effect> LLJI;
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> LLJIJIL;
    public final InterfaceC1640420sn2<Effect> LLJILJIL;
    public final InterfaceC1640330smt<StickerSetCategory> LLJILJILJ;
    public final InterfaceC1640420sn2<StickerSetCategory> LLJILLL;
    public final InterfaceC1640330smt<Effect> LLJJ;
    public final InterfaceC1640420sn2<Effect> LLJJI;
    public final InterfaceC1640680snS<ProviderEffect> LLJJIII;
    public final InterfaceC1640420sn2<ProviderEffect> LLJJIJI;
    public final InterfaceC1636810shD LLJJIJIIJIL;
    public final Function1<Effect, Boolean> LLJJIJIL;
    public final Function1<C1634340sdE, InterfaceC1640330smt<Effect>> LLJJJ;
    public final Function0<InterfaceC1640420sn2<Effect>> LLJJJIL;
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> LLJJJJ;
    public final InterfaceC1640420sn2<Effect> LLJJJJJIL;
    public final InterfaceC1640330smt<ProviderEffect> LLJJJJLIIL;
    public final InfoStickerProviderListViewModel.ProviderStateViewModel LLJJL;
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1640420sn2<Effect> LLJL;
    public final InterfaceC1640330smt<SocialAvatarStickerStruct> LLJLIL;
    public final InterfaceC1640420sn2<SocialAvatarStickerStruct> LLJLILLLLZIIL;
    public final Map<String, InterfaceC1640330smt<Effect>> LLJLL;
    public final Map<String, InterfaceC1640420sn2<Effect>> LLJLLIL;
    public final LinkedBlockingQueue<Effect> LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public final C11NJ LLLF;
    public final C1634400sdK LLLFF;

    public InfoStickerViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLJLLL.clear();
        this.LLLF.dispose();
        C790060Uyy.LIZLLL(this.LLLFF);
    }

    public final void vQ2() {
        if (isDestroyed() || !this.LLJZ || this.LLJZIJLIL) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "sticker_panel_offline_cache", true, false)) {
            if (!C790050Uyx.LIZJ(this.LL)) {
                return;
            }
        } else if (C790050Uyx.LIZJ(this.LL)) {
            return;
        }
        this.LLJZIJLIL = true;
        Effect effectPoll = this.LLJLLL.poll();
        if (effectPoll == null) {
            this.LLJZIJLIL = false;
        } else {
            this.LLLF.LIZ(this.LLILLL.LIZJ(effectPoll, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 154), new AfS194S0100000_25(this, 157)));
        }
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640330smt<Effect> Al0() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> Cm1() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> GZ1() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> HM2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> Jb1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> Lz0() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<StickerSetCategory> Me0() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> N61() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1640760sna
    public final InfoStickerProviderListViewModel.ProviderStateViewModel NH() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> Ne0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1636810shD Nt1() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640330smt<ProviderEffect> Oy0() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> R51() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640330smt<StickerSetCategory> aN0() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> b90() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640680snS<ProviderEffect> dQ0() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640330smt<SocialAvatarStickerStruct> eL1() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<SocialAvatarStickerStruct> jB1() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640330smt<Effect> qi2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<ProviderEffect> ui0() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> ws0() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> y32() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> zo1() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640420sn2<Effect> Tx2(C1634340sdE c1634340sdE) {
        Map<String, InterfaceC1640420sn2<Effect>> map = this.LLJLLIL;
        String str = c1634340sdE.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object infoStickerStateViewModel = linkedHashMap.get(str);
        if (infoStickerStateViewModel == null) {
            Function0<InterfaceC1640420sn2<Effect>> function0 = this.LLJJJIL;
            if (function0 == null || (infoStickerStateViewModel = (InterfaceC1640420sn2) function0.invoke()) == null) {
                infoStickerStateViewModel = new InfoStickerStateViewModel(this.LLILLJJLI, this.LLILLL);
            }
            linkedHashMap.put(str, infoStickerStateViewModel);
        }
        return (InterfaceC1640420sn2) infoStickerStateViewModel;
    }

    @Override // X.InterfaceC1640760sna
    public final void bj1(boolean z) {
        this.LLJZ = z;
        if (z) {
            vQ2();
        }
    }

    @Override // X.InterfaceC1640760sna
    public final void n01(List<? extends Effect> list) {
        if (isDestroyed()) {
            return;
        }
        this.LLJLLL.addAll(list);
        if (!this.LLL) {
            C790060Uyy.LIZIZ(this.LL);
            C790060Uyy.LIZLLL(this.LLLFF);
            this.LLL = true;
        }
        vQ2();
    }

    @Override // X.InterfaceC1640760sna
    public final InterfaceC1640330smt<Effect> zq2(C1634340sdE c1634340sdE) {
        Map<String, InterfaceC1640330smt<Effect>> map = this.LLJLL;
        String str = c1634340sdE.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object infoStickerCategoryListViewModel = linkedHashMap.get(str);
        if (infoStickerCategoryListViewModel == null) {
            Function1<C1634340sdE, InterfaceC1640330smt<Effect>> function1 = this.LLJJJ;
            if (function1 == null || (infoStickerCategoryListViewModel = (InterfaceC1640330smt) function1.invoke(c1634340sdE)) == null) {
                infoStickerCategoryListViewModel = new InfoStickerCategoryListViewModel(this.LLILLJJLI, this.LLILLL, c1634340sdE, this.LLJJIJIL);
            }
            linkedHashMap.put(str, infoStickerCategoryListViewModel);
        }
        return (InterfaceC1640330smt) infoStickerCategoryListViewModel;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0sdK] */
    public InfoStickerViewModel(Context context, C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc, InterfaceC1634040sck interfaceC1634040sck, InfoStickerListViewModel infoStickerListViewModel, InfoStickerRecentListViewModel infoStickerRecentListViewModel, InfoStickerRecommendTabViewModel infoStickerRecommendTabViewModel, InfoStickerSetListViewModel infoStickerSetListViewModel, InfoStickerProviderListViewModel infoStickerProviderListViewModel, InfoStickerListMetaViewModel infoStickerListMetaViewModel, AwS604S0100000_25 awS604S0100000_25, InfoStickerCollectListViewModel infoStickerCollectListViewModel, InfoStickerGifListViewModel infoStickerGifListViewModel, InfoStickerListViewModel infoStickerListViewModel2, InfoStickerSocialAvatarListViewModel infoStickerSocialAvatarListViewModel) {
        InfoStickerSocialAvatarStateViewModel infoStickerSocialAvatarStateViewModel;
        InfoStickerStateViewModel infoStickerStateViewModel = new InfoStickerStateViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerEmojiListViewModel infoStickerEmojiListViewModel = new InfoStickerEmojiListViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerStateViewModel infoStickerStateViewModel2 = new InfoStickerStateViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerStateViewModel infoStickerStateViewModel3 = new InfoStickerStateViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerStateViewModel infoStickerStateViewModel4 = new InfoStickerStateViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerStateViewModel infoStickerStateViewModel5 = new InfoStickerStateViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerSetDetailListViewModel infoStickerSetDetailListViewModel = new InfoStickerSetDetailListViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerSetDetailStateViewModel infoStickerSetDetailStateViewModel = new InfoStickerSetDetailStateViewModel(c1465200oEQ);
        AwS234S0300000_25 awS234S0300000_25 = new AwS234S0300000_25(c1465200oEQ, interfaceC1633960scc, awS604S0100000_25, 30);
        AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25(c1465200oEQ, interfaceC1633960scc, 110);
        InfoStickerCollectStateViewModel infoStickerCollectStateViewModel = new InfoStickerCollectStateViewModel(c1465200oEQ, interfaceC1633960scc);
        InfoStickerProviderListViewModel.ProviderStateViewModel providerStateViewModel = new InfoStickerProviderListViewModel.ProviderStateViewModel(c1465200oEQ, interfaceC1634040sck);
        InfoStickerStateViewModel infoStickerStateViewModel6 = new InfoStickerStateViewModel(c1465200oEQ, interfaceC1633960scc);
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService != null && iSocialAvatarStoryPostService.enable()) {
            infoStickerSocialAvatarStateViewModel = new InfoStickerSocialAvatarStateViewModel(c1465200oEQ);
        } else {
            infoStickerSocialAvatarStateViewModel = null;
        }
        super(c1465200oEQ);
        this.LL = context;
        this.LLILLJJLI = c1465200oEQ;
        this.LLILLL = interfaceC1633960scc;
        this.LLILZ = interfaceC1634040sck;
        this.LLILZIL = infoStickerListViewModel;
        this.LLILZLL = infoStickerStateViewModel;
        this.LLIZ = infoStickerEmojiListViewModel;
        this.LLIZLLLIL = infoStickerStateViewModel2;
        this.LLJ = infoStickerRecentListViewModel;
        this.LLJI = infoStickerStateViewModel3;
        this.LLJIJIL = infoStickerRecommendTabViewModel;
        this.LLJILJIL = infoStickerStateViewModel4;
        this.LLJILJILJ = infoStickerSetListViewModel;
        this.LLJILLL = infoStickerStateViewModel5;
        this.LLJJ = infoStickerSetDetailListViewModel;
        this.LLJJI = infoStickerSetDetailStateViewModel;
        this.LLJJIII = infoStickerProviderListViewModel;
        this.LLJJIJI = infoStickerProviderListViewModel;
        this.LLJJIJIIJIL = infoStickerListMetaViewModel;
        this.LLJJIJIL = awS604S0100000_25;
        this.LLJJJ = awS234S0300000_25;
        this.LLJJJIL = awS426S0200000_25;
        this.LLJJJJ = infoStickerCollectListViewModel;
        this.LLJJJJJIL = infoStickerCollectStateViewModel;
        this.LLJJJJLIIL = infoStickerGifListViewModel;
        this.LLJJL = providerStateViewModel;
        this.LLJJLIIIJLLLLLLLZ = infoStickerListViewModel2;
        this.LLJL = infoStickerStateViewModel6;
        this.LLJLIL = infoStickerSocialAvatarListViewModel;
        this.LLJLILLLLZIIL = infoStickerSocialAvatarStateViewModel;
        this.LLJLL = new LinkedHashMap();
        this.LLJLLIL = new LinkedHashMap();
        infoStickerListMetaViewModel.LLILZIL.observe(this.LLILLJJLI, new AObserverS227S0100000_25(this, 86));
        this.LLJLLL = new LinkedBlockingQueue<>();
        this.LLLF = new C11NJ();
        this.LLLFF = new InterfaceC790070Uyz() { // from class: X.0sdK
            @Override // X.InterfaceC790070Uyz
            public final void LIZ() {
            }

            @Override // X.InterfaceC790070Uyz
            public final void LIZIZ() {
                if (C790050Uyx.LIZJ(this.LIZ.LL)) {
                    this.LIZ.vQ2();
                }
            }
        };
    }
}
