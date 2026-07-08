package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model;

import X.C0L90;
import X.C2188811AlT;
import X.C527240Km2;
import X.C527250Km3;
import X.C989140bqa;
import X.EnumC538220L8y;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class TikTokMediaModel extends MediaModel {
    public int abRollIndex;
    public boolean canClip;
    public long clipDuration;
    public int copiedCount;
    public TikTokMediaModel copiedFromModel;
    public final String id;
    public boolean isCorrectedResolution;
    public boolean isFromRecord;
    public boolean isLiveRecordingsGuide;
    public boolean isResized;
    public final EnumC538220L8y loadSource;
    public int mediaIndex;
    public String mediaRatio;
    public boolean newFlag;
    public int originIndex;
    public int selectIndex;
    public C0L90 selectionScenario;
    public static final C527240Km2 Companion = new C527240Km2();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final String toString() {
        return "TikTokMediaModel(type=" + this.type + ", subType=" + this.subType + ", originIndex=" + this.originIndex + ", selectIndex=" + this.selectIndex + ", abRollIndex=" + this.abRollIndex + ", mediaIndex=" + this.mediaIndex + ", mediaRatio=" + this.mediaRatio + ", copiedCount=" + this.copiedCount + ", isCorrectedResolution=" + this.isCorrectedResolution + ", clipDuration=" + this.clipDuration + ", isFromRecord=" + this.isFromRecord + ", canClip=" + this.canClip + ") " + super.toString();
    }

    public final String LJIILLIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.id);
        sbLIZ.append(this.selectIndex);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final TikTokMediaModel LJIJ() {
        TikTokMediaModel tikTokMediaModelLIZ = C527250Km3.LIZ().LIZ(this.id, EnumC538220L8y.MEDIA_STORE);
        tikTokMediaModelLIZ.LJIILL(LJFF());
        tikTokMediaModelLIZ.relativePath = this.relativePath;
        tikTokMediaModelLIZ.mediaPickerAbsolutePath = this.mediaPickerAbsolutePath;
        tikTokMediaModelLIZ.fileName = this.fileName;
        tikTokMediaModelLIZ.localUri = this.localUri;
        tikTokMediaModelLIZ.albumClass = this.albumClass;
        tikTokMediaModelLIZ.date = this.date;
        tikTokMediaModelLIZ.type = this.type;
        tikTokMediaModelLIZ.subType = this.subType;
        tikTokMediaModelLIZ.duration = this.duration;
        tikTokMediaModelLIZ.fileSize = this.fileSize;
        String str = this.mimeType;
        if (str != null) {
            tikTokMediaModelLIZ.mimeType = str;
        }
        tikTokMediaModelLIZ.thumbnail = this.thumbnail;
        tikTokMediaModelLIZ.width = this.width;
        tikTokMediaModelLIZ.height = this.height;
        tikTokMediaModelLIZ.modify = this.modify;
        tikTokMediaModelLIZ.originIndex = this.originIndex;
        tikTokMediaModelLIZ.mediaIndex = this.mediaIndex;
        TikTokMediaModel tikTokMediaModel = this.copiedFromModel;
        if (tikTokMediaModel == null) {
            tikTokMediaModel = this;
        }
        tikTokMediaModelLIZ.copiedFromModel = tikTokMediaModel;
        tikTokMediaModelLIZ.isCorrectedResolution = this.isCorrectedResolution;
        tikTokMediaModelLIZ.aigcInfo = this.aigcInfo;
        tikTokMediaModelLIZ.selectionScenario = this.selectionScenario;
        tikTokMediaModelLIZ.onlineVideoUrl = this.onlineVideoUrl;
        tikTokMediaModelLIZ.thumbnailOnlineUrl = this.thumbnailOnlineUrl;
        tikTokMediaModelLIZ.liveHighlightType = this.liveHighlightType;
        tikTokMediaModelLIZ.liveInfo = this.liveInfo;
        LivePhotoInfo livePhotoInfo = this.livePhotoInfo;
        tikTokMediaModelLIZ.livePhotoInfo = livePhotoInfo != null ? livePhotoInfo.copy(livePhotoInfo.videoPath, livePhotoInfo.videoDuration, livePhotoInfo.livePhotoPreviewModeStr, livePhotoInfo.hasUserClickedIcon) : null;
        tikTokMediaModelLIZ.mediaSource = this.mediaSource;
        return tikTokMediaModelLIZ;
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final int hashCode() {
        return C989140bqa.LIZ() ? LJIILLIIL().hashCode() : super.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TikTokMediaModel)) {
            return false;
        }
        if (C989140bqa.LIZ()) {
            return TextUtils.equals(LJIILLIIL(), ((TikTokMediaModel) obj).LJIILLIIL());
        }
        return Intrinsics.LJFF(this.id, ((TikTokMediaModel) obj).id);
    }

    public TikTokMediaModel(String str, EnumC538220L8y enumC538220L8y, boolean z) {
        super(str, enumC538220L8y.name());
        this.id = str;
        this.loadSource = enumC538220L8y;
        this.isResized = z;
        this.originIndex = -1;
        this.selectIndex = -1;
        this.abRollIndex = -1;
        this.mediaIndex = -1;
    }

    public /* synthetic */ TikTokMediaModel(String str, EnumC538220L8y enumC538220L8y, int i) {
        this(str, (i & 2) != 0 ? EnumC538220L8y.MEDIA_STORE : enumC538220L8y, false);
    }
}
