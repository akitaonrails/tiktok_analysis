package com.ss.android.ugc.aweme.effectplatform;

import X.C0CHQ;
import X.C0FJL;
import X.C0VSJ;
import X.C13MA;
import X.C13RJ;
import X.C13RR;
import X.C13RS;
import X.C13RU;
import X.C13RX;
import X.C13RZ;
import X.C1423840n9i;
import X.C15O7;
import X.C1631900sZI;
import X.C1633120sbG;
import X.C1633130sbH;
import X.C1634110scr;
import X.C1634660sdk;
import X.C1635030seL;
import X.C1635040seM;
import X.C1635060seO;
import X.C1635070seP;
import X.C1635500sf6;
import X.C1638390sjl;
import X.C1638600sk6;
import X.C1662010tLr;
import X.C194380113a;
import X.C19996613Lw;
import X.C20186013yc;
import X.C201955140j;
import X.C2188811AlT;
import X.C2225608nm;
import X.C289560BWo;
import X.C396901gV;
import X.C571880Mbq;
import X.C580130Mp9;
import X.C844470XAv;
import X.EnumC1285060jXs;
import X.InterfaceC1460960o7a;
import X.InterfaceC1635390sev;
import X.InterfaceC1635410sex;
import X.InterfaceC20004513Ox;
import Y.ACallableS255S0200000_30;
import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.experiment.FetchTestEffectDataLiveInHouse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public class EffectPlatform implements InterfaceC1635410sex, GenericLifecycleObserver {
    public static final C0VSJ LLILZ = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIILJJIL(""));
    public static final C0VSJ LLILZIL = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI(""));
    public final C13RJ LL;
    public final EffectConfiguration LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.InterfaceC1635390sev
    public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633120sbG c1633120sbG) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIL(C1634110scr c1634110scr, InfoStickerEffect infoStickerEffect) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    @Override // X.InterfaceC1635410sex
    public final Map<String, String> Eg() {
        return this.LL.LIZLLL;
    }

    public final void LJJJJZ() {
        EffectConfiguration effectConfiguration = this.LLILLJJLI;
        if (effectConfiguration != null) {
            boolean zIsEmpty = TextUtils.isEmpty(effectConfiguration.getDeviceId());
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = CardStruct.IStatusCode.DEFAULT;
            if (zIsEmpty || TextUtils.equals(CardStruct.IStatusCode.DEFAULT, this.LLILLJJLI.getDeviceId())) {
                EffectConfiguration effectConfiguration2 = this.LLILLJJLI;
                if (AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() != null) {
                    strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                }
                effectConfiguration2.setDeviceId(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
            }
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final EffectManager LLJILJILJ() {
        return this.LL.LIZIZ;
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (this.LLILLL) {
            return;
        }
        C13RJ c13rj = this.LL;
        EffectManager effectManager = c13rj.LIZIZ;
        if (effectManager != null) {
            effectManager.destroy();
            c13rj.LIZIZ = null;
        }
        c13rj.LIZ = false;
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void ng() {
        C13RJ c13rj = this.LL;
        if (c13rj.LIZ) {
            c13rj.LIZIZ.removeListener();
        }
    }

    public static String LJJJJIZL() {
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJIILL;
        C0CHQ.LIZ().getApplicationService().getClass();
        return FetchTestEffectDataLiveInHouse.INSTANCE.enable() ? "local_test" : str;
    }

    public static String LJJJJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(1233);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJJJJJL() {
        return C0FJL.LIZ() ? "language_text_font" : "textfont";
    }

    @Override // X.InterfaceC1635390sev
    public final EffectConfiguration LJJIIZ() {
        return this.LLILLJJLI;
    }

    public static ArrayList<String> LJJJJL(boolean z) {
        if (!C571880Mbq.LIZIZ || z) {
            C571880Mbq.LIZ(C571880Mbq.LIZ);
        }
        return C571880Mbq.LIZLLL;
    }

    public static void LJJJJLL(boolean z) {
        IEffectService iEffectServiceEffectService;
        if (!C571880Mbq.LIZIZ || z) {
            C571880Mbq.LIZ(C571880Mbq.LIZ);
        }
        IFoundationAVService iFoundationAVService = (IFoundationAVService) PluggableExtentionKt.pluggableSpi$default(IInternalAVService.class, false, false, false, 14, null);
        if (iFoundationAVService != null && (iEffectServiceEffectService = iFoundationAVService.effectService()) != null) {
            Application application = C0CHQ.LIZ;
            C0CHQ.LIZ().getRegionService();
            String strLIZ = C20186013yc.LIZ();
            InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
            iEffectServiceEffectService.createEffectPlatform(application, strLIZ);
            iEffectServiceEffectService.createFontEffectPlatform(application);
            iEffectServiceEffectService.createMvEffectPlatform(application);
            InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(pathAdapter.LJIILJJIL(""));
            if (interfaceC20004513OxLIZ != null) {
                interfaceC20004513OxLIZ.LJIIL(C571880Mbq.LIZLLL);
            }
            InterfaceC20004513Ox interfaceC20004513OxLIZ2 = C19996613Lw.LIZ(pathAdapter.LJJLI(""));
            if (interfaceC20004513OxLIZ2 != null) {
                interfaceC20004513OxLIZ2.LJIIL(C571880Mbq.LJFF);
            }
            InterfaceC20004513Ox interfaceC20004513OxLIZ3 = C19996613Lw.LIZ(pathAdapter.LJJIJIIJIL(""));
            if (interfaceC20004513OxLIZ3 != null) {
                interfaceC20004513OxLIZ3.LJIIL(C571880Mbq.LJI);
            }
            InterfaceC20004513Ox interfaceC20004513OxLIZ4 = C19996613Lw.LIZ(pathAdapter.LJJIJIL(""));
            if (interfaceC20004513OxLIZ4 != null) {
                interfaceC20004513OxLIZ4.LJIIL(C571880Mbq.LJII);
            }
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LIZLLL(String str) {
        C13RJ c13rj = this.LL;
        if (c13rj != null && c13rj.LIZ) {
            c13rj.LIZIZ.clearCache(str);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJII(Effect effect) {
        LJJJJZ();
        if (effect != null) {
            C13RJ c13rj = this.LL;
            if (c13rj.LIZ) {
                c13rj.LIZIZ.cancelEffectTask(effect);
            }
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final boolean LJIIIIZZ(Effect effect) {
        C13RJ c13rj = this.LL;
        if (effect != null) {
            if (c13rj.LIZIZ != null) {
                return DownloadableModelSupport.getInstance().isEffectReady(c13rj.LIZIZ, effect);
            }
            return false;
        }
        c13rj.getClass();
        return false;
    }

    @Override // X.InterfaceC1635390sev
    public final boolean LJIJJLI(Effect effect) {
        return LJIIIIZZ(effect);
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJ(Effect effect) {
        C15O7.LIZJ(new ACallableS255S0200000_30(this, effect, 3));
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJLIJ(String str) {
        EffectPlatformCaching effectPlatformCachingLJIIZILJ = EffectPlatformCaching.LJIIZILJ();
        effectPlatformCachingLJIIZILJ.LIZIZ.storeLong(effectPlatformCachingLJIIZILJ.LJIILLIIL(str), 0L);
    }

    @Override // X.InterfaceC1635410sex
    public final void kg(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1635410sex
    public final void rg(C194380113a c194380113a) {
        final C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            c194380113a.onFail(C13RJ.LJIIIZ());
            return;
        }
        final C1635060seO c1635060seOLIZ = C1635060seO.LIZ("editingeffect", c194380113a);
        c1635060seOLIZ.LIZLLL = c13rj.LIZJ;
        if (EffectPlatformCaching.LJIIZILJ().LJIJJLI(0, "editingeffect", "default")) {
            c13rj.LJIIIIZZ("editingeffect", false, "default", 20, 0, c1635060seOLIZ);
        } else {
            c13rj.LIZ("editingeffect", new ICheckChannelListener() { // from class: X.13RM
                public final /* synthetic */ String LIZIZ = "editingeffect";
                public final /* synthetic */ String LIZJ = "default";
                public final /* synthetic */ boolean LIZLLL = false;
                public final /* synthetic */ int LJ = 20;
                public final /* synthetic */ int LJFF = 0;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    c13rj.LJIIIIZZ(this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, this.LJFF, c1635060seOLIZ);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    if (z) {
                        c13rj.LJII(this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, this.LJFF, 0, new HashMap(), new C13RR(c1635060seOLIZ, this.LIZIZ, this.LIZJ));
                    } else {
                        c13rj.LJIIIIZZ(this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, this.LJFF, c1635060seOLIZ);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1635410sex
    public final void ug(Map<String, Object> map) {
        this.LL.LIZJ = map;
    }

    @Override // X.InterfaceC1635410sex
    public final void yg(Map<String, String> map) {
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        if (!map.isEmpty()) {
            ((HashMap) c13rj.LIZLLL).putAll(map);
        }
    }

    public EffectPlatform(EffectConfiguration effectConfiguration, boolean z) {
        this.LLILLJJLI = effectConfiguration;
        this.LLILLL = z;
        C13RJ c13rj = new C13RJ();
        this.LL = c13rj;
        EffectManager effectManager = new EffectManager();
        c13rj.LIZIZ = effectManager;
        c13rj.LIZ = effectManager.init(effectConfiguration);
    }

    public static boolean LJJJJLI(String str, boolean z) {
        if (!C0FJL.LIZ() && !z) {
            return "textfont".equals(str);
        }
        if (!"textfont".equals(str) && !"language_text_font".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1635410sex
    public final void Bg(String str, C2225608nm c2225608nm) {
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            c2225608nm.onFailed(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchFavoriteList(str, c2225608nm);
        }
    }

    @Override // X.InterfaceC1635410sex
    public final void Dg(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectChannelListener.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectListFromCache(str, iFetchEffectChannelListener);
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectListener.onFail(effect, C13RJ.LJIIIZ());
            return;
        }
        if (effect == null) {
            ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
            exceptionResult.setErrorCode(-1);
            exceptionResult.setMsg("effect is null.");
            iFetchEffectListener.onFail(null, exceptionResult);
            return;
        }
        c13rj.LIZIZ.fetchEffect(effect, iFetchEffectListener);
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LJIIJJI(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iDownloadProviderEffectListener.onFail(providerEffect, C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.downloadProviderEffect(providerEffect, iDownloadProviderEffectListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener) {
        LIZJ(effect, iFetchEffectListener);
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        C1635070seP c1635070seP = new C1635070seP(str, new C1635030seL(str, iFetchEffectChannelListener));
        c1635070seP.LIZLLL = c13rj.LIZJ;
        if (!c13rj.LIZ) {
            c1635070seP.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectListFromCacheChecked(str, c1635070seP);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIII(String str, C1638390sjl c1638390sjl) {
        vg(str, false, new C13RU(c1638390sjl, str));
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJI(final String str, final IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJJJJZ();
        final C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectChannelListener.onFail(C13RJ.LJIIIZ());
        } else if (EffectPlatformCaching.LJIIZILJ().LJIL(str)) {
            c13rj.LJFF(str, false, iFetchEffectChannelListener);
        } else {
            c13rj.LIZIZ(str, new ICheckChannelListener() { // from class: X.13RW
                public final /* synthetic */ boolean LIZJ = false;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    c13rj.LJFF(str, this.LIZJ, iFetchEffectChannelListener);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    C13RU c13ruLIZ = C13RU.LIZ(str, iFetchEffectChannelListener);
                    if (z) {
                        c13rj.LJI(str, this.LIZJ, c13ruLIZ);
                    } else {
                        c13rj.LJFF(str, this.LIZJ, c13ruLIZ);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJIL(long j, C13MA<GetCustomizedEffectIDData> c13ma) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
            effectManager.getCustomizedEffectId(j, null, c13ma);
        } else {
            c13ma.onFail(null, C13RJ.LJIIJ());
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void og(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
        this.LL.LIZJ(list, iFetchEffectListListener);
    }

    @Override // X.InterfaceC1635410sex
    public final void xg(String str, C1638600sk6 c1638600sk6) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            c1638600sk6.LIZIZ(C13RJ.LJIIJ());
        } else {
            c13rj.LIZIZ.fetchProviderEffectsByGiphyIds(str, "gifs", null, true, c1638600sk6);
        }
    }

    @Override // X.InterfaceC1635410sex
    public final boolean zg(String str, String str2) {
        return EffectPlatformCaching.LJIIZILJ().LJIJJLI(0, str, str2);
    }

    @Override // X.InterfaceC1635410sex
    public final void Ag(String str, String str2, ICheckChannelListener iCheckChannelListener) {
        EffectPlatformCaching effectPlatformCachingLJIIZILJ = EffectPlatformCaching.LJIIZILJ();
        if (effectPlatformCachingLJIIZILJ.LJIJI(str) && System.currentTimeMillis() <= effectPlatformCachingLJIIZILJ.LIZIZ.getLong(effectPlatformCachingLJIIZILJ.LJIILL(0, str, str2), 0L)) {
            iCheckChannelListener.checkChannelSuccess(false);
            return;
        }
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iCheckChannelListener.checkChannelFailed(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.checkCategoryIsUpdate(str, str2, null, new C13RZ(iCheckChannelListener));
        }
    }

    @Override // X.InterfaceC1635410sex
    public final void Cg(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            if (!c13rj.LIZ) {
                iFetchEffectListByIdsListener.onFail(C13RJ.LJIIIZ());
            } else {
                c13rj.LIZIZ.fetchEffectList(list, map, iFetchEffectListByIdsListener);
            }
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectListByIdsListener.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectList2(list, map, iFetchEffectListByIdsListener);
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectListener.onFail(null, C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectWithDownload(str, map, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LJI(final String str, final boolean z, final IFetchEffectChannelListener iFetchEffectChannelListener) {
        CreativeToolsPluginService creativeToolsPluginService;
        boolean zLJI = MethodIDManager.LJI(137381);
        LJJJJZ();
        final C13RJ c13rj = this.LL;
        c13rj.getClass();
        boolean zLJI2 = MethodIDManager.LJI(137381);
        if (!c13rj.LIZ) {
            iFetchEffectChannelListener.onFail(C13RJ.LJIIIZ());
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        } else {
            if (z && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class)) != null && !C289560BWo.LIZ()) {
                creativeToolsPluginService.LIZ();
            }
            if (EffectPlatformCaching.LJIIZILJ().LJIL(str)) {
                c13rj.LJFF(str, z, iFetchEffectChannelListener);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            } else {
                c13rj.LIZIZ(str, new ICheckChannelListener() { // from class: X.13RV
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelFailed(ExceptionResult exceptionResult) {
                        c13rj.LJFF(str, z, iFetchEffectChannelListener);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelSuccess(boolean z2) {
                        if (z2) {
                            c13rj.LJI(str, z, C13RU.LIZ(str, iFetchEffectChannelListener));
                            return;
                        }
                        c13rj.LJFF(str, z, iFetchEffectChannelListener);
                    }
                });
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LJIIJ(List list, Map map, final C396901gV c396901gV) {
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            IFetchEffectListByIdsListener iFetchEffectListByIdsListener = new IFetchEffectListByIdsListener() { // from class: X.13RK
                public final /* synthetic */ boolean LIZIZ = true;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    IFetchEffectListListener iFetchEffectListListener = c396901gV;
                    if (iFetchEffectListListener != null) {
                        iFetchEffectListListener.onFail(exceptionResult);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (this.LIZIZ) {
                        C13RJ c13rj2 = this.LIZJ.LL;
                        List<Effect> data = effectListResponse2.getData();
                        IFetchEffectListListener iFetchEffectListListener = c396901gV;
                        if (!c13rj2.LIZ) {
                            iFetchEffectListListener.onFail(C13RJ.LJIIIZ());
                            return;
                        } else {
                            c13rj2.LIZIZ.downloadEffectListWithoutSDK(data, iFetchEffectListListener, null);
                            return;
                        }
                    }
                    IFetchEffectListListener iFetchEffectListListener2 = c396901gV;
                    if (iFetchEffectListListener2 == null) {
                        return;
                    }
                    iFetchEffectListListener2.onSuccess(effectListResponse2.getData());
                }
            };
            if (!c13rj.LIZ) {
                iFetchEffectListByIdsListener.onFail(C13RJ.LJIIIZ());
            } else {
                c13rj.LIZIZ.fetchEffectListWithoutSDK(list, map, iFetchEffectListByIdsListener);
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIZILJ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        LIZIZ(str, map, iFetchEffectListener);
    }

    @Override // X.InterfaceC1635390sev
    public final AssetPanelResponse LJIJJ(String str, String str2, int i) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null && c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
            return effectManager.fetchAssetPanelInfFromCache(str, str2, 0, i);
        }
        return null;
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJIL(String str, Map map, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        C1635070seP c1635070seP = new C1635070seP(str, new C1635030seL(str, iFetchEffectChannelListener));
        c1635070seP.LIZLLL = c13rj.LIZJ;
        if (!c13rj.LIZ) {
            c1635070seP.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectListChecked(str, false, map, c1635070seP);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo, IFetchAssetItemInfo iFetchAssetItemInfo) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchAssetItemInf(mixedAssetsQueryAdditionalParameters, "editing", mixedItemAssetsRequestBodyInfo, iFetchAssetItemInfo);
            } else {
                iFetchAssetItemInfo.onFailed(new ExceptionResult(-1));
            }
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void lg(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        if (str != null && str2 != null) {
            if (!c13rj.LIZ) {
                iUpdateTagListener.onFinally();
            } else {
                c13rj.LIZIZ.updateTag(str, str2, iUpdateTagListener);
            }
        }
    }

    @Override // X.InterfaceC1635410sex
    public final void vg(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJJJJZ();
        this.LL.LJI(str, z, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectListListener.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectList((List<String>) list, z, (Map<String, String>) map, iFetchEffectListListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIILLIIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, int i, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, C1635500sf6 c1635500sf6) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchAssetCategoryInf(mixedAssetsQueryAdditionalParameters, "ai_theater", "ai_portrait", "hot_carousel", 0, i, mixedAssetsRequestBodyInfo, c1635500sf6);
            } else {
                c1635500sf6.onFailed(new ExceptionResult(-1));
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIJ(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, int i, int i2, C1423840n9i c1423840n9i) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchTemplateFavoriteList(mixedAssetsQueryAdditionalParameters, i, i2, c1423840n9i);
            } else {
                c1423840n9i.onFail(null, new C1662010tLr(1));
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final AssetCategoryResponse LJJIIJ(String str, String str2, int i, int i2) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null && c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
            return effectManager.fetchAssetCategoryInfFromCache(str, str2, i, i2);
        }
        return null;
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJIIJI(List list, final boolean z, Map map, final IFetchEffectListListener iFetchEffectListListener) {
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            IFetchEffectListByIdsListener iFetchEffectListByIdsListener = new IFetchEffectListByIdsListener() { // from class: X.13RP
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                    if (iFetchEffectListListener2 != null) {
                        iFetchEffectListListener2.onFail(exceptionResult);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (z) {
                        this.LIZJ.LL.LIZJ(effectListResponse2.getData(), iFetchEffectListListener);
                        return;
                    }
                    IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                    if (iFetchEffectListListener2 == null) {
                        return;
                    }
                    iFetchEffectListListener2.onSuccess(effectListResponse2.getData());
                }
            };
            if (!c13rj.LIZ) {
                iFetchEffectListByIdsListener.onFail(C13RJ.LJIIIZ());
            } else {
                c13rj.LIZIZ.fetchEffectList((List<String>) list, (Map<String, String>) map, iFetchEffectListByIdsListener);
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJJI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if ((EffectPlatformCaching.LJIIZILJ().LJIL(str) || z) && !z2) {
            Dg(str, iFetchEffectChannelListener);
        } else {
            vg(str, z2, new C13RU(iFetchEffectChannelListener, str));
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void mg(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        if (str != null && !C580130Mp9.LIZ(list)) {
            if (!c13rj.LIZ) {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
            } else {
                c13rj.LIZIZ.isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
            }
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void qg(final IModFavoriteList iModFavoriteList, final String str, final List list, boolean z) {
        C13RJ c13rj = this.LL;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (!c13rj.LIZ) {
            iModFavoriteList.onFail(C13RJ.LJIIIZ());
            return;
        }
        EffectManager effectManager = c13rj.LIZIZ;
        final boolean zBooleanValue = boolValueOf.booleanValue();
        effectManager.modifyFavoriteList(str, (List<String>) list, boolValueOf, new IModFavoriteList(str, iModFavoriteList, list, zBooleanValue) { // from class: X.0se2
            public static final /* synthetic */ int LJFF = 0;
            public final String LIZ;
            public final IModFavoriteList LIZIZ;
            public final List<String> LIZJ;
            public final boolean LIZLLL;
            public final C138P LJ = C138P.LIZ();

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
            public final void onFail(ExceptionResult exceptionResult) {
                Object objValueOf;
                String msg;
                String str2;
                long jLIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
                IModFavoriteList iModFavoriteList2 = this.LIZIZ;
                if (iModFavoriteList2 != null) {
                    iModFavoriteList2.onFail(exceptionResult);
                }
                List<InterfaceC2342209Fs> list2 = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                String str3 = this.LIZ;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                c0lab.LJ("api_type", C1634610sdf.LIZ(str3));
                c0lab.LIZIZ(jLIZIZ, "duration");
                c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                List<String> list3 = this.LIZJ;
                if (list3 != null && (str2 = (String) C13LP.LJJJLL(list3)) != null) {
                    str4 = str2;
                }
                c0lab.LJ("prop_id", str4);
                c0lab.LIZ(this.LIZLLL ? 1 : 0, "is_favorite");
                if (exceptionResult != null) {
                    objValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                } else {
                    objValueOf = null;
                }
                c0lab.LIZLLL(objValueOf, "error_code");
                if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                    msg = "empty_error_msg";
                }
                c0lab.LJ("error_msg", msg);
                C2341909Fp.LIZ("effect_favorite_change_success_rate", c0lab.LIZ);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<String> list2) {
                String str2;
                long jLIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
                IModFavoriteList iModFavoriteList2 = this.LIZIZ;
                if (iModFavoriteList2 != null) {
                    iModFavoriteList2.onSuccess(list2);
                }
                List<InterfaceC2342209Fs> list3 = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                String str3 = this.LIZ;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                c0lab.LJ("api_type", C1634610sdf.LIZ(str3));
                c0lab.LIZIZ(jLIZIZ, "duration");
                c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                List<String> list4 = this.LIZJ;
                if (list4 != null && (str2 = (String) C13LP.LJJJLL(list4)) != null) {
                    str4 = str2;
                }
                c0lab.LJ("prop_id", str4);
                c0lab.LIZ(this.LIZLLL ? 1 : 0, "is_favorite");
                C2341909Fp.LIZ("effect_favorite_change_success_rate", c0lab.LIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = iModFavoriteList;
                this.LIZJ = list;
                this.LIZLLL = zBooleanValue;
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1635410sex
    public final void wg(final String str, final String str2, final int i, IFetchPanelInfoListener iFetchPanelInfoListener) {
        final C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchPanelInfoListener.onFail(C13RJ.LJIIIZ());
            return;
        }
        final C1635060seO c1635060seOLIZ = C1635060seO.LIZ(str, iFetchPanelInfoListener);
        c1635060seOLIZ.LIZLLL = c13rj.LIZJ;
        if (EffectPlatformCaching.LJIIZILJ().LJIL(str)) {
            c13rj.LJIIIIZZ(str, false, str2, i, 0, c1635060seOLIZ);
        } else {
            c13rj.LIZ(str, new ICheckChannelListener() { // from class: X.13RQ
                public final /* synthetic */ boolean LIZLLL = false;
                public final /* synthetic */ int LJFF = 0;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    c13rj.LJIIIIZZ(str, this.LIZLLL, str2, i, this.LJFF, c1635060seOLIZ);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    if (z) {
                        c13rj.LJII(str, this.LIZLLL, str2, i, this.LJFF, 0, new HashMap(), new C13RR(c1635060seOLIZ, str, str2));
                    } else {
                        c13rj.LJIIIIZZ(str, this.LIZLLL, str2, i, this.LJFF, c1635060seOLIZ);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchEffectListener.onFail(effect, C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectExt(effect, z, z2, z3, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJI(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, int i, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetPanelInfo iFetchAssetPanelInfo) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchAssetPanelInf(mixedAssetsQueryAdditionalParameters, "editing", str, 0, i, mixedAssetsRequestBodyInfo, false, iFetchAssetPanelInfo);
            } else {
                iFetchAssetPanelInfo.onFailed(new ExceptionResult(-1));
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJII(String str, EnumC1285060jXs enumC1285060jXs, boolean z, int i, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (enumC1285060jXs != EnumC1285060jXs.DEFAULT ? enumC1285060jXs == EnumC1285060jXs.ENABLE : EffectPlatformCaching.LJIIZILJ().LJIL(str)) {
            if (!z) {
                C201955140j.LJIILJJIL(C13RX.LIZIZ, "fetchBeautyComponentListForABGroup with cache");
                Dg(str, iFetchEffectChannelListener);
                return;
            }
        }
        C201955140j.LJIILJJIL(C13RX.LIZIZ, "fetchBeautyComponentListForABGroup without cache");
        C13RU c13ru = new C13RU(iFetchEffectChannelListener, str);
        HashMap map = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(i);
        map.put("ab_group", C2188811AlT.LIZIZ(sbLIZ));
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        C1635070seP c1635070seP = new C1635070seP(str, new C1635030seL(str, c13ru));
        c1635070seP.LIZLLL = c13rj.LIZJ;
        if (!c13rj.LIZ) {
            c1635070seP.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchEffectList(str, z, map, c1635070seP);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIIJZLJL(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, boolean z, String str, int i) {
        EffectManager effectManager;
        if (z) {
            C13RJ c13rj = this.LL;
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchHorizontalEffectsInfoFromCache(map, c13ma, str, i);
                return;
            } else {
                c13ma.onFail(null, C13RJ.LJIIJ());
                return;
            }
        }
        C13RJ c13rj2 = this.LL;
        if (c13rj2.LIZ && c13rj2.LIZIZ != null) {
            c13rj2.LIZIZ.fetchHorizontalEffectsInfo(map, c13ma, "default", str, i, c13rj2.LJIIJJI(null));
        } else {
            c13ma.onFail(null, C13RJ.LJIIJ());
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJL(String str, String str2, int i, Map map, ICheckChannelListener iCheckChannelListener) {
        boolean zLJI = MethodIDManager.LJI(137816);
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        if (i == 2) {
            this.LL.LIZ(str, iCheckChannelListener);
        } else if (i == 1) {
            Ag(str, str2, iCheckChannelListener);
        } else {
            boolean zLJI2 = MethodIDManager.LJI(137816);
            LJJJJZ();
            boolean zLJIJJ = EffectPlatformCaching.LJIIZILJ().LJIJJ(str);
            C0CHQ.LIZ().LJIIIZ();
            boolean zLIZIZ = C1634660sdk.LIZIZ(str);
            if (!zLJIJJ && !zLIZIZ) {
                C13RJ c13rj = this.LL;
                c13rj.getClass();
                boolean zLJI3 = MethodIDManager.LJI(137382);
                boolean zLJI4 = MethodIDManager.LJI(137816);
                if (!c13rj.LIZ) {
                    iCheckChannelListener.checkChannelFailed(C13RJ.LJIIIZ());
                    if (zLJI4) {
                        MethodIDManager.LJ();
                    }
                    if (zLJI3) {
                        MethodIDManager.LJ();
                    }
                } else {
                    if (EffectPlatformCaching.LJIIZILJ().LJIJJ(str)) {
                        iCheckChannelListener.checkChannelSuccess(false);
                    } else if (map == null) {
                        c13rj.LIZIZ.checkedEffectListUpdate(str, null, new C13RZ(iCheckChannelListener));
                    } else {
                        throw null;
                    }
                    if (zLJI4) {
                        MethodIDManager.LJ();
                    }
                    if (zLJI3) {
                        MethodIDManager.LJ();
                    }
                }
            } else {
                iCheckChannelListener.checkChannelSuccess(false);
            }
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1635410sex
    public final void tg(int i, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, boolean z) {
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchCategoryEffectListener.onFail(C13RJ.LJIIIZ());
            return;
        }
        C1635040seM c1635040seMLIZ = C1635040seM.LIZ(str, i, 0, iFetchCategoryEffectListener);
        c1635040seMLIZ.LJFF = c13rj.LIZJ;
        c13rj.LJ(str, str2, i, 0, 0, "", z, new C13RS(c1635040seMLIZ, str, str2), null);
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIILL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetCategoryInfo iFetchAssetCategoryInfo) {
        EffectManager effectManager;
        C13RJ c13rj = this.LL;
        if (c13rj != null) {
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchAssetCategoryInf(mixedAssetsQueryAdditionalParameters, "editing", str, str2, i, i2, mixedAssetsRequestBodyInfo, iFetchAssetCategoryInfo);
            } else {
                iFetchAssetCategoryInfo.onFailed(new ExceptionResult(-1));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1635390sev
    public final void LJJIIZI(String str, String str2, int i, int i2, int i3, String str3, C1631900sZI c1631900sZI) {
        C1635040seM c1635040seMLIZ;
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            c1631900sZI.onFail(C13RJ.LJIIIZ());
            return;
        }
        if (c1631900sZI instanceof C1635040seM) {
            c1635040seMLIZ = (C1635040seM) c1631900sZI;
        } else {
            c1635040seMLIZ = C1635040seM.LIZ(str, i, i2, c1631900sZI);
        }
        c1635040seMLIZ.LJFF = c13rj.LIZJ;
        c13rj.LIZIZ.fetchCategoryPagingEffect(str, str2, i, i2, i3, str3, c13rj.LJIIJJI(null), new C13RS(c1635040seMLIZ, str, str2));
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void pg(String str, int i, int i2, String str2, String str3, Map map, IFetchProviderEffect iFetchProviderEffect) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchProviderEffect.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.fetchProviderEffect(str, false, i, i2, str2, str3, map, iFetchProviderEffect);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1635410sex
    public final void sg(final String str, final String str2, final int i, final int i2, final int i3, final Map map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        final C13RJ c13rj = this.LL;
        if (!c13rj.LIZ) {
            iFetchCategoryEffectListener.onFail(C13RJ.LJIIIZ());
            return;
        }
        final C1635040seM c1635040seMLIZ = C1635040seM.LIZ(str, i, i2, iFetchCategoryEffectListener);
        c1635040seMLIZ.LJFF = c13rj.LIZJ;
        if (EffectPlatformCaching.LJIIZILJ().LJIJJLI(0, str, str2)) {
            c13rj.LJ(str, str2, i, i2, i3, CardStruct.IStatusCode.DEFAULT, true, c1635040seMLIZ, map);
            return;
        }
        ICheckChannelListener iCheckChannelListener = new ICheckChannelListener() { // from class: X.13RT
            public final /* synthetic */ String LJI = CardStruct.IStatusCode.DEFAULT;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                c13rj.LJ(str, str2, i, i2, i3, this.LJI, true, c1635040seMLIZ, map);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                if (z) {
                    c13rj.LJ(str, str2, i, i2, i3, this.LJI, false, new C13RS(c1635040seMLIZ, str, str2), map);
                } else {
                    c13rj.LJ(str, str2, i, i2, i3, this.LJI, true, c1635040seMLIZ, map);
                }
            }
        };
        if (!c13rj.LIZ) {
            iCheckChannelListener.checkChannelFailed(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.checkCategoryIsUpdate(str, str2, null, new C13RZ(iCheckChannelListener));
        }
    }

    @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
    public final void LJIIIZ(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z2) {
        if (!EffectPlatformCaching.LJIIZILJ().LJIJJLI(0, str, str2) && !z2) {
            C13RR c13rr = new C13RR(iFetchPanelInfoListener, str, str2);
            C13RJ c13rj = this.LL;
            if (!c13rj.LIZ) {
                c13rr.onFail(C13RJ.LJIIIZ());
                return;
            } else {
                c13rj.LIZIZ.fetchPanelInfoChecked(str, z, str2, i, i2, map, c13rr);
                return;
            }
        }
        C13RJ c13rj2 = this.LL;
        if (!c13rj2.LIZ) {
            iFetchPanelInfoListener.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj2.LIZIZ.fetchPanelInfoFromCacheChecked(str, z, str2, i, i2, iFetchPanelInfoListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIILIIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, boolean z, IFetchAssetPanelInfo iFetchAssetPanelInfo) {
        EffectManager effectManager;
        if (this.LL != null) {
            C13RX c13rx = C13RX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchMixedAssetPanelInf start, panelKey=");
            sbLIZ.append(str2);
            sbLIZ.append(", cursor=");
            sbLIZ.append(i);
            sbLIZ.append(", count=");
            sbLIZ.append(i2);
            sbLIZ.append(", cacheFirst=");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c13rx, "panel_api_upgrade", C2188811AlT.LIZIZ(sbLIZ));
            C13RJ c13rj = this.LL;
            if (c13rj.LIZ && (effectManager = c13rj.LIZIZ) != null) {
                effectManager.fetchAssetPanelInf(mixedAssetsQueryAdditionalParameters, str, str2, i, i2, mixedAssetsRequestBodyInfo, z, iFetchAssetPanelInfo);
            } else {
                iFetchAssetPanelInfo.onFailed(new ExceptionResult(-1));
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIFFI(String str, int i, int i2, int i3, String str2, Map map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z) {
        IFetchPanelInfoListener iFetchPanelInfoListenerLIZ = iFetchPanelInfoListener;
        if (this.LL != null) {
            if (!EffectPlatformCaching.LJIIZILJ().LJIJJLI(0, str, "trending") && !z) {
                IFetchPanelInfoListener c13rr = new C13RR(iFetchPanelInfoListenerLIZ, str, "trending");
                C13RJ c13rj = this.LL;
                if (!c13rj.LIZ) {
                    c13rr.onFail(C13RJ.LJIIIZ());
                    return;
                }
                if (!(c13rr instanceof C1635060seO)) {
                    c13rr = C1635060seO.LIZ(str, c13rr);
                }
                ((C1635060seO) c13rr).LIZLLL = c13rj.LIZJ;
                c13rj.LIZIZ.fetchPanelInfoPagingChecked(str, "trending", i, i2, i3, str2, map, c13rr);
                return;
            }
            C13RJ c13rj2 = this.LL;
            if (!c13rj2.LIZ) {
                iFetchPanelInfoListenerLIZ.onFail(C13RJ.LJIIIZ());
                return;
            }
            if (!(iFetchPanelInfoListenerLIZ instanceof C1635060seO)) {
                iFetchPanelInfoListenerLIZ = C1635060seO.LIZ(str, iFetchPanelInfoListenerLIZ);
            }
            ((C1635060seO) iFetchPanelInfoListenerLIZ).LIZLLL = c13rj2.LIZJ;
            c13rj2.LIZIZ.fetchPanelInfoPagingCheckedFromCache(str, "trending", i, i2, i3, str2, map, iFetchPanelInfoListenerLIZ);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJ(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633130sbH c1633130sbH) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        C13MA<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(c1633130sbH);
        if (c13rj.LIZ) {
            c13rj.LIZIZ.getEffectPlatform().LJIILLIIL().LJIIJ(i, i2, i3, kNListener, str2, str3, str, map);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJIIJIL(String str, String str2, int i, int i2, boolean z, String str3, String str4, IFetchProviderEffect iFetchProviderEffect) {
        LJJJJZ();
        C13RJ c13rj = this.LL;
        c13rj.getClass();
        if (C0CHQ.LIZ().getAccountService() != null && C0CHQ.LIZ().getAccountService().LIZ()) {
            iFetchProviderEffect.onFail(C13RJ.LJIIIZ());
        } else if (!c13rj.LIZ) {
            iFetchProviderEffect.onFail(C13RJ.LJIIIZ());
        } else {
            c13rj.LIZIZ.searchProviderEffect(str, str2, i, i2, false, str3, str4, iFetchProviderEffect);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJJ(int i, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, boolean z) {
        if (!EffectPlatformCaching.LJIIZILJ().LJIJJLI(0, str, str2) && !z) {
            LJJJ(i, i2, i3, 0, new C13RS(iFetchCategoryEffectListener, str, str2), str, str2, str3, null, false);
        } else {
            LJJJ(i, i2, i3, 0, iFetchCategoryEffectListener, str, str2, str3, null, true);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIZ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, int i3, IFetchPanelInfoListener iFetchPanelInfoListener, Map<String, String> map) {
        if (!EffectPlatformCaching.LJIIZILJ().LJIJJLI(i3, str, str2) && !z2) {
            this.LL.LJII(str, z, str2, i, i2, i3, map, new C13RR(iFetchPanelInfoListener, str, str2));
        } else {
            this.LL.LJIIIIZZ(str, z, str2, i, i2, iFetchPanelInfoListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJ(int i, int i2, int i3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, Map map, boolean z) {
        this.LL.LIZLLL(i, i2, i3, i4, iFetchCategoryEffectListener, str, str2, str3, map, z);
    }
}
