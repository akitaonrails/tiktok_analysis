package com.bytedance.bmf_mods_lite_api.packageHandler;

import X.InterfaceC1978007ow;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ParamApi {
    int clearData();

    String dump();

    int erase(long j);

    long getNativePtr();

    boolean hasKey(long j);

    double optDouble(long j, double d);

    double[] optDoubleList(long j, double[] dArr);

    float optFloat(long j, float f);

    float[] optFloatList(long j, float[] fArr);

    int optInt(long j, int i);

    int[] optIntList(long j, int[] iArr);

    long optLong(long j, long j2);

    long[] optLongList(long j, long[] jArr);

    String optString(long j, String str);

    void release();

    int setComplexParam(InterfaceC1978007ow interfaceC1978007ow);

    int setComplexParams(List<InterfaceC1978007ow> list);

    int setDouble(long j, double d);

    int setDoubleList(long j, double[] dArr);

    int setFloat(long j, float f);

    int setFloatList(long j, float[] fArr);

    int setInt(long j, int i);

    int setIntList(long j, int[] iArr);

    int setLong(long j, long j2);

    int setLongList(long j, long[] jArr);

    int setString(long j, String str);
}
