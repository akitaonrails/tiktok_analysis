package com.bytedance.pipo.ocr.ocr;

import X.C09N3;
import X.C09NT;
import X.C0WZX;
import X.C2107108Nh;
import X.C2186591Aht;
import X.C2204961BRm;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class OcrViewModel extends AndroidViewModel {
    public static final /* synthetic */ int LLIZ = 0;
    public final MutableLiveData<C2186591Aht> LL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public final Application LLILZLL;

    public OcrViewModel(Application application) {
        super(application);
        this.LLILZLL = application;
        this.LL = new MutableLiveData<>();
    }

    public final Bitmap vQ2(Uri uri) throws Throwable {
        Bitmap bitmapWQ2;
        int iLJLILLLLZI;
        int iLJLILLLLZI2;
        InputStream inputStreamLJ = C09NT.LJ(this.LLILZLL.getContentResolver(), uri);
        if (inputStreamLJ == null) {
            return null;
        }
        try {
            float f = 270.0f;
            if (Build.VERSION.SDK_INT >= 24) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamLJ);
                bufferedInputStream.mark(bufferedInputStream.available());
                try {
                    iLJLILLLLZI2 = C2204961BRm.LJLILLLLZI(new ExifInterface(bufferedInputStream), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ4xz0cPlfu9XPSXA5", null));
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (iLJLILLLLZI2 != 3) {
                    if (iLJLILLLLZI2 != 6) {
                        if (iLJLILLLLZI2 != 8) {
                            f = 0.0f;
                        }
                    } else {
                        f = 90.0f;
                    }
                } else {
                    f = 180.0f;
                }
                bufferedInputStream.reset();
                bitmapWQ2 = wQ2(BitmapFactory.decodeStream(bufferedInputStream), f);
            } else {
                try {
                    iLJLILLLLZI = C2204961BRm.LJLILLLLZI(new ExifInterface(C09N3.LIZIZ(this.LLILZLL, uri).getAbsolutePath()), 1, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ4xz0cPlfu9XPSXA5", null));
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (iLJLILLLLZI != 3) {
                    if (iLJLILLLLZI != 6) {
                        if (iLJLILLLLZI != 8) {
                            f = 0.0f;
                        }
                    } else {
                        f = 90.0f;
                    }
                } else {
                    f = 180.0f;
                }
                bitmapWQ2 = wQ2(BitmapFactory.decodeStream(inputStreamLJ), f);
            }
            C2107108Nh.LIZ(inputStreamLJ, null);
            return bitmapWQ2;
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
                    C2107108Nh.LIZ(inputStreamLJ, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static Bitmap wQ2(Bitmap bitmap, float f) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap;
        }
        if (!Intrinsics.LJFF(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return bitmapCreateBitmap;
    }
}
