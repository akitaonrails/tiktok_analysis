package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC1375550ltp;
import X.C1370940lmO;
import X.C1375540lto;
import X.C1377110lwL;
import X.C13BV;
import X.C13LP;
import X.C743880TFy;
import X.C844470XAv;
import X.InterfaceC1369790lkX;
import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MultiImageSharePackage extends WebSharePackage {
    public static final C1377110lwL Companion = new C1377110lwL();
    public List<String> localImagePaths;

    public MultiImageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.localImagePaths = C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "facebook") && (!this.localImagePaths.isEmpty())) {
            C844470XAv.LIZ.getClass();
            if (C743880TFy.LIZ(C844470XAv.LIZ(), "com.facebook.katana")) {
                Uri uri = Uri.EMPTY;
                C13LP.LJJJJZI(this.localImagePaths);
                function2.invoke(new C1375540lto(uri, null, null, null, this.localImagePaths, true, 60), Boolean.TRUE);
                return;
            }
        }
        super.LJIJ(interfaceC1369790lkX, function2);
    }
}
