package com.ss.android.ugc.aweme.topic.movie.favorite;

import X.C019F;
import X.C01GW;
import X.C0OAT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C325640Cpe;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieFavoritePageAssem extends BaseFavoriteListAssem<C325640Cpe, C0OAT, Long> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MovieFavoritePageAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/movie/favorite/MovieFavoriteListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MovieFavoritePageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MovieFavoriteListVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1560), AFwS240S0000000_9.get$arr$(649), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1559));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1558));
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String Go() {
        return (String) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final String Ho() {
        return (String) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem
    /* JADX INFO: renamed from: Vo, reason: merged with bridge method [inline-methods] */
    public final MovieFavoriteListVM So() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (MovieFavoriteListVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOo = Oo();
        C426750GoL.LJII(viewOnAttachStateChangeListenerC20604515jvOo, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0, true);
        viewOnAttachStateChangeListenerC20604515jvOo.LJIILJJIL(MovieFavoriteItemCell.class);
        viewOnAttachStateChangeListenerC20604515jvOo.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvOo.getContext(), 1, false));
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 542);
        AssemViewModel.asyncSubscribe$default(So(), new C2217381BqS() { // from class: X.0CxF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325640Cpe c325640Cpe = (C325640Cpe) obj;
                c325640Cpe.getClass();
                return C627260Oiy.LIZLLL(c325640Cpe);
            }
        }, null, null, null, new AwS588S0100000_9(awS548S0100000_4, 671), 14, null);
        AssemViewModel.asyncSubscribe$default(So(), new C2217381BqS() { // from class: X.0IzN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325640Cpe c325640Cpe = (C325640Cpe) obj;
                c325640Cpe.getClass();
                return C627260Oiy.LIZJ(c325640Cpe);
            }
        }, null, null, null, new AwS588S0100000_9(awS548S0100000_4, 672), 14, null);
    }
}
