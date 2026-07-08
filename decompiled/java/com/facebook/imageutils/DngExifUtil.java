package com.facebook.imageutils;

import X.C0WZX;
import X.C1328570kg3;
import X.C2204961BRm;
import android.media.ExifInterface;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class DngExifUtil {
    public static final String LIZ = DngExifUtil.class.getSimpleName();

    public static class DngExifUtilAndroidN {
        public static int getOrientation(InputStream inputStream) {
            try {
                return C2204961BRm.LJLILLLLZI(new ExifInterface(inputStream), 1, new C0WZX("dzBzEgQ7XM/eWlgqCxuJZ9R1jDzlA+XvO2abWaVvZgpcsXY=", new String[]{"019e5"}));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                String str = DngExifUtil.LIZ;
                if (C1328570kg3.LIZ.LIZIZ(3)) {
                    C1328570kg3.LIZ.d(str, "Failed reading Dng Exif orientation -> ignoring", e);
                    return 0;
                }
                return 0;
            }
        }
    }

    public static int LIZ(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return DngExifUtilAndroidN.getOrientation(inputStream);
        }
        C1328570kg3.LIZIZ(LIZ, "Trying to read Dng Exif information before Android N -> ignoring");
        return 0;
    }
}
