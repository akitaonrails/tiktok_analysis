package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0235005x;
import X.C03IJ;
import X.C03K6;
import X.C098200Yq;
import X.C1087830ePl;
import X.C1147840fyY;
import X.C1151400g4I;
import X.C1151420g4K;
import X.C13LE;
import X.C1815960xMA;
import X.C1834150xpV;
import X.C189200o6;
import X.C19719912Dl;
import X.C21538519Qx;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418340Gam;
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
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util.PanelUIUtil;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.FirstRechargeModel;
import webcast.data.TouchPointColor;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class RechargeCellStyle2 extends PowerCell<C1151400g4I> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public TextView LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargeCellStyle2.class, "packageListViewModel", "getPackageListViewModel()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/packages/PackageListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RechargeCellStyle2() {
        AssemVMLazy assemVMLazy;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PackageListViewModel.class);
        Object obj = C019F.LIZ;
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 286);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(25);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 297), awS577S0100000_33, AFwS224S0000000_33.get$arr$(38), new AwS577S0100000_33((C03K6) this, 272), new AwS577S0100000_33((C03K6) this, 274), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 276), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 278), null, new AwS577S0100000_33((C03K6) this, 279));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 273);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 275);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 277);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 10));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 280);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 281);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 282);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 283);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 284);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 285), awS577S0100000_33, AFwS224S0000000_33.get$arr$(39), new AwS577S0100000_33((C03K6) this, 287), new AwS577S0100000_33((C03K6) this, 288), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 289), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 290), null, new AwS577S0100000_33((C03K6) this, 291));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 292), awS577S0100000_33, AFwS224S0000000_33.get$arr$(40), new AwS577S0100000_33((C03K6) this, 293), new AwS577S0100000_33((C03K6) this, 294), new AwS577S0100000_33((C03K6) this, 295), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 296));
        }
        this.LL = assemVMLazy;
    }

    public final PackageListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (PackageListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C21538519Qx c21538519Qx;
        C786410Ut5.I7(new AbS712S0100000_33(this, 2), this.itemView);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zb5);
        if (L5() == null || (c21538519Qx = (C21538519Qx) this.itemView.findViewById(R.id.tp3)) == null) {
            return;
        }
        FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigL5 = L5();
        c21538519Qx.setRadius(C497740JfY.LIZIZ(rechargeBannerListConfigL5 != null ? rechargeBannerListConfigL5.borderRadius : 8.0f));
    }

    public final FirstRechargeModel.RechargeBannerListConfig L5() {
        InterfaceC1151250g43 interfaceC1151250g43O5;
        TouchPointAbility touchPointAbility = I5().LLILLJJLI;
        if (touchPointAbility == null || (interfaceC1151250g43O5 = touchPointAbility.O5()) == null) {
            return null;
        }
        return interfaceC1151250g43O5.LIZ(true);
    }

    public final void N5(C1151400g4I c1151400g4I) {
        Object c098200Yq;
        int color;
        TouchPointColor touchPointColor;
        String str;
        C418340Gam c418340Gam = (C418340Gam) this.itemView.findViewById(R.id.tv_package_count);
        int i = PanelUIUtil.LIZ;
        Context context = this.itemView.getContext();
        try {
            FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigL5 = L5();
            if (rechargeBannerListConfigL5 != null && (touchPointColor = rechargeBannerListConfigL5.selectedTextColor) != null && (str = touchPointColor.light) != null) {
                color = Color.parseColor(str);
            } else {
                color = 0;
            }
            c098200Yq = Integer.valueOf(color);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        SpannableStringBuilder spannableStringBuilderLIZJ = PanelUIUtil.LIZJ(c1151400g4I, context, ((Number) c098200Yq).intValue());
        PanelUIUtil.LIZ(c418340Gam, spannableStringBuilderLIZJ.toString());
        c418340Gam.setText(spannableStringBuilderLIZJ);
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131840592));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P5(C1151400g4I c1151400g4I) {
        int i;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_price);
        textView.setText(c1151400g4I.LLILLJJLI);
        C1147840fyY c1147840fyY = (C1147840fyY) this.itemView.findViewById(R.id.tv_price_switch);
        C1151400g4I c1151400g4I2 = ((C1815960xMA) I5().getState()).LLILZLL;
        if (c1151400g4I.LLILZLL && c1151400g4I2 != null && Intrinsics.LJFF(c1151400g4I.LLIZLLLIL.LJI, c1151400g4I2.LLIZLLLIL.LJI) && c1151400g4I.LLIZLLLIL.count == c1151400g4I2.LLIZLLLIL.count) {
            C786410Ut5.LLIL(textView, 4);
            C786410Ut5.LLLIIL(c1147840fyY, 0);
            c1147840fyY.j0(textView.getTextSize(), c1151400g4I2.LLILLJJLI);
            String str = c1151400g4I.LLILLJJLI;
            float textSize = textView.getTextSize();
            if (c1151400g4I.LLIZLLLIL.LJFF > c1151400g4I2.LLIZLLLIL.LJFF) {
                i = 1;
            } else {
                i = 2;
            }
            c1147840fyY.l0(textSize, str, i);
            I5().setState(new AwS606S0100000_27((C1151400g4I) null, 483));
            return;
        }
        C786410Ut5.LLIL(textView, 0);
        C786410Ut5.LLLIIL(c1147840fyY, 4);
    }

    public final void R5(boolean z) {
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
            if (L5() != null) {
                FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigL5 = L5();
                String str3 = null;
                if (rechargeBannerListConfigL5 != null && (touchPointColor3 = rechargeBannerListConfigL5.selectedBorderColor) != null) {
                    str = touchPointColor3.light;
                } else {
                    str = null;
                }
                C1087830ePl.LIZ(c21538519Qx, str);
                TextView textView = this.LLILLJJLI;
                FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigL52 = L5();
                if (rechargeBannerListConfigL52 != null && (touchPointColor2 = rechargeBannerListConfigL52.selectedBackgroundColor) != null) {
                    str2 = touchPointColor2.light;
                } else {
                    str2 = null;
                }
                FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfigL53 = L5();
                if (rechargeBannerListConfigL53 != null && (touchPointColor = rechargeBannerListConfigL53.selectedTextColor) != null) {
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
                c21538519Qx.setStrokeWidth(C497740JfY.LIZIZ(1));
                float f2 = 1;
                c21538519Qx.setPadding((int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2));
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
        C1151400g4I c1151400g4I = (C1151400g4I) interfaceC1891350zJl;
        super.onBindItemView(c1151400g4I);
        P5(c1151400g4I);
        N5(c1151400g4I);
        R5(c1151400g4I.LLILZLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2s, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1151400g4I c1151400g4I = (C1151400g4I) interfaceC1891350zJl;
        super.onBindItemView(c1151400g4I, list);
        for (Object obj : list) {
            if (obj instanceof C1151420g4K) {
                P5(c1151400g4I);
                N5(c1151400g4I);
                R5(((C1151420g4K) obj).LIZ);
            }
            if (obj instanceof C0235005x) {
                P5(c1151400g4I);
                N5(c1151400g4I);
            }
        }
    }
}
