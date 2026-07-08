package com.lynx.jsbridge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1316710kMv;
import X.InterfaceC1063790dmz;
import android.text.TextUtils;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxTextInfoModule extends LynxContextModule {
    public LynxTextInfoModule(s sVar) {
        super(sVar);
    }

    public LynxTextInfoModule(s sVar, Object obj) {
        super(sVar, obj);
    }

    @InterfaceC1063790dmz
    public WritableMap getTextInfo(String str, ReadableMap readableMap) throws Throwable {
        int i = 1;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxTextInfoModule", "getTextInfo", this, new Object[]{str, readableMap}, "com.lynx.react.bridge.WritableMap", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyU3pz1FOGH+Z+cJVlJH2", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableMap = (ReadableMap) obj2;
            }
        }
        String string = readableMap.getString("fontSize");
        if (TextUtils.isEmpty(string)) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putInt("width", 0);
            return javaOnlyMap;
        }
        String string2 = readableMap.getString("fontFamily");
        String string3 = readableMap.getString("maxWidth");
        if (readableMap.hasKey("maxLine")) {
            i = readableMap.getInt("maxLine");
        }
        return C1316710kMv.LJIIIIZZ(i, str, string, string2, string3);
    }
}
