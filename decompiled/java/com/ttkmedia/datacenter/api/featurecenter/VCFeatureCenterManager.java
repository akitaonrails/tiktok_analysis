package com.ttkmedia.datacenter.api.featurecenter;

import X.C0WZX;
import X.C1961707mJ;
import X.C1961907mL;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttkmedia.datacenter.common.DataCenterLibLoader;
import com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class VCFeatureCenterManager extends IFeatureCenterManager {
    public static final VCFeatureCenterManager mManager = new VCFeatureCenterManager();
    public final C1961907mL mFeatureCenter;

    public VCFeatureCenterManager() {
        DataCenterLibLoader.loadLibrary();
        C1961907mL c1961907mL = new C1961907mL();
        this.mFeatureCenter = c1961907mL;
        c1961907mL.LIZ = new C1961707mJ();
    }

    public static VCFeatureCenterManager getInstance() {
        return mManager;
    }

    @Override // com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager
    public Object getFeatureFromNative(String str) {
        return getFeature(str);
    }

    @Override // com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager
    public Object getFeatureFromTT(String str) throws Throwable {
        this.mFeatureCenter.LIZ.getClass();
        try {
            Object obj = C1961707mJ.LJ;
            if (obj == null) {
                try {
                    Object objA0 = C2204961BRm.a0(C1961707mJ.LIZ, null, new Object[0], new C0WZX("dzBzEhYuVMfZUV4gCxaFcjRrKGodtzQflrln1D9p4AxOtNKTUlayUU03RYNRSLMHWXg4TXYyMQ==", null));
                    if (objA0 != null && objA0.getClass() == C1961707mJ.LIZLLL) {
                        C1961707mJ.LJ = objA0;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                obj = null;
            }
            if (obj != null) {
                Method method = C1961707mJ.LIZJ;
                if (method != null) {
                    return C2204961BRm.a0(method, obj, new Object[]{str, null, "vod_strategy", null}, new C0WZX("dzBzEhYuVMfZUV4gCxaFcjRrKGodtzQflrln1D9p4AxOtNKTUlayUU03RYNRSLMHWXg4TXYyMQ==", null));
                }
                Method method2 = C1961707mJ.LIZIZ;
                if (method2 != null) {
                    return C2204961BRm.a0(method2, obj, new Object[]{str, null, null}, new C0WZX("dzBzEhYuVMfZUV4gCxaFcjRrKGodtzQflrln1D9p4AxOtNKTUlayUU03RYNRSLMHWXg4TXYyMQ==", null));
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return null;
    }

    @Override // com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager
    public Object getBatchFeaturesFromNative(String str, int i) {
        return getBatchFeatures(str, i);
    }

    @Override // com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager
    public Object getProducerFeatureFromNative(String str, String str2) {
        return getProducerFeature(str, str2);
    }

    @Override // com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager
    public Object getBatchFeaturesByBizNameFromNative(String str, String str2, String str3) {
        return getBatchFeaturesByBizName(str, str2, str3);
    }

    @Override // com.ttkmedia.datacenter.featurecenter.IFeatureCenterManager
    public Object getVideoFeatureFromNative(String str, String str2, int i) {
        return getVideoFeature(str, str2, i);
    }
}
