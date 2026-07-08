package com.bytedance.vmsdk.jsbridge;

import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;

/* JADX INFO: loaded from: classes24.dex */
public class PromiseImpl implements Promise {
    public Callback mReject;
    public Callback mResolve;

    @Override // com.bytedance.vmsdk.jsbridge.Promise
    public void reject(String str) {
        reject("EUNSPECIFIED", str);
    }

    @Override // com.bytedance.vmsdk.jsbridge.Promise
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
        }
    }

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.bytedance.vmsdk.jsbridge.Promise
    public void reject(String str, String str2) {
        if (this.mReject != null) {
            if (str == null) {
                str = "EUNSPECIFIED";
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString("code", str);
            javaOnlyMap.putString("message", str2);
            this.mReject.invoke(javaOnlyMap);
        }
    }
}
