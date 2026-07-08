package com.ss.android.ugc.aweme.tako.botpage.components.action.cell;

import X.C384050F3z;
import X.C418440Gaw;
import X.C425260Glw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoActionCell extends PowerCell<C425260Glw> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C425260Glw c425260Glw = (C425260Glw) interfaceC1891350zJl;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.a3v);
        if (tuxTextView != null) {
            Integer num = c425260Glw.LL;
            if (num != null) {
                tuxTextView.setText(this.itemView.getContext().getString(num.intValue()));
            }
            Integer num2 = c425260Glw.LLILLJJLI;
            if (num2 != null) {
                tuxTextView.setTextColorRes(num2.intValue());
            }
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.a3c);
        tuxIconView.setTuxIcon(c425260Glw.LLILLL);
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c425260Glw.LLILZIL)));
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c425260Glw.LLILZLL)));
            C786410Ut5.W5(tuxIconView, layoutParams);
            C786410Ut5.I7(new ACListenerS141S0100000_6(c425260Glw, 118), this.itemView);
            Function1<Function1<? super Boolean, Unit>, Unit> function1 = c425260Glw.LLIZ;
            if (function1 != null) {
                function1.invoke(new AwS372S0200000_6(this, c425260Glw, 64));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fpx, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.a3d);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        return viewTd;
    }
}
