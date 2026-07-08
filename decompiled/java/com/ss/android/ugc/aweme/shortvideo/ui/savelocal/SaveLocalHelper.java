package com.ss.android.ugc.aweme.shortvideo.ui.savelocal;

import X.C01GW;
import X.C08F1;
import X.C09CT;
import X.C0C1L;
import X.C0C64;
import X.C0CHQ;
import X.C0CNO;
import X.C0LAB;
import X.C0VSJ;
import X.C1390790mIP;
import X.C13SZ;
import X.C1436750nUX;
import X.C1436760nUY;
import X.C1436800nUc;
import X.C1437510nVl;
import X.C1441320nbu;
import X.C1449650npL;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C2286708xd;
import X.C2298308zV;
import X.C2354709Kn;
import X.C2471909mP;
import X.C285600BHi;
import X.C452501pT;
import X.EnumC20227914Cv;
import X.EnumC20228014Cw;
import X.InterfaceC1637880siw;
import android.app.Application;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes23.dex */
public final class SaveLocalHelper {
    public static final SaveLocalHelper LIZ = new SaveLocalHelper();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(170));

    public static final class ModerationMessage {

        @C09CT("pass")
        public final boolean pass;

        @C09CT("frame_id")
        public final String vframeId;

        public ModerationMessage() {
            this("", false);
        }

        public ModerationMessage(String str, boolean z) {
            this.vframeId = str;
            this.pass = z;
        }
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0CHQ.LIZ().getRegionService().getClass();
        if (C2222691Bz1.LJIIIZ()) {
            return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().enableSaveLocalInLegacyScenario();
        }
        return LIZIZ(videoPublishEditModel);
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        SaveLocalHelper saveLocalHelper = LIZ;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(videoPublishEditModel, 4);
        saveLocalHelper.getClass();
        C01GW c01gw = LIZIZ;
        boolean z = ((Keva) c01gw.getValue()).getBoolean("key_reset_action_performed", false);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_turn_off", true, false) && !z) {
            ((Keva) c01gw.getValue()).storeBoolean("key_reset_action_performed", true);
            C1441320nbu.LJI(videoPublishEditModel, 0);
        } else if (((Number) awS558S0100000_14.invoke()).intValue() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJ(java.lang.String r6) {
        /*
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5b
            r5.<init>(r6)     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = "frame_id"
            java.lang.String r3 = r5.optString(r0)     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = "pass"
            r4 = 0
            boolean r0 = r5.optBoolean(r0, r4)     // Catch: java.lang.Exception -> L5b
            if (r0 == 0) goto L1d
            r2 = 1
            if (r3 == 0) goto L1d
            int r0 = r3.length()     // Catch: java.lang.Exception -> L5b
            if (r0 != 0) goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.String r0 = "block_download"
            boolean r1 = r5.optBoolean(r0, r4)     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = "block_watermark"
            boolean r0 = r5.optBoolean(r0, r4)     // Catch: java.lang.Exception -> L5b
            if (r1 == 0) goto L37
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L5b
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L5b
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L5b
            return r2
        L37:
            if (r0 == 0) goto L44
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L5b
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L5b
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L5b
            return r2
        L44:
            if (r2 != 0) goto L50
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L5b
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L5b
            return r2
        L50:
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L5b
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L5b
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L5b
            return r2
        L5b:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            X.0nVl r2 = r0.LJJLIIIJ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "parse moderation message failed, stacktrace: "
            r1.append(r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r3)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "post_save_local"
            r2.LIZ(r0, r1)
            kotlin.Pair r2 = new kotlin.Pair
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper.LJ(java.lang.String):kotlin.Pair");
    }

    public static StringBuilder LJFF(String str) {
        return new StringBuilder(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.MODERATION_WATERMARK_VIDEO, C08F1.LIZIZ(str)));
    }

    public static String LIZLLL(String str, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("watermark-");
            if (str == null) {
                str = "none";
            }
            sbLIZ.append(new C0VSJ(str).getName());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str == null) {
            str = "none";
        }
        return new C0VSJ(str).getName();
    }

    public static void LJI(Long l, String str) {
        Iterator it2 = ((ArrayList) C1436760nUY.LIZIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C1436800nUc) next).LIZ, str)) {
                if (next != null) {
                    ((ArrayList) C1436760nUY.LIZIZ).remove(next);
                    C1436760nUY.LIZIZ();
                }
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        if (l != null) {
            c0lab.LIZIZ(l.longValue(), "package_size");
        }
        C20684815ws.LJIILLIIL("download_end", c0lab.LIZ);
    }

    public static void LJII(File file, boolean z) throws Throwable {
        boolean z2;
        String name = file.getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1449650npL.LIZ());
        sbLIZ.append(name);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C285600BHi.LIZ() && Build.VERSION.SDK_INT >= 29) {
            try {
                Application application = C0CHQ.LIZ;
                String absolutePath = file.getAbsolutePath();
                if (!z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2471909mP.LJJIJIIJI(application, absolutePath, name, z2, null, 112);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2354709Kn.LIZLLL(file.getAbsolutePath(), strLIZIZ);
                InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("saveVideoToMediaStore exception ");
                sbLIZ2.append(e.getMessage());
                interfaceC1637880siwLIZJ.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        C2354709Kn.LIZLLL(file.getAbsolutePath(), strLIZIZ);
    }

    public static void LJIIIIZZ(String str, WatermarkMetadata watermarkMetadata) throws Throwable {
        boolean z;
        if (!C0C1L.LIZ()) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(LJFF(str).toString());
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try save local when timeout or failed, videoRoot=");
        sbLIZ.append(c0vsj);
        sbLIZ.append(", vframeId=");
        sbLIZ.append(str);
        sbLIZ.append(", stack: ");
        sbLIZ.append(C13SZ.LIZIZ(new Throwable()));
        c1437510nVlLJJLIIIJ.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            boolean z2 = watermarkMetadata.isImageMode;
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                long length = 0;
                for (File file : fileArrListFiles) {
                    ConcurrentHashSet<String> concurrentHashSet = C1436750nUX.LIZ;
                    if (!Intrinsics.LJFF(file.getName(), "metadata.json") && !u.LJJIIJZLJL(file.getName(), "watermark-", false)) {
                        if (u.LJIIZILJ(file.getName(), ".mp4", false)) {
                            z = false;
                        } else {
                            z = z2;
                        }
                        LIZ.getClass();
                        LJII(file, z);
                        length += file.length();
                    }
                }
                C2354709Kn.LJIJI(c0vsj);
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "save local succeeded");
                LJI(Long.valueOf(length), watermarkMetadata.creationId);
                return;
            }
            C2354709Kn.LJIJI(c0vsj);
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local because watermark file directory empty");
            LJI(null, watermarkMetadata.creationId);
            return;
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local because watermark file didn't exist");
    }

    public static final void LJIIIZ(String str, boolean z) throws Throwable {
        int i;
        boolean z2;
        boolean z3;
        LIZ.getClass();
        Pair pairLJ = LJ(str);
        String str2 = (String) pairLJ.getFirst();
        if (((Number) pairLJ.getSecond()).intValue() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local, vframe id is null or empty");
            return;
        }
        WatermarkMetadata watermarkMetadataLIZ = C1436750nUX.LIZ(str2);
        if (watermarkMetadataLIZ == null) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local, metadata file not exist");
            return;
        }
        String str3 = watermarkMetadataLIZ.creationId;
        ConcurrentHashSet<String> concurrentHashSet = C1436750nUX.LIZ;
        if (concurrentHashSet.contains(str2)) {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip save local, vframeUri(");
            sbLIZ.append(str2);
            sbLIZ.append(") has been handled before");
            c1437510nVlLJJLIIIJ.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        concurrentHashSet.add(str2);
        if (!z && !C0C64.LJIILLIIL().LJIIIZ(31744, "save_no_watermark_video_after_check_mock_timeout", true, false)) {
            if (i == 0 && !C0C1L.LIZ()) {
                C0CNO.LIZLLL(0L, new C1390790mIP());
            }
            C0VSJ c0vsj = new C0VSJ(LJFF(str2).toString());
            C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("try save local, videoRoot=");
            sbLIZ2.append(c0vsj);
            sbLIZ2.append(", vframeId=");
            sbLIZ2.append(str2);
            c1437510nVlLJJLIIIJ2.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ2));
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                boolean z4 = watermarkMetadataLIZ.isImageMode;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", str3);
                c0lab.LIZ(i ^ 1, "machine_moderate_status");
                C20684815ws.LJIILLIIL("download_machine_moderate_status", c0lab.LIZ);
                if (i == 0) {
                    if (C0C1L.LIZ()) {
                        LJIIIIZZ(str2, watermarkMetadataLIZ);
                        return;
                    } else {
                        LJI(null, str3);
                        return;
                    }
                }
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    long length = 0;
                    for (File file : fileArrListFiles) {
                        ConcurrentHashSet<String> concurrentHashSet2 = C1436750nUX.LIZ;
                        if (!Intrinsics.LJFF(file.getName(), "metadata.json") && u.LJJIIJZLJL(file.getName(), "watermark-", false)) {
                            if (u.LJIIZILJ(file.getName(), ".mp4", false)) {
                                z3 = false;
                            } else {
                                z3 = z4;
                            }
                            LIZ.getClass();
                            LJII(file, z3);
                            length += file.length();
                        }
                    }
                    C2354709Kn.LJIJI(c0vsj);
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "save local succeeded");
                    SaveLocalHelper saveLocalHelper = LIZ;
                    Long lValueOf = Long.valueOf(length);
                    saveLocalHelper.getClass();
                    LJI(lValueOf, str3);
                    return;
                }
                C2354709Kn.LJIJI(c0vsj);
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local because watermark file directory empty");
                LJI(null, str3);
                return;
            }
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local because watermark file didn't exist");
            return;
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("creation_id", str3);
        c0lab2.LIZ(2, "machine_moderate_status");
        C20684815ws.LJIILLIIL("download_machine_moderate_status", c0lab2.LIZ);
        if (C0C1L.LIZ()) {
            LJIIIIZZ(str2, watermarkMetadataLIZ);
        } else {
            LJI(null, str3);
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("post_save_local", "skip save local, timeout event");
        }
    }

    public static List LIZJ(VideoPublishEditModel videoPublishEditModel, List list, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        File fileLIZ = C2298308zV.LIZ(videoPublishEditModel, EnumC20228014Cw.SAVE_TO_LOCAL, "no_watermarks");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C08F1.LIZIZ(String.valueOf(System.currentTimeMillis())));
                sbLIZ.append('_');
                sbLIZ.append(i);
                if (z) {
                    str = ".mp4";
                } else {
                    str = ".jpeg";
                }
                sbLIZ.append(str);
                String absolutePath = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
                C2286708xd.LJFF(str2, absolutePath);
                arrayList.add(absolutePath);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
