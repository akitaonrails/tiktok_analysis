package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;

/* JADX INFO: loaded from: classes9.dex */
public interface IUIService {
    IVideo2GifUIService abilityUiService();

    IEditService editService();

    IRecordService recordService();

    void startCreation(Context context, CreationConfigModelCompat creationConfigModelCompat);

    void startCreationFromDeepLink(Context context, CreationConfigModelCompat creationConfigModelCompat);

    IVideoTemplateService videoTemplateService();
}
