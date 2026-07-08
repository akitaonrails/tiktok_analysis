package com.ss.android.ugc.aweme.feed.model.banner;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class FcpUiTemplate implements Serializable {

    @C09CT("actions")
    public List<FcpTemplateActionGroup> actions;
    public transient C01GW actionsMap$delegate;

    @C09CT("fields")
    public String fields;
    public transient C01GW fieldsMap$delegate;

    @C09CT("type")
    public Long type;

    @C09CT("version")
    public String version;

    public FcpUiTemplate() {
        this(null, null, null, null);
    }

    public final Map<String, FcpTemplateActionGroup> getActionsMap() {
        return (Map) this.actionsMap$delegate.getValue();
    }

    public final Map<String, Object> getFieldsMap() {
        return (Map) this.fieldsMap$delegate.getValue();
    }

    public final void prepare() {
        getFieldsMap();
        List<FcpTemplateActionGroup> list = this.actions;
        if (list != null) {
            Iterator<FcpTemplateActionGroup> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().prepare();
            }
        }
        getActionsMap();
    }

    public FcpUiTemplate(Long l, String str, List<FcpTemplateActionGroup> list, String str2) {
        this.type = l;
        this.fields = str;
        this.actions = list;
        this.version = str2;
        this.fieldsMap$delegate = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1496));
        this.actionsMap$delegate = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1495));
    }
}
