package com.bytedance.android.livesdkapi.avoidance.setting;

import X.C1107810evz;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentRecoverInfo;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_conflict_control_default_setting")
public final class LiveConflictControlDefaultSetting {
    public static final MsgNotifyComAvoidConfig DEFAULT;
    public static final LiveConflictControlDefaultSetting INSTANCE = new LiveConflictControlDefaultSetting();
    public static final MsgNotifyComAvoidConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig = new MsgNotifyComAvoidConfig();
        List<MsgNotifyComponentAvoidRuleV2> list = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV2.componentType = 11;
        msgNotifyComponentAvoidRuleV2.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo.recover = true;
        msgNotifyComponentRecoverInfo.delayMs = 0L;
        msgNotifyComponentAvoidRuleV2.firstRecoverInfo = msgNotifyComponentRecoverInfo;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo2 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo2.recover = true;
        msgNotifyComponentRecoverInfo2.delayMs = 0L;
        msgNotifyComponentAvoidRuleV2.interruptRecoverInfo = msgNotifyComponentRecoverInfo2;
        msgNotifyComponentAvoidRuleV2.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV2.priority = 1L;
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        C1107810evz c1107810evz2 = C1107810evz.LJJIIJZLJL;
        C1107810evz c1107810evz3 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz4 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz5 = C1107810evz.LJJIII;
        C1107810evz c1107810evz6 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz7 = C1107810evz.LJJIZ;
        msgNotifyComponentAvoidRuleV2.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", c1107810evz5.LIZ, "EXPLORE_DRAWER", c1107810evz7.LIZ);
        list.add(msgNotifyComponentAvoidRuleV2);
        List<MsgNotifyComponentAvoidRuleV2> list2 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV22 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV22.componentType = 7;
        msgNotifyComponentAvoidRuleV22.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo3 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo3.recover = true;
        msgNotifyComponentRecoverInfo3.delayMs = 0L;
        msgNotifyComponentAvoidRuleV22.firstRecoverInfo = msgNotifyComponentRecoverInfo3;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo4 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo4.recover = true;
        msgNotifyComponentRecoverInfo4.delayMs = 0L;
        msgNotifyComponentAvoidRuleV22.interruptRecoverInfo = msgNotifyComponentRecoverInfo4;
        msgNotifyComponentAvoidRuleV22.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV22.priority = 3L;
        C1107810evz c1107810evz8 = C1107810evz.LIZIZ;
        msgNotifyComponentAvoidRuleV22.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", "LOCK_SCREEN", c1107810evz5.LIZ, "EXPLORE_DRAWER", c1107810evz7.LIZ);
        list2.add(msgNotifyComponentAvoidRuleV22);
        List<MsgNotifyComponentAvoidRuleV2> list3 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV23 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV23.componentType = 8;
        msgNotifyComponentAvoidRuleV23.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo5 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo5.recover = false;
        msgNotifyComponentRecoverInfo5.delayMs = 0L;
        msgNotifyComponentAvoidRuleV23.firstRecoverInfo = msgNotifyComponentRecoverInfo5;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo6 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo6.recover = false;
        msgNotifyComponentRecoverInfo6.delayMs = 0L;
        msgNotifyComponentAvoidRuleV23.interruptRecoverInfo = msgNotifyComponentRecoverInfo6;
        msgNotifyComponentAvoidRuleV23.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV23.priority = 3L;
        msgNotifyComponentAvoidRuleV23.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", c1107810evz5.LIZ, "EXPLORE_DRAWER", c1107810evz7.LIZ);
        list3.add(msgNotifyComponentAvoidRuleV23);
        List<MsgNotifyComponentAvoidRuleV2> list4 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV24 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV24.componentType = 6;
        msgNotifyComponentAvoidRuleV24.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo7 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo7.recover = true;
        msgNotifyComponentRecoverInfo7.delayMs = 0L;
        msgNotifyComponentAvoidRuleV24.firstRecoverInfo = msgNotifyComponentRecoverInfo7;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo8 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo8.recover = true;
        msgNotifyComponentRecoverInfo8.delayMs = 0L;
        msgNotifyComponentAvoidRuleV24.interruptRecoverInfo = msgNotifyComponentRecoverInfo8;
        msgNotifyComponentAvoidRuleV24.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV24.priority = 3L;
        msgNotifyComponentAvoidRuleV24.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", c1107810evz5.LIZ, "EXPLORE_DRAWER", c1107810evz7.LIZ);
        list4.add(msgNotifyComponentAvoidRuleV24);
        List<MsgNotifyComponentAvoidRuleV2> list5 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV25 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV25.componentType = 1;
        msgNotifyComponentAvoidRuleV25.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo9 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo9.recover = false;
        msgNotifyComponentRecoverInfo9.delayMs = 0L;
        msgNotifyComponentAvoidRuleV25.firstRecoverInfo = msgNotifyComponentRecoverInfo9;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo10 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo10.recover = false;
        msgNotifyComponentRecoverInfo10.delayMs = 0L;
        msgNotifyComponentAvoidRuleV25.interruptRecoverInfo = msgNotifyComponentRecoverInfo10;
        msgNotifyComponentAvoidRuleV25.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV25.priority = 4L;
        msgNotifyComponentAvoidRuleV25.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", c1107810evz5.LIZ, C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ, "EXPLORE_DRAWER", c1107810evz7.LIZ);
        list5.add(msgNotifyComponentAvoidRuleV25);
        List<MsgNotifyComponentAvoidRuleV2> list6 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV26 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV26.componentType = 14;
        msgNotifyComponentAvoidRuleV26.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo11 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo11.recover = true;
        msgNotifyComponentRecoverInfo11.delayMs = 0L;
        msgNotifyComponentAvoidRuleV26.firstRecoverInfo = msgNotifyComponentRecoverInfo11;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo12 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo12.recover = true;
        msgNotifyComponentRecoverInfo12.delayMs = 0L;
        msgNotifyComponentAvoidRuleV26.interruptRecoverInfo = msgNotifyComponentRecoverInfo12;
        msgNotifyComponentAvoidRuleV26.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV26.priority = 2L;
        msgNotifyComponentAvoidRuleV26.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "LIVE_DIALOG", c1107810evz5.LIZ, "EXPLORE_DRAWER", c1107810evz7.LIZ);
        list6.add(msgNotifyComponentAvoidRuleV26);
        List<MsgNotifyComponentAvoidRuleV2> list7 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV27 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV27.componentType = 16;
        msgNotifyComponentAvoidRuleV27.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo13 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo13.recover = true;
        msgNotifyComponentRecoverInfo13.delayMs = Mp4ScreenVideoLoadTimeout.CONTROL;
        msgNotifyComponentAvoidRuleV27.firstRecoverInfo = msgNotifyComponentRecoverInfo13;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo14 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo14.recover = true;
        msgNotifyComponentRecoverInfo14.delayMs = Mp4ScreenVideoLoadTimeout.CONTROL;
        msgNotifyComponentAvoidRuleV27.interruptRecoverInfo = msgNotifyComponentRecoverInfo14;
        msgNotifyComponentAvoidRuleV27.maxActiveCount = Integer.MAX_VALUE;
        msgNotifyComponentAvoidRuleV27.priority = 4L;
        msgNotifyComponentAvoidRuleV27.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, c1107810evz7.LIZ, "LIVE_DIALOG", "LIVE_NON_INPUT_BOTTOM_SHEET", c1107810evz5.LIZ, "EXPLORE_DRAWER");
        list7.add(msgNotifyComponentAvoidRuleV27);
        List<MsgNotifyComponentAvoidRuleV2> list8 = msgNotifyComAvoidConfig.componentRuleListV2;
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV28 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV28.componentType = 19;
        msgNotifyComponentAvoidRuleV28.canBeInterrupt = true;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo15 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo15.recover = true;
        msgNotifyComponentRecoverInfo15.delayMs = 1000L;
        msgNotifyComponentAvoidRuleV28.firstRecoverInfo = msgNotifyComponentRecoverInfo15;
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo16 = new MsgNotifyComponentRecoverInfo();
        msgNotifyComponentRecoverInfo16.recover = false;
        msgNotifyComponentRecoverInfo16.delayMs = 0L;
        msgNotifyComponentAvoidRuleV28.interruptRecoverInfo = msgNotifyComponentRecoverInfo16;
        msgNotifyComponentAvoidRuleV28.maxActiveCount = 1;
        msgNotifyComponentAvoidRuleV28.priority = 2L;
        C1107810evz c1107810evz9 = C1107810evz.LIZIZ;
        msgNotifyComponentAvoidRuleV28.avoidScene = C1697810uHb.LJIILJJIL(c1107810evz2.LIZ, "LIVE_NON_INPUT_BOTTOM_SHEET", "EXPLORE_DRAWER", "LIVE_FULL_SCREEN_SURVEY", C1107810evz.LJJJJ.LIZ, C1107810evz.LJJJJL.LIZ);
        list8.add(msgNotifyComponentAvoidRuleV28);
        DEFAULT = msgNotifyComAvoidConfig;
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig2 = (MsgNotifyComAvoidConfig) SettingsManager.INSTANCE.getValueSafely("live_conflict_control_default_setting", msgNotifyComAvoidConfig);
        if (msgNotifyComAvoidConfig2 != null) {
            msgNotifyComAvoidConfig = msgNotifyComAvoidConfig2;
        }
        value = msgNotifyComAvoidConfig;
    }

    public static final MsgNotifyComAvoidConfig getValue() {
        return value;
    }
}
