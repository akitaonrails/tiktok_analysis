package com.ss.android.ugc.aweme.channel.share.model;

import X.AbstractC1376390lvB;
import X.C06KX;
import X.C0M7Y;
import X.C1371420lnA;
import X.C1374270lrl;
import X.C1375540lto;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes22.dex */
public abstract class IWrapChannel extends AbstractC1376390lvB implements C06KX {
    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        return null;
    }

    public abstract String LJJJJJL();

    public abstract String LJJJJZ();

    public abstract boolean LJJJLL(C1375540lto c1375540lto, Activity activity, C0M7Y c0m7y);

    public abstract boolean LJJLIIIJ(C1371420lnA c1371420lnA, Activity activity, C0M7Y c0m7y);

    public abstract boolean LJJLIIIJLJLI(C1374270lrl c1374270lrl, Activity activity, C0M7Y c0m7y);

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return "";
    }

    @Override // X.AbstractC1376390lvB
    public final String LJJIJL() {
        return LJJJJZ();
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return LJJJJJL();
    }
}
