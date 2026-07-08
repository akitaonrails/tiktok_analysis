package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C0BV4;
import X.C1599220ria;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightData implements Serializable {
    public static final C1599220ria Companion = new Object() { // from class: X.0ria
    };

    @C09CT("biz_type")
    public final int bizType;

    @C09CT("biz_data")
    public final CustomBizData customBizData;

    @C09CT("impr_id")
    public String imprId;

    @C09CT("priority")
    public final int priority;
    public final int subPriority;

    @C09CT("template")
    public final TemplateData templateData;

    @C09CT("user_id")
    public final Long uid;

    public SkylightData() {
        this(-1, -1, -1, null, null, null, null);
    }

    public final SkylightData copy(int i, int i2, int i3, TemplateData templateData, CustomBizData customBizData, Long l, String str) {
        return new SkylightData(i, i2, i3, templateData, customBizData, l, str);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightData(bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", subPriority=");
        sbLIZ.append(this.subPriority);
        sbLIZ.append(", templateData=");
        sbLIZ.append(this.templateData);
        sbLIZ.append(", customBizData=");
        sbLIZ.append(this.customBizData);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", imprId=");
        sbLIZ.append(this.imprId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (!C0BV4.LIZ()) {
            return super.equals(obj);
        }
        if (!(obj instanceof SkylightData)) {
            return false;
        }
        SkylightData skylightData = (SkylightData) obj;
        if (!Intrinsics.LJFF(this.uid, skylightData.uid) || this.bizType != skylightData.bizType || !Intrinsics.LJFF(this.templateData, skylightData.templateData) || !Intrinsics.LJFF(this.customBizData, skylightData.customBizData)) {
            return false;
        }
        return true;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }

    public SkylightData(int i, int i2, int i3, TemplateData templateData, CustomBizData customBizData, Long l, String str) {
        this.bizType = i;
        this.priority = i2;
        this.subPriority = i3;
        this.templateData = templateData;
        this.customBizData = customBizData;
        this.uid = l;
        this.imprId = str;
    }
}
