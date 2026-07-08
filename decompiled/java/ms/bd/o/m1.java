package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, (String) k.a(16777217, 0, 0L, "d39589", new byte[]{118, 62, 68, 79, 2, 45, 115, 27, 126, 108, 97, 40}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) k.a(16777217, 0, 0L, "655c4e", new byte[]{32, 50, 82, 54, 8, 102, 60, 2, 97, 29, 34, 35, 81, 24, 25, 121, 28, 26, 98, 60}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) C2204961BRm.a0(declaredMethod, connectivityManager, new Object[0], new C0WZX("eSwwXgZ0UITRBA==", null));
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) k.a(16777217, 0, 0L, "446499", new byte[]{44, 37, 100, 86, 7, 39, 59, 20, 101, 104, 32}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) C2204961BRm.a0(declaredMethod2, networkInfo, new Object[0], new C0WZX("eSwwXgZ0UITRBA==", null))).booleanValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Boolean.FALSE;
    }
}
