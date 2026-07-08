package kotlin.jvm.internal;

import X.C09AY;
import X.C0WIY;
import X.C12I3;
import X.C12I4;
import X.C12N4;
import X.C12PJ;
import X.C1389890mGx;
import X.C13LP;
import X.C1644450stX;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19656711vR;
import X.C20694015yM;
import X.C786410Ut5;
import X.InterfaceC204626155c;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.effect.EffectProfileListFragment;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS115S0110000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        if (awS115S0110000_29.z1) {
            TrendsTabFragment trendsTabFragment = (TrendsTabFragment) awS115S0110000_29.l0;
            trendsTabFragment.LLJJIII = true;
            trendsTabFragment.LLJJIJI = false;
            C786410Ut5.LLLZLZ(trendsTabFragment.SR(), 8);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx((TrendsTabFragment) awS115S0110000_29.l0);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            TrendsTabFragment trendsTabFragment2 = (TrendsTabFragment) awS115S0110000_29.l0;
            if (!trendsTabFragment2.LLJJIII) {
                C1749280vcc c1749280vccSR = trendsTabFragment2.SR();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new AwS573S0100000_29((TrendsTabFragment) awS115S0110000_29.l0, 89));
                c1749280vccSR.setStatus(c1722300uv6);
                TrendsTabFragment trendsTabFragment3 = (TrendsTabFragment) awS115S0110000_29.l0;
                trendsTabFragment3.LLJJIJI = false;
                C786410Ut5.LLLZLZ(trendsTabFragment3.SR(), 0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        FTCEditTextStickerViewState fTCEditTextStickerViewState = (FTCEditTextStickerViewState) obj;
        return fTCEditTextStickerViewState.copy(fTCEditTextStickerViewState.ui, fTCEditTextStickerViewState.inTimeEditView, fTCEditTextStickerViewState.sticker2Top, fTCEditTextStickerViewState.dismissHitText, new C1644450stX<>(new Pair((TextStickerData) awS115S0110000_29.l0, Boolean.valueOf(awS115S0110000_29.z1))), fTCEditTextStickerViewState.reloadStickerEvent, fTCEditTextStickerViewState.textStickerListener, fTCEditTextStickerViewState.changeToTopListener, fTCEditTextStickerViewState.textStickerEditListener, fTCEditTextStickerViewState.timeClickListener, fTCEditTextStickerViewState.textStickerMob, fTCEditTextStickerViewState.targetCanvasSize, fTCEditTextStickerViewState.showInputView, fTCEditTextStickerViewState.removeAllStickerEvent, fTCEditTextStickerViewState.updateLayoutSizeEvent, fTCEditTextStickerViewState.resetGuideViewVisibilityEvent, fTCEditTextStickerViewState.updateStickerTime);
    }

    public static final Object invoke$10(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        PostNotificationStatus postNotificationStatus = (PostNotificationStatus) obj;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        if (!awS115S0110000_29.z1) {
            map.putAll(postNotificationStatus.getUnreadCountMap());
            arrayList.addAll(postNotificationStatus.getUnreadUidList());
        }
        List<User> list = ((FollowingItemList) awS115S0110000_29.l0).items;
        if (list != null) {
            for (User user : C13LP.LJJJJLI(list)) {
                if (user.getUnReadVideoInfo() != null && user.getUnReadVideoCount() > 0) {
                    map.put(user.getUid(), Integer.valueOf(user.getUnReadVideoCount()));
                    arrayList.add(user.getUid());
                }
            }
        }
        return postNotificationStatus.copy(postNotificationStatus.uid, postNotificationStatus.secUid, postNotificationStatus.listState, postNotificationStatus.isHotSoonHasMore, postNotificationStatus.vcdCount, postNotificationStatus.hotSoonText, postNotificationStatus.pushSwitchState, postNotificationStatus.friendsPushSwitchState, map, arrayList);
    }

    public static final Object invoke$11(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        PostNotificationStatus postNotificationStatus = (PostNotificationStatus) obj;
        ((PostNotificationSettingsViewModel) awS115S0110000_29.l0).LLJI = true;
        return postNotificationStatus.copy(postNotificationStatus.uid, postNotificationStatus.secUid, postNotificationStatus.listState, postNotificationStatus.isHotSoonHasMore, postNotificationStatus.vcdCount, postNotificationStatus.hotSoonText, postNotificationStatus.pushSwitchState, awS115S0110000_29.z1, postNotificationStatus.unreadCountMap, postNotificationStatus.unreadUidList);
    }

    public static final Object invoke$2(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        if (!((Boolean) obj).booleanValue() && ((C12PJ) awS115S0110000_29.l0).F4()) {
            ((C12PJ) awS115S0110000_29.l0).T4().LLIL(awS115S0110000_29.z1);
            ((C12PJ) awS115S0110000_29.l0).P4().LLIL(awS115S0110000_29.z1);
        } else {
            ((C12PJ) awS115S0110000_29.l0).i3(AFwS273S0000000_29.get$arr$(111));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        MusicModel.CollectionType collectionType;
        InterfaceC204626155c interfaceC204626155c = (InterfaceC204626155c) obj;
        MusicModel musicModel = (MusicModel) awS115S0110000_29.l0;
        if (!awS115S0110000_29.z1) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        interfaceC204626155c.LLZLI(musicModel, collectionType);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        if (((Number) obj).intValue() != 3) {
            EffectProfileListFragment effectProfileListFragment = (EffectProfileListFragment) awS115S0110000_29.l0;
            effectProfileListFragment.LLJJJJ.LIZ(effectProfileListFragment, awS115S0110000_29.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        float fLIZ;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        ComposerBeauty composerBeauty = (ComposerBeauty) obj;
        Map map = (Map) awS115S0110000_29.l0;
        if (awS115S0110000_29.z1) {
            int progressValue = composerBeauty.getProgressValue();
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null && (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) C13LP.LJJJLL(items)) != null) {
                fLIZ = C12I3.LIZ(new C12I4(itemsBean.doubleDirection, itemsBean.max, itemsBean.min, 0.0f, progressValue, 0.0f, 1870));
            } else {
                fLIZ = progressValue;
            }
        } else {
            fLIZ = 0.0f;
        }
        map.put(composerBeauty, Float.valueOf(fLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        return C19656711vR.LIZ((C19656711vR) obj, 0, false, false, null, ((Number) ((C0WIY) awS115S0110000_29.l0).LIZ).longValue(), ((Number) ((C0WIY) awS115S0110000_29.l0).LIZIZ).longValue(), false, 0, awS115S0110000_29.z1, 463);
    }

    public static final Object invoke$7(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        return C20694015yM.LJJIJL(((C12N4) awS115S0110000_29.l0).LIZIZ(), false, awS115S0110000_29.z1, null, null, null, false, false, 16776959);
    }

    public static final Object invoke$8(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        return C20694015yM.LJJIJL(((C12N4) awS115S0110000_29.l0).LIZIZ(), awS115S0110000_29.z1, false, null, null, null, false, false, 16777199);
    }

    public static final Object invoke$9(AwS115S0110000_29 awS115S0110000_29, Object obj) {
        NotificationChoiceState notificationChoiceState = (NotificationChoiceState) obj;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        if (!awS115S0110000_29.z1) {
            map.putAll(notificationChoiceState.getUnreadCountMap());
            arrayList.addAll(notificationChoiceState.getUnreadUidList());
        }
        List<User> list = ((FollowingItemList) awS115S0110000_29.l0).items;
        if (list != null) {
            for (User user : C13LP.LJJJJLI(list)) {
                if (user.getUnReadVideoInfo() != null && user.getUnReadVideoCount() > 0) {
                    map.put(user.getUid(), Integer.valueOf(user.getUnReadVideoCount()));
                    arrayList.add(user.getUid());
                }
            }
        }
        return notificationChoiceState.copy(notificationChoiceState.userId, notificationChoiceState.secUserId, notificationChoiceState.isSelf, notificationChoiceState.listState, notificationChoiceState.isHotsoonHasMore, notificationChoiceState.vcdCount, notificationChoiceState.hotsoonText, notificationChoiceState.pushSwitchState, map, arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0110000_29(C0WIY c0wiy, C0WIY<Long, Long> c0wiy2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c0wiy;
        this.z1 = c0wiy2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(C12N4 c12n4, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c12n4;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(C12PJ c12pj, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c12pj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(TextStickerData textStickerData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(FollowingItemList followingItemList, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = followingItemList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(MusicModel musicModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(EffectProfileListFragment effectProfileListFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = effectProfileListFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(PostNotificationSettingsViewModel postNotificationSettingsViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = postNotificationSettingsViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0110000_29(Map map, Map<ComposerBeauty, Float> map2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = map;
        this.z1 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0110000_29(boolean z, TrendsTabFragment trendsTabFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = trendsTabFragment;
    }
}
