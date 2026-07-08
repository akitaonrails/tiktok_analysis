package com.ss.android.ugc.aweme.share.screenshot.strategy;

import X.C06KX;
import X.C0N6J;
import X.C1374120lrW;
import X.C19719912Dl;
import X.InterfaceC1369790lkX;
import android.content.Context;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ScreenshotShareStrategy<T extends SharePackage> implements C06KX {
    public abstract boolean LIZ(InterfaceC1369790lkX interfaceC1369790lkX, SharePackage sharePackage);

    public abstract boolean LIZJ(InterfaceC1369790lkX interfaceC1369790lkX, String str, int i);

    public abstract boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX, String str, int i);

    public abstract boolean LJ(InterfaceC1369790lkX interfaceC1369790lkX, Context context, SharePackage sharePackage, C1374120lrW c1374120lrW);

    public abstract C19719912Dl LJFF();

    public abstract C0N6J LJI();

    public abstract String LJII(SharePackage sharePackage);
}
