package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.aisummary.section;

import X.C0Q18;
import X.C0Q1C;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC656000PoE;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class AISummaryAnoleSectionCell extends PowerCell<C0Q1C> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        C0Q1C c0q1c = (C0Q1C) interfaceC1891350zJl;
        super.onBindItemView(c0q1c);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            if (c0q1c.LLILLJJLI) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else {
                iLIZIZ = 0;
            }
            marginLayoutParams.topMargin = iLIZIZ;
            C786410Ut5.W5(this.itemView, marginLayoutParams);
        }
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.u6o);
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0Q1E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        C0Q18 c0q18 = c0q1c.LL;
        if (c0q18 != null) {
            c0q18.Xq2(EnumC656000PoE.SEARCH_AD_AI_SUMMARY_ANOLE.getValue(), frameLayout);
        }
        C0Q18 c0q182 = c0q1c.LL;
        if (c0q182 != null) {
            c0q182.onViewAttachedToWindow();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.esg, viewGroup, false);
    }
}
