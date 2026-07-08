package com.bytedance.lynx.service.text;

import X.C1315390kKn;
import X.C1315410kKp;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class TextResourceLoader {
    public static final Map<Integer, C1315390kKn> sImages = new ConcurrentHashMap();
    public static final AtomicInteger sIdGenerator = new AtomicInteger(1);

    public static native void destroyFontCallback(long j);

    public static native void onFontLoaded(long j);

    public static native void onImageError(long j);

    public static native void onImageLoaded(long j);

    public static void ReleaseImage(int i) {
        sImages.remove(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LoadFont(java.lang.Object r5, java.lang.String r6, int r7, final long r8) {
        /*
            boolean r0 = r5 instanceof j27.s
            r4 = 0
            if (r0 != 0) goto L9
            destroyFontCallback(r8)
            return r4
        L9:
            j27.s r5 = (j27.s) r5
            if (r6 != 0) goto Lf
            java.lang.String r6 = ""
        Lf:
            r0 = 400(0x190, float:5.6E-43)
            if (r7 <= r0) goto L5c
            r3 = 1
        L14:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L57
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r3)
        L1e:
            if (r1 == 0) goto L2a
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 < r0) goto L2a
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r7, r4)
        L2a:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L51
            if (r1 != 0) goto L51
            X.0jxq r0 = r5.LJIIJ(r6)
            if (r0 == 0) goto L51
            X.0kKo r2 = new X.0kKo
            r2.<init>(r8)
            X.0jxj r0 = X.C1301060jxg.LIZ
            android.graphics.Typeface r1 = r0.LJ(r5, r6, r3, r2)
            if (r1 == 0) goto L56
            r2.LIZIZ(r1, r3)
        L48:
            com.lynx.textra.JavaFontManager r0 = com.lynx.textra.TTText.mFontManager
            com.lynx.textra.JavaTypeface r0 = r0.CreateOrRegisterTypeface(r1, r6, r7, r4)
            int r0 = r0.mIndex
            return r0
        L51:
            destroyFontCallback(r8)
            if (r1 != 0) goto L48
        L56:
            return r4
        L57:
            android.graphics.Typeface r1 = X.C1300980jxY.LJ(r3, r5, r6)
            goto L1e
        L5c:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.text.TextResourceLoader.LoadFont(java.lang.Object, java.lang.String, int, long):int");
    }

    public static int LoadImage(Object obj, String str, float f, float f2, long j) {
        if (!(obj instanceof s)) {
            return 0;
        }
        C1315390kKn c1315390kKn = new C1315390kKn(str, f, f2, (s) obj, new C1315410kKp(j));
        int andIncrement = sIdGenerator.getAndIncrement();
        sImages.put(Integer.valueOf(andIncrement), c1315390kKn);
        return andIncrement;
    }

    public static void DrawImage(int i, Canvas canvas, float f, float f2, float f3, float f4, Drawable.Callback callback) {
        C1315390kKn c1315390kKn = sImages.get(Integer.valueOf(i));
        if (c1315390kKn != null) {
            if (callback != null) {
                c1315390kKn.LIZJ = new WeakReference<>(callback);
            }
            canvas.save();
            canvas.translate((int) f, (int) f2);
            c1315390kKn.LIZ.LJII(canvas);
            canvas.restore();
        }
    }
}
