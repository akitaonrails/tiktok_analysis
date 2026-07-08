package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui;

import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class SearchHorizontalBounceView extends UISimpleView<AndroidView> {
    public SearchHorizontalBounceView(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }
}
