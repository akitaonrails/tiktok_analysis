package com.bytedance.router.fragment;

/* JADX INFO: loaded from: classes33.dex */
public class FragmentOp {
    public boolean immediate;
    public String tag;
    public String url;

    public FragmentOp() {
        this(null, null, false);
    }

    public final boolean getImmediate() {
        return this.immediate;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public FragmentOp(String str) {
        this(str, null, false);
    }

    public final void setImmediate(boolean z) {
        this.immediate = z;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public FragmentOp(String str, String str2) {
        this(str, str2, false);
    }

    public FragmentOp(String str, String str2, boolean z) {
        this.url = str;
        this.tag = str2;
        this.immediate = z;
    }
}
