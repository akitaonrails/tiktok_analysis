package com.ss.android.ugc.aweme.story.api;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryCurrentSubAwemeAbilityImpl implements IStoryCurrentSubAwemeAbility {
    public final MutableLiveData<Aweme> LL = new MutableLiveData<>();

    @Override // com.ss.android.ugc.aweme.story.api.IStoryCurrentSubAwemeAbility
    public final MutableLiveData IA1() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryCurrentSubAwemeAbility
    public final void C90(Aweme aweme) {
        Aweme value = this.LL.getValue();
        if (value == aweme) {
            return;
        }
        if (value != null && aweme != null && Intrinsics.LJFF(value.getAid(), aweme.getAid())) {
            return;
        }
        this.LL.setValue(aweme);
    }
}
