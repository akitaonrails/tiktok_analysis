package com.ss.android.ugc.aweme.poi.reviews.landing.cell;

import X.C384050F3z;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiReviewsUserLevelRightsCell extends PowerCell<PoiReviewsApi.PoiReviewUserLevelRightModel> {
    public View LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup.LayoutParams layoutParams;
        super.onItemViewCreated();
        this.LL = this.itemView.findViewById(R.id.tmw);
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.tmv);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.tmy);
        this.LLILZ = this.itemView.findViewById(R.id.tms);
        View view = this.LL;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1c);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            Context context = getContext();
            if (context == null) {
                return;
            } else {
                view.setBackground(c384050F3z.LIZ(context));
            }
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            int iLIZIZ = (int) (C497820Jfg.LIZIZ(this.itemView.getContext()) * 0.21f);
            View view3 = this.LLILZ;
            C786410Ut5.W5(view2, new LinearLayout.LayoutParams(iLIZIZ, (view3 == null || (layoutParams = view3.getLayoutParams()) == null) ? -2 : layoutParams.height));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        PoiReviewsApi.PoiReviewUserLevelRightModel poiReviewUserLevelRightModel = (PoiReviewsApi.PoiReviewUserLevelRightModel) interfaceC1891350zJl;
        super.onBindItemView(poiReviewUserLevelRightModel);
        Integer rightsType = poiReviewUserLevelRightModel.getRightsType();
        if (rightsType != null) {
            int iIntValue = rightsType.intValue();
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView != null) {
                switch (iIntValue) {
                    case 1:
                        i = R.raw.icon_hexagon_tick_fill;
                        break;
                    case 2:
                        i = R.raw.icon_two_person_large_fill;
                        break;
                    case 3:
                        i = R.raw.icon_calendar_star_fill;
                        break;
                    case 4:
                        i = R.raw.icon_flag_star_fill;
                        break;
                    case 5:
                        i = R.raw.icon_point_fill;
                        break;
                    case 6:
                        i = R.raw.icon_coupon_label_fill;
                        break;
                    case 7:
                        i = R.raw.icon_fire_fill;
                        break;
                    default:
                        i = R.raw.icon_star_fill;
                        break;
                }
                tuxIconView.setIconRes(i);
            }
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(poiReviewUserLevelRightModel.getRightsTitle());
        }
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e85, viewGroup, false);
    }
}
