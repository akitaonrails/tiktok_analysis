package tikcast.anchor.platform_promotion;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionCreativeListRequest {

    @C09CT("id_list")
    public List<String> idList = new ArrayList();

    @C09CT("name")
    public String name = "";

    @C09CT("page")
    public int page;

    @C09CT("size")
    public int size;

    @C09CT("type")
    public Type type;

    public static final class Type {

        @C09CT("val")
        public int val;
    }
}
