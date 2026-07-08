package v2b;

import X.C0H9H;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH;
import r4b.g;
import zvb.k;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends k {
    public final g LJ;
    public final int LJFF;
    public final int LJI;

    @Override // r4b.f
    public final boolean LJIIL() {
        return false;
    }

    @Override // yab.a, r4b.f
    public final int LJJJJL() {
        return 52;
    }

    @Override // r4b.f
    public final boolean LJJLJLI() {
        return false;
    }

    @Override // yab.a, r4b.f
    public final int LLJJIJIIJIL() {
        return 51;
    }

    @Override // r4b.f
    public final g LJJIL() {
        return this.LJ;
    }

    @Override // r4b.f
    public final int getPaddingEnd() {
        return this.LJI;
    }

    @Override // r4b.f
    public final int getPaddingStart() {
        return this.LJFF;
    }

    public u(UsSkuVH usSkuVH) {
        this.LJ = (g) usSkuVH.LLJJL.getValue();
        float f = 16;
        this.LJFF = (int) C0H9H.LIZ(f);
        this.LJI = (int) C0H9H.LIZ(f);
    }
}
