package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SectionValue {

    @C09CT("text")
    public final String text;

    public int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public SectionValue(String str) {
        this.text = str;
    }
}
