package com.ss.android.ugc.aweme.poi.osp.assem;

import X.AbstractC1177930gl5;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1193170h9f;
import X.C1193250h9n;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C166V;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS47S0001000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitGuidelineSheetAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C166V LLJJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 421));
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public long LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitGuidelineSheetAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitGuidelineSheetLayoutBinding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiOrderSubmitGuidelineSheetAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/osp/PoiOrderSubmitViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PoiOrderSubmitGuidelineSheetAssem.class, "sheetViewModel", "getSheetViewModel()Lcom/ss/android/ugc/aweme/poi/osp/assem/PoiOrderSubmitSheetViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PoiOrderSubmitGuidelineSheetAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiOrderSubmitViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1649), AFwS256S0000000_18.get$arr$(528), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiOrderSubmitSheetViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1650), AFwS256S0000000_18.get$arr$(529), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1647));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1648));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e5g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085 A[PHI: r7
      0x0085: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String), (r7v6 java.lang.String) binds: [B:38:0x0074, B:42:0x007d, B:44:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[PHI: r7 r16
      0x008c: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v6 java.lang.String) binds: [B:46:0x008a, B:44:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r16v3 java.util.Map<java.lang.String, java.lang.Object>) = (r16v0 java.util.Map<java.lang.String, java.lang.Object>), (r16v4 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:46:0x008a, B:44:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092 A[PHI: r7 r16
      0x0092: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:46:0x008a, B:48:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r16v2 java.util.Map<java.lang.String, java.lang.Object>) = (r16v0 java.util.Map<java.lang.String, java.lang.Object>), (r16v3 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:46:0x008a, B:48:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void closePanel() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.assem.PoiOrderSubmitGuidelineSheetAssem.closePanel():void");
    }

    public final BottomSheetBehavior<RadiusLayout> hp() {
        return (BottomSheetBehavior) this.LLJJIJI.getValue();
    }

    public final PoiOrderSubmitSheetViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PoiOrderSubmitSheetViewModel) assemVMLazy.getValue();
    }

    public final C1193250h9n kp() {
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (C1193250h9n) c166v.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.p9(kp().LLILZ, new View.OnClickListener() { // from class: X.0h9w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 67), kp().LLILLJJLI);
        hp().setState(5);
        hp().addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0h9i
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view2, float f) {
                C786410Ut5.T4(this.LIZ.kp().LLILLJJLI, f);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view2) {
                C1186030gy9.LIZ(new AwS47S0001000_2(i, 2));
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        return;
                    }
                    C786410Ut5.T4(this.LIZ.kp().LLILLJJLI, 0.0f);
                    C339190DRl.LIZIZ(this.LIZ.kp().LLILLJJLI);
                    this.LIZ.ip().vQ2(EnumC1192930h9H.GUIDELINE);
                    return;
                }
                C786410Ut5.T4(this.LIZ.kp().LLILLJJLI, 1.0f);
                this.LIZ.ip().setState(new AwS597S0100000_18(EnumC1192930h9H.GUIDELINE, 1134));
            }
        });
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0h9R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1193040h9S) obj).LL;
            }
        }, null, new C1193170h9f(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0h9V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1193040h9S) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 139), 6);
    }
}
