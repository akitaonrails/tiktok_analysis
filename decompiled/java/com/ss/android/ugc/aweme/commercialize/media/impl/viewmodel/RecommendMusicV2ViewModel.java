package com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel;

import X.C01GW;
import X.C09IC;
import X.C1006040cHq;
import X.C13BV;
import X.C13LP;
import X.C1839050xxP;
import X.C1839120xxW;
import X.C1954807lC;
import X.C1BNE;
import X.C2252321DDq;
import X.C452501pT;
import X.InterfaceC1839000xxK;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class RecommendMusicV2ViewModel extends ViewModel {
    public InterfaceC1839000xxK LL;
    public MusicDetail LLILLJJLI;
    public final C2252321DDq LLILLL = C1BNE.LIZ(null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 221));
    public final C2252321DDq LLILZIL = C1BNE.LIZ(new C1006040cHq(C13BV.INSTANCE, "", false));

    public final void vQ2(int i) {
        MusicModel musicModel = (MusicModel) C13LP.LJJJLZIJ(i, (List) this.LLILZ.getValue());
        if (musicModel == null) {
            return;
        }
        int i2 = C1839050xxP.LIZ[((C1839120xxW) ListProtector.get(((C1006040cHq) C09IC.LIZIZ(this.LLILZIL).getValue()).LIZ, i)).LJI.ordinal()];
        InterfaceC1839000xxK interfaceC1839000xxK = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
                return;
            }
            ScopedMusicPlayer scopedMusicPlayer = (ScopedMusicPlayer) this.LLILLL.getValue();
            if (scopedMusicPlayer != null) {
                scopedMusicPlayer.pause();
            }
            InterfaceC1839000xxK interfaceC1839000xxK2 = this.LL;
            if (interfaceC1839000xxK2 != null) {
                interfaceC1839000xxK = interfaceC1839000xxK2;
            }
            interfaceC1839000xxK.fn();
            return;
        }
        ScopedMusicPlayer scopedMusicPlayer2 = (ScopedMusicPlayer) this.LLILLL.getValue();
        if (scopedMusicPlayer2 != null) {
            scopedMusicPlayer2.LIZIZ(musicModel);
        }
        InterfaceC1839000xxK interfaceC1839000xxK3 = this.LL;
        if (interfaceC1839000xxK3 != null) {
            interfaceC1839000xxK = interfaceC1839000xxK3;
        }
        interfaceC1839000xxK.V7();
    }
}
