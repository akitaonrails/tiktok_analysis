package com.ss.android.ugc.tiktok.tpsc.core.render;

import X.AbstractC191843103l;
import X.AnonymousClass1080;
import X.C01GW;
import X.C103L;
import X.C104C;
import X.C1865560yeA;
import X.C1913480ztS;
import X.C191834103c;
import X.C191836103e;
import X.C191839103h;
import X.C191848103q;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C786410Ut5;
import X.InterfaceC1913460ztQ;
import X.InterfaceC191818102m;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tpsc.core.render.event.EventCallbackLifecycleObserver;
import com.ss.android.ugc.tiktok.tpsc.core.render.monitor.MonitorLifecycleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS177S1100000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class TPSCRenderManager {
    public static final TPSCRenderManager LIZ = new TPSCRenderManager();
    public static InterfaceC1913460ztQ LIZIZ;

    public static C103L LJ(String str) {
        Function0 function0 = (Function0) ((ConcurrentHashMap) C1865560yeA.LIZ).get(str);
        if (function0 != null) {
            C103L c103l = (C103L) function0.invoke();
            if (c103l != null) {
                c103l.LIZ = str;
            }
            return c103l;
        }
        return null;
    }

    public static void LIZ(String str, Function0 function0) {
        ((ConcurrentHashMap) C1865560yeA.LIZ).put(str, new AwS177S1100000_28(function0, (Function0<C103L>) str, (String) 8));
    }

    public static C191834103c LIZJ(C191848103q c191848103q, List list) {
        List listLIZ = C104C.LIZ(c191848103q, list);
        c191848103q.LIZJ.getLifecycle().addObserver(new TPSCRenderManager$buildAdapter$1(listLIZ));
        Iterator it2 = ((ArrayList) listLIZ).iterator();
        while (it2.hasNext()) {
            ((AbstractC191843103l) it2.next()).LJII();
        }
        return new C191834103c(c191848103q.LIZ, listLIZ, c191848103q.LJI);
    }

    public static void LJI(Object obj, InterfaceC191818102m interfaceC191818102m) {
        C104C.LIZ.put(obj, interfaceC191818102m);
    }

    public static void LJII(Object obj, C191839103h c191839103h) {
        C191836103e.LIZ.put(obj, c191839103h);
    }

    public static void LIZIZ(Lifecycle lifecycle, C103L c103l, C01GW c01gw) {
        lifecycle.addObserver(new EventCallbackLifecycleObserver(c103l, c01gw));
        lifecycle.addObserver(new MonitorLifecycleObserver(c103l, c01gw));
    }

    public static void LJFF(Context context, String str, Bundle bundle) throws JSONException, AnonymousClass1080 {
        C103L c103l;
        String string;
        String str2;
        Set<String> setKeySet;
        Object obj;
        Function0 function0 = (Function0) ((ConcurrentHashMap) C1865560yeA.LIZ).get(str);
        if (function0 != null) {
            c103l = (C103L) function0.invoke();
            if (c103l != null) {
                c103l.LIZ = str;
            }
        } else {
            c103l = null;
        }
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str3 : setKeySet) {
                try {
                    obj = bundle.get(str3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                jSONObject.put(str3, String.valueOf(obj));
            }
        }
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", string);
        pairArr[1] = new Pair("page_tag", str);
        if (c103l == null || (str2 = c103l.LIZLLL) == null) {
            str2 = "page";
        }
        pairArr[2] = new Pair("page_type", str2);
        C1913480ztS.LIZ("pns_tpsc_page_open_tag", C2097608Jq.LJIIIIZZ(pairArr), C2097908Jt.LIZJ(new Pair("param", C786410Ut5.J3(jSONObject))), 4);
        InterfaceC1913460ztQ interfaceC1913460ztQ = LIZIZ;
        if (interfaceC1913460ztQ != null) {
            interfaceC1913460ztQ.LIZ(context, str, c103l, bundle);
            return;
        }
        throw new AnonymousClass1080("TPSCRenderCapabilityBridge Not initialized");
    }
}
