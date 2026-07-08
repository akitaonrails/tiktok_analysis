package com.ss.android.ugc.aweme.feed.adapter;

import X.C019F;
import X.C019V;
import X.C01D1;
import X.C13LE;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C230400uk;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616170OEt;
import X.C616180OEu;
import X.C616190OEv;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoPlaySearchViewModel extends AssemViewModel<C230400uk> {
    public static final C616170OEt LL = new C616170OEt();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C230400uk(null);
    }

    public static final VideoPlaySearchViewModel vQ2(Fragment fragment) {
        AssemVMLazy assemVMLazy;
        LL.getClass();
        if (fragment.getActivity() != null && !fragment.isDetached()) {
            InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoPlaySearchViewModel.class);
            C019V c019v = new C019V(c19719912DlLIZ);
            C616190OEv c616190OEv = new C616190OEv();
            if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c019v, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new C616180OEu(fragment), c616190OEv, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c019v, new AwS553S0100000_9(fragment, 1788), c616190OEv, null, null, null);
            } else if (Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c019v, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) fragment, 1789), c616190OEv, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C616170OEt.LIZ;
            return (VideoPlaySearchViewModel) assemVMLazy.getValue();
        }
        return null;
    }
}
