package kotlin.jvm.internal;

import X.C09AY;
import X.C1159400gHC;
import X.C1556460qbc;
import X.C1571460qzo;
import X.C1572540r1Y;
import X.C1572570r1b;
import X.C1574320r4Q;
import X.C1575440r6E;
import X.C1579330rCV;
import X.C1581340rFk;
import X.C1598510rhR;
import X.C1612160s3S;
import X.C1612610s4B;
import X.C1614710s7Z;
import X.C1623606Xi;
import X.C2188811AlT;
import X.C291001Au;
import X.C729510SjV;
import X.C788690Uwl;
import X.C995680c18;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS74S1000000_24 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S1000000_24(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        InboxSkylightListState inboxSkylightListState = (InboxSkylightListState) obj;
        return inboxSkylightListState.copy(inboxSkylightListState.listState, inboxSkylightListState.selectedCellPosition, inboxSkylightListState.lifecycleFreeScrollPosition, inboxSkylightListState.itemDeleteEvent, inboxSkylightListState.onResumeNotRefreshingEvent, inboxSkylightListState.isListEmpty, new C291001Au<>(new C1598510rhR(awS74S1000000_24.s0)));
    }

    public static final Object invoke$1(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        ((MiniDramaPreloadMonitor.MiniDramaPreloadEvent) obj).componentPreloadScene = awS74S1000000_24.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1571460qzo.LIZ((C1571460qzo) obj, null, null, null, new C1623606Xi(awS74S1000000_24.s0), 47);
    }

    public static final Object invoke$11(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1556460qbc) obj).LIZIZ, awS74S1000000_24.s0));
    }

    public static final Object invoke$12(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, false, null, awS74S1000000_24.s0, 262143);
    }

    public static final Object invoke$13(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, false, awS74S1000000_24.s0, null, 393215);
    }

    public static final Object invoke$14(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1579330rCV.LIZ((C1579330rCV) obj, null, null, null, null, null, awS74S1000000_24.s0, 31);
    }

    public static final Object invoke$15(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        ((MiniDramaPreloadMonitor.MiniDramaPreloadEvent) obj).componentPreloadScene = awS74S1000000_24.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        ((MiniDramaPreloadMonitor.MiniDramaPreloadEvent) obj).componentPreloadScene = awS74S1000000_24.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1159400gHC.LIZ((C1159400gHC) obj, new C291001Au(new C1581340rFk(false, null, awS74S1000000_24.s0, 2)), false, 2);
    }

    public static final Object invoke$18(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1159400gHC.LIZ((C1159400gHC) obj, new C291001Au(new C1581340rFk(true, awS74S1000000_24.s0, null, 4)), false, 2);
    }

    public static final Object invoke$19(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1612160s3S.LIZ((C1612160s3S) obj, null, null, null, null, null, false, false, null, null, null, null, null, false, new C1623606Xi(awS74S1000000_24.s0), null, null, 245759);
    }

    public static final Object invoke$2(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        Aweme aweme;
        List<CollectionVideo> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C1574320r4Q.LIZ.getClass();
            Map map = (Map) C1574320r4Q.LIZIZ.getValue();
            String str = awS74S1000000_24.s0;
            Object linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                map.put(str, linkedHashMap);
            }
            Map map2 = (Map) linkedHashMap;
            String str2 = awS74S1000000_24.s0;
            for (CollectionVideo collectionVideo : list) {
                PaidVideoItem paidVideoItem = collectionVideo.video;
                if (paidVideoItem != null && (aweme = paidVideoItem.aweme) != null) {
                    String strValueOf = String.valueOf(collectionVideo.collectionId);
                    map2.put(strValueOf, aweme);
                    C1574320r4Q c1574320r4Q = C1574320r4Q.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cached Aweme for scene '");
                    sbLIZ.append(str2);
                    sbLIZ.append("', collectionId: ");
                    sbLIZ.append(strValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1574320r4Q.getClass();
                }
            }
        } else {
            C1574320r4Q c1574320r4Q2 = C1574320r4Q.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No videos fetched for uniqueKey=");
            sbLIZ2.append(awS74S1000000_24.s0);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1574320r4Q2.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        String uid;
        boolean z;
        User user;
        User author;
        FriendsV3FeedModel friendsV3FeedModel = (FriendsV3FeedModel) obj;
        Aweme aweme = friendsV3FeedModel.aweme;
        String uid2 = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        boolean z2 = true;
        if (!Intrinsics.LJFF(uid, awS74S1000000_24.s0) || (aweme != null && C729510SjV.LJJIJIL(aweme))) {
            z = false;
        } else {
            z = true;
        }
        FriendsV3RepostModel friendsV3RepostModel = friendsV3FeedModel.repostItem;
        if (friendsV3RepostModel != null && (user = friendsV3RepostModel.reposter) != null) {
            uid2 = user.getUid();
        }
        boolean zLJFF = Intrinsics.LJFF(uid2, awS74S1000000_24.s0);
        if (!z && !zLJFF) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$21(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        String uid;
        User author;
        Aweme aweme = ((FriendsV3FeedModel) obj).aweme;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        boolean zLJFF = Intrinsics.LJFF(uid, awS74S1000000_24.s0);
        boolean z = false;
        if (zLJFF && aweme != null && C729510SjV.LJJIJIL(aweme)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$22(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        String aid;
        Aweme aweme = ((ExplorePostItem) obj).aweme;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid, awS74S1000000_24.s0));
    }

    public static final Object invoke$23(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C995680c18.LIZ((C995680c18) obj, null, awS74S1000000_24.s0, null, 5);
    }

    public static final Object invoke$24(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1572540r1Y.LIZ((C1572540r1Y) obj, new C291001Au(new C1572570r1b(awS74S1000000_24.s0)), null, null, 6);
    }

    public static final Object invoke$3(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C1574320r4Q c1574320r4Q = C1574320r4Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseCollectionAndFetchV2 uniqueKey=");
        sbLIZ.append(awS74S1000000_24.s0);
        sbLIZ.append(" cachedCount=");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        c1574320r4Q.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        ((MiniDramaPreloadMonitor.MiniDramaPreloadEvent) obj).componentPreloadScene = awS74S1000000_24.s0;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        SocialAvatarLikeListState socialAvatarLikeListState = (SocialAvatarLikeListState) obj;
        return socialAvatarLikeListState.copy(socialAvatarLikeListState.avatarId, awS74S1000000_24.s0, socialAvatarLikeListState.listState);
    }

    public static final Object invoke$6(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1612610s4B) obj).LIZ, awS74S1000000_24.s0));
    }

    public static final Object invoke$7(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, null, null, awS74S1000000_24.s0, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 524279);
    }

    public static final Object invoke$8(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        return C1614710s7Z.LIZ((C1614710s7Z) obj, null, null, null, null, false, null, false, false, null, null, null, null, null, null, new C291001Au(new C788690Uwl(awS74S1000000_24.s0)), false, null, null, 507903);
    }

    public static final Object invoke$9(AwS74S1000000_24 awS74S1000000_24, Object obj) {
        IMUser iMUserLIZLLL;
        String str = (String) obj;
        if (Intrinsics.LJFF(str, awS74S1000000_24.s0) || (iMUserLIZLLL = C1575440r6E.LIZLLL(str)) == null) {
            return null;
        }
        return iMUserLIZLLL.getAvatarThumb();
    }
}
