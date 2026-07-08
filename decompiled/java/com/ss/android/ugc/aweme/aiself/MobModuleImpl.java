package com.ss.android.ugc.aweme.aiself;

import X.C0MGN;
import X.C13LE;
import X.C1697810uHb;
import X.C2217371BqR;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import com.ss.android.ugc.aweme.aime.MobModule;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class MobModuleImpl implements MobModule {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public static final List<String> LJFF;
    public ShortVideoContext LIZ;
    public Bundle LIZIZ;
    public final C0MGN LIZJ = new C0MGN(this);
    public String LIZLLL = "";

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(MobModuleImpl.class, "isFromMainCover", "isFromMainCover()Z", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LJFF = C1697810uHb.LJIIJJI("video_shoot_page", "aime_hub", "aime_generated_page", "video_edit_page");
    }

    @Override // com.ss.android.ugc.aweme.aime.MobModule
    public final boolean LIZIZ() {
        C0MGN c0mgn = this.LIZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJ;
        Bundle bundle = c0mgn.LL.LIZIZ;
        return Boolean.valueOf(bundle != null ? bundle.getBoolean("is_main_cover", false) : false).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.aime.MobModule
    public final String getEnterFrom() {
        String str;
        ShortVideoContext shortVideoContext = this.LIZ;
        return (shortVideoContext == null || (str = shortVideoContext.enterFrom) == null || !LJFF.contains(str)) ? "video_shoot_page" : str;
    }

    @Override // com.ss.android.ugc.aweme.aime.MobModule
    public final String LIZLLL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.aime.MobModule
    public final void LIZ(boolean z) {
        C0MGN c0mgn = this.LIZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJ;
        Bundle bundle = c0mgn.LL.LIZIZ;
        if (bundle != null) {
            bundle.putBoolean("is_main_cover", z);
        }
    }

    @Override // com.ss.android.ugc.aweme.aime.MobModule
    public final void LIZJ(String str) {
        this.LIZLLL = str;
    }
}
