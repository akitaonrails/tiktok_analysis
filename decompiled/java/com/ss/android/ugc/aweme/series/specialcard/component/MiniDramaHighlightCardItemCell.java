package com.ss.android.ugc.aweme.series.specialcard.component;

import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1580080rDi;
import X.C1843500y4a;
import X.C418440Gaw;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MiniDramaHighlightCardItemCell extends PowerCell<C1580080rDi> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
        gradientDrawable.setColor(ColorProtector.parseColor("#12FFFFFF"));
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), ColorProtector.parseColor("#14FFFFFF"));
        view.setBackground(gradientDrawable);
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.g99);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.g9d);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.g9b);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.g9a);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.g9f);
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(fLIZIZ);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C1331070kk5 hierarchy = smartImageView.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJJIII(c1331100kk8);
            } else {
                hierarchy = null;
            }
            smartImageView.setHierarchy(hierarchy);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(ColorProtector.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ, fLIZIZ, 0.0f, 0.0f});
            tuxTextView.setBackground(gradientDrawable2);
        }
        View viewFindViewById = this.itemView.findViewById(R.id.g9c);
        this.LLILZLL = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(ColorProtector.parseColor("#26ffffff"));
        }
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 48), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bgt, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        long jIntValue;
        String str;
        List<String> urlList;
        String str2;
        C1580080rDi c1580080rDi = (C1580080rDi) interfaceC1891350zJl;
        UrlModel urlModel = c1580080rDi.LLILLL;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList)) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str2));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
            c1331670kl3LJIIIIZZ.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1580080rDi.LLILLJJLI);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            List<String> list2 = c1580080rDi.LLILZIL;
            if (list2 != null) {
                str = (String) C13LP.LJJJLL(list2);
            } else {
                str = null;
            }
            tuxTextView2.setText(str);
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            Context context = this.itemView.getContext();
            Object[] objArr = new Object[1];
            Integer num = c1580080rDi.LLILZ;
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 0;
            }
            objArr[0] = C1843500y4a.LIZIZ(jIntValue);
            tuxTextView3.setText(context.getString(2131848128, objArr));
        }
        String strValueOf = String.valueOf(getAbsoluteAdapterPosition() + 1);
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(strValueOf);
        }
    }
}
