package ttpobfuscated;

import X.C098200Yq;
import X.C13LP;
import X.C189200o6;
import X.C2097608Jq;
import X.InterfaceC1364105Vn;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.EventSetting;
import ttp.orbu.sdk.configuration.model.FeatureSetting;
import ttp.orbu.sdk.configuration.model.GeckoValidation;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency;
import ttpobfuscated.m8;
import ttpobfuscated.q3;
import ttpobfuscated.t1;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class f8 implements t1 {
    public static final a a = new a();

    public static final class a {
    }

    public final Map<IntRange, Long> a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adaptiveDelayConfig");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                long j = JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject, next);
                List listLJJLIIIJILLIZJL = kotlin.text.a0.LJJLIIIJILLIZJL(next, new String[]{"-"}, 0, 6);
                int size = listLJJLIIIJILLIZJL.size();
                if (size != 1) {
                    if (size == 2) {
                        linkedHashMap.put(new IntRange(CastIntegerProtector.parseInt((String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL)), CastIntegerProtector.parseInt((String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL))), Long.valueOf(j));
                    }
                } else {
                    linkedHashMap.put(new IntRange(CastIntegerProtector.parseInt(kotlin.text.u.LJJIFFI((String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL), "+", "", false)), Integer.MAX_VALUE), Long.valueOf(j));
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ttpobfuscated.gc b(org.json.JSONObject r8) throws ttpobfuscated.k8 {
        /*
            r7 = this;
            java.lang.String r6 = "requestValidation"
            org.json.JSONObject r3 = ttpobfuscated.q4.e(r8, r6)
            java.lang.String r2 = "challengeType"
            if (r3 == 0) goto L31
            java.lang.String r1 = ttpobfuscated.j8.g(r3, r2)
            java.lang.String r0 = "expiryInSeconds"
            int r0 = ttpobfuscated.j8.c(r3, r0)
            long r4 = (long) r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L1d
        L19:
            java.lang.String r1 = ttpobfuscated.j8.g(r8, r2)
        L1d:
            ttpobfuscated.k0$a r0 = ttpobfuscated.k0.c
            ttpobfuscated.k0 r3 = r0.a(r1)
            if (r3 == 0) goto L35
            ttpobfuscated.gc r2 = new ttpobfuscated.gc
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r4)
            r2.<init>(r3, r0)
            return r2
        L31:
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            goto L19
        L35:
            ttpobfuscated.k8 r0 = ttpobfuscated.j8.a(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.f8.b(org.json.JSONObject):ttpobfuscated.gc");
    }

    public final List<EventSetting> c(JSONObject jSONObject) throws k8 {
        zb fVar;
        JSONArray jSONArrayD = j8.d(jSONObject, "events");
        int length = jSONArrayD.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayD, i);
            String strG = j8.g(jSONObject2, "reportingFrequency");
            if (kotlin.text.u.LJIJI(strG, "once", true)) {
                fVar = zb.d.h;
            } else if (kotlin.text.u.LJIJI(strG, "always", true)) {
                fVar = zb.a.h;
            } else if (kotlin.text.u.LJIJI(strG, "sample", true)) {
                fVar = new zb.e(j8.c(jSONObject2, "sampleSize"));
            } else if (kotlin.text.u.LJIJI(strG, "timed", true)) {
                fVar = new zb.f(j8.f(jSONObject2, "duration"));
            } else if (kotlin.text.u.LJIJI(strG, "never", true)) {
                fVar = zb.c.h;
            } else {
                throw j8.a("reportingFrequency", strG);
            }
            arrayList.add(new EventSetting(j8.g(jSONObject2, "eventType"), fVar, j8.c(jSONObject2, "sendBatchMaxSize")));
        }
        return arrayList;
    }

    public final List<FeatureSetting> d(JSONObject jSONObject) throws k8 {
        JSONArray jSONArrayD = j8.d(jSONObject, "features");
        int length = jSONArrayD.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayD, i);
            arrayList.add(new FeatureSetting(j8.g(jSONObject2, "name"), j8.a(jSONObject2, "enabled")));
        }
        return arrayList;
    }

    public final u5 e(JSONObject jSONObject) {
        return new u5(j8.c(j8.e(jSONObject, "geckoScanSettings"), "cBase"), j8.b(j8.e(jSONObject, "geckoScanSettings"), "cScale"));
    }

    public final GeckoValidation f(JSONObject jSONObject) throws k8 {
        String strG = j8.g(jSONObject, "geckoValidation");
        GeckoValidation geckoValidationFromString = GeckoValidation.Companion.fromString(strG);
        if (geckoValidationFromString != null) {
            return geckoValidationFromString;
        }
        throw j8.a("geckoValidation", strG);
    }

    public final List<ServerConfig> g(JSONObject jSONObject) throws k8 {
        JSONArray jSONArrayD = j8.d(jSONObject, "serverConfigs");
        int length = jSONArrayD.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayD, i);
            String strG = j8.g(jSONObject2, "name");
            ServerAPIType serverAPITypeSafeValueOf = ServerAPIType.Companion.safeValueOf(strG);
            if (serverAPITypeSafeValueOf != null) {
                arrayList.add(new ServerConfig(serverAPITypeSafeValueOf, j8.g(jSONObject2, "baseUrl"), j8.c(jSONObject2, "timeoutInMS"), Integer.valueOf(j8.c(jSONObject2, "maxPayloadSizeInBytes")), q4.c(jSONObject2, "serviceDeferInterval"), serverAPITypeSafeValueOf.getDefaultApiVersionPathParameter()));
            } else {
                throw j8.a("name", strG);
            }
        }
        return arrayList;
    }

    public final SessionIdHeaderFrequency h(JSONObject jSONObject) throws k8 {
        int iC = j8.c(jSONObject, "sessionIdHeaderFrequency");
        SessionIdHeaderFrequency sessionIdHeaderFrequencyFromInt = SessionIdHeaderFrequency.Companion.fromInt(Integer.valueOf(iC));
        if (sessionIdHeaderFrequencyFromInt != null) {
            return sessionIdHeaderFrequencyFromInt;
        }
        throw j8.a("sessionIdHeaderFrequency", String.valueOf(iC));
    }

    public final ConfigType.General i(JSONObject jSONObject) throws k8 {
        ConfigType.General general;
        String strG = j8.g(jSONObject, "type");
        ConfigType configTypeFromType = ConfigType.Companion.fromType(strG);
        if ((configTypeFromType instanceof ConfigType.General) && (general = (ConfigType.General) configTypeFromType) != null) {
            return general;
        }
        throw j8.a("type", strG);
    }

    public final List<String> j(JSONObject jSONObject) throws k8 {
        JSONArray jSONArrayD = j8.d(jSONObject, "usRegions");
        int length = jSONArrayD.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(JSONArrayProtectorUtils.getString(jSONArrayD, i));
        }
        return arrayList;
    }

    @Override // ttpobfuscated.t1
    public Object a(String str, InterfaceC1364105Vn<? super GeneralConfig> interfaceC1364105Vn) throws t1.a.C0073a {
        Object c098200Yq;
        k8 k8Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c098200Yq = new GeneralConfig(j8.c(jSONObject, "version"), i(jSONObject), j8.f(jSONObject, "sendInterval"), d(jSONObject), c(jSONObject), h(jSONObject), j(jSONObject), g(jSONObject), TimeUnit.SECONDS.toMillis(j8.f(jSONObject, "refreshIntervalInSeconds")), j8.a(jSONObject, "refreshDuringNonActiveState"), q4.f(jSONObject, "logIdOverride"), f(jSONObject), j8.c(jSONObject, "heartbeatGenericData"), b(jSONObject), e(jSONObject), a(jSONObject), j8.c(jSONObject, "telemetryRetentionInDays"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        if (thM5exceptionOrNullimpl instanceof k8) {
            k8Var = (k8) thM5exceptionOrNullimpl;
        } else {
            k8Var = new k8(m8.b.b);
        }
        q3.a aVar = q3.a;
        String message = thM5exceptionOrNullimpl.getMessage();
        String str2 = g8.a;
        aVar.getClass();
        q3.a.c.b(message, str2, thM5exceptionOrNullimpl);
        throw new t1.a.C0073a(k8Var, ConfigType.General.INSTANCE);
    }
}
