package com.bytedance.bpea.transmit;

import X.C0W9U;
import X.C0WP5;
import X.C0WSH;
import X.C2188811AlT;
import X.C838920Wva;
import X.C838990Wvh;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class StackManager {
    public static boolean LIZLLL;
    public static double LJII;
    public static String LJIIIIZZ;
    public static boolean LJIIJ;
    public static int LJIIJJI;
    public static Function0<Boolean> LJIILIIL;
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static final long LIZJ = System.currentTimeMillis();
    public static int LJ = 5;
    public static final int LJFF = 2;
    public static int LJI = 1;
    public static boolean LJIIIZ = true;
    public static final Thread LJIIL = Looper.getMainLooper().getThread();

    public static final class SampleRegister implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            int i = StackManager.LIZ;
            return StackManager.LIZLLL;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            StackManager.LIZ = i;
        }
    }

    public static final class StackRegister implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            int i = StackManager.LIZ;
            return StackManager.LIZLLL;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            StackManager.LIZIZ = i;
        }
    }

    public static boolean LIZ() {
        Function0<Boolean> function0;
        return LJIIJ ? LIZLLL && ((function0 = LJIILIIL) == null || !function0.invoke().booleanValue()) : LIZLLL;
    }

    public static boolean LIZLLL() {
        Boolean bool;
        if (!C0WP5.LIZ || !LIZ() || !LJIIIZ) {
            return false;
        }
        int i = LJI;
        if (i == 0) {
            return LIZ();
        }
        if (i != 1) {
            return i == 2 && C0W9U.LIZLLL(LIZIZ) != null;
        }
        C838990Wvh c838990Wvh = C838990Wvh.LIZ;
        int i2 = LIZ;
        c838990Wvh.getClass();
        Object objLIZLLL = C0W9U.LIZLLL(i2);
        if (!(objLIZLLL instanceof Boolean) || (bool = (Boolean) objLIZLLL) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static C0WSH LIZIZ(boolean z) {
        int i;
        C838920Wva c838920Wva;
        List listLIZJ = LIZJ(z);
        boolean z2 = true;
        int size = 0;
        if (!z ? listLIZJ == null || ((ArrayList) listLIZJ).size() <= 0 : listLIZJ == null || ((ArrayList) listLIZJ).size() <= 1) {
            z2 = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strLIZIZ = LJIIIIZZ;
            if (strLIZIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("v_");
                sbLIZ.append(LJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            jSONObject.put("stack_source", strLIZIZ);
            if (!LIZ()) {
                i = 0;
            } else {
                Object objLIZLLL = C0W9U.LIZLLL(LIZIZ);
                if ((objLIZLLL instanceof C838920Wva) && (c838920Wva = (C838920Wva) objLIZLLL) != null) {
                    i = c838920Wva.LIZJ;
                } else {
                    i = 0;
                }
                if (z) {
                    i++;
                }
            }
            jSONObject.put("origin_stack_depth", i);
            if (listLIZJ != null) {
                size = ((ArrayList) listLIZJ).size();
            }
            jSONObject.put("uploaded_stack_depth", size);
            jSONObject.put("stack_capture_count", LJIIJJI);
            jSONObject.put("cold_launch_time", (System.currentTimeMillis() - LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            jSONObject.put("cross_stack_sample_rate", LJII);
            jSONObject.put("enable_return_sample_status", LJIIIZ);
            jSONObject.put("is_hit_sample", LIZLLL());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new C0WSH(listLIZJ, jSONObject, z2);
    }

    public static List LIZJ(boolean z) {
        Throwable[] thArr;
        C838920Wva c838920Wva = null;
        if (!LIZ()) {
            return null;
        }
        C838990Wvh c838990Wvh = C838990Wvh.LIZ;
        int i = LIZIZ;
        c838990Wvh.getClass();
        Object objLIZLLL = C0W9U.LIZLLL(i);
        if (objLIZLLL instanceof C838920Wva) {
            c838920Wva = (C838920Wva) objLIZLLL;
        }
        ArrayList arrayList = new ArrayList();
        if (c838920Wva != null && (thArr = c838920Wva.LIZ) != null) {
            for (Throwable th : thArr) {
                if (th != null) {
                    arrayList.add(th);
                }
            }
        }
        if (z) {
            arrayList.add(new Throwable());
        }
        return arrayList;
    }
}
