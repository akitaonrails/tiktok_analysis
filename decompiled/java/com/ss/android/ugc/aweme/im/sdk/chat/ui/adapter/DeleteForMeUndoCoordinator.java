package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.C1389910mGz;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteForMeUndoCoordinator {
    public final Fragment LIZ;
    public C1389910mGz LIZIZ;
    public boolean LIZJ;

    public DeleteForMeUndoCoordinator(Fragment fragment) {
        this.LIZ = fragment;
        fragment.getLifecycle().addObserver(new DeleteForMeUndoCoordinator$lifecycleObserver$1(this));
    }
}
