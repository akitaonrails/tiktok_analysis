package com.ss.android.ugc.aweme.commentv2.debug.intention;

import X.C197039127h;
import X.C2188811AlT;
import X.C295120BhW;
import X.C745500TMe;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS155S0100000_21;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.commentlist.util.CommentIntentionCellUtil;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentIntentionInfoCell extends CommentDebugBaseCell<C745500TMe> {
    @Override // com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS155S0100000_21(this, 55));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        C745500TMe c745500TMe = (C745500TMe) interfaceC1891350zJl;
        super.onBindItemView(c745500TMe);
        String str = c745500TMe.LL;
        if (str == null) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setText("aid is null, cannot get intention info");
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 == null) {
            return;
        }
        CommentIntentionCellUtil.LL.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment intention exp: ");
        sbLIZ.append(C295120BhW.LIZ());
        sbLIZ.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hit short control: ");
        sbLIZ2.append(CommentIntentionCellUtil.LJ(str));
        sbLIZ2.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("hit long control: ");
        sbLIZ3.append(CommentIntentionCellUtil.LIZLLL());
        sbLIZ3.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append("Keva Detail Info: \n");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Aid: ");
        sbLIZ4.append(str);
        sbLIZ4.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        List<CommentIntentionCellUtil.CommentIntentionDisplayInfo> listLIZIZ = CommentIntentionCellUtil.LIZIZ();
        if (listLIZIZ != null) {
            for (CommentIntentionCellUtil.CommentIntentionDisplayInfo commentIntentionDisplayInfo : listLIZIZ) {
                if (Intrinsics.LJFF(commentIntentionDisplayInfo.commentIntentionDisplayAid, str)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Times: ");
                    sbLIZ5.append(commentIntentionDisplayInfo.commentIntentionDisplayTimes);
                    sbLIZ5.append('\n');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Timestamp: ");
                    sbLIZ6.append(commentIntentionDisplayInfo.commentIntentionDisplayTimestamp);
                    sbLIZ6.append('\n');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
        }
        CommentIntentionCellUtil.CommentIntentionControlInfo commentIntentionControlInfoLIZ = CommentIntentionCellUtil.LIZ();
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("No click Times: ");
        Long lValueOf = null;
        if (commentIntentionControlInfoLIZ != null) {
            numValueOf = Integer.valueOf(commentIntentionControlInfoLIZ.commentIntentionNoClick);
        } else {
            numValueOf = null;
        }
        sbLIZ7.append(numValueOf);
        sbLIZ7.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("Long exit timestamp: ");
        if (commentIntentionControlInfoLIZ != null) {
            lValueOf = Long.valueOf(commentIntentionControlInfoLIZ.commentIntentionExitTimestamp);
        }
        sbLIZ8.append(lValueOf);
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        tuxTextView2.setText(sb.toString());
    }
}
