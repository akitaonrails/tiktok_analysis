package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AboutMeTemplate {

    @C09CT("icon_image")
    public ImageModel iconImage;

    @C09CT("icon_image_dark")
    public ImageModel iconImageDark;

    @C09CT("input_box_list")
    public List<AboutMeInputBox> inputBoxList;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("name")
    public String name = "";
}
