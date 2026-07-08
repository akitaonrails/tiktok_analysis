package com.bytedance.sdk.xbridge.protocol.impl.lynx;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1298480jtW;
import X.C1543870qHJ;
import X.InterfaceC1063790dmz;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxBridgeDelegateModule extends LynxContextModule {
    public static final C1298480jtW Companion = new Object() { // from class: X.0jtW
    };
    public final String TAG;
    public final s context;
    public final Object obj;
    public final C1543870qHJ realLynxBridgeDelegate;

    public final s getContext() {
        return this.context;
    }

    public final Object getObj() {
        return this.obj;
    }

    public LynxBridgeDelegateModule(s sVar) {
        this(sVar, null);
    }

    public LynxBridgeDelegateModule(s sVar, Object obj) {
        super(sVar, obj);
        this.context = sVar;
        this.obj = obj;
        this.TAG = "LynxBridgeDelegateModule";
        this.realLynxBridgeDelegate = new C1543870qHJ(obj);
    }

    @InterfaceC1063790dmz
    public final void call(String str, ReadableMap readableMap, Callback callback) throws Throwable {
        Callback callback2 = callback;
        ReadableMap readableMap2 = readableMap;
        String str2 = str;
        boolean zLJI = MethodIDManager.LJI(196724);
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxBridgeDelegateModule", "call", this, new Object[]{str2, readableMap2, callback2}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jlQpnBYusWh5KL3MUF4ELHrV/EAp23H/5MVHybv", null)));
        if (c0wsuLIZIZ.LIZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str2 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableMap2 = (ReadableMap) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                callback2 = (Callback) obj3;
            }
        }
        this.realLynxBridgeDelegate.LIZ(str2, readableMap2, callback2, "Lynx");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
