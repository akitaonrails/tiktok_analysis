package net.bytedance.zdplib;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DeltaSignerVerifier {
    public final long LIZ;

    public static native void free(long j);

    public static native int generatePrivateKey(byte[] bArr);

    public static native int getPublicKey(byte[] bArr, long j);

    public static native int getPublicKeyUncompressed(byte[] bArr, long j);

    public static native long initPrivateKey(byte[] bArr);

    public static native int sign(byte[] bArr, long j, byte[] bArr2);

    public static native int verify(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static {
        LoadSoLancet.LIZJ("delta");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("delta");
        LoadSoLancet.LJ(jUptimeMillis, "delta");
        LoadSoLancet.LIZLLL(jUptimeMillis, "delta");
        LoadSoLancet.LIZIZ("delta");
    }

    public static String LIZ() throws Exception {
        byte[] bArr = new byte[32];
        int iGeneratePrivateKey = generatePrivateKey(bArr);
        if (iGeneratePrivateKey >= 0) {
            return Delta.LIZ(bArr);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneratePrivateKey  error ");
        sbLIZ.append(iGeneratePrivateKey);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String LIZJ() throws Exception {
        byte[] bArr = new byte[65];
        int publicKeyUncompressed = getPublicKeyUncompressed(bArr, this.LIZ);
        if (publicKeyUncompressed == 0) {
            return Delta.LIZ(bArr);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPublicKey error ");
        sbLIZ.append(publicKeyUncompressed);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public DeltaSignerVerifier(String str) throws Exception {
        byte[] bArrLIZIZ = Delta.LIZIZ(str);
        if (bArrLIZIZ.length == 32) {
            this.LIZ = initPrivateKey(bArrLIZIZ);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid private key :");
        sbLIZ.append(str);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final byte[] LIZIZ(byte[] bArr) throws Exception {
        byte[] bArr2 = new byte[72];
        int iSign = sign(bArr2, this.LIZ, bArr);
        if (iSign >= 0) {
            return Arrays.copyOfRange(bArr2, 0, iSign);
        }
        throw new Exception(C786410Ut5.j4("sign error ret=%d", new Object[]{Integer.valueOf(iSign)}));
    }
}
