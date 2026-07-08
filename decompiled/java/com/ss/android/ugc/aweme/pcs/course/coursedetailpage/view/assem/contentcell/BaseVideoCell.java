package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell;

import X.AbstractC1838030xvl;
import X.C1324610kZf;
import X.C16F5;
import X.C1819620xS4;
import X.C19R6;
import X.C786410Ut5;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public abstract class BaseVideoCell<T extends AbstractC1838030xvl> extends PowerCell<T> {
    public C19R6 LL;
    public LinearLayout LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;

    public abstract int I5();

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        int i;
        super.onBindItemView(t);
        C1324610kZf url = C1819620xS4.LIZ().setUrl(t.LLILLJJLI);
        View view = this.itemView;
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            viewFindViewById = view.findViewById(R.id.video_cover);
            this.LL = (C19R6) viewFindViewById;
        }
        url.LJJI(viewFindViewById);
        C786410Ut5.I7(new AkS94S0100000_27(t, 13), this.itemView);
        View view2 = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = view2.findViewById(R.id.video_mask);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        LinearLayout linearLayout = (LinearLayout) callbackFindViewById;
        if (linearLayout != null) {
            if (t.LLILZIL) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJZL(i, linearLayout);
        }
        View view3 = this.itemView;
        KeyEvent.Callback callbackFindViewById2 = this.LLILLL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = view3.findViewById(R.id.video_title);
            this.LLILLL = (C16F5) callbackFindViewById2;
        }
        TextView textView = (TextView) callbackFindViewById2;
        if (textView != null) {
            textView.setText(t.LLILLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, I5(), false, 4, null);
    }
}
