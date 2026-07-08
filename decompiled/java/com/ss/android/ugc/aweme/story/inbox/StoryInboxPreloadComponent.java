package com.ss.android.ugc.aweme.story.inbox;

import X.C01GW;
import X.C1209404oG;
import X.C1598930ri7;
import X.C1720106oR;
import X.C2187451AjH;
import X.C295190Bhd;
import X.C452501pT;
import X.C582610Mt9;
import X.C586060Myi;
import X.C785860UsC;
import X.C786410Ut5;
import Y.AObserverS226S0100000_24;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryInboxPreloadComponent extends BasePanelComponent {
    public VideoStateViewModel LL;
    public PthreadTimer LLILLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(356));
    public final AtomicBoolean LLILZ = new AtomicBoolean(false);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1179));

    public final void bo() {
        PthreadTimer pthreadTimer = this.LLILLL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            this.LLILLL = null;
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("StoryInboxPreComp", "stopTimer");
        }
        if (this.LLILZ.compareAndSet(false, true)) {
            long millis = TimeUnit.SECONDS.toMillis(C586060Myi.LIZ().delaySecTime);
            if (millis <= 0) {
                C1598930ri7.LIZ.preloadOnBoot();
            } else {
                C786410Ut5.LJLIIL(millis, (Handler) this.LLILLJJLI.getValue(), new Runnable() { // from class: X.0heg
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("StoryInboxPreloadComponent@c3dc.startDataFetch$1");
                        try {
                            C1598930ri7.LIZ.preloadOnBoot();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("StoryInboxPreloadComponent@c3dc.startDataFetch$1");
                    }
                });
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        MutableLiveData<C582610Mt9> mutableLiveData;
        super.onParentViewCreated();
        if (C586060Myi.LIZ().enableAdvance && C1598930ri7.LIZ.canShowStoryCell() && !C295190Bhd.LIZJ() && !C1209404oG.LIZ()) {
            Fragment fragment = getPanelContext().LJ;
            if (fragment != null) {
                if (this.LL == null) {
                    this.LL = (VideoStateViewModel) ViewModelProviders.of(fragment).get(VideoStateViewModel.class);
                }
                VideoStateViewModel videoStateViewModel = this.LL;
                if (videoStateViewModel != null && (mutableLiveData = videoStateViewModel.LLILZIL) != null) {
                    mutableLiveData.observe(this, (AObserverS226S0100000_24) this.LLILZIL.getValue());
                }
            }
            long j = C586060Myi.LIZ().expireSecTime;
            if (j > 0) {
                PthreadTimer pthreadTimer = new PthreadTimer("StoryInboxPreloadComponent");
                pthreadTimer.schedule(new C785860UsC(this, 5), j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                this.LLILLL = pthreadTimer;
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("StoryInboxPreComp", "startTimer");
            }
        }
    }
}
