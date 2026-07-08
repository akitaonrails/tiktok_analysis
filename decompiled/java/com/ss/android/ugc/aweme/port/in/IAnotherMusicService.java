package com.ss.android.ugc.aweme.port.in;

import X.C11NZ;
import X.C1455220nyK;
import X.C1458410o3T;
import X.C155W;
import X.C19EG;
import X.C1DRG;
import X.C20498315Iv;
import X.C568990MTh;
import X.InterfaceC1455230nyL;
import X.InterfaceC1623990sMX;
import X.InterfaceC20498515Ix;
import X.ProgressDialogC1397800mTi;
import android.content.Context;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public interface IAnotherMusicService extends InterfaceC1623990sMX {
    Class<?> LIZJ();

    C11NZ<List<MusicModel>> Lk();

    void Mk(MusicModel musicModel);

    MusicWaveBean Nk(AVMusicWaveBean aVMusicWaveBean);

    void Ok();

    void Pk();

    boolean Qk();

    boolean Rk();

    String Sk(String str);

    void Tk();

    boolean Uk(String str);

    AVMusic Vk(String str);

    void Wk();

    C1455220nyK Xk(InterfaceC1455230nyL interfaceC1455230nyL);

    void Yk(Context context, String str, boolean z, ProgressDialogC1397800mTi progressDialogC1397800mTi, InterfaceC20498515Ix interfaceC20498515Ix, boolean z2);

    AVMusicWaveBean Zk(Serializable serializable);

    void al();

    void bl(C19EG c19eg, C20498315Iv c20498315Iv, Function1 function1, Function0 function0);

    AVChallenge cl(Challenge challenge);

    C1458410o3T dl();

    void el(C19EG c19eg, NavigationScene navigationScene, C20498315Iv c20498315Iv, AwS391S0200000_25 awS391S0200000_25, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252, AwS569S0100000_25 awS569S0100000_253);

    void fl(Context context, String str, C568990MTh c568990MTh);

    int getMusicDuration(String str);

    void gl();

    VerticalMusicViewV2 hl(C1DRG c1drg, C155W c155w);

    Pair il(int i, String str, Function0 function0, Function0 function02, IMusicRequestParam iMusicRequestParam);

    boolean isMusicTypeLocal(int i);

    String jl(String str);

    void kl(String str, boolean z);

    MusicModel transformAVMusic(AVMusic aVMusic);

    AVMusic transformMusicModel(MusicModel musicModel);
}
