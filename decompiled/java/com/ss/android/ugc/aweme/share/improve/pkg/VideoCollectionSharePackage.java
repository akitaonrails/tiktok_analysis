package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C1370940lmO;
import X.C1372390loj;
import X.InterfaceC1210070hav;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoCollectionSharePackage extends LinkDefaultSharePackage implements InterfaceC1210070hav {
    public Function0<Unit> channelHook;
    public static final C1372390loj Companion = new C1372390loj();
    public static final int $stable = 8;

    @Override // X.InterfaceC1210070hav
    public final void LIZ() {
        this.channelHook = null;
    }

    public VideoCollectionSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        Function0<Unit> function02 = this.channelHook;
        if (function02 != null) {
            function02.invoke();
        } else {
            super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
        }
    }
}
