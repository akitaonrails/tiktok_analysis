package com.ss.android.ugc.aweme.compliance.protection.amberalert.share;

import X.AbstractC1375550ltp;
import X.C1370940lmO;
import X.C1374960lss;
import X.C1378130lxz;
import X.InterfaceC1369790lkX;
import Y.AfS156S0200000_21;
import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class AmberAlertSharePackage extends SharePackage {
    public final AmberAlertCardInfo amberAlertCardInfo;
    public static final C1378130lxz Companion = new Object() { // from class: X.0lxz
    };
    public static final int $stable = 8;

    public AmberAlertSharePackage(C1370940lmO c1370940lmO, AmberAlertCardInfo amberAlertCardInfo) {
        super(c1370940lmO);
        this.amberAlertCardInfo = amberAlertCardInfo;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        C1374960lss.LIZ(C1374960lss.LIZ, this.itemType, this.url, interfaceC1369790lkX.key(), 0, this, 24).LJIIZILJ(new AfS156S0200000_21(this, function2, 4), new AfS156S0200000_21(this, function2, 5));
    }
}
