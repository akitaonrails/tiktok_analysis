package com.ss.android.ugc.aweme.social.sticker.editcomponent.sharedcomment;

import X.AbstractC1442160ndG;
import X.AbstractC19589811ke;
import X.C0FFO;
import X.C1440500naa;
import X.C19609011nk;
import X.C19610011nu;
import X.C19610211nw;
import X.C19774612Ym;
import X.EnumC1466150oFx;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.ISharedCommentStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public final class SharedCommentStickerComponentProviderImpl implements ISharedCommentStickerComponentProvider {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.ISharedCommentStickerComponentProvider
    public final C0FFO LIZIZ() {
        int i = C19610211nw.LJIL;
        return new C0FFO(EnumC1466150oFx.SHARED_COMMENT, 0, true, false, false, false, false, null, new Pair(Float.valueOf(0.5f), Float.valueOf(1.2f)), false, false, false, false, false, false, new C19774612Ym(11), 1259498);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.ISharedCommentStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZ() {
        return C19609011nk.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11nu] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.ISharedCommentStickerComponentProvider
    public final C19610011nu LIZJ(final Context context, final String str, final C1440500naa c1440500naa) {
        return new AbstractC1442160ndG<SharedCommentStickerModel>(context, str, c1440500naa) { // from class: X.11nu
            public final Context LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC1442160ndG
            public final EnumC1466150oFx LIZJ() {
                return EnumC1466150oFx.SHARED_COMMENT;
            }

            @Override // X.AbstractC1442160ndG
            public final String LIZ(StickerModel stickerModel) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("/shared_comment_sticker/");
                sbLIZ.append(((SharedCommentStickerModel) stickerModel).getId());
                sbLIZ.append(".png");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1442160ndG
            public final View LIZIZ(StickerModel stickerModel) {
                C19578811is c19578811is = new C19578811is(14, this.LIZJ, null);
                CommentVideoModel commentModel = ((SharedCommentStickerModel) stickerModel).getCommentModel();
                if (commentModel != null) {
                    c19578811is.LIZIZ(commentModel, true);
                }
                return c19578811is;
            }

            {
                super(context, c1440500naa);
                this.LIZJ = context;
                this.LIZLLL = str;
            }

            @Override // X.AbstractC1442160ndG
            public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
                SharedCommentStickerModel sharedCommentStickerModel = (SharedCommentStickerModel) stickerModel;
                return sharedCommentStickerModel.copy(BaseStickerModel.copy$default(sharedCommentStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), sharedCommentStickerModel.commentModel);
            }
        };
    }
}
