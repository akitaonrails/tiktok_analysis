package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C15438062q;
import X.C1AWY;
import X.C2184301AeC;
import X.C2184901AfA;
import X.C452501pT;
import X.EnumC2184291AeB;
import X.EnumC2184841Af4;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("watch_thread_runnable_block_config")
public final class LiveRoomRunnableBlockMiloConfigExperiment {
    public static final LiveRoomRunnableBlockMiloConfigExperiment INSTANCE = new LiveRoomRunnableBlockMiloConfigExperiment();
    public static final LiveRunnableBlockConfigs DEFAULT = new LiveRunnableBlockConfigs(false, 0, new ArrayList(), 1500, 0, 0, EnumC2184841Af4.NONE.ordinal(), "", 0);
    public static final C01GW enableOpt$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(45));
    public static final C01GW enterOptBitmask$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(46));
    public static final C01GW runnableBlockConfig$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(47));

    public static /* synthetic */ void getEnableOpt$annotations() {
    }

    public static /* synthetic */ void getRunnableBlockConfig$annotations() {
    }

    public static final boolean anyEnabled() {
        return INSTANCE.getEnterOptBitmask() != 0;
    }

    public static final boolean exp1ClickEnabled() {
        return (INSTANCE.getEnterOptBitmask() & 1) != 0;
    }

    public static final boolean exp2SlideEnabled() {
        return (INSTANCE.getEnterOptBitmask() & 2) != 0;
    }

    public static final boolean getEnableOpt() {
        return ((Boolean) enableOpt$delegate.getValue()).booleanValue();
    }

    private final int getEnterOptBitmask() {
        return ((Number) enterOptBitmask$delegate.getValue()).intValue();
    }

    public static final C2184901AfA getRunnableBlockConfig() {
        return (C2184901AfA) runnableBlockConfig$delegate.getValue();
    }

    public final LiveRunnableBlockConfigs getValue() {
        LiveRunnableBlockConfigs liveRunnableBlockConfigs = (LiveRunnableBlockConfigs) SettingsManager.INSTANCE.getValueSafely(LiveRoomRunnableBlockMiloConfigExperiment.class);
        return liveRunnableBlockConfigs == null ? DEFAULT : liveRunnableBlockConfigs;
    }

    public final C2184301AeC toMiloConfig(LiveRunnableBlockConfig liveRunnableBlockConfig) {
        C1AWY c1awy;
        C2184301AeC c2184301AeC = new C2184301AeC();
        int i = liveRunnableBlockConfig.blockMode;
        EnumC2184291AeB enumC2184291AeB = EnumC2184291AeB.PARK;
        if (i != enumC2184291AeB.ordinal()) {
            EnumC2184291AeB enumC2184291AeB2 = EnumC2184291AeB.TIME;
            if (i == enumC2184291AeB2.ordinal()) {
                enumC2184291AeB = enumC2184291AeB2;
            }
        }
        c2184301AeC.LJFF = enumC2184291AeB;
        int i2 = liveRunnableBlockConfig.runnableBlockType;
        C1AWY c1awy2 = C1AWY.ALL;
        if (i2 == c1awy2.ordinal()) {
            c1awy = c1awy2;
        } else {
            c1awy = C1AWY.SINGLE;
        }
        c2184301AeC.LJI = c1awy;
        if (liveRunnableBlockConfig.threadBlockType != c1awy2.ordinal()) {
            c1awy2 = C1AWY.SINGLE;
        }
        c2184301AeC.LJII = c1awy2;
        c2184301AeC.LJIIIIZZ = liveRunnableBlockConfig.blockTime;
        c2184301AeC.LJIIIZ = liveRunnableBlockConfig.sceneMinInterval;
        c2184301AeC.LJ = liveRunnableBlockConfig.threadBlockOnce;
        List<String> list = liveRunnableBlockConfig.threadConfigForTypeSingle;
        if (list != null) {
            ((ArrayList) c2184301AeC.LIZLLL).addAll(list);
        }
        List<String> list2 = liveRunnableBlockConfig.threadConfigForTypeAll;
        if (list2 != null) {
            ((ArrayList) c2184301AeC.LIZJ).addAll(list2);
        }
        List<String> list3 = liveRunnableBlockConfig.runnableConfigForTypeSingle;
        if (list3 != null) {
            ((ArrayList) c2184301AeC.LIZIZ).addAll(list3);
        }
        List<String> list4 = liveRunnableBlockConfig.runnableConfigForTypeAll;
        if (list4 != null) {
            ((ArrayList) c2184301AeC.LIZ).addAll(list4);
        }
        return c2184301AeC;
    }

    public final C2184901AfA toMiloRunnableBlockConfigs(LiveRunnableBlockConfigs liveRunnableBlockConfigs) {
        C2184901AfA c2184901AfA = new C2184901AfA();
        c2184901AfA.LIZ = liveRunnableBlockConfigs.maxQueueSize;
        List<LiveRunnableBlockConfig> list = liveRunnableBlockConfigs.blockConfigs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<LiveRunnableBlockConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(INSTANCE.toMiloConfig(it2.next()));
        }
        c2184901AfA.LIZIZ = arrayList;
        c2184901AfA.LIZJ = liveRunnableBlockConfigs.taskTimeOut;
        liveRunnableBlockConfigs.splitInterval = liveRunnableBlockConfigs.splitInterval;
        liveRunnableBlockConfigs.splitTimeout = liveRunnableBlockConfigs.splitTimeout;
        int i = liveRunnableBlockConfigs.splitMode;
        EnumC2184841Af4 enumC2184841Af4 = EnumC2184841Af4.NONE;
        if (i != enumC2184841Af4.ordinal()) {
            EnumC2184841Af4 enumC2184841Af42 = EnumC2184841Af4.SCENE_END;
            if (i == enumC2184841Af42.ordinal()) {
                enumC2184841Af4 = enumC2184841Af42;
            } else {
                EnumC2184841Af4 enumC2184841Af43 = EnumC2184841Af4.SCENE_START;
                if (i == enumC2184841Af43.ordinal()) {
                    enumC2184841Af4 = enumC2184841Af43;
                }
            }
        }
        c2184901AfA.LIZLLL = enumC2184841Af4;
        c2184901AfA.LJFF = liveRunnableBlockConfigs.distinctStr;
        return c2184901AfA;
    }
}
