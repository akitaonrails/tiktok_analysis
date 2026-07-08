package tikcast.api.privilege.enigma;

import X.C09CT;
import com.bytedance.android.live.base.model.user.EntranceEffect;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: loaded from: classes.dex */
public final class EnigmaHomePageData {

    @C09CT("can_purchase_iap")
    public boolean canPurchaseIap;

    @C09CT("enigma_product_details")
    public List<EnigmaProductDetails> enigmaProductDetails = new ArrayList();

    @C09CT("entrance_effect")
    public EntranceEffect entranceEffect;

    @C09CT("original_user")
    public User originalUser;

    @C09CT("renew_limitation")
    public long renewLimitation;

    @C09CT("sub_info")
    public EnigmaSubscriptionInfo subInfo;

    @C09CT("subscription_remaining")
    public long subscriptionRemaining;

    @C09CT("total_subscribed_days")
    public int totalSubscribedDays;

    @C09CT("user_balance")
    public long userBalance;

    @C09CT("user_enigma")
    public UserEnigma userEnigma;

    @C09CT("user_grade")
    public UserGrade userGrade;

    @C09CT("user_is_eea")
    public boolean userIsEea;

    @C09CT("withdraw_info")
    public WithdrawInfo withdrawInfo;
}
