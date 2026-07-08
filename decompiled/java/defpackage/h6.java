package defpackage;

import X.C2188811AlT;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class h6 {
    public static final h6 LIZ = new h6();
    public static boolean LIZIZ;

    public static Pair LIZ(Context context, String str) {
        try {
            return new Pair(Boolean.TRUE, new BufferedReader(new InputStreamReader(context.getAssets().open(str))).readLine());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Boolean bool = Boolean.FALSE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("e: ");
            sbLIZ.append(e.getMessage());
            return new Pair(bool, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
