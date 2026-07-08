package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1087830ePl;
import X.C1151410g4J;
import X.C1151420g4K;
import X.C13LE;
import X.C13LP;
import X.C1834150xpV;
import X.C19719912Dl;
import X.C21538519Qx;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418340Gam;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1151250g43;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util.PanelUIUtil;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.FirstRechargeModel;
import webcast.data.TouchPointColor;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ExchangeCellStyle2 extends PowerCell<C1151410g4J> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public TextView LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExchangeCellStyle2.class, "packageListViewModel", "getPackageListViewModel()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/packages/PackageListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ExchangeCellStyle2() {
        AssemVMLazy assemVMLazy;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PackageListViewModel.class);
        Object obj = C019F.LIZ;
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 234);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(23);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 245), awS577S0100000_33, AFwS224S0000000_33.get$arr$(32), new AwS577S0100000_33((C03K6) this, 220), new AwS577S0100000_33((C03K6) this, 222), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 224), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 226), null, new AwS577S0100000_33((C03K6) this, 227));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 221);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 223);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 225);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 8));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 228);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 229);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 230);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 231);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 232);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 233), awS577S0100000_33, AFwS224S0000000_33.get$arr$(33), new AwS577S0100000_33((C03K6) this, 235), new AwS577S0100000_33((C03K6) this, 236), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 237), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 238), null, new AwS577S0100000_33((C03K6) this, 239));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 240), awS577S0100000_33, AFwS224S0000000_33.get$arr$(34), new AwS577S0100000_33((C03K6) this, 241), new AwS577S0100000_33((C03K6) this, 242), new AwS577S0100000_33((C03K6) this, 243), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 244));
        }
        this.LL = assemVMLazy;
    }

    public final FirstRechargeModel.RechargeBannerListConfig I5() {
        InterfaceC1151250g43 interfaceC1151250g43O5;
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        TouchPointAbility touchPointAbility = ((PackageListViewModel) assemVMLazy.getValue()).LLILLJJLI;
        if (touchPointAbility == null || (interfaceC1151250g43O5 = touchPointAbility.O5()) == null) {
            return null;
        }
        return interfaceC1151250g43O5.LIZ(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C21538519Qx c21538519Qx;
        C786410Ut5.I7(new AbS712S0100000_33(this, 0), this.itemView);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zb5);
        if (I5() == null || (c21538519Qx = (C21538519Qx) this.itemView.findViewById(R.id.tp3)) == null) {
            return;
        }
        FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigI5 = I5();
        c21538519Qx.setRadius(C497740JfY.LIZIZ(rechargeBannerListConfigI5 != null ? rechargeBannerListConfigI5.borderRadius : 8.0f));
    }

    public final void L5(boolean z) {
        String str;
        String str2;
        TouchPointColor touchPointColor;
        TouchPointColor touchPointColor2;
        TouchPointColor touchPointColor3;
        C21538519Qx c21538519Qx = (C21538519Qx) this.itemView.findViewById(R.id.tp3);
        if (z) {
            if (c21538519Qx != null) {
                c21538519Qx.setStrokeWidth(C497740JfY.LIZIZ(2));
                float f = 2;
                c21538519Qx.setPadding((int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f));
            }
            if (I5() != null) {
                FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigI5 = I5();
                String str3 = null;
                if (rechargeBannerListConfigI5 != null && (touchPointColor3 = rechargeBannerListConfigI5.selectedBorderColor) != null) {
                    str = touchPointColor3.light;
                } else {
                    str = null;
                }
                C1087830ePl.LIZ(c21538519Qx, str);
                TextView textView = this.LLILLJJLI;
                FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigI52 = I5();
                if (rechargeBannerListConfigI52 != null && (touchPointColor2 = rechargeBannerListConfigI52.selectedBackgroundColor) != null) {
                    str2 = touchPointColor2.light;
                } else {
                    str2 = null;
                }
                FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigI53 = I5();
                if (rechargeBannerListConfigI53 != null && (touchPointColor = rechargeBannerListConfigI53.selectedTextColor) != null) {
                    str3 = touchPointColor.light;
                }
                C1087830ePl.LIZIZ(textView, str2, str3);
                return;
            }
            if (c21538519Qx != null) {
                int i = PanelUIUtil.LIZ;
                c21538519Qx.setStrokeColor(C497740JfY.LIZLLL(R.attr.f00, this.itemView.getContext()));
            }
            TextView textView2 = this.LLILLJJLI;
            if (textView2 != null) {
                int i2 = PanelUIUtil.LIZ;
                textView2.setBackgroundColor(C497740JfY.LIZLLL(R.attr.eyd, this.itemView.getContext()));
            }
            TextView textView3 = this.LLILLJJLI;
            if (textView3 == null) {
                return;
            }
            int i3 = PanelUIUtil.LIZ;
            textView3.setTextColor(C497740JfY.LIZLLL(R.attr.f00, this.itemView.getContext()));
            return;
        }
        if (c21538519Qx != null) {
            int i4 = PanelUIUtil.LIZ;
            c21538519Qx.setStrokeColor(C497740JfY.LIZLLL(R.attr.ey9, this.itemView.getContext()));
            if (c21538519Qx != null) {
                float f2 = 1;
                c21538519Qx.setPadding((int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2));
                c21538519Qx.setStrokeWidth(C497740JfY.LIZIZ(1));
            }
        }
        TextView textView4 = this.LLILLJJLI;
        if (textView4 != null) {
            int i5 = PanelUIUtil.LIZ;
            textView4.setBackgroundColor(C497740JfY.LIZLLL(R.attr.ey_, this.itemView.getContext()));
        }
        TextView textView5 = this.LLILLJJLI;
        if (textView5 == null) {
            return;
        }
        int i6 = PanelUIUtil.LIZ;
        textView5.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, this.itemView.getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        StringBuilder sbLIZ;
        C1151410g4J c1151410g4J = (C1151410g4J) interfaceC1891350zJl;
        super.onBindItemView(c1151410g4J);
        ((TextView) this.itemView.findViewById(R.id.tv_price)).setText(c1151410g4J.LLILLL);
        C418340Gam c418340Gam = (C418340Gam) this.itemView.findViewById(R.id.tv_package_count);
        int i = PanelUIUtil.LIZ;
        Context context = this.itemView.getContext();
        if (C426750GoL.LIZLLL(context)) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1151410g4J.LLILLJJLI);
            sbLIZ.append(" img ");
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("img ");
            sbLIZ.append(c1151410g4J.LLILLJJLI);
        }
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        PanelUIUtil.LIZLLL(context, spannableStringBuilder, strLIZIZ);
        PanelUIUtil.LIZ(c418340Gam, spannableStringBuilder.toString());
        c418340Gam.setText(spannableStringBuilder);
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131840591));
        }
        L5(c1151410g4J.LLILZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2s, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1151420g4K c1151420g4K;
        super.onBindItemView(interfaceC1891350zJl, list);
        Object objLJJJLL = C13LP.LJJJLL(list);
        if ((objLJJJLL instanceof C1151420g4K) && (c1151420g4K = (C1151420g4K) objLJJJLL) != null) {
            L5(c1151420g4K.LIZ);
        }
    }
}
