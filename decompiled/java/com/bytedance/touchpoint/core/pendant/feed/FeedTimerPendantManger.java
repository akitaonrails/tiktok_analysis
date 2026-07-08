package com.bytedance.touchpoint.core.pendant.feed;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C01U6;
import X.C0A4H;
import X.C0A4L;
import X.C0J3E;
import X.C0SVC;
import X.C1220000hqw;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1548820qPI;
import X.C1619720sFe;
import X.C1697810uHb;
import X.C1893580zNM;
import X.C1893670zNV;
import X.C1894320zOY;
import X.C1894330zOZ;
import X.C1894700zPA;
import X.C1896510zS5;
import X.C1896890zSh;
import X.C1897020zSu;
import X.C1898110zUf;
import X.C1898160zUk;
import X.C1898240zUs;
import X.C1898480zVG;
import X.C1898700zVc;
import X.C1899200zWQ;
import X.C1899620zX6;
import X.C2178808gE;
import X.C2188811AlT;
import X.C262100zr;
import X.C274780Apo;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1141530foN;
import Y.ACListenerS60S0101000_28;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.DisplayInfo;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.RetentionInfo;
import com.bytedance.touchpoint.api.model.StartCondition;
import com.bytedance.touchpoint.api.model.StartEventConfig;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.data.parser.notify.FeedTimerPendantViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS166S0101000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public class FeedTimerPendantManger extends BaseTaskEventTimerPendantManager implements InterfaceC1141530foN {
    public static final C01GW<FeedTimerPendantManger> LLJL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1898480zVG());
    public static final List<String> LLJLIL = C1697810uHb.LJIIJJI("new", "top", "mood_boost", "drama", "others");
    public Integer LLJJJJ;
    public boolean LLJJL;
    public final int LLJJJJJIL = 22;
    public final int LLJJJJLIIL = 7;
    public boolean LLJJLIIIJLLLLLLLZ = true;

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public String LJIILL() {
        return "feed";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public void LJJIJLIJ() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final /* bridge */ /* synthetic */ void LJJJJ(TaskEvent taskEvent) {
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJLI() {
        this.LLJILLL = false;
        this.LLJJL = false;
    }

    public String LJLIIL() {
        return "FeedTimerPendantManger";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1895130zPr
    public BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(FeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1898240zUs(), null, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIIZI() {
        if (((Boolean) C0A4H.LIZ.getValue()).booleanValue()) {
            C01U6.LIZIZ(new AwS166S0101000_28(this, (BaseTimerPendantManager<Object>) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)), 4));
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIJIIJIL() {
        ProgressInfo progressInfo;
        Integer num;
        C1898700zVc c1898700zVc;
        if (((Boolean) C0A4L.LIZ.getValue()).booleanValue() && (c1898700zVc = this.LLIZ) != null) {
            c1898700zVc.setClientControlCloseable(true);
        }
        int iIntValue = 0;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            abstractC1896090zRP.LJJJIL(this.LLIZ);
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        if (timerPendant != null && Intrinsics.LJFF(timerPendant.forceShow, Boolean.TRUE) && !this.LLIZLLLIL) {
            if (LJJJJZ()) {
                C1898700zVc c1898700zVc2 = this.LLIZ;
                if (c1898700zVc2 != null) {
                    C786410Ut5.j2(c1898700zVc2, 0);
                }
                LJL(true);
            }
            TimerPendant timerPendant2 = (TimerPendant) this.LLILLL;
            if (timerPendant2 == null || !Intrinsics.LJFF(timerPendant2.displayWithNormalPendant, Boolean.TRUE)) {
                C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                C1894330zOZ.LIZ().LLJJIII = true;
                C1894330zOZ.LIZ().LJJIJL(true);
            }
        }
        TimerPendant timerPendant3 = (TimerPendant) this.LLILLL;
        if (Intrinsics.LJFF(timerPendant3 != null ? timerPendant3.shrinkCondition : null, "always")) {
            this.LLJILJIL = true;
        }
        TimerPendant timerPendant4 = (TimerPendant) this.LLILLL;
        if (timerPendant4 == null || !Intrinsics.LJFF(timerPendant4.showAwardText, Boolean.TRUE)) {
            return;
        }
        Integer num2 = this.LLJJJJ;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent != null && (progressInfo = taskEvent.progressInfo) != null && (num = progressInfo.awardAmount) != null) {
                iIntValue = num.intValue();
            }
        }
        LJJJJLL(iIntValue, true);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final String LJJJ() {
        String str;
        IWatchVideoService.LIZ.getClass();
        IWatchVideoService iWatchVideoServiceLIZ = C1898160zUk.LIZ();
        if (iWatchVideoServiceLIZ != null) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent == null || (str = taskEvent.taskEventKey) == null) {
                str = "";
            }
            String strLIZ = iWatchVideoServiceLIZ.LIZ(str);
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return "";
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJJL() {
        String str;
        String str2;
        if (((Boolean) C0A4L.LIZ.getValue()).booleanValue()) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent != null && (str2 = taskEvent.taskEventKey) != null) {
                C1898110zUf.LL.getClass();
                if (C1898110zUf.LJIIJJI(str2) && ((Boolean) C274780Apo.LIZ.getValue()).booleanValue()) {
                    this.LLJJL = true;
                    if (((Boolean) C274780Apo.LIZ.getValue()).booleanValue()) {
                        C01U6.LIZIZ(new AwS572S0100000_28(this, 716));
                    }
                }
            }
            TaskEvent taskEvent2 = this.LLJJIJIIJIL;
            if (taskEvent2 == null || (str = taskEvent2.taskEventKey) == null) {
                return;
            }
            C1898110zUf.LL.getClass();
            C1898110zUf.LJIILJJIL(str);
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final boolean LJJJJZ() {
        C1896510zS5 c1896510zS5;
        List<String> list;
        AbstractC1896090zRP abstractC1896090zRP;
        TimerPendant timerPendant;
        List<String> list2;
        TimerPendant timerPendant2 = (TimerPendant) this.LLILLL;
        boolean z = false;
        boolean zLJFF = timerPendant2 != null ? Intrinsics.LJFF(timerPendant2.forceShow, Boolean.TRUE) : false;
        if (!zLJFF && (this.LLJJIJIIJIL == null || !this.LLIZLLLIL)) {
            LJLIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldShowPendant return false, task is empty: ");
            sbLIZ.append(this.LLJJIJIIJIL == null);
            sbLIZ.append(", isActivated: ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(", forceShowTimer: ");
            sbLIZ.append(zLJFF);
            sbLIZ.append(", pendant is null: ");
            sbLIZ.append(this.LLILLL == 0);
            C2188811AlT.LIZIZ(sbLIZ);
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            C1894330zOZ.LIZ().LLJJIII = false;
            return false;
        }
        TimerPendant timerPendant3 = (TimerPendant) this.LLILLL;
        if (timerPendant3 != null && (list = timerPendant3.pageType) != null && (!list.isEmpty()) && (abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0)) != null && ((timerPendant = (TimerPendant) this.LLILLL) == null || (list2 = timerPendant.pageType) == null || !list2.contains(abstractC1896090zRP.LJIJI()))) {
            return false;
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        C1896890zSh c1896890zSh = (C1896890zSh) c1619720sFe.LIZ(1);
        if (c1896890zSh != null && c1896890zSh.LJIIJ()) {
            return false;
        }
        AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP2 != null) {
            String strLJIJI = abstractC1896090zRP2.LJIJI();
            if (LLJLIL.contains(strLJIJI)) {
                return false;
            }
            if (Intrinsics.LJFF(strLJIJI, "follow") && (c1896510zS5 = (C1896510zS5) c1619720sFe.LIZ(11)) != null && c1896510zS5.LIZJ()) {
                return false;
            }
            abstractC1896090zRP2.LJJIJIIJIL();
        }
        if (LJJ() && !this.LLJILLL) {
            z = true;
        }
        LJL(z);
        return z;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLIIIJJI() {
        boolean z;
        String str;
        String str2;
        Map<String, String> map;
        RetentionInfo retentionInfo;
        String str3;
        Context context;
        Boolean bool;
        RetentionInfo retentionInfo2;
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        boolean zBooleanValue = false;
        if (timerPendant != null ? Intrinsics.LJFF(timerPendant.forceShow, Boolean.TRUE) : false) {
            this.LLJILLL = false;
            LJJJLZIJ(true, true);
            z = true;
        } else {
            z = false;
        }
        TimerPendant timerPendant2 = (TimerPendant) this.LLILLL;
        Integer numValueOf = null;
        if (!Intrinsics.LJFF((timerPendant2 == null || (retentionInfo2 = timerPendant2.retentionInfo) == null) ? null : retentionInfo2.clickAction, "open_task_page")) {
            TaskEvent taskEvent = this.LLJJIJIIJIL;
            if (taskEvent == null || (str = taskEvent.taskEventKey) == null) {
                return;
            }
            if (!z) {
                this.LLJILLL = false;
                LJJJLZIJ(true, true);
            }
            this.LLJJL = false;
            C1898110zUf.LL.getClass();
            C1898110zUf.LJIILIIL(str, false);
            return;
        }
        TimerPendant timerPendant3 = (TimerPendant) this.LLILLL;
        if (timerPendant3 == null || (str2 = timerPendant3.LIZIZ) == null) {
            str2 = "";
        }
        if (timerPendant3 != null && (bool = timerPendant3.needLoginGate) != null) {
            zBooleanValue = bool.booleanValue();
        }
        T t = this.LLILLL;
        if (t != 0) {
            map = t.LJ;
            numValueOf = Integer.valueOf(t.LIZ);
        } else {
            map = null;
        }
        TimerPendant timerPendant4 = (TimerPendant) this.LLILLL;
        if (timerPendant4 == null || (retentionInfo = timerPendant4.retentionInfo) == null || (str3 = retentionInfo.jumpLink) == null) {
            return;
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        int i = timerPendant4.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_position", "timer_widget_toast");
        Integer numValueOf2 = Integer.valueOf(this.LLJJIII);
        String strLJJJI = LJJJI();
        c1894320zOY.getClass();
        C1894320zOY.LJIILJJIL(i, linkedHashMap, null, numValueOf2, strLJJJI);
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        C1893580zNM.LJ(C1893580zNM.LIZ, context, numValueOf, str3, str2, zBooleanValue, map, null, null, 192);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public Integer LJJLIIIJJIZ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return C2178808gE.LIZ().LIZIZ(51);
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    /* JADX INFO: renamed from: LJLIIIL, reason: merged with bridge method [inline-methods] */
    public TimerPendant LJIIZILJ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return (TimerPendant) C2178808gE.LIZ().LJ(51);
    }

    public final void LJLIL() {
        List arrayList;
        String str;
        String str2;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null) {
            c1898700zVc.LLJJJJJIL = false;
            TimerPendant timerPendant = c1898700zVc.LLJZIJLIL;
            if (timerPendant == null || (arrayList = timerPendant.textBGColors) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.isEmpty() || arrayList.size() < 2) {
                TimerPendant timerPendant2 = c1898700zVc.LLJZIJLIL;
                String str3 = "#FFAF37";
                if (timerPendant2 == null || (str = timerPendant2.textBGColor) == null) {
                    str = "#FFAF37";
                }
                arrayList.add(str);
                TimerPendant timerPendant3 = c1898700zVc.LLJZIJLIL;
                if (timerPendant3 != null && (str2 = timerPendant3.textBGColor) != null) {
                    str3 = str2;
                }
                arrayList.add(str3);
            }
            c1898700zVc.getCoinTextView().setShadowLayer(1.0f, 3.0f, 3.0f, C0SVC.LIZIZ(C0SVC.LIZ, "#FF7C02"));
            TextView coinTextView = c1898700zVc.getCoinTextView();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C12ES.LIZJ(8.0f, c1898700zVc.getContext()));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, (String) it2.next())));
            }
            gradientDrawable.setColors(C13LP.LLII(arrayList2));
            coinTextView.setBackground(gradientDrawable);
            c1898700zVc.LJJIIZI();
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager, com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        LJJJJLI();
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLIIIJILLIZJL() {
        StartCondition startCondition;
        super.LJJLIIIJILLIZJL();
        TaskEvent taskEvent = this.LLJJIJIIJIL;
        if (Intrinsics.LJFF((taskEvent == null || (startCondition = taskEvent.startCondition) == null) ? null : startCondition.startMode, "manual")) {
            C1898110zUf c1898110zUf = C1898110zUf.LL;
            Integer numLJJLIIIJJIZ = LJJLIIIJJIZ();
            c1898110zUf.getClass();
            if (C1898110zUf.LJIIL(numLJJLIIIJJIZ)) {
                C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                C1894330zOZ.LIZ().LLJJIII = false;
                C1894330zOZ.LIZ().LJJIJL(false);
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final boolean LJJLL() {
        long jLongValue;
        String strLJJIZ = LJJIZ();
        if (strLJJIZ == null) {
            return false;
        }
        Long l = this.LLJJJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = ((Keva) this.LLJJIJIL.getValue()).getLong(strLJJIZ, 0L);
            this.LLJJJ = Long.valueOf(jLongValue);
        }
        return !C1899200zWQ.LIZ.LIZJ(jLongValue);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final boolean LJJIJ() {
        return this.LLJILLL;
    }

    public int LJLI() {
        return this.LLJJJJJIL;
    }

    @Override // com.bytedance.touchpoint.core.pendant.BaseTouchPointManager
    public final void LJJII(C1893670zNV c1893670zNV) {
        this.LLJJJJ = null;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJJJI(boolean z) {
        TimerPendant timerPendant;
        Integer num;
        int iIntValue;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null && c1898700zVc.getParent() != null) {
            C1898700zVc c1898700zVc2 = this.LLIZ;
            int i = 0;
            if (c1898700zVc2 != null && c1898700zVc2.getVisibility() == 0 && (timerPendant = (TimerPendant) this.LLILLL) != null && (num = timerPendant.shrinkAfter) != null && (iIntValue = num.intValue()) != 0 && this.LLJILJIL && this.LLJ == 0) {
                if (!z) {
                    this.LLJILJILJ++;
                }
                C1898700zVc c1898700zVc3 = this.LLIZ;
                if ((c1898700zVc3 != null && c1898700zVc3.LJIJJ()) || this.LLJILJILJ < iIntValue) {
                    return;
                }
                this.LLJ = 1;
                C1898700zVc c1898700zVc4 = this.LLIZ;
                if (c1898700zVc4 != null) {
                    c1898700zVc4.LJIJ(false);
                    boolean zLIZ = C1899620zX6.LIZ();
                    C1898700zVc c1898700zVc5 = this.LLIZ;
                    if (c1898700zVc5 != null) {
                        c1898700zVc5.LJIIZILJ(zLIZ);
                    }
                    this.LLJILJILJ = 0;
                }
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                T t = this.LLILLL;
                if (t != 0) {
                    i = t.LIZ;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("vv_cnt", String.valueOf(this.LLJJIII));
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJJJI());
                linkedHashMap.put("task_status", LJJJ());
                String str = this.LLJI;
                str.toString();
                linkedHashMap.put("single_status", str);
                c1894320zOY.getClass();
                C1894320zOY.LJIJJ(i, linkedHashMap, null, null, null, "");
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public void LJJLIIIJ(TaskEvent taskEvent) throws JSONException {
        int iIntValue;
        boolean zBooleanValue;
        Boolean bool;
        ProgressInfo progressInfo;
        super.LJJLIIIJ(taskEvent);
        Integer num = this.LLJJJJ;
        if (num != null || ((progressInfo = taskEvent.progressInfo) != null && (num = progressInfo.awardAmount) != null)) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ProgressInfo progressInfo2 = taskEvent.progressInfo;
        if (progressInfo2 != null && (bool = progressInfo2.claimable) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LJJJJLL(iIntValue, zBooleanValue);
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        if (timerPendant == null || !Intrinsics.LJFF(timerPendant.displayWithNormalPendant, Boolean.TRUE)) {
            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
            C1894330zOZ.LIZ().LLJJIII = true;
            C1894330zOZ.LIZ().LJJIJL(false);
        }
        C1548820qPI.LJFF("referral_all_rewards_claimed", this, UUID.randomUUID().toString());
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final String LJJLIIIJL(Context context) {
        RetentionInfo retentionInfo;
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        if (timerPendant != null && (retentionInfo = timerPendant.retentionInfo) != null) {
            return retentionInfo.title;
        }
        return null;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final String LJJLIIIJLLLLLLLZ(Context context) {
        RetentionInfo retentionInfo;
        TimerPendant timerPendant = (TimerPendant) this.LLILLL;
        if (timerPendant != null && (retentionInfo = timerPendant.retentionInfo) != null) {
            return retentionInfo.buttonText;
        }
        return null;
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager
    public final void LJJLIIJ(TaskEvent taskEvent) {
        int iIntValue;
        StartEventConfig startEventConfig;
        Integer num;
        C1898700zVc c1898700zVc = this.LLIZ;
        if (c1898700zVc != null && c1898700zVc.getVisibility() == 0) {
            DisplayInfo displayInfo = taskEvent.displayInfo;
            if (displayInfo != null && (startEventConfig = displayInfo.startEventConfig) != null && (num = startEventConfig.showBubbleType) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = this.LLJJJJLIIL;
            }
            if (LJJLL()) {
                try {
                    String str = taskEvent.taskEventKey;
                    if (str == null) {
                        str = "";
                    }
                    LIZLLL(iIntValue, str, "", null, true, true, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                String strLJJIZ = LJJIZ();
                if (strLJJIZ != null) {
                    long jLIZ = C1899200zWQ.LIZ(C1899200zWQ.LIZ);
                    ((Keva) this.LLJJIJIL.getValue()).storeLong(strLJJIZ, jLIZ);
                    this.LLJJJ = Long.valueOf(jLIZ);
                }
            }
        }
    }

    public final void LJL(boolean z) {
        if (this.LLJJLIIIJLLLLLLLZ && z) {
            C1898700zVc c1898700zVc = this.LLIZ;
            int i = 0;
            if (c1898700zVc != null && c1898700zVc.getVisibility() == 0) {
                return;
            }
            if (this.LLJJIJIIJIL != null && this.LLIZLLLIL) {
                return;
            }
            this.LLJJLIIIJLLLLLLLZ = false;
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            T t = this.LLILLL;
            if (t != 0) {
                i = t.LIZ;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("vv_cnt", String.valueOf(this.LLJJIII));
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJJJI());
            linkedHashMap.put("task_status", LJJJ());
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i, linkedHashMap, null, null, null, "");
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "referral_all_rewards_claimed")) {
            LJLIL();
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIJIL(ProgressInfo progressInfo, TimeInfo timeInfo, AwS572S0100000_28 awS572S0100000_28, boolean z, boolean z2) {
        Integer num;
        if (progressInfo != null) {
            num = progressInfo.awardAmount;
        } else {
            num = null;
        }
        this.LLJJJJ = num;
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        C1897020zSu.LJFF();
        super.LJJIJIL(progressInfo, timeInfo, awS572S0100000_28, z, z2);
        if (progressInfo != null && Intrinsics.LJFF(progressInfo.claimable, Boolean.TRUE)) {
            this.LLJILJILJ = 0;
            C01U6.LIZJ(AFwS217S0000000_28.get$arr$(542));
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager
    public final void LJJIJL(boolean z, boolean z2, Integer num, boolean z3, boolean z4, Function0 function0) {
        this.LLJJJJ = num;
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        C1897020zSu.LJFF();
        super.LJJIJL(z, z2, num, z3, z4, function0);
    }

    @Override // com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager, X.InterfaceC1898470zVF
    public final void LIZLLL(final int i, final String str, final String str2, final String str3, final boolean z, final boolean z2, final Bubble bubble) {
        int iIntValue;
        Integer num;
        C1898700zVc c1898700zVc;
        int i2 = 0;
        if (i == 24 && (((c1898700zVc = this.LLIZ) != null && c1898700zVc.LJIJJ()) || this.LLJIJIL != null)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.0zUr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedTimerPendantManger@1ce3.showTimerActivationBubble$showBubbleAction$1");
                try {
                    C1897020zSu c1897020zSu = C1897020zSu.LIZ;
                    FeedTimerPendantManger feedTimerPendantManger = this.LL;
                    int i3 = i;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    boolean z3 = z;
                    boolean z4 = z2;
                    C01U6.LIZLLL(new C1898250zUt(i3, new ACListenerS60S0101000_28(i3, feedTimerPendantManger, 0), bubble, feedTimerPendantManger, str4, str5, str6, z4, z3));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedTimerPendantManger@1ce3.showTimerActivationBubble$showBubbleAction$1");
            }
        };
        if (this.LLJ == 1) {
            C1898700zVc c1898700zVc2 = this.LLIZ;
            if (c1898700zVc2 != null && c1898700zVc2.getVisibility() == 0 && this.LLJ == 1) {
                C1898700zVc c1898700zVc3 = this.LLIZ;
                if (c1898700zVc3 != null) {
                    c1898700zVc3.LJJIJIIJI(runnable, C1899620zX6.LIZ());
                }
                TimerPendant timerPendant = (TimerPendant) this.LLILLL;
                if (timerPendant == null || (num = timerPendant.shrinkAfter) == null || (iIntValue = num.intValue() - 1) < 0) {
                    iIntValue = 0;
                }
                this.LLJILJILJ = iIntValue;
                this.LLJ = 0;
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                T t = this.LLILLL;
                if (t != 0) {
                    i2 = t.LIZ;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("vv_cnt", String.valueOf(this.LLJJIII));
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJJJI());
                linkedHashMap.put("task_status", LJJJ());
                linkedHashMap.put("single_status", this.LLJI);
                c1894320zOY.getClass();
                C1894320zOY.LJIJJ(i2, linkedHashMap, null, null, null, "");
                return;
            }
            return;
        }
        runnable.run();
    }
}
