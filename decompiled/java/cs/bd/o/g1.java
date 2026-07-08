package cs.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements SensorEventListener {
    public static volatile g1 LLIZLLLIL;
    public final SensorManager LL;
    public int LLILLJJLI;
    public int LLILLL = 0;
    public float[] LLILZ = new float[3];
    public float[] LLILZIL = new float[3];
    public final List<JSONArray> LLILZLL = new ArrayList();
    public final List<JSONArray> LLIZ = new ArrayList();

    static {
        new DecimalFormat("0.0");
        LLIZLLLIL = null;
    }

    public g1(Context context) {
        this.LL = null;
        Context contextN3 = C786410Ut5.N3(context);
        if (contextN3 != null) {
            this.LL = (SensorManager) C786410Ut5.H2(contextN3, "sensor");
        }
    }

    public static g1 LIZ(Context context) {
        if (LLIZLLLIL == null) {
            synchronized (g1.class) {
                try {
                    if (LLIZLLLIL == null) {
                        LLIZLLLIL = new g1(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZLLLIL;
    }

    public static void LIZIZ(List list) {
        try {
            ArrayList arrayList = (ArrayList) list;
            int size = arrayList.size();
            if (size > 20) {
                ArrayList arrayList2 = new ArrayList(arrayList.subList(size - 10, size));
                arrayList.clear();
                arrayList.addAll(arrayList2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final synchronized void LIZJ() {
        try {
            SensorManager sensorManager = this.LL;
            if (sensorManager != null) {
                int i = this.LLILLJJLI - 1;
                this.LLILLJJLI = i;
                if (i == 0) {
                    C2204961BRm.LJJLIIIJJI(sensorManager, this, new C0WZX("dywwXgZ0UITbBA==", null));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        if (C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dywwXgZ0UITbBA==", null)) == 1) {
            this.LLILZ = sensorEvent.values;
        } else if (C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dywwXgZ0UITbBA==", null)) != 4) {
            return;
        } else {
            this.LLILZIL = sensorEvent.values;
        }
        this.LLILLL = 1;
    }
}
