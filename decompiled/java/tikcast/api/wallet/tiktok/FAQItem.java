package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FAQItem {

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("description_schemas")
    public List<String> descriptionSchemas = new ArrayList();

    @C09CT("items")
    public List<FAQItem> items = new ArrayList();
}
