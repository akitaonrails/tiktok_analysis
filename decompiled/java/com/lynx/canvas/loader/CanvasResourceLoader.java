package com.lynx.canvas.loader;

import X.AbstractC1301300jy4;
import X.C0WZX;
import X.C1288370jdD;
import X.C1301380jyC;
import X.C1301430jyH;
import X.C1301460jyK;
import X.C1301480jyM;
import X.C1301490jyN;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC1301390jyD;
import X.InterfaceC1301360jyA;
import X.InterfaceC1301370jyB;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.loader.CanvasResourceLoader;
import com.lynx.canvas.loader.CanvasResourceResolver;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasResourceLoader {
    public final WeakReference<KryptonApp> LIZ;

    public final AbstractC1301300jy4 LIZ() {
        KryptonApp kryptonApp = this.LIZ.get();
        if (kryptonApp != null) {
            return (AbstractC1301300jy4) kryptonApp.LJ(AbstractC1301300jy4.class);
        }
        return null;
    }

    public CanvasResourceLoader(KryptonApp kryptonApp) {
        this.LIZ = new WeakReference<>(kryptonApp);
    }

    public Bitmap decodeDataURLSync(String str) {
        Bitmap bitmapDecodeByteArray;
        if (str.startsWith("data:") && str.indexOf("base64,") != -1) {
            try {
                byte[] bArrDecode = Base64.decode(str.substring(str.indexOf("base64,") + 7), 0);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("decode data url failed, throw exception ");
                sbLIZ.append(e);
                C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
                bitmapDecodeByteArray = null;
            }
            if (bitmapDecodeByteArray == null) {
                C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "decode data url failed, bitmap = null ");
                return null;
            }
            return bitmapDecodeByteArray;
        }
        C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "decode DataURL failed, not data url");
        return null;
    }

    public Bitmap loadImageSync(String str) {
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "url empty");
            return null;
        }
        AbstractC1301300jy4 abstractC1301300jy4LIZ = LIZ();
        if (abstractC1301300jy4LIZ == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "loaderService not found");
            return null;
        }
        byte[] bArrLIZIZ = abstractC1301300jy4LIZ.LIZIZ(str);
        if (bArrLIZIZ == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "loadUrlSync return null");
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrLIZIZ, 0, bArrLIZIZ.length);
        if (bitmapDecodeByteArray == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "loadImageSync failed, bitmap = null ");
            return null;
        }
        return bitmapDecodeByteArray;
    }

    public String redirectUrl(String str) {
        String strLJI;
        if (str == null) {
            return null;
        }
        AbstractC1301300jy4 abstractC1301300jy4LIZ = LIZ();
        if (abstractC1301300jy4LIZ != null && (strLJI = abstractC1301300jy4LIZ.LJI(str)) != null) {
            return strLJI;
        }
        return str;
    }

    public void loadImage(String str, long j) {
        final CanvasResourceResolver canvasResourceResolver = new CanvasResourceResolver(j, str);
        if (str == null) {
            LIZIZ("url empty", canvasResourceResolver, false);
            return;
        }
        AbstractC1301300jy4 abstractC1301300jy4LIZ = LIZ();
        if (abstractC1301300jy4LIZ == null) {
            LIZIZ("loaderService not found", canvasResourceResolver, false);
        } else {
            abstractC1301300jy4LIZ.LJ(str, new InterfaceC1301370jyB() { // from class: X.0jyP
                @Override // X.InterfaceC1301370jyB
                public final void LIZ(Bitmap bitmap) {
                    canvasResourceResolver.LIZIZ(bitmap);
                }

                @Override // X.InterfaceC1301370jyB
                public final void reject(String str2) {
                    CanvasResourceLoader canvasResourceLoader = this.LIZIZ;
                    CanvasResourceResolver canvasResourceResolver2 = canvasResourceResolver;
                    canvasResourceLoader.getClass();
                    CanvasResourceLoader.LIZIZ(str2, canvasResourceResolver2, false);
                }
            });
        }
    }

    public static void LIZIZ(String str, CanvasResourceResolver canvasResourceResolver, boolean z) {
        C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", str);
        if (z) {
            canvasResourceResolver.LJ(str, false);
        } else {
            canvasResourceResolver.LIZ(str);
        }
    }

    public void loadAssets(String str, long j, boolean z) {
        loadAssetsWithPolicy(str, j, z, EnumC1301390jyD.DEFAULT_ASYNC.ordinal());
    }

    public void loadAssetsWithPolicy(String str, long j, boolean z, int i) {
        EnumC1301390jyD enumC1301390jyD;
        CanvasResourceResolver canvasResourceResolver = new CanvasResourceResolver(j, str);
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "Url is required!");
            LIZIZ("url empty", canvasResourceResolver, z);
            return;
        }
        AbstractC1301300jy4 abstractC1301300jy4LIZ = LIZ();
        if (abstractC1301300jy4LIZ == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "Loader service not founded!");
            LIZIZ("loaderService not found", canvasResourceResolver, z);
            return;
        }
        if (z) {
            try {
                C1288370jdD.LIZJ("KryptonCanvasResourceLoader", "Load stream assets.");
                abstractC1301300jy4LIZ.LJFF(str, new C1301480jyM(canvasResourceResolver));
                return;
            } catch (UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
                C1288370jdD.LIZJ("KryptonCanvasResourceLoader", "do not support stream load");
            }
        }
        EnumC1301390jyD[] enumC1301390jyDArrValues = EnumC1301390jyD.values();
        if (i >= 0 && i < enumC1301390jyDArrValues.length) {
            enumC1301390jyD = enumC1301390jyDArrValues[i];
        } else {
            enumC1301390jyD = EnumC1301390jyD.DEFAULT_ASYNC;
        }
        String strLJFF = C1301430jyH.LJFF(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[readFilePreferCurrentThread] loadAssetsWithPolicy enter, policy=");
        sbLIZ.append(enumC1301390jyD);
        sbLIZ.append(", streamLoad=");
        sbLIZ.append(z);
        sbLIZ.append(", url=");
        sbLIZ.append(strLJFF);
        sbLIZ.append(", thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        C1288370jdD.LIZJ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[readFilePreferCurrentThread] dispatch to loaderService=");
        sbLIZ2.append(abstractC1301300jy4LIZ.getClass().getSimpleName());
        sbLIZ2.append(", policy=");
        sbLIZ2.append(enumC1301390jyD);
        C1288370jdD.LIZJ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ2));
        abstractC1301300jy4LIZ.LIZLLL(str, new C1301460jyK(this, canvasResourceResolver, z), enumC1301390jyD);
    }

    public void loadImageWithOptions(String str, boolean z, boolean z2, long j) {
        CanvasResourceResolver canvasResourceResolver = new CanvasResourceResolver(j, str);
        if (str != null && !str.isEmpty()) {
            AbstractC1301300jy4 abstractC1301300jy4LIZ = LIZ();
            if (abstractC1301300jy4LIZ == null) {
                LIZIZ("loaderService not found", canvasResourceResolver, false);
                return;
            }
            C1301490jyN c1301490jyN = new C1301490jyN(this, canvasResourceResolver);
            C1301380jyC c1301380jyC = new C1301380jyC(z, z2);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadImageWithOptions ");
                sbLIZ.append(str);
                sbLIZ.append(" ");
                sbLIZ.append(c1301380jyC);
                C1288370jdD.LIZJ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
                abstractC1301300jy4LIZ.LIZ(c1301380jyC, c1301490jyN, str);
                return;
            } catch (UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadImageWithOptions not supported, fallback to loadUrlWithImageResolver ");
                sbLIZ2.append(str);
                C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", C2188811AlT.LIZIZ(sbLIZ2));
                abstractC1301300jy4LIZ.LJ(str, c1301490jyN);
                return;
            }
        }
        LIZIZ("url empty", canvasResourceResolver, false);
    }

    public byte[] encodeBitmap(ByteBuffer byteBuffer, int i, int i2, int i3, float f) {
        Bitmap.CompressFormat compressFormat;
        if (i == 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            if (i == 1) {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 * i3) / 4) + 256);
        if (bitmapCreateBitmap.compress(compressFormat, Math.round(f * 100.0f), byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public void loadAssetsRange(String str, final int i, final int i2, long j, final boolean z) {
        final CanvasResourceResolver canvasResourceResolver = new CanvasResourceResolver(j, str);
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "Url is required!");
            LIZIZ("url empty", canvasResourceResolver, z);
            return;
        }
        AbstractC1301300jy4 abstractC1301300jy4LIZ = LIZ();
        if (abstractC1301300jy4LIZ == null) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "Loader service not founded!");
            LIZIZ("loaderService not found", canvasResourceResolver, z);
            return;
        }
        if (i2 < i) {
            C1288370jdD.LIZIZ("KryptonCanvasResourceLoader", "end less than start!");
            LIZIZ("end less than start", canvasResourceResolver, z);
            return;
        }
        if (str.startsWith("asset")) {
            abstractC1301300jy4LIZ.LIZJ(str, new InterfaceC1301360jyA() { // from class: X.0jyO
                @Override // X.InterfaceC1301360jyA
                public final void reject(String str2) {
                    CanvasResourceLoader canvasResourceLoader = this.LJ;
                    CanvasResourceResolver canvasResourceResolver2 = canvasResourceResolver;
                    boolean z2 = z;
                    canvasResourceLoader.getClass();
                    CanvasResourceLoader.LIZIZ(str2, canvasResourceResolver2, z2);
                }

                @Override // X.InterfaceC1301360jyA
                public final void LIZ(byte[] bArr, int i3) {
                    canvasResourceResolver.LIZJ(Arrays.copyOfRange(bArr, i, i2), i2 - i);
                }
            });
            return;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(str), new C0WZX("dzBzEg4jUdKSVlYvUxOXKNQ4Og7qXMcgv5VhSCIzt7jeOGfH3rwxgxZHgQ==", null));
            httpURLConnection.setRequestMethod("GET");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bytes=");
            sbLIZ.append(i);
            sbLIZ.append("-");
            sbLIZ.append(i2);
            httpURLConnection.setRequestProperty("Range", C2188811AlT.LIZIZ(sbLIZ));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 206) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i3 = bufferedInputStream.read(bArr);
                    if (i3 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i3);
                    }
                }
                canvasResourceResolver.LIZJ(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.toByteArray().length);
                byteArrayOutputStream.close();
                bufferedInputStream.close();
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("load failed ");
                sbLIZ2.append(responseCode);
                canvasResourceResolver.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            httpURLConnection.disconnect();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ("load from net failed", canvasResourceResolver, false);
        }
    }
}
