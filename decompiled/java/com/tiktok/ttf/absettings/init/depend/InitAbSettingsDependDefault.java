package com.tiktok.ttf.absettings.init.depend;

import X.C01GW;
import X.C307970C5j;
import X.C311770CJz;
import X.C311810CKd;
import X.C311920CKo;
import X.C452501pT;
import X.InterfaceC311700CJs;
import com.tiktok.ef.absettings.api.IABSettingFetcherConfig;
import com.tiktok.ef.absettings.api.IInitAbSettingsDepend;
import com.tiktok.ttf.absettings.task.FetchABSettingsTask;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public class InitAbSettingsDependDefault implements IInitAbSettingsDepend {
    public final String LIZ = "https://libra-sg.tiktokv.com/common";
    public final C311810CKd LIZIZ = new C307970C5j() { // from class: X.0CKd
        @Override // X.C307970C5j, X.InterfaceC292790Bdl
        public final C0C5H LIZ() {
            return null;
        }
    };
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2320));
    public final C311920CKo LIZLLL = new InterfaceC311700CJs() { // from class: X.0CKo
        public final C311930CKp LIZ = new C0TKF() { // from class: X.0CKp
            @Override // X.C0TKF
            public final Object LIZ(String str, Type type) {
                return null;
            }
        };
        public final AFwS232S0000000_4 LIZIZ = AFwS232S0000000_4.get$arr$(157);

        @Override // X.InterfaceC311700CJs
        public final Function1<String, Unit> LIZ() {
            return this.LIZIZ;
        }

        @Override // X.InterfaceC311700CJs
        public final C0TKF LIZIZ() {
            return this.LIZ;
        }
    };
    public final C311770CJz LJ = new IABSettingFetcherConfig() { // from class: X.0CJz
        public final C311720CJu LIZ = new C311720CJu("", 0, "");

        @Override // com.tiktok.ef.absettings.api.IABSettingFetcherConfig
        public final InterfaceC800130Va7 createABCDNConfigFetcher(List<C0CJ5> list, C0CJ4 c0cj4) {
            return null;
        }

        @Override // com.tiktok.ef.absettings.api.IABSettingFetcherConfig
        public final String getExtendFetchingRequestString() {
            return "";
        }

        @Override // com.tiktok.ef.absettings.api.IABSettingFetcherConfig
        public final boolean isForceDisableGroupUpdate() {
            return true;
        }

        @Override // com.tiktok.ef.absettings.api.IABSettingFetcherConfig
        public final void onRetryFetching() {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new FetchABSettingsTask());
            c799890VZj.LIZIZ();
        }

        @Override // com.tiktok.ef.absettings.api.IABSettingFetcherConfig
        public final C311720CJu getPlatformInfo() {
            return this.LIZ;
        }
    };

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final boolean LIZJ() {
        return false;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final boolean LJFF() {
        return false;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final long LJI() {
        return 0L;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final C307970C5j LIZLLL() {
        return (C307970C5j) this.LIZJ.getValue();
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final C307970C5j LIZ() {
        return this.LIZIZ;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final IABSettingFetcherConfig LIZIZ() {
        return this.LJ;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final InterfaceC311700CJs LJ() {
        return this.LIZLLL;
    }

    @Override // com.tiktok.ef.absettings.api.IInitAbSettingsDepend
    public final String getHost() {
        return this.LIZ;
    }
}
