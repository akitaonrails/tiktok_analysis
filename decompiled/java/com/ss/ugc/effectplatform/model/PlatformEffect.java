package com.ss.ugc.effectplatform.model;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class PlatformEffect implements Serializable {
    public String file_uri;
    public String hint;
    public String hint_uri;
    public String icon_uri;
    public String name;
    public List<String> requirements;
    public List<String> types;

    public PlatformEffect() {
        this(null, null, "", "", null, "", null);
    }

    public final void setFile_uri(String str) {
        this.file_uri = str;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setHint_uri(String str) {
        this.hint_uri = str;
    }

    public final void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Effect toEffect(List<String> list) {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Effect effect = new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        effect.setName(str);
        String str3 = this.hint;
        if (str3 == null) {
            str3 = "";
        }
        effect.setHint(str3);
        effect.setFile_url(concatPrefixWithUri(list, this.file_uri));
        List<String> arrayList = this.types;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        effect.setTypes(arrayList);
        effect.setHint_icon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIcon_url(concatPrefixWithUri(list, this.icon_uri));
        List<String> arrayList2 = this.requirements;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        effect.setRequirements(arrayList2);
        String str4 = this.file_uri;
        if (str4 != null) {
            str2 = str4;
        }
        effect.setId(str2);
        return effect;
    }

    private final UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel(new ArrayList(), null, null, null, null);
        urlModel.setUri(str);
        if (list == null) {
            return urlModel;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(list, i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public PlatformEffect(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        this.name = str;
        this.hint = str2;
        this.file_uri = str3;
        this.icon_uri = str4;
        this.types = list;
        this.hint_uri = str5;
        this.requirements = list2;
    }
}
