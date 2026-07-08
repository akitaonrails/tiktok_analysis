package com.bytedance.android.livesdk.impl.revenue.strategy.incentive;

import X.AbstractC1134420fcu;
import X.AnonymousClass0994;
import X.C001A;
import X.C098200Yq;
import X.C09JN;
import X.C0PEM;
import X.C1124400fMk;
import X.C1134190fcX;
import X.C1134210fcZ;
import X.C1134220fca;
import X.C1134320fck;
import X.C1134410fct;
import X.C1134430fcv;
import X.C1134510fd3;
import X.C1134520fd4;
import X.C1134550fd7;
import X.C1134560fd8;
import X.C1161920gLG;
import X.C11NJ;
import X.C1323820kYO;
import X.C13LZ;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C20441214yg;
import X.C2079108Cn;
import X.C2188811AlT;
import X.C262100zr;
import X.C397901gf;
import X.C500260Jjc;
import X.C5183020f;
import X.C520010KaN;
import X.C531650Kt9;
import X.C776250Uch;
import X.C784440Upu;
import X.EnumC1134460fcy;
import X.InterfaceC1107590evd;
import X.InterfaceC1134750fdR;
import X.InterfaceC1141530foN;
import X.InterfaceC1871920yoQ;
import Y.AfS186S0100000_17;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftSendPreCheckStart;
import com.bytedance.android.live.gift.SendGiftSuccessEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.api.coin.incentive.CoinIncentiveTaskPageOpenEvent;
import com.bytedance.android.livesdk.api.coin.incentive.UgPointsGiftEndEvent;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.IncentiveSendGiftChannel;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskChangeEvent;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskErrorEvent;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class IncentiveTaskWidgetV2 extends LiveRecyclableWidget implements OnIMMessageListener, InterfaceC1141530foN, InterfaceC1134750fdR {
    public static int LLILZ;
    public IMessageManager LL;
    public C11NJ LLILLJJLI;
    public final LifecycleEventObserver LLILLL = new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.impl.revenue.strategy.incentive.IncentiveTaskWidgetV2$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            this.LL.getClass();
            int i = C2079108Cn.LIZ[event.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        TaskManagerV2.LIZ.getClass();
                        TaskManagerV2.LJIILL();
                        return;
                    }
                    return;
                }
                C1134550fd7.LIZ.getClass();
                C1134550fd7.LIZLLL = false;
                C1134550fd7.LJI();
                C1134520fd4.LIZ.getClass();
                C1134520fd4.LJ = false;
                C1134520fd4.LJFF(Long.valueOf(C1134520fd4.LJFF));
                return;
            }
            C1134550fd7.LIZ.getClass();
            C1134550fd7.LIZLLL = true;
            C1134550fd7.LJI();
            C1134520fd4.LIZ.getClass();
            C1134520fd4.LJ = true;
            C1134520fd4.LJFF(Long.valueOf(C1134520fd4.LJFF));
        }
    };

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "revenue_strategy";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Lifecycle lifecycle;
        x1(false);
        DataChannelGlobal.LLILZ.zQ2(this);
        LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.context, false);
        if (lifecycleOwnerLJJIFFI != null && (lifecycle = lifecycleOwnerLJJIFFI.getLifecycle()) != null) {
            lifecycle.removeObserver(this.LLILLL);
        }
        C1134550fd7.LIZ.getClass();
        C1134550fd7.LJI.remove(this);
        C1548820qPI.LJIIIIZZ("live_coin_quit_point_gifting", this);
        C1548820qPI.LJIIIIZZ("live_coin_task_operate", this);
        C11NJ c11nj = this.LLILLJJLI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILLJJLI = null;
        this.LL = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // X.InterfaceC1134750fdR
    public final void D(boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWatchStatusChanged: isWatching: ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("IncentiveTaskWidgetV2", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            C189200o6.m2constructorimpl(jSONObject.putOpt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "live_play_status_changed"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1871920yoQ array;
        InterfaceC1107590evd map;
        String string;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        InterfaceC1871920yoQ array2;
        Integer numValueOf5;
        int i;
        InterfaceC1107590evd map2;
        int i2;
        TaskInfo taskInfo;
        TaskInfoResponse.UserTaskInfo userTaskInfo;
        List<TaskInfo> list;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "live_coin_task_operate")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && (array = interfaceC1107590evd.getArray("task_operate_array")) != null && array.size() > 0) {
                TaskManagerV2.LIZ.getClass();
                C531650Kt9 it2 = C13LZ.LJIILJJIL(0, array.size()).iterator();
                while (it2.LLILLL && (map = array.getMap(it2.nextInt())) != null) {
                    int i3 = map.getInt("task_operate_type");
                    InterfaceC1107590evd map3 = map.getMap("task_info");
                    if (map3 != null) {
                        string = map3.getString("task_id");
                        numValueOf = Integer.valueOf(map3.getInt("task_type"));
                    } else {
                        string = null;
                        numValueOf = null;
                    }
                    if (map3 != null) {
                        numValueOf2 = Integer.valueOf(map3.getInt("task_status"));
                        numValueOf3 = Integer.valueOf(map3.getInt("reward_amount"));
                        numValueOf4 = Integer.valueOf(map3.getInt("task_complete_end_time"));
                        array2 = map3.getArray("sub_tasks");
                    } else {
                        numValueOf2 = null;
                        numValueOf3 = null;
                        numValueOf4 = null;
                        array2 = null;
                    }
                    if (string != null && numValueOf != null && numValueOf2 != null && numValueOf3 != null && numValueOf4 != null) {
                        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
                        int iIntValue = numValueOf.intValue();
                        int iIntValue2 = numValueOf2.intValue();
                        int iIntValue3 = numValueOf3.intValue();
                        int iIntValue4 = numValueOf4.intValue();
                        taskManagerV2.getClass();
                        C1134410fct c1134410fctLIZIZ = TaskManagerV2.LIZIZ(string);
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Unsupported operate type: ");
                                    sbLIZ.append(i3);
                                    C20441214yg.LJIIL("StrategyTaskManagerV2", C2188811AlT.LIZIZ(sbLIZ));
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("update task: ");
                                    if (c1134410fctLIZIZ != null && (taskInfo = (TaskInfo) c1134410fctLIZIZ.LIZ) != null) {
                                        numValueOf5 = Integer.valueOf(taskInfo.taskType);
                                    } else {
                                        numValueOf5 = null;
                                    }
                                    sbLIZ2.append(numValueOf5);
                                    C20441214yg.LJIIIZ("StrategyTaskManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
                                    if (c1134410fctLIZIZ != null) {
                                        TaskInfo taskInfo2 = (TaskInfo) c1134410fctLIZIZ.LIZ;
                                        taskInfo2.rewardAmount = iIntValue3;
                                        taskInfo2.taskCompleteEndTime = iIntValue4;
                                        C1134510fd3 c1134510fd3 = C1134510fd3.LIZIZ;
                                        EnumC1134460fcy enumC1134460fcyLIZIZ = C1134430fcv.LIZIZ(iIntValue2);
                                        if (enumC1134460fcyLIZIZ == null) {
                                            enumC1134460fcyLIZIZ = EnumC1134460fcy.TASK_UNKNOWN;
                                        }
                                        c1134510fd3.getClass();
                                        if (enumC1134460fcyLIZIZ != EnumC1134460fcy.TASK_UNKNOWN && c1134410fctLIZIZ.LJIIJJI()) {
                                            c1134410fctLIZIZ.LJI(enumC1134460fcyLIZIZ);
                                            AbstractC1134420fcu<T, S> abstractC1134420fcu = c1134410fctLIZIZ.LJFF;
                                            if ((abstractC1134420fcu instanceof C1134410fct) && abstractC1134420fcu != 0 && c1134410fctLIZIZ.LIZJ() == EnumC1134460fcy.TASK_EXIT) {
                                                TaskInfo taskInfo3 = (TaskInfo) abstractC1134420fcu.LIZ;
                                                long j = taskInfo3.taskCompletedNum;
                                                List<S> list2 = abstractC1134420fcu.LJ;
                                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                                    i2 = 0;
                                                } else {
                                                    Iterator it3 = list2.iterator();
                                                    i2 = 0;
                                                    while (it3.hasNext()) {
                                                        if (((AbstractC1134420fcu) it3.next()).LIZJ() == EnumC1134460fcy.TASK_EXIT && (i2 = i2 + 1) < 0) {
                                                            C1697810uHb.LJIJ();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                taskInfo3.taskCompletedNum = Math.max(j, i2);
                                                int iIndexOf = abstractC1134420fcu.LJ.indexOf(c1134410fctLIZIZ) + 1;
                                                if (iIndexOf >= abstractC1134420fcu.LJ.size()) {
                                                    abstractC1134420fcu.LJI(EnumC1134460fcy.TASK_EXIT);
                                                } else {
                                                    ((AbstractC1134420fcu) ListProtector.get(abstractC1134420fcu.LJ, iIndexOf)).LJI(EnumC1134460fcy.TASK_IN_PROGRESS);
                                                }
                                            }
                                        }
                                        int i4 = 0;
                                        for (Object obj : c1134410fctLIZIZ.LJ) {
                                            int i5 = i4 + 1;
                                            if (i4 >= 0) {
                                                AbstractC1134420fcu abstractC1134420fcu2 = (AbstractC1134420fcu) obj;
                                                if (array2 != null && (map2 = array2.getMap(i4)) != null) {
                                                    i = map2.getInt("task_status");
                                                } else {
                                                    i = 0;
                                                }
                                                EnumC1134460fcy enumC1134460fcyLIZIZ2 = C1134430fcv.LIZIZ(i);
                                                if (enumC1134460fcyLIZIZ2 == null) {
                                                    enumC1134460fcyLIZIZ2 = EnumC1134460fcy.TASK_UNKNOWN;
                                                }
                                                abstractC1134420fcu2.LJI(enumC1134460fcyLIZIZ2);
                                                i4 = i5;
                                            } else {
                                                C1697810uHb.LJIJI();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else if (c1134410fctLIZIZ != null) {
                                CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = TaskManagerV2.LIZIZ;
                                if (copyOnWriteArrayList.contains(c1134410fctLIZIZ)) {
                                    copyOnWriteArrayList.remove(c1134410fctLIZIZ);
                                    c1134410fctLIZIZ.LIZ();
                                } else {
                                    c1134410fctLIZIZ.LJ();
                                }
                                TaskManagerV2.LJIJJ();
                            }
                        } else if (TaskManagerV2.LIZIZ(string) != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Add failed: Task ");
                            sbLIZ3.append(string);
                            sbLIZ3.append(" already exists");
                            C20441214yg.LJIIL("StrategyTaskManagerV2", C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            TaskInfo taskInfo4 = new TaskInfo();
                            taskInfo4.taskId = string;
                            taskInfo4.taskType = iIntValue;
                            taskInfo4.taskStatus = iIntValue2;
                            taskInfo4.rewardAmount = iIntValue3;
                            taskInfo4.taskCompleteEndTime = iIntValue4;
                            C1134410fct c1134410fctLIZ = C1134430fcv.LIZ(taskInfo4);
                            if (c1134410fctLIZ != null) {
                                TaskManagerV2.LIZIZ.add(c1134410fctLIZ);
                                TaskInfoResponse.Data data = TaskManagerV2.LIZLLL;
                                if (data != null && (userTaskInfo = data.userTaskInfo) != null && (list = userTaskInfo.taskInfos) != null) {
                                    list.add(taskInfo4);
                                }
                                TaskManagerV2.LJIJJ();
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "live_coin_quit_point_gifting")) {
            this.dataChannel.FQ2(UgPointsGiftEndEvent.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        C1134320fck.LIZ.getClass();
        C1134320fck.LIZIZ.add(new C1124400fMk());
        C19EG c19egLIZ = C500260Jjc.LIZ(this.context);
        if (c19egLIZ != null) {
            iHashCode = c19egLIZ.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode != LLILZ) {
            C19EG c19egLIZ2 = C500260Jjc.LIZ(this.context);
            if (c19egLIZ2 != null) {
                iHashCode2 = c19egLIZ2.hashCode();
            } else {
                iHashCode2 = 0;
            }
            LLILZ = iHashCode2;
            TaskManagerV2.LIZ.getClass();
            TaskManagerV2.LJFF.compareAndSet(false, true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Lifecycle lifecycle;
        C20441214yg.LJIIIZ("IncentiveTaskWidgetV2", "new arch widget load");
        IMessageManager iMessageManager = null;
        C500260Jjc.LJJJJJ(this, C0PEM.LIZJ, new AnonymousClass0994(null), 2);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        }
        this.LL = iMessageManager;
        LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.context, false);
        if (lifecycleOwnerLJJIFFI != null && (lifecycle = lifecycleOwnerLJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(this.LLILLL);
        }
        C1134550fd7.LIZ.getClass();
        C1134550fd7.LJI.add(this);
        if (C1134190fcX.LIZ && !C1134190fcX.LIZIZ) {
            C1134190fcX.LIZIZ = true;
            C784440Upu.LIZ().LJ(C1134210fcZ.class).LJJLJLI(new C09JN() { // from class: X.0fcW
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("WalletRechargePanelUtils@9d98.register$1");
                    C1134190fcX.LIZJ++;
                    C0U53.ee.LJFF(Long.valueOf(C1134190fcX.LIZJ));
                    C1C7U.LIZIZ("WalletRechargePanelUtils@9d98.register$1");
                }
            });
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TaskChangeEvent.class, new AwS596S0100000_17(this, 171));
        DataChannelGlobal.LLILZ.BQ2(this, this, TaskErrorEvent.class, new AwS596S0100000_17(this, 172));
        DataChannelGlobal.LLILZ.BQ2(this, this, IncentiveSendGiftChannel.class, new AwS596S0100000_17(this, 173));
        this.dataChannel.BQ2(this, SendGiftSuccessEvent.class, AFwS254S0000000_17.get$arr$(69));
        this.dataChannel.BQ2(this, GiftDialogVisibilityChannel.class, new C5183020f(this, 126));
        this.dataChannel.BQ2(this, GiftSendPreCheckStart.class, new C5183020f(this, 127));
        Fragment detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(this.widgetCallback.getFragment());
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        Context context = this.context;
        taskManagerV2.getClass();
        if (detailSafRootFragment == null || (lifecycle = detailSafRootFragment.getLifecycle()) == null) {
            LifecycleOwner lifecycleOwnerLJJIFFI2 = C520010KaN.LJJIFFI(context, false);
            if (lifecycleOwnerLJJIFFI2 != null) {
                Lifecycle lifecycle2 = lifecycleOwnerLJJIFFI2.getLifecycle();
                LifecycleEventObserver lifecycleEventObserver = TaskManagerV2.LJI;
                lifecycle2.removeObserver(lifecycleEventObserver);
                lifecycle2.addObserver(lifecycleEventObserver);
                C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
                C1134560fd8.LIZIZ.add(new C1134220fca(taskManagerV2));
            }
        } else {
            LifecycleEventObserver lifecycleEventObserver2 = TaskManagerV2.LJI;
            lifecycle2.removeObserver(lifecycleEventObserver2);
            lifecycle2.addObserver(lifecycleEventObserver2);
            C1134560fd8 c1134560fd82 = C1134560fd8.LIZ;
            C1134560fd8.LIZIZ.add(new C1134220fca(taskManagerV2));
        }
        x1(true);
        C1548820qPI.LIZLLL("live_coin_quit_point_gifting", this);
        C1548820qPI.LIZLLL("live_coin_task_operate", this);
        C11NJ c11nj = new C11NJ();
        this.LLILLJJLI = c11nj;
        c11nj.LIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().EU().LJJLJLI(new AfS186S0100000_17(this, 57)));
        this.dataChannel.BQ2(this, CoinIncentiveTaskPageOpenEvent.class, new AwS596S0100000_17(this, 170));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r13) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.incentive.IncentiveTaskWidgetV2.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void x1(boolean z) {
        if (z) {
            IMessageManager iMessageManager = this.LL;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.GUIDE_TASK_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
            IMessageManager iMessageManager2 = this.LL;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.BACKPACK_MESSAGE.getIntType(), (OnIMMessageListener) this);
                return;
            }
            return;
        }
        IMessageManager iMessageManager3 = this.LL;
        if (iMessageManager3 != null) {
            iMessageManager3.removeMessageListener(C001A.GUIDE_TASK_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.LL;
        if (iMessageManager4 == null) {
            return;
        }
        iMessageManager4.removeMessageListener(C001A.BACKPACK_MESSAGE.getIntType(), this);
    }
}
