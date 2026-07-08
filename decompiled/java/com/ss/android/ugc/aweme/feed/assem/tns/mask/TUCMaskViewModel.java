package com.ss.android.ugc.aweme.feed.assem.tns.mask;

import X.C1483410ohn;
import X.C232400v4;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TUCMaskViewModel extends FeedBaseViewModel<C232400v4> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C232400v4(null);
    }

    public final boolean vQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        String imItemId = null;
        if (!Intrinsics.LJFF(item != null ? item.mFrom : null, "from_chat")) {
            return false;
        }
        String strLJJJLIIL = C1483410ohn.LJLJJI().LJJJLIIL();
        VideoItemParams item2 = getItem();
        if (item2 != null && (aweme = item2.getAweme()) != null) {
            imItemId = AwemeBizExtKt.getImItemId(aweme);
        }
        return Intrinsics.LJFF(strLJJJLIIL, imItemId);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r5 = 0
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.getAweme()
        Ld:
            r3 = 0
            r4 = 1
            if (r6 == 0) goto L41
            boolean r0 = r6.isAd()
            if (r0 != r4) goto L41
            boolean r0 = X.C1017070cZd.LJLJLJ(r6)
            if (r0 == 0) goto L39
            X.0RHF r0 = X.C581940Ms4.LIZ()
            if (r0 == 0) goto L26
            r0.LJII()
        L26:
            X.0RO7 r1 = new X.0RO7
            if (r6 == 0) goto L30
            java.lang.String r0 = r6.getAid()
            if (r0 != 0) goto L32
        L30:
            java.lang.String r0 = ""
        L32:
            r1.<init>(r3, r0, r3)
            X.C1440005kM.LIZ(r1)
            return
        L39:
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            r0.LJIILLIIL()
            goto L26
        L41:
            X.0N0Y r2 = X.C1483410ohn.LJLJJI()
            java.lang.String r1 = r2.LJJJLIIL()
            if (r6 == 0) goto L8e
            java.lang.String r0 = r6.getAid()
        L4f:
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r4)
            if (r0 != 0) goto L6b
            boolean r0 = r7.vQ2()
            if (r0 != 0) goto L6b
            java.lang.String r1 = r2.LJJJLIIL()
            if (r6 == 0) goto L8c
            java.lang.String r0 = r6.getAid()
        L65:
            boolean r0 = X.C710930Rud.LJI(r1, r0)
            if (r0 == 0) goto L26
        L6b:
            if (r6 == 0) goto L84
            boolean r0 = X.C582980Mtk.LIZIZ(r6)
            if (r0 != r4) goto L84
        L73:
            r1 = 1
        L74:
            if (r6 == 0) goto L82
            com.ss.android.ugc.aweme.feed.model.Video r0 = r6.getVideo()
            com.ss.android.ugc.aweme.feed.model.Audio r5 = r6.getAudio()
        L7e:
            r2.LJJJJI(r0, r5, r1, r4)
            goto L26
        L82:
            r0 = r5
            goto L7e
        L84:
            boolean r0 = X.C729510SjV.LJJJIL(r6)
            if (r0 != 0) goto L73
            r1 = 0
            goto L74
        L8c:
            r0 = r5
            goto L65
        L8e:
            r0 = r5
            goto L4f
        L90:
            r6 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCMaskViewModel.wQ2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L3c
            boolean r0 = X.C1017070cZd.LJLJLJ(r0)
            if (r0 != r4) goto L3c
            X.0RHF r0 = X.C581940Ms4.LIZ()
            if (r0 == 0) goto L1f
            r0.LLLLLLLLLL()
        L1f:
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L3b
            java.lang.String r1 = r0.getAid()
            if (r1 == 0) goto L3b
            X.0RO7 r0 = new X.0RO7
            r0.<init>(r4, r1, r3)
            X.C1440005kM.LIZ(r0)
        L3b:
            return
        L3c:
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            java.lang.String r1 = r0.LJJJLIIL()
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r2 = 0
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.getAid()
        L57:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L83
            boolean r0 = r5.vQ2()
            if (r0 != 0) goto L83
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            java.lang.String r1 = r0.LJJJLIIL()
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L7d
            java.lang.String r2 = r0.getAid()
        L7d:
            boolean r0 = X.C710930Rud.LJI(r1, r2)
            if (r0 == 0) goto L1f
        L83:
            X.0N0Y r0 = X.C1483410ohn.LJLJJI()
            r0.LIZ()
            goto L1f
        L8b:
            r0 = r2
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCMaskViewModel.xQ2():void");
    }
}
