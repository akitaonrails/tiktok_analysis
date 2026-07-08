package com.ss.android.ugc.aweme.music.v2.assem;

import X.C01GW;
import X.C0L1P;
import X.C0PEM;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1399200mVy;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C630120Ona;
import X.C724240Sb0;
import X.InterfaceC658750Psf;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.ImageMonitorParams;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class AILivePhotoOpenAlbumAssem extends OpenAlbumAssem {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public MusicDetail LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(301));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 716));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 717));

    public final void Fp() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        OpenPostAlbumParams openPostAlbumParams;
        IAILiveService iAILiveServiceEp;
        IAILiveService iAILiveServiceEp2 = Ep();
        if (iAILiveServiceEp2 == null || IAILiveService.DefaultImpls.getQuotaRemain$default(iAILiveServiceEp2, null, 1, null) > 0) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null || (c19egLIZIZ = C1388190mED.LIZIZ(c19egLIZ)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || (openPostAlbumParams = tp().LLJJIJIIJIL) == null || (iAILiveServiceEp = Ep()) == null) {
                return;
            }
            IAILiveService.DefaultImpls.goPostAlbum$default(iAILiveServiceEp, c19egLIZ, openPostAlbumParams, this, supportFragmentManager, null, 16, null);
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L1P(this, null), 3);
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ2);
        IAILiveService iAILiveServiceEp3 = Ep();
        c1389890mGx.LJIIJ(iAILiveServiceEp3 != null ? IAILiveService.DefaultImpls.getDynamicString$default(iAILiveServiceEp3, 2131825313, null, new Object[0], 2, null) : null);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final int op() {
        return R.raw.icon_image_plus;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final void Ap() {
        if (this.LLJJIJIL != null) {
            Fp();
        } else {
            this.LLJJJIL = false;
            this.LLJJJ = true;
        }
    }

    public final IAILiveService Ep() {
        return (IAILiveService) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final void zp() {
        if (this.LLJJIJIL != null) {
            Gp();
        } else {
            this.LLJJJ = false;
            this.LLJJJIL = true;
        }
    }

    public final void Gp() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        OpenPostAlbumParams openPostAlbumParams;
        DialogFragment dialogFragmentProvideAILiveSheetContentView;
        IAILiveService iAILiveServiceEp = Ep();
        if (iAILiveServiceEp == null || !iAILiveServiceEp.shouldShowSheetWhenClickAnchor()) {
            Fp();
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (c19egLIZIZ = C1388190mED.LIZIZ(c19egLIZ)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || (openPostAlbumParams = tp().LLJJIJIIJIL) == null) {
            return;
        }
        IAILiveService iAILiveServiceEp2 = Ep();
        if (iAILiveServiceEp2 != null && (dialogFragmentProvideAILiveSheetContentView = iAILiveServiceEp2.provideAILiveSheetContentView(c19egLIZ, openPostAlbumParams)) != null) {
            dialogFragmentProvideAILiveSheetContentView.show(supportFragmentManager, "ai_live");
        }
        IAILiveService iAILiveServiceEp3 = Ep();
        if (iAILiveServiceEp3 != null) {
            iAILiveServiceEp3.refreshQuotaCache(RefreshQuotaScene.CLICK_ANCHOR);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final String mp() {
        IAILiveService iAILiveServiceEp = Ep();
        if (iAILiveServiceEp != null) {
            return IAILiveService.DefaultImpls.getDynamicString$default(iAILiveServiceEp, 2131825321, null, new Object[0], 2, null);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final String sp() {
        AIAliveInfo aIAliveInfo;
        OpenPostAlbumParams openPostAlbumParams = tp().LLJJIJIIJIL;
        if (openPostAlbumParams == null || (aIAliveInfo = openPostAlbumParams.aiAliveInfo) == null) {
            return null;
        }
        return aIAliveInfo.getStyleImageUrl();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final String up() {
        String text;
        AIAliveInfo aIAliveInfo;
        IAILiveService iAILiveServiceEp = Ep();
        if (iAILiveServiceEp != null) {
            Object[] objArr = new Object[1];
            OpenPostAlbumParams openPostAlbumParams = tp().LLJJIJIIJIL;
            if (openPostAlbumParams == null || (aIAliveInfo = openPostAlbumParams.aiAliveInfo) == null || (text = aIAliveInfo.getText()) == null) {
                text = "";
            }
            objArr[0] = text;
            String dynamicString = iAILiveServiceEp.getDynamicString(2131825319, null, objArr);
            if (dynamicString != null) {
                return dynamicString;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final String yp() {
        String dynamicString$default;
        IAILiveService iAILiveServiceEp = Ep();
        return (iAILiveServiceEp == null || (dynamicString$default = IAILiveService.DefaultImpls.getDynamicString$default(iAILiveServiceEp, 2131825320, null, new Object[0], 2, null)) == null) ? "" : dynamicString$default;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final InterfaceC658750Psf Bp(Function0<Long> function0) {
        IAILiveService iAILiveServiceEp = Ep();
        if (iAILiveServiceEp != null) {
            return iAILiveServiceEp.provideImageMonitorListener(new ImageMonitorParams("sheet", function0, new AwS565S0100000_21(this, 718)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem
    public final void lp(MusicDetail musicDetail) {
        MusicModel musicModelConvertToMusicModel;
        Music music;
        if (!C1399200mVy.LIZ(musicDetail)) {
            C630120Ona.LIZ(LJJIJL());
            return;
        }
        MusicDetailViewModel musicDetailViewModelTp = tp();
        OpenPostAlbumParams openPostAlbumParams = tp().LLJJIJIIJIL;
        OpenPostAlbumParams openPostAlbumParamsCopy = null;
        if (openPostAlbumParams != null) {
            if (musicDetail != null && (music = musicDetail.music) != null && (musicModelConvertToMusicModel = music.convertToMusicModel()) != null) {
                musicModelConvertToMusicModel.setMusicBeginTime(((Number) this.LLJJJJ.getValue()).intValue());
                musicModelConvertToMusicModel.setMusicStart(((Number) this.LLJJJJ.getValue()).intValue());
                musicModelConvertToMusicModel.setMusicStartFromCut(((Number) this.LLJJJJ.getValue()).intValue());
                musicModelConvertToMusicModel.setMusicEndTime(((Number) this.LLJJJJJIL.getValue()).intValue());
            } else {
                musicModelConvertToMusicModel = null;
            }
            openPostAlbumParamsCopy = openPostAlbumParams.copy(openPostAlbumParams.enterMethod, openPostAlbumParams.aiAliveInfo, openPostAlbumParams.shootWay, openPostAlbumParams.enterFrom, openPostAlbumParams.delayGuideShow, openPostAlbumParams.originAIAliveInfo, musicModelConvertToMusicModel);
        }
        musicDetailViewModelTp.LLJJIJIIJIL = openPostAlbumParamsCopy;
        this.LLJJIJIL = musicDetail;
        if (this.LLJJJIL) {
            Gp();
        } else {
            if (!this.LLJJJ) {
                return;
            }
            Fp();
        }
    }
}
