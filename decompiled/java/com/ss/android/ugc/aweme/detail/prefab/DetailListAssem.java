package com.ss.android.ugc.aweme.detail.prefab;

import X.C01GW;
import X.C0VWN;
import X.C1558360qeg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C736680Sv4;
import Y.AsS36S0100000_9;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.prefab.ListAssem;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DetailListAssem extends ListAssem {
    public boolean LLJJIJIL = true;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 98));

    public final void yp() {
        AssemListViewModel<?, ?, ?> assemListViewModelTp = tp();
        AssemViewModel.asyncSubscribe$default(assemListViewModelTp, new C2217381BqS() { // from class: X.0Oit
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC636270OxV) obj).getRefreshState();
            }
        }, null, new AwS588S0100000_9(this, 29), null, null, 26, null);
        C736680Sv4.LJIIIIZZ(this, assemListViewModelTp, new C2217381BqS() { // from class: X.0Oiu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC627270Oiz) obj).getListState();
            }
        }, null, new AwS623S0100000_9(this, 11), 6);
        AssemViewModel.asyncSubscribe$default(tp(), new C2217381BqS() { // from class: X.0Ois
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC636270OxV) obj).getRefreshState();
            }
        }, null, new AwS588S0100000_9(this, 78), new AwS553S0100000_9(this, 99), new AwS588S0100000_9(this, 79), 2, null);
    }

    public final void zp() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            mp().addOnScrollListener(new AsS36S0100000_9(C1558360qeg.LJFF(fragmentLJI, null), 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        String str = (String) this.LLJJJ.getValue();
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_detail_scroll_fps");
            C0VWN.LIZ(C2188811AlT.LIZIZ(sbLIZ), false).LIZIZ(mp());
        }
    }
}
