package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.fans_platform.Ticket;

/* JADX INFO: loaded from: classes29.dex */
public final class GetModelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("online_models")
        public List<ModelEnvs> onlineModels = new ArrayList();

        @C09CT("sandbox_models")
        public List<ModelEnvs> sandboxModels = new ArrayList();

        @C09CT("tickets")
        public List<Ticket> tickets = new ArrayList();
    }
}
