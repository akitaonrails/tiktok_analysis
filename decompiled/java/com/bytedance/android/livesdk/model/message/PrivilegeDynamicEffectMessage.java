package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.message.proto.ResourceAttr;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PrivilegeDynamicEffectMessage extends AbstractC1136060ffY {

    @C09CT("control")
    public DisplayControl control;

    @C09CT("effect_type")
    public int effectType;

    @C09CT("placeholder_list")
    public List<Placeholder> placeholderList;

    @C09CT("privilege_log_extra")
    public PrivilegeLogExtra privilegeLogExtra;

    @C09CT("resource_attr")
    public ResourceAttr resourceAttr;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("sticker_model")
    public StickerEffectModel stickerModel;

    public static final class FontStyle {

        @C09CT("enable_shadow")
        public boolean enableShadow;

        @C09CT("enable_stroke")
        public boolean enableStroke;

        @C09CT("font_size")
        public int fontSize;

        @C09CT("horizontal_align")
        public int horizontalAlign;

        @C09CT("max_lines")
        public int maxLines;

        @C09CT("vertical_align")
        public int verticalAlign;

        @C09CT("weight")
        public int weight;

        @C09CT("font_color")
        public String fontColor = "";

        @C09CT("shadow_config_list")
        public List<ShadowConfig> shadowConfigList = new ArrayList();

        @C09CT("stroke_config_list")
        public List<StrokeConfig> strokeConfigList = new ArrayList();

        public static final class ShadowConfig {

            @C09CT("shadow_color")
            public String shadowColor = "";

            @C09CT("shadow_dx")
            public int shadowDx;

            @C09CT("shadow_dy")
            public int shadowDy;

            @C09CT("shadow_radius")
            public int shadowRadius;
        }

        public static final class StrokeConfig {

            @C09CT("stroke_color")
            public String strokeColor = "";

            @C09CT("stroke_width")
            public int strokeWidth;
        }
    }

    public static final class Placeholder {

        @C09CT("font_style")
        public FontStyle fontStyle;

        @C09CT("image_padding")
        public ImagePadding imagePadding;

        @C09CT("place_type")
        public int placeType;

        @C09CT("target_height")
        public int targetHeight;

        @C09CT("target_image")
        public String targetImage = "";

        @C09CT("target_width")
        public int targetWidth;

        @C09CT("text")
        public Text text;

        public static final class ImagePadding {

            @C09CT("bottom_padding")
            public int bottomPadding;

            @C09CT("left_padding")
            public int leftPadding;

            @C09CT("right_padding")
            public int rightPadding;

            @C09CT("top_padding")
            public int topPadding;
        }
    }

    public static final class StickerEffectModel {

        @C09CT("duration")
        public long duration;

        @C09CT("text")
        public Text text;

        @C09CT("resource_id")
        public String resourceId = "";

        @C09CT("panel_type")
        public String panelType = "";
    }

    public PrivilegeDynamicEffectMessage() {
        this.type = C001A.PRIVILEGE_DYNAMIC_EFFECT_MESSAGE;
        this.scene = "";
        this.placeholderList = new ArrayList();
    }
}
