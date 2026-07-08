package com.tiktok.ef.absettings.impl;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C08QB;
import X.C08QT;
import X.C09RB;
import X.C0BV1;
import X.C0C5P;
import X.C0C5V;
import X.C0C7W;
import X.C0CFL;
import X.C0CJ2;
import X.C0CJ4;
import X.C0CJ5;
import X.C0CJS;
import X.C0COZ;
import X.C0T92;
import X.C0TKA;
import X.C0TKF;
import X.C0VSJ;
import X.C0X52;
import X.C0XB4;
import X.C1319780kRs;
import X.C13EQ;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C15438062q;
import X.C1AF0;
import X.C2084808Es;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C292560BdO;
import X.C296770BkB;
import X.C296780BkC;
import X.C307900C5c;
import X.C311520CJa;
import X.C311600CJi;
import X.C311710CJt;
import X.C311740CJw;
import X.C318400Cdy;
import X.C452501pT;
import X.C7740030o;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC311620CJk;
import X.InterfaceC1112904Wx;
import X.InterfaceC2210981Bg8;
import X.InterfaceC2661011f;
import X.InterfaceC800130Va7;
import Y.ARunnableS37S0300000_4;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.otis.memory.OtisGson;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.absettings.api.IABSettingFetcherConfig;
import com.tiktok.ef.absettings.api.IABSettingsApi;
import com.tiktok.ef.absettings.api.IInitAbSettingsDepend;
import com.tiktok.ef.absettings.impl.api.ABTestRequestBody;
import com.tiktok.ef.absettings.impl.api.SettingApi;
import com.tiktok.ef.absettings.impl.storage.CommonHashCheck;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ABSettingsImpl implements IABSettingsApi {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public InterfaceC2210981Bg8 LIZJ = new InterfaceC2210981Bg8() { // from class: X.0CJr
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            if (this.LL.LIZIZ) {
                return;
            }
            IABSettingFetcherConfig iABSettingFetcherConfigLJI = this.LL.LJI();
            if (iABSettingFetcherConfigLJI != null) {
                iABSettingFetcherConfigLJI.onRetryFetching();
            }
            this.LL.LIZJ = null;
        }
    };
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2319));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 415));

    public final IInitAbSettingsDepend LJFF() {
        return (IInitAbSettingsDepend) this.LIZLLL.getValue();
    }

    public final IABSettingFetcherConfig LJI() {
        return (IABSettingFetcherConfig) this.LJ.getValue();
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final void LIZ(Application application) {
        C0C5P.LIZJ().LIZLLL(application, LJFF().LIZLLL(), LJFF().LJFF());
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final void LIZLLL(Application application) {
        int i;
        boolean z;
        C0C5P.LIZJ().LJ(application, LJFF().LIZ());
        String host = LJFF().getHost();
        int length = host.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(host.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        String string = host.subSequence(i2, length + 1).toString();
        C0TKF c0tkfLIZIZ = LJFF().LJ().LIZIZ();
        InterfaceC1112904Wx interfaceC1112904Wx = new InterfaceC1112904Wx() { // from class: X.04qf
            public final Gson LIZ = C7740030o.LIZ().getGson();

            @Override // X.InterfaceC1112904Wx
            public final <T> T parseObject(String str, Type type) {
                return (T) GsonProtectorUtils.fromJson(this.LIZ, str, type);
            }
        };
        final Function1<String, Unit> function1LIZ = LJFF().LJ().LIZ();
        C0TKA.LIZLLL(application, new C0T92() { // from class: X.0CJv
            @Override // X.C0T92
            public final /* synthetic */ void LIZ(String str) {
                function1LIZ.invoke(str);
            }
        }, new C0COZ() { // from class: X.04zk
            @Override // X.C0COZ
            public final String request() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 0);
                    jSONObject.put("message", "");
                    jSONObject.put("data", new JSONObject());
                    return C786410Ut5.J3(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        }, interfaceC1112904Wx, c0tkfLIZIZ, string);
    }

    public static void LJII(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getPath());
        sbLIZ.append('/');
        sbLIZ.append(C2084808Es.LIZ("cdn_file"));
        sbLIZ.append('/');
        sbLIZ.append(C2084808Es.LIZ(str));
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(C08QB.LJIILIIL(c0vsj), AFwS232S0000000_4.get$arr$(156)));
            while (c08qt.hasNext()) {
                File file = (File) c08qt.next();
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        Set setLIZ = C0CJ2.LIZ();
        setLIZ.remove(str);
        C0CJ2.LJFF(setLIZ);
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final AbstractC19483511Kn<C0X52<k>> LIZIZ(Context context, String str) {
        InterfaceC2661011f interfaceC2661011fLIZ;
        SettingApi settingApi;
        String strLJJJ;
        String host = LJFF().getHost();
        String str2 = LJI().getPlatformInfo().LIZ;
        long j = LJI().getPlatformInfo().LIZIZ;
        String str3 = LJI().getPlatformInfo().LIZJ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(host)) == null || (settingApi = (SettingApi) interfaceC2661011fLIZ.create(SettingApi.class)) == null) {
            return null;
        }
        boolean zLJ = C0CJ2.LJ();
        if (zLJ && !this.LIZ && !this.LIZIZ) {
            this.LIZ = true;
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(this.LIZJ);
        }
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (zLJ && (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0 || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId))) {
            return null;
        }
        this.LIZIZ = true;
        C0CJ2.LIZLLL().storeBoolean("is_fetch_launch", false);
        int iLIZ = C1319780kRs.LIZ(context);
        C292560BdO.LJ();
        String[] strArrLJII = C292560BdO.LJII();
        int iLIZ2 = C311710CJt.LIZ();
        if (iLIZ2 <= 0) {
            strLJJJ = "";
        } else if (strArrLJII.length > iLIZ2) {
            strLJJJ = C13LP.LJJLIIIJ(C13LQ.LJJL(strArrLJII, C13LZ.LJIILJJIL(0, iLIZ2)), ",", null, null, 0, null, null, 62);
        } else {
            strLJJJ = C13LQ.LJJJ(strArrLJII, ",", null, null, null, 62);
        }
        String extendFetchingRequestString = LJI().getExtendFetchingRequestString();
        C311520CJa c311520CJa = C311520CJa.LIZ;
        c311520CJa.getClass();
        long j2 = 21;
        long j3 = 5;
        if (C311520CJa.LJII()) {
            c311520CJa.getClass();
            Pair pairLJFF = C311520CJa.LJFF(0);
            String strLIZ = C0XB4.LIZ(context);
            if (!C296780BkC.LIZ()) {
                j2 = 5;
            }
            return settingApi.queryABTestCommonByGroup(str2, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, j, 1, str3, iLIZ, str, strLIZ, extendFetchingRequestString, 32 | j2, strLJJJ, new ABTestRequestBody(((Number) pairLJFF.getFirst()).intValue(), (List) pairLJFF.getSecond()), 10485760);
        }
        String strLIZ2 = C0XB4.LIZ(context);
        if (C296780BkC.LIZ()) {
            j3 = 21;
        }
        return settingApi.queryABTestCommon(str2, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, j, 1, str3, iLIZ, str, strLIZ2, extendFetchingRequestString, j3, strLJJJ, 10485760);
    }

    public static Map LJIIIIZZ(n nVar, n nVar2, n nVar3, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJ());
        for (Map.Entry<String, k> entry : nVar3.entrySet()) {
            try {
                n nVarLJIILIIL = entry.getValue().LJIILIIL();
                q qVarLJJIJIIJI = nVarLJIILIIL.LJJIJIIJI("type");
                if (z) {
                    q qVarLJJIJIIJI2 = nVarLJIILIIL.LJJIJIIJI("group");
                    if (qVarLJJIJIIJI2 != null && (qVarLJJIJIIJI2.LL instanceof Number)) {
                        C0CJS c0cjs = (C0CJS) linkedHashMap.get(Integer.valueOf(qVarLJJIJIIJI2.LJIIJJI()));
                        if (c0cjs == null) {
                            c0cjs = new C0CJS();
                            c0cjs.LIZ = qVarLJJIJIIJI2.LJIIJJI();
                            c0cjs.LIZJ = new LinkedHashSet();
                            linkedHashMap.put(Integer.valueOf(qVarLJJIJIIJI2.LJIIJJI()), c0cjs);
                        }
                        c0cjs.LIZJ.add(entry.getKey());
                    } else {
                        C0CJS c0cjs2 = (C0CJS) linkedHashMap.get(Integer.MAX_VALUE);
                        if (c0cjs2 == null) {
                            c0cjs2 = new C0CJS();
                            c0cjs2.LIZJ = new LinkedHashSet();
                            linkedHashMap.put(Integer.MAX_VALUE, c0cjs2);
                        }
                        c0cjs2.LIZJ.add(entry.getKey());
                    }
                } else if (qVarLJJIJIIJI != null && (qVarLJJIJIIJI.LL instanceof Number) && qVarLJJIJIIJI.LJIIJJI() == 21) {
                    nVar.LJJIFFI(entry.getKey(), nVarLJIILIIL.LJJIJIIJI("vid"));
                } else {
                    nVar2.LJJIFFI(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th);
                sbLIZ.append("  ,cdn config key: ");
                sbLIZ.append(entry);
                sbLIZ.append(".key");
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return linkedHashMap;
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final boolean LIZJ(Context context, n nVar, C311600CJi c311600CJi, IABSettingsApi.FetchCallback fetchCallback) throws JSONException {
        String[] strArr;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        Set linkedHashSet;
        n nVar2;
        String strLJIL;
        List listLJJLIIIJILLIZJL;
        n nVar3 = new n();
        n nVar4 = new n();
        n nVarLJJIJ = nVar.LJJIJ("data");
        if (nVarLJJIJ == null) {
            return false;
        }
        try {
            q qVarLJJIJIIJI = nVar.LJJIJIIJI("expired_vids");
            if (qVarLJJIJIIJI != null && (strLJIL = qVarLJJIJIIJI.LJIL()) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIL, new String[]{","}, 0, 6)) != null) {
                strArr = (String[]) listLJJLIIIJILLIZJL.toArray(new String[0]);
            } else {
                strArr = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (c311600CJi != null) {
                c311600CJi.LJFF(String.valueOf(e.getMessage()));
            }
            strArr = null;
        }
        q qVarLJJIJIIJI2 = nVar.LJJIJIIJI("group_num");
        if (qVarLJJIJIIJI2 != null) {
            numValueOf = Integer.valueOf(qVarLJJIJIIJI2.LJIIJJI());
        } else {
            numValueOf = null;
        }
        q qVarLJJIJIIJI3 = nVar.LJJIJIIJI("key_set_hash");
        if (qVarLJJIJIIJI3 != null) {
            numValueOf2 = Integer.valueOf(qVarLJJIJIIJI3.LJIIJJI());
        } else {
            numValueOf2 = null;
        }
        C311520CJa.LIZ.getClass();
        if (C311520CJa.LJII() && numValueOf != null && numValueOf2 != null) {
            Map mapLJIIIIZZ = LJIIIIZZ(nVar3, nVar4, nVarLJJIJ, true);
            n nVarLJJIJ2 = nVar.LJJIJ("value_group_hash");
            if (nVarLJJIJ2 == null) {
                nVarLJJIJ2 = new n();
            }
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJIIIIZZ;
            C0CJS c0cjs = (C0CJS) linkedHashMap.get(Integer.MAX_VALUE);
            if (c0cjs == null || (linkedHashSet = c0cjs.LIZJ) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            int i = 0;
            int size = 0;
            for (Map.Entry<String, k> entry : nVarLJJIJ2.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(key);
                if (numLJIIJJI != null) {
                    int iIntValue = numLJIIJJI.intValue();
                    String strLJIL2 = value.LJIL();
                    if (strLJIL2 != null) {
                        C0CJS c0cjs2 = new C0CJS();
                        c0cjs2.LIZ = iIntValue;
                        c0cjs2.LIZIZ = strLJIL2;
                        C0CJS c0cjs3 = (C0CJS) linkedHashMap.get(Integer.valueOf(iIntValue));
                        if (c0cjs3 != null) {
                            c0cjs2.LIZJ.addAll(c0cjs3.LIZJ);
                            size += c0cjs3.LIZJ.size();
                        }
                        i++;
                        arrayList.add(c0cjs2);
                    }
                }
            }
            if (c311600CJi != null) {
                c311600CJi.LJIILJJIL = size;
                c311600CJi.LJIIIIZZ = i;
            }
            C311520CJa c311520CJa = C311520CJa.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C0CJS) it2.next()).LIZ));
            }
            c311520CJa.getClass();
            Set<String> setLJ = C311520CJa.LJ(arrayList2);
            C311520CJa.LIZ.getClass();
            setLJ.addAll(C311520CJa.LJI());
            String string = C0CJ2.LIZJ().getString("fetch_config_by_group_original_json", null);
            if (string == null || (nVar2 = (n) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, n.class)) == null) {
                nVar2 = new n();
            }
            if (!setLJ.isEmpty()) {
                for (String str : setLJ) {
                    k kVarLJJIIZ = nVarLJJIJ.LJJIIZ(str);
                    if (kVarLJJIIZ != null) {
                        nVar2.LJJIFFI(str, kVarLJJIIZ);
                    } else {
                        nVar2.LJJIJL(str);
                    }
                }
                for (String str2 : nVarLJJIJ.LJJIJIL()) {
                    if (!setLJ.contains(str2)) {
                        nVar2.LJJIFFI(str2, nVarLJJIJ.LJJIIZ(str2));
                    }
                }
                nVarLJJIJ = nVar2;
            }
            Set<String> setLJJIJIL = nVarLJJIJ.LJJIJIL();
            if (c311600CJi != null) {
                c311600CJi.LIZ();
                c311600CJi.LJIILLIIL = setLJJIJIL.size();
            }
            if (C0BV1.LIZ()) {
                if (C296770BkB.LIZ() == 0) {
                    int iLIZIZ = C318400Cdy.LIZIZ(C318400Cdy.LIZ(C13LP.LJJLIIIJ(C13EQ.LJJIJLIJ(setLJJIJIL), ",", null, null, 0, null, null, 62)));
                    if (numValueOf2 == null || iLIZIZ != numValueOf2.intValue()) {
                        C311520CJa c311520CJa2 = C311520CJa.LIZ;
                        c311520CJa2.getClass();
                        C311520CJa.LIZIZ();
                        c311520CJa2.LIZJ();
                        C0CJ2.LJI("{}");
                        if (c311600CJi != null) {
                            c311600CJi.LJ(1);
                            c311600CJi.LJI(EnumC311620CJk.HASH_CHECK_FAILED);
                            c311600CJi.LIZJ();
                        }
                        return false;
                    }
                } else {
                    C799900VZk.LIZ.getClass();
                    new C799890VZj().LIZ(new CommonHashCheck(new ARunnableS37S0300000_4(setLJJIJIL, numValueOf2, c311600CJi, 12)));
                }
            }
            if (c311600CJi != null) {
                c311600CJi.LJIIIIZZ();
            }
            try {
                try {
                    C0CJ2.LJI(new OtisGson().LIZIZ(nVarLJJIJ, true, 5242880));
                    LJIIIIZZ(nVar3, nVar4, nVarLJJIJ, false);
                    C311520CJa c311520CJa3 = C311520CJa.LIZ;
                    C0CFL c0cfl = C0CFL.FINISH;
                    C0C7W c0c7w = C0C7W.GET_ALL_UPDATE;
                    C311740CJw c311740CJw = new C311740CJw(fetchCallback);
                    c311520CJa3.getClass();
                    z = true;
                    try {
                        C311520CJa.LJIIJ(nVar4, arrayList, strArr, linkedHashSet, c0cfl, c0c7w, 0, c311740CJw);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
                try {
                    LJ(context, nVar, nVar3, setLJ);
                    fetchCallback.onAfterSaveToDB(nVar4, nVar3);
                    if (c311600CJi != null) {
                        c311600CJi.LIZIZ(0);
                        c311600CJi.LJI(EnumC311620CJk.SUCCESS);
                        c311600CJi.LIZJ();
                        return true;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                    if (c311600CJi != null) {
                        c311600CJi.LIZIZ(2);
                        c311600CJi.LJFF(th.toString());
                        c311600CJi.LJI(EnumC311620CJk.DATA_STORE_FAILED);
                        c311600CJi.LIZJ();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z = true;
            }
        } else {
            z = true;
            if (c311600CJi != null) {
                int size2 = nVarLJJIJ.LJJIJIL().size();
                c311600CJi.LIZ();
                c311600CJi.LJI = 0;
                c311600CJi.LJIILJJIL = size2;
                c311600CJi.LJIILLIIL = size2;
                c311600CJi.LJIIIIZZ();
            }
            try {
                LJIIIIZZ(nVar3, nVar4, nVarLJJIJ, false);
                C307900C5c c307900C5c = new C307900C5c();
                c307900C5c.LIZIZ = nVar4;
                c307900C5c.LIZJ = nVar4;
                c307900C5c.LIZLLL = nVar4;
                c307900C5c.LJ = strArr;
                C0C5V c0c5v = new C0C5V(c307900C5c);
                fetchCallback.onBeforeSaveToDB();
                C0C5P.LIZJ().LJIILIIL(c0c5v);
                LJ(context, nVar, nVar3, null);
                fetchCallback.onAfterSaveToDB(nVar4, nVar3);
                if (c311600CJi != null) {
                    c311600CJi.LIZIZ(0);
                    c311600CJi.LJI(EnumC311620CJk.SUCCESS);
                    c311600CJi.LIZJ();
                    return true;
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                if (c311600CJi != null) {
                    c311600CJi.LIZIZ(2);
                    c311600CJi.LJFF(th5.toString());
                    c311600CJi.LJI(EnumC311620CJk.DATA_STORE_FAILED);
                    c311600CJi.LIZJ();
                    return true;
                }
            }
        }
        return z;
    }

    public final void LJ(Context context, n nVar, final n nVar2, final Set<String> set) {
        InterfaceC800130Va7 interfaceC800130Va7CreateABCDNConfigFetcher;
        try {
            if (C296780BkC.LIZ()) {
                if (!nVar.LJJIJIIJIL("__CDN_URL__")) {
                    Iterator it2 = C0CJ2.LIZ().iterator();
                    while (it2.hasNext()) {
                        LJII(context, (String) it2.next());
                    }
                    return;
                }
                h hVarLJJIIZI = nVar.LJJIIZI("__CDN_URL__");
                HashMap map = new HashMap();
                int size = hVarLJJIIZI.size();
                for (int i = 0; i < size; i++) {
                    if (((q) hVarLJJIIZI.LJJIIJZLJL(i)).LL instanceof String) {
                        C0CJ5 c0cj5 = new C0CJ5(hVarLJJIIZI.LJJIIJZLJL(i).LJIL());
                        String str = c0cj5.LIZJ;
                        Object arrayList = map.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(str, arrayList);
                        }
                        ((List) arrayList).add(c0cj5);
                    }
                }
                for (String str2 : C0CJ2.LIZ()) {
                    if (!map.containsKey(str2)) {
                        LJII(context, str2);
                        Set setLIZ = C0CJ2.LIZ();
                        setLIZ.remove(str2);
                        C0CJ2.LJFF(setLIZ);
                    }
                }
                if (!map.isEmpty()) {
                    final HashMap map2 = new HashMap();
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        map2.put(((Map.Entry) it3.next()).getKey(), Boolean.FALSE);
                    }
                    for (final Map.Entry entry : map.entrySet()) {
                        IABSettingFetcherConfig iABSettingFetcherConfigLJI = LJI();
                        if (iABSettingFetcherConfigLJI != null && (interfaceC800130Va7CreateABCDNConfigFetcher = iABSettingFetcherConfigLJI.createABCDNConfigFetcher((List) entry.getValue(), new C0CJ4() { // from class: X.0C72
                            @Override // X.C0CJ4
                            public final void onFailed() {
                            }

                            @Override // X.C0CJ4
                            public final void LIZ() {
                                HashMap<String, Boolean> map3 = map2;
                                String key = entry.getKey();
                                Boolean bool = Boolean.TRUE;
                                map3.put(key, bool);
                                if (Intrinsics.LJFF(map2.get(entry.getKey()), bool)) {
                                    Collection<Boolean> collectionValues = map2.values();
                                    if (!collectionValues.isEmpty()) {
                                        Iterator<T> it4 = collectionValues.iterator();
                                        while (it4.hasNext()) {
                                            if (!Intrinsics.LJFF(it4.next(), Boolean.TRUE)) {
                                                return;
                                            }
                                        }
                                    }
                                    Set<String> set2 = set;
                                    if (set2 == null || set2.isEmpty()) {
                                        Map<String, Integer> map4 = C308300C6q.LIZ;
                                        C308300C6q.LIZJ(nVar2);
                                    } else {
                                        Map<String, Integer> map5 = C308300C6q.LIZ;
                                        C308300C6q.LIZLLL(nVar2, set);
                                    }
                                }
                            }
                        })) != null) {
                            C799900VZk.LIZ.getClass();
                            C799890VZj c799890VZj = new C799890VZj();
                            c799890VZj.LIZ(interfaceC800130Va7CreateABCDNConfigFetcher);
                            c799890VZj.LIZIZ();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
