package kotlin.jvm.internal;

import X.AbstractC1252750ihl;
import X.AbstractC1539010q9T;
import X.AbstractC1542100qES;
import X.AbstractC738140SxQ;
import X.C004I;
import X.C09AY;
import X.C0X2A;
import X.C104L;
import X.C1067320dsg;
import X.C1075770e6J;
import X.C10KE;
import X.C10KT;
import X.C10L7;
import X.C10LG;
import X.C10M3;
import X.C11E5;
import X.C11GO;
import X.C1252520ihO;
import X.C1252530ihP;
import X.C1252540ihQ;
import X.C1261860iwS;
import X.C1265190j1p;
import X.C127A;
import X.C127M;
import X.C1287390jbd;
import X.C1287400jbe;
import X.C1354920lMY;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1440005kM;
import X.C14ZT;
import X.C14ZW;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1537910q7h;
import X.C1541950qED;
import X.C1602160rnK;
import X.C1617910sCj;
import X.C1618770sE7;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1749280vcc;
import X.C1761680vwc;
import X.C1778870wOL;
import X.C1875880yuo;
import X.C1888340zEu;
import X.C1889530zGp;
import X.C1892120zL0;
import X.C1892160zL4;
import X.C1893410zN5;
import X.C1900190zY1;
import X.C1901260zZk;
import X.C1901440za2;
import X.C1910890zpH;
import X.C1913380ztI;
import X.C191880104w;
import X.C19228210Ki;
import X.C19229710Kx;
import X.C19EG;
import X.C1A9E;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C255660A0e;
import X.C291001Au;
import X.C416901jj;
import X.C444940Hca;
import X.C619500ORo;
import X.C621650OZv;
import X.C621670OZx;
import X.C695160ROo;
import X.C724240Sb0;
import X.C735840Sti;
import X.C737030Svd;
import X.C7740030o;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1063300dmC;
import X.EnumC1260930iux;
import X.EnumC1609900rzo;
import X.EnumC1778790wOD;
import X.EnumC1778800wOE;
import X.InterfaceC1063710dmr;
import X.InterfaceC1531560pxS;
import X.InterfaceC1540940qCa;
import X.InterfaceC1891350zJl;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyTemplate;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.pushsurvey.PushSurveyAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusBarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.BigCardUIFixConfig;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceButtonsAssem;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceRecUsersAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeUserCardRootAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsAdapter;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyInlineLink;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyLabelConfigModel;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyTextWithInlineLink;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AFwS315S0000000_28 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(60);
    public final int $t;

    public static AFwS315S0000000_28 get$arr$(int i) {
        AFwS315S0000000_28 aFwS315S0000000_28 = (AFwS315S0000000_28) arr$.get(i);
        if (aFwS315S0000000_28 != null) {
            return aFwS315S0000000_28;
        }
        arr$.compareAndSet(i, null, new AFwS315S0000000_28(i));
        return (AFwS315S0000000_28) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS315S0000000_28(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        C1900190zY1.LLILLL = false;
        C1900190zY1.LLILLJJLI = false;
        C1900190zY1.LLILZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        int i;
        Context context = (Context) obj2;
        Integer value = ((ValuedAccountPrivacySettingItemModel) obj).LLJILJIL.LLILLL.getValue();
        if (value != null && value.intValue() == 1) {
            i = 2131845107;
        } else {
            i = 2131845106;
        }
        return context.getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Number) c291001Au.LIZ).intValue();
            ecProductAddButtonAssem.Bp(new AwS572S0100000_28(ecProductAddButtonAssem, 207));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        String str;
        boolean z;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        C1537910q7h c1537910q7h;
        C1075770e6J c1075770e6J;
        PushSurveyAssem pushSurveyAssem = (PushSurveyAssem) obj;
        if (obj2 != null) {
            VideoItemParams videoItemParams = (VideoItemParams) pushSurveyAssem.bo();
            String str2 = C255660A0e.LIZ;
            C14ZW.LIZ.getClass();
            FeedSurvey feedSurveyLJFF = C14ZW.LJFF(str2);
            String str3 = "";
            if (feedSurveyLJFF == null || (str = feedSurveyLJFF.templateUrl) == null) {
                str = "";
            }
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CommentSurveyTemplate[] commentSurveyTemplateArr = C619500ORo.LIZ;
                int length = commentSurveyTemplateArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    CommentSurveyTemplate commentSurveyTemplate = commentSurveyTemplateArr[i];
                    if (Intrinsics.LJFF(commentSurveyTemplate.id, "push_survey")) {
                        str = commentSurveyTemplate.schema;
                        if (str == null) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
                str = "";
            }
            Context context = pushSurveyAssem.getContext();
            Aweme aweme = videoItemParams.getAweme();
            if (context != null && aweme != null) {
                C621670OZx.LIZ.getClass();
                C621670OZx.LIZIZ = aweme;
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(context, "bottomSurveyLynx", "bottomSurveyLynx", null, 16);
                if (interfaceC1540940qCaLJ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1540940qCaLJ;
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
                }
                pushSurveyAssem.LLJZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(str);
                    sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0zpq
                        @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                            boolean z2 = interfaceC1531560pxS instanceof C1537910q7h;
                        }
                    });
                    sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.0zRp
                        @Override // X.AbstractC1537870q7d
                        public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str4) {
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str4, C1542120qEU c1542120qEU) {
                            LJLI(interfaceC1541990qEH, str4, c1542120qEU.LIZIZ);
                        }
                    });
                    C1541950qED.LIZJ.getClass();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                    for (Class<? extends InterfaceC1063710dmr> cls : C1697810uHb.LJIIJJI(C621650OZv.class, C1888340zEu.class, C1875880yuo.class)) {
                        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
                        if (sparkContext2 != null && (c1075770e6J = (C1075770e6J) sparkContext2.LJFF(C1075770e6J.class)) != null) {
                            c1075770e6J.LJIILL(cls, EnumC1063300dmC.ALL);
                        }
                    }
                    String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                    C14ZT.LIZ.getClass();
                    String str4 = C0X2A.LIZJ;
                    String strLIZLLL = C14ZT.LIZLLL();
                    C844470XAv.LIZ.getClass();
                    int i2 = C844470XAv.LJIIJ;
                    Gson gson = C7740030o.LIZ().getGson();
                    String aid = aweme.getAid();
                    if (aid != null) {
                        str3 = aid;
                    }
                    String json = GsonProtectorUtils.toJson(gson, new PushSurveyAssem.SurveyData(str3, str2, curUserId, str4, strLIZLLL, i2));
                    InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                    if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                        c1537910q7h.LJIJJLI(C1067320dsg.LIZIZ(json));
                    }
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                    pushSurveyAssem.LLJZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                }
                View contentView = pushSurveyAssem.getContentView();
                if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null && viewGroup.getChildCount() == 0) {
                    viewGroup.addView(pushSurveyAssem.LLJZ, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            C786410Ut5.LJLLLLLL(0, pushSurveyAssem.getContentView());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AFwS315S0000000_28 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS315S0000000_28.invoke$12(kotlin.jvm.internal.AFwS315S0000000_28, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        VideoReviewStatusBarAssem videoReviewStatusBarAssem = (VideoReviewStatusBarAssem) obj;
        if (obj2 != null) {
            videoReviewStatusBarAssem.Gp().LLILLL = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$14(kotlin.jvm.internal.AFwS315S0000000_28 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS315S0000000_28.invoke$14(kotlin.jvm.internal.AFwS315S0000000_28, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ResponseState responseState = (ResponseState) obj;
        return responseState.copy(-1, -1, responseState.cacheEvent, responseState.networkEvent);
    }

    public static final Object invoke$16(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ResponseState responseState = (ResponseState) obj;
        return responseState.copy(-1, -1, responseState.cacheEvent, responseState.networkEvent);
    }

    public static final Object invoke$17(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C1778870wOL c1778870wOL = (C1778870wOL) obj2;
        if (c1778870wOL != null) {
            C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("disableStatus:");
            sbLIZ.append(c1778870wOL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1889530zGp.getClass();
            C1889530zGp.LIZ("NotificationFragmentStatusAssem", strLIZIZ);
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                EnumC1778790wOD enumC1778790wOD = c1778870wOL.LIZ;
                if (enumC1778790wOD == EnumC1778790wOD.NET_ERR) {
                    C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
                    if (c1913380ztI.isStandardUIEnable()) {
                        c1913380ztI.triggerNetworkTips(c19egLIZ, EnumC1609900rzo.INBOX_ACTIVITY, (Exception) null, (C1749280vcc) null);
                    } else {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                        c1389890mGx.LJIIIZ(2131837962);
                        c1389890mGx.LJIIJJI();
                    }
                } else if (enumC1778790wOD == EnumC1778790wOD.FAIL) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZ);
                    c1389890mGx2.LJIIIZ(2131828141);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Fragment fragmentLJI = C724240Sb0.LJI((AbstractC738140SxQ) obj);
        if (fragmentLJI != null) {
            C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteStatus = ");
            sbLIZ.append(obj2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1889530zGp.getClass();
            C1889530zGp.LIZ("NotificationFragmentStatusAssem", strLIZIZ);
            if (obj2 == EnumC1778800wOE.NET_ERR) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            } else if (obj2 == EnumC1778800wOE.REQ_ERR) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLJI);
                c1389890mGx2.LJIIIZ(2131836101);
                c1389890mGx2.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            ecProductAddButtonAssem.LLLI = 0;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_anchor_bottom_button_preload", true)) {
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LJIILL("content_ecommerce");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setContentDescription(C1618770sE7.LIZJ(2131823238));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        C735840Sti.LIZ.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        if (C1901260zZk.LIZ()) {
            C1901440za2.LIZ.LIZJ("CreatorSplitTitle show");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        if (C1901260zZk.LIZ()) {
            C1901440za2.LIZ.LIZJ("View All Button Show");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setContentDescription(C1618770sE7.LIZJ(2131823242));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setContentDescription(C1618770sE7.LIZJ(2131823242));
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        PerformanceButtonsAssem performanceButtonsAssem = (PerformanceButtonsAssem) obj;
        if (Intrinsics.LJFF(performanceButtonsAssem.cp().LLJIJIL, performanceButtonsAssem.LLJJJJLIIL)) {
            performanceButtonsAssem.LLJJJJJIL = false;
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        PerformanceRecUsersAssem performanceRecUsersAssem = (PerformanceRecUsersAssem) obj;
        List list = (List) obj2;
        C1910890zpH c1910890zpH = (C1910890zpH) performanceRecUsersAssem.LLJJJJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive display users: ");
        sbLIZ.append(list);
        c1910890zpH.LIZ("PerfRecUsersAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(performanceRecUsersAssem.cp().LLJIJIL, performanceRecUsersAssem.LLJJLIIIJLLLLLLLZ)) {
            int i = 0;
            for (Object obj3 : (ArrayList) performanceRecUsersAssem.LLJJL) {
                int i2 = i + 1;
                String string = null;
                if (i >= 0) {
                    C10LG c10lg = (C10LG) obj3;
                    C1261860iwS c1261860iwS = (C1261860iwS) C13LP.LJJJLZIJ(i, list);
                    if (c1261860iwS == null) {
                        if (i == 0 && performanceRecUsersAssem.cp().LLJJIJI) {
                            View viewLJJIJL = performanceRecUsersAssem.LJJIJL();
                            C1389890mGx c1389890mGx = new C1389890mGx(viewLJJIJL);
                            Context context = viewLJJIJL.getContext();
                            if (context != null) {
                                string = context.getString(2131827371);
                            }
                            c1389890mGx.LJIIJ(string);
                            c1389890mGx.LJIIJJI();
                        } else {
                            int visibility = c10lg.getVisibility();
                            c10lg.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c10lg);
                        }
                    } else {
                        int visibility2 = c10lg.getVisibility();
                        c10lg.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility2, 0, c10lg);
                        c10lg.LIZ(c1261860iwS, performanceRecUsersAssem.cp());
                    }
                    c10lg.setLoading(false);
                    if (c1261860iwS != null) {
                        performanceRecUsersAssem.cp().GQ2(c1261860iwS, EnumC1260930iux.SHOW);
                        C19229710Kx.LJFF(performanceRecUsersAssem.cp(), c1261860iwS);
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

    public static final Object invoke$28(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        RecSwipeCardListAssem recSwipeCardListAssem = (RecSwipeCardListAssem) obj;
        T t = ((C291001Au) obj2).LIZ;
        if (t != 0) {
            String str = recSwipeCardListAssem.LLJLILLLLZIIL;
            String str2 = null;
            if (str == null) {
                str = null;
            }
            if (Intrinsics.LJFF(t, str)) {
                recSwipeCardListAssem.LLJZ = true;
                if (recSwipeCardListAssem.dp().LLILZIL != -1) {
                    C10KT c10kt = recSwipeCardListAssem.LLJJJJJIL;
                    if (c10kt != null) {
                        c10kt.clearData();
                    }
                    C10KT c10kt2 = recSwipeCardListAssem.LLJJJJJIL;
                    if (c10kt2 != null) {
                        RecSwipeViewModel recSwipeViewModelHp = recSwipeCardListAssem.hp();
                        String str3 = recSwipeCardListAssem.LLJLILLLLZIIL;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        c10kt2.addData(C19229710Kx.LIZIZ(recSwipeViewModelHp, str2));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$29(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer num;
        int itemCount;
        List<C1261860iwS> data;
        RecSwipeCardListAssem recSwipeCardListAssem = (RecSwipeCardListAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        String str = recSwipeCardListAssem.hp().LLIZ;
        String str2 = recSwipeCardListAssem.LLJLILLLLZIIL;
        if (str2 == null) {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2) && !recSwipeCardListAssem.ep().isAnimating() && (num = (Integer) c291001Au.LIZ) != null) {
            num.intValue();
            if (num.intValue() >= 0) {
                int iIntValue = num.intValue();
                C10KT c10kt = recSwipeCardListAssem.LLJJJJJIL;
                if (c10kt != null) {
                    itemCount = c10kt.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (iIntValue < itemCount) {
                    C10KT c10kt2 = recSwipeCardListAssem.LLJJJJJIL;
                    if (c10kt2 != null && (data = c10kt2.getData()) != null) {
                        ListProtector.remove(data, num.intValue());
                    }
                    C10KT c10kt3 = recSwipeCardListAssem.LLJJJJJIL;
                    if (c10kt3 != null) {
                        c10kt3.notifyItemRemoved(num.intValue());
                    }
                }
            }
            C10KT c10kt4 = recSwipeCardListAssem.LLJJJJJIL;
            if (c10kt4 != null && c10kt4.getItemCount() == 0) {
                C1440005kM.LIZ(new C10L7());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        ecProductAddButtonAssem.Bp(new AwS429S0200000_28((C291001Au) obj2, (C291001Au<String>) ecProductAddButtonAssem, (EcProductAddButtonAssem) 26));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        int itemCount;
        RecSwipeCardListAssem recSwipeCardListAssem = (RecSwipeCardListAssem) obj;
        String str = recSwipeCardListAssem.hp().LLIZ;
        String str2 = recSwipeCardListAssem.LLJLILLLLZIIL;
        if (str2 == null) {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            if (!recSwipeCardListAssem.LLJLLL && recSwipeCardListAssem.hp().LLJ) {
                int i = recSwipeCardListAssem.dp().LLILZIL + 1;
                C10KT c10kt = recSwipeCardListAssem.LLJJJJJIL;
                if (c10kt != null) {
                    itemCount = c10kt.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (i < itemCount) {
                    recSwipeCardListAssem.ep().smoothScrollToPosition(recSwipeCardListAssem.dp().LLILZIL + 1);
                }
            } else {
                recSwipeCardListAssem.LLJLLIL = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        String nickname;
        GradientDrawable gradientDrawable;
        int iIntValue;
        List<String> urlList;
        Object objLJJJLL;
        int[] iArr;
        Integer numLJJI;
        RecSwipeUserCardRootAssem recSwipeUserCardRootAssem = (RecSwipeUserCardRootAssem) obj;
        User user = (User) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currRecUser - updated, ");
        if (user != null) {
            nickname = user.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        if (user != null) {
            recSwipeUserCardRootAssem.getClass();
            if (C19228210Ki.LIZJ() && ((BigCardUIFixConfig) C19228210Ki.LIZIZ.getValue()).newBackground == 1) {
                C1617910sCj c1617910sCjOp = recSwipeUserCardRootAssem.op();
                if (c1617910sCjOp != null) {
                    c1617910sCjOp.setBackground(null);
                }
                C1287400jbe c1287400jbeHp = recSwipeUserCardRootAssem.hp();
                if (c1287400jbeHp != null) {
                    C10M3 c10m3 = (C10M3) recSwipeUserCardRootAssem.wk().LLJILLL.getValue();
                    c10m3.getClass();
                    UrlModel avatarMedium = user.getAvatarMedium();
                    if (avatarMedium != null && (urlList = avatarMedium.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null && (iArr = c10m3.LIZIZ.get(objLJJJLL)) != null && (numLJJI = C13LQ.LJJI(iArr)) != null) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateFlyMainBackground - for ");
                        sbLIZ2.append(user.getNickname());
                        sbLIZ2.append(", ");
                        sbLIZ2.append(numLJJI);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        iIntValue = numLJJI.intValue();
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("No color picked for user ");
                        sbLIZ3.append(user.getUniqueId());
                        C2344809Gs.LIZLLL(6, "RecSwipeUserCardRootAssem", C2188811AlT.LIZIZ(sbLIZ3));
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("updateFlyMainBackground - NO COLOR GET for ");
                        sbLIZ4.append(user.getNickname());
                        C1720106oR.LIZ("RecSwipeUserCardRootAssem", C2188811AlT.LIZIZ(sbLIZ4));
                        iIntValue = -7829368;
                    }
                    c1287400jbeHp.setUniforms(new C1287390jbd(0.0f, 0.0f, 0.0f, (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(-0.09f), Float.valueOf(-0.2f)), (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(1.0f), Float.valueOf(1.0f)), Color.rgb(0, 0, 0), iIntValue, iIntValue, iIntValue, Color.rgb(0, 0, 0), 1.0f, 0.0f));
                    c1287400jbeHp.requestRender();
                }
            } else if (C1A9E.LIZLLL()) {
                C1617910sCj c1617910sCjOp2 = recSwipeUserCardRootAssem.op();
                C10M3 c10m32 = (C10M3) recSwipeUserCardRootAssem.wk().LLJILLL.getValue();
                c10m32.getClass();
                Pair<String, String> pairLIZ = C695160ROo.LIZ(user);
                if (pairLIZ == null) {
                    int i3 = C2187451AjH.LIZ;
                    gradientDrawable = C10M3.LIZJ;
                } else {
                    String first = pairLIZ.getFirst();
                    String second = pairLIZ.getSecond();
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("getBackgroundDrawable: url=");
                    sbLIZ5.append(first);
                    sbLIZ5.append(", tag=");
                    sbLIZ5.append(second);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    int[] iArr2 = c10m32.LIZIZ.get(first);
                    if (iArr2 == null) {
                        gradientDrawable = C10M3.LIZJ;
                    } else {
                        gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr2);
                        gradientDrawable.setCornerRadius(0.0f);
                    }
                }
                c1617910sCjOp2.setBackground(gradientDrawable);
            } else {
                recSwipeUserCardRootAssem.op().setBackgroundResource(R.drawable.aka);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$32(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$33(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ListMiddleware<NotificationChoiceState, InterfaceC1891350zJl, C1265190j1p> listMiddleware;
        ListMiddleware<NotificationChoiceState, InterfaceC1891350zJl, C1265190j1p> listMiddleware2;
        PushSettingFollowListAdapter.FollowItemViewHolder followItemViewHolder = (PushSettingFollowListAdapter.FollowItemViewHolder) obj;
        UserState userState = (UserState) obj2;
        AbstractC1252750ihl<FollowStatus> followStatus = userState.getFollowStatus();
        if (followStatus instanceof C1252540ihQ) {
            followItemViewHolder.W5(userState.getUser());
        } else if (followStatus instanceof C1252520ihO) {
            C1354920lMY.LIZLLL(followItemViewHolder.itemView.getContext(), ((C1252520ihO) userState.getFollowStatus()).LIZ, R.string.jpj);
        } else if (followStatus instanceof C1252530ihP) {
            followItemViewHolder.W5(userState.getUser());
        }
        if (userState.getUser().getFollowStatus() == 0) {
            PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) followItemViewHolder.LLJJ.getValue();
            if (pushSettingNotificationChoiceViewModel != null && (listMiddleware2 = pushSettingNotificationChoiceViewModel.LLJ) != null) {
                listMiddleware2.LIZLLL().dR2(new AwS395S0200000_29(listMiddleware2, (C11E5<C004I, C004I>) new AwS392S0200000_26((List) C13BV.INSTANCE, (List<Object>) listMiddleware2, (ListMiddleware<C004I, Object, C1761680vwc>) 140), (Function1<C004I, C004I>) 83));
            }
            PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel2 = (PushSettingNotificationChoiceViewModel) followItemViewHolder.LLJJ.getValue();
            if (pushSettingNotificationChoiceViewModel2 != null && (listMiddleware = pushSettingNotificationChoiceViewModel2.LLJ) != null) {
                listMiddleware.refresh();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((PostNotificationSettingsAdapter.FriendOnlySwitchHolder) obj).LLJIJIL.setCellEnabled(zBooleanValue);
        PostNotificationSettingsAdapter.LLILZIL = zBooleanValue;
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        C11GO c11go;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C127M accessory = ((PostNotificationSettingsAdapter.SwitchHolder) obj).LLJIJIL.getAccessory();
        if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
            c11go.LJIILJJIL(zBooleanValue);
        }
        PostNotificationSettingsAdapter.LLILZIL = zBooleanValue;
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        C1252520ihO c1252520ihO;
        PostNotificationSettingsAdapter.OptionsItemHolder optionsItemHolder = (PostNotificationSettingsAdapter.OptionsItemHolder) obj;
        UserState userState = (UserState) obj2;
        optionsItemHolder.LLJJIJIL = userState.getUser();
        AbstractC1252750ihl<FollowStatus> followStatus = userState.getFollowStatus();
        if ((followStatus instanceof C1252540ihQ) || (followStatus instanceof C1252530ihP)) {
            optionsItemHolder.W5(userState.getUser());
        } else if (followStatus instanceof C1252520ihO) {
            Context context = optionsItemHolder.itemView.getContext();
            AbstractC1252750ihl<FollowStatus> followStatus2 = userState.getFollowStatus();
            Throwable th = null;
            if ((followStatus2 instanceof C1252520ihO) && (c1252520ihO = (C1252520ihO) followStatus2) != null) {
                th = c1252520ihO.LIZ;
            }
            C1354920lMY.LIZLLL(context, th, R.string.jpj);
        }
        if (userState.getUser().getFollowStatus() == 0) {
            ListMiddleware<PostNotificationStatus, InterfaceC1891350zJl, C1265190j1p> listMiddleware = ((PostNotificationSettingsViewModel) optionsItemHolder.LLJJJ.getValue()).LLJIJIL;
            C13BV c13bv = C13BV.INSTANCE;
            listMiddleware.getClass();
            listMiddleware.LIZLLL().dR2(new AwS395S0200000_29(listMiddleware, (C11E5<C004I, C004I>) new AwS392S0200000_26((List) c13bv, (List<Object>) listMiddleware, (ListMiddleware<C004I, Object, C1761680vwc>) 140), (Function1<C004I, C004I>) 83));
            ((PostNotificationSettingsViewModel) optionsItemHolder.LLJJJ.getValue()).LLJIJIL.refresh();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$39(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ((RecSwipeButtonsAssem) obj).LLJJJJJIL = ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            long jLongValue = ((Number) c291001Au.LIZ).longValue();
            if (jLongValue > ecProductAddButtonAssem.LLLI) {
                ecProductAddButtonAssem.LLLI = (int) jLongValue;
            }
            if (ecProductAddButtonAssem.Ep().LLIZLLLIL != null) {
                ecProductAddButtonAssem.Bp(new C1892120zL0(ecProductAddButtonAssem, jLongValue));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        boolean zLJFF;
        String strLIZ;
        String strLIZ2;
        String str = (String) obj;
        String str2 = (String) obj2;
        C1892160zL4.LIZ.getClass();
        try {
            strLIZ = C416901jj.LIZ(UriProtector.parse(str), "surl");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (strLIZ != null && (strLIZ2 = C416901jj.LIZ(UriProtector.parse(str2), "surl")) != null) {
            zLJFF = Intrinsics.LJFF(strLIZ, strLIZ2);
        } else {
            zLJFF = false;
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$41(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        boolean zLIZ;
        String str = (String) obj;
        String str2 = (String) obj2;
        try {
            C1893410zN5.LIZ.getClass();
            zLIZ = C1893410zN5.LIZ(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZ = false;
        }
        return Boolean.valueOf(zLIZ);
    }

    public static final Object invoke$43(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$44(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return ((Context) obj2).getString(2131845128);
    }

    public static final Object invoke$46(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        int i;
        Integer numValueOf;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("duet")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 3) {
                        numValueOf = 2131829280;
                    } else {
                        return "";
                    }
                } else {
                    numValueOf = 2131829278;
                }
            } else {
                if (C104L.LIZJ()) {
                    i = 2131838943;
                } else {
                    i = R.string.dlw;
                }
                numValueOf = Integer.valueOf(i);
            }
            if (numValueOf != null && (string = context.getString(numValueOf.intValue())) != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$47(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return ((Context) obj2).getString(2131845131);
    }

    public static final Object invoke$48(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        int i;
        Integer numValueOf;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("stitch")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 3) {
                        numValueOf = 2131829280;
                    } else {
                        return "";
                    }
                } else {
                    numValueOf = 2131829278;
                }
            } else {
                if (C104L.LIZJ()) {
                    i = 2131838943;
                } else {
                    i = R.string.dlw;
                }
                numValueOf = Integer.valueOf(i);
            }
            if (numValueOf != null && (string = context.getString(numValueOf.intValue())) != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$49(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return ((Context) obj2).getString(2131845572);
    }

    public static final Object invoke$5(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        ecProductAddButtonAssem.Bp(new AwS429S0200000_28((C291001Au) obj2, (C291001Au<String>) ecProductAddButtonAssem, (EcProductAddButtonAssem) 27));
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        int i;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("content_reuse_permission")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 1) {
                if (iIntValue != 4) {
                    if (iIntValue == 5) {
                        string = context.getString(2131829280);
                    } else {
                        return "";
                    }
                } else {
                    string = context.getString(2131829278);
                }
            } else {
                if (C104L.LIZJ()) {
                    i = 2131838943;
                } else {
                    i = R.string.dlw;
                }
                string = context.getString(i);
            }
            if (string != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$51(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        Integer num;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("dm_setting_friends")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    num = 2131830786;
                } else {
                    return "";
                }
            } else {
                num = 2131830787;
            }
            if (num != null && (string = context.getString(num.intValue())) != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$52(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        Integer num;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("dm_setting_potential_connection")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    num = 2131830786;
                } else {
                    return "";
                }
            } else {
                num = 2131830788;
            }
            if (num != null && (string = context.getString(num.intValue())) != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$53(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        int i;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("comment")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 3) {
                        string = context.getString(2131829279);
                    } else {
                        return "";
                    }
                } else {
                    string = context.getString(2131829278);
                }
            } else {
                if (C104L.LIZJ()) {
                    i = 2131838943;
                } else {
                    i = R.string.dlw;
                }
                string = context.getString(i);
            }
            if (string != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$54(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        Integer num;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("dm_setting_others")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    num = 2131830786;
                } else {
                    return "";
                }
            } else {
                num = 2131830788;
            }
            if (num != null && (string = context.getString(num.intValue())) != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$55(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return ((Context) obj2).getString(2131845129);
    }

    public static final Object invoke$56(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Integer numLIZ;
        Integer numValueOf;
        String string;
        Context context = (Context) obj2;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && (numLIZ = privacyUserSettingsV2LJIIL.LIZ("direct_message")) != null) {
            int iIntValue = numLIZ.intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue == 4) {
                            numValueOf = 2131831596;
                        } else {
                            return "";
                        }
                    } else {
                        numValueOf = 2131845133;
                    }
                } else {
                    numValueOf = 2131829278;
                }
            } else {
                numValueOf = Integer.valueOf(R.string.dlw);
            }
            if (numValueOf != null && (string = context.getString(numValueOf.intValue())) != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$57(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        String str;
        Object next;
        String str2;
        int iIntValue = ((Number) obj).intValue();
        List list = (List) obj2;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                Integer num = ((PrivacyLabelConfigModel) it2.next()).optionValue;
                if (num != null && num.intValue() == -1) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            Integer num2 = ((PrivacyLabelConfigModel) next).optionValue;
                            if (num2 != null && num2.intValue() == -1) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    PrivacyLabelConfigModel privacyLabelConfigModel = (PrivacyLabelConfigModel) next;
                    if (privacyLabelConfigModel != null && (str2 = privacyLabelConfigModel.labelTitle) != null) {
                        return str2;
                    }
                }
            } else {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    PrivacyLabelConfigModel privacyLabelConfigModel2 = (PrivacyLabelConfigModel) it4.next();
                    Integer num3 = privacyLabelConfigModel2.optionValue;
                    if (num3 != null && num3.intValue() == iIntValue) {
                        if (C104L.LIZJ()) {
                            Map<String, String> map = privacyLabelConfigModel2.alternativeTitle;
                            if (map != null && (str = map.get("private_account")) != null) {
                                return str;
                            }
                            String str3 = privacyLabelConfigModel2.labelTitle;
                            if (str3 == null) {
                                break;
                            }
                            return str3;
                        }
                        String str4 = privacyLabelConfigModel2.labelTitle;
                        if (str4 == null) {
                            break;
                        }
                        return str4;
                    }
                }
            }
        }
        return "";
    }

    public static final Object invoke$58(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Object obj3;
        Map map = (Map) obj2;
        if (C104L.LIZJ() && (obj3 = map.get("private_account")) != null) {
            return obj3;
        }
        return obj;
    }

    public static final Object invoke$59(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        Context context = (Context) obj;
        PrivacyTextWithInlineLink privacyTextWithInlineLink = (PrivacyTextWithInlineLink) obj2;
        ArrayList arrayList = new ArrayList();
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZLLL(2);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(62);
        List<PrivacyInlineLink> list = privacyTextWithInlineLink.links;
        if (list != null) {
            for (PrivacyInlineLink privacyInlineLink : list) {
                c444940Hca.LIZJ = privacyInlineLink.text;
                c444940Hca.LJIIIIZZ = new AwS429S0200000_28(context, privacyInlineLink, 173);
                arrayList.add(c444940Hca.LIZ(context));
            }
        }
        String str = privacyTextWithInlineLink.text;
        if (str == null) {
            str = "";
        }
        Spannable[] spannableArr = (Spannable[]) arrayList.toArray(new Spannable[0]);
        return C10KE.LIZIZ(str, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
    }

    public static final Object invoke$6(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        ecProductAddButtonAssem.Bp(new AwS429S0200000_28(ecProductAddButtonAssem, (C737030Svd) obj2, 28));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        ecProductAddButtonAssem.Bp(new AwS429S0200000_28((C291001Au) obj2, (C291001Au<String>) ecProductAddButtonAssem, (EcProductAddButtonAssem) 29));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS315S0000000_28 aFwS315S0000000_28, Object obj, Object obj2) {
        EcProductAddButtonAssem ecProductAddButtonAssem = (EcProductAddButtonAssem) obj;
        ecProductAddButtonAssem.Bp(new AwS429S0200000_28((C291001Au) obj2, (C291001Au<String>) ecProductAddButtonAssem, (EcProductAddButtonAssem) 30));
        return Unit.LIZ;
    }
}
