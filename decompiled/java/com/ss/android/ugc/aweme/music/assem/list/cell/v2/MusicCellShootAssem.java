package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0BM1;
import X.C0P08;
import X.C0P0X;
import X.C0P2U;
import X.C0P2V;
import X.C127G;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C608360Nta;
import X.C630980Ooy;
import X.C631230OpN;
import X.C631940OqW;
import X.C632090Oql;
import X.C633020OsG;
import X.C634020Ots;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC631120OpC;
import X.EnumC631410Opf;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.DspLinkState;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS333S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellShootAssem extends ReusedUISlotAssem<MusicCellShootAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public View LLJLIL;
    public EnumC631410Opf LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public final AssemVMLazy LLJLLIL;
    public final C1559260qg8 LLJLLL;
    public AddSongEntranceViewModel LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public C127G LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellShootAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicCellShootAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicCellShootAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1128), AFwS240S0000000_9.get$arr$(463), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1129), AFwS240S0000000_9.get$arr$(464), null, true);
        this.LLJLLL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1127));
        this.LLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(237));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Bp() {
        DspPlatform displayedDsp;
        C0P08 c0p08;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Music music = ((C632090Oql) (c724270Sb3 != null ? c724270Sb3.LL : null)).getMusicModel().getMusic();
        if (music == null) {
            return;
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        DspPlatform dspPlatformLJIILJJIL = c633020OsG.LJIILJJIL(music);
        if (!up()) {
            if (dspPlatformLJIILJJIL == DspPlatform.UNKNOWN) {
                C197039127h c197039127h = this.LLJL;
                if (c197039127h != null) {
                    c197039127h.setText(2131824948);
                    return;
                }
                return;
            }
            C197039127h c197039127h2 = this.LLJL;
            if (c197039127h2 != null) {
                c197039127h2.setText(C0P2V.LIZIZ(dspPlatformLJIILJJIL));
                return;
            }
            return;
        }
        AddSongEntranceViewModel addSongEntranceViewModelLJIIJJI = c633020OsG.LJIIJJI(music, tp(dspPlatformLJIILJJIL, music), sp(music));
        this.LLJZ = addSongEntranceViewModelLJIIJJI;
        if (addSongEntranceViewModelLJIIJJI == null || (displayedDsp = addSongEntranceViewModelLJIIJJI.getDisplayedDsp()) == null) {
            displayedDsp = DspPlatform.UNKNOWN;
        }
        C197039127h c197039127h3 = this.LLJL;
        if (!(c197039127h3 instanceof C0P08) || (c0p08 = (C0P08) c197039127h3) == null) {
            return;
        }
        DspPlatform dspPlatform = DspPlatform.UNKNOWN;
        int i = R.raw.icon_list_add;
        if (displayedDsp == dspPlatform) {
            c0p08.LJJLIIIIJ();
            c0p08.setText(2131824948);
            c0p08.setButtonStartIcon(Integer.valueOf(R.raw.icon_list_add));
            return;
        }
        c0p08.setFallbackEnabled(true);
        c0p08.setFallbackText(C0P2V.LIZIZ(displayedDsp));
        Context context = c0p08.getContext();
        c0p08.setText(context != null ? context.getString(2131824949, C0P2V.LIZIZ(displayedDsp)) : null);
        c0p08.LJJJJJ();
        switch (C0P2U.LIZIZ[displayedDsp.ordinal()]) {
            case 1:
                i = R.raw.icon_color_apple_music;
                break;
            case 2:
                i = R.raw.icon_color_amazon_music;
                break;
            case 3:
                i = R.raw.icon_color_spotify_icon;
                break;
            case 4:
                i = R.raw.icon_color_melon;
                break;
            case 5:
                i = R.raw.icon_color_deezer_icon;
                break;
            case 6:
                i = R.raw.icon_color_soundcloud;
                break;
            case 7:
                i = R.raw.icon_color_youtube_music_icon;
                break;
            case 8:
                i = R.raw.icon_color_anghami;
                break;
        }
        c0p08.setButtonStartIcon(Integer.valueOf(i));
    }

    public final boolean up() {
        return ((Boolean) this.LLL.getValue()).booleanValue();
    }

    public final MusicPlayViewModel yp() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    public final boolean zp() {
        return ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return up() ? R.layout.egg : R.layout.egf;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS62S0000000_9(this, 41), OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 42)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        int i;
        if (C0BM1.LIZ()) {
            i = 2;
        } else {
            i = 3;
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.otk);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9(this, 70));
            c197039127h.setButtonSize(i);
            if (up()) {
                c197039127h.setTag(R.id.ih9, "font_sync");
            }
        } else {
            c197039127h = null;
        }
        this.LLJJLIIIJLLLLLLLZ = c197039127h;
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.osy);
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(this, 71));
            c197039127h2.setButtonSize(i);
            if (up()) {
                c197039127h2.setTag(R.id.ih9, "font_sync");
            }
        } else {
            c197039127h2 = null;
        }
        this.LLJL = c197039127h2;
        this.LLJLIL = view.findViewById(R.id.ot2);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.getFragmentManager() != null) {
            C736680Sv4.LJIIIZ(this, yp(), new C2217381BqS() { // from class: X.0OpL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C631220OpM) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0OpK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C631220OpM) obj).LLILLJJLI;
                }
            }, null, AFwS333S0000000_9.get$arr$(3), 12);
        }
    }

    @C14EU
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        Bp();
    }

    @C14EU
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        Bp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void op(EnumC631410Opf enumC631410Opf) {
        Object obj;
        Object obj2;
        int i;
        if (this.LLJLILLLLZIIL == enumC631410Opf) {
            return;
        }
        this.LLJLILLLLZIIL = enumC631410Opf;
        C197039127h c197039127h = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h != null) {
            C631230OpN.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(10)));
            int i2 = C0P2U.LIZ[enumC631410Opf.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C631230OpN.LIZ(c197039127h);
                }
            } else {
                C631230OpN.LIZJ(c197039127h);
            }
        }
        if (enumC631410Opf != EnumC631410Opf.DEFAULT) {
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj3 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (c633020OsG.LJIJJLI(((C632090Oql) obj).getMusicModel().getTT2DSPSongInfo())) {
                if (enumC631410Opf == EnumC631410Opf.PLAYING) {
                    C197039127h c197039127h2 = this.LLJL;
                    if (c197039127h2 != null) {
                        C631230OpN.LIZIZ(c197039127h2, Float.valueOf(C418440Gaw.LIZIZ(10)));
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
                        C724270Sb3 c724270Sb32 = this.LLJI;
                        if (c724270Sb32 != null) {
                            obj2 = c724270Sb32.LL;
                        } else {
                            obj2 = null;
                        }
                        if (((C632090Oql) obj2).getMusicItemModel().isSimilarMusic()) {
                            i = R.attr.zm;
                        } else {
                            i = R.attr.a03;
                        }
                        c384050F3z.LIZIZ = Integer.valueOf(i);
                        c197039127h2.setBackground(c384050F3z.LIZ(c197039127h2.getContext()));
                    }
                    Bp();
                    C197039127h c197039127h3 = this.LLJL;
                    if (c197039127h3 == null || c197039127h3.getVisibility() != 0) {
                        C724270Sb3 c724270Sb33 = this.LLJI;
                        if (c724270Sb33 != null) {
                            obj3 = c724270Sb33.LL;
                        }
                        Music music = ((C632090Oql) obj3).getMusicModel().getMusic();
                        if (music != null) {
                            if (up()) {
                                AddSongEntranceViewModel addSongEntranceViewModel = this.LLJZ;
                                if (addSongEntranceViewModel != null) {
                                    addSongEntranceViewModel.onShow(true);
                                }
                            } else {
                                c633020OsG.LJI(true, sp(music));
                            }
                        }
                    }
                    C197039127h c197039127h4 = this.LLJL;
                    if (c197039127h4 != null) {
                        C786410Ut5.LLLLLLJ(c197039127h4, 0);
                    }
                    View view = this.LLJLIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C197039127h c197039127h5 = this.LLJL;
        if (c197039127h5 != null) {
            C786410Ut5.LLLLLLJ(c197039127h5, 8);
        }
        View view2 = this.LLJLIL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C632090Oql c632090Oql) {
        String musicId;
        String musicId2 = c632090Oql.getMusicModel().getMusicId();
        MusicModel musicModel = yp().LLILZIL;
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        if (!Intrinsics.LJFF(musicId2, musicId)) {
            op(EnumC631410Opf.DEFAULT);
        } else {
            op(yp().LLILZLL);
        }
    }

    public final LogData sp(Music music) {
        String str;
        Object obj;
        C631940OqW musicItemModel;
        Integer num;
        DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.PROFILE_MUSIC_TAB;
        C0P0X c0p0x = C0P0X.SMALL;
        String str2 = "profile_music_tab_others";
        if (zp()) {
            str = "profile_music_tab_personal";
        } else {
            str = "profile_music_tab_others";
        }
        if (zp()) {
            str2 = "profile_music_tab_personal";
        }
        MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.MUSIC_TAB;
        TTToDspLogExtra tTToDspLogExtra = new TTToDspLogExtra();
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        ArtistHonorLabel artistHonorLabel = ((OriginMusicListViewModel) assemVMLazy.getValue()).LLJJIJIL;
        if (artistHonorLabel != null) {
            tTToDspLogExtra.append("artist_type", artistHonorLabel.getLabel());
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C632090Oql c632090Oql = (C632090Oql) obj;
        if (c632090Oql != null && (musicItemModel = c632090Oql.getMusicItemModel()) != null) {
            if (musicItemModel.isSimilarMusic() && musicItemModel.sourceMusicIndex != null && musicItemModel.similarMusicIndex != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(musicItemModel.sourceMusicIndex);
                sbLIZ.append('-');
                sbLIZ.append(musicItemModel.similarMusicIndex);
                tTToDspLogExtra.append("similar_song_order", C2188811AlT.LIZIZ(sbLIZ));
            } else if (!musicItemModel.isSimilarMusic() && (num = musicItemModel.sourceMusicIndex) != null) {
                tTToDspLogExtra.append("main_song_order", String.valueOf(num));
            }
        }
        return new LogData(dspPlatformLJIILJJIL, enumC631120OpC, c0p0x, str, str2, musicETBusinessModule, null, music, null, null, "", "", CardStruct.IStatusCode.DEFAULT, null, null, tTToDspLogExtra, "", null, null, false, 0, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    public final void Ap(AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        C633020OsG.LIZIZ.LJJZ(C724240Sb0.LJI(this), addSongContextData, DspSheetType.SELECT_DSP, list, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }

    public final AddSongContextData tp(DspPlatform dspPlatform, Music music) {
        String str;
        String id;
        DspLinkState dspLinkState;
        String str2 = "profile_music_tab_others";
        if (zp()) {
            str = "profile_music_tab_personal";
        } else {
            str = "profile_music_tab_others";
        }
        if (zp()) {
            str2 = "profile_music_tab_personal";
        }
        MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.MUSIC_TAB;
        String eventValue = C0P0X.SMALL.getEventValue();
        MatchedSoundInfo matchedSongInfo = music.getMatchedSongInfo();
        if (matchedSongInfo != null) {
            id = matchedSongInfo.getId();
        } else {
            id = null;
        }
        String strLIZLLL = C630980Ooy.LIZLLL(music);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.PROFILE_MUSIC_TAB;
        if (dspPlatform == DspPlatform.UNKNOWN) {
            dspLinkState = DspLinkState.UNLINKED;
        } else {
            dspLinkState = DspLinkState.LINKED;
        }
        return new AddSongContextData(str, str2, musicETBusinessModule, null, "", eventValue, music, 0, id, "", strLIZLLL, enumC631120OpC, dspLinkState, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 2147475464, null);
    }
}
