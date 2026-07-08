package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C0B10;
import X.C0C64;
import X.C0CHQ;
import X.C0ET4;
import X.C0LAB;
import X.C0LEK;
import X.C0LJ0;
import X.C0LSZ;
import X.C0LUA;
import X.C0MBC;
import X.C0ML7;
import X.C0MW8;
import X.C11NZ;
import X.C13LP;
import X.C1659700tI8;
import X.C1665790tRx;
import X.C1682930ttb;
import X.C19292410dm;
import X.C19A3;
import X.C1E3D;
import X.C201955140j;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2500709r3;
import X.C291001Au;
import X.C339190DRl;
import X.C528910Koj;
import X.C535280Kz0;
import X.C547160Ld4;
import X.C547300LdI;
import X.C547790Le5;
import X.C547980LeO;
import X.C548010LeR;
import X.C548810Lfj;
import X.C548880Lfq;
import X.C548910Lft;
import X.C549720LhC;
import X.C550080Lhm;
import X.C550360LiE;
import X.C550690Lil;
import X.C559610Lx9;
import X.C561950M2f;
import X.C563290M7j;
import X.C570060MXk;
import X.C570110MXp;
import X.C631370Opb;
import X.C693070RGn;
import X.C724270Sb3;
import X.EnumC1642750sqn;
import X.EnumC371580EhY;
import X.EnumC609120Nuo;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC548110Leb;
import X.InterfaceC548750Lfd;
import X.InterfaceC550180Lhw;
import X.InterfaceC550750Lir;
import X.InterfaceC609180Nuu;
import android.content.Context;
import android.os.SystemClock;
import androidx.compose.foundation.layout.c;
import com.bytedance.aigc.proto.Level;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitSessionModel;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.aitheater.StoryAiTheaterButtonComponent;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoMetricsInfo;
import com.ss.android.ugc.aweme.theater.consumption.entrance.AITheaterFollowUIAssem;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AFwS291S0000000_8 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(49);
    public final int $t;

    public static AFwS291S0000000_8 get$arr$(int i) {
        AFwS291S0000000_8 aFwS291S0000000_8 = (AFwS291S0000000_8) arr$.get(i);
        if (aFwS291S0000000_8 != null) {
            return aFwS291S0000000_8;
        }
        arr$.compareAndSet(i, null, new AFwS291S0000000_8(i));
        return (AFwS291S0000000_8) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS291S0000000_8(int i) {
        super(2);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return C535280Kz0.LIZ((C535280Kz0) obj, 30);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$10(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1665790tRx.LIZ(c.LJIILLIIL(InterfaceC1685750ty9.LIZ, 8), interfaceC1680500tpg);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C693070RGn c693070RGn;
        boolean z;
        Object obj3;
        C0MW8 c0mw8LJ;
        StoryAiTheaterButtonComponent storyAiTheaterButtonComponent = (StoryAiTheaterButtonComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c693070RGn = (C693070RGn) c291001Au.LIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStoryPageSelectedEvent: ");
            sbLIZ.append(c693070RGn.LIZ.getAid());
            sbLIZ.append(" + hasAiTheaterInfo: ");
            if (c693070RGn.LIZ.aiTheaterInfo != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", \n currentItemId: ");
            sbLIZ.append(((VideoItemParams) C631370Opb.LIZ(storyAiTheaterButtonComponent)).getAweme().getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            String aid = c693070RGn.LIZ.getAid();
            C724270Sb3 c724270Sb3 = storyAiTheaterButtonComponent.LLJI;
            Object obj4 = null;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(aid, ((VideoItemParams) obj3).getAweme().getAid())) {
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
                    c0mw8LJ.LIZIZ();
                }
                C724270Sb3 c724270Sb32 = storyAiTheaterButtonComponent.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                }
                IAITheaterCreationLauncher.EnterParams enterParamsEp = storyAiTheaterButtonComponent.Ep(((VideoItemParams) obj4).getAweme());
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C1E3D c1e3d = C1E3D.LJIIIIZZ;
                InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParamsEp);
                AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c1e3d, interfaceC548750LfdLIZ, aFwS239S0000000_8);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        String str;
        C570060MXk c570060MXk;
        C570060MXk c570060MXk2;
        AITheaterFollowUIAssem aITheaterFollowUIAssem = (AITheaterFollowUIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (((Boolean) C0B10.LIZ.getValue()).booleanValue()) {
            if (c291001Au != null && (c570060MXk2 = (C570060MXk) c291001Au.LIZ) != null) {
                str = c570060MXk2.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, aITheaterFollowUIAssem.LLJLLL) && c291001Au != null && (c570060MXk = (C570060MXk) c291001Au.LIZ) != null) {
                InterfaceC609180Nuu interfaceC609180Nuu = c570060MXk.LIZIZ;
                if ((interfaceC609180Nuu instanceof C570110MXp) && ((C570110MXp) interfaceC609180Nuu).LIZ == EnumC609120Nuo.UPVOTE_INFO_NEW_STYLE) {
                    C339190DRl.LIZIZ(aITheaterFollowUIAssem.Bp());
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        boolean z;
        if (((C561950M2f) obj).LIZ() == ((C561950M2f) obj2).LIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$16(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C528910Koj.LIZ((Context) obj, ((Number) obj2).intValue(), LSPassThroughRecordSizeConfig.DEFAULT, 0, 24);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        Function1 function1 = (Function1) obj2;
        String str = (String) C13LP.LJJJLL((List) obj);
        if (str != null) {
            C0CHQ.LIZ().getChallengeService().LIZIZ(str, new C2500709r3(function1, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C528910Koj.LIZ((Context) obj, ((Number) obj2).intValue(), LSPassThroughRecordSizeConfig.DEFAULT, 0, 24);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C0LAB c0lab = (C0LAB) obj;
        CreativeModel creativeModel = (CreativeModel) obj2;
        C548810Lfj.LIZIZ(c0lab, "enter_video_edit_page", creativeModel.aigcBusinessModel.aiTheaterModel);
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            c0lab.LJFF("aigc_first_edit", aITheaterModel.getExtraModel().aigcFirstEdit);
            c0lab.LJ("client_task_id", aITheaterModel.getCreationModel().generationModel.getClientTaskId());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return ((C11NZ) obj2).LJLI((C11NZ) obj);
    }

    public static final Object invoke$20(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C548810Lfj.LIZIZ((C0LAB) obj, "click_save_local_on_edit_page", ((CreativeModel) obj2).aigcBusinessModel.aiTheaterModel);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C01GW c01gw = C547160Ld4.LIZ;
        C547160Ld4.LJ(Level.ERROR, C547980LeO.LJFF((CreativeModel) obj), C547300LdI.LIZJ, C548010LeR.LJI, new AwS582S0100000_3((Map) obj2, (Map<String, String>) 121));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        String string;
        C0LAB c0lab = (C0LAB) obj;
        AITheaterModel aITheaterModel = ((CreativeModel) obj2).aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            UsageStatus status = aITheaterModel.getCreationModel().generationModel.getStatus();
            if (status == null || (string = status.toString()) == null) {
                string = "unknown";
            }
            c0lab.LJ("aigc_status", string);
            c0lab.LJ("trace_id", aITheaterModel.getCreationModel().sessionModel.traceId);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.09Gk] */
    public static final Object invoke$23(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        String uid;
        String str;
        ?? BooleanValue;
        ?? r5 = (C2344009Gk) obj;
        Aweme aweme = (Aweme) obj2;
        AITheaterInfo aITheaterInfo = aweme.aiTheaterInfo;
        if (aITheaterInfo != null) {
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser != null) {
                uid = currentUser.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(authorUid, uid)) {
                str = "self";
            } else if (aweme.getAuthor() != null && aweme.getAuthor().getFollowStatus() == 2) {
                str = "friends";
            } else {
                str = "else";
            }
            r5.LJFF("author_user_id", authorUid);
            r5.LJFF("ai_content_source", AwemeExtKt.getAIFunctionType(aweme));
            r5.LJFF("relationship", str);
            Boolean boolIsFirstAISelfAutoCast = aITheaterInfo.isFirstAISelfAutoCast();
            if (boolIsFirstAISelfAutoCast != null) {
                BooleanValue = boolIsFirstAISelfAutoCast.booleanValue();
            } else {
                BooleanValue = 0;
            }
            r5.LIZJ(BooleanValue, "is_first_ai_self_auto_cast");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C0LAB c0lab = (C0LAB) obj;
        CreativeModel creativeModel = (CreativeModel) obj2;
        C548810Lfj.LIZIZ(c0lab, "publish", creativeModel.aigcBusinessModel.aiTheaterModel);
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            c0lab.LJ("aigc_business", "ai_theater");
            c0lab.LJ("server_task_id", aITheaterModel.getCreationModel().generationModel.getServerTaskId());
            c0lab.LJ("client_task_id", aITheaterModel.getCreationModel().generationModel.getClientTaskId());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C548810Lfj.LIZIZ((C0LAB) obj, "enter_video_post_page", ((CreativeModel) obj2).aigcBusinessModel.aiTheaterModel);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C0LAB c0lab = (C0LAB) obj;
        CreativeModel creativeModel = (CreativeModel) obj2;
        C548810Lfj.LIZIZ(c0lab, "publish_finish", creativeModel.aigcBusinessModel.aiTheaterModel);
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            c0lab.LJ("aigc_business", "ai_theater");
            c0lab.LJ("server_task_id", aITheaterModel.getCreationModel().generationModel.getServerTaskId());
            c0lab.LJ("client_task_id", aITheaterModel.getCreationModel().generationModel.getClientTaskId());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C548810Lfj.LIZIZ((C0LAB) obj, "download", ((CreativeModel) obj2).aigcBusinessModel.aiTheaterModel);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C548810Lfj.LIZIZ((C0LAB) obj, "save_draft", ((CreativeModel) obj2).aigcBusinessModel.aiTheaterModel);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        String strLJI;
        InterfaceC550750Lir interfaceC550750LirG9;
        C0LAB c0lab = (C0LAB) obj;
        CreativeModel creativeModel = (CreativeModel) obj2;
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9()) != null) {
            AITheaterCameoMetricsInfo aITheaterCameoMetricsInfoLJIILJJIL = interfaceC550750LirG9.LJIILJJIL();
            if (aITheaterCameoMetricsInfoLJIILJJIL == null || (strLJI = aITheaterCameoMetricsInfoLJIILJJIL.getFaceidCreatedWay()) == null) {
                strLJI = interfaceC550750LirG9.LJI();
            }
        } else {
            strLJI = "";
        }
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            c0lab.LIZ(aITheaterModel.getContextModel().aigcEntranceInfo.isFirstAISelfAutoCast ? 1 : 0, "is_first_ai_self_auto_cast");
            c0lab.LJ("faceid_created_way", strLJI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return C535280Kz0.LIZ((C535280Kz0) obj, C0LJ0.LJIIIIZZ);
    }

    public static final Object invoke$30(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("protocol_");
        sbLIZ.append(iIntValue);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$31(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        String str = ((C0MBC) obj).LJFF;
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("descriptor_");
            sbLIZ.append(iIntValue);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static final Object invoke$32(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        boolean z;
        if ((obj instanceof C0LUA) && (obj2 instanceof C0LUA)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$33(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C0ML7.LIZ.getClass();
        return C0ML7.LJII(iIntValue, (String) obj);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$34(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$35(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$36(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C550360LiE.LIZ((C0LAB) obj, "publish", ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ;
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF;
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ2;
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF2;
        String strLIZ;
        InterfaceC548110Leb interfaceC548110LebLJ;
        CreativeModel creativeModel = (CreativeModel) obj;
        String str = (String) obj2;
        if (creativeModel.aigcBusinessModel.aiPortraitModel == null && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_portrait_from_album_need_anchor", true, true)) {
            return null;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ3 = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ3 == null || !iAIPortraitFeatureServiceLIZ3.isFeatureEnabled() || (iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ()) == null || (iAIPortraitCreationServiceLJFF = iAIPortraitFeatureServiceLIZ.LJFF()) == null || !iAIPortraitCreationServiceLJFF.LIZLLL(creativeModel) || (iAIPortraitFeatureServiceLIZ2 = C547790Le5.LIZ()) == null || (iAIPortraitCreationServiceLJFF2 = iAIPortraitFeatureServiceLIZ2.LJFF()) == null || !iAIPortraitCreationServiceLJFF2.LJFF()) {
            return null;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ4 = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ4 == null || (interfaceC548110LebLJ = iAIPortraitFeatureServiceLIZ4.LJ()) == null || (strLIZ = interfaceC548110LebLJ.LIZ()) == null) {
            strLIZ = "";
        }
        return new CreateAnchorInfo(125, strLIZ, "", "", "", str, Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", "", Boolean.TRUE, true, null, null, false, Integer.valueOf(R.raw.icon_anchor_ai_self_yellow));
    }

    public static final Object invoke$39(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C550360LiE.LIZ((C0LAB) obj, "enter_video_post_page", ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        boolean z;
        if ((obj instanceof C0LUA) && (obj2 instanceof C0LUA)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$40(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C550360LiE.LIZ((C0LAB) obj, "publish_finish", ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C550360LiE.LIZ((C0LAB) obj, "download", ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C550360LiE.LIZ((C0LAB) obj, "save_draft", ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        String str;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        C0LAB c0lab = (C0LAB) obj;
        CreativeModel creativeModel = (CreativeModel) obj2;
        C550360LiE.LIZ(c0lab, "enter_video_edit_page", creativeModel.aigcBusinessModel.aiPortraitModel);
        AIPortraitModel aIPortraitModel = creativeModel.aigcBusinessModel.aiPortraitModel;
        if (aIPortraitModel != null) {
            AIPortraitContextModel aIPortraitContextModel = aIPortraitModel.contextModel;
            if (aIPortraitContextModel == null || (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) == null || (str = aIPortraitGeneratingModel.clientWorkflowId) == null) {
                str = "";
            }
            c0lab.LJ("client_task_id", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C550360LiE.LIZ((C0LAB) obj, "click_save_local_on_edit_page", ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        String strName;
        String str;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        GenerateStatus generateStatus;
        C0LAB c0lab = (C0LAB) obj;
        AIPortraitModel aIPortraitModel = ((CreativeModel) obj2).aigcBusinessModel.aiPortraitModel;
        if (aIPortraitModel != null) {
            AIPortraitContextModel aIPortraitContextModel = aIPortraitModel.contextModel;
            if (aIPortraitContextModel == null || (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) == null || (generateStatus = aIPortraitGeneratingModel.status) == null || (strName = generateStatus.name()) == null) {
                strName = "unknown";
            }
            c0lab.LJ("aigc_status", strName);
            AIPortraitSessionModel aIPortraitSessionModel = aIPortraitModel.sessionModel;
            if (aIPortraitSessionModel == null || (str = aIPortraitSessionModel.traceId) == null) {
                str = "";
            }
            c0lab.LJ("trace_id", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C0ML7.LIZ.getClass();
        return C0ML7.LJII(iIntValue, (String) obj);
    }

    public static final Object invoke$47(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        boolean z;
        C0LSZ c0lsz = (C0LSZ) obj;
        C0LSZ c0lsz2 = (C0LSZ) obj2;
        if (Intrinsics.LJFF(c0lsz.LIZ, c0lsz2.LIZ) && Intrinsics.LJFF(c0lsz.LJ, c0lsz2.LJ) && Intrinsics.LJFF(c0lsz.LJIILIIL, c0lsz2.LJIILIIL) && Intrinsics.LJFF(c0lsz.LJI, c0lsz2.LJI) && Intrinsics.LJFF(c0lsz.LJIIJ, c0lsz2.LJIIJ) && c0lsz.LJIL == c0lsz2.LJIL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$48(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1682930ttb.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC1680500tpg, 6, 1022);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        double dAtan = (float) Math.atan(((Number) obj2).intValue() / ((Number) obj).intValue());
        int i = 0;
        double[] dArr = {dAtan, 3.141592653589793d - dAtan, 3.141592653589793d + dAtan, 6.283185307179586d - dAtan, dAtan + 6.283185307179586d};
        ArrayList arrayList = new ArrayList(5);
        do {
            arrayList.add(Float.valueOf((float) (dArr[i] / 6.283185307179586d)));
            i++;
        } while (i < 5);
        return C13LP.LLI(arrayList);
    }

    public static final Object invoke$6(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        C0LEK c0lek = ((C559610Lx9) obj).LIZ;
        C559610Lx9 c559610Lx9 = new C559610Lx9(c0lek, "generation_loading");
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C550080Lhm.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC550180Lhw.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0lek.LIZIZ("generation_loading", enumC1642750sqn, null, InterfaceC550180Lhw.class, C550080Lhm.class, C550690Lil.class, R.id.itw, enumC371580EhY, new AwS374S0200000_8(new C0ET4(), c559610Lx9, (C19A3) obj2, 227));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Neo] reportDraftSaveFailureToNeo success: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C201955140j.LIZIZ("DraftMonitorService", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$9(AFwS291S0000000_8 aFwS291S0000000_8, Object obj, Object obj2) {
        return Unit.LIZ;
    }
}
