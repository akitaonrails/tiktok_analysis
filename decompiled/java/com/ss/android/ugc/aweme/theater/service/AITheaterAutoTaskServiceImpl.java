package com.ss.android.ugc.aweme.theater.service;

import X.AnonymousClass0913;
import X.C01GW;
import X.C09AE;
import X.C09BV;
import X.C09CT;
import X.C0AZ4;
import X.C0LAB;
import X.C0LOK;
import X.C0MU5;
import X.C0MUC;
import X.C0MUD;
import X.C0MUE;
import X.C0PEM;
import X.C0XQ7;
import X.C13BV;
import X.C13M7;
import X.C1697810uHb;
import X.C1953307kx;
import X.C19719612Di;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2341909Fp;
import X.C452501pT;
import X.C535440KzG;
import X.C546230LbZ;
import X.C546290Lbf;
import X.C546410Lbr;
import X.C546750LcP;
import X.C546820LcW;
import X.C546890Lcd;
import X.C546900Lce;
import X.C547140Ld2;
import X.C547860LeC;
import X.C548430Lf7;
import X.C548590LfN;
import X.C549720LhC;
import X.EnumC547830Le9;
import X.InterfaceC2342209Fs;
import X.InterfaceC497601wk;
import X.InterfaceC546090LbL;
import X.InterfaceC547720Ldy;
import X.InterfaceC558600LvW;
import X.InterfaceC625970Ogt;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.aikit.api.create.generation.AICreateBusinessExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskModel;
import com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskResponse;
import com.ss.android.ugc.aweme.theater.creation.auto.LogPB;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import com.ss.android.ugc.aweme.theater.model.WritableAITheaterGenerationModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterAutoTaskServiceImpl implements InterfaceC547720Ldy {
    public static final C0MUE Companion = new Object() { // from class: X.0MUE
    };
    public volatile C09AE checkJob;
    public String currentScene;
    public final C01GW remoteDataSource$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(222));
    public final InterfaceC497601wk coroutineScope = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C01GW repo$delegate = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(315));
    public final C01GW formatter$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(221));
    public AIGCAutoTaskCache autoTaskCache = readAutoTaskCache();

    private final C0MU5 getAutoTaskStatus() {
        Object next;
        C0MUD c0mud = C0MU5.LLILLJJLI;
        String str = this.autoTaskCache.status;
        c0mud.getClass();
        Iterator<T> it2 = C0MU5.LLIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(((C0MU5) next).LL, str)) {
                break;
            }
        }
        C0MU5 c0mu5 = (C0MU5) next;
        return c0mu5 == null ? C0MU5.LLILLL : c0mu5;
    }

    private final DraftService<Object, Object> getDraftService() {
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZ();
    }

    private final SimpleDateFormat getFormatter() {
        return (SimpleDateFormat) this.formatter$delegate.getValue();
    }

    private final C0MUC getRemoteDataSource() {
        return (C0MUC) this.remoteDataSource$delegate.getValue();
    }

    private final InterfaceC625970Ogt getRepo() {
        return (InterfaceC625970Ogt) this.repo$delegate.getValue();
    }

    private final boolean isAutoTaskIdExpired() {
        String str = this.autoTaskCache.createTime;
        if (str == null) {
            return true;
        }
        try {
            Date date = getFormatter().parse(str);
            if (date != null) {
                return System.currentTimeMillis() - date.getTime() > TimeUnit.DAYS.toMillis((long) ((Number) C0AZ4.LIZ.getValue()).intValue());
            }
            return true;
        } catch (ParseException e) {
            TryCatchGuardChecker.doCheck(e);
            C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isAutoTaskIdExpired parse error: ");
            sbLIZ.append(str);
            c547140Ld2.LIZIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ), e);
            return true;
        }
    }

    private final boolean isAutoTaskIdValid() {
        C1953307kx c1953307kx = C1953307kx.LIZ;
        String autoTaskId = getAutoTaskId();
        c1953307kx.getClass();
        if (!C1953307kx.LIZLLL(autoTaskId)) {
            return false;
        }
        C0MU5 autoTaskStatus = getAutoTaskStatus();
        autoTaskStatus.getClass();
        return C1697810uHb.LJIIJJI(C0MU5.LLILZ, C0MU5.LLILZIL).contains(autoTaskStatus) && !isAutoTaskIdExpired();
    }

    private final boolean isAutoTaskUidMatched() {
        String strCurrentUid;
        String str = this.autoTaskCache.uid;
        if (str == null || (strCurrentUid = currentUid()) == null) {
            return true;
        }
        return Intrinsics.LJFF(str, strCurrentUid);
    }

    private final void storeAutoTaskCache() {
        String json;
        String str = this.autoTaskCache.clientTaskId;
        if (str == null || str.length() == 0) {
            getRepo().LIZ("auto_task_cache");
            C546820LcW.LIZ.LIZ("AITheaterAutoTaskServiceImpl", "update AutoTask cache: clear");
            return;
        }
        InterfaceC625970Ogt repo = getRepo();
        try {
            json = GsonProtectorUtils.toJson(new Gson(), this.autoTaskCache);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (json == null) {
            json = "";
        }
        repo.LIZIZ("auto_task_cache", json);
        C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update AutoTask cache: ");
        sbLIZ.append(this.autoTaskCache);
        c547140Ld2.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    public String getAutoTaskId() {
        return this.autoTaskCache.clientTaskId;
    }

    public final AICreateService getCreateService() {
        C546890Lcd.LIZ.getClass();
        return C546890Lcd.LIZ();
    }

    @Override // X.InterfaceC547720Ldy
    public boolean isEnableAutoGen() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.LJIIJJI()) {
            return false;
        }
        refreshAutoTaskCacheIfNeed();
        String autoTaskId = getAutoTaskId();
        return autoTaskId == null || autoTaskId.length() == 0;
    }

    @Override // X.InterfaceC547720Ldy
    public boolean isEnableCheckAutoTask() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.LJIIJJI()) {
            return false;
        }
        refreshAutoTaskCacheIfNeed();
        return isAutoTaskIdValid();
    }

    private final String currentUid() {
        C0XQ7.LJ();
        return C0XQ7.LIZ.LJIIJ().getCurUser().getUid();
    }

    private final AIGCAutoTaskCache readAutoTaskCache() {
        String string = getRepo().getString("auto_task_cache", "");
        Gson gson = new Gson();
        Object objFromJson = null;
        if (!(string == null || string.length() == 0)) {
            try {
                objFromJson = GsonProtectorUtils.fromJson(gson, string, (Class<Object>) AIGCAutoTaskCache.class);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        AIGCAutoTaskCache aIGCAutoTaskCache = (AIGCAutoTaskCache) objFromJson;
        if (aIGCAutoTaskCache == null) {
            aIGCAutoTaskCache = new AIGCAutoTaskCache(null, null, null, null, null, null, 63, null);
        }
        C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh AutoTaskCache, result: ");
        sbLIZ.append(aIGCAutoTaskCache);
        c547140Ld2.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        return aIGCAutoTaskCache;
    }

    private final void refreshAutoTaskCacheIfNeed() {
        if (isAutoTaskUidMatched()) {
            return;
        }
        this.autoTaskCache = readAutoTaskCache();
    }

    @Override // X.InterfaceC547720Ldy
    public void markCloudDraftConsumed() {
        if (isEnableCheckAutoTask()) {
            this.autoTaskCache.status = "cloud_draft_consumed";
            storeAutoTaskCache();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f3 A[PHI: r233
      0x02f3: PHI (r233v2 java.lang.String) = (r233v0 java.lang.String), (r233v3 java.lang.String) binds: [B:55:0x02f1, B:53:0x02ed] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.creative.model.CreativeModel buildCreativeModel(com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r253) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl.buildCreativeModel(com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel):com.ss.android.ugc.aweme.creative.model.CreativeModel");
    }

    private final C546410Lbr buildDraftSaveParams(CreativeModel creativeModel) {
        List<String> results;
        String str;
        AITheaterContextModel contextModel;
        AIGCEntranceInfo aIGCEntranceInfo;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        C0LOK c0lok = C0LOK.LIZ;
        Source source = Source.AI_THEATER;
        CreativeInfo creativeInfo = creativeModel.creativeInfo;
        if (aITheaterModel == null || (creationModel = aITheaterModel.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null || (results = aITheaterGenerationModel.getResults()) == null) {
            results = C13BV.INSTANCE;
        }
        if (aITheaterModel == null || (contextModel = aITheaterModel.getContextModel()) == null || (aIGCEntranceInfo = contextModel.aigcEntranceInfo) == null || (str = aIGCEntranceInfo.shootWay) == null) {
            str = "";
        }
        C547860LeC.LIZ.getClass();
        return new C546410Lbr(c0lok, source, creativeInfo, results, str, creativeModel, C547860LeC.LJI().LIZ(C548430Lf7.LIZIZ));
    }

    private final void markDraftSaved(String str) {
        if (!Intrinsics.LJFF(this.autoTaskCache.clientTaskId, str)) {
            return;
        }
        this.autoTaskCache.status = "draft_saved";
        storeAutoTaskCache();
    }

    private final void markWorkflowSubmitted(String str) {
        if (!Intrinsics.LJFF(this.autoTaskCache.clientTaskId, str)) {
            return;
        }
        this.autoTaskCache.status = "workflow_submitted";
        storeAutoTaskCache();
    }

    @Override // X.InterfaceC547720Ldy
    public void clearCameoAutoTask(String str) {
        if (!isEnableCheckAutoTask() || !Intrinsics.LJFF(this.autoTaskCache.cameoClientTaskId, str)) {
            return;
        }
        this.autoTaskCache = new AIGCAutoTaskCache(null, null, null, null, null, null, 63, null);
        storeAutoTaskCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAutoTaskInfo(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskResponse> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0MU8
            if (r0 == 0) goto L23
            r7 = r9
            X.0MU8 r7 = (X.C0MU8) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r5 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r3 = 0
            java.lang.String r4 = "AITheaterAutoTaskServiceImpl"
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            goto L4b
        L23:
            X.0MU8 r7 = new X.0MU8
            r7.<init>(r8, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r5)
            X.0MUC r0 = r8.getRemoteDataSource()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "ai_theater"
            r7.LLILLL = r2     // Catch: java.lang.Throwable -> L73
            X.01GW r0 = r0.LIZ     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L73
            com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskApi r0 = (com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskApi) r0     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r0.getAutoGenerateTask(r1, r7)     // Catch: java.lang.Throwable -> L73
            if (r5 != r6) goto L4e
            return r6
        L4b:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L73
        L4e:
            com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskResponse r5 = (com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskResponse) r5     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = r5.statusCode     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6f
        L5a:
            X.0Ld2 r2 = X.C546820LcW.LIZ     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "getAutoTaskInfo error, response="
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            r1.append(r5)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L73
            r2.LIZIZ(r4, r0, r3)     // Catch: java.lang.Throwable -> L73
        L6f:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L73
            goto L7f
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L7f:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r2 == 0) goto L8c
            X.0Ld2 r1 = X.C546820LcW.LIZ
            java.lang.String r0 = "getAutoTaskInfo error"
            r1.LIZIZ(r4, r0, r2)
        L8c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            if (r0 != 0) goto L93
            return r5
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl.getAutoTaskInfo(X.05Vn):java.lang.Object");
    }

    public final void markServerFailed(String str) {
        if (!Intrinsics.LJFF(this.autoTaskCache.clientTaskId, str)) {
            return;
        }
        this.autoTaskCache.status = "server_failed";
        storeAutoTaskCache();
    }

    @Override // X.InterfaceC547720Ldy
    public void stopObserveTask(String str) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        AnonymousClass0913.LIZJ(str);
        if (this.checkJob == null || !Intrinsics.LJFF(this.currentScene, str)) {
            return;
        }
        C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopObserveTask, scene=");
        sbLIZ.append(str);
        c547140Ld2.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        String str2 = this.autoTaskCache.clientTaskId;
        if (str2 != null) {
            C09AE c09ae = this.checkJob;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.checkJob = null;
            this.currentScene = null;
            ConcurrentHashMap<String, C13M7<String>> concurrentHashMap = AnonymousClass0913.LJI;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, C13M7<String>>> it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getValue(), arrayList);
            }
            if (!arrayList.contains(str2) && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                iCreationAsyncTaskManagerLIZ.LJII(str2);
            }
        }
    }

    private final void mobRequestAutoTask(AutoGenTaskResponse autoGenTaskResponse, String str) {
        AutoGenTaskModel autoGenTaskModel;
        String clientTaskId;
        String imprId;
        Object obj;
        String str2;
        LogPB logPB;
        if (autoGenTaskResponse != null) {
            autoGenTaskModel = autoGenTaskResponse.data;
        } else {
            autoGenTaskModel = null;
        }
        C0LAB c0lab = new C0LAB();
        String str3 = "";
        if (autoGenTaskModel == null || (clientTaskId = autoGenTaskModel.getClientTaskId()) == null) {
            clientTaskId = "";
        }
        c0lab.LJ("auto_client_task_id", clientTaskId);
        String str4 = this.autoTaskCache.clientTaskId;
        if (str4 == null) {
            str4 = "";
        }
        c0lab.LJ("auto_client_task_id_cache", str4);
        c0lab.LJ("auto_task_status_cache", this.autoTaskCache.status);
        c0lab.LJ("cameo_client_task_id_cache", this.autoTaskCache.cameoClientTaskId);
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        if (autoGenTaskResponse == null || (logPB = autoGenTaskResponse.logPb) == null || (imprId = logPB.getImprId()) == null) {
            imprId = "";
        }
        c0lab.LJ("logid", imprId);
        if (autoGenTaskResponse == null || (obj = autoGenTaskResponse.statusCode) == null) {
            obj = "";
        }
        c0lab.LIZLLL(obj, "status_code");
        if (autoGenTaskResponse != null && (str2 = autoGenTaskResponse.statusMsg) != null) {
            str3 = str2;
        }
        c0lab.LJ("status_msg", str3);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("request_auto_gen_task", c0lab.LIZ);
    }

    @Override // X.InterfaceC547720Ldy
    public void checkAutoTask(Lifecycle lifecycle, String str) {
        if (!isEnableCheckAutoTask()) {
            C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scene=");
            sbLIZ.append(str);
            sbLIZ.append(", disable checkAutoTask: ");
            sbLIZ.append(this.autoTaskCache);
            c547140Ld2.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.currentScene = str;
        C09AE c09ae = this.checkJob;
        if (c09ae != null && c09ae.isActive()) {
            C547140Ld2 c547140Ld22 = C546820LcW.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scene=");
            sbLIZ2.append(str);
            sbLIZ2.append(", skip checkAutoTask: already running");
            c547140Ld22.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        String autoTaskId = getAutoTaskId();
        if (autoTaskId == null) {
            return;
        }
        synchronized (this) {
            try {
                C09AE c09ae2 = this.checkJob;
                if (c09ae2 != null && c09ae2.isActive()) {
                    C547140Ld2 c547140Ld23 = C546820LcW.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("scene=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", skip checkAutoTask: already running");
                    c547140Ld23.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                this.checkJob = C23250099c.LIZLLL(this.coroutineScope, C0PEM.LIZJ, null, new C535440KzG(this, autoTaskId, str, null), 2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC547720Ldy
    public void setAutoTaskId(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            this.autoTaskCache = new AIGCAutoTaskCache(null, str, str2, "workflow_not_submitted", getFormatter().format(Long.valueOf(System.currentTimeMillis())), currentUid(), 1, null);
            storeAutoTaskCache();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String submitWorkflow(String str, String str2) {
        boolean z;
        String str3;
        String str4;
        int i = 0;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String str5 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        CreativeInfo creativeInfo = new CreativeInfo(null, i, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        C547860LeC.LIZ.getClass();
        C546230LbZ c546230LbZLJ = C547860LeC.LIZIZ().LJ(C0LOK.LIZ);
        if (c546230LbZLJ == null) {
            return "";
        }
        if (str == null) {
            str3 = new AITheaterSessionModel(str5, objArr3 == true ? 1 : 0, i, objArr2 == true ? 1 : 0, 15, objArr == true ? 1 : 0).traceId;
        } else {
            str3 = str;
        }
        AITheaterCreationModel aITheaterCreationModel = new AITheaterCreationModel(new AITheaterSessionModel(str3, creativeInfo.getCreationId(), 0, Source.AI_THEATER.getSource()), new WritableAITheaterGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null));
        C546900Lce.LIZ(aITheaterCreationModel, AFwS239S0000000_8.get$arr$(152));
        InterfaceC546090LbL interfaceC546090LbL = c546230LbZLJ.LIZ;
        String creationId = creativeInfo.getCreationId();
        C546290Lbf c546290LbfLJI = c546230LbZLJ.LJI();
        if (c546290LbfLJI == null || (str4 = c546290LbfLJI.LIZJ) == null) {
            str4 = "cameo";
        }
        C546750LcP c546750LcP = new C546750LcP(interfaceC546090LbL, str4, creationId, aITheaterCreationModel, new AICreateBusinessExtra(null, EnumC547830Le9.AUTO_CREATE.getScene(), Boolean.TRUE, str2), null);
        C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitWorkflow: ");
        sbLIZ.append(str);
        c547140Ld2.LIZ("AITheaterAutoTaskServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        return getCreateService().iw(c546750LcP);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runCheckAutoTask(java.lang.String r18, java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl.runCheckAutoTask(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[PHI: r10
      0x0095: PHI (r10v4 java.lang.String) = (r10v2 java.lang.String), (r10v5 java.lang.String) binds: [B:29:0x0093, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object buildAIGCCreativeModel(java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.List<java.lang.String> r44, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel> r45) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl.buildAIGCCreativeModel(java.lang.String, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    @Override // X.InterfaceC547720Ldy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object saveDraft(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List<java.lang.String> r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl.saveDraft(java.lang.String, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public static final class AIGCAutoTaskCache {

        @C09CT("business")
        public String business;

        @C09CT("cameo_client_task_id")
        public String cameoClientTaskId;

        @C09CT("client_task_id")
        public String clientTaskId;

        @C09CT("create_time")
        public String createTime;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public String status;

        @C09CT("uid")
        public String uid;

        public AIGCAutoTaskCache() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIGCAutoTaskCache)) {
                return false;
            }
            AIGCAutoTaskCache aIGCAutoTaskCache = (AIGCAutoTaskCache) obj;
            return Intrinsics.LJFF(this.business, aIGCAutoTaskCache.business) && Intrinsics.LJFF(this.cameoClientTaskId, aIGCAutoTaskCache.cameoClientTaskId) && Intrinsics.LJFF(this.clientTaskId, aIGCAutoTaskCache.clientTaskId) && Intrinsics.LJFF(this.status, aIGCAutoTaskCache.status) && Intrinsics.LJFF(this.createTime, aIGCAutoTaskCache.createTime) && Intrinsics.LJFF(this.uid, aIGCAutoTaskCache.uid);
        }

        public final int hashCode() {
            int iHashCode = this.business.hashCode() * 31;
            String str = this.cameoClientTaskId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clientTaskId;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.status.hashCode()) * 31;
            String str3 = this.createTime;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.uid;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCAutoTaskCache(business=");
            sbLIZ.append(this.business);
            sbLIZ.append(", cameoClientTaskId=");
            sbLIZ.append(this.cameoClientTaskId);
            sbLIZ.append(", clientTaskId=");
            sbLIZ.append(this.clientTaskId);
            sbLIZ.append(", status=");
            sbLIZ.append(this.status);
            sbLIZ.append(", createTime=");
            sbLIZ.append(this.createTime);
            sbLIZ.append(", uid=");
            sbLIZ.append(this.uid);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AIGCAutoTaskCache(String str, String str2, String str3, String str4, String str5, String str6) {
            this.business = str;
            this.cameoClientTaskId = str2;
            this.clientTaskId = str3;
            this.status = str4;
            this.createTime = str5;
            this.uid = str6;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AIGCAutoTaskCache(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String uid = str6;
            String str10 = (i & 1) != 0 ? "ai_theater" : str;
            str9 = (i & 2) != 0 ? null : str9;
            str8 = (i & 4) != 0 ? null : str8;
            str7 = (i & 8) != 0 ? "" : str7;
            String str11 = (i & 16) == 0 ? str5 : null;
            if ((i & 32) != 0) {
                C0XQ7.LJ();
                uid = C0XQ7.LIZ.LJIIJ().getCurUser().getUid();
            }
            this(str10, str9, str8, str7, str11, uid);
        }
    }
}
