package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAnchorAutoPreLoadResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("list")
        public List<AnchorAutoPreLoadDetail> list = new ArrayList();
    }
}
