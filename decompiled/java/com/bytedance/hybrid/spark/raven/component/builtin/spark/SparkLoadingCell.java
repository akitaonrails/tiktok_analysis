package com.bytedance.hybrid.spark.raven.component.builtin.spark;

import X.C1546210qL5;
import X.C418570Gb9;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SparkLoadingCell extends PowerLoadingCell {
    public static final int LL;

    static {
        C1546210qL5.LIZ.getClass();
        LL = C814420VxA.LIZIZ(C1546210qL5.LIZ(36));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.W5(view, layoutParams);
        C418570Gb9 c418570Gb9 = (C418570Gb9) view.findViewById(R.id.two_balls);
        c418570Gb9.LLJJ = false;
        c418570Gb9.LLJILJILJ = false;
        c418570Gb9.LLJIJIL = 0.0f;
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = LL;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.LJLLLLLL(0, view);
        C418570Gb9 c418570Gb9 = (C418570Gb9) view.findViewById(R.id.two_balls);
        c418570Gb9.LIZ();
        c418570Gb9.LLJJ = true;
        c418570Gb9.LLJILJIL = true;
        c418570Gb9.postInvalidate();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f_o, viewGroup, false);
    }
}
