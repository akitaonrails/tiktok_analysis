package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBBasicInfoEditRequest {

    @C09CT("name")
    public String name = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("email")
    public String email = "";

    @C09CT("phone_num")
    public String phoneNum = "";

    @C09CT("phone_country_code")
    public String phoneCountryCode = "";

    @C09CT("edited_components")
    public List<Integer> editedComponents = new ArrayList();
}
