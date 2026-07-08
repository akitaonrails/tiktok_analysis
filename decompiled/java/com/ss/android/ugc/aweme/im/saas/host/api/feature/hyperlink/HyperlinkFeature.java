package com.ss.android.ugc.aweme.im.saas.host.api.feature.hyperlink;

import X.C06QJ;
import X.C869590Y9l;
import X.EnumC2434109gJ;
import X.EnumC2434209gK;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;

/* JADX INFO: loaded from: classes15.dex */
@Feature(id = "hyperlink", name = "Hyperlink")
public interface HyperlinkFeature {
    public static final C06QJ LIZ = C06QJ.LIZ;

    boolean LIZ(RichTextInfo richTextInfo);

    void LIZIZ(Activity activity, String str, String str2, C869590Y9l c869590Y9l, int i);

    void LIZJ(Context context, String str, EnumC2434109gJ enumC2434109gJ, EnumC2434209gK enumC2434209gK, boolean z, Long l, String str2, Integer num);
}
