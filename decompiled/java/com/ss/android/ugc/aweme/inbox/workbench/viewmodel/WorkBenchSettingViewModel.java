package com.ss.android.ugc.aweme.inbox.workbench.viewmodel;

import X.AbstractC316870CbV;
import X.C00X9;
import X.C09R9;
import X.C0KBN;
import X.C11UP;
import X.C13LE;
import X.C1697810uHb;
import X.C316640Cb8;
import X.C317290CcB;
import X.C326000CqE;
import X.C624240Oe6;
import X.C627660Ojc;
import X.C635140Ovg;
import X.C635200Ovm;
import X.C635250Ovr;
import X.EnumC635130Ovf;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC420801kM;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchSettingViewModel extends AssemListViewModel<C326000CqE, C635250Ovr, Integer> {
    public EntranceSettings LLILLJJLI;
    public List<MissionSetting> LLILLL;
    public InterfaceC420801kM LLILZ;
    public InterfaceC420801kM LLILZIL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C624240Oe6.class));
    public final Map<C635200Ovm, InterfaceC420801kM> LLILZLL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326000CqE(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        InterfaceC420801kM interfaceC420801kM2 = this.LLILZIL;
        if (interfaceC420801kM2 != null) {
            interfaceC420801kM2.dispose();
        }
        Iterator it2 = ((LinkedHashMap) this.LLILZLL).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) ((Map.Entry) it2.next()).getValue()).dispose();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C635250Ovr> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 75));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        boolean z;
        List<InboxEntranceFunction> list;
        EntranceSettings entranceSettings = this.LLILLJJLI;
        if (entranceSettings != null) {
            int i = entranceSettings.entranceId;
            ArrayList arrayList = new ArrayList();
            EntranceSettings entranceSettings2 = this.LLILLJJLI;
            if (entranceSettings2 != null && (list = entranceSettings2.functionSettings) != null) {
                int size = list.size();
                int i2 = 0;
                for (InboxEntranceFunction inboxEntranceFunction : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        arrayList.add(new C635250Ovr(inboxEntranceFunction, i, C11UP.LIZ(i2, size)));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List<MissionSetting> list2 = this.LLILLL;
            if (list2 != null) {
                for (MissionSetting missionSetting : list2) {
                    if (missionSetting != null) {
                        arrayList2.add(missionSetting);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            int i4 = 0;
            for (Object obj : arrayList2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    MissionSetting missionSetting2 = (MissionSetting) obj;
                    int i6 = missionSetting2.source;
                    int i7 = missionSetting2.subSource;
                    if (missionSetting2.unsubscribeStatus == EnumC635130Ovf.UNSUBSCRIBE.getValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList3.add(new C635140Ovg(i6, i7, z, missionSetting2.text, missionSetting2.subSourceLabel, C11UP.LIZ(i4, size2)));
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new C00X9());
                arrayList.addAll(arrayList3);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(arrayList);
        }
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }
}
