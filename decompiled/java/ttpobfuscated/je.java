package ttpobfuscated;

import java.security.MessageDigest;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes31.dex */
public final class je implements y6 {
    public static final a a = new a();

    public static final class a {
    }

    @Override // ttpobfuscated.y6
    public byte[] a(String str) {
        return MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8));
    }
}
