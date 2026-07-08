package com.ss.android.ugc.aweme.services.external.ui;

import X.C19EG;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

/* JADX INFO: loaded from: classes9.dex */
public interface IVideo2GifUIService {
    IVideoChoose toMusVideoChooseFragment(C19EG c19eg, Fragment fragment, IVideoChoose.Callback callback, Integer num);

    Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
