package com.ss.android.ugc.aweme.story.inbox;

import X.C01GW;
import X.C1598930ri7;
import X.C1599420riu;
import X.C1599430riv;
import X.C1599460riy;
import X.C295190Bhd;
import X.C452501pT;
import X.C582610Mt9;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryInboxPreloadComponentV2 extends BasePanelComponent {
    public VideoStateViewModel LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1599430riv());
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1599460riy(this));

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        Fragment fragment;
        MutableLiveData<C582610Mt9> mutableLiveData;
        super.onParentViewCreated();
        if (!C1598930ri7.LIZ.canShowStoryCell() || C295190Bhd.LIZJ() || (fragment = getPanelContext().LJ) == null) {
            return;
        }
        if (this.LL == null) {
            this.LL = (VideoStateViewModel) ViewModelProviders.of(fragment).get(VideoStateViewModel.class);
        }
        VideoStateViewModel videoStateViewModel = this.LL;
        if (videoStateViewModel == null || (mutableLiveData = videoStateViewModel.LLILZIL) == null) {
            return;
        }
        mutableLiveData.observe(this, (C1599420riu) this.LLILZ.getValue());
    }
}
