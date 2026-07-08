package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ToastContent;

/* JADX INFO: loaded from: classes19.dex */
public final class LsComplianceSceneConfig {

    @C09CT("freq")
    public final FreqConfig freq;

    @C09CT("name")
    public final String sceneName;

    @C09CT("toast_content")
    public final ToastContent toastContent;

    public LsComplianceSceneConfig(String str, FreqConfig freqConfig, ToastContent toastContent) {
        this.sceneName = str;
        this.freq = freqConfig;
        this.toastContent = toastContent;
    }
}
