package com.ss.android.ugc.aweme.hangout.component.tab;

import X.C13BV;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C477500Io0;
import X.C478830Iq9;
import X.EnumC479370Ir1;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangoutPageDataSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TabModule;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS373S0200000_7;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLivePlayTabVM extends AssemViewModel<C478830Iq9> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            return new C478830Iq9(C13BV.INSTANCE, EnumC479370Ir1.DEFAULT);
        }
        List<TabModule> list = MultiGuestHangoutPageDataSetting.INSTANCE.getSettingValue().tabModuleArray;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (TabModule tabModule : list) {
            MGModuleTab mGModuleTab = new MGModuleTab();
            mGModuleTab.name = tabModule.name;
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            String str = tabModule.title;
            c477500Io0.getClass();
            String strLJIIL = C477500Io0.LJIIL(str);
            if (strLJIIL == null) {
                strLJIIL = "";
            }
            mGModuleTab.title = strLJIIL;
            mGModuleTab.innerFeedMgAggId = tabModule.innerFeedMgAggId;
            arrayList.add(mGModuleTab);
        }
        return new C478830Iq9(arrayList, EnumC479370Ir1.INIT);
    }

    public final void vQ2(List<MGModuleTab> list, EnumC479370Ir1 enumC479370Ir1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayTabVM refreshPage: scene=");
        sbLIZ.append(enumC479370Ir1);
        sbLIZ.append(", playTabs=");
        sbLIZ.append(list.size());
        C20441214yg.LIZIZ("MultiTopLivePlayTabVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS373S0200000_7((List) list, (List<MGModuleTab>) enumC479370Ir1, (EnumC479370Ir1) 18));
    }
}
