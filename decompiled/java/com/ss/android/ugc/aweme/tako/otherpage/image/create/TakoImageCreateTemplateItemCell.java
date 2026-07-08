package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C0H4A;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C1385040m98;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426570Go3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoImageCreateTemplateItemCell extends PowerCell<C426570Go3> {
    public SmartImageView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fmu;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        C0H4A c0h4a = TakoImageCreateFragment.LLJJJIL;
        Context context = view.getContext();
        c0h4a.getClass();
        int iLIZ = C0H4A.LIZ(context);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(iLIZ, (iLIZ / 3) * 4));
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.x8b);
        View viewFindViewById = this.itemView.findViewById(R.id.x89);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a01, C1385040m98.LIZ(viewFindViewById.getContext(), true));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        View viewFindViewById2 = this.itemView.findViewById(R.id.x8d);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uk, viewFindViewById2.getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zc, viewFindViewById2.getContext());
        gradientDrawable.setColors(new int[]{iIntValue, numLIZJ2 != null ? numLIZJ2.intValue() : 0});
        viewFindViewById2.setBackground(gradientDrawable);
        TextView textView = (TextView) this.itemView.findViewById(R.id.x8a);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, C1385040m98.LIZ(textView.getContext(), true));
        textView.setTextColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.x8_);
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, C1385040m98.LIZ(tuxIconView.getContext(), true));
        tuxIconView.setTintColor(numLIZJ4 != null ? numLIZJ4.intValue() : 0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ColorDrawable colorDrawable;
        C426570Go3 c426570Go3 = (C426570Go3) interfaceC1891350zJl;
        super.onBindItemView(c426570Go3);
        C786410Ut5.I7(new ACListenerS141S0100000_6(c426570Go3, 169), this.itemView);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            String str = c426570Go3.LLILLJJLI;
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, smartImageView.getContext());
            if (numLIZJ != null) {
                colorDrawable = new ColorDrawable(numLIZJ.intValue());
            } else {
                colorDrawable = null;
            }
            c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
            c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(smartImageView, "image_template", str, C2097608Jq.LJ());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }
}
