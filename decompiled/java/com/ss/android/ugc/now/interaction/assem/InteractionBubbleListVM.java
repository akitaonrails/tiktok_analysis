package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC316870CbV;
import X.C1158140gFA;
import X.C1353820lKm;
import X.C1353930lKx;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbles;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionBubbleListVM extends AssemListViewModel<C1353820lKm, InterfaceC1891350zJl, PaginationCursor> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1353820lKm(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS600S0100000_21(c627660Ojc, (C627660Ojc<C1158140gFA>) 195));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor>> r18) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.zQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(PaginationCursor paginationCursor, InterfaceC1364105Vn<? super AbstractC316870CbV<PaginationCursor>> interfaceC1364105Vn) {
        return zQ2(interfaceC1364105Vn);
    }

    public final void vQ2(long j, List list) {
        InteractionBubbles interactionBubbles;
        C1353820lKm c1353820lKm = (C1353820lKm) this.vmDispatcher.getState();
        Aweme aweme = c1353820lKm.LLILLJJLI;
        if (aweme != null && (interactionBubbles = AwemeBizExtKt.getInteractionBubbles(aweme)) != null) {
            int i = C1353930lKx.LIZ[interactionBubbles.cacheState.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    return;
                }
                Aweme aweme2 = c1353820lKm.LLILLJJLI;
                if (aweme2 != null) {
                    AwemeBizExtKt.setInteractionBubbleComments(aweme2, list, j);
                }
                Aweme aweme3 = c1353820lKm.LLILLJJLI;
                if (aweme3 == null) {
                    return;
                }
                AwemeBizExtKt.setInteractionBubbleState(aweme3, InteractionBubbleCacheState.ALL_CACHE);
                return;
            }
            Aweme aweme4 = c1353820lKm.LLILLJJLI;
            if (aweme4 != null) {
                AwemeBizExtKt.setInteractionBubbleComments(aweme4, list, j);
            }
            Aweme aweme5 = c1353820lKm.LLILLJJLI;
            if (aweme5 == null) {
                return;
            }
            AwemeBizExtKt.setInteractionBubbleState(aweme5, InteractionBubbleCacheState.COMMENT_CACHE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.now.interaction.model.CommentItemList> r13) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C1353900lKu
            if (r0 == 0) goto L20
            r1 = r13
            X.0lKu r1 = (X.C1353900lKu) r1
            int r3 = r1.LLILLL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L20
            int r3 = r3 - r2
            r1.LLILLL = r3
        L12:
            java.lang.Object r3 = r1.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r1.LLILLL
            r9 = 1
            if (r0 == 0) goto L2e
            if (r0 != r9) goto L26
            goto L5f
        L20:
            X.0lKu r1 = new X.0lKu
            r1.<init>(r11, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.002o r0 = r11.getState()     // Catch: java.lang.Exception -> L6b
            X.0lKm r0 = (X.C1353820lKm) r0     // Catch: java.lang.Exception -> L6b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L40
            java.lang.String r4 = r0.getAid()     // Catch: java.lang.Exception -> L6b
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 == 0) goto L65
            com.ss.android.ugc.now.interaction.api.InteractionApiService r3 = com.ss.android.ugc.now.interaction.api.InteractionApiService.LIZIZ     // Catch: java.lang.Exception -> L6b
            long r5 = r12.getCursor()     // Catch: java.lang.Exception -> L6b
            X.07s6 r0 = X.EnumC1997607s6.COMMENT_LIST_SCENARIO_NOW_BULLET     // Catch: java.lang.Exception -> L6b
            int r10 = r0.getValue()     // Catch: java.lang.Exception -> L6b
            r8 = 0
            r7 = 20
            X.11NZ r0 = r3.LIZJ(r4, r5, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L6b
            r1.LLILLL = r9     // Catch: java.lang.Exception -> L6b
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r1)     // Catch: java.lang.Exception -> L6b
            if (r3 != r2) goto L62
            return r2
        L5f:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L6b
        L62:
            com.ss.android.ugc.now.interaction.model.CommentItemList r3 = (com.ss.android.ugc.now.interaction.model.CommentItemList) r3     // Catch: java.lang.Exception -> L6b
            return r3
        L65:
            X.0lKy r0 = new X.0lKy     // Catch: java.lang.Exception -> L6b
            r0.<init>()     // Catch: java.lang.Exception -> L6b
            throw r0     // Catch: java.lang.Exception -> L6b
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.wQ2(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.now.interaction.model.LikeListResponse> r16) throws java.lang.Exception {
        /*
            r14 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C1353920lKw
            if (r0 == 0) goto L22
            r3 = r4
            X.0lKw r3 = (X.C1353920lKw) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L7a
        L22:
            X.0lKw r3 = new X.0lKw
            r3.<init>(r14, r4)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L80
            r4.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r5 = "now_reaction"
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)     // Catch: java.lang.Exception -> L80
            r4.put(r5, r0)     // Catch: java.lang.Exception -> L80
            com.ss.android.ugc.now.interaction.api.InteractionApiService r5 = com.ss.android.ugc.now.interaction.api.InteractionApiService.LIZIZ     // Catch: java.lang.Exception -> L80
            X.002o r0 = r14.getState()     // Catch: java.lang.Exception -> L80
            X.0lKm r0 = (X.C1353820lKm) r0     // Catch: java.lang.Exception -> L80
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L53
            java.lang.String r6 = r0.getAid()     // Catch: java.lang.Exception -> L80
            if (r6 != 0) goto L55
        L53:
            java.lang.String r6 = ""
        L55:
            long r7 = r15.getOffset()     // Catch: java.lang.Exception -> L80
            long r9 = r15.getOffset()     // Catch: java.lang.Exception -> L80
            r11 = 20
            X.07s7 r0 = X.EnumC1997707s7.LIKE_LIST_SCENARIO_NOW_BULLET     // Catch: java.lang.Exception -> L80
            int r12 = r0.getValue()     // Catch: java.lang.Exception -> L80
            com.google.gson.Gson r0 = X.C09C2.LIZ()     // Catch: java.lang.Exception -> L80
            java.lang.String r13 = r0.LJIILL(r4)     // Catch: java.lang.Exception -> L80
            X.11NZ r0 = r5.LIZIZ(r6, r7, r9, r11, r12, r13)     // Catch: java.lang.Exception -> L80
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L80
            java.lang.Object r4 = X.C11UD.LIZJ(r0, r3)     // Catch: java.lang.Exception -> L80
            if (r4 != r2) goto L7d
            return r2
        L7a:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L80
        L7d:
            com.ss.android.ugc.now.interaction.model.LikeListResponse r4 = (com.ss.android.ugc.now.interaction.model.LikeListResponse) r4     // Catch: java.lang.Exception -> L80
            return r4
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.xQ2(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, X.05Vn):java.lang.Object");
    }

    public final void yQ2(List<? extends User> list, boolean z, PaginationCursor paginationCursor) {
        InteractionBubbles interactionBubbles;
        C1353820lKm c1353820lKm = (C1353820lKm) this.vmDispatcher.getState();
        Aweme aweme = c1353820lKm.LLILLJJLI;
        if (aweme != null && (interactionBubbles = AwemeBizExtKt.getInteractionBubbles(aweme)) != null) {
            int i = C1353930lKx.LIZ[interactionBubbles.cacheState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                    }
                }
                Aweme aweme2 = c1353820lKm.LLILLJJLI;
                if (aweme2 != null) {
                    AwemeBizExtKt.setInteractionBubbleLikes(aweme2, list, z, paginationCursor.getCursor(), paginationCursor.getOffset());
                }
                Aweme aweme3 = c1353820lKm.LLILLJJLI;
                if (aweme3 == null) {
                    return;
                }
                AwemeBizExtKt.setInteractionBubbleState(aweme3, InteractionBubbleCacheState.ALL_CACHE);
                return;
            }
            Aweme aweme4 = c1353820lKm.LLILLJJLI;
            if (aweme4 != null) {
                AwemeBizExtKt.setInteractionBubbleLikes(aweme4, list, z, paginationCursor.getCursor(), paginationCursor.getOffset());
            }
            Aweme aweme5 = c1353820lKm.LLILLJJLI;
            if (aweme5 == null) {
                return;
            }
            AwemeBizExtKt.setInteractionBubbleState(aweme5, InteractionBubbleCacheState.LIKE_CACHE);
        }
    }
}
