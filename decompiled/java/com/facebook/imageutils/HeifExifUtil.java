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
public final class HeifExifUtil {

    public static class HeifExifUtilAndroidN {
        public static int getOrientation(InputStream inputStream) {
            try {
                return C2204961BRm.LJLILLLLZI(new ExifInterface(inputStream), 1, new C0WZX("dzBzEgQ7XM/eWlgqCxuJZ9R1jDzlA+XvN22Veph+aTnbkLIL", new String[]{"019e5"}));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                if (C1328570kg3.LIZ.LIZIZ(3)) {
                    C1328570kg3.LIZ.d("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                }
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C1328570kg3.LIZ.LIZIZ(3)) {
                    C1328570kg3.LIZ.d("HeifExifUtil", "System api err, Failed reading Heif Exif orientation -> ignoring", th);
                }
                return 0;
            }
        }
    }

    public static int LIZ(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.getOrientation(inputStream);
        }
        C1328570kg3.LIZIZ("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
