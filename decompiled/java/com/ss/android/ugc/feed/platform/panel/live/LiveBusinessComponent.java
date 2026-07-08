package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0IVH;
import X.C19212010Ec;
import X.C452501pT;
import X.C582610Mt9;
import Y.AObserverS211S0100000_7;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveBusinessComponent extends BasePanelComponent {
    public VideoStateViewModel LL;
    public boolean LLILLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(201));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 549));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        MutableLiveData<C582610Mt9> mutableLiveData;
        super.onParentViewCreated();
        this.LLILLL = true;
        if (!C0IVH.LIZLLL()) {
            C19212010Ec.LIZJ.LJJIIJ("skip_by_not_hit_exp");
            return;
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null) {
            if (this.LL == null) {
                this.LL = (VideoStateViewModel) ViewModelProviders.of(fragment).get(VideoStateViewModel.class);
            }
            VideoStateViewModel videoStateViewModel = this.LL;
            if (videoStateViewModel == null || (mutableLiveData = videoStateViewModel.LLILZIL) == null) {
                return;
            }
            mutableLiveData.observe(this, (AObserverS211S0100000_7) this.LLILZ.getValue());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLILLL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLILLL = true;
    }
}
