package com.ss.android.ugc.aweme.im.message.template.card;

import X.C869590Y9l;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public interface BaseTemplate extends Parcelable {
    AttachmentComponent Hs();

    BaseResponseComponent Nc();

    Map<String, String> Xr(C869590Y9l c869590Y9l);

    BaseTemplate bM(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent);

    BaseFooterComponent dG();

    ByteString encode();

    int getMessageType();

    BaseTemplate nw(C869590Y9l c869590Y9l);

    BaseHeaderComponent og();

    BaseRequestComponent rj();

    PreviewHintComponent yo();
}
