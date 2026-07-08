package com.ss.android.vesdk;

import X.C0VSJ;
import X.C2188811AlT;
import X.C2484209oO;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class VEImageDetectUtils {
    public static final String TAG = "VEImageDetectUtils";
    public IDetectImageEnigmaResultListener mDetectEnigmaResultListener;
    public IDetectImageResultListener mDetectResultListener;
    public IDetectImageResultWithNumListener mDetectResultWithNumListener;
    public boolean mInterruptDetectImageContent = true;
    public long mNativeHandler;

    public interface IDetectImageEnigmaResultListener {
        void onDetectResult(EnigmaResult enigmaResult);
    }

    public interface IDetectImageResultListener {
        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    public interface IDetectImageResultWithNumListener {
        void onDetectResult(String str, String str2, String str3, int i);
    }

    private native int nativeDestroy(long j);

    private native int nativeDetectImageContent(long j, String str, String str2, String[] strArr, int i, int i2);

    private native int nativeDetectImageEnigma(long j, String str, int i, int i2);

    private native long nativeInit(int i, int i2, String str, String str2, boolean z, String str3);

    public int init() {
        long jNativeInit = nativeInit(0, 0, VERuntime.getInstance().getEnv().LIZ(), Build.DEVICE, false, VEEffectConfig.getCacheDir());
        if (jNativeInit == 0) {
            return -1;
        }
        this.mNativeHandler = jNativeInit;
        return 0;
    }

    public synchronized void stopDetectImagesContentIfNeed() {
        this.mInterruptDetectImageContent = true;
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public int destroy() {
        long j = this.mNativeHandler;
        if (j == 0) {
            C2484209oO.LJIIIIZZ(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            return -1;
        }
        int iNativeDestroy = nativeDestroy(j);
        if (iNativeDestroy == 0) {
            this.mNativeHandler = 0L;
            C2484209oO.LJI(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        return iNativeDestroy;
    }

    public void onNativeCallback_onDetectImageEnigma(EnigmaResult enigmaResult) {
        IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener = this.mDetectEnigmaResultListener;
        if (iDetectImageEnigmaResultListener == null) {
            C2484209oO.LJIIIIZZ(TAG, "Native callback onDetectImageEnigma encounter no listener handle?");
        } else {
            iDetectImageEnigmaResultListener.onDetectResult(enigmaResult);
        }
    }

    public void setDetectImageContentListener(IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public void setDetectImageContentWithNumListener(IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        this.mDetectResultWithNumListener = iDetectImageResultWithNumListener;
    }

    public void setDetectImageEnigmaListener(IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener) {
        this.mDetectEnigmaResultListener = iDetectImageEnigmaResultListener;
    }

    public int detectImageEnigma(String str, int i, int i2) {
        if (!str.startsWith("content") && !new C0VSJ(str).exists()) {
            String str2 = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal argument. file: \"");
            sbLIZ.append(str);
            sbLIZ.append("\" is not exist.");
            C2484209oO.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ));
            return -100;
        }
        String str3 = TAG;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("detectImageEnigma..., imagePath=");
        sbLIZ2.append(str);
        sbLIZ2.append(", maxWidth=");
        sbLIZ2.append(i);
        sbLIZ2.append(", maxHeight=");
        sbLIZ2.append(i);
        C2484209oO.LJI(str3, C2188811AlT.LIZIZ(sbLIZ2));
        return nativeDetectImageEnigma(this.mNativeHandler, str, i, i2);
    }

    public void detectImagesContent(String str, List<String> list, List<String> list2) {
        int i;
        synchronized (this) {
            try {
                this.mInterruptDetectImageContent = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (list2.isEmpty()) {
            C2484209oO.LJIIIIZZ(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i = 0; i < size && !this.mInterruptDetectImageContent; i++) {
            String str2 = (String) ListProtector.get(list, i);
            if (!str2.startsWith("content") && !new C0VSJ(str2).exists()) {
                String str3 = TAG;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Illegal argument. file: \"");
                sbLIZ.append(str2);
                sbLIZ.append("\" is not exist.");
                C2484209oO.LIZJ(str3, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                nativeDetectImageContent(this.mNativeHandler, str, (String) ListProtector.get(list, i), strArr, -1, -1);
            }
        }
    }

    public int detectImageContent(String str, String str2, List<String> list, int i, int i2) {
        if (!str2.startsWith("content") && !new C0VSJ(str2).exists()) {
            String str3 = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal argument. file: \"");
            sbLIZ.append(str2);
            sbLIZ.append("\" is not exist.");
            C2484209oO.LIZJ(str3, C2188811AlT.LIZIZ(sbLIZ));
            return -100;
        }
        if (list.isEmpty()) {
            C2484209oO.LJIIIIZZ(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return -100;
        }
        String str4 = TAG;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("detectImageContent... stickerId:");
        sbLIZ2.append(str);
        sbLIZ2.append(", imagePath=");
        sbLIZ2.append(str2);
        sbLIZ2.append(", maxWidth=");
        sbLIZ2.append(i);
        sbLIZ2.append(", maxHeight=");
        sbLIZ2.append(i);
        C2484209oO.LJIIIIZZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return nativeDetectImageContent(this.mNativeHandler, str, str2, strArr, i, i2);
    }

    public void detectImagesContentWithSize(String str, List<String> list, List<String> list2, int i, int i2) {
        int i3;
        synchronized (this) {
            try {
                this.mInterruptDetectImageContent = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (list2.isEmpty()) {
            C2484209oO.LJIIIIZZ(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i3 = 0; i3 < size && !this.mInterruptDetectImageContent; i3++) {
            String str2 = (String) ListProtector.get(list, i3);
            if (!str2.startsWith("content") && !new C0VSJ(str2).exists()) {
                String str3 = TAG;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Illegal argument. file: \"");
                sbLIZ.append(str2);
                sbLIZ.append("\" is not exist.");
                C2484209oO.LIZJ(str3, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                nativeDetectImageContent(this.mNativeHandler, str, (String) ListProtector.get(list, i3), strArr, i, i2);
            }
        }
    }

    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z, int i) {
        IDetectImageResultListener iDetectImageResultListener = this.mDetectResultListener;
        if (iDetectImageResultListener == null) {
            if (this.mDetectResultWithNumListener == null) {
                C2484209oO.LJIIIIZZ(TAG, "Native callback onDetectImageContent encounter no listener handle?");
                return;
            }
        } else {
            iDetectImageResultListener.onDetectResult(str, str2, str3, z);
        }
        IDetectImageResultWithNumListener iDetectImageResultWithNumListener = this.mDetectResultWithNumListener;
        if (iDetectImageResultWithNumListener != null) {
            iDetectImageResultWithNumListener.onDetectResult(str, str2, str3, i);
        }
    }
}
