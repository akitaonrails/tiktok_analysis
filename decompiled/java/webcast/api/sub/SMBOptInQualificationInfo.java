package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBOptInQualificationInfo {

    @C09CT("pass")
    public boolean pass;

    @C09CT("type")
    public int type;

    @C09CT("reason")
    public String reason = "";

    @C09CT("sub_qualification_info")
    public List<SMBOptInQualificationInfo> subQualificationInfo = new ArrayList();

    @C09CT("schema_url")
    public String schemaUrl = "";
}
