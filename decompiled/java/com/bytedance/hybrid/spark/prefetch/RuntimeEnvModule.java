package com.bytedance.hybrid.spark.prefetch;

import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1297540js0;
import X.C1300160jwE;
import X.C1520080pew;
import X.C189200o6;
import X.InterfaceC1063790dmz;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class RuntimeEnvModule extends LynxModule {
    public static final C1297540js0 Companion = new C1297540js0();
    public WritableMap globalProps;
    public final Set<String> hasTimingSet;
    public WritableMap initData;
    public C1300160jwE runtimeParam;
    public SparkContext sparkContext;

    public static final WritableArray convertJSONArray2JavaOnlyArray(JSONArray jSONArray) {
        Companion.getClass();
        return C1297540js0.LIZ(jSONArray);
    }

    @InterfaceC1063790dmz
    public final void log(String str) throws Throwable {
        Object[] objArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeEnvModule", "log", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALmu4vbicoqkxA==", null)));
        if (c0wsuLIZIZ.LIZ || (objArr = c0wsuLIZIZ.LIZJ) == null) {
            return;
        }
        Object obj = objArr[0];
    }

    @InterfaceC1063790dmz
    public final WritableMap getGlobalProps() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeEnvModule", "getGlobalProps", this, new Object[0], "com.lynx.react.bridge.WritableMap", new C0WZW(false, "()Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALmu4vbicoqkxA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        log("getGlobalProps");
        return this.globalProps;
    }

    @InterfaceC1063790dmz
    public final WritableMap getInitialData() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeEnvModule", "getInitialData", this, new Object[0], "com.lynx.react.bridge.WritableMap", new C0WZW(false, "()Lcom/lynx/react/bridge/WritableMap;", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALmu4vbicoqkxA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (WritableMap) c0wsuLIZIZ.LIZIZ;
        }
        log("getInitialData");
        return this.initData;
    }

    private final boolean isFirstReportTiming(String str) {
        if (!this.hasTimingSet.contains(str)) {
            this.hasTimingSet.add(str);
            return true;
        }
        return false;
    }

    @InterfaceC1063790dmz
    public final void onFinished(ReadableMap readableMap) throws Throwable {
        ReadableMap readableMap2;
        Long lValueOf;
        String string;
        Integer numValueOf;
        String string2;
        Integer numValueOf2;
        String str;
        String strLJIJI;
        String str2;
        String strLJIJI2;
        Object obj;
        String str3 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeEnvModule", "onFinished", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALmu4vbicoqkxA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap2 = (ReadableMap) obj;
        } else {
            readableMap2 = readableMap;
        }
        if (readableMap2 != null) {
            lValueOf = Long.valueOf(readableMap2.getLong("ppe", 0L));
            string = readableMap2.getString(FollowStatusChangeMethod.PARAM_UID, "default");
            numValueOf = Integer.valueOf(readableMap2.getInt("success", 0));
            string2 = readableMap2.getString("errorMsg", "");
            numValueOf2 = Integer.valueOf(readableMap2.getInt("errorCode", 0));
        } else {
            lValueOf = null;
            string = null;
            numValueOf = null;
            string2 = null;
            numValueOf2 = null;
        }
        if (isFirstReportTiming("onFinished")) {
            SparkContext sparkContext = this.sparkContext;
            if (sparkContext != null) {
                sparkContext.LJIIIZ().LIZJ("spark_lynx_prefetch_page_prefetch_end", lValueOf);
            }
            String strValueOf = String.valueOf(numValueOf);
            String str4 = "errorMsg = " + string2 + ", errorCode = " + numValueOf2;
            SparkContext sparkContext2 = this.sparkContext;
            if (sparkContext2 != null) {
                str2 = sparkContext2.containerId;
                strLJIJI2 = sparkContext2.LJIJI();
            } else {
                str2 = null;
                strLJIJI2 = null;
            }
            SparkContext sparkContext3 = this.sparkContext;
            if (sparkContext3 != null) {
                str3 = sparkContext3.bid;
            }
            C1520080pew.LJFF(str2, "lynx_prefetch_v2", "runtimeOnFinished", null, strLJIJI2, str3, str4, strValueOf, 8);
        } else {
            String strValueOf2 = String.valueOf(numValueOf);
            String str5 = "errorMsg = " + string2 + ", errorCode = " + numValueOf2;
            SparkContext sparkContext4 = this.sparkContext;
            if (sparkContext4 != null) {
                str = sparkContext4.containerId;
                strLJIJI = sparkContext4.LJIJI();
            } else {
                str = null;
                strLJIJI = null;
            }
            SparkContext sparkContext5 = this.sparkContext;
            if (sparkContext5 != null) {
                str3 = sparkContext5.bid;
            }
            C1520080pew.LJFF(str, "lynx_prefetch_v2", "runtimeOnFinished_2", null, strLJIJI, str3, str5, strValueOf2, 8);
        }
        log("worker onFinished, id = " + string + ", success = " + numValueOf + ", errorMsg = " + string2 + ", errorCode = " + numValueOf2 + ", ppe = " + lValueOf);
    }

    @InterfaceC1063790dmz
    public final void onGetPrefetchRes(ReadableMap readableMap) throws Throwable {
        ReadableMap readableMap2;
        Long lValueOf;
        Long lValueOf2;
        String string;
        Integer numValueOf;
        String string2;
        Integer numValueOf2;
        String str;
        String strLJIJI;
        String str2;
        String strLJIJI2;
        Object obj;
        String str3 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeEnvModule", "onGetPrefetchRes", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALmu4vbicoqkxA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap2 = (ReadableMap) obj;
        } else {
            readableMap2 = readableMap;
        }
        if (readableMap2 != null) {
            lValueOf = Long.valueOf(readableMap2.getLong("cps", 0L));
            lValueOf2 = Long.valueOf(readableMap2.getLong("fr3", 0L));
            string = readableMap2.getString(FollowStatusChangeMethod.PARAM_UID, "default");
            numValueOf = Integer.valueOf(readableMap2.getInt("success", 0));
            string2 = readableMap2.getString("errorMsg");
            numValueOf2 = Integer.valueOf(readableMap2.getInt("errorCode", 0));
        } else {
            lValueOf = null;
            lValueOf2 = null;
            string = null;
            numValueOf = null;
            string2 = null;
            numValueOf2 = null;
        }
        if (isFirstReportTiming("onGetPrefetchRes")) {
            SparkContext sparkContext = this.sparkContext;
            if (sparkContext != null) {
                sparkContext.LJIIIZ().LIZJ("spark_lynx_prefetch_call_prefetch_start", lValueOf);
            }
            SparkContext sparkContext2 = this.sparkContext;
            if (sparkContext2 != null) {
                sparkContext2.LJIIIZ().LIZJ("spark_lynx_prefetch_fr3", lValueOf2);
            }
            String strValueOf = String.valueOf(numValueOf);
            String str4 = "errorMsg = " + string2 + ", errorCode = " + numValueOf2;
            SparkContext sparkContext3 = this.sparkContext;
            if (sparkContext3 != null) {
                str2 = sparkContext3.containerId;
                strLJIJI2 = sparkContext3.LJIJI();
            } else {
                str2 = null;
                strLJIJI2 = null;
            }
            SparkContext sparkContext4 = this.sparkContext;
            if (sparkContext4 != null) {
                str3 = sparkContext4.bid;
            }
            C1520080pew.LJFF(str2, "lynx_prefetch_v2", "runtimeOnGetPrefetchRes", null, strLJIJI2, str3, str4, strValueOf, 8);
        } else {
            String strValueOf2 = String.valueOf(numValueOf);
            String str5 = "errorMsg = " + string2 + ", errorCode = " + numValueOf2;
            SparkContext sparkContext5 = this.sparkContext;
            if (sparkContext5 != null) {
                str = sparkContext5.containerId;
                strLJIJI = sparkContext5.LJIJI();
            } else {
                str = null;
                strLJIJI = null;
            }
            SparkContext sparkContext6 = this.sparkContext;
            if (sparkContext6 != null) {
                str3 = sparkContext6.bid;
            }
            C1520080pew.LJFF(str, "lynx_prefetch_v2", "runtimeOnGetPrefetchRes_2", null, strLJIJI, str3, str5, strValueOf2, 8);
        }
        log("worker onGetPrefetchRes, id = " + string + ", success = " + numValueOf + ", cps = " + lValueOf + ", fr3 = " + lValueOf2);
    }

    @InterfaceC1063790dmz
    public final void onInit(ReadableMap readableMap) throws Throwable {
        ReadableMap readableMap2;
        String string;
        Long lValueOf;
        String str;
        String strLJIJI;
        String str2;
        String strLJIJI2;
        Object obj;
        String str3 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeEnvModule", "onInit", this, new Object[]{readableMap}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALmu4vbicoqkxA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            readableMap2 = (ReadableMap) obj;
        } else {
            readableMap2 = readableMap;
        }
        if (readableMap2 != null) {
            string = readableMap2.getString("version", "");
            lValueOf = Long.valueOf(readableMap2.getLong("pps", 0L));
        } else {
            string = null;
            lValueOf = null;
        }
        if (isFirstReportTiming("onInit")) {
            SparkContext sparkContext = this.sparkContext;
            if (sparkContext != null) {
                sparkContext.LJIIIZ().LIZJ("spark_lynx_prefetch_page_prefetch_start", lValueOf);
            }
            SparkContext sparkContext2 = this.sparkContext;
            if (sparkContext2 != null) {
                str2 = sparkContext2.containerId;
                strLJIJI2 = sparkContext2.LJIJI();
            } else {
                str2 = null;
                strLJIJI2 = null;
            }
            SparkContext sparkContext3 = this.sparkContext;
            if (sparkContext3 != null) {
                str3 = sparkContext3.bid;
            }
            C1520080pew.LJFF(str2, "lynx_prefetch_v2", "runtimeOnInit", null, strLJIJI2, str3, null, string, 72);
        } else {
            SparkContext sparkContext4 = this.sparkContext;
            if (sparkContext4 != null) {
                str = sparkContext4.containerId;
                strLJIJI = sparkContext4.LJIJI();
            } else {
                str = null;
                strLJIJI = null;
            }
            SparkContext sparkContext5 = this.sparkContext;
            if (sparkContext5 != null) {
                str3 = sparkContext5.bid;
            }
            C1520080pew.LJFF(str, "lynx_prefetch_v2", "runtimeOnInit_2", null, strLJIJI, str3, null, string, 72);
        }
        log("worker onInit, version = " + string + ", pps = " + lValueOf);
    }

    public RuntimeEnvModule(Context context, Object obj) {
        C1300160jwE c1300160jwE;
        SparkContext sparkContext;
        Map<Object, Object> map;
        Map<String, Object> map2;
        super(context, obj);
        Unit unit = null;
        if (obj instanceof C1300160jwE) {
            c1300160jwE = (C1300160jwE) obj;
        } else {
            c1300160jwE = null;
        }
        this.runtimeParam = c1300160jwE;
        this.hasTimingSet = new LinkedHashSet();
        try {
            C1300160jwE c1300160jwE2 = this.runtimeParam;
            if (c1300160jwE2 != null && (map2 = c1300160jwE2.LIZ) != null) {
                C1297540js0 c1297540js0 = Companion;
                JSONObject jSONObject = new JSONObject(map2);
                c1297540js0.getClass();
                this.globalProps = C1297540js0.LIZIZ(jSONObject);
            }
            C1300160jwE c1300160jwE3 = this.runtimeParam;
            if (c1300160jwE3 != null && (map = c1300160jwE3.LIZIZ) != null) {
                C1297540js0 c1297540js02 = Companion;
                JSONObject jSONObject2 = new JSONObject(map);
                c1297540js02.getClass();
                this.initData = C1297540js0.LIZIZ(jSONObject2);
            }
            C1300160jwE c1300160jwE4 = this.runtimeParam;
            if (c1300160jwE4 != null && (sparkContext = c1300160jwE4.LIZJ) != null) {
                this.sparkContext = sparkContext;
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
