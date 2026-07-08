package com.bytedance.fresco.heif;

import X.AbstractC1327750kej;
import X.C1323050kX9;
import X.C1325120kaU;
import X.C1328480kfu;
import X.C1328520kfy;
import X.C1328570kg3;
import X.C1329360khK;
import X.C1330000kiM;
import X.C2188811AlT;
import X.InterfaceC1290810jh9;
import X.InterfaceC1327440keE;
import X.InterfaceC1328720kgI;
import X.InterfaceC1328910kgb;
import X.InterfaceC1330200kig;
import X.InterfaceC529960KqQ;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class HeifDecoder {
    public static final C1330000kiM HEIF_FORMAT = new C1330000kiM("HEIF_FORMAT", "heic");
    public static final C1330000kiM VVIC_FORMAT = new C1330000kiM("VVIC_FORMAT", "vvic");
    public static final C1330000kiM HEIF_FORMAT_ANIMATED = new C1330000kiM("HEIF_FORMAT_ANIMATED", "heic");
    public static boolean DEBUG = false;
    public static InterfaceC1328720kgI sBitmapFactory = new HeifBitmapFactoryImpl();
    public static boolean sHeifWppEnable = true;
    public static boolean mHeifDecodeLog = false;

    public static class HeifFormatDecoder implements InterfaceC1330200kig {
        public boolean mDecodeHeicUseSystemApiFirst;
        public InterfaceC1328910kgb mPlatformDecoder;
        public InterfaceC1327440keE mPooledByteBufferFactory;

        public boolean isDecodeHeicUseSystemApiFirst() {
            return this.mDecodeHeicUseSystemApiFirst;
        }

        public HeifFormatDecoder(InterfaceC1327440keE interfaceC1327440keE) {
            this.mPooledByteBufferFactory = interfaceC1327440keE;
        }

        public void setDecodeHeicUseSystemApiFirst(boolean z) {
            this.mDecodeHeicUseSystemApiFirst = z;
        }

        public HeifFormatDecoder(boolean z) {
            this.mDecodeHeicUseSystemApiFirst = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
        
            if (r2 != null) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private X.AbstractC1327750kej decodeAndBmfSr(X.C1328480kfu r27, int r28, X.InterfaceC529960KqQ r29, X.C1329360khK r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.fresco.heif.HeifDecoder.HeifFormatDecoder.decodeAndBmfSr(X.0kfu, int, X.0KqQ, X.0khK):X.0kej");
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
        
            if (r2 == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01ce, code lost:
        
            if (r10 == null) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x020e, code lost:
        
            if (r2 != null) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[Catch: all -> 0x0116, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0116, blocks: (B:14:0x0059, B:21:0x00b0, B:13:0x0054, B:11:0x0046), top: B:107:0x0046, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:48:0x0139, B:50:0x013d, B:52:0x0153, B:56:0x0186, B:73:0x01d0, B:80:0x01e0, B:82:0x01f5, B:84:0x01fb, B:77:0x01da, B:78:0x01dd, B:86:0x0210, B:88:0x0216, B:89:0x021c, B:66:0x01b1, B:71:0x01c2), top: B:102:0x0139, inners: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0186 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #0 {all -> 0x0244, blocks: (B:48:0x0139, B:50:0x013d, B:52:0x0153, B:56:0x0186, B:73:0x01d0, B:80:0x01e0, B:82:0x01f5, B:84:0x01fb, B:77:0x01da, B:78:0x01dd, B:86:0x0210, B:88:0x0216, B:89:0x021c, B:66:0x01b1, B:71:0x01c2), top: B:102:0x0139, inners: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01e0 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:48:0x0139, B:50:0x013d, B:52:0x0153, B:56:0x0186, B:73:0x01d0, B:80:0x01e0, B:82:0x01f5, B:84:0x01fb, B:77:0x01da, B:78:0x01dd, B:86:0x0210, B:88:0x0216, B:89:0x021c, B:66:0x01b1, B:71:0x01c2), top: B:102:0x0139, inners: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01f5 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:48:0x0139, B:50:0x013d, B:52:0x0153, B:56:0x0186, B:73:0x01d0, B:80:0x01e0, B:82:0x01f5, B:84:0x01fb, B:77:0x01da, B:78:0x01dd, B:86:0x0210, B:88:0x0216, B:89:0x021c, B:66:0x01b1, B:71:0x01c2), top: B:102:0x0139, inners: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0216 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:48:0x0139, B:50:0x013d, B:52:0x0153, B:56:0x0186, B:73:0x01d0, B:80:0x01e0, B:82:0x01f5, B:84:0x01fb, B:77:0x01da, B:78:0x01dd, B:86:0x0210, B:88:0x0216, B:89:0x021c, B:66:0x01b1, B:71:0x01c2), top: B:102:0x0139, inners: #7 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private X.AbstractC1327750kej decodeUseLibHeifFirst(X.C1328480kfu r25, int r26, X.InterfaceC529960KqQ r27, X.C1329360khK r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 623
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.fresco.heif.HeifDecoder.HeifFormatDecoder.decodeUseLibHeifFirst(X.0kfu, int, X.0KqQ, X.0khK):X.0kej");
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
        
            if (r4 != null) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011a A[Catch: all -> 0x0144, TryCatch #3 {all -> 0x0144, blocks: (B:6:0x0031, B:8:0x0035, B:10:0x004b, B:16:0x008d, B:33:0x00b7, B:50:0x0114, B:52:0x011a, B:53:0x0120, B:32:0x00b4, B:39:0x00d5, B:40:0x00d8, B:41:0x00d9, B:48:0x00fd, B:47:0x00f3, B:43:0x00df, B:25:0x0099, B:30:0x00a8), top: B:68:0x0031, inners: #0, #7 }] */
        /* JADX WARN: Type inference failed for: r12v8, types: [android.graphics.BitmapRegionDecoder, long] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private X.AbstractC1327750kej decodeUseSystemApiFirst(X.C1328480kfu r24, int r25, X.InterfaceC529960KqQ r26, X.C1329360khK r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.fresco.heif.HeifDecoder.HeifFormatDecoder.decodeUseSystemApiFirst(X.0kfu, int, X.0KqQ, X.0khK):X.0kej");
        }

        @Override // X.InterfaceC1330200kig
        public AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) {
            if (c1329360khK != null && c1329360khK.LJIILL && c1329360khK.LJIILLIIL != null && !c1328480kfu.LLJIJIL) {
                return decodeAndBmfSr(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
            }
            if (!this.mDecodeHeicUseSystemApiFirst) {
                return decodeUseLibHeifFirst(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
            }
            return decodeUseSystemApiFirst(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
        }
    }

    public static BitmapFactory.Options getDecodeOptionsForStream(C1328480kfu c1328480kfu, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c1328480kfu.LLIZLLLIL;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1328480kfu.LJII(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException(C1328520kfy.LIZJ(c1328480kfu));
    }

    public static BitmapFactory.Options getDecodeOptionsHasDecodeBound(C1328480kfu c1328480kfu, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c1328480kfu.LLIZLLLIL;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1328480kfu.LJII(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException(C1328520kfy.LIZJ(c1328480kfu));
    }

    public static BitmapFactory.Options getDecodeOptionsNoDecodeBound(C1328480kfu c1328480kfu, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c1328480kfu.LLIZLLLIL;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public static Rect getRegionToDecode(C1328480kfu c1328480kfu, C1329360khK c1329360khK) {
        Rect rect = c1328480kfu.LLJILJILJ;
        if (rect != null) {
            if (!c1329360khK.LJIIL) {
                return c1329360khK.LJIILIIL;
            }
            return rect;
        }
        return c1329360khK.LJIILIIL;
    }

    public static Bitmap trimBitmap(Bitmap bitmap, C1328480kfu c1328480kfu) throws Throwable {
        c1328480kfu.LJIJJLI();
        int i = c1328480kfu.LLILZLL;
        c1328480kfu.LJIJJLI();
        int i2 = c1328480kfu.LLIZ;
        int byteCount = bitmap.getByteCount();
        if (byteCount > 104857600) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("x");
            sbLIZ.append(i2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Too large(");
            sbLIZ2.append(byteCount);
            sbLIZ2.append(")bytes bitmap.  dimension: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" sampleSize: ");
            sbLIZ2.append(c1328480kfu.LLIZLLLIL);
            sbLIZ2.append(" Config: ");
            sbLIZ2.append(bitmap.getConfig());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (C1328570kg3.LIZ.LIZIZ(5)) {
                C1328570kg3.LIZ.w("XGFrescoLog", strLIZIZ2);
            }
            Pair<Integer, Integer> pairCalcDstWidthHeight = calcDstWidthHeight(i, i2, byteCount);
            return Bitmap.createScaledBitmap(bitmap, ((Integer) pairCalcDstWidthHeight.first).intValue(), ((Integer) pairCalcDstWidthHeight.second).intValue(), false);
        }
        return bitmap;
    }

    public static class HeifBitmap extends C1325120kaU {
        public HeifBitmap(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i) {
            super(c1323050kX9, interfaceC529960KqQ, i);
        }

        public HeifBitmap(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM) {
            super(bitmap, interfaceC1290810jh9, interfaceC529960KqQ, i, i2, rect, rect2, i3, c1330000kiM);
        }

        public HeifBitmap(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM, Map<String, String> map) {
            super(bitmap, interfaceC1290810jh9, interfaceC529960KqQ, i, i2, rect, rect2, i3, c1330000kiM, map);
        }
    }

    public static Pair<Integer, Integer> calcDstWidthHeight(int i, int i2, int i3) {
        float f = i * i2 * (4194304.0f / i3);
        float f2 = i / i2;
        return new Pair<>(Integer.valueOf((int) Math.sqrt(f * f2)), Integer.valueOf((int) Math.sqrt(f / f2)));
    }
}
