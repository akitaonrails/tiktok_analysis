package kotlin.jvm.internal;

import X.C05OE;
import X.C05OG;
import X.C06HP;
import X.C06HR;
import X.C09AY;
import X.C1388190mED;
import X.C1389910mGz;
import X.C1397505dV;
import X.C1397605dW;
import X.C1397705dX;
import X.C13IQ;
import X.C1465410oEl;
import X.C15579068b;
import X.C1590906Kt;
import X.C1651406dM;
import X.C1651706dP;
import X.C1664806fW;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC1665006fY;
import X.InterfaceC1638406bG;
import X.InterfaceC366450EYh;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS151S1100000_2 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("defer body visible, data not committed yet, reason=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("defer body visible, first fetch supplement pending, reason=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: [WidgetsInfo] widgetsMap PUT_ALL: added ");
        sbLIZ.append(((Map) awS151S1100000_2.l1).size());
        sbLIZ.append(" widgets [");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS151S1100000_2 awS151S1100000_2) {
        boolean z;
        if (!((SessionInfo) awS151S1100000_2.l1).hasChatHistory() && !MessageAfterFollowBackKeva.LIZIZ.LIZJ(awS151S1100000_2.s0)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$12(AwS151S1100000_2 awS151S1100000_2) {
        C1590906Kt.LIZ("StreakWheeDriveTrafficAssem onCardActuallyDismiss");
        StreakWheeDriveTrafficAssem streakWheeDriveTrafficAssem = (StreakWheeDriveTrafficAssem) ((WeakReference) awS151S1100000_2.l1).get();
        if (streakWheeDriveTrafficAssem != null) {
            streakWheeDriveTrafficAssem.LLILZ = false;
        }
        C06HP.LIZ(awS151S1100000_2.s0, C06HR.NOT_SHOWING);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inspectResetSectionItemView unloadAssem:");
        sbLIZ.append((C13IQ) awS151S1100000_2.l1);
        sbLIZ.append(",assemTag:");
        sbLIZ.append(awS151S1100000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleSectionItem instanceId:");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(", assem:");
        sbLIZ.append((C13IQ) awS151S1100000_2.l1);
        sbLIZ.append(", not alive");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS151S1100000_2 awS151S1100000_2) {
        String str = awS151S1100000_2.s0;
        if (str != null) {
            ((Function1) awS151S1100000_2.l1).invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS151S1100000_2 awS151S1100000_2) {
        Function1 function1 = (Function1) awS151S1100000_2.l1;
        String str = awS151S1100000_2.s0;
        if (str != null) {
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpServiceAssem receive outreach timing callback. timing#: ");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(". condition: ");
        sbLIZ.append((Map) awS151S1100000_2.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inspectResetCellItemView unloadAssem:");
        sbLIZ.append((C13IQ) awS151S1100000_2.l1);
        sbLIZ.append(",assemTag:");
        sbLIZ.append(awS151S1100000_2.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$19(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("id: ");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(" url: ");
        sbLIZ.append(((MusicModel) awS151S1100000_2.l1).getUrl().getUrlList());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseFirstFetchSupplementLoadingHoldUi skip (not active) reason=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$20(AwS151S1100000_2 awS151S1100000_2) {
        C05OG c05og = C05OG.LIZ;
        String str = awS151S1100000_2.s0;
        Function0 function0 = (Function0) awS151S1100000_2.l1;
        c05og.getClass();
        C23250099c.LIZLLL((InterfaceC497601wk) C05OG.LJ.getValue(), null, null, new C05OE(str, function0, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS151S1100000_2 awS151S1100000_2) {
        ICommonChatNoticeViewModel value = ((C1651406dM) awS151S1100000_2.l1).LLILZLL.LIZLLL.getValue();
        if (value != null) {
            value.MQ2(awS151S1100000_2.s0);
        }
        C1651706dP.LIZJ().storeInt(C1651706dP.LIZIZ(), C1651706dP.LIZJ().getInt(C1651706dP.LIZIZ(), 0) + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS151S1100000_2 awS151S1100000_2) {
        Window window;
        View decorView;
        final Activity activityLIZ = C1388190mED.LIZ((Context) awS151S1100000_2.l1);
        if (activityLIZ != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            View viewFindViewById = decorView.findViewById(R.id.viewpager);
            if (viewFindViewById != null) {
                viewFindViewById.getGlobalVisibleRect(rect2);
            }
            int iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            C1389910mGz c1389910mGz = new C1389910mGz(activityLIZ);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LIZ.LIZIZ = 0;
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(iLIZIZ);
            c1389910mGz.LIZ.LIZLLL = 2;
            c1389910mGz.LJIIIZ(2131824817);
            c1389910mGz.LJFF(2131824806);
            final String str = awS151S1100000_2.s0;
            c1389910mGz.LIZ.LJIIIIZZ = new View.OnClickListener() { // from class: X.06bC
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://story/detail");
                    smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_COMMON");
                    smartRouteBuildRoute.withParam("enter_from", "comment_to_story");
                    smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, curUserId);
                    smartRouteBuildRoute.open();
                    String str2 = str;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    c2344009Gk.LJIIIIZZ("enter_method", str2);
                    C20684815ws.LJIILLIIL("comment_to_story_toast", c2344009Gk.LIZ);
                }
            };
            c1389910mGz.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS151S1100000_2 awS151S1100000_2) {
        C1664806fW.LIZIZ.LIZJ(new Pair(awS151S1100000_2.s0, (EnumC1665006fY) awS151S1100000_2.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement skip defer body visibility, restore not pending, source=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$25(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement skip defer body visibility, adapter is null, source=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$26(AwS151S1100000_2 awS151S1100000_2) {
        ((InterfaceC1638406bG) awS151S1100000_2.l1).LIZ(2, awS151S1100000_2.s0);
        C1651706dP.LIZJ().storeInt(C1651706dP.LIZIZ(), C1651706dP.LIZJ().getInt(C1651706dP.LIZIZ(), 0) + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS151S1100000_2 awS151S1100000_2) {
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = ((C1465410oEl) awS151S1100000_2.l1).LJIJJ();
        if (interfaceC366450EYhLJIJJ != null) {
            interfaceC366450EYhLJIJJ.jV(true);
        }
        ((C1465410oEl) awS151S1100000_2.l1).LJIILJJIL.LJIIJ(new Pair<>(awS151S1100000_2.s0, Boolean.TRUE));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS151S1100000_2 awS151S1100000_2) {
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = ((C1465410oEl) awS151S1100000_2.l1).LJIJJ();
        if (interfaceC366450EYhLJIJJ != null) {
            interfaceC366450EYhLJIJJ.jV(false);
        }
        ((C1465410oEl) awS151S1100000_2.l1).LJIILJJIL.LJIIJ(new Pair<>(awS151S1100000_2.s0, Boolean.FALSE));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restore body visible, reason=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement restore fallback post, viewTreeObserver not alive, source=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement restore fallback immediately, bodyList is null, source=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishSupplementWaitingByInsert defer releaseFirstFetchSupplementLoadingHoldUi until preDraw post, source=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS151S1100000_2.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS151S1100000_2 awS151S1100000_2) {
        boolean z = true;
        if (!((SessionInfo) awS151S1100000_2.l1).hasChatHistory()) {
            IIMLightInteractService.IMessageAfterFollowBackKeva.LIZ.getClass();
            IIMLightInteractService.IMessageAfterFollowBackKeva value = C15579068b.LIZIZ.getValue();
            if (value == null || !value.LIZJ(awS151S1100000_2.s0)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[StoreMergeEnd] check=store_rebuilt_final_items updateId=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(" finalSections=");
        sbLIZ.append(C1397605dW.LJFF(10, ((C1397505dV) awS151S1100000_2.l1).LIZ));
        sbLIZ.append(" finalItemCount=");
        sbLIZ.append(((C1397505dV) awS151S1100000_2.l1).LIZIZ.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS151S1100000_2 awS151S1100000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[StoreSectionAppend] check=new_section_id_appended updateId=");
        sbLIZ.append(awS151S1100000_2.s0);
        sbLIZ.append(" action=append sectionId=");
        sbLIZ.append(((C1397705dX) awS151S1100000_2.l1).LIZ);
        sbLIZ.append(" newItems=");
        sbLIZ.append(C1397605dW.LIZJ(10, ((C1397705dX) awS151S1100000_2.l1).LIZLLL));
        sbLIZ.append(" sticky=");
        sbLIZ.append(((C1397705dX) awS151S1100000_2.l1).LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS151S1100000_2(java.lang.String r3, X.C13IQ r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 13: goto Lf;
                case 18: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS151S1100000_2.<init>(java.lang.String, X.13IQ, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS151S1100000_2(java.lang.String r3, java.lang.String r4, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 15 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r4
            r1.s0 = r3
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS151S1100000_2.<init>(java.lang.String, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(InterfaceC1638406bG interfaceC1638406bG, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1638406bG;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(C1651406dM c1651406dM, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1651406dM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(C1465410oEl c1465410oEl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1465410oEl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(RavenFragment ravenFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(SessionInfo sessionInfo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = sessionInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(MusicModel musicModel, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(String str, C1397505dV c1397505dV, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1397505dV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(String str, C1397705dX c1397705dX, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1397705dX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S1100000_2(String str, EnumC1665006fY enumC1665006fY, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC1665006fY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S1100000_2(String str, String str2, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S1100000_2(String str, String str2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S1100000_2(WeakReference weakReference, WeakReference<StreakWheeDriveTrafficAssem> weakReference2, String str) {
        super(0);
        this.$t = str;
        this.l1 = weakReference;
        this.s0 = weakReference2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS151S1100000_2(Map map, Map<? extends Integer, ? extends Pair<? extends View, SearchBffItem>> map2, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }
}
