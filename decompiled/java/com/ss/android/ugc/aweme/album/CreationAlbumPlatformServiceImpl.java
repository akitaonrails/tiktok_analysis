package com.ss.android.ugc.aweme.album;

import X.AbstractC214814194y;
import X.C13BV;
import X.C19A3;
import X.C19EG;
import X.C345260DgC;
import X.C539960LFq;
import X.InterfaceC1294060jmO;
import X.InterfaceC345200Dg6;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationAlbumPlatformServiceImpl implements CreationAlbumPlatformService {
    public final String LIZIZ = "_default_";

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LIZIZ(C539960LFq c539960LFq, MvChoosePhotoScene mvChoosePhotoScene) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LIZLLL(C539960LFq c539960LFq, C19A3 c19a3) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LIZJ() {
        throw new IllegalStateException("onLaunchCancel should handled by business");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    @InterfaceC1294060jmO
    public final List<InterfaceC345200Dg6> LJFF() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LJI(C539960LFq c539960LFq, C19A3 c19a3) {
        throw new IllegalStateException("action bar should register by business");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LJ(C19EG c19eg, AbstractC214814194y abstractC214814194y, C345260DgC c345260DgC) {
        throw new IllegalStateException("onLaunchFinish should handled by business");
    }
}
