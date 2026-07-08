package com.ss.android.ugc.aweme.texttoimage;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C09AL;
import X.C0LCM;
import X.C0M58;
import X.C0M5A;
import X.C0M5B;
import X.C0M5H;
import X.C0PEM;
import X.C0XQ7;
import X.C1388190mED;
import X.C1438570nXT;
import X.C1906580ziK;
import X.C1976907ol;
import X.C201955140j;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.InterfaceC706770Rnv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.tools.draft.IDraftEditService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TextImageAIGCInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public final String LIZ(RouteIntent routeIntent) {
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
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "studio/textimageaigc");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C0M5H c0m5h;
        String stringExtra;
        String strLIZ;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || routeIntent == null) {
            return false;
        }
        try {
            c0m5h = new C0M5H(activityLIZ, routeIntent, (C0M5A) C23250099c.LJ(C0PEM.LIZJ.plus(new C09AL()), new C0M58(new C259800zU(), this, routeIntent, activityLIZ, null)));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C0LCM c0lcm = C0LCM.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDraftByTaskInfo error ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJII(c0lcm, C2188811AlT.LIZIZ(sbLIZ));
            c0m5h = null;
        }
        if (c0m5h == null) {
            return true;
        }
        C0M5A c0m5a = c0m5h.LIZJ;
        C0M5B c0m5b = c0m5a.LIZ;
        AwemeDraft awemeDraft = c0m5a.LIZJ;
        String str = c0m5a.LIZLLL;
        boolean z = c0m5a.LJ;
        String str2 = "aweme://story/detail";
        if (c0m5b == C0M5B.DETAIL_PAGE) {
            if (z) {
                str2 = "aweme://aweme/detail";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("jump to detail, awemeId=");
            sbLIZ2.append(str);
            sbLIZ2.append(", url=");
            sbLIZ2.append(str2);
            C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c0m5h.LIZ, str2);
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
            smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_DEFAULT");
            smartRouteBuildRoute.withParam("enter_from", "notification_page");
            smartRouteBuildRoute.open();
        } else {
            if (c0m5b == C0M5B.STORY_IMMERSIVE_PAGE) {
                IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
                if (iStoryService != null && (interfaceC706770RnvLJJIIJ = iStoryService.LJJIIJ()) != null) {
                    interfaceC706770RnvLJJIIJ.LJJI(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                }
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(c0m5h.LIZ, "aweme://story/detail");
                if (awemeDraft == null || (strLIZ = awemeDraft.LIZ()) == null) {
                    strLIZ = "";
                }
                smartRouteBuildRoute2.withParam("target_creation_id", strLIZ);
                smartRouteBuildRoute2.withParam("video_from", "STORY_ENTRANCE_MINE");
                smartRouteBuildRoute2.withParam("enter_from", "notification_page");
                smartRouteBuildRoute2.open();
                return true;
            }
            if (c0m5b == C0M5B.PROFILE_PAGE) {
                SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(c0m5h.LIZ, "//main");
                smartRouteBuildRoute3.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
                smartRouteBuildRoute3.open();
                return true;
            }
            if (awemeDraft != null) {
                awemeDraft.LJIJI = 6;
                IDraftEditService iDraftEditService = (IDraftEditService) PluggableExtentionKt.pluggableSpi$default(IDraftEditService.class, false, false, false, 14, null);
                if (iDraftEditService != null) {
                    Activity activity = c0m5h.LIZ;
                    new C1438570nXT("textimage_aigc");
                    VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, false);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Intent extra = c0m5h.LIZIZ.getExtra();
                    if (extra != null) {
                        try {
                            stringExtra = extra.getStringExtra("entrance");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        if (stringExtra == null) {
                            stringExtra = "ai_text_template_system_notification";
                        }
                    } else {
                        stringExtra = "ai_text_template_system_notification";
                    }
                    iDraftEditService.LIZJ(activity, awemeDraft, videoPublishEditModelLIZJ, jCurrentTimeMillis, stringExtra);
                    return true;
                }
            } else {
                boolean z2 = c0m5a.LIZIZ;
                Intent extra2 = c0m5h.LIZIZ.getExtra();
                if (extra2 != null) {
                    extra2.putExtra("lost_draft", true);
                }
                Intent extra3 = c0m5h.LIZIZ.getExtra();
                if (extra3 != null) {
                    extra3.putExtra("is_from_crash_restore_draft", z2);
                }
                SmartRouter.buildRoute(c0m5h.LIZ, "//studio/aigc").open();
                return true;
            }
        }
        return true;
    }
}
