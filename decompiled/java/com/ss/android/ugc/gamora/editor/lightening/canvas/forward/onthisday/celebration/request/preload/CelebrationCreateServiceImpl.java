package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload;

import X.AbstractC848400XPy;
import X.C064U;
import X.C098200Yq;
import X.C0LAB;
import X.C0MLA;
import X.C0MLB;
import X.C0MLC;
import X.C0MQ2;
import X.C0PEM;
import X.C0VSJ;
import X.C0XQ7;
import X.C1227904rF;
import X.C13BV;
import X.C189200o6;
import X.C201955140j;
import X.C20684815ws;
import X.C2104108Md;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C272790Amb;
import X.C554890LpX;
import X.C566620MKe;
import X.C567950MPh;
import X.C567980MPk;
import X.C568030MPp;
import X.C568040MPq;
import X.C568060MPs;
import X.InterfaceC1364105Vn;
import X.InterfaceC567940MPg;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.story.forward.CelebrationRenderVideoInfo;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideoMeta;
import com.ss.android.ugc.aweme.story.experiment.celebration.StoryCelebrationConfig;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.RecentCelebrationData;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationCreateServiceImpl implements ICelebrationCreateService {
    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final void clearKevaForDebug() {
        C568030MPp.LIZ.getClass();
        C568030MPp.LJ = null;
        C568030MPp.LJIIIIZZ().clear();
        ((Keva) C568030MPp.LIZJ.getValue()).clear();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C568030MPp.LJI(curUserId).clear();
        C568030MPp.LIZLLL(curUserId).clear();
        C568030MPp.LJII(curUserId).clear();
        C0MQ2.LIZ.getClass();
        ((Keva) C0MQ2.LIZIZ.getValue()).clear();
        ((Keva) C0MQ2.LIZLLL.getValue()).clear();
        ((Keva) C0MQ2.LJ.getValue()).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> getCelebrationMaterialInboxRequestParam() {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationCreateServiceImpl.getCelebrationMaterialInboxRequestParam():java.util.HashMap");
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final List<Integer> getTodayCelebrationList() {
        C568030MPp.LIZ.getClass();
        return C568030MPp.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final boolean isEoYOngoingToday() {
        List<Integer> todayCelebrationList = getTodayCelebrationList();
        return todayCelebrationList != null && todayCelebrationList.contains(2);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final boolean checkRenderVideoReady(int i) {
        C0MLB c0mlbLIZJ = C0MLC.LIZ.LIZJ(i);
        if (!c0mlbLIZJ.LJFF) {
            c0mlbLIZJ.LIZLLL();
        }
        CelebrationRenderedVideo celebrationRenderedVideo = c0mlbLIZJ.LJI;
        if (celebrationRenderedVideo == null) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkRenderVideoReady failed, no render video info for celebrationType: ");
            sbLIZ.append(i);
            C201955140j.LJIJI(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        String str = celebrationRenderedVideo.videoUrl;
        if (str != null && str.length() != 0) {
            C566620MKe c566620MKe = C566620MKe.LIZ;
            String str2 = celebrationRenderedVideo.videoId;
            c566620MKe.getClass();
            C0VSJ c0vsj = new C0VSJ(C566620MKe.LIZJ(i, str2));
            if (c0vsj.exists() && c0vsj.length() != 0) {
                C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkRenderVideoReady success for celebrationType: ");
                sbLIZ2.append(i);
                C201955140j.LIZJ(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
                return true;
            }
            C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkRenderVideoReady failed, local video file not exists or empty for celebrationType: ");
            sbLIZ3.append(i);
            C201955140j.LJIJI(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        C554890LpX c554890LpX4 = C554890LpX.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("checkRenderVideoReady failed, videoUrl is empty for celebrationType: ");
        sbLIZ4.append(i);
        C201955140j.LJIJI(c554890LpX4, C2188811AlT.LIZIZ(sbLIZ4));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final List<ForwardMedia> getForwardMediasAndCreateTemplateSegment(int i) {
        C0MLC c0mlc = C0MLC.LIZ;
        c0mlc.LIZJ(i).LJ();
        List<ForwardMedia> listLIZIZ = c0mlc.LIZIZ(i);
        if (listLIZIZ == null) {
            return C13BV.INSTANCE;
        }
        return listLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    /* JADX INFO: renamed from: getRenderVideoInfo-IoAF18A */
    public final Object mo315getRenderVideoInfoIoAF18A(int i) {
        int i2;
        int i3;
        C0MLB c0mlbLIZJ = C0MLC.LIZ.LIZJ(i);
        if (!c0mlbLIZJ.LJFF) {
            c0mlbLIZJ.LIZLLL();
        }
        CelebrationRenderedVideo celebrationRenderedVideo = c0mlbLIZJ.LJI;
        if (celebrationRenderedVideo == null) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRenderVideoInfo failed, no render video info for celebrationType: ");
            sbLIZ.append(i);
            C201955140j.LJIJI(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            C098200Yq c098200Yq = new C098200Yq(new Exception("No render video info available"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        if (!checkRenderVideoReady(i)) {
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getRenderVideoInfo failed, render video not ready for celebrationType: ");
            sbLIZ2.append(i);
            C201955140j.LJIJI(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
            C098200Yq c098200Yq2 = new C098200Yq(new Exception("Render video not ready"));
            C189200o6.m2constructorimpl(c098200Yq2);
            return c098200Yq2;
        }
        C566620MKe c566620MKe = C566620MKe.LIZ;
        String str = celebrationRenderedVideo.videoId;
        c566620MKe.getClass();
        String strLIZJ = C566620MKe.LIZJ(i, str);
        String str2 = celebrationRenderedVideo.videoId;
        String str3 = celebrationRenderedVideo.videoUrl;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = celebrationRenderedVideo.coverUrl;
        if (str5 == null) {
            str5 = "";
        }
        List list = celebrationRenderedVideo.originalItemIds;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str6 = celebrationRenderedVideo.templateId;
        if (str6 != null) {
            str4 = str6;
        }
        CelebrationRenderedVideoMeta celebrationRenderedVideoMeta = celebrationRenderedVideo.renderedVideoMeta;
        if (celebrationRenderedVideoMeta != null) {
            i2 = celebrationRenderedVideoMeta.width;
            i3 = celebrationRenderedVideoMeta.height;
        } else {
            i2 = 0;
            i3 = 0;
        }
        CelebrationRenderVideoInfo celebrationRenderVideoInfo = new CelebrationRenderVideoInfo(str2, str3, str5, strLIZJ, list, str4, i2, i3);
        C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getRenderVideoInfo success for celebrationType: ");
        sbLIZ3.append(i);
        sbLIZ3.append(", videoId: ");
        sbLIZ3.append(celebrationRenderedVideo.videoId);
        C201955140j.LIZJ(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ3));
        C189200o6.m2constructorimpl(celebrationRenderVideoInfo);
        return celebrationRenderVideoInfo;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final void preloadCelebrationAndMaterial(Context context) {
        Object c098200Yq;
        C064U.LIZ.getClass();
        if (!(!((StoryCelebrationConfig) C064U.LIZJ.getValue()).getWhiteList().isEmpty())) {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "preloadCelebrationAndMaterial return no celebration");
            return;
        }
        if (((Boolean) C272790Amb.LIZ.getValue()).booleanValue()) {
            try {
                if (C2104108Md.LIZLLL(context)) {
                    C567950MPh.LIZ.LIZIZ(1, context);
                } else {
                    C201955140j.LJIJI(C554890LpX.LIZIZ, "checkMaterialReady failed, Template not ready");
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C567950MPh.LIZ.LIZIZ(1, context);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final void recordTodayExitCelebration(int i) {
        RecentCelebrationData recentCelebrationData;
        ConcurrentMap<String, String> celebrationExitDetail;
        ConcurrentMap<String, String> celebrationExitDetail2;
        Set<String> setKeySet;
        C568030MPp.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String strLIZIZ = C568030MPp.LIZIZ();
        C568030MPp.LIZ(curUserId, strLIZIZ);
        String strValueOf = String.valueOf(i);
        RecentCelebrationData recentCelebrationData2 = C568030MPp.LJ;
        if ((recentCelebrationData2 == null || (celebrationExitDetail2 = recentCelebrationData2.getCelebrationExitDetail()) == null || (setKeySet = celebrationExitDetail2.keySet()) == null || !setKeySet.contains(strValueOf)) && (recentCelebrationData = C568030MPp.LJ) != null && (celebrationExitDetail = recentCelebrationData.getCelebrationExitDetail()) != null) {
            celebrationExitDetail.put(strValueOf, strLIZIZ);
        }
        RecentCelebrationData recentCelebrationData3 = C568030MPp.LJ;
        Keva kevaLJIIIIZZ = C568030MPp.LJIIIIZZ();
        C1227904rF.LIZ.getClass();
        kevaLJIIIIZZ.storeString(curUserId, C1227904rF.LJI(recentCelebrationData3));
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final boolean checkMaterialReady(int i, boolean z) {
        int size = C0MLC.LIZ.LIZJ(i).LJ().size();
        InterfaceC567940MPg interfaceC567940MPg = C0MLA.LIZ;
        if (interfaceC567940MPg != null && interfaceC567940MPg.LIZIZ(i, size)) {
            if (z) {
                C0MQ2.LIZ.getClass();
                C0MQ2.LIZJ(i);
                HashMap<String, String> map = C0MQ2.LJFF.get(Integer.valueOf(i));
                if (map == null || map.isEmpty()) {
                    C201955140j.LJIJI(C554890LpX.LIZIZ, "checkMaterialReady failed, Template not ready");
                    return false;
                }
            }
            return true;
        }
        C201955140j.LJIJI(C554890LpX.LIZIZ, "checkMaterialReady failed, ForwardMedia is empty");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final void loadCelebrationMaterial(Context context, int i) {
        Object c098200Yq;
        C064U.LIZ.getClass();
        if (!(!((StoryCelebrationConfig) C064U.LIZJ.getValue()).getWhiteList().isEmpty())) {
            return;
        }
        C567950MPh c567950MPh = C567950MPh.LIZ;
        c567950MPh.getClass();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "CeleRepo", "[return] request Celebration Material, not login");
            return;
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(context)) {
            c567950MPh.LIZ();
            try {
                C568040MPq c568040MPq = C567950MPh.LIZJ;
                c568040MPq.getClass();
                C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleRepo, [start] request celebration material");
                ((List) c568040MPq.LIZLLL.getValue()).add(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C567980MPk(c568040MPq, 2, context, null), 3));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return;
            }
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CeleRepo, request Celebration Material: error = ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C201955140j.LJII(C554890LpX.LIZIZ, "CeleRepo, preload Celebration And Material fail, ve plugin not ready");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> getMaterialLocalPath(com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationCreateServiceImpl.getMaterialLocalPath(com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia, int, java.lang.String):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportCelebrationEvent(int r6, int r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C058E
            if (r0 == 0) goto L20
            r4 = r8
            X.058E r4 = (X.C058E) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.058E r4 = new X.058E
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.CelebrationRequestApi r0 = com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.CelebrationRequestApi.LIZIZ     // Catch: java.lang.Throwable -> L45
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r0.reportCelebrationEvent(r6, r7, r4)     // Catch: java.lang.Throwable -> L45
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L45
        L3f:
            X.0MPo r3 = (X.C568020MPo) r3     // Catch: java.lang.Throwable -> L45
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L45
            goto L51
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L51:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r3 == 0) goto L6c
            X.0LpX r2 = X.C554890LpX.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "reportCelebrationEvent failed: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r2, r0)
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationCreateServiceImpl.reportCelebrationEvent(int, int, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final void mobCelebrationPushStatus(int i, long j, long j2, int i2) {
        C568060MPs.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJFF("is_push", true);
        c0lab.LIZIZ(j2 - j, "duration");
        c0lab.LIZ(i2, "error_code");
        c0lab.LIZ(i, "celebration_type");
        C20684815ws.LJIILLIIL("celebration_push_status", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService
    public final Object syncRequestCelebrationMaterial(Context context, int i, int i2, int i3, boolean z, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult> interfaceC1364105Vn) {
        return C567950MPh.LIZ.LIZJ(context, 2, 1, i3, z, interfaceC1364105Vn);
    }
}
