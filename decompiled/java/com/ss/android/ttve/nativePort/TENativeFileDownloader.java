package com.ss.android.ttve.nativePort;

import X.AbstractC20187113yn;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class TENativeFileDownloader {
    public static final String[] EMPTY_URL_LIST = new String[0];
    public AbstractC20187113yn mTaskListener;

    public static native int nativeCheckTTNetAvailable();

    private native long nativeCreateFileDownload(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, String str4, String str5, String[] strArr, long j3, long j4, String[] strArr2);

    private native long nativeCreateFileDownloadWithCustomPath(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, String str4, String str5, String[] strArr, long j3, long j4, String str6, String[] strArr2);

    private native void nativeDestroyFileDownload(long j);

    private native String nativeDumpMetricsJson(long j);

    private native int nativeGetBufferTimeWithTimestamp(long j, int i);

    public static native void nativeSetAllDownloadsPaused(boolean z);

    private native void nativeSetDownloadPaused(long j, boolean z);

    public static String[] normalizeUrlList(String[] strArr) {
        if (strArr == null) {
            return EMPTY_URL_LIST;
        }
        return strArr;
    }

    public static void setAllDownloadsPaused(boolean z) {
        nativeSetAllDownloadsPaused(z);
    }

    public void destroyFileDownload(long j) {
        nativeDestroyFileDownload(j);
    }

    public String dumpMetricsJson(long j) {
        return nativeDumpMetricsJson(j);
    }

    public void onConnected(String str) {
        AbstractC20187113yn abstractC20187113yn = this.mTaskListener;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZJ(str);
        }
    }

    public void onFinished(String str) {
        AbstractC20187113yn abstractC20187113yn = this.mTaskListener;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZ(str);
        }
    }

    public int getBufferTimeWithTimestamp(long j, int i) {
        return nativeGetBufferTimeWithTimestamp(j, i);
    }

    public void onOpenResult(String str, boolean z) {
        AbstractC20187113yn abstractC20187113yn = this.mTaskListener;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZLLL(str, z);
        }
    }

    public void onProgress(String str, float f) {
        AbstractC20187113yn abstractC20187113yn = this.mTaskListener;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LJJJLL(str, f);
        }
    }

    public void setDownloadPaused(long j, boolean z) {
        nativeSetDownloadPaused(j, z);
    }

    public void onError(String str, int i, int i2, String str2) {
        AbstractC20187113yn abstractC20187113yn = this.mTaskListener;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZIZ(str, i, i2, str2);
        }
    }

    public void onInfo(String str, int i, int i2, float f, String str2) {
        AbstractC20187113yn abstractC20187113yn = this.mTaskListener;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LJ(str, i, i2, f, str2);
        }
    }

    public long createFileDownload(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, String str4, long j3, long j4, HashMap<String, String> map, AbstractC20187113yn abstractC20187113yn) {
        return createFileDownload(str, str2, str3, j, j2, i, i2, i3, i4, z, i5, i6, i7, i8, str4, "", null, j3, j4, map, abstractC20187113yn);
    }

    public long createFileDownloadWithCustomPath(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, String str4, long j3, long j4, String str5, HashMap<String, String> map, AbstractC20187113yn abstractC20187113yn) {
        return createFileDownloadWithCustomPath(str, str2, str3, j, j2, i, i2, i3, i4, z, i5, i6, i7, i8, str4, "", null, j3, j4, str5, map, abstractC20187113yn);
    }

    public long createFileDownload(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, String str4, String str5, String[] strArr, long j3, long j4, HashMap<String, String> map, AbstractC20187113yn abstractC20187113yn) {
        String[] strArr2;
        String str6 = str4;
        this.mTaskListener = abstractC20187113yn;
        if (map != null && !map.isEmpty()) {
            strArr2 = new String[map.size() * 2];
            int i9 = 0;
            for (String str7 : map.keySet()) {
                int i10 = i9 + 1;
                strArr2[i9] = str7;
                i9 = i10 + 1;
                strArr2[i10] = map.get(str7);
            }
        } else {
            strArr2 = null;
        }
        String str8 = "";
        if (str6 == null) {
            str6 = "";
        }
        if (str5 != null) {
            str8 = str5;
        }
        return nativeCreateFileDownload(str, str2, str3, j, j2, i, i2, i3, i4, z, i5, i6, i7, i8, str6, str8, normalizeUrlList(strArr), j3, j4, strArr2);
    }

    public long createFileDownloadWithCustomPath(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, String str4, String str5, String[] strArr, long j3, long j4, String str6, HashMap<String, String> map, AbstractC20187113yn abstractC20187113yn) {
        String[] strArr2;
        String str7 = str4;
        this.mTaskListener = abstractC20187113yn;
        if (map != null && !map.isEmpty()) {
            strArr2 = new String[map.size() * 2];
            int i9 = 0;
            for (String str8 : map.keySet()) {
                int i10 = i9 + 1;
                strArr2[i9] = str8;
                i9 = i10 + 1;
                strArr2[i10] = map.get(str8);
            }
        } else {
            strArr2 = null;
        }
        String str9 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (str5 != null) {
            str9 = str5;
        }
        return nativeCreateFileDownloadWithCustomPath(str, str2, str3, j, j2, i, i2, i3, i4, z, i5, i6, i7, i8, str7, str9, normalizeUrlList(strArr), j3, j4, str6, strArr2);
    }
}
