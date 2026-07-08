package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel;

import X.C0SYN;
import X.C10BQ;
import X.C1393390mMb;
import X.C14EU;
import X.C484220Iyq;
import X.C486890J7n;
import X.C697110RWb;
import X.C730120SkU;
import X.C737030Svd;
import X.C888460YtI;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlin.jvm.internal.AwS614S0100000_35;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes36.dex */
public final class FriendsV3EventDispatchViewModel extends FeedBaseViewModel<C1393390mMb> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1393390mMb(0);
    }

    public FriendsV3EventDispatchViewModel() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        setState(new AwS614S0100000_35(c888460YtI, 88));
    }

    @C14EU
    public final void onEventDiggCountUpdate(C730120SkU c730120SkU) {
        setState(new AwS614S0100000_35(c730120SkU, 89));
    }

    @C14EU
    public final void onEventDiggUpdate(C0SYN c0syn) {
        setState(new AwS614S0100000_35(c0syn, 90));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        setState(new AwS614S0100000_35(c484220Iyq, 91));
    }

    @C14EU
    public final void onPrivateModelEvent(C697110RWb c697110RWb) {
        setState(new AwS614S0100000_35(c697110RWb, 92));
    }

    @C14EU
    public final void onPrivateSettingChangeEvent(C10BQ c10bq) {
        setState(new AwS614S0100000_35(c10bq, 93));
    }

    @C14EU
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        setState(new AwS614S0100000_35(c486890J7n, 94));
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        int i = c737030Svd.LIZ;
        if (i != 2) {
            if (i == 13) {
                setState(new AwS614S0100000_35(c737030Svd, 96));
                return;
            }
            return;
        }
        setState(new AwS614S0100000_35(c737030Svd, 95));
    }
}
