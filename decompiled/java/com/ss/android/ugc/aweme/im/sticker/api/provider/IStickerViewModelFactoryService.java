package com.ss.android.ugc.aweme.im.sticker.api.provider;

import X.InterfaceC1808360x9u;
import X.InterfaceC1808750xAX;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel;

/* JADX INFO: loaded from: classes15.dex */
public interface IStickerViewModelFactoryService {
    Photo2StickerViewModel LIZ(SessionInfo sessionInfo, InterfaceC1808750xAX interfaceC1808750xAX);

    AISelfStickerInlineViewModel LIZIZ();

    IAddStickerToFavViewModel LIZJ();

    IPhotoCommentStickerViewModel LIZLLL(InterfaceC1808360x9u interfaceC1808360x9u);
}
