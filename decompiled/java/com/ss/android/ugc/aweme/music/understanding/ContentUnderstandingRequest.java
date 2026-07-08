package com.ss.android.ugc.aweme.music.understanding;

import X.C01GW;
import X.C13BV;
import X.C2257908sz;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentUnderstandingRequest {
    public final String contentSource;
    public final String contentType;
    public final String creationId;
    public final Map<String, String> extraParams;
    public final long firstSourceLength;
    public final Integer frameLongSidePx;
    public final C2257908sz mobData;
    public final List<PipelineNodeConfig> nodeConfigs;
    public final List<String> sources;
    public final String understandingKey;
    public Function0<String> zipFilePathProvider;

    public ContentUnderstandingRequest() {
        this(null, null, null, null, null, null, null, null, null, null, 0L, 2047, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentUnderstandingRequest)) {
            return false;
        }
        ContentUnderstandingRequest contentUnderstandingRequest = (ContentUnderstandingRequest) obj;
        return Intrinsics.LJFF(this.sources, contentUnderstandingRequest.sources) && Intrinsics.LJFF(this.frameLongSidePx, contentUnderstandingRequest.frameLongSidePx) && Intrinsics.LJFF(this.zipFilePathProvider, contentUnderstandingRequest.zipFilePathProvider) && Intrinsics.LJFF(this.creationId, contentUnderstandingRequest.creationId) && Intrinsics.LJFF(this.understandingKey, contentUnderstandingRequest.understandingKey) && Intrinsics.LJFF(this.contentType, contentUnderstandingRequest.contentType) && Intrinsics.LJFF(this.contentSource, contentUnderstandingRequest.contentSource) && Intrinsics.LJFF(this.mobData, contentUnderstandingRequest.mobData) && Intrinsics.LJFF(this.extraParams, contentUnderstandingRequest.extraParams) && Intrinsics.LJFF(this.nodeConfigs, contentUnderstandingRequest.nodeConfigs) && this.firstSourceLength == contentUnderstandingRequest.firstSourceLength;
    }

    public int hashCode() {
        int iHashCode = this.sources.hashCode() * 31;
        Integer num = this.frameLongSidePx;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Function0<String> function0 = this.zipFilePathProvider;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        String str = this.creationId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.understandingKey;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contentSource;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C2257908sz c2257908sz = this.mobData;
        return ((((((iHashCode7 + (c2257908sz != null ? c2257908sz.hashCode() : 0)) * 31) + this.extraParams.hashCode()) * 31) + this.nodeConfigs.hashCode()) * 31) + C786410Ut5.Y2(this.firstSourceLength);
    }

    public String toString() {
        return "ContentUnderstandingRequest(sources=" + this.sources + ", frameLongSidePx=" + this.frameLongSidePx + ", zipFilePathProvider=" + this.zipFilePathProvider + ", creationId=" + this.creationId + ", understandingKey=" + this.understandingKey + ", contentType=" + this.contentType + ", contentSource=" + this.contentSource + ", mobData=" + this.mobData + ", extraParams=" + this.extraParams + ", nodeConfigs=" + this.nodeConfigs + ", firstSourceLength=" + this.firstSourceLength + ')';
    }

    public final void setZipFilePathProvider(Function0<String> function0) {
        this.zipFilePathProvider = function0;
    }

    public ContentUnderstandingRequest(List<String> list, Integer num, Function0<String> function0, String str, String str2, String str3, String str4, C2257908sz c2257908sz, Map<String, String> map, List<PipelineNodeConfig> list2, long j) {
        AwS547S0100000_3 awS547S0100000_3;
        this.sources = list;
        this.frameLongSidePx = num;
        this.zipFilePathProvider = function0;
        this.creationId = str;
        this.understandingKey = str2;
        this.contentType = str3;
        this.contentSource = str4;
        this.mobData = c2257908sz;
        this.extraParams = map;
        this.nodeConfigs = list2;
        this.firstSourceLength = j;
        if (function0 != null) {
            awS547S0100000_3 = new AwS547S0100000_3(C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS547S0100000_3(function0, (Function0<Unit>) 36)), (C01GW<String>) 37);
        } else {
            awS547S0100000_3 = null;
        }
        this.zipFilePathProvider = awS547S0100000_3;
    }

    public ContentUnderstandingRequest(List list, Integer num, Function0 function0, String str, String str2, String str3, String str4, C2257908sz c2257908sz, Map map, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? c2257908sz : null, (i & 256) != 0 ? new LinkedHashMap() : map, (i & 512) != 0 ? C13BV.INSTANCE : list2, (i & 1024) != 0 ? 0L : j);
    }
}
