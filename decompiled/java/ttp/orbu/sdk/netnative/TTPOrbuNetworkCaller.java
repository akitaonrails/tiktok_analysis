package ttp.orbu.sdk.netnative;

import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1507270pKH;
import X.C15438062q;
import X.C155000ia;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.Channel;
import ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload;
import ttp.orbu.sdk.ITTPOrbuRequest;
import ttp.orbu.sdk.configuration.model.UnhandledReturnStrategy;
import ttp.orbu.sdk.netnative.ValidationEventType;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttpobfuscated.b8;
import ttpobfuscated.d2;
import ttpobfuscated.j4;
import ttpobfuscated.kf;
import ttpobfuscated.ra;
import ttpobfuscated.s9;
import ttpobfuscated.ua;
import ttpobfuscated.v3;
import ttpobfuscated.x3;

/* JADX INFO: loaded from: classes24.dex */
public final class TTPOrbuNetworkCaller {
    public static volatile boolean inited;
    public static String orbuCodeApiLevelString;
    public static final TTPOrbuNetworkCaller INSTANCE = new TTPOrbuNetworkCaller();
    public static String appVersionString = "1.0";
    public static String ttpVersionString = x3.d();

    /* JADX INFO: loaded from: classes.dex */
    public final class a implements ITTPOrbuRequest<ITTPOrbuNetworkRequestPayload> {
        public final /* synthetic */ String a;
        public final /* synthetic */ HashMap<String, String> b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ HashMap<String, String> e;
        public final /* synthetic */ int f;

        /* JADX INFO: renamed from: ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller$a$a, reason: collision with other inner class name */
        public final class C0040a implements ITTPOrbuNetworkRequestPayload {
            public final /* synthetic */ String a;
            public final /* synthetic */ HashMap<String, String> b;
            public final /* synthetic */ byte[] c;
            public final /* synthetic */ String d;

            @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
            public Map<String, List<String>> headers() {
                Set<Map.Entry<String, String>> setEntrySet;
                HashMap<String, String> map = this.b;
                if (map == null || (setEntrySet = map.entrySet()) == null) {
                    return null;
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Map.Entry<String, String> entry : setEntrySet) {
                    String value = entry.getValue();
                    String str = "";
                    if (value == null) {
                        value = "";
                    }
                    String value2 = entry.getValue();
                    if (value2 != null) {
                        str = value2;
                    }
                    Pair pair = new Pair(value, Collections.singletonList(str));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return linkedHashMap;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
            public byte[] data() {
                return this.c;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
            public String method() {
                return this.d;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
            public String url() {
                return this.a;
            }

            public C0040a(String str, HashMap<String, String> map, byte[] bArr, String str2) {
                this.a = str;
                this.b = map;
                this.c = bArr;
                this.d = str2;
            }
        }

        @Override // ttp.orbu.sdk.ITTPOrbuRequest
        public String description() {
            return "nativeNetworkValidationEvent Request";
        }

        @Override // ttp.orbu.sdk.ITTPOrbuRequest
        public Map<String, String> metadata() {
            HashMap<String, String> map = this.e;
            if (map == null) {
                return C2097608Jq.LJ();
            }
            map.put("x-tt-dataflow-id", String.valueOf(this.f));
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Map.Entry<String, String> entry : setEntrySet) {
                String key = entry.getKey();
                String str = "";
                if (key == null) {
                    key = "";
                }
                String value = entry.getValue();
                if (value != null) {
                    str = value;
                }
                Pair pair = new Pair(key, str);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return linkedHashMap;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuRequest
        public ITTPOrbuNetworkRequestPayload payload() {
            return new C0040a(this.a, this.b, this.c, this.d);
        }

        @Override // ttp.orbu.sdk.ITTPOrbuRequest
        public Channel channel() {
            return Channel.NETWORK;
        }

        public a(String str, HashMap<String, String> map, byte[] bArr, String str2, HashMap<String, String> map2, int i) {
            this.a = str;
            this.b = map;
            this.c = bArr;
            this.d = str2;
            this.e = map2;
            this.f = i;
        }
    }

    public static /* synthetic */ void getAppVersionString$annotations() {
    }

    public static /* synthetic */ void getOrbuCodeApiLevelString$annotations() {
    }

    public static /* synthetic */ void getTtpVersionString$annotations() {
    }

    public final native int cleanNative();

    public final native byte[] getOrbuCode(boolean z);

    public final native int initializeNativeValidator(byte[] bArr, int i, boolean z, UnhandledReturnStrategy unhandledReturnStrategy);

    public final native void logInNative(String str);

    public final native int processNativeRequest(String str, String str2, Map<String, String> map, byte[] bArr, Map<String, String> map2, TimeInUs timeInUs, String[] strArr, Object obj);

    public final native int processPredefinedFlow(int i);

    public final native int processPredefinedFlowWithLogger(int i, TimeInUs timeInUs, String[] strArr, Object obj);

    public final native Map<String, List<Long>> profilingPerfUtilsGetMetrics();

    public final native void setBuildType(String str);

    public final native int setExtraInfo(Map<String, String> map);

    public final native int setNativeActivationState(String str);

    public final native boolean setNativeValidatorEnable(boolean z);

    public final native int unlockPredefinedDataFlowLock();

    public final native int updateNativeValidator(byte[] bArr, boolean z, UnhandledReturnStrategy unhandledReturnStrategy);

    static {
        ra.a.getClass();
        orbuCodeApiLevelString = C1507270pKH.LIZJ(ra.a.b.a);
    }

    public final void clean() {
        if (inited) {
            cleanNative();
        }
    }

    public static final String getAppVersionString() {
        return appVersionString;
    }

    public static final String getOrbuCodeApiLevelString() {
        return orbuCodeApiLevelString;
    }

    public static final String getTtpVersionString() {
        return ttpVersionString;
    }

    @C09DV(c = "ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller$sendNativeLogEvent$1", f = "TTPOrbuNetworkCaller.kt", l = {441, 469, 470}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ String i;
        public final /* synthetic */ HashMap<String, String> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, String str, String str2, int i2, int i3, String str3, HashMap<String, String> map, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.d = i;
            this.e = str;
            this.f = str2;
            this.g = i2;
            this.h = i3;
            this.i = str3;
            this.j = map;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, interfaceC1364105Vn);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller$sendNativeNetworkValidationEventInternal$1", f = "TTPOrbuNetworkCaller.kt", l = {296, 297}, m = "invokeSuspend")
    public final class c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ HashMap<String, String> i;
        public final /* synthetic */ HashMap<String, String> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, int i3, String str, String str2, HashMap<String, String> map, HashMap<String, String> map2, InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = str;
            this.h = str2;
            this.i = map;
            this.j = map2;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new c(this.d, this.e, this.f, this.g, this.h, this.i, this.j, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            s9 s9Var;
            Map mapA;
            Map mapA2;
            j4 j4VarL;
            Object objA = obj;
            C1C7U.LIZ("TTPOrbuNetworkCaller@dfb.sendNativeNetworkValidationEventInternal$1");
            Object objLJFF = C099R.LJFF();
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(objA);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("TTPOrbuNetworkCaller@dfb.sendNativeNetworkValidationEventInternal$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j4VarL = (j4) this.b;
                s9Var = (s9) this.a;
                C155000ia.LIZIZ(objA);
            } else {
                C155000ia.LIZIZ(objA);
                int i2 = this.d;
                int i3 = this.e;
                int i4 = this.f;
                String str = this.g;
                String str2 = this.h;
                HashMap<String, String> map = this.i;
                if (map != null) {
                    mapA = b8.a((Map) map);
                } else {
                    mapA = null;
                }
                HashMap<String, String> map2 = this.j;
                if (map2 != null) {
                    mapA2 = b8.a((Map) map2);
                } else {
                    mapA2 = null;
                }
                s9Var = new s9(UUID.randomUUID(), new Date(), new s9.b(i2, i3, i4, str, str2, mapA, mapA2));
                j4VarL = ua.a.b().f().l();
                this.a = s9Var;
                this.b = j4VarL;
                this.c = 1;
                objA = j4VarL.a(s9Var, this);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("TTPOrbuNetworkCaller@dfb.sendNativeNetworkValidationEventInternal$1");
                    return objLJFF;
                }
            }
            if (((Boolean) objA).booleanValue()) {
                this.a = null;
                this.b = null;
                this.c = 2;
                if (j4VarL.b(s9Var, this) == objLJFF) {
                    C1C7U.LIZIZ("TTPOrbuNetworkCaller@dfb.sendNativeNetworkValidationEventInternal$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TTPOrbuNetworkCaller@dfb.sendNativeNetworkValidationEventInternal$1");
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller$sendNativeSampleBufferEvent$1", f = "TTPOrbuNetworkCaller.kt", l = {568, 601, 602}, m = "invokeSuspend")
    public final class d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ ArrayList<NativeRequest> e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ int j;
        public final /* synthetic */ String k;
        public final /* synthetic */ HashMap<String, String> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ArrayList<NativeRequest> arrayList, int i, String str, String str2, String str3, int i2, String str4, HashMap<String, String> map, InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.e = arrayList;
            this.f = i;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = i2;
            this.k = str4;
            this.l = map;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, interfaceC1364105Vn);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller$sendNativeSampleEvent$1", f = "TTPOrbuNetworkCaller.kt", l = {504, 537, 538}, m = "invokeSuspend")
    public final class e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ byte[] h;
        public final /* synthetic */ HashMap<String, String> i;
        public final /* synthetic */ int j;
        public final /* synthetic */ String k;
        public final /* synthetic */ String l;
        public final /* synthetic */ String m;
        public final /* synthetic */ int n;
        public final /* synthetic */ String o;
        public final /* synthetic */ HashMap<String, String> p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, String str, String str2, byte[] bArr, HashMap<String, String> map, int i2, String str3, String str4, String str5, int i3, String str6, HashMap<String, String> map2, InterfaceC1364105Vn<? super e> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.e = i;
            this.f = str;
            this.g = str2;
            this.h = bArr;
            this.i = map;
            this.j = i2;
            this.k = str3;
            this.l = str4;
            this.m = str5;
            this.n = i3;
            this.o = str6;
            this.p = map2;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new e(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, interfaceC1364105Vn);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x013b  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    public static void INVOKESTATIC_ttp_orbu_sdk_netnative_TTPOrbuNetworkCaller_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static final void setAppVersionString(String str) {
        appVersionString = str;
    }

    public static final void setOrbuCodeApiLevelString(String str) {
        orbuCodeApiLevelString = str;
    }

    public static final void setTtpVersionString(String str) {
        ttpVersionString = str;
    }

    public final boolean init(Context context) {
        Object c098200Yq;
        if (inited) {
            return true;
        }
        appVersionString = x3.a(context);
        synchronized (TTPOrbuNetworkCaller.class) {
            try {
                if (inited) {
                    return true;
                }
                TTPOrbuNetworkCaller tTPOrbuNetworkCaller = INSTANCE;
                try {
                    INVOKESTATIC_ttp_orbu_sdk_netnative_TTPOrbuNetworkCaller_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("orbuculum");
                    tTPOrbuNetworkCaller.setBuildType("release");
                    inited = true;
                    c098200Yq = Boolean.TRUE;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = Boolean.FALSE;
                }
                return ((Boolean) c098200Yq).booleanValue();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static final void sendNativeLogEvent(int i, int i2, int i3, String str, String str2, String str3, HashMap<String, String> map) {
        d2.a.a(new b(i3, str, str2, i, i2, str3, map, null));
    }

    private final void sendNativeNetworkValidationEventInternal(int i, int i2, int i3, String str, String str2, HashMap<String, String> map, HashMap<String, String> map2) {
        d2.a.a(new c(i, i2, i3, str, str2, map, map2, null));
    }

    private final int processNativeRequestViaOrbuCode(int i, int i2, int i3, String str, String str2, HashMap<String, String> map, byte[] bArr, HashMap<String, String> map2) {
        a aVar = new a(str2, map, bArr, str, map2, i2);
        v3.s.getClass();
        int statusCode = new kf(v3.u).shouldInterceptRequest(aVar).getStatusCode();
        INSTANCE.sendNativeNetworkValidationEventInternal(i, i2, i3, str, str2, map, map2);
        return statusCode;
    }

    public static final int sendNativeNetworkValidationEvent(int i, int i2, int i3, String str, String str2, HashMap<String, String> map, byte[] bArr, HashMap<String, String> map2) {
        v3.s.getClass();
        v3 v3Var = v3.u;
        if (!v3Var.b && !v3Var.c) {
            if (Intrinsics.LJFF(ValidationEventType.Companion.a(Integer.valueOf(i)), ValidationEventType.Failure.INSTANCE)) {
                return OrbuResult.d.a.getCode();
            }
            return OrbuResult.a.a.getCode();
        }
        ValidationEventType validationEventTypeA = ValidationEventType.Companion.a(Integer.valueOf(i));
        if (Intrinsics.LJFF(validationEventTypeA, ValidationEventType.UnHandled.INSTANCE)) {
            return INSTANCE.processNativeRequestViaOrbuCode(i, i2, i3, str, str2, map, bArr, map2);
        }
        TTPOrbuNetworkCaller tTPOrbuNetworkCaller = INSTANCE;
        tTPOrbuNetworkCaller.sendNativeNetworkValidationEventInternal(i, i2, i3, str, str2, map, map2);
        if (Intrinsics.LJFF(validationEventTypeA, ValidationEventType.Failure.INSTANCE)) {
            return OrbuResult.d.a.getCode();
        }
        if (!Intrinsics.LJFF(validationEventTypeA, ValidationEventType.NotDefined.INSTANCE) && !Intrinsics.LJFF(validationEventTypeA, ValidationEventType.Log.INSTANCE)) {
            if (Intrinsics.LJFF(validationEventTypeA, ValidationEventType.Error.INSTANCE)) {
                tTPOrbuNetworkCaller.setNativeValidatorEnable(false);
                return OrbuResult.a.a.getCode();
            }
            return OrbuResult.a.a.getCode();
        }
        return OrbuResult.a.a.getCode();
    }

    public static final void sendNativeSampleBufferEvent(int i, int i2, int i3, String str, String str2, String str3, String str4, ArrayList<NativeRequest> arrayList, HashMap<String, String> map) {
        d2.a.a(new d(arrayList, i3, str, str2, str3, i2, str4, map, null));
    }

    public static final void sendNativeSampleEvent(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, HashMap<String, String> map, HashMap<String, String> map2) {
        d2.a.a(new e(i, str5, str6, bArr, map, i3, str, str2, str3, i2, str4, map2, null));
    }
}
