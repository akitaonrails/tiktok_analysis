package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.CelebrationPrivilege;
import webcast.data.FansConfig;

/* JADX INFO: loaded from: classes18.dex */
public final class FansConfigResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("celebration_privilege")
        public CelebrationPrivilege celebrationPrivilege;

        @C09CT("extra")
        public Extra extra;

        @C09CT("fans_config")
        public List<FansConfig> fansConfig = new ArrayList();

        public static final class Extra {

            @C09CT("is_reverse_ab")
            public boolean isReverseAb;
        }
    }
}
