package com.ss.android.ugc.aweme.im.actionbar.api.protocol;

import X.C908820Zl2;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;

/* JADX INFO: loaded from: classes15.dex */
public final class RemoteIconAndTitleButtonProtocol implements ActionBarButtonProtocol<C908820Zl2> {
    public final Class<? extends ActionBarCell<C908820Zl2>> LL = DefaultRemoteIconCell.class;

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.protocol.ActionBarButtonProtocol
    public final Class<? extends ActionBarCell<C908820Zl2>> Ih0() {
        return this.LL;
    }
}
