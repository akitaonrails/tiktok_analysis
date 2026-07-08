package kotlin.jvm.internal;

import X.AbstractC19483511Kn;
import X.AbstractC848400XPy;
import X.C09AY;
import X.C0C64;
import X.C0DLC;
import X.C0LAB;
import X.C0TSK;
import X.C0XGR;
import X.C0XQ7;
import X.C0XZ4;
import X.C11IM;
import X.C11J8;
import X.C11KZ;
import X.C11RO;
import X.C1239250iLz;
import X.C1239400iME;
import X.C1323820kYO;
import X.C1348610lCN;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1548820qPI;
import X.C1701890uOB;
import X.C1701940uOG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C337180DJs;
import X.C397901gf;
import X.C729980SkG;
import X.EnumC1252150ign;
import X.InterfaceC1254030ijp;
import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.LoginFlowOptConfigSettings;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLoginFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel;
import com.tts.oecverify.BdTuring;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AwS168S1100000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS168S1100000_19 awS168S1100000_19) throws UnsupportedEncodingException {
        C1239400iME c1239400iME = C1239400iME.LIZ;
        String str = awS168S1100000_19.s0;
        c1239400iME.getClass();
        C1239400iME.LIZIZ("learn_more", str);
        String strEncode = URLEncoder.encode("https://support.tiktok.com/en/account-and-privacy/account-privacy-settings/suggested-accounts", "UTF-8");
        Context context = ((C0DLC) awS168S1100000_19.l1).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(strEncode);
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS168S1100000_19 awS168S1100000_19) {
        TuxTextView tuxTextView = ((IMNewSearchCommonCell) awS168S1100000_19.l1).LLILZLL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C337180DJs.LIZJ(tuxTextView);
        TuxTextView tuxTextView3 = ((IMNewSearchCommonCell) awS168S1100000_19.l1).LLILZLL;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        tuxTextView2.setText(awS168S1100000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS168S1100000_19 awS168S1100000_19) {
        return Boolean.valueOf(((StoryInboxCell) awS168S1100000_19.l1).C6(awS168S1100000_19.s0));
    }

    public static final Object invoke$11(AwS168S1100000_19 awS168S1100000_19) {
        return Boolean.valueOf(((StoryInboxCell) awS168S1100000_19.l1).C6(awS168S1100000_19.s0));
    }

    public static final Object invoke$12(AwS168S1100000_19 awS168S1100000_19) {
        ((SmsInputViewModel) awS168S1100000_19.l1).vQ2(awS168S1100000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS168S1100000_19 awS168S1100000_19) {
        ((SmsInputViewModel) awS168S1100000_19.l1).vQ2(awS168S1100000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS168S1100000_19 awS168S1100000_19) {
        ((SmsInputViewModel) awS168S1100000_19.l1).vQ2(awS168S1100000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS168S1100000_19 awS168S1100000_19) {
        TuxTextView tuxTextView = ((IMNewSearchCommonCell) awS168S1100000_19.l1).LLIZ;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C337180DJs.LIZJ(tuxTextView);
        TuxTextView tuxTextView3 = ((IMNewSearchCommonCell) awS168S1100000_19.l1).LLIZ;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        tuxTextView2.setText(awS168S1100000_19.s0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS168S1100000_19 awS168S1100000_19) {
        String str = awS168S1100000_19.s0;
        if (str != null) {
            ((Function1) awS168S1100000_19.l1).invoke(str);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS168S1100000_19 awS168S1100000_19) {
        boolean z = false;
        if (Intrinsics.LJFF(((AvailableWaysUserData) awS168S1100000_19.l1).has_pwd, Boolean.TRUE) && awS168S1100000_19.s0.length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS168S1100000_19 awS168S1100000_19) {
        return Boolean.valueOf(((StoryInboxCell) awS168S1100000_19.l1).C6(awS168S1100000_19.s0));
    }

    public static final Object invoke$6(AwS168S1100000_19 awS168S1100000_19) throws JSONException {
        String uid;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", awS168S1100000_19.s0);
        c0lab.LIZ(0, "role");
        User userIq = ((HeaderCTAFollowComponent) awS168S1100000_19.l1).iq();
        String uid2 = null;
        if (userIq != null) {
            uid = userIq.getUid();
        } else {
            uid = null;
        }
        c0lab.LJ("to_user_id", uid);
        C20684815ws.LJIILLIIL("block_confirm", c0lab.LIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        User userIq2 = ((HeaderCTAFollowComponent) awS168S1100000_19.l1).iq();
        if (userIq2 != null) {
            uid2 = userIq2.getUid();
        }
        jSONObject.put("uid", uid2);
        jSONObject.put("block_status", 1);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "parentBlockUserForTeen"));
        ((HeaderCTAFollowComponent) awS168S1100000_19.l1).qq().zQ2(EnumC1252150ign.PARENT_CAN_UNBLOCK_FOR_TEEN);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS168S1100000_19 awS168S1100000_19) {
        SchoolGroupsListViewModel schoolGroupsListViewModel = (SchoolGroupsListViewModel) awS168S1100000_19.l1;
        String str = awS168S1100000_19.s0;
        schoolGroupsListViewModel.getLogger().LIZ("SchoolGroupsListViewModel", "on dissolve group");
        schoolGroupsListViewModel.withState(new AwS133S1100000_19(schoolGroupsListViewModel, str, 17));
        schoolGroupsListViewModel.setState(new AwS33S0001000_19(-1, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS168S1100000_19 awS168S1100000_19) {
        final EmailLoginFragment emailLoginFragment = (EmailLoginFragment) awS168S1100000_19.l1;
        final String str = awS168S1100000_19.s0;
        C0XGR c0xgrPS = emailLoginFragment.PS();
        c0xgrPS.LIZLLL("platform", "username");
        c0xgrPS.LIZLLL("click", "continue");
        C20684815ws.LJIILLIIL("switch_to_password", c0xgrPS.LIZ);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_org_login_optimize", true, true)) {
            C0XZ4.LIZ.getClass();
            C11KZ c11kzLJ = AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XYv
                /* JADX WARN: Type inference failed for: r5v0, types: [X.0XGw, X.0XYt] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final C0XYD c0xyd = emailLoginFragment;
                    ?? r5 = new C0XH7<C0XT7<C850720XYw>>() { // from class: X.0XYt
                        @Override // X.C0XH7
                        public final void LJI(C0XGA c0xga) {
                            ((C11KY) c11ky).onSuccess(c0xga);
                        }

                        @Override // X.C0XH7
                        public final void LJ(C0XGA c0xga, int i) {
                            String str2;
                            C0XWW<C0XT7<C850720XYw>> c0xww = c11ky;
                            if (c0xga != null) {
                                str2 = c0xga.LJFF;
                            } else {
                                str2 = null;
                            }
                            ((C11KY) c0xww).onError(new C0XZJ(i, str2, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, "no data"));
                        }
                    };
                    emailLoginFragment.gk(r5);
                    Context contextRequireContext = emailLoginFragment.requireContext();
                    C850720XYw c850720XYw = new C850720XYw(str);
                    C846070XGz c846070XGz = new C846070XGz();
                    c846070XGz.LIZ = C0XH1.LIZ("/passport/user/login/pre_check/");
                    c846070XGz.LIZJ("username", C2093608Ic.LIZIZ(c850720XYw.LJI));
                    c846070XGz.LIZJ("mix_mode", "1");
                    new AbstractC845940XGm<C0XT7<C850720XYw>>(contextRequireContext, c846070XGz.LJFF(), c850720XYw, r5) { // from class: X.0XYu
                        public static final /* synthetic */ int LJIIIZ = 0;
                        public final C850720XYw LJIIIIZZ;

                        @Override // X.AbstractC845940XGm
                        public final void LJ(C0XGA c0xga) {
                            C0XG9.LIZIZ("passport_org_otp_login", "email", null, c0xga, null);
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                            C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                            this.LJIIIIZZ.LJ = jSONObject2;
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                            this.LJIIIIZZ.LJ = jSONObject;
                        }

                        @Override // X.AbstractC845940XGm
                        public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                            return new C0XT7(z, 10031, this.LJIIIIZZ);
                        }

                        {
                            this.LJIIIIZZ = c850720XYw;
                        }
                    }.LJIIIZ();
                }
            });
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            LoginFlowOptConfigSettings.LoginFlowOptConfigModel loginFlowOptConfigModel = LoginFlowOptConfigSettings.LIZ;
            LoginFlowOptConfigSettings.LoginFlowOptConfigModel loginFlowOptConfigModel2 = (LoginFlowOptConfigSettings.LoginFlowOptConfigModel) settingsManagerLIZLLL.LJIIIIZZ("login_flow_opt_config", LoginFlowOptConfigSettings.LoginFlowOptConfigModel.class, loginFlowOptConfigModel);
            if (loginFlowOptConfigModel2 != null) {
                loginFlowOptConfigModel = loginFlowOptConfigModel2;
            }
            long j = ((long) loginFlowOptConfigModel.loginPrecheckTimeout) * 1;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C11RO c11roLIZIZ = C1701940uOG.LIZIZ();
            C1701890uOB.LIZ(timeUnit, "unit is null");
            C1701890uOB.LIZ(c11roLIZIZ, "scheduler is null");
            C1239250iLz.LIZIZ(emailLoginFragment, emailLoginFragment, new C11J8(c11kzLJ, new C11IM(Math.max(0L, j), timeUnit, c11roLIZIZ), null).LJIIIIZZ(new AfS149S0200000_13(emailLoginFragment, emailLoginFragment, 7)).LJII(new AfS182S0100000_13(emailLoginFragment, 26))).LJIILL();
        } else {
            emailLoginFragment.VS(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS168S1100000_19 awS168S1100000_19) {
        long commentCount;
        C1348610lCN.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_comment_long_press_tooltip_first_show_prefix");
        sbLIZ.append(curUserId);
        C0TSK.LJFF(C2188811AlT.LIZIZ(sbLIZ), Boolean.TRUE);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Aweme aweme = (Aweme) awS168S1100000_19.l1;
        String str = awS168S1100000_19.s0;
        c1350920lG6.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String aid = aweme.getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (authorUid != null) {
            str2 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LIZJ(C729980SkG.LJIIIIZZ(aweme) ? 1 : 0, "is_video_author");
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        c2344009Gk.LIZLLL(commentCount, "visible_comment_cnt");
        c2344009Gk.LIZJ(C1351950lHl.LIZLLL(aweme.getAuthor()), "follow_status");
        C1350920lG6.LJJJ(c2344009Gk, "show_comment_icon_tooltip");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(SmsInputViewModel smsInputViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = smsInputViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(AvailableWaysUserData availableWaysUserData, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = availableWaysUserData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(EmailLoginFragment emailLoginFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = emailLoginFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(Aweme aweme, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(IMNewSearchCommonCell iMNewSearchCommonCell, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = iMNewSearchCommonCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(StoryInboxCell storyInboxCell, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = storyInboxCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(SchoolGroupsListViewModel schoolGroupsListViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = schoolGroupsListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(String str, C0DLC c0dlc, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0dlc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S1100000_19(String str, HeaderCTAFollowComponent headerCTAFollowComponent, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = headerCTAFollowComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS168S1100000_19(String str, String str2, Function1<? super String, Unit> function1) {
        super(0);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }
}
