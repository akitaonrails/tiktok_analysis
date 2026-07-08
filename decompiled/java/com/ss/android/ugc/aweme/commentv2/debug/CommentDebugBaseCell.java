package com.ss.android.ugc.aweme.commentv2.debug;

import X.C197039127h;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class CommentDebugBaseCell<T extends InterfaceC1891350zJl> extends PowerCell<T> implements InterfaceC20631915oL {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a1r;
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (LinearLayout) this.itemView.findViewById(R.id.fgj);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.fgk);
        this.LLILLL = (C197039127h) this.itemView.findViewById(R.id.fgg);
    }

    public final C197039127h I5(String str, Function0<Unit> function0) {
        C197039127h c197039127h = new C197039127h(this.itemView.getContext(), null, 6, 0);
        c197039127h.setButtonVariant(0);
        c197039127h.setButtonSize(1);
        c197039127h.setText(str);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        C786410Ut5.J6(c197039127h, layoutParams);
        C786410Ut5.I7(new AkS89S0100000_21(function0, 3), c197039127h);
        return c197039127h;
    }
}
