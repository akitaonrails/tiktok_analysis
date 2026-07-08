package com.ss.android.ugc.aweme;

import X.AbstractC1616220sA0;
import X.C0VWC;
import X.C0VWN;
import X.C0W93;
import X.C1618410sDX;
import X.C1954807lC;
import X.C2097608Jq;
import X.C818480W8w;
import X.EnumC1618420sDY;
import X.InterfaceC1602960roc;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public final class PerfMonitorServiceImpl implements PerfMonitorService {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZLLL(String str) {
        C818480W8w.LIZJ(str, C0W93.SUCCESS, null, C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LJFF(String str) {
        C818480W8w.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void stopFpsMonitor(String str) {
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str);
        if (interfaceC1602960rocLIZIZ != null) {
            interfaceC1602960rocLIZIZ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZ(final Function0 function0, final Function0 function02) {
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ("share_panel", false);
        interfaceC1602960rocLIZ.LJIIJ(new C0VWC() { // from class: X.0sDZ
            @Override // X.C0VWC
            public final void LJIIJ(String str) {
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.C0VWC
            public final void onStop(String str) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        interfaceC1602960rocLIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LJ(RecyclerView recyclerView, String str) {
        C0VWN.LIZ(str, false).LIZIZ(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZIZ(String str, String str2, String str3) {
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
        interfaceC1602960rocLIZ.LIZ("tag_name", str2);
        interfaceC1602960rocLIZ.LIZ("url", str3);
        interfaceC1602960rocLIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZJ(String str, EnumC1618420sDY enumC1618420sDY, View view, final Function0<Unit> function0, final Function0<Unit> function02) {
        RecyclerView recyclerView;
        ViewPager viewPager;
        AbstractC1616220sA0 abstractC1616220sA0;
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
        interfaceC1602960rocLIZ.LJIIJ(new C0VWC() { // from class: X.0sDW
            @Override // X.C0VWC
            public final void LJIIJ(String str2) {
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.C0VWC
            public final void onStop(String str2) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        int i = C1618410sDX.LIZ[enumC1618420sDY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if ((view instanceof AbstractC1616220sA0) && (abstractC1616220sA0 = (AbstractC1616220sA0) view) != null) {
                            interfaceC1602960rocLIZ.LJFF(abstractC1616220sA0);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                if (!(view instanceof ViewPager) || (viewPager = (ViewPager) view) == null) {
                    return;
                }
                interfaceC1602960rocLIZ.LJIIIZ(viewPager);
                return;
            }
            if (!(view instanceof RecyclerView) || (recyclerView = (RecyclerView) view) == null) {
                return;
            }
            interfaceC1602960rocLIZ.LIZIZ(recyclerView);
        }
    }
}
