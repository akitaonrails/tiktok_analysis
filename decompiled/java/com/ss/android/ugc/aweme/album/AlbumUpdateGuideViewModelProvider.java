package com.ss.android.ugc.aweme.album;

import X.AbstractC903280Zc6;
import X.C20307614d8;
import X.C738350Sxl;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes31.dex */
public final class AlbumUpdateGuideViewModelProvider implements IAlbumUpdateGuideViewModelProvider {
    public final C20307614d8 LL = new C20307614d8(1);

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.LL;
    }
}
