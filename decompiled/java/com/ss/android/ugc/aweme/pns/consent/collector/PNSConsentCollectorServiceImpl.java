package com.ss.android.ugc.aweme.pns.consent.collector;

import X.AbstractC1914930zvn;
import X.C01GW;
import X.C100C;
import X.C1876860ywO;
import X.C1914970zvr;
import X.C1914980zvs;
import X.C1915160zwA;
import X.C1915210zwF;
import X.C1915720zx4;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1876780ywG;
import X.InterfaceC1915180zwC;
import X.InterfaceC1915190zwD;
import X.InterfaceC1915200zwE;
import X.InterfaceC1915220zwG;
import X.InterfaceC1915880zxK;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS123S0400000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSConsentCollectorServiceImpl implements IPNSConsentCollectorService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1915210zwF());
    public final Map<String, InterfaceC1915180zwC> LIZIZ = new LinkedHashMap();
    public InterfaceC1915200zwE<Object> LIZJ = new InterfaceC1915200zwE<Object>() { // from class: X.0zw9
        @Override // X.InterfaceC1915200zwE
        public final void LIZ(AwS123S0400000_28 awS123S0400000_28, Object obj, AwS394S0200000_28 awS394S0200000_28) {
            awS394S0200000_28.invoke("");
        }
    };
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService
    public final void LIZ() {
        this.LIZJ = new InterfaceC1915200zwE<String>() { // from class: X.0zw8
            public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1915230zwH());

            @Override // X.InterfaceC1915200zwE
            public final void LIZ(AwS123S0400000_28 awS123S0400000_28, Object obj, AwS394S0200000_28 awS394S0200000_28) {
                String str = (String) obj;
                if (str.length() == 0) {
                    awS394S0200000_28.invoke("dynamic_id_empty");
                } else {
                    C1518550pcT.LIZ((C1518550pcT) LIZIZ.getValue(), str, new AwS394S0200000_28(awS394S0200000_28, awS123S0400000_28, 112));
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService
    public final CollectConsentParam LJ(String str) {
        try {
            return (CollectConsentParam) new Gson().LJII(str, CollectConsentParam.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJII(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS102S0100000_2(function0, 32));
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService
    public final void LIZLLL(String str, AbstractC1914930zvn abstractC1914930zvn) {
        this.LIZIZ.put(str, abstractC1914930zvn);
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService
    public final void LIZIZ(Context context, InterfaceC1915220zwG interfaceC1915220zwG, InterfaceC1915190zwD interfaceC1915190zwD) {
        CollectConsentParam collectConsentParam;
        CollectConsentParam collectConsentParam2;
        CollectConsentParam collectConsentParamLIZ = interfaceC1915220zwG.LIZ();
        if (collectConsentParamLIZ == null) {
            collectConsentParam = new CollectConsentParam("", "", "", null, false);
        } else {
            collectConsentParam = collectConsentParamLIZ;
        }
        C1915160zwA.LIZIZ(collectConsentParam, null);
        if (collectConsentParamLIZ != null && collectConsentParamLIZ.consentKey.length() != 0) {
            InterfaceC1915180zwC interfaceC1915180zwCLIZIZ = interfaceC1915220zwG.LIZIZ();
            if (interfaceC1915180zwCLIZIZ == null) {
                interfaceC1915180zwCLIZIZ = (InterfaceC1915180zwC) ((LinkedHashMap) this.LIZIZ).get(collectConsentParamLIZ.consentKey);
                if (interfaceC1915180zwCLIZIZ == null) {
                    if (interfaceC1915190zwD != null) {
                        interfaceC1915190zwD.onError("no_handler");
                    }
                    C1915160zwA.LIZJ("no_handler", collectConsentParamLIZ);
                    C1915160zwA.LIZ("no_handler", collectConsentParamLIZ, null);
                    return;
                }
            }
            LJI(context, collectConsentParamLIZ, interfaceC1915180zwCLIZIZ, interfaceC1915190zwD);
            return;
        }
        if (interfaceC1915190zwD != null) {
            interfaceC1915190zwD.onError("consent_key_empty");
        }
        if (collectConsentParamLIZ == null) {
            collectConsentParam2 = new CollectConsentParam("", "", "", null, false);
        } else {
            collectConsentParam2 = collectConsentParamLIZ;
        }
        C1915160zwA.LIZJ("consent_key_empty", collectConsentParam2);
        if (collectConsentParamLIZ == null) {
            collectConsentParamLIZ = new CollectConsentParam("", "", "", null, false);
        }
        C1915160zwA.LIZ("consent_key_empty", collectConsentParamLIZ, null);
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService
    public final void LIZJ(Context context, CollectConsentParam collectConsentParam, Object obj, InterfaceC1915190zwD interfaceC1915190zwD) {
        C1915160zwA.LIZIZ(collectConsentParam, obj);
        if (collectConsentParam.consentKey.length() == 0) {
            if (interfaceC1915190zwD != null) {
                interfaceC1915190zwD.onError("consent_key_empty");
            }
            C1915160zwA.LIZJ("consent_key_empty", collectConsentParam);
            C1915160zwA.LIZ("consent_key_empty", collectConsentParam, null);
            return;
        }
        this.LIZJ.LIZ(new AwS123S0400000_28(this, context, collectConsentParam, interfaceC1915190zwD, 2), obj, new AwS394S0200000_28(interfaceC1915190zwD, collectConsentParam, 35));
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService
    public final void LJFF(Context context, CollectConsentParam collectConsentParam, InterfaceC1915180zwC interfaceC1915180zwC, InterfaceC1915190zwD interfaceC1915190zwD) {
        C1915160zwA.LIZIZ(collectConsentParam, null);
        if (collectConsentParam.consentKey.length() == 0) {
            if (interfaceC1915190zwD != null) {
                interfaceC1915190zwD.onError("consent_key_empty");
            }
            C1915160zwA.LIZJ("consent_key_empty", collectConsentParam);
            C1915160zwA.LIZ("consent_key_empty", collectConsentParam, null);
            return;
        }
        if (interfaceC1915180zwC == null) {
            interfaceC1915180zwC = (InterfaceC1915180zwC) ((LinkedHashMap) this.LIZIZ).get(collectConsentParam.consentKey);
            if (interfaceC1915180zwC == null) {
                if (interfaceC1915190zwD != null) {
                    interfaceC1915190zwD.onError("no_handler");
                }
                C1915160zwA.LIZJ("no_handler", collectConsentParam);
                C1915160zwA.LIZ("no_handler", collectConsentParam, null);
                return;
            }
        }
        LJI(context, collectConsentParam, interfaceC1915180zwC, interfaceC1915190zwD);
    }

    public final void LJI(Context context, CollectConsentParam collectConsentParam, InterfaceC1915180zwC interfaceC1915180zwC, InterfaceC1915190zwD interfaceC1915190zwD) {
        boolean z;
        if (collectConsentParam.consentKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (interfaceC1915190zwD != null) {
                interfaceC1915190zwD.onError("consent_key_empty");
            }
            C1915160zwA.LIZJ("consent_key_empty", collectConsentParam);
            C1915160zwA.LIZ("consent_key_empty", collectConsentParam, null);
            return;
        }
        Object value = this.LIZ.getValue();
        String str = collectConsentParam.consentKey;
        Map<String, String> map = collectConsentParam.extra;
        value.getClass();
        EnumC1876780ywG enumC1876780ywGLIZ = C1915720zx4.LIZ(str, map);
        if (interfaceC1915180zwC.LIZIZ(enumC1876780ywGLIZ, collectConsentParam)) {
            interfaceC1915180zwC.LIZLLL(context, collectConsentParam, new C1914970zvr(interfaceC1915190zwD, interfaceC1915180zwC, collectConsentParam, this, enumC1876780ywGLIZ), new AwS429S0200000_28(interfaceC1915190zwD, interfaceC1915180zwC, 51), new AwS394S0200000_28(interfaceC1915190zwD, collectConsentParam, 36), new C1914980zvs(this, enumC1876780ywGLIZ, interfaceC1915180zwC, interfaceC1915190zwD));
            C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
            String str2 = collectConsentParam.consentKey;
            c1915720zx4.getClass();
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("sdk_name", "pns_consent_collector"), new Pair("sdk_version", BuildConfig.VERSION_NAME), new Pair("event_name", "show"), new Pair("consent_status", C1915720zx4.LIZ(str2, null).name()));
            C100C c100c = C100C.LIZ;
            c100c.LIZJ().LIZJ("pns_consent_collector_event", null, mapLJIIIIZZ, null);
            c100c.LIZJ().LIZ("pns_consent_collector_event", mapLJIIIIZZ);
            return;
        }
        if (interfaceC1915190zwD != null) {
            interfaceC1915190zwD.onError("handler_cannot_show");
        }
        C1915160zwA.LIZJ("handler_cannot_show", collectConsentParam);
        C1915160zwA.LIZ("handler_cannot_show", collectConsentParam, null);
    }

    public final void LJIIIIZZ(final String str, EnumC1876780ywG enumC1876780ywG, final EnumC1876780ywG enumC1876780ywG2, final String str2, final String str3, final InterfaceC1915180zwC interfaceC1915180zwC, final InterfaceC1915190zwD interfaceC1915190zwD) {
        interfaceC1915180zwC.LIZJ(enumC1876780ywG2);
        if (interfaceC1915190zwD != null) {
            interfaceC1915190zwD.LIZLLL(enumC1876780ywG, enumC1876780ywG2);
        }
        C1876860ywO c1876860ywO = new C1876860ywO(str, enumC1876780ywG2, str2, null, null, null, 120);
        Object value = this.LIZ.getValue();
        List listSingletonList = Collections.singletonList(c1876860ywO);
        InterfaceC1915880zxK interfaceC1915880zxK = new InterfaceC1915880zxK() { // from class: X.0zwB
            @Override // X.InterfaceC1915880zxK
            public final void LIZ(int i, String str4) {
                int i2 = C1876790ywH.LIZ[enumC1876780ywG2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.LJII(new AwS429S0200000_28(interfaceC1915190zwD, interfaceC1915180zwC, 53));
                        return;
                    }
                    return;
                }
                this.LJII(new AwS429S0200000_28(interfaceC1915190zwD, interfaceC1915180zwC, 52));
            }

            @Override // X.InterfaceC1915880zxK
            public final void onFailure(int i, String str4) {
                InterfaceC1915190zwD interfaceC1915190zwD2 = interfaceC1915190zwD;
                if (interfaceC1915190zwD2 != null) {
                    interfaceC1915190zwD2.onError("update_consent_fail");
                }
                C1915160zwA.LIZ("update_consent_fail", new CollectConsentParam(str, str2, str3, null, false), C2097608Jq.LJIIIIZZ(new Pair("error_code", String.valueOf(i)), new Pair("error_msg", str4)));
            }
        };
        value.getClass();
        C1915720zx4.LJIIIIZZ(interfaceC1915880zxK, str3, listSingletonList);
    }
}
