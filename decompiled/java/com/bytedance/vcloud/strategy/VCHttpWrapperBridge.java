package com.bytedance.vcloud.strategy;

import X.C09SW;
import X.C0X52;
import X.C0X9S;
import X.C1493620oyG;
import X.C1515120pWw;
import X.C2088908Gh;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.common.applog.AppLog;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class VCHttpWrapperBridge {
    public static VCHttpWrapperBridge sInstance;

    public static VCHttpWrapperBridge inst() {
        if (sInstance == null) {
            synchronized (VCHttpWrapperBridge.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new VCHttpWrapperBridge();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private Pair<String, String> parseUrlInternal(String str, Map<String, String> map) {
        try {
            return C2088908Gh.LIZJ(str, map);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private String sendRequestByNative(String str, String str2) {
        final String[] strArr = {""};
        sendRequest(str, str2, new IHttpResponseCallback() { // from class: com.bytedance.vcloud.strategy.VCHttpWrapperBridge.2
            @Override // com.bytedance.vcloud.strategy.IHttpResponseCallback
            public void onComplete(String str3, int i) {
                String[] strArr2 = strArr;
                if (str3 == null) {
                    str3 = "";
                }
                strArr2[0] = str3;
            }
        }, false);
        return strArr[0];
    }

    private void handleCall(C0X9S<String> c0x9s, boolean z, final IHttpResponseCallback iHttpResponseCallback) {
        if (c0x9s == null) {
            if (iHttpResponseCallback != null) {
                iHttpResponseCallback.onComplete(null, -1);
            }
        } else {
            if (z) {
                c0x9s.enqueue(new C09SW<String>() { // from class: com.bytedance.vcloud.strategy.VCHttpWrapperBridge.1
                    @Override // X.C09SW
                    public void onAsyncPreRequest(RequestBuilder requestBuilder) {
                    }

                    @Override // X.InterfaceC594300NSq
                    public void onResponse(C0X9S<String> c0x9s2, C0X52<String> c0x52) {
                    }

                    @Override // X.C09SW
                    public void onAsyncResponse(C0X9S<String> c0x9s2, C0X52<String> c0x52) {
                        IHttpResponseCallback iHttpResponseCallback2 = iHttpResponseCallback;
                        if (iHttpResponseCallback2 != null) {
                            iHttpResponseCallback2.onComplete(c0x52.LIZIZ, c0x52.LIZ.LIZIZ);
                        }
                    }

                    @Override // X.InterfaceC594300NSq
                    public void onFailure(C0X9S<String> c0x9s2, Throwable th) {
                        IHttpResponseCallback iHttpResponseCallback2 = iHttpResponseCallback;
                        if (iHttpResponseCallback2 != null) {
                            iHttpResponseCallback2.onComplete(null, -1);
                        }
                    }
                });
                return;
            }
            try {
                C0X52<String> c0x52Execute = c0x9s.execute();
                String str = c0x52Execute.LIZIZ;
                if (iHttpResponseCallback != null) {
                    iHttpResponseCallback.onComplete(str, c0x52Execute.LIZ.LIZIZ);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            c0x9s.cancel();
        }
    }

    private void sendRequestByGet(String str, IHttpResponseCallback iHttpResponseCallback, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> urlInternal = parseUrlInternal(str, linkedHashMap);
        if (urlInternal == null) {
            iHttpResponseCallback.onComplete(null, -1);
            return;
        }
        String str2 = (String) urlInternal.first;
        String strAddCommonParams = AppLog.addCommonParams(str, true);
        INetworkApi iNetworkApi = (INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, str2);
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LIZJ = 15000L;
        c1493620oyG.LIZLLL = 15000L;
        c1493620oyG.LJ = 15000L;
        handleCall(iNetworkApi.doGet(true, 5242880, strAddCommonParams, linkedHashMap, null, c1493620oyG), z, iHttpResponseCallback);
    }

    private void sendRequestByPost(String str, String str2, IHttpResponseCallback iHttpResponseCallback, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> urlInternal = parseUrlInternal(str, linkedHashMap);
            if (urlInternal != null && !TextUtils.isEmpty(str2)) {
                String str3 = (String) urlInternal.first;
                try {
                    handleCall(((INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, str3)).postBody(5242880, AppLog.addCommonParams(str, true), linkedHashMap, new TypedByteArray("application/json; charset=utf-8", str2.getBytes("UTF-8"), new String[0]), null), z, iHttpResponseCallback);
                    return;
                } catch (UnsupportedEncodingException e) {
                    TryCatchGuardChecker.doCheck(e);
                    iHttpResponseCallback.onComplete(null, -1);
                    return;
                }
            }
            iHttpResponseCallback.onComplete(null, -1);
            return;
        }
        iHttpResponseCallback.onComplete(null, -1);
    }

    public void sendRequest(String str, String str2, IHttpResponseCallback iHttpResponseCallback, boolean z) {
        if (iHttpResponseCallback == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            sendRequestByGet(str, iHttpResponseCallback, z);
        } else {
            sendRequestByPost(str, str2, iHttpResponseCallback, z);
        }
    }
}
