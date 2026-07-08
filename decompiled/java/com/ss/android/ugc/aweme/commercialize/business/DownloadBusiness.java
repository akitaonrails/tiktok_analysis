package com.ss.android.ugc.aweme.commercialize.business;

import X.C1037520d6c;
import X.C1038730d8Z;
import X.C1039190d9J;
import X.C1041600dDC;
import X.C1AF0;
import X.C786410Ut5;
import android.app.Activity;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DownloadBusiness extends BulletBusinessService.Business {
    public final C1037520d6c LIZIZ;
    public int LIZJ;

    public DownloadBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
        this.LIZIZ = new C1037520d6c();
    }

    public final void LIZ(final WebKitView webKitView) {
        FrameLayout frameLayout;
        final Activity activity = this.LIZ.getActivity();
        final C1038730d8Z c1038730d8Z = null;
        if (activity != null) {
            int i = this.LIZJ;
            if (i == 0) {
                i = R.id.a81;
            }
            frameLayout = (FrameLayout) activity.findViewById(i);
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
        } else {
            frameLayout = null;
        }
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if (c1041600dDC instanceof C1038730d8Z) {
            c1038730d8Z = (C1038730d8Z) c1041600dDC;
        }
        C1037520d6c c1037520d6c = this.LIZIZ;
        c1037520d6c.getClass();
        if (c1038730d8Z != null) {
            c1037520d6c.LIZ = (String) c1038730d8Z.LJLLILLLL.LIZJ();
            c1038730d8Z.LJJJLIIL.LIZJ();
            c1038730d8Z.LIZJ();
            c1038730d8Z.LJLJJLL.LIZJ();
            c1038730d8Z.LJLJJI.LIZJ();
            c1038730d8Z.LJLJJL.LIZJ();
            if (c1038730d8Z.LJLLLL.LIZJ() != null) {
                c1038730d8Z.LJLLLL.LIZJ().intValue();
            }
            c1038730d8Z.LJLJL.LIZJ();
            if (c1038730d8Z.LJLLLLLL.LIZJ() != null) {
                c1038730d8Z.LJLLLLLL.LIZJ().intValue();
            }
            c1038730d8Z.LJZ.getClass();
            try {
                new JSONObject((String) c1038730d8Z.LJZI.LIZJ());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            c1038730d8Z.LJLLL.LIZJ();
            try {
                CastLongProtector.parseLong(c1037520d6c.LIZ);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
        }
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0d8c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        if (webKitView != null) {
            webKitView.setDownloadListener(new DownloadListener() { // from class: X.0d8a
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    long jLongValue;
                    String strLIZJ;
                    C1028030crJ c1028030crJ;
                    C1028040crK c1028040crK;
                    Long lLIZJ;
                    String url = webKitView.getUrl();
                    Activity activity2 = activity;
                    C1038730d8Z c1038730d8Z2 = c1038730d8Z;
                    if (c1038730d8Z2 != null && (c1028040crK = c1038730d8Z2.LJJLL) != null && (lLIZJ = c1028040crK.LIZJ()) != null) {
                        jLongValue = lLIZJ.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    C1038730d8Z c1038730d8Z3 = c1038730d8Z;
                    if (c1038730d8Z3 != null) {
                        strLIZJ = c1038730d8Z3.LIZJ();
                    } else {
                        strLIZJ = null;
                    }
                    JSONObject jSONObjectLIZIZ = C849860XVo.LIZIZ(jLongValue, activity2, strLIZJ, str, url, webKitView.getUrl());
                    C1038730d8Z c1038730d8Z4 = c1038730d8Z;
                    if (c1038730d8Z4 != null && (c1028030crJ = c1038730d8Z4.LJLLI) != null) {
                        Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE);
                    }
                    this.getClass();
                    C849860XVo.LIZJ(activity, str, str2, str3, str4, jSONObjectLIZIZ, new InterfaceC849870XVp() { // from class: X.0d8b
                        @Override // X.InterfaceC849870XVp
                        public final void LIZ() {
                        }
                    });
                }
            });
        }
    }
}
