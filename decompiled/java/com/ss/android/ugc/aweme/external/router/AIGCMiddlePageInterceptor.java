package com.ss.android.ugc.aweme.external.router;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C09AL;
import X.C0LSZ;
import X.C0M57;
import X.C0M59;
import X.C0M5C;
import X.C0M5D;
import X.C0M5E;
import X.C0M5F;
import X.C0M5G;
import X.C0PEM;
import X.C0XQ7;
import X.C1388190mED;
import X.C1906580ziK;
import X.C1976907ol;
import X.C201955140j;
import X.C2188811AlT;
import X.C23250099c;
import X.C2341909Fp;
import X.C259800zU;
import X.C543670LTx;
import X.C554440Loo;
import X.C559010LwB;
import X.C570560MZi;
import X.InterfaceC2342209Fs;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.story.IStoryService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCMiddlePageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static boolean LIZIZ(RouteIntent routeIntent) {
        Intent extra = routeIntent.getExtra();
        String stringExtra = null;
        if (extra != null) {
            try {
                stringExtra = extra.getStringExtra("is_success");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Intrinsics.LJFF(stringExtra, "1");
    }

    public final String LIZLLL(RouteIntent routeIntent) {
        String stringExtra;
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            try {
                stringExtra = extra.getStringExtra("task_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "studio/aigc");
    }

    public static int LIZ(CreativeModel creativeModel, C0LSZ c0lsz) {
        if (c0lsz == null) {
            return 0;
        }
        return Intrinsics.LJFF(creativeModel.aiLivePhotoModel.getTaskId(), c0lsz.LIZ) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C0M5G c0m5g;
        C0M5D c0m5d;
        CreativeModel creativeModel;
        String strLIZ;
        CreativeModel creativeModel2;
        CreativeModel creativeModel3;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        int iLIZ = 0;
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || routeIntent == null) {
            return false;
        }
        C559010LwB.LIZIZ("AIGCMiddlePageInterceptor", "start jump");
        try {
            C259800zU c259800zU = new C259800zU();
            c0m5g = new C0M5G(activityLIZ, routeIntent, (C0M59) C23250099c.LJ(C0PEM.LIZJ.plus(new C09AL()), new C0M57(c259800zU, this, routeIntent, activityLIZ, null)), (C0LSZ) c259800zU.element);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDraftByTaskInfo error ");
            sbLIZ.append(e.getMessage());
            C559010LwB.LIZ("AIGCMiddlePageInterceptor", C2188811AlT.LIZIZ(sbLIZ));
            c0m5g = null;
        }
        boolean z = true;
        if (c0m5g == null) {
            return true;
        }
        C559010LwB.LIZIZ("AIGCMiddlePageInterceptor", String.valueOf(c0m5g.LIZJ));
        C0M59 c0m59 = c0m5g.LIZJ;
        C0M5E c0m5e = c0m59.LIZ;
        AwemeDraft awemeDraft = c0m59.LIZJ;
        String str = c0m59.LIZLLL;
        boolean z2 = c0m59.LJ;
        boolean z3 = c0m59.LJFF;
        String str2 = "aweme://story/detail";
        if (c0m5e == C0M5E.DETAIL_PAGE) {
            RouteIntent routeIntent2 = c0m5g.LIZIZ;
            if (awemeDraft != null && (creativeModel3 = awemeDraft.LIZ) != null) {
                iLIZ = LIZ(creativeModel3, c0m5g.LIZLLL);
            }
            LIZJ(routeIntent2, iLIZ, C0M5C.TO_POSTED_LIVE_PHOTO, C0M5D.DRAFT_PUBLISHED);
            if (z3) {
                str2 = "aweme://aweme/detail";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("jump to detail, awemeId=");
            sbLIZ2.append(str);
            sbLIZ2.append(", url=");
            sbLIZ2.append(str2);
            C201955140j.LIZIZ("AIGCMiddlePageInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c0m5g.LIZ, str2);
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
            smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_DEFAULT");
            smartRouteBuildRoute.withParam("enter_from", "notification_page");
            smartRouteBuildRoute.open();
            return true;
        }
        String str3 = "";
        if (c0m5e == C0M5E.STORY_IMMERSIVE_PAGE) {
            RouteIntent routeIntent3 = c0m5g.LIZIZ;
            if (awemeDraft != null && (creativeModel2 = awemeDraft.LIZ) != null) {
                iLIZ = LIZ(creativeModel2, c0m5g.LIZLLL);
            }
            LIZJ(routeIntent3, iLIZ, C0M5C.TO_POSTED_LIVE_PHOTO, C0M5D.DRAFT_PUBLISHING);
            ((IStoryService) ServiceManager.get().getService(IStoryService.class)).LJJIIJ().LJJI(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(c0m5g.LIZ, "aweme://story/detail");
            if (awemeDraft != null && (strLIZ = awemeDraft.LIZ()) != null) {
                str3 = strLIZ;
            }
            smartRouteBuildRoute2.withParam("target_creation_id", str3);
            smartRouteBuildRoute2.withParam("video_from", "STORY_ENTRANCE_MINE");
            smartRouteBuildRoute2.withParam("enter_from", "notification_page");
            smartRouteBuildRoute2.open();
            return true;
        }
        if (c0m5e == C0M5E.PROFILE_PAGE) {
            RouteIntent routeIntent4 = c0m5g.LIZIZ;
            if (awemeDraft != null && (creativeModel = awemeDraft.LIZ) != null) {
                iLIZ = LIZ(creativeModel, c0m5g.LIZLLL);
            }
            LIZJ(routeIntent4, iLIZ, C0M5C.TO_POSTED_LIVE_PHOTO, C0M5D.DRAFT_PUBLISHING);
            SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(c0m5g.LIZ, "//main");
            smartRouteBuildRoute3.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
            smartRouteBuildRoute3.open();
            return true;
        }
        if (awemeDraft != null) {
            if (C0M5F.LIZ[c0m5e.ordinal()] == 1) {
                LIZJ(c0m5g.LIZIZ, LIZ(awemeDraft.LIZ, c0m5g.LIZLLL), C0M5C.DIRECT_JUMP, C0M5D.NONE);
                AILivePhotoModel aILivePhotoModel = awemeDraft.LIZ.aiLivePhotoModel;
                aILivePhotoModel.isFailureRecall = !LIZIZ(c0m5g.LIZIZ);
                Intent extra = c0m5g.LIZIZ.getExtra();
                if (extra != null) {
                    try {
                        String stringExtra = extra.getStringExtra("enter_from");
                        if (stringExtra != null) {
                            str3 = stringExtra;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                aILivePhotoModel.LJIILJJIL(str3);
                awemeDraft.LJIJI = 13;
                C570560MZi.LJFF(c0m5g.LIZ, awemeDraft, 13, System.currentTimeMillis(), null);
                return true;
            }
            LIZJ(c0m5g.LIZIZ, LIZ(awemeDraft.LIZ, c0m5g.LIZLLL), C0M5C.DOWNLOAD, C0M5D.NONE);
        } else if (z2) {
            LIZJ(c0m5g.LIZIZ, 0, C0M5C.OTHER_DEVICE_PAGE, C0M5D.DRAFT_OTHER_DEVICE);
        } else {
            RouteIntent routeIntent5 = c0m5g.LIZIZ;
            C0M5C c0m5c = C0M5C.LOST_DRAFT;
            if (c0m5g.LIZLLL == null) {
                c0m5d = C0M5D.LOCAL_TASK_NOT_EXIST;
            } else {
                c0m5d = C0M5D.DRAFT_NOT_EXIST;
            }
            LIZJ(routeIntent5, 0, c0m5c, c0m5d);
        }
        C0M59 c0m592 = c0m5g.LIZJ;
        boolean z4 = c0m592.LIZIZ;
        AwemeDraft awemeDraft2 = c0m592.LIZJ;
        boolean z5 = c0m592.LJ;
        Intent extra2 = c0m5g.LIZIZ.getExtra();
        if (extra2 != null) {
            if (awemeDraft2 != null) {
                z = false;
            }
            extra2.putExtra("lost_draft", z);
        }
        Intent extra3 = c0m5g.LIZIZ.getExtra();
        if (extra3 != null) {
            extra3.putExtra("is_from_crash_restore_draft", z4);
        }
        Intent extra4 = c0m5g.LIZIZ.getExtra();
        if (extra4 != null) {
            extra4.putExtra("different_device", z5);
            return false;
        }
        return false;
    }

    public static void LIZJ(RouteIntent routeIntent, int i, C0M5C c0m5c, C0M5D c0m5d) {
        String stringExtra;
        IAILiveService aILiveService;
        C554440Loo c554440Loo = C554440Loo.LIZ;
        String source = Source.EDIT_AI_LIVE_PHOTO.getSource();
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            try {
                stringExtra = extra.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        int i2 = 0;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aILiveService = iExternalService.getAILiveService()) != null && aILiveService.isAILiveEnable()) {
            i2 = 1;
        }
        String mob = c0m5c.getMob();
        String reason = c0m5d.getReason();
        c554440Loo.getClass();
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("business", source);
        c543670LTx.LIZ.put("enter_from", stringExtra);
        c543670LTx.LIZ.put("is_hit_experiment", Integer.valueOf(i2));
        c543670LTx.LIZ.put("action_result", mob);
        c543670LTx.LIZ.put("task_id_consistency", Integer.valueOf(i));
        c543670LTx.LIZ.put("draft_lost_reason", reason);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("aigc_recall_action_result", c543670LTx.LJ());
    }
}
