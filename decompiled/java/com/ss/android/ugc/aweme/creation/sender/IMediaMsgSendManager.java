package com.ss.android.ugc.aweme.creation.sender;

import X.C0Y3I;
import X.C0YTK;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IMediaMsgSendManager {
    void LIZ(C0Y3I c0y3i, C869590Y9l c869590Y9l);

    void LIZIZ(String str, List<? extends MediaModel> list, String str2, C0YTK c0ytk, Map<String, String> map, Map<String, String> map2, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData);

    void LIZJ(C0Y3I c0y3i, C869590Y9l c869590Y9l);

    void init();
}
