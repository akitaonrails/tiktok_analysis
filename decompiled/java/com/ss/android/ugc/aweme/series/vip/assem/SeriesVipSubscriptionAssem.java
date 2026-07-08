package com.ss.android.ugc.aweme.series.vip.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0TVI;
import X.C1220000hqw;
import X.C13LE;
import X.C14K9;
import X.C1559070qfp;
import X.C1559260qg8;
import X.C1614710s7Z;
import X.C1620650sH9;
import X.C1749280vcc;
import X.C20097313kJ;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS30S0201000_24;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionAssem;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesVipSubscriptionAssem extends UIListContentAssem<SeriesVipSubscriptionViewModel> {
    public int LLIZLLLIL;
    public int LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1559070qfp.class, "vip_subscription_status_hierarchy_key"), checkSupervisorPrepared());
    public final C736950SvV LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 3;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1749280vcc No() {
        return (C1749280vcc) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final SeriesVipSubscriptionViewModel ip() {
        return (SeriesVipSubscriptionViewModel) this.LLJIJIL.getValue();
    }

    public SeriesVipSubscriptionAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1107);
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(SeriesVipSubscriptionViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(356), new AwS550S0100000_6((AbstractC738140SxQ) this, 599), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1106));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 598));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        int i;
        C1749280vcc c1749280vccNo;
        super.onViewCreated(view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LJJIJL().getContext(), 3);
        gridLayoutManager.LLIZ = new C1620650sH9(this, 2);
        Go().setLayoutManager(gridLayoutManager);
        int i2 = 0;
        Go().setClipToPadding(false);
        Go().setItemAnimator(null);
        View viewFindViewById = LJJIJL().getRootView().findViewById(R.id.vip_subscription_footer_container);
        final int paddingBottom = Go().getPaddingBottom();
        C14K9.LJIJJ(LJJIJL(), new C0TVI() { // from class: X.0s9E
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                this.LL.LLJ = c20246014Ju.LIZ(7).LIZLLL;
                SeriesVipSubscriptionAssem.Lo(this.LL, paddingBottom);
                return c20246014Ju;
            }
        });
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0s9G
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    int height = view2.getHeight();
                    SeriesVipSubscriptionAssem seriesVipSubscriptionAssem = this.LL;
                    if (height != seriesVipSubscriptionAssem.LLIZLLLIL) {
                        seriesVipSubscriptionAssem.LLIZLLLIL = height;
                        SeriesVipSubscriptionAssem.Lo(seriesVipSubscriptionAssem, paddingBottom);
                    }
                }
            });
        }
        C20097313kJ.LIZJ(LJJIJL());
        if (viewFindViewById != null) {
            HandlerHook.viewPost(viewFindViewById, new ARunnableS30S0201000_24(paddingBottom, viewFindViewById, this, 11));
        }
        List<InterfaceC1891350zJl> list = ((C1614710s7Z) Jo().getState()).LL.LLILZ;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewOnAttachStateChangeListenerC20604515jvGo);
        C1749280vcc c1749280vccNo2 = No();
        if (c1749280vccNo2 != null) {
            if (!(!z2)) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, c1749280vccNo2);
        }
        if (!z2 && (c1749280vccNo = No()) != null) {
            c1749280vccNo.LJ();
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0s9D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 92), 6);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0s9F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLJJI;
            }
        }, this, null, new AwS603S0100000_24(this, 273), new AwS568S0100000_24(this, 1105), new AwS603S0100000_24(this, 274), 4, null);
        if (!z2) {
            Jo().manualListRefresh();
        }
    }

    public static final void Lo(SeriesVipSubscriptionAssem seriesVipSubscriptionAssem, int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = seriesVipSubscriptionAssem.Go();
        viewOnAttachStateChangeListenerC20604515jvGo.setPadding(viewOnAttachStateChangeListenerC20604515jvGo.getPaddingLeft(), viewOnAttachStateChangeListenerC20604515jvGo.getPaddingTop(), viewOnAttachStateChangeListenerC20604515jvGo.getPaddingRight(), i + seriesVipSubscriptionAssem.LLIZLLLIL + seriesVipSubscriptionAssem.LLJ);
    }
}
