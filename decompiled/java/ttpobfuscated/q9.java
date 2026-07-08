package ttpobfuscated;

import X.C08PN;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class q9 implements mg {
    public final Path b;

    @Override // ttpobfuscated.mg
    public boolean a() {
        return Files.isRegularFile(this.b, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
    }

    @Override // ttpobfuscated.mg
    public String b() {
        return this.b.toAbsolutePath().toString();
    }

    @Override // ttpobfuscated.mg
    public String c() {
        return b7.a(this.b);
    }

    @Override // ttpobfuscated.mg
    public long d() {
        return Files.size(this.b);
    }

    @Override // ttpobfuscated.mg
    public String getName() {
        return C08PN.LIZ(this.b);
    }

    public q9(String str) {
        this.b = Paths.get(str, new String[0]);
    }
}
