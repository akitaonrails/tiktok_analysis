package com.ss.android.ugc.aweme.comment.photocomment;

import X.C0CQT;
import X.C11NZ;
import X.C1344010l4x;
import X.C1499810p8F;
import X.C1697810uHb;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.commentv2.commentlist.ICommentApiV2;
import com.ss.android.ugc.aweme.net.preload.PreloadExtraData;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoInnerPreload implements InterfaceC727570SgN<ICommentApiV2, C11NZ<CommentItemList>> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, C0CQT.LIZJ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<CommentItemList> preload2(Bundle bundle, Function1<? super Class<ICommentApiV2>, ? extends ICommentApiV2> function1) {
        Serializable serializable;
        CommentContextSource commentContextSource;
        Comment comment;
        List listLJIIJJI;
        String str;
        if (bundle != null) {
            serializable = bundle.getSerializable("dispatch_context_source");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof CommentContextSource) || (commentContextSource = (CommentContextSource) serializable) == null) {
            return null;
        }
        Serializable serializable2 = bundle.getSerializable("enter_inner_comment");
        if (!(serializable2 instanceof Comment) || (comment = (Comment) serializable2) == null) {
            return null;
        }
        boolean z = true;
        if (comment.getCommentType() != 1) {
            z = false;
        }
        if (z) {
            listLJIIJJI = C1697810uHb.LJIIJJI("aweme_id", "channel_name", "viewed_photo_cids");
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI("comment_id", "channel_name", "viewed_photo_cids");
        }
        String strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        String strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSource);
        if (z) {
            str = "/aweme/v2/comment/list/";
        } else {
            str = "/aweme/v1/comment/list/reply/";
        }
        PreloadExtraData preloadExtraData = new PreloadExtraData(false, new PreloadExtraInfo(0, strEnterFrom, strEnterFrom2, str, listLJIIJJI), true, null, 8);
        if (z) {
            return C1344010l4x.LIZIZ(commentContextSource, preloadExtraData, function1);
        }
        return C1344010l4x.LIZJ(comment.getRootCommentId(), commentContextSource, preloadExtraData, function1);
    }
}
