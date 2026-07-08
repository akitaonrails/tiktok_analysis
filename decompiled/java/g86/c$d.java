package g86;

import X.AbstractC1317910kOr;
import X.C1317920kOs;
import X.C1317930kOt;
import X.C1317970kOx;
import X.C1322670kWX;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes21.dex */
public final class c$d extends c$a {
    public final OutputStream LJ;

    public final void LJ() throws IOException {
        this.LJ.write(this.LIZIZ, 0, this.LIZLLL);
        this.LIZLLL = 0;
    }

    public final void LJFF() throws IOException {
        if (this.LIZLLL > 0) {
            LJ();
        }
    }

    public c$d(OutputStream outputStream) {
        if (outputStream != null) {
            this.LJ = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    public final void LJI(int i) throws IOException {
        if (this.LIZJ - this.LIZLLL < i) {
            LJ();
        }
    }

    public final void LJIILIIL(int i) throws IOException {
        LJI(5);
        LIZJ(i);
    }

    @Override // X.AbstractC1317910kOr
    public final void LIZ(int i, int i2) throws IOException {
        LJI(14);
        LIZJ((i << 3) | 5);
        byte[] bArr = this.LIZIZ;
        int i3 = this.LIZLLL;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.LIZLLL = i6 + 1;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    public final void LJIIIIZZ(int i, byte[] bArr) throws IOException {
        int length = bArr.length;
        LJIILIIL((i << 3) | 2);
        LJIILIIL(length);
        LJII(bArr, 0, length);
    }

    public final void LJIIIZ(int i, int i2) throws IOException {
        LJI(20);
        LIZJ(i << 3);
        if (i2 >= 0) {
            LIZJ(i2);
        } else {
            LIZLLL(i2);
        }
    }

    public final void LJIIJJI(int i, String str) throws IOException {
        int i2;
        int i3 = 3;
        LJIILIIL((i << 3) | 2);
        try {
            int length = str.length() * 3;
            if ((length & (-128)) == 0) {
                i2 = 1;
            } else if ((length & (-16384)) == 0) {
                i2 = 2;
            } else if ((length & (-2097152)) == 0) {
                i2 = 3;
            } else if ((length & (-268435456)) == 0) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            int i4 = i2 + length;
            int i5 = this.LIZJ;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int iLIZ = C1322670kWX.LIZ(str, bArr, 0, length);
                LJIILIIL(iLIZ);
                LJII(bArr, 0, iLIZ);
                return;
            }
            if (i4 > i5 - this.LIZLLL) {
                LJ();
            }
            int length2 = str.length();
            if ((length2 & (-128)) == 0) {
                i3 = 1;
            } else if ((length2 & (-16384)) == 0) {
                i3 = 2;
            } else if ((length2 & (-2097152)) != 0) {
                if ((length2 & (-268435456)) == 0) {
                    i3 = 4;
                } else {
                    i3 = 5;
                }
            }
            int i6 = this.LIZLLL;
            try {
                if (i3 == i2) {
                    int i7 = i6 + i3;
                    this.LIZLLL = i7;
                    int iLIZ2 = C1322670kWX.LIZ(str, this.LIZIZ, i7, this.LIZJ - i7);
                    this.LIZLLL = i6;
                    LIZJ((iLIZ2 - i6) - i3);
                    this.LIZLLL = iLIZ2;
                    return;
                }
                int length3 = str.length();
                int i8 = 0;
                while (i8 < length3 && str.charAt(i8) < 128) {
                    i8++;
                }
                int i9 = length3;
                while (true) {
                    if (i8 >= length3) {
                        break;
                    }
                    char cCharAt = str.charAt(i8);
                    if (cCharAt < 2048) {
                        i9 += (127 - cCharAt) >>> 31;
                        i8++;
                    } else {
                        int length4 = str.length();
                        int i10 = 0;
                        while (i8 < length4) {
                            char cCharAt2 = str.charAt(i8);
                            if (cCharAt2 < 2048) {
                                i10 += (127 - cCharAt2) >>> 31;
                            } else {
                                i10 += 2;
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                    if (Character.codePointAt(str, i8) >= 65536) {
                                        i8++;
                                    } else {
                                        throw new C1317970kOx(i8, length4);
                                    }
                                }
                            }
                            i8++;
                        }
                        i9 += i10;
                    }
                }
                if (i9 >= length3) {
                    LIZJ(i9);
                    this.LIZLLL = C1322670kWX.LIZ(str, this.LIZIZ, this.LIZLLL, i9);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UTF-8 length does not fit in int: ");
                    sbLIZ.append(((long) i9) + 4294967296L);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (C1317970kOx e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZLLL = i6;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new C1317920kOs(e2);
            }
        } catch (C1317970kOx e3) {
            TryCatchGuardChecker.doCheck(e3);
            AbstractC1317910kOr.LIZ.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(C1317930kOt.LIZ);
            try {
                LJIILIIL(bytes.length);
                LJIIJ(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw new C1317920kOs(e4);
            }
        }
    }

    public final void LJIIL(int i, int i2) throws IOException {
        LJI(20);
        LIZJ(i << 3);
        LIZJ(i2);
    }

    public final void LJIILJJIL(int i, long j) throws IOException {
        LJI(20);
        LIZJ(i << 3);
        LIZLLL(j);
    }

    public final void LJII(byte[] bArr, int i, int i2) {
        int i3 = this.LIZJ;
        int i4 = this.LIZLLL;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.LIZIZ, i4, i2);
            this.LIZLLL += i2;
            return;
        }
        System.arraycopy(bArr, i, this.LIZIZ, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.LIZLLL = this.LIZJ;
        LJ();
        if (i7 <= this.LIZJ) {
            System.arraycopy(bArr, i6, this.LIZIZ, 0, i7);
            this.LIZLLL = i7;
        } else {
            this.LJ.write(bArr, i6, i7);
        }
    }

    public final void LJIIJ(int i, byte[] bArr, int i2) {
        LJII(bArr, i, i2);
    }
}
