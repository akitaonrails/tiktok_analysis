package ttpobfuscated;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class bd<T> implements ad<T> {
    public final int a;
    public final Object[] b;
    public int c;
    public int d;
    public int e;

    @Override // ttpobfuscated.ad
    public List<T> a() {
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.b[(this.c + i2) % this.a]);
        }
        return arrayList;
    }

    @Override // ttpobfuscated.ad
    public boolean b() {
        return this.e == this.a;
    }

    @Override // ttpobfuscated.ad
    public boolean isEmpty() {
        return this.e == 0;
    }

    @Override // ttpobfuscated.ad
    public int c() {
        return this.a;
    }

    @Override // ttpobfuscated.ad
    public int d() {
        return this.e;
    }

    public bd(int i) {
        this.a = i;
        this.b = new Object[i];
    }

    @Override // ttpobfuscated.ad
    public void add(T t) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = t;
        int i2 = this.a;
        this.d = (i + 1) % i2;
        int i3 = this.e;
        if (i3 == i2) {
            this.c = (this.c + 1) % i2;
        } else {
            this.e = i3 + 1;
        }
    }
}
