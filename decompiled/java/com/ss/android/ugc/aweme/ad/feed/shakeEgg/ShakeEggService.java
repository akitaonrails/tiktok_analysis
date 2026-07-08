package com.ss.android.ugc.aweme.ad.feed.shakeEgg;

import X.AbstractC1552040qUU;
import X.C09C2;
import X.C0C64;
import X.C1041070dCL;
import X.C1041280dCg;
import X.C13BV;
import X.C14KI;
import X.C14KQ;
import X.C1551290qTH;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C988570bpf;
import X.EnumC1551280qTG;
import X.InterfaceC1008660cM4;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.TopViewGeckoExperiment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS16S2000000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class ShakeEggService implements IShakeEggService {
    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final boolean LIZ(Aweme aweme) {
        if (LIZIZ(aweme) != null) {
            return !r0.shaken;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final ShakeModel LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        ShakeModel shakeModel;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shakeModel = awemeRawAd.getShakeModel()) != null) {
            return shakeModel;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final InterfaceC1008660cM4 LIZJ(C19GS c19gs) {
        return new ShakeEgg(c19gs);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final String LIZLLL(ShakeModel shakeModel, C19EG c19eg) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("width", Integer.valueOf(c19eg.getResources().getDisplayMetrics().widthPixels));
        jSONObject.putOpt("height", Integer.valueOf(C14KQ.LIZJ(c19eg) - C14KI.LIZIZ(c19eg)));
        jSONObject.putOpt("scale", Float.valueOf(c19eg.getResources().getDisplayMetrics().density));
        if (shakeModel != null) {
            List<String> list = shakeModel.geckoChannel;
            if (list != null) {
                jSONObject.putOpt("gecko_channel", GsonProtectorUtils.toJson(C09C2.LIZ(), list));
            }
            Object obj = shakeModel.frontendData;
            if (obj != null) {
                jSONObject.putOpt("data", GsonProtectorUtils.toJson(C09C2.LIZ(), obj));
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final void LJ(final AwemeRawAd awemeRawAd, final List<String> list) {
        IAdLandPagePreloadService iAdLandPagePreloadService;
        final String strK0;
        AbstractC1552040qUU abstractC1552040qUU;
        if (list != null && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null && (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) != null) {
            Integer numValueOf = null;
            boolean z = true;
            TopViewGeckoExperiment.GeckoOptimizeSetting geckoOptimizeSetting = (TopViewGeckoExperiment.GeckoOptimizeSetting) C0C64.LJIILLIIL().LJJII(TopViewGeckoExperiment.GeckoOptimizeSetting.class, null, "splash_gecko_optimize_setting", true);
            AwemeSplashInfo splashInfo = awemeRawAd.getSplashInfo();
            if (splashInfo != null) {
                numValueOf = Integer.valueOf(splashInfo.getEndTime());
            }
            if (geckoOptimizeSetting != null && geckoOptimizeSetting.didOptimize && numValueOf != null) {
                List<String> list2 = geckoOptimizeSetting.longTimeChannel;
                Long l = geckoOptimizeSetting.longTimeBuffer;
                if (list2 != null && !list2.isEmpty()) {
                    z = false;
                }
                if (!z && l != null) {
                    for (String str : list) {
                        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                        final List listSingletonList = Collections.singletonList(str);
                        optionCheckUpdateParams.setListener(new AbstractC1552040qUU(awemeRawAd, listSingletonList, strK0) { // from class: X.0cbI
                            public final AwemeRawAd LIZ;
                            public final List<String> LIZIZ;
                            public final String LIZJ;

                            @Override // X.AbstractC1552040qUU
                            public final void LJII(Throwable th, Map map) {
                                Iterator<String> it2 = this.LIZIZ.iterator();
                                while (it2.hasNext()) {
                                    LJJI(it2.next(), "check_server_fail");
                                }
                            }

                            @Override // X.AbstractC1552040qUU
                            public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                                List<UpdatePackage> list3;
                                List<Pair<String, Long>> list4;
                                for (String str2 : this.LIZIZ) {
                                    if (map != null && (list4 = map.get(this.LIZJ)) != null) {
                                        Iterator<Pair<String, Long>> it2 = list4.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            Pair<String, Long> next = it2.next();
                                            if (Intrinsics.LJFF(next.first, str2)) {
                                                if (next == null) {
                                                }
                                            }
                                        }
                                    }
                                    if (map2 != null && (list3 = map2.get(this.LIZJ)) != null) {
                                        Iterator<UpdatePackage> it3 = list3.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                break;
                                            }
                                            UpdatePackage next2 = it3.next();
                                            if (Intrinsics.LJFF(next2.getChannel(), str2)) {
                                                if (next2 == null) {
                                                }
                                            }
                                        }
                                    }
                                    LJJI(str2, "invalid_channel");
                                }
                            }

                            @Override // X.AbstractC1552040qUU
                            public final void LJIJI(String str2, Throwable th) {
                                if (str2 != null) {
                                    LJJI(str2, "update_fail");
                                }
                            }

                            @Override // X.AbstractC1552040qUU
                            public final void LJJ(long j, String str2) {
                                if (str2 != null) {
                                    ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                                    C1018060cbE.LIZ.getClass();
                                    iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJI, this.LIZ, new AwS67S1000000_16(str2, 21));
                                }
                            }

                            public final void LJJI(String str2, String str3) {
                                ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                                C1018060cbE.LIZ.getClass();
                                iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJIFFI, this.LIZ, new AwS16S2000000_16(str2, str3, 3));
                            }

                            {
                                this.LIZ = awemeRawAd;
                                this.LIZIZ = listSingletonList;
                                this.LIZJ = strK0;
                            }
                        });
                        if (list2.contains(str)) {
                            abstractC1552040qUU = null;
                            optionCheckUpdateParams.setCacheConfig(new C1551290qTH(0, EnumC1551280qTG.SPECIFIC_TIME, C13BV.INSTANCE, null, Long.valueOf((((long) numValueOf.intValue()) + l.longValue()) * 1000)));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("longTimeChannel logic, is longTimeChannel, channel:");
                            sbLIZ.append(str);
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            abstractC1552040qUU = null;
                            optionCheckUpdateParams.setCacheConfig(new C1551290qTH(0, EnumC1551280qTG.SPECIFIC_TIME, C13BV.INSTANCE, null, Long.valueOf((((long) numValueOf.intValue()) + geckoOptimizeSetting.normalBuffer) * 1000)));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("longTimeChannel logic, isn't longTimeChannel, channel:");
                            sbLIZ2.append(str);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        C988570bpf.LIZ.getClass();
                        if (C1041070dCL.LIZIZ() != null) {
                            C1041280dCg.LJFF(Collections.singletonList(str), strK0, optionCheckUpdateParams, abstractC1552040qUU);
                        }
                    }
                    return;
                }
                OptionCheckUpdateParams optionCheckUpdateParams2 = new OptionCheckUpdateParams();
                optionCheckUpdateParams2.setListener(new AbstractC1552040qUU(awemeRawAd, list, strK0) { // from class: X.0cbI
                    public final AwemeRawAd LIZ;
                    public final List<String> LIZIZ;
                    public final String LIZJ;

                    @Override // X.AbstractC1552040qUU
                    public final void LJII(Throwable th, Map map) {
                        Iterator<String> it2 = this.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            LJJI(it2.next(), "check_server_fail");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list3;
                        List<Pair<String, Long>> list4;
                        for (String str2 : this.LIZIZ) {
                            if (map != null && (list4 = map.get(this.LIZJ)) != null) {
                                Iterator<Pair<String, Long>> it2 = list4.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Pair<String, Long> next = it2.next();
                                    if (Intrinsics.LJFF(next.first, str2)) {
                                        if (next == null) {
                                        }
                                    }
                                }
                            }
                            if (map2 != null && (list3 = map2.get(this.LIZJ)) != null) {
                                Iterator<UpdatePackage> it3 = list3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    UpdatePackage next2 = it3.next();
                                    if (Intrinsics.LJFF(next2.getChannel(), str2)) {
                                        if (next2 == null) {
                                        }
                                    }
                                }
                            }
                            LJJI(str2, "invalid_channel");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJI(String str2, Throwable th) {
                        if (str2 != null) {
                            LJJI(str2, "update_fail");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJJ(long j, String str2) {
                        if (str2 != null) {
                            ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                            C1018060cbE.LIZ.getClass();
                            iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJI, this.LIZ, new AwS67S1000000_16(str2, 21));
                        }
                    }

                    public final void LJJI(String str2, String str3) {
                        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                        C1018060cbE.LIZ.getClass();
                        iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJIFFI, this.LIZ, new AwS16S2000000_16(str2, str3, 3));
                    }

                    {
                        this.LIZ = awemeRawAd;
                        this.LIZIZ = list;
                        this.LIZJ = strK0;
                    }
                });
                optionCheckUpdateParams2.setCacheConfig(new C1551290qTH(0, EnumC1551280qTG.SPECIFIC_TIME, C13BV.INSTANCE, null, Long.valueOf((((long) numValueOf.intValue()) + geckoOptimizeSetting.normalBuffer) * 1000)));
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() != null) {
                    C1041280dCg.LJFF(list, strK0, optionCheckUpdateParams2, null);
                    return;
                }
                return;
            }
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZIZ() != null) {
                C1041280dCg.LJ(list, strK0, new AbstractC1552040qUU(awemeRawAd, list, strK0) { // from class: X.0cbI
                    public final AwemeRawAd LIZ;
                    public final List<String> LIZIZ;
                    public final String LIZJ;

                    @Override // X.AbstractC1552040qUU
                    public final void LJII(Throwable th, Map map) {
                        Iterator<String> it2 = this.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            LJJI(it2.next(), "check_server_fail");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list3;
                        List<Pair<String, Long>> list4;
                        for (String str2 : this.LIZIZ) {
                            if (map != null && (list4 = map.get(this.LIZJ)) != null) {
                                Iterator<Pair<String, Long>> it2 = list4.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Pair<String, Long> next = it2.next();
                                    if (Intrinsics.LJFF(next.first, str2)) {
                                        if (next == null) {
                                        }
                                    }
                                }
                            }
                            if (map2 != null && (list3 = map2.get(this.LIZJ)) != null) {
                                Iterator<UpdatePackage> it3 = list3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    UpdatePackage next2 = it3.next();
                                    if (Intrinsics.LJFF(next2.getChannel(), str2)) {
                                        if (next2 == null) {
                                        }
                                    }
                                }
                            }
                            LJJI(str2, "invalid_channel");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJI(String str2, Throwable th) {
                        if (str2 != null) {
                            LJJI(str2, "update_fail");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJJ(long j, String str2) {
                        if (str2 != null) {
                            ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                            C1018060cbE.LIZ.getClass();
                            iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJI, this.LIZ, new AwS67S1000000_16(str2, 21));
                        }
                    }

                    public final void LJJI(String str2, String str3) {
                        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                        C1018060cbE.LIZ.getClass();
                        iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJIFFI, this.LIZ, new AwS16S2000000_16(str2, str3, 3));
                    }

                    {
                        this.LIZ = awemeRawAd;
                        this.LIZIZ = list;
                        this.LIZJ = strK0;
                    }
                });
            }
        }
    }
}
