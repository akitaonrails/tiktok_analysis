package com.ss.android.ugc.aweme.tako.detail.keyframe.ui;

import X.C01GW;
import X.C0DSB;
import X.C0H8B;
import X.C0PEM;
import X.C0QBT;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1459705nX;
import X.C1908520zlS;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class KeyframeBottomCellImageStyle extends PowerCell<C0H8B> {
    public C1361400lX0 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 753));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 754));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 755));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 752));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fnz;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onItemViewCreated();
        this.LL = C1385040m98.LIZ(this.itemView.getContext(), true);
        C427690Gpr.LJ(this.itemView, C418440Gaw.LIZIZ(8));
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 79), this.itemView);
        View view = this.itemView;
        C1361400lX0 c1361400lX0 = this.LL;
        int iIntValue = 0;
        view.setBackground(C1908520zlS.LIZIZ(C418440Gaw.LIZIZ(10), (c1361400lX0 == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, c1361400lX0)) == null) ? 0 : numLIZJ2.intValue()));
        TuxIconView tuxIconView = (TuxIconView) this.LLILZIL.getValue();
        C1361400lX0 c1361400lX02 = this.LL;
        if (c1361400lX02 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1361400lX02)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxIconView.setTintColor(iIntValue);
        View view2 = (View) this.LLILLJJLI.getValue();
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            C1361400lX0 c1361400lX03 = this.LL;
            c384050F3z.LIZ = c1361400lX03 != null ? C1308910kAL.LIZJ(R.attr.a03, c1361400lX03) : null;
            view2.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C0H8B c0h8b = (C0H8B) interfaceC1891350zJl;
        ImageView imageView = (ImageView) this.LLILLJJLI.getValue();
        if (imageView != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1459705nX(imageView, c0h8b, null), 2);
        }
        TextView textView = (TextView) this.LLILLL.getValue();
        if (textView != null) {
            double d = c0h8b.LLILLJJLI.timestamp;
            int iLIZ = C814420VxA.LIZ(d);
            if (d >= 3600.0d) {
                z = true;
            } else {
                z = false;
            }
            textView.setText(C0QBT.LIZ(iLIZ, z));
        }
        if (c0h8b.LLILLJJLI.title.length() > 0) {
            TextView textView2 = (TextView) this.LLILZ.getValue();
            if (textView2 != null) {
                textView2.setText(c0h8b.LLILLJJLI.title);
            }
            TextView textView3 = (TextView) this.LLILZ.getValue();
            if (textView3 != null) {
                textView3.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(121)));
            }
            C0DSB.LIZIZ((View) this.LLILZIL.getValue());
            return;
        }
        String string = this.itemView.getContext().getString(2131849678);
        TextView textView4 = (TextView) this.LLILZ.getValue();
        if (textView4 != null) {
            textView4.setText(string);
        }
        TextView textView5 = (TextView) this.LLILZ.getValue();
        if (textView5 != null) {
            textView5.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(107)));
        }
        C0DSB.LIZJ((View) this.LLILZIL.getValue());
    }
}
