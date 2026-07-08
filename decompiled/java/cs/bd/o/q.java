package cs.bd.o;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class q {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public final String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public final String LJI = "";
    public final String LJII = "";
    public String LJIIIIZZ = "";
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = 99999;
    public String LJIIL = "";
    public int LJIILIIL = 0;
    public int LJIILJJIL = 0;
    public Map<String, String> LJIILL = new HashMap();
    public Map<String, String> LJIILLIIL = new HashMap();
    public final Map<String, String> LJIIZILJ = new HashMap();
    public Map<String, String> LJIJ = new HashMap();

    public static abstract class a<T extends b> extends q implements b {
        public a(String str, String str2) {
            this.LIZ = str;
            this.LJIIIIZZ = str2;
            this.LJIIJJI = 5;
            if (TextUtils.isEmpty(str) || CardStruct.IStatusCode.DEFAULT.equals(str) || TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("appID or license must be set.");
            }
        }
    }

    public interface b {
    }

    public static String LIZ(Object obj) {
        return (obj == null || !(obj instanceof String)) ? "" : ((String) obj).trim();
    }
}
