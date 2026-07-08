package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1361400lX0;
import X.C1546210qL5;
import X.C16F5;
import X.C20736316Cj;
import X.C435160H4o;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class DecorationEditToolNavButtonCell extends PowerCell<C435160H4o> {
    public LiveIconView LL;
    public C16F5 LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final C435160H4o c435160H4o = (C435160H4o) interfaceC1891350zJl;
        super.onBindItemView(c435160H4o);
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            liveIconView.setIcon(c435160H4o.LL);
        }
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(c435160H4o.LLILLJJLI));
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0H4p
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    c435160H4o.LLILLL.invoke();
                }
            }
        }, this.itemView);
        c435160H4o.LLILZ.invoke(this.itemView);
        View view = this.itemView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C1546210qL5.LIZ.getClass();
        gradientDrawable.setCornerRadius(C1546210qL5.LIZ(8));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.ey_, new C1361400lX0(this.itemView.getContext(), R.style.z4)));
        view.setBackground(gradientDrawable);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.g4c, false, 4, null);
        this.LL = (LiveIconView) viewInflateItemView$default.findViewById(R.id.fhq);
        this.LLILLJJLI = (C16F5) viewInflateItemView$default.findViewById(R.id.fhr);
        return viewInflateItemView$default;
    }
}
