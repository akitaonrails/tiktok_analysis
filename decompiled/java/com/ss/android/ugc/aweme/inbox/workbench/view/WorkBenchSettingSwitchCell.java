package com.ss.android.ugc.aweme.inbox.workbench.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0P4I;
import X.C11UP;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C635250Ovr;
import X.C635260Ovs;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class WorkBenchSettingSwitchCell extends PowerCell<C635250Ovr> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public C127K LLILLJJLI;
    public C127A LLILLL;
    public C635250Ovr LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchSettingSwitchCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchSettingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchSettingSwitchCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchSettingViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2697);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(197);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2708), awS577S0100000_33, AFwS224S0000000_33.get$arr$(377), new AwS577S0100000_33((C03K6) this, 2683), new AwS577S0100000_33((C03K6) this, 2685), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2687), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2689), null, new AwS577S0100000_33((C03K6) this, 2690));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2684);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2686);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2688);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 103));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2691);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2692);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2693);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2694);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2695);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2696), awS577S0100000_33, AFwS224S0000000_33.get$arr$(375), new AwS577S0100000_33((C03K6) this, 2698), new AwS577S0100000_33((C03K6) this, 2699), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2700), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2701), null, new AwS577S0100000_33((C03K6) this, 2702));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2703), awS577S0100000_33, AFwS224S0000000_33.get$arr$(376), new AwS577S0100000_33((C03K6) this, 2704), new AwS577S0100000_33((C03K6) this, 2705), new AwS577S0100000_33((C03K6) this, 2706), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2707));
        }
        this.LL = assemVMLazy;
    }

    public final void I5() {
        InboxEntranceFunction inboxEntranceFunction;
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            C635250Ovr c635250Ovr = this.LLILZ;
            c127a.LJIILJJIL(!((c635250Ovr == null || (inboxEntranceFunction = c635250Ovr.LL) == null || inboxEntranceFunction.actionStatus != 0) ? false : true));
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
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        InboxEntranceFunction inboxEntranceFunction;
        C127K c127k;
        C635250Ovr c635250Ovr = (C635250Ovr) interfaceC1891350zJl;
        super.onBindItemView(c635250Ovr, list);
        this.LLILZ = c635250Ovr;
        if (list.isEmpty()) {
            Context context = getContext();
            if (context != null && (inboxEntranceFunction = c635250Ovr.LL) != null && (c127k = this.LLILLJJLI) != null) {
                C11UP.LIZIZ(c127k, c635250Ovr.LLILLL);
                c127k.setIcon(new AwS375S0200000_9(inboxEntranceFunction, context, 115));
                c127k.setTitle(inboxEntranceFunction.name);
                I5();
                C127A c127a = this.LLILLL;
                if (c127a != null) {
                    c127a.LJIILLIIL(new C0P4I(this, c635250Ovr, inboxEntranceFunction, c127k, 2));
                    return;
                }
                return;
            }
            return;
        }
        if (!(ListProtector.get(list, 0) instanceof C635260Ovs)) {
            return;
        }
        I5();
    }
}
