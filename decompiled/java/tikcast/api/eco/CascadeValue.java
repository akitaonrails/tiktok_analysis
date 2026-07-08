package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CascadeValue {

    @C09CT("has_sub")
    public boolean hasSub;

    @C09CT("value")
    public String value = "";

    @C09CT("sub_value")
    public List<CascadeValue> subValue = new ArrayList();
}
