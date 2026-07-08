package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C11NJ;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.ICommentListViewModel;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListViewModel extends ICommentListViewModel {
    public static final /* synthetic */ int LLJ = 0;
    public final LifecycleOwner LLIZ;
    public final C11NJ LLIZLLLIL = new C11NJ();

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLIZLLLIL.LJ();
    }

    public CommentListViewModel(LifecycleOwner lifecycleOwner) {
        this.LLIZ = lifecycleOwner;
        this.LLILLL = lifecycleOwner;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[PHI: r16
      0x009a: PHI (r16v1 java.lang.Integer) = (r16v0 java.lang.Integer), (r16v3 java.lang.Integer) binds: [B:12:0x0038, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(java.lang.String r19, long r20, int r22, androidx.fragment.app.Fragment r23, java.lang.String r24) {
        /*
            r18 = this;
            r4 = r19
            int r0 = r4.length()
            if (r0 != 0) goto L10
            java.lang.String r1 = "StoryCommentListViewModel"
            java.lang.String r0 = "fetchCommentList awemeId is empty"
            X.C1344030l4z.LIZLLL(r1, r0)
            return
        L10:
            X.0lG9 r0 = X.C1350950lG9.LIZIZ
            boolean r2 = r0.LJFF()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILZ(r4)
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            if (r0 == 0) goto L9c
            long r14 = r0.getCommentCount()
        L32:
            boolean r0 = X.C1389300mG0.LJIIL(r23)
            r16 = 0
            if (r0 == 0) goto L9a
            boolean r0 = X.C296460Bjg.LIZ()
            if (r0 == 0) goto L4a
            X.0hru r0 = X.EnumC1220600hru.FRIENDS_TAB_WATERFALL
            int r0 = r0.getValue()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L4a:
            boolean r0 = X.C296460Bjg.LIZIZ()
            if (r0 == 0) goto L9a
            r0 = 1
        L51:
            com.ss.android.ugc.aweme.comment.bubble.BarrageCommentAndLikeApi r3 = com.ss.android.ugc.aweme.comment.bubble.BarrageCommentAndLikeApi.LIZIZ
            if (r2 != 0) goto L98
            if (r0 != 0) goto L98
            r13 = 0
        L58:
            r8 = 20
            r9 = 0
            r10 = 1
            r11 = 2
            r7 = r22
            r5 = r20
            r17 = r24
            r12 = r10
            X.11NZ r1 = r3.fetchCommentList(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            Y.AfS4S1100100_21 r1 = new Y.AfS4S1100100_21
            r12 = 0
            r3 = r18
            r7 = r1
            r8 = r5
            r10 = r3
            r11 = r4
            r7.<init>(r8, r10, r11, r12)
            Y.AfS4S1100100_21 r0 = new Y.AfS4S1100100_21
            r12 = 1
            r7 = r0
            r8 = r5
            r10 = r3
            r11 = r4
            r7.<init>(r8, r10, r11, r12)
            X.01kM r1 = r2.LJJLL(r1, r0)
            X.11NJ r0 = r3.LLIZLLLIL
            r0.LIZ(r1)
            return
        L98:
            r13 = 1
            goto L58
        L9a:
            r0 = 0
            goto L51
        L9c:
            r14 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel.CQ2(java.lang.String, long, int, androidx.fragment.app.Fragment, java.lang.String):void");
    }
}
