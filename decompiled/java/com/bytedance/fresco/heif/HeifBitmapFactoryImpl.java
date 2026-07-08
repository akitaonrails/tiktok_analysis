package com.bytedance.fresco.heif;

import X.C1323080kXC;
import X.C1328540kg0;
import X.C1328570kg3;
import X.C1328730kgJ;
import X.C1328950kgf;
import X.C1330250kil;
import X.C1330270kin;
import X.C2188811AlT;
import X.InterfaceC1328720kgI;
import X.InterfaceC1331260kkO;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.fresco.nativeheif.Heif;
import com.bytedance.fresco.nativeheif.HeifData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class HeifBitmapFactoryImpl implements InterfaceC1328720kgI {
    public static InterfaceC1331260kkO mBitmapCreator;

    public String getScaleType(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "1" : "1.4" : "1.3" : "1.2" : "1.1" : "2" : "1.5";
    }

    public void setBitmapCreator(InterfaceC1331260kkO interfaceC1331260kkO) {
        mBitmapCreator = interfaceC1331260kkO;
    }

    @Override // X.InterfaceC1328720kgI
    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return decodeStream(inputStream, rect, options, null);
    }

    @Override // X.InterfaceC1328720kgI
    public Bitmap decodeThumb(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return decodeThumb(inputStream, rect, options, null);
    }

    private int getScaleTypeFromHeicSROption(int i, int i2, int i3, C1328950kgf c1328950kgf) {
        int i4;
        if (c1328950kgf == null) {
            return -1;
        }
        if (!c1328950kgf.LIZ) {
            return c1328950kgf.LIZIZ;
        }
        if (i3 > 1) {
            i /= i3;
            i2 /= i3;
        }
        int i5 = c1328950kgf.LIZJ;
        if (i5 <= 0 || (i4 = c1328950kgf.LIZLLL) <= 0 || i <= 0 || i2 <= 0) {
            return -1;
        }
        float fMax = Math.max((i5 * 1.0f) / i, (i4 * 1.0f) / i2);
        if (fMax <= 1.0f) {
            return -1;
        }
        if (fMax <= 1.1f) {
            return 4;
        }
        if (fMax <= 1.2f) {
            return 8;
        }
        if (fMax <= 1.3f) {
            return 16;
        }
        if (fMax <= 1.4f) {
            return 32;
        }
        if (fMax <= 1.5f) {
            return 1;
        }
        return 2;
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        int i3;
        HeifData rgba;
        Bitmap.Config config;
        if (bArr.length > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                if (options != null) {
                    try {
                        if (options.inJustDecodeBounds) {
                            int[] iArrLJ = C1328540kg0.LJ(byteArrayInputStream);
                            if (iArrLJ != null) {
                                options.outWidth = iArrLJ[0];
                                options.outHeight = iArrLJ[1];
                            }
                            C1323080kXC.LIZIZ(byteArrayInputStream);
                            return null;
                        }
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1323080kXC.LIZIZ(byteArrayInputStream);
                        return null;
                    }
                }
                byteArrayInputStream.reset();
                C1323080kXC.LIZIZ(byteArrayInputStream);
                if (options != null) {
                    try {
                        i3 = options.inSampleSize;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("HeifFormatDecoder.decode exception:");
                        sbLIZ.append(Log.getStackTraceString(th));
                        C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    i3 = 1;
                }
                if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
                    rgba = Heif.toRgb565(bArr, C1328730kgJ.LJIILIIL, bArr.length, C1328730kgJ.LJIILL, C1328730kgJ.LJIILLIIL, false, 1, false, 1, i3, -1, -1, -1, -1);
                } else {
                    rgba = Heif.toRgba(bArr, C1328730kgJ.LJIILIIL, bArr.length, C1328730kgJ.LJIILL, C1328730kgJ.LJIILLIIL, false, 1, false, 1, i3, -1, -1, -1, -1);
                }
                if (rgba != null) {
                    if (options != null) {
                        config = options.inPreferredConfig;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    return rgba.newBitmap(config);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1323080kXC.LIZIZ(byteArrayInputStream);
                throw th2;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1328720kgI
    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        InputStream inputStream2;
        try {
            int iAvailable = inputStream.available();
            if (!inputStream.markSupported()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedInputStream.mark(iAvailable);
                inputStream2 = bufferedInputStream;
            } else {
                inputStream2 = inputStream;
            }
            if (!C1328730kgJ.LJIIJJI && !C1328730kgJ.LJIIJ) {
                int[] iArrLJ = C1328540kg0.LJ(inputStream2);
                if (options != null && options.inJustDecodeBounds) {
                    if (iArrLJ != null) {
                        options.outWidth = iArrLJ[0];
                        options.outHeight = iArrLJ[1];
                    }
                    return null;
                }
                inputStream2.reset();
            }
            if (iAvailable <= 0) {
                return null;
            }
            if (C1328730kgJ.LJIIJ) {
                return decodeStreamNewOpt(inputStream2, iAvailable, rect, options, c1330250kil);
            }
            if (C1328730kgJ.LJIIIZ) {
                return decodeStreamOpt(inputStream2, iAvailable, rect, options, c1330250kil);
            }
            return decodeStreamBefore(inputStream2, rect, options, c1330250kil);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Bitmap decodeStreamBefore(InputStream inputStream, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        byte[] bArr;
        int i;
        HeifData rgba;
        String str;
        Bitmap.Config config;
        String str2;
        Rect rect2 = rect;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (rect2 == null) {
            rect2 = new Rect();
        }
        try {
            bArr = new byte[8192];
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HeifFormatDecoder.decodeStreamBefore exception:");
                sbLIZ.append(Log.getStackTraceString(th));
                C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    C1323080kXC.LIZ(byteArrayOutputStream);
                    throw th2;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw th2;
                }
            }
        }
        try {
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                C1323080kXC.LIZ(byteArrayOutputStream);
                return null;
            }
            C1323080kXC.LIZ(byteArrayOutputStream);
            return null;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length > 0) {
            if (options != null) {
                i = options.inSampleSize;
            } else {
                i = 1;
            }
            if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
                rgba = Heif.toRgb565(byteArray, C1328730kgJ.LJIILIIL, byteArray.length, C1328730kgJ.LJIILL, C1328730kgJ.LJIILLIIL, false, 1, false, 1, i, rect2.left, rect2.top, rect2.height(), rect2.width());
                if (HeifDecoder.mHeifDecodeLog) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("decodeStreamBefore: toRgb565 use ttheif::");
                    if (C1328730kgJ.LJIILIIL) {
                        str2 = "heif_decode_to_rgb565_opt|vvif_decode_to_rgb565_opt";
                    } else {
                        str2 = "heif_decode_to_rgb565|vvif_decode_to_rgb565";
                    }
                    sbLIZ2.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                rgba = Heif.toRgba(byteArray, C1328730kgJ.LJIILIIL, byteArray.length, C1328730kgJ.LJIILL, C1328730kgJ.LJIILLIIL, false, 1, false, 1, i, rect2.left, rect2.top, rect2.height(), rect2.width());
                if (HeifDecoder.mHeifDecodeLog) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("decodeStreamBefore: toRgba use ttheif::");
                    if (C1328730kgJ.LJIILIIL) {
                        str = "heif_decode_to_rgba_opt|vvif_decode_to_rgba_opt";
                    } else {
                        str = "heif_decode_to_rgba|vvif_decode_to_rgba";
                    }
                    sbLIZ3.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            if (rgba != null) {
                if (c1330250kil != null) {
                    c1330250kil.LIZ = rgba.error;
                }
                if (options != null) {
                    config = options.inPreferredConfig;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapNewBitmap = rgba.newBitmap(config);
                try {
                    C1323080kXC.LIZ(byteArrayOutputStream);
                    return bitmapNewBitmap;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return bitmapNewBitmap;
                }
            }
        }
    }

    public Bitmap decodeThumb(InputStream inputStream, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        byte[] bArr;
        HeifData thumbRgba;
        if (options != null && options.inJustDecodeBounds) {
            try {
                int[] iArrLJ = C1328540kg0.LJ(inputStream);
                if (iArrLJ != null) {
                    options.outWidth = iArrLJ[0];
                    options.outHeight = iArrLJ[1];
                }
                return null;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bArr = new byte[8192];
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HeifFormatDecoder.decodeThumb exception:");
                sbLIZ.append(Log.getStackTraceString(th));
                C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    C1323080kXC.LIZ(byteArrayOutputStream);
                    throw th2;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw th2;
                }
            }
        }
        try {
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                C1323080kXC.LIZ(byteArrayOutputStream);
                return null;
            }
            C1323080kXC.LIZ(byteArrayOutputStream);
            return null;
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length > 0 && (thumbRgba = Heif.toThumbRgba(byteArray, byteArray.length)) != null) {
            if (c1330250kil != null) {
                c1330250kil.LIZ = thumbRgba.error;
            }
            Bitmap bitmapNewBitmap = thumbRgba.newBitmap(null);
            try {
                C1323080kXC.LIZ(byteArrayOutputStream);
                return bitmapNewBitmap;
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return bitmapNewBitmap;
            }
        }
    }

    @Override // X.InterfaceC1328720kgI
    public Bitmap decodeByNativePtr(long j, int i, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        int i2;
        String str;
        String str2;
        Rect rect2 = rect;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        if (options != null) {
            try {
                i2 = options.inSampleSize;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HeifFormatDecoder.decodeByNativePtr exception:");
                sbLIZ.append(Log.getStackTraceString(th));
                C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        } else {
            i2 = 1;
        }
        if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
            if (HeifDecoder.mHeifDecodeLog) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("decodeByNativePtr: toRgb565BitmapByNativePtr use ttheif::");
                if (C1328730kgJ.LJIILIIL) {
                    str2 = "heif_decode_to_rgb565_ext_opt|vvif_decode_to_rgb565_ext_opt";
                } else {
                    str2 = "heif_decode_to_rgb565_extern_buffer|vvif_decode_to_rgb565_extern_buffer";
                }
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            int[] iArr = new int[1];
            Bitmap rgb565BitmapByNativePtr = Heif.toRgb565BitmapByNativePtr(j, C1328730kgJ.LJIILIIL, i, c1330250kil.LIZIZ, c1330250kil.LIZJ, c1330250kil.LIZLLL, false, 1, false, 1, i2, rect2.left, rect2.top, rect2.height(), rect2.width(), iArr);
            c1330250kil.LIZ = iArr[0];
            return rgb565BitmapByNativePtr;
        }
        if (HeifDecoder.mHeifDecodeLog) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("decodeByNativePtr: toRgbaBitmapByNativePtr use ttheif::");
            if (C1328730kgJ.LJIILIIL) {
                str = "heif_decode_to_rgba_ext_opt|vvif_decode_to_rgba_ext_opt";
            } else {
                str = "heif_decode_to_rgba_extern_buffer|vvif_decode_to_rgba_extern_buffer";
            }
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        int[] iArr2 = new int[1];
        Bitmap rgbaBitmapByNativePtr = Heif.toRgbaBitmapByNativePtr(j, C1328730kgJ.LJIILIIL, i, c1330250kil.LIZIZ, c1330250kil.LIZJ, c1330250kil.LIZLLL, false, 1, false, 1, i2, rect2.left, rect2.top, rect2.height(), rect2.width(), iArr2);
        c1330250kil.LIZ = iArr2[0];
        return rgbaBitmapByNativePtr;
    }

    public Bitmap decodeStreamNewOpt(InputStream inputStream, int i, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        ByteBuffer byteBuffer;
        byte[] bArr;
        int i2;
        String str;
        String str2;
        Rect rect2 = rect;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        if (rect2 == null) {
            rect2 = new Rect();
        }
        try {
            bArr = new byte[8192];
        } catch (Throwable th) {
            th = th;
            byteBuffer = byteBufferAllocateDirect;
        }
        try {
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteBufferAllocateDirect.put(bArr, 0, i3);
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HeifFormatDecoder.decodeStreamNewOpt exception:");
                sbLIZ.append(Log.getStackTraceString(th));
                C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
                byteBuffer.clear();
                return null;
            }
            if (byteBufferAllocateDirect.limit() > 0) {
                if (options != null) {
                    i2 = options.inSampleSize;
                } else {
                    i2 = 1;
                }
                try {
                    if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
                        if (HeifDecoder.mHeifDecodeLog) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("decodeStreamNewOpt: toRgb565BitmapOpt use ttheif::");
                            if (C1328730kgJ.LJIILIIL) {
                                str2 = "heif_decode_to_rgb565_ext_opt|vvif_decode_to_rgb565_ext_opt";
                            } else {
                                str2 = "heif_decode_to_rgb565_extern_buffer|vvif_decode_to_rgb565_extern_buffer";
                            }
                            sbLIZ2.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        int[] iArr = new int[1];
                        Bitmap rgb565BitmapOpt = Heif.toRgb565BitmapOpt(byteBufferAllocateDirect, C1328730kgJ.LJIILIIL, i, c1330250kil.LIZIZ, c1330250kil.LIZJ, c1330250kil.LIZLLL, false, 1, false, 1, i2, rect2.left, rect2.top, rect2.height(), rect2.width(), iArr);
                        c1330250kil.LIZ = iArr[0];
                        byteBufferAllocateDirect.clear();
                        return rgb565BitmapOpt;
                    }
                    if (HeifDecoder.mHeifDecodeLog) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("decodeStreamNewOpt: toRgbaBitmapOpt use ttheif::");
                        if (C1328730kgJ.LJIILIIL) {
                            str = "heif_decode_to_rgba_ext_opt|vvif_decode_to_rgba_ext_opt";
                        } else {
                            str = "heif_decode_to_rgba_extern_buffer|vvif_decode_to_rgba_extern_buffer";
                        }
                        sbLIZ3.append(str);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    int[] iArr2 = new int[1];
                    Bitmap rgbaBitmapOpt = Heif.toRgbaBitmapOpt(byteBufferAllocateDirect, C1328730kgJ.LJIILIIL, i, c1330250kil.LIZIZ, c1330250kil.LIZJ, c1330250kil.LIZLLL, false, 1, false, 1, i2, rect2.left, rect2.top, rect2.height(), rect2.width(), iArr2);
                    c1330250kil.LIZ = iArr2[0];
                    byteBufferAllocateDirect.clear();
                    return rgbaBitmapOpt;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                byteBuffer = byteBufferAllocateDirect;
                byteBuffer.clear();
                return null;
            }
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("HeifFormatDecoder.decodeStreamNewOpt exception:");
            sbLIZ4.append(Log.getStackTraceString(th));
            C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ4));
            byteBuffer.clear();
            return null;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            byteBuffer.clear();
            throw th3;
        }
        byteBufferAllocateDirect.flip();
        byteBufferAllocateDirect.compact();
    }

    public Bitmap decodeStreamOpt(InputStream inputStream, int i, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        int i2;
        String str;
        String str2;
        Rect rect2 = rect;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        if (rect2 == null) {
            rect2 = new Rect();
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteBufferAllocateDirect.put(bArr, 0, i3);
            }
            byteBufferAllocateDirect.flip();
            byteBufferAllocateDirect.compact();
            if (byteBufferAllocateDirect.limit() > 0) {
                if (options != null) {
                    i2 = options.inSampleSize;
                } else {
                    i2 = 1;
                }
                if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
                    if (HeifDecoder.mHeifDecodeLog) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("decodeStreamOpt: toRgb565Bitmap use ttheif::");
                        if (C1328730kgJ.LJIILIIL) {
                            str2 = "heif_decode_to_rgb565_opt|vvif_decode_to_rgb565_opt";
                        } else {
                            str2 = "heif_decode_to_rgb565|vvif_decode_to_rgb565";
                        }
                        sbLIZ.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    Bitmap rgb565Bitmap = Heif.toRgb565Bitmap(byteBufferAllocateDirect, C1328730kgJ.LJIILIIL, i, C1328730kgJ.LJIILL, C1328730kgJ.LJIILLIIL, false, 1, false, 1, i2, rect2.left, rect2.top, rect2.height(), rect2.width());
                    byteBufferAllocateDirect.clear();
                    return rgb565Bitmap;
                }
                if (HeifDecoder.mHeifDecodeLog) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("decodeStreamOpt: toRgbaBitmap use ttheif::");
                    if (C1328730kgJ.LJIILIIL) {
                        str = "heif_decode_to_rgba_opt|vvif_decode_to_rgba_opt";
                    } else {
                        str = "heif_decode_to_rgba|vvif_decode_to_rgba";
                    }
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                Bitmap rgbaBitmap = Heif.toRgbaBitmap(byteBufferAllocateDirect, C1328730kgJ.LJIILIIL, i, C1328730kgJ.LJIILL, C1328730kgJ.LJIILLIIL, false, 1, false, 1, i2, rect2.left, rect2.top, rect2.height(), rect2.width());
                byteBufferAllocateDirect.clear();
                return rgbaBitmap;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        byteBufferAllocateDirect.clear();
        return null;
    }

    @Override // X.InterfaceC1328720kgI
    public Bitmap decodeByNativePtrCombineSr(long j, int i, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil, C1328950kgf c1328950kgf, Map<String, String> map) {
        int i2;
        String str;
        String str2;
        String str3;
        Rect rect2 = rect;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        if (options != null) {
            try {
                i2 = options.inSampleSize;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HeifFormatDecoder.decodeByNativePtrCombineSr exception:");
                sbLIZ.append(Log.getStackTraceString(th));
                C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        } else {
            i2 = 1;
        }
        String str4 = "";
        if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
            if (HeifDecoder.mHeifDecodeLog) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("decodeByNativePtrCombineSr: toRgb565BitmapByNativePtr use ttheif::");
                if (C1328730kgJ.LJIILIIL) {
                    str3 = "heif_decode_to_rgb565_ext_opt|vvif_decode_to_rgb565_ext_opt";
                } else {
                    str3 = "heif_decode_to_rgb565_extern_buffer|vvif_decode_to_rgb565_extern_buffer";
                }
                sbLIZ2.append(str3);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            int[] iArr = new int[6];
            int scaleTypeFromHeicSROption = getScaleTypeFromHeicSROption(c1330250kil.LIZJ, c1330250kil.LIZLLL, i2, c1328950kgf);
            boolean z = C1328730kgJ.LJIILIIL;
            boolean z2 = c1330250kil.LIZIZ;
            int i3 = c1330250kil.LIZJ;
            int i4 = c1330250kil.LIZLLL;
            int i5 = rect2.left;
            int i6 = rect2.top;
            int iHeight = rect2.height();
            int iWidth = rect2.width();
            int i7 = C1330270kin.LIZIZ;
            int i8 = C1330270kin.LIZJ;
            int i9 = C1330270kin.LIZLLL;
            if (!TextUtils.isEmpty(C1330270kin.LJ)) {
                str4 = C1330270kin.LJ;
            }
            Bitmap rgbaBitmapByNativePtrWithBmfSr = Heif.toRgbaBitmapByNativePtrWithBmfSr(j, z, i, z2, i3, i4, false, 1, false, 1, i2, i5, i6, iHeight, iWidth, i7, i8, i9, scaleTypeFromHeicSROption, str4, iArr);
            c1330250kil.LIZ = iArr[0];
            return rgbaBitmapByNativePtrWithBmfSr;
        }
        if (HeifDecoder.mHeifDecodeLog) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("decodeByNativePtrCombineSr: toRgbaBitmapByNativePtr use ttheif::");
            if (C1328730kgJ.LJIILIIL) {
                str2 = "heif_decode_to_rgba_ext_opt|vvif_decode_to_rgba_ext_opt";
            } else {
                str2 = "heif_decode_to_rgba_extern_buffer|vvif_decode_to_rgba_extern_buffer";
            }
            sbLIZ3.append(str2);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        int[] iArr2 = new int[6];
        int scaleTypeFromHeicSROption2 = getScaleTypeFromHeicSROption(c1330250kil.LIZJ, c1330250kil.LIZLLL, i2, c1328950kgf);
        boolean z3 = C1328730kgJ.LJIILIIL;
        boolean z4 = c1330250kil.LIZIZ;
        int i10 = c1330250kil.LIZJ;
        int i11 = c1330250kil.LIZLLL;
        int i12 = rect2.left;
        int i13 = rect2.top;
        int iHeight2 = rect2.height();
        int iWidth2 = rect2.width();
        int i14 = C1330270kin.LIZIZ;
        int i15 = C1330270kin.LIZJ;
        int i16 = C1330270kin.LIZLLL;
        if (TextUtils.isEmpty(C1330270kin.LJ)) {
            str = "";
        } else {
            str = C1330270kin.LJ;
        }
        Bitmap rgbaBitmapByNativePtrWithBmfSr2 = Heif.toRgbaBitmapByNativePtrWithBmfSr(j, z3, i, z4, i10, i11, false, 1, false, 1, i2, i12, i13, iHeight2, iWidth2, i14, i15, i16, scaleTypeFromHeicSROption2, str, iArr2);
        c1330250kil.LIZ = iArr2[0];
        if (map != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("BMFSR,");
            sbLIZ4.append(C1330270kin.LIZ);
            map.put("sr_type", C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(C1330270kin.LIZIZ);
            sbLIZ5.append("");
            map.put("sr_max_width", C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(C1330270kin.LIZJ);
            sbLIZ6.append("");
            map.put("sr_max_height", C2188811AlT.LIZIZ(sbLIZ6));
            map.put("sr_stretch", getScaleType(scaleTypeFromHeicSROption2));
            map.put("scale_type", String.valueOf(scaleTypeFromHeicSROption2));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(c1328950kgf.LIZ);
            sbLIZ7.append("");
            map.put("enable_all", C2188811AlT.LIZIZ(sbLIZ7));
            if (scaleTypeFromHeicSROption2 < 0) {
                map.put("sr_status", "1");
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("The scale is abnormal, scale = ");
                sbLIZ8.append(scaleTypeFromHeicSROption2);
                map.put("sr_err", C2188811AlT.LIZIZ(sbLIZ8));
                return rgbaBitmapByNativePtrWithBmfSr2;
            }
            int i17 = iArr2[1];
            int i18 = iArr2[2];
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(i18);
            sbLIZ9.append("");
            map.put("sr_heic_opt", C2188811AlT.LIZIZ(sbLIZ9));
            if (i17 == 1) {
                map.put("sr_status", CardStruct.IStatusCode.DEFAULT);
                map.put("sr_duration", String.valueOf(iArr2[5]));
                if (rgbaBitmapByNativePtrWithBmfSr2 != null) {
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append(rgbaBitmapByNativePtrWithBmfSr2.getWidth());
                    sbLIZ10.append("");
                    map.put("sr_width", C2188811AlT.LIZIZ(sbLIZ10));
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(rgbaBitmapByNativePtrWithBmfSr2.getHeight());
                    sbLIZ11.append("");
                    map.put("sr_height", C2188811AlT.LIZIZ(sbLIZ11));
                    return rgbaBitmapByNativePtrWithBmfSr2;
                }
            } else {
                map.put("sr_status", "1");
                if (i18 == 1) {
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("bmf init result is: ");
                    sbLIZ12.append(iArr2[3]);
                    sbLIZ12.append(", process result is: ");
                    sbLIZ12.append(iArr2[4]);
                    map.put("sr_err", C2188811AlT.LIZIZ(sbLIZ12));
                }
            }
        }
        return rgbaBitmapByNativePtrWithBmfSr2;
    }

    @Override // X.InterfaceC1328720kgI
    public Bitmap decodeThumbByNativePtr(long j, int i, int i2, int i3, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil) {
        try {
            return Heif.toThumbRgbaBitmapByNativePtr(j, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HeifFormatDecoder.decodeThumbByNativePtr exception:");
            sbLIZ.append(Log.getStackTraceString(th));
            C1328570kg3.LJFF("HeifBitmapFactoryImpl", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
