package com.ss.android.ugc.aweme.tools.extract.video;

import X.C08SA;
import X.C0CHQ;
import X.C0VSJ;
import X.C0VY4;
import X.C1432620nNs;
import X.C1437510nVl;
import X.C1441390nc1;
import X.C1441410nc3;
import X.C1441440nc6;
import X.C1441450nc7;
import X.C1441460nc8;
import X.C1441490ncB;
import X.C1441520ncE;
import X.C1466880oH8;
import X.C15O7;
import X.C19221910Hx;
import X.C201955140j;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2207811Bb1;
import X.C2208411Bbz;
import X.C2214201BlK;
import X.C2354709Kn;
import X.C2409809cO;
import X.C346460Di8;
import X.C788530UwV;
import X.C805360ViY;
import X.C817700W5w;
import X.InterfaceC2207871Bb7;
import X.InterfaceC2385309Wh;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.SafeJobIntentService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lth.o;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes23.dex */
public class VideoFramesUploadService extends SafeJobIntentService {
    public static final /* synthetic */ int LL = 0;

    public static void LJ(C1441520ncE c1441520ncE) {
        boolean z;
        C1441490ncB c1441490ncB = new C1441490ncB();
        c1441490ncB.LIZ = c1441520ncE.LIZ;
        c1441490ncB.LJ = Boolean.valueOf(c1441520ncE.LJIIL);
        c1441490ncB.LIZLLL = Boolean.valueOf(c1441520ncE.LJIIJ);
        c1441490ncB.LIZIZ = c1441520ncE.LJIIIZ;
        c1441490ncB.LIZJ = Integer.valueOf(c1441520ncE.LJIIJJI);
        if (c1441520ncE.LJIILIIL > 1) {
            z = true;
        } else {
            z = false;
        }
        c1441490ncB.LJII = Boolean.valueOf(z);
        c1441490ncB.LJI = 1;
        C1441450nc7.LIZJ(c1441490ncB);
    }

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
        final String stringExtra;
        String stringExtra2;
        int i;
        boolean z;
        C15O7 c15o7LIZIZ;
        boolean z2;
        boolean zLJI = MethodIDManager.LJI(196705);
        if (o.LJIIZILJ.LIZ()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1432620nNs c1432620nNs = null;
        try {
            stringExtra = intent.getStringExtra("aid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C1441390nc1.LIZ(stringExtra, "handle_work");
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        final C1441460nc8 c1441460nc8LIZIZ = C1441460nc8.LIZIZ(applicationContext);
        if (intent != null) {
            try {
                stringExtra2 = intent.getStringExtra("authkey");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
        } else {
            stringExtra2 = "";
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            C1441390nc1.LIZ(stringExtra, "authkey_error");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        try {
            final UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) new e().LIZ().LJII(stringExtra2, UploadAuthKeyConfig.class);
            if (uploadAuthKeyConfig != null && uploadAuthKeyConfig.frameUploadConfig != null) {
                C1441390nc1.LIZ(stringExtra, "database_query");
                List<C1441520ncE> listLIZLLL = c1441460nc8LIZIZ.LIZLLL();
                ArrayList<C1441410nc3> arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : (ArrayList) listLIZLLL) {
                    String str = ((C1441520ncE) obj).LJIIIIZZ;
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (str2 != null && str2.length() != 0) {
                        C1441410nc3 c1441410nc3 = new C1441410nc3();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((ArrayList) c1441410nc3.LIZ).add(it3.next());
                        }
                        arrayList.add(c1441410nc3);
                    } else {
                        for (Object obj2 : list) {
                            C1441410nc3 c1441410nc32 = new C1441410nc3();
                            ((ArrayList) c1441410nc32.LIZ).add(obj2);
                            arrayList.add(c1441410nc32);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    C1441390nc1.LIZ(stringExtra, "database_query_empty");
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("extract_frame", "task is empty");
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                for (C1441410nc3 c1441410nc33 : arrayList) {
                    Iterator it4 = ((ArrayList) c1441410nc33.LIZ).iterator();
                    while (it4.hasNext()) {
                        ((C1441520ncE) it4.next()).LJIILIIL++;
                    }
                    c1441460nc8LIZIZ.LIZ(c1441410nc33);
                }
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pending task count: ");
                sbLIZ.append(arrayList.size());
                c1437510nVlLJJLIIIJ.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ));
                for (final C1441410nc3 c1441410nc34 : arrayList) {
                    if (!((ArrayList) c1441410nc34.LIZ).isEmpty()) {
                        if (System.currentTimeMillis() - ((C1441520ncE) ListProtector.get(c1441410nc34.LIZ, i)).LJII > 21600000) {
                            for (C1441520ncE c1441520ncE : (ArrayList) c1441410nc34.LIZ) {
                                C1441490ncB c1441490ncB = new C1441490ncB();
                                c1441490ncB.LIZ = c1441520ncE.LIZ;
                                c1441490ncB.LJ = Boolean.valueOf(c1441520ncE.LJIIL);
                                c1441490ncB.LIZLLL = Boolean.valueOf(c1441520ncE.LJIIJ);
                                c1441490ncB.LIZIZ = c1441520ncE.LJIIIZ;
                                c1441490ncB.LIZJ = Integer.valueOf(c1441520ncE.LJIIJJI);
                                if (c1441520ncE.LJIILIIL > 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c1441490ncB.LJII = Boolean.valueOf(z);
                                c1441490ncB.LJI = i;
                                c1441490ncB.LJFF = -4001;
                                C805360ViY.LIZ(C1441440nc6.LIZ(c1441490ncB), C0VY4.LIZ(new Throwable("AuditOutdated")), "AuditOutdated", "creative_tools_audit_outdated_error");
                            }
                            Iterator it5 = ((ArrayList) c1441410nc34.LIZ).iterator();
                            while (it5.hasNext()) {
                                LIZ((C1441520ncE) it5.next(), c1441460nc8LIZIZ);
                            }
                        } else {
                            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("extract_frame", "ready to package zip");
                            Iterator it6 = ((ArrayList) c1441410nc34.LIZ).iterator();
                            C1441390nc1.LIZ(stringExtra, "create_package_task");
                            while (it6.hasNext()) {
                                C1441520ncE c1441520ncE2 = (C1441520ncE) it6.next();
                                try {
                                    c15o7LIZIZ = LIZIZ(c1432620nNs, c1441520ncE2);
                                    c15o7LIZIZ.LJIJJLI();
                                } catch (InterruptedException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    C1441390nc1.LIZ(stringExtra, "create_package_task_error");
                                    C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("zip interrupted for awemeId: ");
                                    sbLIZ2.append(c1441520ncE2.LIZ);
                                    sbLIZ2.append(", reason: ");
                                    sbLIZ2.append(Log.getStackTraceString(e3));
                                    c1437510nVlLJJLIIIJ2.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                                if (!c15o7LIZIZ.LJIILL() && !c15o7LIZIZ.LJIILIIL()) {
                                    C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("zip path: ");
                                    sbLIZ3.append(c1441520ncE2.LJFF);
                                    sbLIZ3.append(", awemeId: ");
                                    sbLIZ3.append(c1441520ncE2.LIZ);
                                    sbLIZ3.append(" success");
                                    c1437510nVlLJJLIIIJ3.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ3));
                                } else {
                                    it6.remove();
                                    LIZ(c1441520ncE2, c1441460nc8LIZIZ);
                                    C1437510nVl c1437510nVlLJJLIIIJ4 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("zip failed for awemeId: ");
                                    sbLIZ4.append(c1441520ncE2.LIZ);
                                    sbLIZ4.append(", reason: ");
                                    sbLIZ4.append(Log.getStackTraceString(c15o7LIZIZ.LJIIJJI()));
                                    c1437510nVlLJJLIIIJ4.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ4));
                                    C1441490ncB c1441490ncB2 = new C1441490ncB();
                                    c1441490ncB2.LIZ = c1441520ncE2.LIZ;
                                    c1441490ncB2.LJ = Boolean.valueOf(c1441520ncE2.LJIIL);
                                    c1441490ncB2.LIZLLL = Boolean.valueOf(c1441520ncE2.LJIIJ);
                                    c1441490ncB2.LIZIZ = c1441520ncE2.LJIIIZ;
                                    c1441490ncB2.LIZJ = Integer.valueOf(c1441520ncE2.LJIIJJI);
                                    if (c1441520ncE2.LJIILIIL > 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c1441490ncB2.LJII = Boolean.valueOf(z2);
                                    c1441490ncB2.LJI = i;
                                    c1441490ncB2.LJIIIZ = Log.getStackTraceString(c15o7LIZIZ.LJIIJJI());
                                    c1441490ncB2.LJFF = -2001;
                                    C1441450nc7.LIZJ(c1441490ncB2);
                                    c1432620nNs = null;
                                }
                            }
                            final String str3 = stringExtra;
                            try {
                                C15O7.LJIIJ(c1441410nc34).LJI(new InterfaceC2385309Wh() { // from class: X.0ncA
                                    @Override // X.InterfaceC2385309Wh
                                    public final Object then(C15O7 c15o7) {
                                        C15O7<C1441520ncE> c15o7LIZJ;
                                        VideoFramesUploadService videoFramesUploadService = this.LIZ;
                                        C1441460nc8 c1441460nc8 = c1441460nc8LIZIZ;
                                        C1441410nc3 c1441410nc35 = c1441410nc34;
                                        UploadAuthKeyConfig uploadAuthKeyConfig2 = uploadAuthKeyConfig;
                                        String str4 = str3;
                                        videoFramesUploadService.getClass();
                                        C1C7U.LIZ("VideoFramesUploadService@993f.onHandleWork$1L");
                                        if (c15o7.LJIILL()) {
                                            C15O7 c15o7LJIIIZ = C15O7.LJIIIZ(c15o7.LJIIJJI());
                                            C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$1L");
                                            return c15o7LJIIIZ;
                                        }
                                        c1441460nc8.LIZ((C1441410nc3) c15o7.LJIIL());
                                        Iterator it7 = ((ArrayList) ((C1441410nc3) c15o7.LJIIL()).LIZ).iterator();
                                        while (it7.hasNext()) {
                                            it7.next();
                                        }
                                        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("extract_frame", "package zip success.");
                                        C1441390nc1.LIZ(str4, "create_upload_task");
                                        for (C1441520ncE c1441520ncE3 : (ArrayList) c1441410nc35.LIZ) {
                                            try {
                                                c15o7LIZJ = videoFramesUploadService.LIZJ(c1441520ncE3, uploadAuthKeyConfig2);
                                                c15o7LIZJ.LJIJJLI();
                                            } catch (InterruptedException e4) {
                                                TryCatchGuardChecker.doCheck(e4);
                                                C1437510nVl c1437510nVlLJJLIIIJ5 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("upload interrupted for awemeId: ");
                                                sbLIZ5.append(c1441520ncE3.LIZ);
                                                sbLIZ5.append(", reason: ");
                                                sbLIZ5.append(Log.getStackTraceString(e4));
                                                c1437510nVlLJJLIIIJ5.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ5));
                                            }
                                            if (!c15o7LIZJ.LJIILL() && !c15o7LIZJ.LJIILIIL()) {
                                                C1437510nVl c1437510nVlLJJLIIIJ6 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("upload uri: ");
                                                sbLIZ6.append(c1441520ncE3.LJ);
                                                sbLIZ6.append(", awemeId: ");
                                                sbLIZ6.append(c1441520ncE3.LIZ);
                                                sbLIZ6.append(" success");
                                                c1437510nVlLJJLIIIJ6.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ6));
                                            } else {
                                                C1437510nVl c1437510nVlLJJLIIIJ7 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                sbLIZ7.append("upload failed for awemeId: ");
                                                sbLIZ7.append(c1441520ncE3.LIZ);
                                                sbLIZ7.append(", reason: ");
                                                sbLIZ7.append(Log.getStackTraceString(c15o7LIZJ.LJIIJJI()));
                                                c1437510nVlLJJLIIIJ7.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ7));
                                            }
                                        }
                                        C15O7 c15o7LJIIJ = C15O7.LJIIJ(c1441410nc35);
                                        C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$1L");
                                        return c15o7LJIIJ;
                                    }
                                }).LJI(new InterfaceC2385309Wh() { // from class: X.0nc9
                                    @Override // X.InterfaceC2385309Wh
                                    public final Object then(C15O7 c15o7) {
                                        boolean z3;
                                        C15O7<BaseResponse> c15o7LJIIIZ;
                                        Integer numValueOf;
                                        VideoFramesUploadService videoFramesUploadService = this.LIZ;
                                        C1441460nc8 c1441460nc8 = c1441460nc8LIZIZ;
                                        String str4 = stringExtra;
                                        videoFramesUploadService.getClass();
                                        C1C7U.LIZ("VideoFramesUploadService@993f.onHandleWork$2L");
                                        if (c15o7.LJIILL()) {
                                            C15O7 c15o7LJIIIZ2 = C15O7.LJIIIZ(c15o7.LJIIJJI());
                                            C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$2L");
                                            return c15o7LJIIIZ2;
                                        }
                                        if (C0CHQ.LIZ().getAccountService() != null && C0CHQ.LIZ().getAccountService().LIZ()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            C15O7 c15o7LJIIIZ3 = C15O7.LJIIIZ(new IllegalStateException("stop task manually for specified case"));
                                            C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$2L");
                                            return c15o7LJIIIZ3;
                                        }
                                        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("extract_frame", "upload zip success");
                                        C1441410nc3 c1441410nc35 = (C1441410nc3) c15o7.LJIIL();
                                        c1441460nc8.LIZ(c1441410nc35);
                                        for (C1441520ncE c1441520ncE3 : (ArrayList) c1441410nc35.LIZ) {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("VideoFramesUploadService");
                                            sbLIZ5.append(" upload zip succeed,uri:");
                                            sbLIZ5.append(c1441520ncE3.LJ);
                                            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        try {
                                            C1441390nc1.LIZ(str4, "create_report_task");
                                            InterfaceC1441510ncD interfaceC1441510ncD = (InterfaceC1441510ncD) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ()).create(InterfaceC1441510ncD.class);
                                            if (((ArrayList) c1441410nc35.LIZ).isEmpty()) {
                                                c15o7LJIIIZ = C15O7.LJIIIZ(new IllegalStateException("VideoFramesUploadModel is empty"));
                                            } else if (((ArrayList) c1441410nc35.LIZ).size() > 1) {
                                                c15o7LJIIIZ = interfaceC1441510ncD.LIZIZ(C1441500ncC.LIZ(c1441410nc35));
                                                c15o7LJIIIZ.LJIJJLI();
                                                for (C1441520ncE c1441520ncE4 : (ArrayList) c1441410nc35.LIZ) {
                                                    if (c15o7LJIIIZ.LJIILJJIL()) {
                                                        if (c15o7LJIIIZ.LJIIL().status_code == 0) {
                                                            VideoFramesUploadService.LJ(c1441520ncE4);
                                                        } else {
                                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                            sbLIZ6.append("response: ");
                                                            sbLIZ6.append(c15o7LJIIIZ.LJIIL().toString());
                                                            VideoFramesUploadService.LIZLLL(c1441520ncE4, C2188811AlT.LIZIZ(sbLIZ6), -3003);
                                                        }
                                                    } else {
                                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                        sbLIZ7.append("task fail with exception : ");
                                                        sbLIZ7.append(Log.getStackTraceString(c15o7LJIIIZ.LJIIJJI()));
                                                        VideoFramesUploadService.LIZLLL(c1441520ncE4, C2188811AlT.LIZIZ(sbLIZ7), -3003);
                                                    }
                                                }
                                            } else {
                                                C1441520ncE c1441520ncE5 = (C1441520ncE) ((ArrayList) c1441410nc35.LIZ).get(0);
                                                int i2 = c1441520ncE5.LIZIZ;
                                                if (i2 == -1) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf(i2);
                                                }
                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                sbLIZ8.append("[Original Frame] Reporting -AwemeId:");
                                                sbLIZ8.append(c1441520ncE5.LIZ);
                                                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ8));
                                                ExtractFramesModel extractFramesModel = c1441520ncE5.LJI;
                                                if (extractFramesModel != null && extractFramesModel.getStickerIds() != null) {
                                                    c15o7LJIIIZ = interfaceC1441510ncD.LIZ(c1441520ncE5.LIZ, c1441520ncE5.LIZLLL, c1441520ncE5.LJ, c1441520ncE5.LJI.getStickerIds(), numValueOf, Integer.valueOf(c1441520ncE5.LIZJ));
                                                } else {
                                                    c15o7LJIIIZ = interfaceC1441510ncD.LIZ(c1441520ncE5.LIZ, c1441520ncE5.LIZLLL, c1441520ncE5.LJ, null, numValueOf, Integer.valueOf(c1441520ncE5.LIZJ));
                                                }
                                                c15o7LJIIIZ.LJIJJLI();
                                                if (c15o7LJIIIZ.LJIILJJIL()) {
                                                    if (c15o7LJIIIZ.LJIIL().status_code == 0) {
                                                        C1441390nc1.LIZ(str4, "report_success");
                                                        VideoFramesUploadService.LJ(c1441520ncE5);
                                                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                        sbLIZ9.append("[Original Frame] Report Success -AwemeId:");
                                                        sbLIZ9.append(c1441520ncE5.LIZ);
                                                        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ9));
                                                    } else {
                                                        C1441390nc1.LIZ(str4, "report_fail");
                                                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                        sbLIZ10.append("response: ");
                                                        sbLIZ10.append(c15o7LJIIIZ.LJIIL().toString());
                                                        VideoFramesUploadService.LIZLLL(c1441520ncE5, C2188811AlT.LIZIZ(sbLIZ10), -3002);
                                                    }
                                                } else {
                                                    C1441390nc1.LIZ(str4, "report_fail");
                                                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                    sbLIZ11.append("task fail with exception : ");
                                                    sbLIZ11.append(Log.getStackTraceString(c15o7LJIIIZ.LJIIJJI()));
                                                    VideoFramesUploadService.LIZLLL(c1441520ncE5, C2188811AlT.LIZIZ(sbLIZ11), -3002);
                                                }
                                            }
                                        } catch (Exception e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                            C1441390nc1.LIZ(str4, "report_error");
                                            c15o7LJIIIZ = C15O7.LJIIIZ(e4);
                                        }
                                        C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$2L");
                                        return c15o7LJIIIZ;
                                    }
                                }).LIZLLL(new C1466880oH8(this, c1441410nc34, c1441460nc8LIZIZ, 2)).LIZLLL(new C346460Di8(1)).LJIJJLI();
                                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("extract_frame", "upload extract frame success.");
                            } catch (InterruptedException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            c1432620nNs = null;
                            i = 0;
                        }
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        C1441390nc1.LIZ(stringExtra, "authkey_error_2");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZ(C1441520ncE c1441520ncE, C1441460nc8 c1441460nc8) {
        String str = c1441520ncE.LIZ;
        c1441460nc8.getClass();
        if (!TextUtils.isEmpty(str)) {
            c1441460nc8.getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        }
        ExtractFramesModel extractFramesModel = c1441520ncE.LJI;
        if (extractFramesModel != null) {
            C2354709Kn.LJIJJ(extractFramesModel.getExtractFramesDir());
            C2354709Kn.LJIJJLI(c1441520ncE.LJI.getExtractFramesDir());
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cleanup frame, awemeId: ");
        sbLIZ.append(c1441520ncE.LIZ);
        c1437510nVlLJJLIIIJ.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C15O7 LIZIZ(C1432620nNs c1432620nNs, C1441520ncE c1441520ncE) {
        if (c1441520ncE == null) {
            C201955140j.LIZ("SaveLocalWithWatermark -> createDataPackageTask -> Error: VideoFramesUploadModel is null");
            return C15O7.LJIIIZ(new IllegalStateException("the upload model is null"));
        }
        if (!TextUtils.isEmpty(c1441520ncE.LJFF) && new C0VSJ(c1441520ncE.LJFF).exists()) {
            return C15O7.LJIIJ(c1441520ncE);
        }
        ExtractFramesModel extractFramesModel = c1441520ncE.LJI;
        if (extractFramesModel == null) {
            C201955140j.LIZ("SaveLocalWithWatermark -> createDataPackageTask -> Error: ExtractFramesModel is null");
            return C15O7.LJIIIZ(new IllegalStateException("the upload frameModel is null"));
        }
        List<FrameItem> allFrames = extractFramesModel.getAllFrames();
        if (allFrames.isEmpty()) {
            C201955140j.LIZ("SaveLocalWithWatermark -> createDataPackageTask -> Error: upload frames is empty");
            return C15O7.LJIIIZ(new IllegalStateException("the upload frames is empty"));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveLocalWithWatermark -> createDataPackageTask -> upload frames size: ");
        sbLIZ.append(allFrames.size());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        for (FrameItem frameItem : allFrames) {
            if (!arrayList.contains(frameItem.path)) {
                arrayList.add(frameItem.path);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Original Frame] Packing, total ");
        sbLIZ2.append(arrayList.size());
        sbLIZ2.append(" files -AwemeId:");
        sbLIZ2.append(c1441520ncE.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (c1432620nNs != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", source: ");
            sbLIZ3.append(c1432620nNs.LIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        C201955140j.LJIIL(strLIZIZ);
        String strLIZ = C08SA.LIZ(extractFramesModel.getExtractFramesDir(), arrayList);
        c1441520ncE.LJFF = strLIZ;
        if (strLIZ != null && C2354709Kn.LIZIZ(strLIZ)) {
            return C15O7.LJIIJ(c1441520ncE);
        }
        C201955140j.LIZ("SaveLocalWithWatermark -> createDataPackageTask -> Error: upload zipPath is empty");
        return C15O7.LJIIIZ(new IllegalStateException("the upload zipPath is empty"));
    }

    public final C15O7<C1441520ncE> LIZJ(final C1441520ncE c1441520ncE, UploadAuthKeyConfig uploadAuthKeyConfig) {
        boolean z;
        final C2207811Bb1 c2207811Bb1;
        if (C0CHQ.LIZ().getAccountService() != null && C0CHQ.LIZ().getAccountService().LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C15O7.LJIIIZ(new IllegalStateException("stop task manually for specified case"));
        }
        if (!TextUtils.isEmpty(c1441520ncE.LJ)) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("extract_frame", "skip upload");
            return C15O7.LJIIJ(c1441520ncE);
        }
        final v7.o oVar = new v7.o();
        try {
            int i = c1441520ncE.LIZIZ;
            if (i == 150 || i == 152) {
                c2207811Bb1 = new C2207811Bb1(uploadAuthKeyConfig.photoModeRawUploadConfig);
            } else {
                c2207811Bb1 = new C2207811Bb1(uploadAuthKeyConfig.frameUploadConfig);
            }
            c2207811Bb1.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nOK
                @Override // X.InterfaceC2207871Bb7
                public final void onLog(int i2, int i3, String str) {
                }

                @Override // X.InterfaceC2207871Bb7
                public final void LIZ(int i2, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                    long j2;
                    String str;
                    c2207811Bb1.LJ();
                    if (i2 == 6) {
                        c2207811Bb1.LIZJ();
                        C1441520ncE c1441520ncE2 = c1441520ncE;
                        if (imageUploadInfo != null) {
                            str = imageUploadInfo.mImageToskey;
                        } else {
                            str = null;
                        }
                        c1441520ncE2.LJ = str;
                        oVar.LIZJ(c1441520ncE2);
                        return;
                    }
                    c2207811Bb1.LJFF();
                    if (i2 != 7) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    c2207811Bb1.LIZJ();
                    VideoFramesUploadService videoFramesUploadService = this.LIZLLL;
                    C1441520ncE c1441520ncE3 = c1441520ncE;
                    long j3 = 0;
                    if (imageUploadInfo != null) {
                        j2 = imageUploadInfo.mErrorCode;
                    } else {
                        j2 = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("what : ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", code: ");
                    if (imageUploadInfo != null) {
                        j3 = imageUploadInfo.mErrorCode;
                    }
                    sbLIZ.append(j3);
                    sbLIZ.append(", events: ");
                    sbLIZ.append(jSONArray);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    videoFramesUploadService.getClass();
                    VideoFramesUploadService.LJFF(c1441520ncE3, j2, strLIZIZ);
                    oVar.LIZIZ(new IllegalStateException("upload zip file failed"));
                }
            });
            C2208411Bbz c2208411Bbz = new C2208411Bbz();
            c2208411Bbz.LIZJ(uploadAuthKeyConfig.imgConfig);
            c2207811Bb1.LJIIL(c2208411Bbz.LIZLLL());
            c2207811Bb1.LJIIJJI(C19221910Hx.LJFF());
            c2207811Bb1.LJIIIZ(1, new String[]{c1441520ncE.LJFF});
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Original Frame] Uploading -AwemeId:");
                sbLIZ.append(c1441520ncE.LIZ);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                c2207811Bb1.LJIILIIL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c2207811Bb1.LIZJ();
                LJFF(c1441520ncE, 0L, Log.getStackTraceString(e));
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJFF(c1441520ncE, 0L, Log.getStackTraceString(th));
            oVar.LIZIZ(new Exception(th));
        }
        return oVar.LIZ;
    }

    public static void LIZLLL(C1441520ncE c1441520ncE, String str, int i) {
        C1441490ncB c1441490ncB = new C1441490ncB();
        c1441490ncB.LIZ = c1441520ncE.LIZ;
        c1441490ncB.LJ = Boolean.valueOf(c1441520ncE.LJIIL);
        c1441490ncB.LIZLLL = Boolean.valueOf(c1441520ncE.LJIIJ);
        c1441490ncB.LIZIZ = c1441520ncE.LJIIIZ;
        c1441490ncB.LIZJ = Integer.valueOf(c1441520ncE.LJIIJJI);
        boolean z = true;
        if (c1441520ncE.LJIILIIL <= 1) {
            z = false;
        }
        c1441490ncB.LJII = Boolean.valueOf(z);
        c1441490ncB.LJIIIZ = str;
        c1441490ncB.LJI = 0;
        c1441490ncB.LJFF = Integer.valueOf(i);
        C1441450nc7.LIZJ(c1441490ncB);
    }

    public static void LJFF(C1441520ncE c1441520ncE, long j, String str) {
        C1441490ncB c1441490ncB = new C1441490ncB();
        c1441490ncB.LIZ = c1441520ncE.LIZ;
        c1441490ncB.LJ = Boolean.valueOf(c1441520ncE.LJIIL);
        c1441490ncB.LIZLLL = Boolean.valueOf(c1441520ncE.LJIIJ);
        c1441490ncB.LIZIZ = c1441520ncE.LJIIIZ;
        c1441490ncB.LIZJ = Integer.valueOf(c1441520ncE.LJIIJJI);
        boolean z = true;
        if (c1441520ncE.LJIILIIL <= 1) {
            z = false;
        }
        c1441490ncB.LJII = Boolean.valueOf(z);
        c1441490ncB.LJIIIIZZ = j;
        c1441490ncB.LJI = 0;
        c1441490ncB.LJIIIZ = str;
        c1441490ncB.LJFF = -3001;
        C1441450nc7.LIZJ(c1441490ncB);
    }
}
