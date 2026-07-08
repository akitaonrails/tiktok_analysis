package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C01GW;
import X.C0AN9;
import X.C0C64;
import X.C0OG7;
import X.C0OGE;
import X.C0P0X;
import X.C1477390oY5;
import X.C2097608Jq;
import X.C23250099c;
import X.C288800BTq;
import X.C629660Omq;
import X.C633020OsG;
import X.EnumC631120OpC;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailViewModel extends AssemViewModel<C629660Omq> {
    public static final Map<Integer, Integer> LLJJLIIIJLLLLLLLZ = C2097608Jq.LJIIIIZZ(new Pair(15, 42), new Pair(14, 52), new Pair(13, 62), new Pair(12, 72), new Pair(11, 82));
    public Music LL;
    public UrlModel LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public Integer LLIZLLLIL;
    public String LLJ;
    public ReuseMusicStruct LLJIJIL;
    public long LLJILJIL;
    public TTToDspLogExtra LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public OpenPostAlbumParams LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public MusicAwemeListRequestModel LLJJL;
    public String LLJI = "";
    public String LLJILJILJ = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C629660Omq(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        String str = this.LLJJIJIL;
        if (str != null) {
            ((ISearchService) ServiceManager.get().getService(ISearchService.class)).k0(str, String.valueOf(hashCode()));
        }
    }

    public static void xQ2(Music music) {
        List<SimBitRate> multiBitRatePlayInfo = music.getMultiBitRatePlayInfo();
        if (multiBitRatePlayInfo != null && !multiBitRatePlayInfo.isEmpty()) {
            RateSettingsResponse rateSettingsResponse = null;
            if (0 == 0) {
                try {
                    C1477390oY5.LIZ.getClass();
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "music_bitrate_select", true) == 1) {
                        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
                        videoBitRateABManager.LJII();
                        rateSettingsResponse = videoBitRateABManager.LIZ;
                    }
                    SimBitRate simBitRateLIZ = C1477390oY5.LIZ(multiBitRatePlayInfo, rateSettingsResponse);
                    if (simBitRateLIZ != null) {
                        UrlModel playUrl = music.getPlayUrl();
                        if (playUrl == null) {
                            playUrl = new UrlModel();
                        }
                        playUrl.setUrlKey(simBitRateLIZ.getUrlKey());
                        List<String> listUrlList = simBitRateLIZ.urlList();
                        List<String> urlList = playUrl.getUrlList();
                        C01GW c01gw = C0AN9.LIZ;
                        if (((Number) c01gw.getValue()).intValue() == 1) {
                            listUrlList.addAll(urlList);
                        } else if (((Number) c01gw.getValue()).intValue() == 2) {
                            if (listUrlList.size() >= 1) {
                                listUrlList.addAll(1, urlList);
                            } else {
                                listUrlList.addAll(urlList);
                            }
                        }
                        playUrl.setUrlList(listUrlList);
                        playUrl.setSize(simBitRateLIZ.getSize());
                        playUrl.setFileHash(simBitRateLIZ.getPlayAddr().getFileHash());
                        music.setPlayUrl(playUrl);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public final void zQ2(MusicDetail musicDetail) {
        String str;
        String str2;
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        DspPlatform dspPlatformLJIILJJIL = c633020OsG.LJIILJJIL(musicDetail.music);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.MUSIC_DETAIL;
        C0P0X c0p0x = C0P0X.UNKNOWN;
        String str3 = this.LLJI;
        MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.MDP;
        Music music = musicDetail.music;
        String str4 = this.LLILZ;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.LLJILJILJ;
        TTToDspLogExtra tTToDspLogExtra = this.LLJILLL;
        BaseResponse.ServerTimeExtra serverTimeExtra = musicDetail.extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        String str6 = this.LLJJJ;
        int i = this.LLJJJIL;
        if (this.LLJJJJ) {
            str2 = this.LLJJJJLIIL;
        } else {
            str2 = null;
        }
        c633020OsG.LJI(false, new LogData(dspPlatformLJIILJJIL, enumC631120OpC, c0p0x, "single_song", str3, musicETBusinessModule, null, music, null, null, str4, str5, CardStruct.IStatusCode.DEFAULT, null, null, tTToDspLogExtra, str, str6, null, false, i, str2));
    }

    public final void vQ2(Context context, boolean z, boolean z2) {
        Music music;
        setState(AFwS240S0000000_9.get$arr$(884));
        if ((C288800BTq.LIZ() || C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_music_detail_header_start", true, false)) && !((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() && (music = this.LL) != null) {
            if (!z && z2) {
                yQ2(music, context, true);
            }
            setState(new AwS375S0200000_9(music, this, 151));
            this.LL = null;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0OGE(this, z, z2, context, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(com.ss.android.ugc.aweme.music.model.Music r12, android.content.Context r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel.yQ2(com.ss.android.ugc.aweme.music.model.Music, android.content.Context, boolean):void");
    }

    public final void wQ2(String str, boolean z, int i, TreeMap<String, String> treeMap, boolean z2, Context context) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0OG7(str, z, i, treeMap, this, z2, context, null), 3);
    }
}
