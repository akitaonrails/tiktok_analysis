package nz6;

import X.C099G;
import X.C0PEM;
import X.C1857650yRP;
import X.C1860140yVQ;
import X.C1860220yVY;
import X.C1860290yVf;
import X.C18ZY;
import X.C21172817tO;
import X.C21305018Zc;
import X.C21379518ld;
import X.C21379618le;
import X.C21419418s4;
import X.C21419718s7;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C309110C9t;
import X.C372001cU;
import X.C689250R1v;
import X.InterfaceC1631630sYr;
import X.InterfaceC1857660yRQ;
import X.InterfaceC1860060yVI;
import X.InterfaceC1860190yVV;
import X.InterfaceC1860230yVZ;
import X.InterfaceC21419818s8;
import X.InterfaceC328690CuZ;
import X.InterfaceC418280Gag;
import android.app.Application;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public final class a implements InterfaceC328690CuZ {
    public C099G LIZIZ;

    @Override // X.InterfaceC328690CuZ
    public final void LIZ(Context context) {
        if (this.LIZIZ != null) {
            return;
        }
        this.LIZIZ = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21172817tO(context, null), 3);
    }

    @Override // X.InterfaceC328690CuZ
    public final void LIZJ(int i) {
        C689250R1v.LIZ.set(i);
    }

    @Override // X.InterfaceC328690CuZ
    public final void LIZLLL(InterfaceC1631630sYr<? super CharSequence, ? super Boolean, ? super Map<String, ? extends Object>, ? super Boolean, ? extends InterfaceC418280Gag> interfaceC1631630sYr) {
        C21379618le.LJ = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC328690CuZ
    public final void LJ(Application application, final C309110C9t c309110C9t) {
        C18ZY.LIZ = new WeakReference<>(application);
        C21419718s7 c21419718s7 = C21419718s7.LIZ;
        C21419718s7.LIZIZ = new InterfaceC21419818s8() { // from class: X.0C9s
            @Override // X.InterfaceC21419818s8
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC21419818s8
            public final int LIZIZ() {
                return 50;
            }

            @Override // X.InterfaceC21419818s8
            public final List<String> LIZJ() {
                return null;
            }

            @Override // X.InterfaceC21419818s8
            public final int LIZLLL() {
                return 0;
            }

            @Override // X.InterfaceC21419818s8
            public final boolean LJ() {
                return true;
            }

            @Override // X.InterfaceC21419818s8
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC21419818s8
            public final boolean LJI() {
                return true;
            }

            @Override // X.InterfaceC21419818s8
            public final Function2<String, Object, Unit> LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC21419818s8
            public final boolean LJIIJ() {
                return false;
            }

            @Override // X.InterfaceC21419818s8
            public final String LJIIJJI() {
                return null;
            }

            @Override // X.InterfaceC21419818s8
            public final void LJIIL() {
            }

            @Override // X.InterfaceC21419818s8
            public final boolean LJIILIIL() {
                return false;
            }

            @Override // X.InterfaceC21419818s8
            public final List<InterfaceC1859860yUy> LJII() {
                return c309110C9t.LIZ;
            }

            @Override // X.InterfaceC21419818s8
            public final boolean LJIIIZ() {
                return ((Boolean) C271660Akm.LIZ.getValue()).booleanValue();
            }
        };
        boolean zLJI = c21419718s7.LJI();
        InterfaceC1860190yVV interfaceC1860190yVVLIZ = C1860290yVf.LIZ();
        if (interfaceC1860190yVVLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("==>optimized=");
            sbLIZ.append(zLJI);
            interfaceC1860190yVVLIZ.d("ASTModifier", C2188811AlT.LIZIZ(sbLIZ));
        }
        boolean zLJ = c21419718s7.LJ();
        InterfaceC1860190yVV interfaceC1860190yVVLIZ2 = C1860290yVf.LIZ();
        if (interfaceC1860190yVVLIZ2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("==>latex optimized=");
            sbLIZ2.append(zLJ);
            interfaceC1860190yVVLIZ2.d("ASTModifier", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C21305018Zc.LIZ = zLJ;
        C1860220yVY.LIZIZ = new InterfaceC1860230yVZ() { // from class: X.18Zb
            @Override // X.InterfaceC1860230yVZ
            public final int LIZ() {
                return 4;
            }
        };
        C1857650yRP.LIZIZ = new InterfaceC1857660yRQ() { // from class: X.18ZZ
            @Override // X.InterfaceC1857660yRQ
            public final void ensureNotReachHere(Throwable th, String str) {
            }
        };
        C18ZY.LIZIZ = new InterfaceC1860190yVV() { // from class: X.18Za
            @Override // X.InterfaceC1860190yVV
            public final void d(String str, String str2) {
            }

            @Override // X.InterfaceC1860190yVV
            public final void e(String str, String str2) {
            }

            @Override // X.InterfaceC1860190yVV
            public final void i(String str, String str2) {
            }
        };
    }

    @Override // X.InterfaceC328690CuZ
    public final C1860140yVQ LIZIZ(InterfaceC1860060yVI interfaceC1860060yVI, String str, C21419418s4 c21419418s4, Map map) throws Throwable {
        int maxWidth;
        TextView textViewLJIJI;
        if (interfaceC1860060yVI == null || (textViewLJIJI = interfaceC1860060yVI.LJIJI()) == null || (maxWidth = textViewLJIJI.getMaxWidth()) < 0) {
            maxWidth = 0;
        }
        try {
            C099G c099g = this.LIZIZ;
            if (c099g != null && !c099g.isCompleted()) {
                C23250099c.LJ(C23271099x.INSTANCE, new C372001cU(c099g, null));
            }
            return C21379518ld.LIZ(interfaceC1860060yVI, str, maxWidth, c21419418s4, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1857650yRP c1857650yRP = C1857650yRP.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ErrorParseMd]text: ");
            sbLIZ.append(str);
            c1857650yRP.ensureNotReachHere(e, C2188811AlT.LIZIZ(sbLIZ));
            return C21379518ld.LIZIZ(str);
        }
    }
}
