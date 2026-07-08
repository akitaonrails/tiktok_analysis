package com.bytedance.pipo.ttpay.recharge.share;

import X.C0M7Y;
import X.C1370940lmO;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class QrCodeSharePackage extends SharePackage {
    public final Function1<Boolean, Unit> onShareFinish;

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public QrCodeSharePackage(C1370940lmO c1370940lmO, AFwS259S0000000_21 aFwS259S0000000_21) {
        super(c1370940lmO);
        this.onShareFinish = aFwS259S0000000_21;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        new QrCodeShareHandler(this.onShareFinish).LJIIJJI(context, null, this, interfaceC1369790lkX);
        return true;
    }
}
