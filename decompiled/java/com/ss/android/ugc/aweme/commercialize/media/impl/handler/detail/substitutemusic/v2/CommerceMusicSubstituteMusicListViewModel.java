package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2;

import X.C01GW;
import X.C09IC;
import X.C1006040cHq;
import X.C13BV;
import X.C13LP;
import X.C1839030xxN;
import X.C1839120xxW;
import X.C1954807lC;
import X.C1BNE;
import X.C2252321DDq;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceMusicSubstituteMusicListViewModel extends ViewModel {
    public MusicDetail LL;
    public ScopedMusicPlayer LLILLJJLI;
    public CommerceMusicLogger LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 220));
    public final Map<Integer, Long> LLILZIL = new LinkedHashMap();
    public final C2252321DDq LLILZLL = C1BNE.LIZ(new C1006040cHq(C13BV.INSTANCE, "", false));

    public final void vQ2(int i) {
        MusicModel musicModel = (MusicModel) C13LP.LJJJLZIJ(i, (List) this.LLILZ.getValue());
        if (musicModel == null) {
            return;
        }
        int i2 = C1839030xxN.LIZ[((C1839120xxW) ListProtector.get(((C1006040cHq) C09IC.LIZIZ(this.LLILZLL).getValue()).LIZ, i)).LJI.ordinal()];
        ScopedMusicPlayer scopedMusicPlayer = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
                return;
            } else {
                ScopedMusicPlayer scopedMusicPlayer2 = this.LLILLJJLI;
                if (scopedMusicPlayer2 != null) {
                    scopedMusicPlayer = scopedMusicPlayer2;
                }
                scopedMusicPlayer.pause();
                return;
            }
        }
        ScopedMusicPlayer scopedMusicPlayer3 = this.LLILLJJLI;
        if (scopedMusicPlayer3 != null) {
            scopedMusicPlayer = scopedMusicPlayer3;
        }
        scopedMusicPlayer.LIZIZ(musicModel);
    }
}
