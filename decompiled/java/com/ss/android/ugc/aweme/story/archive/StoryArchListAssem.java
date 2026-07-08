package com.ss.android.ugc.aweme.story.archive;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1208640hYc;
import X.C1220000hqw;
import X.C13LE;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19252910Tv;
import X.C19EG;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C727890Sgt;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchListAssem extends UIListContentAssem<StoryArchListViewModel> implements InterfaceC487330J9f {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2270));
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        return (AssemListViewModel) this.LLJ.getValue();
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    public StoryArchListAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(613);
        this.LLJ = new C736950SvV(C13LE.LIZ(StoryArchListViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(756), new AwS562S0100000_18((AbstractC738140SxQ) this, 2271), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2272));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2269));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2268));
    }

    public final void No(C1722300uv6 c1722300uv6) {
        String str;
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show status: ");
        if (Intrinsics.LJFF(c1722300uv6, this.LLJIJIL.getValue())) {
            str = "error";
        } else {
            str = "empty";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("StoryArchListAssem", strLIZIZ);
        C786410Ut5.LLF(8, Go());
        C786410Ut5.LLLZLZ(Lo(), 0);
        Lo().setStatus(c1722300uv6);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Lo().LJ();
        Go().LJIILJJIL(StoryArchListCell.class);
        Go().setItemAnimator(null);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0));
        gridLayoutManager.LLIZ = new C1208640hYc(this, gridLayoutManager, 3);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(gridLayoutManager);
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0gRV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326010CqF c326010CqF = (C326010CqF) obj;
                c326010CqF.getClass();
                return C627260Oiy.LIZ(c326010CqF);
            }
        }, null, new AwS632S0100000_18(this, 200), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0gRT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326010CqF c326010CqF = (C326010CqF) obj;
                c326010CqF.getClass();
                return C627260Oiy.LIZLLL(c326010CqF);
            }
        }, null, new AwS597S0100000_18(this, 576), null, null, 26, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0gRU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326010CqF c326010CqF = (C326010CqF) obj;
                c326010CqF.getClass();
                return C627260Oiy.LIZJ(c326010CqF);
            }
        }, null, new AwS597S0100000_18(this, 577), null, null, 26, null);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        GridLayoutManager gridLayoutManager;
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJ(C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0));
        }
    }
}
