package ttpobfuscated;

import X.C09AY;
import X.C0VSP;
import X.C13LQ;
import X.C2107108Nh;
import X.C786410Ut5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class b7 {

    public final class a extends C09AY implements Function1<Byte, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final CharSequence a(byte b) {
            return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return a(b.byteValue());
        }
    }

    public static final String a(Path path) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStreamNewInputStream.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    C2107108Nh.LIZ(inputStreamNewInputStream, null);
                    return e(messageDigest.digest());
                }
            }
        } finally {
        }
    }

    public static final String b(byte[] bArr) {
        return e(a(bArr));
    }

    public static final String c(byte[] bArr) {
        return e(a(bArr));
    }

    public static final byte[] d(byte[] bArr) {
        return a(bArr);
    }

    public static final String e(byte[] bArr) {
        return C13LQ.LJJIJIL(bArr, "", a.a);
    }

    public static final String a(File file) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        C0VSP c0vsp = new C0VSP(file);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = c0vsp.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    C2107108Nh.LIZ(c0vsp, null);
                    return e(messageDigest.digest());
                }
            }
        } finally {
        }
    }

    public static final String b(File file) {
        return a(file);
    }

    public static final String a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(Charsets.UTF_8));
        return e(messageDigest.digest());
    }

    public static final String b(String str) {
        return a(str);
    }

    public static final byte[] a(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static final String b(Path path) {
        return a(path);
    }
}
