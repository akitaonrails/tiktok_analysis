package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.fans_platform.ModelInstance;
import webcast.fans_platform.Namespace;

/* JADX INFO: loaded from: classes29.dex */
public final class ListModelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("total_size")
        public long totalSize;

        @C09CT("models")
        public List<ModelInstance> models = new ArrayList();

        @C09CT("next_page_token")
        public String nextPageToken = "";

        @C09CT("namespaces")
        public List<Namespace> namespaces = new ArrayList();
    }
}
