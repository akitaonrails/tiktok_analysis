package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: loaded from: classes.dex */
public final class Home {

    @C09CT("can_show_cs_entrance")
    public boolean canShowCsEntrance;

    @C09CT("entry_module_list")
    public List<EntryModule> entryModuleList = new ArrayList();

    @C09CT("header")
    public HomeHeader header;

    @C09CT("is_cs_target_user")
    public boolean isCsTargetUser;

    @C09CT("is_kyc_verified")
    public boolean isKycVerified;

    @C09CT("user")
    public User user;

    @C09CT("user_grade")
    public UserGrade userGrade;
}
