package com.ss.android.ugc.aweme.poi.mapmode;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C1174660gfo;
import X.C1174680gfq;
import X.C123100dR;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C443120HZe;
import X.C444690HcB;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1174670gfp;
import X.EnumC444680HcA;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeErrorFragment extends BaseFragment {
    public static final C1174680gfq LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE+HELIOSKTUhJis2ZhUjIAIyOAgjLSoWOjcjOwkhKSIhLCEn";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(383), "error_type", EnumC1174670gfp.class);
    public final AssemVMLazy LLIZLLLIL;
    public C1749280vcc LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeErrorFragment.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new C1174680gfq();
    }

    public PoiMapModeErrorFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 559);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(497);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1442), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS562S0100000_18((Fragment) this, 1443), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1444), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(496));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C443120HZe c443120HZe;
        EnumC444680HcA enumC444680HcA;
        String string;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        PoiMapModeDataParams poiMapModeDataParams;
        String regionName;
        super.onViewCreated(view, bundle);
        EnumC1174670gfp enumC1174670gfp = (EnumC1174670gfp) this.LLIZ.getValue();
        int[] iArr = C1174660gfo.LIZ;
        int i = iArr[enumC1174670gfp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C19EG c19egLIZ = C724240Sb0.LIZ(this);
                        if (c19egLIZ == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJI(c19egLIZ, null), "source_default_key", PoiMapModeDataParams.class, null)) == null || (poiMapModeDataParams = (PoiMapModeDataParams) interfaceC1555100qZQLIZIZ.getSource()) == null || (regionName = poiMapModeDataParams.getRegionName()) == null || !C123100dR.LIZ(regionName) || (string = C20642515q3.LJFF().getString(2131840567, regionName)) == null) {
                            string = "Return to city";
                        }
                        c443120HZe = new C443120HZe(C20642515q3.LJI(2131844805), string, new AwS562S0100000_18(this, 1626));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c443120HZe = new C443120HZe(C20642515q3.LJI(2131844805), C20642515q3.LJI(2131840568), new AwS562S0100000_18(this, 1466));
                }
            } else {
                c443120HZe = new C443120HZe(C20642515q3.LJI(2131823129), C20642515q3.LJI(2131829446), new AwS562S0100000_18(this, 1454));
            }
        } else {
            c443120HZe = new C443120HZe(C20642515q3.LJI(2131829437), C20642515q3.LJI(2131829446), new AwS562S0100000_18(this, 1465));
        }
        if (getContext() != null) {
            C1749280vcc c1749280vcc = this.LLJ;
            if (c1749280vcc != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = (String) c443120HZe.getFirst();
                c1722300uv6.LJIIIZ = new AwS591S0100000_12(c443120HZe, (C443120HZe<String, String, ? extends Function0<Unit>>) 641);
                c1749280vcc.setStatus(c1722300uv6);
            }
            int i2 = iArr[((EnumC1174670gfp) this.LLIZ.getValue()).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new C1954807lC();
                    }
                    enumC444680HcA = EnumC444680HcA.NO_CONTENT;
                } else {
                    enumC444680HcA = EnumC444680HcA.SOMETHING_WRONG;
                }
            } else {
                enumC444680HcA = EnumC444680HcA.NO_NETWORK;
            }
            C444690HcB.LIZ(enumC444680HcA, this.LLJ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1749280vcc c1749280vcc;
        Context context = getContext();
        C19GS c19gs = null;
        if (context == null) {
            c1749280vcc = null;
        } else {
            c1749280vcc = new C1749280vcc(context, null, 6);
            C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(219))));
            c1749280vcc.setLayoutVariant(1);
            this.LLJ = c1749280vcc;
        }
        if (!(c1749280vcc instanceof View)) {
            c1749280vcc = null;
        }
        if (c1749280vcc != null) {
            try {
                ViewTreeLifecycleOwner.set(c1749280vcc, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(c1749280vcc, this);
                c1749280vcc.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return c1749280vcc;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return c1749280vcc;
    }
}
