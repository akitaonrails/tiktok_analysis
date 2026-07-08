package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0P4M;
import X.C11UP;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C635140Ovg;
import X.C635210Ovn;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class WorkBenchSettingUnsubscribeSwitchCell extends PowerCell<C635140Ovg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public C127K LLILLJJLI;
    public C127A LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchSettingUnsubscribeSwitchCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchSettingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchSettingUnsubscribeSwitchCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchSettingViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2723);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(198);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2734), awS577S0100000_33, AFwS224S0000000_33.get$arr$(378), new AwS577S0100000_33((C03K6) this, 2709), new AwS577S0100000_33((C03K6) this, 2711), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2713), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2715), null, new AwS577S0100000_33((C03K6) this, 2716));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2710);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2712);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2714);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 104));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2717);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2718);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2719);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2720);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2721);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2722), awS577S0100000_33, AFwS224S0000000_33.get$arr$(379), new AwS577S0100000_33((C03K6) this, 2724), new AwS577S0100000_33((C03K6) this, 2725), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2726), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2727), null, new AwS577S0100000_33((C03K6) this, 2728));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2729), awS577S0100000_33, AFwS224S0000000_33.get$arr$(380), new AwS577S0100000_33((C03K6) this, 2730), new AwS577S0100000_33((C03K6) this, 2731), new AwS577S0100000_33((C03K6) this, 2732), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2733));
        }
        this.LL = assemVMLazy;
    }

    public final void I5() {
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            C635140Ovg item = getItem();
            c127a.LJIILJJIL(item != null ? item.LLILLL : false);
        }
        C127A c127a2 = this.LLILLL;
        if (c127a2 != null) {
            c127a2.LJIIJJI(false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abs, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LLILLJJLI = c127k;
        C127A c127a = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLL = c127a;
        if (c127a != null) {
            c127a.LJIILLIIL(new C0P4M(this, 2));
        }
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C635140Ovg c635140Ovg = (C635140Ovg) interfaceC1891350zJl;
        super.onBindItemView(c635140Ovg, list);
        setItem(c635140Ovg);
        if (list.isEmpty()) {
            C127K c127k = this.LLILLJJLI;
            if (c127k != null) {
                C11UP.LIZIZ(c127k, c635140Ovg.LLILZLL);
                c127k.setTitle(c635140Ovg.LLILZ);
                I5();
                return;
            }
            return;
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ == null || !(objLJJJLZIJ instanceof C635210Ovn)) {
            return;
        }
        I5();
    }
}
