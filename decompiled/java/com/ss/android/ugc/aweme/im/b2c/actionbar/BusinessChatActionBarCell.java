package com.ss.android.ugc.aweme.im.b2c.actionbar;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0I0B;
import X.C13LE;
import X.C1745106sT;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C908830Zl3;
import X.EnumC1763806vU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.api.protocol.RemoteIconAndTitleCell;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BusinessChatActionBarCell extends RemoteIconAndTitleCell<C908830Zl3> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessChatActionBarCell.class, "businessActionbarVM", "getBusinessActionbarVM()Lcom/ss/android/ugc/aweme/im/b2c/actionbar/BusinessChatActionBarVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BusinessChatActionBarCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BusinessChatActionBarVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2297);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(158);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2308), awS577S0100000_33, AFwS224S0000000_33.get$arr$(328), new AwS577S0100000_33((C03K6) this, 2283), new AwS577S0100000_33((C03K6) this, 2285), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2287), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2289), null, new AwS577S0100000_33((C03K6) this, 2290));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2284);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2286);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2288);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 88));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2291);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2292);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2293);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2294);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2295);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2296), awS577S0100000_33, AFwS224S0000000_33.get$arr$(326), new AwS577S0100000_33((C03K6) this, 2298), new AwS577S0100000_33((C03K6) this, 2299), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2300), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2301), null, new AwS577S0100000_33((C03K6) this, 2302));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2303), awS577S0100000_33, AFwS224S0000000_33.get$arr$(327), new AwS577S0100000_33((C03K6) this, 2304), new AwS577S0100000_33((C03K6) this, 2305), new AwS577S0100000_33((C03K6) this, 2306), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2307));
        }
        this.LLILZ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        ((BusinessChatActionBarVM) assemVMLazy.getValue()).wQ2().LIZ(System.currentTimeMillis(), null);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.protocol.RemoteIconAndTitleCell, com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C908830Zl3 c908830Zl3) {
        super.onBindItemView(c908830Zl3);
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        C1745106sT c1745106sTWQ2 = ((BusinessChatActionBarVM) assemVMLazy.getValue()).wQ2();
        String str = c908830Zl3.LL;
        Map<String, String> map = c908830Zl3.LLIZLLLIL;
        c1745106sTWQ2.getClass();
        if (str != null && str.length() != 0 && map != null && !map.isEmpty() && !c1745106sTWQ2.LIZLLL.contains(str)) {
            c1745106sTWQ2.LIZLLL.add(str);
            if (Intrinsics.LJFF(str, EnumC1763806vU.TTEC_SHOP_BAR.getBtnId())) {
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("tiktokec_shop_entrance_show", map);
            } else {
                if (!Intrinsics.LJFF(str, EnumC1763806vU.TTEC_SHOWCASE_BAR.getBtnId())) {
                    return;
                }
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("tiktokec_showcase_entrance_show", map);
            }
        }
    }
}
