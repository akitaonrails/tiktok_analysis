package com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel;

import X.AnonymousClass0483;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03A6;
import X.C03IJ;
import X.C03J3;
import X.C03J5;
import X.C03J8;
import X.C03JB;
import X.C03JF;
import X.C03K6;
import X.C049Y;
import X.C13LE;
import X.C13LP;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C703302op;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C819503Ib;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AggregateLogisticMXCell extends ECPowerCell<C03J3> implements C03JF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C03JB LLJILJIL;
    public C03A6 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregateLogisticMXCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/logisticpanel/AggregateLogisticPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregateLogisticMXCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AggregateLogisticPanelViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 620);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(40);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 604), awS577S0100000_33, AFwS224S0000000_33.get$arr$(107), new AwS577S0100000_33((C03K6) this, 606), new AwS577S0100000_33((C03K6) this, 608), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 610), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 612), null, new AwS577S0100000_33((C03K6) this, 613));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 607);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 609);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 611);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 22));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 614);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 615);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 616);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 617);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 618);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 619), awS577S0100000_33, AFwS224S0000000_33.get$arr$(108), new AwS577S0100000_33((C03K6) this, 621), new AwS577S0100000_33((C03K6) this, 622), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 623), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 624), null, new AwS577S0100000_33((C03K6) this, 625));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 626), awS577S0100000_33, AFwS224S0000000_33.get$arr$(109), new AwS577S0100000_33((C03K6) this, 627), new AwS577S0100000_33((C03K6) this, 628), new AwS577S0100000_33((C03K6) this, 629), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 602));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 603));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 605));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        View view = this.itemView;
        if (((RecyclerView) this.LLJIJIL.getValue()).getAdapter() == null) {
            this.LLJILJILJ = new C03A6();
            ((RecyclerView) this.LLJIJIL.getValue()).setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            ((RecyclerView) this.LLJIJIL.getValue()).addItemDecoration(new C819503Ib(0, 8));
            ((RecyclerView) this.LLJIJIL.getValue()).setAdapter(this.LLJILJILJ);
            ((RecyclerView) this.LLJIJIL.getValue()).setItemAnimator(null);
        }
        if (((RecyclerView) this.LLJI.getValue()).getAdapter() == null) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
            assemVMLazy.getValue();
            this.LLJILJIL = new C03JB(this);
            ((RecyclerView) this.LLJI.getValue()).setLayoutManager(new LinearLayoutManager(view.getContext()));
            ((RecyclerView) this.LLJI.getValue()).setAdapter(this.LLJILJIL);
            ((RecyclerView) this.LLJI.getValue()).setItemAnimator(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C03J3 c03j3 = (C03J3) interfaceC1891350zJl;
        View view = this.itemView;
        boolean z = true;
        if (getLayoutPosition() == getItemCount() - 1) {
            z = false;
        }
        C03J8.LIZ(view, z);
        C03JB c03jb = this.LLJILJIL;
        if (c03jb != null) {
            c03jb.LLLI(c03j3.LL);
        }
        C03A6 c03a6 = this.LLJILJILJ;
        if (c03a6 != null) {
            c03a6.LLLI(c03j3.LLILLJJLI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aph, viewGroup, false);
    }

    @Override // X.C03JF
    public final void X1(int i, View view, String str) {
        List<T> list;
        C03J5 c03j5;
        LogisticsDescription logisticsDescription;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo;
        C03JB c03jb = this.LLJILJIL;
        if (c03jb == null || (list = c03jb.LL.LJFF) == 0 || (c03j5 = (C03J5) C13LP.LJJJLZIJ(i, list)) == null || view == null) {
            return;
        }
        if (C703302op.LIZ(str)) {
            C1748720vbi.LIZLLL(view, new C049Y(), new AwS367S0200000_1(c03j5, this, 51));
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
            assemVMLazy.getValue();
            LogisticExpressionArea logisticExpressionArea = c03j5.LIZ;
            if (logisticExpressionArea != null && (logisticsExpressionAreaExtraInfo = logisticExpressionArea.extraInfo) != null) {
                logisticsDescription = logisticsExpressionAreaExtraInfo.popUpInfo;
            } else {
                logisticsDescription = null;
            }
            AggregateLogisticPanelViewModel.wQ2(view, str, logisticsDescription, c03j5.LIZIZ);
            return;
        }
        if (c03j5.LIZJ) {
            return;
        }
        AssemVMLazy assemVMLazy2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILLL;
        ((AggregateLogisticPanelViewModel) assemVMLazy2.getValue()).xQ2(c03j5);
        C1748720vbi.LIZLLL(view, new AnonymousClass0483(), new AwS580S0100000_1(c03j5, 441));
    }
}
