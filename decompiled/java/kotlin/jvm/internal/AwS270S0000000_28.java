package kotlin.jvm.internal;

import X.C09AY;
import android.view.ViewGroup;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS270S0000000_28 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS270S0000000_28(PushSettingFollowListAdapter pushSettingFollowListAdapter, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.CampaignItemViewSwitchHolder((ViewGroup) obj);
    }

    public static final Object invoke$1(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.LiveCustomizedItemViewSwitchHolder((ViewGroup) obj);
    }

    public static final Object invoke$2(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.LiveOutMultiGuestPushItemViewSwitchHolder((ViewGroup) obj);
    }

    public static final Object invoke$3(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.FollowItemViewTitleHolder((ViewGroup) obj);
    }

    public static final Object invoke$4(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.RewardItemViewSwitchHolder((ViewGroup) obj);
    }

    public static final Object invoke$5(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.LiveTransactionItemViewSwitchHolder((ViewGroup) obj);
    }

    public static final Object invoke$6(AwS270S0000000_28 awS270S0000000_28, Object obj) {
        return new PushSettingFollowListAdapter.SubSpaceItemViewSwitchHolder((ViewGroup) obj);
    }
}
