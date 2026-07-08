package tikcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ValidateModelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("valid")
        public boolean valid;

        @C09CT("error")
        public String error = "";

        @C09CT("prev_json")
        public String prevJson = "";

        @C09CT("after_json")
        public String afterJson = "";
    }
}
