package com.ss.android.ugc.aweme.net.model;

import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes14.dex */
public final class UnexpectedConfig {
    public final String id;
    public final String pattern;
    public Regex regex;
    public final int scope;
    public List<String> targets;
    public final int type;

    public final void setRegex(Regex regex) {
        this.regex = regex;
    }

    public final void setTargets(List<String> list) {
        this.targets = list;
    }

    public UnexpectedConfig(String str, int i, int i2, String str2, Regex regex, List<String> list) {
        this.pattern = str;
        this.scope = i;
        this.type = i2;
        this.id = str2;
        this.regex = regex;
        this.targets = list;
    }
}
