package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C1308910kAL;
import X.C1385040m98;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C619580ORw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentAddCell extends BulletinCommentBaseCell<C619580ORw> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a77;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new AbS691S0100000_9(this, 8), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numLIZJ;
        C619580ORw c619580ORw = (C619580ORw) interfaceC1891350zJl;
        BulletinStyleTextModel bulletinStyleTextModel = c619580ORw.LLILLL;
        int i = R.attr.a1k;
        if (bulletinStyleTextModel != null && bulletinStyleTextModel.color != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, C1385040m98.LIZ(this.itemView.getContext(), true))) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.eb3);
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_bubble_ellipsis_right;
                c419910GdJ.LIZLLL = Integer.valueOf(iIntValue);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TextView textView = (TextView) this.itemView.findViewById(R.id.edy);
            if (textView != null) {
                textView.setTextColor(iIntValue);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        if (((Boolean) this.LLILZLL.getValue()).booleanValue() && Intrinsics.LJFF(c619580ORw.LLILLJJLI, "text")) {
            i = R.attr.zl;
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.eb3);
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LIZ = R.raw.icon_bubble_ellipsis_right;
            c419910GdJ2.LJ = Integer.valueOf(i);
            tuxIconView2.setTuxIcon(c419910GdJ2);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.edy);
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(i);
        }
    }
}
