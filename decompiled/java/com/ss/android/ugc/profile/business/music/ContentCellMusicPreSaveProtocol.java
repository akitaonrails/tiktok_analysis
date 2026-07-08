package com.ss.android.ugc.profile.business.music;

import X.C633020OsG;
import X.C7740030o;
import X.EnumC631300OpU;
import X.EnumC631330OpX;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.PreSaveLogData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.profile.model.MusicPreSaveInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;

/* JADX INFO: loaded from: classes10.dex */
public final class ContentCellMusicPreSaveProtocol extends ContentCellProtocol {
    public MusicPreSaveData LLL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_music_pre_save";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return C633020OsG.LIZIZ.LJJIIJ();
    }

    public final PreSaveLogData LJLLL() {
        MusicPreSaveInfo musicPreSaveInfo;
        String str;
        IProfilePlatformVM iProfilePlatformVM;
        User userVQ2;
        MusicPreSaveData musicPreSaveData = this.LLL;
        if (musicPreSaveData == null || (musicPreSaveInfo = musicPreSaveData.getMusicPreSaveInfo()) == null || (str = musicPreSaveInfo.metaAlbumId) == null) {
            return null;
        }
        String str2 = this.LLJJIJIL;
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        User userVQ22 = iProfilePlatformVM2 != null ? iProfilePlatformVM2.vQ2() : null;
        return new PreSaveLogData(null, str2, str2, null, null, null, null, ((userVQ22 == null || userVQ22.getFollowStatus() != 1) && ((iProfilePlatformVM = this.LLIZLLLIL) == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null || userVQ2.getFollowStatus() != 2)) ? CardStruct.IStatusCode.DEFAULT : "1", str, null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        PreSaveLogData preSaveLogDataLJLLL = LJLLL();
        if (preSaveLogDataLJLLL != null) {
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            c633020OsG.LJJLIIIJLLLLLLLZ(preSaveLogDataLJLLL);
            c633020OsG.LJJJZ(new ReportData(EnumC631330OpX.PRESAVE_CLICK.getValue(), EnumC631300OpU.TT_TO_DSP.getValue(), null, null, null, null, preSaveLogDataLJLLL.albumId));
            c633020OsG.LJIJ(null);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        MusicPreSaveData musicPreSaveData = (MusicPreSaveData) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), nVar.toString(), MusicPreSaveData.class);
        this.LLL = musicPreSaveData;
        this.LLJJJJ = musicPreSaveData;
        this.LLJILJIL = musicPreSaveData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJI(boolean z) {
        PreSaveLogData preSaveLogDataLJLLL;
        if (z && (preSaveLogDataLJLLL = LJLLL()) != null) {
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            c633020OsG.LIZ(preSaveLogDataLJLLL);
            c633020OsG.LJJJZ(new ReportData(EnumC631330OpX.PRESAVE_SHOW.getValue(), EnumC631300OpU.TT_TO_DSP.getValue(), null, null, null, null, preSaveLogDataLJLLL.albumId));
        }
    }
}
