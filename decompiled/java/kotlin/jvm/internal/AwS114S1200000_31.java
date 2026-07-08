package kotlin.jvm.internal;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C09AY;
import X.C0CNO;
import X.C1075710e6D;
import X.C118300cf;
import X.C1361400lX0;
import X.C13BV;
import X.C150D;
import X.C1524805y2;
import X.C15M1;
import X.C15TI;
import X.C15YG;
import X.C15YK;
import X.C20526015Tm;
import X.C20592915i3;
import X.C20610715kv;
import X.C20611415l2;
import X.C20611915l7;
import X.C630310Ont;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteRatingCardAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS114S1200000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS114S1200000_31 awS114S1200000_31, Object obj) throws JSONException {
        Object obj2;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("previous_page", "video_edit_page");
        jSONObject.put("to_user_id", ((C20611415l2) awS114S1200000_31.l1).LIZ);
        jSONObject.put("user_type", awS114S1200000_31.s0);
        C20610715kv c20610715kv = ((VideoCaptionMentionSearchCell) awS114S1200000_31.l2).I5().LLILLJJLI;
        if (c20610715kv != null) {
            obj2 = c20610715kv.LIZIZ;
        } else {
            obj2 = null;
        }
        jSONObject.put("search_keyword", obj2);
        jSONObject.put("function", "mention");
        jSONObject.put("is_valid", String.valueOf(((C20611415l2) awS114S1200000_31.l1).LJIJJ.LIZ ? 1 : 0));
        jSONObject.put("click_type", "choose");
        jSONObject.put("enter_from", "video_post_page");
        jSONObject.put(Scene.SCENE_SERVICE, "publish_mention");
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS114S1200000_31 awS114S1200000_31, Object obj) throws JSONException {
        Object obj2;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", "video_post_page");
        jSONObject.put("previous_page", "video_edit_page");
        jSONObject.put("to_user_id", ((C20611415l2) awS114S1200000_31.l1).LIZ);
        jSONObject.put("user_type", awS114S1200000_31.s0);
        C20610715kv c20610715kv = ((VideoCaptionMentionSearchCell) awS114S1200000_31.l2).I5().LLILLJJLI;
        if (c20610715kv != null) {
            obj2 = c20610715kv.LIZIZ;
        } else {
            obj2 = null;
        }
        jSONObject.put("search_keyword", obj2);
        jSONObject.put("function", "mention");
        jSONObject.put("is_valid", String.valueOf(((C20611415l2) awS114S1200000_31.l1).LJIJJ.LIZ ? 1 : 0));
        jSONObject.put(Scene.SCENE_SERVICE, "publish_mention");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        C1524805y2.LIZIZ(0L, new AwS20S1210000_31(((Boolean) obj).booleanValue(), (C15YG) awS114S1200000_31.l1, awS114S1200000_31.s0, (C15YK) awS114S1200000_31.l2, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS114S1200000_31 r4, java.lang.Object r5) throws org.json.JSONException {
        /*
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r1 = "scene"
            java.lang.String r0 = r4.s0
            r5.put(r1, r0)
            java.lang.Object r0 = r4.l1
            X.15l7 r0 = (X.C20611915l7) r0
            X.15l1 r0 = r0.LJIIL
            java.lang.String r1 = r0.LIZLLL
            java.lang.String r0 = "search_keyword"
            r5.put(r0, r1)
            java.lang.Object r0 = r4.l2
            com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell r0 = (com.ss.android.ugc.aweme.base.ui.cell.MentionBaseCell) r0
            int r1 = r0.getBindingAdapterPosition()
            java.lang.String r0 = "rank"
            r5.put(r0, r1)
            java.lang.Object r0 = r4.l1
            X.15l7 r0 = (X.C20611915l7) r0
            int r3 = r0.LIZIZ
            int r2 = r0.LIZJ
            if (r3 != 0) goto L4e
            if (r2 != 0) goto L4e
        L2f:
            r1 = 0
        L30:
            java.lang.String r0 = "relation"
            r5.put(r0, r1)
            java.lang.Object r0 = r4.l1
            X.15l7 r0 = (X.C20611915l7) r0
            int r1 = r0.LIZIZ
            java.lang.String r0 = "follow_status"
            r5.put(r0, r1)
            java.lang.Object r0 = r4.l1
            X.15l7 r0 = (X.C20611915l7) r0
            int r1 = r0.LIZJ
            java.lang.String r0 = "follower_status"
            r5.put(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            r1 = 4
            r0 = 2
            if (r3 == r0) goto L30
            r0 = 1
            if (r3 != r0) goto L57
            r1 = 1
            goto L30
        L57:
            if (r2 != r0) goto L5b
            r1 = 2
            goto L30
        L5b:
            if (r3 != r1) goto L2f
            r1 = 3
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS114S1200000_31.invoke$2(kotlin.jvm.internal.AwS114S1200000_31, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        C20526015Tm c20526015Tm;
        Aweme aweme;
        List listListGetAll = ((ExploreFeedListViewModel) awS114S1200000_31.l1).listGetAll();
        if (listListGetAll == null) {
            listListGetAll = C13BV.INSTANCE;
        }
        String str = awS114S1200000_31.s0;
        Iterator it2 = listListGetAll.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C150D c150d = (C150D) it2.next();
            String aid = null;
            if ((c150d instanceof C20526015Tm) && (c20526015Tm = (C20526015Tm) c150d) != null && (aweme = c20526015Tm.LL) != null) {
                aid = aweme.getAid();
            }
            if (Intrinsics.LJFF(aid, str)) {
                if (i >= 0) {
                    ((ExploreFeedListViewModel) awS114S1200000_31.l1).listRemoveItemAt(i);
                }
            } else {
                i++;
            }
        }
        Aweme aweme2 = (Aweme) awS114S1200000_31.l2;
        ((ExploreFeedListViewModel) awS114S1200000_31.l1).listAddItemAt(0, new C20526015Tm(aweme2, aweme2.isLike(), null, null, false, C15TI.INSERT_CARD.getValue(), true, 0L, null, null, null, null, null, null, 130944));
        ((ExploreFeedListViewModel) awS114S1200000_31.l1).setState(AFwS276S0000000_31.get$arr$(115));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        String str;
        String str2 = awS114S1200000_31.s0;
        C20592915i3 c20592915i3 = (C20592915i3) awS114S1200000_31.l1;
        Activity activity = (Activity) awS114S1200000_31.l2;
        c20592915i3.getClass();
        if (C20592915i3.LIZ(activity)) {
            str = "live_take_popup_in_room";
        } else {
            str = "live_take_popup_out_room";
        }
        C1075710e6D.LIZ(str2, "cancel", str, true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        if (((AbstractDialogInterfaceC1397690mTX) obj).LLIZ == null) {
            ((NetworkStandardUIServiceImpl) awS114S1200000_31.l2).onEvent(((C118300cf) awS114S1200000_31.l1).element, awS114S1200000_31.s0, "cancel");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        ((NetworkStandardUIServiceImpl) awS114S1200000_31.l2).onEvent(((C118300cf) awS114S1200000_31.l1).element, awS114S1200000_31.s0, "cancel");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        ((Boolean) obj).booleanValue();
        C0CNO.LIZLLL(0L, new AwS146S1200000_31((MusicModel) awS114S1200000_31.l1, (VerticalMusicViewV2) awS114S1200000_31.l2, awS114S1200000_31.s0, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        Music music;
        Music music2;
        UrlModel coverMedium;
        Music music3;
        MusicDetail musicDetail = (MusicDetail) obj;
        if (((MusicShootAssem) awS114S1200000_31.l1).LLLLZLLIL && ((music = musicDetail.music) == null || !C630310Ont.LIZ(music) ? !((music2 = musicDetail.music) == null || (coverMedium = music2.getCoverMedium()) == null) : !((music3 = ((MusicShootAssem) awS114S1200000_31.l1).LLJZIJLIL) == null || (coverMedium = music3.getCoverMedium()) == null))) {
            MusicShootAssem musicShootAssem = (MusicShootAssem) awS114S1200000_31.l1;
            final C15M1 c15m1 = new C15M1(musicShootAssem, awS114S1200000_31.s0, (MusicModel) awS114S1200000_31.l2, coverMedium, musicDetail);
            musicShootAssem.getClass();
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() { // from class: X.15Lv
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    c15m1.invoke(asyncAVService);
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS114S1200000_31 awS114S1200000_31, Object obj) {
        SmartRouter.buildRoute((Context) awS114S1200000_31.l2, awS114S1200000_31.s0).open();
        ((FootNoteRatingCardAssem) awS114S1200000_31.l1).Bp().wQ2("url_redirect");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(C15YG c15yg, String str, C15YK c15yk, int i) {
        super(1);
        this.$t = i;
        this.l1 = c15yg;
        this.s0 = str;
        this.l2 = c15yk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(C20611415l2 c20611415l2, String str, VideoCaptionMentionSearchCell videoCaptionMentionSearchCell, int i) {
        super(1);
        this.$t = i;
        this.l1 = c20611415l2;
        this.s0 = str;
        this.l2 = videoCaptionMentionSearchCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(ExploreFeedListViewModel exploreFeedListViewModel, Aweme aweme, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = exploreFeedListViewModel;
        this.l2 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(FootNoteRatingCardAssem footNoteRatingCardAssem, String str, C1361400lX0 c1361400lX0, int i) {
        super(1);
        this.$t = i;
        this.l1 = footNoteRatingCardAssem;
        this.s0 = str;
        this.l2 = c1361400lX0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(MusicShootAssem musicShootAssem, String str, MusicModel musicModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = musicShootAssem;
        this.s0 = str;
        this.l2 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C118300cf c118300cf, String str, int i) {
        super(1);
        this.$t = i;
        this.l2 = networkStandardUIServiceImpl;
        this.l1 = c118300cf;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(MusicModel musicModel, VerticalMusicViewV2 verticalMusicViewV2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = musicModel;
        this.l2 = verticalMusicViewV2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S1200000_31(String str, C20592915i3 c20592915i3, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c20592915i3;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS114S1200000_31(String str, String str2, C20611915l7 c20611915l7, MentionBaseCell<ITEM> mentionBaseCell) {
        super(1);
        this.$t = mentionBaseCell;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c20611915l7;
    }
}
