package tikcast.api.fans;

import X.C09CT;
import webcast.fans_platform.ModelInstance;
import webcast.fans_platform.ModelSchema;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateModelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("model")
        public ModelInstance model;

        @C09CT("schema")
        public ModelSchema schema;
    }
}
