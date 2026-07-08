package com.ss.android.ugc.aweme.feed.ui;

import X.C740400T2o;
import com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController;

/* JADX INFO: loaded from: classes25.dex */
public final class RecFriendDialogNUJSwipeUpControllerImpl implements IRecFriendDialogNUJSwipeUpController {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController
    public final boolean LIZJ() {
        return !C740400T2o.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController
    public final boolean LIZIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.feed.IRecFriendDialogNUJSwipeUpController
    public final void LIZ(boolean z) {
        this.LIZ = z;
    }
}
