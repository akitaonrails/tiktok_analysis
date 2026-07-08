package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetArtisticTextTemplatesResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("artistic_template_list")
        public List<SMBArtisticTextTemplate> artisticTemplateList = new ArrayList();
    }
}
