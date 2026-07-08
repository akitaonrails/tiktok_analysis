package com.ss.android.ugc.aweme.music.artist.ui;

import X.C019F;
import X.C01GW;
import X.C0DXR;
import X.C1164690gPj;
import X.C1164710gPl;
import X.C1164770gPr;
import X.C1208630hYb;
import X.C1252710ihh;
import X.C12ES;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1164630gPd;
import X.InterfaceC1164700gPk;
import X.InterfaceC2217461Bqa;
import X.InterfaceC447510Hgj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicAwemeCell;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicAwemeLisHintCell;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicStartRecordCell;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ArtistMusicAwemeListAssem extends UIListContentAssem<ArtistMusicFeaturedVideoViewModel> implements InterfaceC1164700gPk {
    public static final C1164690gPj LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public WrapGridLayoutManager LLJI;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 708));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 705));
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723580SZw(this, C1164770gPr.class, "hierarchy_data_artist_music"), checkSupervisorPrepared());

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0gPj] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArtistMusicAwemeListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/music/artist/viewmodel/ArtistMusicFeaturedVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = new Object() { // from class: X.0gPj
        };
    }

    public ArtistMusicAwemeListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArtistMusicFeaturedVideoViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 707), AFwS256S0000000_18.get$arr$(215), null, true);
    }

    @Override // X.InterfaceC1164700gPk, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final C0DXR No() {
        final int iLIZJ = (int) C12ES.LIZJ(1.5f, LJJIJL().getContext());
        return new C0DXR(iLIZJ) { // from class: X.0DXX
            public final int LL;

            {
                this.LL = iLIZJ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                GridLayoutManager gridLayoutManager;
                AbstractC214823195h abstractC214823195h;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    int i = gridLayoutManager.LLILLJJLI;
                    if (abstractC214823195h.LJFF(childAdapterPosition) == 1) {
                        int iLJ = abstractC214823195h.LJ(childAdapterPosition, i);
                        int i2 = this.LL;
                        rect.left = (iLJ * i2) / i;
                        rect.right = i2 - (((iLJ + 1) * i2) / i);
                        if (abstractC214823195h.LIZLLL(childAdapterPosition, i) > 0) {
                            rect.top = this.LL;
                        }
                    }
                }
            }
        };
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        return c20603715jn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0gPl] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public C1164710gPl lt() {
        return new InterfaceC447510Hgj() { // from class: X.0gPl
        };
    }

    public final C1164770gPr Oo() {
        return (C1164770gPr) this.LLJIJIL.getValue();
    }

    public final C1749280vcc So() {
        return (C1749280vcc) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Vo, reason: merged with bridge method [inline-methods] */
    public ArtistMusicFeaturedVideoViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ArtistMusicFeaturedVideoViewModel) assemVMLazy.getValue();
    }

    private final void Zo() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(ArtistMusicAwemeLisHintCell.class, ArtistMusicStartRecordCell.class, ArtistMusicAwemeCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, LJJIJL().getContext(), false);
        wrapGridLayoutManager.LLIZ = new C1208630hYb(wrapGridLayoutManager, 1);
        this.LLJI = wrapGridLayoutManager;
        Go().setLayoutManager(this.LLJI);
        Go().addItemDecoration(No());
    }

    @Override // X.InterfaceC1164700gPk
    public String Fs() {
        return Jo().LLILLL;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Zo();
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165750gRR) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 78), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165750gRR) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 79), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165750gRR) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 80), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gPf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165750gRR) obj).LLILZ;
            }
        }, null, AFwS302S0000000_18.get$arr$(3), 6);
    }

    public final void uc(boolean z) {
        ((InterfaceC1164630gPd) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1164630gPd.class), null)).uc(z);
    }
}
