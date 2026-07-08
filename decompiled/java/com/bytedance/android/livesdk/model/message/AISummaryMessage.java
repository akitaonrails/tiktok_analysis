package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AISummaryMessage extends AbstractC1136060ffY {

    @C09CT("click_content_scheme_link")
    public String clickContentSchemeLink;

    @C09CT("click_title_scheme_link")
    public String clickTitleSchemeLink;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("long_press_area_scheme_link")
    public String longPressAreaSchemeLink;

    @C09CT("multi_lang_summary_list")
    public List<MultiLangContent> multiLangSummaryList;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("require_stay")
    public boolean requireStay;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("show_at_first")
    public boolean showAtFirst;

    @C09CT("stay_duration_ms")
    public long stayDurationMs;

    @C09CT("title")
    public Text title;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return false;
    }

    public AISummaryMessage() {
        this.type = C001A.A_I_SUMMARY_MESSAGE;
        this.scene = "";
        this.multiLangSummaryList = new ArrayList();
        this.clickTitleSchemeLink = "";
        this.clickContentSchemeLink = "";
        this.longPressAreaSchemeLink = "";
    }
}
