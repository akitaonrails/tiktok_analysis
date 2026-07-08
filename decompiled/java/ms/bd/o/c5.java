package ms.bd.o;

import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xtrace.XTrace;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class c5 {
    public static Member LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void a(Method method) {
        try {
            LIZ = method;
            XTrace.replace(LIZ, c5.class.getDeclaredMethod((String) k.a(16777217, 0, 0L, "b4cd92", new byte[]{114, 103}), Object.class, Message.class));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void a1(Object obj, Message message) {
        try {
            LIZIZ.set(true);
            XTrace.callOriginMethod(LIZ, obj, new Object[]{message});
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean a2() {
        return LIZIZ.get();
    }
}
