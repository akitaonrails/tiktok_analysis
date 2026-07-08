package com.ss.android.ugc.aweme.minidrama.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareAwemeFrameworkConfigModel {

    @C09CT("disabled_scenes")
    public final List<String> disabledScenes;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("lru_max_episode")
    public final int lruMaxEpisode;

    @C09CT("lru_max_from_begin")
    public final int lruMaxFromBegin;

    @C09CT("lru_max_last_watch")
    public final int lruMaxLastWatch;

    public ShareAwemeFrameworkConfigModel() {
        this(false, 0, 0, 0, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareAwemeFrameworkConfigModel)) {
            return false;
        }
        ShareAwemeFrameworkConfigModel shareAwemeFrameworkConfigModel = (ShareAwemeFrameworkConfigModel) obj;
        return this.enabled == shareAwemeFrameworkConfigModel.enabled && this.lruMaxLastWatch == shareAwemeFrameworkConfigModel.lruMaxLastWatch && this.lruMaxFromBegin == shareAwemeFrameworkConfigModel.lruMaxFromBegin && this.lruMaxEpisode == shareAwemeFrameworkConfigModel.lruMaxEpisode && Intrinsics.LJFF(this.disabledScenes, shareAwemeFrameworkConfigModel.disabledScenes);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enabled) * 31) + this.lruMaxLastWatch) * 31) + this.lruMaxFromBegin) * 31) + this.lruMaxEpisode) * 31) + this.disabledScenes.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareAwemeFrameworkConfigModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", lruMaxLastWatch=");
        sbLIZ.append(this.lruMaxLastWatch);
        sbLIZ.append(", lruMaxFromBegin=");
        sbLIZ.append(this.lruMaxFromBegin);
        sbLIZ.append(", lruMaxEpisode=");
        sbLIZ.append(this.lruMaxEpisode);
        sbLIZ.append(", disabledScenes=");
        sbLIZ.append(this.disabledScenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShareAwemeFrameworkConfigModel(boolean z, int i, int i2, int i3, List<String> list) {
        this.enabled = z;
        this.lruMaxLastWatch = i;
        this.lruMaxFromBegin = i2;
        this.lruMaxEpisode = i3;
        this.disabledScenes = list;
    }

    public ShareAwemeFrameworkConfigModel(boolean z, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 500 : i, (i4 & 4) != 0 ? 80 : i2, (i4 & 8) != 0 ? 150 : i3, (i4 & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
