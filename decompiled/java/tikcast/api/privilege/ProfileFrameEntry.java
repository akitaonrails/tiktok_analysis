package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileFrameEntry {

    @C09CT("fallback_data")
    public FallbackData fallbackData;

    @C09CT("profile_frame_list")
    public List<UserPrivilege> profileFrameList = new ArrayList();

    @C09CT("red_dot_map")
    public Map<String, PrivilegeFERedDot> redDotMap = new LinkedHashMap();

    public static final class FallbackData {

        @C09CT("fallback_icon")
        public ImageModel fallbackIcon;

        @C09CT("fallback_name")
        public String fallbackName = "";
    }
}
