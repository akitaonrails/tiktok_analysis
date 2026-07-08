package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C0BV4;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightActionData implements Serializable {

    @C09CT("extra_data")
    public final String extraData;

    @C09CT("scheme_url")
    public final String schemaUrl;

    @C09CT("action_type")
    public final Integer type;

    @C09CT("gesture_type")
    public final Integer user;

    public SkylightActionData() {
        this(0, 0, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightActionData(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.extraData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (!C0BV4.LIZ()) {
            return super.equals(obj);
        }
        if (!(obj instanceof SkylightActionData)) {
            return false;
        }
        SkylightActionData skylightActionData = (SkylightActionData) obj;
        if (!Intrinsics.LJFF(this.user, skylightActionData.user) || !Intrinsics.LJFF(this.type, skylightActionData.type) || !Intrinsics.LJFF(this.schemaUrl, skylightActionData.schemaUrl)) {
            return false;
        }
        return true;
    }

    public SkylightActionData(Integer num, Integer num2, String str, String str2) {
        this.user = num;
        this.type = num2;
        this.schemaUrl = str;
        this.extraData = str2;
    }
}
