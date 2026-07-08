package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.fans_platform.Ticket;

/* JADX INFO: loaded from: classes29.dex */
public final class ModelEnvs {

    @C09CT("env")
    public String env = "";

    @C09CT("models")
    public List<ModelObject> models = new ArrayList();

    @C09CT("tickets")
    public List<Ticket> tickets = new ArrayList();
}
