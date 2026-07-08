package com.ss.android.ugc.aweme.services.publish;

import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;

/* JADX INFO: loaded from: classes34.dex */
public interface IPublishShareProvider {

    public static final class DefaultImpls {
        public static String getPublishMobContentType(IPublishShareProvider iPublishShareProvider) {
            return null;
        }
    }

    boolean canSparkSelected();

    boolean canSparkShow();

    boolean enableSettingItemOpt();

    String getPublishMobContentType();

    InjectLayoutInflater inflater();

    boolean needDefaultSelectSpark();

    boolean needShowSparkTips();

    void onSparkSelectChanged(boolean z);
}
