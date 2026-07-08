package com.ss.android.ugc.aweme.compliance.api.services.teenmode;

import X.C1051660dTQ;
import X.C13IQ;
import X.C15YK;
import X.C19EG;
import X.InterfaceC1051730dTX;
import X.InterfaceC1586340rNo;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourServerDrivenConfig;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public interface IProtectionService {
    ScheduleBreakSettings LIZ();

    boolean LIZIZ();

    void LIZJ();

    void LIZLLL(int i, int i2);

    void LJ();

    boolean LJFF();

    void LJI(int i, int i2);

    boolean LJII();

    int LJIIIIZZ();

    int LJIIIZ();

    void LJIIJ();

    void LJIIJJI();

    boolean LJIIL();

    boolean LJIILIIL();

    String LJIILJJIL();

    void LJIILL(FeedLynxOverlayConfig feedLynxOverlayConfig);

    List<InterfaceC1051730dTX> LJIILLIIL(C1051660dTQ c1051660dTQ);

    void LJIIZILJ();

    void LJIJ(String str);

    void LJIJI(C19EG c19eg, int i, boolean z, int i2, int i3, List<ScreenTimeManagementDaySetting> list);

    void LJIJJ(boolean z);

    int LJIJJLI();

    boolean LJIL();

    void LJJ();

    boolean LJJI();

    void LJJIFFI();

    UserDetailsInfoBean LJJII();

    void LJJIII(boolean z);

    void LJJIIJ();

    void LJJIIJZLJL(SleepHourConfigSettings sleepHourConfigSettings);

    void LJJIIZ(Activity activity);

    int LJJIIZI();

    boolean LJJIJ();

    int LJJIJIIJI();

    boolean LJJIJIIJIL();

    SleepHourConfigSettings LJJIJIL();

    void LJJIJL(C15YK c15yk, String str);

    void LJJIJLIJ(String str);

    boolean LJJIL();

    void LJJIZ(Bundle bundle);

    void LJJJ(Context context, Runnable runnable, String str);

    C13IQ<? extends UISlotAssem> LJJJI();

    int LJJJIL();

    void LJJJJ();

    void LJJJJI();

    List<ScreenTimeManagementDaySetting> LJJJJIZL();

    void LJJJJJ();

    boolean LJJJJJL(long j);

    void LJJJJL(SleepHourServerDrivenConfig sleepHourServerDrivenConfig);

    InterfaceC1586340rNo LJJJJLI();

    int LJJJJLL();

    void LJJJJZ(List<String> list);

    boolean LJJJJZI();

    int LJJJLIIL();

    InterfaceC1051730dTX LJJJLL(C1051660dTQ c1051660dTQ, String str);

    int Ve();
}
