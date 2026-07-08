package ttpobfuscated;

import X.InterfaceC1364105Vn;

/* JADX INFO: loaded from: classes4.dex */
public final class da implements jb {
    public final kb a;

    @Override // ttpobfuscated.jb
    public kb a() {
        return this.a;
    }

    public da(wf wfVar) {
        this.a = new ea(wfVar);
    }

    @Override // ttpobfuscated.jb
    public Object a(long j, Object obj, InterfaceC1364105Vn<? super eg> interfaceC1364105Vn) {
        return new eg(String.valueOf(j), this.a.a(), obj.toString(), "noop");
    }
}
