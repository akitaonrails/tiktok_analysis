package ms.bd.o;

import X.AbstractC812730VuR;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C812750VuT;
import X.C812780VuW;
import X.C835510Wq5;
import X.C837470WtF;
import X.InterfaceC812720VuQ;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class r2 {
    public static volatile r2 LIZJ;
    public final int LIZ;
    public final int LIZIZ;

    public r2(Context context) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        try {
            this.LIZ = C786410Ut5.b4(GoogleApiAvailability.getInstance(), context) == 0 ? 1 : 0;
            this.LIZIZ = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 13000000) == 0 ? 1 : 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            k.a(16777217, 0, 0L, "60f6d2", new byte[]{50, 60, 28, 86, 72, 101, 60, 31, 62, 114, 103, 55, 13, 65, 94, 53, 33, 24, 56, 104});
        }
    }

    public static r2 LIZ(Context context) {
        if (LIZJ == null) {
            synchronized (r2.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new r2(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public class a implements InterfaceC835710WqP<AbstractC812730VuR> {
        public final /* synthetic */ List LIZ;
        public final /* synthetic */ long LIZIZ;

        public a(List list, long j) {
            this.LIZ = list;
            this.LIZIZ = j;
        }

        @Override // X.InterfaceC835710WqP
        public final void onSuccess(AbstractC812730VuR abstractC812730VuR) {
            String strLIZ = abstractC812730VuR.LIZ();
            k.a(16777217, 0, 0L, "dec53b", new byte[]{92, 105, 4, 68, 11, 103, 110, 80, 43, 37, 84, 87, 57, 1, 35, 94, 38});
            this.LIZ.add(strLIZ);
            this.LIZ.add("");
            k.a(536870915, 0, this.LIZIZ, null, this.LIZ.toArray(new String[0]));
        }
    }

    public class b implements InterfaceC835730WqR {
        public final /* synthetic */ List LIZ;
        public final /* synthetic */ long LIZIZ;

        public b(List list, long j) {
            this.LIZ = list;
            this.LIZIZ = j;
        }

        @Override // X.InterfaceC835730WqR
        public final void onFailure(Exception exc) {
            String message = exc.getMessage();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) k.a(16777217, 0, 0L, "6449ae", new byte[]{14, 56, 83, 72, 89, 96, 60, 1, 124, 41, 6, 6, 110, 13, 123, 64, 7, 58, 87, 40, 103}));
            sbLIZ.append(exc.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ.add("");
            this.LIZ.add(message);
            k.a(536870915, 0, this.LIZIZ, null, this.LIZ.toArray(new String[0]));
        }
    }

    public final void LIZIZ(Context context, String str, long j) {
        InterfaceC812720VuQ interfaceC812720VuQLIZ = C837470WtF.LIZ(context);
        ArrayList arrayList = new ArrayList();
        if (this.LIZIZ != 0) {
            k.a(16777217, 0, 0L, "938f3a", new byte[]{27, 52, 69, 22, 5, 120, 61, 82, 64, 56, 60, 52, 76, 0, 5, 98, 35, 82, 72, 6, 1, 113, 89, 23, 29, 99, 63, 1, 125, 120});
            new C812750VuT();
            if (str != null) {
                C835510Wq5 c835510Wq5LIZ = interfaceC812720VuQLIZ.LIZ(new C812780VuW(str));
                c835510Wq5LIZ.LJFF(new a(arrayList, j));
                c835510Wq5LIZ.LIZLLL(new b(arrayList, j));
                return;
            }
            throw new NullPointerException("Null nonce");
        }
    }
}
