package com.ss.android.ugc.aweme.shortvideo.model;

import X.C786410Ut5;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordStickerSegmentInfoKt {
    public static final boolean isUseVoiceRecognizeSticker(TimeSpeedModelExtension timeSpeedModelExtension) {
        RecordStickerSegmentInfo recordStickerSegmentInfo = (RecordStickerSegmentInfo) timeSpeedModelExtension.getFromRecordExtras("extra_key_record_sticker_info");
        if (recordStickerSegmentInfo == null || !recordStickerSegmentInfo.isUseVoiceRecognizeSticker()) {
            return false;
        }
        return true;
    }

    public static final Bundle asBundle(RecordStickerSegmentInfo recordStickerSegmentInfo, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJIJL(bundle, "extra_key_record_sticker_info", recordStickerSegmentInfo);
        return bundle;
    }
}
