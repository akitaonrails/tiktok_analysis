package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes9.dex */
public interface IVideoRecordEntranceService {
    void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3);

    void startChangeBanMusicEditActivity(Context context, Intent intent);

    void startChoosePhotoActivity(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig);

    void startChoosePhotoActivityWithMusic(Activity activity, Intent intent, MusicModel musicModel);

    void startSuperEntranceRecordActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3);

    void startToolPermissionActivity(Context context, Intent intent);
}
