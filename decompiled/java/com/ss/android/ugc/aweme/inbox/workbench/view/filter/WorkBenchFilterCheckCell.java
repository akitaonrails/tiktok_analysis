package com.ss.android.ugc.aweme.inbox.workbench.view.filter;

import X.AnonymousClass1276;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0P4M;
import X.C11UP;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C623820OdQ;
import X.C623840OdS;
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
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class WorkBenchFilterCheckCell extends PowerCell<C623820OdQ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public C127K LLILLJJLI;
    public AnonymousClass1276 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchFilterCheckCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchFilterCheckCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2749);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(199);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2760), awS577S0100000_33, AFwS224S0000000_33.get$arr$(381), new AwS577S0100000_33((C03K6) this, 2735), new AwS577S0100000_33((C03K6) this, 2737), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2739), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2741), null, new AwS577S0100000_33((C03K6) this, 2742));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2736);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2738);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2740);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 105));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2743);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2744);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2745);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2746);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2747);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2748), awS577S0100000_33, AFwS224S0000000_33.get$arr$(382), new AwS577S0100000_33((C03K6) this, 2750), new AwS577S0100000_33((C03K6) this, 2751), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2752), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2753), null, new AwS577S0100000_33((C03K6) this, 2754));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2755), awS577S0100000_33, AFwS224S0000000_33.get$arr$(383), new AwS577S0100000_33((C03K6) this, 2756), new AwS577S0100000_33((C03K6) this, 2757), new AwS577S0100000_33((C03K6) this, 2758), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2759));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C623820OdQ c623820OdQ = (C623820OdQ) interfaceC1891350zJl;
        super.onBindItemView(c623820OdQ);
        C127K c127k = this.LLILLJJLI;
        if (c127k != null) {
            c127k.setTitle(c623820OdQ.LL);
        }
        C127K c127k2 = this.LLILLJJLI;
        if (c127k2 != null) {
            C11UP.LIZIZ(c127k2, c623820OdQ.LLILZIL);
        }
        AnonymousClass1276 anonymousClass1276 = this.LLILLL;
        if (anonymousClass1276 != null) {
            anonymousClass1276.LJIILJJIL(c623820OdQ.LLILZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aa7, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.workbench_filter_item_cell);
        this.LLILLJJLI = c127k;
        AnonymousClass1276 anonymousClass1276 = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof AnonymousClass1276) {
            anonymousClass1276 = (AnonymousClass1276) accessory;
        }
        this.LLILLL = anonymousClass1276;
        if (anonymousClass1276 != null) {
            anonymousClass1276.LJIIZILJ(0);
        }
        AnonymousClass1276 anonymousClass12762 = this.LLILLL;
        if (anonymousClass12762 != null) {
            anonymousClass12762.LJIILLIIL(new C0P4M(this, 3));
        }
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C127K c127k;
        AnonymousClass1276 anonymousClass1276;
        C623820OdQ c623820OdQ = (C623820OdQ) interfaceC1891350zJl;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C623840OdS) {
            C623840OdS c623840OdS = (C623840OdS) objLJJJLZIJ;
            if (!c623840OdS.LIZ && (anonymousClass1276 = this.LLILLL) != null) {
                anonymousClass1276.LJIILJJIL(c623820OdQ.LLILZ);
            }
            if (!c623840OdS.LIZIZ && (c127k = this.LLILLJJLI) != null) {
                C11UP.LIZIZ(c127k, c623820OdQ.LLILZIL);
            }
        }
    }
}
