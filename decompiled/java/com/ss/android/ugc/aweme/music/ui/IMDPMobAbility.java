package com.ss.android.ugc.aweme.music.ui;

import X.C2344009Gk;
import X.InterfaceC494301wD;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;

/* JADX INFO: loaded from: classes22.dex */
public interface IMDPMobAbility extends InterfaceC494301wD {
    String C2();

    boolean G92(String str);

    String KZ1();

    String LJJLIIIJJI();

    String LLIIJI();

    String TW0(Context context, Aweme aweme);

    String V72(Aweme aweme);

    void Wv0(Context context, C2344009Gk c2344009Gk, Aweme aweme, MusicAwemeList musicAwemeList);

    int do2();

    Lifecycle dy();

    MusicDetail ep0();

    String il1();

    void jo(MusicDetail musicDetail);

    String lG0();

    String lJ2();

    int nH1();

    String rd0();

    String yq0(Aweme aweme);

    TtsVoiceInfo zQ0();

    void zb1(String str);
}
