package com.ss.android.ugc.aweme.tako.botpage.components.botcenter;

import X.AbstractC738140SxQ;
import X.C1203130hPj;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1582480rHa;
import X.C20237414Gm;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC1203170hPn;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS122S0101000_14;
import kotlin.jvm.internal.AwS459S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoBotCenterItemsAssem extends UISlotAssem {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(TakoBotCenterViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(435), new AwS568S0100000_24((AbstractC738140SxQ) this, 1269), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C20237414Gm.class, null), checkSupervisorPrepared());
    public StaggeredGridLayoutManager LLJJIJI;
    public GridLayoutManager LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fk3;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1203130hPj c1203130hPj = (C1203130hPj) view.findViewById(R.id.c_a);
        c1203130hPj.setSelectionStyle(new C1582480rHa(null, null, null, null));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.c_3);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(BotCenterCell.class);
        this.LLJJIJI = new StaggeredGridLayoutManager(2, 1);
        this.LLJJIJIIJIL = new GridLayoutManager(getContext(), 2);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(this.LLJJIJI);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0r7f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1576320r7e) obj).LL;
            }
        }, null, new AwS641S0100000_27(c1203130hPj, 48), 6);
        c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0rFu
            @Override // X.InterfaceC1203170hPn
            public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                if (z) {
                    TakoBotCenterViewModel takoBotCenterViewModel = (TakoBotCenterViewModel) this.LIZ.LLJJI.getValue();
                    takoBotCenterViewModel.setState(new AwS122S0101000_14(takoBotCenterViewModel, i, 4));
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0r7g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1576320r7e) obj).LLILZIL;
            }
        }, null, new AwS459S0200000_24(viewOnAttachStateChangeListenerC20604515jv, this, 5), 6);
    }
}
