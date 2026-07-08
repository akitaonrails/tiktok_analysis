package com.ss.android.ugc.aweme.lemon.postmode.service;

import X.C19EG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public interface IPostModeService {
    void LIZ(C19EG c19eg, VideoItemParams videoItemParams, PostModeDetailParams postModeDetailParams, String str, Fragment fragment, Function0 function0);

    boolean showEngagementCount();
}
