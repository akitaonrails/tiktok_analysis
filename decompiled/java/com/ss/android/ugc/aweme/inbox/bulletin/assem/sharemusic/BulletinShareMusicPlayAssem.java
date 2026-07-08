package com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C1388190mED;
import X.C13LE;
import X.C15IZ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1485100okW;
import X.InterfaceC20499515Jh;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicPlayViewModel;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicPlayAssem extends AbstractC738140SxQ implements InterfaceC20499515Jh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinShareMusicPlayAssem.class, "playVM", "getPlayVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/sharemusic/BulletinShareMusicPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinShareMusicPlayAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinShareMusicPlayViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 489), AFwS240S0000000_9.get$arr$(275), null, true);
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return true;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    public final BulletinShareMusicPlayViewModel bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (BulletinShareMusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return bo().LLILLL;
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        Context context = getContext();
        if (context != null) {
            return C1388190mED.LIZIZ(context);
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        final DataCenter dataCenterVQ2 = fragmentLJI != null ? DataCenter.vQ2(ViewModelProviders.of(fragmentLJI), this) : null;
        BulletinShareMusicPlayViewModel bulletinShareMusicPlayViewModelBo = bo();
        MusicDownloadPlayHelper musicDownloadPlayHelper = new MusicDownloadPlayHelper(this);
        bulletinShareMusicPlayViewModelBo.LL = musicDownloadPlayHelper;
        musicDownloadPlayHelper.LLJJJIL = false;
        musicDownloadPlayHelper.Mf();
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = bulletinShareMusicPlayViewModelBo.LL;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.Rf(new InterfaceC1485100okW() { // from class: X.0OXw
                @Override // X.InterfaceC1485100okW
                public final void LIZIZ() {
                    DataCenter dataCenter = dataCenterVQ2;
                    if (dataCenter != null) {
                        dataCenter.zQ2(Integer.valueOf(EnumC621120OXu.DEFAULT.getValue()), "bulletin_share_music_play_status");
                    }
                }
            });
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = bulletinShareMusicPlayViewModelBo.LL;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.LLILZLL = new C15IZ() { // from class: X.0OXx
                @Override // X.C15IZ
                public final void LIZ() {
                    DataCenter dataCenter = dataCenterVQ2;
                    if (dataCenter != null) {
                        dataCenter.zQ2(Integer.valueOf(EnumC621120OXu.PLAYING.getValue()), "bulletin_share_music_play_status");
                    }
                }
            };
        }
        bulletinShareMusicPlayViewModelBo.LLILLJJLI = dataCenterVQ2;
        if (dataCenterVQ2 != null) {
            dataCenterVQ2.yQ2("bulletin_share_music_play_status", bulletinShareMusicPlayViewModelBo, false);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        MusicDownloadPlayHelper musicDownloadPlayHelper = bo().LL;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIZ();
        }
        BulletinShareMusicPlayViewModel bulletinShareMusicPlayViewModelBo = bo();
        bulletinShareMusicPlayViewModelBo.LLILLJJLI = null;
        bulletinShareMusicPlayViewModelBo.LL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        BulletinShareMusicPlayViewModel bulletinShareMusicPlayViewModelBo = bo();
        MusicDownloadPlayHelper musicDownloadPlayHelper = bulletinShareMusicPlayViewModelBo.LL;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJIIIZ();
        }
        bulletinShareMusicPlayViewModelBo.withState(new AwS588S0100000_9(bulletinShareMusicPlayViewModelBo, 594));
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = bulletinShareMusicPlayViewModelBo.LL;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.pause();
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = bulletinShareMusicPlayViewModelBo.LL;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.LLJILJILJ = true;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        MusicDownloadPlayHelper musicDownloadPlayHelper = bo().LL;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LLJILJILJ = false;
        }
    }
}
