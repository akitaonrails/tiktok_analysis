package com.ss.android.ugc.gamora.editor.audio.copyrightdetect;

import X.C01GW;
import X.C01XG;
import X.C0PEM;
import X.C10I4;
import X.C1453970nwJ;
import X.C2192401ArG;
import X.C23250099c;
import X.C452501pT;
import X.C5183020f;
import X.C589170N8x;
import X.C817503Hh;
import X.InterfaceC625970Ogt;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingServiceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class MuteStripSettingService implements IMuteStripSettingService {
    public final InterfaceC625970Ogt LIZ = C2192401ArG.LIZ(C589170N8x.LIZ("intelligentCreation", "editorPro"), "sound_removal_repo_name");
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(415));

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService
    public final String getProfileSnackType() {
        return C10I4.LIZ() ? "remove_edit" : C1453970nwJ.LIZJ() > 0 ? "remove_view" : "replace";
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService
    public final CachedAutoMuteStripSettingStatus getCachedAutoMuteStripSetting(boolean z) {
        IAutoSoundCheckService iAutoSoundCheckService;
        InterfaceC625970Ogt interfaceC625970Ogt = this.LIZ;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSettingStatus = CachedAutoMuteStripSettingStatus.NOT_QUERIED;
        int i = interfaceC625970Ogt.getInt("auto_mute_strip_setting_key", cachedAutoMuteStripSettingStatus.getValue());
        if (i <= cachedAutoMuteStripSettingStatus.getValue() && z && (iAutoSoundCheckService = (IAutoSoundCheckService) PluggableExtentionKt.pluggableSpi$default(IAutoSoundCheckService.class, false, false, false, 14, null)) != null) {
            iAutoSoundCheckService.LIZ(new C5183020f(this, 145));
        }
        return IMuteStripSettingServiceKt.toCachedMuteStripSettingStatus(i);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService
    public final void storeAutoMuteStripSetting(int i) {
        this.LIZ.LIZJ("auto_mute_strip_setting_key", i);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService
    public final void setAutoMuteStripSetting(boolean z, Function1<? super Integer, Unit> function1) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01XG(this, z, function1, null), 2);
    }
}
