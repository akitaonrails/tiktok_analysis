package com.ss.android.ugc.aweme.setting.services;

import X.AbstractC666100QAu;
import X.AbstractC848400XPy;
import X.C07J4;
import X.C08P8;
import X.C098200Yq;
import X.C0CLU;
import X.C0CLW;
import X.C0OM1;
import X.C0TGH;
import X.C0TGI;
import X.C0TTZ;
import X.C0XCH;
import X.C0XCI;
import X.C0XCJ;
import X.C0XD1;
import X.C0XDN;
import X.C0XEC;
import X.C0XI4;
import X.C0XQ7;
import X.C1057370dcd;
import X.C10E3;
import X.C10F0;
import X.C10F3;
import X.C10F6;
import X.C10F8;
import X.C10FJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1260150ith;
import X.C1260870iur;
import X.C1300840jxK;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1510050pOl;
import X.C1697810uHb;
import X.C1750470veX;
import X.C1841350y17;
import X.C189200o6;
import X.C19278710bZ;
import X.C19278810ba;
import X.C19278910bb;
import X.C19279010bc;
import X.C19279110bd;
import X.C19279310bf;
import X.C19290910dX;
import X.C19328310jZ;
import X.C19724912Fj;
import X.C19EG;
import X.C2016707vB;
import X.C2097608Jq;
import X.C2214201BlK;
import X.C2222691Bz1;
import X.C2426909f9;
import X.C2511809sq;
import X.C686150Qvl;
import X.C786410Ut5;
import X.C794320VDy;
import X.C816520W1i;
import X.C816540W1k;
import X.C827010WcN;
import X.C844470XAv;
import X.DialogInterfaceOnDismissListenerC1767806w8;
import X.EnumC1643006c0;
import X.InterfaceC1642506bv;
import X.InterfaceC1910030znt;
import X.InterfaceC19279210be;
import X.InterfaceC19572111hn;
import X.InterfaceC197023126r;
import X.InterfaceC845000XCw;
import X.ViewOnClickListenerC1643106c1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingServiceImpl extends BaseSettingServiceImpl {
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<C10FJ> providePushSettingCallbackList() {
        return C1697810uHb.LJIIJJI(new C10FJ() { // from class: X.15zQ
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
            @Override // X.C10FJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Hl(com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings r14) {
                /*
                    Method dump skipped, instruction units count: 371
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20700615zQ.Hl(com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings):void");
            }
        }, C1260150ith.LIZ, C19278810ba.LL, new C10FJ() { // from class: X.10bY
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLanguage() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            String strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C844470XAv.LIZ());
            if (strLJIJJ != null) {
                return strLJIJJ;
            }
        }
        return C786410Ut5.t2(Locale.getDefault());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLogRegion() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJII(C844470XAv.LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getCarrierRegionV2() {
        T tLIZ;
        T t;
        C816520W1i c816520W1i = C816540W1k.LIZ;
        synchronized (c816520W1i) {
            try {
                if (c816520W1i.LIZ == 0) {
                    try {
                        tLIZ = C816520W1i.LIZ();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        tLIZ = "";
                    }
                    c816520W1i.LIZ = tLIZ;
                }
                t = c816520W1i.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (String) t;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getCountryLocale() {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
            return new Locale(C786410Ut5.t2(Locale.getDefault()), C2222691Bz1.LIZIZ());
        }
        I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
        C844470XAv.LIZ.getClass();
        return new Locale(i18nManagerServiceApiLIZ.LJIIL(C844470XAv.LIZ()).getLanguage(), C2222691Bz1.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<InterfaceC1910030znt> getI18nItems() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        List<InterfaceC1910030znt> listLJIIJJI;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        return (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (listLJIIJJI = i18nManagerServiceApiLIZ.LJIIJJI()) == null) ? new ArrayList() : listLJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Map<String, InterfaceC1910030znt> getLocaleMap() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        Map<String, InterfaceC1910030znt> mapLJIILIIL;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        return (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (mapLJIILIIL = i18nManagerServiceApiLIZ.LJIILIIL()) == null) ? C2097608Jq.LJ() : mapLJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> getPrivateSettingChangePresenter() {
        return new C10F3();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> getPushSettingFetchPresenter() {
        return new C10F6();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getSysLanguage() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            String strLJFF = i18nManagerServiceApiLIZ.LJFF(C844470XAv.LIZ());
            if (strLJFF != null) {
                return strLJFF;
            }
        }
        return C786410Ut5.t2(Locale.getDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final boolean isIndonesiaByMcc() {
        Object obj;
        T t;
        C19279010bc c19279010bc = C19279110bd.LIZ;
        synchronized (c19279010bc) {
            try {
                Object obj2 = c19279010bc.LIZ;
                obj = obj2;
                if (obj2 == null) {
                    String strLJ = "";
                    try {
                        C844470XAv.LIZ.getClass();
                        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C844470XAv.LIZ(), "phone");
                        t = strLJ;
                        if (telephonyManager != null) {
                            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                            strLJ = C1300840jxK.LJ(telephonyManager);
                            t = strLJ;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        t = strLJ;
                    }
                    c19279010bc.LIZ = t;
                    obj = t;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String str = (String) obj;
        return !TextUtils.isEmpty(str) && str.startsWith("510");
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isKorean() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJJI(C844470XAv.LIZ(), "KR");
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final boolean shouldShowBusinessAccount() {
        ICoinCloseCommerceSettings iCoinCloseCommerceSettings = (ICoinCloseCommerceSettings) C1057370dcd.LIZ.getValue();
        if (iCoinCloseCommerceSettings != null) {
            iCoinCloseCommerceSettings.LIZIZ();
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (C0CLU.LIZ() && curUser.getAccountType() == 3) {
            return true;
        }
        return (curUser.getPotentialBizAccountInfo() == null || !curUser.getPotentialBizAccountInfo().isPotentialBA() || curUser.getAccountType() == 3) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldShowCreatorToolsDot() {
        /*
            r3 = this;
            X.0CNI r0 = X.C0CNI.LIZ
            r0.getClass()
            boolean r0 = X.C0CNI.LIZ()
            r1 = 1
            if (r0 != 0) goto L7f
            boolean r0 = X.C19290910dX.LJII()
            if (r0 == 0) goto L4b
            boolean r0 = X.C0CLU.LIZ()
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            int r2 = r0.getAccountType()
            boolean r0 = X.C19290910dX.LJII()
            if (r0 == 0) goto L4b
            boolean r0 = X.C19290910dX.LJIIIIZZ()
            if (r0 == 0) goto L4b
            r0 = 2
            if (r2 == r0) goto L37
            if (r2 != r1) goto L4b
        L37:
            boolean r0 = X.C19290910dX.LIZ()
            if (r0 != 0) goto L7f
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            boolean r0 = r0.proAccountTcmRedDot
            if (r0 != 0) goto L7f
        L4b:
            boolean r0 = X.C19291110dZ.LIZJ()
            if (r0 != 0) goto L7f
            boolean r0 = X.C19290910dX.LJI()
            if (r0 != 0) goto L7f
            boolean r0 = X.C19290910dX.LJFF()
            if (r0 != 0) goto L7f
            boolean r0 = X.C19290910dX.LIZLLL()
            if (r0 != 0) goto L7f
            boolean r0 = X.C19290910dX.LIZIZ()
            if (r0 != 0) goto L7f
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            int r0 = r0.getProAccountUpdateNotificationStatus()
            if (r0 != r1) goto L9b
            boolean r0 = X.C19290910dX.LIZJ()
            if (r0 == 0) goto L9b
        L7f:
            return r1
        L80:
            boolean r0 = X.C19290910dX.LJII()
            if (r0 == 0) goto L4b
            boolean r0 = X.C19290910dX.LJIIIIZZ()
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            boolean r0 = r0.isProAccount
            if (r0 == 0) goto L4b
            goto L37
        L9b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.shouldShowCreatorToolsDot():boolean");
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldUseFasterPaging() {
        return Keva.getRepo("accessibility_setting").getBoolean("faster_paging_duration", true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final boolean enableBACALogic() {
        return C0CLU.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAbi() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("common_params_host_abi", true)) {
            return C08P8.LIZJ();
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0XE9] */
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void installCommonParams() {
        int iLIZ = C827010WcN.LIZ();
        final boolean z = iLIZ == 1 || iLIZ == 3;
        if (C0XEC.LIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (C0XEC.LIZ) {
                    return;
                }
                IInferenceEngineService iInferenceEngineService = (IInferenceEngineService) PluggableExtentionKt.pluggableSpi$default(IInferenceEngineService.class, false, false, false, 14, null);
                if (iInferenceEngineService != null) {
                    iInferenceEngineService.LIZ();
                }
                FeatureServiceManager.Companion.getClass();
                final FeatureProducer producer = C1510050pOl.LIZ().getProducer("f_common_params", 0);
                C0XD1 c0xd1 = new C0XD1(new InterfaceC845000XCw() { // from class: X.0XE9
                    @Override // X.InterfaceC845000XCw
                    public final HashMap LIZ() {
                        Map<String, String> mapLJ;
                        String stringFeature$default;
                        String stringFeature$default2;
                        HashMap map = new HashMap();
                        System.currentTimeMillis();
                        FeatureProducer featureProducer = producer;
                        map.put("app_language", featureProducer != null ? FeatureProducer.getStringFeature$default(featureProducer, "f_global_app_language", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        if (!C10EU.LJIIIIZZ()) {
                            FeatureProducer featureProducer2 = producer;
                            map.put("uoo", featureProducer2 != null ? FeatureProducer.getStringFeature$default(featureProducer2, "f_global_uoo", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                            FeatureProducer featureProducer3 = producer;
                            map.put("content_language", featureProducer3 != null ? FeatureProducer.getStringFeature$default(featureProducer3, "f_global_content_language", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        }
                        FeatureProducer featureProducer4 = producer;
                        map.put("build_number", featureProducer4 != null ? FeatureProducer.getStringFeature$default(featureProducer4, "f_global_build_number", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer5 = producer;
                        map.put("locale", featureProducer5 != null ? FeatureProducer.getStringFeature$default(featureProducer5, "f_global_locale", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer6 = producer;
                        map.put("timezone_offset", featureProducer6 != null ? FeatureProducer.getStringFeature$default(featureProducer6, "f_global_timezone_offset", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer7 = producer;
                        map.put("carrier_region", featureProducer7 != null ? FeatureProducer.getStringFeature$default(featureProducer7, "f_global_carrier_region", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer8 = producer;
                        map.put("region", featureProducer8 != null ? FeatureProducer.getStringFeature$default(featureProducer8, "f_global_region", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer9 = producer;
                        map.put("op_region", featureProducer9 != null ? FeatureProducer.getStringFeature$default(featureProducer9, "f_global_op_region", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer10 = producer;
                        map.put("host_abi", featureProducer10 != null ? FeatureProducer.getStringFeature$default(featureProducer10, "f_global_host_api", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        ICoinService iCoinService = (ICoinService) PluggableExtentionKt.pluggableSpi$default(ICoinService.class, false, false, false, 14, null);
                        if (iCoinService == null || (mapLJ = iCoinService.LJ()) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        map.putAll(mapLJ);
                        FeatureProducer featureProducer11 = producer;
                        map.put("ts", featureProducer11 != null ? FeatureProducer.getStringFeature$default(featureProducer11, "f_global_ts", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer12 = producer;
                        map.put("effect_channel", featureProducer12 != null ? FeatureProducer.getStringFeature$default(featureProducer12, "f_global_effect_channel", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        FeatureProducer featureProducer13 = producer;
                        if (featureProducer13 != null && (stringFeature$default2 = FeatureProducer.getStringFeature$default(featureProducer13, "f_global_fake_region", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null)) != null) {
                            map.put("fake_region", stringFeature$default2);
                        }
                        FeatureProducer featureProducer14 = producer;
                        if (featureProducer14 != null && (stringFeature$default = FeatureProducer.getStringFeature$default(featureProducer14, "f_global_pkg_build_env", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null)) != null) {
                            map.put("pkg_build_env", stringFeature$default);
                        }
                        FeatureProducer featureProducer15 = producer;
                        map.put("ac2", featureProducer15 != null ? FeatureProducer.getStringFeature$default(featureProducer15, "f_global_ac2", (JSONObject) null, "network_common_params", (ReturnCode) null, 10, (Object) null) : null);
                        if (z) {
                            C0XEC.LIZ = true;
                        }
                        return map;
                    }
                });
                C0XCI c0xci = C0XCJ.LIZIZ;
                if (c0xci.LIZJ()) {
                    C0XCH c0xch = c0xci.LJI;
                    if (c0xch.LIZ == null) {
                        c0xch.LIZ = c0xd1;
                    }
                }
                HashMap map = new HashMap();
                System.currentTimeMillis();
                map.put("mcc_mnc", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_mcc_mnc", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("app_type", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_app_type", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("timezone_name", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_timezone_name", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("current_region", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_current_region", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("residence", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_residence", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("carrier_region_v2", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_carrier_region_v2", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("sys_region", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_sys_region", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("language", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_language", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("is_pad", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_is_pad", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                if (producer != null) {
                    String stringFeature$default = FeatureProducer.getStringFeature$default(producer, "f_global_is_foldable", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null);
                    if (stringFeature$default != null && Intrinsics.LJFF(stringFeature$default, "1")) {
                        map.put("is_foldable", stringFeature$default);
                    }
                    String stringFeature$default2 = FeatureProducer.getStringFeature$default(producer, "f_global_is_flip", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null);
                    if (stringFeature$default2 != null && Intrinsics.LJFF(stringFeature$default2, "1")) {
                        map.put("is_flip", stringFeature$default2);
                    }
                }
                map.put("last_install_time", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_last_install_time", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                map.put("account_region", producer != null ? FeatureProducer.getStringFeature$default(producer, "f_global_account_region", (JSONObject) null, "network_common_params_once", (ReturnCode) null, 10, (Object) null) : null);
                for (Map.Entry entry : map.entrySet()) {
                    C0XDN.LIZ((String) entry.getKey(), (String) entry.getValue());
                }
                if (!z) {
                    C0XEC.LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isFirstShowBAOrCARedDot() {
        return C19290910dX.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isShowFamilyPairingForNotLoginUser() {
        return C07J4.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowProfileGuideView() {
        long jLongValue;
        if (C2016707vB.LIZ().getBoolean("has_show_disk_manager_guide", false)) {
            return false;
        }
        long jLIZ = C2426909f9.LIZ();
        try {
            jLongValue = C0CLW.LIZIZ.LIZ.getShowStorageTipSize().longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jLongValue = 314572800;
        }
        return jLIZ >= jLongValue;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowRedDotOnMyProfileMore() {
        if (!C19290910dX.LJII() || !C19290910dX.LIZ() || !C19290910dX.LJIIIIZZ()) {
            return false;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isProAccount) {
            return true;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return curUser != null && curUser.getAccountType() == 2;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final InterfaceC19572111hn getEventTracker() {
        return new InterfaceC19572111hn() { // from class: X.10jX
            @Override // X.InterfaceC19572111hn
            public final void LIZ(String str, String str2) {
                C1245240iVe.LIZ.getClass();
                C1245240iVe.LIZIZ(str, str2);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C10E3 getFetchPushOffReasonManager() {
        return C1750470veX.LL;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isStudioInappM10nCenterRevampEnabled() {
        return C2511809sq.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final InterfaceC1910030znt getCurrentI18nItem(Context context) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            InterfaceC1910030znt interfaceC1910030zntLJIIL = i18nManagerServiceApiLIZ.LJIIL(C844470XAv.LIZ());
            if (interfaceC1910030zntLJIIL != null) {
                return interfaceC1910030zntLJIIL;
            }
        }
        return new InterfaceC1910030znt() { // from class: X.0TVP
            @Override // X.InterfaceC1910030znt
            public final String LIZ() {
                return "";
            }

            @Override // X.InterfaceC1910030znt
            public final String LIZIZ() {
                return "";
            }

            @Override // X.InterfaceC1910030znt
            public final String LIZJ() {
                return "";
            }

            @Override // X.InterfaceC1910030znt
            public final String getCountry() {
                return "";
            }

            @Override // X.InterfaceC1910030znt
            public final String getLanguage() {
                return C786410Ut5.t2(Locale.getDefault());
            }

            @Override // X.InterfaceC1910030znt
            public final Locale getLocale() {
                return Locale.getDefault();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final List<String> getInteractionPushSettingItemsString(String str) {
        ArrayList arrayList = new ArrayList();
        int iHashCode = str.hashCode();
        if (iHashCode != -1268958287) {
            if (iHashCode != -431564597) {
                if (iHashCode == 925887911 && str.equals("in_app_share")) {
                    ArrayList arrayListLJ = C1697810uHb.LJ("digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push");
                    arrayListLJ.addAll(C1697810uHb.LJ("im_push", "im_push_preview_v2"));
                    return arrayListLJ;
                }
                return arrayList;
            }
            if (!str.equals("enter_homepage_friends")) {
                return arrayList;
            }
            ArrayList arrayListLJ2 = C1697810uHb.LJ("recommend_video_push", "follow_new_video_push", "general_upvote_push");
            if (Build.VERSION.SDK_INT >= 26) {
                arrayListLJ2.add("acq_video_push");
            }
            arrayListLJ2.addAll(C1697810uHb.LJ("digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push"));
            return arrayListLJ2;
        }
        if (!str.equals("follow")) {
            return arrayList;
        }
        ArrayList arrayListLJ3 = C1697810uHb.LJ("recommend_video_push", "follow_new_video_push", "general_upvote_push");
        if (Build.VERSION.SDK_INT < 26) {
            return arrayListLJ3;
        }
        arrayListLJ3.add("acq_video_push");
        return arrayListLJ3;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getLanguage(Locale locale) {
        I18nServiceApi i18nServiceApi;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        if (locale == null || (i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null)) == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJIJI(C844470XAv.LIZ(), locale);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getLocale(String str) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            return i18nManagerServiceApiLIZ.LIZLLL(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getTheme(int i) {
        return (String) ((SparseArray) C19278710bZ.LIZ.getValue()).get(i, "light");
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isArabicLang(Context context) {
        C2222691Bz1.LIZ.getClass();
        return C2222691Bz1.LJI(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final void openTermsPage(Activity activity) {
        C0TTZ.LIZ.getClass();
        C0TTZ.LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void showDMSettingSheet(InterfaceC1642506bv interfaceC1642506bv) {
        LayoutInflater layoutInflater;
        TuxNavBar tuxNavBar;
        C1841350y17 c1841350y17;
        C1841350y17 c1841350y172;
        C1841350y17 c1841350y173;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Resources.Theme theme;
        final ViewOnClickListenerC1643106c1 viewOnClickListenerC1643106c1 = ViewOnClickListenerC1643106c1.LLIZ;
        viewOnClickListenerC1643106c1.getClass();
        Activity activityLJFF = C2214201BlK.LJFF();
        TuxSheet tuxSheet = null;
        if (activityLJFF != null && (layoutInflater = activityLJFF.getLayoutInflater()) != null) {
            View viewSd = C786410Ut5.Sd(R.layout.f6j, layoutInflater, null);
            if (!(viewSd instanceof ConstraintLayout)) {
                viewSd = null;
            }
            viewOnClickListenerC1643106c1.LLILZIL = interfaceC1642506bv;
            if (viewSd != null) {
                tuxNavBar = (TuxNavBar) viewSd.findViewById(R.id.y1z);
            } else {
                tuxNavBar = null;
            }
            if (tuxNavBar != null) {
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = activityLJFF.getString(2131845556);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.10bW
                    @Override // X.InterfaceC197023126r
                    public final void LIZ() {
                        TuxSheet tuxSheet2 = viewOnClickListenerC1643106c1.LL;
                        if (tuxSheet2 != null) {
                            tuxSheet2.dismiss();
                        }
                    }
                };
                c0om1.LIZIZ(c1251150ifB);
                tuxNavBar.setNavActions(c0om1);
                TypedValue typedValue = new TypedValue();
                Activity activityLJFF2 = C2214201BlK.LJFF();
                if (activityLJFF2 != null && (theme = activityLJFF2.getTheme()) != null) {
                    theme.resolveAttribute(R.attr.zp, typedValue, true);
                }
                tuxNavBar.setNavBackground(typedValue.data);
            }
            if (viewSd != null) {
                c1841350y17 = (C1841350y17) viewSd.findViewById(R.id.heu);
            } else {
                c1841350y17 = null;
            }
            viewOnClickListenerC1643106c1.LLILLJJLI = c1841350y17;
            if (viewSd != null) {
                c1841350y172 = (C1841350y17) viewSd.findViewById(R.id.imc);
            } else {
                c1841350y172 = null;
            }
            viewOnClickListenerC1643106c1.LLILLL = c1841350y172;
            if (viewSd != null) {
                c1841350y173 = (C1841350y17) viewSd.findViewById(R.id.pa0);
            } else {
                c1841350y173 = null;
            }
            viewOnClickListenerC1643106c1.LLILZ = c1841350y173;
            C1841350y17 c1841350y174 = viewOnClickListenerC1643106c1.LLILLJJLI;
            if (c1841350y174 != null) {
                C786410Ut5.e9(c1841350y174, viewOnClickListenerC1643106c1);
            }
            C1841350y17 c1841350y175 = viewOnClickListenerC1643106c1.LLILLL;
            if (c1841350y175 != null) {
                C786410Ut5.e9(c1841350y175, viewOnClickListenerC1643106c1);
            }
            C1841350y17 c1841350y176 = viewOnClickListenerC1643106c1.LLILZ;
            if (c1841350y176 != null) {
                C786410Ut5.e9(c1841350y176, viewOnClickListenerC1643106c1);
            }
            C1841350y17 c1841350y177 = viewOnClickListenerC1643106c1.LLILLJJLI;
            if (c1841350y177 != null) {
                c1841350y177.setChecked(true);
            }
            viewOnClickListenerC1643106c1.LLILZLL = EnumC1643006c0.EVERY_ONE;
            if (viewSd != null) {
                tuxSheet = new C1390920mIc(false, 0).LIZ;
                tuxSheet.LLJJIII = viewSd;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1767806w8(viewOnClickListenerC1643106c1, 5);
            }
            viewOnClickListenerC1643106c1.LL = tuxSheet;
            if (tuxSheet != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager, "dmSheet");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String buildFeedbackUrl(String str, Map<String, String> map) {
        String strSubstring;
        int i;
        String strSubstring2;
        C19279310bf.LIZ.getClass();
        HashMap map2 = new HashMap();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        int iLJJIZ = a0.LJJIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, '?', 0, false, 6);
        if (iLJJIZ > 0 && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > (i = iLJJIZ + 1) && (strSubstring2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.substring(i)) != null && strSubstring2.length() != 0) {
            Iterator it2 = a0.LJJLIIIJILLIZJL(strSubstring2, new String[]{"&"}, 0, 6).iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() == 2) {
                    map2.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                }
            }
        }
        map2.putAll(map);
        int iLJJIZ2 = a0.LJJIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, '?', 0, false, 6);
        if (iLJJIZ2 > 0) {
            strSubstring = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.substring(0, iLJJIZ2);
        } else {
            strSubstring = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        C0XI4 c0xi4 = new C0XI4(strSubstring);
        for (Map.Entry entry : map2.entrySet()) {
            c0xi4.LJ((String) entry.getKey(), (String) entry.getValue());
        }
        return u.LJJIFFI(str, URLEncoder.encode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), URLEncoder.encode(c0xi4.LJFF()), true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void requestTurnOnAdAuthorization(Context context, final InterfaceC19279210be interfaceC19279210be) {
        C0TGH.LIZIZ(context, true, new C0TGI() { // from class: X.10bV
            @Override // X.C0TGI
            public final void onLoading() {
            }

            @Override // X.C0TGI
            public final void onFailed() {
                interfaceC19279210be.LIZ(false);
            }

            @Override // X.C0TGI
            public final void onSuccess() {
                C1379560m0I.LIZ.getClass();
                C0XQ7.LJFF().getCurUser().setAdAuthorization(true);
                interfaceC19279210be.LIZ(true);
            }
        }, false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BaseResponse setPushPrivateSettingItem(String str, int i) {
        return PushSettingsApiManager.LJIILL(i, str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final void setTheme(int i, String str) {
        ((SparseArray) C19278710bZ.LIZ.getValue()).append(i, str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, boolean z, Function1<? super Exception, Unit> function1) {
        Object obj;
        C19278910bb c19278910bb;
        try {
            Boolean boolValueOf = Boolean.valueOf(z);
            if (function1 != null) {
                c19278910bb = new C19278910bb(function1);
            } else {
                c19278910bb = null;
            }
            BatchUpdatePushSwitchesResp batchUpdatePushSwitchesRespLIZIZ = PushSettingsApiManager.LIZIZ(str, boolValueOf, c19278910bb);
            C19328310jZ.LIZIZ.LJI(batchUpdatePushSwitchesRespLIZIZ.updatedSwitches);
            C189200o6.m2constructorimpl(batchUpdatePushSwitchesRespLIZIZ);
            obj = batchUpdatePushSwitchesRespLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        BatchUpdatePushSwitchesResp batchUpdatePushSwitchesResp = (BatchUpdatePushSwitchesResp) obj2;
        if (batchUpdatePushSwitchesResp == null) {
            return new BatchUpdatePushSwitchesResp(null);
        }
        return batchUpdatePushSwitchesResp;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean startFeedbackRecordActivity(Activity activity, String str, Integer num) {
        String feRecord;
        C19279310bf.LIZ.getClass();
        try {
            feRecord = C0CLW.LIZIZ.LIZ.getFeedbackConf().getFeRecord();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            feRecord = "";
        }
        C686150Qvl c686150Qvl = new C686150Qvl(feRecord);
        c686150Qvl.LIZIZ("enter_from", str);
        if (num != null) {
            C19724912Fj.LIZLLL().LJIIIIZZ(num.intValue(), activity, c686150Qvl.LIZJ());
            return true;
        }
        C19724912Fj.LIZLLL().LJII(c686150Qvl.LIZJ());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final void switchLocale(String str, String str2, Context context) {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
        if (iUnKnownOwnershipBusinessOuterService != null) {
            iUnKnownOwnershipBusinessOuterService.LJIJJ(str, str2, context, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, int i, boolean z, String str2, Function1<? super Exception, Unit> function1) {
        C19278910bb c19278910bb;
        Object obj;
        if (function1 == null) {
            c19278910bb = null;
        } else {
            try {
                c19278910bb = new C19278910bb(function1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
        }
        BatchUpdatePushSwitchesResp batchUpdatePushSwitchesRespLIZ = PushSettingsApiManager.LIZ(str, i, z, str2, c19278910bb);
        C19328310jZ.LIZIZ.LJI(batchUpdatePushSwitchesRespLIZ.updatedSwitches);
        C189200o6.m2constructorimpl(batchUpdatePushSwitchesRespLIZ);
        obj = batchUpdatePushSwitchesRespLIZ;
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        BatchUpdatePushSwitchesResp batchUpdatePushSwitchesResp = (BatchUpdatePushSwitchesResp) obj2;
        if (batchUpdatePushSwitchesResp == null) {
            return new BatchUpdatePushSwitchesResp(null);
        }
        return batchUpdatePushSwitchesResp;
    }
}
