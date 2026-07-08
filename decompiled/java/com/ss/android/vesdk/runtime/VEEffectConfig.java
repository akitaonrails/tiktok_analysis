package com.ss.android.vesdk.runtime;

import X.C2188811AlT;
import X.C2484209oO;
import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VEException;

/* JADX INFO: loaded from: classes34.dex */
public class VEEffectConfig {
    public static final String TAG;
    public static String sCacheDir;
    public static AssetManager sEffectAssetManager;
    public static ResourceFinder sFinder;

    public static native void nativeBatchSetABConfigValue(String[] strArr, Object[] objArr, int[] iArr);

    public static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    public static native void nativeEnableAlgoParamisForce(boolean z, boolean z2);

    public static native void nativeEnableEffectAudioManagerCallback(boolean z);

    public static native void nativeEnableEffectRT(boolean z);

    public static native void nativeEnableMakeupSegmentation(boolean z);

    public static native String nativeGetABConfigList();

    public static native void nativeSetABConfigValue(String str, boolean z, int i, float f, String str2, int i2);

    public static native void nativeSetABbUseBuildinAmazing(boolean z);

    public static native void nativeSetCacheDir(String str);

    public static native void nativeSetEffectAsynAPI(boolean z);

    public static native void nativeSetEffectForceDetectFace(boolean z);

    public static native boolean nativeSetEffectGetABValueCallback();

    public static native void nativeSetEffectJsonConfig(String str);

    public static native void nativeSetEffectLogLevel(int i);

    public static native void nativeSetEffectMaxMemoryCache(int i);

    public static native void nativeSetEffectSyncTimeDomain(boolean z);

    public static native void nativeSetEnableStickerAmazing(boolean z);

    public static native void nativeSetShareDir(String str);

    public static native void nativeUseNewEffectAlgorithmApi(boolean z);

    public static native void nativesetEnableStickerReleaseTexture(boolean z);

    static {
        TENativeLibsLoader.loadLibrary();
        TAG = "VEEffectConfig";
        sEffectAssetManager = null;
        sFinder = new FileResourceFinder("");
        sCacheDir = "";
    }

    public static String getABConfigList() {
        return nativeGetABConfigList();
    }

    public static boolean setEffectGetABValueCallback() {
        return nativeSetEffectGetABValueCallback();
    }

    public static String getCacheDir() {
        return sCacheDir;
    }

    public static boolean enableAssetManager(AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        nativeEnableEffectAudioManagerCallback(z);
    }

    public static boolean enableEffectRT(boolean z) {
        nativeEnableEffectRT(z);
        return true;
    }

    public static void enableMakeupSegmentation(boolean z) {
        nativeEnableMakeupSegmentation(z);
    }

    public static long getNativeFinder(long j) {
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j);
        }
        throw new VEException(-1, "Error call finder related interface.");
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C2484209oO.LIZJ(TAG, "getNativeFinder effectHandler is null");
            return;
        }
        if (sFinder != null) {
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getNativeFinder effectHandler ");
            sbLIZ.append(sFinder.getClass().getCanonicalName());
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
            sFinder.release(j);
            return;
        }
        throw new VEException(-1, "Error call finder related interface.");
    }

    public static boolean setABbUseBuildinAmazing(boolean z) {
        nativeSetABbUseBuildinAmazing(z);
        return true;
    }

    public static void setCacheDir(String str) {
        sCacheDir = str;
        nativeSetCacheDir(str);
    }

    public static void setEffectAsynAPI(boolean z) {
        nativeSetEffectAsynAPI(z);
    }

    public static void setEffectForceDetectFace(boolean z) {
        nativeSetEffectForceDetectFace(z);
    }

    public static boolean setEffectJsonConfig(String str) {
        nativeSetEffectJsonConfig(str);
        return true;
    }

    public static boolean setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
        return true;
    }

    public static boolean setEffectMaxMemoryCache(int i) {
        nativeSetEffectMaxMemoryCache(i);
        return true;
    }

    public static void setEffectSyncTimeDomain(boolean z) {
        nativeSetEffectSyncTimeDomain(z);
    }

    public static void setEnableStickerAmazing(boolean z) {
        nativeSetEnableStickerAmazing(z);
    }

    public static void setEnableStickerReleaseTexture(boolean z) {
        nativesetEnableStickerReleaseTexture(z);
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        sFinder = resourceFinder;
    }

    public static boolean setShareDir(String str) {
        nativeSetShareDir(str);
        return true;
    }

    public static void setUseNewEffectAlgorithmApi(boolean z) {
        nativeUseNewEffectAlgorithmApi(z);
    }

    public static void configEffect(String str, String str2) {
        boolean z;
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
    }

    public static void enableAlgoParamIsForce(boolean z, boolean z2) {
        nativeEnableAlgoParamisForce(z, z2);
    }

    public static void batchSetABConfigValue(String[] strArr, Object[] objArr, int[] iArr) {
        if (strArr != null && objArr != null && iArr != null && strArr.length == objArr.length && strArr.length == iArr.length) {
            nativeBatchSetABConfigValue(strArr, objArr, iArr);
        }
    }

    public static void setABConfigValue(String str, Object obj, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (obj instanceof String)) {
                        nativeSetABConfigValue(str, false, 0, 0.0f, (String) obj, 3);
                        return;
                    }
                    return;
                }
                if (!(obj instanceof Float) && !(obj instanceof Double)) {
                    return;
                }
                nativeSetABConfigValue(str, false, 0, ((Number) obj).floatValue(), null, 2);
                return;
            }
            if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                return;
            }
            nativeSetABConfigValue(str, false, ((Number) obj).intValue(), 0.0f, null, 1);
            return;
        }
        if (!(obj instanceof Boolean)) {
            return;
        }
        nativeSetABConfigValue(str, ((Boolean) obj).booleanValue(), 0, 0.0f, null, 0);
    }
}
