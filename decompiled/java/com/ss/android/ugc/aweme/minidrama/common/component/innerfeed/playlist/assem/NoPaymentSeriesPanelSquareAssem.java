package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0AMJ;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1573890r3j;
import X.C1581520rG2;
import X.C1611550s2T;
import X.C1611660s2e;
import X.C1612480s3y;
import X.C1612860s4a;
import X.C1613130s51;
import X.C1613140s52;
import X.C1613210s59;
import X.C1613520s5e;
import X.C1620650sH9;
import X.C1749280vcc;
import X.C197039127h;
import X.C20603715jn;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1578890rBn;
import X.InterfaceC1613700s5w;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem.footer.MiniDramaLoadingFooter;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS301S0300000_24;
import kotlin.jvm.internal.AwS44S2100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class NoPaymentSeriesPanelSquareAssem extends UIListContentAssem<SeriesPanelSquareViewModel> implements InterfaceC1613700s5w {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1741));
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public final C1559260qg8 LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    @Override // X.InterfaceC1613700s5w
    public final void H20(String str) {
    }

    @Override // X.InterfaceC1613700s5w
    public final void PN0(String str, C1613520s5e c1613520s5e) {
    }

    @Override // X.InterfaceC1613700s5w
    public final CollectionDetailModel cj(String str) {
        return null;
    }

    @Override // X.InterfaceC1613700s5w
    public final Pair<String, String> kj(String str) {
        return null;
    }

    @Override // X.InterfaceC1613700s5w
    public final void wf0(String str) {
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        c20603715jn.LIZLLL = MiniDramaLoadingFooter.class;
        c20603715jn.LJIIL = true;
        return c20603715jn;
    }

    public final int Lo() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    public final C197039127h No() {
        return (C197039127h) this.LLJILLL.getValue();
    }

    public final C1612860s4a Oo() {
        return (C1612860s4a) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final SeriesPanelSquareViewModel ip() {
        return (SeriesPanelSquareViewModel) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            miniDramaPlayListServiceLIZ.Rn(this);
        }
        super.onDestroy();
    }

    public NoPaymentSeriesPanelSquareAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 734);
        this.LLJ = new C736950SvV(C13LE.LIZ(SeriesPanelSquareViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(218), new AwS568S0100000_24((AbstractC738140SxQ) this, 732), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 729));
        this.LLJIJIL = new C1559260qg8(new C723590SZx(this, C1612860s4a.class, "series_video_playlist_hierarchy_data"), checkSupervisorPrepared());
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 731));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 733));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 728));
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 730));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 727));
    }

    @Override // X.InterfaceC1613700s5w
    public final List Qn(String str) {
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        SeriesPanelSquareViewModel seriesPanelSquareViewModelIp = ip();
        seriesPanelSquareViewModelIp.getClass();
        seriesPanelSquareViewModelIp.LLILZLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(seriesPanelSquareViewModelIp), null, null, new C1613140s52(seriesPanelSquareViewModelIp, null), 3);
        C786410Ut5.LLILLIZIL((LinearLayoutCompat) this.LLJJI.getValue(), 0);
        ((TuxNavBar) this.LLJJ.getValue()).LJIIZILJ(false);
        SeriesPanelSquareViewModel seriesPanelSquareViewModelIp2 = ip();
        Oo();
        seriesPanelSquareViewModelIp2.getClass();
        if (Oo().LLJI) {
            ip().LLIZLLLIL = true;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LJJIJL().getContext(), Lo());
        gridLayoutManager.LLIZ = new C1620650sH9(this, 0);
        Go().setLayoutManager(gridLayoutManager);
        C197039127h c197039127h = (C197039127h) this.LLJILJIL.getValue();
        if (Oo().LLJJI) {
            C786410Ut5.LJLLLLLL(8, c197039127h);
        } else {
            if (!Oo().LLILLL && !Oo().LLILZ) {
                MiniDramaHostService.LIZ.getClass();
                MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
                if (miniDramaHostServiceLIZ != null) {
                    miniDramaHostServiceLIZ.LIZ();
                }
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c197039127h);
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 23));
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s56
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1613130s51) obj).LLILLJJLI;
            }
        }, null, new AwS618S0100000_4(this, 15), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s5A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1613130s51) obj).LLILLL;
            }
        }, null, new AwS618S0100000_4(this, 16), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s57
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1613130s51) obj).LLILZ;
            }
        }, null, new AwS618S0100000_4(this, 17), 6);
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            miniDramaPlayListServiceLIZ.Un(this);
        }
        C1749280vcc c1749280vcc = (C1749280vcc) this.LLJILJILJ.getValue();
        C786410Ut5.LJLLLLLL(0, c1749280vcc);
        c1749280vcc.LJ();
        CollectionDetailModel collectionDetailModel = ((C1613130s51) ip().getState()).LLILZIL;
        if (collectionDetailModel != null && Intrinsics.LJFF(collectionDetailModel.shouldHideFavoriteButton, Boolean.TRUE) && ((Number) C0AMJ.LIZ.getValue()).intValue() == 1) {
            C786410Ut5.LJLLLLLL(8, No());
            return;
        }
        CollectionDetailModel collectionDetailModel2 = ((C1613130s51) ip().getState()).LLILZIL;
        if (collectionDetailModel2 != null) {
            C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
            String str = Oo().LLILZIL;
            c1581520rG2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1612480s3y.LJIIL(c2344009Gk, str, false);
            C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModel2);
            C1612480s3y.LJII(c2344009Gk, collectionDetailModel2);
            C1611660s2e.LJJI(c2344009Gk, collectionDetailModel2);
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("show_add_to_favorite", c2344009Gk.LIZ);
            }
        }
        int iId = EnumC1578890rBn.ICON_3PT_BOOKMARK_FILL.id();
        int iId2 = EnumC1578890rBn.ICON_3PT_BOOKMARK.id();
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(No().getContext(), iId);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, No().getContext());
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        TuxIconDrawable tuxIconDrawable2 = new TuxIconDrawable(No().getContext(), iId2);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, No().getContext());
        if (numLIZJ2 != null) {
            tuxIconDrawable2.LJFF(numLIZJ2.intValue());
        }
        No().setButtonStartIconDrawable(tuxIconDrawable);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s58
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1613130s51) obj).LLIZ);
            }
        }, null, new AwS301S0300000_24(this, tuxIconDrawable, tuxIconDrawable2, 0), 6);
        C786410Ut5.U8(No(), new ACListenerS158S0100000_24(this, 93));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0s5N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1613130s51) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 172), 4);
    }

    @Override // X.InterfaceC1613700s5w
    public final void kv2(String str, String str2, String str3) {
        String str4;
        if (Intrinsics.LJFF(str, Oo().LL)) {
            SeriesPanelSquareViewModel seriesPanelSquareViewModelIp = ip();
            seriesPanelSquareViewModelIp.LLILZ = str2;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            seriesPanelSquareViewModelIp.LLILZIL = str4;
            seriesPanelSquareViewModelIp.withState(new AwS44S2100000_24(seriesPanelSquareViewModelIp, str2, str3, 3));
        }
    }
}
