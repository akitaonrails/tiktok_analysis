package com.ss.android.ugc.aweme.music.addtodsp.ability;

import X.C1389910mGz;
import X.EnumC631120OpC;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IMusicAddToDspAbility {
    void LIZ(String str);

    boolean LIZIZ();

    List<Music> LIZJ(Music music);

    String LIZLLL();

    boolean LJ();

    C1389910mGz LJFF(Fragment fragment, EnumC631120OpC enumC631120OpC);

    int LJI();

    boolean LJII();

    void recordAddSongTimestamp();

    boolean shouldBlockAddSongsToMyMusic();

    void trackAddToMyMusic();
}
