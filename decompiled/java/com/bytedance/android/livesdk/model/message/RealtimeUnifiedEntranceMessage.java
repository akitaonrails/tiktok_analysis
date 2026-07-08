package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes30.dex */
public final class RealtimeUnifiedEntranceMessage extends AbstractC1136060ffY {

    @C09CT("context")
    public String context;

    @C09CT("cta_schema")
    public String ctaSchema;

    @C09CT("cta_text")
    public String ctaText;

    @C09CT("icon")
    public String icon;

    @C09CT("message_key")
    public String messageKey;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("suggestion_id")
    public String suggestionId;

    @C09CT("suggestion_template_id")
    public String suggestionTemplateId;

    @C09CT("target_module")
    public String targetModule;

    @C09CT("title")
    public String title;

    @C09CT("tux_icon_name")
    public String tuxIconName;

    public RealtimeUnifiedEntranceMessage() {
        this.type = C001A.REALTIME_UNIFIED_ENTRANCE_MESSAGE;
        this.suggestionId = "";
        this.suggestionTemplateId = "";
        this.scene = "";
        this.context = "";
        this.title = "";
        this.icon = "";
        this.ctaText = "";
        this.ctaSchema = "";
        this.subtitle = "";
        this.tuxIconName = "";
        this.messageKey = "";
        this.targetModule = "";
    }
}
