package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultEffectListItemStruct {

    @C09CT("type")
    public String type = "";

    @C09CT("effects")
    public List<EffectStruct> effects = new ArrayList();

    @C09CT("collection")
    public List<EffectStruct> collection = new ArrayList();

    @C09CT("url_prefix")
    public List<String> urlPrefix = new ArrayList();

    @C09CT("bind_effects")
    public List<EffectStruct> bindEffects = new ArrayList();
}
