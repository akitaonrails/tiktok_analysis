package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C08PW;
import X.C08TN;
import X.C0TJN;
import X.C0WZX;
import X.C1194170hBH;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1444390ngr;
import X.C1481060oe0;
import X.C158B;
import X.C1701330uNH;
import X.C1813730xIZ;
import X.C1906580ziK;
import X.C19286910ct;
import X.C19287310cx;
import X.C19EG;
import X.C1AGV;
import X.C1AQR;
import X.C1AU7;
import X.C1AU9;
import X.C1AUB;
import X.C1AUC;
import X.C1AUD;
import X.C1AUE;
import X.C202094145s;
import X.C2179771ASp;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2222691Bz1;
import X.C2273401Dyc;
import X.C271060Ajo;
import X.C475030Ik1;
import X.C520010KaN;
import X.C783470UoL;
import X.C827040WcQ;
import X.C844470XAv;
import X.EnumC1813540xIG;
import X.InterfaceC19289210dG;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.InterfaceC665370Q7z;
import Y.AfS182S0100000_13;
import Y.AfS198S0100000_29;
import Y.AfS202S0100000_33;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PublishParams;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class LiveHostAppContext implements IHostAppContext {
    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getBoeLane() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getPpeLane() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isBoe() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isInBottomLiveTab() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLiveInhouse() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isOffline() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isPpe() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isRegressionTest() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int liveId() {
        return 12;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final Context context() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getAppBuildTime() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILJJIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getAppLanguage() {
        ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi(ISettingService.class);
        return iSettingService != null ? iSettingService.getAppLanguage() : "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getBuildNumber() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getChannel() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getSessionId() {
        C827040WcQ.LIZ.getClass();
        return C827040WcQ.LIZJ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getShortVersionCode() {
        int i;
        C844470XAv.LIZ.getClass();
        Long.valueOf(C844470XAv.LJ()).intValue();
        try {
            i = 0;
            for (String str : C844470XAv.LJFF().split("\\.")) {
                try {
                    i = CastIntegerProtector.parseInt(str) + (i * 100);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    return i;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
        return i;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getVersionCode() {
        C844470XAv.LIZ.getClass();
        return String.valueOf(C844470XAv.LJ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getVersionCodeInt() {
        C844470XAv.LIZ.getClass();
        return (int) C844470XAv.LJ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getVersionName() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJFF();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final Locale currentLocale() {
        Locale locale = Locale.getDefault();
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi == null || i18nServiceApi.LIZ() == null) {
            return locale;
        }
        I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJIJJLI(C844470XAv.LIZ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String currentRegionCode() {
        return C2222691Bz1.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long currentTimeMillis() {
        return C158B.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long getAppFeedEndTime() {
        return C08TN.LIZ().LJJLIIIJLJLI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long getPowerRate() {
        Context context = context();
        if (context == null) {
            BatteryManager batteryManager = C783470UoL.LIZ;
            return -1L;
        }
        if (C783470UoL.LIZ(context) != null) {
            return C2204961BRm.LLD(C783470UoL.LIZ(context), 4, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZejxryDkQp6L+zWPsvK", null));
        }
        return -1L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getServerDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int getUpdateVersionCode() {
        try {
            return C08PW.LIZ(context(), "UPDATE_VERSION_CODE");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final double getVolume() {
        return C2179771ASp.LJIIIIZZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isAppForeground() {
        return ActivityLifeObserver.getInstance().isForeground();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isInMusicallyRegion() {
        return !C2222691Bz1.LJIIIIZZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocalTest() {
        return TextUtils.equals(getChannel(), "local_test");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isOfflineOrIsRegressionTest() {
        return isRegressionTest() || isOffline();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final int appId() {
        return 1233;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String appName() {
        return "musical_ly";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final long getApplicationInitTime() {
        return C202094145s.LJII;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getIDCTypeUpperCase() {
        return C2273401Dyc.LIZLLL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final String getIapKey() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi15r9zfdlMuE3zfC3ZZEA4U0ursaCpeXTw024ezGLKOVz7E+hBgbAhsONpfZ9tTqzEm+nc48hSs0gvhbWxFd8wSelqqJQhpSaVFLwC8VKA/oPDL7MAwbGfnlaAADwer4EOZ29KJFRiWWxolOvw9Vpzfrca6JvxSe87Y2buZp+z9kFxlGfUpyPpTkqh/8IuvZnQRTVnlOtZ1aV0urNjHgwj760LlCGO6Mwta82YTIrHIFO7JKhT5aXcrnrb7WnlojKtM3mNZ6q157D2fGiv+Gsule/ullOmXLvSkW0bJXCoQRnE9HxzmRKNss4ekmX3Vr+jmEcw1esSJ6V6LtY4JAeQIDAQAB";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isAppBackground() {
        return C2214201BlK.LJIIJJI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isCoin() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isEnableLive() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isM2() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean hasPlayerHardDecodeSupport(boolean z) {
        return C1481060oe0.LIZJ(z);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocationPermissionGranted(Context context) {
        return C1207450hWh.LIZ.LJII(0, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final boolean isLocationServiceEnabled(Context context) {
        return C1194170hBH.LIZJ(context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void openQrScannerPage(Context context) {
        C19286910ct.LIZIZ.LIZJ(context, -1, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void postHighLightImage(C1AU7 c1au7) {
        ArrayList arrayList = new ArrayList();
        List<String> list = c1au7.LIZJ;
        if (list != null) {
            arrayList.addAll(list);
        }
        HashMap map = new HashMap();
        map.put("enter_from", c1au7.LIZ);
        map.put("enter_method", c1au7.LIZIZ);
        map.put("shoot_way", c1au7.LIZ);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = c1au7.LJFF;
        String str = "";
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < c1au7.LJFF.length(); i++) {
                try {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(c1au7.LJFF, i);
                    arrayList2.add(new C1444390ngr(0, jSONObject.optString("nickname", ""), jSONObject.optString("user_id", ""), ""));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (!TextUtils.isEmpty(c1au7.LJII)) {
            str = c1au7.LJII;
        }
        PostConfigModel postConfigModel = new PostConfigModel(str, null, new PublishParams(c1au7.LIZLLL, arrayList, arrayList2, c1au7.LJIIJ), Integer.valueOf(EnumC1813540xIG.PUBLIC.getValue()), map, "", c1au7.LJI, null, c1au7.LJIIIZ, c1au7.LJIIJJI, c1au7.LJ, 0, "", false, false);
        C19EG c19eg = c1au7.LJIIIIZZ;
        if (c19eg != null) {
            C1813730xIZ.LIZ(true, 1, postConfigModel, c19eg, new Function2<PostConfigModel, Boolean, Unit>() { // from class: X.1AU8
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(PostConfigModel postConfigModel2, Boolean bool) {
                    return null;
                }
            }, null, null, null, null);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final InterfaceC420801kM registerAppEnterForeBackgroundCallback(InterfaceC19562711gH interfaceC19562711gH) {
        return C2214201BlK.LJIIJ.LJJLIIJ().LJJLJLI(new AfS198S0100000_29(interfaceC19562711gH, 67));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerCrashCallback(final C1AQR c1aqr) {
        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.1AUA
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                C1AQR c1aqr2 = c1aqr;
                crashType.getName();
                c1aqr2.LIZ();
            }
        }, CrashType.ALL);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerLifeCycleCallback(C1AGV c1agv) {
        c1agv.LJIJ(C2214201BlK.LJIIJJI);
        C2214201BlK.LIZIZ.LJJLIIJ().LJJLJLI(new AfS182S0100000_13(c1agv, 120));
        C2214201BlK.LIZJ.LJJLIIJ().LJJLJLI(new AfS182S0100000_13(c1agv, 121));
        C2214201BlK.LIZIZ().LJJLJLI(new AfS182S0100000_13(c1agv, 116));
        C2214201BlK.LJ.LJJLIIJ().LJJLJLI(new AfS182S0100000_13(c1agv, 117));
        C2214201BlK.LIZJ().LJJLJLI(new AfS182S0100000_13(c1agv, 118));
        C2214201BlK.LIZ().LJJLJLI(new AfS182S0100000_13(c1agv, 119));
        C2214201BlK.LJIIJ.LJJLIIJ().LJJLJLI(new AfS202S0100000_33(c1agv, 21));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void registerPageEventCallback(C1AU9 c1au9) {
        c1au9.LJIJ(C1906580ziK.LJI());
        C1906580ziK.LIZJ().LJIIIZ().LJJLJLI(new AfS202S0100000_33(c1au9, 22));
        C1906580ziK.LIZJ().LJIILJJIL().LJJLJLI(new AfS202S0100000_33(c1au9, 23));
        C1906580ziK.LIZJ().LJIIJ().LJJLJLI(new AfS202S0100000_33(c1au9, 24));
        C1906580ziK.LIZJ().LIZIZ().LJJLJLI(new AfS202S0100000_33(c1au9, 25));
        C1906580ziK.LIZJ().LJI().LJJLJLI(new AfS202S0100000_33(c1au9, 26));
        C1906580ziK.LIZJ().LJII().LJJLJLI(new AfS202S0100000_33(c1au9, 27));
        C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS202S0100000_33(c1au9, 28));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void detectFragLeakOffline(Object obj) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final LifecycleOwner getLifecycleOwner(View view, C19EG c19eg) {
        LifecycleOwner lifecycleOwnerLJJII = C520010KaN.LJJII(view, true);
        if (lifecycleOwnerLJJII == null) {
            SAFHelper.LIZ.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(view, c19eg);
            if ((lifecycleOwnerLJIJI instanceof SAFHelper.SAFLifecycleCompatWrapper) && ((Number) C271060Ajo.LIZ.getValue()).intValue() == 0) {
                Object obj = ((SAFHelper.SAFLifecycleCompatWrapper) lifecycleOwnerLJIJI).LL;
                if (obj != null) {
                    return (Fragment) obj;
                }
                return null;
            }
            return lifecycleOwnerLJIJI;
        }
        return lifecycleOwnerLJJII;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final InterfaceC665370Q7z getScope(View view, C19EG c19eg) {
        SAFHelper.LIZ.getClass();
        return SAFHelper.LJJIJL(view, c19eg);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void startPhoneAsCameraActivity(Context context, Map<String, String> map) {
        Set<Map.Entry<String, String>> setEntrySet;
        String str = GameBroadcastAsCameraActivity._pnsPageId;
        Intent intent = new Intent(context, (Class<?>) GameBroadcastAsCameraActivity.class);
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (entry.getValue() != null) {
                    intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA+zPV5Mp2BodfZw3xO3llkFQzgwXxJK0Z30znjXY=", null));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void fetchLocation(String str, String str2, C1AUC c1auc, Long l) {
        C1207450hWh.LIZ.LJIIL(str, str2, TokenCert.Companion.with("bpea-config-live-nearby-gps_live_nearby_locate_android"), null, new C1AUB(c1auc), l);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void fetchLocationForHost(String str, String str2, C1AUC c1auc, Long l) {
        C1207450hWh.LIZ.LJIIL(str, str2, TokenCert.Companion.with("bpea-host_location_granted_locate_android"), null, new C1AUB(c1auc), l);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final C0TJN initGameScanner(Context context, SurfaceHolder surfaceHolder, InterfaceC19289210dG interfaceC19289210dG, String str) {
        return new C19287310cx(context, surfaceHolder, interfaceC19289210dG, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void requestLocationPermission(String str, String str2, C19EG c19eg, C475030Ik1 c475030Ik1, C1AUE c1aue) {
        C1207520hWo c1207520hWo;
        C1AUD c1aud;
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-config-live-nearby-gps_live_nearby_popup_android");
        if (c475030Ik1 == null) {
            c1207520hWo = null;
        } else {
            c1207520hWo = new C1207520hWo(c475030Ik1.LIZ, c475030Ik1.LIZIZ, null, null, false, false, null, null, null, 508);
        }
        if (c1aue == null) {
            c1aud = null;
        } else {
            c1aud = new C1AUD(c1aue);
        }
        c1207450hWh.LJIJJ(str, str2, tokenCertWith, c19eg, c1207520hWo, c1aud, null);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAppContext
    public final void requestLocationPermissionForHost(String str, String str2, C19EG c19eg, Fragment fragment, C475030Ik1 c475030Ik1, C1AUE c1aue) {
        C1207520hWo c1207520hWo;
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-host_location_granted_popup_android");
        C1AUD c1aud = null;
        if (c475030Ik1 == null) {
            c1207520hWo = null;
        } else {
            c1207520hWo = new C1207520hWo(c475030Ik1.LIZ, c475030Ik1.LIZIZ, null, null, false, false, null, null, null, 508);
        }
        if (c1aue != null) {
            c1aud = new C1AUD(c1aue);
        }
        c1207450hWh.getClass();
        C1207450hWh.LJJIFFI(str, str2, tokenCertWith, c19eg, fragment, c1207520hWo, c1aud);
    }
}
