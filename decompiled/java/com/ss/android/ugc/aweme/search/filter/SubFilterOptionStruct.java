package com.ss.android.ugc.aweme.search.filter;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SubFilterOptionStruct implements Serializable {
    public boolean LL;
    public boolean LLILLJJLI;
    public FilterOptionStruct LLILLL;

    @C09CT("code")
    public int code;

    @C09CT("log_info")
    public Map<String, String> logInfo;

    @C09CT("name")
    public String name;

    @C09CT("request_info")
    public Map<String, String> requestInfo;

    public final int getCode() {
        return this.code;
    }

    public final FilterOptionStruct getFilterOptionStruct() {
        return this.LLILLL;
    }

    public final Map<String, String> getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getRequestInfo() {
        return this.requestInfo;
    }

    public final boolean isDefaultOption() {
        return this.LL;
    }

    public final boolean isSelected() {
        return this.LLILLJJLI;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDefaultOption(boolean z) {
        this.LL = z;
    }

    public final void setFilterOptionStruct(FilterOptionStruct filterOptionStruct) {
        this.LLILLL = filterOptionStruct;
    }

    public final void setLogInfo(Map<String, String> map) {
        this.logInfo = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestInfo(Map<String, String> map) {
        this.requestInfo = map;
    }

    public final void setSelected(boolean z) {
        this.LLILLJJLI = z;
    }

    public SubFilterOptionStruct(int i, String str) {
        this.code = i;
        this.name = str;
    }
}
