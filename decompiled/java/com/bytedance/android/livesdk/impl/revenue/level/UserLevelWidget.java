package com.bytedance.android.livesdk.impl.revenue.level;

import X.C01GW;
import X.C1094360eaI;
import X.C1095250ebj;
import X.C1161920gLG;
import X.C13LE;
import X.C19719912Dl;
import X.C1CC2;
import X.C20441214yg;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.RunnableC514801zW;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveGradeInfoAndConfigApiOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelWidget extends RoomRecycleWidget {
    public Room LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;

    public UserLevelWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserLevelViewModel.class);
        this.LLILLJJLI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS561S0100000_17(c19719912DlLIZ, 182), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final UserLevelViewModel x1() {
        return (UserLevelViewModel) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C20441214yg.LJIIIZ("UserLevelWidget", "onInit");
        if (!LiveGradeInfoAndConfigApiOptSetting.INSTANCE.getConfig().enableEnterRoomUserLevelApiOpt) {
            try {
                UserLevelViewModel userLevelViewModelX1 = x1();
                if (userLevelViewModelX1 != null) {
                    userLevelViewModelX1.AQ2();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("UserLevel load state from cache exception", e);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        C1094360eaI c1094360eaIHP;
        this.LLILLL = false;
        x1();
        if (x1() != null) {
            UserLevelViewModel userLevelViewModelX1 = x1();
            if (userLevelViewModelX1 != null) {
                c1094360eaIHP = userLevelViewModelX1.HP();
            } else {
                c1094360eaIHP = null;
            }
            UserLevelViewModel.yQ2(c1094360eaIHP);
        }
        C1095250ebj.LIZ.removeMessages(0);
        super.onUnload(recycleSource);
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (iUserLevelService instanceof UserLevelService) {
            ((UserLevelService) iUserLevelService).LL = null;
        }
        C20441214yg.LIZ("User Level Widget Unload");
    }

    public final void y1(boolean z) {
        int i;
        UserLevelDynamicConfig userLevelDynamicConfig = UserLevelSettings.INSTANCE.getUserLevelConfig().userLevelDynamicConfig;
        if (userLevelDynamicConfig != null) {
            i = userLevelDynamicConfig.fetchFeGeckoDelayTime;
        } else {
            i = 7;
        }
        long j = ((long) i) * 1000;
        if (j < 0) {
            return;
        }
        if (!z) {
            j = 0;
        }
        C786410Ut5.LJLIIL(j, C1095250ebj.LIZ, new RunnableC514801zW(new AwS561S0100000_17(this, 183), (Function0<Unit>) 154));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.bytedance.ies.sdk.widgets.RecycleSource r45, java.lang.Object[] r46) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.level.UserLevelWidget.onLoad(com.bytedance.ies.sdk.widgets.RecycleSource, java.lang.Object[]):void");
    }
}
