package com.ss.android.ugc.trill.download.protocol.watermark;

import X.C1379810m0h;
import X.C2427709fH;
import android.util.Pair;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultWaterMarkAbilityProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeVideoWaterMarkAbilityProtocol extends DefaultWaterMarkAbilityProtocol<C1379810m0h> {
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final Pair<Boolean, List<String>> LLIZ;
    public final String LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final Pair<Boolean, List<String>> LIZLLL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final String LJ() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJI() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJII() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJIIIZ() {
        return this.LLILZ;
    }

    public AwemeVideoWaterMarkAbilityProtocol(C1379810m0h c1379810m0h) {
        super(c1379810m0h);
        this.LLILLL = c1379810m0h.LJIIZILJ;
        this.LLILZ = c1379810m0h.LJIJ;
        this.LLILZIL = c1379810m0h.LJIJI;
        this.LLILZLL = c1379810m0h.LJIJJ;
        this.LLIZ = c1379810m0h.LJIJJLI;
        this.LLIZLLLIL = C2427709fH.LJIIZILJ(c1379810m0h.LIZ);
    }
}
