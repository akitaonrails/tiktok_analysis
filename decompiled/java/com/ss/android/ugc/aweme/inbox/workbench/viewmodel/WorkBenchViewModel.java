package com.ss.android.ugc.aweme.inbox.workbench.viewmodel;

import X.C09R9;
import X.C0PEM;
import X.C13LE;
import X.C23250099c;
import X.C291001Au;
import X.C622590ObR;
import X.C623610Od5;
import X.C624000Odi;
import X.C624010Odj;
import X.C624110Odt;
import X.C624120Odu;
import X.C624240Oe6;
import X.C635200Ovm;
import X.EnumC623590Od3;
import X.EnumC623890OdX;
import X.InterfaceC0148002o;
import X.InterfaceC420801kM;
import X.InterfaceC624050Odn;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchViewModel extends AssemViewModel<C623610Od5> {
    public static EntranceSettings LLIZ;
    public static List<MissionSetting> LLIZLLLIL;
    public long LLILLJJLI;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C624240Oe6.class));
    public String LLILLL = "";
    public int LLILZ = EnumC623890OdX.TAB_UNKNOWN.getValue();
    public boolean LLILZIL = true;
    public final Map<C635200Ovm, InterfaceC420801kM> LLILZLL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C623610Od5(null, EnumC623590Od3.LOADING, false, null, new ArrayList(), new C291001Au(null));
    }

    public final void init() {
        String lastReadTimeInSession;
        C624120Odu c624120OduLLLLLLLLLL = ((InterfaceC624050Odn) this.LL.getValue().getOperator()).LLLLLLLLLL();
        C622590ObR c622590ObR = C622590ObR.LJI;
        boolean z = c624120OduLLLLLLLLLL.LIZ != EnumC623590Od3.LOADING;
        c622590ObR.getClass();
        C622590ObR.LJIIIZ = z;
        WorkBenchNoticeResponse workBenchNoticeResponse = c624120OduLLLLLLLLLL.LIZIZ;
        this.LLILLJJLI = workBenchNoticeResponse != null ? workBenchNoticeResponse.getWallTime() : 0L;
        WorkBenchNoticeResponse workBenchNoticeResponse2 = c624120OduLLLLLLLLLL.LIZIZ;
        if (workBenchNoticeResponse2 == null || (lastReadTimeInSession = workBenchNoticeResponse2.getLastReadTimeInSession()) == null) {
            lastReadTimeInSession = "";
        }
        this.LLILLL = lastReadTimeInSession;
        setState(new AwS588S0100000_9(c624120OduLLLLLLLLLL, 454));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C624010Odj(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("inbox_workbench_preload_enabled", true)) {
            C624110Odt.LIZ.getClass();
            C23250099c.LIZLLL(C624110Odt.LIZJ, null, null, new C624000Odi(null), 3);
        }
        LLIZ = null;
        LLIZLLLIL = null;
        Iterator it2 = ((LinkedHashMap) this.LLILZLL).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) ((Map.Entry) it2.next()).getValue()).dispose();
        }
    }
}
