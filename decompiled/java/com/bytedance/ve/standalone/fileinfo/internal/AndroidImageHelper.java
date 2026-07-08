package com.bytedance.ve.standalone.fileinfo.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidImageHelper {

    public static final class ImageInfo {
        public final int height;
        public final int rotation;
        public final int width;

        public int getHeight() {
            return this.height;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }

        public ImageInfo(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.rotation = i3;
        }
    }

    public static int readExifRotation(String str) {
        try {
            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(new ExifInterface(str), 1, new C0WZX("dzBzEgAjS8/YVFkiQFySY+xxJn2bZLh/tVobgIgKrf/mehQ/0MdojToSKYbdw+rAKKsSBmqiRGQqj6yyqBHzYQ==", null));
            if (iLJLILLLLZI != 3) {
                if (iLJLILLLLZI != 6) {
                    if (iLJLILLLLZI != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i2 = options.outWidth;
            if (i2 <= 0 || (i = options.outHeight) <= 0) {
                return null;
            }
            return new ImageInfo(i2, i, readExifRotation(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
