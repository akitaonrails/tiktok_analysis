package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SMBPageSection {

    @C09CT("section_header")
    public String sectionHeader = "";

    @C09CT("pages")
    public List<Page> pages = new ArrayList();

    /* JADX INFO: loaded from: classes27.dex */
    public static final class Page {

        @C09CT("icon_dark_link")
        public ImageModel iconDarkLink;

        @C09CT("icon_link")
        public ImageModel iconLink;

        @C09CT("task_number")
        public long taskNumber;

        @C09CT("header")
        public String header = "";

        @C09CT("description")
        public String description = "";

        @C09CT("schema_link")
        public String schemaLink = "";

        @C09CT("module_name")
        public String moduleName = "";

        @C09CT("feature_name")
        public String featureName = "";
    }
}
