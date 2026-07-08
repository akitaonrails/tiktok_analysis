package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.ui;

import X.AbstractC738140SxQ;
import X.C041J;
import X.C0PEM;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20642515q3;
import X.C2196721AyE;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452070Ho5;
import X.C644910PRh;
import X.C645890PVb;
import X.C646370PWx;
import X.C664290Q3v;
import X.C682730QqF;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC649890PeN;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.CardText;
import com.ss.android.ugc.aweme.discover.model.SearchMinis;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisCardViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.model.SearchMinisItemDataModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisCardAssem extends ReusedUISlotAssem<SearchMinisCardAssem> implements InterfaceC712990Rxx<C645890PVb> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public SearchMinis LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLL;
    public HashMap<String, String> LLJLLIL;
    public List<SearchMinisItemDataModel> LLJLLL;
    public String LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMinisCardAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/minis/core/SearchMinisCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eut;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        this.LLL = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        this.LLL = false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLJZIJLIL) {
            Iterator<SearchMinisItemDataModel> it2 = this.LLJLLL.iterator();
            while (it2.hasNext()) {
                op(it2.next().getMinis().getClientKey());
            }
            this.LLL = true;
        }
    }

    public SearchMinisCardAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMinisCardViewModel.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 772);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(348);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C724750Sbp.LIZIZ(this, function0LJIIJ, new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 773), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this)));
        this.LLJLLL = C13BV.INSTANCE;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (TuxTextView) getContentView().findViewById(R.id.ogu);
        TuxTextView tuxTextView = (TuxTextView) getContentView().findViewById(R.id.uiy);
        this.LLJLIL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS145S0100000_10(this, 34));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) getContentView().findViewById(R.id.ofd);
        this.LLJLL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchMinisCardItemCell.class);
        }
        this.LLJLILLLLZIIL = (TuxIconView) getContentView().findViewById(R.id.drb);
    }

    public final void op(String str) {
        C646370PWx c646370PWx = (C646370PWx) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class)).wO2().LIZJ();
        FirstScreenHelperAbility firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), FirstScreenHelperAbility.class);
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class);
        C682730QqF.LIZ.getClass();
        C682730QqF.LJII(searchServiceCenter$CardCommonAbility, c646370PWx, firstScreenHelperAbility, str);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C645890PVb c645890PVb) {
        boolean z;
        CharSequence text;
        String strValueOf;
        String strValueOf2;
        C644910PRh c644910PRhLIZJ;
        String str;
        C20600815jK<InterfaceC1891350zJl> state;
        List<CardText> list;
        List<CardText> list2;
        List<CardText> list3;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        List<CardText> list4;
        TuxTextView tuxTextView3;
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class);
        C646370PWx c646370PWx = (C646370PWx) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class)).wO2().LIZJ();
        FirstScreenHelperAbility firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), FirstScreenHelperAbility.class);
        C682730QqF.LIZ.getClass();
        this.LLJLLIL = C682730QqF.LIZ(searchServiceCenter$CardCommonAbility, c646370PWx, firstScreenHelperAbility, null);
        SearchMixFeed searchMixFeed = c645890PVb.LL;
        SearchMinis searchMinis = searchMixFeed.minis;
        if (searchMinis == null) {
            searchMinis = searchMixFeed.miniGame;
        }
        this.LLJJLIIIJLLLLLLLZ = searchMinis;
        int i = 0;
        if (searchMixFeed.miniGame != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJZIJLIL = z;
        if (searchMinis != null) {
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText("");
            }
            SearchMinis searchMinis2 = this.LLJJLIIIJLLLLLLLZ;
            if (searchMinis2 != null && (list4 = searchMinis2.cardTextList) != null) {
                int i2 = 0;
                for (CardText cardText : list4) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        CardText cardText2 = cardText;
                        if (Intrinsics.LJFF(cardText2.textKey, "minis_search_card_title") && (tuxTextView3 = this.LLJL) != null) {
                            tuxTextView3.setText(cardText2.textContent);
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            TuxTextView tuxTextView5 = this.LLJL;
            if (tuxTextView5 != null) {
                text = tuxTextView5.getText();
            } else {
                text = null;
            }
            if (!C041J.LIZ(text) && (tuxTextView2 = this.LLJL) != null) {
                tuxTextView2.setText(C20642515q3.LJI(2131822272));
            }
            List<SearchMinisItem> list5 = searchMinis.minisItems;
            if (list5.size() > 3) {
                SearchMinis searchMinis3 = this.LLJJLIIIJLLLLLLLZ;
                if (searchMinis3 != null && (list2 = searchMinis3.cardTextList) != null && (!list2.isEmpty())) {
                    SearchMinis searchMinis4 = this.LLJJLIIIJLLLLLLLZ;
                    if (searchMinis4 != null && (list3 = searchMinis4.cardTextList) != null) {
                        int i4 = 0;
                        for (CardText cardText3 : list3) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                CardText cardText4 = cardText3;
                                if (Intrinsics.LJFF(cardText4.textKey, "minis_search_card_view_all_button") && (tuxTextView = this.LLJLIL) != null) {
                                    tuxTextView.setText(cardText4.textContent);
                                }
                                i4 = i5;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                } else {
                    TuxTextView tuxTextView6 = this.LLJLIL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(C20642515q3.LJI(2131822273));
                    }
                }
                TuxTextView tuxTextView7 = this.LLJLIL;
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 0);
                }
                TuxIconView tuxIconView = this.LLJLILLLLZIIL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
            } else {
                TuxTextView tuxTextView8 = this.LLJLIL;
                if (tuxTextView8 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView8, 8);
                }
                TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                }
            }
            List listLL = C13LP.LL(list5, 3);
            ArrayList arrayList = new ArrayList();
            Iterator<SearchMinisItem> it2 = list5.iterator();
            while (it2.hasNext()) {
                String schema = it2.next().getSchema();
                if (schema != null) {
                    arrayList.add(schema);
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2196721AyE(arrayList, null), 3);
            SearchMinis searchMinis5 = this.LLJJLIIIJLLLLLLLZ;
            if (searchMinis5 != null && (list = searchMinis5.cardTextList) != null) {
                int i6 = 0;
                strValueOf = null;
                strValueOf2 = null;
                for (CardText cardText5 : list) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        CardText cardText6 = cardText5;
                        if (Intrinsics.LJFF(cardText6.textKey, "minis_search_card_click_button")) {
                            strValueOf = String.valueOf(cardText6.textContent);
                        }
                        if (Intrinsics.LJFF(cardText6.textKey, "minis_search_card_recent_tag")) {
                            strValueOf2 = String.valueOf(cardText6.textContent);
                        }
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                strValueOf = null;
                strValueOf2 = null;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            for (Object obj : listLL) {
                int i8 = i + 1;
                if (i >= 0) {
                    arrayList2.add(new SearchMinisItemDataModel((SearchMinisItem) obj, strValueOf, strValueOf2, this.LLJLLIL, false, String.valueOf(i)));
                    i = i8;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLJLLL = arrayList2;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(this.LLJLLL, null);
            }
            InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
            if (interfaceC649890PeNLIZ != null && (c644910PRhLIZJ = interfaceC649890PeNLIZ.LIZJ()) != null && (str = c644910PRhLIZJ.LIZIZ) != null) {
                this.LLJZ = str;
            }
            if (!this.LLJZIJLIL) {
                C646370PWx c646370PWx2 = (C646370PWx) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), ISearchContextAbility.class)).wO2().LIZJ();
                FirstScreenHelperAbility firstScreenHelperAbility2 = (FirstScreenHelperAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), FirstScreenHelperAbility.class);
                SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility2 = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class);
                C682730QqF.LIZ.getClass();
                C682730QqF.LJII(searchServiceCenter$CardCommonAbility2, c646370PWx2, firstScreenHelperAbility2, null);
                return;
            }
            if (!this.LLL) {
                Iterator<SearchMinisItemDataModel> it3 = this.LLJLLL.iterator();
                while (it3.hasNext()) {
                    op(it3.next().getMinis().getClientKey());
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C645890PVb c645890PVb) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C645890PVb c645890PVb) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
