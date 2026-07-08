package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PlayTogetherTemplateV2;

/* JADX INFO: loaded from: classes34.dex */
public final class StartPlayTogetherV2Request {

    @C09CT("allow_limit_types")
    public int allowLimitTypes;

    @C09CT("is_with_template")
    public boolean isWithTemplate;

    @C09CT("template")
    public PlayTogetherTemplateV2 template;

    @C09CT("template_id")
    public String templateId = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";
}
