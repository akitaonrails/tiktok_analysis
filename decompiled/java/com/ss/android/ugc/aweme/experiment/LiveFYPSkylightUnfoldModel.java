package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveFYPSkylightUnfoldModel {

    @C09CT("auto_fold_enter_room")
    public final boolean autoFoldEnterRoom;

    @C09CT("enable_golive_auto_unfold")
    public final boolean enableGoLiveAutoUnfold;

    @C09CT("golive_merge_btn_scene")
    public final List<String> goLiveMergeBtnScene;

    public LiveFYPSkylightUnfoldModel() {
        this(false, false, null);
    }

    public LiveFYPSkylightUnfoldModel(boolean z, boolean z2, List<String> list) {
        this.autoFoldEnterRoom = z;
        this.enableGoLiveAutoUnfold = z2;
        this.goLiveMergeBtnScene = list;
    }
}
