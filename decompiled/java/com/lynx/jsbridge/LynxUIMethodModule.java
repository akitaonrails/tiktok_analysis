package com.lynx.jsbridge;

import X.AbstractRunnableC1298320jtG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1289620jfE;
import X.InterfaceC1063790dmz;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIMethodModule extends LynxContextModule {
    public LynxUIMethodModule(s sVar) {
        super(sVar);
    }

    public static Callback wrapCallback(final Callback callback) {
        return new Callback() { // from class: X.0jtF
            @Override // com.lynx.react.bridge.Callback
            public final void invoke(Object... objArr) {
                if (callback == null) {
                    return;
                }
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.putInt("code", ((Integer) objArr[0]).intValue());
                if (objArr.length > 1) {
                    javaOnlyMap.put("data", objArr[1]);
                }
                callback.invoke(javaOnlyMap);
            }
        };
    }

    @InterfaceC1063790dmz
    public void invokeUIMethod(String str, ReadableArray readableArray, String str2, ReadableMap readableMap, Callback callback) throws Throwable {
        final String str3;
        final ReadableArray readableArray2;
        String str4;
        ReadableMap readableMap2;
        Callback callback2;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxUIMethodModule", "invokeUIMethod", this, new Object[]{str, readableArray, str2, readableMap, callback}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableArray;Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUzF+kBzHnaS+cLp/cRM", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str3 = (String) obj;
            } else {
                str3 = str;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableArray2 = (ReadableArray) obj2;
            } else {
                readableArray2 = readableArray;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                str4 = (String) obj3;
            } else {
                str4 = str2;
            }
            Object obj4 = objArr[3];
            if (obj4 != null) {
                readableMap2 = (ReadableMap) obj4;
            } else {
                readableMap2 = readableMap;
            }
            Object obj5 = objArr[4];
            if (obj5 != null) {
                callback2 = (Callback) obj5;
            } else {
                callback2 = callback;
            }
        } else {
            str3 = str;
            readableArray2 = readableArray;
            str4 = str2;
            readableMap2 = readableMap;
            callback2 = callback;
        }
        final s sVar = this.mLynxContext;
        final String str5 = str4;
        final ReadableMap readableMap3 = readableMap2;
        final Callback callback3 = callback2;
        C1289620jfE.LIZJ(new AbstractRunnableC1298320jtG(sVar) { // from class: X.0jtE
            @Override // X.AbstractRunnableC1298320jtG
            public final void LIZ() {
                String str6 = !str3.isEmpty() ? str3 : "-1";
                s sVar2 = this.LLIZ.mLynxContext;
                ReadableArray readableArray3 = readableArray2;
                String str7 = str5;
                ReadableMap readableMap4 = readableMap3;
                Callback callbackWrapCallback = LynxUIMethodModule.wrapCallback(callback3);
                C1311720kEs c1311720kEs = sVar2.LLJJ.get();
                if (c1311720kEs != null) {
                    LynxBaseUI lynxBaseUILJIIJJI = c1311720kEs.LJIIJJI(str6);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("component not found, nodes: ");
                    sbLIZ.append(readableArray3.toString());
                    sbLIZ.append(", method: ");
                    sbLIZ.append(str7);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (lynxBaseUILJIIJJI != null) {
                        for (int i = 0; i < readableArray3.size(); i++) {
                            String string = readableArray3.getString(i);
                            boolean z = readableMap4 != null && readableMap4.size() > 0 && readableMap4.hasKey("_isCallByRefId") && readableMap4.getBoolean("_isCallByRefId");
                            if (!string.startsWith("#") && !z) {
                                if (callbackWrapCallback != null) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(string);
                                    sbLIZ2.append(" not support, only support id selector currently");
                                    callbackWrapCallback.invoke(5, C2188811AlT.LIZIZ(sbLIZ2));
                                    return;
                                }
                                return;
                            }
                            String strSubstring = string.substring(1);
                            lynxBaseUILJIIJJI = z ? C1311720kEs.LJIILL(string, lynxBaseUILJIIJJI) : C1311720kEs.LJIILIIL(strSubstring, lynxBaseUILJIIJJI);
                            if (lynxBaseUILJIIJJI == null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("not found ");
                                sbLIZ3.append(string);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            } else {
                                if (lynxBaseUILJIIJJI.getIdSelector() != null) {
                                    lynxBaseUILJIIJJI.getIdSelector().equals(strSubstring);
                                }
                            }
                        }
                        LynxUIMethodsExecutor.LIZ(lynxBaseUILJIIJJI, str7, readableMap4, callbackWrapCallback);
                        return;
                    }
                    if (callbackWrapCallback != null) {
                        callbackWrapCallback.invoke(2, strLIZIZ);
                    }
                }
            }
        });
    }
}
