package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C1198290hHv;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1584506Ih;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C18JG;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C339190DRl;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1198390hI5;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.PoiBaseFragment;
import com.ss.android.ugc.aweme.poi.content.poicampaign.FullPageStatusAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.IMyMomentsAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiCampaignMainFragment extends PoiBaseFragment implements InterfaceC1740760vOs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEwJys4LCEnZjUjICHELIOSwyJTUtICg9ZigtICEjKSIpZx88IQYtJD8yISIiBC46JgM+KCg+LSs4";
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(296), "enter_from", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(298), "ucode", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(299), "type", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(297), "hide_shoot", Integer.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(319), "source_btm_token", Void.class);
    public String LLJILLL = "";
    public FrameLayout LLJJ;
    public ViewGroup LLJJI;
    public TuxIconView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final PoiCampaignMainFragment$ability$1 LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCampaignMainFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/mainpage/MyMomentsSharedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment
    public final void SR() {
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment
    public final String UR() {
        return "poi_publish_campaign";
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment
    public final String VR() {
        return "aweme://poi/map_mode";
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "a4257.b19876";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment$ability$1] */
    public PoiCampaignMainFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MyMomentsSharedViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 968);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(320);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 969), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 970), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 971), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy;
        this.LLJJJ = new IMyMomentsAbility() { // from class: com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment$ability$1
            @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.IMyMomentsAbility
            public final void lu1() {
                MyMomentsSharedViewModel myMomentsSharedViewModelWR = this.LL.WR();
                String str = (String) this.LL.LLJI.getValue();
                myMomentsSharedViewModelWR.setState(AFwS256S0000000_18.get$arr$(881));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(myMomentsSharedViewModelWR), null, null, new C1198290hHv(myMomentsSharedViewModelWR, null, str, null), 3);
            }
        };
    }

    public final MyMomentsSharedViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (MyMomentsSharedViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void ZR(EnumC1198390hI5 enumC1198390hI5) {
        aS(this.LLJJ, Collections.singletonList(C13LE.LIZ(FullPageStatusAssem.class)));
        C1584506Ih.LIZIZ(this.LLJJ);
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(enumC1198390hI5, this, 83), 3);
    }

    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strValueOf;
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(317));
        activityConfiguration(AFwS256S0000000_18.get$arr$(318));
        try {
            String str = (String) this.LLJI.getValue();
            CharsKt__CharJVMKt.checkRadix(23);
            strValueOf = String.valueOf(CastLongProtector.parseLong(str, 23));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strValueOf = (String) this.LLJI.getValue();
        }
        this.LLJILLL = strValueOf;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this.LLJJJ, IMyMomentsAbility.class, null, this);
        C18JG.LJII(this, getBtmPageCode(), (String) ((Void) this.LLJILJILJ.getValue()));
    }

    public final void aS(ViewGroup viewGroup, List<? extends C13IQ<? extends AbstractC738140SxQ>> list) {
        C339190DRl.LIZIZ(viewGroup);
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        Iterator<? extends C13IQ<? extends AbstractC738140SxQ>> it2 = list.iterator();
        while (it2.hasNext()) {
            C723850SaN.LJIIIIZZ(this, it2.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    @Override // com.ss.android.ugc.aweme.poi.PoiBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxv, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
