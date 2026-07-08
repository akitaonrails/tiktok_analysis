package ttpobfuscated;

import X.C0VSJ;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class m7 implements mg {
    public final File b;

    @Override // ttpobfuscated.mg
    public boolean a() {
        return this.b.isFile();
    }

    @Override // ttpobfuscated.mg
    public String b() {
        return this.b.getAbsolutePath();
    }

    @Override // ttpobfuscated.mg
    public String c() {
        return b7.a(this.b);
    }

    @Override // ttpobfuscated.mg
    public long d() {
        return this.b.length();
    }

    @Override // ttpobfuscated.mg
    public String getName() {
        return this.b.getName();
    }

    public m7(String str) {
        this.b = new C0VSJ(str);
    }
}
