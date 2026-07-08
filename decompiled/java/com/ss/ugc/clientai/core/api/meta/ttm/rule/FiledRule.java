package com.ss.ugc.clientai.core.api.meta.ttm.rule;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class FiledRule {

    @C09CT("alias")
    public final String alias;

    @C09CT("classificationMethod")
    public final String classificationMethod;

    @C09CT("filedName")
    public final String filedName;

    @C09CT("filedType")
    public final String filedType;

    public final int hashCode() {
        int iHashCode = ((((this.filedName.hashCode() * 31) + this.filedType.hashCode()) * 31) + this.classificationMethod.hashCode()) * 31;
        String str = this.alias;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public FiledRule(String str, String str2, String str3, String str4) {
        this.filedName = str;
        this.filedType = str2;
        this.classificationMethod = str3;
        this.alias = str4;
    }
}
