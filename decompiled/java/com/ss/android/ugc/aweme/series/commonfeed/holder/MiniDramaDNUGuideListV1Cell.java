package com.ss.android.ugc.aweme.series.commonfeed.holder;

import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1361400lX0;
import X.C13LP;
import X.C1580080rDi;
import X.C1843500y4a;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS9S1100000_3;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MiniDramaDNUGuideListV1Cell extends PowerCell<C1580080rDi> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.g8t);
        C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(fLIZIZ);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C1331070kk5 hierarchy = smartImageView.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJJIII(c1331100kk8LIZLLL);
            }
            smartImageView.setHierarchy(hierarchy);
        }
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.g8u);
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(ColorProtector.parseColor("#FE2C55"));
            gradientDrawable.setCornerRadii(new float[]{fLIZIZ2, fLIZIZ2, 0.0f, 0.0f, fLIZIZ2, fLIZIZ2, 0.0f, 0.0f});
            tuxTextView.setBackground(gradientDrawable);
        }
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.g8w);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.g8y);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.g8x);
        C1361400lX0 c1361400lX0 = new C1361400lX0(this.itemView.getContext(), R.style.zd);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0w, c1361400lX0);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(iIntValue);
            }
        }
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.g8z);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, c1361400lX0);
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxTextView tuxTextView3 = this.LLILZLL;
            if (tuxTextView3 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(iIntValue2);
                gradientDrawable2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                tuxTextView3.setBackground(gradientDrawable2);
            }
        }
        this.itemView.setTag(R.id.g96, "collection");
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 30), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bgo, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Drawable background;
        String string;
        GradientDrawable gradientDrawable;
        int color;
        List<String> urlList;
        String str;
        SmartImageView smartImageView;
        C1580080rDi c1580080rDi = (C1580080rDi) interfaceC1891350zJl;
        UrlModel urlModel = c1580080rDi.LLILLL;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && (smartImageView = this.LL) != null) {
            HandlerHook.viewPost(smartImageView, new ARunnableS9S1100000_3(this, str, 24));
        }
        Integer num = c1580080rDi.LLILZ;
        if (num != null) {
            long jIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(C1843500y4a.LIZIZ(jIntValue));
            }
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        String str2 = null;
        if (tuxTextView2 != null) {
            background = tuxTextView2.getBackground();
        } else {
            background = null;
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            if (absoluteAdapterPosition != 0) {
                if (absoluteAdapterPosition != 1) {
                    if (absoluteAdapterPosition != 2) {
                        color = ColorProtector.parseColor("#80000000");
                    } else {
                        color = ColorProtector.parseColor("#FE7C02");
                    }
                } else {
                    color = ColorProtector.parseColor("#FF4C3A");
                }
            } else {
                color = ColorProtector.parseColor("#FE2C55");
            }
            gradientDrawable.setColor(color);
        }
        String strValueOf = String.valueOf(getAbsoluteAdapterPosition() + 1);
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(strValueOf);
        }
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(c1580080rDi.LLILLJJLI);
        }
        TuxTextView tuxTextView5 = this.LLILZ;
        if (tuxTextView5 != null) {
            List<String> list2 = c1580080rDi.LLILZIL;
            if (list2 != null) {
                str2 = (String) C13LP.LJJJLL(list2);
            }
            tuxTextView5.setText(str2);
        }
        View view = this.itemView;
        Long l = c1580080rDi.LL;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        view.setTag(R.id.g97, string);
    }
}
