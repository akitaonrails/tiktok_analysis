package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1838907Id;
import X.C438710HIf;
import X.C662390PyX;
import X.C663780Q1w;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC663810Q1z;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductCell extends PowerCell<C663780Q1w> {
    public SmartImageView LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public ViewGroup LLILZ;
    public TextView LLILZIL;
    public SmartImageView LLILZLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC663810Q1z interfaceC663810Q1z;
        super.onViewAttachedToWindow();
        C663780Q1w item = getItem();
        if (item == null || (interfaceC663810Q1z = item.LLILLL) == null) {
            return;
        }
        interfaceC663810Q1z.LIZ(item.LL, getBindingAdapterPosition());
    }

    public static int I5(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C663780Q1w c663780Q1w = (C663780Q1w) interfaceC1891350zJl;
        super.onBindItemView(c663780Q1w);
        TextView textView = this.LLILLJJLI;
        ViewGroup viewGroup = null;
        if (textView == null) {
            textView = null;
        }
        textView.setText(c663780Q1w.LL.title);
        TextView textView2 = this.LLILLL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(c663780Q1w.LL.formatPrice);
        List<String> list = c663780Q1w.LL.imgUrlList;
        if (list != null && (str = (String) C13LP.LJJJLZIJ(0, list)) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            SmartImageView smartImageView = this.LL;
            if (smartImageView == null) {
                smartImageView = null;
            }
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        Product.ActivityInfo activityInfo = c663780Q1w.LL.activityInfo;
        if (activityInfo != null) {
            String str2 = activityInfo.name;
            UrlModel urlModel = activityInfo.iconUrl;
            if (str2 != null && urlModel != null) {
                ViewGroup viewGroup2 = this.LLILZ;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                C786410Ut5.LJLZ(0, viewGroup2);
                TextView textView3 = this.LLILZIL;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(str2);
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                SmartImageView smartImageView2 = this.LLILZLL;
                if (smartImageView2 == null) {
                    smartImageView2 = null;
                }
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        ViewGroup viewGroup3 = this.LLILZ;
        if (viewGroup3 != null) {
            viewGroup = viewGroup3;
        }
        C786410Ut5.LJLZ(8, viewGroup);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f2k, viewGroup, false);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.ryd);
        if (C1838907Id.LIZ()) {
            SmartImageView smartImageView = this.LL;
            if (smartImageView == null) {
                smartImageView = null;
            }
            C662390PyX.LIZ.getClass();
            C662390PyX.LJ(smartImageView, false);
        }
        this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.ryo);
        this.LLILLL = (TextView) viewTd.findViewById(R.id.ryg);
        this.LLILZ = (ViewGroup) viewTd.findViewById(R.id.ryl);
        this.LLILZIL = (TextView) viewTd.findViewById(R.id.ryn);
        this.LLILZLL = (SmartImageView) viewTd.findViewById(R.id.rym);
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 0), viewTd);
        return viewTd;
    }
}
