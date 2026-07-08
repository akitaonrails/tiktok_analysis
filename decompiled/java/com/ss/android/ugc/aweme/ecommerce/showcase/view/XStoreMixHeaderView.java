package com.ss.android.ugc.aweme.ecommerce.showcase.view;

import X.C1195950hE9;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes19.dex */
public final class XStoreMixHeaderView extends UISimpleView<C1195950hE9> {
    public XStoreMixHeaderView(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1195950hE9 c1195950hE9 = new C1195950hE9(context);
        c1195950hE9.setOnHeaderOffsetChangeListener(new AwS624S0100000_10(this, 130));
        return c1195950hE9;
    }
}
