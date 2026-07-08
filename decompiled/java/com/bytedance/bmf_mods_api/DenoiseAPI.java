package com.bytedance.bmf_mods_api;

/* JADX INFO: loaded from: classes21.dex */
public interface DenoiseAPI {
    void Free();

    int[] GetReport();

    int GetResult();

    int Init(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, int i7, int i8, int i9, int i10, int i11);

    int Init(int i, int i2, int i3, boolean z, String str, int i4, int i5, int i6, int i7);

    int ProcessTexture(int i, int i2, int i3, int i4, boolean z);

    int ProcessTexture(int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5);
}
