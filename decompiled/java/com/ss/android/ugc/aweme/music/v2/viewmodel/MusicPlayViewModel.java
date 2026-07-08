package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C01GW;
import X.C0Q1Q;
import X.C0SVP;
import X.C1458360o3O;
import X.C1485020okO;
import X.C1485030okP;
import X.C1485060okS;
import X.C19EG;
import X.C1ER1;
import X.C20498815Ja;
import X.C20684815ws;
import X.C2174741A9g;
import X.C2344009Gk;
import X.C452501pT;
import X.C584850Mwl;
import X.C628700OlI;
import X.C630310Ont;
import X.C630370Onz;
import X.C736480Suk;
import X.CountDownTimerC20747916Gv;
import X.EnumC655500PnQ;
import X.InterfaceC0148002o;
import X.InterfaceC1485120okY;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS92S0210000_9;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicPlayViewModel extends AssemViewModel<C630370Onz> implements IMDPMusicPlayAbility {
    public Bundle LL;
    public C19EG LLILLJJLI;
    public MusicModel LLILLL;
    public String LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public CountDownTimerC20747916Gv LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 917));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 921));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1352));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 920));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 918));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1353));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 919));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 922));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(237));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C630370Onz(0);
    }

    public final C20498815Ja vQ2() {
        return (C20498815Ja) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        CountDownTimerC20747916Gv countDownTimerC20747916Gv = this.LLJJIII;
        if (countDownTimerC20747916Gv != null) {
            countDownTimerC20747916Gv.cancel();
        }
        this.LLJJIII = null;
        vQ2().release();
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPMusicPlayAbility
    public final void xb0() {
        if (vQ2().isPlaying()) {
            xQ2(false);
        }
    }

    public final void xQ2(boolean z) {
        String str;
        String id;
        int i;
        Music music;
        MatchedSoundInfo matchedSongInfo;
        CountDownTimerC20747916Gv countDownTimerC20747916Gv = this.LLJJIII;
        if (countDownTimerC20747916Gv != null) {
            countDownTimerC20747916Gv.cancel();
        }
        int iLJI = vQ2().LJI() - this.LLJJ;
        vQ2().pause();
        setState(new AwS24S0010000_9(z, 6));
        MusicModel musicModel = this.LLILLL;
        if (musicModel != null && this.LLJJIJI) {
            int i2 = 0;
            this.LLJJIJI = false;
            Map<String, String> mapT0 = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).t0();
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (this.LLJJIJIIJIL) {
                str = "auto_play";
            } else {
                str = "click_play_music";
            }
            c2344009Gk.LJIIIIZZ("enter_method", str);
            String str2 = "share_from_resso";
            if (!Intrinsics.LJFF("share_from_resso", this.LLILZ.getValue())) {
                str2 = "single_song";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk.LJIIIIZZ("previous_page", (String) this.LLJI.getValue());
            C20684815ws.LJIILLIIL("music_pause", c2344009Gk.LIZ);
            c2344009Gk.LJIIIIZZ("search_type", mapT0.get("searchType"));
            c2344009Gk.LJIIIIZZ("previous_page_position", (String) this.LLIZ.getValue());
            c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(mapT0.get("imprId")));
            c2344009Gk.LJIIIIZZ("impr_id", mapT0.get("imprId"));
            c2344009Gk.LIZJ(musicModel.getDuration(), "time");
            c2344009Gk.LIZJ(musicModel.getDuration(), "duration");
            c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LLJILLL, "stay_time");
            if (z && iLJI < 0) {
                iLJI = musicModel.getDuration();
            }
            c2344009Gk.LIZJ(iLJI, "play_duration");
            c2344009Gk.LJIIIIZZ("request_id", (String) this.LLJ.getValue());
            c2344009Gk.LJIIIIZZ("group_id", (String) this.LLIZLLLIL.getValue());
            Music music2 = musicModel.getMusic();
            if (music2 != null && (matchedSongInfo = music2.getMatchedSongInfo()) != null) {
                id = matchedSongInfo.getId();
            } else {
                id = null;
            }
            c2344009Gk.LJIIIIZZ("meta_song_id", id);
            c2344009Gk.LJIIIIZZ("last_group_id", (String) this.LLIZLLLIL.getValue());
            Music music3 = musicModel.getMusic();
            if (music3 != null && music3.isPgc()) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_pgc");
            Music music4 = musicModel.getMusic();
            if ((music4 != null && music4.isPgc()) || ((music = musicModel.getMusic()) != null && C630310Ont.LIZIZ(music))) {
                i2 = 1;
            }
            c2344009Gk.LIZJ(i2, "is_pgc_style");
            C0Q1Q.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams((String) this.LLILZ.getValue(), ""));
            C20684815ws.LJIILLIIL("music_play_time", c2344009Gk.LIZ);
        }
    }

    public final void wQ2(Music music, final boolean z, boolean z2, int i) {
        String urlKey;
        String str;
        this.LLILLL = music.convertToMusicModel();
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(music.convertToMusicModel(), this.LLILLJJLI, true)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("previous_page", "music_hot");
            c2344009Gk.LJIIIIZZ("action_type", "play");
            c2344009Gk.LJIIIIZZ("music_id", music.getMid());
            c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLILZ.getValue());
            if (music.isNewRelease()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("music_new_flag", str);
            C20684815ws.LJIILLIIL("user_music_failed", c2344009Gk.LIZ);
            return;
        }
        this.LLJILJILJ = SystemClock.elapsedRealtime();
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = z;
        final MusicModel musicModel = this.LLILLL;
        if (musicModel != null) {
            final C1485060okS c1485060okS = new C1485060okS();
            c1485060okS.LJFF = musicModel.getMusicId();
            if (musicModel.getMusicType() == 1 || musicModel.getMusicType() == 2) {
                c1485060okS.LIZJ = 4;
            }
            c1485060okS.LIZLLL = musicModel.getPreciseAuditionDuration();
            int iIntValue = getState().LLILLL.LIZ.intValue();
            if (C628700OlI.LIZ().enableResumePlay && iIntValue > 0 && iIntValue < c1485060okS.LIZLLL) {
                c1485060okS.LJIIIZ = iIntValue;
            } else if (C628700OlI.LIZ().musicAutoPlayFromTrimPoint && !z2 && i > 0 && i < c1485060okS.LIZLLL) {
                c1485060okS.LJIIIZ = i;
            } else {
                c1485060okS.LJIIIZ = 0;
            }
            if (musicModel.isPlayUrlValid()) {
                c1485060okS.LIZIZ = musicModel.getUrl().getUrlList();
                UrlModel url = musicModel.getUrl();
                if (url != null) {
                    urlKey = url.getUrlKey();
                } else {
                    urlKey = null;
                }
                c1485060okS.LJIIJ = urlKey;
            }
            if (C1458360o3O.LIZ()) {
                if (!TextUtils.isEmpty(musicModel.getMusicVolumeInfo())) {
                    c1485060okS.LJIIJJI = musicModel.getMusicVolumeInfo();
                }
                float fLIZJ = C1485020okO.LIZJ();
                if (C1485020okO.LIZLLL(Float.valueOf(fLIZJ))) {
                    c1485060okS.LJIIL = fLIZJ + C1485030okP.LIZ.mdpPlaybackLoudnessBias;
                }
            }
            setState(new AwS97S0110000_9(c1485060okS, z2, 11));
            vQ2().LJ(new InterfaceC1485120okY() { // from class: X.15Lp
                @Override // X.InterfaceC1485120okY
                public final void LIZ(int i2, int i3) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    int i4;
                    Music music2;
                    MatchedSoundInfo matchedSongInfo;
                    this.LIZ.LLJILLL = SystemClock.elapsedRealtime();
                    MusicPlayViewModel musicPlayViewModel = this.LIZ;
                    musicPlayViewModel.LLJJ = musicPlayViewModel.vQ2().LJI();
                    MusicPlayViewModel musicPlayViewModel2 = this.LIZ;
                    if (!musicPlayViewModel2.LLJJIJI) {
                        musicPlayViewModel2.vQ2().pause();
                    }
                    MusicPlayViewModel musicPlayViewModel3 = this.LIZ;
                    AwS92S0210000_9 awS92S0210000_9 = new AwS92S0210000_9(musicPlayViewModel3, c1485060okS, z, 2);
                    CountDownTimerC20747916Gv countDownTimerC20747916Gv = musicPlayViewModel3.LLJJIII;
                    if (countDownTimerC20747916Gv != null) {
                        countDownTimerC20747916Gv.cancel();
                    }
                    CountDownTimerC20747916Gv countDownTimerC20747916Gv2 = new CountDownTimerC20747916Gv(awS92S0210000_9, 4);
                    musicPlayViewModel3.LLJJIII = countDownTimerC20747916Gv2;
                    countDownTimerC20747916Gv2.start();
                    this.LIZ.setState(AFwS240S0000000_9.get$arr$(882));
                    C650950Pg5.Companion.getClass();
                    C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
                    String id = null;
                    if (c0prwLIZIZ != null) {
                        str3 = c0prwLIZIZ.searchId;
                        str2 = c0prwLIZIZ.searchKeyword;
                    } else {
                        str2 = null;
                        str3 = null;
                    }
                    Map<String, String> mapT0 = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).t0();
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("music_id", musicModel.getMusicId());
                    String str7 = "share_from_resso";
                    if (!Intrinsics.LJFF("share_from_resso", this.LIZ.LLILZ.getValue())) {
                        str7 = "single_song";
                    }
                    c2344009Gk2.LJIIIIZZ("enter_from", str7);
                    c2344009Gk2.LJIIIIZZ("previous_page_position", (String) this.LIZ.LLIZ.getValue());
                    c2344009Gk2.LJIIIIZZ("search_type", mapT0.get("searchType"));
                    c2344009Gk2.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(mapT0.get("imprId")));
                    c2344009Gk2.LJIIIIZZ("impr_id", mapT0.get("imprId"));
                    c2344009Gk2.LJIIIIZZ("search_id", mapT0.get("searchId"));
                    c2344009Gk2.LJIIIIZZ("search_id_x", str3);
                    c2344009Gk2.LJIIIIZZ("search_result_id", mapT0.get("searchResultId"));
                    c2344009Gk2.LJIIIIZZ("search_keyword", mapT0.get("searchKeyword"));
                    c2344009Gk2.LJIIIIZZ("search_keyword_x", str2);
                    c2344009Gk2.LJIIIIZZ("process_id", (String) this.LIZ.LLILZIL.getValue());
                    if (!z) {
                        str4 = "click_play_music";
                    } else {
                        str4 = "auto_play";
                    }
                    c2344009Gk2.LJIIIIZZ("enter_method", str4);
                    if (((Boolean) this.LIZ.LLILZLL.getValue()).booleanValue()) {
                        str5 = "panel";
                    } else {
                        str5 = "detail";
                    }
                    c2344009Gk2.LJIIIIZZ("page_model", str5);
                    Music music3 = musicModel.getMusic();
                    int i5 = 1;
                    if (music3 != null && music3.isNewRelease()) {
                        str6 = "1";
                    } else {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk2.LJIIIIZZ("music_new_flag", str6);
                    Music music4 = musicModel.getMusic();
                    if (music4 != null && music4.isPgc()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    c2344009Gk2.LIZJ(i4, "is_pgc");
                    Music music5 = musicModel.getMusic();
                    if ((music5 == null || !music5.isPgc()) && ((music2 = musicModel.getMusic()) == null || !C630310Ont.LIZIZ(music2))) {
                        i5 = 0;
                    }
                    c2344009Gk2.LIZJ(i5, "is_pgc_style");
                    c2344009Gk2.LJIIIIZZ("request_id", (String) this.LIZ.LLJ.getValue());
                    c2344009Gk2.LJIIIIZZ("group_id", (String) this.LIZ.LLIZLLLIL.getValue());
                    Music music6 = musicModel.getMusic();
                    if (music6 != null && (matchedSongInfo = music6.getMatchedSongInfo()) != null) {
                        id = matchedSongInfo.getId();
                    }
                    c2344009Gk2.LJIIIIZZ("meta_song_id", id);
                    c2344009Gk2.LJIIIIZZ("previous_page", (String) this.LIZ.LLJI.getValue());
                    c2344009Gk2.LJIIIIZZ("page_name", this.LIZ.LLJILJIL);
                    float fLIZ = C1485020okO.LIZ(musicModel.getMusicVolumeInfo());
                    if (C1485020okO.LIZLLL(Float.valueOf(fLIZ))) {
                        c2344009Gk2.LIZIZ(fLIZ, "bgm_volume_difference_with_feed_db");
                    }
                    C0Q1Q.LIZ(c2344009Gk2, C1ER1.LIZIZ.fetchSearchParams((String) this.LIZ.LLILZ.getValue(), ""));
                    c2344009Gk2.LJFF("promo_id", (String) this.LIZ.LLJIJIL.getValue());
                    C20684815ws.LJIILLIIL("play_music", c2344009Gk2.LIZ);
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ.LLJILJILJ;
                    String musicId = musicModel.getMusicId();
                    String str8 = (String) this.LIZ.LLILZIL.getValue();
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("enter_from", "single_song");
                    c2344009Gk3.LJIIIIZZ("enter_method", "click_play_music");
                    c2344009Gk3.LJIIIIZZ("music_id", musicId);
                    c2344009Gk3.LJIIIIZZ("process_id", str8);
                    c2344009Gk3.LIZLLL(jElapsedRealtime, "duration");
                    C20684815ws.LJIILLIIL("play_music_initiate_duration", c2344009Gk3.LIZ);
                }
            });
            vQ2().LIZIZ(c1485060okS);
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("music_play");
            mobClickObtain.setLabelName("single_song");
            C736480Suk c736480Suk = new C736480Suk();
            c736480Suk.LIZ("song_id", musicModel.getMusicId());
            mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
            C20684815ws.onEvent(mobClickObtain);
        }
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            c2174741A9g.LJIILL(c2174741A9g.LIZIZ(null), EnumC655500PnQ.CLICK_UNMUTE_BUTTON, C0SVP.STYLE_NO_BUTTON);
        }
    }
}
