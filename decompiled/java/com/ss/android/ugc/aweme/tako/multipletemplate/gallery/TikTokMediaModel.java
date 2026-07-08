package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C0L9F;
import X.C527260Km4;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class TikTokMediaModel extends MediaModel {
    public int abRollIndex;
    public String absolutePath;
    public boolean canClip;
    public long clipDuration;
    public int copiedCount;
    public TikTokMediaModel copiedFromModel;
    public final String id;
    public boolean isCorrectedResolution;
    public boolean isFromRecord;
    public boolean isResized;
    public final C0L9F loadSource;
    public int mediaIndex;
    public String mediaRatio;
    public boolean newFlag;
    public int originIndex;
    public int selectIndex;
    public static final C527260Km4 Companion = new C527260Km4();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.selectIndex;
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final String toString() {
        return "TikTokMediaModel(type=" + this.type + ", subType=" + this.subType + ", originIndex=" + this.originIndex + ", selectIndex=" + this.selectIndex + ", abRollIndex=" + this.abRollIndex + ", mediaIndex=" + this.mediaIndex + ", mediaRatio=" + this.mediaRatio + ", copiedCount=" + this.copiedCount + ", isCorrectedResolution=" + this.isCorrectedResolution + ", clipDuration=" + this.clipDuration + ", isFromRecord=" + this.isFromRecord + ", canClip=" + this.canClip + ") " + super.toString();
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(cls2, cls) || !(obj instanceof TikTokMediaModel)) {
            return false;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) obj;
        if (Intrinsics.LJFF(this.id, tikTokMediaModel.id) && this.selectIndex == tikTokMediaModel.selectIndex) {
            return true;
        }
        return false;
    }

    public TikTokMediaModel(String str, C0L9F c0l9f, boolean z) {
        super(str);
        this.id = str;
        this.loadSource = c0l9f;
        this.isResized = z;
        this.originIndex = -1;
        this.selectIndex = -1;
        this.abRollIndex = -1;
        this.mediaIndex = -1;
    }

    public static TikTokMediaModel LJIILLIIL(TikTokMediaModel tikTokMediaModel, int i, int i2) {
        String str;
        boolean z;
        C0L9F c0l9f = null;
        if ((i2 & 1) != 0) {
            str = tikTokMediaModel.id;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            c0l9f = tikTokMediaModel.loadSource;
        }
        if ((i2 & 4) != 0) {
            z = tikTokMediaModel.isResized;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = tikTokMediaModel.selectIndex;
        }
        tikTokMediaModel.getClass();
        TikTokMediaModel tikTokMediaModel2 = new TikTokMediaModel(str, c0l9f, z);
        tikTokMediaModel2.LJIILL(tikTokMediaModel.LJFF());
        tikTokMediaModel2.relativePath = tikTokMediaModel.relativePath;
        tikTokMediaModel2.fileName = tikTokMediaModel.fileName;
        tikTokMediaModel2.localUri = tikTokMediaModel.localUri;
        tikTokMediaModel2.albumClass = tikTokMediaModel.albumClass;
        tikTokMediaModel2.date = tikTokMediaModel.date;
        tikTokMediaModel2.type = tikTokMediaModel.type;
        tikTokMediaModel2.subType = tikTokMediaModel.subType;
        tikTokMediaModel2.duration = tikTokMediaModel.duration;
        tikTokMediaModel2.fileSize = tikTokMediaModel.fileSize;
        String str2 = tikTokMediaModel.mimeType;
        if (str2 != null) {
            tikTokMediaModel2.mimeType = str2;
        }
        tikTokMediaModel2.thumbnail = tikTokMediaModel.thumbnail;
        tikTokMediaModel2.width = tikTokMediaModel.width;
        tikTokMediaModel2.height = tikTokMediaModel.height;
        tikTokMediaModel2.modify = tikTokMediaModel.modify;
        tikTokMediaModel2.aigcInfo = tikTokMediaModel.aigcInfo;
        tikTokMediaModel2.originIndex = tikTokMediaModel.originIndex;
        tikTokMediaModel2.abRollIndex = tikTokMediaModel.abRollIndex;
        tikTokMediaModel2.mediaIndex = tikTokMediaModel.mediaIndex;
        tikTokMediaModel2.mediaRatio = tikTokMediaModel.mediaRatio;
        tikTokMediaModel2.copiedFromModel = tikTokMediaModel.copiedFromModel;
        tikTokMediaModel2.copiedCount = tikTokMediaModel.copiedCount;
        tikTokMediaModel2.isCorrectedResolution = tikTokMediaModel.isCorrectedResolution;
        tikTokMediaModel2.clipDuration = tikTokMediaModel.clipDuration;
        tikTokMediaModel2.isFromRecord = tikTokMediaModel.isFromRecord;
        tikTokMediaModel2.canClip = tikTokMediaModel.canClip;
        tikTokMediaModel2.newFlag = tikTokMediaModel.newFlag;
        tikTokMediaModel2.absolutePath = tikTokMediaModel.absolutePath;
        tikTokMediaModel2.selectIndex = i;
        return tikTokMediaModel2;
    }

    public /* synthetic */ TikTokMediaModel(String str, C0L9F c0l9f, int i) {
        this(str, (i & 2) != 0 ? C0L9F.MEDIA_STORE : c0l9f, false);
    }
}
