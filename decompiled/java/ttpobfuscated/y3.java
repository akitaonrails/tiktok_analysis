package ttpobfuscated;

import ttp.orbu.sdk.TTPOrbuSdk;

/* JADX INFO: loaded from: classes24.dex */
public final class y3 implements o9 {
    public volatile TTPOrbuSdk.OrbuState a = TTPOrbuSdk.OrbuState.DISABLE;

    public final String b() {
        return "npth/crash";
    }

    public final n1 c() {
        return new y5();
    }

    public final n1 d() {
        return new va();
    }

    public final ae e() {
        return new be();
    }

    public final TTPOrbuSdk.OrbuState a() {
        return this.a;
    }

    public final void a(TTPOrbuSdk.OrbuState orbuState) {
        this.a = orbuState;
    }
}
