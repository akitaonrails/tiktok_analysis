package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AboutMe {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public long auditStatus;

    @C09CT("image")
    public ImageModel image;

    @C09CT("switch_status")
    public boolean switchStatus;

    @C09CT("template_list")
    public List<AboutMeTemplate> templateList;

    @C09CT("user")
    public User user;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("current_template_id")
    public String currentTemplateId = "";

    public static final class AuditInfo {

        @C09CT("task_type")
        public long taskType;

        @C09CT("violation_id")
        public long violationId;
    }
}
