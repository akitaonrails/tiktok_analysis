package com.ss.android.ugc.aweme.recommend.users;

import X.AbstractC426530Gnz;
import X.AbstractC848400XPy;
import X.C09JN;
import X.C0BLU;
import X.C0XQ7;
import X.C1072350e0n;
import X.C1072900e1g;
import X.C1073210e2B;
import X.C10EU;
import X.C11T3;
import X.C1217080hmE;
import X.C1239400iME;
import X.C1251130if9;
import X.C1264600j0s;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1390920mIc;
import X.C13IQ;
import X.C13LE;
import X.C1720106oR;
import X.C19259110Wf;
import X.C19EG;
import X.C1E7L;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2246021CvY;
import X.C2276131E7f;
import X.C2277881EDy;
import X.C296530Bjn;
import X.C444920HcY;
import X.C746350TPl;
import X.C786410Ut5;
import X.C816940W2y;
import X.C960203pA;
import X.EnumC1073320e2M;
import X.EnumC19359310oZ;
import X.InterfaceC1264610j0t;
import Y.ACListenerS154S0100000_19;
import Y.AkS481S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;
import com.ss.android.ugc.aweme.local_test.services.IRelationDebugService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.recuser.inbox.RecommendUserWidgetV2Injector;
import com.ss.android.ugc.aweme.relation.service.ISocialMonoFreqControlService;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS135S1200000_19;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class IRecommendUsersServiceImpl implements IRecommendUsersService {
    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final C13IQ<? extends UIContentAssem> LJI() {
        return C13LE.LIZ(MainPageSocialAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final List<InboxFragmentWidgetInjectProtocol> LIZIZ() {
        return Collections.singletonList(new RecommendUserWidgetV2Injector());
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final String LJ() {
        return C1072900e1g.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZ() {
        MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LIZLLL(String str) {
        boolean zCheck;
        if (!C10EU.LJIIIIZZ() && C0XQ7.LJFF().isLogin()) {
            User curUser = C0XQ7.LJFF().getCurUser();
            InterfaceC1264610j0t interfaceC1264610j0tLIZJ = C1072350e0n.LIZJ(EnumC1073320e2M.INBOX_AND_ME_TAB, AFwS257S0000000_19.get$arr$(666));
            if (interfaceC1264610j0tLIZJ != null) {
                zCheck = interfaceC1264610j0tLIZJ.check();
            } else {
                zCheck = false;
            }
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            boolean zNeedShowBindPhoneNumberNotice = c2277881EDy.needShowBindPhoneNumberNotice();
            int iHashCode = str.hashCode();
            if (iHashCode != -1382453013) {
                if (iHashCode != 2223327) {
                    if (iHashCode == 2614219 && str.equals("USER")) {
                        new Object() { // from class: X.0j0u
                        }.getClass();
                        if (C10EU.LJIIIIZZ() && C0XQ7.LJFF().getCurUser().getUserPeriod() == 1) {
                            C19259110Wf c19259110Wf = C746350TPl.LIZ;
                            Long lLIZ = c19259110Wf.LJFF().LIZ();
                            if ((lLIZ != null && lLIZ.longValue() == 0) || System.currentTimeMillis() - lLIZ.longValue() <= TimeUnit.DAYS.toMillis(30L)) {
                                if (System.currentTimeMillis() - c19259110Wf.LJI().LIZ().longValue() > TimeUnit.DAYS.toMillis(1L)) {
                                    return false;
                                }
                            }
                        }
                        if ((C0XQ7.LJFF().isLogin() && curUser.isSecret() && SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().LIZ().booleanValue()) || c2277881EDy.needShowSafeInfoNotice() || zCheck || zNeedShowBindPhoneNumberNotice) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                str.equals("HOME");
                return true;
            }
            if (str.equals("NOTIFICATION") && zCheck) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJII(C1264600j0s c1264600j0s) {
        C19EG c19eg;
        Fragment fragment;
        if (((Boolean) C0BLU.LIZIZ.getValue()).booleanValue()) {
            Activity activity = c1264600j0s.LIZ.get();
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                if (IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()) {
                    fragment = c1264600j0s.LIZIZ.get();
                } else {
                    fragment = null;
                }
                EnumC19359310oZ enumC19359310oZ = EnumC19359310oZ.INBOX_PROFILE;
                if (fragment == null) {
                    fragment = c19eg;
                }
                RecUserInMainActivityViewModel recUserInMainActivityViewModel = C2246021CvY.LIZIZ(c19eg, enumC19359310oZ, null, fragment).LLILZ;
                recUserInMainActivityViewModel.getClass();
                ISocialMonoFreqControlService iSocialMonoFreqControlServiceLIZIZ = SocialMonoFreqControlService.LIZIZ();
                C1E7L c1e7l = C1E7L.REC_POP;
                if (iSocialMonoFreqControlServiceLIZIZ.LIZ(c1e7l)) {
                    Boolean bool = C1251130if9.LIZ().disableInboxProfileRecUserPopup;
                    if ((bool != null && bool.booleanValue()) || C816940W2y.LIZ() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        return;
                    }
                    IRelationDebugService iRelationDebugService = (IRelationDebugService) ServiceManager.get().getService(IRelationDebugService.class);
                    if (iRelationDebugService != null) {
                        iRelationDebugService.LIZ();
                    }
                    if (!((Boolean) r6.getValue()).booleanValue()) {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LJI("rec user in FYP/Inbox/Profile", "disable exp");
                        return;
                    }
                    InterfaceC1264610j0t interfaceC1264610j0tLIZJ = C1072350e0n.LIZJ(EnumC1073320e2M.INBOX_AND_ME_TAB, AFwS257S0000000_19.get$arr$(665));
                    if (interfaceC1264610j0tLIZJ != null && ((C1073210e2B) interfaceC1264610j0tLIZJ).check()) {
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LJI("rec user in FYP/Inbox/Profile", "avoid higher popup");
                        return;
                    }
                    if (!C2276131E7f.LIZ(c1e7l, null)) {
                        return;
                    }
                    if (!recUserInMainActivityViewModel.LLILLL) {
                        int i3 = C2187451AjH.LIZ;
                        C1720106oR.LJI("rec user in FYP/Inbox/Profile", "has data in inbox and profile");
                        return;
                    }
                    String str = c1264600j0s.LIZJ;
                    if (str == null) {
                        str = "";
                    }
                    recUserInMainActivityViewModel.LLIZLLLIL = str;
                    recUserInMainActivityViewModel.LLIZ.setValue(Boolean.TRUE);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJIIJ(String str) {
        C1217080hmE.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterFrom = ");
        sbLIZ.append(str);
        C1720106oR.LJI("NewUserProtection", C2188811AlT.LIZIZ(sbLIZ));
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C1720106oR.LJI("NewUserProtection", "un login");
            return;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("current user nickname = ");
        sbLIZ2.append(curUser.getNickname());
        C1720106oR.LJI("NewUserProtection", C2188811AlT.LIZIZ(sbLIZ2));
        Keva keva = C1217080hmE.LIZIZ;
        if (!keva.getBoolean(C1217080hmE.LIZ("rcmd_new_user_protection_flag"), false)) {
            if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - curUser.getRegisterTime() >= 259200) {
                return;
            }
            keva.storeBoolean(C1217080hmE.LIZ("rcmd_new_user_protection_flag"), true);
            C1217080hmE.LIZIZ();
            return;
        }
        C1217080hmE.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LJFF(String str, String str2) {
        if (!C10EU.LJIIIIZZ() && C0XQ7.LJFF().isLogin() && TextUtils.equals("HOME", str)) {
            if (TextUtils.equals("NOTIFICATION", str2) || TextUtils.equals("USER", str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJIIIZ(String str, String str2) {
        new C11T3<String, String, DislikeRecommendParams, String>() { // from class: X.0j0v
            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return ((DislikeRecommendParams) obj).uid;
            }

            @Override // X.C11T3
            public final C11NZ<String> requestActual(DislikeRecommendParams dislikeRecommendParams) {
                DislikeRecommendParams dislikeRecommendParams2 = dislikeRecommendParams;
                return C1DTJ.LIZIZ.LIZ(dislikeRecommendParams2.uid, dislikeRecommendParams2.secUid, Integer.valueOf(EnumC2009907u5.SCENE_CARD.getValue())).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS481S0100000_19(dislikeRecommendParams2, 10));
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        }.request(new DislikeRecommendParams(str, str2)).LJJLL(new C09JN() { // from class: X.05Pp
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("IRecommendUsersServiceImpl@70c3.dislikeRecommendUser$1");
                C1C7U.LIZIZ("IRecommendUsersServiceImpl@70c3.dislikeRecommendUser$1");
            }
        }, new C09JN() { // from class: X.05Po
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IRecommendUsersServiceImpl@70c3.dislikeRecommendUser$2");
                C2344809Gs.LJI((Throwable) obj);
                C1C7U.LIZIZ("IRecommendUsersServiceImpl@70c3.dislikeRecommendUser$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZJ(C19EG c19eg, final String str, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        String str3 = str2;
        C1239400iME.LIZ.getClass();
        final C1361400lX0 c1361400lX0 = new C1361400lX0(c19eg, R.style.xm);
        C1361400lX0 c1361400lX02 = new C1361400lX0(c19eg, R.style.y0);
        if (C960203pA.LIZIZ(c19eg)) {
            c1361400lX0 = c1361400lX02;
        }
        View viewSd = C786410Ut5.Sd(R.layout.ab5, C786410Ut5.ne(c1361400lX0), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.tv_suggest);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.ruu);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c1361400lX0);
        if (numLIZJ != null) {
            textView.setHighlightColor(numLIZJ.intValue());
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewSd;
        c1390920mIc.LJIIIIZZ(4);
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0iMF
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (C296530Bjn.LIZ()) {
                    C1239400iME c1239400iME = C1239400iME.LIZ;
                    String str4 = str;
                    c1239400iME.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("action", "click");
                    c2344009Gk.LJIIIIZZ("enter_from", str4);
                    C20684815ws.LJIILLIIL("close_manage_feeds_half_sheet", c2344009Gk.LIZ);
                }
            }
        };
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILLJJLI = onDismissListener;
        if (C296530Bjn.LIZ()) {
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(tuxSheet, 3246);
            String string = c1361400lX0.getString(2131838207);
            String string2 = c1361400lX0.getString(2131838208);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(c1361400lX0.getString(2131838209));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String string3 = c1361400lX0.getString(2131838206);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{string, string2}, 2)));
            sbLIZ2.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            int iLJJJ = a0.LJJJ(strLIZIZ2, string, 0, false, 6);
            int iLJJJ2 = a0.LJJJ(strLIZIZ2, string2, 0, false, 6);
            int iLJJJ3 = a0.LJJJ(strLIZIZ2, strLIZIZ, 0, false, 6);
            SpannableString spannableString = new SpannableString(strLIZIZ2);
            int length = string.length() + iLJJJ;
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 33);
            final AwS135S1200000_19 awS135S1200000_19 = new AwS135S1200000_19(c1361400lX0, str, awS563S0100000_19, 8);
            final String str4 = "manage_personalized_feeds";
            C786410Ut5.p2(spannableString, new AbstractC426530Gnz(c1361400lX0, str, str4, awS135S1200000_19) { // from class: X.0iMa
                public final Context LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final Function0<Unit> LLILZ;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C1239400iME c1239400iME = C1239400iME.LIZ;
                    String str5 = this.LLILLL;
                    String str6 = this.LLILLJJLI;
                    c1239400iME.getClass();
                    C1239400iME.LIZIZ(str5, str6);
                    Function0<Unit> function0 = this.LLILZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.LL);
                    if (numLIZJ2 != null) {
                        textPaint.setColor(numLIZJ2.intValue());
                        textPaint.setUnderlineText(false);
                    }
                }

                {
                    this.LL = c1361400lX0;
                    this.LLILLJJLI = str;
                    this.LLILLL = str4;
                    this.LLILZ = awS135S1200000_19;
                }
            }, iLJJJ, length, 33);
            int length2 = string2.length() + iLJJJ2;
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ2, length2, 33);
            final AwS420S0200000_19 awS420S0200000_19 = new AwS420S0200000_19(c1361400lX0, awS563S0100000_19, 198);
            final String str5 = "privacy";
            C786410Ut5.p2(spannableString, new AbstractC426530Gnz(c1361400lX0, str, str5, awS420S0200000_19) { // from class: X.0iMa
                public final Context LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final Function0<Unit> LLILZ;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C1239400iME c1239400iME = C1239400iME.LIZ;
                    String str52 = this.LLILLL;
                    String str6 = this.LLILLJJLI;
                    c1239400iME.getClass();
                    C1239400iME.LIZIZ(str52, str6);
                    Function0<Unit> function0 = this.LLILZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.LL);
                    if (numLIZJ2 != null) {
                        textPaint.setColor(numLIZJ2.intValue());
                        textPaint.setUnderlineText(false);
                    }
                }

                {
                    this.LL = c1361400lX0;
                    this.LLILLJJLI = str;
                    this.LLILLL = str5;
                    this.LLILZ = awS420S0200000_19;
                }
            }, iLJJJ2, length2, 33);
            int length3 = strLIZIZ.length() + iLJJJ3;
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ3, length3, 33);
            final AwS404S0200000_3 awS404S0200000_3 = new AwS404S0200000_3(c1361400lX0, awS563S0100000_19, 72);
            final String str6 = "learn_more";
            C786410Ut5.p2(spannableString, new AbstractC426530Gnz(c1361400lX0, str, str6, awS404S0200000_3) { // from class: X.0iMa
                public final Context LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final Function0<Unit> LLILZ;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C1239400iME c1239400iME = C1239400iME.LIZ;
                    String str52 = this.LLILLL;
                    String str62 = this.LLILLJJLI;
                    c1239400iME.getClass();
                    C1239400iME.LIZIZ(str52, str62);
                    Function0<Unit> function0 = this.LLILZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.LL);
                    if (numLIZJ2 != null) {
                        textPaint.setColor(numLIZJ2.intValue());
                        textPaint.setUnderlineText(false);
                    }
                }

                {
                    this.LL = c1361400lX0;
                    this.LLILLJJLI = str;
                    this.LLILLL = str6;
                    this.LLILZ = awS404S0200000_3;
                }
            }, iLJJJ3, length3, 33);
            spannableStringBuilder = new SpannableStringBuilder(spannableString);
        } else {
            if (str3 == null) {
                str3 = "";
            }
            spannableStringBuilder = new SpannableStringBuilder(C1239400iME.LIZ(c1361400lX0, 2131835508, 2131836491, 2131834664, 42, str, str3, 1, new AwS563S0100000_19(tuxSheet, 3247)));
        }
        textView.setText(spannableStringBuilder);
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C786410Ut5.a9(tuxIconView, new ACListenerS154S0100000_19(tuxSheet, 269));
        if (C296530Bjn.LIZ()) {
            C1239400iME.LIZJ(str);
        }
        tuxSheet.show(c19eg.getSupportFragmentManager(), "SUGGEST_ACCOUNT_INFO_ICON");
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final Spanned LJIIIIZZ(Context context, Integer num, Integer num2, Integer num3, int i, String str, String str2, int i2, Function0<Unit> function0) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        C1239400iME c1239400iME = C1239400iME.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2131835508;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 2131836491;
        }
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 2131834664;
        }
        c1239400iME.getClass();
        return C1239400iME.LIZ(context, iIntValue, iIntValue2, iIntValue3, i, str, str2, i2, function0);
    }
}
