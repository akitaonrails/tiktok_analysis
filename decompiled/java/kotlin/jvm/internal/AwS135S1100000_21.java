package kotlin.jvm.internal;

import X.AbstractC1347290lAF;
import X.AbstractC848400XPy;
import X.C09AY;
import X.C0HD9;
import X.C0XQ7;
import X.C1075920e6Y;
import X.C11FQ;
import X.C123100dR;
import X.C1340640kzW;
import X.C1341800l1O;
import X.C1342030l1l;
import X.C1344030l4z;
import X.C1344210l5H;
import X.C1346950l9h;
import X.C1347090l9v;
import X.C1347100l9w;
import X.C1347110l9x;
import X.C1347430lAT;
import X.C1350920lG6;
import X.C1354660lM8;
import X.C1355450lNP;
import X.C1356820lPc;
import X.C1357140lQ8;
import X.C1357350lQT;
import X.C1357370lQV;
import X.C1362520lYo;
import X.C1374720lsU;
import X.C1383110m61;
import X.C1395560mQ6;
import X.C1396140mR2;
import X.C1396190mR7;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C13LP;
import X.C14MJ;
import X.C15O7;
import X.C1624790sNp;
import X.C1624800sNq;
import X.C1697810uHb;
import X.C201955140j;
import X.C20271614Tq;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C291001Au;
import X.C786410Ut5;
import X.InterfaceC1381130m2p;
import X.InterfaceC1891350zJl;
import Y.ACListenerS59S1200000_21;
import Y.ACallableS416S0100000_9;
import android.content.Context;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelShareToStoryPowerCell;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.now.interaction.api.CommentDeleteState;
import com.ss.android.ugc.now.interaction.api.CommentLatestState;
import com.ss.android.ugc.now.interaction.api.CommentPublishState;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.api.LikeState;
import com.ss.android.ugc.tools.data.ImageItem;
import com.ss.android.ugc.tools.data.MediaPayload;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS135S1100000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        C1342030l1l c1342030l1l = (C1342030l1l) obj;
        return C1342030l1l.LIZ(c1342030l1l, C2097608Jq.LJIIIZ(awS135S1100000_21.s0, c1342030l1l.LL), null, null, null, null, null, null, null, new C291001Au((C1075920e6Y) awS135S1100000_21.l1), 254);
    }

    public static final Object invoke$1(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        C1342030l1l c1342030l1l = (C1342030l1l) obj;
        return C1342030l1l.LIZ(c1342030l1l, C2097608Jq.LJIILIIL(c1342030l1l.LL, new Pair(awS135S1100000_21.s0, (PollInfo) awS135S1100000_21.l1)), null, null, null, null, null, null, null, null, 510);
    }

    public static final Object invoke$10(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        String uid;
        User curUser;
        C11FQ c11fq = new C11FQ((Context) awS135S1100000_21.l1, null, 6, 0);
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
            uid = curUser.getUid();
        } else {
            uid = "";
        }
        String str = awS135S1100000_21.s0;
        if (str == null) {
            str = "personal_homepage";
        }
        c11fq.LJI(4, uid, str);
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
        if (iUgCommonService != null && iUgCommonService.LJIIIZ() != null) {
            C14MJ.LJIIIZ(c11fq, "qr_code_default_view");
        }
        C1383110m61.LIZIZ = new WeakReference<>(c11fq);
        return c11fq;
    }

    public static final Object invoke$11(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        InteractionSyncViewModelState interactionSyncViewModelState = (InteractionSyncViewModelState) obj;
        CommentDeleteState commentDeleteState = new CommentDeleteState((Comment) awS135S1100000_21.l1, awS135S1100000_21.s0);
        LikeState likeState = interactionSyncViewModelState.likeState;
        interactionSyncViewModelState.getClass();
        return interactionSyncViewModelState.copy(likeState, null, interactionSyncViewModelState.commentCountState, interactionSyncViewModelState.commentPublishState, commentDeleteState, interactionSyncViewModelState.commentLatestState, interactionSyncViewModelState.user, interactionSyncViewModelState.activePost);
    }

    public static final Object invoke$12(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        InteractionSyncViewModelState interactionSyncViewModelState = (InteractionSyncViewModelState) obj;
        CommentPublishState commentPublishState = new CommentPublishState((Comment) awS135S1100000_21.l1, awS135S1100000_21.s0);
        LikeState likeState = interactionSyncViewModelState.likeState;
        interactionSyncViewModelState.getClass();
        return interactionSyncViewModelState.copy(likeState, null, interactionSyncViewModelState.commentCountState, commentPublishState, interactionSyncViewModelState.commentDeleteState, interactionSyncViewModelState.commentLatestState, interactionSyncViewModelState.user, interactionSyncViewModelState.activePost);
    }

    public static final Object invoke$13(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        InteractionSyncViewModelState interactionSyncViewModelState = (InteractionSyncViewModelState) obj;
        C291001Au<CommentLatestState> c291001Au = new C291001Au<>(new CommentLatestState((Comment) awS135S1100000_21.l1, awS135S1100000_21.s0));
        LikeState likeState = interactionSyncViewModelState.likeState;
        interactionSyncViewModelState.getClass();
        return interactionSyncViewModelState.copy(likeState, null, interactionSyncViewModelState.commentCountState, interactionSyncViewModelState.commentPublishState, interactionSyncViewModelState.commentDeleteState, c291001Au, interactionSyncViewModelState.user, interactionSyncViewModelState.activePost);
    }

    public static final Object invoke$14(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        InterfaceC1381130m2p interfaceC1381130m2p = (InterfaceC1381130m2p) obj;
        interfaceC1381130m2p.LJIIJJI("mini_game");
        interfaceC1381130m2p.LJIIJ(awS135S1100000_21.s0);
        interfaceC1381130m2p.LJIIIIZZ("1");
        interfaceC1381130m2p.LJIIL(C2097608Jq.LJI(new Pair("enter_from", "mini_game"), new Pair("enter_method", "minis_report")));
        interfaceC1381130m2p.setExtra(C2097608Jq.LJI(new Pair("client_key", ((C1395560mQ6) awS135S1100000_21.l1).LIZIZ)));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        List<PhotoModeImageUrlModel> imageList;
        ImageItem imageItemLJIIIZ;
        C1356820lPc c1356820lPc = (C1356820lPc) obj;
        c1356820lPc.getClass();
        Aweme aweme = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        c1356820lPc.LIZIZ = aweme;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            String str = awS135S1100000_21.s0;
            int i = 0;
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                int i2 = i + 1;
                if (i >= 0) {
                    PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                    if (i == 0) {
                        imageItemLJIIIZ = C1354660lM8.LJIIIZ(photoModeImageUrlModel2, str);
                    } else {
                        imageItemLJIIIZ = C1354660lM8.LJIIIZ(photoModeImageUrlModel2, null);
                    }
                    if (imageItemLJIIIZ != null) {
                        ((ArrayList) c1356820lPc.LIZ).add(imageItemLJIIIZ);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        long duration;
        int width;
        Video video;
        Video video2;
        Video video3;
        Video video4;
        VideoUrlModel playAddr;
        String strLJII;
        UrlModel urlModelLJ;
        List<String> urlList;
        C1357370lQV c1357370lQV = (C1357370lQV) obj;
        Aweme aweme = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        c1357370lQV.LIZ = aweme;
        String str = awS135S1100000_21.s0;
        String str2 = "";
        if (str == null && ((urlModelLJ = C1354660lM8.LJ(aweme)) == null || (urlList = urlModelLJ.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null)) {
            str = "";
        }
        c1357370lQV.LIZIZ = str;
        Aweme aweme2 = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        if (aweme2 != null && (video4 = aweme2.getVideo()) != null && (playAddr = video4.getPlayAddr()) != null && (strLJII = C1374720lsU.LJII(playAddr)) != null) {
            str2 = strLJII;
        }
        c1357370lQV.LIZJ = str2;
        Aweme aweme3 = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        if (aweme3 != null && (video3 = aweme3.getVideo()) != null) {
            duration = video3.getDuration();
        } else {
            duration = 0;
        }
        c1357370lQV.LJ = duration;
        Aweme aweme4 = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        int height = 0;
        if (aweme4 != null && (video2 = aweme4.getVideo()) != null) {
            width = video2.getWidth();
        } else {
            width = 0;
        }
        c1357370lQV.LJFF = width;
        Aweme aweme5 = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        if (aweme5 != null && (video = aweme5.getVideo()) != null) {
            height = video.getHeight();
        }
        c1357370lQV.LJI = height;
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        boolean z;
        C1357350lQT c1357350lQT = (C1357350lQT) obj;
        String str = C1357140lQ8.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enAIChatPageConfig -> payload -> aweme is null: ");
        if (((C1347430lAT) awS135S1100000_21.l1).LIZ == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Aweme aweme = ((C1347430lAT) awS135S1100000_21.l1).LIZ;
        if (aweme != null && C1354660lM8.LJIIJ(aweme)) {
            c1357350lQT.LIZIZ(new AwS135S1100000_21((C1347430lAT) awS135S1100000_21.l1, awS135S1100000_21.s0, 15));
        } else {
            AwS135S1100000_21 awS135S1100000_212 = new AwS135S1100000_21((C1347430lAT) awS135S1100000_21.l1, awS135S1100000_21.s0, 16);
            List<MediaPayload> list = c1357350lQT.LIZIZ;
            C1357370lQV c1357370lQV = new C1357370lQV();
            awS135S1100000_212.invoke(c1357370lQV);
            if (!a0.LJJJIL(c1357370lQV.LIZIZ)) {
                if (!a0.LJJJIL(c1357370lQV.LIZJ)) {
                    ((ArrayList) list).add(new MediaPayload.VideoCover(c1357370lQV.LIZ, c1357370lQV.LIZIZ, 0, 0, c1357370lQV.LIZJ, c1357370lQV.LIZLLL, c1357370lQV.LJ, c1357370lQV.LJFF, c1357370lQV.LJI, UUID.randomUUID().toString()));
                } else {
                    "video url is required".toString();
                    throw new IllegalArgumentException("video url is required");
                }
            } else {
                "cover url is required".toString();
                throw new IllegalArgumentException("cover url is required");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        int bindingAdapterPosition = ((C1362520lYo) awS135S1100000_21.l1).getBindingAdapterPosition() + 1;
        return C20271614Tq.LIZ((C20271614Tq) obj, ((C1362520lYo) awS135S1100000_21.l1).LL.LJIIL(), awS135S1100000_21.s0, bindingAdapterPosition, "dm", ((C1362520lYo) awS135S1100000_21.l1).LLIZLLLIL, 0, 522605);
    }

    public static final Object invoke$19(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        CommentKeyboardModel keyboardModel;
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        CommentContextSource commentContextSourceBQ2 = ((KeyboardVMV2) awS135S1100000_21.l1).BQ2();
        if (commentContextSourceBQ2 != null && (keyboardModel = commentContextSourceBQ2.getKeyboardModel()) != null) {
            keyboardModel.setClickFrom(awS135S1100000_21.s0);
        }
        AbstractC1347290lAF abstractC1347290lAF = c1346950l9h.LL;
        C1347090l9v c1347090l9v = C1347090l9v.LIZ;
        if (Intrinsics.LJFF(abstractC1347290lAF, c1347090l9v)) {
            ((KeyboardVMV2) awS135S1100000_21.l1).SQ2(C1347110l9x.LIZ, false);
        } else {
            ((KeyboardVMV2) awS135S1100000_21.l1).SQ2(c1347090l9v, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        return new ACListenerS59S1200000_21((BaseCommentCell) awS135S1100000_21.l1, awS135S1100000_21.s0, (C0HD9) obj, 0);
    }

    public static final Object invoke$20(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        String strEnterFrom;
        String aid;
        Aweme aweme;
        Aweme aweme2;
        if (Intrinsics.LJFF(((C1346950l9h) obj).LL, C1347100l9w.LIZ)) {
            KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) awS135S1100000_21.l1;
            C1347110l9x c1347110l9x = C1347110l9x.LIZ;
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            keyboardVMV2.SQ2(c1347110l9x, false);
        } else {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            CommentContextSource commentContextSourceBQ2 = ((KeyboardVMV2) awS135S1100000_21.l1).BQ2();
            String authorUid = null;
            if (commentContextSourceBQ2 != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBQ2);
            } else {
                strEnterFrom = null;
            }
            CommentContextSource commentContextSourceBQ22 = ((KeyboardVMV2) awS135S1100000_21.l1).BQ2();
            if (commentContextSourceBQ22 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceBQ22)) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            CommentContextSource commentContextSourceBQ23 = ((KeyboardVMV2) awS135S1100000_21.l1).BQ2();
            if (commentContextSourceBQ23 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceBQ23)) != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            }
            String str = awS135S1100000_21.s0;
            c1350920lG6.getClass();
            C1350920lG6.LJIJJLI(strEnterFrom, aid, authorUid, str);
            ((KeyboardVMV2) awS135S1100000_21.l1).PQ2("click_gift_icon", awS135S1100000_21.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        ShareServiceImpl shareServiceImpl = (ShareServiceImpl) awS135S1100000_21.l1;
        String str = awS135S1100000_21.s0;
        shareServiceImpl.getClass();
        ShareServiceImpl.LIZLLL("stay", str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI2;
        C1344030l4z.LIZJ("CommentSortListVM", "remove comment intention cell");
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI3 = ((C1344210l5H) awS135S1100000_21.l1).LJI();
        if (c20600815jKLJI3 != null) {
            String str = awS135S1100000_21.s0;
            C1344210l5H c1344210l5H = (C1344210l5H) awS135S1100000_21.l1;
            for (InterfaceC1891350zJl interfaceC1891350zJl : new ArrayList(c20600815jKLJI3.LJII())) {
                if (C123100dR.LIZ(str)) {
                    if ((interfaceC1891350zJl instanceof C1340640kzW) && Intrinsics.LJFF(str, ((C1340640kzW) interfaceC1891350zJl).LLILZ) && (c20600815jKLJI = c1344210l5H.LJI()) != null) {
                        C20600815jK.LJIIL(c20600815jKLJI, interfaceC1891350zJl);
                    }
                } else if ((interfaceC1891350zJl instanceof C1340640kzW) && (c20600815jKLJI2 = c1344210l5H.LJI()) != null) {
                    C20600815jK.LJIIL(c20600815jKLJI2, interfaceC1891350zJl);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        C1396140mR2 c1396140mR2 = (C1396140mR2) obj;
        c1396140mR2.LIZ = false;
        c1396140mR2.LIZIZ = new AwS135S1100000_21((C1396190mR7) awS135S1100000_21.l1, awS135S1100000_21.s0, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS135S1100000_21 awS135S1100000_21, Object obj) throws JSONException {
        User user = (User) C13LP.LJJJJZI((List) obj);
        C1396190mR7 c1396190mR7 = (C1396190mR7) awS135S1100000_21.l1;
        C1624790sNp c1624790sNp = (C1624790sNp) c1396190mR7.LLILZIL.getValue(c1396190mR7, C1396190mR7.LLIZ[1]);
        c1624790sNp.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sec_uid", user.getSecUid());
        jSONObject.put("uid", user.getUid());
        ((C1624800sNq) c1624790sNp.LJIIIZ.getValue()).LIZ(16385, 3L, 0L, C786410Ut5.J3(jSONObject));
        C1396190mR7 c1396190mR72 = (C1396190mR7) awS135S1100000_21.l1;
        String str = awS135S1100000_21.s0;
        c1396190mR72.getClass();
        AwS136S1200000_21 awS136S1200000_21 = new AwS136S1200000_21(user, c1396190mR72, str, 4);
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS136S1200000_21.invoke();
        } else {
            C15O7.LIZJ(new ACallableS416S0100000_9(awS136S1200000_21, 6));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIJ(((C1355450lNP) awS135S1100000_21.l1).LIZIZ, UriProtector.parse(awS135S1100000_21.s0));
        ((C1355450lNP) awS135S1100000_21.l1).LJ("click_contact_us");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131858226, new AwS135S1100000_21((C1355450lNP) awS135S1100000_21.l1, awS135S1100000_21.s0, 7));
        c1397620mTQ.LJII(2131851998, new AwS600S0100000_21((C1355450lNP) awS135S1100000_21.l1, 229));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS135S1100000_21 awS135S1100000_21, Object obj) {
        return C20271614Tq.LIZ((C20271614Tq) obj, awS135S1100000_21.s0, "click_share_button", ((SharePanelShareToStoryPowerCell) awS135S1100000_21.l1).getBindingAdapterPosition() + 1, "dm", ((SharePanelShareToStoryPowerCell) awS135S1100000_21.l1).LLIZLLLIL, 0, 522605);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(C1344210l5H c1344210l5H, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1344210l5H;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(C1347430lAT c1347430lAT, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1347430lAT;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(C1355450lNP c1355450lNP, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1355450lNP;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(C1362520lYo c1362520lYo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1362520lYo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(C1395560mQ6 c1395560mQ6, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1395560mQ6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(C1396190mR7 c1396190mR7, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1396190mR7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(KeyboardVMV2 keyboardVMV2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = keyboardVMV2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(Comment comment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = comment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(PollInfo pollInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = pollInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S1100000_21(BaseCommentCell baseCommentCell, BaseCommentCell<T> baseCommentCell2, String str) {
        super(1);
        this.$t = str;
        this.l1 = baseCommentCell;
        this.s0 = baseCommentCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(ShareServiceImpl shareServiceImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = shareServiceImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(SharePanelShareToStoryPowerCell sharePanelShareToStoryPowerCell, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = sharePanelShareToStoryPowerCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1100000_21(String str, C1075920e6Y c1075920e6Y, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1075920e6Y;
    }
}
