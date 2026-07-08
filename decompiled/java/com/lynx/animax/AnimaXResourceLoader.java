package com.lynx.animax;

import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C0WLZ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaX;
import com.lynx.animax.util.AnimaXLog;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class AnimaXResourceLoader {
    public static String getCacheDirectory() {
        File fileW2;
        String absolutePath;
        Context context = AnimaX.LIZJ().LIZJ;
        if (context == null || (fileW2 = C786410Ut5.w2(context)) == null || (absolutePath = fileW2.getAbsolutePath()) == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(absolutePath, "animax");
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to make animax cache directory: ");
            sbLIZ.append(c0vsj.getAbsolutePath());
            AnimaXLog.LIZ("AnimaXResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c0vsj.exists() && c0vsj.isFile()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to make animax cache directory, path is a file: ");
            sbLIZ2.append(c0vsj.getAbsolutePath());
            AnimaXLog.LIZ("AnimaXResourceLoader", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return c0vsj.getAbsolutePath();
    }

    public static byte[] readFile(String str) {
        C0VSP c0vsp;
        int iAvailable;
        if (str != null && new C0VSJ(str).exists()) {
            try {
                c0vsp = new C0VSP(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createFileInputStream error: ");
                sbLIZ.append(e);
                AnimaXLog.LIZ("AnimaXStreamUtil", C2188811AlT.LIZIZ(sbLIZ));
                c0vsp = null;
            }
        } else {
            c0vsp = null;
        }
        try {
            iAvailable = c0vsp.available();
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            iAvailable = 0;
        }
        return C0WLZ.LIZJ(c0vsp, iAvailable);
    }

    public static boolean saveByteArrayIntoFile(String str, byte[] bArr) {
        int iAvailable;
        BufferedOutputStream bufferedOutputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            iAvailable = byteArrayInputStream.available();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            iAvailable = 0;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new C0VSV(str));
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to create FileOutputStream for file: ");
            sbLIZ.append(str);
            AnimaXLog.LIZ("AnimaXStreamUtil", C2188811AlT.LIZIZ(sbLIZ));
            bufferedOutputStream = null;
        }
        return C0WLZ.LIZIZ(byteArrayInputStream, bufferedOutputStream, iAvailable);
    }
}
