package com.bytedance.geckox.policy.meta.file;

import X.C09CT;
import X.C0VSJ;
import X.C13LP;
import X.C1487180ons;
import X.C1551940qUK;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C797990VSb;
import Y.AComparatorS42S0000000_23;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class ChannelFileAccessRecord {

    @C09CT("access_key")
    public final String accessKey;

    @C09CT("channel")
    public final String channel;

    @C09CT("c_time")
    public long createTime;

    @C09CT("file_records")
    public final Map<String, FileMetaDataItem> fileRecords;

    @C09CT("package_id")
    public long packageID;

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final Map<String, FileMetaDataItem> getFileRecords() {
        return this.fileRecords;
    }

    public final long getPackageID() {
        return this.packageID;
    }

    private final Map<String, FileMetaDataItem> buildOldRecordBasePaths(Map<String, FileMetaDataItem> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, FileMetaDataItem> entry : map.entrySet()) {
            String key = entry.getKey();
            FileMetaDataItem value = entry.getValue();
            String strRemoveHash = ChannelFileRecordPathNormalize.INSTANCE.removeHash(key);
            FileMetaDataItem fileMetaDataItem = (FileMetaDataItem) map2.get(strRemoveHash);
            if (fileMetaDataItem == null || value.getLastAccessTime() > fileMetaDataItem.getLastAccessTime()) {
                map2.put(strRemoveHash, value);
            }
        }
        return map2;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setPackageID(long j) {
        this.packageID = j;
    }

    public final synchronized ChannelFileAggregateStatus aggregateFileStatus(long j, long j2) {
        boolean z;
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS42S0000000_23(2), this.fileRecords.entrySet());
        int size = listLJLLLL.size();
        if (size == 0) {
            return new ChannelFileAggregateStatus("", "", "", 0);
        }
        long j3 = j * 24 * 60 * 60 * 1000;
        long j4 = 24 * j2 * 60 * 60 * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.accessKey);
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append(this.channel);
        sbLIZ.append(str);
        sbLIZ.append(this.packageID);
        sbLIZ.append(str);
        sbLIZ.append("res");
        C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ));
        boolean[] zArr = new boolean[size];
        boolean[] zArr2 = new boolean[size];
        boolean[] zArr3 = new boolean[size];
        int i = 0;
        for (Object obj : listLJLLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                Map.Entry entry = (Map.Entry) obj;
                String str2 = (String) entry.getKey();
                FileMetaDataItem fileMetaDataItem = (FileMetaDataItem) entry.getValue();
                boolean z2 = true;
                zArr[i] = new C0VSJ(c0vsj, a0.LJLJJLL(u.LJJI(str2, '/', File.separatorChar, false), File.separatorChar)).isFile();
                long lastAccessTime = fileMetaDataItem.getLastAccessTime();
                if (lastAccessTime > 0 && jCurrentTimeMillis - lastAccessTime <= j3) {
                    z = true;
                } else {
                    z = false;
                }
                zArr2[i] = z;
                if (jCurrentTimeMillis - fileMetaDataItem.getCreateTime() >= j4) {
                    z2 = false;
                }
                zArr3[i] = z2;
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new ChannelFileAggregateStatus(C1487180ons.LIZ(zArr), C1487180ons.LIZ(zArr2), C1487180ons.LIZ(zArr3), size);
    }

    public final synchronized void replaceFileRecordsFromSortedBundles(List<String> list, Map<String, FileMetaDataItem> map) {
        FileMetaDataItem fileMetaDataItem;
        Map<String, FileMetaDataItem> mapBuildOldRecordBasePaths = buildOldRecordBasePaths(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                FileMetaDataItem fileMetaDataItem2 = mapBuildOldRecordBasePaths.get(ChannelFileRecordPathNormalize.INSTANCE.removeHash(str2));
                if (fileMetaDataItem2 != null) {
                    fileMetaDataItem = new FileMetaDataItem(fileMetaDataItem2.getCreateTime(), i, fileMetaDataItem2.getLastAccessTime());
                } else {
                    fileMetaDataItem = new FileMetaDataItem(System.currentTimeMillis(), i, 0L);
                }
                linkedHashMap.put(str2, fileMetaDataItem);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.fileRecords.clear();
        this.fileRecords.putAll(linkedHashMap);
    }

    public final synchronized void updateAccessTime(String str, long j) {
        FileMetaDataItem fileMetaDataItem = this.fileRecords.get(str);
        if (fileMetaDataItem != null) {
            fileMetaDataItem.setLastAccessTime(j);
        }
    }

    public ChannelFileAccessRecord(long j, String str, String str2, long j2, Map<String, FileMetaDataItem> map) {
        this.createTime = j;
        this.accessKey = str;
        this.channel = str2;
        this.packageID = j2;
        this.fileRecords = map;
    }
}
