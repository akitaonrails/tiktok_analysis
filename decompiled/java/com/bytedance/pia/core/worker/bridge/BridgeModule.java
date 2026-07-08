package com.bytedance.pia.core.worker.bridge;

import X.C1549410qQF;
import X.C1BO6;
import X.C1BP6;
import X.C1BQX;
import X.C2204041BNy;
import X.C2204191BOn;
import X.C2204541BPw;
import X.InterfaceC1522160piI;
import X.InterfaceC1530550pvp;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.pia.core.plugins.BridgeDowngradePlugin;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public class BridgeModule extends JSModule {
    public final C1BP6 bridge;

    public static JavaOnlyMap invalidParams() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("code", -3);
        return javaOnlyMap;
    }

    public BridgeModule(Context context, Object obj) {
        super(context, obj);
        this.bridge = (C1BP6) obj;
    }

    private void returnResult(Callback callback, JavaOnlyMap javaOnlyMap) {
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC1522160piI
    public void call(final String str, final ReadableMap readableMap, final Callback callback) {
        n nVarLIZLLL;
        String str2;
        if (TextUtils.isEmpty(str)) {
            returnResult(callback, invalidParams());
        }
        ReadableMap map = readableMap.getMap("data");
        if (map != null) {
            nVarLIZLLL = C1BQX.LIZLLL(map);
        } else {
            nVarLIZLLL = null;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -794273169:
                str2 = !str.equals("appInfo") ? str : "x.getAppInfo";
                break;
            case -266803431:
                str2 = !str.equals("userInfo") ? str : "x.getUserInfo";
                break;
            case 97322682:
                str2 = !str.equals("fetch") ? str : "x.request";
                break;
            default:
                str2 = str;
                break;
        }
        this.bridge.LIZIZ(new InterfaceC1530550pvp<n>() { // from class: X.1BPN
            @Override // X.InterfaceC1530550pvp
            public final void accept(n nVar) {
                n nVar2 = nVar;
                if (callback != null) {
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.put("code", 1);
                    if (nVar2 != null) {
                        javaOnlyMap.put("data", C1BQX.LIZIZ(nVar2));
                    }
                    callback.invoke(javaOnlyMap);
                }
            }
        }, new InterfaceC1530550pvp() { // from class: X.1BPy
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                this.LIZ.lambda$call$0(str, readableMap, callback, (C2204191BOn) obj);
            }
        }, nVarLIZLLL, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$call$0(String str, ReadableMap readableMap, Callback callback, C2204191BOn c2204191BOn) {
        if (c2204191BOn instanceof C1549410qQF) {
            C1BO6 c1bo6LJFF = ((C2204041BNy) this.bridge.LIZIZ).LJFF("bridgeDowngrade");
            if (c1bo6LJFF instanceof BridgeDowngradePlugin) {
                ((BridgeDowngradePlugin) c1bo6LJFF).LIZJ.LIZ(new C2204541BPw(str, readableMap.getMap("rawData"), callback));
                return;
            }
        }
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (c2204191BOn != null) {
            javaOnlyMap.put("code", Integer.valueOf(c2204191BOn.getCode()));
            javaOnlyMap.put("msg", c2204191BOn.getMessage());
        } else {
            javaOnlyMap.put("code", 0);
        }
        callback.invoke(javaOnlyMap);
    }
}
