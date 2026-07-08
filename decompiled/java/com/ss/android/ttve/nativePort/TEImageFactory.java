package com.ss.android.ttve.nativePort;

import X.C09NT;
import X.C09NX;
import X.C09NY;
import X.C0VSJ;
import X.C0VSV;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2484209oO;
import Y.ARunnableS9S1200000_3;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEFileUtils;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TEImageFactory {
    public static RandomAccessFile raf;

    public static boolean isDeviceOptOpen() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_schdule_device_capability_opt", VEConfigCenter.DataType.INTEGER, 0);
        return value != null && value.getValue() != null && (value.getValue() instanceof Integer) && ((Integer) value.getValue()).intValue() >= 7;
    }

    public static class ImageInfo {
        public Bitmap bitmap;
        public String colorSpace;
        public int height;
        public String mimeType;
        public int rotation;
        public int width;

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public String getColorSpace() {
            return this.colorSpace;
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public static Bitmap copyByDraw(Bitmap.Config config, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str) {
        return decodeFile(contentResolver, str, null, 0, 0, -1, null);
    }

    public static String getImageColorSpace(ContentResolver contentResolver, String str) {
        String name = "Unknown";
        if (Build.VERSION.SDK_INT < 26) {
            return "Unknown";
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmapDecodeFileCompat = decodeFileCompat(contentResolver, str, options);
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace != null) {
            name = colorSpace.getName();
        }
        if (isDeviceOptOpen()) {
            recycleBitmap(bitmapDecodeFileCompat);
        }
        return name;
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, String str) {
        String strSubstring;
        ColorSpace colorSpace;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C09NY c09ny = C09NX.LIZ;
        if (c09ny.LIZ.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getImageInfo cache cost = ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append(", filePath = ");
            sbLIZ.append(C2484209oO.LJFF(str));
            C2484209oO.LIZ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ));
            return c09ny.LIZ.get(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmapDecodeFileCompat = decodeFileCompat(contentResolver, str, options);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.mimeType = options.outMimeType;
        if (Build.VERSION.SDK_INT >= 26 && (colorSpace = options.outColorSpace) != null) {
            imageInfo.colorSpace = colorSpace.getName();
        } else {
            imageInfo.colorSpace = "Unknown";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0 && iLastIndexOf + 1 < str.length()) {
            strSubstring = str.substring(str.lastIndexOf(46) + 1);
        } else {
            strSubstring = null;
        }
        if (imageInfo.mimeType != null && strSubstring != null && (strSubstring.equals("mpg") || strSubstring.equals("mpeg"))) {
            imageInfo.mimeType = null;
        }
        if (isDeviceOptOpen()) {
            recycleBitmap(bitmapDecodeFileCompat);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getImageInfo cost = ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append(", filePath = ");
        sbLIZ2.append(C2484209oO.LJFF(str));
        C2484209oO.LIZ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ2));
        c09ny.LIZ.put(str, imageInfo);
        return imageInfo;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d7: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:33554647), block:B:50:0x00d7 */
    public static int getRotation(ContentResolver contentResolver, String str) throws Throwable {
        ExifInterface exifInterface;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        ParcelFileDescriptor parcelFileDescriptor;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C09NY c09ny = C09NX.LIZ;
        if (c09ny.LIZIZ.containsKey(str)) {
            C2484209oO.LIZ("TEImageFactory", "getRotation cache cost = " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", filePath = " + str);
            return c09ny.LIZIZ.get(str).intValue();
        }
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        int i = 0;
        if (!VEFileUtils.isAndroidUriPath(str)) {
            try {
                exifInterface = new ExifInterface(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        } else {
            if (contentResolver == null) {
                C2484209oO.LIZJ("TEImageFactory", "contentResolver should not be null after Android Q");
                return 0;
            }
            try {
                try {
                    try {
                        parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, UriProtector.parse(str), "r");
                    } catch (Throwable th) {
                        th = th;
                        parcelFileDescriptor2 = parcelFileDescriptor;
                        TryCatchGuardChecker.doCheck(th);
                        if (parcelFileDescriptor2 != null) {
                            try {
                                parcelFileDescriptor2.close();
                                throw th;
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    parcelFileDescriptorLIZLLL = null;
                }
                if (parcelFileDescriptorLIZLLL == null) {
                    return 0;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        exifInterface = new ExifInterface(parcelFileDescriptorLIZLLL.getFileDescriptor());
                    } else {
                        exifInterface = null;
                    }
                    try {
                        parcelFileDescriptorLIZLLL.close();
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    if (exifInterface != null) {
                    }
                } catch (Exception e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                    if (parcelFileDescriptorLIZLLL != null) {
                        try {
                            parcelFileDescriptorLIZLLL.close();
                            return 0;
                        } catch (IOException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            return 0;
                        }
                    }
                }
                return i;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(exifInterface, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ijp4THEeUSrkZ0cDL+sqtSu6TTw7vKitQs/9", null));
        if (iLJLILLLLZI != 3) {
            if (iLJLILLLLZI != 6) {
                if (iLJLILLLLZI == 8) {
                    i = 270;
                }
            } else {
                i = 90;
            }
        } else {
            i = 180;
        }
        C09NX.LIZ.LIZIZ.put(str, Integer.valueOf(i));
        C2484209oO.LIZ("TEImageFactory", "getRotation cost = " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", filePath = " + str);
        return i;
    }

    public static Bitmap decodeFileCompat(ContentResolver contentResolver, String str, BitmapFactory.Options options) {
        return decodeFileCompat(contentResolver, str, options, null);
    }

    public static Bitmap decodeFileCompatBeforeQ(String str, BitmapFactory.Options options, Rect rect) {
        boolean z;
        RandomAccessFile randomAccessFile;
        int i;
        if (Build.MANUFACTURER.toLowerCase().contains("meizu") && ((i = Build.VERSION.SDK_INT) == 24 || i == 25)) {
            z = true;
        } else {
            z = false;
        }
        try {
            try {
                if (z) {
                    try {
                        randomAccessFile = new RandomAccessFile(str, "r");
                        try {
                            Bitmap bitmapDecodeImage = decodeImage(rect, null, randomAccessFile.getFD(), str, options);
                            try {
                                randomAccessFile.close();
                                return bitmapDecodeImage;
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("mz raf close error ");
                                sbLIZ.append(e);
                                C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ));
                                return bitmapDecodeImage;
                            }
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("mz decodeFileDescriptor error ");
                            sbLIZ2.append(e);
                            C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ2));
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                return null;
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("mz decodeFileDescriptor error ");
                            sbLIZ3.append(th);
                            C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ3));
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                return null;
                            }
                            return null;
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        randomAccessFile = null;
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = null;
                    }
                } else {
                    return decodeImage(rect, null, null, str, options);
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th3;
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("mz raf close error ");
                        sbLIZ4.append(e4);
                        C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ4));
                        throw th3;
                    }
                }
                throw th3;
            }
        } catch (IOException e5) {
            TryCatchGuardChecker.doCheck(e5);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("mz raf close error ");
            sbLIZ5.append(e5);
            C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public static Bitmap decodeFileCompat(ContentResolver contentResolver, String str, BitmapFactory.Options options, Rect rect) {
        if (!VEFileUtils.isAndroidUriPath(str)) {
            return decodeFileCompatBeforeQ(str, options, rect);
        }
        return decodeFileCompatAfterQ(contentResolver, str, options, rect);
    }

    public static Bitmap decodeFileCompatAfterQ(ContentResolver contentResolver, String str, BitmapFactory.Options options, Rect rect) {
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        if (contentResolver == null) {
            C2484209oO.LIZJ("TEImageFactory", "contentResolver should not be null after Android Q");
            return null;
        }
        try {
            parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, Uri.parse(str), "r");
            if (parcelFileDescriptorLIZLLL == null) {
                return null;
            }
            try {
                Bitmap bitmapDecodeImage = decodeImage(rect, null, parcelFileDescriptorLIZLLL.getFileDescriptor(), str, options);
                try {
                    parcelFileDescriptorLIZLLL.close();
                    return bitmapDecodeImage;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return bitmapDecodeImage;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2484209oO.LIZLLL("TEImageFactory", "decodeFileCompatAfterQ exception!", th);
                    if (parcelFileDescriptorLIZLLL != null) {
                        try {
                            parcelFileDescriptorLIZLLL.close();
                            return null;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (parcelFileDescriptorLIZLLL != null) {
                        try {
                            parcelFileDescriptorLIZLLL.close();
                            throw th2;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptorLIZLLL = null;
        }
    }

    public static Bitmap decodeImage(Rect rect, Rect rect2, FileDescriptor fileDescriptor, String str, BitmapFactory.Options options) {
        return decodeImage(rect, rect2, fileDescriptor, str, options, false);
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, BitmapFactory.Options options, int i, int i2, int i3) {
        return decodeFile(contentResolver, str, options, i, i2, i3, null);
    }

    public static Bitmap decodeImage(Rect rect, Rect rect2, FileDescriptor fileDescriptor, String str, BitmapFactory.Options options, boolean z) {
        if (rect == null) {
            try {
                if (fileDescriptor != null) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect2, options);
                }
                Bitmap[] bitmapArr = new Bitmap[1];
                if (z) {
                    bitmapArr[0] = BitmapFactory.decodeFile(str, options);
                } else {
                    TEUtils.nativeTryExecute(new ARunnableS9S1200000_3(bitmapArr, options, str, 0));
                }
                return bitmapArr[0];
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BitmapRegionDecoder filePath mode error ");
                sbLIZ.append(th);
                C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        try {
            if (fileDescriptor != null) {
                return BitmapRegionDecoder.newInstance(fileDescriptor, false).decodeRegion(rect, options);
            }
            return BitmapRegionDecoder.newInstance(str, false).decodeRegion(rect, options);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BitmapRegionDecoder filePath mode error ");
            sbLIZ2.append(th2);
            C2484209oO.LIZJ("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static int writeFrame2file(byte[] bArr, int i, int i2, int i3, int i4, String str) throws Throwable {
        C0VSV c0vsv;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ICTAG writeFrameData2JPGFile path ");
        sbLIZ.append(str);
        C2484209oO.LJI("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ));
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsj.createNewFile();
                c0vsv = new C0VSV(c0vsj);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i3 != 1) {
                if (i3 == 0) {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, i4, c0vsv);
                } else if (i3 == 2) {
                    Boolean value = VEConfigCenter.getInstance().getValue("ve_enable_android_webp_encode_opt", false);
                    if (Build.VERSION.SDK_INT >= 30 && value.booleanValue()) {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, i4, c0vsv);
                    } else {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, i4, c0vsv);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ICTAG writeFrameData2JPGFile error type = ");
                    sbLIZ2.append(i3);
                    C2484209oO.LJI("TEImageFactory", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i4, c0vsv);
            }
            c0vsv.flush();
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            try {
                c0vsv.close();
                return 0;
            } catch (IOException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        } catch (Exception e3) {
            e = e3;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                    return 0;
                } catch (IOException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    return 0;
                }
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, BitmapFactory.Options options, int i, int i2, int i3, Rect rect) {
        int iCalBestSampleSize2;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i3 != 1) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            }
        }
        if (i > 0 && i2 > 0) {
            options.inJustDecodeBounds = true;
            Bitmap bitmapDecodeFileCompat = decodeFileCompat(contentResolver, str, options);
            if (!VEConfigCenter.getInstance().getValue("ve_enable_img_downsample_calculate_opt", false).booleanValue() && !VEConfigCenter.getInstance().getValue("ve_enable_image_decode_sharpness_opt", false).booleanValue()) {
                iCalBestSampleSize2 = TEJpegUtils.calBestSampleSize(options.outWidth, options.outHeight, i, i2);
            } else {
                iCalBestSampleSize2 = TEJpegUtils.calBestSampleSize2(options.outWidth, options.outHeight, i, i2);
            }
            if (iCalBestSampleSize2 > 0) {
                options.inSampleSize = iCalBestSampleSize2;
            }
            options.inJustDecodeBounds = false;
            if (isDeviceOptOpen()) {
                recycleBitmap(bitmapDecodeFileCompat);
            }
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeFileCompat2 = decodeFileCompat(contentResolver, str, options, rect);
        if (bitmapDecodeFileCompat2 == null) {
            return null;
        }
        Bitmap.Config config = bitmapDecodeFileCompat2.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Bitmap bitmapCopyByDraw = copyByDraw(config2, bitmapDecodeFileCompat2);
            recycleBitmap(bitmapDecodeFileCompat2);
            bitmapDecodeFileCompat2 = bitmapCopyByDraw;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = bitmapDecodeFileCompat2.getWidth();
        imageInfo.height = bitmapDecodeFileCompat2.getHeight();
        imageInfo.bitmap = bitmapDecodeFileCompat2;
        imageInfo.mimeType = "bitmap";
        imageInfo.rotation = getRotation(contentResolver, str);
        return imageInfo;
    }
}
