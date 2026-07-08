package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FansUpdateCustomBenefitRequest {

    @C09CT("benefit_type")
    public int benefitType;

    @C09CT("domain_scope")
    public int domainScope;

    @C09CT("icon_img")
    public ImageModel iconImg;

    @C09CT("icon_img_dark")
    public ImageModel iconImgDark;

    @C09CT("is_edited")
    public boolean isEdited;

    @C09CT("min_fan_level")
    public int minFanLevel;

    @C09CT("operate_type")
    public int operateType;

    @C09CT("benefit_id")
    public String benefitId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("url")
    public String url = "";

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("prompts")
    public List<String> prompts = new ArrayList();

    @C09CT("template_id")
    public String templateId = "";
}
