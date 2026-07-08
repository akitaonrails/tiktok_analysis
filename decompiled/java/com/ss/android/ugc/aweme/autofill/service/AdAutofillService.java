package com.ss.android.ugc.aweme.autofill.service;

import X.AbstractC846040XGw;
import X.C013C;
import X.C08JS;
import X.C09JN;
import X.C0C64;
import X.C0WZX;
import X.C0XH0;
import X.C1007810cKh;
import X.C1035800d3q;
import X.C1067990dtl;
import X.C1068020dto;
import X.C1068170du3;
import X.C1068180du4;
import X.C1068190du5;
import X.C1068210du7;
import X.C1068510dub;
import X.C1068530dud;
import X.C1068560dug;
import X.C1068720duw;
import X.C1068770dv1;
import X.C1069020dvQ;
import X.C11S5;
import X.C123100dR;
import X.C1701940uOG;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C238400w2;
import X.C259800zU;
import X.C305310Bxx;
import X.C305320Bxy;
import X.C446980Hfs;
import X.C515801zg;
import X.C823050WQl;
import X.C846060XGy;
import X.EnumC1059300dfk;
import Y.ARunnableS103S0100000_3;
import Y.AfS0S1111000_16;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ad.experiment.AdAutofillJsConfigExp;
import com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService;
import com.ss.android.ugc.aweme.ad.network.CommonApi;
import com.ss.android.ugc.aweme.autofill.AdAutofillV2Model;
import com.ss.android.ugc.aweme.autofill.AutofillDetailInfo;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillApi;
import com.ss.android.ugc.aweme.autofill.api.PipoDomainQueryResponse;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S0400000_4;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillService implements IAdAutofillService {
    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final n LIZLLL() throws JSONException {
        JSONObject jSONObjectLJIILJJIL = LJIILJJIL();
        n nVar = new n();
        Iterator<String> itKeys = jSONObjectLJIILJJIL.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObjectLJIILJJIL.get(next);
            if (obj instanceof String) {
                nVar.LJJIIJ(next, (String) obj);
            } else if (obj instanceof Number) {
                nVar.LJJIII((Number) obj, next);
            } else if (obj instanceof Boolean) {
                nVar.LJJII((Boolean) obj, next);
            } else {
                nVar.LJJIIJ(next, obj.toString());
            }
        }
        return nVar;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJFF() {
        return C305310Bxx.LIZ() ? C1067990dtl.LJIIZILJ() : C305320Bxy.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJI() {
        return C1067990dtl.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJII() {
        String str = AdAutofillConfigSettings.LIZ().learnMoreLink;
        return !(str == null || str.length() == 0);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJIIJ() {
        return C1068020dto.LJIIJ() == null;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJIIJJI() {
        IUserService iUserService;
        User currentUser;
        return (!C305310Bxx.LIZ() || (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) == null || (currentUser = iUserService.getCurrentUser()) == null || currentUser.getUid() == null || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJIIL() {
        return C1067990dtl.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final String LJIILIIL() {
        return C1067990dtl.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final JSONObject LJIILJJIL() {
        if (C1068020dto.LJIIIIZZ() == null) {
            return new JSONObject();
        }
        String strLJIIIIZZ = C1068020dto.LJIIIIZZ();
        if (strLJIIIIZZ == null) {
            strLJIIIIZZ = "";
        }
        return new JSONObject(strLJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final String LJIJ() {
        AdAutofillModel adAutofillModelLJIIL = C1067990dtl.LJIIL();
        StringBuilder sb = new StringBuilder();
        if (C123100dR.LIZ(adAutofillModelLJIIL.firstName) && C123100dR.LIZ(adAutofillModelLJIIL.lastName)) {
            sb.append(adAutofillModelLJIIL.firstName);
            sb.append(" ");
            sb.append(adAutofillModelLJIIL.lastName);
        } else {
            sb.append(adAutofillModelLJIIL.firstName);
            sb.append(adAutofillModelLJIIL.lastName);
        }
        C1067990dtl c1067990dtl = C1067990dtl.LIZ;
        String str = adAutofillModelLJIIL.email;
        c1067990dtl.getClass();
        C1067990dtl.LJJIJIIJI(str, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.mobile, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.unit, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.address, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.city, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.state, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.zipCode, sb);
        C1067990dtl.LJJIJIIJI(adAutofillModelLJIIL.country, sb);
        String string = sb.toString();
        return string == null ? "" : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIL() {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autofill.service.AdAutofillService.LJIL():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean autofillEnable() {
        IUserService iUserService;
        User currentUser;
        return (!C305320Bxy.LIZ() || C305310Bxx.LIZ() || (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) == null || (currentUser = iUserService.getCurrentUser()) == null || currentUser.getUid() == null || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LIZIZ(AwemeRawAd awemeRawAd) {
        AutofillModel autofillModel;
        if (awemeRawAd == null || (autofillModel = awemeRawAd.getAutofillModel()) == null || !autofillModel.getEnable()) {
            return false;
        }
        if (C305310Bxx.LIZ()) {
            return C1067990dtl.LJIIZILJ();
        }
        return C305320Bxy.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIIIZ(String str) throws JSONException {
        C1067990dtl.LIZ.getClass();
        C1067990dtl.LJ(str);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIILL(AwS102S0400000_4 awS102S0400000_4) {
        User currentUser;
        String uid;
        User currentUser2;
        final String uid2;
        C1068720duw c1068720duw = C1068720duw.LIZ;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
            if (C1068720duw.LIZJ.get(uid) != null) {
                awS102S0400000_4.invoke(Boolean.valueOf(!r0.isEmpty()));
                return;
            }
            C1068720duw.LIZ.getClass();
            IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService2 != null && (currentUser2 = iUserService2.getCurrentUser()) != null && (uid2 = currentUser2.getUid()) != null) {
                if (!TextUtils.equals(uid2, C1068720duw.LJIIJJI)) {
                    C1068720duw.LJIIIIZZ = null;
                    C1068720duw.LJIIIZ = null;
                    C1068720duw.LJIIJJI = uid2;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                String string = Keva.getRepo("autofill_pipo_cert").getString(uid2, "");
                C1068720duw.LJIILIIL = string;
                if (C123100dR.LIZ(C1068720duw.LJIIIIZZ) && C123100dR.LIZ(string)) {
                    C1068720duw.LJIILIIL(uid2, string, new C1068170du3(atomicBoolean, awS102S0400000_4));
                    return;
                }
                final C1068180du4 c1068180du4 = new C1068180du4(atomicBoolean, awS102S0400000_4);
                ?? string2 = Keva.getRepo("autofill_pipo_cert").getString(uid2, "");
                C1068720duw.LJIILIIL = string2;
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = C1068720duw.LJIIIIZZ;
                final C259800zU c259800zU2 = new C259800zU();
                c259800zU2.element = C1068720duw.LJIIIZ;
                final C259800zU c259800zU3 = new C259800zU();
                c259800zU3.element = string2;
                CharSequence charSequence = (CharSequence) c259800zU.element;
                if (charSequence == null || charSequence.length() == 0) {
                    AdAutofillApi.LIZ.getClass();
                    C1068770dv1.LIZ().getPipoDomainQuery().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0827
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$1");
                            PipoDomainQueryResponse pipoDomainQueryResponse = (PipoDomainQueryResponse) obj;
                            Integer num = pipoDomainQueryResponse.statusCode;
                            if (num != null && num.intValue() == 0 && C123100dR.LIZ(pipoDomainQueryResponse.domain)) {
                                C259800zU<String> c259800zU4 = c259800zU;
                                c259800zU4.element = (T) pipoDomainQueryResponse.domain;
                                C259800zU<String> c259800zU5 = c259800zU2;
                                c259800zU5.element = (T) pipoDomainQueryResponse.merchantId;
                                C1068720duw.LIZLLL(uid2, atomicBoolean2, c1068180du4, c259800zU4, c259800zU3, c259800zU5);
                            } else if (atomicBoolean2.compareAndSet(false, true)) {
                                c1068180du4.invoke(Boolean.FALSE);
                            }
                            C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$1");
                        }
                    }, new C515801zg(atomicBoolean2, c1068180du4, 75));
                }
                CharSequence charSequence2 = (CharSequence) c259800zU3.element;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("x-ttnet-protocol-handler", "1");
                    linkedHashMap.put("x-ttnet-action-cert-act", "csr");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CN=");
                    sbLIZ.append(uid2);
                    sbLIZ.append('+');
                    sbLIZ.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
                    linkedHashMap.put("x-ttnet-action-cert-csr-info", C2188811AlT.LIZIZ(sbLIZ));
                    C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.089y
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v19 */
                        /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r0v41 */
                        /* JADX WARN: Type inference failed for: r1v7, types: [com.bytedance.keva.Keva] */
                        /* JADX WARN: Type inference failed for: r5v0 */
                        /* JADX WARN: Type inference failed for: r5v1 */
                        /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
                        /* JADX WARN: Type inference failed for: r5v4 */
                        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
                        /* JADX WARN: Type inference failed for: r5v6 */
                        /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
                        public final void LIZ() {
                            try {
                                C1068720duw.LIZ.getClass();
                                C0X52<String> c0x52Execute = C1068720duw.LJI().getCert("https://cert", linkedHashMap).execute();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                ?? r5 = 0;
                                for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                                    if (Intrinsics.LJFF(c080u.LIZ, "x-ttnet-action-cert-csr-data")) {
                                        linkedHashMap2.put("pipo-csr", c080u.LIZIZ);
                                    }
                                    if (Intrinsics.LJFF(c080u.LIZ, "x-ttnet-cert-id")) {
                                        r5 = c080u.LIZIZ;
                                    }
                                }
                                C1068720duw.LIZ.getClass();
                                AdAutofillApi adAutofillApiLJI = C1068720duw.LJI();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(C0CQT.LIZJ);
                                sbLIZ2.append("/aweme/v1/ad/pipo/client/certificate/query/");
                                C0X52<String> c0x52Execute2 = adAutofillApiLJI.getCert(C2188811AlT.LIZIZ(sbLIZ2), linkedHashMap2).execute();
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.put("x-ttnet-protocol-handler", "1");
                                linkedHashMap3.put("x-ttnet-action-cert-act", "add");
                                linkedHashMap3.put("x-ttnet-cert-id", r5 == 0 ? "" : r5);
                                linkedHashMap3.put("x-ttnet-action-cert-add", new JSONObject(c0x52Execute2.LIZIZ).optString("client_certificate", ""));
                                for (C080U c080u2 : C1068720duw.LJI().getCert("https://cert", linkedHashMap3).execute().LIZ.LIZLLL) {
                                    if (Intrinsics.LJFF(c080u2.LIZ, "x-ttnet-cert-id")) {
                                        r5 = c080u2.LIZIZ;
                                    }
                                }
                                if (r5 == 0 || r5.length() == 0) {
                                    if (atomicBoolean2.compareAndSet(false, true)) {
                                        c1068180du4.invoke(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                c259800zU3.element = r5;
                                C1068720duw.LJIILIIL = r5;
                                Keva.getRepo("autofill_pipo_cert").storeString(uid2, r5);
                                BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                                final AtomicBoolean atomicBoolean3 = atomicBoolean2;
                                final C259800zU<String> c259800zU4 = c259800zU;
                                final C259800zU<String> c259800zU5 = c259800zU3;
                                final C259800zU<String> c259800zU6 = c259800zU2;
                                final String str = uid2;
                                final Function1<Boolean, Unit> function1 = c1068180du4;
                                C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.07xJ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$3$3");
                                        try {
                                            C1068720duw.LIZLLL(str, atomicBoolean3, function1, c259800zU4, c259800zU5, c259800zU6);
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$3$3");
                                    }
                                });
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (atomicBoolean2.compareAndSet(false, true)) {
                                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(c1068180du4, 175));
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$3");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$3");
                        }
                    });
                }
                C1068720duw.LIZLLL(uid2, atomicBoolean2, c1068180du4, c259800zU, c259800zU3, c259800zU2);
                return;
            }
            awS102S0400000_4.invoke(Boolean.FALSE);
            return;
        }
        awS102S0400000_4.invoke(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIILLIIL(final int i) {
        ICommerceGeckoPreloadService iCommerceGeckoPreloadService;
        boolean zLJI = MethodIDManager.LJI(137811);
        if (((AdAutofillJsConfigExp.AdAutofillJsConfig) AdAutofillJsConfigExp.LIZIZ.getValue()).useJsPlatform) {
            C1067990dtl.LIZ.getClass();
            if (C1067990dtl.LJII(i, null, true) && (iCommerceGeckoPreloadService = (ICommerceGeckoPreloadService) PluggableExtentionKt.pluggableSpi$default(ICommerceGeckoPreloadService.class, false, false, false, 14, null)) != null) {
                iCommerceGeckoPreloadService.LIZIZ();
            }
        } else {
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0dCK
                public final void LIZ() {
                    String str;
                    CommonApi commonApi;
                    C0X9S<String> c0x9sDoGet;
                    C0X52<String> c0x52Execute;
                    String str2;
                    C1067990dtl c1067990dtl = C1067990dtl.LIZ;
                    int i2 = i;
                    c1067990dtl.getClass();
                    if (C1067990dtl.LJII(i2, null, true) && !C1067990dtl.LIZIZ) {
                        String str3 = AdAutofillConfigSettings.LIZ().javascriptCDN;
                        SettingsManager.LIZLLL().getClass();
                        String str4 = "";
                        if (!SettingsManager.LIZ("ad_autofill_js_cdn_fetch", false) && C703302op.LIZ(KevaImpl.getRepo("autofill_info", 1).getString("autofill_v2_js", "")) && Intrinsics.LJFF(str3, KevaImpl.getRepo("autofill_info", 1).getString("autofill_v2_js_url", ""))) {
                            C1067990dtl.LIZIZ = true;
                            return;
                        }
                        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
                        if (iRetrofitFactory != null) {
                            C988570bpf.LIZ.getClass();
                            if (C1041070dCL.LIZ() == null || (str = C0CQT.LIZJ) == null) {
                                str = "";
                            }
                            C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str);
                            if (c1499850p8JCreateBuilder != null && (commonApi = (CommonApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(CommonApi.class)) != null && (c0x9sDoGet = commonApi.doGet(str3)) != null && (c0x52Execute = c0x9sDoGet.execute()) != null && (str2 = c0x52Execute.LIZIZ) != null) {
                                str4 = str2;
                            }
                        }
                        KevaImpl.getRepo("autofill_info", 1).storeString("autofill_v2_js", str4);
                        KevaImpl.getRepo("autofill_info", 1).storeString("autofill_v2_js_url", str3);
                        C1067990dtl.LIZIZ = true;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AdAutofillManagerV2@4585.fetchAutofillJS$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AdAutofillManagerV2@4585.fetchAutofillJS$1");
                }
            });
        }
        if (!C1035800d3q.LIZ()) {
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0dCJ
                public static void LIZ() {
                    CommonApi commonApi;
                    C0X9S<String> c0x9sDoGet;
                    C0X52<String> c0x52Execute;
                    String str;
                    C1068020dto.LIZ.getClass();
                    if (C1068020dto.LIZJ(true) && !C1068020dto.LJIIIIZZ) {
                        String str2 = AdAutofillConfigSettings.LIZ().javascriptCDN;
                        String str3 = "";
                        if (C703302op.LIZ(Keva.getRepo("autofill_info").getString("autofill_js", "")) && Intrinsics.LJFF(str2, Keva.getRepo("autofill_info").getString("autofill_js_url", ""))) {
                            C1068020dto.LJIIIIZZ = true;
                            return;
                        }
                        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
                        if (iRetrofitFactory != null) {
                            C988570bpf.LIZ.getClass();
                            C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C1041070dCL.LIZ() != null ? C0CQT.LIZJ : null);
                            if (c1499850p8JCreateBuilder != null && (commonApi = (CommonApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(CommonApi.class)) != null && (c0x9sDoGet = commonApi.doGet(str2)) != null && (c0x52Execute = c0x9sDoGet.execute()) != null && (str = c0x52Execute.LIZIZ) != null) {
                                str3 = str;
                            }
                        }
                        Keva.getRepo("autofill_info").storeString("autofill_js", str3);
                        Keva.getRepo("autofill_info").storeString("autofill_js_url", str2);
                        C1068020dto.LJIIIIZZ = true;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AdAutofillManager@b3e5.fetchAutofillJS$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AdAutofillManager@b3e5.fetchAutofillJS$1");
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIJI(EnumC1059300dfk enumC1059300dfk) {
        User currentUser;
        final String uid;
        if (!C305310Bxx.LIZ() && enumC1059300dfk != EnumC1059300dfk.TTOP) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
                return;
            }
            C1068020dto.LIZ.getClass();
            if (Intrinsics.LJFF(C1068020dto.LIZIZ.get(uid), Boolean.TRUE)) {
                return;
            }
            ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/identity/get_fields/", C2097908Jt.LIZJ(new Pair("fields", "[3]")), new AbstractC846040XGw<C846060XGy>() { // from class: X.0duA
                @Override // X.AbstractC846040XGw
                public final void LIZ(C0XGA c0xga) {
                    boolean z;
                    String string;
                    String str;
                    JSONObject jSONObject;
                    JSONObject jSONObjectOptJSONObject;
                    JSONArray jSONArrayNames;
                    String strJ3;
                    C846060XGy c846060XGy = (C846060XGy) c0xga;
                    if (c846060XGy != null && c846060XGy.LIZIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C1068020dto.LIZ.getClass();
                        C1068020dto.LIZIZ.put(uid, Boolean.TRUE);
                        JSONObject jSONObject2 = c846060XGy.LJIILJJIL;
                        if (jSONObject2 != null) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("3");
                            if (jSONObjectOptJSONObject2 != null) {
                                strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject2);
                            } else {
                                strJ3 = null;
                            }
                            C1068020dto.LJIILL(strJ3);
                            C786410Ut5.J3(jSONObject2);
                        }
                    }
                    HashMap map = new HashMap();
                    String str2 = "";
                    if (c846060XGy == null || (jSONObject = c846060XGy.LJIILJJIL) == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("3")) == null || (jSONArrayNames = jSONObjectOptJSONObject.names()) == null || (string = jSONArrayNames.toString()) == null) {
                        string = "";
                    }
                    map.put("autofill_fields", string);
                    if (c846060XGy != null && c846060XGy.LIZIZ) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    map.put("is_success", str);
                    map.put("scenario", "2");
                    if (c846060XGy != null) {
                        if (c846060XGy.LIZIZ) {
                            str2 = "-1";
                        } else {
                            String string2 = Integer.valueOf(c846060XGy.LIZLLL).toString();
                            if (string2 != null) {
                                str2 = string2;
                            }
                        }
                    }
                    map.put("error_code", str2);
                    C20684815ws.LJIILLIIL("autofill_info_acquire", map);
                }
            });
            return;
        }
        C1067990dtl.LJIIJJI(true, null, true, enumC1059300dfk, null, null);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LIZ(Context context, String str) throws JSONException {
        if (C305310Bxx.LIZ()) {
            C1067990dtl.LJJIIZ(context, str, "contact_info", Boolean.FALSE);
        } else {
            C1068020dto.LJIILIIL(context, true, null, null, null, null, null, null, str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIIZILJ(Context context, AwemeRawAd awemeRawAd) throws Throwable {
        boolean zIsAutofillSupported;
        long j;
        ComponentName autofillServiceComponentName;
        if (context == null || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ad_log_system_autofill", true, false)) {
            return;
        }
        if (!C1068530dud.LIZ) {
            C1068530dud.LIZ = true;
            C013C c013c = new C013C();
            C259800zU c259800zU = new C259800zU();
            C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = -1L;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                try {
                    AutofillManager autofillManager = (AutofillManager) C446980Hfs.LIZIZ(context, AutofillManager.class);
                    if (autofillManager != null) {
                        zIsAutofillSupported = autofillManager.isAutofillSupported();
                    } else {
                        zIsAutofillSupported = false;
                    }
                    c013c.element = zIsAutofillSupported;
                    if (i >= 28) {
                        ?? LJJIJIL = 0;
                        LJJIJIL = 0;
                        if (autofillManager != null && (autofillServiceComponentName = autofillManager.getAutofillServiceComponentName()) != null) {
                            LJJIJIL = C2204961BRm.LJJIJIL(autofillServiceComponentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu9d5DI1T5lB/9QkhMZVHpffXYBdr8OrQ+VuDmU2bYPpDSYYv8/wA==", null));
                        }
                        c259800zU.element = LJJIJIL;
                        if (C123100dR.LIZ(LJJIJIL)) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        c238400w2.element = j;
                    }
                    if (autofillManager != null) {
                        autofillManager.registerCallback(new AutofillManager.AutofillCallback() { // from class: X.0duG
                            @Override // android.view.autofill.AutofillManager.AutofillCallback
                            public final void onAutofillEvent(View view, int i2) {
                                super.onAutofillEvent(view, i2);
                            }

                            @Override // android.view.autofill.AutofillManager.AutofillCallback
                            public final void onAutofillEvent(View view, int i2, int i3) {
                                super.onAutofillEvent(view, i2, i3);
                                if (i3 == 1) {
                                    C1068530dud.LIZIZ = 1;
                                    C1068530dud.LIZ(C1068530dud.LIZJ);
                                } else {
                                    if (i3 != 2) {
                                        return;
                                    }
                                    C1068530dud.LIZIZ = 0;
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            new C1068510dub(new Object[0]).logAd(C1069020dvQ.LIZ, awemeRawAd, new AwS225S0300000_16(c013c, (C013C) c238400w2, (C238400w2) c259800zU, (C259800zU<String>) 8));
        }
        C1068530dud.LIZIZ = 0;
        C1068530dud.LIZJ = awemeRawAd;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIJJ(int i, AwemeRawAd awemeRawAd) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ad_log_system_autofill", true, false)) {
            new C1068510dub(C1068530dud.LJI).logAd(C1068560dug.LIZ, awemeRawAd, new AwS30S0001000_16(i, 11));
            C1068530dud.LJI = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LIZJ(Context context, String str, String str2) {
        C1007810cKh c1007810cKh;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        smartRouteBuildRoute.withParam(UriProtector.parse(str2));
        smartRouteBuildRoute.open();
        C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
        if (C305310Bxx.LIZ()) {
            C1068210du7.LIZ.getClass();
            c1007810cKh = C1068210du7.LJI;
        } else {
            C1068210du7.LIZ.getClass();
            c1007810cKh = C1068210du7.LJII;
        }
        c1068190du5.log(c1007810cKh, new AwS67S1000000_16(str, 9));
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJ(Context context, String str, boolean z) throws JSONException {
        C1067990dtl.LJJIIZ(context, str, "payment_info", Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIJJLI(int i, String str, Function1 function1, boolean z) {
        HashMap map = new HashMap();
        n nVar = new n();
        AdAutofillV2Model adAutofillV2Model = new AdAutofillV2Model();
        AutofillDetailInfo autofillDetailInfo = new AutofillDetailInfo();
        autofillDetailInfo.setSource(3);
        nVar.LJJIII(3, "source");
        if (i != 0) {
            if (i == 1) {
                autofillDetailInfo.setPaymentInfoEnabled(z);
                nVar.LJJII(Boolean.valueOf(z), "is_payment_info_enabled");
            }
        } else {
            autofillDetailInfo.setContactInfoEnabled(z);
            nVar.LJJII(Boolean.valueOf(z), "is_contact_info_enabled");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(autofillDetailInfo);
        adAutofillV2Model.setFields(arrayList);
        map.put("fields", C08JS.LIZLLL(adAutofillV2Model.getFields()));
        AdAutofillApi.LIZ.getClass();
        AdAutofillApi adAutofillApiLIZ = C1068770dv1.LIZ();
        n nVar2 = new n();
        h hVar = new h();
        hVar.LJJIFFI(nVar);
        nVar2.LJJIFFI("fields", hVar);
        adAutofillApiLIZ.set(nVar2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1111000_16(i, str, function1, z, 0), new AfS0S1111000_16(i, str, function1, z, 1));
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJIIIIZZ(View view, EnumC1059300dfk enumC1059300dfk, Integer num, Integer num2, JSONObject jSONObject, boolean z, boolean z2, AwS591S0100000_12 awS591S0100000_12) throws JSONException {
        if (!C305310Bxx.LIZ() && enumC1059300dfk != EnumC1059300dfk.TTOP) {
            C1068020dto.LJIILLIIL(view, jSONObject, z, false, z2, awS591S0100000_12);
        } else {
            C1067990dtl.LJJIL(view, enumC1059300dfk, num, num2, jSONObject, null, false, z, false, z2, awS591S0100000_12);
        }
    }
}
