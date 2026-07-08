package com.ss.android.ugc.aweme.music.service;

import X.C155U;
import X.C15HO;
import X.C15JJ;
import X.C15KJ;
import X.C15O7;
import X.C19EG;
import X.C20499015Jc;
import X.C20500615Js;
import X.C20502515Kl;
import X.InterfaceC202028143e;
import X.InterfaceC20498115It;
import X.InterfaceC20499515Jh;
import X.ProgressDialogC1397800mTi;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMultiMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TrimPointResponse;
import com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS308S0300000_31;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes32.dex */
public interface IMusicService {
    String LIZ(MusicModel musicModel);

    void LIZIZ();

    Class<?> LIZJ();

    void LIZLLL(String str);

    void LJ(Context context, String str, InterfaceC20498115It interfaceC20498115It);

    boolean LJFF();

    void LJI();

    Music LJII(String str);

    void LJIIIIZZ();

    int LJIIIZ();

    void LJIIJ(int i, Context context, InterfaceC202028143e interfaceC202028143e, MusicModel musicModel, String str, boolean z, boolean z2);

    int LJIIJJI();

    String LJIIL(MusicModel musicModel);

    void LJIILIIL();

    Boolean LJIILJJIL();

    MusicModel LJIILL(String str);

    void LJIILLIIL(C19EG c19eg, Object obj, Bundle bundle, AwS308S0300000_31 awS308S0300000_31, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252);

    void LJIIZILJ(String str, int i, C15KJ c15kj);

    C20499015Jc LJIJ(Context context, List list);

    String LJIJI(int i);

    boolean LJIJJ(MusicModel musicModel, Context context, boolean z);

    C155U LJIJJLI();

    void LJIL(C155U c155u);

    C15O7 LJJ(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2);

    void LJJI();

    CutMultiMusicPanel LJJIFFI();

    CutMusicPanel LJJII();

    C15O7 LJJIII(int i, int i2, int i3, Boolean bool, String str, String str2, String str3);

    void LJJIIJ();

    void LJJIIJZLJL(String str);

    Map<String, Class<?>> LJJIIZ();

    C15O7<BaseResponse> LJJIIZI(MusicModel musicModel, int i);

    C15O7 LJJIJ(String str, String str2, long j, int i, int i2, String str3, String str4, String str5);

    C15O7 LJJIJIIJI(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, String str6, int i4, int i5, int i6, long j, int i7, String str7, String str8, boolean z, String str9, String str10, int i8, String str11, int i9, String str12, String str13);

    void LJJIJIIJIL(ProgressDialogC1397800mTi progressDialogC1397800mTi, Context context, InterfaceC20498115It interfaceC20498115It, String str, boolean z, boolean z2);

    C15O7<TrimPointResponse> LJJIJIL();

    C15O7<SuggestMusicList> LJJIJL(String str, String str2);

    boolean LJJIJLIJ();

    boolean LJJIL();

    void LJJIZ(List list, List list2, C20502515Kl c20502515Kl);

    void LJJJ(Fragment fragment, MusicModel musicModel, C15HO c15ho);

    void LJJJI(C19EG c19eg, InterfaceC20498115It interfaceC20498115It, String str);

    C15JJ LJJJIL();

    C15O7 LJJJJ(int i, int i2, String str);

    boolean LJJJJI();

    void LJJJJIZL();

    boolean LJJJJJ(MusicModel musicModel, Context context, boolean z, boolean z2);

    void LJJJJJL();

    C15O7 LJJJJL(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, int i3, long j);

    AVMusicDownloadPlayHelper LJJJJLI(C20500615Js c20500615Js);

    void LJJJJLL();

    MusicWaveBean LJJJJZ(int i);

    MusicDownloadPlayHelper LJJJJZI(InterfaceC20499515Jh interfaceC20499515Jh, String str);

    AIMusicDownloadPlayHelper LJJJLIIL(InterfaceC20499515Jh interfaceC20499515Jh, String str);

    void LJJJLL();

    void LJJJLZIJ(String str, Context context, MusicModel musicModel, int i, InterfaceC202028143e interfaceC202028143e);

    List<String> LJJJZ(String str);

    long getMusicDuration(String str);

    void initService();
}
