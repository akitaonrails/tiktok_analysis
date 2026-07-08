package com.google.android.gms.maps.model;

import X.C0W3J;
import X.C837010WsV;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class CustomCap extends Cap {
    public final C837010WsV bitmapDescriptor;
    public final float refWidth;

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.bitmapDescriptor) + " refWidth=" + this.refWidth + e3.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(C837010WsV c837010WsV, float f) {
        super(3, c837010WsV, Float.valueOf(f));
        C0W3J.LJIIIZ(c837010WsV, "bitmapDescriptor must not be null");
        if (f > 0.0f) {
            this.bitmapDescriptor = c837010WsV;
            this.refWidth = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }
}
