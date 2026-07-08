package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03AJ;
import X.C03DZ;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C049K;
import X.C049X;
import X.C0H9H;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1748720vbi;
import X.C1766800w4s;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C719002rM;
import X.C719102rN;
import X.C720302rZ;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C801903Bh;
import X.C939603lq;
import X.C960203pA;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.USPackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USUnreachableSkuCell extends ECPowerCell<USPackedSku> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USUnreachableSkuCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USUnreachableSkuCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 712);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(116);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 722), awS545S0100000_1, AFwS207S0000000_19.get$arr$(174), new AwS545S0100000_1((C03K6) this, 704), new AwS545S0100000_1((C03K6) this, 706), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 708), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1236), null, new AwS545S0100000_1((C03K6) this, 710));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 705);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 707);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 709);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 67));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1237);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1238);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1239);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1240);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1241);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 711), awS545S0100000_1, AFwS207S0000000_19.get$arr$(175), new AwS545S0100000_1((C03K6) this, 713), new AwS545S0100000_1((C03K6) this, 714), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 715), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1242), null, new AwS545S0100000_1((C03K6) this, 716));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 717), awS545S0100000_1, AFwS207S0000000_19.get$arr$(176), new AwS545S0100000_1((C03K6) this, 718), new AwS545S0100000_1((C03K6) this, 719), new AwS545S0100000_1((C03K6) this, 720), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 721));
        }
        this.LLJ = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 703));
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CharSequence priceStr;
        boolean zLJFF;
        String strLIZIZ;
        SkuCardStyleInfo skuCardStyleInfo;
        String str;
        Price price;
        C03IT imageUrlModel;
        HashMap<String, Object> map;
        USPackedSku uSPackedSku = (USPackedSku) interfaceC1891350zJl;
        C719102rN c719102rNLIZ = C719002rM.LIZ(uSPackedSku.getOriginPackedSku());
        C1748720vbi.LJFF(this.itemView.findViewById(R.id.us_unreachable_counter), new C049K(), new AwS545S0100000_1(c719102rNLIZ, 1658), new AwS580S0100000_1(c719102rNLIZ, 778));
        Image image = uSPackedSku.getOriginPackedSku().image;
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            C03O0.LIZ.getClass();
            C03O0.LJJIFFI = SystemClock.elapsedRealtime();
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LIZLLL.LIZLLL("product_image_tag");
            c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.ry0));
            C786410Ut5.h3(c1331670kl3LIZLLL);
            if ((L5().LL == 0 || L5().LL == 2) && (map = L5().LLLIL) != null) {
                C03O0.LJIIJ(!imageUrlModel.LIZ() ? 1 : 0, map);
            }
        }
        ((C1766800w4s) this.itemView.findViewById(R.id.rzz)).LJJJJL(uSPackedSku.getOriginPackedSku().productName, uSPackedSku.getOriginPackedSku().promotionLogos);
        ((TextView) this.itemView.findViewById(R.id.rzm)).setText(uSPackedSku.getOriginPackedSku().salePropsStr);
        TextView textView = (TextView) this.itemView.findViewById(R.id.rst);
        SkuPrice skuPrice = uSPackedSku.getOriginPackedSku().price;
        if (skuPrice != null && (price = skuPrice.realPrice) != null) {
            priceStr = price.getPriceStr();
        } else {
            priceStr = null;
        }
        textView.setText(priceStr);
        C719102rN c719102rNLIZ2 = C719002rM.LIZ(uSPackedSku.getOriginPackedSku());
        ((C801903Bh) this.LLJIJIL.getValue()).LIZ((TuxTextView) this.itemView.findViewById(R.id.us_unreachable_notice_text), c719102rNLIZ2, c719102rNLIZ2.LIZLLL(), null, null);
        QuantityControlInfo quantityControlInfo = uSPackedSku.getOriginPackedSku().quantityControlInfo;
        boolean z = false;
        if (quantityControlInfo != null) {
            zLJFF = Intrinsics.LJFF(quantityControlInfo.quantityEditable, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            PackedSku originPackedSku = uSPackedSku.getOriginPackedSku();
            View viewFindViewById = this.itemView.findViewById(R.id.l37);
            if (viewFindViewById != null) {
                C03DZ.LIZ(viewFindViewById);
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.us_unreachable_notice_text);
            C939603lq c939603lq = (C939603lq) this.itemView.findViewById(R.id.us_unreachable_counter);
            if (c939603lq != null) {
                C03DZ.LIZJ(c939603lq);
                C719102rN c719102rNLIZ3 = C719002rM.LIZ(originPackedSku);
                HashMap<String, Object> mapHi1 = L5().hi1(false);
                if (!this.LLJI) {
                    this.LLJI = true;
                    C1748720vbi.LIZLLL(c939603lq, new C049X(), new AwS367S0200000_1(c719102rNLIZ3, (C719102rN) mapHi1, (HashMap<String, Object>) 280));
                    C1748720vbi.LIZLLL(c939603lq, new C049X(), new AwS367S0200000_1(c719102rNLIZ3, (C719102rN) mapHi1, (HashMap<String, Object>) 281));
                }
                String str2 = c719102rNLIZ3.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                c939603lq.setSkuId(str2);
                c939603lq.setExtraInfo(mapHi1);
                c939603lq.setQuantityLimit(c719102rNLIZ3.LLJILJIL);
                c939603lq.setQuantity(c719102rNLIZ3.LLIZ);
                c939603lq.setSku(c719102rNLIZ3);
                c939603lq.setCounterStyle(true);
                if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0) {
                    z = true;
                }
                c939603lq.setCounterBg(z);
                c939603lq.setQuantityChangeListener(new AwS437S0200000_1(this, originPackedSku, 29));
                c939603lq.setClickListener(new AwS580S0100000_1(this, 779));
            }
            ((ConstraintLayout) this.itemView.findViewById(R.id.ry6)).setMinHeight(C0H9H.LIZIZ(53));
        } else {
            View viewFindViewById3 = this.itemView.findViewById(R.id.l37);
            if (viewFindViewById3 != null) {
                C03DZ.LIZJ(viewFindViewById3);
            }
            View viewFindViewById4 = this.itemView.findViewById(R.id.us_unreachable_counter);
            if (viewFindViewById4 != null) {
                C03DZ.LIZ(viewFindViewById4);
            }
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.l37);
            if (textView2 != null) {
                if (C426750GoL.LIZLLL(this.itemView.getContext())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C720302rZ.LIZLLL(uSPackedSku.getOriginPackedSku()));
                    sbLIZ.append(" x");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("x ");
                    sbLIZ2.append(C720302rZ.LIZLLL(uSPackedSku.getOriginPackedSku()));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                textView2.setText(strLIZIZ);
            }
            ((ConstraintLayout) this.itemView.findViewById(R.id.ry6)).setMinHeight(C0H9H.LIZIZ(85));
        }
        if (uSPackedSku.getOriginPackedSku().LIZIZ()) {
            Context context = this.itemView.getContext();
            if (context != null && (skuCardStyleInfo = uSPackedSku.getOriginPackedSku().skuCardStyleInfo) != null && (str = skuCardStyleInfo.titleLightText) != null) {
                View viewFindViewById5 = this.itemView.findViewById(R.id.rst);
                if (viewFindViewById5 != null) {
                    C03DZ.LIZIZ(viewFindViewById5);
                }
                View viewFindViewById6 = this.itemView.findViewById(R.id.j0j);
                if (viewFindViewById6 != null) {
                    C03DZ.LIZJ(viewFindViewById6);
                }
                C03AJ c03aj = (C03AJ) this.itemView.findViewById(R.id.j0j);
                if (c03aj != null) {
                    new AwS52S1000000_1(str, 39).invoke(c03aj.getUsLabelContentFromXml());
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZLLL = Integer.valueOf(C0H9H.LIZIZ(1));
                    c384050F3z.LJ = Integer.valueOf(C960203pA.LIZ(R.attr.a04, context));
                    c03aj.setBackground(c384050F3z.LIZ(context));
                    return;
                }
                return;
            }
            return;
        }
        View viewFindViewById7 = this.itemView.findViewById(R.id.rst);
        if (viewFindViewById7 != null) {
            C03DZ.LIZJ(viewFindViewById7);
        }
        View viewFindViewById8 = this.itemView.findViewById(R.id.j0j);
        if (viewFindViewById8 == null) {
            return;
        }
        C03DZ.LIZ(viewFindViewById8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b3g, viewGroup, false);
    }
}
