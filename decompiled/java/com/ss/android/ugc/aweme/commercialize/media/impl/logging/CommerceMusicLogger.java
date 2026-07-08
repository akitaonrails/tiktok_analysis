package com.ss.android.ugc.aweme.commercialize.media.impl.logging;

import X.AbstractC1023720ckM;
import X.C1023630ckD;
import X.C1035030d2b;
import X.C1850180yFM;
import X.C1850190yFN;
import X.C19744212Mu;
import X.InterfaceC1007800cKg;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS108S0201000_27;
import kotlin.jvm.internal.AwS11S0101100_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceMusicLogger extends AbstractC1023720ckM implements ICommerceMusicLogger {
    public final C1023630ckD<?>[] LIZ;

    public CommerceMusicLogger() {
        super(new Object[0]);
        C1850190yFN.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1850190yFN.LIZIZ, AFwS269S0000000_27.get$arr$(49)), new C1023630ckD<>(C1850190yFN.LIZJ, AFwS269S0000000_27.get$arr$(50)), new C1023630ckD<>(C1850190yFN.LIZLLL, AFwS269S0000000_27.get$arr$(51)), new C1023630ckD<>(C1850190yFN.LJ, AFwS229S0000000_2.get$arr$(133)), new C1023630ckD<>(C1850190yFN.LJI, AFwS269S0000000_27.get$arr$(52)), new C1023630ckD<>(C1850190yFN.LJIIL, AFwS269S0000000_27.get$arr$(53)), new C1023630ckD<>(C1850190yFN.LJIILIIL, AFwS269S0000000_27.get$arr$(54))};
    }

    @Override // X.AbstractC1023380cjo
    public final InterfaceC1007800cKg getProcessor() {
        return C1035030d2b.LIZ(super.getProcessor(), C1035030d2b.LIZIZ(C1035030d2b.LIZ, "commerce_music"));
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger
    public final void LJIILLIIL(int i, long j, Aweme aweme) {
        if (!C19744212Mu.LIZLLL()) {
            return;
        }
        C1850180yFM.LIZ.getClass();
        log(C1850180yFM.LJ, new AwS11S0101100_27(i, j, aweme, 1));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger
    public final void LJIL(int i, Aweme aweme, MusicDetail musicDetail) {
        if (!C19744212Mu.LIZLLL()) {
            return;
        }
        C1850180yFM.LIZ.getClass();
        log(C1850180yFM.LIZJ, new AwS108S0201000_27(i, aweme, musicDetail, 6));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger
    public final void LJJ(int i, Aweme aweme, MusicDetail musicDetail) {
        if (!C19744212Mu.LIZLLL()) {
            return;
        }
        C1850180yFM.LIZ.getClass();
        log(C1850180yFM.LIZLLL, new AwS108S0201000_27(i, aweme, musicDetail, 5));
    }
}
