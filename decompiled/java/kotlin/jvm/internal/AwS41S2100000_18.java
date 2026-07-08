package kotlin.jvm.internal;

import X.AbstractC19484711Kz;
import X.C09AY;
import X.C1167710gUb;
import X.C1169480gXS;
import X.C1189380h3Y;
import X.C1195400hDG;
import X.C1196140hES;
import X.C1200540hLY;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1623706Xj;
import X.C20684815ws;
import X.C21326718d7;
import X.C2188811AlT;
import X.EnumC1184240gvG;
import X.EnumC1195310hD7;
import X.InterfaceC1169460gXQ;
import X.InterfaceC1173760geM;
import X.InterfaceC1891350zJl;
import Y.AfS187S0100000_18;
import Y.AfS50S1100000_18;
import android.app.Activity;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment;
import com.ss.android.ugc.aweme.poi.hybrid.behavior.LsFlattenUIImage;
import com.ss.android.ugc.aweme.poi.hybrid.behavior.LsUIImage;
import com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS41S2100000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        int type;
        int type2;
        int type3;
        C1196140hES c1196140hES = (C1196140hES) obj;
        EnumC1195310hD7 enumC1195310hD7 = ((C1195400hDG) awS41S2100000_18.l2).LIZ;
        int type4 = -1;
        if (enumC1195310hD7 != null) {
            type = enumC1195310hD7.getType();
        } else {
            type = -1;
        }
        c1196140hES.LIZ(type, "icon data source");
        EnumC1195310hD7 enumC1195310hD72 = ((C1195400hDG) awS41S2100000_18.l2).LIZIZ;
        if (enumC1195310hD72 != null) {
            type2 = enumC1195310hD72.getType();
        } else {
            type2 = -1;
        }
        c1196140hES.LIZIZ(type2, "first line, first slot, data source");
        EnumC1195310hD7 enumC1195310hD73 = ((C1195400hDG) awS41S2100000_18.l2).LIZJ;
        if (enumC1195310hD73 != null) {
            type3 = enumC1195310hD73.getType();
        } else {
            type3 = -1;
        }
        c1196140hES.LIZJ(type3, "first line, second slot, data source");
        EnumC1195310hD7 enumC1195310hD74 = ((C1195400hDG) awS41S2100000_18.l2).LIZLLL;
        if (enumC1195310hD74 != null) {
            type4 = enumC1195310hD74.getType();
        }
        c1196140hES.LIZLLL(type4, "second line, first slot, data source");
        String str = awS41S2100000_18.s0;
        if (str == null) {
            str = "unknown";
        }
        c1196140hES.LJ("poi type_level", str);
        String str2 = awS41S2100000_18.s1;
        if (str2 == null) {
            str2 = "poi";
        }
        c1196140hES.LJFF("poi anchor_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.status_code == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((CreatePlaylistActivity) awS41S2100000_18.l2);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131850554);
            c1389890mGx.LJIIJJI();
            if (((CreatePlaylistActivity) awS41S2100000_18.l2).LLILZIL == 4) {
                IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
                CreatePlaylistActivity createPlaylistActivity = (CreatePlaylistActivity) awS41S2100000_18.l2;
                iMixFeedService.LJIJ(createPlaylistActivity, "", null, "from_profile_mix_list", "create_playlist", createPlaylistActivity.LLILZLL, awS41S2100000_18.s0, awS41S2100000_18.s1, true, null, "", null, "");
                Activity activityLIZ = C1388190mED.LIZ((CreatePlaylistActivity) awS41S2100000_18.l2);
                if (activityLIZ != null) {
                    activityLIZ.finish();
                }
                C1440005kM.LIZ(new C1167710gUb());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        Integer numValueOf;
        Video video;
        ManageResponse manageResponse = (ManageResponse) obj;
        if (manageResponse != null && manageResponse.status_code == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((CreatePlaylistActivity) awS41S2100000_18.l2);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.a0i);
            c1389890mGx.LJIIIZ(2131850544);
            c1389890mGx.LJIIJJI();
            int i = ((CreatePlaylistActivity) awS41S2100000_18.l2).LLILZIL;
            if (i == 1 || i == 2) {
                ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIJ((CreatePlaylistActivity) awS41S2100000_18.l2, "", null, "from_profile_mix_list", "create_playlist", manageResponse.mixId, awS41S2100000_18.s0, awS41S2100000_18.s1, true, null, "", null, "");
                IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
                String str = manageResponse.mixId;
                String str2 = awS41S2100000_18.s0;
                Aweme aweme = ((CreatePlaylistActivity) awS41S2100000_18.l2).LLJ;
                if (aweme != null && (video = aweme.getVideo()) != null) {
                    numValueOf = Integer.valueOf(video.getDuration());
                } else {
                    numValueOf = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((CreatePlaylistActivity) awS41S2100000_18.l2).LLILZLL);
                sbLIZ.append(System.currentTimeMillis());
                iMixFeedService.LJIILL("personal_homepage", str, null, str2, "create_playlist", null, numValueOf, String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode()), null, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        if (!(((C1169480gXS) obj).LL instanceof C1623706Xj)) {
            ((EditPlayListNameEditTextVM) awS41S2100000_18.l2).setStateImmediate(AFwS256S0000000_18.get$arr$(149));
            EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) awS41S2100000_18.l2;
            AbstractC19484711Kz<ManageResponse> abstractC19484711KzLJLI = ((InterfaceC1169460gXQ) editPlayListNameEditTextVM.LLILZIL.getValue().getOperator()).LJLI(awS41S2100000_18.s0, awS41S2100000_18.s1);
            EditPlayListNameEditTextVM editPlayListNameEditTextVM2 = (EditPlayListNameEditTextVM) awS41S2100000_18.l2;
            editPlayListNameEditTextVM.disposeOnClear(abstractC19484711KzLJLI.LJJIIZ(new AfS50S1100000_18(editPlayListNameEditTextVM2, awS41S2100000_18.s0, 2), new AfS187S0100000_18(editPlayListNameEditTextVM2, 18)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        C1200540hLY c1200540hLY = C1200540hLY.LIZ;
        Object value = ((PoiClaimFragment) awS41S2100000_18.l2).LLIZLLLIL.getValue();
        String str = awS41S2100000_18.s0;
        String str2 = awS41S2100000_18.s1;
        c1200540hLY.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (value == null) {
            value = "";
        }
        linkedHashMap.put("enter_from", value);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("popup_type", str2);
        C20684815ws.LJIILLIIL("ttls_merchants_claim_failure_popup_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        C1189380h3Y c1189380h3Y = (C1189380h3Y) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS41S2100000_18.s0);
        sbLIZ.append('~');
        sbLIZ.append(awS41S2100000_18.s1);
        c1189380h3Y.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1189380h3Y.LIZ = EnumC1184240gvG.IMAGE;
        c1189380h3Y.LIZJ = new AwS562S0100000_18((LsFlattenUIImage) awS41S2100000_18.l2, 1349);
        c1189380h3Y.LIZLLL = new AwS562S0100000_18((LsFlattenUIImage) awS41S2100000_18.l2, 1350);
        c1189380h3Y.LJ = Long.valueOf(System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        C1189380h3Y c1189380h3Y = (C1189380h3Y) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS41S2100000_18.s0);
        sbLIZ.append('~');
        sbLIZ.append(awS41S2100000_18.s1);
        c1189380h3Y.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1189380h3Y.LIZ = EnumC1184240gvG.IMAGE;
        c1189380h3Y.LIZJ = new AwS562S0100000_18((LsUIImage) awS41S2100000_18.l2, 1351);
        c1189380h3Y.LIZLLL = new AwS562S0100000_18((LsUIImage) awS41S2100000_18.l2, 1352);
        c1189380h3Y.LJ = Long.valueOf(System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        InterfaceC1173760geM interfaceC1173760geM = (InterfaceC1173760geM) obj;
        return ((BaseStoryArchiveV2FeedSharedViewModel) awS41S2100000_18.l2).BQ2(interfaceC1173760geM, interfaceC1173760geM.getListState(), awS41S2100000_18.s0, awS41S2100000_18.s1, interfaceC1173760geM.LJIILL(), interfaceC1173760geM.LJIILLIIL());
    }

    public static final Object invoke$8(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        InterfaceC1173760geM interfaceC1173760geM = (InterfaceC1173760geM) obj;
        return ((BaseStoryArchiveV2FeedSharedViewModel) awS41S2100000_18.l2).BQ2(interfaceC1173760geM, interfaceC1173760geM.getListState(), interfaceC1173760geM.LIZJ(), interfaceC1173760geM.LJIIIZ(), awS41S2100000_18.s0, awS41S2100000_18.s1);
    }

    public static final Object invoke$9(AwS41S2100000_18 awS41S2100000_18, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doCreateTemplateViews biz is :");
        sbLIZ.append(((C21326718d7) awS41S2100000_18.l2).LIZIZ);
        sbLIZ.append(" urlNotNull is：");
        sbLIZ.append(awS41S2100000_18.s0);
        sbLIZ.append(" nameNotNull is:");
        sbLIZ.append(awS41S2100000_18.s1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(C1195400hDG c1195400hDG, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1195400hDG;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(C21326718d7 c21326718d7, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c21326718d7;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(CreatePlaylistActivity createPlaylistActivity, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = createPlaylistActivity;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = editPlayListNameEditTextVM;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(PoiClaimFragment poiClaimFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = poiClaimFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S2100000_18(BaseStoryArchiveV2FeedSharedViewModel baseStoryArchiveV2FeedSharedViewModel, BaseStoryArchiveV2FeedSharedViewModel<InterfaceC1173760geM<Object, Object>, InterfaceC1891350zJl> baseStoryArchiveV2FeedSharedViewModel2, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = baseStoryArchiveV2FeedSharedViewModel;
        this.s0 = baseStoryArchiveV2FeedSharedViewModel2;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(String str, String str2, LsFlattenUIImage lsFlattenUIImage, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = lsFlattenUIImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S2100000_18(String str, String str2, LsUIImage lsUIImage, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = lsUIImage;
    }
}
