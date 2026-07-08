package com.bytedance.android.monitorV2.hybridSetting.entity;

import X.C086I;
import android.util.Base64;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridSettingInitConfig {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public IThirdConfig LJIIJ;
    public List<String> LJIIJJI;
    public List<String> LJIIL;

    public static abstract class IThirdConfig {
        public boolean isThirdPartyUrl(String str) {
            return false;
        }
    }

    public final List<String> LIZ() {
        if (C086I.LIZIZ(this.LJIIL)) {
            this.LJIIL = Collections.singletonList(new String(Base64.decode("https://mon.isnssdk.com/monitor/collect/", 0)));
        }
        return this.LJIIL;
    }
}
