package com.ss.android.ugc.aweme.device;

import X.AbstractC19484711Kz;
import X.C0CCZ;
import X.C0VZ0;
import X.C11S5;
import X.C153R;
import X.C153S;
import X.C20595715iV;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC19474811He;
import Y.ACallableS434S0100000_31;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.player.IPlayerUtilsService;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class DeviceInfoReportTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DeviceInfoReportTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C153S.LIZ) {
            C844470XAv.LIZ.getClass();
            final Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                Keva keva = C153R.LIZ;
                long j = keva.getLong("KEVA_KEY_TIME_DeviceInfoReporter", 0L);
                IPlayerUtilsService iPlayerUtilsService = (IPlayerUtilsService) PluggableExtentionKt.pluggableSpi(IPlayerUtilsService.class);
                if (j != 0 && iPlayerUtilsService != null && iPlayerUtilsService.LIZ(j)) {
                    return;
                }
                keva.storeLong("KEVA_KEY_TIME_DeviceInfoReporter", new Date().getTime());
                AbstractC19484711Kz.LJIJI(new ACallableS434S0100000_31(contextLIZ, 12)).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LIZ(new InterfaceC19474811He<C20595715iV>() { // from class: X.15iU
                    @Override // X.InterfaceC19474811He
                    public final void onError(Throwable th) {
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onSuccess(C20595715iV c20595715iV) {
                        String str;
                        String str2;
                        int i;
                        int i2;
                        boolean z;
                        String str3;
                        String str4;
                        String str5;
                        int iLIZIZ;
                        int iLIZ;
                        C20595715iV c20595715iV2 = c20595715iV;
                        C0WYM c0wym = c20595715iV2.LIZ;
                        C0WYL c0wyl = c20595715iV2.LIZIZ;
                        C0WYK c0wyk = c20595715iV2.LIZJ;
                        C20595915iX c20595915iX = c20595715iV2.LIZLLL;
                        C20595815iW c20595815iW = c20595715iV2.LJ;
                        Bundle bundle = new Bundle();
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ2 = C844470XAv.LIZ();
                        if (contextLIZ2 != null) {
                            DisplayMetrics displayMetrics = contextLIZ2.getResources().getDisplayMetrics();
                            C1389350mG5 c1389350mG5LIZIZ = C1389340mG4.LIZIZ();
                            if (Build.VERSION.SDK_INT >= 34) {
                                iLIZIZ = (int) TypedValue.deriveDimension(1, c1389350mG5LIZIZ.LIZIZ, displayMetrics);
                                iLIZ = (int) TypedValue.deriveDimension(1, c1389350mG5LIZIZ.LIZJ, displayMetrics);
                            } else {
                                iLIZIZ = c1389350mG5LIZIZ.LIZIZ();
                                iLIZ = c1389350mG5LIZIZ.LIZ();
                            }
                            bundle.putInt("screen_width_dp", Math.min(iLIZIZ, iLIZ));
                            bundle.putInt("screen_height_dp", Math.max(iLIZIZ, iLIZ));
                            AppLog.setCustomerHeader(bundle);
                        }
                        if (((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIILL()) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        ICreativeForwardService iCreativeForwardService = (ICreativeForwardService) PluggableExtentionKt.pluggableSpi(ICreativeForwardService.class);
                        if (iCreativeForwardService != null && iCreativeForwardService.onThisDayCanScanAlbum()) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("cpu_vendor", c0wym.LIZ);
                        c2344009Gk.LIZJ(c0wym.LIZJ, "cpu_core_nums");
                        c2344009Gk.LIZJ(c0wym.LIZIZ, "cpu_freq");
                        c2344009Gk.LIZJ(c0wyl.LIZ, "screen_dpi");
                        c2344009Gk.LIZJ(c0wyl.LIZIZ, "screen_width");
                        c2344009Gk.LIZJ(c0wyl.LIZJ, "screen_height");
                        c2344009Gk.LIZLLL(c0wyk.LJ, "app_storage_size");
                        c2344009Gk.LIZLLL(c0wyk.LIZIZ, "storage_total_external_size");
                        c2344009Gk.LIZLLL(c0wyk.LIZ, "storage_available_external_size");
                        c2344009Gk.LIZLLL(c0wyk.LIZLLL, "storage_total_internal_size");
                        c2344009Gk.LIZLLL(c0wyk.LIZJ, "storage_available_internal_size");
                        c2344009Gk.LIZLLL(c0wyk.LJIIIIZZ, "storage_app_size");
                        c2344009Gk.LIZLLL(c0wyk.LJIIIZ, "storage_data_size");
                        c2344009Gk.LIZLLL(c0wyk.LJIIJ, "storage_cache_size");
                        c2344009Gk.LIZLLL(c0wyk.LIZ(), "total_storage_size");
                        c2344009Gk.LIZLLL(c20595915iX.LIZ, "memory_total_size");
                        c2344009Gk.LIZLLL(c20595915iX.LIZIZ, "memory_available_size");
                        String str6 = Build.BRAND;
                        c2344009Gk.LJIIIIZZ("brand", str6);
                        c2344009Gk.LJIIIIZZ("os_version", Build.VERSION.RELEASE);
                        c2344009Gk.LIZJ(Build.VERSION.SDK_INT, "os_api_level");
                        c2344009Gk.LJIIIIZZ("Board", Build.BOARD);
                        c2344009Gk.LJIIIIZZ("brand", str6);
                        c2344009Gk.LJIIIIZZ("device", Build.DEVICE);
                        c2344009Gk.LJIIIIZZ("hardware", Build.HARDWARE);
                        c2344009Gk.LJIIIIZZ("manufacturer", Build.MANUFACTURER);
                        c2344009Gk.LJIIIIZZ("model", Build.MODEL);
                        c2344009Gk.LJIIIIZZ("product", Build.PRODUCT);
                        String[] strArr = Build.SUPPORTED_ABIS;
                        String strLIZIZ = "";
                        if (strArr != null) {
                            for (String str7 : strArr) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLIZIZ);
                                sbLIZ.append(str7);
                                sbLIZ.append("_");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                        c2344009Gk.LJIIIIZZ("abis", strLIZIZ);
                        c2344009Gk.LIZLLL(Build.TIME, "build_time");
                        if (C14LC.LJIILLIIL == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c2344009Gk.LIZJ(i, "is_transparent_bar");
                        if (C746350TPl.LIZ.LIZJ().LIZ().intValue() == 1) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c2344009Gk.LIZJ(i2, "traffic_economy_mode");
                        c2344009Gk.LIZJ(c0wyk.LJII, "install_on_sdcard");
                        c2344009Gk.LIZIZ(c0wyl.LIZLLL, "screen_xdpi");
                        c2344009Gk.LIZIZ(c0wyl.LJ, "screen_ydpi");
                        c2344009Gk.LIZJ(C1389340mG4.LJ(), "screen_width_dp");
                        c2344009Gk.LIZJ(C1389340mG4.LIZLLL(), "screen_height_dp");
                        double dSqrt = Math.sqrt(Math.pow(c0wyl.LIZIZ / c0wyl.LIZLLL, 2.0d) + Math.pow(c0wyl.LIZJ / c0wyl.LJ, 2.0d));
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("screen_inches", dSqrt);
                        AppLog.setCustomerHeader(bundle2);
                        c2344009Gk.LIZ(dSqrt, "screen_inches");
                        double dSqrt2 = Math.sqrt(Math.pow(((double) c0wyl.LIZIZ) / ((double) c0wyl.LIZ), 2.0d) + Math.pow(((double) c0wyl.LIZJ) / ((double) c0wyl.LIZ), 2.0d));
                        Bundle bundle3 = new Bundle();
                        bundle3.putDouble("screen_inches_v2", dSqrt2);
                        AppLog.setCustomerHeader(bundle3);
                        c2344009Gk.LIZ(dSqrt2, "screen_inches_v2");
                        float f = c0wyl.LIZIZ;
                        float f2 = c0wyl.LJFF;
                        double dMin = Math.min(f / f2, c0wyl.LIZJ / f2);
                        new Bundle().putDouble("screen_sw", dMin);
                        c2344009Gk.LIZ(dMin, "screen_sw");
                        if ((contextLIZ.getResources().getConfiguration().screenLayout & 15) >= 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c2344009Gk.LJ(Boolean.valueOf(z), "is_tablet");
                        C20594815iM.LIZ.getClass();
                        c2344009Gk.LJ(Boolean.valueOf(C20594815iM.LIZ()), "is_tablet_client");
                        C20593115i5 c20593115i5 = C20593115i5.LIZ;
                        int iLJ = C1389340mG4.LJ();
                        int iLJ2 = C1389340mG4.LJ();
                        c20593115i5.getClass();
                        c2344009Gk.LJ(Boolean.valueOf(C20593115i5.LJIIJJI(iLJ, iLJ2)), "is_tablet_de");
                        c2344009Gk.LJ(Boolean.valueOf(C20593115i5.LJIIIIZZ(contextLIZ)), "is_foldable");
                        c2344009Gk.LJ(Boolean.valueOf(C20593115i5.LJII(contextLIZ)), "is_flip");
                        c2344009Gk.LIZJ(c20595815iW.LIZ, "camera_permission_status");
                        c2344009Gk.LIZJ(c20595815iW.LIZIZ, "mic_permission_status");
                        c2344009Gk.LIZJ(c20595815iW.LIZJ, "photo_permission_status");
                        c2344009Gk.LIZJ(c20595815iW.LJ, "upload_permission_video");
                        c2344009Gk.LIZJ(c20595815iW.LIZLLL, "upload_permission_image");
                        c2344009Gk.LIZJ(c20595815iW.LJFF, "upload_permission_status");
                        if (c20595815iW.LJI) {
                            str3 = "on";
                        } else {
                            str3 = "off";
                        }
                        c2344009Gk.LJIIIIZZ("floating_window_system_permission_status", str3);
                        c2344009Gk.LJIIIIZZ("floating_window_permission_status", str);
                        if (((ISettingService) ServiceManager.get().getService(ISettingService.class)).shouldUseFasterPaging()) {
                            str4 = "on";
                        } else {
                            str4 = "off";
                        }
                        c2344009Gk.LJIIIIZZ("fasterscroll_speed_switch_status", str4);
                        c2344009Gk.LJFF("on_this_day_album_authorize_status", str2);
                        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
                        if (c19212010Ec.LJJZZI()) {
                            if (c19212010Ec.LJLLLLLL()) {
                                str5 = "on";
                            } else {
                                str5 = "off";
                            }
                            c2344009Gk.LJFF("creator_inbox_status", str5);
                        }
                        if (c19212010Ec.LJJLIIIJLJLI()) {
                            c2344009Gk.LJFF("activity_classification_status", "1");
                        }
                        AnonymousClass1455.LIZ.getClass();
                        C20278314Wf c20278314Wf = AnonymousClass1455.LJIIJ;
                        long j2 = c0wyk.LIZ + c0wyk.LIZJ;
                        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j4 = j2 / j3;
                        synchronized (c20278314Wf) {
                            try {
                                Keva keva2 = c20278314Wf.LIZ;
                                if (keva2 != null) {
                                    c20278314Wf.LIZLLL = j4;
                                    keva2.storeLong("disk_avail", j4);
                                } else {
                                    c20278314Wf.LJ = j4;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        c20278314Wf.LIZ((c0wyk.LIZIZ + c0wyk.LIZLLL) / j3);
                        C20684815ws.LJIILLIIL("device_info", c2344009Gk.LIZ);
                    }
                });
                C153S.LIZ = true;
            }
        }
    }
}
