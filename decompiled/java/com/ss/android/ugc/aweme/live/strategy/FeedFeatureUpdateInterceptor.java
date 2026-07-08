package com.ss.android.ugc.aweme.live.strategy;

import X.C0ITF;
import X.C0J0Q;
import X.C0X52;
import X.C1090000eTG;
import X.C1161920gLG;
import X.C1494590ozp;
import X.C1974107oJ;
import X.C2188811AlT;
import X.C293501Bt;
import X.EnumC1094630eaj;
import X.InterfaceC1904907d9;
import X.InterfaceC519150KXp;
import X.InterfaceC841770X0l;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedFeaturesAddExp;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StrategyPlatformFeature;
import com.bytedance.android.livesdkapi.depend.model.live.StrategyPlatformFeatures;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.agilelogger.ALog;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class FeedFeatureUpdateInterceptor implements InterfaceC1904907d9 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String url;
        C1974107oJ c1974107oJ;
        Method method;
        InterfaceC519150KXp interfaceC519150KXp;
        BaseListResponse baseListResponse;
        List<T> list;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept: url=");
        String method2 = null;
        if (request != null) {
            url = request.getUrl();
        } else {
            url = null;
        }
        sbLIZ.append(url);
        sbLIZ.append(", method=");
        if (request != null) {
            method2 = request.getMethod();
        }
        sbLIZ.append(method2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (request != null && (c1974107oJ = (C1974107oJ) request.tag(C1974107oJ.class)) != null && (method = c1974107oJ.LIZ) != null && (interfaceC519150KXp = (InterfaceC519150KXp) method.getAnnotation(InterfaceC519150KXp.class)) != null) {
            C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            try {
                T t = c0x52LIZ.LIZIZ;
                if ((t instanceof BaseListResponse) && (t instanceof BaseListResponse) && (baseListResponse = (BaseListResponse) t) != null && (list = baseListResponse.data) != 0) {
                    for (Object obj : list) {
                        if (obj instanceof FeedItem) {
                            LIZ((FeedItem) obj, interfaceC519150KXp.enableTag());
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return c0x52LIZ;
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
    }

    public static void LIZ(FeedItem feedItem, String str) {
        C0J0Q c0j0q;
        Long lValueOf;
        C1090000eTG c1090000eTGO3;
        StrategyPlatformFeatures strategyPlatformFeatures;
        Float fValueOf;
        Integer numValueOf;
        if (LiveFeedFeaturesAddExp.INSTANCE.isAppSessionValid(str)) {
            c0j0q = C0J0Q.APP;
        } else {
            c0j0q = C0J0Q.LIVE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(feedItem.requestId());
        sbLIZ.append('-');
        Room room = feedItem.getRoom();
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Room room2 = feedItem.getRoom();
            if (room2 != null && (strategyPlatformFeatures = room2.strategyPlatformFeatures) != null) {
                List<StrategyPlatformFeature> list = strategyPlatformFeatures.intFeatures;
                if (list != null) {
                    for (StrategyPlatformFeature strategyPlatformFeature : list) {
                        String str2 = strategyPlatformFeature.group;
                        String str3 = strategyPlatformFeature.name;
                        String str4 = strategyPlatformFeature.value;
                        if (str4 != null) {
                            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str4));
                        } else {
                            numValueOf = null;
                        }
                        C0ITF.LIZIZ(str2, linkedHashMap, str3, numValueOf);
                    }
                }
                List<StrategyPlatformFeature> list2 = strategyPlatformFeatures.floatFeatures;
                if (list2 != null) {
                    for (StrategyPlatformFeature strategyPlatformFeature2 : list2) {
                        String str5 = strategyPlatformFeature2.group;
                        String str6 = strategyPlatformFeature2.name;
                        String str7 = strategyPlatformFeature2.value;
                        if (str7 != null) {
                            fValueOf = Float.valueOf(CastFloatProtector.parseFloat(str7));
                        } else {
                            fValueOf = null;
                        }
                        C0ITF.LIZIZ(str5, linkedHashMap, str6, fValueOf);
                    }
                }
                List<StrategyPlatformFeature> list3 = strategyPlatformFeatures.stringFeatures;
                if (list3 != null) {
                    for (StrategyPlatformFeature strategyPlatformFeature3 : list3) {
                        C0ITF.LIZIZ(strategyPlatformFeature3.group, linkedHashMap, strategyPlatformFeature3.name, strategyPlatformFeature3.value);
                    }
                }
                List<StrategyPlatformFeature> list4 = strategyPlatformFeatures.boolFeatures;
                if (list4 != null) {
                    for (StrategyPlatformFeature strategyPlatformFeature4 : list4) {
                        C0ITF.LIZIZ(strategyPlatformFeature4.group, linkedHashMap, strategyPlatformFeature4.name, strategyPlatformFeature4.value);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.e("FeedFeatureUpdateInterceptor", "addFeedFeaturesToLiveFeatureCenter: ", e);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str8 = (String) entry.getKey();
            Object value = entry.getValue();
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateStrategyPlatformFeatures: key = ");
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(", group = ");
                sbLIZ2.append(str8);
                sbLIZ2.append(", featureMap = ");
                sbLIZ2.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), value));
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("FeedFeatureUpdateInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
            }
            ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
            if (iLiveFeatureCenterService != null) {
                iLiveFeatureCenterService.bg(c0j0q, strLIZIZ, value, str8, false);
            }
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getStrategyPlatformFeatures: ");
                Gson gsonLIZ = C293501Bt.LIZ();
                ILiveFeatureCenterService iLiveFeatureCenterService2 = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                if (iLiveFeatureCenterService2 != null) {
                    c1090000eTGO3 = iLiveFeatureCenterService2.O3(EnumC1094630eaj.DEFAULT, str8, strLIZIZ);
                } else {
                    c1090000eTGO3 = null;
                }
                sbLIZ3.append(GsonProtectorUtils.toJson(gsonLIZ, c1090000eTGO3));
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("FeedFeatureUpdateInterceptor", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }
}
