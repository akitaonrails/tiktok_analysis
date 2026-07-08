package com.ss.android.ugc.aweme.mvtemplate.view;

import X.C1398410mUh;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;

/* JADX INFO: loaded from: classes22.dex */
public final class MovieDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig6PSo+OCktPSHELIOSp9PiwpPmEeJzMlLAs2PCQlJQ4kLSgpBSYgPAM+KCg+LSs4";
    public MvModel LLLILZLLLI;
    public Integer LLLIZZ;

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        MvModel mvModel = this.LLLILZLLLI;
        if (mvModel != null) {
            smartRouteNR.withParam("feed_data_movie_model", mvModel);
        }
        Integer num = this.LLLIZZ;
        if (num != null) {
            smartRouteNR.withParam("mv_type", num.intValue());
        }
        AVUploadMiscInfoStruct uploadMiscInfoStruct = AwemeExtKt.getUploadMiscInfoStruct(aweme);
        if (uploadMiscInfoStruct != null) {
            smartRouteNR.withParam("source_id", uploadMiscInfoStruct.sourceId);
        }
        String str = this.LLJLLL;
        if (str != null) {
            smartRouteNR.withParam("feed_data_movie_group_id", str);
        }
        return smartRouteNR;
    }
}
