package com.bytedance.sdk.xbridge.protocol.impl.lynx;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1298490jtX;
import X.C1543870qHJ;
import X.InterfaceC1063790dmz;
import android.content.Context;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxRuntimeBridgeDelegateModule extends LynxModule {
    public static final C1298490jtX Companion = new Object() { // from class: X.0jtX
    };
    public final String TAG;
    public final Context context;
    public final Object obj;
    public final C1543870qHJ realLynxBridgeDelegate;

    public final Context getContext() {
        return this.context;
    }

    public final Object getObj() {
        return this.obj;
    }

    public LynxRuntimeBridgeDelegateModule(Context context, Object obj) {
        super(context, obj);
        this.context = context;
        this.obj = obj;
        this.TAG = "LynxRuntimeBridgeDelegateModule";
        this.realLynxBridgeDelegate = new C1543870qHJ(obj);
    }

    @InterfaceC1063790dmz
    public final void call(String str, ReadableMap readableMap, Callback callback) throws Throwable {
        String str2 = str;
        Callback callback2 = callback;
        ReadableMap readableMap2 = readableMap;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/lynx/LynxRuntimeBridgeDelegateModule", "call", this, new Object[]{str2, readableMap2, callback2}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jlQpnBYusWh5LLwNlF2GJDMSf0DoXzm19A4qbziL8b+gIW7iQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
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
        this.realLynxBridgeDelegate.LIZ(str2, readableMap2, callback2, "LynxRuntime");
    }
}
