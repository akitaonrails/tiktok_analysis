package com.bytedance.touchpoint.core.pendant.ad;

import X.C01GW;
import X.C01U6;
import X.C0J3E;
import X.C1220000hqw;
import X.C13LE;
import X.C1894320zOY;
import X.C1894330zOZ;
import X.C1894700zPA;
import X.C1897020zSu;
import X.C1898700zVc;
import X.C2178808gE;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1898200zUo;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.data.parser.notify.AdTaskEventTimerPendantViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS166S0101000_28;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class ADTaskEventPendantManager extends BaseTaskEventTimerPendantManager {
    public static final C01GW<ADTaskEventPendantManager> LLJJJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS217S0000000_28.get$arr$(57));

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final String LJIILL() {
        return "commerce_ads";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLJLI() {
        String str;
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (taskEvent == null || (str = taskEvent.taskEventKey) == null) {
            str = "";
        }
        LIZLLL(16, str, "", null, true, false, null);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdTaskEventTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(14), null, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final TimerPendant LJIIZILJ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return (TimerPendant) C2178808gE.LIZ().LJ(57);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIIZI() {
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null) {
            c1898700zVc.LJIIJJI();
        }
        C01U6.LIZIZ(new AwS166S0101000_28(this, (BaseTimerPendantManager<Object>) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)), 4));
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final Integer LJJLIIIJJIZ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return C2178808gE.LIZ().LIZIZ(57);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final String LJJJ() {
        InterfaceC1898200zUo interfaceC1898200zUoLIZJ;
        String str;
        IMultiDomainService iMultiDomainService = (IMultiDomainService) ServiceManager.get().getService(IMultiDomainService.class);
        if (iMultiDomainService != null && (interfaceC1898200zUoLIZJ = iMultiDomainService.LIZJ()) != null) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent == null || (str = taskEvent.taskEventKey) == null) {
                str = "";
            }
            String strLIZ = interfaceC1898200zUoLIZJ.LIZ(str);
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return "";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJ(TaskEvent taskEvent) {
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        C1897020zSu.LIZIZ(this, 17, taskEvent);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1898200zUo interfaceC1898200zUoLIZJ;
        String str;
        String str2;
        if (view != null) {
            C1898700zVc c1898700zVc = this.LLIZ;
            int i = 0;
            if (c1898700zVc != null && c1898700zVc.getVisibility() == 0) {
                String str3 = "";
                if (view.getId() != R.id.nq3 && view.getId() != R.id.uy5) {
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    T t = this.LLILLL;
                    if (t != 0) {
                        i = t.LIZ;
                    }
                    TaskEvent taskEvent = this.LLJJIJIIJIL;
                    if (taskEvent == null || (str2 = taskEvent.taskEventKey) == null) {
                        str2 = "";
                    }
                    C1894320zOY.LJFF(c1894320zOY, i, str2, 0, LJJJI(), null, null, null, null, 480);
                } else {
                    C1897020zSu c1897020zSu = C1897020zSu.LIZ;
                    C1897020zSu.LIZJ(this.LLJIJIL, false);
                }
                if (view.getContext() != null && (interfaceC1898200zUoLIZJ = ((IMultiDomainService) ServiceManager.get().getService(IMultiDomainService.class)).LIZJ()) != null) {
                    TaskEvent taskEvent2 = this.LLJJIJIIJIL;
                    if (taskEvent2 != null && (str = taskEvent2.taskEventKey) != null) {
                        str3 = str;
                    }
                    interfaceC1898200zUoLIZJ.LIZIZ(str3);
                }
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJZZI(Bubble bubble, String str) {
        String strLJJIFFI;
        int i = bubble.bubbleType;
        if (i == 12) {
            String str2 = bubble.longContent;
            if (str2 != null) {
                strLJJIFFI = u.LJJIFFI(str2, "{number}", str, false);
            } else {
                strLJJIFFI = null;
            }
            LJJL(bubble, str, strLJJIFFI, true);
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sub_type", String.valueOf(bubble.bubbleType));
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            linkedHashMap.put("task_key", bubble.taskKey);
            C1894320zOY.LJIL(c1894320zOY, bubble, linkedHashMap);
            return;
        }
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        String str3 = bubble.taskKey;
        if (str3 == null) {
            str3 = "";
        }
        C1897020zSu.LJ(this, i, str3, str, null, true, false);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, X.InterfaceC1898470zVF
    public final void LIZLLL(int i, String str, String str2, String str3, boolean z, boolean z2, Bubble bubble) {
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        String strLJJIFFI = null;
        Bubble bubbleLIZ = C1897020zSu.LIZ(i, str, null);
        if (bubbleLIZ == null) {
            return;
        }
        if (i == 12) {
            String str4 = bubbleLIZ.longContent;
            if (str4 != null) {
                strLJJIFFI = u.LJJIFFI(str4, "{number}", str2, false);
            }
            LJJL(bubbleLIZ, str2, strLJJIFFI, z);
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sub_type", String.valueOf(bubbleLIZ.bubbleType));
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
            linkedHashMap.put("task_key", str);
            C1894320zOY.LJIL(c1894320zOY, bubbleLIZ, linkedHashMap);
            return;
        }
        C1897020zSu.LJ(this, i, str, str2, str3, z, z2);
    }
}
