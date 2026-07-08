package com.lynx.jsbridge;

import X.AbstractC1338850kwd;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1285920jZG;
import X.C1299320jus;
import X.C1320210kSZ;
import X.C2188811AlT;
import X.InterfaceC1063790dmz;
import android.content.Context;
import com.lynx.jsbridge.network.HttpRequest;
import com.lynx.jsbridge.network.HttpResponse;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.service.ILynxHttpService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
public class LynxFetchModule extends LynxModule {
    public static final AtomicLong streamingCounter = new AtomicLong();
    public final C1299320jus mSender;

    public LynxFetchModule(Context context, Object obj) {
        super(context);
        this.mSender = (C1299320jus) obj;
    }

    @InterfaceC1063790dmz
    public void fetch(ReadableMap readableMap, Callback callback, Callback callback2) throws Throwable {
        ReadableMap readableMap2 = readableMap;
        Callback callback3 = callback2;
        Callback callback4 = callback;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/lynx/jsbridge/LynxFetchModule", "fetch", this, new Object[]{readableMap2, callback4, callback3}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+d1LCyV/pw0ZvO3aSwcEe", null)));
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
                callback4 = (Callback) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                callback3 = (Callback) obj3;
            }
        }
        String string = readableMap2.getString("url", "");
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.LIZ = readableMap2.getString("method", "");
        httpRequest.LIZIZ = string;
        httpRequest.LIZJ = readableMap2.getString("origin", "");
        httpRequest.LJ = (JavaOnlyMap) readableMap2.getMap("headers", new JavaOnlyMap());
        httpRequest.LIZLLL = readableMap2.getByteArray("body", new byte[0]);
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) readableMap2.getMap("lynxExtension", new JavaOnlyMap());
        httpRequest.LJFF = javaOnlyMap;
        boolean z = javaOnlyMap.getBoolean("useStreaming", false);
        boolean z2 = javaOnlyMap.getBoolean("enableFetchAPIStandardStreaming", false);
        ILynxHttpService iLynxHttpService = (ILynxHttpService) C1285920jZG.LIZJ().LIZ(ILynxHttpService.class);
        if (iLynxHttpService == null) {
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.put("message", "Lynx Http Service not registered");
            callback3.invoke(javaOnlyMap2);
        } else if (!z && !z2) {
            request(iLynxHttpService, httpRequest, string, callback4);
        } else {
            requestStreaming(iLynxHttpService, httpRequest, string, callback4);
        }
    }

    private void request(ILynxHttpService iLynxHttpService, HttpRequest httpRequest, final String str, final Callback callback) {
        iLynxHttpService.request(httpRequest, new AbstractC1338850kwd() { // from class: X.0kwb
            @Override // X.AbstractC1338850kwd
            public final void LIZ(HttpResponse httpResponse) {
                byte[] httpBody;
                Object httpHeaders;
                JavaOnlyMap javaOnlyMap;
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.put("url", str);
                if (httpResponse.getHttpBody() != null) {
                    httpBody = httpResponse.getHttpBody();
                } else {
                    httpBody = new byte[0];
                }
                javaOnlyMap2.put("body", httpBody);
                String statusText = "";
                if (httpResponse.getHttpHeaders() == null) {
                    httpHeaders = "";
                } else {
                    httpHeaders = httpResponse.getHttpHeaders();
                }
                javaOnlyMap2.put("headers", httpHeaders);
                javaOnlyMap2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(httpResponse.getStatusCode()));
                if (httpResponse.getStatusText() != null) {
                    statusText = httpResponse.getStatusText();
                }
                javaOnlyMap2.put("statusText", statusText);
                if (httpResponse.getCustomInfo() != null) {
                    javaOnlyMap = httpResponse.getCustomInfo();
                } else {
                    javaOnlyMap = new JavaOnlyMap();
                }
                javaOnlyMap2.put("lynxExtension", javaOnlyMap);
                callback.invoke(javaOnlyMap2);
            }
        });
    }

    private void requestStreaming(ILynxHttpService iLynxHttpService, HttpRequest httpRequest, final String str, final Callback callback) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxFetchModuleStreamingEvent");
        sbLIZ.append(streamingCounter.getAndIncrement());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        iLynxHttpService.requestStreaming(httpRequest, new AbstractC1338850kwd() { // from class: X.0kwa
            @Override // X.AbstractC1338850kwd
            public final void LIZ(HttpResponse httpResponse) {
                Object httpHeaders;
                JavaOnlyMap javaOnlyMap;
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.put("url", str);
                javaOnlyMap2.put("body", new byte[0]);
                String statusText = "";
                if (httpResponse.getHttpHeaders() == null) {
                    httpHeaders = "";
                } else {
                    httpHeaders = httpResponse.getHttpHeaders();
                }
                javaOnlyMap2.put("headers", httpHeaders);
                javaOnlyMap2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(httpResponse.getStatusCode()));
                if (httpResponse.getStatusText() != null) {
                    statusText = httpResponse.getStatusText();
                }
                javaOnlyMap2.put("statusText", statusText);
                if (httpResponse.getCustomInfo() != null) {
                    javaOnlyMap = httpResponse.getCustomInfo();
                } else {
                    javaOnlyMap = new JavaOnlyMap();
                }
                javaOnlyMap.putString("streamingId", strLIZIZ);
                javaOnlyMap2.put("lynxExtension", javaOnlyMap);
                callback.invoke(javaOnlyMap2);
            }
        }, new C1320210kSZ(strLIZIZ, this.mSender));
    }
}
