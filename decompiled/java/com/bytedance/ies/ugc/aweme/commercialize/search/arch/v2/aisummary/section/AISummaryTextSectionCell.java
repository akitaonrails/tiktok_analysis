package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.aisummary.section;

import X.C01GW;
import X.C1011490cQd;
import X.C1860130yVP;
import X.C21419418s4;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardSection;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardSectionData;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class AISummaryTextSectionCell extends PowerCell<C1011490cQd> {
    public C1860130yVP LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(81));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ISearchMarkdownService iSearchMarkdownService;
        super.onItemViewCreated();
        ISearchMarkdownService iSearchMarkdownService2 = (ISearchMarkdownService) this.LLILLJJLI.getValue();
        if (iSearchMarkdownService2 != null) {
            iSearchMarkdownService2.LIZLLL(this.itemView.getContext());
        }
        C1860130yVP c1860130yVP = (C1860130yVP) this.itemView.findViewById(R.id.tv_summary_text);
        this.LL = c1860130yVP;
        if (c1860130yVP == null || (iSearchMarkdownService = (ISearchMarkdownService) this.LLILLJJLI.getValue()) == null) {
            return;
        }
        iSearchMarkdownService.LJFF(c1860130yVP.getContext(), c1860130yVP, 61, R.attr.a1h);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String text;
        ISearchMarkdownService iSearchMarkdownService;
        AIAdCardSectionData data;
        C1011490cQd c1011490cQd = (C1011490cQd) interfaceC1891350zJl;
        super.onBindItemView(c1011490cQd);
        AIAdCardSection aIAdCardSection = c1011490cQd.LL;
        C21419418s4 c21419418s4LIZ = null;
        if (aIAdCardSection == null || (data = aIAdCardSection.getData()) == null || (text = data.getText()) == null) {
            text = "";
        }
        C1860130yVP c1860130yVP = this.LL;
        if (c1860130yVP != null && (iSearchMarkdownService = (ISearchMarkdownService) this.LLILLJJLI.getValue()) != null) {
            ISearchMarkdownService iSearchMarkdownService2 = (ISearchMarkdownService) this.LLILLJJLI.getValue();
            if (iSearchMarkdownService2 != null) {
                c21419418s4LIZ = iSearchMarkdownService2.LIZ(c1860130yVP.getContext());
            }
            iSearchMarkdownService.LJIIIIZZ(c1860130yVP, text, c21419418s4LIZ, null, null, null, null, null, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.esi, viewGroup, false);
    }
}
