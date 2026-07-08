package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.SMBFormCustomQuestion;

/* JADX INFO: loaded from: classes27.dex */
public final class SMBFormCreateRequest {

    @C09CT("pp_type")
    public int ppType;

    @C09CT("title")
    public String title = "";

    @C09CT("headline")
    public String headline = "";

    @C09CT("purpose_statement")
    public String purposeStatement = "";

    @C09CT("questions")
    public List<Integer> questions = new ArrayList();

    @C09CT("custom_questions")
    public List<SMBFormCustomQuestion> customQuestions = new ArrayList();

    @C09CT("pp_company_name")
    public String ppCompanyName = "";

    @C09CT("pp_registered_address")
    public String ppRegisteredAddress = "";

    @C09CT("pp_business_email")
    public String ppBusinessEmail = "";

    @C09CT("pp_link_url")
    public String ppLinkUrl = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
