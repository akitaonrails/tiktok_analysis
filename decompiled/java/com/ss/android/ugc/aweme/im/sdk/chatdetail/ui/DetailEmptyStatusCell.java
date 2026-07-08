package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui;

import X.C0HTI;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C345480DgY;
import X.C345500Dga;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class DetailEmptyStatusCell extends PowerCell<C345480DgY> {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(194));
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.coc;
    }

    public final void I5(int i) {
        ViewGroup viewGroup;
        FrameLayout.LayoutParams layoutParams;
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getChildAt(i2).getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.gravity = i;
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        C345480DgY c345480DgY = (C345480DgY) interfaceC1891350zJl;
        int i = C345500Dga.LIZ[c345480DgY.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                string = "";
            } else {
                string = this.itemView.getContext().getString(2131832146);
            }
        } else {
            string = this.itemView.getContext().getString(2131832147);
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = string;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(this.itemView.getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        ((C1749280vcc) this.itemView).setStatus(c1722300uv6);
        if (c345480DgY.LLILLJJLI) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
            this.itemView.setPadding(0, 0, 0, 0);
            I5(17);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = LL + LLILLJJLI;
        }
        this.itemView.setPadding(0, LLILLJJLI, 0, 0);
        I5(49);
    }
}
