package com.ss.android.ugc.aweme.services.dm;

import X.C2188811AlT;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class DMPathKt {
    public static final String ensureSeparatorSuffix(String str) {
        String str2 = File.separator;
        if (u.LJIIZILJ(str, str2, false)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean smartCreateNewDir(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }
}
