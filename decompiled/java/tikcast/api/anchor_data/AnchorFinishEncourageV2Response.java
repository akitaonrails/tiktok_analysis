package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorFinishEncourageV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("containers")
        public List<FinishEncourageContainer> containers = new ArrayList();
    }
}
