package com.ss.android.storage;

import X.C01GW;
import X.C089E;
import X.C09N1;
import X.C0ATI;
import X.C0BIF;
import X.C0C64;
import X.C0CCZ;
import X.C0VSJ;
import X.C0VZ0;
import X.C0WYJ;
import X.C0WYK;
import X.C1387310mCn;
import X.C1866890ygJ;
import X.C1AF0;
import X.C2188811AlT;
import X.C2206861BYu;
import X.C2206871BYv;
import X.C2259808tI;
import X.C2427009fA;
import X.C274180Aoq;
import X.C274600ApW;
import X.C285080BFi;
import X.C299330BoJ;
import X.C299340BoK;
import X.C601990NjJ;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Build;
import com.aweme.storage.experiments.StorageAccessReportFileDepthConfig;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.storage.AVStorageInfo;
import com.ss.android.ugc.aweme.services.storage.IAVStorageService;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class StorageInfoReportTask implements C0CCZ {
    public String LLILLJJLI;
    public String LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public final Keva LL = Keva.getRepo("storage_info");
    public final String[] LLIZ = {"/cache/picture/im_fresco_cache/", "/cache/picture/fresco_cache/", "/files/awcn_strategy/pushservice/", "/files/keva/repo/", "/files/live_kv/", "/files/music/", "/files/logs/", "/files/ALOG/", "/cache/cachev2/", "/cache/runnableCache/", "/files/robust/", "/files/tt_file_st/", "/cache/feedCache/", "/cache/ttnet_storage/", "/files/MiPushLog/", "/cache/picture/", "/cache/ttnet_storage/", "/files/font/", "/files/.msdata/", "/files/.dynamic/", "/files/bdp/", "/files/a/", "/cache/WebView/", "/files/webview_bytedance/", "/files/.patchs/", "/files/.envelope/", "/files/.emitter/", "/files/.umeng/", "/files/.bak/", "/files/.pre_download/", "/files/.imprint/", "/shared_prefs/", "/app_sslcache/", "/app_webview/", "/lib-main/", "/splashCache/", "/awemeSplashCache/", "/app_SGLib/", "/app_assets/", "/small_emoji_res/", "/system_emoji_res/", "/files/draft/", "/files/Download/", "/files/rhea/", "/files/speed_ml/", "/databases/", "/files/filters/", "/files/extract_shot/", "/files/effectmodel/", "/files/extract_custom_sticker/", "/covode/", "/app_hws_webview/", "/cache/Universal_activity", "/files/audio-effect/", "/files/mvtheme/", "/files/origin_sound/", "/files/ve_frame_cache2/", "/files/hdr_filter/", "/files/hianalytics/", "/files/ph_out/"};

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StorageInfoReportTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "storage_info_report_task_downgrade", true, false)) {
            return EnumC799870VZh.APP_BACKGROUND;
        }
        C01GW c01gw = C0BIF.LIZ;
        return (((Number) c01gw.getValue()).intValue() & 1) == 1 ? EnumC799870VZh.BOOT_FINISH : (((Number) c01gw.getValue()).intValue() & 2) == 2 ? EnumC799870VZh.APP_BACKGROUND : EnumC799870VZh.APP_BACKGROUND;
    }

    public static boolean LJ(String str) {
        StorageAccessReportFileDepthConfig[] storageAccessReportFileDepthConfigArr;
        List<String> list = (List) C299340BoK.LIZIZ.getValue();
        if (list == null || (storageAccessReportFileDepthConfigArr = (StorageAccessReportFileDepthConfig[]) C1866890ygJ.LIZIZ.getValue()) == null) {
            return false;
        }
        for (String str2 : list) {
            int iLJJJ = a0.LJJJ(str, str2, 0, false, 2);
            if (iLJJJ >= 0 && a0.LJJLIIIJ(a0.LJJL(str, iLJJJ, str2.length() + iLJJJ, "").toString(), new char[]{'/'}, false, 0, 6).size() <= 2) {
                return true;
            }
        }
        for (StorageAccessReportFileDepthConfig storageAccessReportFileDepthConfig : storageAccessReportFileDepthConfigArr) {
            int iLJJJ2 = a0.LJJJ(str, storageAccessReportFileDepthConfig.path, 0, false, 2);
            if (iLJJJ2 >= 0 && a0.LJJLIIIJ(a0.LJJL(str, iLJJJ2, storageAccessReportFileDepthConfig.path.length() + iLJJJ2, "").toString(), new char[]{'/'}, false, 0, 6).size() <= storageAccessReportFileDepthConfig.depth) {
                return true;
            }
        }
        return false;
    }

    public static void LJIILIIL(JSONObject jSONObject) throws JSONException {
        AVStorageInfo aVStorageInfo = ((IAVStorageService) ServiceManager.get().getService(IAVStorageService.class)).getAVStorageInfo();
        jSONObject.put("tools_effect_size", aVStorageInfo.effectSize);
        jSONObject.put("tools_filter_size", aVStorageInfo.filterSize);
        jSONObject.put("tools_mv_size", aVStorageInfo.mvSize);
        jSONObject.put("tools_music_size", aVStorageInfo.musicSize);
        jSONObject.put("tools_effect_model_size", aVStorageInfo.effectModelSize);
        jSONObject.put("tools_font_size", aVStorageInfo.fontSize);
        jSONObject.put("tools_cut_same_size", aVStorageInfo.cutSameSize);
        jSONObject.put("tools_creative_draft_size", aVStorageInfo.creativeDraftSize);
        jSONObject.put("tools_creative_public_size", aVStorageInfo.creativePublicSize);
        jSONObject.put("tools_creative_persistent_size", aVStorageInfo.creativePersistentSize);
        jSONObject.put("tools_creative_cache_size", aVStorageInfo.creativeCacheSize);
    }

    public final boolean LIZ(String str) {
        List list = (List) C299330BoJ.LIZIZ.getValue();
        if (list.isEmpty()) {
            for (String str2 : this.LLIZ) {
                if (u.LJJIIJZLJL(str, str2, false)) {
                    return false;
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                    return false;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C844470XAv.LIZ.getClass();
        String packageName = C844470XAv.LIZ().getPackageName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/cache/webviewbytedance_");
        sbLIZ.append(packageName);
        sbLIZ.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("/cache/webviewbytedance_");
        sbLIZ2.append(packageName);
        sbLIZ2.append('/');
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("/app_webviewbytedance_");
        sbLIZ3.append(packageName);
        sbLIZ3.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("/app_webview_");
        sbLIZ4.append(packageName);
        sbLIZ4.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("/cache/webview_");
        sbLIZ5.append(packageName);
        sbLIZ5.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("/app_webviewbytedance_");
        sbLIZ6.append(packageName);
        sbLIZ6.append('/');
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("/app_webviewbytedance_ttwebview_bytedance_");
        sbLIZ7.append(packageName);
        sbLIZ7.append('/');
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("/app_hws_webview_");
        sbLIZ8.append(packageName);
        sbLIZ8.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ8));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (u.LJJIIJZLJL(str, (String) it3.next(), false)) {
                return false;
            }
        }
        return true;
    }

    public final long LJFF(File file) {
        long jLastModified = file.lastModified();
        if (Build.VERSION.SDK_INT < 26) {
            return jLastModified;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    long jLJFF = LJFF(file2);
                    if (jLastModified < jLJFF) {
                        jLastModified = jLJFF;
                    }
                }
            }
        } else {
            try {
                jLastModified = Files.readAttributes(Paths.get(file.getPath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).lastAccessTime().toMillis();
                if (jLastModified >= System.currentTimeMillis() - 604800000) {
                    this.LLILZ += file.length();
                }
                if (jLastModified >= System.currentTimeMillis() - 2592000000L) {
                    this.LLILZIL += file.length();
                    return jLastModified;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLastAccessTime failed ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" for file ");
                sbLIZ.append(file);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return jLastModified;
    }

    public final long LJIIIIZZ(File file) {
        Object objInvoke;
        long jLastModified = file.lastModified();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                C089E c089e = new C089E(fileArrListFiles);
                while (c089e.hasNext()) {
                    long jLJIIIIZZ = LJIIIIZZ((File) c089e.next());
                    if (jLastModified < jLJIIIIZZ) {
                        jLastModified = jLJIIIIZZ;
                    }
                }
            }
        } else {
            try {
                Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField("os");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(null);
                if (obj != null && (objInvoke = obj.getClass().getMethod("lstat", String.class).invoke(obj, file.getAbsolutePath())) != null) {
                    Field declaredField2 = objInvoke.getClass().getDeclaredField("st_atime");
                    if (!declaredField2.isAccessible()) {
                        declaredField2.setAccessible(true);
                    }
                    jLastModified = declaredField2.getLong(objInvoke);
                    if (jLastModified >= System.currentTimeMillis() - 604800000) {
                        this.LLILZ += file.length();
                    }
                    if (jLastModified >= System.currentTimeMillis() - 2592000000L) {
                        this.LLILZIL += file.length();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLastAccessTime failed ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" for file ");
                sbLIZ.append(file);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return TimeUnit.SECONDS.toMillis(jLastModified);
    }

    public final String LJIIJ(String str) {
        String strLJJIFFI;
        String str2 = this.LLILLJJLI;
        if (str2 != null && u.LJJIIJZLJL(str, str2, false)) {
            strLJJIFFI = u.LJJIFFI(str, str2, "", false);
        } else {
            strLJJIFFI = str;
        }
        String str3 = this.LLILLL;
        if (str3 != null && u.LJJIIJZLJL(str, str3, false)) {
            return u.LJJIFFI(str, str3, "", false);
        }
        return strLJJIFFI;
    }

    public final void LJIIL(Context context) throws JSONException {
        long jLIZIZ;
        String parent;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C2206871BYv c2206871BYv = new C2206871BYv();
        String parent2 = C786410Ut5.w2(context).getParent();
        if (parent2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            this.LLILLJJLI = parent2;
            c2206871BYv = LJIIIZ(new C0VSJ(parent2), jSONObject3, 0);
            jSONObject2.put("internal", jSONObject3);
        }
        C2206871BYv c2206871BYv2 = new C2206871BYv();
        File fileX2 = C786410Ut5.x2(context);
        if (fileX2 != null && (parent = fileX2.getParent()) != null) {
            JSONObject jSONObject4 = new JSONObject();
            this.LLILLL = parent;
            c2206871BYv2 = LJIIIZ(new C0VSJ(parent), jSONObject4, 0);
            jSONObject2.put("external", jSONObject4);
        }
        C0WYK c0wyk = new C0WYK();
        C0WYJ.LJJIFFI(context, c0wyk);
        jSONObject.put("app_storage_size", c2206871BYv2.LIZ + c2206871BYv.LIZ);
        jSONObject.put("app_storage_external_size", c2206871BYv2.LIZ);
        jSONObject.put("app_storage_internal_size", c2206871BYv.LIZ);
        long jLJI = C09N1.LJI(context);
        if (jLJI == -1) {
            jLJI = -1;
        }
        jSONObject.put("storage_total_external_size", jLJI);
        jSONObject.put("storage_total_internal_size", C0WYJ.LJIJ());
        File fileLJIIIZ = C2427009fA.LJIIIZ(context);
        if (fileLJIIIZ != null) {
            jLIZIZ = C2259808tI.LIZIZ(fileLJIIIZ.getParent());
        } else {
            jLIZIZ = 0;
        }
        jSONObject.put("storage_total_sdcard_size", jLIZIZ);
        jSONObject.put("storage_available_external_size", C0WYJ.LJFF(context));
        jSONObject.put("storage_available_internal_size", C0WYJ.LJI());
        jSONObject.put("storage_app_size", c0wyk.LJIIIIZZ);
        jSONObject.put("storage_data_size", c0wyk.LJIIIZ);
        jSONObject.put("storage_cache_size", c0wyk.LJIIJ);
        jSONObject.put("total_storage_size", c0wyk.LIZ());
        jSONObject.put("storage_info_new_format", true);
        if (((Boolean) C0ATI.LIZ.getValue()).booleanValue()) {
            LJIILIIL(jSONObject);
        }
        jSONObject.put("gecko_storage_size", this.LLILZLL);
        jSONObject.put("gecko_storage_size_mb", this.LLILZLL / 1048576);
        if (C285080BFi.LIZ()) {
            jSONObject.put("report_access_time", true);
            jSONObject.put("app_storage_access_size_7_days", this.LLILZ);
            jSONObject.put("app_storage_access_size_30_days", this.LLILZIL);
        } else {
            jSONObject.put("report_access_time", false);
        }
        if (C786410Ut5.J3(jSONObject2).length() <= 819200 && ((Boolean) C274180Aoq.LIZJ.getValue()).booleanValue()) {
            jSONObject.put("is_disk_usage_off_limit", false);
            jSONObject.put("disk_usage", jSONObject2);
        } else {
            jSONObject.put("is_disk_usage_off_limit", true);
        }
        AppLogNewUtils.onEventV3("storage_info", jSONObject);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws Throwable {
        long jLIZIZ;
        long jLongValue;
        try {
            long jLongValue2 = 0;
            if (C1387310mCn.LJFF(this.LL.getLong("STORAGE_INFO_REPORT_TASK_LAST_TIME", 0L))) {
                return;
            }
            this.LL.storeLong("STORAGE_INFO_REPORT_TASK_LAST_TIME", System.currentTimeMillis());
            if (((Boolean) C0BIF.LIZIZ.getValue()).booleanValue()) {
                LJIIL(context);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            C0WYK c0wykLJIILLIIL = C0WYJ.LJIILLIIL(context);
            jSONObject.put("app_storage_size", c0wykLJIILLIIL.LJ);
            jSONObject.put("app_storage_external_size", c0wykLJIILLIIL.LJFF);
            jSONObject.put("app_storage_internal_size", c0wykLJIILLIIL.LJI);
            jSONObject.put("storage_total_external_size", c0wykLJIILLIIL.LIZIZ);
            jSONObject.put("storage_total_internal_size", c0wykLJIILLIIL.LIZLLL);
            File fileLJIIIZ = C2427009fA.LJIIIZ(context);
            if (fileLJIIIZ != null) {
                jLIZIZ = C2259808tI.LIZIZ(fileLJIIIZ.getParent());
            } else {
                jLIZIZ = 0;
            }
            jSONObject.put("storage_total_sdcard_size", jLIZIZ);
            jSONObject.put("storage_available_external_size", c0wykLJIILLIIL.LIZ);
            jSONObject.put("storage_available_internal_size", c0wykLJIILLIIL.LIZJ);
            jSONObject.put("storage_app_size", c0wykLJIILLIIL.LJIIIIZZ);
            jSONObject.put("storage_data_size", c0wykLJIILLIIL.LJIIIZ);
            jSONObject.put("storage_cache_size", c0wykLJIILLIIL.LJIIJ);
            jSONObject.put("total_storage_size", c0wykLJIILLIIL.LIZ());
            jSONObject.put("report_access_time", false);
            if (((Boolean) C0ATI.LIZ.getValue()).booleanValue()) {
                LJIILIIL(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            C2206861BYu.LIZ(context, jSONObject2);
            Long lLIZ = C601990NjJ.LIZ(jSONObject2.get("internal/files/offlineX"));
            if (lLIZ != null) {
                jLongValue = lLIZ.longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("gecko_storage_size", jLongValue * 1024);
            Long lLIZ2 = C601990NjJ.LIZ(jSONObject2.get("internal/files/offlineX"));
            if (lLIZ2 != null) {
                jLongValue2 = lLIZ2.longValue();
            }
            jSONObject.put("gecko_storage_size_mb", jLongValue2 / 1024);
            if (C786410Ut5.J3(jSONObject2).length() > 819200) {
                jSONObject.put("is_disk_usage_off_limit", true);
            } else {
                jSONObject.put("is_disk_usage_off_limit", false);
                jSONObject.put("disk_usage", jSONObject2);
            }
            AppLogNewUtils.onEventV3("storage_info", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public final C2206871BYv LJIIIZ(File file, JSONObject jSONObject, int i) throws JSONException {
        long jLJFF;
        long jLJFF2;
        C2206871BYv c2206871BYv = new C2206871BYv();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return c2206871BYv;
        }
        if (fileArrListFiles.length == 0 && 1 != 0) {
            if (Build.VERSION.SDK_INT < 26) {
                jLJFF2 = LJIIIIZZ(file);
            } else {
                jLJFF2 = LJFF(file);
            }
            c2206871BYv.LIZIZ = jLJFF2;
        }
        for (File file2 : fileArrListFiles) {
            JSONObject jSONObject2 = new JSONObject();
            if (file2.isDirectory()) {
                C2206871BYv c2206871BYvLJIIIZ = LJIIIZ(file2, jSONObject2, i + 1);
                c2206871BYv.LIZ += c2206871BYvLJIIIZ.LIZ;
                if (((Boolean) C274600ApW.LIZIZ.getValue()).booleanValue()) {
                    c2206871BYv.LIZJ += c2206871BYvLJIIIZ.LIZJ;
                    c2206871BYv.LIZLLL += c2206871BYvLJIIIZ.LIZLLL;
                }
                long j = c2206871BYv.LIZIZ;
                long j2 = c2206871BYvLJIIIZ.LIZIZ;
                if (j < j2) {
                    c2206871BYv.LIZIZ = j2;
                }
                String strLJIIJ = LJIIJ(file2.getPath());
                if (Intrinsics.LJFF(strLJIIJ, "/files/offlineX")) {
                    this.LLILZLL = c2206871BYvLJIIIZ.LIZ;
                }
                if ((i < 4 && LIZ(strLJIIJ)) || LJ(strLJIIJ)) {
                    if (jSONObject.isNull("b")) {
                        jSONObject.put("b", new JSONObject());
                    }
                    JSONObjectProtectorUtils.getJSONObject(jSONObject, "b").put(file2.getName(), jSONObject2);
                }
            } else {
                long length = file2.length();
                if (C285080BFi.LIZ()) {
                    if (Build.VERSION.SDK_INT < 26) {
                        jLJFF = LJIIIIZZ(file2);
                    } else {
                        jLJFF = LJFF(file2);
                    }
                } else {
                    jLJFF = 0;
                }
                c2206871BYv.LIZ += length;
                if (((Boolean) C274600ApW.LIZIZ.getValue()).booleanValue()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jLJFF > jCurrentTimeMillis - 604800000) {
                        c2206871BYv.LIZJ += length;
                    }
                    if (jLJFF > jCurrentTimeMillis - 2592000000L) {
                        c2206871BYv.LIZLLL += length;
                    }
                }
                if (c2206871BYv.LIZIZ < jLJFF) {
                    c2206871BYv.LIZIZ = jLJFF;
                }
                String strLJIIJ2 = LJIIJ(file2.getPath());
                if ((i < 4 && LIZ(strLJIIJ2)) || LJ(strLJIIJ2)) {
                    jSONObject2.put("s", length / 1024);
                    jSONObject2.put("u", jLJFF);
                    if (jSONObject.isNull("b")) {
                        jSONObject.put("b", new JSONObject());
                    }
                    JSONObjectProtectorUtils.getJSONObject(jSONObject, "b").put(file2.getName(), jSONObject2);
                }
            }
        }
        jSONObject.put("s", c2206871BYv.LIZ / 1024);
        if (C285080BFi.LIZ()) {
            jSONObject.put("u", c2206871BYv.LIZIZ);
        }
        if (((Boolean) C274600ApW.LIZIZ.getValue()).booleanValue() && file.isDirectory()) {
            jSONObject.put("v", c2206871BYv.LIZJ / 1024);
            jSONObject.put("w", c2206871BYv.LIZLLL / 1024);
        }
        return c2206871BYv;
    }
}
