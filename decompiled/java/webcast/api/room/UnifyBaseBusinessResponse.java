package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class UnifyBaseBusinessResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("business_data_list")
        public List<IBusinessData> businessDataList = new ArrayList();

        @C09CT("config")
        public IUnifyBaseConfig config;

        @C09CT("unify_base_id")
        public int unifyBaseId;
    }
}
