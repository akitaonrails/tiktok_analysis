package com.ss.android.ugc.aweme.runnable;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class SlideRunnableBlockConfig {
    public final transient C01GW LIZ;
    public final transient C01GW LIZIZ;
    public final transient C01GW LIZJ;
    public final transient C01GW LIZLLL;
    public final transient C01GW LJ;

    @C09CT("block_rule_timeout")
    public final long blockRuleTimeout;

    @C09CT("runnable_black_list")
    public final List<String> runnableBlackList;

    @C09CT("runnable_name_list_mode")
    public final int runnableListMode;

    @C09CT("runnable_white_list")
    public final List<String> runnableWhiteList;

    @C09CT("slide_time_interval_limit")
    public final long slideTimeIntervalLimit;

    @C09CT("thread_black_list")
    public final List<String> threadBlackList;

    @C09CT("thread_name_list_mode")
    public final int threadListMode;

    @C09CT("thread_white_list")
    public final List<String> threadWhiteList;

    public SlideRunnableBlockConfig() {
        this(0, 0, null, null, null, null, 0L, 0L, 255, null);
    }

    public final List<String> LIZ() {
        return (List) this.LIZLLL.getValue();
    }

    public final List<String> LIZIZ() {
        return (List) this.LIZJ.getValue();
    }

    public final List<String> LIZJ() {
        return (List) this.LIZIZ.getValue();
    }

    public final List<String> LIZLLL() {
        return (List) this.LIZ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlideRunnableBlockConfig(threadListMode=");
        sbLIZ.append(this.threadListMode);
        sbLIZ.append(", runnableListMode=");
        sbLIZ.append(this.runnableListMode);
        sbLIZ.append(", threadBlackList=");
        sbLIZ.append(this.threadBlackList);
        sbLIZ.append(", threadWhiteList=");
        sbLIZ.append(this.threadWhiteList);
        sbLIZ.append(", runnableWhiteList=");
        sbLIZ.append(this.runnableWhiteList);
        sbLIZ.append(", runnableBlackList=");
        sbLIZ.append(this.runnableBlackList);
        sbLIZ.append(", blockRuleTimeout=");
        sbLIZ.append(this.blockRuleTimeout);
        sbLIZ.append(", slideTimeIntervalLimit=");
        sbLIZ.append(this.slideTimeIntervalLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlideRunnableBlockConfig(int i, int i2, List<String> list, List<String> list2, List<String> list3, List<String> list4, long j, long j2) {
        this.threadListMode = i;
        this.runnableListMode = i2;
        this.threadBlackList = list;
        this.threadWhiteList = list2;
        this.runnableWhiteList = list3;
        this.runnableBlackList = list4;
        this.blockRuleTimeout = j;
        this.slideTimeIntervalLimit = j2;
        this.LIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 144));
        this.LIZIZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 143));
        this.LIZJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 142));
        this.LIZLLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 141));
        this.LJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 140));
    }

    public SlideRunnableBlockConfig(int i, int i2, List list, List list2, List list3, List list4, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) == 0 ? i2 : 1, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? C13BV.INSTANCE : list2, (i3 & 16) != 0 ? C13BV.INSTANCE : list3, (i3 & 32) != 0 ? C13BV.INSTANCE : list4, (i3 & 64) != 0 ? 0L : j, (i3 & 128) == 0 ? j2 : 0L);
    }
}
