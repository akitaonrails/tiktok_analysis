package com.ss.android.ugc.gamora.editor.sticker.lyric;

import X.C0CIJ;
import X.C1466090oFr;
import X.C274000AoY;
import X.C274010AoZ;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.lyric.ILyricSettings;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: loaded from: classes5.dex */
public final class LyricSettings implements ILyricSettings {
    @Override // com.ss.android.ugc.aweme.lyric.ILyricSettings
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        StickerNewEngineModel stickerNewEngineModel;
        StickerNewEngineModel stickerNewEngineModel2;
        Boolean bool;
        boolean z = false;
        if (u4.LJIIZILJ(videoPublishEditModel)) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (stickerNewEngineModel2 = creativeModel.stickerModel) != null && (bool = stickerNewEngineModel2.enableLyricSticker) != null) {
            return bool.booleanValue();
        }
        if (creativeModel.pugcTemplateData.featureCodes.contains(Integer.valueOf(C0CIJ.UGC_LYRIC.getValue())) || (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? ((Boolean) C274000AoY.LIZ.getValue()).booleanValue() || C1466090oFr.LJIIIZ(videoPublishEditModel.creativeModel.stickerModel) : ((Boolean) C274010AoZ.LIZ.getValue()).booleanValue() || C1466090oFr.LJIIIZ(videoPublishEditModel.creativeModel.stickerModel))) {
            z = true;
        }
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        if (creativeModel2 != null && (stickerNewEngineModel = creativeModel2.stickerModel) != null) {
            stickerNewEngineModel.enableLyricSticker = Boolean.valueOf(z);
        }
        return z;
    }
}
