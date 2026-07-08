package com.ss.android.ugc.aweme.series.commonfeed.holder;

import X.C1331070kk5;
import X.C1331100kk8;
import X.C13LP;
import X.C1580070rDh;
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
public final class MiniDramaDNUGuideAgeUnknownCell extends PowerCell<C1580070rDh> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.g8n);
        C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(fLIZIZ);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C1331070kk5 hierarchy = smartImageView.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJJIII(c1331100kk8LIZLLL);
            }
            smartImageView.setHierarchy(hierarchy);
        }
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.g8o);
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(ColorProtector.parseColor("#FE2C55"));
            gradientDrawable.setCornerRadii(new float[]{fLIZIZ2, fLIZIZ2, 0.0f, 0.0f, fLIZIZ2, fLIZIZ2, 0.0f, 0.0f});
            tuxTextView.setBackground(gradientDrawable);
        }
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.g8q);
        View viewFindViewById = this.itemView.findViewById(R.id.g8m);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 1711276032, -16777216});
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
            viewFindViewById.setBackground(gradientDrawable2);
        }
        this.itemView.setTag(R.id.g96, "collection");
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 29), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bgn, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String string;
        GradientDrawable gradientDrawable;
        int color;
        List<String> urlList;
        String str;
        SmartImageView smartImageView;
        C1580070rDh c1580070rDh = (C1580070rDh) interfaceC1891350zJl;
        UrlModel urlModel = c1580070rDh.LLILLL;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && (smartImageView = this.LL) != null) {
            HandlerHook.viewPost(smartImageView, new ARunnableS9S1100000_3(this, str, 23));
        }
        Integer num = c1580070rDh.LLILZ;
        if (num != null) {
            long jIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(C1843500y4a.LIZIZ(jIntValue));
            }
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        Drawable background = null;
        if (tuxTextView2 != null) {
            background = tuxTextView2.getBackground();
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
        View view = this.itemView;
        Long l = c1580070rDh.LL;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        view.setTag(R.id.g97, string);
    }
}
