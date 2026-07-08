package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.AbstractViewOnClickListenerC635100Ovc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0DTR;
import X.C1196320hEk;
import X.C12ES;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C623850OdT;
import X.C623970Odf;
import X.C635220Ovo;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class WorkBenchCardCell extends PowerCell<C623970Odf> implements InterfaceC713360RyY, WorkbenchCardAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(370));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2662));
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchCardCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchCardListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(WorkBenchCardCell.class, "mainVm", "getMainVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchViewModel;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aa0;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1142398310) {
            return null;
        }
        return this;
    }

    public WorkBenchCardCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchCardListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2661);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(196);
        Object obj2 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, obj2)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2648), awS577S0100000_33, AFwS224S0000000_33.get$arr$(372), new AwS577S0100000_33((C03K6) this, 2638), new AwS577S0100000_33((C03K6) this, 2649), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2652), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2655), null, new AwS577S0100000_33((C03K6) this, 2658));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2634);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2636);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2639);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 101));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2644);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2647);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2650);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2653);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2656);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2659), awS577S0100000_33, AFwS224S0000000_33.get$arr$(371), new AwS577S0100000_33((C03K6) this, 2664), new AwS577S0100000_33((C03K6) this, 2666), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2668), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2670), null, new AwS577S0100000_33((C03K6) this, 2672));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2673), awS577S0100000_33, AFwS224S0000000_33.get$arr$(373), new AwS577S0100000_33((C03K6) this, 2675), new AwS577S0100000_33((C03K6) this, 2677), new AwS577S0100000_33((C03K6) this, 2680), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2682));
        }
        this.LLILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(WorkBenchViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 2630);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(195);
        if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2633), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(369), new AwS577S0100000_33((C03K6) this, 2637), new AwS577S0100000_33((C03K6) this, 2640), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2642), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 2645), null, new AwS577S0100000_33((C03K6) this, 2651));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 2654);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2657);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 2660);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj2, awS577S0100000_3311, 102));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 2663);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 2665);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 2667);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 2669);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 2671);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2674), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(374), new AwS577S0100000_33((C03K6) this, 2676), new AwS577S0100000_33((C03K6) this, 2678), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2679), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 2681), null, new AwS577S0100000_33((C03K6) this, 2631));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2632), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(368), new AwS577S0100000_33((C03K6) this, 2635), new AwS577S0100000_33((C03K6) this, 2641), new AwS577S0100000_33((C03K6) this, 2643), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 2646));
        }
        this.LLILZ = assemVMLazy2;
    }

    public final WorkBenchCardListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (WorkBenchCardListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility
    public final InterfaceC665370Q7z LLIIJLIL() {
        return C1558420qem.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility
    public final int getTabId() {
        return I5().LL;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 239));
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, WorkbenchCardAbility.class, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C623970Odf c623970Odf = (C623970Odf) interfaceC1891350zJl;
        super.onBindItemView(c623970Odf);
        MissionStruct missionStruct = c623970Odf.LL;
        if (missionStruct != null) {
            AbstractViewOnClickListenerC635100Ovc abstractViewOnClickListenerC635100Ovc = (AbstractViewOnClickListenerC635100Ovc) this.itemView.findViewById(R.id.workbench_card_top_container);
            boolean z = true;
            if (abstractViewOnClickListenerC635100Ovc != null) {
                AssemVMLazy assemVMLazy = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
                abstractViewOnClickListenerC635100Ovc.e0(missionStruct, (WorkBenchViewModel) assemVMLazy.getValue(), this);
            }
            AbstractViewOnClickListenerC635100Ovc abstractViewOnClickListenerC635100Ovc2 = (AbstractViewOnClickListenerC635100Ovc) this.itemView.findViewById(R.id.workbench_card_middle_container);
            if (abstractViewOnClickListenerC635100Ovc2 != null) {
                AssemVMLazy assemVMLazy2 = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILZIL;
                abstractViewOnClickListenerC635100Ovc2.e0(missionStruct, (WorkBenchViewModel) assemVMLazy2.getValue(), this);
            }
            AbstractViewOnClickListenerC635100Ovc abstractViewOnClickListenerC635100Ovc3 = (AbstractViewOnClickListenerC635100Ovc) this.itemView.findViewById(R.id.workbench_card_bottom_container);
            if (abstractViewOnClickListenerC635100Ovc3 != null) {
                AssemVMLazy assemVMLazy3 = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLILZIL;
                abstractViewOnClickListenerC635100Ovc3.e0(missionStruct, (WorkBenchViewModel) assemVMLazy3.getValue(), this);
            }
            if (this.itemView.findViewById(R.id.workbench_card_bottom_container) == null || !C635220Ovo.h0(missionStruct)) {
                z = false;
            }
            if (z) {
                View viewFindViewById = this.itemView.findViewById(R.id.workbench_card_bottom_divider);
                if (viewFindViewById != null) {
                    C0DTR.LIZIZ(viewFindViewById);
                    return;
                }
                return;
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.workbench_card_bottom_divider);
            if (viewFindViewById2 == null) {
                return;
            }
            C12ES.LJIILL(0, viewFindViewById2);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility
    public final void cQ2(String str, String str2) {
        MissionStruct missionStruct;
        C623970Odf item = getItem();
        if (item != null) {
            missionStruct = item.LL;
        } else {
            missionStruct = null;
        }
        int i = I5().LL;
        if (missionStruct != null) {
            C623850OdT.LIZ(missionStruct, i, "click", str, str2);
        }
    }
}
