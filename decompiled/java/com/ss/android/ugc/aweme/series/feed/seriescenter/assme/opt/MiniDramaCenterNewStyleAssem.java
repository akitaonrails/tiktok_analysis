package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C1319570kRX;
import X.C13LE;
import X.C1559190qg1;
import X.C1559260qg8;
import X.C1573780r3Y;
import X.C1574470r4f;
import X.C1578940rBs;
import X.C1620650sH9;
import X.C16GX;
import X.C1749280vcc;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1574490r4h;
import X.InterfaceC1324370kZH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS158S0100000_24;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption;
import com.ss.android.ugc.aweme.series.feed.profile.view.SeriesFooterCell;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS459S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaCenterNewStyleAssem extends UIListContentAssem<MiniDramaCenterNewStyleViewModel> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1559190qg1.class, "mini_drama_center_new_style_hierarchy_key"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 969));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 962));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 963));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 959));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 967));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 961));
    public boolean LLJJ;
    public final C736950SvV LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        c20603715jn.LIZLLL = SeriesFooterCell.class;
        return c20603715jn;
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final MiniDramaCenterNewStyleViewModel ip() {
        return (MiniDramaCenterNewStyleViewModel) this.LLJJI.getValue();
    }

    public MiniDramaCenterNewStyleAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 970);
        this.LLJJI = new C736950SvV(C13LE.LIZ(MiniDramaCenterNewStyleViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(297), new AwS568S0100000_24((AbstractC738140SxQ) this, 968), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 964));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 960));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZLLL(EnumC1574490r4h.SERIES_CENTER);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r3W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165920gRi) obj).LLILZ;
            }
        }, this, null, new AwS603S0100000_24(this, 209), new AwS568S0100000_24(this, 966), new AwS603S0100000_24(this, 210), 4, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r3Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165920gRi) obj).LLILZLL;
            }
        }, null, new AwS638S0100000_24(this, 71), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r3X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165920gRi) obj).LLILZIL;
            }
        }, null, new AwS459S0200000_24(this, view, 2), 6);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LJJIJL().getContext(), 3);
        gridLayoutManager.LLIZ = new C1620650sH9(this, 1);
        Go().setLayoutManager(gridLayoutManager);
        C1749280vcc c1749280vccLo = Lo();
        if (c1749280vccLo != null) {
            C786410Ut5.LJLLLLLL(0, c1749280vccLo);
            c1749280vccLo.LJ();
        }
        View view2 = (View) this.LLJI.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 38), view2);
        }
        C1319570kRX c1319570kRX = (C1319570kRX) this.LLJILJILJ.getValue();
        if (c1319570kRX != null) {
            c1319570kRX.setOnFirstScrollAfterExpand(new AwS568S0100000_24(this, 965));
        }
        C16GX c16gx = (C16GX) this.LLJILJIL.getValue();
        if (c16gx != null) {
            c16gx.LIZ(new InterfaceC1324370kZH() { // from class: X.0r3V
                @Override // X.InterfaceC1324380kZI
                public final void LLZZJLIL(C16GX c16gx2, int i) {
                    boolean z;
                    int i2 = 0;
                    if (c16gx2.getTotalScrollRange() + i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    View view3 = (View) this.LL.LLJI.getValue();
                    if (view3 != null) {
                        if (!z) {
                            i2 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i2, view3);
                    }
                }
            });
        }
    }

    public static void Oo(C1578940rBs c1578940rBs, int i, C1573780r3Y c1573780r3Y) {
        RecyclerView recyclerView;
        List<MiniDramaCenterFilterOption> list;
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        int left;
        int left2;
        int width;
        if (c1578940rBs != null && (recyclerView = c1578940rBs.getRecyclerView()) != null && (list = c1573780r3Y.LIZIZ) != null) {
            int size = list.size() - 1;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                if (((linearLayoutManager.findFirstVisibleItemPosition() != 0 && linearLayoutManager.findLastVisibleItemPosition() != size) || (i >= 3 && size - i >= 3 && linearLayoutManager != null)) && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i)) != null) {
                    Rect rect = new Rect();
                    viewFindViewByPosition.getGlobalVisibleRect(rect);
                    int i2 = rect.right - rect.left;
                    if (i2 > 0 && i2 < viewFindViewByPosition.getWidth()) {
                        if (viewFindViewByPosition.getLeft() > recyclerView.getWidth() / 2) {
                            left2 = viewFindViewByPosition.getLeft();
                            width = ((recyclerView.getWidth() - viewFindViewByPosition.getWidth()) / 2) + (viewFindViewByPosition.getWidth() - i2);
                        } else {
                            left2 = viewFindViewByPosition.getLeft();
                            width = ((recyclerView.getWidth() - viewFindViewByPosition.getWidth()) / 2) - (viewFindViewByPosition.getWidth() - i2);
                        }
                        left = left2 - width;
                    } else {
                        left = viewFindViewByPosition.getLeft() - ((recyclerView.getWidth() - viewFindViewByPosition.getWidth()) / 2);
                    }
                    recyclerView.smoothScrollBy(left, 0);
                }
            }
        }
    }
}
