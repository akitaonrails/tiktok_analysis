package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings;

import X.C10FJ;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.api.CommentFilterApi;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentFilterSettingsServiceImpl implements ICommentFilterSettingsService {
    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.ICommentFilterSettingsService
    public final Object LIZ() {
        return new C10FJ() { // from class: X.1BdB
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
                C11NZ<BaseResponse> c11nzTriggerSyncServerCommentFilter;
                C596450NaN c596450NaN = C596440NaM.LIZ;
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !TextUtils.isEmpty(curUserId)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("comment_filter_status_");
                    sbLIZ.append(curUserId);
                    c596450NaN.LIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(pushSettings.commentFilterStatus).intValue());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("comment_offensive_filter_");
                    sbLIZ2.append(curUserId);
                    c596450NaN.LIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ2), Integer.valueOf(pushSettings.commentOffensiveFilter).intValue());
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("author_review_all_comments_");
                    sbLIZ3.append(curUserId);
                    c596450NaN.LIZLLL(Boolean.valueOf(pushSettings.commentFilterAll), C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("filter_comment_manager_visible_");
                    sbLIZ4.append(curUserId);
                    c596450NaN.LIZLLL(Boolean.valueOf(pushSettings.commentManagerVisible), C2188811AlT.LIZIZ(sbLIZ4));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("creator_care_mode_optimised_");
                    sbLIZ5.append(curUserId);
                    c596450NaN.LIZLLL(Boolean.valueOf(pushSettings.careModeStatus), C2188811AlT.LIZIZ(sbLIZ5));
                    C10HJ.LIZ.getClass();
                    int i = pushSettings.isVulnerable;
                    Keva keva = C10HJ.LIZIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("comment_is_vulnerable_user_");
                    sbLIZ6.append(C10HJ.LIZIZ());
                    keva.storeInt(C2188811AlT.LIZIZ(sbLIZ6), i);
                    C10HJ.LIZJ(pushSettings.filterAllExpired);
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("comment_filter_status_synced_");
                    sbLIZ7.append(curUserId);
                    if (!c596450NaN.LIZ(Boolean.FALSE, C2188811AlT.LIZIZ(sbLIZ7)).booleanValue()) {
                        if (pushSettings.commentFilterStatus == 1 && CommentFilterApi.LIZ != null && (c11nzTriggerSyncServerCommentFilter = C20573415eu.LIZIZ.getValue().triggerSyncServerCommentFilter()) != null) {
                            c11nzTriggerSyncServerCommentFilter.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1D1D(0));
                        }
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("comment_filter_status_synced_");
                        sbLIZ8.append(curUserId);
                        c596450NaN.LIZLLL(Boolean.TRUE, C2188811AlT.LIZIZ(sbLIZ8));
                    }
                }
            }
        };
    }
}
