package ms.bd.o;

import X.C0VSV;
import X.C2188811AlT;
import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) throws Throwable {
        InputStream inputStreamOpen;
        C0VSV c0vsv;
        String strLIZIZ = str;
        AssetManager assets = a.LIZIZ.LIZ.getAssets();
        int i2 = 0;
        if (!strLIZIZ.startsWith((String) k.a(16777217, 0, 0L, "0ec259", new byte[]{111}))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) k.a(16777217, 0, 0L, "aa4df7", new byte[]{62}));
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String[] list = assets.list("");
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.length; i3++) {
            if (list[i3].endsWith(strLIZIZ)) {
                String str2 = list[i3];
                String absolutePath = File.createTempFile((String) k.a(16777217, i2, 0L, "543c0c", new byte[]{41, 37, 69, 15, 27}), "").getAbsolutePath();
                C0VSV c0vsv2 = null;
                try {
                    inputStreamOpen = assets.open(str2);
                } catch (IOException e) {
                    e = e;
                    inputStreamOpen = null;
                } catch (Throwable th) {
                    th = th;
                    inputStreamOpen = null;
                }
                try {
                    c0vsv = new C0VSV(absolutePath);
                    try {
                        byte[] bArr = new byte[256];
                        long j2 = 0;
                        while (true) {
                            int i4 = inputStreamOpen.read(bArr);
                            if (i4 > 0) {
                                c0vsv.write(bArr, i2, i4);
                                j2 += (long) i4;
                                i2 = 0;
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    e = e2;
                                    TryCatchGuardChecker.doCheck(e);
                                    c0vsv2 = c0vsv;
                                    try {
                                        e.printStackTrace();
                                        c0vsv = c0vsv2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        TryCatchGuardChecker.doCheck(th);
                                        z.LIZ(inputStreamOpen);
                                        z.LIZ(c0vsv2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0vsv2 = c0vsv;
                                    TryCatchGuardChecker.doCheck(th);
                                    z.LIZ(inputStreamOpen);
                                    z.LIZ(c0vsv2);
                                    throw th;
                                }
                            }
                        }
                        c0vsv.flush();
                        if (j2 > 0) {
                            arrayList.add(absolutePath);
                        }
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                    c0vsv = c0vsv2;
                    z.LIZ(inputStreamOpen);
                    z.LIZ(c0vsv);
                } catch (Throwable th5) {
                    th = th5;
                    TryCatchGuardChecker.doCheck(th);
                    TryCatchGuardChecker.doCheck(th);
                    z.LIZ(inputStreamOpen);
                    z.LIZ(c0vsv2);
                    throw th;
                }
                z.LIZ(inputStreamOpen);
                z.LIZ(c0vsv);
            }
        }
        return arrayList.toArray(new String[i2]);
    }
}
