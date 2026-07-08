package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shopify;

import X.AnonymousClass0316;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03B0;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C04JI;
import X.C13LE;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC804803Ck;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.AObjectS534S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USEmailAuthorizeCell extends ECPowerCell<AnonymousClass0316> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USEmailAuthorizeCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USEmailAuthorizeCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1549);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(75);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1560), awS577S0100000_33, AFwS224S0000000_33.get$arr$(214), new AwS577S0100000_33((C03K6) this, 1535), new AwS577S0100000_33((C03K6) this, 1537), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1539), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1541), null, new AwS577S0100000_33((C03K6) this, 1542));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1536);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1538);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1540);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 57));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1543);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1544);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1545);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1546);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1547);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1548), awS577S0100000_33, AFwS224S0000000_33.get$arr$(212), new AwS577S0100000_33((C03K6) this, 1550), new AwS577S0100000_33((C03K6) this, 1551), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1552), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1553), null, new AwS577S0100000_33((C03K6) this, 1554));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1555), awS577S0100000_33, AFwS224S0000000_33.get$arr$(213), new AwS577S0100000_33((C03K6) this, 1556), new AwS577S0100000_33((C03K6) this, 1557), new AwS577S0100000_33((C03K6) this, 1558), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1559));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        AnonymousClass0316 anonymousClass0316 = (AnonymousClass0316) interfaceC1891350zJl;
        TextView textView = (TextView) this.itemView.findViewById(R.id.us_order_submit_shopify_module_name);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.us_order_submit_shopify_module_desc);
        textView.setText(anonymousClass0316.LLILZLL.title);
        Integer num = anonymousClass0316.LLILZLL.authType;
        EnumC804803Ck enumC804803Ck = EnumC804803Ck.SELLER_CRM;
        int value = enumC804803Ck.getValue();
        if (num != null && num.intValue() == value) {
            ECRichText eCRichText = anonymousClass0316.LLILZLL.descRichText;
            if (eCRichText != null) {
                C03B0 c03b0 = new C03B0(textView2, "osp_crm_switch");
                C03B0.LIZ(c03b0, eCRichText, new AObjectS534S0100000_1(this, 4), null, false, null, null, 124);
                textView2.setText(c03b0.LIZJ);
            }
        } else {
            textView2.setText(anonymousClass0316.LLILZLL.description);
        }
        C786410Ut5.C7((C21411818qq) this.itemView.findViewById(R.id.us_order_submit_shopify_switch), null);
        Boolean bool = anonymousClass0316.LLILZLL.isAuthorized;
        if (bool != null) {
            ((C21411818qq) this.itemView.findViewById(R.id.us_order_submit_shopify_switch)).setChecked(bool.booleanValue());
        }
        C786410Ut5.C7((C21411818qq) this.itemView.findViewById(R.id.us_order_submit_shopify_switch), new C04JI(this, anonymousClass0316, 0));
        if (!this.LLJI) {
            this.LLJI = true;
            C03O0 c03o0 = C03O0.LIZ;
            Integer num2 = anonymousClass0316.LLILZLL.authType;
            int value2 = enumC804803Ck.getValue();
            String str2 = "share_email_to_shopify";
            if (num2 != null && num2.intValue() == value2) {
                str = "CRM_toggle";
            } else {
                str = "share_email_to_shopify";
            }
            C03O0.LJJJZ(c03o0, str, L5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, 1048572);
            Integer num3 = anonymousClass0316.LLILZLL.authType;
            int value3 = enumC804803Ck.getValue();
            if (num3 != null && num3.intValue() == value3) {
                str2 = "CRM_toggle";
            }
            C03O0.LJJJJZ(c03o0, str2, null, L5().hi1(false), null, "order_submit", null, null, null, null, null, null, null, null, null, null, null, null, 33554410);
        }
        Integer num4 = anonymousClass0316.LLILZLL.authType;
        int value4 = enumC804803Ck.getValue();
        if (num4 != null && num4.intValue() == value4) {
            C736680Sv4.LJIJJ(L5(), new AwS580S0100000_1(this, 638));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b2t, viewGroup, false);
    }
}
