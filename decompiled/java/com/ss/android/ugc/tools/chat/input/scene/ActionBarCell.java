package com.ss.android.ugc.tools.chat.input.scene;

import X.C01GW;
import X.C03IT;
import X.C0IDA;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1331920klS;
import X.C13LP;
import X.C418440Gaw;
import X.C427560Gpe;
import X.C427580Gpg;
import X.C452501pT;
import X.C463050IDv;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ActionBarCell extends PowerCell<C427580Gpg> {
    public final int LL = 16;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 978));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 979));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 977));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bg1;
    }

    public final SmartImageView I5() {
        return (SmartImageView) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
        L5(numLIZJ != null ? numLIZJ.intValue() : 0, view);
        SmartImageView smartImageViewI5 = I5();
        smartImageViewI5.setOutlineProvider(new C0IDA(this.LL, 17));
        smartImageViewI5.setClipToOutline(true);
        SmartImageView smartImageViewI52 = I5();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, I5().getContext());
        L5(numLIZJ2 != null ? numLIZJ2.intValue() : 0, smartImageViewI52);
    }

    public final void L5(int i, View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
        view.setBackground(gradientDrawable);
        view.invalidate();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C427560Gpe c427560Gpe;
        C427580Gpg c427580Gpg = (C427580Gpg) interfaceC1891350zJl;
        Object objLJJJLL = C13LP.LJJJLL(list);
        Drawable drawable = null;
        if (objLJJJLL instanceof C427560Gpe) {
            c427560Gpe = (C427560Gpe) objLJJJLL;
        } else {
            c427560Gpe = null;
        }
        if (c427560Gpe == null) {
            c427560Gpe = new C427560Gpe(true, true, true);
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(c427580Gpg, 127), this.itemView);
        if (c427560Gpe.LIZ) {
            ((TextView) this.LLILLL.getValue()).setText(c427580Gpg.LLILLJJLI);
        }
        if (c427560Gpe.LIZIZ) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(c427580Gpg.LLILZ));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJI = new C1331920klS(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
            c1331670kl3LJIIJ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIJ.LIZLLL = true;
            c1331670kl3LJIIJ.LJJ(I5());
            c1331670kl3LJIIJ.LJIIL(new C463050IDv(this, 4));
        }
        if (c427560Gpe.LIZJ) {
            View view = this.itemView;
            if (c427580Gpg.LLIZ) {
                drawable = (Drawable) this.LLILZ.getValue();
            }
            view.setForeground(drawable);
        }
    }
}
