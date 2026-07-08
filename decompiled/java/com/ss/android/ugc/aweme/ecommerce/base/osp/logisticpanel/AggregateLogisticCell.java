package com.ss.android.ugc.aweme.ecommerce.base.osp.logisticpanel;

import X.AnonymousClass0483;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03A6;
import X.C03IJ;
import X.C03J4;
import X.C03J5;
import X.C03JC;
import X.C03JF;
import X.C03K6;
import X.C049Y;
import X.C13LE;
import X.C13LP;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C21588819eI;
import X.C21588919eJ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C703302op;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
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
public final class AggregateLogisticCell extends ECPowerCell<C03J4> implements C03JF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public C03JC LLJI;
    public C03A6 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregateLogisticCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/logisticpanel/AggregateLogisticPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregateLogisticCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AggregateLogisticPanelViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 591);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(39);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 576), awS577S0100000_33, AFwS224S0000000_33.get$arr$(104), new AwS577S0100000_33((C03K6) this, 577), new AwS577S0100000_33((C03K6) this, 579), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 581), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 583), null, new AwS577S0100000_33((C03K6) this, 584));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 578);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 580);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 582);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 21));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 585);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 586);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 587);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 588);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 589);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 590), awS577S0100000_33, AFwS224S0000000_33.get$arr$(105), new AwS577S0100000_33((C03K6) this, 592), new AwS577S0100000_33((C03K6) this, 593), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 594), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 595), null, new AwS577S0100000_33((C03K6) this, 596));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 597), awS577S0100000_33, AFwS224S0000000_33.get$arr$(106), new AwS577S0100000_33((C03K6) this, 598), new AwS577S0100000_33((C03K6) this, 599), new AwS577S0100000_33((C03K6) this, 600), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 601));
        }
        this.LLJ = assemVMLazy;
    }

    public final void L5() {
        View view = this.itemView;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.alb);
        if ((recyclerView != null ? recyclerView.getAdapter() : null) == null) {
            this.LLJIJIL = new C03A6();
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.alb);
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            }
            RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.alb);
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(new C819503Ib(0, 8));
            }
            RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.alb);
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(this.LLJIJIL);
            }
            RecyclerView recyclerView5 = (RecyclerView) view.findViewById(R.id.alb);
            if (recyclerView5 != null) {
                recyclerView5.setItemAnimator(null);
            }
        }
        RecyclerView recyclerView6 = (RecyclerView) view.findViewById(R.id.al0);
        if (recyclerView6 == null || recyclerView6.getAdapter() == null) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            assemVMLazy.getValue();
            this.LLJI = new C03JC(this);
            RecyclerView recyclerView7 = (RecyclerView) view.findViewById(R.id.al0);
            if (recyclerView7 != null) {
                recyclerView7.setLayoutManager(new LinearLayoutManager(view.getContext()));
            }
            RecyclerView recyclerView8 = (RecyclerView) view.findViewById(R.id.al0);
            if (recyclerView8 != null) {
                recyclerView8.addItemDecoration(new C21588819eI(view.getContext(), new C21588919eJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), R.attr.a02, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)))));
            }
            RecyclerView recyclerView9 = (RecyclerView) view.findViewById(R.id.al0);
            if (recyclerView9 != null) {
                recyclerView9.setAdapter(this.LLJI);
            }
            RecyclerView recyclerView10 = (RecyclerView) view.findViewById(R.id.al0);
            if (recyclerView10 != null) {
                recyclerView10.setItemAnimator(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        L5();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C03J4 c03j4 = (C03J4) interfaceC1891350zJl;
        L5();
        View view = this.itemView;
        C03JC c03jc = this.LLJI;
        if (c03jc != null) {
            c03jc.LLLI(c03j4.LL);
        }
        if (!c03j4.LLILLJJLI.isEmpty()) {
            C03A6 c03a6 = this.LLJIJIL;
            if (c03a6 != null) {
                c03a6.LLLI(c03j4.LLILLJJLI);
                return;
            }
            return;
        }
        View viewFindViewById = view.findViewById(R.id.alb);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.alj);
        if (viewFindViewById2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.apd, viewGroup, false);
    }

    @Override // X.C03JF
    public final void X1(int i, View view, String str) {
        List<T> list;
        C03J5 c03j5;
        LogisticsDescription logisticsDescription;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo;
        C03JC c03jc = this.LLJI;
        if (c03jc == null || (list = c03jc.LL.LJFF) == 0 || (c03j5 = (C03J5) C13LP.LJJJLZIJ(i, list)) == null || view == null || c03j5.LJII) {
            return;
        }
        if (C703302op.LIZ(str)) {
            C1748720vbi.LIZLLL(view, new C049Y(), new AwS367S0200000_1(c03j5, this, 50));
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
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
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILJIL;
        ((AggregateLogisticPanelViewModel) assemVMLazy2.getValue()).xQ2(c03j5);
        C1748720vbi.LIZLLL(view, new AnonymousClass0483(), new AwS580S0100000_1(c03j5, 436));
    }
}
