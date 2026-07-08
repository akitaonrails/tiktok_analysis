package com.bytedance.ies.cutsame.util;

import X.C0VSP;
import X.C0WZX;
import X.C13LQ;
import X.C13LZ;
import X.C20144413ru;
import X.C2107108Nh;
import X.C2204961BRm;
import X.C2473009ma;
import X.C538540LAe;
import X.C539280LDa;
import Y.AObjectS127S0000000_30;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEUtils;
import java.io.FileDescriptor;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class MediaUtil {
    public static final MediaUtil LIZ = new MediaUtil();
    public static final LruCache<String, C539280LDa> LIZIZ = new LruCache<>(100);
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[] LJ;
    public static final byte[][] LJFF;

    static {
        new LruCache(100);
        LIZJ = new byte[]{82, 73, 70, 70};
        LIZLLL = new byte[]{87, 69, 66, 80};
        LJ = new byte[]{104, 101, 105, 99};
        LJFF = new byte[][]{new byte[]{-1, -40}, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10}, new byte[]{71, 73, 70, 56, 55, 97}, new byte[]{71, 73, 70, 56, 57, 97}, new byte[]{66, 77}};
    }

    public static boolean LIZIZ(Context context, String str) throws Throwable {
        C2473009ma.LIZ.getClass();
        if (!C2473009ma.LJFF(context, str)) {
            return false;
        }
        try {
            final byte[] bArr = new byte[12];
            if (C2473009ma.LJI(str)) {
                C2473009ma.LIZLLL(context, UriProtector.parse(str), new Function1() { // from class: X.13pj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        byte[] bArr2 = bArr;
                        FileDescriptor fileDescriptor = (FileDescriptor) obj;
                        MediaUtil mediaUtil = MediaUtil.LIZ;
                        if (fileDescriptor != null) {
                            C0VSP c0vsp = new C0VSP(fileDescriptor);
                            try {
                                c0vsp.read(bArr2);
                                C2107108Nh.LIZ(c0vsp, null);
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
                                        C2107108Nh.LIZ(c0vsp, th);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                        return Unit.LIZ;
                    }
                });
            } else {
                C0VSP c0vsp = new C0VSP(str);
                Throwable th = null;
                try {
                    c0vsp.read(bArr);
                    C2107108Nh.LIZ(c0vsp, null);
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsp, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
            if (Arrays.equals(LIZJ, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(0, 4))) && Arrays.equals(LIZLLL, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(8, 12)))) {
                return true;
            }
            for (byte[] bArr2 : LJFF) {
                if (Arrays.equals(bArr2, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(0, bArr2.length)))) {
                    return true;
                }
            }
            if (u.LJIIZILJ(str.toUpperCase(Locale.getDefault()), ".HEIC", false) || Arrays.equals(LJ, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(8, 12)))) {
                return true;
            }
            C13LQ.LJJIJIL(bArr, " ", new AObjectS127S0000000_30(4));
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final synchronized C539280LDa LIZ(Context context, String str) {
        C539280LDa c539280LDa;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ExifInterface exifInterfaceLIZJ;
        String str2 = str;
        c539280LDa = LIZIZ.get(str2);
        if (c539280LDa == null) {
            int i7 = 0;
            if (LIZIZ(context, str2)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C2473009ma.LIZ.getClass();
                C2473009ma.LIZIZ(context, options, str2);
                if (!TextUtils.isEmpty(str2) && C2473009ma.LJFF(context, str2) && (exifInterfaceLIZJ = C2473009ma.LIZJ(context, str2)) != null) {
                    int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(exifInterfaceLIZJ, -1, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ypn5c8zr9ebrqAOEaWMvf4wrn78dy5w==", null));
                    if (iLJLILLLLZI != 3) {
                        if (iLJLILLLLZI != 6) {
                            if (iLJLILLLLZI == 8) {
                                i7 = 270;
                            }
                        } else {
                            i7 = 90;
                        }
                    } else {
                        i7 = 180;
                    }
                }
                Size size = new Size(options.outWidth, options.outHeight);
                str2 = str2;
                c539280LDa = new C539280LDa(size.width, size.height, i7, C538540LAe.LLJJJIL, 0, 0, 480, str2, "image");
            } else {
                VEUtils.VEVideoFileInfo videoFileInfo = com.ss.android.vesdk.VEUtils.getVideoFileInfo(str2);
                if (videoFileInfo != null && videoFileInfo.width > 0 && videoFileInfo.height > 0 && videoFileInfo.maxDuration > 0) {
                    int i8 = videoFileInfo.width;
                    int i9 = videoFileInfo.height;
                    int i10 = videoFileInfo.rotation;
                    int i11 = videoFileInfo.maxDuration;
                    int i12 = videoFileInfo.bitrate;
                    int i13 = videoFileInfo.fps;
                    int i14 = videoFileInfo.codec;
                    c539280LDa = new C539280LDa(i8, i9, i10, i11, i12, i13, i14, videoFileInfo.duration, str2, com.ss.android.vesdk.VEUtils.getVideoEncodeTypeByID(i14));
                } else {
                    C2473009ma.LIZ.getClass();
                    MediaMetadataRetriever mediaMetadataRetrieverLJ = C2473009ma.LJ(context, str2);
                    try {
                        try {
                            String strLJII = C20144413ru.LJII(mediaMetadataRetrieverLJ);
                            if (strLJII != null) {
                                i = Integer.parseInt(strLJII);
                            } else {
                                i = 0;
                            }
                            String strLJFF = C20144413ru.LJFF(mediaMetadataRetrieverLJ);
                            if (strLJFF != null) {
                                i2 = Integer.parseInt(strLJFF);
                            } else {
                                i2 = 0;
                            }
                            String strLJI = C20144413ru.LJI(mediaMetadataRetrieverLJ);
                            if (strLJI != null) {
                                i3 = Integer.parseInt(strLJI);
                            } else {
                                i3 = 0;
                            }
                            String strLIZJ = C20144413ru.LIZJ(mediaMetadataRetrieverLJ);
                            if (strLIZJ != null) {
                                i4 = Integer.parseInt(strLIZJ);
                            } else {
                                i4 = 0;
                            }
                            String strLIZ = C20144413ru.LIZ(mediaMetadataRetrieverLJ);
                            if (strLIZ != null) {
                                i5 = Integer.parseInt(strLIZ);
                            } else {
                                i5 = 0;
                            }
                            String strLIZIZ = C20144413ru.LIZIZ(mediaMetadataRetrieverLJ);
                            if (strLIZIZ != null) {
                                i6 = Integer.parseInt(strLIZIZ);
                            } else {
                                i6 = 0;
                            }
                            String strLJ = C20144413ru.LJ(mediaMetadataRetrieverLJ);
                            if (strLJ == null) {
                                strLJ = "unknown";
                            }
                            str2 = str2;
                            c539280LDa = new C539280LDa(i, i2, i3, i4, i5, i6, 384, str2, strLJ);
                            try {
                                mediaMetadataRetrieverLJ.release();
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            str2 = str2;
                            c539280LDa = new C539280LDa(0, 0, 0, 0, 0, 0, 992, str2, null);
                            try {
                                mediaMetadataRetrieverLJ.release();
                            } catch (Exception e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } finally {
                    }
                }
            }
            LIZIZ.put(str2, c539280LDa);
        }
        return c539280LDa;
    }

    public final Size getVideoSize(Context context, String str) {
        C539280LDa c539280LDaLIZ = LIZ(context, str);
        int i = c539280LDaLIZ.LIZIZ;
        int i2 = c539280LDaLIZ.LIZJ;
        int i3 = c539280LDaLIZ.LIZLLL;
        if (i3 == 90 || i3 == 270) {
            i2 = i;
            i = i2;
        }
        return new Size(i, i2);
    }
}
