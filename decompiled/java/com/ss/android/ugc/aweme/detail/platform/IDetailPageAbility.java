package com.ss.android.ugc.aweme.detail.platform;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface IDetailPageAbility extends IDetailLifecycleAbility {
    DetailPageComponent Dn1();

    long Dy();

    DetailFragmentPanel JQ();

    void Qj1(Music music, EditPostPermission editPostPermission);

    long VN1();

    Analysis getAnalysis();

    Aweme hm();

    boolean ku1();

    boolean onDispatchKeyEvent(KeyEvent keyEvent);

    int vj1();

    void y62(boolean z);

    void yL(List<? extends Aweme> list);
}
