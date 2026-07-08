package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EducationContentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("sections")
        public List<EducationContentSection> sections = new ArrayList();
    }
}
