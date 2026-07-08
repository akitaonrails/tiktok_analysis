package defpackage;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class CloudKeyConfigurationModel {

    @C09CT("cloud_id_apis")
    public final List<String> cloudIdApis;

    @C09CT("disabled")
    public final boolean disabled;

    @C09CT("login_state_apis")
    public final List<String> loginStateApis;

    @C09CT("logout_state_apis")
    public final List<String> logoutStateApis;

    public CloudKeyConfigurationModel() {
        this(null, false, null, null, 15, null);
    }

    public CloudKeyConfigurationModel(List<String> list, boolean z, List<String> list2, List<String> list3) {
        this.cloudIdApis = list;
        this.disabled = z;
        this.loginStateApis = list2;
        this.logoutStateApis = list3;
    }

    public CloudKeyConfigurationModel(List list, boolean z, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}
