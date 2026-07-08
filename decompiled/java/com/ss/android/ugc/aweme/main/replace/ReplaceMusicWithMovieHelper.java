package com.ss.android.ugc.aweme.main.replace;

import X.AbstractC2238408pq;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C036E;
import X.C0CHQ;
import X.C0DMI;
import X.C0PEM;
import X.C0XQ7;
import X.C10EU;
import X.C1389890mGx;
import X.C1421805hQ;
import X.C1422205hU;
import X.C1510705vl;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C2354709Kn;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1390150mHN;
import X.DialogInterfaceOnDismissListenerC1767806w8;
import X.EnumC20227914Cv;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.IReplaceMusicWithMovieHelperService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class ReplaceMusicWithMovieHelper implements IReplaceMusicWithMovieHelperService, InterfaceC497601wk {
    public static final /* synthetic */ int LLJJJIL = 0;
    public Activity LL;
    public C1510705vl LLILLJJLI;
    public DialogC1390150mHN LLILZIL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public MusicBuzModel LLJILJILJ;
    public MusicModel LLJILLL;
    public final AbstractC2238408pq LLJJIII;
    public AnonymousClass0956 LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public final AwS644S0100000_30 LLJJIJIL;
    public AnonymousClass0956 LLJJJ;
    public String LLILLL = "";
    public String LLILZ = "";
    public final List<String> LLILZLL = new ArrayList();
    public final CreativeInfo LLJJ = C0DMI.LIZIZ(null);
    public final String LLJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.STRIP_MUSIC_PREVIEW, "", true).getAbsolutePath();

    public ReplaceMusicWithMovieHelper() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIII = C2107308Nj.LIZ;
        this.LLJJIJIL = new AwS644S0100000_30(this, 10);
    }

    @Override // X.InterfaceC497601wk
    public final /* bridge */ /* synthetic */ CoroutineContext getCoroutineContext() {
        return this.LLJJIII;
    }

    public static void LIZJ(ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper) {
        DialogC1390150mHN dialogC1390150mHN;
        replaceMusicWithMovieHelper.getClass();
        try {
            AnonymousClass0956 anonymousClass0956 = replaceMusicWithMovieHelper.LLJJIJI;
            Activity activity = null;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            AnonymousClass0956 anonymousClass09562 = replaceMusicWithMovieHelper.LLJJIJIIJIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            C1510705vl c1510705vl = replaceMusicWithMovieHelper.LLILLJJLI;
            if (c1510705vl != null && c1510705vl.LIZIZ) {
                Activity activity2 = replaceMusicWithMovieHelper.LL;
                if (activity2 != null) {
                    activity = activity2;
                }
                activity.finish();
            }
            DialogC1390150mHN dialogC1390150mHN2 = replaceMusicWithMovieHelper.LLILZIL;
            if (dialogC1390150mHN2 != null && dialogC1390150mHN2.isShowing() && (dialogC1390150mHN = replaceMusicWithMovieHelper.LLILZIL) != null) {
                dialogC1390150mHN.dismiss();
                C785410UrT.LIZ(dialogC1390150mHN);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C14D8
            if (r0 == 0) goto L6d
            r7 = r13
            X.14D8 r7 = (X.C14D8) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r1 = r7.LLILZ
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r6 = 1
            if (r0 == 0) goto L5e
            if (r0 != r6) goto L76
            long r2 = r7.LLILLJJLI
            int r5 = r7.LL
            X.12DN r4 = r7.LLILLL
            X.C155000ia.LIZIZ(r1)
        L28:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            float r9 = (float) r0
            float r0 = (float) r5
            float r9 = r9 / r0
            r0 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = X.C13LZ.LIZLLL(r9, r0, r11)
            float r9 = r4.getInterpolation(r10)
            X.0mHN r1 = r12.LLILZIL
            if (r1 == 0) goto L49
            r0 = 1117650944(0x429e0000, float:79.0)
            float r9 = r9 * r0
            r0 = 1101004800(0x41a00000, float:20.0)
            float r9 = r9 + r0
            r0 = 0
            r1.LJJLL(r9, r0)
        L49:
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 >= 0) goto L73
            r7.LLILLL = r4
            r7.LL = r5
            r7.LLILLJJLI = r2
            r7.LLILZLL = r6
            r0 = 16
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r8) goto L28
            return r8
        L5e:
            X.C155000ia.LIZIZ(r1)
            long r2 = java.lang.System.currentTimeMillis()
            X.12DN r4 = new X.12DN
            r4.<init>()
            r5 = 10000(0x2710, float:1.4013E-41)
            goto L28
        L6d:
            X.14D8 r7 = new X.14D8
            r7.<init>(r12, r13)
            goto L12
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper.LJ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.tools.IReplaceMusicWithMovieHelperService
    public final void LIZ(Activity activity, C1510705vl c1510705vl) {
        this.LL = activity;
        this.LLILLJJLI = c1510705vl;
    }

    public final void LIZLLL(Aweme aweme, long j) {
        C23250099c.LIZLLL(this, null, null, new C1422205hU(this, aweme, j, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.tools.IReplaceMusicWithMovieHelperService
    public final void LIZIZ(final String str, String str2, String str3) {
        if (this.LL != null && this.LLILLJJLI != null) {
            this.LLILLL = str2;
            this.LLILZ = str3;
            if (C10EU.LJIIIIZZ()) {
                return;
            }
            Activity activity = null;
            if (!C2354709Kn.LJIIZILJ()) {
                Activity activity2 = this.LL;
                if (activity2 == null) {
                    activity2 = null;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                c1389890mGx.LJIIIZ(2131847055);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (C2354709Kn.LJIILL() < 20971520) {
                Activity activity3 = this.LL;
                if (activity3 == null) {
                    activity3 = null;
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(activity3);
                c1389890mGx2.LJIIIZ(2131847055);
                c1389890mGx2.LJIIJJI();
                return;
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            try {
                if (C036E.LIZ.LIZIZ()) {
                    CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                    if (creativeToolsPluginService != null) {
                        Activity activity4 = this.LL;
                        if (activity4 == null) {
                            activity4 = null;
                        }
                        if (creativeToolsPluginService.LIZJ(activity4, this.LLILLL, true)) {
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            Activity activity5 = this.LL;
                            if (activity5 == null) {
                                activity5 = null;
                            }
                            DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(activity5);
                            Activity activity6 = this.LL;
                            if (activity6 == null) {
                                activity6 = null;
                            }
                            dialogC1390150mHN.LJJLJLI(activity6.getString(2131857888));
                            dialogC1390150mHN.LJJLIIJ(false);
                            dialogC1390150mHN.LJJLJ(false);
                            dialogC1390150mHN.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.0mFe
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    IReplaceMusicDownloadService iReplaceMusicDownloadService;
                                    IDownloadService iDownloadService;
                                    C1383560m6k.LIZ.getClass();
                                    Integer num = C1383560m6k.LIZJ;
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        IDownloadService iDownloadService2 = C1383560m6k.LIZIZ;
                                        if (iDownloadService2 != null && iDownloadService2.isDownloading(iIntValue) && (iDownloadService = C1383560m6k.LIZIZ) != null) {
                                            iDownloadService.cancel(iIntValue);
                                        }
                                    }
                                    if (this.LL.LLJJIJI != null && (iReplaceMusicDownloadService = (IReplaceMusicDownloadService) PluggableExtentionKt.pluggableSpi$default(IReplaceMusicDownloadService.class, false, false, false, 14, null)) != null) {
                                        iReplaceMusicDownloadService.LJFF(2, System.currentTimeMillis() - jCurrentTimeMillis, null, str);
                                    }
                                    ReplaceMusicWithMovieHelper.LIZJ(this.LL);
                                }
                            });
                            dialogC1390150mHN.setOnDismissListener(new DialogInterfaceOnDismissListenerC1767806w8(this, 6));
                            C786410Ut5.K4(dialogC1390150mHN);
                            dialogC1390150mHN.LJJLL(20.0f, false);
                            this.LLILZIL = dialogC1390150mHN;
                            C786410Ut5.K4(dialogC1390150mHN);
                            this.LLJJIJI = C23250099c.LIZLLL(this, C0PEM.LIZJ, null, new C1421805hQ(this, str, str2, jCurrentTimeMillis, null), 2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Activity activity7 = this.LL;
            if (activity7 != null) {
                activity = activity7;
            }
            C1389890mGx c1389890mGx3 = new C1389890mGx(activity);
            c1389890mGx3.LJIIIZ(2131837963);
            c1389890mGx3.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r10, long r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, long, X.05Vn):java.lang.Object");
    }
}
