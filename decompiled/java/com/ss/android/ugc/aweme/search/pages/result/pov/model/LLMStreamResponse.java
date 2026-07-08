package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LLMStreamResponse implements Serializable {

    @C09CT("data")
    public final List<LLMStreamStruct> data;

    @C09CT("extra")
    public final LLMStreamExtraStruct extra;

    @C09CT("log_pb")
    public final LogPbStruct logPb;

    @C09CT("next_key")
    public final String nextKey;

    @C09CT("nil_struct")
    public final NilStruct nilStruct;

    @C09CT("status_code")
    public final Integer statusCode;

    public LLMStreamResponse() {
        this(null, null, null, null, null, null);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<LLMStreamStruct> list = this.data;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.nextKey;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NilStruct nilStruct = this.nilStruct;
        int iHashCode4 = (iHashCode3 + (nilStruct == null ? 0 : nilStruct.hashCode())) * 31;
        LogPbStruct logPbStruct = this.logPb;
        int iHashCode5 = (iHashCode4 + (logPbStruct == null ? 0 : logPbStruct.hashCode())) * 31;
        LLMStreamExtraStruct lLMStreamExtraStruct = this.extra;
        return iHashCode5 + (lLMStreamExtraStruct != null ? lLMStreamExtraStruct.hashCode() : 0);
    }

    public LLMStreamResponse(Integer num, List<LLMStreamStruct> list, String str, NilStruct nilStruct, LogPbStruct logPbStruct, LLMStreamExtraStruct lLMStreamExtraStruct) {
        this.statusCode = num;
        this.data = list;
        this.nextKey = str;
        this.nilStruct = nilStruct;
        this.logPb = logPbStruct;
        this.extra = lLMStreamExtraStruct;
    }
}
