package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class HeifUrlReplaceConfig {

    @C09CT("img_fmt_transform_status")
    public Boolean isEnable = Boolean.FALSE;

    @C09CT("img_fmt_transform_prefer")
    public String extension = "";

    @C09CT("img_fmt_templates")
    public List<String> imageTemplates = new ArrayList();

    @C09CT("replaced_extensions")
    public List<String> replacedExtensions = new ArrayList();

    public final boolean isValid() {
        List<String> list;
        List<String> list2;
        return (TextUtils.isEmpty(this.extension) || (list = this.imageTemplates) == null || !(list.isEmpty() ^ true) || (list2 = this.replacedExtensions) == null || !(list2.isEmpty() ^ true)) ? false : true;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final List<String> getImageTemplates() {
        return this.imageTemplates;
    }

    public final List<String> getReplacedExtensions() {
        return this.replacedExtensions;
    }

    public final Boolean isEnable() {
        return this.isEnable;
    }

    public final void setEnable(Boolean bool) {
        this.isEnable = bool;
    }

    public final void setExtension(String str) {
        this.extension = str;
    }

    public final void setImageTemplates(List<String> list) {
        this.imageTemplates = list;
    }

    public final void setReplacedExtensions(List<String> list) {
        this.replacedExtensions = list;
    }
}
