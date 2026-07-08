package ttp.orbu.sdk.init;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPOrbuActiveResult {
    public boolean a;
    public boolean b;

    public final boolean getResultOfLoadNativeNet() {
        return this.b;
    }

    public final boolean getShouldActive() {
        return this.a;
    }

    public final void setResultOfLoadNativeNet(boolean z) {
        this.b = z;
    }

    public final void setShouldActive(boolean z) {
        this.a = z;
    }

    public TTPOrbuActiveResult(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
