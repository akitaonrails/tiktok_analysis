package com.ttnet.org.chromium.net.impl;

import X.AbstractC1497370p4J;
import X.C1497360p4I;
import X.C1498340p5s;
import android.content.Context;
import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes24.dex */
public class NativeCronetProvider extends AbstractC1497370p4J {
    @Override // X.AbstractC1497370p4J
    public final void LIZIZ() {
    }

    @Override // X.AbstractC1497370p4J
    public final void LIZJ() {
    }

    @Override // X.AbstractC1497370p4J
    public final void LIZLLL() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.LIZ});
    }

    public NativeCronetProvider(Context context) {
        super(context);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0p4L] */
    @Override // X.AbstractC1497370p4J
    public final C1497360p4I LIZ(boolean z) {
        return new C1497360p4I(new C1498340p5s(this.LIZ, z) { // from class: X.0p4L
            public C1497180p40 LJJJJI;

            @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
            public final C1497180p40 LJJJI() {
                return this.LJJJJI;
            }

            @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, X.AbstractC1497090p3r
            public final /* bridge */ /* synthetic */ AbstractC1497090p3r LJIL(AbstractC1497170p3z abstractC1497170p3z) {
                LJJJIL(abstractC1497170p3z);
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0p40] */
            @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
            public final CronetEngineBuilderImpl LJJJIL(final AbstractC1497170p3z abstractC1497170p3z) {
                this.LJJJJI = new AbstractC1497170p3z(abstractC1497170p3z) { // from class: X.0p40
                    public final AbstractC1497170p3z LIZ;

                    {
                        this.LIZ = abstractC1497170p3z;
                    }

                    @Override // X.AbstractC1497170p3z
                    public final void loadLibrary(String str) {
                        this.LIZ.loadLibrary(str);
                    }
                };
                return this;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof NativeCronetProvider) && this.LIZ.equals(((AbstractC1497370p4J) obj).LIZ)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
