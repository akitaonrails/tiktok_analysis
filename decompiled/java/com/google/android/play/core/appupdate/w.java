package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class w {
    public final Context LIZ;

    public w(Context context) {
        this.LIZ = context;
    }

    public static long LIZ(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jLIZ = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jLIZ += LIZ(file2);
            }
        }
        return jLIZ;
    }
}
