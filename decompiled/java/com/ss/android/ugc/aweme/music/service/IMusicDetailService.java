package com.ss.android.ugc.aweme.music.service;

import X.C1389910mGz;
import X.C19EG;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.FetchSimilarMusicOption;
import com.ss.android.ugc.aweme.music.model.IFetchSimilarMusicCallback;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: loaded from: classes22.dex */
public interface IMusicDetailService {
    boolean LIZ(Music music);

    boolean LIZIZ();

    void LIZJ(FetchSimilarMusicOption fetchSimilarMusicOption, IFetchSimilarMusicCallback iFetchSimilarMusicCallback);

    void LIZLLL(Bundle bundle, FragmentManager fragmentManager);

    C1389910mGz LJ(Fragment fragment);

    void LJFF(Map<String, String> map);

    String LJI(Aweme aweme);

    MusicDetailFragment LJII(Intent intent);

    Pair<String, String> LJIIIIZZ(Context context, Music music);

    boolean LJIIIZ(Aweme aweme);

    List<MusicOwnerInfo> LJIIJ(Music music);

    Class<? extends Fragment> LJIIJJI();

    void LJIIL(FragmentManager fragmentManager, MusicFusion musicFusion, String str, String str2, String str3, String str4, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, AwS387S0200000_21 awS387S0200000_21, boolean z);

    void LJIILIIL();

    boolean LJIILJJIL(Music music);

    void LJIILL(String str);

    void LJIILLIIL(long j, String str, String str2);

    void LJIIZILJ(String str, int i, TreeMap treeMap, String str2, String str3, MusicAwemeListRequestModel musicAwemeListRequestModel);

    void LJIJ(Aweme aweme);

    void LJIJI(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, MusicStickerStruct musicStickerStruct, String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, String str8, String str9, String str10);

    void LJIJJ(LifecycleOwner lifecycleOwner, C19EG c19eg, MusicModel musicModel, String str, String str2);

    boolean LJIJJLI(View view, String str);

    void LJIL(Music music);

    boolean LJJ(Music music);
}
