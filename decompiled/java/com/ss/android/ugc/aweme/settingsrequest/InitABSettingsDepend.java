package com.ss.android.ugc.aweme.settingsrequest;

import X.C01GW;
import X.C202094145s;
import X.C307970C5j;
import X.C452501pT;
import X.InterfaceC311700CJs;
import com.tiktok.ef.absettings.api.IABSettingFetcherConfig;
import com.tiktok.ef.absettings.api.IInitAbSettingsDepend;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class InitABSettingsDepend implements IInitAbSettingsDepend {
    public final String LIZ = "https://libra-va.tiktokv.com";
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1946));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1949));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1948));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(655));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1947));
    public final long LJI = C202094145s.LJIILL;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(656));

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final C307970C5j LIZ() {
        return (C307970C5j) this.LIZIZ.getValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final IABSettingFetcherConfig LIZIZ() {
        return (IABSettingFetcherConfig) this.LJFF.getValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final boolean LIZJ() {
        return ((Boolean) this.LJII.getValue()).booleanValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final C307970C5j LIZLLL() {
        return (C307970C5j) this.LIZJ.getValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final InterfaceC311700CJs LJ() {
        return (InterfaceC311700CJs) this.LIZLLL.getValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final boolean LJFF() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final long LJI() {
        return this.LJI;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final String getHost() {
        return this.LIZ;
    }
}
