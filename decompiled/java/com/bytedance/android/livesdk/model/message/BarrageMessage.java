package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BarrageMessage extends AbstractC1136060ffY {

    @C09CT("animation_data")
    public AnimationData animationData;

    @C09CT("background")
    public ImageModel backGround;

    @C09CT("badge")
    public BadgeStruct badge;

    @C09CT("common_barrage_content")
    public Text commonBarrageContent;

    @C09CT("content")
    public Text content;

    @C09CT("control")
    public DisplayControl control;

    @C09CT("display_config")
    public int displayConfig;

    @C09CT("duration")
    public long duration;

    @C09CT("ecom_live_param")
    public BarrageTypeEcomLiveParam ecomLiveParam;

    @C09CT("event")
    public BarrageEvent event;

    @C09CT("fans_level_param")
    public BarrageTypeFansLevelParam fansLevelParam;

    @C09CT("gallery_gift_id")
    public long galleryGiftId;

    @C09CT("gift_gallery_params")
    public BarrageTypeGiftGalleryParam giftGalleryParams;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("left_icon_display_type")
    public int leftIconDisplayType;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("privilege_log_extra")
    public PrivilegeLogExtra privilegeLogExtra;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("render_type")
    public int renderType;

    @C09CT("ribbon_animation")
    public ImageModel ribbonAnimation;

    @C09CT("right_icon")
    public ImageModel rightIcon;

    @C09CT("right_label")
    public RightLabel rightLabel;

    @C09CT("show_type")
    public int showType;

    @C09CT("subscribe_gift_param")
    public BarrageTypeSubscribeGiftParam subscribeGiftParam;

    @C09CT("use_marquee")
    public boolean useMarquee;

    @C09CT("user")
    public User user;

    @C09CT("user_grade_param")
    public BarrageTypeUserGradeParam userGradeParam;

    @C09CT("sub_type")
    public String subType = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("hybrid_url")
    public String hybridUrl = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    public static class BarrageEvent {

        @C09CT("event_name")
        public String eventName;

        @C09CT("params")
        public Map<String, String> params;
    }

    public static final class RightLabel {

        @C09CT("background_color")
        public String backgroundColor = "";

        @C09CT("content")
        public Text content;

        @C09CT("height")
        public long height;
    }

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public BarrageMessage() {
        this.type = C001A.BARRAGE_MESSAGE;
    }
}
