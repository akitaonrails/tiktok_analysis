package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C0H2U;
import X.C0H2W;
import X.C0H2X;
import X.C418440Gaw;
import X.C427760Gpy;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchBrandAndSourceCell extends PowerCell<C0H2X> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f2i;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0H2X c0h2x = (C0H2X) interfaceC1891350zJl;
        super.onBindItemView(c0h2x);
        View view = this.itemView;
        SourceFromEntities sourceFromEntities = c0h2x.LL;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.cj_);
        TextView textView = (TextView) view.findViewById(R.id.cis);
        C427760Gpy c427760Gpy = (C427760Gpy) view.findViewById(R.id.bke);
        View viewFindViewById = view.findViewById(R.id.ciq);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_color_highlights);
            tuxIconView.setIconWidth(iLIZIZ);
            tuxIconView.setIconHeight(iLIZIZ);
        }
        if (textView != null) {
            textView.setText(sourceFromEntities.wording);
        }
        C0H2W.LLILZLL.getClass();
        C0H2U.LIZ(c427760Gpy, sourceFromEntities);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C0H2U.LIZJ(viewFindViewById, c0h2x.LLILLJJLI, "click_words_source_banner", AFwS192S0000000_6.get$arr$(633));
        }
    }
}
