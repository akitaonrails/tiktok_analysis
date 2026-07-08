package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.C01GW;
import X.C0BFY;
import X.C0CCZ;
import X.C0CN5;
import X.C0CPH;
import X.C0QSJ;
import X.C0VZ0;
import X.C10UI;
import X.C13LE;
import X.C1581780rGS;
import X.C1581790rGT;
import X.C1618250sDH;
import X.C19EG;
import X.C1BLW;
import X.C2217381BqS;
import X.C2259011DbP;
import X.C2413209cw;
import X.C261110ALd;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C799900VZk;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1146704e9;
import X.InterfaceC2203391BLl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class LegoAssem extends BaseMainPageFragmentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C1618250sDH LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1581790rGT());
    public volatile MainPageBusinessAbility LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LegoAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    public final void bo() {
        C0CCZ c0cczLJIIIIZZ;
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        if (((Boolean) C261110ALd.LIZ.getValue()).booleanValue()) {
            c0cph.LIZ(new DownloadFestivalOptTask(new WeakReference(this.LLILLJJLI)));
        } else {
            c0cph.LIZ(new DownloadFestivalTask());
        }
        if (C10UI.LIZ()) {
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null && iPluginService.LIZLLL() != null) {
                C1BLW.LIZJ("com.ss.android.ugc.aweme.df_wallpaper_main", new InterfaceC2203391BLl() { // from class: X.0rGU
                    @Override // X.InterfaceC2203391BLl
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC2425409eu
                    public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                        abstractC2457909k9.LJII();
                    }
                });
            }
        } else {
            C2413209cw.LIZ.getClass();
            IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
            if (iWallpaperServiceApiLIZ != null && (c0cczLJIIIIZZ = iWallpaperServiceApiLIZ.LJIIIIZZ()) != null) {
                c0cph.LIZ(c0cczLJIIIIZZ);
            }
        }
        c0cph.LIZ(((IMainService) this.LLILLL.getValue()).getMultiProcessMobEventTask());
        c0cph.LIZ(((IMainService) this.LLILLL.getValue()).getObserverTabCheckTask());
        c0cph.LIZIZ();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m141do() {
        long j = C0BFY.LIZ;
        if (j != -1) {
            C0CN5.LIZJ(Long.valueOf(j), new ARunnableS124S0100000_24(this, 10), false);
        } else {
            bo();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LLILLJJLI = new C1618250sDH(c19egLIZ, new C1581780rGS(this));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1618250sDH c1618250sDH = this.LLILLJJLI;
        if (c1618250sDH != null) {
            c1618250sDH.onDestroyView();
        }
        if (((Boolean) C261110ALd.LIZ.getValue()).booleanValue()) {
            this.LLILLJJLI = null;
        }
    }

    public final class DownloadFestivalTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "LegoAssem$DownloadFestivalTask";
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.C0CCZ
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.BOOT_FINISH;
        }

        public DownloadFestivalTask() {
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C1618250sDH c1618250sDH = LegoAssem.this.LLILLJJLI;
            if (c1618250sDH != null) {
                c1618250sDH.LIZ();
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    public final void bg(View view) {
        super.bg(view);
        if (((Boolean) C2259011DbP.LIZIZ.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(new ARunnableS124S0100000_24(this, 11));
        } else {
            m141do();
        }
    }
}
