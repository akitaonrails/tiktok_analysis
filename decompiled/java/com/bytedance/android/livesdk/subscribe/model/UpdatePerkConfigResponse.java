package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdatePerkConfigResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("customized_benefits_details")
        public List<String> customizedBenefitsDetails = new ArrayList();
    }
}
