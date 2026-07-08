package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public class AssetMessage extends AbstractC1136060ffY {

    @C09CT("asset_id")
    public long assetId;

    @C09CT("asset")
    public AssetsModel assets;

    @C09CT("user")
    public User fromUser;

    @C09CT("log_id")
    public String logId;

    @C09CT("panel_display_text")
    public Text panelDisplayText;

    @C09CT("priority")
    public GiftIMPriority priority;

    @C09CT("show_message")
    public boolean showMessage;

    @C09CT("show_panel")
    public boolean showPanel;

    @C09CT("to_user")
    public User toUser;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public AssetMessage() {
        this.type = C001A.ASSET_MESSAGE;
    }
}
