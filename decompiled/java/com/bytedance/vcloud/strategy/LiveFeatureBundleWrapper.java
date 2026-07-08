package com.bytedance.vcloud.strategy;

import X.C08RN;
import X.C1476630oWr;
import X.C1476640oWs;
import X.C1476660oWu;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class LiveFeatureBundleWrapper {
    public static int IVCLiveSourceAppType = 1;
    public static int IVCLiveSourceFeatureType = 2;
    public static int IVCLiveSourceUnknow;
    public int DISABLE;
    public int ENABLE = 1;
    public ILiveFeatureBundle bundle;
    public final Context mContext;
    public int mEnableConfigCenterOpenDL;
    public int mEnableDumpSslKeyLog;
    public int mEnableLiveIOLoadQuicASyn;
    public int mEnableLiveIORegisterNetwork;
    public int mEnableLiveIOUseJavaThread;
    public int mEnableLiveIOUseNewInterface;
    public int mEnableLoadScfgInMainThread;
    public int mEnableMioLive;
    public long mLiveIOHandle;
    public int mSourceType;

    private void setupLiveIO() {
        C1476630oWr c1476630oWr = new C1476630oWr();
        c1476630oWr.LIZ = INVOKEVIRTUAL_com_bytedance_vcloud_strategy_LiveFeatureBundleWrapper_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.mContext).getAbsolutePath();
        c1476630oWr.LIZIZ = this.mEnableLiveIOLoadQuicASyn == 1;
        c1476630oWr.LJFF = this.mEnableLiveIORegisterNetwork == 1;
        c1476630oWr.LIZLLL = this.mEnableDumpSslKeyLog == 1;
        c1476630oWr.LJ = this.mEnableConfigCenterOpenDL == this.ENABLE;
        C1476640oWs c1476640oWs = new C1476640oWs(c1476630oWr);
        if (this.mEnableLiveIOUseNewInterface == this.ENABLE) {
            C1476660oWu.LIZ.LJIIL(C786410Ut5.N3(this.mContext), c1476640oWs);
        } else {
            C1476660oWu.LIZ.LJIIJJI(C786410Ut5.N3(this.mContext), c1476640oWs);
        }
        this.mLiveIOHandle = C1476660oWu.LIZ.LIZJ(1162);
    }

    public long getLiveIOHandle() {
        if (this.mSourceType != IVCLiveSourceAppType) {
            return 0L;
        }
        long j = this.mLiveIOHandle;
        if (j == 0 || j == -1) {
            setupLiveIO();
        }
        return this.mLiveIOHandle;
    }

    public static File INVOKEVIRTUAL_com_bytedance_vcloud_strategy_LiveFeatureBundleWrapper_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public double getFloatValueForKey(String str, double d) {
        ILiveFeatureBundle iLiveFeatureBundle = this.bundle;
        if (iLiveFeatureBundle != null) {
            return ((Double) iLiveFeatureBundle.getAppInfoForKey(str, Double.valueOf(d))).doubleValue();
        }
        return d;
    }

    public int getIntValueForKey(String str, int i) {
        ILiveFeatureBundle iLiveFeatureBundle = this.bundle;
        if (iLiveFeatureBundle != null) {
            return ((Integer) iLiveFeatureBundle.getAppInfoForKey(str, Integer.valueOf(i))).intValue();
        }
        return i;
    }

    public String getJsonStringValueForKey(String str, HashMap<String, Float> map) {
        HashMap map2;
        JSONObject jSONObject = new JSONObject();
        try {
            ILiveFeatureBundle iLiveFeatureBundle = this.bundle;
            if (iLiveFeatureBundle != null && (map2 = (HashMap) iLiveFeatureBundle.getAppInfoForKey(str, new HashMap())) != null) {
                jSONObject = new JSONObject(map2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public String getStringValueForKey(String str, String str2) {
        ILiveFeatureBundle iLiveFeatureBundle = this.bundle;
        if (iLiveFeatureBundle != null) {
            return (String) iLiveFeatureBundle.getAppInfoForKey(str, str2);
        }
        return str2;
    }

    public String getJsonStringValueForKey(String str, String str2) {
        JSONObject jSONObject;
        if (this.bundle != null) {
            try {
                jSONObject = new JSONObject(str2);
                JSONObject jSONObject2 = (JSONObject) this.bundle.getAppInfoForKey(str, jSONObject);
                if (jSONObject2 != null) {
                    jSONObject = jSONObject2;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return C786410Ut5.J3(jSONObject);
    }

    public LiveFeatureBundleWrapper(ILiveFeatureBundle iLiveFeatureBundle, Context context, int i) {
        this.mEnableLiveIOUseJavaThread = 1;
        this.mEnableLoadScfgInMainThread = 1;
        this.bundle = iLiveFeatureBundle;
        this.mContext = context;
        this.mSourceType = i;
        if (i == IVCLiveSourceAppType) {
            this.mEnableLiveIOUseJavaThread = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_liveio_use_java_thread", 1)).intValue();
            this.mEnableLiveIOLoadQuicASyn = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_liveio_load_quic_asyn", Integer.valueOf(this.DISABLE))).intValue();
            this.mEnableLoadScfgInMainThread = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_liveio_load_scfg_mainthread", Integer.valueOf(this.ENABLE))).intValue();
            this.mEnableMioLive = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_mio_live", Integer.valueOf(this.DISABLE))).intValue();
            this.mEnableLiveIORegisterNetwork = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_liveio_registerNetwork", Integer.valueOf(this.DISABLE))).intValue();
            this.mEnableLiveIOUseNewInterface = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_liveio_new_interface", Integer.valueOf(this.DISABLE))).intValue();
            this.mEnableDumpSslKeyLog = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_dump_ssl_key_log", Integer.valueOf(this.DISABLE))).intValue();
            this.mEnableConfigCenterOpenDL = ((Integer) iLiveFeatureBundle.getAppInfoForKey("live_sdk_enable_configcenter_opendl", Integer.valueOf(this.DISABLE))).intValue();
        }
    }
}
