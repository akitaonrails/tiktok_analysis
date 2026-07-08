package tikcast.api.privilege.enigma;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class WithdrawInfo {

    @C09CT("contract_start_ts")
    public long contractStartTs;

    @C09CT("disable_reason_text")
    public Text disableReasonText;

    @C09CT("show_withdraw_button")
    public boolean showWithdrawButton;

    @C09CT("withdraw_button_clickable")
    public boolean withdrawButtonClickable;
}
