package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff;

import X.C1613230s5B;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public interface InnerFeedPlaylistAppDiffProtocol {
    public static final C1613230s5B LIZ = C1613230s5B.LIZ;

    void LIZ(AwS568S0100000_24 awS568S0100000_24);

    void LIZIZ();

    void LIZJ(AwS425S0200000_24 awS425S0200000_24);

    void LIZLLL(AwS568S0100000_24 awS568S0100000_24);

    public static final class DowngradeInstance implements InnerFeedPlaylistAppDiffProtocol {
        @Override // com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol
        public final void LIZIZ() {
        }

        @Override // com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol
        public final void LIZ(AwS568S0100000_24 awS568S0100000_24) throws JSONException {
            awS568S0100000_24.invoke();
        }

        @Override // com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol
        public final void LIZJ(AwS425S0200000_24 awS425S0200000_24) {
            awS425S0200000_24.invoke();
        }

        @Override // com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol
        public final void LIZLLL(AwS568S0100000_24 awS568S0100000_24) throws JSONException {
            awS568S0100000_24.invoke();
        }
    }
}
