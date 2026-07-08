package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AdDisclaimer implements Serializable {

    @C09CT("auto_data_map")
    public final Map<String, Object> autoDataMap;

    @C09CT("auto_disclaimer_type")
    public final int autoDisclaimerType;

    @C09CT("pid_list")
    public final List<String> pidList;

    @C09CT("pure_text")
    public final String pureText;

    @C09CT("spliced_texts")
    public List<Object> textList;

    @C09CT("type")
    public final int type;

    public AdDisclaimer() {
        this(0, "", null, 0, null, null);
    }

    public final void setTextList(List<Object> list) {
        this.textList = list;
    }

    public AdDisclaimer(int i, String str, Map<String, Object> map, int i2, List<String> list, List<Object> list2) {
        this.type = i;
        this.pureText = str;
        this.autoDataMap = map;
        this.autoDisclaimerType = i2;
        this.pidList = list;
        this.textList = list2;
    }
}
