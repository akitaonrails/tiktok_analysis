package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C01GW;
import X.C09CT;
import X.C1161920gLG;
import X.C13LP;
import X.C2188811AlT;
import X.C452501pT;
import X.C480210IsN;
import X.C519090KXj;
import X.C519110KXl;
import X.C519120KXm;
import X.EnumC452301pR;
import X.EnumC480200IsM;
import X.InterfaceC465170ILz;
import X.InterfaceC519030KXd;
import X.InterfaceC519130KXn;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS2S0001000_7;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.LiveTaskScheduleTuneScene;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.PTFWatchLiveScheduleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveTaskScheduleTuneScene implements InterfaceC519030KXd {
    public static final LiveTaskScheduleTuneScene LIZ;
    public static final Set<String> LIZIZ;
    public static volatile boolean LIZJ;
    public static final C519090KXj LIZLLL;
    public static final C01GW LJ;

    static {
        IPullStreamService iPullStreamService;
        LiveTaskScheduleTuneScene liveTaskScheduleTuneScene = new LiveTaskScheduleTuneScene();
        LIZ = liveTaskScheduleTuneScene;
        LIZIZ = new LinkedHashSet();
        InterfaceC465170ILz interfaceC465170ILz = new InterfaceC465170ILz() { // from class: X.0KXk
            @Override // X.InterfaceC465170ILz
            public final void LIZ(String str, boolean z, boolean z2, boolean z3) {
                if (z2 && PTFWatchLiveScheduleSetting.INSTANCE.getValue().getShouldBlocWhenPrePull()) {
                    if (z) {
                        LiveTaskScheduleTuneScene.LIZIZ.add(str);
                    } else {
                        LiveTaskScheduleTuneScene.LIZIZ.remove(str);
                    }
                } else if (!z3 || PTFWatchLiveScheduleSetting.INSTANCE.getValue().getShouldBlockWhenPreviewPullStream()) {
                    if (z) {
                        LiveTaskScheduleTuneScene.LIZIZ.add(str);
                    } else {
                        LiveTaskScheduleTuneScene.LIZIZ.remove(str);
                    }
                }
                LiveTaskScheduleTuneScene liveTaskScheduleTuneScene2 = LiveTaskScheduleTuneScene.LIZ;
                boolean z4 = !LiveTaskScheduleTuneScene.LIZIZ.isEmpty();
                if (z4 != LiveTaskScheduleTuneScene.LIZJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPullStreamStatusChanged isPullStream = ");
                    sbLIZ.append(z4);
                    C2188811AlT.LIZIZ(sbLIZ);
                    LiveTaskScheduleTuneScene.LIZJ = z4;
                    if (LiveTaskScheduleTuneScene.LIZJ) {
                        LiveTaskScheduleTuneScene.LIZ(3);
                        LiveTaskScheduleTuneScene.LIZJ(8);
                    } else {
                        LiveTaskScheduleTuneScene.LIZJ(3);
                    }
                }
            }
        };
        LIZLLL = new C519090KXj();
        LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C519120KXm());
        if (!liveTaskScheduleTuneScene.enable() || (iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)) == null) {
            return;
        }
        iPullStreamService.sW1(interfaceC465170ILz);
    }

    public static ConcurrentHashSet LIZIZ() {
        return (ConcurrentHashSet) LJ.getValue();
    }

    @Override // X.InterfaceC519030KXd
    public final boolean enable() {
        return PTFWatchLiveScheduleSetting.INSTANCE.getValue().getEnable();
    }

    public static void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("printBlockScenes: ");
        sbLIZ.append(C13LP.LJJLIIIJ(LIZIZ(), "|", null, null, 0, null, AFwS237S0000000_7.get$arr$(40), 30));
        C2188811AlT.LIZIZ(sbLIZ);
        C519090KXj c519090KXj = LIZLLL;
        ConcurrentHashSet concurrentHashSetLIZIZ = LIZIZ();
        boolean z = !LIZIZ().isEmpty();
        c519090KXj.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSceneChanged scene: ");
        sbLIZ2.append(C13LP.LJJLIIIJ(concurrentHashSetLIZIZ, "|", null, null, 0, null, null, 62));
        sbLIZ2.append(", isBlocking: ");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        c519090KXj.LJIIJ = concurrentHashSetLIZIZ;
        c519090KXj.LJII = z;
        if (!c519090KXj.LIZLLL.isEmpty()) {
            c519090KXj.LIZIZ.submit(new ARunnableS107S0100000_7(c519090KXj, 239));
        }
    }

    public static void LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addBlockSceneTag: ");
        InterfaceC519130KXn.LJFF.getClass();
        sbLIZ.append(C519110KXl.LIZ(i));
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LIZIZ().contains(Integer.valueOf(i))) {
            LIZIZ().add(Integer.valueOf(i));
            LIZLLL();
        }
    }

    public static void LIZJ(int i) {
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeBlockSceneTag: ");
        InterfaceC519130KXn.LJFF.getClass();
        sbLIZ.append(C519110KXl.LIZ(i));
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LIZIZ().contains(Integer.valueOf(i))) {
            return;
        }
        LIZIZ().remove(Integer.valueOf(i));
        String strValueOf = String.valueOf(i);
        PTFWatchLiveScheduleSetting pTFWatchLiveScheduleSetting = PTFWatchLiveScheduleSetting.INSTANCE;
        if (pTFWatchLiveScheduleSetting.getValue().getCommonIdleTimePostBlock().containsKey(strValueOf)) {
            Long l = pTFWatchLiveScheduleSetting.getValue().getCommonIdleTimePostBlock().get(strValueOf);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            int i2 = i + 100;
            LIZIZ().add(Integer.valueOf(i2));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("removeBlockSceneTag: add postBlockIdleScene ");
            sbLIZ2.append(C519110KXl.LIZ(i2));
            C2188811AlT.LIZIZ(sbLIZ2);
            C519090KXj c519090KXj = LIZLLL;
            c519090KXj.LIZJ.schedule(new ARunnableS2S0001000_7(i2, 0), jLongValue, TimeUnit.MILLISECONDS);
        }
        LIZLLL();
    }

    @Override // X.InterfaceC519030KXd
    public final void S5(EnumC480200IsM enumC480200IsM) {
        if (PTFWatchLiveScheduleSetting.INSTANCE.isTriggerDisable(enumC480200IsM)) {
        }
        switch (C480210IsN.LIZ[enumC480200IsM.ordinal()]) {
            case 1:
                LIZ(1);
                LIZ(8);
                break;
            case 2:
                LIZJ(1);
                LIZJ(8);
                break;
            case 3:
                LIZ(2);
                break;
            case 4:
                LIZJ(2);
                break;
            case 5:
                LIZ(6);
                break;
            case 6:
                LIZJ(6);
                break;
            case 7:
                LIZ(7);
                LIZJ(8);
                break;
            case 8:
                LIZJ(7);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZJ(8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ(101);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZJ(101);
                break;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class TaskScheduleResult {

        @C09CT("ignoreBlockScenes")
        public final List<Integer> ignoreBlockScenes;

        @C09CT("schedulePriority")
        public final int schedulePriority;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskScheduleResult(schedulePriority=");
            sbLIZ.append(this.schedulePriority);
            sbLIZ.append(", ignoreBlockScenes=");
            sbLIZ.append(this.ignoreBlockScenes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TaskScheduleResult(int i, List<Integer> list) {
            this.schedulePriority = i;
            this.ignoreBlockScenes = list;
        }
    }
}
