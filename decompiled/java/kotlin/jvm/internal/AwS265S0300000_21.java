package kotlin.jvm.internal;

import X.AbstractC1365570ldj;
import X.AbstractC1376190lur;
import X.C013C;
import X.C09AY;
import X.C0ZDN;
import X.C1022820ciu;
import X.C118300cf;
import X.C1196320hEk;
import X.C11FQ;
import X.C1247120iYg;
import X.C1247690iZb;
import X.C1260960iv0;
import X.C1264800j1C;
import X.C1340400kz8;
import X.C1342200l22;
import X.C1345760l7m;
import X.C1346300l8e;
import X.C1348480lCA;
import X.C1350340lFA;
import X.C1350630lFd;
import X.C1350780lFs;
import X.C1350920lG6;
import X.C1351190lGX;
import X.C1361600lXK;
import X.C1362370lYZ;
import X.C1362450lYh;
import X.C1362460lYi;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1371740lng;
import X.C1373290lqB;
import X.C1375700lu4;
import X.C1376210lut;
import X.C1377850lxX;
import X.C1379140lzc;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1390380mHk;
import X.C1396190mR7;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1664750tQH;
import X.C1908200zkw;
import X.C19209910Dh;
import X.C19EG;
import X.C20590015ha;
import X.C20590915hj;
import X.C2097608Jq;
import X.C2108208Ns;
import X.C2184171Adz;
import X.C2250431D6j;
import X.C2250441D6k;
import X.C2296808zG;
import X.C23250099c;
import X.C2344809Gs;
import X.C2393909Zp;
import X.C2487409ou;
import X.C294970BhH;
import X.C453940Hr6;
import X.C723850SaN;
import X.C737310Sw5;
import X.C894700Z8a;
import X.C896040ZDe;
import X.EnumC1260920iuw;
import X.EnumC1342450l2R;
import X.EnumC1393270mMP;
import X.EnumC1620106Vz;
import X.EnumC1908370zlD;
import X.EnumC896030ZDd;
import X.EnumC896240ZDy;
import X.EnumC896490ZEx;
import X.ExecutorC1592406Li;
import X.InterfaceC1346260l8a;
import X.InterfaceC1351220lGa;
import X.InterfaceC1369790lkX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS27S0201000_21;
import Y.ARunnableS54S0300000_21;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.ss.android.ugc.aweme.comment.longpresspanel.repo.CommentLongPressRepository;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelBulletinBoardPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelHeadPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelShareToStoryPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelUpvotePowerCell;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS265S0300000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS265S0300000_21 awS265S0300000_21) {
        View view = (View) awS265S0300000_21.l0;
        HandlerHook.viewPost(view, new ARunnableS54S0300000_21((C20590015ha) awS265S0300000_21.l2, (C20590915hj) awS265S0300000_21.l1, view, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS265S0300000_21 awS265S0300000_21) {
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l0;
        if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.LJIILL();
        }
        if (C294970BhH.LIZ()) {
            C1389880mGw c1389880mGw = new C1389880mGw((CommentLongPressFragment) awS265S0300000_21.l1);
            c1389880mGw.LJIIIZ(((Context) awS265S0300000_21.l2).getString(2131834430));
            c1389880mGw.LIZ(true);
            c1389880mGw.LJIIJ();
            Context context = ((CommentLongPressFragment) awS265S0300000_21.l1).getContext();
            if (context != null) {
                new C0ZDN(context).LIZ(2);
                String str = CommentLongPressFragment._pnsPageId;
                C2393909Zp.LIZ((Context) awS265S0300000_21.l2);
            }
        } else {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) awS265S0300000_21.l2);
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ(((Context) awS265S0300000_21.l2).getString(2131834430));
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS265S0300000_21 awS265S0300000_21) {
        int i;
        String value;
        String string;
        EnumC896490ZEx enumC896490ZEx;
        EnumC896030ZDd enumC896030ZDd;
        C1908200zkw c1908200zkw = (C1908200zkw) awS265S0300000_21.l0;
        if (c1908200zkw != null && (enumC896030ZDd = c1908200zkw.LIZLLL) != null) {
            i = C896040ZDe.LIZ[enumC896030ZDd.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2) {
                value = EnumC1908370zlD.LIKE_NOTIFICATION_SUBPAGE.getValue();
            } else {
                value = EnumC1908370zlD.REPOST_NOTIFICATION_SUBPAGE.getValue();
            }
        } else {
            value = EnumC1908370zlD.FAVOURITE_NOTIFICATION_SUBPAGE.getValue();
        }
        String value2 = EnumC1908370zlD.LIKE_NOTIFICATION_SUBPAGE.getValue();
        String type = EnumC1260920iuw.RELATION_LABEL.getType();
        if (!C1264800j1C.LIZIZ()) {
            type = null;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("event_type", EnumC896240ZDy.CLICK.getValue());
        C894700Z8a c894700Z8a = (C894700Z8a) awS265S0300000_21.l1;
        if (c894700Z8a == null || (enumC896490ZEx = c894700Z8a.LIZIZ) == null || (string = Integer.valueOf(enumC896490ZEx.getValue()).toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("active_status", string);
        return new C1260960iv0("notification_page", (User) awS265S0300000_21.l2, value, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, "like_list", type, (String) null, (String) null, value2, (String) null, (String) null, (String) null, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, C2097608Jq.LJIIIIZZ(pairArr), (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, (String) null, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -9736, -2049, 16383);
    }

    public static final Object invoke$11(AwS265S0300000_21 awS265S0300000_21) {
        C1375700lu4.LIZ((Context) awS265S0300000_21.l0, (View) awS265S0300000_21.l1, (C11FQ) awS265S0300000_21.l2, true, false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS265S0300000_21 awS265S0300000_21) {
        ICommentCareModeService.LIZ.getClass();
        C1342200l22.LIZ().LIZIZ(((Fragment) awS265S0300000_21.l0).getActivity(), CommentContextSourceKt.aweme((CommentContextSource) awS265S0300000_21.l1), ((C1340400kz8) awS265S0300000_21.l2).LIZ(), EnumC1620106Vz.COMMENT_DELETE_PUSH);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS265S0300000_21 awS265S0300000_21) {
        int i;
        String shortId;
        C1396190mR7 c1396190mR7 = (C1396190mR7) awS265S0300000_21.l0;
        C1664750tQH c1664750tQH = c1396190mR7.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1396190mR7.LLIZ;
        Context context = (Context) c1664750tQH.getValue(c1396190mR7, interfaceC2217461BqaArr[0]);
        if (((C013C) awS265S0300000_21.l1).element) {
            i = 2131848048;
        } else {
            i = 2131848052;
        }
        Object[] objArr = new Object[1];
        User user = (User) awS265S0300000_21.l2;
        String uniqueId = user.getUniqueId();
        if (uniqueId != null && uniqueId.length() != 0) {
            shortId = user.getUniqueId();
        } else {
            shortId = user.getShortId();
        }
        objArr[0] = shortId;
        String string = context.getString(i, objArr);
        C1396190mR7 c1396190mR72 = (C1396190mR7) awS265S0300000_21.l0;
        Activity activity = (Activity) c1396190mR72.LLILZ.getValue(c1396190mR72, interfaceC2217461BqaArr[0]);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C1390380mHk.LIZ(activity, 3040, creativeToastBuilder);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS265S0300000_21 awS265S0300000_21) {
        IContactActionAbility iContactActionAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ((SharePanelBulletinBoardPowerCell) awS265S0300000_21.l0);
        if (interfaceC665370Q7zLIZ != null && (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) != null) {
            iContactActionAbility.fK0((View) awS265S0300000_21.l1, (C1362450lYh) awS265S0300000_21.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS265S0300000_21 awS265S0300000_21) {
        IContactActionAbility iContactActionAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ((SharePanelHeadPowerCell) awS265S0300000_21.l0);
        if (interfaceC665370Q7zLIZ != null && (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) != null) {
            iContactActionAbility.fK0((View) awS265S0300000_21.l1, (C1362370lYZ) awS265S0300000_21.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS265S0300000_21 awS265S0300000_21) {
        IContactActionAbility iContactActionAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ((SharePanelShareToStoryPowerCell) awS265S0300000_21.l0);
        if (interfaceC665370Q7zLIZ != null && (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) != null) {
            iContactActionAbility.fK0((View) awS265S0300000_21.l1, (C1362460lYi) awS265S0300000_21.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS265S0300000_21 awS265S0300000_21) {
        IContactActionAbility iContactActionAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ((SharePanelUpvotePowerCell) awS265S0300000_21.l0);
        if (interfaceC665370Q7zLIZ != null && (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) != null) {
            iContactActionAbility.fK0((View) awS265S0300000_21.l1, (C1361600lXK) awS265S0300000_21.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS265S0300000_21 awS265S0300000_21) {
        ((AbstractC1365570ldj) awS265S0300000_21.l0).LIZ((InterfaceC1369790lkX) awS265S0300000_21.l1, (View) awS265S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS265S0300000_21 awS265S0300000_21) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C19209910Dh((C1377850lxX) awS265S0300000_21.l0, (Context) awS265S0300000_21.l1, (Activity) awS265S0300000_21.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS265S0300000_21 awS265S0300000_21) {
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l0;
        if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.LJII(CommentVideoModel.Type.COMMENT, (Comment) awS265S0300000_21.l1);
        }
        String str = CommentLongPressFragment._pnsPageId;
        C2393909Zp.LIZ((Context) awS265S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS265S0300000_21 awS265S0300000_21) {
        EnumC1342450l2R currSortType;
        EnumC1342450l2R enumC1342450l2R = (EnumC1342450l2R) awS265S0300000_21.l0;
        EnumC1342450l2R enumC1342450l2R2 = EnumC1342450l2R.CREATOR_SORT;
        if (enumC1342450l2R != enumC1342450l2R2) {
            CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l1;
            if (commentContextSource != null) {
                currSortType = commentContextSource.getCurrSortType();
            } else {
                currSortType = null;
            }
            C1350920lG6.LJJLL("comment_section_sort_change", commentContextSource, currSortType, enumC1342450l2R2);
        }
        ((Function1) awS265S0300000_21.l2).invoke(enumC1342450l2R2);
        return Boolean.TRUE;
    }

    public static final Object invoke$21(AwS265S0300000_21 awS265S0300000_21) {
        EnumC1342450l2R currSortType;
        EnumC1342450l2R enumC1342450l2R = (EnumC1342450l2R) awS265S0300000_21.l0;
        EnumC1342450l2R enumC1342450l2R2 = EnumC1342450l2R.MEDIA_SORT;
        if (enumC1342450l2R != enumC1342450l2R2) {
            CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l1;
            if (commentContextSource != null) {
                currSortType = commentContextSource.getCurrSortType();
            } else {
                currSortType = null;
            }
            C1350920lG6.LJJLL("comment_section_sort_change", commentContextSource, currSortType, enumC1342450l2R2);
        }
        ((Function1) awS265S0300000_21.l2).invoke(enumC1342450l2R2);
        return Boolean.TRUE;
    }

    public static final Object invoke$22(AwS265S0300000_21 awS265S0300000_21) {
        EnumC1342450l2R currSortType;
        EnumC1342450l2R enumC1342450l2R = (EnumC1342450l2R) awS265S0300000_21.l0;
        EnumC1342450l2R enumC1342450l2R2 = EnumC1342450l2R.DEFAULT_SORT;
        if (enumC1342450l2R != enumC1342450l2R2) {
            CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l1;
            if (commentContextSource != null) {
                currSortType = commentContextSource.getCurrSortType();
            } else {
                currSortType = null;
            }
            C1350920lG6.LJJLL("comment_section_sort_change", commentContextSource, currSortType, enumC1342450l2R2);
        }
        ((Function1) awS265S0300000_21.l2).invoke(enumC1342450l2R2);
        return Boolean.TRUE;
    }

    public static final Object invoke$23(AwS265S0300000_21 awS265S0300000_21) {
        EnumC1342450l2R currSortType;
        EnumC1342450l2R enumC1342450l2R = (EnumC1342450l2R) awS265S0300000_21.l0;
        EnumC1342450l2R enumC1342450l2R2 = EnumC1342450l2R.TIME_SORT;
        if (enumC1342450l2R != enumC1342450l2R2) {
            CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l1;
            if (commentContextSource != null) {
                currSortType = commentContextSource.getCurrSortType();
            } else {
                currSortType = null;
            }
            C1350920lG6.LJJLL("comment_section_sort_change", commentContextSource, currSortType, enumC1342450l2R2);
        }
        ((Function1) awS265S0300000_21.l2).invoke(enumC1342450l2R2);
        return Boolean.TRUE;
    }

    public static final Object invoke$24(AwS265S0300000_21 awS265S0300000_21) {
        String aid;
        String aid2;
        String aid3;
        InterfaceC1351220lGa interfaceC1351220lGaGp = ((VideoQuickCommentAssem) awS265S0300000_21.l0).Gp();
        Aweme aweme = (Aweme) awS265S0300000_21.l1;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        interfaceC1351220lGaGp.LIZ(aid, C1351190lGX.LIZ((C1351190lGX) awS265S0300000_21.l2, true, false, null, 6));
        InterfaceC1351220lGa interfaceC1351220lGaGp2 = ((VideoQuickCommentAssem) awS265S0300000_21.l0).Gp();
        Aweme commentInputAweme = ((VideoQuickCommentAssem) awS265S0300000_21.l0).getCommentInputAweme();
        if (commentInputAweme != null) {
            aid2 = commentInputAweme.getAid();
        } else {
            aid2 = null;
        }
        C1351190lGX c1351190lGX = interfaceC1351220lGaGp2.get(aid2);
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) awS265S0300000_21.l0;
        InterfaceC1351220lGa interfaceC1351220lGaGp3 = videoQuickCommentAssem.Gp();
        Aweme commentInputAweme2 = videoQuickCommentAssem.getCommentInputAweme();
        if (commentInputAweme2 != null) {
            aid3 = commentInputAweme2.getAid();
        } else {
            aid3 = null;
        }
        interfaceC1351220lGaGp3.LIZ(aid3, C1351190lGX.LIZ(c1351190lGX, true, false, null, 6));
        ((VideoQuickCommentAssem) awS265S0300000_21.l0).iq();
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS265S0300000_21 awS265S0300000_21) {
        String str;
        String str2;
        String str3;
        Aweme firstAweme = ((LatestUnreadVideoInfo) awS265S0300000_21.l0).getFirstAweme();
        if (firstAweme != null) {
            MufUserCell mufUserCell = (MufUserCell) awS265S0300000_21.l1;
            C1247690iZb c1247690iZb = (C1247690iZb) awS265S0300000_21.l2;
            mufUserCell.getClass();
            mufUserCell.T5(c1247690iZb, EnumC1393270mMP.NEW_VIDEOS_LINK);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(mufUserCell.R5().getContext(), "//aweme/detail");
            MufPageTrackInfo mufPageTrackInfo = c1247690iZb.LLILLL;
            String str4 = null;
            if (mufPageTrackInfo != null) {
                str4 = mufPageTrackInfo.enterFrom;
            }
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            smartRouteBuildRoute.withParam("enter_from", str4);
            smartRouteBuildRoute.withParam("tab_name", "friends_list");
            smartRouteBuildRoute.withParam("video_from", "FRIEND_NEW_POST_DETAIL");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, firstAweme.getAid());
            smartRouteBuildRoute.withParam("userid", firstAweme.getAuthor().getUid());
            smartRouteBuildRoute.withParam("sec_userid", firstAweme.getAuthor().getSecUid());
            smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
            MufPageTrackInfo mufPageTrackInfo2 = c1247690iZb.LLILLL;
            if (mufPageTrackInfo2 == null || (str = mufPageTrackInfo2.enterFrom) == null) {
                str = "";
            }
            smartRouteBuildRoute.withParam("refer", str);
            MufPageTrackInfo mufPageTrackInfo3 = c1247690iZb.LLILLL;
            if (mufPageTrackInfo3 == null || (str2 = mufPageTrackInfo3.previousPage) == null) {
                str2 = "";
            }
            smartRouteBuildRoute.withParam("previous_page", str2);
            smartRouteBuildRoute.withParam("is_card", true);
            MufPageTrackInfo mufPageTrackInfo4 = c1247690iZb.LLILLL;
            if (mufPageTrackInfo4 != null && (str3 = mufPageTrackInfo4.enterFrom) != null) {
                str5 = str3;
            }
            smartRouteBuildRoute.withParam("follow_recommned_enter_from", str5);
            smartRouteBuildRoute.withParam("scene_type", EnumC1260920iuw.CARD.getType());
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS265S0300000_21 awS265S0300000_21) {
        C1379140lzc c1379140lzc = ((C1371740lng) awS265S0300000_21.l0).LJJIJIIJIL;
        if (c1379140lzc != null) {
            Aweme aweme = c1379140lzc.LIZIZ;
            C1373290lqB.LIZJ(new C737310Sw5(aweme, c1379140lzc.LJIIIIZZ), c1379140lzc.LJIILL, aweme.awemeACLShareInfo).LJJLIIIJILLIZJL((C19EG) awS265S0300000_21.l1, (AwemeSharePackage) awS265S0300000_21.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS265S0300000_21 awS265S0300000_21) {
        ShareDependService.LIZ.getClass();
        ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
        Activity activity = ((C1371740lng) awS265S0300000_21.l0).LIZ;
        C1371600lnS c1371600lnS = (C1371600lnS) awS265S0300000_21.l1;
        c1371600lnS.getClass();
        shareDependServiceLJJJJI.LJII(activity, new C1371590lnR(c1371600lnS), (Bundle) awS265S0300000_21.l2);
        if (AwemeExtKt.isAdTraffic(((C1371740lng) awS265S0300000_21.l0).LIZJ) && ComplianceServiceProvider.LJIILIIL().LJJJ(((C1371740lng) awS265S0300000_21.l0).LIZJ)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", ((C1371740lng) awS265S0300000_21.l0).LIZJ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("share_sign", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS265S0300000_21 awS265S0300000_21) {
        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
        if (((AbstractC1376190lur) awS265S0300000_21.l0).LJFF()) {
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
        }
        C2344809Gs.LIZLLL(4, "download-request-permission", "download permission is granted, start download.");
        ExecutorC1592406Li.LLILLJJLI.LIZ(500L, new ARunnableS54S0300000_21((Activity) awS265S0300000_21.l1, (AbstractC1376190lur) awS265S0300000_21.l0, (C1376210lut) awS265S0300000_21.l2, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS265S0300000_21 awS265S0300000_21) {
        if (C2250441D6k.LIZIZ((Aweme) awS265S0300000_21.l0)) {
            C2250431D6j c2250431D6j = C2250431D6j.LIZ;
            Aweme aweme = (Aweme) awS265S0300000_21.l0;
            RecyclerView recyclerView = (RecyclerView) awS265S0300000_21.l1;
            int i = ((C118300cf) awS265S0300000_21.l2).element;
            c2250431D6j.getClass();
            C2487409ou.LIZJ(new ARunnableS27S0201000_21(i, recyclerView, aweme, 11));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS265S0300000_21 awS265S0300000_21) {
        CommentLongPressRepository commentLongPressRepository = CommentLongPressRepository.LIZ;
        C1346300l8e c1346300l8e = (C1346300l8e) awS265S0300000_21.l0;
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l1;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) awS265S0300000_21.l2;
        commentLongPressRepository.getClass();
        CommentLongPressRepository.LIZIZ(c1346300l8e, interfaceC1346260l8a, commentLongPressFragment);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS265S0300000_21 awS265S0300000_21) {
        RefactorKeyboardPanelV2 refactorKeyboardPanelV2 = (RefactorKeyboardPanelV2) awS265S0300000_21.l0;
        C723850SaN.LIZLLL(refactorKeyboardPanelV2, new AwS230S0300000_21(refactorKeyboardPanelV2, (View) awS265S0300000_21.l1, (C013C) awS265S0300000_21.l2, 36));
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS265S0300000_21 awS265S0300000_21) {
        String strEnterFrom;
        C1350630lFd c1350630lFd = (C1350630lFd) awS265S0300000_21.l0;
        Aweme aweme = (Aweme) awS265S0300000_21.l1;
        CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l2;
        if (commentContextSource != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        } else {
            strEnterFrom = null;
        }
        c1350630lFd.getClass();
        C1350340lFA.LIZIZ(c1350630lFd, aweme, strEnterFrom);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS265S0300000_21 awS265S0300000_21) {
        String strEnterFrom;
        C1348480lCA c1348480lCA = (C1348480lCA) awS265S0300000_21.l0;
        Aweme aweme = (Aweme) awS265S0300000_21.l1;
        CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l2;
        if (commentContextSource != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        } else {
            strEnterFrom = null;
        }
        c1348480lCA.getClass();
        C1350340lFA.LIZIZ(c1348480lCA, aweme, strEnterFrom);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS265S0300000_21 awS265S0300000_21) {
        String strEnterFrom;
        C1350780lFs c1350780lFs = (C1350780lFs) awS265S0300000_21.l0;
        Aweme aweme = (Aweme) awS265S0300000_21.l1;
        CommentContextSource commentContextSource = (CommentContextSource) awS265S0300000_21.l2;
        if (commentContextSource != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        } else {
            strEnterFrom = null;
        }
        c1350780lFs.getClass();
        C1350340lFA.LIZIZ(c1350780lFs, aweme, strEnterFrom);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS265S0300000_21 awS265S0300000_21) {
        CommentLongPressRepository commentLongPressRepository = CommentLongPressRepository.LIZ;
        C1346300l8e c1346300l8e = (C1346300l8e) awS265S0300000_21.l0;
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l1;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) awS265S0300000_21.l2;
        commentLongPressRepository.getClass();
        CommentLongPressRepository.LIZIZ(c1346300l8e, interfaceC1346260l8a, commentLongPressFragment);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS265S0300000_21 awS265S0300000_21) {
        CommentLongPressRepository commentLongPressRepository = CommentLongPressRepository.LIZ;
        C1346300l8e c1346300l8e = (C1346300l8e) awS265S0300000_21.l0;
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l1;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) awS265S0300000_21.l2;
        commentLongPressRepository.getClass();
        CommentLongPressRepository.LIZ(c1346300l8e, interfaceC1346260l8a, commentLongPressFragment);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS265S0300000_21 awS265S0300000_21) {
        CommentLongPressRepository commentLongPressRepository = CommentLongPressRepository.LIZ;
        C1346300l8e c1346300l8e = (C1346300l8e) awS265S0300000_21.l0;
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l1;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) awS265S0300000_21.l2;
        commentLongPressRepository.getClass();
        CommentLongPressRepository.LIZ(c1346300l8e, interfaceC1346260l8a, commentLongPressFragment);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS265S0300000_21 awS265S0300000_21) {
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l0;
        if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.LJII(CommentVideoModel.Type.COMMENT, (Comment) awS265S0300000_21.l1);
        }
        String str = CommentLongPressFragment._pnsPageId;
        C2393909Zp.LIZ((Context) awS265S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS265S0300000_21 awS265S0300000_21) {
        InterfaceC1346260l8a interfaceC1346260l8a = (InterfaceC1346260l8a) awS265S0300000_21.l0;
        if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.LJIIJ();
        }
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL((CommentLongPressFragment) awS265S0300000_21.l1, C1558360qeg.LJFF((CommentLongPressFragment) awS265S0300000_21.l1, null));
        if (iCommentListAssemAbilityLIZLLL != null) {
            iCommentListAssemAbilityLIZLLL.xn2(Boolean.FALSE);
        }
        String str = CommentLongPressFragment._pnsPageId;
        C2393909Zp.LIZ((Context) awS265S0300000_21.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS265S0300000_21 awS265S0300000_21) {
        ICommentListVMAbility iCommentListVMAbilityLJ;
        String aid;
        Aweme aweme;
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) awS265S0300000_21.l0;
        InterfaceC665370Q7z interfaceC665370Q7z = commentPublishViewModel.LLILLJJLI;
        if (interfaceC665370Q7z != null && (iCommentListVMAbilityLJ = C1345760l7m.LJ(commentPublishViewModel.LLILLL, interfaceC665370Q7z)) != null) {
            Comment comment = (Comment) awS265S0300000_21.l1;
            CommentContextSource commentContextSourceYQ2 = ((CommentPublishViewModel) awS265S0300000_21.l0).yQ2();
            if (commentContextSourceYQ2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2)) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            iCommentListVMAbilityLJ.aX1(comment, aid, (Context) awS265S0300000_21.l2, 1, 0.0f, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(EnumC1342450l2R enumC1342450l2R, CommentContextSource commentContextSource, AwS600S0100000_21 awS600S0100000_21, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC1342450l2R;
        this.l1 = commentContextSource;
        this.l2 = awS600S0100000_21;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(InterfaceC1346260l8a interfaceC1346260l8a, CommentLongPressFragment commentLongPressFragment, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1346260l8a;
        this.l1 = commentLongPressFragment;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(InterfaceC1346260l8a interfaceC1346260l8a, Comment comment, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1346260l8a;
        this.l1 = comment;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1346300l8e c1346300l8e, InterfaceC1346260l8a interfaceC1346260l8a, CommentLongPressFragment commentLongPressFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1346300l8e;
        this.l1 = interfaceC1346260l8a;
        this.l2 = commentLongPressFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1348480lCA c1348480lCA, Aweme aweme, CommentContextSource commentContextSource, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1348480lCA;
        this.l1 = aweme;
        this.l2 = commentContextSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1350630lFd c1350630lFd, Aweme aweme, CommentContextSource commentContextSource, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1350630lFd;
        this.l1 = aweme;
        this.l2 = commentContextSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1350780lFs c1350780lFs, Aweme aweme, CommentContextSource commentContextSource, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1350780lFs;
        this.l1 = aweme;
        this.l2 = commentContextSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(AbstractC1365570ldj abstractC1365570ldj, InterfaceC1369790lkX interfaceC1369790lkX, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1365570ldj;
        this.l1 = interfaceC1369790lkX;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1371740lng c1371740lng, C1371600lnS c1371600lnS, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1371740lng;
        this.l1 = c1371600lnS;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1371740lng c1371740lng, C19EG c19eg, AwemeSharePackage awemeSharePackage, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1371740lng;
        this.l1 = c19eg;
        this.l2 = awemeSharePackage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1377850lxX c1377850lxX, Context context, Activity activity, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1377850lxX;
        this.l1 = context;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1396190mR7 c1396190mR7, C013C c013c, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1396190mR7;
        this.l1 = c013c;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(C1908200zkw c1908200zkw, C894700Z8a c894700Z8a, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1908200zkw;
        this.l1 = c894700Z8a;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(Activity activity, AbstractC1376190lur abstractC1376190lur, C1376210lut c1376210lut, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1376190lur;
        this.l1 = activity;
        this.l2 = c1376210lut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(Context context, View view, C11FQ c11fq, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = view;
        this.l2 = c11fq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(View view, C20590015ha c20590015ha, C20590915hj c20590915hj, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c20590915hj;
        this.l2 = c20590015ha;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(Fragment fragment, CommentContextSource commentContextSource, C1340400kz8 c1340400kz8, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = commentContextSource;
        this.l2 = c1340400kz8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(RefactorKeyboardPanelV2 refactorKeyboardPanelV2, View view, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.l0 = refactorKeyboardPanelV2;
        this.l1 = view;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(CommentPublishViewModel commentPublishViewModel, Comment comment, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = commentPublishViewModel;
        this.l1 = comment;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(VideoQuickCommentAssem videoQuickCommentAssem, Aweme aweme, C1351190lGX c1351190lGX, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoQuickCommentAssem;
        this.l1 = aweme;
        this.l2 = c1351190lGX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(Aweme aweme, RecyclerView recyclerView, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = recyclerView;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(SharePanelBulletinBoardPowerCell sharePanelBulletinBoardPowerCell, View view, C1362450lYh c1362450lYh, int i) {
        super(0);
        this.$t = i;
        this.l0 = sharePanelBulletinBoardPowerCell;
        this.l1 = view;
        this.l2 = c1362450lYh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(SharePanelHeadPowerCell sharePanelHeadPowerCell, View view, C1362370lYZ c1362370lYZ, int i) {
        super(0);
        this.$t = i;
        this.l0 = sharePanelHeadPowerCell;
        this.l1 = view;
        this.l2 = c1362370lYZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(SharePanelShareToStoryPowerCell sharePanelShareToStoryPowerCell, View view, C1362460lYi c1362460lYi, int i) {
        super(0);
        this.$t = i;
        this.l0 = sharePanelShareToStoryPowerCell;
        this.l1 = view;
        this.l2 = c1362460lYi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(SharePanelUpvotePowerCell sharePanelUpvotePowerCell, View view, C1361600lXK c1361600lXK, int i) {
        super(0);
        this.$t = i;
        this.l0 = sharePanelUpvotePowerCell;
        this.l1 = view;
        this.l2 = c1361600lXK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS265S0300000_21(LatestUnreadVideoInfo latestUnreadVideoInfo, MufUserCell mufUserCell, C1247690iZb c1247690iZb, int i) {
        super(0);
        this.$t = i;
        this.l0 = latestUnreadVideoInfo;
        this.l1 = mufUserCell;
        this.l2 = c1247690iZb;
    }
}
