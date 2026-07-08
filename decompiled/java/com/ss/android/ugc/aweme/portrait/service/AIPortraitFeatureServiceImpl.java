package com.ss.android.ugc.aweme.portrait.service;

import X.C0C64;
import X.C0CHQ;
import X.C0MOC;
import X.C201955140j;
import X.C568820MSq;
import X.InterfaceC535110Kyj;
import X.InterfaceC548110Leb;
import X.InterfaceC550350LiD;
import X.InterfaceC707110RoT;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.AIPortraitInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitCreationServiceImpl;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitGeneration;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitProfileParam;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitFeatureServiceImpl implements IAIPortraitFeatureService {
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final IAIPortraitLauncher LIZ() {
        return new C568820MSq();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC707110RoT LIZIZ() {
        return new InterfaceC707110RoT() { // from class: X.0MOB
            @Override // X.InterfaceC707110RoT
            public final boolean LIZ(CreativeModel creativeModel) {
                IAIPortraitFeatureService.LIZ.getClass();
                IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                if (iAIPortraitFeatureServiceLIZ != null && iAIPortraitFeatureServiceLIZ.isFeatureEnabled() && new AIPortraitCreationServiceImpl().LIZLLL(creativeModel)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC707110RoT
            public final boolean LIZIZ(Aweme aweme) {
                AIPortraitInfo aIPortraitInfo;
                if (aweme != null) {
                    aIPortraitInfo = aweme.aiPortraitInfo;
                } else {
                    aIPortraitInfo = null;
                }
                if (aIPortraitInfo == null) {
                    return false;
                }
                IAIPortraitFeatureService.LIZ.getClass();
                IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC707110RoT
            public final Bitmap LIZJ(Context context, Bitmap bitmap) {
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                Canvas canvas = new Canvas(bitmapCopy);
                FrameLayout frameLayout = new FrameLayout(context) { // from class: X.038Z
                    {
                        super(context, null, 0);
                        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.nb, this, true);
                    }
                };
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                frameLayout.draw(new Canvas(bitmapCreateBitmap));
                float fLIZIZ = C418440Gaw.LIZIZ(750);
                float fMin = Math.min(bitmapCopy.getWidth() / fLIZIZ, bitmapCopy.getHeight() / fLIZIZ);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                Matrix matrix = new Matrix();
                matrix.postScale(fMin, fMin);
                matrix.postTranslate(0.0f, 0.0f);
                canvas.drawBitmap(bitmapCreateBitmap, matrix, paint);
                canvas.save();
                canvas.restore();
                return bitmapCopy;
            }

            @Override // X.InterfaceC707110RoT
            public final boolean LIZLLL(int i, Aweme aweme) {
                AIPortraitInfo aIPortraitInfo;
                List<Long> imageAIIndexList;
                if (aweme == null || (aIPortraitInfo = aweme.aiPortraitInfo) == null || (imageAIIndexList = aIPortraitInfo.getImageAIIndexList()) == null) {
                    return false;
                }
                for (Long l : imageAIIndexList) {
                    if (l.longValue() == i) {
                        if (l == null) {
                            return false;
                        }
                        IAIPortraitFeatureService.LIZ.getClass();
                        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                        if (iAIPortraitFeatureServiceLIZ == null || !iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
                            return false;
                        }
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC550350LiD LIZLLL() {
        return new InterfaceC550350LiD() { // from class: X.0LvH
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(504));

            @Override // X.InterfaceC550350LiD
            public final boolean LIZ() {
                return ((Keva) this.LIZ.getValue()).getBoolean("is_first_enter", true);
            }

            @Override // X.InterfaceC550350LiD
            public final void LIZIZ() {
                ((Keva) this.LIZ.getValue()).storeBoolean("is_first_enter", false);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC548110Leb LJ() {
        return new InterfaceC548110Leb() { // from class: X.0LeT
            @Override // X.InterfaceC548110Leb
            public final void LIZIZ() {
                C547860LeC.LIZ.getClass();
                C547860LeC.LJI().LIZIZ(Collections.singletonList("ai_portrait_creation_img_res"));
            }

            @Override // X.InterfaceC548110Leb
            public final String LIZ() {
                return C555520LqY.LIZIZ(2131825780);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final IAIPortraitCreationService LJFF() {
        return new AIPortraitCreationServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final IAIPortraitDraftService LJI() {
        return new AIPortraitDraftServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final InterfaceC535110Kyj LJII() {
        return new C0MOC();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final AIPortraitEventService LJIIIIZZ() {
        return new AIPortraitEventService() { // from class: X.0u0O
            public static C1687160u0Q LIZ(AIPortraitGeneration aIPortraitGeneration) {
                return new C1687160u0Q(aIPortraitGeneration.entranceInfo, aIPortraitGeneration.creationId, aIPortraitGeneration.entranceTemplateId, aIPortraitGeneration.entranceTemplateType, aIPortraitGeneration.entranceTemplatePos, aIPortraitGeneration.entranceTemplateStatus, aIPortraitGeneration.isRefImage(), aIPortraitGeneration.promptSource, aIPortraitGeneration.promptLength, aIPortraitGeneration.enterWay, aIPortraitGeneration.isRegenerate(), aIPortraitGeneration.actionType, aIPortraitGeneration.eventPage, aIPortraitGeneration.stayTime, aIPortraitGeneration.serverTaskId, aIPortraitGeneration.oriTplTp, aIPortraitGeneration.oriTplPos);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final Pair<String, Map<String, String>> buildGenerationStartMob(AIPortraitGeneration aIPortraitGeneration) {
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                C1687160u0Q c1687160u0QLIZ = LIZ(aIPortraitGeneration);
                c1687150u0P.getClass();
                return C1687150u0P.LJI(c1687160u0QLIZ);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportEditProfileEntranceClick(AIPortraitProfileParam aIPortraitProfileParam) {
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                AIGCEntranceInfo aIGCEntranceInfo = aIPortraitProfileParam.entranceInfo;
                C1687170u0R c1687170u0R = new C1687170u0R(aIGCEntranceInfo, aIPortraitProfileParam.creationId, aIPortraitProfileParam.sceneName, aIPortraitProfileParam.textType, aIPortraitProfileParam.eventPage, aIPortraitProfileParam.cameoCreationId);
                c1687150u0P.getClass();
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C1E3A c1e3a = C1E3A.LJIIIIZZ;
                AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(c1687170u0R, 573);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c1e3a, aIGCEntranceInfo, awS587S0100000_8);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportEditProfileEntranceShow(AIPortraitProfileParam aIPortraitProfileParam) {
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                C1687170u0R c1687170u0R = new C1687170u0R(aIPortraitProfileParam.entranceInfo, aIPortraitProfileParam.creationId, aIPortraitProfileParam.sceneName, aIPortraitProfileParam.textType, aIPortraitProfileParam.eventPage, 32);
                c1687150u0P.getClass();
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C1E3B c1e3b = C1E3B.LJIIIIZZ;
                AIGCEntranceInfo aIGCEntranceInfo = c1687170u0R.LIZ;
                AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(c1687170u0R, 574);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c1e3b, aIGCEntranceInfo, awS587S0100000_8);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportEntranceClick(AIPortraitEnterParams aIPortraitEnterParams) {
                PortraitStyleItem portraitStyleItem;
                C1687150u0P.LIZ.getClass();
                Parcelable parcelable = aIPortraitEnterParams.styleItem;
                if (parcelable instanceof PortraitStyleItem) {
                    portraitStyleItem = (PortraitStyleItem) parcelable;
                } else {
                    portraitStyleItem = null;
                }
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2275121E3i c2275121E3i = C2275121E3i.LJII;
                AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(portraitStyleItem, aIPortraitEnterParams, 148);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2275121E3i, C548910Lft.LIZ(aIPortraitEnterParams), awS374S0200000_8);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportEntranceShow(AIPortraitEnterParams aIPortraitEnterParams) {
                PortraitStyleItem portraitStyleItem;
                C1687150u0P.LIZ.getClass();
                Parcelable parcelable = aIPortraitEnterParams.styleItem;
                if (parcelable instanceof PortraitStyleItem) {
                    portraitStyleItem = (PortraitStyleItem) parcelable;
                } else {
                    portraitStyleItem = null;
                }
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2275131E3j c2275131E3j = C2275131E3j.LJII;
                AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(portraitStyleItem, aIPortraitEnterParams, 149);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2275131E3j, C548910Lft.LIZ(aIPortraitEnterParams), awS374S0200000_8);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportTTCrtAIGenerationStart(AIPortraitGeneration aIPortraitGeneration) {
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                C1687160u0Q c1687160u0QLIZ = LIZ(aIPortraitGeneration);
                c1687150u0P.getClass();
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2275171E3n c2275171E3n = C2275171E3n.LJII;
                AIGCEntranceInfo aIGCEntranceInfo = c1687160u0QLIZ.LIZ;
                AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c1687160u0QLIZ, 541);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2275171E3n, aIGCEntranceInfo, awS604S0100000_25);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportTTCrtCreateVideoPage(AIPortraitGeneration aIPortraitGeneration) {
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                C1687160u0Q c1687160u0QLIZ = LIZ(aIPortraitGeneration);
                c1687150u0P.getClass();
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2275141E3k c2275141E3k = C2275141E3k.LJII;
                AIGCEntranceInfo aIGCEntranceInfo = c1687160u0QLIZ.LIZ;
                AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c1687160u0QLIZ, 539);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2275141E3k, aIGCEntranceInfo, awS604S0100000_25);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportShoot(String str, AIGCEntranceInfo aIGCEntranceInfo) {
                C1687150u0P.LIZ.getClass();
                C0LAB c0lab = new C0LAB();
                if (str == null) {
                    str = "";
                }
                c0lab.LJ("creation_id", str);
                c0lab.LJ("ai_biz", aIGCEntranceInfo.aiBiz.getValue());
                c0lab.LJ("shoot_way", aIGCEntranceInfo.shootWay);
                c0lab.LJ("aicreation_scene_name", aIGCEntranceInfo.sceneName.getValue());
                C1449490np5.LIZ.getClass();
                c0lab.LJ("last_play_gid", C1449490np5.LJFF(null));
                c0lab.LJ("last_page_play_gid", C1449490np5.LJ(null));
                c0lab.LJ("last_page_name", C1449490np5.LIZLLL(null));
                c0lab.LJ("prepage_play_gid", C1449490np5.LJII(null));
                c0lab.LJ("prepage_name", C1449490np5.LJI(null));
                C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
            public final void reportTemplateDetailPageEnter(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, EnumC570120MXq enumC570120MXq2, RefImageType refImageType, EnumC550430LiL enumC550430LiL, Integer num, String str3) {
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                C1687160u0Q c1687160u0Q = new C1687160u0Q(aIGCEntranceInfo, str, str2, enumC1419230n2H, enumC570120MXq, null, refImageType, enumC550430LiL, num, null, null, null, null, str3, 114208);
                c1687150u0P.getClass();
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2275201E3q c2275201E3q = C2275201E3q.LJII;
                AIGCEntranceInfo aIGCEntranceInfo2 = c1687160u0Q.LIZ;
                AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c1687160u0Q, 543);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2275201E3q, aIGCEntranceInfo2, awS604S0100000_25);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService
    public final boolean isFeatureEnabled() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_portrait_feature_enable", true, false)) {
            return false;
        }
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C201955140j.LIZIZ("AIPortraitFeatureServiceImpl", "isFeatureBanned: not login");
            return false;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            C201955140j.LIZIZ("AIPortraitFeatureServiceImpl", "isFeatureBanned: children mode");
            return false;
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("uas_2039")) == null || eligibilityModelLIZ.isEligible()) {
            C201955140j.LIZIZ("AIPortraitFeatureServiceImpl", "isFeatureBanned: feature enabled");
            return true;
        }
        C201955140j.LIZIZ("AIPortraitFeatureServiceImpl", "isFeatureBanned: not eligible");
        return false;
    }
}
