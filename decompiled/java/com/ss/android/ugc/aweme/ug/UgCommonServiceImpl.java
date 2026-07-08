package com.ss.android.ugc.aweme.ug;

import X.AbstractC1549150qPp;
import X.C0AHR;
import X.C0MZW;
import X.C13LE;
import X.C14MJ;
import X.C14MM;
import X.C15O7;
import X.C1799090wux;
import X.C1909100zmO;
import X.C1909230zmb;
import X.C1909270zmf;
import X.C1909300zmi;
import X.C1909460zmy;
import X.C1913870zu5;
import X.C19252910Tv;
import X.C19259610Wk;
import X.C19261310Xb;
import X.C19261410Xc;
import X.C19261910Xh;
import X.C19335310kh;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C283050B7n;
import X.EnumC1909250zmd;
import X.InterfaceC1063710dmr;
import X.InterfaceC19262510Xn;
import X.InterfaceC2385309Wh;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.ug.appstart.MainActivityHelperAssem;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import com.tiktok.kmp.active.manager.IKMPActiveDaysService;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class UgCommonServiceImpl implements IUgCommonService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final C19719912Dl LJIIL() {
        return C13LE.LIZ(MainActivityHelperAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIJJ() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final long LJI() {
        return new C1909300zmi(EnumC1909250zmd.LIKE).LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LJIIIIZZ() {
        C19261310Xb.LIZ.getClass();
        return C19261310Xb.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIIJ() {
        C1909460zmy.LIZ.getClass();
        C15O7.LJIIIIZZ(500L).LJ(new InterfaceC2385309Wh() { // from class: X.0zmj
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("WallpaperPraiseDialogHelper@6a42.onWallpaperSetSuccess$1");
                C1909460zmy.LIZ.getClass();
                EnumC1909250zmd enumC1909250zmd = EnumC1909250zmd.WALLPAPER;
                C1909300zmi c1909300zmi = new C1909300zmi(enumC1909250zmd);
                C1909230zmb.LIZ.getClass();
                boolean z = false;
                if (!C1909230zmb.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1909250zmd);
                    sbLIZ.append(" :Installation time is less than experiment minimum days");
                    C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else if (c1909300zmi.LJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(enumC1909250zmd);
                    sbLIZ2.append(" not show, isClickedSubmit=true");
                    C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    C2413209cw.LIZ.getClass();
                    IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
                    if (iWallpaperServiceApiLIZ != null && iWallpaperServiceApiLIZ.LJFF()) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - c1909300zmi.LIZJ;
                        TimeUnit timeUnit = TimeUnit.DAYS;
                        if (jCurrentTimeMillis < timeUnit.toMillis(30L)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(enumC1909250zmd);
                            sbLIZ3.append(" not show, It happened in 30 days");
                            C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            long j = c1909300zmi.LJIIIZ;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c1909300zmi.LJIIIZ = jCurrentTimeMillis2;
                            Keva keva = c1909300zmi.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(c1909300zmi.LIZIZ);
                            sbLIZ4.append("key_last_try_show_time");
                            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ4), jCurrentTimeMillis2);
                            if (j == 0) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(enumC1909250zmd);
                                sbLIZ5.append(" not show, first try show time");
                                C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                            } else if (jCurrentTimeMillis2 - j < timeUnit.toMillis(30L)) {
                                C14MJ c14mj = C1909350zmn.LIZ;
                                if (C1909360zmo.LIZ()) {
                                    z = true;
                                }
                            }
                        }
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(enumC1909250zmd);
                        sbLIZ6.append(" not show, not use plugin");
                        C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                C1C7U.LIZIZ("WallpaperPraiseDialogHelper@6a42.onWallpaperSetSuccess$1");
                return boolValueOf;
            }
        }, C15O7.LJI, null).LJ(new InterfaceC2385309Wh() { // from class: X.0zmR
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("WallpaperPraiseDialogHelper@6a42.onWallpaperSetSuccess$2");
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null && ((Boolean) c15o7.LJIIL()).booleanValue()) {
                    C1909230zmb c1909230zmb = C1909230zmb.LIZ;
                    AbstractC1909290zmh abstractC1909290zmh = new AbstractC1909290zmh(activityLJFF) { // from class: X.0zmQ
                        @Override // X.AbstractC1909290zmh
                        public final void LIZJ() {
                            try {
                                C19724912Fj.LIZLLL().LJII(C19296410eQ.LIZIZ.buildFeedbackUrl(C0CLW.LIZIZ.LIZ.getFeedbackConf().getFeHelp(), C2097908Jt.LIZJ(new Pair("feedback_id", "15203"))));
                            } catch (C316660CbA e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }

                        @Override // X.AbstractC1909290zmh
                        public final C1909380zmq LIZLLL() {
                            return new C1909380zmq(this.LIZ.getString(2131858418), this.LIZ.getString(2131858415), this.LIZ.getString(2131858416), this.LIZ.getString(2131858417), this.LIZ.getString(2131828217), "com.zhiliao.musically.livewallpaper");
                        }

                        {
                            EnumC1909250zmd enumC1909250zmd = EnumC1909250zmd.WALLPAPER;
                        }
                    };
                    c1909230zmb.getClass();
                    C1909230zmb.LIZLLL(abstractC1909290zmh);
                }
                C1C7U.LIZIZ("WallpaperPraiseDialogHelper@6a42.onWallpaperSetSuccess$2");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIILL() {
        return Collections.singletonList(C1909100zmO.class);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final long LJIJ() {
        return new C1909300zmi(EnumC1909250zmd.LIKE).LJII;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LJIJI() {
        if (((Boolean) C0AHR.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return ((Boolean) C283050B7n.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final String getMediaSource() {
        C19259610Wk c19259610Wk = C19259610Wk.LIZ;
        return C19259610Wk.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final InterfaceC19262510Xn LJ() {
        return LJIJI() ? C19261410Xc.LJI : new InterfaceC19262510Xn() { // from class: X.0zmw
            @Override // X.InterfaceC19262510Xn
            public final void LIZ() {
            }

            @Override // X.InterfaceC19262510Xn
            public final void LIZIZ(Uri uri, boolean z, long j, boolean z2) {
            }

            @Override // X.InterfaceC19262510Xn
            public final void LIZJ(Uri uri, boolean z, C19261610Xe c19261610Xe, boolean z2, long j, boolean z3) {
            }

            @Override // X.InterfaceC19262510Xn
            public final void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC19262510Xn
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC19262510Xn
            public final void LJFF() {
            }

            @Override // X.InterfaceC19262510Xn
            public final void LJI(EnumC19261510Xd enumC19261510Xd, String str) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final SQLiteDatabase LJIILIIL() {
        return C0MZW.LIZ().LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LJIIZILJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("in_app_updates_switch", true);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LIZIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final C1913870zu5 LIZJ() {
        return C1913870zu5.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final Class<? extends InterfaceC1063710dmr> LJFF() {
        return C1799090wux.class;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final C14MJ LJIIIZ() {
        return C14MJ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final C19261910Xh LJIILJJIL() {
        return C19261910Xh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIILLIIL() {
        C19259610Wk c19259610Wk = C19259610Wk.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LIZ(Context context) {
        this.LIZ = true;
        C14MJ.LIZ.getClass();
        C15O7.LIZJ(C14MM.LL);
        C19252910Tv.LIZIZ.LIZ().LIZ();
        IKMPActiveDaysService iKMPActiveDaysService = (IKMPActiveDaysService) PluggableExtentionKt.pluggableSpi$default(IKMPActiveDaysService.class, false, false, false, 14, null);
        if (iKMPActiveDaysService != null) {
            iKMPActiveDaysService.LIZ("settings");
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIJJLI(Activity activity) {
        C1909230zmb.LIZ.getClass();
        C15O7.LJIIIIZZ(300L).LJ(new C19335310kh(activity, 10), C15O7.LJI, null).LJ(new C19335310kh(activity, 11), C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIL(C19EG c19eg) {
        C1909230zmb.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1909250zmd.LIKE);
        sbLIZ.append(" :conditions not met or not return from 「thumbs-up」list");
        C1909270zmf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c19eg != null) {
            ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLJJLL(c19eg);
        }
    }
}
