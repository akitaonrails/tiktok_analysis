package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.quantity;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C0H1U;
import X.C13LE;
import X.C1602160rnK;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C802103Bj;
import X.C814420VxA;
import X.C817803Hk;
import X.C928203k0;
import X.C939703lr;
import X.EnumC803803Ca;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USHalfQuantityCell extends ECPowerCell<C719102rN> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfQuantityCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b10;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.03Xy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 37), 6);
    }

    public USHalfQuantityCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 754);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(118);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 744), awS545S0100000_1, AFwS207S0000000_19.get$arr$(180), new AwS545S0100000_1((C03K6) this, 746), new AwS545S0100000_1((C03K6) this, 748), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 750), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1250), null, new AwS545S0100000_1((C03K6) this, 752));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 747);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 749);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 751);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 69));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1251);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1252);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1253);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1254);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1255);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 753), awS545S0100000_1, AFwS207S0000000_19.get$arr$(181), new AwS545S0100000_1((C03K6) this, 755), new AwS545S0100000_1((C03K6) this, 756), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 757), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1256), null, new AwS545S0100000_1((C03K6) this, 758));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 759), awS545S0100000_1, AFwS207S0000000_19.get$arr$(182), new AwS545S0100000_1((C03K6) this, 760), new AwS545S0100000_1((C03K6) this, 761), new AwS545S0100000_1((C03K6) this, 762), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 743));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 745));
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CombinedSkuOrderSubmitActivity combinedSkuOrderSubmitActivity;
        Integer num;
        C719102rN c719102rN = (C719102rN) interfaceC1891350zJl;
        super.onBindItemView(c719102rN);
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = L5().n;
        c928203k0.getClass();
        if (C928203k0.LJIILL(str)) {
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
            C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.us_half_order_submit_quantity_low_stock_tips);
        String str2 = c719102rN.LLJILJILJ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        C939703lr c939703lr = (C939703lr) this.itemView.findViewById(R.id.skt);
        int visibility = c939703lr.getVisibility();
        c939703lr.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c939703lr);
        String str4 = c719102rN.LLILZLL;
        if (str4 != null) {
            str3 = str4;
        }
        c939703lr.setSkuId(str3);
        Map<String, ? extends Object> mapLIZIZ = L5().LLLZLZ.LIZIZ(new C817803Hk("c3646.d8905", 0));
        Map<String, ? extends Object> mapLIZIZ2 = L5().LLLZLZ.LIZIZ(new C817803Hk("c3646.d091300", 0));
        c939703lr.LLIZLLLIL = mapLIZIZ;
        c939703lr.LLJ = mapLIZIZ2;
        c939703lr.LLJI = null;
        c939703lr.setQuantityLimit(c719102rN.LLJILJIL);
        c939703lr.LIZJ(c719102rN.LLJLL);
        c939703lr.setQuantity(c719102rN.LLIZ);
        c939703lr.setSku(c719102rN);
        Integer num2 = c719102rN.LLLLLZL;
        int value = EnumC803803Ca.UNAVAILABLE_OVERWEIGHT.getValue();
        if (num2 != null && num2.intValue() == value) {
            c939703lr.setAvailable(false);
        } else {
            c939703lr.setAvailable(true);
        }
        SkuCardStyleInfo skuCardStyleInfo = c719102rN.LLJJJIL;
        if (skuCardStyleInfo != null && (num = skuCardStyleInfo.skuCardStyleType) != null && num.intValue() == 2) {
            c939703lr.LIZLLL();
        }
        C802103Bj c802103Bj = (C802103Bj) this.LLJI.getValue();
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.us_half_order_submit_notice_text);
        c719102rN.LIZLLL();
        c802103Bj.LIZ(tuxTextView, c719102rN);
        c939703lr.setQuantityChangeListener(new AwS437S0200000_1(this, c719102rN, 34));
        c939703lr.setClickListener(new AwS580S0100000_1(this, 870));
        c939703lr.setKeyBoardHeightListener(new AwS437S0200000_1(c939703lr, this, 35));
        C19EG activity = getActivity();
        if ((activity instanceof CombinedSkuOrderSubmitActivity) && (combinedSkuOrderSubmitActivity = (CombinedSkuOrderSubmitActivity) activity) != null) {
            combinedSkuOrderSubmitActivity.LLIZ = new AwS580S0100000_1(c939703lr, 871);
        }
        if (Intrinsics.LJFF(c719102rN.LLJJJJ, Boolean.TRUE)) {
            ((C939703lr) this.itemView.findViewById(R.id.skt)).LJFF(false);
            ((C939703lr) this.itemView.findViewById(R.id.skt)).LJI(false);
        } else {
            ((C939703lr) this.itemView.findViewById(R.id.skt)).LJFF(true);
            ((C939703lr) this.itemView.findViewById(R.id.skt)).LJI(true);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b10, viewGroup, false);
    }
}
