package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ViolationAppealInfo {

    @C09CT("appeal_time_stamp")
    public long appealTimeStamp;

    @C09CT("has_suppliment_materials")
    public boolean hasSupplimentMaterials;

    @C09CT("text_evidence_title")
    public String textEvidenceTitle = "";

    @C09CT("text_evidence_desc")
    public String textEvidenceDesc = "";

    @C09CT("supplement_materials")
    public List<String> supplementMaterials = new ArrayList();

    @C09CT("supplement_description")
    public String supplementDescription = "";

    @C09CT("appeal_feedback_reason")
    public String appealFeedbackReason = "";

    @C09CT("appeal_feedback_custom_reason")
    public String appealFeedbackCustomReason = "";

    @C09CT("appeal_body_reason")
    public String appealBodyReason = "";

    @C09CT("appeal_subtitle")
    public String appealSubtitle = "";
}
