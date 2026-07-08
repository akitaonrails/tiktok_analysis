package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class TopRightBannerContainerComponent {

    @C09CT("background_image")
    public ImageModel backgroundImage;

    @C09CT("ec_prelive_checklist")
    public EcPreLiveChecklistData ecPreliveChecklist;

    @C09CT("has_close_button")
    public boolean hasCloseButton;

    @C09CT("has_right_arrow")
    public boolean hasRightArrow;

    @C09CT("image")
    public ImageModel image;

    @C09CT("image_corner_radius")
    public float imageCornerRadius;

    @C09CT("image_mode_scale")
    public int imageModeScale;

    @C09CT("image_mode_scale_android")
    public int imageModeScaleAndroid;

    @C09CT("image_padding")
    public ImagePadding imagePadding;

    @C09CT("image_type_android")
    public int imageTypeAndroid;

    @C09CT("is_client_banner")
    public boolean isClientBanner;

    @C09CT("is_customized_image")
    public boolean isCustomizedImage;

    @C09CT("is_customized_schema")
    public boolean isCustomizedSchema;

    @C09CT("style")
    public int style;

    @C09CT("subtitle_text")
    public Text subtitleText;

    @C09CT("target_top_right_container_item_type")
    public int targetTopRightContainerItemType;

    @C09CT("title_text")
    public Text titleText;

    @C09CT("type")
    public int type;

    @C09CT("schema")
    public String schema = "";

    @C09CT("tux_url")
    public String tuxUrl = "";

    @C09CT("gecko_key")
    public String geckoKey = "";

    @C09CT("frequency_key")
    public String frequencyKey = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();

    @C09CT("track_extra")
    public Map<String, String> trackExtra = new LinkedHashMap();
}
