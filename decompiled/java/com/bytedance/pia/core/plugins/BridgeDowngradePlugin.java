package com.bytedance.pia.core.plugins;

import X.C1BO6;
import X.C1BPD;
import X.C2204041BNy;
import X.C2204541BPw;
import X.InterfaceC1530550pvp;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class BridgeDowngradePlugin extends C1BO6 {
    public final C1BPD<C2204541BPw> LIZJ;

    @Override // X.C1BO6
    public final String LIZ() {
        return "bridgeDowngrade";
    }

    public static JavaOnlyArray LJI(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                javaOnlyArray.add(LJII((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                javaOnlyArray.add(LJI((JSONArray) objOpt));
            } else {
                javaOnlyArray.add(objOpt);
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LJII(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                javaOnlyMap.put(next, LJII((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                javaOnlyMap.put(next, LJI((JSONArray) objOpt));
            } else if (objOpt == JSONObject.NULL) {
                javaOnlyMap.put(next, null);
            } else {
                javaOnlyMap.put(next, objOpt);
            }
        }
        return javaOnlyMap;
    }

    public BridgeDowngradePlugin(C2204041BNy c2204041BNy, PiaManifest piaManifest) {
        super(c2204041BNy);
        this.LIZJ = new C1BPD<>();
    }

    @Override // X.C1BO6
    public final void LJ(String str, final Object... objArr) {
        if (!Intrinsics.LJFF("event-on-bind-bridge-handle", str)) {
            return;
        }
        this.LIZJ.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BPC
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                C0XGW c0xgw;
                JavaOnlyMap javaOnlyMap;
                C2204541BPw c2204541BPw = (C2204541BPw) obj;
                Object obj2 = objArr[0];
                if ((obj2 instanceof C0XGW) && (c0xgw = (C0XGW) obj2) != null) {
                    String string = this.LIZIZ.LJ.toString();
                    String str2 = c2204541BPw.LIZ;
                    ReadableMap readableMap = c2204541BPw.LIZIZ;
                    if ((readableMap instanceof JavaOnlyMap) && (javaOnlyMap = (JavaOnlyMap) readableMap) != null) {
                        javaOnlyMap.toJSONObject();
                    }
                    c0xgw.LIZ(string, str2);
                    return;
                }
                Callback callback = c2204541BPw.LIZJ;
                if (callback == null) {
                    return;
                }
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.put("code", -2);
                callback.invoke(javaOnlyMap2);
            }
        });
    }
}
