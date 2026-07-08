package com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C09R3;
import X.C0H1U;
import X.C0H9H;
import X.C12ES;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C19MB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C452080Ho6;
import X.C452501pT;
import X.C5182020e;
import X.C737910Sx3;
import X.C7812033i;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class UnreachableHeadCell extends ECPowerCell<C7812033i> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UnreachableHeadCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(UnreachableHeadCell.class, "vm", "<v#0>", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217401BqU};
    }

    public UnreachableHeadCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1225);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(63);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1236), awS577S0100000_33, AFwS224S0000000_33.get$arr$(178), new AwS577S0100000_33((C03K6) this, 1211), new AwS577S0100000_33((C03K6) this, 1213), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1215), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1217), null, new AwS577S0100000_33((C03K6) this, 1218));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1212);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1214);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1216);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 45));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1219);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1220);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1221);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1222);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1223);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1224), awS577S0100000_33, AFwS224S0000000_33.get$arr$(176), new AwS577S0100000_33((C03K6) this, 1226), new AwS577S0100000_33((C03K6) this, 1227), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1228), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1229), null, new AwS577S0100000_33((C03K6) this, 1230));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1231), awS577S0100000_33, AFwS224S0000000_33.get$arr$(177), new AwS577S0100000_33((C03K6) this, 1232), new AwS577S0100000_33((C03K6) this, 1233), new AwS577S0100000_33((C03K6) this, 1234), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1235));
        }
        this.LLJ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AssemVMLazy assemVMLazy;
        BillInfoSetting billInfoSetting;
        MainOrderSetting mainOrderSetting;
        Integer num;
        C03IT thumbFirstImageUrlModel;
        C7812033i c7812033i = (C7812033i) interfaceC1891350zJl;
        if (c7812033i.LL) {
            ((TextView) this.itemView.findViewById(R.id.title)).setText(this.itemView.getContext().getResources().getQuantityString(2131755291, c7812033i.LLILLL));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.title));
            C03DZ.LIZ(this.itemView.findViewById(R.id.fyx));
        } else {
            C03DZ.LIZ(this.itemView.findViewById(R.id.title));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.fyx));
        }
        if (c7812033i.LLILZ) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.v73));
            Image image = c7812033i.LLILZIL;
            if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.v6r));
                C786410Ut5.h3(c1331670kl3LIZLLL);
                ((ImageView) this.itemView.findViewById(R.id.v6r)).setColorFilter(134217728);
            }
            C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.v78), c7812033i.LLILZLL, true);
        } else {
            C03DZ.LIZ(this.itemView.findViewById(R.id.v73));
        }
        C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.desc), c7812033i.LLILLJJLI, true);
        AssemVMLazy assemVMLazy2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        BillInfoData billInfoData = ((OrderSubmitAssemViewModel) assemVMLazy2.getValue()).LLJJI;
        if (billInfoData != null && (billInfoSetting = billInfoData.settings) != null && (mainOrderSetting = billInfoSetting.mainOrderSetting) != null && (num = mainOrderSetting.skuCardStyle) != null && num.intValue() == 2) {
            C19MB c19mb = new C19MB();
            c19mb.LJII((ConstraintLayout) this.itemView);
            c19mb.LJJIIJZLJL(R.id.title, 3, C0H9H.LIZIZ(12));
            c19mb.LJJIIJZLJL(R.id.desc, 3, C0H9H.LIZIZ(4));
            c19mb.LIZIZ((ConstraintLayout) this.itemView);
            ((TuxTextView) this.itemView.findViewById(R.id.title)).setTuxFont(52);
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.desc);
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setTuxFont(71);
        }
        if (!this.LLJI) {
            this.LLJI = true;
            Object obj = C01D1.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 624);
            AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(432);
            if (Intrinsics.LJFF(obj, obj)) {
                assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 4173), c5182020e, AFwS224S0000000_33.get$arr$(647), new AwS563S0100000_19((C03K6) this, 3383), new AwS550S0100000_6((C03K6) this, 1595), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 4176), aFwS279S0000000_33, new AwS550S0100000_6((C03K6) this, 1596), null, new AwS550S0100000_6((C03K6) this, 1579));
            } else if (obj instanceof InterfaceC451590HnJ) {
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((C03K6) this, 814);
                AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 4174);
                AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c19719912DlLIZ, 4175);
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS551S0100000_7, 133));
                AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 3368);
                AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 3369);
                AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 3370);
                AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 3372);
                AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 3373);
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
                assemVMLazy = new AssemVMLazy(awS577S0100000_332, c5182020e, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS577S0100000_33, aFwS279S0000000_33, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
            } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
                assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 4170), c5182020e, AFwS224S0000000_33.get$arr$(645), new AwS563S0100000_19((C03K6) this, 3376), new AwS550S0100000_6((C03K6) this, 1583), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 4171), aFwS279S0000000_33, new AwS550S0100000_6((C03K6) this, 1585), null, new AwS550S0100000_6((C03K6) this, 1586));
            } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 4172), c5182020e, AFwS224S0000000_33.get$arr$(646), new AwS551S0100000_7((C03K6) this, 812), new AwS550S0100000_6((C03K6) this, 1589), new AwS550S0100000_6((C03K6) this, 1591), aFwS279S0000000_33, null, null, new AwS550S0100000_6((C03K6) this, 1592));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = ((OrderSubmitAssemViewModel) assemVMLazy.getValue()).hi1(false);
            mapHi1.put("item_num", Integer.valueOf(c7812033i.LLILLL));
            C03O0.LJJJZ(c03o0, "expired_items", mapHi1, null, null, null, null, null, null, null, null, null, null, null, 1048572);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b03, viewGroup, false);
    }
}
