package kotlin.jvm.internal;

import X.AbstractC1542200qEc;
import X.C09AY;
import X.C0TCX;
import X.C0UC5;
import X.C0UCF;
import X.C0UEH;
import X.C0UJW;
import X.C0UOJ;
import X.C1113800f5e;
import X.C1350920lG6;
import X.C1389890mGx;
import X.C1397620mTQ;
import X.C1833570xoZ;
import X.C1852920yJm;
import X.C1942207jA;
import X.C19EG;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C354201Zc;
import X.C497740JfY;
import X.C703302op;
import X.C759810TrH;
import X.C760050Trf;
import X.C770770ULj;
import X.C785230UrB;
import X.C785270UrF;
import X.C924790aAn;
import X.EnumC1120860fH2;
import X.InterfaceC254600ye;
import X.InterfaceC769000UEo;
import X.InterfaceC772390URp;
import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerChangeEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes13.dex */
public class AwS126S1100000_12 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        if (C703302op.LIZ(C1852920yJm.LIZ.helpPageUrl)) {
            C1942207jA.LIZ(((TextView) awS126S1100000_12.l1).getContext(), awS126S1100000_12.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        final String str = awS126S1100000_12.s0;
        final C760050Trf c760050Trf = (C760050Trf) awS126S1100000_12.l1;
        ((SparkContext) obj).LJJJJZI(new AbstractC1542200qEc() { // from class: X.0Tre
            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) throws JSONException {
                String str4 = str;
                C760050Trf c760050Trf2 = c760050Trf;
                if (str3 == null) {
                    str3 = "onLoadUnknownFailed";
                }
                HashMap map = new HashMap();
                map.put("event_page", c760050Trf2.LJFF);
                map.put("report_type", "report_effect");
                w.LIZ.getClass();
                map.put("small_picture_order", w.LJJI());
                map.put("live_window_mode", w.LJIILLIIL());
                if (C497740JfY.LJIL()) {
                    map.put("room_orientation", "portrait");
                } else {
                    map.put("room_orientation", "landscape");
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("enter_from", c760050Trf2.LIZJ);
                jSONObject.put("enter_method", c760050Trf2.LIZLLL);
                jSONObject.put("use_spark", true);
                jSONObject.put("report_url", str4);
                jSONObject.put("fail_reason", str3);
                C1CC2.LJIIL(0, "ttlive_live_report_load_fail", jSONObject);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        LiveEffect liveEffect = (LiveEffect) obj;
        InterfaceC769000UEo interfaceC769000UEo = (InterfaceC769000UEo) awS126S1100000_12.l1;
        String str = awS126S1100000_12.s0;
        if (liveEffect != null) {
            C0UEH.LJFF(liveEffect, interfaceC769000UEo, new AwS126S1100000_12(liveEffect, str, 9));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[PHI: r4
      0x0013: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:9:0x0011, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[PHI: r4
      0x001b: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String), (r4v4 java.lang.String) binds: [B:9:0x0011, B:11:0x0015, B:13:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[PHI: r4 r6
      0x001e: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:15:0x001c, B:13:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:15:0x001c, B:13:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS126S1100000_12 r7, java.lang.Object r8) {
        /*
            tikcast.linkmic.controller.GenRTCInfoResp r8 = (tikcast.linkmic.controller.GenRTCInfoResp) r8
            com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo r1 = r8.info
            java.lang.String r5 = ""
            if (r1 == 0) goto L10
            com.bytedance.android.livesdk.model.message.linkcore.RTCEngineConfig r0 = r1.config
            if (r0 == 0) goto L10
            java.lang.String r4 = r0.rtcUserId
            if (r4 != 0) goto L13
        L10:
            r4 = r5
            if (r1 == 0) goto L1b
        L13:
            com.bytedance.android.livesdk.model.message.linkcore.RTCEngineConfig r0 = r1.config
            if (r0 == 0) goto L1b
            java.lang.String r6 = r0.rtcToken
            if (r6 != 0) goto L1e
        L1b:
            r6 = r5
            if (r1 == 0) goto L27
        L1e:
            com.bytedance.android.livesdk.model.message.linkcore.RTCEngineConfig r0 = r1.config
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.rtcAppId
            if (r0 == 0) goto L27
            r5 = r0
        L27:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r3 = ",rtcRoomId= "
            if (r0 != 0) goto L79
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L79
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L79
            java.lang.Object r0 = r7.l1
            X.0TCX r0 = (X.C0TCX) r0
            java.lang.Long r1 = r0.LJFF
            java.lang.String r0 = "source getRtcInfo success"
            X.C742860TCa.LIZIZ(r1, r0)
            X.0TCb r1 = new X.0TCb
            java.lang.String r0 = r7.s0
            r0.toString()
            r1.<init>(r4, r6, r0, r5)
            java.lang.Object r0 = r7.l1
            X.0TCX r0 = (X.C0TCX) r0
            X.11PQ<X.0TCb> r0 = r0.LJIIIIZZ
            r0.onNext(r1)
            java.lang.String r2 = X.C0TCX.LJIILJJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "rtcUid id = "
            r1.append(r0)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = r7.s0
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r2, r0)
        L76:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L79:
            java.lang.String r2 = X.C0TCX.LJIILJJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "params error rtcUid id = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ",rtcToken = "
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = r7.s0
            r1.append(r0)
            java.lang.String r0 = ",rtcAppId= "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJ(r2, r0)
            java.lang.Object r0 = r7.l1
            X.0TCX r0 = (X.C0TCX) r0
            java.lang.Long r1 = r0.LJFF
            java.lang.String r0 = "source getRtcInfo failed params error"
            X.C742860TCa.LIZIZ(r1, r0)
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS126S1100000_12.invoke$11(kotlin.jvm.internal.AwS126S1100000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$12(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        String aid;
        String str = awS126S1100000_12.s0;
        Aweme aweme = (Aweme) awS126S1100000_12.l1;
        String authorUid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        String str2 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        Aweme aweme2 = (Aweme) awS126S1100000_12.l1;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str2 = aid;
        }
        C1350920lG6.LJII(str, "cancel", authorUid, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        ((C770770ULj) obj).LIZIZ = true;
        C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
        String str = awS126S1100000_12.s0;
        c1833570xoZ.getClass();
        C1833570xoZ.LIZJ(str, "click", "confirm");
        C759810TrH.LIZ((C19EG) awS126S1100000_12.l1, awS126S1100000_12.s0, "click_pop");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        Long lValueOf = (Long) obj;
        if (lValueOf != null && !C0UOJ.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" - ");
            sbLIZ.append(awS126S1100000_12.s0);
            sbLIZ.append(" - it.anchorGoLiveDays: ");
            sbLIZ.append(lValueOf);
            C20441214yg.LIZIZ("test_lzk_dynamic", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC772390URp.g.LJFF(lValueOf);
            InterfaceC772390URp.h.LJFF(Long.valueOf(C0UOJ.LJFF));
            if (lValueOf.longValue() == -1) {
                lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" - ");
            sbLIZ2.append(awS126S1100000_12.s0);
            sbLIZ2.append(" - LiveBroadcastPreviewFragment init observeSticky");
            C20441214yg.LIZIZ("test_lzk_dynamic", C2188811AlT.LIZIZ(sbLIZ2));
            C0UOJ.LJ(lValueOf.longValue(), new AwS97S1000000_12(awS126S1100000_12.s0, 1));
        }
        ((Function0) awS126S1100000_12.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        LiveMode liveMode;
        DataChannel dataChannel = ((PreviewSettingWidget) awS126S1100000_12.l1).dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LJFF(liveMode) && C0UJW.LIZ) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C785230UrB c785230UrB = new C785230UrB(((PreviewSettingWidget) awS126S1100000_12.l1).contentView);
            c785230UrB.LJIJJ = C497740JfY.LJIJI(2131852619);
            final String str = awS126S1100000_12.s0;
            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0TpI
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    C20337914i1<Map<String, Boolean>> c20337914i1 = C0UKZ.LLILL;
                    Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                    mapLIZIZ.put(str, Boolean.TRUE);
                    c20337914i1.LJFF(mapLIZIZ);
                }
            };
            c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.REVISION_BOARD_IN_SETTING, ((PreviewSettingWidget) awS126S1100000_12.l1).dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131837159, new AwS117S1100000_3((BaseActivity) awS126S1100000_12.l1, awS126S1100000_12.s0, 1));
        c1397620mTQ.LJII(2131837158, AFwS245S0000000_12.get$arr$(72));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        String str = (String) obj;
        C19EG activity = ((ProfileEditFragment) awS126S1100000_12.l1).getActivity();
        if (activity != null) {
            ProfileEditFragment profileEditFragment = (ProfileEditFragment) awS126S1100000_12.l1;
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(profileEditFragment.getString(2131850169, profileEditFragment.getString(2131822635)));
            c1389890mGx.LJIIJJI();
        }
        ((ProfileEditFragment) awS126S1100000_12.l1).UR(false);
        ProfileEditFragment profileEditFragment2 = (ProfileEditFragment) awS126S1100000_12.l1;
        String str2 = awS126S1100000_12.s0;
        profileEditFragment2.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "lemon8");
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("social_account_bind_failure", c2344009Gk.LIZ);
        ((ProfileEditFragment) awS126S1100000_12.l1).getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("error_code", str);
        C20684815ws.LJIILLIIL("show_social_account_bind_failure_toast", c2344009Gk2.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        Context context = (Context) obj;
        if (awS126S1100000_12.s0 != null) {
            SmartRouter.buildRoute(context, UriProtector.parse("aweme://webview/").buildUpon().appendQueryParameter("url", UriProtector.parse(awS126S1100000_12.s0).buildUpon().build().toString()).build().toString()).open();
        } else {
            TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
            if (C703302op.LIZ(takoInfoModel.helpPageUrl)) {
                Uri.Builder builderBuildUpon = UriProtector.parse("aweme://webview/").buildUpon();
                String str = awS126S1100000_12.s0;
                if (str == null) {
                    str = takoInfoModel.helpPageUrl;
                }
                SmartRouter.buildRoute(context, builderBuildUpon.appendQueryParameter("url", UriProtector.parse(str).buildUpon().appendQueryParameter("bot_name", takoInfoModel.botName).build().toString()).build().toString()).open();
            }
        }
        Function0 function0 = (Function0) awS126S1100000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        SmartRouter.buildRoute(((SubscriptionAdPageActivity) awS126S1100000_12.l1).getContext(), awS126S1100000_12.s0).open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "3");
        c2344009Gk.LIZJ(0, "click_value");
        C20684815ws.LJIILLIIL("click_tt_plus_benefit_dscpt", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        C924790aAn.LIZLLL().LJFF = (LiveEffect) awS126S1100000_12.l1;
        C0UC5 c0uc5 = C0UC5.LIZ;
        c0uc5.LJIIJ((LiveEffect) obj, C0UEH.LIZIZ);
        c0uc5.LIZJ((LiveEffect) awS126S1100000_12.l1, C0UEH.LIZIZ, 0, false, awS126S1100000_12.s0);
        c0uc5.LJ((LiveEffect) awS126S1100000_12.l1, C0UEH.LIZIZ, 0, awS126S1100000_12.s0);
        DataChannel dataChannel = C0UEH.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestSelectedStickerEvent.class, new C0UCF((LiveEffect) awS126S1100000_12.l1, "liveinteract", "", false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS126S1100000_12 awS126S1100000_12, Object obj) {
        DataChannel dataChannel = C0UEH.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(GuestManagePanelStickerChangeEvent.class, (LiveEffect) awS126S1100000_12.l1);
        }
        C0UC5.LIZ.LIZJ((LiveEffect) awS126S1100000_12.l1, C0UEH.LIZIZ, 0, false, awS126S1100000_12.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(C0TCX c0tcx, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0tcx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(InterfaceC769000UEo interfaceC769000UEo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC769000UEo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(C19EG c19eg, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(PreviewSettingWidget previewSettingWidget, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = previewSettingWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(LiveEffect liveEffect, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = liveEffect;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(BaseActivity baseActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = baseActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(SubscriptionAdPageActivity subscriptionAdPageActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = subscriptionAdPageActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(TuxTextView tuxTextView, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(ProfileEditFragment profileEditFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = profileEditFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(String str, C760050Trf c760050Trf, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c760050Trf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1100000_12(String str, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S1100000_12(String str, String str2, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }
}
