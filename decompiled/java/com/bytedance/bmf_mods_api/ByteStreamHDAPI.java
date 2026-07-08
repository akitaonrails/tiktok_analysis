package com.bytedance.bmf_mods_api;

import X.C1283840jVu;
import X.C1283890jVz;
import X.C1283900jW0;
import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public interface ByteStreamHDAPI {
    void DownloadModel(Context context, C1283840jVu c1283840jVu);

    void Free();

    C1283890jVz GetColorInfo();

    C1283900jW0 GetReport();

    int GetResult();

    int Init(int i, int i2, int i3, int i4, int i5, String str, String str2, C1283840jVu c1283840jVu);

    int ProcessTexture(int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5, int i6);

    int ProcessTextureWithProcessMode(int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5, int i6, int i7);

    int SetColorCorrectionParam(float f, float f2, float f3, float f4, float f5, float f6, long j, long j2);

    void SetDownloadCallback(ByteStreamHDCallbackAPI byteStreamHDCallbackAPI);
}
