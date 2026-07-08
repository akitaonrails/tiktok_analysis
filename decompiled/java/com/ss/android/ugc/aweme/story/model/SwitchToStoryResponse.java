package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchToStoryResponse extends BaseResponse implements Serializable {

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("visibility_action")
    public Integer visibilityAction;

    public SwitchToStoryResponse() {
        this(null, null);
    }

    public final SwitchToStoryResponse copy(Aweme aweme, Integer num) {
        return new SwitchToStoryResponse(aweme, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchToStoryResponse)) {
            return false;
        }
        SwitchToStoryResponse switchToStoryResponse = (SwitchToStoryResponse) obj;
        return Intrinsics.LJFF(this.aweme, switchToStoryResponse.aweme) && Intrinsics.LJFF(this.visibilityAction, switchToStoryResponse.visibilityAction);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        Integer num = this.visibilityAction;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchToStoryResponse(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", visibilityAction=");
        sbLIZ.append(this.visibilityAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Integer getVisibilityAction() {
        return this.visibilityAction;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setVisibilityAction(Integer num) {
        this.visibilityAction = num;
    }

    public SwitchToStoryResponse(Aweme aweme, Integer num) {
        this.aweme = aweme;
        this.visibilityAction = num;
    }
}
