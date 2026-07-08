package ms.bd.o;

import X.C0VSJ;
import X.C0VSV;
import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        int i3;
        long j2;
        String strLIZJ;
        String str2;
        String string;
        Context context = a.LIZIZ.LIZ;
        String str3 = y2.LIZ;
        synchronized (y2.class) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(y2.LIZ(context).getAbsolutePath());
                sb.append((String) k.a(16777217, 0, 0L, "ed5339", new byte[]{59}));
                str2 = y2.LIZ;
                sb.append(str2);
                string = sb.toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                i2 = 16777217;
                i3 = 0;
                j2 = 0;
                strLIZJ = (String) k.a(16777217, 0, 0L, "721f6c", new byte[]{118, 11, 30, 83, 87, 73, 17, 43, 67, 19, 22, 4, 107, 61, 39, 79, 104, 82, 62, 11});
            }
            if (!new C0VSJ(string).exists() || (strLIZJ = y2.LIZJ(string)) == null || strLIZJ.length() <= 0) {
                InputStream inputStreamOpen = context.getResources().getAssets().open(str2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i4 = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (true) {
                    int i5 = inputStreamOpen.read(bArr, 0, i4);
                    if (i5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                    i4 = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                }
                C0VSV c0vsv = new C0VSV(string);
                c0vsv.write(byteArrayOutputStream.toByteArray());
                c0vsv.close();
                StringBuilder sb2 = new StringBuilder();
                i2 = 16777217;
                i3 = 0;
                j2 = 0;
                sb2.append((String) k.a(16777217, 0, 0L, "b1ce12", new byte[]{112, 59, 29, 30, 10, 101, 54, 71, 101, 117}));
                sb2.append(string);
                y2.LIZJ(sb2.toString());
                strLIZJ = y2.LIZJ(string);
                if (strLIZJ == null || strLIZJ.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(string, (String) k.a(16777217, 0, 0L, "93c92c", new byte[]{58, 38}));
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    strLIZJ = y2.LIZJ(string);
                }
                if (strLIZJ == null || strLIZJ.length() == 0) {
                    strLIZJ = (String) k.a(i2, i3, j2, "28c100", new byte[]{115, 1, 76, 4, 81, 26, 20, 43, 0, 78, 17, 1, 76, 4, 81, 26});
                }
            }
        }
        return strLIZJ;
    }
}
