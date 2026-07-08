package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C0H4A;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C1385040m98;
import X.C1857690yRT;
import X.C1864450ycN;
import X.C2097608Jq;
import X.C342860DcK;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1845470y7l;
import X.InterfaceC1891350zJl;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class TakoTemplateBaseCell<T extends InterfaceC1845470y7l> extends PowerCell<T> {
    public String LL;
    public SmartImageView LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public TuxTextView LLILZIL;
    public C342860DcK LLILZLL;
    public TuxTextView LLIZ;
    public final int LLIZLLLIL = 14;
    public final AwS571S0100000_27 LLJ = new AwS571S0100000_27((TakoTemplateBaseCell) this, 903);
    public final AwS606S0100000_27 LLJI = new AwS606S0100000_27(this, 261);

    public void P5(T t) {
    }

    public void R5(Size size) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public int getLayoutId() {
        return R.layout.fmt;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        C0H4A c0h4a = TakoImageCreateFragment.LLJJJIL;
        Context context = view.getContext();
        c0h4a.getClass();
        int iLIZ = C0H4A.LIZ(context);
        int i = (iLIZ / 3) * 4;
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(iLIZ, i));
        new Size(iLIZ, i);
        R5(new Size(iLIZ, i));
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.x8b);
        View viewFindViewById = this.itemView.findViewById(R.id.x8d);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(L5()));
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uk, viewFindViewById.getContext());
            int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zc, viewFindViewById.getContext());
            gradientDrawable.setColors(new int[]{iIntValue, numLIZJ2 != null ? numLIZJ2.intValue() : 0});
            viewFindViewById.setBackground(gradientDrawable);
        }
        this.LLILZLL = (C342860DcK) this.itemView.findViewById(R.id.x8e);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.x88);
        this.LLILZIL = tuxTextView;
        if (tuxTextView != null) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, C1385040m98.LIZ(tuxTextView.getContext(), true));
            tuxTextView.setTextColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.x8c);
        this.LLIZ = tuxTextView2;
        if (tuxTextView2 != null) {
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a0o, C1385040m98.LIZ(tuxTextView2.getContext(), false));
            tuxTextView2.setTextColor(numLIZJ4 != null ? numLIZJ4.intValue() : 0);
            C1857690yRT.LJIILJJIL(tuxTextView2, Float.valueOf(C418440Gaw.LIZIZ(4)));
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.f827x86);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_play_circle_fill;
            int iLIZJ = C1308910kAL.LIZJ(R.attr.a1j, C1385040m98.LIZ(tuxIconView.getContext(), true));
            if (iLIZJ == null) {
                iLIZJ = 0;
            }
            c419910GdJ.LIZLLL = iLIZJ;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            tuxIconView.setTuxIcon(c419910GdJ);
        } else {
            tuxIconView = null;
        }
        this.LLILLL = tuxIconView;
    }

    public int L5() {
        return this.LLIZLLLIL;
    }

    public final void I5(T t) {
        ColorDrawable colorDrawable;
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            String picUrl = t.getPicUrl();
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(picUrl);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, smartImageView.getContext());
            if (numLIZJ != null) {
                colorDrawable = new ColorDrawable(numLIZJ.intValue());
            } else {
                colorDrawable = null;
            }
            c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
            c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(smartImageView, "image_template_new", picUrl, C2097608Jq.LJ());
            c1331670kl3LJIIIZ.LJIIJ(new C1864450ycN(this, t, 0));
        }
    }

    public void N5(T t) {
        this.LLJI.invoke(t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC1845470y7l interfaceC1845470y7l = (InterfaceC1845470y7l) interfaceC1891350zJl;
        super.onBindItemView(interfaceC1845470y7l);
        C786410Ut5.I7(new ACListenerS161S0100000_27(interfaceC1845470y7l, 201), this.itemView);
        if (!Intrinsics.LJFF(this.LL, interfaceC1845470y7l.getId())) {
            P5(interfaceC1845470y7l);
        }
        this.LL = interfaceC1845470y7l.getId();
    }
}
