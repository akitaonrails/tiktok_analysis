package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes8.dex */
public final class PersonaData {

    @C09CT("main_text")
    public Text mainText;

    @C09CT("right_img")
    public ImageModel rightImg;

    @C09CT("sub_text")
    public Text subText;

    @C09CT("type")
    public int type;

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("extra")
    public String extra = "";
}
