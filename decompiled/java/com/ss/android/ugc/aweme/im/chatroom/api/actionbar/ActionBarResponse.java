package com.ss.android.ugc.aweme.im.chatroom.api.actionbar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ActionBarResponse extends BaseResponse {

    @C09CT("action_bar")
    public final ActionBarConf actionBarConf;

    public ActionBarResponse() {
        this(null);
    }

    public final ActionBarResponse copy(ActionBarConf actionBarConf) {
        return new ActionBarResponse(actionBarConf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionBarResponse) && Intrinsics.LJFF(this.actionBarConf, ((ActionBarResponse) obj).actionBarConf);
    }

    public int hashCode() {
        ActionBarConf actionBarConf = this.actionBarConf;
        if (actionBarConf == null) {
            return 0;
        }
        return actionBarConf.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.simkit.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionBarResponse(actionBarConf=");
        sbLIZ.append(this.actionBarConf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ActionBarConf getActionBarConf() {
        return this.actionBarConf;
    }

    public ActionBarResponse(ActionBarConf actionBarConf) {
        this.actionBarConf = actionBarConf;
    }
}
