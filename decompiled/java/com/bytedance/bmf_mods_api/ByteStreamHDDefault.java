package com.bytedance.bmf_mods_api;

import X.C1283840jVu;
import X.C1283890jVz;
import X.C1283900jW0;
import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public class ByteStreamHDDefault implements ByteStreamHDAPI {
    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final void DownloadModel(Context context, C1283840jVu c1283840jVu) {
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final void Free() {
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final int GetResult() {
        return -1;
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final int Init(int i, int i2, int i3, int i4, int i5, String str, String str2, C1283840jVu c1283840jVu) {
        return -1;
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final int ProcessTexture(int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5, int i6) {
        return -1;
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final int ProcessTextureWithProcessMode(int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5, int i6, int i7) {
        return -1;
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final int SetColorCorrectionParam(float f, float f2, float f3, float f4, float f5, float f6, long j, long j2) {
        return -1;
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final void SetDownloadCallback(ByteStreamHDCallbackAPI byteStreamHDCallbackAPI) {
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final C1283890jVz GetColorInfo() {
        return new C1283890jVz();
    }

    @Override // com.bytedance.bmf_mods_api.ByteStreamHDAPI
    public final C1283900jW0 GetReport() {
        return new C1283900jW0();
    }
}
