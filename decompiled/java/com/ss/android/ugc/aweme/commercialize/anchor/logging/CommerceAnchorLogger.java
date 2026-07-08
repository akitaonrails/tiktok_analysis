package com.ss.android.ugc.aweme.commercialize.anchor.logging;

import X.AbstractC1023720ckM;
import X.C04TD;
import X.C1023630ckD;
import X.C1050580dRg;
import X.C1050590dRh;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger;
import com.ss.android.ugc.aweme.commercialize.anchor.model.MapExtra;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS1S4400000_16;
import kotlin.jvm.internal.AwS5S3400000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAnchorLogger extends AbstractC1023720ckM implements ICommerceAnchorLogger {
    public final C1023630ckD<?>[] LIZ;

    public CommerceAnchorLogger() {
        super(new Object[0]);
        C1050580dRg.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1050580dRg.LIZIZ, AFwS229S0000000_2.get$arr$(129)), new C1023630ckD<>(C1050580dRg.LIZJ, AFwS229S0000000_2.get$arr$(130)), new C1023630ckD<>(C1050580dRg.LIZLLL, AFwS252S0000000_16.get$arr$(98)), new C1023630ckD<>(C1050580dRg.LJ, AFwS252S0000000_16.get$arr$(99)), new C1023630ckD<>(C1050580dRg.LJFF, AFwS252S0000000_16.get$arr$(100)), new C1023630ckD<>(C1050580dRg.LJII, AFwS229S0000000_2.get$arr$(131)), new C1023630ckD<>(C1050580dRg.LJIIJ, AFwS252S0000000_16.get$arr$(101)), new C1023630ckD<>(C1050580dRg.LJIIJJI, AFwS252S0000000_16.get$arr$(102))};
    }

    public static ICommerceAnchorLogger LJJIIZ() {
        Object objLIZ = C04TD.LIZ(ICommerceAnchorLogger.class, false);
        return objLIZ != null ? (ICommerceAnchorLogger) objLIZ : new CommerceAnchorLogger();
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger
    public final void LIZ(Aweme aweme, String str) {
        C1050590dRh.LIZ.getClass();
        log(C1050590dRh.LJFF, new AwS130S1100000_16(aweme, str, 2));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger
    public final void LJFF(Aweme aweme, AnchorCommonStruct anchorCommonStruct, MapExtra mapExtra, String str, Integer num, String str2) {
        C1050590dRh.LIZ.getClass();
        log(C1050590dRh.LJ, new AwS1S4400000_16(aweme, anchorCommonStruct, mapExtra, str, num, str2, 0));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger
    public final void LJIILL(Aweme aweme, AnchorCommonStruct anchorCommonStruct, MapExtra mapExtra, String str, Integer num, String str2) {
        C1050590dRh.LIZ.getClass();
        log(C1050590dRh.LIZLLL, new AwS1S4400000_16(aweme, anchorCommonStruct, mapExtra, str, num, str2, 1));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger
    public final void LJIILJJIL(Aweme aweme, AnchorCommonStruct anchorCommonStruct, MapExtra mapExtra, String str, String str2, Integer num, String str3) {
        C1050590dRh.LIZ.getClass();
        log(C1050590dRh.LIZIZ, new AwS5S3400000_16(aweme, anchorCommonStruct, mapExtra, str, str2, num, str3, 1));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger
    public final void LJJI(Aweme aweme, AnchorCommonStruct anchorCommonStruct, MapExtra mapExtra, String str, String str2, Integer num, String str3) {
        C1050590dRh.LIZ.getClass();
        log(C1050590dRh.LIZJ, new AwS5S3400000_16(aweme, anchorCommonStruct, mapExtra, str, str2, num, str3, 0));
    }
}
