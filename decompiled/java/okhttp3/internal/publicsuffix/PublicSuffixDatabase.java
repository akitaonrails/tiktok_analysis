package okhttp3.internal.publicsuffix;

import X.C1496330p2d;
import X.C1496660p3A;
import X.C1496670p3B;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C842670X3x;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import xlp.c;

/* JADX INFO: loaded from: classes14.dex */
public final class PublicSuffixDatabase {
    public byte[] publicSuffixExceptionListBytes;
    public byte[] publicSuffixListBytes;
    public static final byte[] WILDCARD_LABEL = {42};
    public static final String[] EMPTY_RULE = new String[0];
    public static final String[] PREVAILING_RULE = {"*"};
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    public final AtomicBoolean listRead = new AtomicBoolean(false);
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static String okhttp3_internal_publicsuffix_PublicSuffixDatabase_com_ss_android_ugc_aweme_lancet_CookieManagerLancet_getEffectiveTldPlusOne(PublicSuffixDatabase publicSuffixDatabase, String str) {
        return "";
    }

    private void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C842670X3x.LIZ.LJIIJJI(5, "Failed to read public suffix list", e2);
                    if (z) {
                        C786410Ut5.u3().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    C786410Ut5.u3().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
    }

    public String getEffectiveTldPlusOne(String str) {
        return okhttp3_internal_publicsuffix_PublicSuffixDatabase_com_ss_android_ugc_aweme_lancet_CookieManagerLancet_getEffectiveTldPlusOne(this, str);
    }

    private void readTheList() {
        InputStream inputStreamLJLLI = C786410Ut5.LJLLI(PublicSuffixDatabase.class, "publicsuffixes.gz");
        if (inputStreamLJLLI == null) {
            return;
        }
        C1496670p3B c1496670p3B = new C1496670p3B(new C1496660p3A(C1496330p2d.LIZJ(inputStreamLJLLI)));
        try {
            byte[] bArr = new byte[c1496670p3B.readInt()];
            c1496670p3B.readFully(bArr);
            byte[] bArr2 = new byte[c1496670p3B.readInt()];
            c1496670p3B.readFully(bArr2);
            c.LJ(c1496670p3B);
            synchronized (this) {
                try {
                    this.publicSuffixListBytes = bArr;
                    this.publicSuffixExceptionListBytes = bArr2;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th) {
            c.LJ(c1496670p3B);
            throw th;
        }
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String strBinarySearchBytes;
        String strBinarySearchBytes2;
        String[] strArrSplit;
        String[] strArrSplit2;
        int i = 0;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
            }
        }
        synchronized (this) {
            try {
                if (this.publicSuffixListBytes == null) {
                    throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(c.LJIIIIZZ);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 < length) {
                strBinarySearchBytes = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
                if (strBinarySearchBytes != null) {
                    break;
                }
                i3++;
            } else {
                strBinarySearchBytes = null;
                break;
            }
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = WILDCARD_LABEL;
                strBinarySearchBytes2 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                if (strBinarySearchBytes2 != null) {
                    break;
                }
            }
            strBinarySearchBytes2 = null;
        } else {
            strBinarySearchBytes2 = null;
        }
        if (strBinarySearchBytes2 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String strBinarySearchBytes3 = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (strBinarySearchBytes3 != null) {
                    str = strBinarySearchBytes3;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("!");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ).split("\\.");
        }
        if (strBinarySearchBytes == null && strBinarySearchBytes2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearchBytes != null) {
            strArrSplit = strBinarySearchBytes.split("\\.");
        } else {
            strArrSplit = EMPTY_RULE;
        }
        if (strBinarySearchBytes2 != null) {
            strArrSplit2 = strBinarySearchBytes2.split("\\.");
        } else {
            strArrSplit2 = EMPTY_RULE;
        }
        if (strArrSplit.length <= strArrSplit2.length) {
            return strArrSplit2;
        }
        return strArrSplit;
    }

    public String okhttp3_internal_publicsuffix_PublicSuffixDatabase__getEffectiveTldPlusOne$___twin___(String str) {
        int length;
        int length2;
        if (str != null) {
            String[] strArrSplit = IDN.toUnicode(str).split("\\.");
            String[] strArrFindMatchingRule = findMatchingRule(strArrSplit);
            if (strArrSplit.length == strArrFindMatchingRule.length && strArrFindMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            if (strArrFindMatchingRule[0].charAt(0) == '!') {
                length = strArrSplit.length;
                length2 = strArrFindMatchingRule.length;
            } else {
                length = strArrSplit.length;
                length2 = strArrFindMatchingRule.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] strArrSplit2 = str.split("\\.");
            for (int i = length - length2; i < strArrSplit2.length; i++) {
                sb.append(strArrSplit2[i]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    public void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    public static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 > -1 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = bArr2[i8][i9] & 255;
                while (true) {
                    int i12 = i11 - (bArr[i5 + i10] & 255);
                    if (i12 != 0) {
                        if (i12 >= 0) {
                            if (i12 > 0) {
                            }
                        }
                    } else {
                        i10++;
                        i9++;
                        if (i10 != i7) {
                            if (bArr2[i8].length == i9) {
                                if (i8 == bArr2.length - 1) {
                                    break;
                                }
                                i8++;
                                i9 = -1;
                                i11 = 46;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            int i13 = i7 - i10;
            int length2 = bArr2[i8].length - i9;
            while (true) {
                i8++;
                if (i8 >= bArr2.length) {
                    break;
                }
                length2 += bArr2[i8].length;
            }
            if (length2 >= i13) {
                if (length2 <= i13) {
                    return new String(bArr, i5, i7, c.LJIIIIZZ);
                }
                i3 = i2 + 1;
            } else {
                length = i5 - 1;
            }
        }
        return null;
    }
}
