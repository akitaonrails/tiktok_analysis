package com.ss.android.ugc.aweme.inbox.workbench.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchSettingSwitchCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchSettingUnsubscribeSwitchCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchSettingTitleCell;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkBenchSettingListAssem extends UIListContentAssem<WorkBenchSettingViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchSettingListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchSettingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WorkBenchSettingListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchSettingViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 628), AFwS229S0000000_2.get$arr$(373), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 627));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        return new C20603715jn();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        WorkBenchSettingViewModel workBenchSettingViewModel = (WorkBenchSettingViewModel) assemVMLazy.getValue();
        EntranceSettings entranceSettings = WorkBenchViewModel.LLIZ;
        List<MissionSetting> list = WorkBenchViewModel.LLIZLLLIL;
        workBenchSettingViewModel.LLILLJJLI = entranceSettings;
        workBenchSettingViewModel.LLILLL = list;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(WorkBenchSettingSwitchCell.class, WorkbenchSettingTitleCell.class, WorkBenchSettingUnsubscribeSwitchCell.class);
    }
}
