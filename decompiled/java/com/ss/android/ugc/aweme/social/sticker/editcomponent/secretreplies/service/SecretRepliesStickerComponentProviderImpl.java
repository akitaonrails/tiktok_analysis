package com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service;

import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C0FUH;
import X.C19586211k4;
import X.C19588411kQ;
import X.C19588511kR;
import X.C19618111pD;
import X.C390420FSm;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesStickerComponentProviderImpl implements ISecretRepliesStickerComponentProvider {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZ() {
        return C19588511kR.class;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZLLL() {
        return C19588411kQ.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11k4] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider
    public final C19586211k4 LIZIZ(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<SecretRepliesResponseStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11k4
            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.SECRET_REPLIES_RESPONSE;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                SecretRepliesResponseStickerModel secretRepliesResponseStickerModel = (SecretRepliesResponseStickerModel) stickerModel;
                return secretRepliesResponseStickerModel.copy(BaseStickerModel.copy$default(secretRepliesResponseStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1073741826, 15, null), secretRepliesResponseStickerModel.baseAwemeId, secretRepliesResponseStickerModel.questionText, secretRepliesResponseStickerModel.responseText, secretRepliesResponseStickerModel.visible);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                SecretRepliesResponseStickerModel secretRepliesResponseStickerModel = (SecretRepliesResponseStickerModel) stickerModel;
                return new C19586111k3(this.LIZ, secretRepliesResponseStickerModel.copy(BaseStickerModel.copy$default(secretRepliesResponseStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), secretRepliesResponseStickerModel.baseAwemeId, secretRepliesResponseStickerModel.questionText, secretRepliesResponseStickerModel.responseText, secretRepliesResponseStickerModel.visible), this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider
    public final C19618111pD LIZJ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19618111pD(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }
}
