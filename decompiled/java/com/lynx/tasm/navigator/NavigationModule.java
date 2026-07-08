package com.lynx.tasm.navigator;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1289620jfE;
import X.InterfaceC1063790dmz;
import Y.ARunnableS107S0000000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS38S1100000_34;
import android.content.Context;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes35.dex */
public class NavigationModule extends LynxModule {
    public static String NAME = "NavigationModule";

    @InterfaceC1063790dmz
    public String getString() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "getString", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEg4jUdKSQVYySFyKZ3wXStJPU6rKsCVcX+XyU2ZpNPKX0Yrt7Q==", null)));
        return c0wsuLIZIZ.LIZ ? (String) c0wsuLIZIZ.LIZIZ : NAME;
    }

    @InterfaceC1063790dmz
    public void goBack() {
        if (new C0WST().LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "goBack", this, new Object[0], "void", new C0WZW(false, "()V", new C0WZX("dzBzEg4jUdKSQVYySFyKZ3wXStJPU6rKsCVcX+XyU2ZpNPKX0Yrt7Q==", null))).LIZ) {
            return;
        }
        C1289620jfE.LIZJ(new ARunnableS107S0000000_34(2));
    }

    public NavigationModule(Context context) {
        super(context);
    }

    @InterfaceC1063790dmz
    public void registerRoute(ReadableMap readableMap) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "registerRoute", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSQVYySFyKZ3wXStJPU6rKsCVcX+XyU2ZpNPKX0Yrt7Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap = (ReadableMap) obj;
        }
        C1289620jfE.LIZJ(new ARunnableS134S0100000_34(readableMap, 14));
    }

    public NavigationModule(Context context, Object obj) {
        super(context, obj);
    }

    @InterfaceC1063790dmz
    public void navigateTo(String str, ReadableMap readableMap) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "navigateTo", this, new Object[]{str, readableMap}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSQVYySFyKZ3wXStJPU6rKsCVcX+XyU2ZpNPKX0Yrt7Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
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
        C1289620jfE.LIZJ(new ARunnableS38S1100000_34(readableMap, str, 3));
    }

    @InterfaceC1063790dmz
    public void replace(String str, ReadableMap readableMap) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "replace", this, new Object[]{str, readableMap}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEg4jUdKSQVYySFyKZ3wXStJPU6rKsCVcX+XyU2ZpNPKX0Yrt7Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
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
        C1289620jfE.LIZJ(new ARunnableS38S1100000_34(readableMap, str, 4));
    }
}
