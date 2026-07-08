package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ImageConvertResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("images")
        public List<Images> images = new ArrayList();
    }

    public static final class Images {

        @C09CT("url")
        public List<String> url = new ArrayList();
    }
}
