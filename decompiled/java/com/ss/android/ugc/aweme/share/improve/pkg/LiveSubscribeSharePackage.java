package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C0M7Y;
import X.C1370940lmO;
import X.C1372880lpW;
import X.C1374860lsi;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveSubscribeSharePackage extends LinkDefaultSharePackage {
    public static final C1372880lpW Companion = new Object() { // from class: X.0lpW
    };
    public static final int $stable = 8;

    public LiveSubscribeSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        C1374860lsi.LIZJ().LIZ(0, interfaceC1369790lkX.key(), "others_video_share_list");
        return false;
    }
}
