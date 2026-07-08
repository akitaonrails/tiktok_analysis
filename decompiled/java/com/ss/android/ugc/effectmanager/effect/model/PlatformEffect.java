package com.ss.android.ugc.effectmanager.effect.model;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PlatformEffect {
    public String file_uri;
    public String hint;
    public String hint_uri;
    public String icon_uri;
    public String name;
    public List<String> requirements;
    public List<String> types;

    public Effect toEffect(List<String> list) {
        Effect effect = new Effect();
        effect.setName(this.name);
        effect.setHint(this.hint);
        effect.setFileUrl(concatPrefixWithUri(list, this.file_uri));
        effect.setTypes(this.types);
        effect.setHintIcon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIconUrl(concatPrefixWithUri(list, this.icon_uri));
        effect.setRequirements(this.requirements);
        effect.setId(this.file_uri);
        return effect;
    }

    public UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = (String) ListProtector.get(list, i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
