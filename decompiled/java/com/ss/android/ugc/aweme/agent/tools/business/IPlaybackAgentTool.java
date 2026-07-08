package com.ss.android.ugc.aweme.agent.tools.business;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public interface IPlaybackAgentTool {
    Pair<Boolean, Aweme> LIZ();

    ActionCommandPayload LIZIZ(String str, Map<String, ? extends Object> map);

    ActionCommandPayload LIZJ();

    ActionCommandPayload LIZLLL(Map<String, ? extends Object> map);

    ActionCommandPayload LJ();

    void LJFF(Fragment fragment);

    ActionCommandPayload LJI(Map<String, ? extends Object> map);

    ActionCommandPayload LJII(Map<String, ? extends Object> map);

    ActionCommandPayload LJIIIIZZ(Map<String, ? extends Object> map);

    ActionCommandPayload LJIIIZ(Map<String, ? extends Object> map);

    ActionCommandPayload LJIIJ();

    ActionCommandPayload LJIIJJI(int i);

    ActionCommandPayload LJIIL(Map<String, ? extends Object> map);

    ConfigCommandPayload LJIILIIL(Map<String, ? extends Object> map, PlaybackConfig playbackConfig);

    ActionCommandPayload LJIILJJIL();

    ActionCommandPayload LJIILL(Map<String, ? extends Object> map);
}
