package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CertificationRequirement {

    @C09CT("content_density_requirement")
    public ContentDensityRequirement contentDensityRequirement;

    @C09CT("revenue_requirement")
    public RevenueRequirement revenueRequirement;

    @C09CT("tips")
    public Text tips;

    @C09CT("types")
    public List<Integer> types = new ArrayList();

    @C09CT("requirement_detail_schema")
    public String requirementDetailSchema = "";
}
