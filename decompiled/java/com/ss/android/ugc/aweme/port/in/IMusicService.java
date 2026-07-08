package com.ss.android.ugc.aweme.port.in;

import X.InterfaceC1416890myV;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public interface IMusicService {
    MusicModel buildMusicModelFromFile(File file, String str, String str2, boolean z, boolean z2);

    boolean checkValidMusic(AVMusic aVMusic, Context context, boolean z);

    String getCacheDir();

    Map<String, String> getCreationMusicIdToLocalPathMap();

    String getDownloadDir();

    String getDownloadFileName(String str);

    String getRhythmMusicFilePath(String str);

    void initCreationMusicCache();

    boolean isMusicTypeLocal(int i);

    void openChooseMusicPage(Fragment fragment, int i, String str, int i2, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, String str4, int i3, UrlModel urlModel, String str5, String str6, boolean z7, String str7, String str8);

    void requestMusic(String str, InterfaceC1416890myV interfaceC1416890myV);

    AVMusic transformFromAVMusic(String str);

    AVMusic transformNewAVMusic(String str);
}
