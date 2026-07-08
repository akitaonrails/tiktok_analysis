package com.ss.android.ugc.aweme.ext;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import X.C2332509Bz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class BooleanTypeAdapter extends TypeAdapter<Boolean> {
    @Override // com.google.gson.TypeAdapter
    public final Boolean read(C09CU c09cu) {
        int i;
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ == null) {
            i = -1;
        } else {
            i = C2332509Bz.LIZ[c09d6LJJLIIIJ.ordinal()];
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String strLJJJZ = c09cu.LJJJZ();
                    if (!u.LJIJI(strLJJJZ, "null", true)) {
                        return Boolean.valueOf(Boolean.parseBoolean(strLJJJZ));
                    }
                    return null;
                }
                boolean z2 = false;
                try {
                    if (c09cu.LJJIZ() == 0) {
                        z = false;
                    }
                    z2 = z;
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected a boolean or int but was ");
                    sbLIZ.append(c09cu.LJJIL());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                return Boolean.valueOf(z2);
            }
            c09cu.LJJJJJL();
            return null;
        }
        return Boolean.valueOf(c09cu.LJJ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Boolean bool) throws IOException {
        Boolean bool2 = bool;
        if (bool2 == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LJJJJJL(bool2.booleanValue());
        }
    }
}
