package com.ss.android.ugc.image.format;

import X.C098200Yq;
import X.C0LR1;
import X.C0LR3;
import X.C0LR5;
import X.C0VSV;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C201955140j;
import X.C2107108Nh;
import X.C2188811AlT;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ImagePreprocessServiceImpl implements ImagePreprocessService {
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0461  */
    @Override // com.ss.android.ugc.image.format.ImagePreprocessService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0LR3 LIZ(java.lang.String r32, X.C0LR5 r33) {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.image.format.ImagePreprocessServiceImpl.LIZ(java.lang.String, X.0LR5):X.0LR3");
    }

    @Override // com.ss.android.ugc.image.format.ImagePreprocessService
    public final List<C0LR3> LIZIZ(List<String> list, C0LR5 c0lr5) {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            try {
                c098200Yq = LIZ(str, c0lr5);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preprocessBatch single threw path=");
                sbLIZ.append(str);
                sbLIZ.append(" msg=");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                C201955140j.LJFF("ImagePreprocessServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("single throw: ");
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                c098200Yq = new C0LR1(40099, C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            }
            arrayList.add(c098200Yq);
        }
        return arrayList;
    }

    public static Bitmap LIZJ(Bitmap bitmap, File file, int i, C0LR5 c0lr5) {
        Integer next;
        boolean z;
        Bitmap bitmap2 = bitmap;
        int iIntValue = i;
        Long l = c0lr5.LJI;
        if (l == null) {
            try {
                C0VSV c0vsv = new C0VSV(file);
                try {
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, iIntValue, c0vsv);
                    C2107108Nh.LIZ(c0vsv, null);
                    return bitmap2;
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
                            C2107108Nh.LIZ(c0vsv, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("encodeWithSizeBudget write threw: ");
                sbLIZ.append(th4.getMessage());
                C201955140j.LJFF("ImagePreprocessServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        } else {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < c0lr5.LJIIJ) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap2.compress(Bitmap.CompressFormat.JPEG, iIntValue, byteArrayOutputStream);
                i3++;
                if (byteArrayOutputStream.size() > l.longValue()) {
                    Iterator<Integer> it2 = c0lr5.LJIIIIZZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.intValue() < iIntValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Integer num = next;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        int width = (int) (bitmap2.getWidth() * c0lr5.LJIIIZ);
                        if (width < 1) {
                            width = 1;
                        }
                        int height = (int) (bitmap2.getHeight() * c0lr5.LJIIIZ);
                        if (height < 1) {
                            height = 1;
                        }
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, width, height, true);
                        if (!bitmap2.isRecycled()) {
                            bitmap2.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                        }
                        i4++;
                        Integer num2 = (Integer) C13LP.LJJLIIIJL(c0lr5.LJIIIIZZ);
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        }
                        i2++;
                        bitmap2 = bitmapCreateScaledBitmap;
                    }
                } else {
                    try {
                        C0VSV c0vsv2 = new C0VSV(file);
                        try {
                            c0vsv2.write(byteArrayOutputStream.toByteArray());
                            C2107108Nh.LIZ(c0vsv2, null);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("encodeWithSizeBudget success: ");
                            sbLIZ2.append(file);
                            sbLIZ2.append(", quality=");
                            sbLIZ2.append(iIntValue);
                            sbLIZ2.append(", compressCount=");
                            sbLIZ2.append(i3);
                            sbLIZ2.append(", downsampleCount=");
                            sbLIZ2.append(i4);
                            C201955140j.LJIILIIL("ImagePreprocessServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                            return bitmap2;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = null;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsv2, th);
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        TryCatchGuardChecker.doCheck(th8);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("encodeWithSizeBudget write threw: ");
                        sbLIZ3.append(th8.getMessage());
                        C201955140j.LJFF("ImagePreprocessServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                        return null;
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:13:0x004c, B:15:0x0056, B:20:0x0089, B:22:0x0095, B:24:0x0099, B:25:0x009d, B:27:0x00a1, B:32:0x00ad, B:34:0x00b3, B:50:0x00d1, B:52:0x00da, B:18:0x007b), top: B:98:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:13:0x004c, B:15:0x0056, B:20:0x0089, B:22:0x0095, B:24:0x0099, B:25:0x009d, B:27:0x00a1, B:32:0x00ad, B:34:0x00b3, B:50:0x00d1, B:52:0x00da, B:18:0x007b), top: B:98:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #3 {all -> 0x019a, blocks: (B:57:0x00fc, B:59:0x0105, B:61:0x0120, B:54:0x00e8, B:55:0x00eb), top: B:96:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0LR3 LIZLLL(java.lang.String r21, X.C0LRB r22, java.io.File r23, java.util.List r24, X.C0LR5 r25) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.image.format.ImagePreprocessServiceImpl.LIZLLL(java.lang.String, X.0LRB, java.io.File, java.util.List, X.0LR5):X.0LR3");
    }
}
