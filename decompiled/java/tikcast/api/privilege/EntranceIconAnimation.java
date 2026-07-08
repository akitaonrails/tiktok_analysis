package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class EntranceIconAnimation {

    @C09CT("animation_text")
    public Text animationText;

    @C09CT("business_type")
    public int businessType;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("animation_uuid")
    public String animationUuid = "";

    @C09CT("button_gradient_colour")
    public List<String> buttonGradientColour = new ArrayList();

    @C09CT("ribbon")
    public List<String> ribbon = new ArrayList();
}
