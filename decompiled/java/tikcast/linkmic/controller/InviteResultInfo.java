package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import tikcast.linkmic.common.ErrorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class InviteResultInfo {

    @C09CT("action_type")
    public int actionType;

    @C09CT("err_info")
    public ErrorInfo errInfo;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("player")
    public Player player;
}
