package com.ss.android.ugc.aweme.music.vm;

import X.C036E;
import X.C0RD4;
import X.C1233040iBy;
import X.C1252710ihh;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C19724912Fj;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C630980Ooy;
import X.C631220OpM;
import X.C631640Oq2;
import X.C631950OqX;
import X.C632090Oql;
import X.C632220Oqy;
import X.C686150Qvl;
import X.C723600SZy;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC631410Opf;
import X.EnumC631610Opz;
import X.InterfaceC0148002o;
import X.InterfaceC20499515Jh;
import X.InterfaceC634000Otq;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicPlayViewModel extends AssemViewModel<C631220OpM> implements Observer<C0RD4> {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public MusicDownloadPlayHelper LLILLJJLI;
    public InterfaceC20499515Jh LLILLL;
    public DataCenter LLILZ;
    public MusicModel LLILZIL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, OriginMusicArg.class, null), true);
    public volatile EnumC631410Opf LLILZLL = EnumC631410Opf.DEFAULT;
    public final Set<String> LLJILJIL = new LinkedHashSet();

    public final void CQ2() {
        withState(new AwS588S0100000_9(this, 343));
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIZ();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C631220OpM(0);
    }

    public final String getPreviousPage() {
        OriginMusicArg originMusicArg = (OriginMusicArg) this.LL.getValue();
        if (originMusicArg != null) {
            return originMusicArg.getPreviousPage();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C631640Oq2 c631640Oq2 = (C631640Oq2) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
        this.LLIZ = c631640Oq2 != null ? c631640Oq2.LIZ : null;
        C631640Oq2 c631640Oq22 = (C631640Oq2) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
        this.LLIZLLLIL = c631640Oq22 != null ? c631640Oq22.LIZJ : false;
        C631640Oq2 c631640Oq23 = (C631640Oq2) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
        this.LLJ = c631640Oq23 != null ? c631640Oq23.LJI : false;
        EventBus.LIZLLL().LJIJJ(this);
    }

    public static void wQ2(MusicModel musicModel) {
        String string;
        if (musicModel != null) {
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    string = music.getOfflineDesc();
                } else {
                    string = null;
                }
                if (TextUtils.isEmpty(string)) {
                    C844470XAv.LIZ.getClass();
                    string = C844470XAv.LIZ().getString(2131837770);
                }
                C844470XAv.LIZ.getClass();
                C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy.LIZJ(string);
                c1233040iBy.LIZLLL();
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            c2344009Gk.LJIIIIZZ("group_id", "");
            c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            C20684815ws.LJIILLIIL("click_feature_video_button", c2344009Gk.LIZ);
            C844470XAv.LIZ.getClass();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//music/artist/awemelist");
            smartRouteBuildRoute.withParam("artist_music_id", String.valueOf(musicModel.getId()));
            smartRouteBuildRoute.withParam("artist_music_name", musicModel.getName());
            smartRouteBuildRoute.withParam("artist_music_data", musicModel.convertToMusic());
            smartRouteBuildRoute.withParam("artist_music_from_profile", true);
            smartRouteBuildRoute.withParam("enter_method", "music_tab");
            smartRouteBuildRoute.open();
        }
    }

    public final void BQ2(C632090Oql c632090Oql) {
        MusicModel musicModel = c632090Oql.getMusicModel();
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                withState(new AwS218S0300000_9(musicModel, this, c632090Oql, 10));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str = c0rd4.LIZ;
        if (str.hashCode() == 2022349644 && str.equals("music_status")) {
            withState(new AwS588S0100000_9(this, 600));
        }
    }

    @C14EU
    public final void onEvent(C632220Oqy c632220Oqy) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.pause();
        }
    }

    public final void yQ2(boolean z) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.pause();
        }
        if (z) {
            CQ2();
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LLILLJJLI;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.LLJILJILJ = true;
            }
        }
    }

    public final void zQ2(MusicModel musicModel) {
        if (musicModel == null) {
            return;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LLILLJJLI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LLJILJILJ = false;
        }
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.zQ2(Integer.valueOf(EnumC631410Opf.LOADING.getValue()), "music_status");
        }
        this.LLILZIL = musicModel;
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LLILLJJLI;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.LJIIJ(musicModel, false, 7);
        }
    }

    public final void AQ2(C632090Oql c632090Oql, int i, ArtistHonorLabel artistHonorLabel) {
        boolean z;
        MusicModel musicModel = c632090Oql.getMusicModel();
        if (c632090Oql.getMusicItemModel().pinStatus == EnumC631610Opz.PINNED) {
            z = true;
        } else {
            z = false;
        }
        withState(new C631950OqX(this, z, musicModel, i, c632090Oql.getMusicItemModel().isHighlighted(), artistHonorLabel, c632090Oql.getMusicItemModel().isSimilarMusic(), c632090Oql.getMusicItemModel().sourceMusicIndex, c632090Oql.getMusicItemModel().similarMusicIndex, c632090Oql.getMusicItemModel().isSpotlighted()));
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                withState(new AwS218S0300000_9(musicModel, this, c632090Oql, 9));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.C632090Oql r25, int r26, com.ss.android.ugc.aweme.music.model.ArtistHonorLabel r27) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel.vQ2(X.0Oql, int, com.ss.android.ugc.aweme.music.model.ArtistHonorLabel):void");
    }

    public final void xQ2(C632090Oql c632090Oql, int i, boolean z, ArtistHonorLabel artistHonorLabel) {
        int i2;
        String str;
        String str2;
        boolean z2;
        String str3;
        String strLIZLLL;
        boolean z3;
        String string;
        MusicModel musicModel = c632090Oql.getMusicModel();
        if (c632090Oql.getMusicItemModel().pinStatus == EnumC631610Opz.PINNED) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean zIsHighlighted = c632090Oql.getMusicItemModel().isHighlighted();
        boolean zIsSimilarMusic = c632090Oql.getMusicItemModel().isSimilarMusic();
        Integer num = c632090Oql.getMusicItemModel().sourceMusicIndex;
        Integer num2 = c632090Oql.getMusicItemModel().similarMusicIndex;
        boolean zIsSpotlighted = c632090Oql.getMusicItemModel().isSpotlighted();
        if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
            Music music = musicModel.getMusic();
            if (music != null) {
                string = music.getOfflineDesc();
            } else {
                string = null;
            }
            if (TextUtils.isEmpty(string)) {
                C844470XAv.LIZ.getClass();
                string = C844470XAv.LIZ().getString(2131837770);
            }
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZJ(string);
            c1233040iBy.LIZLLL();
            return;
        }
        boolean z4 = this.LLIZLLLIL;
        if (!z4) {
            str = "others_homepage";
        } else {
            str = "personal_homepage";
        }
        if (z4) {
            str2 = "";
        } else {
            str2 = this.LLIZ;
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("song_cover");
        mobClickObtain.setLabelName("personal_homepage_list");
        mobClickObtain.setValue(musicModel.getMusicId());
        C20684815ws.onEvent(mobClickObtain);
        String string2 = UUID.randomUUID().toString();
        if (this.LLJ) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            c2344009Gk.LJIIIIZZ("button_type", "enter_music_detail");
            c2344009Gk.LJIIIIZZ("search_result_id", musicModel.getMusicId());
            c2344009Gk.LIZJ(i, "rank");
            C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
        } else {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("group_id", "");
            c2344009Gk2.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk2.LJIIIIZZ("previous_page", getPreviousPage());
            c2344009Gk2.LJIIIIZZ("process_id", string2);
            c2344009Gk2.LJIIIIZZ("to_user_id", str2);
            c2344009Gk2.LIZJ(i, "pos");
            c2344009Gk2.LIZJ(i2, "is_pin_to_top");
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk2.LJIIIIZZ("music_new_flag", str3);
            c2344009Gk2.LJIIIIZZ("music_new_show", "1");
            c2344009Gk2.LIZJ(zIsHighlighted ? 1 : 0, "highlight");
            Music music2 = musicModel.getMusic();
            if (music2 != null) {
                strLIZLLL = C630980Ooy.LIZLLL(music2);
            } else {
                strLIZLLL = null;
            }
            c2344009Gk2.LJFF("music_type", strLIZLLL);
            if (zIsHighlighted) {
                c2344009Gk2.LJFF("enter_method", "music_highlight");
            } else if (zIsSpotlighted) {
                c2344009Gk2.LJFF("enter_method", "spotlight");
            } else {
                c2344009Gk2.LJFF("enter_method", "personal_list");
            }
            if (artistHonorLabel != null) {
                c2344009Gk2.LJFF("artist_type", artistHonorLabel.getLabel());
            }
            if (zIsSimilarMusic) {
                if (num != null && num2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(num);
                    sbLIZ.append('-');
                    sbLIZ.append(num2);
                    c2344009Gk2.LJFF("similar_song_order", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (!zIsSimilarMusic && num != null) {
                c2344009Gk2.LJFF("main_song_order", String.valueOf(num));
            }
            C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk2.LIZ);
        }
        if (z) {
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("enter_from", "personal_homepage");
            c2344009Gk3.LJIIIIZZ("group_id", "");
            c2344009Gk3.LJIIIIZZ("music_id", musicModel.getMusicId());
            z3 = true;
            c2344009Gk3.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            C20684815ws.LJIILLIIL("click_feature_video_button", c2344009Gk3.LIZ);
        } else {
            z3 = true;
        }
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModel, ActivityStack.getTopActivity(), z3)) {
            if (this.LLJ) {
                C2344009Gk c2344009Gk4 = new C2344009Gk();
                c2344009Gk4.LJIIIIZZ("enter_from", "personal_homepage");
                c2344009Gk4.LJIIIIZZ("button_type", "enter_music_detail");
                c2344009Gk4.LJIIIIZZ("search_result_id", musicModel.getMusicId());
                c2344009Gk4.LIZJ(i, "rank");
                C20684815ws.LJIILLIIL("search_result_click", c2344009Gk4.LIZ);
                return;
            }
            C2344009Gk c2344009Gk5 = new C2344009Gk();
            c2344009Gk5.LJIIIIZZ("group_id", "");
            c2344009Gk5.LJIIIIZZ("author_id", "");
            c2344009Gk5.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk5.LJIIIIZZ("enter_from", str);
            c2344009Gk5.LJIIIIZZ("to_user_id", str2);
            c2344009Gk5.LIZJ(i, "pos");
            c2344009Gk5.LIZJ(i2, "is_pin_to_top");
            C20684815ws.LJIILLIIL("enter_music_detail_failed", c2344009Gk5.LIZ);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!this.LLIZLLLIL) {
            jSONObject.put("shoot_from", "others_homepage");
            jSONObject.put("to_user_id", this.LLIZ);
            jSONObject.put("pos", i);
            jSONObject.put("is_pin_to_top", i2);
        }
        C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aweme://music/detail/");
        sbLIZ2.append(musicModel.getMusicId());
        C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ2));
        c686150Qvl.LIZIZ("process_id", string2);
        c686150Qvl.LIZIZ("extra_track_info", C786410Ut5.J3(jSONObject));
        c686150Qvl.LIZ(z ? 1 : 0, "open_edit_sheet");
        c686150Qvl.LIZ(2, "extra_enter_from");
        c686150Qvl.LIZIZ("extra_music_from", str);
        c19724912FjLIZLLL.LJII(c686150Qvl.LIZJ());
    }
}
