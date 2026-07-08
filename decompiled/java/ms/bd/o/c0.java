package ms.bd.o;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c0 {
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
    public final Map<String, String> LJIIL = new HashMap();
    public final Map<String, String> LJIILIIL = new HashMap();

    public static abstract class a<T extends b> extends c0 implements b {
        public a(String str) {
            this.LIZ = str;
            this.LJIIIIZZ = "Zs81WLZ0TYDnPHhokfrih9f2UVKMYsD6ygiN+al3YbsQTM5dSPr+VANPNr2yt/6QZ3JuYhSmDYBLiuwMS3cvrr+1/8cAwLDSGF69eSzBCn1V3+2mBLMP7NPqp1q3bRDYgEewnEm4DNlPCPW5U2nedHmDVvrEKzBMl8RWBPCnBmvNXNMcPonBLsZYQk+XnBO5ZUm5rFr56W5sezAigX8gmCIS9kaPMASRFaEb65F/f8pFvVlEWoxkWkVeUf8Z9pPT0ZaRrezEtk4JvuNwLu0lL1UHdxpc+feECCxfrESn8hKSFDyzg1zQ0YNT+ILxVw34ElmJ30SP74RN/dhjNJ5pDBtlu+RNtU1ebPwnGxtu79WacDkiCJjsmdrzGrGwbQ4nBl8bugOKsWV4FF/60FPwpZ8iZ+M=";
            this.LJIIJJI = 5;
            if (TextUtils.isEmpty(str) || CardStruct.IStatusCode.DEFAULT.equals(str) || TextUtils.isEmpty("Zs81WLZ0TYDnPHhokfrih9f2UVKMYsD6ygiN+al3YbsQTM5dSPr+VANPNr2yt/6QZ3JuYhSmDYBLiuwMS3cvrr+1/8cAwLDSGF69eSzBCn1V3+2mBLMP7NPqp1q3bRDYgEewnEm4DNlPCPW5U2nedHmDVvrEKzBMl8RWBPCnBmvNXNMcPonBLsZYQk+XnBO5ZUm5rFr56W5sezAigX8gmCIS9kaPMASRFaEb65F/f8pFvVlEWoxkWkVeUf8Z9pPT0ZaRrezEtk4JvuNwLu0lL1UHdxpc+feECCxfrESn8hKSFDyzg1zQ0YNT+ILxVw34ElmJ30SP74RN/dhjNJ5pDBtlu+RNtU1ebPwnGxtu79WacDkiCJjsmdrzGrGwbQ4nBl8bugOKsWV4FF/60FPwpZ8iZ+M=")) {
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
