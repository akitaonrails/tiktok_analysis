package defpackage;

import X.C09NT;
import X.C0VSV;
import X.C0WZX;
import X.C2107108Nh;
import X.C2114508Qd;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        try {
            File fileLJFF = C2114508Qd.LJFF(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
            if (fileLJFF != null && fileLJFF.exists()) {
                fileLJFF.delete();
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static Uri LIZIZ(Bitmap bitmap) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("qr_code_temp");
        sbLIZ.append(".jpg");
        File fileLIZJ = C2114508Qd.LIZJ(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), C2188811AlT.LIZIZ(sbLIZ));
        C0VSV c0vsv = new C0VSV(fileLIZJ);
        Throwable th = null;
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, c0vsv);
            C2107108Nh.LIZ(c0vsv, null);
            return Uri.fromFile(fileLIZJ);
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
                            C2107108Nh.LIZ(c0vsv, th);
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

    public static void LIZJ(Context context, Bitmap bitmap) throws Throwable {
        ContentResolver contentResolver = context.getContentResolver();
        String str = "qr_code_" + System.currentTimeMillis() + ".jpg";
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriLJJIJLIJ = C2204961BRm.LJJIJLIJ(contentResolver, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues, new C0WZX("XTJ/WwcPS8PQRg==", null));
            if (uriLJJIJLIJ != null) {
                OutputStream outputStreamLJFF = C09NT.LJFF(contentResolver, uriLJJIJLIJ);
                if (outputStreamLJFF != null) {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamLJFF);
                        C2107108Nh.LIZ(outputStreamLJFF, null);
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
                                        C2107108Nh.LIZ(outputStreamLJFF, th);
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
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                C2204961BRm.LJJJI(contentResolver, uriLJJIJLIJ, contentValues, null, null, new C0WZX("XTJ/WwcPS8PQRg==", null));
                return;
            }
            return;
        }
        File fileLIZJ = C2114508Qd.LIZJ(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
        C0VSV c0vsv = new C0VSV(fileLIZJ);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, c0vsv);
            C2107108Nh.LIZ(c0vsv, null);
            MediaStore.Images.Media.insertImage(contentResolver, fileLIZJ.getAbsolutePath(), str, (String) null);
            Uri.fromFile(fileLIZJ);
        } catch (Throwable th6) {
            try {
                TryCatchGuardChecker.doCheck(th6);
                try {
                    throw th6;
                } catch (Throwable th7) {
                    th = th7;
                    th = th6;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c0vsv, th);
                            throw th;
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
            }
        }
    }
}
