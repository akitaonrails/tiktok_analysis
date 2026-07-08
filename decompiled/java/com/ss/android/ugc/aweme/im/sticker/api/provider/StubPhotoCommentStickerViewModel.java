package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.C00CQ;
import X.C00CR;
import X.C05YD;
import X.C1BNE;
import X.C2252321DDq;
import X.C869590Y9l;
import X.C914160Zte;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class StubPhotoCommentStickerViewModel extends IPhotoCommentStickerViewModel {
    public final C2252321DDq LL = C1BNE.LIZ(null);

    @Override // com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel
    public final boolean checkFakeMsgValidityOnExit(String str, List<? extends C869590Y9l> list) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel
    public final void fetchPhotoCommentSticker(C00CQ c00cq, String str, int i) {
    }

    @Override // com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel
    public final String getEnteredAwemeId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel
    public final void recordEnteredAweme(String str, List<? extends C869590Y9l> list) {
    }

    @Override // com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel
    public final void resetState() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(21);
    }

    @Override // com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel
    public final C05YD<C00CR> getPhotoCommentStickerUIData() {
        return this.LL;
    }
}
