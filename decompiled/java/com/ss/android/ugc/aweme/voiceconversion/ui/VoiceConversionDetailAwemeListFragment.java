package com.ss.android.ugc.aweme.voiceconversion.ui;

import X.C1398410mUh;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public final class VoiceConversionDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMjICw2KyoiPyohOywjJ2EmHELIOSIWsaJiYwLQYjJzk2OjYlJiEXLTEtICMSPyAhLAM6OzEKOy40JSAiPQ==";
    public String LLLILZLLLI;

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        String str = this.LLLILZLLLI;
        if (str != null) {
            smartRouteNR.withParam("feed_data_voice_conversion_voice_name", str);
        }
        return smartRouteNR;
    }
}
