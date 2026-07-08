package cs.bd.o;

import X.C0VSJ;
import X.C2179971ATj;
import X.C786410Ut5;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import cs.bd.o.i;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class j {
    public final Set<String> LIZ = new HashSet();
    public final i.b LIZIZ;
    public final i.a LIZJ;

    /* JADX INFO: loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public j(i.b bVar, h hVar) {
        this.LIZIZ = bVar;
        this.LIZJ = hVar;
    }

    public final C0VSJ LIZ(Context context, String str, String str2) {
        boolean z;
        this.LIZIZ.getClass();
        String strLIZ = l.LIZ(str);
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C0VSJ(context.getDir("lib", 0), strLIZ);
        }
        return new C0VSJ(context.getDir("lib", 0), strLIZ + e3.d + str2);
    }

    public final void LIZIZ(Context context, String str, String str2) {
        String str3;
        if (((HashSet) this.LIZ).contains(str)) {
            C786410Ut5.k4(Locale.US, "%s already loaded previously!", new Object[]{str});
            return;
        }
        try {
            this.LIZIZ.getClass();
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            ((HashSet) this.LIZ).add(str);
            C786410Ut5.k4(Locale.US, "%s (%s) was loaded normally!", new Object[]{str, str2});
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            Object[] objArr = {Log.getStackTraceString(e)};
            Locale locale = Locale.US;
            C786410Ut5.k4(locale, "Loading the library normally failed: %s", objArr);
            C786410Ut5.k4(locale, "%s (%s) was not loaded normally, re-linking...", new Object[]{str, str2});
            C0VSJ c0vsjLIZ = LIZ(context, str, str2);
            if (!c0vsjLIZ.exists()) {
                File dir = context.getDir("lib", 0);
                C0VSJ c0vsjLIZ2 = LIZ(context, str, str2);
                this.LIZIZ.getClass();
                File[] fileArrListFiles = dir.listFiles(new k(l.LIZ(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(c0vsjLIZ2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                i.a aVar = this.LIZJ;
                this.LIZIZ.getClass();
                if (Build.SUPPORTED_ABIS.length <= 0 && (str3 = Build.CPU_ABI2) != null) {
                    str3.length();
                }
                this.LIZIZ.getClass();
                l.LIZ(str);
                aVar.getClass();
            }
            i.b bVar = this.LIZIZ;
            String absolutePath = c0vsjLIZ.getAbsolutePath();
            bVar.getClass();
            System.load(absolutePath);
            ((HashSet) this.LIZ).add(str);
            C786410Ut5.k4(Locale.US, "%s (%s) was re-linked!", new Object[]{str, str2});
        }
    }
}
