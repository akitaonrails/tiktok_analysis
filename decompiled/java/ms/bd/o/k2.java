package ms.bd.o;

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
public final class k2 implements SensorEventListener {
    public static volatile k2 LLILZLL;
    public final SensorManager LL;
    public int LLILLJJLI;
    public int LLILLL = 0;
    public float[] LLILZ = new float[3];
    public List<JSONArray> LLILZIL = new ArrayList();

    static {
        new DecimalFormat((String) k.a(16777217, 0, 0L, "6eb351", new byte[]{119, 41, 65}));
        LLILZLL = null;
    }

    public k2(Context context) {
        this.LL = null;
        if (context != null) {
            this.LL = (SensorManager) C786410Ut5.H2(context, (String) k.a(16777217, 0, 0L, "781041", new byte[]{53, 63, 76, 87, 4, 52}));
        }
    }

    public static k2 LIZ(Context context) {
        if (LLILZLL == null) {
            synchronized (k2.class) {
                try {
                    if (LLILZLL == null) {
                        LLILZLL = new k2(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILZLL;
    }

    public final synchronized void LIZIZ() {
        try {
            SensorManager sensorManager = this.LL;
            if (sensorManager != null) {
                int i = this.LLILLJJLI - 1;
                this.LLILLJJLI = i;
                if (i == 0) {
                    C2204961BRm.LJJLIIIJJI(sensorManager, this, new C0WZX("eSwwXgZ0UITXBw==", null));
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
        this.LLILZ = sensorEvent.values;
        this.LLILLL = 1;
    }
}
