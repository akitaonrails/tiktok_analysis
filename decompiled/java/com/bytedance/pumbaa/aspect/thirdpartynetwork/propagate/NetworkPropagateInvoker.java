package com.bytedance.pumbaa.aspect.thirdpartynetwork.propagate;

import X.C0WSU;
import X.C0WSV;
import X.C0WZW;
import X.C826320WbG;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkPropagateInvoker implements C0WSV {
    @Override // X.C0WSV
    public String name() {
        return "NetworkPropagate";
    }

    @Override // X.C0WSV
    public C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        return C826320WbG.LIZ.preInvoke(i, str, str2, obj, objArr, str3, c0wzw);
    }

    @Override // X.C0WSV
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        C826320WbG.LIZ.postInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
    }
}
