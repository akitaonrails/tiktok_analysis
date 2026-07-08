package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1092560eXO;
import X.C1146360fwA;
import X.C1161920gLG;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AnchorActivityCell extends PowerCell<C1146360fwA> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnchorActivityCell.class, "centerVM", "getCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/gift/center/GiftAnchorPanelGiftPageCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AnchorActivityCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelGiftPageCenterViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 74);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(16);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 85), awS577S0100000_33, AFwS224S0000000_33.get$arr$(15), new AwS577S0100000_33((C03K6) this, 60), new AwS577S0100000_33((C03K6) this, 62), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 64), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 66), null, new AwS577S0100000_33((C03K6) this, 67));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 61);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 63);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 65);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 2));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 68);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 69);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 70);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 71);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 72);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 73), awS577S0100000_33, AFwS224S0000000_33.get$arr$(13), new AwS577S0100000_33((C03K6) this, 75), new AwS577S0100000_33((C03K6) this, 76), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 77), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 78), null, new AwS577S0100000_33((C03K6) this, 79));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 80), awS577S0100000_33, AFwS224S0000000_33.get$arr$(14), new AwS577S0100000_33((C03K6) this, 81), new AwS577S0100000_33((C03K6) this, 82), new AwS577S0100000_33((C03K6) this, 83), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 84));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1092560eXO c1092560eXO;
        C1146360fwA c1146360fwA;
        C1146360fwA c1146360fwA2 = (C1146360fwA) interfaceC1891350zJl;
        super.onBindItemView(c1146360fwA2);
        View view = this.itemView;
        if ((view instanceof C1092560eXO) && (c1092560eXO = (C1092560eXO) view) != null) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 4068);
            if (c1092560eXO.LL == null && c1092560eXO.getChildCount() == 0) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(c1092560eXO.getContext(), c1146360fwA2.LL, this, true, new AwS226S0300000_17(c1146360fwA2, (C1146360fwA) c1092560eXO, (C1092560eXO) awS577S0100000_33, (Function0<Unit>) 13));
                c1092560eXO.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                c1092560eXO.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -1);
            } else if (c1092560eXO.LL != null && (c1146360fwA = c1092560eXO.LLILLJJLI) != null && (c1146360fwA.LLILLJJLI != c1146360fwA2.LLILLJJLI || c1146360fwA.LLILZ != c1146360fwA2.LLILZ)) {
                c1092560eXO.LIZ(c1146360fwA2, this, awS577S0100000_33);
            }
            c1092560eXO.LLILLJJLI = c1146360fwA2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateItemView(android.view.ViewGroup r8) {
        /*
            r7 = this;
            X.0eXO r6 = new X.0eXO
            android.content.Context r5 = r8.getContext()
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r7.LL
            X.1Bqa<java.lang.Object>[] r0 = com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list.AnchorActivityCell.LLILLJJLI
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r1.getValue()
            X.002o r0 = r0.getState()
            X.0fwR r0 = (X.C1146530fwR) r0
            X.0fwH r0 = r0.LLILLJJLI
            X.0fwA r0 = r0.LIZ
            if (r0 == 0) goto L28
            long r3 = r0.LLILLL
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L28
            int r1 = (int) r3
        L23:
            r0 = 6
            r6.<init>(r1, r0, r5)
            return r6
        L28:
            r1 = 177(0xb1, float:2.48E-43)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list.AnchorActivityCell.onCreateItemView(android.view.ViewGroup):android.view.View");
    }
}
