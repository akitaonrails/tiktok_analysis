package com.ss.bytertc.base.data;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TTFeatureProducer {
    public static Method SFeatureServiceManagerGetBatchFeaturesMethod;
    public static Method SFeatureServiceManagerGetFeatureMethod;
    public static Class<?> SFeatureServiceManagerImplClass;
    public static Object SFeatureServiceManagerInstance;
    public static Method SFeatureServiceManagerInstanceMethod;

    static {
        try {
            SFeatureServiceManagerImplClass = Class.forName("com.ss.android.ugc.aweme.ml.feature.FeatureServiceManagerImpl");
            Class<?> cls = Class.forName("com.ss.ugc.clientai.core.api.FeatureServiceManager");
            SFeatureServiceManagerInstanceMethod = cls.getDeclaredMethod("instance", new Class[0]);
            SFeatureServiceManagerGetFeatureMethod = Class.forName("com.ss.ugc.clientai.core.api.FeatureProducer").getMethod("getFeature", String.class, JSONObject.class, Class.forName("com.ss.ugc.clientai.core.api.meta.ReturnCode"));
            SFeatureServiceManagerGetBatchFeaturesMethod = cls.getMethod("getBatchFeatures", String.class, Class.forName("com.ss.ugc.clientai.core.api.meta.FlattenConfig"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Object getFeaturedServiceManagerInstance() throws Throwable {
        Object obj = SFeatureServiceManagerInstance;
        if (obj != null) {
            return obj;
        }
        try {
            Object objA0 = C2204961BRm.a0(SFeatureServiceManagerInstanceMethod, null, new Object[0], new C0WZX("dzBzEhEpEcjFQVIzURHKZFLHOwEq2ufK778JggYmO8k9NryZ7PX3P6fT", null));
            if (objA0 != null && objA0.getClass() == SFeatureServiceManagerImplClass) {
                SFeatureServiceManagerInstance = objA0;
                return null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static String getBatchFeatures(String str) throws Throwable {
        Object objA0;
        try {
            Object featuredServiceManagerInstance = getFeaturedServiceManagerInstance();
            if (featuredServiceManagerInstance != null && (objA0 = C2204961BRm.a0(SFeatureServiceManagerGetBatchFeaturesMethod, featuredServiceManagerInstance, new Object[]{str, null}, new C0WZX("dzBzEhEpEcjFQVIzURHKZFLHOwEq2ufK778JggYmO8k9NryZ7PX3P6fT", null))) != null) {
                return objA0.toString();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static String getFeature(String str) throws Throwable {
        Object objA0;
        try {
            Object featuredServiceManagerInstance = getFeaturedServiceManagerInstance();
            if (featuredServiceManagerInstance != null && (objA0 = C2204961BRm.a0(SFeatureServiceManagerGetFeatureMethod, featuredServiceManagerInstance, new Object[]{str, null, null}, new C0WZX("dzBzEhEpEcjFQVIzURHKZFLHOwEq2ufK778JggYmO8k9NryZ7PX3P6fT", null))) != null) {
                return objA0.toString();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }
}
