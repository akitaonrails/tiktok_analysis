package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.C1206160hUc;
import X.C13LE;
import X.C166W;
import X.C1876907Wt;
import X.C2217381BqS;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchProsConsDropdownPanelTagPowerCell extends PowerCell<C1876907Wt> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C166W LL = new C166W(new AwS597S0100000_18((PowerCell) this, 555));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsDropdownPanelTagPowerCell.class, "binding", "getBinding()Lcom/ss/android/ugc/aweme/search/databinding/SearchProsConsDropdownPanelTagPowerCellBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f2l;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
        }
        FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) layoutParams;
        layoutParams2.LIZ();
        C786410Ut5.W5(view, layoutParams2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C166W c166w = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        ((C1206160hUc) c166w.LIZ(this)).LL.setText(((C1876907Wt) interfaceC1891350zJl).LL);
    }
}
