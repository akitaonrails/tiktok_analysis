package com.bytedance.touchpoint.core.pendant.ad;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C01U6;
import X.C0J3E;
import X.C0SVC;
import X.C1009620cNc;
import X.C1220000hqw;
import X.C13LE;
import X.C1619720sFe;
import X.C1893670zNV;
import X.C1894320zOY;
import X.C1894700zPA;
import X.C1897020zSu;
import X.C1897200zTC;
import X.C1898420zVA;
import X.C1898700zVc;
import X.C19322810ig;
import X.C19719512Dh;
import X.C2097608Jq;
import X.C2178808gE;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1897260zTI;
import X.InterfaceC1898430zVB;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.BaseTouchPointManager;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.data.parser.notify.AdFeedTimerPendantViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AdFeedTimerPendantManager extends BaseTaskEventTimerPendantManager {
    public static final Map<String, AdFeedTimerPendantManager> LLJJL = new LinkedHashMap();
    public static final AtomicBoolean LLJJLIIIJLLLLLLLZ = new AtomicBoolean(false);
    public Integer LLJJJJ;
    public String LLJJJJJIL;
    public C1898420zVA LLJJJJLIIL;

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIILJJIL() {
        this.LLJJJJLIIL = null;
        C19719512Dh.LIZJ(LLJJL).remove(this.LLJJJJJIL);
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final String LJIILL() {
        return "feed";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLJLI() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdFeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(15), null, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final TimerPendant LJIIZILJ() {
        if (this.LLJJJJ == null) {
            return null;
        }
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        Integer num = this.LLJJJJ;
        return (TimerPendant) c1894700zPALIZ.LJI(76, num != null ? num.intValue() : 0);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIIZI() {
        C1009620cNc c1009620cNc;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null) {
            c1898700zVc.getShapeBubbleView().setShapeBgColor(C0SVC.LIZIZ(C0SVC.LIZ, "#99000000"));
            int i = 0;
            c1898700zVc.LLJJIJI = false;
            ViewGroup.LayoutParams layoutParams = c1898700zVc.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                C1898420zVA c1898420zVA = this.LLJJJJLIIL;
                if (c1898420zVA != null && (c1009620cNc = c1898420zVA.LIZJ) != null) {
                    i = c1009620cNc.LIZ;
                }
                layoutParams2.topMargin = i;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1898700zVc);
                c1898700zVc.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final String LJJIL() {
        String str;
        C1898700zVc c1898700zVc;
        C19322810ig shapeBubbleView;
        Bubble bubble = this.LLJIJIL;
        if (bubble == null || (str = bubble.jumpLink) == null || str.length() == 0 || (c1898700zVc = this.LLIZ) == null || (shapeBubbleView = c1898700zVc.getShapeBubbleView()) == null || shapeBubbleView.getVisibility() != 0) {
            return super.LJJIL();
        }
        if (bubble != null) {
            return bubble.jumpLink;
        }
        return null;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJJL() {
        InterfaceC1898430zVB interfaceC1898430zVBLIZLLL;
        LLJJLIIIJLLLLLLLZ.set(true);
        IMultiDomainService iMultiDomainService = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null);
        if (iMultiDomainService != null && (interfaceC1898430zVBLIZLLL = iMultiDomainService.LIZLLL()) != null) {
            interfaceC1898430zVBLIZLLL.clear();
        }
        Iterator it2 = ((LinkedHashMap) LLJJL).entrySet().iterator();
        while (it2.hasNext()) {
            ((BaseTouchPointManager) ((Map.Entry) it2.next()).getValue()).LJIILIIL();
        }
        ((LinkedHashMap) LLJJL).clear();
    }

    public final void LJL() {
        String str;
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        String str2 = taskEvent != null ? taskEvent.taskEventKey : null;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("position", "feeds");
        TaskEvent taskEvent2 = this.LLJJIJIIJIL;
        if (taskEvent2 == null || (str = taskEvent2.taskEventKey) == null) {
            str = "";
        }
        pairArr[1] = new Pair("task_type", str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c1894320zOY.getClass();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        TaskEvent taskEventLIZLLL = C2178808gE.LIZ().LIZLLL(str2);
        if (taskEventLIZLLL != null) {
            Map<? extends String, ? extends String> linkedHashMap = taskEventLIZLLL.customEventParams;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            mapLJIIJ.putAll(linkedHashMap);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            mapLJIIJ.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("activation_task_show", mapLJIIJ);
        }
        T t = this.LLILLL;
        int i = t != 0 ? t.LIZ : 0;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("vv_cnt", String.valueOf(this.LLJJIII));
        linkedHashMap2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJJJI());
        linkedHashMap2.put("task_status", "");
        Integer num = this.LLJJJJ;
        c1894320zOY.getClass();
        C1894320zOY.LJIJJ(i, linkedHashMap2, num, null, null, "");
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final Integer LJJLIIIJJIZ() {
        return this.LLJJJJ;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJ(TaskEvent taskEvent) {
        C01U6.LIZIZ(new AwS429S0200000_28(taskEvent, this, 84));
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Boolean bool;
        int i;
        String str;
        if (view != null) {
            C1898700zVc c1898700zVc = this.LLIZ;
            boolean zBooleanValue = false;
            if (c1898700zVc != null && c1898700zVc.getVisibility() == 0) {
                if (view.getId() != R.id.nq3 && view.getId() != R.id.uy5) {
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    T t = this.LLILLL;
                    if (t != 0) {
                        i = t.LIZ;
                    } else {
                        i = 0;
                    }
                    TaskEvent taskEvent = this.LLJJIJIIJIL;
                    if (taskEvent == null || (str = taskEvent.taskEventKey) == null) {
                        str = "";
                    }
                    C1894320zOY.LJFF(c1894320zOY, i, str, 0, LJJJI(), "", this.LLJJJJ, null, null, 384);
                } else {
                    C1897020zSu c1897020zSu = C1897020zSu.LIZ;
                    C1897020zSu.LIZJ(this.LLJIJIL, true);
                    C1897020zSu.LIZLLL(this.LLJIJIL, 0);
                }
                T t2 = this.LLILLL;
                Map<String, String> map = null;
                if (t2 != 0) {
                    numValueOf = Integer.valueOf(t2.LIZ);
                } else {
                    numValueOf = null;
                }
                String str2 = (String) C01U6.LJ(new AwS572S0100000_28(this, 705), "feed");
                TimerPendant timerPendant = (TimerPendant) this.LLILLL;
                if (timerPendant != null && (bool = timerPendant.needLoginGate) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                T t3 = this.LLILLL;
                if (t3 != 0) {
                    map = t3.LJ;
                }
                LJJJJL(numValueOf, str2, zBooleanValue, map);
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final /* bridge */ /* synthetic */ void LJJII(C1893670zNV c1893670zNV) {
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJLZIJ(boolean z, boolean z2) {
        int i;
        if (!z2) {
            this.LLJJIII++;
        }
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.j2(c1898700zVc, i);
        }
        if (z) {
            LJL();
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent != null) {
                C01U6.LIZIZ(new AwS429S0200000_28(taskEvent, this, 84));
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, X.InterfaceC1898470zVF
    public final void LIZLLL(int i, String str, String str2, String str3, boolean z, boolean z2, Bubble bubble) {
        C01U6.LIZIZ(new C1897200zTC(i, str, str2, this, z, str3, z2));
    }
}
