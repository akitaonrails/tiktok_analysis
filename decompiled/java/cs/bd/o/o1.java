package cs.bd.o;

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
import com.tts.mobsec.matrix.CSProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class o1 {
    public static volatile o1 LIZLLL;
    public long LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public o1(Context context) {
        this.LIZIZ = 0;
        this.LIZJ = 0;
        try {
            this.LIZIZ = C786410Ut5.b4(GoogleApiAvailability.getInstance(), context) == 0 ? 1 : 0;
            this.LIZJ = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 13000000) == 0 ? 1 : 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static o1 LIZ(Context context) {
        if (LIZLLL == null) {
            synchronized (o1.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new o1(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public class a implements InterfaceC835710WqP<AbstractC812730VuR> {
        public final /* synthetic */ List LIZ;

        public a(List list) {
            this.LIZ = list;
        }

        @Override // X.InterfaceC835710WqP
        public final void onSuccess(AbstractC812730VuR abstractC812730VuR) {
            this.LIZ.add(abstractC812730VuR.LIZ());
            this.LIZ.add("");
            CSProxy.a(536870915, 0, o1.this.LIZ, null, this.LIZ.toArray(new String[0]));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public class b implements InterfaceC835730WqR {
        public final /* synthetic */ List LIZ;

        public b(List list) {
            this.LIZ = list;
        }

        @Override // X.InterfaceC835730WqR
        public final void onFailure(Exception exc) {
            String message = exc.getMessage();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Integrity API ERROR! ");
            sbLIZ.append(exc.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ.add("");
            this.LIZ.add(message);
            CSProxy.a(536870915, 0, o1.this.LIZ, null, this.LIZ.toArray(new String[0]));
        }
    }

    public final void LIZIZ(Context context, String str) {
        InterfaceC812720VuQ interfaceC812720VuQLIZ = C837470WtF.LIZ(context);
        ArrayList arrayList = new ArrayList();
        if (this.LIZJ != 0) {
            new C812750VuT();
            if (str != null) {
                C835510Wq5 c835510Wq5LIZ = interfaceC812720VuQLIZ.LIZ(new C812780VuW(str));
                c835510Wq5LIZ.LJFF(new a(arrayList));
                c835510Wq5LIZ.LIZLLL(new b(arrayList));
                return;
            }
            throw new NullPointerException("Null nonce");
        }
        arrayList.add("");
        arrayList.add("Google play is not installed");
        CSProxy.a(536870915, 0, this.LIZ, null, arrayList.toArray(new String[0]));
    }
}
