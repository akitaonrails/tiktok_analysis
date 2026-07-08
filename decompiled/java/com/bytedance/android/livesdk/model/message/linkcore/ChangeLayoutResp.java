package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeLayoutResp extends LinkMicUplinkBaseResp {

    @C09CT("content_pos")
    public List<ContentPosition> contentPos;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    @C09CT("user_pos")
    public List<UserPosition> userPosition;

    public ChangeLayoutResp() {
        this(null, new ArrayList(), new ArrayList(), new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeLayoutResp)) {
            return false;
        }
        ChangeLayoutResp changeLayoutResp = (ChangeLayoutResp) obj;
        return Intrinsics.LJFF(this.userPosition, changeLayoutResp.userPosition) && Intrinsics.LJFF(this.linkedUserUiPositions, changeLayoutResp.linkedUserUiPositions) && Intrinsics.LJFF(this.contentPos, changeLayoutResp.contentPos) && Intrinsics.LJFF(this.uiPos, changeLayoutResp.uiPos);
    }

    public final int hashCode() {
        List<UserPosition> list = this.userPosition;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.linkedUserUiPositions.hashCode()) * 31) + this.contentPos.hashCode()) * 31) + this.uiPos.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeLayoutResp(userPosition=");
        sbLIZ.append(this.userPosition);
        sbLIZ.append(", linkedUserUiPositions=");
        sbLIZ.append(this.linkedUserUiPositions);
        sbLIZ.append(", contentPos=");
        sbLIZ.append(this.contentPos);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.uiPos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChangeLayoutResp(List<UserPosition> list, List<String> list2, List<ContentPosition> list3, List<PosIdentity> list4) {
        super(null);
        this.userPosition = list;
        this.linkedUserUiPositions = list2;
        this.contentPos = list3;
        this.uiPos = list4;
    }
}
