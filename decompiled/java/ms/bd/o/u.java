package ms.bd.o;

import X.C786410Ut5;
import android.content.Context;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public static void LIZ(Context context, String str) throws Throwable {
        v vVar = new v(new x(), new s());
        if (str != null && str.length() != 0) {
            C786410Ut5.k4(Locale.US, "Beginning load of %s...", new Object[]{str});
            vVar.LIZIZ(context, str, null);
            return;
        }
        throw new IllegalArgumentException("Given library is either null or empty");
    }
}
