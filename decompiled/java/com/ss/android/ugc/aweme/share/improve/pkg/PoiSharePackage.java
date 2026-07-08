package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C1370940lmO;
import X.C1372460loq;
import X.C1389890mGx;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final class PoiSharePackage extends LinkDefaultSharePackage {
    public static final C1372460loq Companion = new C1372460loq();
    public static final int $stable = 8;

    public PoiSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        if (interfaceC1369790lkX != null) {
            if (this.url.length() == 0) {
                if (view != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIJ(context.getResources().getString(2131848750));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
            return;
        }
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }
}
