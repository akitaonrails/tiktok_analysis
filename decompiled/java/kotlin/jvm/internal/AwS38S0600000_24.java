package kotlin.jvm.internal;

import X.C09AY;
import X.C1569940qxM;
import X.C1577300r9E;
import X.C1577330r9H;
import X.C1623606Xi;
import X.C1744020vU8;
import X.EnumC1569630qwr;
import android.content.Context;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackLiveRoomInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackUserInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackWatchLiveButton;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS38S0600000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS38S0600000_24 awS38S0600000_24, Object obj) {
        C1577300r9E c1577300r9E = new C1577300r9E((DramaDNUFeedCardConfig) obj, (Context) awS38S0600000_24.l1, (Aweme) awS38S0600000_24.l2, (Long) awS38S0600000_24.l3, (HomeViewPagerAbility) awS38S0600000_24.l4, (C1577330r9H) awS38S0600000_24.l0, (Long) awS38S0600000_24.l5);
        C1577330r9H c1577330r9H = (C1577330r9H) awS38S0600000_24.l0;
        if (c1577330r9H.LIZ) {
            c1577300r9E.invoke();
        } else {
            c1577330r9H.LIZIZ = c1577300r9E;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S0600000_24 awS38S0600000_24, Object obj) {
        int iIntValue;
        Integer num;
        EnumC1569630qwr enumC1569630qwr = EnumC1569630qwr.NORMAL;
        ECLivePlaybackUserInfo eCLivePlaybackUserInfo = (ECLivePlaybackUserInfo) awS38S0600000_24.l0;
        if (eCLivePlaybackUserInfo != null && (num = eCLivePlaybackUserInfo.followStatus) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C1623606Xi c1623606Xi = new C1623606Xi(Integer.valueOf(iIntValue));
        ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo = (ECLivePlaybackLiveRoomInfo) awS38S0600000_24.l1;
        ECLivePlaybackUserInfo eCLivePlaybackUserInfo2 = (ECLivePlaybackUserInfo) awS38S0600000_24.l0;
        ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton = (ECLivePlaybackWatchLiveButton) awS38S0600000_24.l2;
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = (PlaybackVideoPreviewStreamData) awS38S0600000_24.l3;
        VideoPlayConfig videoPlayConfig = (VideoPlayConfig) awS38S0600000_24.l4;
        C1744020vU8 c1744020vU8 = (C1744020vU8) awS38S0600000_24.l5;
        obj.getClass();
        return new C1569940qxM(enumC1569630qwr, eCLivePlaybackLiveRoomInfo, eCLivePlaybackUserInfo2, eCLivePlaybackWatchLiveButton, playbackVideoPreviewStreamData, videoPlayConfig, c1623606Xi, c1744020vU8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0600000_24(C1577330r9H c1577330r9H, Context context, Aweme aweme, Long l, HomeViewPagerAbility homeViewPagerAbility, Long l2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1577330r9H;
        this.l1 = context;
        this.l2 = aweme;
        this.l3 = l;
        this.l4 = homeViewPagerAbility;
        this.l5 = l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0600000_24(ECLivePlaybackUserInfo eCLivePlaybackUserInfo, ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo, ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton, PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData, VideoPlayConfig videoPlayConfig, C1744020vU8 c1744020vU8, int i) {
        super(1);
        this.$t = i;
        this.l0 = eCLivePlaybackUserInfo;
        this.l1 = eCLivePlaybackLiveRoomInfo;
        this.l2 = eCLivePlaybackWatchLiveButton;
        this.l3 = playbackVideoPreviewStreamData;
        this.l4 = videoPlayConfig;
        this.l5 = c1744020vU8;
    }
}
