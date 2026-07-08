package com.ss.android.ugc.aweme.music.discovery.spi;

import X.EnumC631120OpC;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public interface IMusicDiscoveryService {
    void LIZ(Fragment fragment, AddSongContextData addSongContextData, Long l, String str, String str2, boolean z, boolean z2, AwS553S0100000_9 awS553S0100000_9, AwS410S0200000_9 awS410S0200000_9);

    void LIZIZ();

    boolean LIZJ(Aweme aweme, EnumC631120OpC enumC631120OpC);
}
