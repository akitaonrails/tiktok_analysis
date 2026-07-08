package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.AbstractC214823195h;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1559050qfn;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C481090Itn;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC1573550r3B;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ATListenerS456S0100000_24;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol;
import com.ss.android.ugc.aweme.series.feed.profile.view.SeriesFooterCell;
import com.zhiliaoapp.musically.R;
import defpackage.RecyclerViewFirstDrawWatcher;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenteSubPageAssem extends UIListContentAssem<SeriesCenteSubPageAssemViewModel> {
    public float LLJ;
    public float LLJI;
    public C481090Itn LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C736950SvV LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1559050qfn.class, "series_center_sub_page_key"), checkSupervisorPrepared());
    public final int LLJIJIL = 100;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 3;
        c20603715jn.LIZLLL = SeriesFooterCell.class;
        return c20603715jn;
    }

    public final C1559050qfn Lo() {
        return (C1559050qfn) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final SeriesCenteSubPageAssemViewModel Jo() {
        return (SeriesCenteSubPageAssemViewModel) this.LLJJ.getValue();
    }

    public SeriesCenteSubPageAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 973);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesCenterMainPageAssemViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(298);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((AbstractC738140SxQ) this, 976);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILLL = new C736950SvV(c19719912DlLIZ, awS568S0100000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_242, c451610HnL, c723700Sa8);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24(this, 978);
        this.LLJJ = new C736950SvV(C13LE.LIZ(SeriesCenteSubPageAssemViewModel.class), awS568S0100000_243, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(299), new AwS568S0100000_24((AbstractC738140SxQ) this, 977), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 972));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 971));
    }

    public final EnumC1573550r3B No() {
        C1559050qfn c1559050qfnLo = Lo();
        return Intrinsics.LJFF(c1559050qfnLo != null ? c1559050qfnLo.LL : null, "series_discover") ? EnumC1573550r3B.SERIES_DISCOVER : EnumC1573550r3B.SERIES_CENTER;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        final int iIntValue;
        EnumC481060Itk enumC481060Itk;
        EnumC19356710o9 enumC19356710o9;
        super.onViewCreated(view);
        this.LLJILJILJ = (C1749280vcc) view.findViewById(R.id.pza);
        if (No() == EnumC1573550r3B.SERIES_DISCOVER) {
            z = true;
        } else {
            z = false;
        }
        C481090Itn c481090Itn = (C481090Itn) view.findViewById(R.id.ur2);
        if (c481090Itn != null) {
            c481090Itn.setNestedScrollEnabledWhenNonTouch(false);
            if (z) {
                enumC481060Itk = EnumC481060Itk.REFRESH;
            } else {
                enumC481060Itk = EnumC481060Itk.NONE;
            }
            c481090Itn.setScrollMode(enumC481060Itk);
            if (z) {
                enumC19356710o9 = EnumC19356710o9.ALWAYS;
            } else {
                enumC19356710o9 = EnumC19356710o9.NONE;
            }
            c481090Itn.setOverScrollMode(enumC19356710o9);
            c481090Itn.setRubberBandCoefficient(0.35f);
            c481090Itn.setOnRefreshListener(new AwS425S0200000_24(c481090Itn, this, 37));
        } else {
            c481090Itn = null;
        }
        this.LLJILJIL = c481090Itn;
        ISeriesCenterConfigAppDiffProtocol.LIZ.getClass();
        Integer numValueOf = Integer.valueOf(ISeriesCenterConfigAppDiffProtocol.Companion.LIZIZ.getValue().getColumnCount());
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 3;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), iIntValue);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0r2f
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                if (i < this.LJ.Go().getState().LJIIIIZZ()) {
                    if (this.LJ.Go().getState().LJI(i) instanceof C048300Fl) {
                        return iIntValue;
                    }
                    return 1;
                }
                return iIntValue;
            }
        };
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(gridLayoutManager);
        Go().setItemAnimator(null);
        Go().setOnTouchListener(new ATListenerS456S0100000_24(this, 2));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILLL.getValue(), new C2217381BqS() { // from class: X.0r2g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1573270r2j) obj).LLILZ);
            }
        }, null, new AwS638S0100000_24(this, 72), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r2e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573210r2d c1573210r2d = (C1573210r2d) obj;
                c1573210r2d.getClass();
                return C627260Oiy.LIZLLL(c1573210r2d);
            }
        }, this, null, new AwS603S0100000_24(this, 215), new AwS568S0100000_24(this, 975), new AwS603S0100000_24(this, 216), 4, null);
        new RecyclerViewFirstDrawWatcher(Go(), new AwS568S0100000_24(this, 974)).LIZIZ();
    }
}
