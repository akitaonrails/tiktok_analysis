package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class TranslationImage {

    @C09CT("host")
    public final String host;

    @C09CT("imgs")
    public final List<String> imgs;

    @C09CT("spec")
    public final String spec;

    @C09CT("trg_lang")
    public final String trgLang;

    public TranslationImage(List<String> list, String str, String str2, String str3) {
        this.imgs = list;
        this.trgLang = str;
        this.host = str2;
        this.spec = str3;
    }
}
