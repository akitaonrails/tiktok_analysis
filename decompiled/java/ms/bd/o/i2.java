package ms.bd.o;

import X.C08RN;
import X.C0VSJ;
import X.C0WZX;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import ms.bd.o.w2;

/* JADX INFO: loaded from: classes4.dex */
public class i2 implements SensorEventListener {
    public static volatile i2 LLJJIII;
    public HandlerThread LLILLJJLI;
    public long LLIZLLLIL;
    public final SensorManager LLJI;
    public long LLJJ;
    public final w2 LLJJI;
    public BPEAHandler LL = null;
    public boolean LLILLL = true;
    public boolean LLILZ = false;
    public boolean LLILZIL = false;
    public final LinkedList<d> LLILZLL = new LinkedList<>();
    public boolean LLIZ = false;
    public int LLJ = 0;
    public float[] LLJIJIL = new float[3];
    public float[] LLJILJIL = new float[3];
    public float[] LLJILJILJ = new float[3];
    public float[] LLJILLL = new float[3];

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i2.this.LJ();
                i2.this.LLILLL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void LIZ() {
            boolean z;
            i2 i2Var;
            boolean z2;
            synchronized (i2.this.LLILZLL) {
                try {
                    z = i2.this.LLILZLL.size() % 10 == 0;
                } finally {
                }
            }
            if (!i2.this.LLILZIL || (z && s2.LIZ() != 1)) {
                k.a(16777217, 0, 0L, "46962f", new byte[]{38, 60, 79, 65, 6, 49, 4, 18, 102, 117, 42, 38, 10, 75, 3, 49, 53, 22, 107, 109, 34, 38, 69, 87, 3, 117});
                i2.this.LIZLLL();
                return;
            }
            long time = i2.this.LLJJ != 0 ? (new Date().getTime() / 1000) + ((i2.this.LLJJ - SystemClock.elapsedRealtimeNanos()) / 1000000000) : new Date().getTime() / 1000;
            i2 i2Var2 = i2.this;
            d dVar = new d();
            dVar.LIZ = time;
            float[] fArr = i2Var2.LLJIJIL;
            float[] fArr2 = dVar.LIZIZ;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float[] fArr3 = i2.this.LLJILJIL;
            float[] fArr4 = dVar.LIZJ;
            System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            float[] fArr5 = i2.this.LLJILJILJ;
            float[] fArr6 = dVar.LIZLLL;
            System.arraycopy(fArr5, 0, fArr6, 0, fArr6.length);
            float[] fArr7 = i2.this.LLJILLL;
            float[] fArr8 = dVar.LJ;
            System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
            synchronized (i2.this.LLILZLL) {
                try {
                    i2.this.LLILZLL.add(dVar);
                    int size = i2.this.LLILZLL.size();
                    i2Var = i2.this;
                    z2 = size < i2Var.LLJ;
                } finally {
                }
            }
            if (z2) {
                C786410Ut5.LJLIIL(i2Var.LLIZLLLIL, i2Var.LL, this);
            } else {
                i2Var.LIZLLL();
                i2.this.LJFF();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public class d {
        public long LIZ;
        public final float[] LIZIZ = new float[3];
        public final float[] LIZJ = new float[3];
        public final float[] LIZLLL = new float[3];
        public final float[] LJ = new float[3];
    }

    public static String LIZ(d dVar) {
        return C786410Ut5.k4(Locale.ENGLISH, (String) k.a(16777217, 0, 0L, "abfb1a", new byte[]{53, 100, 89, 83, 64, 36, 100, 15, 114, 124, 34, 102, 89, 83, 64, 36, 100, 15, 114, 124, 34, 102, 89, 83, 64, 36, 100, 15, 114, 124, 34, 102, 89, 83, 64, 36, 100, 15, 114, 124, 34, 102, 89, 83, 64, 36, 100, 15, 114, 124, 34, 102, 89, 83, 64, 36, 100, 15, 114, 124, 34, 102}), new Object[]{Long.valueOf(dVar.LIZ), Float.valueOf(dVar.LIZIZ[0]), Float.valueOf(dVar.LIZIZ[1]), Float.valueOf(dVar.LIZIZ[2]), Float.valueOf(dVar.LIZJ[0]), Float.valueOf(dVar.LIZJ[1]), Float.valueOf(dVar.LIZJ[2]), Float.valueOf(dVar.LIZLLL[0]), Float.valueOf(dVar.LIZLLL[1]), Float.valueOf(dVar.LIZLLL[2]), Float.valueOf(dVar.LJ[0]), Float.valueOf(dVar.LJ[1]), Float.valueOf(dVar.LJ[2])});
    }

    public static i2 LIZIZ(Context context) {
        if (LLJJIII == null) {
            synchronized (k2.class) {
                try {
                    if (LLJJIII == null) {
                        LLJJIII = new i2(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJJIII;
    }

    public final synchronized void LIZJ(int i) {
        try {
            SensorManager sensorManager = this.LLJI;
            if (sensorManager != null) {
                Sensor sensorLJJL = C2204961BRm.LJJL(sensorManager, i, new C0WZX("eSwwXgZ0UITVBw==", null));
                BPEAHandler bPEAHandler = this.LL;
                if (bPEAHandler != null) {
                    if (!C2204961BRm.LJJLIIIIJ(this.LLJI, this, sensorLJJL, 3, bPEAHandler, new C0WZX("eSwwXgZ0UITVBw==", null))) {
                        return;
                    }
                } else if (!C2204961BRm.LJJLIIIJ(this.LLJI, this, sensorLJJL, 3, new C0WZX("eSwwXgZ0UITVBw==", null))) {
                    return;
                }
                this.LLILZIL = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized void LIZLLL() {
        synchronized (this) {
            try {
                try {
                    SensorManager sensorManager = this.LLJI;
                    if (sensorManager != null && this.LLILZIL) {
                        C2204961BRm.LJJLIIIJJI(sensorManager, this, new C0WZX("eSwwXgZ0UITVBw==", null));
                        this.LLILZIL = false;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILZ = false;
    }

    public final void LJ() {
        boolean z;
        synchronized (this.LLILZLL) {
            try {
                z = this.LLILZLL.size() % 10 == 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z && s2.LIZ() != 1) {
            k.a(16777217, 0, 0L, "2bdfc4", new byte[]{32, 104, 18, 17, 87, 99, 2, 70, 59, 37, 44, 114, 87, 27, 82, 99, 51, 66, 54, 61, 36, 114, 24, 7, 82, 39});
            return;
        }
        LIZJ(1);
        LIZJ(9);
        LIZJ(4);
        LIZJ(11);
        this.LLILZ = true;
        C786410Ut5.LJLIIL(this.LLIZLLLIL, this.LL, new c());
    }

    public final synchronized void LJFF() {
        if (this.LLILLJJLI.isAlive()) {
            this.LLILLJJLI.quit();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) throws Throwable {
        this.LLJJ = sensorEvent.timestamp;
        int iLJJLIIIJLJLI = C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("eSwwXgZ0UITVBw==", null));
        if (iLJJLIIIJLJLI == 1) {
            this.LLJIJIL = sensorEvent.values;
            return;
        }
        if (iLJJLIIIJLJLI == 4) {
            this.LLJILJILJ = sensorEvent.values;
        } else if (iLJJLIIIJLJLI == 9) {
            this.LLJILJIL = sensorEvent.values;
        } else if (iLJJLIIIJLJLI == 11) {
            this.LLJILLL = sensorEvent.values;
        }
    }

    public class a implements w2.a {
        public a() {
        }

        @Override // ms.bd.o.w2.a
        public final Object a(String str) {
            d dVar = new d();
            String[] strArrSplit = str.split((String) k.a(16777217, 0, 0L, "a078ed", new byte[]{60}));
            if (strArrSplit.length < 13) {
                return null;
            }
            dVar.LIZ = CastIntegerProtector.parseInt(strArrSplit[0]);
            dVar.LIZIZ[0] = CastFloatProtector.parseFloat(strArrSplit[1]);
            dVar.LIZIZ[1] = CastFloatProtector.parseFloat(strArrSplit[2]);
            dVar.LIZIZ[2] = CastFloatProtector.parseFloat(strArrSplit[3]);
            dVar.LIZJ[0] = CastFloatProtector.parseFloat(strArrSplit[4]);
            dVar.LIZJ[1] = CastFloatProtector.parseFloat(strArrSplit[5]);
            dVar.LIZJ[2] = CastFloatProtector.parseFloat(strArrSplit[6]);
            dVar.LIZLLL[0] = CastFloatProtector.parseFloat(strArrSplit[7]);
            dVar.LIZLLL[1] = CastFloatProtector.parseFloat(strArrSplit[8]);
            dVar.LIZLLL[2] = CastFloatProtector.parseFloat(strArrSplit[9]);
            dVar.LJ[0] = CastFloatProtector.parseFloat(strArrSplit[10]);
            dVar.LJ[1] = CastFloatProtector.parseFloat(strArrSplit[11]);
            dVar.LJ[2] = CastFloatProtector.parseFloat(strArrSplit[12]);
            return dVar;
        }

        @Override // ms.bd.o.w2.a
        public final String a(Object obj) {
            i2.this.getClass();
            return i2.LIZ((d) obj);
        }
    }

    public i2(Context context) throws Throwable {
        Object obj;
        Context applicationContext = null;
        this.LLJI = null;
        if (context != null) {
            this.LLJI = (SensorManager) C786410Ut5.H2(context, (String) k.a(16777217, 0, 0L, "5df15c", new byte[]{55, 99, 27, 86, 5, 102}));
        }
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        this.LLJJI = new w2(new C0VSJ(file, (String) k.a(16777217, 0, 0L, "09129f", new byte[]{111, 54, 81, 75, 57, 114, 50, 27, 104, 103})), (String) k.a(16777217, 0, 0L, "a64ebc", new byte[]{62, 57, 72}), new a());
    }
}
