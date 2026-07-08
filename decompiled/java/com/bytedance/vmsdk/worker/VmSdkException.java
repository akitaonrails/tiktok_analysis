package com.bytedance.vmsdk.worker;

/* JADX INFO: loaded from: classes31.dex */
public class VmSdkException extends Exception {
    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public VmSdkException(int i, String str) {
        super(str);
        this.LL = i;
    }

    public static void throwVmSdkException(int i, String str) throws VmSdkException {
        throw new VmSdkException(i, str);
    }
}
