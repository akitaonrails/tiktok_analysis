package com.bytedance.android.livesdk.impl.revenue.strategy.base;

import X.AbstractC1134420fcu;
import X.C0PEM;
import X.C1121450fHz;
import X.C1126800fQc;
import X.C1131670fYT;
import X.C1133940fc8;
import X.C1134270fcf;
import X.C1134410fct;
import X.C1134430fcv;
import X.C1134540fd6;
import X.C1134560fd8;
import X.C1134570fd9;
import X.C1134700fdM;
import X.C1134900fdg;
import X.C1148670fzt;
import X.C1149580g1M;
import X.C13LP;
import X.C15438062q;
import X.C158B;
import X.C1697810uHb;
import X.C176600m4;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C470360IcU;
import X.C500260Jjc;
import X.EnumC1134460fcy;
import X.InterfaceC1134710fdN;
import Y.ARunnableS20S0100100_17;
import Y.ARunnableS94S0000000_17;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.guide.model.EntryConditions;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.guide.model.TaskEntranceInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoExtra;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.guide.model.TaskUtilExtra;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveIncentiveTaskUpdateBeforeRemoveSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveStrategyTpDataUpdateFixSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TouchPointData;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskManagerV2 implements InterfaceC1134710fdN {
    public static TaskInfoResponse.Data LIZJ;
    public static TaskInfoResponse.Data LIZLLL;
    public static final TaskManagerV2 LIZ = new TaskManagerV2();
    public static final CopyOnWriteArrayList<C1134410fct> LIZIZ = new CopyOnWriteArrayList<>();
    public static final List<Runnable> LJ = Collections.synchronizedList(new ArrayList());
    public static final AtomicBoolean LJFF = new AtomicBoolean(true);
    public static final LifecycleEventObserver LJI = new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
            C1134560fd8.LIZIZ.remove(new C1134700fdM(TaskManagerV2.LIZ));
        }
    };

    public final boolean LJIIIZ() {
        C1134410fct c1134410fctLJI = LJI(4);
        return c1134410fctLJI != null && C1134410fct.LJII(c1134410fctLJI);
    }

    public static List LJIIIIZZ() {
        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C1134410fct c1134410fct : copyOnWriteArrayList) {
            C1134410fct c1134410fct2 = c1134410fct;
            c1134410fct2.getClass();
            if (C1134410fct.LJIIIIZZ(c1134410fct2)) {
                arrayList.add(c1134410fct);
            }
        }
        return arrayList;
    }

    public static void LJIILL() {
        List<Runnable> list = LJ;
        synchronized (list) {
            try {
                Iterator<Runnable> it2 = list.iterator();
                while (it2.hasNext()) {
                    C470360IcU.LIZ.removeCallbacks(it2.next());
                }
                LJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIZILJ() {
        C1134410fct next;
        List<S> list;
        Iterator<C1134410fct> it2 = LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C1134410fct c1134410fct = next;
            if (((TaskInfo) c1134410fct.LIZ).taskType == 4 && C1134410fct.LJIIIIZZ(c1134410fct)) {
                break;
            }
        }
        C1134410fct c1134410fct2 = next;
        if (c1134410fct2 == null || (list = c1134410fct2.LJ) == 0) {
            return;
        }
        for (S s : list) {
            LIZ.getClass();
            LJIJ(s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1134410fct LJ() {
        C1134410fct next;
        Iterator<C1134410fct> it2 = LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((TaskInfo) next.LIZ).targetType == 5) {
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<TaskInfo> LJFF() {
        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C1134410fct c1134410fct : copyOnWriteArrayList) {
            C1134410fct c1134410fct2 = c1134410fct;
            if (C1134900fdg.LIZIZ(c1134410fct2) && ((TaskInfo) c1134410fct2.LIZ).preRewardType == 2) {
                arrayList.add(c1134410fct);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AbstractC1134420fcu) it2.next()).LIZ);
        }
        return arrayList2;
    }

    public final List<Long> LJII() {
        TaskInfoResponse.WidgetInfo widgetInfo;
        EntryConditions entryConditions;
        List<Long> list;
        TaskInfoResponse.Data data = LIZLLL;
        return (data == null || (widgetInfo = data.widgetInfo) == null || (entryConditions = widgetInfo.entryConditions) == null || (list = entryConditions.blockGiftIds) == null) ? new ArrayList() : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJ() {
        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = LIZIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<C1134410fct> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (((TaskInfo) it2.next().LIZ).targetType == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJIIL() {
        C1134410fct c1134410fctLJI = LJI(11);
        if (c1134410fctLJI == null) {
            return false;
        }
        return c1134410fctLJI.LIZJ() == EnumC1134460fcy.TASK_ENTER || (c1134410fctLJI.LIZJ() == EnumC1134460fcy.TASK_IN_PROGRESS && c1134410fctLJI.LJIIJJI());
    }

    public static void LJIJJ() {
        LJIILL();
        LJIILLIIL(102);
        LJIILLIIL(11);
        LJIILLIIL(105);
        LJIILLIIL(3);
        LJIILLIIL(2);
        LJIILLIIL(40240);
        LJIILLIIL(40241);
    }

    public static C1134410fct LIZIZ(String str) {
        for (C1134410fct c1134410fct : (ArrayList) LJIIIIZZ()) {
            if (Intrinsics.LJFF(c1134410fct.LJI, str)) {
                return c1134410fct;
            }
            LIZ.getClass();
            C1134410fct c1134410fctLIZJ = LIZJ(c1134410fct, str);
            if (c1134410fctLIZJ != null) {
                return c1134410fctLIZJ;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(TaskInfoResponse.Data data) {
        TaskInfoResponse.UserTaskInfo userTaskInfo;
        List<TaskInfo> list;
        C1134410fct next;
        if (data != null && (userTaskInfo = data.userTaskInfo) != null && (list = userTaskInfo.taskInfos) != null) {
            LIZLLL = data;
            for (TaskInfo taskInfo : list) {
                Iterator<C1134410fct> it2 = LIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C1134410fct c1134410fct = next;
                        if (Intrinsics.LJFF(((TaskInfo) c1134410fct.LIZ).taskId, taskInfo.taskId) || (C1697810uHb.LJIIJJI(14, 13).contains(Integer.valueOf(((TaskInfo) c1134410fct.LIZ).taskType)) && ((TaskInfo) c1134410fct.LIZ).taskType == taskInfo.taskType)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1134410fct c1134410fct2 = next;
                if (c1134410fct2 != null) {
                    C470360IcU.LIZ(new AwS418S0200000_17(c1134410fct2, taskInfo, 18));
                    c1134410fct2.LJIILJJIL(taskInfo);
                } else {
                    C1134410fct c1134410fctLIZ = C1134430fcv.LIZ(taskInfo);
                    if (c1134410fctLIZ != null) {
                        C470360IcU.LIZ(new AwS561S0100000_17(c1134410fctLIZ, 185));
                        TaskManagerV2 taskManagerV2 = LIZ;
                        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = LIZIZ;
                        taskManagerV2.getClass();
                        copyOnWriteArrayList.add(c1134410fctLIZ);
                        LJIL(c1134410fctLIZ);
                    }
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TaskInfo> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().taskId);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList2 = LIZIZ;
            final AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(setLLIIJI, (Set<String>) 168);
            if (Build.VERSION.SDK_INT > 25) {
                copyOnWriteArrayList2.removeIf(new Predicate() { // from class: X.0fdO
                    @Override // java.util.function.Predicate
                    public final /* synthetic */ boolean test(Object obj) {
                        return ((Boolean) awS596S0100000_17.invoke(obj)).booleanValue();
                    }
                });
                return;
            }
            for (C1134410fct c1134410fct3 : copyOnWriteArrayList2) {
                if (((Boolean) awS596S0100000_17.invoke(c1134410fct3)).booleanValue()) {
                    copyOnWriteArrayList2.remove(c1134410fct3);
                }
            }
            return;
        }
        LIZLLL = null;
        LIZIZ.clear();
    }

    public static void LJIILIIL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[on date switch], timestamp = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        C470360IcU.LIZIZ(new ARunnableS94S0000000_17(j, 2), 2L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIILJJIL(TaskInfoResponse.Data data) {
        C1134410fct c1134410fct;
        Object next;
        TaskInfoResponse.UserTaskInfo userTaskInfo = data.userTaskInfo;
        if (userTaskInfo == null) {
            return;
        }
        List listLLIIII = C13LP.LLIIII(userTaskInfo.taskInfos);
        Iterator<Integer> it2 = userTaskInfo.targetTaskTypes.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            Iterator it3 = listLLIIII.iterator();
            while (true) {
                c1134410fct = null;
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((TaskInfo) next).taskType == iIntValue) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TaskInfo taskInfo = (TaskInfo) next;
            Iterator<C1134410fct> it4 = LIZIZ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C1134410fct next2 = it4.next();
                if (((TaskInfo) next2.LIZ).taskType == iIntValue) {
                    c1134410fct = next2;
                    break;
                }
            }
            C1134410fct c1134410fct2 = c1134410fct;
            if (taskInfo != null) {
                if (c1134410fct2 != null) {
                    C470360IcU.LIZ(new AwS418S0200000_17(c1134410fct2, taskInfo, 19));
                    c1134410fct2.LJIILJJIL(taskInfo);
                } else {
                    C1134410fct c1134410fctLIZ = C1134430fcv.LIZ(taskInfo);
                    if (c1134410fctLIZ != null) {
                        C470360IcU.LIZ(new AwS561S0100000_17(c1134410fctLIZ, 187));
                        TaskManagerV2 taskManagerV2 = LIZ;
                        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = LIZIZ;
                        taskManagerV2.getClass();
                        copyOnWriteArrayList.add(c1134410fctLIZ);
                    } else {
                        C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(52));
                    }
                }
            } else if (c1134410fct2 != null) {
                C470360IcU.LIZ(new AwS561S0100000_17(c1134410fct2, 186));
                if (LiveIncentiveTaskUpdateBeforeRemoveSetting.INSTANCE.isEnable()) {
                    c1134410fct2.LJI(EnumC1134460fcy.TASK_EXIT);
                    c1134410fct2.LIZ();
                }
                LIZIZ.remove(c1134410fct2);
            }
        }
        TaskInfoResponse.Data data2 = LIZLLL;
        if (data2 == null) {
            LIZLLL = data;
            return;
        }
        TaskInfoResponse.UserTaskInfo userTaskInfo2 = data2.userTaskInfo;
        if (userTaskInfo2 == null) {
            return;
        }
        Set setLLIIJI = C13LP.LLIIJI(userTaskInfo.targetTaskTypes);
        List listLLIIII2 = C13LP.LLIIII(userTaskInfo2.taskInfos);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII2) {
            if (!setLLIIJI.contains(Integer.valueOf(((TaskInfo) obj).taskType))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.addAll(userTaskInfo.taskInfos);
        userTaskInfo2.taskInfos = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIILLIIL(int i) {
        C1134410fct next;
        Iterator<C1134410fct> it2 = LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((TaskInfo) next.LIZ).taskType == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1134410fct c1134410fct = next;
        if (c1134410fct == null) {
            return;
        }
        EnumC1134460fcy enumC1134460fcyLIZJ = c1134410fct.LIZJ();
        if (enumC1134460fcyLIZJ.compareTo(EnumC1134460fcy.TASK_ENTER) > 0 && enumC1134460fcyLIZJ.compareTo(EnumC1134460fcy.TASK_EXIT) < 0 && c1134410fct.LJIIJJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[setExpirationCheck] taskType = ");
            sbLIZ.append(i);
            C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
            long jLIZJ = C158B.LIZJ();
            TaskInfo taskInfo = (TaskInfo) c1134410fct.LIZ;
            long j = taskInfo.taskCompleteEndTime;
            long j2 = taskInfo.taskRewardEndTime;
            ARunnableS20S0100100_17 aRunnableS20S0100100_17 = new ARunnableS20S0100100_17(j, c1134410fct, 3);
            List<Runnable> list = LJ;
            list.add(aRunnableS20S0100100_17);
            C470360IcU.LIZIZ(aRunnableS20S0100100_17, (j - jLIZJ) + 1, TimeUnit.SECONDS);
            if (j2 > j) {
                ARunnableS20S0100100_17 aRunnableS20S0100100_172 = new ARunnableS20S0100100_17(j2, c1134410fct, 3);
                list.add(aRunnableS20S0100100_172);
                C470360IcU.LIZIZ(aRunnableS20S0100100_172, (j2 - jLIZJ) + 1, TimeUnit.SECONDS);
            }
        }
    }

    public static void LJIJ(C1134410fct c1134410fct) {
        if (c1134410fct.LJIIJJI() && c1134410fct.LIZJ() == EnumC1134460fcy.TASK_ENTER) {
            c1134410fct.LJIIL(EnumC1134460fcy.TASK_IN_PROGRESS);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start task ");
            sbLIZ.append(c1134410fct.LJI);
            C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
            for (S s : c1134410fct.LJ) {
                LIZ.getClass();
                LJIJ(s);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIL(C1134410fct c1134410fct) {
        TaskEntranceInfo taskEntranceInfo;
        TaskInfoExtra taskInfoExtra = ((TaskInfo) c1134410fct.LIZ).extra;
        if (taskInfoExtra != null && (taskEntranceInfo = taskInfoExtra.entrance) != null && taskEntranceInfo.widgetEnable) {
            if (c1134410fct.LJ.isEmpty() && c1134410fct.LJIIJJI()) {
                long jLIZJ = C158B.LIZJ();
                TaskInfo taskInfo = (TaskInfo) c1134410fct.LIZ;
                if (jLIZJ > taskInfo.taskStartTime && jLIZJ < taskInfo.taskCompleteEndTime && c1134410fct.LIZJ() == EnumC1134460fcy.TASK_TO_REWARD) {
                    c1134410fct.LIZIZ();
                    return;
                }
            }
            for (S s : c1134410fct.LJ) {
                LIZ.getClass();
                LJIL(s);
            }
        }
    }

    public static void LJJI(TaskInfoResponse.Data data) {
        Boolean boolValueOf;
        TaskUtilExtra taskUtilExtra;
        List<Integer> list;
        Boolean boolValueOf2;
        TaskUtilExtra taskUtilExtra2;
        List<Integer> list2;
        LocalCurrencyGiftInfo localCurrencyGiftInfo = null;
        if (LiveStrategyTpDataUpdateFixSetting.INSTANCE.isEnable()) {
            TaskInfoResponse.UserTaskInfo userTaskInfo = data.userTaskInfo;
            if (userTaskInfo != null && (list2 = userTaskInfo.targetTaskTypes) != null) {
                boolValueOf2 = Boolean.valueOf(!list2.isEmpty());
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                C470360IcU.LIZ(new AwS561S0100000_17(data, 188));
                LJIILJJIL(data);
                List<TouchPointData> listLIZ = C1134570fd9.LIZ(LIZIZ);
                C1121450fHz.LJFF(listLIZ);
                TaskInfoResponse.Data data2 = LIZLLL;
                if (data2 != null) {
                    data2.tpDataList = listLIZ;
                }
                TaskUtilExtra taskUtilExtra3 = data.taskUtilExtra;
                if (data2 != null && (taskUtilExtra2 = data2.taskUtilExtra) != null) {
                    if (taskUtilExtra3 != null) {
                        localCurrencyGiftInfo = taskUtilExtra3.localCurrencyGiftInfo;
                    }
                    taskUtilExtra2.localCurrencyGiftInfo = localCurrencyGiftInfo;
                    return;
                }
                return;
            }
            C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(53));
            LIZLLL(data);
            List<TouchPointData> listLIZ2 = C1134570fd9.LIZ(LIZIZ);
            C1121450fHz.LJFF(listLIZ2);
            TaskInfoResponse.Data data3 = LIZLLL;
            if (data3 == null) {
                return;
            }
            data3.tpDataList = listLIZ2;
            return;
        }
        TaskInfoResponse.UserTaskInfo userTaskInfo2 = data.userTaskInfo;
        if (userTaskInfo2 != null && (list = userTaskInfo2.targetTaskTypes) != null) {
            boolValueOf = Boolean.valueOf(!list.isEmpty());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C470360IcU.LIZ(new AwS561S0100000_17(data, 189));
            LJIILJJIL(data);
            List listLIZ3 = C1134570fd9.LIZ(LIZIZ);
            if (!listLIZ3.isEmpty()) {
                Iterator it2 = listLIZ3.iterator();
                while (it2.hasNext()) {
                    C1121450fHz.LIZ((TouchPointData) it2.next());
                }
                C1134570fd9.LIZIZ(LIZLLL, listLIZ3);
            }
            TaskUtilExtra taskUtilExtra4 = data.taskUtilExtra;
            TaskInfoResponse.Data data4 = LIZLLL;
            if (data4 == null || (taskUtilExtra = data4.taskUtilExtra) == null) {
                return;
            }
            if (taskUtilExtra4 != null) {
                localCurrencyGiftInfo = taskUtilExtra4.localCurrencyGiftInfo;
            }
            taskUtilExtra.localCurrencyGiftInfo = localCurrencyGiftInfo;
            return;
        }
        C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(54));
        LIZLLL(data);
        List listLIZ4 = C1134570fd9.LIZ(LIZIZ);
        C1121450fHz.LJFF(listLIZ4);
        C1134570fd9.LIZIZ(LIZLLL, listLIZ4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1134410fct LJI(int i) {
        C1134410fct next;
        Iterator<C1134410fct> it2 = LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((TaskInfo) next.LIZ).taskType == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJJI(int i) {
        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = LIZIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<C1134410fct> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (((TaskInfo) it2.next().LIZ).taskType == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C1134410fct LIZJ(C1134410fct c1134410fct, String str) {
        if (Intrinsics.LJFF(c1134410fct.LJI, str)) {
            return c1134410fct;
        }
        for (S s : c1134410fct.LJ) {
            LIZ.getClass();
            C1134410fct c1134410fctLIZJ = LIZJ(s, str);
            if (c1134410fctLIZJ != null) {
                return c1134410fctLIZJ;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.C1134410fct r11, long r12, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C1134650fdH
            if (r0 == 0) goto L53
            r9 = r14
            X.0fdH r9 = (X.C1134650fdH) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L59
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r4 = r11.LJI
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L50
            long r5 = r0.getId()
        L46:
            r9.LLILLL = r2
            r7 = r12
            java.lang.Object r0 = X.C1219670hqP.LJI(r4, r5, r7, r9)
            if (r0 != r3) goto L28
            return r3
        L50:
            r5 = 0
            goto L46
        L53:
            X.0fdH r9 = new X.0fdH
            r9.<init>(r10, r14)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LJIJJLI(X.0fct, long, X.05Vn):java.lang.Object");
    }

    public final void LJIJI(int i, int i2, String str, String str2) {
        C1134410fct c1134410fctLJI = LJI(i);
        if (c1134410fctLJI == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1134540fd6(c1134410fctLJI, i2, i, str, str2, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJ(String str, long j, int i, C1131670fYT c1131670fYT) {
        String symbol;
        C1134410fct next;
        RevenueExchange revenueExchange;
        long id;
        String str2;
        int realDot;
        BalanceStructExtra balanceStructExtra;
        CurrencyInfo currencyInfo;
        BalanceStructExtra balanceStructExtra2;
        BasePackage basePackage;
        BalanceStructExtra balanceStructExtra3;
        BasePackage basePackage2;
        BalanceStructExtra balanceStructExtra4;
        BasePackage basePackage3;
        Iterator<C1134410fct> it2 = LIZIZ.iterator();
        while (true) {
            symbol = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((TaskInfo) next.LIZ).taskType == 11) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1134410fct c1134410fct = next;
        if (c1134410fct == null) {
            c1131670fYT.LIZIZ(false);
            return;
        }
        C1134270fcf c1134270fcf = new C1134270fcf(c1134410fct, j, c1131670fYT);
        long jNo0 = ((long) i) - C1148670fzt.LIZ().walletCenter().No0();
        WalletStruct walletStructTF1 = C1148670fzt.LIZ().walletCenter().TF1();
        if (walletStructTF1 != null) {
            revenueExchange = walletStructTF1.revenue;
        } else {
            revenueExchange = null;
        }
        ExchangeParams exchangeParams = new ExchangeParams();
        long price = 0;
        if (walletStructTF1 != null && (balanceStructExtra4 = walletStructTF1.LIZ) != null && (basePackage3 = balanceStructExtra4.getBasePackage()) != null) {
            id = basePackage3.getId();
        } else {
            id = 0;
        }
        exchangeParams.diamondId = (int) id;
        exchangeParams.way = 1;
        if (revenueExchange == null || (str2 = revenueExchange.currency) == null) {
            str2 = "";
        }
        exchangeParams.currency = str2;
        exchangeParams.source = 16;
        exchangeParams.subSource = 111;
        exchangeParams.coinsCount = jNo0;
        if (walletStructTF1 != null && (balanceStructExtra3 = walletStructTF1.LIZ) != null && (basePackage2 = balanceStructExtra3.getBasePackage()) != null) {
            price = basePackage2.getPrice();
        }
        exchangeParams.localAmount = price * jNo0;
        if (walletStructTF1 != null && (balanceStructExtra2 = walletStructTF1.LIZ) != null && (basePackage = balanceStructExtra2.getBasePackage()) != null) {
            realDot = basePackage.getRealDot();
        } else {
            realDot = 0;
        }
        exchangeParams.currencyDot = realDot;
        C1126800fQc.LIZ.M92();
        exchangeParams.isFirstRecharge = C1133940fc8.LJIIJJI();
        if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null && (currencyInfo = balanceStructExtra.getCurrencyInfo()) != null) {
            symbol = currencyInfo.getSymbol();
        }
        exchangeParams.symbol = symbol;
        exchangeParams.penaltyWarningSkip = "";
        exchangeParams.exchangeLevel = "system_combo";
        exchangeParams.eventParams = C2097608Jq.LJI(new Pair("charge_reason", str));
        ((WalletExchange) C1148670fzt.LIZ().walletExchange()).LJ(C176600m4.LIZ(), null, false, exchangeParams, new C1149580g1M(exchangeParams, c1134270fcf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04b3 A[LOOP:2: B:220:0x04ad->B:222:0x04b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.0996, java.lang.Runnable] */
    @Override // X.InterfaceC1134710fdN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC1134590fdB r28, int r29, int r30, java.lang.String r31, java.lang.String r32, boolean r33, X.InterfaceC1364105Vn<? super java.lang.Boolean> r34) {
        /*
            Method dump skipped, instruction units count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZ(X.0fdB, int, int, java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
