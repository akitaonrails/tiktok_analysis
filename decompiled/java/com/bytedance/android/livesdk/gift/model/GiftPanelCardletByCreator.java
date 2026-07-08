package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPanelCardletByCreator {

    @C09CT("cardlet_button")
    public CardletButton cardletButton;

    @C09CT("cardlet_icon")
    public ImageModel cardletIcon;

    @C09CT("cardlet_priority")
    public int cardletPriority;

    @C09CT("cardlet_type")
    public int cardletType;

    @C09CT("copywriting_type")
    public int copywritingType;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("schema_url")
    public String schemaUrl = "";

    public static final class CardletButton {

        @C09CT("button_priority")
        public int buttonPriority;

        @C09CT("button_type")
        public int buttonType;

        @C09CT("left_icon")
        public ImageModel leftIcon;

        @C09CT("text")
        public String text = "";

        @C09CT("schema")
        public String schema = "";
    }
}
