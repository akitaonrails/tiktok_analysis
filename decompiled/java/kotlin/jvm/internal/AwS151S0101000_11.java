package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0S0R;
import X.C0SAZ;
import X.C0SFO;
import X.C0SFR;
import X.C0SJL;
import X.C13LP;
import X.C1619720sFe;
import X.C1ER1;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C631370Opb;
import X.C719000SIg;
import X.C786410Ut5;
import X.InterfaceC1897260zTI;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.FeedBannerSpecialCardPicture;
import com.bytedance.touchpoint.api.model.FeedToast;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top.FriendsV3UserInfoAssem;
import com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent;
import com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS151S0101000_11 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS151S0101000_11 awS151S0101000_11) {
        C1ER1.LIZIZ.LJLLILLLL(awS151S0101000_11.i1, (View) awS151S0101000_11.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS151S0101000_11.l0).hashCode());
        sbLIZ.append(" onHolderPause mode: ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(", isEnterFullPageBeforePause: ");
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS151S0101000_11.l0).LLJLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS151S0101000_11 awS151S0101000_11) {
        INetworkApi iNetworkApiLIZJ;
        int iIntValue;
        FeedBannerSpecialCardPicture feedBannerSpecialCardPicture;
        Integer num;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) awS151S0101000_11.l0;
            String str = referralFeedBanner.notificationId;
            if (str == null) {
                str = "";
            }
            int i = awS151S0101000_11.i1;
            List<FeedBannerSpecialCardPicture> list = referralFeedBanner.feedBannerSpecialCardPicture;
            if (list != null && (feedBannerSpecialCardPicture = (FeedBannerSpecialCardPicture) C13LP.LJJJLL(list)) != null && (num = feedBannerSpecialCardPicture.multiShowCount) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            iNetworkApiLIZJ.requestOnNotificationAction(str, i, "feed_banner", "", iIntValue, 0, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateContainerShowEnd, pos => ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(", slidesShowInfo => ");
        sbLIZ.append((C0SAZ) awS151S0101000_11.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateContainerStart, pos:==> ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(", slideShowInfo => ");
        sbLIZ.append((C0SAZ) awS151S0101000_11.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS151S0101000_11.l0).hashCode());
        sbLIZ.append(" onHolderSelected ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(" itemPosition ");
        sbLIZ.append(C631370Opb.LIZIZ((PhotoFeedLivePhotoComponent) awS151S0101000_11.l0));
        sbLIZ.append(" isFeedHolderSelected ");
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS151S0101000_11.l0).LLJLLIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS151S0101000_11 awS151S0101000_11) {
        INetworkApi iNetworkApiLIZJ;
        String str;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            FeedToast feedToast = (FeedToast) ((ShareCoinIncentiveComponent) awS151S0101000_11.l0).LLILLL.getValue();
            if (feedToast == null || (str = feedToast.notificationId) == null) {
                str = "";
            }
            iNetworkApiLIZJ.requestOnNotificationAction(str, awS151S0101000_11.i1, "feed_toast", "", 0, 0, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS151S0101000_11 awS151S0101000_11) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S0R((Bubble) awS151S0101000_11.l0, awS151S0101000_11.i1, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryEllipsisWithHashTagTruncated new layout line ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(" content: ");
        C0SFO c0sfo = C0SFR.LIZ;
        sbLIZ.append(C0SFR.LIZIZ(awS151S0101000_11.i1, (Layout) ((C259800zU) awS151S0101000_11.l0).element));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryEllipsis findLineLast component check ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LIZLLL());
        sbLIZ.append(" [");
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LLILLL);
        sbLIZ.append(", ");
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LLILZ);
        sbLIZ.append("] ");
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS151S0101000_11 awS151S0101000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryEllipsis findLineLast component check ");
        sbLIZ.append(awS151S0101000_11.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LIZLLL());
        sbLIZ.append(" [");
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LLILLL);
        sbLIZ.append(", ");
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LLILZ);
        sbLIZ.append("] ");
        sbLIZ.append(((C0SJL) awS151S0101000_11.l0).LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS151S0101000_11 awS151S0101000_11) {
        ((BaseUserFeedComponent) awS151S0101000_11.l0).sp().setOffscreenPageLimit(awS151S0101000_11.i1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS151S0101000_11 awS151S0101000_11) {
        ((TextView) ((FriendsV3UserInfoAssem) awS151S0101000_11.l0).LLJLL.getValue()).setText(C786410Ut5.k4(Locale.ENGLISH, "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(awS151S0101000_11.i1)}, 1)));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(BaseUserFeedComponent baseUserFeedComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseUserFeedComponent;
        this.i1 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0101000_11(int i, int i2, C259800zU<Layout> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(int i, C0SAZ c0saz, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c0saz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S0101000_11(int i, int i2, C0SJL<C719000SIg> c0sjl) {
        super(0);
        this.$t = c0sjl;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(int i, ReferralFeedBanner referralFeedBanner, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = referralFeedBanner;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(Bubble bubble, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bubble;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(FriendsV3UserInfoAssem friendsV3UserInfoAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = friendsV3UserInfoAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(PhotoFeedLivePhotoComponent photoFeedLivePhotoComponent, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = photoFeedLivePhotoComponent;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0101000_11(ShareCoinIncentiveComponent shareCoinIncentiveComponent, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = shareCoinIncentiveComponent;
        this.i1 = i;
    }
}
