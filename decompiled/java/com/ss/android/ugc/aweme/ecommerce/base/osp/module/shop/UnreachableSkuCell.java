package com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C038O;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C0H1U;
import X.C0H9H;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1766800w4s;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C631470Opl;
import X.C720302rZ;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1334360kpO;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;
import qla.a;

/* JADX INFO: loaded from: classes27.dex */
public final class UnreachableSkuCell extends ECPowerCell<PackedSku> implements c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UnreachableSkuCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // p8b.c
    public final String getViewName() {
        return "UnreachableSku";
    }

    public UnreachableSkuCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 348);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(202);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 359), awS570S0100000_26, AFwS215S0000000_26.get$arr$(103), new AwS570S0100000_26((C03K6) this, 334), new AwS570S0100000_26((C03K6) this, 336), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 338), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 340), null, new AwS570S0100000_26((C03K6) this, 341));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 335);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 337);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 339);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 21));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 342);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 343);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 344);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 345);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 346);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 347), awS570S0100000_26, AFwS215S0000000_26.get$arr$(104), new AwS570S0100000_26((C03K6) this, 349), new AwS570S0100000_26((C03K6) this, 350), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 351), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 352), null, new AwS570S0100000_26((C03K6) this, 353));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 354), awS570S0100000_26, AFwS215S0000000_26.get$arr$(105), new AwS570S0100000_26((C03K6) this, 355), new AwS570S0100000_26((C03K6) this, 356), new AwS570S0100000_26((C03K6) this, 357), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 358));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 333));
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String priceStr;
        Price price;
        boolean z;
        String strLIZIZ;
        BillInfoSetting billInfoSetting;
        MainOrderSetting mainOrderSetting;
        Integer num;
        String str;
        BillInfoSetting billInfoSetting2;
        Integer num2;
        Price price2;
        C03IT imageUrlModel;
        HashMap<String, Object> map;
        PackedSku packedSku = (PackedSku) interfaceC1891350zJl;
        Image image = packedSku.image;
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            C03O0.LIZ.getClass();
            C03O0.LJJIFFI = SystemClock.elapsedRealtime();
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LIZLLL.LIZLLL("product_image_tag");
            c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.ry0));
            C786410Ut5.h3(c1331670kl3LIZLLL);
            if (L5().LL == 0 && (map = L5().LLLIL) != null) {
                C03O0.LJIIJ(!imageUrlModel.LIZ() ? 1 : 0, map);
            }
        }
        a aVar = (a) this.LLJI.getValue();
        if (aVar != null) {
            this.itemView.findViewById(R.id.ry0).getLayoutParams().height = aVar.LJJIJIL();
            this.itemView.findViewById(R.id.ry0).getLayoutParams().width = aVar.LJJIJIL();
            this.itemView.findViewById(R.id.kh0).getLayoutParams().width = aVar.LJJIJIL();
            this.itemView.findViewById(R.id.kh0).getLayoutParams().height = aVar.LJJIJIL();
            this.itemView.findViewById(R.id.unreachable_layout).getLayoutParams().height = aVar.LJLILLLLZI();
        }
        ((C1766800w4s) this.itemView.findViewById(R.id.rzz)).LJJJJL(packedSku.productName, packedSku.promotionLogos);
        ((TextView) this.itemView.findViewById(R.id.rzm)).setText(packedSku.salePropsStr);
        TextView textView = (TextView) this.itemView.findViewById(R.id.rst);
        SkuPrice skuPrice = packedSku.price;
        String str2 = null;
        if (skuPrice != null && (price2 = skuPrice.realPrice) != null) {
            priceStr = price2.getPriceStr();
        } else {
            priceStr = null;
        }
        SkuPrice skuPrice2 = packedSku.price;
        if (skuPrice2 != null) {
            price = skuPrice2.realPrice;
            str2 = skuPrice2.realPriceDecimal;
        } else {
            price = null;
        }
        BillInfoData billInfoData = L5().LLJJI;
        if (billInfoData != null && (billInfoSetting2 = billInfoData.settings) != null && (num2 = billInfoSetting2.totalPriceStyle) != null && num2.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        textView.setText(C038O.LIZ(priceStr, price, str2, z));
        C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.unavailable_text), packedSku.unavailableText, true);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.l37);
        if (C426750GoL.LIZLLL(this.itemView.getContext())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C720302rZ.LIZLLL(packedSku));
            sbLIZ.append('x');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('x');
            sbLIZ2.append(C720302rZ.LIZLLL(packedSku));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        textView2.setText(strLIZIZ);
        if (packedSku.LIZIZ()) {
            SkuCardStyleInfo skuCardStyleInfo = packedSku.skuCardStyleInfo;
            if (skuCardStyleInfo != null && (str = skuCardStyleInfo.titleLightText) != null) {
                TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.whj);
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                View viewFindViewById = this.itemView.findViewById(R.id.rzz);
                if (viewFindViewById != null) {
                    C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), viewFindViewById);
                }
                TextView textView3 = (TextView) this.itemView.findViewById(R.id.whj);
                if (textView3 != null) {
                    textView3.setText(str);
                }
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.whj);
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
            }
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.whj);
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        BillInfoData billInfoData2 = L5().LLJJI;
        if (billInfoData2 != null && (billInfoSetting = billInfoData2.settings) != null && (mainOrderSetting = billInfoSetting.mainOrderSetting) != null && (num = mainOrderSetting.skuCardStyle) != null && num.intValue() == 2) {
            this.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
            View viewFindViewById2 = this.itemView.findViewById(R.id.ry0);
            viewFindViewById2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            viewFindViewById2.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            viewFindViewById2.getBackground();
            C631470Opl.LIZ(viewFindViewById2, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            View viewFindViewById3 = this.itemView.findViewById(R.id.kh0);
            viewFindViewById3.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            viewFindViewById3.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            viewFindViewById3.getBackground();
            C631470Opl.LIZ(viewFindViewById3, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            View viewFindViewById4 = this.itemView.findViewById(R.id.unreachable_layout);
            viewFindViewById4.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), viewFindViewById4);
            TuxTextView tuxTextView4 = (TuxTextView) this.itemView.findViewById(R.id.rzz);
            tuxTextView4.setTuxFont(61);
            tuxTextView4.setTextColorRes(R.attr.a1k);
            TuxTextView tuxTextView5 = (TuxTextView) this.itemView.findViewById(R.id.rzm);
            tuxTextView5.setTuxFont(61);
            tuxTextView5.setTextColorRes(R.attr.a1k);
            TuxTextView tuxTextView6 = (TuxTextView) this.itemView.findViewById(R.id.rst);
            tuxTextView6.setTuxFont(62);
            tuxTextView6.setTextColorRes(R.attr.a1k);
            ((TuxTextView) this.itemView.findViewById(R.id.unavailable_text)).setTuxFont(92);
            TuxTextView tuxTextView7 = (TuxTextView) this.itemView.findViewById(R.id.l37);
            tuxTextView7.setTuxFont(61);
            tuxTextView7.setTextColorRes(R.attr.a1k);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b01, viewGroup, false);
    }
}
