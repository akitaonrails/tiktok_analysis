package com.ss.android.ugc.aweme.sticker.repository.internals;

import X.C01GW;
import X.C09AJ;
import X.C11NZ;
import X.C11T3;
import X.C13LP;
import X.C13MA;
import X.C13OQ;
import X.C1633180sbM;
import X.C1633190sbN;
import X.C1698340uIS;
import X.C19990113Jj;
import X.C19990313Jl;
import X.C452501pT;
import X.EnumC19990213Jk;
import X.InterfaceC1635390sev;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS39S1400000_25;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public final class HorizontalEffectsFetcher extends C11T3<Unit, HorizontalEffectsModel, HorizontalEffectsFetcherRequest, HorizontalEffectsModel> {
    public final InterfaceC1635390sev effectPlatform;
    public final String panel;
    public final C01GW ttlDuration$delegate = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(218));
    public static final C1633180sbM Companion = new Object() { // from class: X.0sbM
    };
    public static final int $stable = 8;

    public void convertKeyActual(HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
    }

    public HorizontalEffectsModel convertValActual(HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest, HorizontalEffectsModel horizontalEffectsModel) {
        return horizontalEffectsModel;
    }

    /* JADX INFO: renamed from: getTtlDuration-UwyO8pc, reason: not valid java name */
    private final long m323getTtlDurationUwyO8pc() {
        return ((C19990113Jj) this.ttlDuration$delegate.getValue()).LL;
    }

    @Override // X.C11T3, X.C11T4
    public /* bridge */ /* synthetic */ Object convertKeyActual(Object obj) {
        convertKeyActual((HorizontalEffectsFetcherRequest) obj);
        return Unit.LIZ;
    }

    public final String getInsertString(List<String> list) {
        String strLJJLIIIJ;
        if (list == null || !(!list.isEmpty()) || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ";", null, null, 0, null, null, 62)) == null || !(!a0.LJJJIL(strLJJLIIIJ))) {
            return null;
        }
        return strLJJLIIIJ;
    }

    public final boolean isWithinTTL(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        EnumC19990213Jk enumC19990213Jk = EnumC19990213Jk.MILLISECONDS;
        long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(jCurrentTimeMillis, enumC19990213Jk);
        C01GW c01gw = C1633190sbN.LIZ;
        long jLJIIIIZZ2 = C19990313Jl.LJIIIIZZ(((Keva) c01gw.getValue()).getLong(str, 0L), enumC19990213Jk);
        boolean z = !Keva.getRepo("keva_ep_download_repo").getBoolean("main_camera_proxy_sync_flag", false);
        boolean z2 = ((Keva) c01gw.getValue()).getBoolean("has_save_cache_tag", false);
        if ((z && z2) || C19990113Jj.LJI(C19990113Jj.LJIIZILJ(jLJIIIIZZ, jLJIIIIZZ2), m323getTtlDurationUwyO8pc()) >= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C11T3
    public C11NZ<HorizontalEffectsModel> requestActual(HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        return C11NZ.LJIJJLI(new C1698340uIS(horizontalEffectsFetcherRequest, this, 1));
    }

    public HorizontalEffectsFetcher(String str, InterfaceC1635390sev interfaceC1635390sev) {
        this.panel = str;
        this.effectPlatform = interfaceC1635390sev;
    }

    public final boolean checkNeedResetCache(int i, List<String> list) {
        if (HorizontalCarouselCacheEnable.isEnabled()) {
            return !isWithinTTL(getKey(i, getInsertString(list)));
        }
        return false;
    }

    @Override // X.C11T3, X.C11T4
    public /* bridge */ /* synthetic */ Object convertValActual(Object obj, Object obj2) {
        HorizontalEffectsModel horizontalEffectsModel = (HorizontalEffectsModel) obj2;
        convertValActual((HorizontalEffectsFetcherRequest) obj, horizontalEffectsModel);
        return horizontalEffectsModel;
    }

    public final String getKey(int i, String str) {
        return C13OQ.LJIIIIZZ(i, str);
    }

    public final void useCacheOnly(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        this.effectPlatform.LJJIIJZLJL(map, c13ma, true, str, horizontalEffectsFetcherRequest.whitelistScene);
    }

    public final void useNetworkOnly(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        this.effectPlatform.LJJIJLIJ(this.panel);
        this.effectPlatform.LJJIIJZLJL(map, c13ma, false, str, horizontalEffectsFetcherRequest.whitelistScene);
    }

    private final C13MA<HorizontalEffectsModel> createListener(final C09AJ<HorizontalEffectsModel> c09aj, final long j, final List<Unit> list, final boolean z, final Function0<Unit> function0) {
        return new C13MA<HorizontalEffectsModel>() { // from class: X.0sZJ
            @Override // X.C13MA
            public final void onSuccess(HorizontalEffectsModel horizontalEffectsModel) {
                HorizontalEffectsModel horizontalEffectsModel2 = horizontalEffectsModel;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                C1632470saD c1632470saD = C1632470saD.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestActual: onSuccess, ");
                sbLIZ.append(jCurrentTimeMillis);
                sbLIZ.append("ms, emitter.isDisposed = ");
                sbLIZ.append(c09aj.isDisposed());
                sbLIZ.append(", response = ");
                sbLIZ.append(horizontalEffectsModel2);
                C201955140j.LJIILL(c1632470saD, "effect_request_chine_tag", C2188811AlT.LIZIZ(sbLIZ));
                if (!c09aj.isDisposed()) {
                    List<Unit> list2 = list;
                    C09AJ<HorizontalEffectsModel> c09aj2 = c09aj;
                    list2.add(Unit.LIZ);
                    c09aj2.onNext(horizontalEffectsModel2);
                    if (!horizontalEffectsModel2.from_cache) {
                        c09aj2.onComplete();
                    }
                }
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(HorizontalEffectsModel horizontalEffectsModel) {
            }

            @Override // X.C13MA
            public final void onFail(HorizontalEffectsModel horizontalEffectsModel, C1662010tLr c1662010tLr) {
                C1632470saD c1632470saD = C1632470saD.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFail: ");
                sbLIZ.append(c1662010tLr.LIZIZ);
                C537680L6w.LIZ(c1632470saD, "HorizontalEffectsFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
                if (z) {
                    if (list.isEmpty()) {
                        C09AJ<HorizontalEffectsModel> c09aj2 = c09aj;
                        Throwable c1633840scQ = c1662010tLr.LIZLLL;
                        if (c1633840scQ == null) {
                            c1633840scQ = new C1633840scQ(c1662010tLr.LIZ, c1662010tLr.LIZIZ);
                        }
                        c09aj2.onError(c1633840scQ);
                    } else {
                        c09aj.onComplete();
                    }
                }
                function0.invoke();
            }
        };
    }

    public final void useBothCacheAndNetwork(C09AJ<HorizontalEffectsModel> c09aj, long j, List<Unit> list, Map<String, String> map, String str, HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest, C13MA<HorizontalEffectsModel> c13ma) {
        this.effectPlatform.LJJIJLIJ(this.panel);
        this.effectPlatform.LJJIIJZLJL(map, createListener$default(this, c09aj, j, list, false, null, 16, null), true, str, horizontalEffectsFetcherRequest.whitelistScene);
        this.effectPlatform.LJJIIJZLJL(map, c13ma, false, str, horizontalEffectsFetcherRequest.whitelistScene);
    }

    public final void useCacheFallbackToNetwork(C09AJ<HorizontalEffectsModel> c09aj, long j, List<Unit> list, Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        this.effectPlatform.LJJIIJZLJL(map, createListener(c09aj, j, list, false, new AwS39S1400000_25(this, (HorizontalEffectsFetcher) map, (Map<String, String>) c13ma, (C13MA<HorizontalEffectsModel>) str, (String) horizontalEffectsFetcherRequest, (HorizontalEffectsFetcherRequest) 1)), true, str, horizontalEffectsFetcherRequest.whitelistScene);
    }

    public final void useNetworkFallbackToCache(C09AJ<HorizontalEffectsModel> c09aj, long j, List<Unit> list, Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        this.effectPlatform.LJJIIJZLJL(map, createListener(c09aj, j, list, false, new AwS39S1400000_25(this, (HorizontalEffectsFetcher) map, (Map<String, String>) c13ma, (C13MA<HorizontalEffectsModel>) str, (String) horizontalEffectsFetcherRequest, (HorizontalEffectsFetcherRequest) 2)), false, str, horizontalEffectsFetcherRequest.whitelistScene);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C13MA createListener$default(HorizontalEffectsFetcher horizontalEffectsFetcher, C09AJ c09aj, long j, List list, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            function0 = AFwS214S0000000_25.get$arr$(217);
        }
        return horizontalEffectsFetcher.createListener(c09aj, j, list, z, function0);
    }
}
