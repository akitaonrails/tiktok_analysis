package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C00EC;
import X.C098200Yq;
import X.C0CCZ;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0VZ0;
import X.C0XLC;
import X.C0XLE;
import X.C0XLF;
import X.C1086030eMr;
import X.C1086040eMs;
import X.C1514440pVq;
import X.C15438062q;
import X.C1797720wsk;
import X.C1797750wsn;
import X.C1797890wt1;
import X.C1798000wtC;
import X.C1798040wtG;
import X.C1798060wtI;
import X.C1798090wtL;
import X.C1798100wtM;
import X.C1798110wtN;
import X.C1798130wtP;
import X.C1798160wtS;
import X.C1884707Zt;
import X.C189200o6;
import X.C202094145s;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2528009vS;
import X.C305440ByA;
import X.C312240CLu;
import X.C844470XAv;
import X.C847170XLf;
import X.C847180XLg;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC110100bL;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.i18n.region.RegionManager;
import com.bytedance.i18n.region.privacy.PrivacyDataInjectionRule;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS111S1000000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class RegionInitTask implements C0CCZ {
    public static final RegionInitTask LL = new RegionInitTask();
    public static final C847170XLf LLILLJJLI = new C0XLE() { // from class: X.0XLf
        @Override // X.C0XLE
        public final String LIZ() {
            return C2222691Bz1.LIZJ();
        }

        @Override // X.C0XLE
        public final String getSimCountry() {
            return C2222691Bz1.LJ();
        }

        @Override // X.C0XLE
        public final String getSysRegion() {
            return C2222691Bz1.LJFF();
        }
    };
    public static final C1798040wtG LLILLL = C1798040wtG.LL;
    public static final AtomicBoolean LLILZ = new AtomicBoolean(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RegionInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final String LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        String uid;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin() || (uid = accountUserServiceLJIIJ.getCurUser().getUid()) == null) ? CardStruct.IStatusCode.DEFAULT : uid;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Long l;
        if (!LLILZ.getAndSet(true) && context != null) {
            LL.getClass();
            RegionSdkConfigModel regionSdkConfigModel = (RegionSdkConfigModel) C1798110wtN.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append("api-va.tiktokv.com");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C844470XAv c844470XAv = C844470XAv.LIZ;
            c844470XAv.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            String strValueOf = String.valueOf(C844470XAv.LJIIJ);
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            C1798090wtL c1798090wtL = new C1798090wtL(strLIZIZ, new RegionNetwork());
            context.getPackageName();
            String.valueOf(C844470XAv.LJ());
            String.valueOf(C844470XAv.LIZLLL());
            c844470XAv.getClass();
            Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
            C847170XLf c847170XLf = LLILLJJLI;
            PushFrequencyLimit pushFrequencyLimit = regionSdkConfigModel.pushFrequencyLimit;
            C1798160wtS c1798160wtS = new C1798160wtS(pushFrequencyLimit.minIntervalMills, pushFrequencyLimit.maxCount);
            long j = regionSdkConfigModel.networkRetryDelayedMills;
            boolean z = C305440ByA.LIZ;
            boolean z2 = C2528009vS.LIZ;
            List<Integer> list = regionSdkConfigModel.requestConfigAllowedScenes;
            boolean z3 = regionSdkConfigModel.forceUpdateControlConfigs;
            List<String> list2 = regionSdkConfigModel.domainProxyCheckList;
            boolean z4 = regionSdkConfigModel.checkPhysicalNetworkProxy;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PrivacyDataSettingsModel privacyDataSettingsModel = C00EC.LIZ;
            PrivacyDataSettingsModel privacyDataSettingsModel2 = (PrivacyDataSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("privacy_data_config", PrivacyDataSettingsModel.class, privacyDataSettingsModel);
            if (privacyDataSettingsModel2 != null) {
                privacyDataSettingsModel = privacyDataSettingsModel2;
            }
            C1798000wtC c1798000wtC = new C1798000wtC();
            AwS111S1000000_27 awS111S1000000_27 = new AwS111S1000000_27(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, 0);
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            PrivacyDataPushFrequencySettingsModel privacyDataPushFrequencySettingsModel = C1086030eMr.LIZ;
            PrivacyDataPushFrequencySettingsModel privacyDataPushFrequencySettingsModel2 = (PrivacyDataPushFrequencySettingsModel) settingsManagerLIZLLL2.LJIIIIZZ("privacy_data_push_freq_config", PrivacyDataPushFrequencySettingsModel.class, privacyDataPushFrequencySettingsModel);
            if (privacyDataPushFrequencySettingsModel2 != null) {
                privacyDataPushFrequencySettingsModel = privacyDataPushFrequencySettingsModel2;
            }
            privacyDataPushFrequencySettingsModel.getClass();
            C1086040eMs c1086040eMs = new C1086040eMs(privacyDataPushFrequencySettingsModel.maxCount, privacyDataPushFrequencySettingsModel.minIntervalMillis);
            boolean z5 = privacyDataSettingsModel.enabled;
            PrivacyDataInjectionSettingsModel privacyDataInjectionSettingsModel = privacyDataSettingsModel.headerInjectionConfig;
            List<PrivacyDataInjectionRuleSettingsModel> list3 = privacyDataInjectionSettingsModel.rules;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (PrivacyDataInjectionRuleSettingsModel privacyDataInjectionRuleSettingsModel : list3) {
                privacyDataInjectionRuleSettingsModel.getClass();
                arrayList.add(new PrivacyDataInjectionRule(privacyDataInjectionRuleSettingsModel.keys, privacyDataInjectionRuleSettingsModel.pathIncludeList, privacyDataInjectionRuleSettingsModel.pathExcludeList, privacyDataInjectionRuleSettingsModel.domainIncludeList, privacyDataInjectionRuleSettingsModel.domainExcludeList));
            }
            C1797890wt1 c1797890wt1 = new C1797890wt1(contextLIZ, strLIZIZ, c1798090wtL, c1798000wtC, awS111S1000000_27, strValueOf, z5, new C1884707Zt(arrayList, privacyDataInjectionSettingsModel.enabled), privacyDataSettingsModel.maxRetryTimes, privacyDataSettingsModel.retryDelayMillis, c1086040eMs);
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("cold_start_time", Long.valueOf(C202094145s.LJIILL)));
            C1798100wtM c1798100wtM = new C1798100wtM(contextLIZ, new C847180XLg(), c1798090wtL, c847170XLf, c1798160wtS, AFwS216S0000000_27.get$arr$(1), j, z, z2, list, z3, list2, z4, c1797890wt1, mapLIZJ);
            C1798060wtI c1798060wtI = C1798060wtI.LIZ;
            C1514440pVq.LIZ(new InterfaceC110100bL() { // from class: X.00bJ
                @Override // X.InterfaceC110100bL
                public final void LIZ(String str, Map<String, ? extends Object> map, Map<String, Long> map2) throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue().toString());
                    }
                    for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                        jSONObject.put(entry2.getKey(), String.valueOf(entry2.getValue().longValue()));
                    }
                    C20684815ws.LJIJ(str, jSONObject);
                }
            });
            C0XLC c0xlc = new C0XLC();
            synchronized (c1798060wtI) {
                try {
                    if (!C1798060wtI.LIZIZ()) {
                        C1798060wtI.LIZLLL = c1798100wtM;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Object obj = mapLIZJ.get("cold_start_time");
                        if (obj instanceof Long) {
                            l = (Long) obj;
                        } else {
                            l = null;
                        }
                        long j2 = 0;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            if (jLongValue > 0) {
                                j2 = jUptimeMillis - jLongValue;
                            }
                        }
                        C1514440pVq.LIZIZ("pns_region_sdk_load_start", C2097608Jq.LJ(), C2097608Jq.LJIIJ(new Pair("cold_start_to_load_start_duration", Long.valueOf(j2))));
                        C1798060wtI.LIZJ = new RegionManager(c1798100wtM);
                        C1798130wtP c1798130wtP = C1798130wtP.LIZJ;
                        c1798130wtP.getClass();
                        RegionManager regionManager = C1798060wtI.LIZJ;
                        if (regionManager != null) {
                            String strLIZIZ2 = c1798130wtP.LIZIZ();
                            regionManager.LJFF.put(strLIZIZ2, c1798130wtP);
                            regionManager.LJI.put(strLIZIZ2, c1798130wtP.LIZ());
                        }
                        C1798130wtP c1798130wtP2 = C1798130wtP.LIZLLL;
                        c1798130wtP2.getClass();
                        RegionManager regionManager2 = C1798060wtI.LIZJ;
                        if (regionManager2 != null) {
                            String strLIZIZ3 = c1798130wtP2.LIZIZ();
                            regionManager2.LJFF.put(strLIZIZ3, c1798130wtP2);
                            regionManager2.LJI.put(strLIZIZ3, c1798130wtP2.LIZ());
                        }
                        C1798130wtP c1798130wtP3 = C1798130wtP.LJ;
                        c1798130wtP3.getClass();
                        RegionManager regionManager3 = C1798060wtI.LIZJ;
                        if (regionManager3 != null) {
                            String strLIZIZ4 = c1798130wtP3.LIZIZ();
                            regionManager3.LJFF.put(strLIZIZ4, c1798130wtP3);
                            regionManager3.LJI.put(strLIZIZ4, c1798130wtP3.LIZ());
                        }
                        if (z5) {
                            C1797750wsn.LIZ.LIZ(c1797890wt1);
                        }
                        C1798060wtI.LIZLLL();
                        C1514440pVq.LIZLLL(j2, SystemClock.uptimeMillis() - jUptimeMillis);
                        C1798060wtI.LIZIZ.set(true);
                        try {
                            C189200o6.m2constructorimpl(c0xlc.invoke());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            C312240CLu.LIZ(new C0CM3(C0CME.FIRST_VIDEO_SHOW, C0CMJ.NORMAL_PRIORITY.getType(), regionSdkConfigModel.downgradeTimeoutMs, new C1797720wsk(regionSdkConfigModel, c1798100wtM)));
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null) {
                iAccountService.LJIILL(LLILLL);
            }
            C1798060wtI c1798060wtI2 = C1798060wtI.LIZ;
            C1798060wtI.LJ(new C0XLF() { // from class: X.0wtK
                @Override // X.C0XLF
                public final void LIZ(String str, C847070XKv c847070XKv) {
                }
            });
        }
    }
}
