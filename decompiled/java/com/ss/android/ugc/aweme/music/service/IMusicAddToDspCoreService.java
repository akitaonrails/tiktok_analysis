package com.ss.android.ugc.aweme.music.service;

import X.AbstractC1549150qPp;
import X.C0P0X;
import X.C19EG;
import X.C610010NwF;
import X.C629600Omk;
import X.EnumC587920N4c;
import X.EnumC631120OpC;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC629580Omi;
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.model.DspLinkType;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public interface IMusicAddToDspCoreService {
    void LIZ(PreSaveLogData preSaveLogData);

    C610010NwF LIZIZ(EnumC631120OpC enumC631120OpC, String str);

    boolean LIZJ(Aweme aweme, EnumC631120OpC enumC631120OpC);

    boolean LIZLLL(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music);

    void LJ(EnumC631120OpC enumC631120OpC);

    void LJFF(Music music);

    void LJI(boolean z, LogData logData);

    boolean LJII(C19EG c19eg, Fragment fragment, int i, int i2, Intent intent, Function0 function0);

    void LJIIIIZZ(AddSongContextData addSongContextData, List<? extends DspPlatform> list);

    void LJIIIZ(Music music, EnumC631120OpC enumC631120OpC);

    void LJIIJ(EnumC631120OpC enumC631120OpC, String str, boolean z);

    AddSongEntranceViewModel LJIIJJI(Music music, AddSongContextData addSongContextData, LogData logData);

    boolean LJIIL();

    boolean LJIILIIL(boolean z);

    DspPlatform LJIILJJIL(Music music);

    String LJIILL(DspPlatform dspPlatform);

    void LJIILLIIL(Music music, TT2DspAlbumInfo tT2DspAlbumInfo);

    InterfaceC629580Omi LJIIZILJ(boolean z);

    void LJIJ(Music music);

    void LJIJI(String str, String str2, EnumC631120OpC enumC631120OpC);

    Pair<Boolean, String> LJIJJ();

    boolean LJIJJLI(List<TT2DSPSongInfo> list);

    Fragment LJIL(Fragment fragment, AddSongContextData addSongContextData, DspSheetType dspSheetType, List<TT2DSPSongInfo> list);

    DspPlatform LJJ(EnumC631120OpC enumC631120OpC);

    boolean LJJI();

    boolean LJJIFFI(Music music, int i);

    String LJJII(String str, String str2, String str3, Music music, TT2DspAlbumInfo tT2DspAlbumInfo);

    boolean LJJIII(C19EG c19eg, Fragment fragment, AddSongContextData addSongContextData, DspPlatform dspPlatform);

    boolean LJJIIJ();

    boolean LJJIIJZLJL(DspPlatform dspPlatform, Music music);

    void LJJIIZ(EnumC631120OpC enumC631120OpC, C629600Omk c629600Omk);

    void LJJIIZI(Activity activity, Fragment fragment, AddSongContextData addSongContextData, DspPlatform dspPlatform, List<TT2DSPSongInfo> list, boolean z);

    boolean LJJIJ(Aweme aweme, EnumC631120OpC enumC631120OpC);

    String LJJIJIIJI(DspPlatform dspPlatform);

    void LJJIJIIJIL(Fragment fragment, AddSongContextData addSongContextData, List list, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, DspPlatform dspPlatform);

    InterfaceC346201Wa<DspPlatform> LJJIJIL();

    Integer LJJIJL(DspPlatform dspPlatform);

    boolean LJJIJLIJ(C19EG c19eg, Fragment fragment, AddSongContextData addSongContextData, Music music, C610010NwF c610010NwF);

    boolean LJJIL(List<? extends DspPlatform> list);

    DspPlatform LJJIZ(TT2DspAlbumInfo tT2DspAlbumInfo);

    boolean LJJJ(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music);

    void LJJJI(AddSongContextData addSongContextData, DspLinkType dspLinkType, DspPlatform dspPlatform, Function0 function0, Function1 function1);

    void LJJJIL(EnumC631120OpC enumC631120OpC, String str);

    boolean LJJJJ();

    boolean LJJJJI(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music);

    void LJJJJIZL(AddSongContextData addSongContextData);

    List<TT2DSPSongInfo> LJJJJJ(Music music);

    Object LJJJJJL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean LJJJJL();

    DspPlatform LJJJJLI(List<? extends DspPlatform> list);

    void LJJJJLL(AddSongContextData addSongContextData);

    boolean LJJJJZ(EnumC631120OpC enumC631120OpC, String str);

    void LJJJJZI(Activity activity, Fragment fragment, AddSongContextData addSongContextData, DspPlatform dspPlatform, List<String> list, EnumC587920N4c enumC587920N4c, String str, Function0<Unit> function0, Function0<Unit> function02);

    void LJJJLIIL(EnumC631120OpC enumC631120OpC);

    void LJJJLL(String str, String str2, DspPlatform dspPlatform, Boolean bool, boolean z, DspLinkType dspLinkType, AddSongContextData addSongContextData, String str3, String str4, List<String> list, boolean z2);

    InterfaceC346201Wa<List<TT2DSPPlatformInfo>> LJJJLZIJ();

    void LJJJZ(ReportData reportData);

    boolean LJJL(Music music);

    String LJJLI(DspPlatform dspPlatform);

    C629600Omk LJJLIIIIJ(EnumC631120OpC enumC631120OpC, EnumC631120OpC enumC631120OpC2, DspPlatform dspPlatform, Music music);

    boolean LJJLIIIJ();

    boolean LJJLIIIJILLIZJL(Music music, boolean z);

    List<DspPlatform> LJJLIIIJJI(Music music, TT2DspAlbumInfo tT2DspAlbumInfo, List<TT2DSPSongInfo> list, List<? extends DspPlatform> list2);

    void LJJLIIIJJIZ(LogData logData);

    void LJJLIIIJL(EnumC631120OpC enumC631120OpC, String str, C0P0X c0p0x);

    DspPlatform LJJLIIIJLJLI(List<TT2DSPSongInfo> list);

    void LJJLIIIJLLLLLLLZ(PreSaveLogData preSaveLogData);

    void LJJLIIJ(Activity activity, Intent intent);

    boolean LJJLIL(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music);

    void LJJLJ(LogData logData);

    DspPlatform LJJLJLI();

    void LJJLL(EnumC631120OpC enumC631120OpC, String str, boolean z);

    void LJJZ(Fragment fragment, AddSongContextData addSongContextData, DspSheetType dspSheetType, List<TT2DSPSongInfo> list, Function0<Unit> function0, Function0<Unit> function02);

    void LJJZZI();

    C610010NwF LJJZZIII(Aweme aweme, EnumC631120OpC enumC631120OpC, Music music);

    DspPlatform getPlatformSelectedByUser();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList();
}
