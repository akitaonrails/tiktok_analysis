package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.ui;

import X.C0R12;
import X.C1010120cOQ;
import X.C1558520qew;
import X.C654550Plt;
import X.C661470Px3;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC1011460cQa;
import X.InterfaceC1587906Jp;
import X.InterfaceC656050PoJ;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.ui.SearchMediaAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdMediaViewAssem extends ReusedUIContentAssem<SearchAdMediaViewAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public View LLJJJJ;
    public View LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public ViewGroup LLJJL;
    public InterfaceC656050PoJ LLJJLIIIJLLLLLLLZ;
    public Aweme LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public SearchAdMediaViewAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C654550Plt.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        if (view != null) {
            SearchMediaAssem.LLLFFI.getClass();
            viewFindViewById = view.findViewById(SearchMediaAssem.LLLILZ);
        } else {
            viewFindViewById = null;
        }
        this.LLJJJJ = viewFindViewById;
        if (view != null) {
            SearchMediaAssem.LLLFFI.getClass();
            viewFindViewById2 = view.findViewById(SearchMediaAssem.LLLIIIIL);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJJJJJIL = viewFindViewById2;
        if (view != null) {
            SearchMediaAssem.LLLFFI.getClass();
            viewGroup = (ViewGroup) view.findViewById(SearchMediaAssem.LLLILZLLLI);
        } else {
            viewGroup = null;
        }
        this.LLJJJJLIIL = viewGroup;
        if (view != null) {
            SearchMediaAssem.LLLFFI.getClass();
            viewGroup2 = (ViewGroup) view.findViewById(SearchMediaAssem.LLLIZZ);
        }
        this.LLJJL = viewGroup2;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        C661470Px3 c661470Px3;
        final Aweme aweme = interfaceC657240PqE.getAweme();
        this.LLJL = aweme;
        ViewGroup viewGroup = this.LLJJJJLIIL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = this.LLJJJJLIIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        if (C1010120cOQ.LJIJI(aweme)) {
            InterfaceC656050PoJ interfaceC656050PoJLJIIL = C0R12.LIZIZ.LJIIL(getContext(), aweme);
            this.LLJJLIIIJLLLLLLLZ = interfaceC656050PoJLJIIL;
            if (interfaceC656050PoJLJIIL != null) {
                interfaceC656050PoJLJIIL.LIZJ(new InterfaceC1011460cQa() { // from class: X.0Pq8
                    @Override // X.InterfaceC1011460cQa
                    public final ViewGroup LIZIZ() {
                        return this.LIZ.LLJJL;
                    }

                    @Override // X.InterfaceC1011460cQa
                    public final void LIZJ() {
                        C661470Px3 c661470Px32;
                        C661490Px5 dataProvider;
                        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchComponentCenter$Player$PlayerControlAbility.class, null);
                        View viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility != null ? searchComponentCenter$Player$PlayerControlAbility.LLLLLLLZIL() : null;
                        if ((viewLLLLLLLZIL instanceof C661470Px3) && (c661470Px32 = (C661470Px3) viewLLLLLLLZIL) != null && (dataProvider = c661470Px32.getDataProvider()) != null) {
                            C661510Px7.LIZ.getClass();
                            C661510Px7.LIZ(dataProvider, false, false);
                        }
                        InterfaceC656050PoJ interfaceC656050PoJ = this.LIZ.LLJJLIIIJLLLLLLLZ;
                        if (interfaceC656050PoJ != null) {
                            interfaceC656050PoJ.LJIJI();
                        }
                        SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchServiceCenter$NavigateAbility.class, null);
                        if (searchServiceCenter$NavigateAbility != null) {
                            searchServiceCenter$NavigateAbility.GV0(C1558520qew.LJIIL(this.LIZ), aweme, null, false, null, null);
                        }
                    }

                    @Override // X.InterfaceC1011460cQa
                    public final ViewGroup LIZLLL() {
                        return this.LIZ.LLJJJJLIIL;
                    }

                    @Override // X.InterfaceC1011460cQa
                    public final void LJJLIIJ() {
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchServiceCenter$AutoPlayAbility.class, null);
                        if (searchServiceCenter$AutoPlayAbility != null) {
                            searchServiceCenter$AutoPlayAbility.J0();
                        }
                    }

                    @Override // X.InterfaceC1011460cQa
                    public final ViewGroup getItemView() {
                        View viewLJJIJL = this.LIZ.LJJIJL();
                        if (viewLJJIJL instanceof ViewGroup) {
                            return (ViewGroup) viewLJJIJL;
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1011460cQa
                    public final void pauseVideo() {
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchServiceCenter$AutoPlayAbility.class, null);
                        if (searchServiceCenter$AutoPlayAbility != null) {
                            searchServiceCenter$AutoPlayAbility.LLZZZZ();
                        }
                    }
                });
            }
            InterfaceC656050PoJ interfaceC656050PoJ = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC656050PoJ != null) {
                interfaceC656050PoJ.bind();
            }
            ViewGroup viewGroup3 = this.LLJJJJLIIL;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(0, viewGroup3);
            }
            View viewLLLLLLLZIL = null;
            SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
            if (searchComponentCenter$Player$PlayerControlAbility != null) {
                viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility.LLLLLLLZIL();
            }
            if ((viewLLLLLLLZIL instanceof C661470Px3) && (c661470Px3 = (C661470Px3) viewLLLLLLLZIL) != null) {
                C661470Px3.LJII(c661470Px3, this.LLJJLIIIJLLLLLLLZ, false, this.LLJL, 5);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
