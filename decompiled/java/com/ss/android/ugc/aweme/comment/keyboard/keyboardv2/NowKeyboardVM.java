package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.AbstractC1347290lAF;
import X.C1344030l4z;
import X.C1347090l9v;
import X.C1347100l9w;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1349760lEE;
import X.C1352050lHv;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowKeyboardVM extends AssemViewModel<C1352050lHv> {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1352050lHv(0);
    }

    public final void wQ2(Aweme aweme) {
        String aid;
        Aweme aweme2 = ((C1352050lHv) this.vmDispatcher.getState()).LL;
        String aid2 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        Intrinsics.LJFF(aid, aid2);
        setState(new AwS600S0100000_21(aweme, 40));
    }

    public final void QK0(Comment comment, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryReply ");
        sbLIZ.append(str);
        C1349760lEE.LIZ("xjcccc", C2188811AlT.LIZIZ(sbLIZ));
        withState(new AwS104S1200000_21(this, comment, str, 2));
    }

    public final void xQ2(AbstractC1347290lAF abstractC1347290lAF, boolean z) {
        boolean z2;
        if (!Intrinsics.LJFF(abstractC1347290lAF, C1347110l9x.LIZ) && !Intrinsics.LJFF(abstractC1347290lAF, C1347120l9y.LIZ)) {
            z2 = false;
        } else {
            z2 = true;
        }
        setStateImmediate(new AwS34S0010000_21(z2, 19));
        C1352050lHv c1352050lHv = (C1352050lHv) this.vmDispatcher.getState();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchPanel current:");
        sbLIZ.append(c1352050lHv.LLILZ);
        sbLIZ.append("  to:");
        sbLIZ.append(abstractC1347290lAF);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(abstractC1347290lAF, C1347120l9y.LIZ) && (Intrinsics.LJFF(c1352050lHv.LLILZ, C1347090l9v.LIZ) || Intrinsics.LJFF(c1352050lHv.LLILZ, C1347100l9w.LIZ))) {
            setState(AFwS259S0000000_21.get$arr$(68));
        }
        if (z) {
            setStateImmediate(new AwS600S0100000_21(abstractC1347290lAF, 41));
        } else {
            setState(new AwS600S0100000_21(abstractC1347290lAF, 42));
        }
    }

    public final void yQ2(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSoftKeyboardState ");
        sbLIZ.append(z);
        sbLIZ.append("  ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        C1344030l4z.LIZJ("xjccccc", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            withState(new AwS128S0101000_21(this, i, 8));
        } else {
            setState(new AwS34S0001000_21(i, 17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(java.lang.String r10, java.lang.String r11, java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> r12, com.ss.android.ugc.aweme.comment.model.Comment r13) {
        /*
            r9 = this;
            if (r12 == 0) goto La
            com.google.gson.Gson r0 = X.C1344990l6X.LIZ
            java.lang.String r5 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r12)
            if (r5 != 0) goto Lc
        La:
            java.lang.String r5 = "[]"
        Lc:
            com.ss.android.ugc.now.interaction.api.InteractionApiService r2 = com.ss.android.ugc.now.interaction.api.InteractionApiService.LIZIZ
            r7 = 0
            if (r13 == 0) goto L70
            java.lang.String r0 = r13.getRootCommentId()
        L15:
            java.lang.String r1 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L66
            if (r13 == 0) goto L6d
            java.lang.String r0 = r13.getRootCommentId()
            if (r0 == 0) goto L66
            java.lang.String r6 = r13.getRootCommentId()
        L29:
            java.lang.String r0 = r13.getRootCommentId()
        L2d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L3f
            if (r13 == 0) goto L3f
            java.lang.String r0 = r13.getRootCommentId()
            if (r0 == 0) goto L3f
            java.lang.String r7 = r13.getCid()
        L3f:
            r8 = 2
            r4 = r11
            r3 = r10
            X.11NZ r1 = r2.publishComment(r3, r4, r5, r6, r7, r8)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r3 = r1.LJJJLZIJ(r0)
            Y.AfS190S0100000_21 r2 = new Y.AfS190S0100000_21
            r0 = 3
            r2.<init>(r9, r0)
            Y.AfS190S0100000_21 r1 = new Y.AfS190S0100000_21
            r0 = 4
            r1.<init>(r9, r0)
            r3.LJJLL(r2, r1)
            return
        L66:
            if (r13 == 0) goto L6d
            java.lang.String r6 = r13.getCid()
            goto L29
        L6d:
            r6 = r7
            r0 = r7
            goto L2d
        L70:
            r0 = r7
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM.vQ2(java.lang.String, java.lang.String, java.util.List, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }
}
