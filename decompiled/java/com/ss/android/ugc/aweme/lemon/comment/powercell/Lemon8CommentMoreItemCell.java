package com.ss.android.ugc.aweme.lemon.comment.powercell;

import X.C1235900iGa;
import X.C1340850kzr;
import X.C1340860kzs;
import X.C1341040l0A;
import X.C1341050l0B;
import X.C1356140lOW;
import X.C1402430mbB;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C2097608Jq;
import X.C21146717pB;
import X.C341940Daq;
import X.C427690Gpr;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1341630l17;
import X.EnumC1356100lOS;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import g1c.AjS67S0100000_21;
import kotlin.Pair;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public class Lemon8CommentMoreItemCell<T> extends PowerCell<C1340850kzr> {
    public C1341050l0B LL;
    public View LLILLJJLI;
    public LinearLayout LLILLL;
    public C1235900iGa LLILZ;
    public TextView LLILZIL;
    public LinearLayout LLILZLL;
    public ViewGroup LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public View LLJI;
    public View LLJIJIL;

    public final C1341050l0B L5() {
        if (this.LL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", C1341050l0B.class, null);
            this.LL = interfaceC1555100qZQLIZIZ != null ? (C1341050l0B) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LL;
    }

    public final void N5() {
        String eventType;
        C1340860kzs c1340860kzs;
        Comment comment;
        String cid;
        C1341040l0A commonModel;
        C1341040l0A commonModel2;
        C1356140lOW c1356140lOW = C1356140lOW.LIZ;
        Activity activityLIZIZ = C737910Sx3.LIZIZ(this.itemView.getContext());
        C1341050l0B c1341050l0BL5 = L5();
        Aweme aweme = null;
        if (c1341050l0BL5 != null && (commonModel2 = c1341050l0BL5.getCommonModel()) != null) {
            aweme = commonModel2.getAweme();
        }
        EnumC1341630l17 enumC1341630l17 = EnumC1341630l17.DETAIL;
        EnumC1356100lOS enumC1356100lOS = EnumC1356100lOS.COMMENT_REPLY_SEE_MORE;
        Pair[] pairArr = new Pair[2];
        C1341050l0B c1341050l0BL52 = L5();
        String str = "";
        if (c1341050l0BL52 == null || (commonModel = c1341050l0BL52.getCommonModel()) == null || (eventType = commonModel.getEventType()) == null) {
            eventType = "";
        }
        pairArr[0] = new Pair("enter_from", eventType);
        C1340850kzr item = getItem();
        if (item != null && (c1340860kzs = item.LLILZ) != null && (comment = c1340860kzs.LIZLLL) != null && (cid = comment.getCid()) != null) {
            str = cid;
        }
        pairArr[1] = new Pair("comment_id", str);
        C1356140lOW.LIZIZ(c1356140lOW, activityLIZIZ, aweme, null, enumC1341630l17, enumC1356100lOS, C2097608Jq.LJIIIIZZ(pairArr), 100);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = this.itemView.findViewById(R.id.hg3);
        this.LLILLL = (LinearLayout) this.itemView.findViewById(R.id.me9);
        this.LLILZ = (C1235900iGa) this.itemView.findViewById(R.id.me_);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.tv_reply_comment_title);
        this.itemView.findViewById(R.id.e64);
        this.LLILZLL = (LinearLayout) this.itemView.findViewById(R.id.e62);
        this.LLJIJIL = this.itemView.findViewById(R.id.view_more_comment_divider);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.kh9);
        this.LLJ = (TuxIconView) this.itemView.findViewById(R.id.e5z);
        this.LLJI = this.itemView.findViewById(R.id.vro);
        this.LLIZ = (ViewGroup) this.itemView.findViewById(R.id.fzh);
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        TuxIconView tuxIconView2 = this.LLJ;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            C427690Gpr.LJI(view, null);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 17), view2);
        }
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout != null) {
            C427690Gpr.LJI(linearLayout, null);
        }
        LinearLayout linearLayout2 = this.LLILZLL;
        if (linearLayout2 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 18), linearLayout2);
        }
        C1235900iGa c1235900iGa = this.LLILZ;
        if (c1235900iGa != null) {
            c1235900iGa.setProgressBarInfo(C341940Daq.LIZ(28.0d));
        }
        TextView textView = this.LLILZIL;
        if (textView != null) {
            q0.LJIJ(textView, new C1402430mbB(4));
        }
    }

    public final void I5(C1340850kzr c1340850kzr) {
        c1340850kzr.LLILLL = 4;
        P5(c1340850kzr, true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1340850kzr c1340850kzr = (C1340850kzr) interfaceC1891350zJl;
        super.onBindItemView(c1340850kzr);
        P5(c1340850kzr, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.da4, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.C1340850kzr r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lemon.comment.powercell.Lemon8CommentMoreItemCell.P5(X.0kzr, boolean):void");
    }
}
