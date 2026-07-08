package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class SMBFormDetail {

    @C09CT("create_time")
    public long createTime;

    @C09CT("disclaimer")
    public SMBFormDisclaimer disclaimer;

    @C09CT("form_id")
    public long formId;

    @C09CT("form_version")
    public int formVersion;

    @C09CT("has_submitted")
    public boolean hasSubmitted;

    @C09CT("intent_type")
    public int intentType;

    @C09CT("is_simple_form")
    public boolean isSimpleForm;

    @C09CT("publish_time")
    public long publishTime;

    @C09CT("source_type")
    public int sourceType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("use_smb_render")
    public boolean useSmbRender;

    @C09CT("title")
    public String title = "";

    @C09CT("headline")
    public String headline = "";

    @C09CT("purpose_statement")
    public String purposeStatement = "";

    @C09CT("fields")
    public List<SMBFormField> fields = new ArrayList();

    @C09CT("pp_company_name")
    public String ppCompanyName = "";

    @C09CT("pp_registered_address")
    public String ppRegisteredAddress = "";

    @C09CT("pp_business_email")
    public String ppBusinessEmail = "";

    @C09CT("pp_link_url")
    public String ppLinkUrl = "";

    @C09CT("pp_tiktok_url")
    public String ppTiktokUrl = "";

    @C09CT("pp_text")
    public String ppText = "";

    @C09CT("template_type")
    public String templateType = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
