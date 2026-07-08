package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C0H9H;
import X.C12ES;
import X.C13LE;
import X.C19719912Dl;
import X.C21411818qq;
import X.C21588719eH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C737910Sx3;
import X.C745902vh;
import X.C786410Ut5;
import X.C870703aj;
import X.C890103dr;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.CCDCAddCardLongTextAdjust;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USSameShippingAddressElementViewHolder extends PowerCell<C745902vh> implements C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public LinearLayout LL;
    public C21411818qq LLILLJJLI;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USSameShippingAddressElementViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USSameShippingAddressElementViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1895);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(90);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1906), awS577S0100000_33, AFwS224S0000000_33.get$arr$(253), new AwS577S0100000_33((C03K6) this, 1881), new AwS577S0100000_33((C03K6) this, 1883), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1885), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1887), null, new AwS577S0100000_33((C03K6) this, 1888));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1882);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1884);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1886);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 70));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1889);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1890);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1891);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1892);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1893);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1894), awS577S0100000_33, AFwS224S0000000_33.get$arr$(251), new AwS577S0100000_33((C03K6) this, 1896), new AwS577S0100000_33((C03K6) this, 1897), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1898), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1899), null, new AwS577S0100000_33((C03K6) this, 1900));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1901), awS577S0100000_33, AFwS224S0000000_33.get$arr$(252), new AwS577S0100000_33((C03K6) this, 1902), new AwS577S0100000_33((C03K6) this, 1903), new AwS577S0100000_33((C03K6) this, 1904), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1905));
        }
        this.LLILLL = assemVMLazy;
    }

    public final LinearLayout I5() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tz2) : null;
            this.LL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C21411818qq L5() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tz3) : null;
            this.LLILLJJLI = (C21411818qq) viewFindViewById;
        }
        return (C21411818qq) viewFindViewById;
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C745902vh c745902vh = (C745902vh) interfaceC1891350zJl;
        super.onBindItemView(c745902vh);
        C870703aj.LIZ(this.itemView, new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254));
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        TextView textView = (TextView) this.itemView.findViewById(R.id.z6j);
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        if (((CCDCAddCardViewModel) assemVMLazy.getValue()).SQ2() && textView != null) {
            textView.setText(this.itemView.getContext().getString(2131840295));
        }
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.z2d);
            if (textView2 != null) {
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (textView != null) {
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if (c745902vh.LL == null) {
            C03DZ.LIZ(I5());
        } else {
            C12ES.LJIILL(0, I5());
            L5().setChecked(true);
            ((CCDCAddCardViewModel) this.LLILLL.getValue()).aR2(true);
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 122), this.itemView.findViewById(R.id.tz2));
        if (I5().getVisibility() == 0) {
            C890103dr c890103dr = C890103dr.LIZ;
            HashMap map = new HashMap();
            if (L5().isChecked()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("button_status", str);
            c890103dr.getClass();
            C890103dr.LJI("use_shipping_address", map);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C0H1U.LIZJ(R.layout.b0n, viewGroup, false);
    }
}
