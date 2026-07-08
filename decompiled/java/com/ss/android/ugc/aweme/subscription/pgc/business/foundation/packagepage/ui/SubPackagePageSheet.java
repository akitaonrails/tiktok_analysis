package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui;

import X.C019F;
import X.C01D1;
import X.C0HE8;
import X.C0KC0;
import X.C0KC2;
import X.C0KC4;
import X.C0KC5;
import X.C0KCC;
import X.C0KDQ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C513450KBr;
import X.C513470KBt;
import X.C513520KBy;
import X.C513570KCd;
import X.C513880KDi;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC513420KBo;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePageSheet extends SubscriptionBaseSheet {
    public static final C513520KBy LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2HELIOSOzZiLyAmJiEtPSY8Jms8KCw4KSIpOS40LWs5IGEAPSccKCw4KSIpGS40LRYkLCon";
    public EnumC513420KBo LLJJJJLIIL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public String LLJLILLLLZIIL;
    public final AssemVMLazy LLJLLIL;
    public ViewGroup LLJLLL;
    public C0KC4 LLJZ;
    public Map<String, String> LLJJL = new LinkedHashMap();
    public C0KCC LLJL = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0, 0, false, -1, 15);
    public final LinkedHashSet<String> LLJLL = new LinkedHashSet<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackagePageSheet.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new C513520KBy();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return R.layout.ff9;
    }

    public SubPackagePageSheet() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 446);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(205);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 447), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 448), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 449), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLIL = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        return this.LLJLIL ? 0.5f : 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0HN5 dS() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageSheet.dS():X.0HN5");
    }

    public final C0KC4 gS() {
        if (this.LLJZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0KC4.class, null);
            this.LLJZ = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJZ;
    }

    public final SubPackagePageAssemVM hS() {
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (SubPackagePageAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0KC4 c0kc4GS;
        C0KC5 c0kc5;
        C0KC5 c0kc52;
        C0KC5 c0kc53;
        super.onDestroy();
        if (hS().LLILLJJLI) {
            C0KC4 c0kc4GS2 = gS();
            if (c0kc4GS2 != null && (c0kc53 = c0kc4GS2.LLIZ) != null) {
                c0kc53.LIZIZ = "iap_loading";
            }
        } else if (hS().LL && (c0kc4GS = gS()) != null && (c0kc5 = c0kc4GS.LLIZ) != null) {
            c0kc5.LIZIZ = "tpl_loading";
        }
        C0KDQ c0kdq = C0KDQ.LIZ;
        String str = this.LLJL.LJII;
        Map<String, String> map = this.LLJJL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJLIIIJLLLLLLLZ;
        C0KC4 c0kc4GS3 = gS();
        String str2 = (c0kc4GS3 == null || (c0kc52 = c0kc4GS3.LLIZ) == null) ? null : c0kc52.LIZIZ;
        c0kdq.getClass();
        C0KDQ.LJIIIIZZ(jCurrentTimeMillis, str, map, str2);
        if (Intrinsics.LJFF(this.LLJL.LJIIJJI, Boolean.TRUE)) {
            C513470KBt.LJ();
        } else {
            ((LinkedHashMap) C513470KBt.LIZIZ).clear();
            C513470KBt.LIZJ = null;
        }
        new C513570KCd(hashCode());
        C513880KDi.LIZ = "1";
        C513880KDi.LIZIZ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        C0KCC c0kcc;
        C0KCC c0kcc2;
        C0KC4 c0kc4GS;
        C0KCC c0kcc3;
        boolean z;
        C0KC4 c0kc4GS2;
        C0KC5 c0kc5;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if ((arguments == null || (string = arguments.getString("pgc_sheet_style_key")) == null) && (string = this.LLJLILLLLZIIL) == null) {
            string = this.LLJJL.get("pgc_sheet_style_key");
        }
        this.LLJLILLLLZIIL = string;
        C513520KBy c513520KBy = LLJZIJLIL;
        C0KC4 c0kc4GS3 = gS();
        c513520KBy.getClass();
        C513520KBy.LIZ(this, c0kc4GS3);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0KC4(), C0KC4.class, "source_default_key");
        C0KC4 c0kc4GS4 = gS();
        if (c0kc4GS4 != null) {
            c0kc4GS4.LL = this.LLJL;
        }
        gS();
        gS();
        C0KC4 c0kc4GS5 = gS();
        if (c0kc4GS5 != null) {
            c0kc4GS5.LLIZLLLIL = C513450KBr.LIZ(this.LLJL.LJJIFFI);
        }
        C0KC4 c0kc4GS6 = gS();
        if (c0kc4GS6 != null && (c0kc5 = c0kc4GS6.LLIZ) != null) {
            EnumC513420KBo enumC513420KBoLIZ = this.LLJJJJLIIL;
            if (enumC513420KBoLIZ == null) {
                C0KCC c0kcc4 = this.LLJL;
                enumC513420KBoLIZ = C513470KBt.LIZ(c0kcc4.LIZ, c0kcc4.LJI, true);
            }
            c0kc5.LIZJ = enumC513420KBoLIZ;
        }
        C0KC4 c0kc4GS7 = gS();
        if (c0kc4GS7 != null) {
            c0kc4GS7.LLILLJJLI = this.LLJJLIIIJLLLLLLLZ;
        }
        C0KC4 c0kc4GS8 = gS();
        if (c0kc4GS8 != null) {
            c0kc4GS8.LL = this.LLJL;
        }
        C0KC4 c0kc4GS9 = gS();
        if (c0kc4GS9 != null) {
            c0kc4GS9.LLILZ = Intrinsics.LJFF(this.LLJL.LJIIL, "h5");
        }
        C0KC4 c0kc4GS10 = gS();
        if (c0kc4GS10 != null) {
            c0kc4GS10.LLILZIL = Intrinsics.LJFF(this.LLJL.LJIIL, "homepage-entry");
        }
        C0KC4 c0kc4GS11 = gS();
        boolean z2 = false;
        if (c0kc4GS11 != null) {
            if (Intrinsics.LJFF(this.LLJL.LJIIL, "homepage") || ((c0kc4GS2 = gS()) != null && c0kc4GS2.LLILZIL)) {
                z = true;
            } else {
                z = false;
            }
            c0kc4GS11.LLILZLL = z;
        }
        C0KC4 c0kc4GS12 = gS();
        if (c0kc4GS12 == null || (c0kcc3 = c0kc4GS12.LL) == null || c0kcc3.LJIIJJI == null) {
            if (Intrinsics.LJFF(this.LLJL.LJIILLIIL, "")) {
                C0KC4 c0kc4GS13 = gS();
                if (c0kc4GS13 != null && (c0kcc2 = c0kc4GS13.LL) != null) {
                    C0KC4 c0kc4GS14 = gS();
                    if ((c0kc4GS14 == null || !c0kc4GS14.LLILZ) && ((c0kc4GS = gS()) == null || !c0kc4GS.LLILZLL)) {
                        z2 = true;
                    }
                    c0kcc2.LJIIJJI = Boolean.valueOf(z2);
                }
            } else {
                C0KC4 c0kc4GS15 = gS();
                if (c0kc4GS15 != null && (c0kcc = c0kc4GS15.LL) != null) {
                    c0kcc.LJIIJJI = Boolean.valueOf(!Intrinsics.LJFF(this.LLJL.LJIILLIIL, CardStruct.IStatusCode.DEFAULT));
                }
            }
        }
        C0KC4 c0kc4GS16 = gS();
        if (c0kc4GS16 != null) {
            c0kc4GS16.LLJILJIL = new AwS551S0100000_7(this, 741);
        }
        C0KC4 c0kc4GS17 = gS();
        if (c0kc4GS17 != null) {
            c0kc4GS17.LLJILJILJ = new AwS551S0100000_7(this, 742);
        }
        C0KC4 c0kc4GS18 = gS();
        if (c0kc4GS18 != null) {
            c0kc4GS18.LLJILLL = new C0KC2(this);
        }
        C0KC4 c0kc4GS19 = gS();
        if (c0kc4GS19 != null) {
            c0kc4GS19.LLJJ = getChildFragmentManager();
        }
        C0KC4 c0kc4GS20 = gS();
        if (c0kc4GS20 != null) {
            c0kc4GS20.LLJ = this.LLJL.LJIIJ;
        }
        kS(C0KC0.LOADING.getKey(), true);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(C0HE8.LIZ(requireActivity()));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kS(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            if (r9 == 0) goto La0
            java.util.LinkedHashSet<java.lang.String> r0 = r7.LLJLL
            r0.add(r8)
        L7:
            X.0HN5 r4 = r7.dS()
            java.util.LinkedHashSet<java.lang.String> r1 = r7.LLJLL
            X.0KC0 r0 = X.C0KC0.ERROR
            java.lang.String r0 = r0.getKey()
            boolean r0 = r1.contains(r0)
            r2 = 5
            r3 = 0
            r6 = 1063675494(0x3f666666, float:0.9)
            r5 = 0
            if (r0 != 0) goto L79
            java.util.LinkedHashSet<java.lang.String> r1 = r7.LLJLL
            X.0KC0 r0 = X.C0KC0.EMPTY
            java.lang.String r0 = r0.getKey()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L79
            java.util.LinkedHashSet<java.lang.String> r1 = r7.LLJLL
            X.0KC0 r0 = X.C0KC0.ABNORMAL
            java.lang.String r0 = r0.getKey()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L79
            java.util.LinkedHashSet<java.lang.String> r1 = r7.LLJLL
            X.0KC0 r0 = X.C0KC0.LOADING
            java.lang.String r0 = r0.getKey()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L66
            float r0 = r4.LIZIZ
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            float r0 = r1.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L95
            float r0 = r1.floatValue()
            X.0HKr r2 = new X.0HKr
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 6
            r2.<init>(r1, r3, r0)
            r3 = r2
        L66:
            r7.LLJJJ = r3
            android.view.View r2 = r7.getView()
            if (r2 == 0) goto L78
            Y.ARunnableS106S0100000_6 r1 = new Y.ARunnableS106S0100000_6
            r0 = 228(0xe4, float:3.2E-43)
            r1.<init>(r7, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        L78:
            return
        L79:
            float r0 = r4.LIZJ
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            float r0 = r1.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8b
            float r6 = r1.floatValue()
        L8b:
            X.0HKr r1 = new X.0HKr
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r1.<init>(r3, r0, r2)
            goto L9e
        L95:
            X.0HKr r1 = new X.0HKr
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r1.<init>(r3, r0, r2)
        L9e:
            r3 = r1
            goto L66
        La0:
            java.util.LinkedHashSet<java.lang.String> r0 = r7.LLJLL
            r0.remove(r8)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageSheet.kS(java.lang.String, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJLLL = (ViewGroup) view.findViewById(R.id.pyc);
        hS().LLILLL = C1558360qeg.LJFF(this, null);
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), hS(), ISubPackagePageAbility.class, null, this);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 465), 3);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 549), 3);
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 469), 3);
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 471), 3);
    }

    public final void iS(int i, View view, Function1<? super View, Unit> function1) {
        ViewGroup viewGroup;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(C0HE8.LIZ(requireActivity()));
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        function1.invoke(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
    }
}
