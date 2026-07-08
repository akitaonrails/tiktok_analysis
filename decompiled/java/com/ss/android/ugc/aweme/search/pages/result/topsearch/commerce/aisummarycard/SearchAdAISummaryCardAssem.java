package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.aisummarycard;

import X.C01GW;
import X.C0R12;
import X.C0R13;
import X.C0R45;
import X.C13BV;
import X.C13LP;
import X.C1533950q1J;
import X.C1558520qew;
import X.C452501pT;
import X.C643070PKf;
import X.C786410Ut5;
import X.EnumC658120Pre;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardFooter;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardHeader;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardLabel;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardSection;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS334S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdAISummaryCardAssem extends ReusedUISlotAssem<SearchAdAISummaryCardAssem> implements InterfaceC712990Rxx<C643070PKf> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 677));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 675));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 676));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 674));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 678));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 673));
    public C0R13 LLJLLL;
    public AIAdCardStruct LLJZ;
    public ARunnableS110S0100000_10 LLJZIJLIL;
    public boolean LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.esh;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 16));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C643070PKf c643070PKf) {
        String text;
        C0R13 c0r13;
        String text2;
        View viewLJIILIIL;
        AIAdCardLabel label;
        AIAdCardStruct aiAdCard = c643070PKf.LL.getAiAdCard();
        if (aiAdCard != null && !Intrinsics.LJFF(this.LLJZ, aiAdCard)) {
            this.LLJZ = aiAdCard;
            List<Aweme> awemeList = aiAdCard.getAwemeList();
            if (awemeList != null) {
                C13LP.LJJJLL(awemeList);
            }
            AIAdCardHeader header = aiAdCard.getHeader();
            String text3 = null;
            if (header != null) {
                text = header.getText();
            } else {
                text = null;
            }
            String str = "";
            if (text == null) {
                text = "";
            }
            TextView textView = (TextView) this.LLJLIL.getValue();
            if (textView != null) {
                textView.setText(text);
            }
            FrameLayout frameLayout = (FrameLayout) this.LLJLILLLLZIIL.getValue();
            int i = 0;
            if (frameLayout != null) {
                if (header != null && (label = header.getLabel()) != null) {
                    text2 = label.getText();
                } else {
                    text2 = null;
                }
                if (C1533950q1J.LJ(text2)) {
                    C786410Ut5.LJJJJI(frameLayout);
                    C786410Ut5.LJLLLLLL(8, frameLayout);
                    if (text2 != null && (viewLJIILIIL = C0R12.LIZIZ.LJIILIIL(text2, frameLayout, EnumC658120Pre.AI_SUMMARY_CARD)) != null) {
                        C786410Ut5.W5(viewLJIILIIL, new FrameLayout.LayoutParams(-2, -2));
                        frameLayout.addView(viewLJIILIIL);
                        C786410Ut5.LJLLLLLL(0, frameLayout);
                        C786410Ut5.LJLLLLLL(0, viewLJIILIIL);
                    }
                } else {
                    C786410Ut5.LJZ(8, frameLayout);
                }
            }
            AIAdCardFooter footer = aiAdCard.getFooter();
            if (footer != null) {
                text3 = footer.getText();
            }
            TextView textView2 = (TextView) this.LLJLLIL.getValue();
            if (textView2 != null) {
                if (text3 != null) {
                    str = text3;
                }
                textView2.setText(str);
            }
            View view = (View) this.LLJLLIL.getValue();
            if (view != null) {
                if (text3 == null || text3.length() == 0) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
            }
            C0R13 c0r13LJFF = C0R12.LIZIZ.LJFF(getContext(), this.LLJZ, AFwS334S0000000_10.get$arr$(2));
            this.LLJLLL = c0r13LJFF;
            if (c0r13LJFF != null) {
                c0r13LJFF.bind();
            }
            List<AIAdCardSection> sectionList = aiAdCard.getSectionList();
            if (sectionList == null) {
                sectionList = C13BV.INSTANCE;
            }
            if (awemeList == null) {
                awemeList = C13BV.INSTANCE;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJLL.getValue();
            if (viewOnAttachStateChangeListenerC20604515jv != null && (c0r13 = this.LLJLLL) != null) {
                c0r13.LJ(viewOnAttachStateChangeListenerC20604515jv, sectionList, awemeList);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C643070PKf c643070PKf) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C643070PKf c643070PKf) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
