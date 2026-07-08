package com.bytedance.common.utility;

import X.C09NT;
import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class BitmapUtils {
    public static Bitmap decodeBitmap(File file) throws Throwable {
        C0VSP c0vsp;
        C0VSP c0vsp2 = null;
        try {
            if (!file.exists()) {
                return null;
            }
            try {
                c0vsp = new C0VSP(file);
                try {
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c0vsp);
                        try {
                            c0vsp.close();
                            return bitmapDecodeStream;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return bitmapDecodeStream;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            c0vsp.close();
                            return null;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    c0vsp2 = c0vsp;
                }
            } catch (Exception e4) {
                e = e4;
                c0vsp = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        TryCatchGuardChecker.doCheck(th);
        try {
            c0vsp2.close();
            throw th;
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            throw th;
        }
    }

    public static Bitmap getBitmapFromSD(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return null;
        }
        try {
            return decodeBitmap(c0vsj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static int readPictureDegree(String str) throws Throwable {
        try {
            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(new ExifInterface(str), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8ttre30mu9IiBsDvg==", null));
            if (iLJLILLLLZI != 3) {
                if (iLJLILLLLZI != 6) {
                    if (iLJLILLLLZI == 8) {
                        return 270;
                    }
                    return 0;
                }
                return 90;
            }
            return 180;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static void rotateImage(String str) throws Throwable {
        int i;
        C0VSV c0vsv;
        C0VSV c0vsv2 = null;
        try {
            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(new ExifInterface(str), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8ttre30mu9IiBsDvg==", null));
            if (iLJLILLLLZI != 3) {
                if (iLJLILLLLZI != 6) {
                    if (iLJLILLLLZI == 8) {
                        i = 270;
                    } else {
                        return;
                    }
                } else {
                    i = 90;
                }
            } else {
                i = 180;
            }
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            bitmapDecodeFile.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
            try {
                try {
                    try {
                        c0vsv = new C0VSV(str);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.LJJJJ(bitmapCreateBitmap);
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, c0vsv);
                c0vsv.flush();
                try {
                    c0vsv.close();
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            } catch (FileNotFoundException e5) {
                e = e5;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(e);
                if (c0vsv2 != null) {
                    c0vsv2.close();
                }
                C786410Ut5.LJJJJ(bitmapCreateBitmap);
            } catch (IOException e6) {
                e = e6;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(e);
                if (c0vsv2 != null) {
                    c0vsv2.close();
                }
                C786410Ut5.LJJJJ(bitmapCreateBitmap);
            } catch (Throwable th2) {
                th = th2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(th);
                if (c0vsv2 != null) {
                    try {
                        c0vsv2.close();
                    } catch (IOException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                }
                C786410Ut5.LJJJJ(bitmapCreateBitmap);
                throw th;
            }
        } catch (IOException e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap compressBitmap(android.graphics.Bitmap r7, long r8) {
        /*
            if (r7 != 0) goto L4
            r0 = 0
            return r0
        L4:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb
            return r7
        Lb:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            int r1 = r7.getRowBytes()
            int r0 = r7.getHeight()
            int r1 = r1 * r0
            long r2 = (long) r1
            long r2 = r2 / r8
            double r0 = (double) r2
            long r0 = java.lang.Math.round(r0)
            double r3 = (double) r0
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 1
            if (r0 < 0) goto L33
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
        L2d:
            r4 = 1
        L2e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r5 != r0) goto L3d
            return r7
        L33:
            double r0 = java.lang.Math.sqrt(r3)
            int r4 = (int) r0
            if (r4 == 0) goto L2d
            if (r4 != r6) goto L3d
            goto L2e
        L3d:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r0 = 100
            r7.compress(r1, r0, r2)
            byte[] r3 = r2.toByteArray()
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inSampleSize = r4
            r2.inPurgeable = r6
            r2.inPreferredConfig = r5
            int r1 = r3.length
            r0 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.compressBitmap(android.graphics.Bitmap, long):android.graphics.Bitmap");
    }

    public static Bitmap decodeBitmap(File file, int i) {
        return decodeBitmap(file, i, false);
    }

    public static Bitmap getBitmapFromSD(String str, int i) {
        return getBitmapFromSD(str, i, false);
    }

    public static Bitmap loadBitmap(int i, String str) {
        return loadBitmap(i, str, false);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap decodeBitmap(File file, int i, boolean z) {
        BitmapFactory.Options options;
        Bitmap.Config config;
        int i2;
        Bitmap bitmapDecodeStream = null;
        try {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C0VSP c0vsp = new C0VSP(file);
            BitmapFactory.decodeStream(c0vsp, null, options);
            c0vsp.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            int i3 = 1;
            while (true) {
                int i4 = options.outWidth;
                if (i4 < i * 2 || (i2 = options.outHeight) < 4000) {
                    break;
                }
                options.outWidth = i4 / 2;
                options.outHeight = i2 / 2;
                i3 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i3;
            options2.inPurgeable = true;
            if (!z) {
                config = Bitmap.Config.RGB_565;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            options2.inPreferredConfig = config;
            C0VSP c0vsp2 = new C0VSP(file);
            bitmapDecodeStream = BitmapFactory.decodeStream(c0vsp2, null, options2);
            c0vsp2.close();
            if (bitmapDecodeStream == null) {
                file.delete();
                return bitmapDecodeStream;
            }
            return bitmapDecodeStream;
        }
        file.delete();
        return null;
    }

    public static Bitmap getBitmapFromSD(String str, int i, boolean z) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return null;
        }
        try {
            c0vsj.setLastModified(System.currentTimeMillis());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            return decodeBitmap(c0vsj, i, z);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Bitmap loadBitmap(int i, String str, boolean z) throws IOException {
        Bitmap.CompressFormat compressFormat;
        Bitmap.Config config;
        Bitmap bitmapFromSD = getBitmapFromSD(str, i, z);
        if (bitmapFromSD == null) {
            return null;
        }
        int width = bitmapFromSD.getWidth();
        int height = bitmapFromSD.getHeight();
        if (width > i + 150 || (width > i && height > 4000)) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapFromSD, i, (int) (((i * 1.0f) * height) / width), true);
            bitmapFromSD.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapFromSD);
            if (bitmapCreateScaledBitmap == null) {
                return null;
            }
            bitmapFromSD = bitmapCreateScaledBitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        bitmapFromSD.compress(compressFormat, 80, byteArrayOutputStream);
        bitmapFromSD.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapFromSD);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        options.inPreferredConfig = config;
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > i || height > i2) {
            if (width > height && width > i) {
                i2 = (int) (height * (i / width));
            } else {
                i = (int) (width * (i2 / height));
            }
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return bitmap;
    }

    public static boolean saveBitmapToSD(Bitmap bitmap, String str, String str2) {
        C0VSV c0vsv;
        if (!"mounted".equals(C786410Ut5.X3())) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj);
        sbLIZ.append("/");
        sbLIZ.append(str2);
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj2.exists()) {
            try {
                c0vsj2.createNewFile();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV(c0vsj2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
            c0vsv.flush();
            try {
                c0vsv.close();
                return true;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            try {
                c0vsv2.close();
                return false;
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            try {
                c0vsv2.close();
                throw th;
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
                throw th;
            }
        }
    }

    public static boolean saveImageData(byte[] bArr, String str, String str2) throws Throwable {
        C0VSV c0vsv = null;
        try {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (!c0vsj.exists() && !c0vsj.mkdirs() && !c0vsj.exists()) {
                    return false;
                }
                C0VSV c0vsv2 = new C0VSV(new C0VSJ(c0vsj, str2));
                try {
                    c0vsv2.write(bArr);
                    c0vsv2.flush();
                    c0vsv2.close();
                    return true;
                } catch (Exception e) {
                    e = e;
                    c0vsv = c0vsv2;
                } catch (Throwable th) {
                    th = th;
                    c0vsv = c0vsv2;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv != null) {
                        try {
                            c0vsv.close();
                            throw th;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        TryCatchGuardChecker.doCheck(e);
        if (c0vsv != null) {
            try {
                c0vsv.close();
                return false;
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        return false;
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 1 && i2 >= 1) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i3 = options.outWidth;
                int i4 = options.outHeight;
                int i5 = 1;
                while (true) {
                    if (i3 / 2 < i && i4 / 2 < i2) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i5;
                        options2.inPurgeable = true;
                        options2.inPreferredConfig = Bitmap.Config.RGB_565;
                        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    }
                    i3 /= 2;
                    i4 /= 2;
                    i5 *= 2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2) {
        return getBitmapFromSD(str, i, i2, -1, null);
    }

    public static Bitmap decodeBitmap(File file, int i, int i2, Bitmap.Config config) throws Throwable {
        C0VSP c0vsp;
        BitmapFactory.Options options;
        C0VSP c0vsp2;
        C0VSP c0vsp3 = null;
        if (file != null && i > 0) {
            try {
                if (i2 > 0) {
                    try {
                        if (!file.isFile()) {
                            return null;
                        }
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        c0vsp = new C0VSP(file);
                        try {
                            try {
                                BitmapFactory.decodeStream(c0vsp, null, options2);
                                c0vsp.close();
                                int i3 = options2.outWidth;
                                int i4 = options2.outHeight;
                                int i5 = 1;
                                while (true) {
                                    if (i3 / 2 < i && i4 / 2 < i2) {
                                        break;
                                    }
                                    i3 /= 2;
                                    i4 /= 2;
                                    i5 *= 2;
                                }
                                options = new BitmapFactory.Options();
                                options.inSampleSize = i5;
                                options.inPurgeable = true;
                                if (config == null) {
                                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                                } else {
                                    options.inPreferredConfig = config;
                                }
                                c0vsp2 = new C0VSP(file);
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c0vsp3 = c0vsp;
                        }
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c0vsp2, null, options);
                            c0vsp2.close();
                            return bitmapDecodeStream;
                        } catch (Exception e2) {
                            e = e2;
                            c0vsp = c0vsp2;
                        } catch (Throwable th2) {
                            th = th2;
                            c0vsp3 = c0vsp2;
                            TryCatchGuardChecker.doCheck(th);
                            if (c0vsp3 != null) {
                                try {
                                    c0vsp3.close();
                                    throw th;
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        c0vsp = null;
                    }
                    TryCatchGuardChecker.doCheck(e);
                    if (c0vsp != null) {
                        try {
                            c0vsp.close();
                            return null;
                        } catch (Exception e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3) {
        return getBitmapFromSD(str, i, i2, i3, null);
    }

    public static Bitmap decodeBitmap(Context context, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (context == null || i == 0 || i2 <= 0 || i3 <= 0) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, i, options);
                i4 = options.outWidth;
                i5 = options.outHeight;
                i6 = 1;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
        while (true) {
            if (i4 / 2 < i2 && i5 / 2 < i3) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i6;
                options2.inPurgeable = true;
                options2.inPreferredConfig = Bitmap.Config.RGB_565;
                return BitmapFactory.decodeResource(resources, i, options2);
            }
            i4 /= 2;
            i5 /= 2;
            i6 *= 2;
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, Bitmap.Config config) {
        return getBitmapFromSD(str, i, i2, -1, config);
    }

    public static Bitmap decodeBitmap(ContentResolver contentResolver, Uri uri, int i, int i2) {
        byte[] byteArray = null;
        if (contentResolver == null || uri == null || i < 1 || i2 < 1) {
            return null;
        }
        try {
            InputStream inputStreamLJ = C09NT.LJ(contentResolver, uri);
            if (inputStreamLJ == null) {
                return null;
            }
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i3 = inputStreamLJ.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return decodeBitmap(byteArray, i, i2);
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3, Bitmap.Config config) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.isFile()) {
                return null;
            }
            if (i3 > 0 && c0vsj.length() > i3) {
                c0vsj.delete();
                return null;
            }
            try {
                c0vsj.setLastModified(System.currentTimeMillis());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return decodeBitmap(c0vsj, i, i2, config);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
