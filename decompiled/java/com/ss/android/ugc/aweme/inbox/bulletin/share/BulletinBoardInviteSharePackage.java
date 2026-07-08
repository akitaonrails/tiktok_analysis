package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.C0M7Y;
import X.C0OYY;
import X.C1370940lmO;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardInviteSharePackage extends SharePackage {
    public static final C0OYY Companion = new C0OYY();
    public static final int $stable = 8;

    public BulletinBoardInviteSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        new BulletinBoardShareAbilityHandler(context).LJIIJJI(context, view, this, interfaceC1369790lkX);
        return true;
    }
}
