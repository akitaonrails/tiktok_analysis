package com.ss.android.ugc.aweme.component.nativeproducttilescomponent;

import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C418440Gaw;
import X.C429440Gsg;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class AnoleProductTileCell extends PowerCell<C429440Gsg> {
    public SmartImageView LL;
    public View LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        C429440Gsg c429440Gsg = (C429440Gsg) interfaceC1891350zJl;
        super.onBindItemView(c429440Gsg);
        if (c429440Gsg.LLILLJJLI != null) {
            C2271391DvN.LIZ(this.itemView, (C1A5L) C2271381DvM.LJJIJ.getValue());
            View view = this.LLILLJJLI;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c429440Gsg.LL.LIZLLL())));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c429440Gsg.LL.LIZLLL())));
                    C786410Ut5.W5(view, layoutParams);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.itemView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    ColorDrawable colorDrawable = new ColorDrawable(iIntValue);
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c429440Gsg.LLILLJJLI);
                    c1331670kl3LJIIIZ.LJJIJL(getContext());
                    c1331670kl3LJIIIZ.LJIJJ = colorDrawable;
                    c1331670kl3LJIIIZ.LIZLLL("anole_product_tile_cell_image");
                    c1331670kl3LJIIIZ.LJJ(this.LL);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    C786410Ut5.Ob(view, 1.0f);
                    C786410Ut5.pc(view, 1.0f);
                    view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Gg8
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 1 && action != 3) {
                                    return false;
                                }
                                view2.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new LinearInterpolator()).setDuration(100L).withEndAction(new ARunnableS106S0100000_6(view2, 140)).start();
                                return false;
                            }
                            view2.animate().scaleX(0.9f).scaleY(0.9f).setInterpolator(new LinearInterpolator()).setDuration(100L).start();
                            return false;
                        }
                    });
                    C786410Ut5.I7(new ACListenerS141S0100000_6(this, 100), view);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.pv, viewGroup, false);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.xvy);
        this.LLILLJJLI = viewTd;
        return viewTd;
    }
}
