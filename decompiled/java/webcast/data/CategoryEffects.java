package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CategoryEffects {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("sorting_position")
    public int sortingPosition;

    @C09CT("category_key")
    public String categoryKey = "";

    @C09CT("version")
    public String version = "";

    @C09CT("effects")
    public List<EffectStruct> effects = new ArrayList();

    @C09CT("collection")
    public List<EffectStruct> collection = new ArrayList();

    @C09CT("bind_effects")
    public List<EffectStruct> bindEffects = new ArrayList();
}
