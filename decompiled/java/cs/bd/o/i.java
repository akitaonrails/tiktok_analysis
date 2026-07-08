package cs.bd.o;

import X.C786410Ut5;
import android.content.Context;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public static void LIZ(Context context, String str) {
        j jVar = new j(new l(), new h());
        if (context != null) {
            if (str != null && str.length() != 0) {
                C786410Ut5.k4(Locale.US, "Beginning load of %s...", new Object[]{str});
                jVar.LIZIZ(context, str, null);
                return;
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
