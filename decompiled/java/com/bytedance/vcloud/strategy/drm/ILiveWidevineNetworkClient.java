package com.bytedance.vcloud.strategy.drm;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ILiveWidevineNetworkClient {

    public static class DrmResponse {
        public byte[] byteBody;
        public int code;
        public String errorMessage;

        public boolean isClientError() {
            int i = this.code;
            return i >= 400 && i < 500;
        }

        public boolean isSuccessful() {
            byte[] bArr;
            int i = this.code;
            return i >= 200 && i < 300 && (bArr = this.byteBody) != null && bArr.length > 0;
        }
    }

    DrmResponse post(String str, Map<String, String> map, String str2, byte[] bArr, boolean z, int i);
}
