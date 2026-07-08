package com.ss.android.ugc.aweme.wire;

import X.C0CPV;
import X.C793770VBv;
import X.C794240VDq;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class WireUseageMonitor {
    public static final Set<C0CPV> DEDUPLICATE_SET = new HashSet();

    public static String getStackTrace() {
        return Log.getStackTraceString(new Throwable());
    }

    public static void upload(final String str, final String str2) {
        Object obj = new Object(str, str2) { // from class: X.0CPV
            public final String LIZ;
            public final String LIZIZ;

            public final int hashCode() {
                String str3 = this.LIZ;
                int iHashCode = str3 == null ? 0 : str3.hashCode();
                String str4 = this.LIZIZ;
                return iHashCode + (str4 != null ? str4.hashCode() : 0);
            }

            public final boolean equals(Object obj2) {
                if (obj2 == null) {
                    return false;
                }
                C0CPV c0cpv = (C0CPV) obj2;
                String str3 = this.LIZ;
                if (str3 == null) {
                    if (c0cpv.LIZ != null) {
                        return false;
                    }
                } else if (!str3.equals(c0cpv.LIZ)) {
                    return false;
                }
                String str4 = this.LIZIZ;
                String str5 = c0cpv.LIZIZ;
                if (str4 == null) {
                    if (str5 != null) {
                        return false;
                    }
                } else if (!str4.equals(str5)) {
                    return false;
                }
                return true;
            }

            {
                this.LIZ = str;
                this.LIZIZ = str2;
            }
        };
        Set<C0CPV> set = DEDUPLICATE_SET;
        if (set.contains(obj)) {
            return;
        }
        set.add((C0CPV) obj);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class_name", str);
            jSONObject.put("method_name", str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("wire_usage_monitor", 1, jSONObject);
    }
}
