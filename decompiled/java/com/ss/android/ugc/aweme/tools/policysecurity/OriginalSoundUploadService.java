package com.ss.android.ugc.aweme.tools.policysecurity;

import X.C0CHQ;
import X.C0VSJ;
import X.C0VY4;
import X.C13LP;
import X.C1437510nVl;
import X.C1441440nc6;
import X.C1441450nc7;
import X.C1441490ncB;
import X.C1441540ncG;
import X.C1441580ncK;
import X.C1441600ncM;
import X.C1441720ncY;
import X.C1444650nhH;
import X.C1466860oH6;
import X.C1466870oH7;
import X.C1466880oH8;
import X.C15O7;
import X.C1AF0;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2207921BbC;
import X.C2214201BlK;
import X.C2409809cO;
import X.C2486109oh;
import X.C259800zU;
import X.C788530UwV;
import X.C805360ViY;
import X.C817700W5w;
import X.EnumC19551211eQ;
import X.InterfaceC2208111BbV;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.SafeJobIntentService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v7.o;

/* JADX INFO: loaded from: classes23.dex */
public final class OriginalSoundUploadService extends SafeJobIntentService {
    @Override // androidx.core.app.SafeJobIntentService, androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(Intent intent) {
        UploadVideoConfig uploadVideoConfig;
        C15O7<OriginalSoundUploadTask> c15o7LIZLLL;
        boolean z;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            C1441540ncG c1441540ncGLIZ = C1441580ncK.LIZ(applicationContext);
            C1444650nhH.LIZ.getClass();
            String strLIZ = C1444650nhH.LIZ();
            if (TextUtils.isEmpty(strLIZ)) {
                return;
            }
            try {
                UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJII(strLIZ, UploadAuthKeyConfig.class);
                if (uploadAuthKeyConfig != null && (uploadVideoConfig = uploadAuthKeyConfig.videoConfig) != null) {
                    ArrayList<OriginalSoundUploadTask> arrayListLIZIZ = c1441540ncGLIZ.LIZIZ();
                    ArrayList<C1441600ncM> arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (OriginalSoundUploadTask originalSoundUploadTask : arrayListLIZIZ) {
                        String str = originalSoundUploadTask.unionId;
                        Object arrayList2 = linkedHashMap.get(str);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(str, arrayList2);
                        }
                        ((List) arrayList2).add(originalSoundUploadTask);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        if (str2 != null && str2.length() != 0) {
                            C1441600ncM c1441600ncM = new C1441600ncM();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((ArrayList) c1441600ncM.LIZ).add(it2.next());
                            }
                            arrayList.add(c1441600ncM);
                        } else {
                            for (Object obj : list) {
                                C1441600ncM c1441600ncM2 = new C1441600ncM();
                                ((ArrayList) c1441600ncM2.LIZ).add(obj);
                                arrayList.add(c1441600ncM2);
                            }
                        }
                    }
                    ArrayList<C1441600ncM> arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (System.currentTimeMillis() - ((OriginalSoundUploadTask) C13LP.LJJJJZI(((C1441600ncM) obj2).LIZ)).updateTime > 21600000) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList.removeAll(arrayList3);
                    for (C1441600ncM c1441600ncM3 : arrayList3) {
                        LIZJ(c1441600ncM3, c1441540ncGLIZ);
                        for (OriginalSoundUploadTask originalSoundUploadTask2 : (ArrayList) c1441600ncM3.LIZ) {
                            C1441490ncB c1441490ncB = new C1441490ncB();
                            c1441490ncB.LIZ = originalSoundUploadTask2.awemeId;
                            c1441490ncB.LJ = Boolean.valueOf(originalSoundUploadTask2.isBackup);
                            c1441490ncB.LIZLLL = Boolean.valueOf(originalSoundUploadTask2.isDraft);
                            c1441490ncB.LIZIZ = originalSoundUploadTask2.matchFactors;
                            c1441490ncB.LIZJ = Integer.valueOf(originalSoundUploadTask2.origin);
                            if (originalSoundUploadTask2.queryTimes > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c1441490ncB.LJII = Boolean.valueOf(z);
                            c1441490ncB.LJI = 0;
                            c1441490ncB.LJFF = -4002;
                            C805360ViY.LIZ(C1441440nc6.LIZ(c1441490ncB), C0VY4.LIZ(new Throwable("AuditOutdated")), "AuditOutdated", "creative_tools_audit_outdated_error");
                        }
                    }
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("original_sound", "pending task count: " + arrayList.size());
                    for (C1441600ncM c1441600ncM4 : arrayList) {
                        for (OriginalSoundUploadTask originalSoundUploadTask3 : (ArrayList) c1441600ncM4.LIZ) {
                            originalSoundUploadTask3.queryTimes++;
                            c1441540ncGLIZ.LIZ(originalSoundUploadTask3);
                        }
                        for (OriginalSoundUploadTask originalSoundUploadTask4 : (ArrayList) c1441600ncM4.LIZ) {
                            try {
                                c15o7LIZLLL = LIZLLL(originalSoundUploadTask4, uploadVideoConfig);
                                c15o7LIZLLL.LJIJJLI();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("upload interrupted for awemeId: ");
                                sbLIZ.append(originalSoundUploadTask4.awemeId);
                                sbLIZ.append(", reason: ");
                                sbLIZ.append(Log.getStackTraceString(e));
                                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("original_sound", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            if (!c15o7LIZLLL.LJIILL() && !c15o7LIZLLL.LJIILIIL()) {
                                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("upload uri: ");
                                sbLIZ2.append(originalSoundUploadTask4.audioVid);
                                sbLIZ2.append(", awemeId: ");
                                sbLIZ2.append(originalSoundUploadTask4.awemeId);
                                sbLIZ2.append(" success");
                                c1437510nVlLJJLIIIJ.LIZ("original_sound", C2188811AlT.LIZIZ(sbLIZ2));
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("upload failed for awemeId: ");
                                sbLIZ3.append(originalSoundUploadTask4.awemeId);
                                sbLIZ3.append(", reason: ");
                                sbLIZ3.append(Log.getStackTraceString(c15o7LIZLLL.LJIIJJI()));
                                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("original_sound", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                        C15O7.LJIIJ(c1441600ncM4).LJI(new C1466860oH6(this, c1441540ncGLIZ, 3)).LIZLLL(new C1466880oH8(this, c1441600ncM4, c1441540ncGLIZ, 1)).LIZLLL(new C1466870oH7(c1441600ncM4, 3)).LJIJJLI();
                        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("original_sound", "original sound upload success.");
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("AuthkeyCache", strLIZ);
                C1AF0.LIZLLL("AuthkeyCache", linkedHashMap2);
            }
        }
    }

    public static void LIZJ(C1441600ncM c1441600ncM, C1441540ncG c1441540ncG) {
        for (OriginalSoundUploadTask originalSoundUploadTask : (ArrayList) c1441600ncM.LIZ) {
            c1441540ncG.getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{originalSoundUploadTask.awemeId});
            new C0VSJ(originalSoundUploadTask.originalSoundPath).delete();
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cleanup original sound, awemeId: ");
            sbLIZ.append(originalSoundUploadTask.awemeId);
            c1437510nVlLJJLIIIJ.LIZ("original_sound", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.1BbC, com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader] */
    public final C15O7<OriginalSoundUploadTask> LIZLLL(final OriginalSoundUploadTask originalSoundUploadTask, final UploadVideoConfig uploadVideoConfig) {
        if (originalSoundUploadTask.audioVid != null) {
            return C15O7.LJIIJ(originalSoundUploadTask);
        }
        int iLIZ = C2486109oh.LIZ(originalSoundUploadTask.originalSoundPath);
        if (iLIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file error, ");
            sbLIZ.append(originalSoundUploadTask.originalSoundPath);
            sbLIZ.append(" checkResult = ");
            sbLIZ.append(iLIZ);
            return C15O7.LJIIIZ(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        final o oVar = new o();
        final C259800zU c259800zU = new C259800zU();
        try {
            C1441720ncY c1441720ncY = C1441720ncY.LIZ;
            EnumC19551211eQ enumC19551211eQ = EnumC19551211eQ.NORMAL;
            c1441720ncY.getClass();
            ?? c2207921BbC = new C2207921BbC(uploadVideoConfig, enumC19551211eQ);
            c259800zU.element = c2207921BbC;
            c2207921BbC.LIZLLL("original_sound");
            ((AbstractVideoUploader) c259800zU.element).LJI(originalSoundUploadTask.awemeId);
            ((AbstractVideoUploader) c259800zU.element).LJ(new InterfaceC2208111BbV() { // from class: X.0ncH
                @Override // X.InterfaceC2208111BbV
                public final void LIZ() {
                }

                @Override // X.InterfaceC2208111BbV
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC2208111BbV
                public final void LIZJ() {
                }

                @Override // X.InterfaceC2208111BbV
                public final int LJ() {
                    return C1404960mfG.LIZ(uploadVideoConfig, "OriginalSoundUpload");
                }

                @Override // X.InterfaceC2208111BbV
                public final void LIZLLL(int i, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                    c259800zU.element.LIZIZ();
                    if (i == 0) {
                        originalSoundUploadTask.audioVid = videoUploadInfo.mVideoId;
                        c259800zU.element.LIZ();
                        oVar.LIZJ(originalSoundUploadTask);
                        return;
                    }
                    c259800zU.element.LIZJ();
                    if (i != 2) {
                        return;
                    }
                    c259800zU.element.LIZ();
                    o<OriginalSoundUploadTask> oVar2 = oVar;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("upload failed ");
                    sbLIZ2.append(j);
                    sbLIZ2.append('.');
                    oVar2.LIZIZ(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2)));
                    OriginalSoundUploadService originalSoundUploadService = this;
                    OriginalSoundUploadTask originalSoundUploadTask2 = originalSoundUploadTask;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("upload errcode: ");
                    sbLIZ3.append(Long.valueOf(videoUploadInfo.mErrorCode));
                    sbLIZ3.append(" extra : ");
                    sbLIZ3.append(videoUploadInfo.mExtra);
                    sbLIZ3.append(" events: null ");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    Long lValueOf = Long.valueOf(videoUploadInfo.mErrorCode);
                    originalSoundUploadService.getClass();
                    OriginalSoundUploadService.LIZIZ(originalSoundUploadTask2, strLIZIZ, lValueOf);
                }
            });
            ((AbstractVideoUploader) c259800zU.element).LJFF(originalSoundUploadTask.originalSoundPath);
            ((AbstractVideoUploader) c259800zU.element).LJII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractVideoUploader abstractVideoUploader = (AbstractVideoUploader) c259800zU.element;
            if (abstractVideoUploader != null) {
                abstractVideoUploader.LIZ();
            }
            LIZIZ(originalSoundUploadTask, Log.getStackTraceString(e), 0L);
            oVar.LIZIZ(e);
        }
        return oVar.LIZ;
    }

    public static void LIZIZ(OriginalSoundUploadTask originalSoundUploadTask, String str, Long l) {
        long jLongValue;
        C1441490ncB c1441490ncB = new C1441490ncB();
        c1441490ncB.LIZ = originalSoundUploadTask.awemeId;
        c1441490ncB.LJ = Boolean.valueOf(originalSoundUploadTask.isBackup);
        c1441490ncB.LIZLLL = Boolean.valueOf(originalSoundUploadTask.isDraft);
        c1441490ncB.LIZIZ = originalSoundUploadTask.matchFactors;
        c1441490ncB.LIZJ = Integer.valueOf(originalSoundUploadTask.origin);
        boolean z = true;
        if (originalSoundUploadTask.queryTimes <= 1) {
            z = false;
        }
        c1441490ncB.LJII = Boolean.valueOf(z);
        c1441490ncB.LJI = 0;
        c1441490ncB.LJIIIZ = str;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1441490ncB.LJIIIIZZ = jLongValue;
        c1441490ncB.LJFF = -3001;
        C1441450nc7.LIZ(c1441490ncB);
    }

    public static void LIZ(OriginalSoundUploadTask originalSoundUploadTask, String str, int i, int i2) {
        C1441490ncB c1441490ncB = new C1441490ncB();
        c1441490ncB.LIZ = originalSoundUploadTask.awemeId;
        c1441490ncB.LJ = Boolean.valueOf(originalSoundUploadTask.isBackup);
        c1441490ncB.LIZLLL = Boolean.valueOf(originalSoundUploadTask.isDraft);
        c1441490ncB.LIZIZ = originalSoundUploadTask.matchFactors;
        c1441490ncB.LIZJ = Integer.valueOf(originalSoundUploadTask.origin);
        boolean z = true;
        if (originalSoundUploadTask.queryTimes <= 1) {
            z = false;
        }
        c1441490ncB.LJII = Boolean.valueOf(z);
        c1441490ncB.LJI = i2;
        c1441490ncB.LJIIIZ = str;
        c1441490ncB.LJFF = Integer.valueOf(i);
        C1441450nc7.LIZ(c1441490ncB);
    }
}
