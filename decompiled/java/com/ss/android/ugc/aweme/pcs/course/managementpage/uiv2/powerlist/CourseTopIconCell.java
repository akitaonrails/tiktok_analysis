package com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist;

import X.C1143680frq;
import X.C488520JDu;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class CourseTopIconCell extends PowerCell<C488520JDu> {
    public TuxIconView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.f41);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C1143680frq.LJFF(this.LL, "tiktok_live_subscription_demand_1", "ttlive_pcs_course_management_top_icon.png", ImageView.ScaleType.CENTER_CROP, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dce, false, 4, null);
    }
}
