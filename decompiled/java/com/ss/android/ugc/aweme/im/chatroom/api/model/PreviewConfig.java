package com.ss.android.ugc.aweme.im.chatroom.api.model;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewConfig implements Serializable {

    @C09CT("join_button_state")
    public final PreviewJoinButtonState joinButtonState;

    @C09CT("join_group_source")
    public final String joinGroupSource;

    @C09CT("preview_mob_params")
    public final Map<String, String> previewMobParams;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewConfig)) {
            return false;
        }
        PreviewConfig previewConfig = (PreviewConfig) obj;
        return Intrinsics.LJFF(this.joinButtonState, previewConfig.joinButtonState) && Intrinsics.LJFF(this.joinGroupSource, previewConfig.joinGroupSource) && Intrinsics.LJFF(this.previewMobParams, previewConfig.previewMobParams);
    }

    public int hashCode() {
        return (((this.joinButtonState.hashCode() * 31) + this.joinGroupSource.hashCode()) * 31) + this.previewMobParams.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewConfig(joinButtonState=");
        sbLIZ.append(this.joinButtonState);
        sbLIZ.append(", joinGroupSource=");
        sbLIZ.append(this.joinGroupSource);
        sbLIZ.append(", previewMobParams=");
        sbLIZ.append(this.previewMobParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewConfig() {
        this(new PreviewJoinButtonState("", true), "", C2097608Jq.LJ());
    }

    public PreviewConfig(PreviewJoinButtonState previewJoinButtonState, String str, Map<String, String> map) {
        this.joinButtonState = previewJoinButtonState;
        this.joinGroupSource = str;
        this.previewMobParams = map;
    }
}
