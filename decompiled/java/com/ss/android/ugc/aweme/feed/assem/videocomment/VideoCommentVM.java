package com.ss.android.ugc.aweme.feed.assem.videocomment;

import X.C1017070cZd;
import X.C295620BiK;
import X.C523420Kfs;
import X.C733080SpG;
import X.C733310Spd;
import X.C844470XAv;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoCommentVM extends FeedRightBtnBaseViewModel<C733080SpG> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C733080SpG(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final void onForceHideTextFlagChange() {
        setState(new C733310Spd(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.tux.drawable.TuxIconDrawable xQ2() {
        /*
            boolean r3 = X.C828040We2.LIZIZ()
            boolean r0 = X.C296090Bj5.LIZ()
            if (r0 == 0) goto L30
            int r1 = X.C296090Bj5.LIZIZ()
            r0 = 1
            if (r1 == r0) goto L2c
            r0 = 2
            if (r1 == r0) goto L28
            r0 = 3
            if (r1 != r0) goto L30
            r2 = 2130773760(0x7f010700, float:1.7150676E38)
        L1a:
            com.bytedance.tux.drawable.TuxIconDrawable r1 = new com.bytedance.tux.drawable.TuxIconDrawable
            android.app.Application r0 = X.C1BWL.LIZ()
            r1.<init>(r0, r2)
            if (r3 == 0) goto L27
            android.util.LruCache<java.lang.String, android.graphics.drawable.Drawable> r0 = X.C730700SlQ.LIZ
        L27:
            return r1
        L28:
            r2 = 2130773717(0x7f0106d5, float:1.7150589E38)
            goto L1a
        L2c:
            r2 = 2130774259(0x7f0108f3, float:1.7151688E38)
            goto L1a
        L30:
            r2 = 2130773098(0x7f01046a, float:1.7149333E38)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM.xQ2():com.bytedance.tux.drawable.TuxIconDrawable");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final String getZeroNumReplaceString() {
        if (!C295620BiK.LIZ()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(R.string.fij);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vQ2(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM.vQ2(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public final int wQ2(Aweme aweme) {
        int i;
        int i2 = 0;
        if (((aweme != null && AwemeExtKt.isAdTraffic(aweme)) || (!C1017070cZd.LLLIIII(aweme) && aweme != null)) && (aweme.isCmtSwt() || C1017070cZd.LJJLIL(aweme))) {
            i = 4;
        } else {
            i = 0;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme) && !C523420Kfs.LIZ().LJLLL(aweme)) {
            if (!C295620BiK.LIZ()) {
                i2 = 4;
            }
        } else {
            i2 = i;
        }
        updateOrigin(i2);
        return getForceTextVisible();
    }

    public final void yQ2(Aweme aweme) {
        setState(new AwS377S0200000_11(this, aweme, 34));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o paramSync2StateAccept(X.InterfaceC0148002o r11, com.ss.android.ugc.aweme.feed.model.VideoItemParams r12) {
        /*
            r10 = this;
            r2 = r11
            X.0SpG r2 = (X.C733080SpG) r2
            com.bytedance.tux.drawable.TuxIconDrawable r3 = xQ2()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.getAweme()
            if (r1 == 0) goto L42
            java.lang.String r0 = r1.getAid()
            if (r0 == 0) goto L42
            java.lang.String r1 = r1.getAid()
            java.util.HashSet<java.lang.String> r0 = X.C733300Spc.LIZIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L42
            r4 = 0
        L20:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.getAweme()
            java.lang.String r5 = r10.vQ2(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.getAweme()
            int r6 = r10.wQ2(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.getAweme()
            if (r0 != 0) goto L40
            r7 = 8
        L38:
            r8 = 0
            r9 = 64
            X.0SpG r0 = X.C733080SpG.LIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L40:
            r7 = 0
            goto L38
        L42:
            r4 = 8
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM.paramSync2StateAccept(X.002o, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.002o");
    }
}
