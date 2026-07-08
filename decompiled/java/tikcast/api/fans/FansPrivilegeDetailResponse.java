package tikcast.api.fans;

import X.C09CT;
import webcast.data.CelebrationPrivilege;
import webcast.data.FansPrivilege;

/* JADX INFO: loaded from: classes18.dex */
public final class FansPrivilegeDetailResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("celebration_privilege")
        public CelebrationPrivilege celebrationPrivilege;

        @C09CT("fans_privilege")
        public FansPrivilege fansPrivilege;
    }
}
