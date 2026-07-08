package com.ss.android.ugc.aweme.comment.service;

import X.C04TD;
import X.C1341780l1M;
import X.C1342140l1w;
import X.C1372520low;
import X.C424620Gku;
import X.EnumC1341650l19;
import android.animation.AnimatorSet;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLikeAndHateServiceImpl implements ICommentLikeAndHateService {
    public static ICommentLikeAndHateService LJII() {
        Object objLIZ = C04TD.LIZ(ICommentLikeAndHateService.class, false);
        if (objLIZ != null) {
            return (ICommentLikeAndHateService) objLIZ;
        }
        if (C04TD.LLJJ == null) {
            synchronized (ICommentLikeAndHateService.class) {
                if (C04TD.LLJJ == null) {
                    C04TD.LLJJ = new CommentLikeAndHateServiceImpl();
                }
            }
        }
        return C04TD.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final String LIZ(long j) {
        return C1372520low.LIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final void LIZIZ(View view) {
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, view, EnumC1341650l19.CELL, 0.0f, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final void LIZJ(C424620Gku c424620Gku) {
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, c424620Gku, EnumC1341650l19.AVATAR, 0.0f, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final void LJ(TuxTextView tuxTextView) {
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, tuxTextView, EnumC1341650l19.USERNAME, 0.0f, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final AnimatorSet LJFF(TuxIconView tuxIconView) {
        return C1342140l1w.LIZIZ(tuxIconView);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final AnimatorSet LIZLLL(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        return C1342140l1w.LIZJ(tuxIconView, tuxIconView2);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService
    public final AnimatorSet LJI(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        return C1342140l1w.LIZLLL(tuxIconView, tuxIconView2);
    }
}
