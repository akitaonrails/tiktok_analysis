package m3;

import X.C1101530elr;
import X.C1119470fEn;
import X.C1682410tsl;
import X.C1686330tz5;
import X.C1686350tz7;
import X.C830540Wi4;
import X.InterfaceC1685240txK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes30.dex */
public final class b {
    public static final b LIZ = new b();
    public static final float[] LIZIZ = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile C1119470fEn<InterfaceC1685240txK> LIZJ = new C1119470fEn<>((Object) null);
    public static final Object[] LIZLLL;

    static {
        Object[] objArr = new Object[0];
        LIZLLL = objArr;
        synchronized (objArr) {
            try {
                LIZJ.LJFF((int) 115.0f, new C1686330tz5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
                LIZJ.LJFF((int) 130.0f, new C1686330tz5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
                LIZJ.LJFF((int) 150.0f, new C1686330tz5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
                LIZJ.LJFF((int) 180.0f, new C1686330tz5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
                LIZJ.LJFF((int) 200.0f, new C1686330tz5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if ((LIZJ.LJ(0) / 100.0f) - 0.01f <= 1.03f) {
            C1682410tsl.LIZIZ("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static InterfaceC1685240txK LIZ(float f) {
        float fLJ;
        InterfaceC1685240txK interfaceC1685240txKLJIIIIZZ;
        if (f >= 1.03f) {
            LIZ.getClass();
            int i = (int) (f * 100.0f);
            InterfaceC1685240txK interfaceC1685240txKLIZLLL = LIZJ.LIZLLL(i);
            if (interfaceC1685240txKLIZLLL != null) {
                return interfaceC1685240txKLIZLLL;
            }
            C1119470fEn<InterfaceC1685240txK> c1119470fEn = LIZJ;
            if (c1119470fEn.LL) {
                C1101530elr.LIZ(c1119470fEn);
            }
            int iLIZ = C830540Wi4.LIZ(c1119470fEn.LLILZ, i, c1119470fEn.LLILLJJLI);
            if (iLIZ >= 0) {
                return LIZJ.LJIIIIZZ(iLIZ);
            }
            int i2 = (-(iLIZ + 1)) - 1;
            int i3 = i2 + 1;
            if (i3 >= LIZJ.LJII()) {
                C1686330tz5 c1686330tz5 = new C1686330tz5(new float[]{1.0f}, new float[]{f});
                LIZIZ(f, c1686330tz5);
                return c1686330tz5;
            }
            if (i2 < 0) {
                float[] fArr = LIZIZ;
                interfaceC1685240txKLJIIIIZZ = new C1686330tz5(fArr, fArr);
                fLJ = 1.0f;
            } else {
                fLJ = LIZJ.LJ(i2) / 100.0f;
                interfaceC1685240txKLJIIIIZZ = LIZJ.LJIIIIZZ(i2);
            }
            float fLIZ = C1686350tz7.LIZ(0.0f, 1.0f, fLJ, LIZJ.LJ(i3) / 100.0f, f);
            InterfaceC1685240txK interfaceC1685240txKLJIIIIZZ2 = LIZJ.LJIIIIZZ(i3);
            float[] fArr2 = LIZIZ;
            float[] fArr3 = new float[fArr2.length];
            int length = fArr2.length;
            for (int i4 = 0; i4 < length; i4++) {
                float f2 = LIZIZ[i4];
                float fLIZ2 = interfaceC1685240txKLJIIIIZZ.LIZ(f2);
                fArr3[i4] = fLIZ2 + ((interfaceC1685240txKLJIIIIZZ2.LIZ(f2) - fLIZ2) * fLIZ);
            }
            C1686330tz5 c1686330tz52 = new C1686330tz5(LIZIZ, fArr3);
            LIZIZ(f, c1686330tz52);
            return c1686330tz52;
        }
        return null;
    }

    public static void LIZIZ(float f, C1686330tz5 c1686330tz5) {
        synchronized (LIZLLL) {
            try {
                C1119470fEn<InterfaceC1685240txK> c1119470fEnClone = LIZJ.clone();
                LIZ.getClass();
                c1119470fEnClone.LJFF((int) (f * 100.0f), c1686330tz5);
                LIZJ = c1119470fEnClone;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
