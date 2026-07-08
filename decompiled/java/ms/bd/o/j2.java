package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes4.dex */
public class j2 implements SensorEventListener {
    public static volatile j2 LLJIJIL;
    public HandlerThread LLILLJJLI;
    public final SensorManager LLILZ;
    public BPEAHandler LL = null;
    public boolean LLILLL = false;
    public float[] LLILZIL = new float[3];
    public float[] LLILZLL = new float[3];
    public float[] LLIZ = new float[3];
    public final float[] LLIZLLLIL = new float[3];
    public float[] LLJ = new float[3];
    public float[] LLJI = new float[3];

    public j2(Context context) {
        this.LLILZ = null;
        if (context != null) {
            this.LLILZ = (SensorManager) C786410Ut5.H2(context, "sensor");
        }
    }

    public static j2 LIZ(Context context) {
        if (LLJIJIL == null) {
            synchronized (k2.class) {
                try {
                    if (LLJIJIL == null) {
                        LLJIJIL = new j2(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJIJIL;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) throws Throwable {
        int iLJJLIIIJLJLI = C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("eSwwXgZ0UITWBw==", null));
        if (iLJJLIIIJLJLI == 1) {
            this.LLJ = sensorEvent.values;
            return;
        }
        if (iLJJLIIIJLJLI == 2) {
            this.LLJI = sensorEvent.values;
            return;
        }
        if (iLJJLIIIJLJLI == 4) {
            this.LLIZ = sensorEvent.values;
            return;
        }
        switch (iLJJLIIIJLJLI) {
            case BdTuring.TYPE_ECAF /* 9 */:
                this.LLILZLL = sensorEvent.values;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                this.LLILZIL = sensorEvent.values;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                float[] fArr = new float[9];
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                SensorManager.getOrientation(fArr, new float[3]);
                this.LLIZLLLIL[0] = (float) Math.toDegrees(r5[0]);
                this.LLIZLLLIL[1] = (float) Math.toDegrees(r5[1]);
                this.LLIZLLLIL[2] = (float) Math.toDegrees(r5[2]);
                break;
        }
    }
}
