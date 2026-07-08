package com.ss.android.ugc.aweme.ecommerce.base.osp.module.address;

import X.AbstractC468201s0;
import X.AnonymousClass0376;
import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03I0;
import X.C03I1;
import X.C03I2;
import X.C03IC;
import X.C03IF;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C098200Yq;
import X.C09R3;
import X.C0H1U;
import X.C1020503yt;
import X.C10515049h;
import X.C1212720hfC;
import X.C12ES;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1533950q1J;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AF0;
import X.C20627315nb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C7867035l;
import X.EnumC1338240kve;
import X.InterfaceC1164530gPT;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECLatamOspFlowOpt;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV3;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS1S0500000_1;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OspAddressCell extends ECPowerCell<AnonymousClass0376> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public String LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OspAddressCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(OspAddressCell.class, "addressVM", "getAddressVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/address/OspAddressViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public OspAddressCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 168);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(71);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 159), awS545S0100000_1, AFwS207S0000000_19.get$arr$(108), new AwS545S0100000_1((C03K6) this, 152), new AwS545S0100000_1((C03K6) this, 160), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 162), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1080), null, new AwS545S0100000_1((C03K6) this, 165));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 148);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 150);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 153);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 44));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1075);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1077);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1078);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1079);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1081);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 166), awS545S0100000_1, AFwS207S0000000_19.get$arr$(107), new AwS545S0100000_1((C03K6) this, 169), new AwS545S0100000_1((C03K6) this, 170), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 171), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1086), null, new AwS545S0100000_1((C03K6) this, 172));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 173), awS545S0100000_1, AFwS207S0000000_19.get$arr$(109), new AwS545S0100000_1((C03K6) this, 175), new AwS545S0100000_1((C03K6) this, 177), new AwS545S0100000_1((C03K6) this, 180), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 181));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAddressViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 183);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(70);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 147), awS545S0100000_15, AFwS207S0000000_19.get$arr$(106), new AwS545S0100000_1((C03K6) this, 151), new AwS545S0100000_1((C03K6) this, 154), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 156), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1076), null, new AwS545S0100000_1((C03K6) this, 161));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 163);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 164);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 167);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 45));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1082);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1083);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1084);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1085);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1087);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 174), awS545S0100000_15, AFwS207S0000000_19.get$arr$(110), new AwS545S0100000_1((C03K6) this, 176), new AwS545S0100000_1((C03K6) this, 178), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 179), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1088), null, new AwS545S0100000_1((C03K6) this, 182));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 146), awS545S0100000_15, AFwS207S0000000_19.get$arr$(105), new AwS545S0100000_1((C03K6) this, 149), new AwS545S0100000_1((C03K6) this, 155), new AwS545S0100000_1((C03K6) this, 157), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 158));
        }
        this.LLJI = assemVMLazy2;
    }

    public final OspAddressViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OspAddressViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        if (!this.LL) {
            this.LL = true;
            AnonymousClass0378.LIZ().LIZLLL("ec_osp_address_module_shake", this);
        }
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.03Hx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C818903Hv) obj).LLILLJJLI;
            }
        }, null, new AwS615S0100000_1(this, 130), 6);
        C736680Sv4.LJIIIZ(this, L5(), new C2217381BqS() { // from class: X.03Hy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C818903Hv) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.03Hz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C818903Hv) obj).LLILZIL;
            }
        }, null, new AwS650S0100000_1(this, 19), 12);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.03Hw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C818903Hv) obj).LLILZLL;
            }
        }, null, new AwS615S0100000_1(this, 131), 6);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("shipping_address", this.itemView);
        }
        ModuleManager moduleManager2 = N5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "shipping_address");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_osp_address_module_shake", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String string;
        String string2;
        BillStarling billStarling;
        BillStarlingText billStarlingText;
        BillStarling billStarling2;
        BillStarlingText billStarlingText2;
        Integer type;
        Integer type2;
        String value;
        View view;
        View viewFindViewById;
        View viewFindViewById2;
        TextView textView;
        C197039127h c197039127h;
        C1212720hfC c1212720hfC;
        TextView textView2;
        TextView textView3;
        View viewFindViewById3;
        int iIntValue;
        IdentityInfo identityInfo;
        HashMap<String, Object> mapLJIIJ;
        String filledNote;
        String unfilledNote;
        Icon unfilledNoteIcon;
        Image imageRequireImage;
        Icon filledNoteIcon;
        Image imageRequireImage2;
        String daInfo;
        boolean z;
        int i;
        int i2;
        int i3;
        int iIntValue2;
        String string3;
        Object obj;
        Integer num;
        AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) interfaceC1891350zJl;
        this.LLIZLLLIL = System.currentTimeMillis();
        View viewFindViewById4 = this.itemView.findViewById(R.id.acr);
        View viewFindViewById5 = this.itemView.findViewById(R.id.acs);
        C1212720hfC c1212720hfC2 = (C1212720hfC) this.itemView.findViewById(R.id.acq);
        if (N5().LLZILL) {
            if (Intrinsics.LJFF(anonymousClass0376.LLJJJJLIIL, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                return;
            }
            C786410Ut5.LJLLLLLL(0, this.itemView);
        }
        if (!this.LL) {
            this.LL = true;
            AnonymousClass0378.LIZ().LIZLLL("ec_osp_address_module_shake", this);
        }
        C03J8.LIZ(this.itemView, true);
        if (anonymousClass0376.LLJILJIL) {
            str = "edit_shipping";
        } else {
            str = "add_new_shipping";
        }
        String unfilledNote2 = null;
        if (!Intrinsics.LJFF(str, this.LLJIJIL)) {
            Boolean bool = anonymousClass0376.LLJJJJJIL;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(anonymousClass0376.LLJJJJ, bool2)) {
                C03O0 c03o0 = C03O0.LIZ;
                HashMap<String, Object> mapHi1 = N5().hi1(false);
                DeliveryInstructionInfo deliveryInstructionInfo = anonymousClass0376.LLJJLIIIJLLLLLLLZ;
                if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue2));
                Integer num2 = anonymousClass0376.LLJZIJLIL;
                String strValueOf = String.valueOf(anonymousClass0376.LLJJJIL);
                Map<String, Object> map = anonymousClass0376.LLJLLL;
                if (map != null && (obj = map.get("invalid_reason_code")) != null) {
                    string3 = obj.toString();
                } else {
                    string3 = null;
                }
                C03O0.LJJJZ(c03o0, str, mapHi1, null, null, null, num2, strValueOf, string3, null, null, null, null, null, 1034236);
                this.LLJIJIL = str;
            }
        }
        if (ECOspOptimizedV3.LIZ()) {
            C7867035l.LIZ = AnonymousClass0376.LIZIZ(anonymousClass0376, Boolean.TRUE, null, null, -131073, 63);
        }
        View view2 = this.itemView;
        if (anonymousClass0376.LLJILJIL) {
            C12ES.LJIILL(0, view2.findViewById(R.id.jg_));
            C12ES.LJIILL(0, view2.findViewById(R.id.vry));
            C03DZ.LIZ(viewFindViewById4);
            C03DZ.LIZ(viewFindViewById5);
            C03DZ.LIZ(c1212720hfC2);
            ((C03IC) view2.findViewById(R.id.jg_)).setAddressInfo(anonymousClass0376);
            C03IC c03ic = (C03IC) view2.findViewById(R.id.jg_);
            Boolean bool3 = anonymousClass0376.LLJJJJJIL;
            Boolean bool4 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool3, bool4) && !Intrinsics.LJFF(anonymousClass0376.LLJJJJ, bool4)) {
                z = true;
            } else {
                z = false;
            }
            C20627315nb orderSubmitAddressSkeleton1FromXml = c03ic.getOrderSubmitAddressSkeleton1FromXml();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, orderSubmitAddressSkeleton1FromXml);
            C20627315nb orderSubmitAddressSkeleton2FromXml = c03ic.getOrderSubmitAddressSkeleton2FromXml();
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, orderSubmitAddressSkeleton2FromXml);
            FrameLayout commerceFramelayoutFromXml = c03ic.getCommerceFramelayoutFromXml();
            if (!z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, commerceFramelayoutFromXml);
            C786410Ut5.I7(new AjS20S0300000_1(anonymousClass0376, this, view2, 23), view2.findViewById(R.id.jg_));
        } else {
            C03DZ.LIZ(view2.findViewById(R.id.jg_));
            C03DZ.LIZ(view2.findViewById(R.id.vry));
            AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(this, anonymousClass0376, 196);
            if (C03IF.LIZ()) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                viewFindViewById5.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
                C12ES.LJIILL(0, viewFindViewById5);
                C786410Ut5.I7(new AjS60S0100000_1(awS367S0200000_1, 48), viewFindViewById5);
            } else if (ECLatamOspFlowOpt.LIZIZ()) {
                BillInfoData billInfoData = N5().LLJJI;
                if (billInfoData == null || (billStarling2 = billInfoData.starlingTexts) == null || (billStarlingText2 = billStarling2.shippingAddressTitleLatamOpt) == null || (string = billStarlingText2.text) == null) {
                    string = c1212720hfC2.getContext().getString(2131836422);
                }
                BillInfoData billInfoData2 = N5().LLJJI;
                if (billInfoData2 == null || (billStarling = billInfoData2.starlingTexts) == null || (billStarlingText = billStarling.addDeliveryAddressLatamOpt) == null || (string2 = billStarlingText.text) == null) {
                    string2 = c1212720hfC2.getContext().getString(2131836421);
                }
                c1212720hfC2.LIZ(R.raw.icon_map_pin, string, string2);
                C12ES.LJIILL(0, c1212720hfC2);
                C786410Ut5.I7(new AjS60S0100000_1(awS367S0200000_1, 50), c1212720hfC2);
            } else {
                C12ES.LJIILL(0, viewFindViewById4);
                C786410Ut5.I7(new AjS60S0100000_1(awS367S0200000_1, 49), viewFindViewById4);
            }
        }
        IdentityInfo identityInfo2 = anonymousClass0376.LLLFZ;
        if (identityInfo2 != null) {
            L5().setStateImmediate(new AwS580S0100000_1(identityInfo2, 26));
        } else {
            View viewFindViewById6 = this.itemView.findViewById(R.id.ah2);
            if (viewFindViewById6 != null) {
                C03DZ.LIZ(viewFindViewById6);
            }
        }
        C03I0 c03i0 = C03I0.LIZ;
        IdentityInfo identityInfo3 = anonymousClass0376.LLLFZ;
        c03i0.getClass();
        C03I2 c03i2LIZ = C03I0.LIZ(identityInfo3);
        IdentityInfo identityInfo4 = anonymousClass0376.LLLFZ;
        if (identityInfo4 != null && Intrinsics.LJFF(identityInfo4.getEnableAddressIdentity(), Boolean.TRUE)) {
            View viewFindViewById7 = this.itemView.findViewById(R.id.ah2);
            if (viewFindViewById7 != null) {
                C03DZ.LIZ(viewFindViewById7);
            }
        } else if (c03i2LIZ != null) {
            int i4 = C03I1.LIZ[c03i2LIZ.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3 && (identityInfo = anonymousClass0376.LLLFZ) != null) {
                        final View view3 = this.itemView;
                        RecipientIdentityInfo recipientIdentityInfo = identityInfo.getRecipientIdentityInfo();
                        if (recipientIdentityInfo != null && (daInfo = recipientIdentityInfo.getDaInfo()) != null) {
                            mapLJIIJ = C1741890vQh.LJIIJ(daInfo);
                        } else {
                            mapLJIIJ = null;
                        }
                        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.swr);
                        C12ES.LJIILL(0, linearLayout);
                        C786410Ut5.I7(new AjS1S0500000_1(identityInfo, this, view3, linearLayout, mapLJIIJ, 2), linearLayout);
                        final C197039127h c197039127h2 = (C197039127h) linearLayout.findViewById(R.id.swp);
                        View viewFindViewById8 = linearLayout.findViewById(R.id.jgg);
                        if (recipientIdentityInfo != null) {
                            filledNote = recipientIdentityInfo.getFilledNote();
                        } else {
                            filledNote = null;
                        }
                        if (C1533950q1J.LJ(filledNote)) {
                            OspAddressViewModel ospAddressViewModelL5 = L5();
                            ospAddressViewModelL5.withState(new AwS89S0110000_1(ospAddressViewModelL5, false, 0));
                            C03DZ.LIZ(c197039127h2);
                            C12ES.LJIILL(0, viewFindViewById8);
                            TextView textView4 = (TextView) linearLayout.findViewById(R.id.tv_recipient_id_number);
                            if (recipientIdentityInfo != null) {
                                unfilledNote2 = recipientIdentityInfo.getFilledNote();
                            }
                            textView4.setText(unfilledNote2);
                            View viewFindViewById9 = linearLayout.findViewById(R.id.lh4);
                            SmartImageView smartImageView = (SmartImageView) linearLayout.findViewById(R.id.lh3);
                            if (recipientIdentityInfo != null && (filledNoteIcon = recipientIdentityInfo.getFilledNoteIcon()) != null && (imageRequireImage2 = filledNoteIcon.requireImage(smartImageView.getContext())) != null) {
                                C03DZ.LIZ(viewFindViewById9);
                                C12ES.LJIILL(0, smartImageView);
                                C1326790kdB.LIZ.getClass();
                                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImage2);
                                c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
                                c1331670kl3LIZLLL.LJJ(smartImageView);
                                c1331670kl3LIZLLL.LJIIJJI();
                            } else {
                                C12ES.LJIILL(0, viewFindViewById9);
                                C03DZ.LIZ(smartImageView);
                            }
                        } else {
                            if (recipientIdentityInfo != null) {
                                unfilledNote = recipientIdentityInfo.getUnfilledNote();
                            } else {
                                unfilledNote = null;
                            }
                            if (C1533950q1J.LJ(unfilledNote)) {
                                C03DZ.LIZ(viewFindViewById8);
                                if (recipientIdentityInfo != null) {
                                    unfilledNote2 = recipientIdentityInfo.getUnfilledNote();
                                }
                                c197039127h2.setText(unfilledNote2);
                                C12ES.LJIILL(0, c197039127h2);
                                if (recipientIdentityInfo != null && (unfilledNoteIcon = recipientIdentityInfo.getUnfilledNoteIcon()) != null && (imageRequireImage = unfilledNoteIcon.requireImage(c197039127h2.getContext())) != null) {
                                    C1326790kdB.LIZ.getClass();
                                    C1326790kdB.LIZLLL(imageRequireImage).LJJIIJ(new AbstractC468201s0() { // from class: X.03IB
                                        @Override // X.InterfaceC1331910klR
                                        public final void onFailed(Throwable th) {
                                        }

                                        @Override // X.InterfaceC1331910klR
                                        public final void LIZ(Bitmap bitmap) {
                                            BitmapDrawable bitmapDrawable;
                                            C197039127h c197039127h3 = c197039127h2;
                                            if (bitmap != null) {
                                                bitmapDrawable = new BitmapDrawable(view3.getContext().getResources(), bitmap);
                                            } else {
                                                bitmapDrawable = null;
                                            }
                                            c197039127h3.setButtonStartIconDrawable(bitmapDrawable);
                                        }
                                    });
                                } else {
                                    c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus));
                                    c197039127h2.setIconTintColorRes(R.attr.a1h);
                                }
                            }
                        }
                        C1748720vbi.LJFF(linearLayout, new C10515049h(), AFwS185S0000000_1.get$arr$(180), new AwS580S0100000_1((HashMap) mapLJIIJ, (HashMap<String, Object>) 466));
                    }
                } else {
                    IdentityInfo identityInfo5 = anonymousClass0376.LLLFZ;
                    if (identityInfo5 != null && (viewFindViewById = (view = this.itemView).findViewById(R.id.ah2)) != null && (viewFindViewById2 = this.itemView.findViewById(R.id.oz8)) != null && (textView = (TextView) this.itemView.findViewById(R.id.oz9)) != null && (c197039127h = (C197039127h) view.findViewById(R.id.adn)) != null && (c1212720hfC = (C1212720hfC) view.findViewById(R.id.adm)) != null && (textView2 = (TextView) view.findViewById(R.id.k5y)) != null && (textView3 = (TextView) view.findViewById(R.id.k5z)) != null && (viewFindViewById3 = view.findViewById(R.id.jgd)) != null) {
                        C12ES.LJIILL(0, viewFindViewById);
                        if (C1533950q1J.LJ(identityInfo5.getHintText())) {
                            if (Intrinsics.LJFF(identityInfo5.getIdentityRequired(), Boolean.TRUE)) {
                                if (ECLatamOspFlowOpt.LIZIZ()) {
                                    C03DZ.LIZ(viewFindViewById2);
                                    C03DZ.LIZ(c197039127h);
                                    String title = identityInfo5.getTitle();
                                    if (title == null) {
                                        title = c1212720hfC.getContext().getString(2131836424);
                                    }
                                    String hintText = identityInfo5.getHintText();
                                    if (hintText == null) {
                                        hintText = c1212720hfC.getContext().getString(2131836423);
                                    }
                                    c1212720hfC.LIZ(R.raw.icon_person, title, hintText);
                                    C12ES.LJIILL(0, c1212720hfC);
                                    C786410Ut5.I7(new AjS20S0300000_1(this, identityInfo5, c1212720hfC, 22), c1212720hfC);
                                } else {
                                    C03DZ.LIZ(viewFindViewById2);
                                    C03DZ.LIZ(c1212720hfC);
                                    C12ES.LJIILL(0, c197039127h);
                                    c197039127h.setText(identityInfo5.getHintText());
                                    C786410Ut5.I7(new AjS20S0300000_1(this, identityInfo5, c197039127h, 21), c197039127h);
                                }
                            } else {
                                C12ES.LJIILL(0, viewFindViewById2);
                                C03DZ.LIZ(c197039127h);
                                C03DZ.LIZ(c1212720hfC);
                                C786410Ut5.I7(new AjS10S0000000_1(9), viewFindViewById2);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                gradientDrawable.setColor(iIntValue);
                                viewFindViewById2.setBackground(gradientDrawable);
                                C0H1U.LJIIL(textView, identityInfo5.getHintText(), true);
                                C1748720vbi.LJFF(viewFindViewById2, new C10515049h(), AFwS185S0000000_1.get$arr$(178), AFwS228S0000000_1.get$arr$(526));
                            }
                        } else {
                            C03DZ.LIZ(viewFindViewById2);
                            C03DZ.LIZ(c197039127h);
                        }
                        IdentityInfoOption identityInfoOption = identityInfo5.getIdentityInfoOption();
                        if (identityInfoOption != null) {
                            C03DZ.LIZ(viewFindViewById2);
                            C03DZ.LIZ(c197039127h);
                            C03DZ.LIZ(c1212720hfC);
                            C12ES.LJIILL(0, viewFindViewById3);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(identityInfoOption.getName());
                            sbLIZ.append(':');
                            textView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                            textView3.setText(identityInfoOption.getValue());
                            if (identityInfo5.getIdentityInfoPanel() != null) {
                                C786410Ut5.I7(new AjS40S0200000_1(this, identityInfo5, 37), viewFindViewById3);
                            }
                            C1748720vbi.LJFF(viewFindViewById3, new C10515049h(), AFwS185S0000000_1.get$arr$(179), AFwS228S0000000_1.get$arr$(528));
                        } else {
                            C03DZ.LIZ(viewFindViewById3);
                        }
                    }
                }
            } else {
                IdentityInfo identityInfo6 = anonymousClass0376.LLLFZ;
                if (identityInfo6 != null) {
                    View view4 = this.itemView;
                    C197039127h c197039127h3 = (C197039127h) view4.findViewById(R.id.adn);
                    C1212720hfC c1212720hfC3 = (C1212720hfC) view4.findViewById(R.id.adm);
                    View viewFindViewById10 = view4.findViewById(R.id.ah2);
                    TextView textView5 = (TextView) view4.findViewById(R.id.k5y);
                    TextView textView6 = (TextView) view4.findViewById(R.id.k5z);
                    View viewFindViewById11 = view4.findViewById(R.id.jgd);
                    if (viewFindViewById10 != null) {
                        C12ES.LJIILL(0, viewFindViewById10);
                    }
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = "with_cpf_info";
                    IdentityInfoOption identityInfoOption2 = identityInfo6.getIdentityInfoOption();
                    if (identityInfoOption2 != null && (type2 = identityInfoOption2.getType()) != null && type2.intValue() == 3 && ((value = identityInfo6.getIdentityInfoOption().getValue()) == null || value.length() == 0)) {
                        if (viewFindViewById11 != null) {
                            C03DZ.LIZ(viewFindViewById11);
                        }
                        AwS367S0200000_1 awS367S0200000_12 = new AwS367S0200000_1(this, identityInfo6, 197);
                        if (ECLatamOspFlowOpt.LIZIZ()) {
                            if (c197039127h3 != null) {
                                C03DZ.LIZ(c197039127h3);
                            }
                            if (c1212720hfC3 != null) {
                                String title2 = identityInfo6.getTitle();
                                if (title2 == null) {
                                    title2 = c1212720hfC3.getContext().getString(2131836420);
                                }
                                String hintText2 = identityInfo6.getHintText();
                                if (hintText2 == null) {
                                    hintText2 = c1212720hfC3.getContext().getString(2131836419);
                                }
                                c1212720hfC3.LIZ(R.raw.icon_person, title2, hintText2);
                                C12ES.LJIILL(0, c1212720hfC3);
                                C786410Ut5.I7(new AjS40S0200000_1(awS367S0200000_12, c1212720hfC3, 40), c1212720hfC3);
                            }
                        } else {
                            if (c197039127h3 != null) {
                                C12ES.LJIILL(0, c197039127h3);
                            }
                            String hintText3 = identityInfo6.getHintText();
                            if (hintText3 != null) {
                                if (c197039127h3 != null) {
                                    c197039127h3.setText(hintText3);
                                    C786410Ut5.I7(new AjS40S0200000_1(awS367S0200000_12, c197039127h3, 38), c197039127h3);
                                }
                            } else if (c197039127h3 != null) {
                                C786410Ut5.I7(new AjS40S0200000_1(awS367S0200000_12, c197039127h3, 38), c197039127h3);
                            }
                        }
                        c259800zU.element = "without_cpf_info";
                    } else {
                        IdentityInfoOption identityInfoOption3 = identityInfo6.getIdentityInfoOption();
                        if (identityInfoOption3 != null && (type = identityInfoOption3.getType()) != null && type.intValue() == 3 && C1533950q1J.LJ(identityInfo6.getIdentityInfoOption().getValue())) {
                            if (c197039127h3 != null) {
                                C03DZ.LIZ(c197039127h3);
                            }
                            if (c1212720hfC3 != null) {
                                C03DZ.LIZ(c1212720hfC3);
                            }
                            if (viewFindViewById11 != null) {
                                C12ES.LJIILL(0, viewFindViewById11);
                            }
                            if (textView5 != null) {
                                textView5.setText(identityInfo6.getIdentityInfoOption().getName());
                            }
                            if (textView6 != null) {
                                textView6.setText(C1020503yt.LIZ(identityInfo6.getIdentityInfoOption().getValue()));
                            }
                            if (viewFindViewById11 != null) {
                                C786410Ut5.I7(new AjS40S0200000_1(this, identityInfo6, 39), viewFindViewById11);
                            }
                        }
                    }
                    if (viewFindViewById10 != null) {
                        C1748720vbi.LJFF(viewFindViewById10, new C10515049h(), AFwS185S0000000_1.get$arr$(181), new AwS580S0100000_1(c259800zU, (C259800zU<String>) 468));
                    }
                }
            }
        }
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager == null) {
            return;
        }
        moduleManager.LJIIJ(System.currentTimeMillis() - this.LLIZLLLIL, "shipping_address");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.b3w, viewGroup, false);
        viewLIZJ.setTag("address_item_view");
        return viewLIZJ;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        IdentityInfoCollectionStyle identityInfoCollectionStyle;
        C197039127h c197039127h;
        if (Intrinsics.LJFF(str, "ec_osp_address_module_shake")) {
            try {
                View view = this.itemView;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.be);
                IdentityInfo identityInfo = L5().getState().LLILLL;
                if (identityInfo != null && (identityInfoCollectionStyle = identityInfo.getIdentityInfoCollectionStyle()) != null) {
                    int i = C03I1.LIZIZ[identityInfoCollectionStyle.ordinal()];
                    if (i != 1) {
                        if (i == 2 && (c197039127h = (C197039127h) view.findViewById(R.id.swp)) != null) {
                            c197039127h.startAnimation(animationLoadAnimation);
                        }
                    } else {
                        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.acr);
                        if (c197039127h2 != null) {
                            c197039127h2.startAnimation(animationLoadAnimation);
                        }
                    }
                }
                C189200o6.m2constructorimpl(view);
                obj = view;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LIZJ(thM5exceptionOrNullimpl.toString());
            }
        }
    }
}
