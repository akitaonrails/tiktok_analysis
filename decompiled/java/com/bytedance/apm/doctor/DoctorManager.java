package com.bytedance.apm.doctor;

import X.C08GN;
import X.C0V4C;
import X.C0V4Q;
import X.C791610V3n;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class DoctorManager {
    public final List<ApmListener> LIZ = new ArrayList();

    public interface ApmListener {
        void onDataEvent(int i, String str, JSONObject jSONObject);

        void onEvent(String str, String str2);
    }

    public static DoctorManager getInstance() {
        return C0V4Q.LIZ;
    }

    public void registerApmListener(ApmListener apmListener) {
        if (apmListener != null) {
            ((ArrayList) this.LIZ).add(apmListener);
        }
    }

    public final void LIZ(final String str, final JSONObject jSONObject) {
        if (!C08GN.LIZIZ(this.LIZ) && jSONObject != null) {
            final ArrayList arrayList = new ArrayList(this.LIZ);
            C791610V3n.LIZ.LJII(new C0V4C() { // from class: X.0V4P
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("DoctorManager@a3ba.onDataEvent$1");
                    try {
                        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "DATA_DOCTOR");
                        jSONObject2.put(str, System.currentTimeMillis());
                        int iOptInt = jSONObject2.optInt("DATA_ID");
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((DoctorManager.ApmListener) it2.next()).onDataEvent(iOptInt, str, jSONObject);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1C7U.LIZIZ("DoctorManager@a3ba.onDataEvent$1");
                }

                @Override // X.C0V4C
                public final EnumC792960V8s getTaskType() {
                    return EnumC792960V8s.LIGHT_WEIGHT;
                }
            });
        }
    }

    public final void LIZIZ(final String str, final String str2) {
        if (C08GN.LIZIZ(this.LIZ)) {
            return;
        }
        final ArrayList arrayList = new ArrayList(this.LIZ);
        C791610V3n.LIZ.LJII(new C0V4C() { // from class: X.0V4O
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("DoctorManager@a3ba.onEvent$1");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((DoctorManager.ApmListener) it2.next()).onEvent(str, str2);
                }
                C1C7U.LIZIZ("DoctorManager@a3ba.onEvent$1");
            }

            @Override // X.C0V4C
            public final EnumC792960V8s getTaskType() {
                return EnumC792960V8s.LIGHT_WEIGHT;
            }
        });
    }
}
