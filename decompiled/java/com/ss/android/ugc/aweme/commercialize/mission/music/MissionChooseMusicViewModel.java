package com.ss.android.ugc.aweme.commercialize.mission.music;

import X.AbstractC19459411Bg;
import X.C15IG;
import X.C19459311Bf;
import X.C786410Ut5;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MissionChooseMusicViewModel extends ViewModel implements C15IG {
    public Mission LL;
    public final MutableLiveData<AbstractC19459411Bg> LLILLJJLI = new MutableLiveData<>();

    @Override // X.C15IG
    public final /* bridge */ /* synthetic */ MutableLiveData Ms2() {
        return this.LLILLJJLI;
    }

    @Override // X.C15IG
    public final void qu0(Mission mission) {
        this.LL = mission;
    }

    @Override // X.C15IG
    public final void xr1(MusicModel musicModel) {
        String musicId;
        Mission mission = this.LL;
        if (mission != null && mission.getMissionId() != null) {
            Mission mission2 = this.LL;
            String musicId2 = null;
            if (mission2 != null && mission2.getMusicId() != null) {
                Mission mission3 = this.LL;
                if (mission3 != null) {
                    musicId = mission3.getMusicId();
                } else {
                    musicId = null;
                }
                if (musicModel != null) {
                    musicId2 = musicModel.getMusicId();
                }
                if (Intrinsics.LJFF(musicId, musicId2)) {
                    C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS129S0100000_29(this, 23));
                }
            }
        }
    }

    @Override // X.C15IG
    public final void mf2(FrameLayout frameLayout, LayoutInflater layoutInflater) {
        Mission mission = this.LL;
        if (mission != null && mission.getMissionId() != null) {
            View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d6q, frameLayout, true);
            ((TextView) viewTd.findViewById(R.id.cez)).setText(2131837330);
            C786410Ut5.a9((TuxIconView) viewTd.findViewById(R.id.cex), new ACListenerS163S0100000_29(this, 26));
            this.LLILLJJLI.setValue(new C19459311Bf(0));
        }
    }
}
