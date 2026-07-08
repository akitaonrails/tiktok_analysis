package com.ss.android.vesdk.utils;

import X.C08FF;
import X.C09NT;
import X.C2477309nH;
import X.C2484209oO;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.vesdk.VEFileUtils;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoader {
    public static boolean isSampleSizeRound = false;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i, int i2) {
        return ((i + i2) - 1) & (~(i2 - 1));
    }

    public enum ImageRotation {
        INVALID(-1),
        ROTATION_0(0),
        ROTATION_90(90),
        ROTATION_180(180),
        ROTATION_270(270);

        public int value;

        public int getRotation() {
            return this.value;
        }

        public static ImageRotation valueOf(String str) {
            return (ImageRotation) C08FF.LIZ(ImageRotation.class, str);
        }

        ImageRotation(int i) {
            this.value = i;
        }
    }

    public static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z2 = true;
            if ((bitmap.getWidth() & 1) == 1) {
                width = bitmap.getWidth() - 1;
                z = true;
            } else {
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
            } else {
                z2 = z;
            }
            if (!z2) {
                return bitmap;
            }
            if (width <= 0 || height <= 0) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            C2477309nH.LIZ("makeDimensionEven");
            return null;
        }
    }

    public static Point getPictureSize(ContentResolver contentResolver, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (!VEFileUtils.isAndroidUriPath(str)) {
            TEImageFactory.decodeImage(null, null, null, str, options);
        } else {
            Uri uri = UriProtector.parse(str);
            try {
                try {
                    if (contentResolver == null) {
                        C2484209oO.LIZJ("BitmapLoader", "contentResolver should not be null after Android Q");
                        return null;
                    }
                    ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, uri, "r");
                    if (parcelFileDescriptorLIZLLL == null) {
                        return null;
                    }
                    try {
                        TEImageFactory.decodeImage(null, null, parcelFileDescriptorLIZLLL.getFileDescriptor(), str, options);
                        try {
                            parcelFileDescriptorLIZLLL.close();
                        } catch (IOException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        parcelFileDescriptor = parcelFileDescriptorLIZLLL;
                        TryCatchGuardChecker.doCheck(e);
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        return new Point(options.outWidth, options.outHeight);
                    } catch (Throwable th) {
                        th = th;
                        parcelFileDescriptor = parcelFileDescriptorLIZLLL;
                        TryCatchGuardChecker.doCheck(th);
                        C2484209oO.LIZJ("BitmapLoader", th.getMessage());
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException e4) {
                                e = e4;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        return new Point(options.outWidth, options.outHeight);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                            throw th2;
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return new Point(options.outWidth, options.outHeight);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r2 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            boolean r0 = com.ss.android.vesdk.VEFileUtils.isAndroidUriPath(r7)
            r3 = 0
            r5 = 0
            if (r0 != 0) goto L13
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch: java.io.IOException -> Le
            r2.<init>(r7)     // Catch: java.io.IOException -> Le
            goto L45
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        L13:
            if (r6 != 0) goto L1d
            java.lang.String r1 = "BitmapLoader"
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            X.C2484209oO.LIZJ(r1, r0)
            return r3
        L1d:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r4 = X.C09NT.LIZLLL(r6, r1, r0)     // Catch: java.lang.Throwable -> L68 java.io.FileNotFoundException -> L70
            if (r4 != 0) goto L2a
            return r3
        L2a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L64 java.io.FileNotFoundException -> L66
            r0 = 24
            if (r1 < r0) goto L3a
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch: java.lang.Throwable -> L64 java.io.FileNotFoundException -> L66
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L64 java.io.FileNotFoundException -> L66
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L64 java.io.FileNotFoundException -> L66
            goto L3b
        L3a:
            r2 = r5
        L3b:
            r4.close()     // Catch: java.io.IOException -> L3f
            goto L43
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L43:
            if (r2 == 0) goto L7f
        L45:
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKcGrIihdWugrzj+hbdk3SrwF3UJx/vxRH"
            r1.<init>(r0, r5)
            int r1 = X.C2204961BRm.LJLILLLLZI(r2, r3, r1)
            r0 = 3
            if (r1 == r0) goto L61
            r0 = 6
            if (r1 == r0) goto L5e
            r0 = 8
            if (r1 == r0) goto L5b
            return r3
        L5b:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L5e:
            r0 = 90
            return r0
        L61:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L64:
            r0 = move-exception
            goto L6a
        L66:
            r0 = move-exception
            goto L72
        L68:
            r0 = move-exception
            r4 = r5
        L6a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L7f
            goto L77
        L70:
            r0 = move-exception
            r4 = r5
        L72:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L7f
        L77:
            r4.close()     // Catch: java.io.IOException -> L7b
            return r3
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7f:
            return r3
        L80:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L8e
            r4.close()     // Catch: java.io.IOException -> L8a
            throw r1
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmap(String str, int i, int i2) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int calculateInSampleSize(android.content.ContentResolver r6, java.lang.String r7, int r8, int r9) {
        /*
            r4 = 1
            r0 = -1
            if (r8 == r0) goto Lab
            if (r9 == r0) goto Lab
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r5.inJustDecodeBounds = r4
            boolean r0 = com.ss.android.vesdk.VEFileUtils.isAndroidUriPath(r7)
            r3 = 0
            if (r0 != 0) goto L53
            com.ss.android.ttve.nativePort.TEImageFactory.decodeImage(r3, r3, r3, r7, r5)
        L17:
            int r6 = r5.outHeight
            int r3 = r5.outWidth
            if (r9 > r8) goto L20
            r0 = r9
            r9 = r8
            r8 = r0
        L20:
            if (r6 <= r3) goto L25
            r0 = r3
            r3 = r6
            r6 = r0
        L25:
            if (r6 > r8) goto L2f
            if (r3 > r9) goto L2f
            r2 = 0
        L2a:
            int r0 = java.lang.Math.max(r4, r2)
            return r0
        L2f:
            float r2 = (float) r3
            float r0 = (float) r9
            float r2 = r2 / r0
            float r1 = (float) r6
            float r0 = (float) r8
            float r1 = r1 / r0
            boolean r0 = com.ss.android.vesdk.utils.BitmapLoader.isSampleSizeRound
            if (r0 == 0) goto L4d
            float r0 = java.lang.Math.max(r1, r2)
            int r2 = java.lang.Math.round(r0)
        L41:
            int r1 = java.lang.Math.max(r3, r6)
            int r1 = r1 / r2
            int r0 = com.ss.android.vesdk.utils.BitmapLoader.maxSide
            if (r1 <= r0) goto L2a
            int r2 = r2 * 2
            goto L41
        L4d:
            float r0 = java.lang.Math.max(r1, r2)
            int r2 = (int) r0
            goto L2a
        L53:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            if (r6 != 0) goto L61
            java.lang.String r1 = "BitmapLoader"
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            X.C2484209oO.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L7b java.io.FileNotFoundException -> L8a
            goto L9a
        L61:
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = X.C09NT.LIZLLL(r6, r1, r0)     // Catch: java.lang.Throwable -> L7b java.io.FileNotFoundException -> L8a
            if (r2 != 0) goto L6a
            goto L9b
        L6a:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L75 java.io.FileNotFoundException -> L78
            com.ss.android.ttve.nativePort.TEImageFactory.decodeImage(r3, r3, r0, r7, r5)     // Catch: java.lang.Throwable -> L75 java.io.FileNotFoundException -> L78
            r2.close()     // Catch: java.io.IOException -> L94
            goto L17
        L75:
            r1 = move-exception
            r3 = r2
            goto L7c
        L78:
            r0 = move-exception
            r3 = r2
            goto L8b
        L7b:
            r1 = move-exception
        L7c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "loadBitmap"
            r1.getMessage()     // Catch: java.lang.Throwable -> L9c
            X.C2477309nH.LIZ(r0)     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L17
            goto L90
        L8a:
            r0 = move-exception
        L8b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L17
        L90:
            r3.close()     // Catch: java.io.IOException -> L94
            goto L17
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L17
        L9a:
            return r4
        L9b:
            return r4
        L9c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto Laa
            r3.close()     // Catch: java.io.IOException -> La6
            throw r1
        La6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Laa:
            throw r1
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.calculateInSampleSize(android.content.ContentResolver, java.lang.String, int, int):int");
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true);
    }

    public static int[] calAutoScale(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int[] iArr = new int[2];
        if (i <= 0 && i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (i5 == 90 || i5 == 270) {
            i4 = i3;
            i3 = i4;
        }
        if (z) {
            if (i <= 0) {
                i = (i2 * i3) / i4;
            }
            if (i2 <= 0) {
                i2 = (i4 * i) / i3;
            }
            i3 = UpAlignPo2(i, 2);
            i4 = UpAlignPo2(i2, 2);
        }
        if (i5 == 90 || i5 == 270) {
            int i6 = i4;
            i4 = i3;
            i3 = i6;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return iArr;
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, true, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, z, z2, false);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap loadBitmap(java.lang.String r9, int r10, int r11, com.ss.android.vesdk.utils.BitmapLoader.ImageRotation r12, boolean r13, boolean r14, boolean r15) {
        /*
            java.lang.String r5 = "loadBitmap"
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r1 = 0
            if (r10 <= 0) goto L12
            if (r11 <= 0) goto L12
            int r0 = calculateInSampleSize(r1, r9, r10, r11)
            r2.inSampleSize = r0
        L12:
            android.graphics.Bitmap r6 = com.ss.android.ttve.nativePort.TEImageFactory.decodeImage(r1, r1, r1, r9, r2)     // Catch: java.lang.Exception -> Lbc
            if (r6 != 0) goto L2b
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r0 = "BitmapFactory.decodeFile failed, imgPath"
            r2.append(r0)     // Catch: java.lang.Exception -> Lbc
            r2.append(r9)     // Catch: java.lang.Exception -> Lbc
            X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Exception -> Lbc
            X.C2477309nH.LIZ(r5)     // Catch: java.lang.Exception -> Lbc
            return r1
        L2b:
            com.ss.android.vesdk.utils.BitmapLoader$ImageRotation r0 = com.ss.android.vesdk.utils.BitmapLoader.ImageRotation.INVALID     // Catch: java.lang.Exception -> Lbc
            r7 = 0
            if (r12 != r0) goto L4f
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch: java.io.IOException -> L36 java.lang.Exception -> Lbc
            r3.<init>(r9)     // Catch: java.io.IOException -> L36 java.lang.Exception -> Lbc
            goto L3b
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> Lbc
            r3 = r1
        L3b:
            if (r3 == 0) goto L61
            X.0WZX r2 = new X.0WZX     // Catch: java.lang.Exception -> Lbc
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKcGrIihdWugrzj+hbdk3SrwF3UJx/vxRH"
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> Lbc
            int r2 = X.C2204961BRm.LJLILLLLZI(r3, r7, r2)     // Catch: java.lang.Exception -> Lbc
            r0 = 3
            if (r2 == r0) goto L4c
            goto L54
        L4c:
            r3 = 180(0xb4, float:2.52E-43)
            goto L5d
        L4f:
            int r3 = r12.getRotation()     // Catch: java.lang.Exception -> Lbc
            goto L5d
        L54:
            r0 = 6
            if (r2 == r0) goto L63
            r0 = 8
            if (r2 != r0) goto L61
            r3 = 270(0x10e, float:3.78E-43)
        L5d:
            r4 = 1
            if (r15 == 0) goto L76
            goto L66
        L61:
            r3 = 0
            goto L5d
        L63:
            r3 = 90
            goto L5d
        L66:
            int r2 = r6.getWidth()     // Catch: java.lang.Exception -> Lbc
            int r0 = r6.getHeight()     // Catch: java.lang.Exception -> Lbc
            int[] r0 = calAutoScale(r10, r11, r2, r0, r3)     // Catch: java.lang.Exception -> Lbc
            r10 = r0[r7]     // Catch: java.lang.Exception -> Lbc
            r11 = r0[r4]     // Catch: java.lang.Exception -> Lbc
        L76:
            if (r14 == 0) goto L8f
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r6, r10, r11, r4)     // Catch: java.lang.Exception -> Lbc
            boolean r0 = r2.sameAs(r6)     // Catch: java.lang.Exception -> Lbc
            if (r0 != 0) goto L8e
            boolean r0 = r6.isRecycled()     // Catch: java.lang.Exception -> Lbc
            if (r0 != 0) goto L8e
            r6.recycle()     // Catch: java.lang.Exception -> Lbc
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r6)     // Catch: java.lang.Exception -> Lbc
        L8e:
            r6 = r2
        L8f:
            if (r3 == 0) goto Lb5
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch: java.lang.Exception -> Lbc
            r11.<init>()     // Catch: java.lang.Exception -> Lbc
            float r0 = (float) r3     // Catch: java.lang.Exception -> Lbc
            r11.postRotate(r0)     // Catch: java.lang.Exception -> Lbc
            int r9 = r6.getWidth()     // Catch: java.lang.Exception -> Lbc
            int r10 = r6.getHeight()     // Catch: java.lang.Exception -> Lbc
            r12 = 1
            r8 = r7
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lbc
            boolean r0 = r6.isRecycled()     // Catch: java.lang.Exception -> Lbc
            if (r0 != 0) goto Lb4
            r6.recycle()     // Catch: java.lang.Exception -> Lbc
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r6)     // Catch: java.lang.Exception -> Lbc
        Lb4:
            r6 = r2
        Lb5:
            if (r13 == 0) goto Lbb
            android.graphics.Bitmap r6 = makeDimensionEven(r6)     // Catch: java.lang.Exception -> Lbc
        Lbb:
            return r6
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.getMessage()
            X.C2477309nH.LIZ(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.loadBitmap(java.lang.String, int, int, com.ss.android.vesdk.utils.BitmapLoader$ImageRotation, boolean, boolean, boolean):android.graphics.Bitmap");
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2) {
        return loadBitmapCompat(contentResolver, str, i, i2, imageRotation, z, z2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0094 A[EXC_TOP_SPLITTER, PHI: r3
      0x0094: PHI (r3v5 android.os.ParcelFileDescriptor) = (r3v17 android.os.ParcelFileDescriptor), (r3v18 android.os.ParcelFileDescriptor) binds: [B:31:0x008a, B:37:0x0092] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r13, java.lang.String r14, int r15, int r16, com.ss.android.vesdk.utils.BitmapLoader.ImageRotation r17, boolean r18, boolean r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.android.vesdk.utils.BitmapLoader$ImageRotation, boolean, boolean, boolean):android.graphics.Bitmap");
    }
}
