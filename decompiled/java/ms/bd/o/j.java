package ms.bd.o;

import X.C0VSJ;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        boolean z;
        b.LIZ(65537, new c());
        b.LIZ(65538, new d());
        b.LIZ(65539, new e());
        b.LIZ(65540, new f());
        b.LIZ(65541, new g());
        b.LIZ(65542, new h());
        b.LIZ(65543, new i());
        b.a qVar = y.LIZJ() ? new q() : new p();
        b.LIZ(196609, qVar);
        b.LIZ(196610, qVar);
        b.LIZ(196611, qVar);
        try {
            Class.forName(new String[]{k.a(16777217, 0, 0L, "6a0a9f", new byte[]{36, 108, 78, 91, 4, 104, 33, 69, 101, 48, 41, 96, 70, 91, 0, 99, 52, 77, 118, 62, 53, 104, 13, 22, 9, 99, 48, 14, 114, 53, 44, 110, 76, 27, 15, 101, 58, 82, 47, 2, 3, 72, 110, 26, 8, 120, 33, 79, 115, 4, 51, 106, 79, 6})}[0]);
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            z = false;
        }
        m lVar = !(true & z) ? new l() : new n();
        synchronized (m.class) {
            m.LIZ = lVar;
        }
        b.LIZ(131073, lVar);
        b.LIZ(131074, lVar);
    }

    public static boolean LIZIZ(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new C0VSJ(str2).mkdirs();
                for (String str3 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((String) k.a(16777217, 0, 0L, "0cb347", new byte[]{110}));
                    sb.append(str3);
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append((String) k.a(16777217, 0, 0L, "2ae3af", new byte[]{108}));
                    sb2.append(str3);
                    LIZIZ(context, string, sb2.toString());
                }
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            k.a(16777217, 0, 0L, "83c431", new byte[]{42, 48, 22});
            return false;
        }
    }
}
