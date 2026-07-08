package com.facebook.webpsupport;

import X.C0VSP;
import X.C1328690kgF;
import X.C1330450kj5;
import X.InterfaceC1328170kfP;
import X.InterfaceC1328260kfY;
import X.InterfaceC1331260kkO;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public class WebpBitmapFactoryImpl implements InterfaceC1328170kfP {
    public static final boolean IN_BITMAP_SUPPORTED = true;
    public static InterfaceC1331260kkO mBitmapCreator;
    public static InterfaceC1328260kfY mWebpErrorLogger;

    public static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    public static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    public static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    public static void sendWebpErrorLog(String str) {
    }

    public void setWebpErrorLogger(InterfaceC1328260kfY interfaceC1328260kfY) {
    }

    public static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        if (options != null && (bArr = options.inTempStorage) != null) {
            return bArr;
        }
        return new byte[8192];
    }

    public static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / i;
        }
        if (options.inScaled) {
            int i2 = options.inDensity;
            int i3 = options.inTargetDensity;
            int i4 = options.inScreenDensity;
            if (i2 != 0 && i3 != 0 && i2 != i4) {
                return i3 / i2;
            }
            return f;
        }
        return f;
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    public static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    public static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    public static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            return new BufferedInputStream(inputStream, 20);
        }
        return inputStream;
    }

    public void setBitmapCreator(InterfaceC1331260kkO interfaceC1331260kkO) {
        mBitmapCreator = interfaceC1331260kkO;
    }

    public static byte[] getWebpHeader(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) throws Throwable {
        Bitmap bitmapHookDecodeStream = null;
        try {
            C0VSP c0vsp = new C0VSP(str);
            try {
                bitmapHookDecodeStream = hookDecodeStream(c0vsp, null, options);
                c0vsp.close();
                return bitmapHookDecodeStream;
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        if (th != null) {
                            try {
                                c0vsp.close();
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                th.addSuppressed(th3);
                            }
                        } else {
                            c0vsp.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmapHookDecodeStream;
        }
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    public static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (i2 != 0 && i != i2 && i != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i2);
                    return;
                }
                return;
            }
            if (!IN_BITMAP_SUPPORTED || options.inBitmap == null) {
                return;
            }
            int i3 = Resources.getSystem().getDisplayMetrics().densityDpi;
            if (i3 != 0) {
                bitmap.setDensity(i3);
            } else {
                bitmap.setDensity(160);
            }
        }
    }

    public static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    public Bitmap decodeFile(String str, BitmapFactory.Options options) {
        return hookDecodeFile(str, options);
    }

    public static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (IN_BITMAP_SUPPORTED && options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        throw null;
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        C1330450kj5.LIZ();
        long jNativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (jNativeSeek != -1) {
            InputStream inputStreamWrapToMarkSupportedStream = wrapToMarkSupportedStream(new C0VSP(fileDescriptor));
            try {
                getWebpHeader(inputStreamWrapToMarkSupportedStream, options);
                boolean z = C1328690kgF.LIZ;
                nativeSeek(fileDescriptor, jNativeSeek, true);
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                if (bitmapDecodeFileDescriptor == null) {
                    sendWebpErrorLog("webp_direct_decode_fd_failed_on_no_webp");
                }
                try {
                    inputStreamWrapToMarkSupportedStream.close();
                    return bitmapDecodeFileDescriptor;
                } catch (Throwable th) {
                    return bitmapDecodeFileDescriptor;
                }
            } catch (Throwable th2) {
                try {
                    inputStreamWrapToMarkSupportedStream.close();
                    throw th2;
                } finally {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        Bitmap bitmapHookDecodeStream = hookDecodeStream(new C0VSP(fileDescriptor), rect, options);
        setPaddingDefaultValues(rect);
        return bitmapHookDecodeStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmapHookDecodeResourceStream = null;
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmapHookDecodeResourceStream = hookDecodeResourceStream(resources, typedValue, inputStreamOpenRawResource, null, options);
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = bitmapHookDecodeResourceStream;
                        TryCatchGuardChecker.doCheck(th);
                        if (inputStreamOpenRawResource != null) {
                            if (th != 0) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    th.addSuppressed(th3);
                                }
                            } else {
                                inputStreamOpenRawResource.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (IN_BITMAP_SUPPORTED && bitmapHookDecodeResourceStream == null && options != null && options.inBitmap != null) {
            throw new IllegalArgumentException("Problem decoding into existing bitmap");
        }
        return bitmapHookDecodeResourceStream;
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmapDecodeStream;
        C1330450kj5.LIZ();
        InputStream inputStreamWrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        byte[] webpHeader = getWebpHeader(inputStreamWrapToMarkSupportedStream, options);
        boolean z = C1328690kgF.LIZ;
        if (Build.VERSION.SDK_INT == 28 && C1328690kgF.LIZJ(webpHeader, 20) && options.inPreferredConfig == Bitmap.Config.ARGB_8888) {
            bitmapDecodeStream = nativeDecodeStream(inputStreamWrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmapDecodeStream == null) {
                sendWebpErrorLog("webp_direct_decode_stream");
            }
            setWebpBitmapOptions(bitmapDecodeStream, options);
            setPaddingDefaultValues(rect);
        } else {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamWrapToMarkSupportedStream, rect, options);
            if (bitmapDecodeStream == null) {
                sendWebpErrorLog("webp_direct_decode_stream_failed_on_no_webp");
                return bitmapDecodeStream;
            }
        }
        return bitmapDecodeStream;
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options != null && options.inJustDecodeBounds) {
            options.outWidth = i;
            options.outHeight = i2;
            return true;
        }
        return false;
    }

    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @Override // X.InterfaceC1328170kfP
    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return hookDecodeStream(inputStream, rect, options);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        C1330450kj5.LIZ();
        boolean z = C1328690kgF.LIZ;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        if (bitmapDecodeByteArray == null) {
            sendWebpErrorLog("webp_direct_decode_array_failed_on_no_webp");
        }
        return bitmapDecodeByteArray;
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return hookDecodeByteArray(bArr, i, i2, options);
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    public static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }
}
