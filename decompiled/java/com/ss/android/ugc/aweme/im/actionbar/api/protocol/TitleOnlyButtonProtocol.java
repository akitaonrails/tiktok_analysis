package com.ss.android.ugc.aweme.im.actionbar.api.protocol;

import X.C908870Zl7;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;

/* JADX INFO: loaded from: classes15.dex */
public final class TitleOnlyButtonProtocol implements ActionBarButtonProtocol<C908870Zl7> {
    public final Class<? extends ActionBarCell<C908870Zl7>> LL = DefaultTitleOnlyCell.class;

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.protocol.ActionBarButtonProtocol
    public final Class<? extends ActionBarCell<C908870Zl7>> Ih0() {
        return this.LL;
    }
}
