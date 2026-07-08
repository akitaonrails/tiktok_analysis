package com.bytedance.geckox.model;

import X.C09CT;
import X.C1550720qSM;
import X.C1551780qU4;
import X.C1551810qU7;
import X.C1552790qVh;
import X.C179500mX;
import X.C1957007lY;
import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class UpdatePackage {

    @C09CT("access_key")
    public String accessKey;
    public String apiVersion;
    public String areaInfo;

    @C09CT("biz_extra")
    public Map<String, String> bizExtra;
    public String callFrom;

    @C09CT("channel")
    public String channel;

    @C09CT("channel_index")
    public int channelIndex;
    public boolean compressEnd;

    @C09CT("content")
    public Content content;
    public int decompressFrom;
    public long durationPause;
    public Map<String, Object> extraImportantInfo;

    @C09CT("from")
    public List<String> from;

    @C09CT("group_name")
    public String groupName;
    public boolean ignoreLowStorageLimit;
    public long initTime;

    @C09CT("is_zstd")
    public boolean isZstd;
    public boolean isZstdFallback;
    public long localVersion;
    public long localVersionOld;
    public String logId;
    public int notUsePatchReason;
    public int packageFrom;

    @C09CT("package_type")
    public int packageType;
    public long requestId;
    public boolean shouldReCompressed;
    public C1551810qU7 statisticModel;
    public boolean updateWithPatch;
    public boolean usePatched;

    @C09CT("package_version")
    public long version;
    public long pauseTime = System.currentTimeMillis();
    public String tag = "";

    public static final class FileType {
    }

    public static class Package {

        @C09CT("decompress_md5")
        public String decompressMd5;

        @C09CT("fallback")
        public Fallback fallback;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("size")
        public long length;

        @C09CT("md5")
        public String md5;
        public String url;

        @C09CT("url_list")
        public List<String> urlList;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Package{url='");
            sbLIZ.append(this.url);
            sbLIZ.append('\'');
            sbLIZ.append(", md5='");
            sbLIZ.append(this.md5);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Package() {
        }

        public String getDecompressMd5() {
            return this.decompressMd5;
        }

        public Fallback getFallback() {
            return this.fallback;
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setLength(long j) {
            this.length = j;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public Package(long j, List<String> list, String str) {
            this.id = j;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public UpdatePackage fallbackInstance() {
        UpdatePackage updatePackage = new UpdatePackage();
        updatePackage.groupName = this.groupName;
        updatePackage.channelIndex = this.channelIndex;
        updatePackage.version = this.version;
        updatePackage.channel = this.channel;
        updatePackage.accessKey = this.accessKey;
        updatePackage.from = this.from;
        updatePackage.packageType = this.packageType;
        updatePackage.areaInfo = this.areaInfo;
        updatePackage.requestId = this.requestId;
        updatePackage.statisticModel = this.statisticModel;
        updatePackage.apiVersion = this.apiVersion;
        updatePackage.logId = this.logId;
        updatePackage.localVersion = this.localVersion;
        updatePackage.localVersionOld = this.localVersionOld;
        updatePackage.notUsePatchReason = this.notUsePatchReason;
        updatePackage.usePatched = this.usePatched;
        updatePackage.isZstd = false;
        updatePackage.isZstdFallback = true;
        Content content = new Content();
        updatePackage.content = content;
        Content content2 = this.content;
        content.strategy = content2.strategy;
        Package r3 = content2.fullPackage;
        Package r2 = new Package();
        r2.id = r3.id;
        Fallback fallback = r3.fallback;
        r2.urlList = fallback.urlList;
        r2.md5 = fallback.md5;
        updatePackage.content.fullPackage = r2;
        return updatePackage;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public Package getPackage() {
        return this.updateWithPatch ? this.content.patch : this.content.fullPackage;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public boolean hasFallback() {
        return this.content.fullPackage.fallback != null;
    }

    public boolean isLastStep() {
        if (this.isZstdFallback) {
            return true;
        }
        if (isPatchUpdate()) {
            return false;
        }
        return !hasFallback();
    }

    public boolean isSingleFile() {
        return this.packageType == 1;
    }

    public UpdatePackage() {
        C1551780qU4.LIZ.getClass();
        this.extraImportantInfo = C1551780qU4.LIZJ.invoke();
        this.packageFrom = 1;
        this.decompressFrom = 1;
        this.compressEnd = false;
        this.shouldReCompressed = false;
        this.content = new Content();
        this.groupName = "default";
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public void onPause() {
        this.pauseTime = System.currentTimeMillis();
    }

    public void onResume() {
        this.durationPause += System.currentTimeMillis() - this.pauseTime;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePackage: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" ak:%s, channel:%s, version:%d, packageType:%d, isZstd:%b, updateWithPatch:%b");
        return C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ), new Object[]{this.accessKey, this.channel, Long.valueOf(this.version), Integer.valueOf(this.packageType), Boolean.valueOf(this.isZstd), Boolean.valueOf(this.updateWithPatch)});
    }

    public static class Content {

        @C09CT("package")
        public Package fullPackage;

        @C09CT("patch")
        public Package patch;

        @C09CT("strategies")
        public Strategy strategy;

        public Strategy getStrategy() {
            return this.strategy;
        }
    }

    public static class Fallback {

        @C09CT("md5")
        public String md5;

        @C09CT("url_list")
        public List<String> urlList;

        public String getMd5() {
            return this.md5;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }
    }

    public static class Strategy {

        @C09CT("del_if_download_failed")
        public int deleteIfFail;

        @C09CT("del_old_pkg_before_download")
        public int deleteOldPackageBeforeDownload;

        @C09CT("need_unzip")
        public int needUnzip;

        public int getDeleteIfFail() {
            return this.deleteIfFail;
        }

        public int getDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public int getNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(int i) {
            this.deleteIfFail = i;
        }

        public void setDeleteOldPackageBeforeDownload(int i) {
            this.deleteOldPackageBeforeDownload = i;
        }

        public void setNeedUnzip(int i) {
            this.needUnzip = i;
        }
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAreaInfo() {
        return this.areaInfo;
    }

    public Map<String, String> getBizExtra() {
        return this.bizExtra;
    }

    public String getCallFrom() {
        return this.callFrom;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Content getContent() {
        return this.content;
    }

    public int getDecompressFrom() {
        return this.decompressFrom;
    }

    public List<String> getFrom() {
        return this.from;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public boolean getIsZstd() {
        return this.isZstd;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public C1551810qU7 getStatisticModel() {
        return this.statisticModel;
    }

    public boolean getUpdateWithPatch() {
        return this.updateWithPatch;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean getZstdFallback() {
        return this.isZstdFallback;
    }

    public boolean isIgnoreLowStorageLimit() {
        return this.ignoreLowStorageLimit;
    }

    public boolean shouldReCompressed() {
        return this.shouldReCompressed;
    }

    public void putStatisticModelToJson(JSONObject jSONObject) throws JSONException {
        int i;
        jSONObject.put("access_key", this.accessKey);
        jSONObject.put("group_name", this.groupName);
        jSONObject.put("channel", this.channel);
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, getFullPackage().getId());
        if (!this.isZstd && !this.isZstdFallback) {
            i = 0;
        } else {
            i = 1;
        }
        jSONObject.put("is_zstd", i);
        jSONObject.put("api_version", this.apiVersion);
        jSONObject.put("ignore_low_storage_limit", this.ignoreLowStorageLimit ? 1 : 0);
        jSONObject.put("call_from", this.callFrom);
        C179500mX c179500mX = C179500mX.LIZ;
        String str = this.accessKey;
        String str2 = this.channel;
        c179500mX.getClass();
        jSONObject.put("tag", C179500mX.LIZIZ(str, str2));
        for (Map.Entry<String, Object> entry : this.extraImportantInfo.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        if (this.decompressFrom == 2) {
            jSONObject.put("from_stage", "compress");
        }
        if (this.compressEnd) {
            jSONObject.put("end_stage", "compress");
        }
        if (!TextUtils.isEmpty(this.logId)) {
            jSONObject.put("x_tt_logid", this.logId);
        }
        long j = this.localVersion;
        if (j != 0) {
            jSONObject.put("local_version", j);
        }
        if (getPatch() != null) {
            jSONObject.put("patch_id", getPatch().getId());
        }
        long j2 = this.localVersionOld;
        if (j2 != 0) {
            jSONObject.put("local_version_old", j2);
        }
        int i2 = this.packageType;
        if (i2 > 0) {
            jSONObject.put("package_type", i2);
        }
        int i3 = this.notUsePatchReason;
        if (i3 != 0) {
            jSONObject.put("not_use_patch_reason", i3);
        } else if (this.localVersion != 0 && !this.usePatched) {
            jSONObject.put("not_use_patch_reason", 10);
        }
        C1551810qU7 c1551810qU7 = this.statisticModel;
        if (c1551810qU7 != null) {
            jSONObject.put("dur_wait_download", c1551810qU7.LJIILLIIL - this.initTime);
            C1551810qU7 c1551810qU72 = this.statisticModel;
            jSONObject.put("req_type", c1551810qU72.LIZIZ);
            jSONObject.put("update_priority", c1551810qU72.LIZ);
            jSONObject.put("update_result", !c1551810qU72.LIZLLL ? 1 : 0);
            jSONObject.put("is_resume", c1551810qU72.LJJII ? 1 : 0);
            jSONObject.put("is_resume_open", c1551810qU72.LJJIFFI ? 1 : 0);
            jSONObject.put("resume_size", c1551810qU72.LJJIII);
            jSONObject.put("resume_percent", c1551810qU72.LJJIIJ);
            jSONObject.put("resume_threshold", C1957007lY.LIZ.LJII);
            int i4 = c1551810qU72.LIZJ;
            if (i4 != 0) {
                jSONObject.put("sync_task_id", i4);
            }
            boolean z = c1551810qU72.LJ;
            if (z) {
                jSONObject.put("create_by_error", z);
            }
            long j3 = c1551810qU72.LJFF;
            if (j3 > 0) {
                jSONObject.put("dur_total", j3);
            }
            long j4 = c1551810qU72.LJI;
            if (j4 > 0) {
                jSONObject.put("dur_last_stage", j4);
            }
            long j5 = c1551810qU72.LJII;
            if (j5 > 0) {
                jSONObject.put("dur_download", j5);
            }
            long j6 = c1551810qU72.LJIIIIZZ;
            if (j6 > 0) {
                jSONObject.put("dur_download_last_time", j6);
            }
            long j7 = c1551810qU72.LJIIIZ;
            if (j7 > 0) {
                jSONObject.put("dur_active", j7);
            }
            long j8 = c1551810qU72.LJIIJ;
            if (j8 > 0) {
                jSONObject.put("dur_unzip", j8);
            }
            long j9 = c1551810qU72.LJIIJJI;
            if (j9 > 0) {
                jSONObject.put("dur_decompress_zstd", j9);
            }
            long j10 = c1551810qU72.LJIIL;
            if (j10 > 0) {
                jSONObject.put("dur_bytepatch", j10);
            }
            long j11 = c1551810qU72.LJIILIIL;
            if (j11 > 0) {
                jSONObject.put("dur_zip_patch", j11);
            }
            long j12 = c1551810qU72.LJIILL;
            if (j12 > 0) {
                jSONObject.put("dur_from_cold_start", j12);
            }
            long j13 = c1551810qU72.LJIILJJIL;
            if (j13 > 0) {
                jSONObject.put("dur_validate", j13);
            }
            long j14 = c1551810qU72.LJJ;
            if (j14 > 0) {
                jSONObject.put("dur_pause", j14);
            }
            for (C1552790qVh c1552790qVh : ((HashMap) c1551810qU72.LJJIIJZLJL).values()) {
                c1552790qVh.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1552790qVh.LIZ);
                sbLIZ.append("result");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), !c1552790qVh.LIZIZ ? 1 : 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1552790qVh.LIZ);
                sbLIZ2.append("url");
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), c1552790qVh.LJ);
                if (!TextUtils.isEmpty(c1552790qVh.LIZLLL)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c1552790qVh.LIZ);
                    sbLIZ3.append("err_msg");
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), c1552790qVh.LIZLLL);
                }
                if (c1552790qVh.LIZJ != 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(c1552790qVh.LIZ);
                    sbLIZ4.append("err_code");
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ4), c1552790qVh.LIZJ);
                }
                if (c1552790qVh.LJFF > 0) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(c1552790qVh.LIZ);
                    sbLIZ5.append("download_failed_times");
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ5), c1552790qVh.LJFF);
                }
                if (c1552790qVh.LJI) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(c1552790qVh.LIZ);
                    sbLIZ6.append("create_by_error");
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ6), 1);
                }
            }
        }
        if (this.updateWithPatch) {
            if (getPatch() != null) {
                jSONObject.put("package_size", getPatch().getLength());
            }
        } else {
            if (getFullPackage() == null) {
                return;
            }
            jSONObject.put("package_size", getFullPackage().getLength());
        }
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setApiVersion(String str) {
        this.apiVersion = str;
    }

    public void setAreaInfo(String str) {
        this.areaInfo = str;
    }

    public void setCallFrom(String str) {
        this.callFrom = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setCompressEnd(boolean z) {
        this.compressEnd = z;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setDecompressFrom(int i) {
        this.decompressFrom = i;
    }

    public void setFrom(List<String> list) {
        this.from = list;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setIgnoreLowStorageLimit(boolean z) {
        this.ignoreLowStorageLimit = z;
    }

    public void setInitTime(long j) {
        this.initTime = j;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setLocalVersionOld(long j) {
        this.localVersionOld = j;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setNotUsePatchReason(int i) {
        this.notUsePatchReason = i;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setReCompressed(boolean z) {
        this.shouldReCompressed = z;
    }

    public void setRequestId(long j) {
        this.requestId = j;
    }

    public void setStatisticModel(C1551810qU7 c1551810qU7) {
        this.statisticModel = c1551810qU7;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setUpdateWithPatch(boolean z) {
        this.updateWithPatch = z;
        if (z) {
            this.usePatched = true;
        }
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setZstdFallback(boolean z) {
        this.isZstdFallback = z;
    }

    public UpdatePackage(C1550720qSM c1550720qSM, long j, String str, String str2) {
        C1551780qU4.LIZ.getClass();
        this.extraImportantInfo = C1551780qU4.LIZJ.invoke();
        this.packageFrom = 1;
        this.decompressFrom = 1;
        this.compressEnd = false;
        this.shouldReCompressed = false;
        this.version = j;
        this.accessKey = str;
        this.channel = str2;
        this.content = new Content();
        Package r1 = new Package();
        r1.decompressMd5 = c1550720qSM.LIZJ;
        r1.id = j;
        this.content.fullPackage = r1;
        this.groupName = "default";
        this.packageFrom = c1550720qSM.LJ;
    }

    public UpdatePackage(long j, String str, Package r6, Package r7) {
        C1551780qU4.LIZ.getClass();
        this.extraImportantInfo = C1551780qU4.LIZJ.invoke();
        this.packageFrom = 1;
        this.decompressFrom = 1;
        this.compressEnd = false;
        this.shouldReCompressed = false;
        this.version = j;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r6;
        content.patch = r7;
        this.groupName = "default";
    }
}
