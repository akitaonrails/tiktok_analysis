package com.ss.android.ugc.aweme.services.publish;

import X.InterfaceC1294060jmO;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PublishOutput {
    public final List<AnchorCommonStruct> anchors;
    public final String creationId;
    public final String filePath;
    public final boolean isCommercialMusic;
    public final boolean isOriginalSound;
    public final List<MediaLocationMetaDataModel> mediaLocationMetaDataList;
    public final String musicId;
    public final PoiData poiData;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getFilePath$annotations() {
    }

    public final boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public final boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public PublishOutput(String str, String str2, String str3, boolean z, boolean z2, PoiData poiData, List<MediaLocationMetaDataModel> list, List<AnchorCommonStruct> list2) {
        this.creationId = str;
        this.filePath = str2;
        this.musicId = str3;
        this.isCommercialMusic = z;
        this.isOriginalSound = z2;
        this.poiData = poiData;
        this.mediaLocationMetaDataList = list;
        this.anchors = list2;
    }
}
