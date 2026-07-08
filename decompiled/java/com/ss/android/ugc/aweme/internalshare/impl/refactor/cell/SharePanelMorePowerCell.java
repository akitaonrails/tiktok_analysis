package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C1196320hEk;
import X.C1266330j3f;
import X.C1362100lY8;
import X.C1362110lY9;
import X.C1362120lYA;
import X.C1362230lYL;
import X.C1368890lj5;
import X.C1558520qew;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC994650bzT;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelMorePowerCell extends AbsSharePanelPowerCell<C1362100lY8> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 640));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 641));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cl4;
    }

    public final TuxIconView P5() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1362110lY9 c1362110lY9;
        Integer num;
        Integer num2;
        super.onItemViewCreated();
        C1368890lj5.LIZIZ((TuxTextView) this.LLILZIL.getValue(), R.string.loy);
        C1362120lYA c1362120lYAL5 = L5();
        LinearLayout.LayoutParams layoutParams = null;
        if (c1362120lYAL5 == null || (c1362110lY9 = c1362120lYAL5.LLILLL) == null) {
            c1362110lY9 = new C1362110lY9(null, 1023);
        }
        C1362230lYL c1362230lYL = c1362110lY9.LJIIIZ;
        if (c1362230lYL != null) {
            this.itemView.getLayoutParams().width = c1362230lYL.LJIIJJI;
            TuxIconView tuxIconViewP5 = P5();
            int i = c1362230lYL.LJIIL;
            C786410Ut5.M6(tuxIconViewP5, new LinearLayout.LayoutParams(i, i));
        } else {
            this.itemView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLILZIL.getValue();
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            C786410Ut5.R6(tuxTextView, layoutParams);
            if (c1362230lYL != null && (num2 = c1362230lYL.LJIILLIIL) != null) {
                tuxTextView.setTextColor(num2.intValue());
            }
            this.itemView.setContentDescription(tuxTextView.getText());
            if (c1362230lYL != null && (num = c1362230lYL.LJIIZILJ) != null) {
                tuxTextView.setTuxFont(num.intValue());
            }
        }
        C786410Ut5.I7(new AkS89S0100000_21(this, 24), P5());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IContactActionAbility iContactActionAbility;
        super.onViewAttachedToWindow();
        C1362100lY8 c1362100lY8 = (C1362100lY8) getItem();
        if (c1362100lY8 == null || (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) == null || (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) == null) {
            return;
        }
        iContactActionAbility.Oy1(c1362100lY8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Drawable drawableR5;
        SharePackage sharePackage;
        Bundle bundle;
        if (((C1362100lY8) interfaceC1891350zJl).LLILLL == EnumC994650bzT.RIGHT_ARROW) {
            drawableR5 = R5(R.raw.icon_chevron_right_ltr, P5().getContext());
        } else {
            drawableR5 = R5(R.raw.icon_magnifying_glass_fill, P5().getContext());
        }
        P5().setImageDrawable(drawableR5);
        q0.LJIJ(this.itemView, new C1266330j3f(2));
        C1362120lYA c1362120lYAL5 = L5();
        if (c1362120lYAL5 != null && (sharePackage = c1362120lYAL5.LL) != null && (bundle = sharePackage.extras) != null) {
            C786410Ut5.LJJJI("button_source", bundle.getString("enter_method"), bundle);
            bundle.putInt("rank_num", getBindingAdapterPosition());
        }
    }

    public final Drawable R5(int i, Context context) {
        C1362230lYL c1362230lYL;
        C1362110lY9 c1362110lY9;
        C1362120lYA c1362120lYAL5 = L5();
        if (c1362120lYAL5 != null && (c1362110lY9 = c1362120lYAL5.LLILLL) != null) {
            c1362230lYL = c1362110lY9.LJIIIZ;
        } else {
            c1362230lYL = null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        if (c1362230lYL != null) {
            int i2 = c1362230lYL.LJIILIIL;
            c419910GdJ.LIZIZ = i2;
            c419910GdJ.LIZJ = i2;
        } else {
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        if (c1362230lYL != null) {
            c384050F3z.LIZJ = Float.valueOf(c1362230lYL.LJIIL / 2.0f);
            int i3 = c1362230lYL.LJIIL;
            c384050F3z.LJII = i3;
            c384050F3z.LJI = i3;
        } else {
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }
}
