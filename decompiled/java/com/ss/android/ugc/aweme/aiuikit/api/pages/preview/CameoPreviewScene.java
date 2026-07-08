package com.ss.android.ugc.aweme.aiuikit.api.pages.preview;

import X.C01GW;
import X.C0MWU;
import X.C18YW;
import X.C18YX;
import X.C18YY;
import X.C1DRF;
import X.C2178411ANj;
import X.C452501pT;
import X.C539960LFq;
import com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene;
import com.ss.android.ugc.aweme.aiuikit.api.pages.preview.CameoPreviewScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public class CameoPreviewScene extends AIGCBaseScene<C18YY> {
    public final int LLJJLIIIJLLLLLLLZ;
    public final C18YY LLJL;
    public final C0MWU LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLJI(C539960LFq c539960LFq) {
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLL(C1DRF c1drf) {
    }

    public C2178411ANj LLLLLLL() {
        throw null;
    }

    public C18YX LLLLLLLLL() {
        throw null;
    }

    public C18YW LLLLLLLLLL() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.18YY] */
    public CameoPreviewScene() {
        new C18YX();
        new C2178411ANj();
        new C18YW();
        this.LLJJLIIIJLLLLLLLZ = R.layout.nv;
        this.LLJL = new Object(this) { // from class: X.18YY
            public final CameoPreviewScene LIZ;

            {
                this.LIZ = this;
            }
        };
        C0MWU c0mwu = new C0MWU();
        c0mwu.LIZJ = R.style.y0;
        this.LLJLIL = c0mwu;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 99));
        this.LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 98));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 100));
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final int LLLLLILLIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final C0MWU LLLLLJLJLL() {
        return this.LLJLIL;
    }
}
