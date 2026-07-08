package com.bytedance.pipo.ttpay.ab;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTtpayOnboardingTemplateMapModel {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final List<String> idList;

    @C09CT("vn")
    public final List<String> vnList;

    public PipoTtpayOnboardingTemplateMapModel() {
        this(null, null, 3, null);
    }

    public PipoTtpayOnboardingTemplateMapModel(List<String> list, List<String> list2) {
        this.idList = list;
        this.vnList = list2;
    }

    public PipoTtpayOnboardingTemplateMapModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
