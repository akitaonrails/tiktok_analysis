package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class LaunchBindBigCore {

    @C09CT("is_update_renderthread_at_launch")
    public boolean isUpdateRenderThreadAtLaunch;

    @C09CT("optimize_boost_main_thread_v5")
    public int mainThreadBindConfig;

    @C09CT("cold_boot_big_core_unbind_delay")
    public int mainThreadResetDelay;

    @C09CT("other_thread_bind")
    public List<ThreadBindCore> otherThreadBindCoreConfig;

    @C09CT("other_thread_bind_time")
    public int otherThreadBindCoreTime;

    public LaunchBindBigCore() {
        this(0, 0, null, 0, false, 31, null);
    }

    public final boolean isUpdateRenderThreadAtLaunch() {
        return this.isUpdateRenderThreadAtLaunch;
    }

    public final void setMainThreadBindConfig(int i) {
        this.mainThreadBindConfig = i;
    }

    public final void setMainThreadResetDelay(int i) {
        this.mainThreadResetDelay = i;
    }

    public final void setOtherThreadBindCoreConfig(List<ThreadBindCore> list) {
        this.otherThreadBindCoreConfig = list;
    }

    public final void setOtherThreadBindCoreTime(int i) {
        this.otherThreadBindCoreTime = i;
    }

    public final void setUpdateRenderThreadAtLaunch(boolean z) {
        this.isUpdateRenderThreadAtLaunch = z;
    }

    public LaunchBindBigCore(int i, int i2, List<ThreadBindCore> list, int i3, boolean z) {
        this.mainThreadBindConfig = i;
        this.mainThreadResetDelay = i2;
        this.otherThreadBindCoreConfig = list;
        this.otherThreadBindCoreTime = i3;
        this.isUpdateRenderThreadAtLaunch = z;
    }

    public LaunchBindBigCore(int i, int i2, List list, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? true : z);
    }
}
