package ttpobfuscated;

import X.C098200Yq;
import X.C0OGG;
import X.C13LE;
import X.C189200o6;
import X.C796500VMi;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import ttp.orbu.sdk.database.room.TTPRoomDatabase;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class af {
    public static volatile TTPRoomDatabase b;
    public static final af a = new af();
    public static final String c = C13LE.LIZ(af.class).LJI();

    public final void a() {
        synchronized (this) {
            try {
                a.c();
                q3.b.a(q3.a, "Clear DB instance", c, (Throwable) null, 4, (Object) null);
                b = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                a.c();
                q3.b.a(q3.a, "Close and clear DB instance", c, (Throwable) null, 4, (Object) null);
                b = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void c() {
        Object c098200Yq;
        try {
            TTPRoomDatabase tTPRoomDatabase = b;
            c098200Yq = null;
            if (tTPRoomDatabase != null && tTPRoomDatabase.isOpen()) {
                tTPRoomDatabase.close();
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            q3.a aVar = q3.a;
            String str = c;
            aVar.getClass();
            q3.a.c.b("Error closing Room DB", str, thM5exceptionOrNullimpl);
        }
    }

    public final TTPRoomDatabase a(Context context) {
        TTPRoomDatabase tTPRoomDatabaseA = b;
        if (tTPRoomDatabaseA == null) {
            synchronized (this) {
                try {
                    tTPRoomDatabaseA = b;
                    if (tTPRoomDatabaseA == null) {
                        tTPRoomDatabaseA = a.a(context, "ttpDB.db");
                        b = tTPRoomDatabaseA;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return tTPRoomDatabaseA;
    }

    public final TTPRoomDatabase a(Context context, String str) {
        Object c098200Yq;
        try {
            C796500VMi c796500VMiLIZ = C0OGG.LIZ(context, TTPRoomDatabase.class, str);
            c796500VMiLIZ.LIZJ();
            c098200Yq = (TTPRoomDatabase) c796500VMiLIZ.LIZIZ();
            q3.b.a(q3.a, "Built Room DB", c, (Throwable) null, 4, (Object) null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return (TTPRoomDatabase) c098200Yq;
        }
        q3.a aVar = q3.a;
        String str2 = c;
        aVar.getClass();
        q3.a.c.b("Error when creating Room DB", str2, thM5exceptionOrNullimpl);
        context.deleteDatabase(str);
        return a.a(context, str);
    }
}
