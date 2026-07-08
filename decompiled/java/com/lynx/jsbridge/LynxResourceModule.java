package com.lynx.jsbridge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1285920jZG;
import X.C1289620jfE;
import X.C1301260jy0;
import X.C786410Ut5;
import X.InterfaceC1063790dmz;
import X.InterfaceC1316540kMe;
import Y.ARunnableS13S0500000_20;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxImageService;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LynxResourceModule extends LynxContextModule {
    public ILynxImageService mImagePrefetchHelper;

    public LynxResourceModule(s sVar) {
        super(sVar);
        ILynxImageService iLynxImageService = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        this.mImagePrefetchHelper = iLynxImageService;
        if (iLynxImageService == null) {
            reportError(32102, "An exception occurred when try to get image prefetch helper.", "An error occurred while attempting to create a Java object ImagePrefetchHelper through reflection. This may be due to a change in the constructor interface of ImagePrefetchHelper, or because ImagePrefetchHelper is located in a plugin that is not ready. If you are unable to resolve this issue, you can seek help from the client RD.", null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.lynx.react.bridge.ReadableMap, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.lynx.react.bridge.JavaOnlyMap resourcePrefetch(com.lynx.react.bridge.ReadableMap r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.resourcePrefetch(com.lynx.react.bridge.ReadableMap, boolean):com.lynx.react.bridge.JavaOnlyMap");
    }

    @InterfaceC1063790dmz
    public void cancelResourcePrefetch(ReadableMap readableMap, Callback callback) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxResourceModule", "cancelResourcePrefetch", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUvpxEpyBHqT+cK58Pnd", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        TraceEvent.LIZIZ("cancelResourcePrefetch");
        JavaOnlyMap javaOnlyMapResourcePrefetch = resourcePrefetch(readableMap, true);
        TraceEvent.LJII("cancelResourcePrefetch");
        if (callback != null) {
            callback.invoke(javaOnlyMapResourcePrefetch);
        }
    }

    public JavaOnlyMap createResult(int i, String str) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("code", i);
        javaOnlyMap.putString("msg", str);
        return javaOnlyMap;
    }

    @InterfaceC1063790dmz
    public void requestResourcePrefetchImage(ReadableMap readableMap, Callback callback) throws Throwable {
        ReadableMap readableMap2 = readableMap;
        final Callback callback2 = callback;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxResourceModule", "requestResourcePrefetchImage", this, new Object[]{readableMap2, callback2}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUvpxEpyBHqT+cK58Pnd", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap2 = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback2 = (Callback) obj2;
            }
        }
        String string = readableMap2.getString("uri", null);
        ReadableMap map = readableMap2.getMap("params", null);
        if (string == null) {
            reportError(32101, "Parameters error in Lynx resource prefetch module! 'uri' is null.", "Please check the parameters passed to Lynx resource prefetch module.", null, null);
            if (callback2 != null) {
                callback2.invoke(createResult(32101, "Parameters error in Lynx resource prefetch module! 'uri' is null."));
                return;
            }
            return;
        }
        ILynxImageService iLynxImageService = this.mImagePrefetchHelper;
        if (iLynxImageService == null) {
            reportError(32102, "Image prefetch helper do not exist!", "If it is a parameter error, please check the parameters passed in. If the Resource service does not exist, it may be due to an error that occurred while creating the resource service through reflection. Please contact the client RD for help.", null, null);
            if (callback2 != null) {
                callback2.invoke(createResult(32102, "Image prefetch helper do not exist!"));
                return;
            }
            return;
        }
        this.mLynxContext.getClass();
        iLynxImageService.prefetchImage(string, null, (Map) map, new InterfaceC1316540kMe() { // from class: X.0jxw
            @Override // X.InterfaceC1316540kMe
            public final void LIZIZ(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1316540kMe
            public final void LIZJ(int i, Throwable th) {
                Callback callback3 = callback2;
                if (callback3 != null) {
                    callback3.invoke(this.LIZIZ.createResult(i, "prefetch image failed"));
                }
            }

            @Override // X.InterfaceC1316540kMe
            public final void LIZ(C1315930kLf c1315930kLf, C1315700kLI c1315700kLI, C1316350kML c1316350kML) {
                Callback callback3 = callback2;
                if (callback3 != null) {
                    callback3.invoke(this.LIZIZ.createResult(0, ""));
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.Integer, java.lang.String> cancelResourcePrefetchInternal(java.lang.String r9, java.lang.String r10, com.lynx.react.bridge.ReadableMap r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.cancelResourcePrefetchInternal(java.lang.String, java.lang.String, com.lynx.react.bridge.ReadableMap):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.Integer, java.lang.String> requestResourcePrefetchInternal(java.lang.String r17, java.lang.String r18, com.lynx.react.bridge.ReadableMap r19) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.requestResourcePrefetchInternal(java.lang.String, java.lang.String, com.lynx.react.bridge.ReadableMap):android.util.Pair");
    }

    private void resourcePrefetchAwaitComplete(ReadableMap readableMap, Callback callback, long j) {
        String string;
        String string2;
        ReadableMap map;
        String str;
        Integer num;
        JavaOnlyMap javaOnlyMapCreateResult = createResult(0, "");
        ReadableArray array = readableMap.getArray("data", null);
        if (array == null) {
            reportError(32101, "Parameters error in Lynx resource prefetch module! Value of 'data' should be an array.", "Please check the parameters passed to Lynx resource prefetch module.", null, "request");
            javaOnlyMapCreateResult.putInt("code", 32101);
            javaOnlyMapCreateResult.putString("msg", "Parameters error in Lynx resource prefetch module! Value of 'data' should be an array.");
            if (callback != null) {
                callback.invoke(javaOnlyMapCreateResult);
                return;
            }
            return;
        }
        int size = array.size();
        if (size == 0) {
            if (callback != null) {
                callback.invoke(javaOnlyMapCreateResult);
                return;
            }
            return;
        }
        int[] iArr = {0};
        boolean[] zArr = {false};
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyMapCreateResult.putArray("details", javaOnlyArray);
        WeakReference weakReference = new WeakReference(this);
        C786410Ut5.LJLIIL(j, C1289620jfE.LIZ(), new ARunnableS13S0500000_20(weakReference, zArr, javaOnlyMapCreateResult, callback, iArr, 0));
        for (int i = 0; i < size; i++) {
            if (array.getType(i) != ReadableType.Map) {
                str = "Parameters error in Lynx resource prefetch module! The prefetch data should be a map.";
                map = null;
                string = "";
                string2 = "";
                num = 32101;
            } else {
                ReadableMap map2 = array.getMap(i);
                string = map2.getString("uri", "");
                string2 = map2.getString("type", "");
                map = map2.getMap("params", null);
                if (string != null && string2 != null && !string.isEmpty() && !string2.isEmpty()) {
                    num = 0;
                    str = "";
                } else {
                    str = "Parameters error in Lynx resource prefetch module! 'uri' or 'type' is null.";
                    num = 32101;
                }
            }
            C1301260jy0 c1301260jy0 = new C1301260jy0(this, weakReference, string, zArr, string2, javaOnlyArray, iArr, size, callback, javaOnlyMapCreateResult);
            if (num.intValue() != 0) {
                c1301260jy0.LIZ(num.intValue(), str);
            } else {
                requestResourcePrefetchInternalAwaitComplete(string, string2, map, c1301260jy0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    @X.InterfaceC1063790dmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestResourcePrefetch(com.lynx.react.bridge.ReadableMap r19, com.lynx.react.bridge.Callback r20, com.lynx.react.bridge.ReadableMap r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r6 = r19
            r8 = r21
            r5 = r20
            X.0WST r10 = new X.0WST
            r10.<init>()
            r0 = 3
            java.lang.Object[] r15 = new java.lang.Object[r0]
            r4 = 0
            r15[r4] = r6
            r3 = 1
            r15[r3] = r5
            r9 = 2
            r15[r9] = r8
            X.0WZW r1 = new X.0WZW
            X.0WZX r7 = new X.0WZX
            java.lang.String r0 = "dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyUvpxEpyBHqT+cK58Pnd"
            r2 = 0
            r7.<init>(r0, r2)
            java.lang.String r0 = "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;Lcom/lynx/react/bridge/ReadableMap;)V"
            r1.<init>(r4, r0, r7)
            r11 = 300002(0x493e2, float:4.20392E-40)
            java.lang.String r12 = "com/lynx/jsbridge/LynxResourceModule"
            java.lang.String r13 = "requestResourcePrefetch"
            java.lang.String r16 = "void"
            r14 = r18
            r17 = r1
            X.0WSU r1 = r10.LIZIZ(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L3c
            return
        L3c:
            java.lang.Object[] r1 = r1.LIZJ
            if (r1 == 0) goto L55
            r0 = r1[r4]
            if (r0 == 0) goto L47
            r6 = r0
            com.lynx.react.bridge.ReadableMap r6 = (com.lynx.react.bridge.ReadableMap) r6
        L47:
            r0 = r1[r3]
            if (r0 == 0) goto L4e
            r5 = r0
            com.lynx.react.bridge.Callback r5 = (com.lynx.react.bridge.Callback) r5
        L4e:
            r0 = r1[r9]
            if (r0 == 0) goto L55
            r8 = r0
            com.lynx.react.bridge.ReadableMap r8 = (com.lynx.react.bridge.ReadableMap) r8
        L55:
            java.lang.String r10 = "requestResourcePrefetch"
            com.lynx.tasm.base.TraceEvent.LIZIZ(r10)
            r0 = 60000(0xea60, double:2.9644E-319)
            if (r8 == 0) goto L92
            java.lang.String r7 = "awaitComplete"
            boolean r9 = r8.getBoolean(r7, r4)
            java.lang.String r7 = "awaitTimeout"
            long r0 = r8.getLong(r7, r0)
            if (r9 == 0) goto L92
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r7 = " start resourcePrefetchAwaitComplete with timeout: "
            r8.<init>(r7)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r7 = "LynxResourceModule"
            com.lynx.base.log.LynxLog.i(r7, r8)
            r14.resourcePrefetchAwaitComplete(r6, r5, r0)
        L83:
            com.lynx.tasm.base.TraceEvent.LJII(r10)
            if (r2 == 0) goto L91
            if (r5 == 0) goto L91
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            r5.invoke(r0)
        L91:
            return
        L92:
            com.lynx.react.bridge.JavaOnlyMap r2 = r14.resourcePrefetch(r6, r4)
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.requestResourcePrefetch(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback, com.lynx.react.bridge.ReadableMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void requestResourcePrefetchInternalAwaitComplete(java.lang.String r16, java.lang.String r17, com.lynx.react.bridge.ReadableMap r18, final X.InterfaceC1301190jxt r19) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.requestResourcePrefetchInternalAwaitComplete(java.lang.String, java.lang.String, com.lynx.react.bridge.ReadableMap, X.0jxt):void");
    }

    public void reportError(int i, String str, String str2, String str3, String str4) {
        LynxError lynxError = new LynxError(i, str, str2, "error");
        if (str3 != null) {
            lynxError.LIZ("resourceUri", str3);
        }
        if (str4 != null) {
            lynxError.LIZ("actionType", str4);
        }
        this.mLynxContext.LJIILLIIL(lynxError);
    }
}
