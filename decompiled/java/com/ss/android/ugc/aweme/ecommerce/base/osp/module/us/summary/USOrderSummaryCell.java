package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C039Q;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C09R3;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C714302qb;
import X.C722302rt;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C755502xF;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OrderSummaryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USOrderSummaryCell extends ECPowerCell<C755502xF> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public C039Q LLJIJIL;
    public volatile boolean LLJILJIL;
    public TuxIconView LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USOrderSummaryCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USOrderSummaryCell.class, "summaryVM", "getSummaryVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OrderSummaryViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public USOrderSummaryCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 694);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(110);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 685), awS545S0100000_1, AFwS207S0000000_19.get$arr$(168), new AwS545S0100000_1((C03K6) this, 678), new AwS545S0100000_1((C03K6) this, 686), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 688), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1232), null, new AwS545S0100000_1((C03K6) this, 691));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 674);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 676);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 679);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 65));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1227);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1229);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1230);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1231);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1233);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 692), awS545S0100000_1, AFwS207S0000000_19.get$arr$(173), new AwS545S0100000_1((C03K6) this, 695), new AwS545S0100000_1((C03K6) this, 697), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 654), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1223), null, new AwS545S0100000_1((C03K6) this, 655));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 656), awS545S0100000_1, AFwS207S0000000_19.get$arr$(169), new AwS545S0100000_1((C03K6) this, 659), new AwS545S0100000_1((C03K6) this, 660), new AwS545S0100000_1((C03K6) this, 663), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 666));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OrderSummaryViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 668);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(111);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 673), awS545S0100000_15, AFwS207S0000000_19.get$arr$(172), new AwS545S0100000_1((C03K6) this, 677), new AwS545S0100000_1((C03K6) this, 680), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 682), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1228), null, new AwS545S0100000_1((C03K6) this, 687));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 689);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 690);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 693);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 66));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1234);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1235);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1222);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1224);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1225);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 658), awS545S0100000_15, AFwS207S0000000_19.get$arr$(170), new AwS545S0100000_1((C03K6) this, 661), new AwS545S0100000_1((C03K6) this, 662), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 664), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1226), null, new AwS545S0100000_1((C03K6) this, 669));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 671), awS545S0100000_15, AFwS207S0000000_19.get$arr$(171), new AwS545S0100000_1((C03K6) this, 675), new AwS545S0100000_1((C03K6) this, 681), new AwS545S0100000_1((C03K6) this, 683), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 684));
        }
        this.LLJI = assemVMLazy2;
        new LinkedList();
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 670));
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 672));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 667));
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 665));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 657));
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("order_summary", this.itemView);
        }
        ModuleManager moduleManager2 = N5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "order_summary");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        L5(null);
    }

    public final void L5(C755502xF c755502xF) {
        BillStarling billStarling;
        BillStarlingText billStarlingText;
        String str;
        if (!this.LL) {
            this.LL = true;
            View view = this.itemView;
            P5(view, null);
            BillInfoData billInfoData = N5().LLJJI;
            if (billInfoData != null && (billStarling = billInfoData.starlingTexts) != null && (billStarlingText = billStarling.orderSummaryTitle) != null && (str = billStarlingText.text) != null) {
                ((TextView) view.findViewById(R.id.us_order_submit_order_summary_module_name)).setText(str);
            }
            C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.03HN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLILLL;
                }
            }, null, new AwS437S0200000_1(this, c755502xF, 13), 6);
        }
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.03HO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILLL;
            }
        }, null, new AwS437S0200000_1(this, c755502xF, 14), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0257  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r25) {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.b2g, viewGroup, false);
        viewLIZJ.setTag("us_order_summary_item_view");
        return viewLIZJ;
    }

    public final void P5(View view, C755502xF c755502xF) {
        List<C714302qb> list;
        C722302rt c722302rt;
        if (this.LLJIJIL == null) {
            if (c755502xF != null && (c722302rt = c755502xF.LLILZLL) != null) {
                list = c722302rt.LLILZLL;
            } else {
                list = null;
            }
            this.LLJIJIL = new C039Q(this, c755502xF, list);
            ((RecyclerView) view.findViewById(R.id.us_order_submit_order_summary_items)).setLayoutManager(new LinearLayoutManager(view.getContext()));
            ((RecyclerView) view.findViewById(R.id.us_order_submit_order_summary_items)).setAdapter(this.LLJIJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(android.view.View r22, X.C755502xF r23, X.C722302rt r24) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell.R5(android.view.View, X.02xF, X.02rt):void");
    }
}
