package com.ss.android.ugc.aweme.series.vip.cell;

import X.C079800Ro;
import X.C1272204yO;
import X.C1324840ka2;
import X.C1697810uHb;
import X.C20642515q3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.model.VipSubscriptionEntitlement;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesVipSubscriptionBenefitsCell extends PowerCell<C1272204yO> {
    public ViewGroup LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (ViewGroup) this.itemView.findViewById(R.id.usf);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1272204yO c1272204yO = (C1272204yO) interfaceC1891350zJl;
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), (int) (c1272204yO.LLILLJJLI * view.getResources().getDisplayMetrics().density), view.getPaddingRight(), 0);
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            List<VipSubscriptionEntitlement> list = c1272204yO.LL;
            C786410Ut5.LJJJJI(viewGroup);
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
            int dimensionPixelSize = C20642515q3.LJFF().getDimensionPixelSize(R.dimen.t8);
            int i2 = 0;
            for (VipSubscriptionEntitlement vipSubscriptionEntitlement : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    VipSubscriptionEntitlement vipSubscriptionEntitlement2 = vipSubscriptionEntitlement;
                    View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.bia, viewGroup, false);
                    ((TextView) viewTd.findViewById(R.id.use)).setText(C079800Ro.LIZ(viewGroup.getContext(), vipSubscriptionEntitlement2.desc));
                    RemoteImageView remoteImageView = (RemoteImageView) viewTd.findViewById(R.id.usd);
                    UrlModel urlModel = vipSubscriptionEntitlement2.logo;
                    if (urlModel != null) {
                        C1324840ka2.LJFF(remoteImageView, urlModel);
                    }
                    FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(0, -2);
                    flexboxLayout$LayoutParams.LIZ();
                    if (i2 == list.size() - 1) {
                        i = 0;
                    } else {
                        i = dimensionPixelSize;
                    }
                    flexboxLayout$LayoutParams.setMarginEnd(i);
                    C786410Ut5.W5(viewTd, flexboxLayout$LayoutParams);
                    viewGroup.addView(viewTd);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bib, viewGroup, false);
    }
}
