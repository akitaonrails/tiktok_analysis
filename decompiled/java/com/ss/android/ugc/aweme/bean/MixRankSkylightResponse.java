package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightResponse extends BaseResponse implements Serializable {

    @C09CT("skylight_scene_response")
    public final List<MixRankSkylightSceneResponse> sceneResponses;

    @C09CT("skylight_items")
    public final List<MixRankSkylightItem> skylightItems;

    public MixRankSkylightResponse() {
        this(null, null, 3, null);
    }

    public final MixRankSkylightResponse copy(List<MixRankSkylightItem> list, List<MixRankSkylightSceneResponse> list2) {
        return new MixRankSkylightResponse(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixRankSkylightResponse)) {
            return false;
        }
        MixRankSkylightResponse mixRankSkylightResponse = (MixRankSkylightResponse) obj;
        return Intrinsics.LJFF(this.skylightItems, mixRankSkylightResponse.skylightItems) && Intrinsics.LJFF(this.sceneResponses, mixRankSkylightResponse.sceneResponses);
    }

    public int hashCode() {
        return (this.skylightItems.hashCode() * 31) + this.sceneResponses.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixRankSkylightResponse(skylightItems=");
        sbLIZ.append(this.skylightItems);
        sbLIZ.append(", sceneResponses=");
        sbLIZ.append(this.sceneResponses);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<MixRankSkylightSceneResponse> getSceneResponses() {
        return this.sceneResponses;
    }

    public final List<MixRankSkylightItem> getSkylightItems() {
        return this.skylightItems;
    }

    public MixRankSkylightResponse(List<MixRankSkylightItem> list, List<MixRankSkylightSceneResponse> list2) {
        this.skylightItems = list;
        this.sceneResponses = list2;
    }

    public MixRankSkylightResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
