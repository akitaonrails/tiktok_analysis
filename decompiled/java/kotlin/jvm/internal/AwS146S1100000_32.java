package kotlin.jvm.internal;

import X.AnonymousClass1932;
import X.AnonymousClass1933;
import X.C09AY;
import X.C0ET4;
import X.C1168400gVi;
import X.C1325860kbg;
import X.C1347430lAT;
import X.C1357350lQT;
import X.C1389890mGx;
import X.C1659700tI8;
import X.C1851240yH4;
import X.C1892750zM1;
import X.C18NZ;
import X.C18S0;
import X.C18UP;
import X.C18VZ;
import X.C18XG;
import X.C18XL;
import X.C18XT;
import X.C18XX;
import X.C18ZE;
import X.C1909107dp;
import X.C20012313Rx;
import X.C201955140j;
import X.C21266818Kk;
import X.C21295318Vj;
import X.C21301118Xp;
import X.C21301518Xt;
import X.C21301718Xv;
import X.C21322518cR;
import X.C21322818cU;
import X.C21323018cW;
import X.C21323218cY;
import X.C21363018iy;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C375830EoP;
import X.C559610Lx9;
import X.C746760TRa;
import X.C786410Ut5;
import X.C957403oi;
import X.EnumC1642750sqn;
import X.EnumC21266618Ki;
import X.EnumC371580EhY;
import X.EnumC382880Ezm;
import X.EnumC708450Rqd;
import X.InterfaceC21306218Zo;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.slot.LiveShopBagSlotManagerAudience;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.ss.android.ugc.tools.chat.demo.AiChatDemoRootScene;
import com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageInfraComponent;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import com.ss.android.ugc.tools.data.AIChatCallbacks;
import com.ss.android.ugc.tools.data.AIChatFeatureGating;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.ConfirmModal;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS146S1100000_32 extends C09AY implements Function1 {
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
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C259800zU c259800zU, int i) {
        super(1);
        this.$t = i;
        this.s0 = "anchor_capcut";
        this.l1 = c259800zU;
    }

    public static final Object invoke$0(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        LiveShopBagSlotManagerAudience liveShopBagSlotManagerAudience = (LiveShopBagSlotManagerAudience) awS146S1100000_32.l1;
        String str = awS146S1100000_32.s0;
        boolean z = ((C1892750zM1) obj).LIZJ;
        if (!liveShopBagSlotManagerAudience.LJ() && !liveShopBagSlotManagerAudience.LIZLLL()) {
            EnumC21266618Ki.Companion.getClass();
            if (C21266818Kk.LIZIZ(str)) {
                EnumC21266618Ki enumC21266618KiLIZ = C21266818Kk.LIZ(str);
                ((ConcurrentHashMap) liveShopBagSlotManagerAudience.LLIZLLLIL).put(enumC21266618KiLIZ, Boolean.valueOf(z));
                liveShopBagSlotManagerAudience.LIZIZ(false, false, false, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        return C18S0.LIZ((C18S0) obj, null, null, new C375830EoP(new C1851240yH4(awS146S1100000_32.s0, (EnumC382880Ezm) awS146S1100000_32.l1)), null, null, null, null, null, null, null, 4091);
    }

    public static final Object invoke$10(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        boolean z;
        boolean z2;
        C18XL c18xl = (C18XL) obj;
        C18XT c18xt = C18XT.LIZ;
        boolean z3 = ((C18XG) awS146S1100000_32.l1).LIZ;
        if (z3) {
            z = true;
        } else {
            z = false;
            if (!z3) {
                z2 = false;
            }
            return C18XL.LIZ(c18xl, null, null, c18xt, awS146S1100000_32.s0, z2, z, 451);
        }
        z2 = true;
        return C18XL.LIZ(c18xl, null, null, c18xt, awS146S1100000_32.s0, z2, z, 451);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS146S1100000_32 r4, java.lang.Object r5) {
        /*
            android.graphics.SurfaceTexture r5 = (android.graphics.SurfaceTexture) r5
            java.lang.Object r0 = r4.l1
            X.18XX r0 = (X.C18XX) r0
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.LLLIILIL()
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r5)
            r1.setSurface(r0)
            java.lang.Object r3 = r4.l1
            X.18XX r3 = (X.C18XX) r3
            java.lang.String r2 = r4.s0
            com.ss.android.ugc.tools.common.experiment.AiChatDomainSettings r0 = X.C21288518St.LIZ()
            java.lang.String r1 = r0.guideVideoUrl
            if (r2 == 0) goto L53
            r3.getClass()
            boolean r0 = X.C2286708xd.LIZJ(r2)
            if (r0 == 0) goto L53
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setVideoUrl: use local path: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AiChatGuideDialogScene"
            X.C21290818Tq.LIZ(r0, r1)
            com.ss.ttvideoengine.TTVideoEngine r0 = r3.LLLIILIL()
            r0.LJIJ(r2)
        L45:
            java.lang.Object r0 = r4.l1
            X.18XX r0 = (X.C18XX) r0
            com.ss.ttvideoengine.TTVideoEngine r0 = r0.LLLIILIL()
            r0.play()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            com.ss.ttvideoengine.TTVideoEngine r0 = r3.LLLIILIL()
            r0.LJIJI(r1)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS146S1100000_32.invoke$11(kotlin.jvm.internal.AwS146S1100000_32, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode] */
    public static final Object invoke$12(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        boolean z;
        ?? r2 = (FcpPageNode) obj;
        if (r2.isComponentMatch(awS146S1100000_32.s0)) {
            ((C259800zU) awS146S1100000_32.l1).element = r2;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        C21301118Xp c21301118Xp = (C21301118Xp) obj;
        c21301118Xp.LIZ(AFwS278S0000000_32.get$arr$(188));
        AwS135S1100000_21 awS135S1100000_21 = new AwS135S1100000_21((C1347430lAT) awS146S1100000_32.l1, awS146S1100000_32.s0, 17);
        C1357350lQT c1357350lQT = new C1357350lQT();
        awS135S1100000_21.invoke(c1357350lQT);
        AIChatGenPrompt aIChatGenPrompt = c1357350lQT.LIZ;
        ArrayList arrayList = (ArrayList) c1357350lQT.LIZIZ;
        ConfirmModal confirmModal = null;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        c21301118Xp.LIZIZ = new AIChatPayload(aIChatGenPrompt, arrayList);
        c21301118Xp.LIZIZ(new AwS611S0100000_32((C1347430lAT) awS146S1100000_32.l1, 364));
        AFwS278S0000000_32 aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(189);
        C21301718Xv c21301718Xv = new C21301718Xv();
        aFwS278S0000000_32.invoke(c21301718Xv);
        c21301118Xp.LIZLLL = new AIChatFeatureGating(c21301718Xv.LIZ, c21301718Xv.LIZIZ);
        if (Intrinsics.LJFF(((C1347430lAT) awS146S1100000_32.l1).LJ, EnumC708450Rqd.HAS_PHOTO.getValue())) {
            confirmModal = new ConfirmModal(2131829120, 2131829119, 2131829117);
        } else if (Intrinsics.LJFF(((C1347430lAT) awS146S1100000_32.l1).LJ, EnumC708450Rqd.HAS_AUDIO.getValue())) {
            confirmModal = new ConfirmModal(2131826757, 2131826743, 2131829117);
        }
        AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(confirmModal, 365);
        C21301518Xt c21301518Xt = new C21301518Xt();
        awS611S0100000_32.invoke(c21301518Xt);
        c21301118Xp.LJ = new AIChatCallbacks(c21301518Xt.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch template begin: url:");
        sbLIZ.append(awS146S1100000_32.s0);
        sbLIZ.append(",load config :");
        sbLIZ.append(((C21322518cR) awS146S1100000_32.l1).LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        MynaTemplateProtocol mynaTemplateProtocol;
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doCreateTemplateViews url ");
        sbLIZ.append(awS146S1100000_32.s0);
        sbLIZ.append(" templates templateProtocol:");
        C21323018cW c21323018cW = (C21323018cW) awS146S1100000_32.l1;
        if (c21323018cW != null) {
            mynaTemplateProtocol = c21323018cW.LIZ;
        } else {
            mynaTemplateProtocol = null;
        }
        sbLIZ.append(mynaTemplateProtocol);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch template begin: url:");
        sbLIZ.append(awS146S1100000_32.s0);
        sbLIZ.append(",load config :");
        sbLIZ.append(((C21322518cR) awS146S1100000_32.l1).LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        Map<String, ? extends Object> linkedHashMap;
        C957403oi c957403oi = (C957403oi) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) awS146S1100000_32.l1;
        if (c2344009Gk == null || (linkedHashMap = c2344009Gk.LIZ) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        c957403oi.LJ(linkedHashMap);
        c957403oi.LJ(C18NZ.LIZIZ);
        c957403oi.LIZLLL("entrance_form", awS146S1100000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        Map<String, ? extends Object> linkedHashMap;
        C957403oi c957403oi = (C957403oi) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) awS146S1100000_32.l1;
        if (c2344009Gk == null || (linkedHashMap = c2344009Gk.LIZ) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        c957403oi.LJ(linkedHashMap);
        c957403oi.LJ(C18NZ.LIZIZ);
        c957403oi.LIZLLL("entrance_form", awS146S1100000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        Map<String, ? extends Object> linkedHashMap;
        C957403oi c957403oi = (C957403oi) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) awS146S1100000_32.l1;
        if (c2344009Gk == null || (linkedHashMap = c2344009Gk.LIZ) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        c957403oi.LJ(linkedHashMap);
        c957403oi.LJ(C18NZ.LIZIZ);
        c957403oi.LIZLLL("entrance_form", awS146S1100000_32.s0);
        c957403oi.LIZLLL("entrance_type", awS146S1100000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        String str = (String) obj;
        String str2 = awS146S1100000_32.s0;
        if (str2 != null) {
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = ((NewCreatorCaptionEditFragment) awS146S1100000_32.l1).LLILZ;
            if (newCreatorCaptionEditViewModel != null) {
                newCreatorCaptionEditViewModel.LLJJIJI.remove(str2);
            }
            ((NewCreatorCaptionEditFragment) awS146S1100000_32.l1).MR(false);
        }
        C1389890mGx c1389890mGx = new C1389890mGx((NewCreatorCaptionEditFragment) awS146S1100000_32.l1);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        Map<String, ? extends Object> linkedHashMap;
        C957403oi c957403oi = (C957403oi) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) awS146S1100000_32.l1;
        if (c2344009Gk == null || (linkedHashMap = c2344009Gk.LIZ) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        c957403oi.LJ(linkedHashMap);
        c957403oi.LJ(C18NZ.LIZIZ);
        c957403oi.LIZLLL("entrance_form", awS146S1100000_32.s0);
        c957403oi.LIZLLL("entrance_type", awS146S1100000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gecko success, from ");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LIZ);
        sbLIZ.append(" , gecko version:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LIZJ);
        sbLIZ.append(", fetcher:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LJII);
        sbLIZ.append(", url:");
        sbLIZ.append(awS146S1100000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        String str;
        C21322818cU c21322818cU = (C21322818cU) obj;
        try {
            if (c21322818cU.LIZIZ) {
                C1168400gVi.LIZ(new AwS146S1100000_32(c21322818cU, awS146S1100000_32.s0, 21));
                byte[] bArr = c21322818cU.LIZLLL;
                if (bArr != null) {
                    str = new String(bArr, Charsets.UTF_8);
                    if (!a0.LJJJIL(str)) {
                        ((Function1) awS146S1100000_32.l1).invoke(new C21323218cY(str, null, null, null, c21322818cU, false, 46));
                    }
                } else {
                    str = null;
                }
                Function1 function1 = (Function1) awS146S1100000_32.l1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("read content failed:");
                sbLIZ.append(awS146S1100000_32.s0);
                sbLIZ.append(",jsonStr:");
                sbLIZ.append(str);
                function1.invoke(new C21323218cY(null, C2188811AlT.LIZIZ(sbLIZ), null, "read_content", c21322818cU, false, 37));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("doGetGeckoResourceAsync failed: ");
                sbLIZ2.append(c21322818cU.LJIIIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                C1168400gVi.LIZIZ(new AwS277S0000000_32(strLIZIZ, 2));
                ((Function1) awS146S1100000_32.l1).invoke(new C21323218cY(null, strLIZIZ, null, "response_err", c21322818cU, false, 37));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1168400gVi.LIZIZ(new AwS398S0200000_32(th, c21322818cU, 105));
            C1325860kbg.LJFF(th, th.getMessage());
            Function1 function12 = (Function1) awS146S1100000_32.l1;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("request failed:");
            sbLIZ3.append(awS146S1100000_32.s0);
            function12.invoke(new C21323218cY(null, C2188811AlT.LIZIZ(sbLIZ3), th, "request_unknown_err", null, false, 49));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gecko success, from ");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LIZ);
        sbLIZ.append(", gecko version:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LIZJ);
        sbLIZ.append(", fetcher:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LJII);
        sbLIZ.append(", url:");
        sbLIZ.append(awS146S1100000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gecko failed:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LJIIIZ);
        sbLIZ.append(", gecko version:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LIZJ);
        sbLIZ.append(", fetcher:");
        sbLIZ.append(((C21322818cU) awS146S1100000_32.l1).LJII);
        sbLIZ.append(",url:");
        sbLIZ.append(awS146S1100000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        String str = awS146S1100000_32.s0;
        CompletionBlock completionBlock = (CompletionBlock) awS146S1100000_32.l1;
        InterfaceC21306218Zo interfaceC21306218Zo = (InterfaceC21306218Zo) C1909107dp.LIZJ(InterfaceC21306218Zo.class, str);
        interfaceC21306218Zo.setStatus((String) obj);
        completionBlock.onSuccess(interfaceC21306218Zo, "");
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        String creationId = new CreativeInfo(null, 0, null, 7, null).getCreationId();
        CreationChatRoomEnterParams creationChatRoomEnterParams = new CreationChatRoomEnterParams((String) obj, creationId, creationId, UUID.randomUUID().toString(), "notification", "notification_page", awS146S1100000_32.s0, "notification_page", null, "unknow", null, null, null, null);
        C18UP.LIZ.getClass();
        C18UP.LJIILJJIL(creationChatRoomEnterParams, null);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS146S1100000_32.l1, "//creation/chat/host");
        smartRouteBuildRoute.withParam("enter_params", creationChatRoomEnterParams);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        C746760TRa.LIZ().LJLJJLL(awS146S1100000_32.s0);
        ((NewCreatorCaptionEditFragment) awS146S1100000_32.l1).RR().LJI(((NewCreatorCaptionEditFragment) awS146S1100000_32.l1).SR());
        C1389890mGx c1389890mGx = new C1389890mGx((NewCreatorCaptionEditFragment) awS146S1100000_32.l1);
        c1389890mGx.LJIIIZ(2131833212);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        ((NewCreatorCaptionEditFragment) awS146S1100000_32.l1).RR().LJ++;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        AnonymousClass1933.LIZJ((AnonymousClass1932) awS146S1100000_32.l1, awS146S1100000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            String strLIZIZ = C21363018iy.LIZIZ(((BackgroundVideoStickerPresenter) awS146S1100000_32.l1).LLJLLL, awS146S1100000_32.s0, true);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sending message to effect: ");
            sbLIZ.append(strLIZIZ);
            C201955140j.LIZLLL(c20012313Rx, "BackgroundVideoStickerPresenter", C2188811AlT.LIZIZ(sbLIZ));
            ((BackgroundVideoStickerPresenter) awS146S1100000_32.l1).LLILZLL.get().LJIIJ(0L, strLIZIZ);
        } else {
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "BackgroundVideoStickerPresenter", "Transcoding image failed");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("change_avatar", true);
        C786410Ut5.LJJJI("origin_avatar_url", awS146S1100000_32.s0, bundle);
        if (!TextUtils.isEmpty((String) ((CropActivity) awS146S1100000_32.l1).LLLLII.getValue())) {
            str = (String) ((CropActivity) awS146S1100000_32.l1).LLLLII.getValue();
        } else {
            str = "click_save";
        }
        C786410Ut5.LJJJI("realEnterMethod", str, bundle);
        C786410Ut5.LJJJI("enter_method", "preview_post", bundle);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        C559610Lx9 c559610Lx9 = (C559610Lx9) obj;
        AiChatDemoRootScene aiChatDemoRootScene = (AiChatDemoRootScene) awS146S1100000_32.l1;
        String str = awS146S1100000_32.s0;
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(AiChatMessageInfraComponent.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(AiChatMessageInfraApi.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c559610Lx9.LIZ.LIZIZ(c559610Lx9.LIZIZ, enumC1642750sqn, null, AiChatMessageInfraApi.class, AiChatMessageInfraComponent.class, C18ZE.class, R.id.o9m, enumC371580EhY, new AwS98S1200000_14(new C0ET4(), c559610Lx9, aiChatDemoRootScene, str, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        return C21295318Vj.LIZ(((C18VZ) awS146S1100000_32.l1).T2(), null, null, null, null, new C375830EoP(awS146S1100000_32.s0), null, 95);
    }

    public static final Object invoke$9(AwS146S1100000_32 awS146S1100000_32, Object obj) {
        return C21295318Vj.LIZ(((C18VZ) awS146S1100000_32.l1).T2(), null, null, awS146S1100000_32.s0, null, null, null, 119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C2344009Gk c2344009Gk, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2344009Gk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C1347430lAT c1347430lAT, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1347430lAT;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C18VZ c18vz, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c18vz;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C18XG c18xg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c18xg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C18XX c18xx, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c18xx;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(C21322818cU c21322818cU, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21322818cU;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(AnonymousClass1932 anonymousClass1932, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = anonymousClass1932;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(LiveShopBagSlotManagerAudience liveShopBagSlotManagerAudience, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = liveShopBagSlotManagerAudience;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(CompletionBlock completionBlock, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(NewCreatorCaptionEditFragment newCreatorCaptionEditFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = newCreatorCaptionEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(AiChatDemoRootScene aiChatDemoRootScene, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aiChatDemoRootScene;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, EnumC382880Ezm enumC382880Ezm, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC382880Ezm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, C21322518cR c21322518cR, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c21322518cR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, C21323018cW c21323018cW, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c21323018cW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = backgroundVideoStickerPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, CropActivity cropActivity, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = cropActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S1100000_32(String str, AwS9S1310000_32 awS9S1310000_32, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS9S1310000_32;
        this.s0 = str;
    }
}
