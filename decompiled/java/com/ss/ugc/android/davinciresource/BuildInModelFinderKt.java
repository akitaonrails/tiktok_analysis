package com.ss.ugc.android.davinciresource;

import X.C2188811AlT;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: loaded from: classes.dex */
public final class BuildInModelFinderKt {
    public static final String joinFileSeperator(String str) {
        String str2 = File.separator;
        if (!u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
