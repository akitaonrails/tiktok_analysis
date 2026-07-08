package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C0M7Y;
import X.C0WIY;
import X.C1370940lmO;
import X.C1374720lsU;
import X.C1375500ltk;
import X.C1375540lto;
import X.C1377100lwK;
import X.C1377500lwy;
import X.C1377510lwz;
import X.C1377550lx3;
import X.C1377600lx8;
import X.C1383460m6a;
import X.C621180OYa;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RemoteImageSharePackage extends LinkDefaultSharePackage {
    public static final C1377100lwK Companion = new C1377100lwK();
    public String imageUrl;

    public RemoteImageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(final InterfaceC1369790lkX interfaceC1369790lkX, final Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) throws Throwable {
        C621180OYa.LIZIZ.LJJLI(1, interfaceC1369790lkX.key(), "others_video_share_list");
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (SettingsManager.LIZ("web_image_downloader_switch", false)) {
            C0WIY c0wiyLIZ = new C1383460m6a(new WeakReference(context)).LIZ(this.imageUrl, new C1377550lx3(C1375500ltk.LJII(context)));
            if (Intrinsics.LJFF(c0wiyLIZ.LIZ, Boolean.TRUE) && c0wiyLIZ.LIZIZ != 0) {
                C1375540lto c1375540lto = new C1375540lto(C1374720lsU.LJFF(context, (String) c0wiyLIZ.LIZIZ), null, null, null, null, false, 252);
                if (interfaceC1369790lkX.LJIILLIIL(context, c1375540lto)) {
                    interfaceC1369790lkX.LJJIIJ(c1375540lto, context, null);
                    return false;
                }
                new C1377600lx8(C1374720lsU.LIZIZ().getString(2131835641)).LJJJIL(c1375540lto, context, null);
                return false;
            }
        } else {
            final Activity activityLJII = C1375500ltk.LJII(context);
            if (activityLJII != null) {
                new C1377500lwy(new WeakReference(context)).LIZ(this.imageUrl, new C1377510lwz(activityLJII, interfaceC1369790lkX, context) { // from class: X.0lwx
                    public final /* synthetic */ Activity LIZJ;
                    public final /* synthetic */ InterfaceC1369790lkX LIZLLL;
                    public final /* synthetic */ Context LJ;

                    @Override // X.InterfaceC1377560lx4
                    public final void LIZIZ(Uri uri) {
                        DialogC1389620mGW dialogC1389620mGW = this.LIZIZ;
                        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
                            dialogC1389620mGW.dismiss();
                            C785410UrT.LIZ(dialogC1389620mGW);
                        }
                        if (uri != null) {
                            Activity activity = this.LIZJ;
                            InterfaceC1369790lkX interfaceC1369790lkX2 = this.LIZLLL;
                            Context context2 = this.LJ;
                            C09N5.LIZ(activity, uri);
                            C1375540lto c1375540lto2 = new C1375540lto(uri, null, null, null, null, false, 252);
                            if (interfaceC1369790lkX2.LJIILLIIL(context2, c1375540lto2)) {
                                interfaceC1369790lkX2.LJJIIJ(c1375540lto2, context2, null);
                            } else {
                                new C1377600lx8(C1374720lsU.LIZIZ().getString(2131835641)).LJJJIL(c1375540lto2, context2, null);
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(activityLJII);
                        this.LIZJ = activityLJII;
                        this.LIZLLL = interfaceC1369790lkX;
                        this.LJ = context;
                    }
                });
            }
        }
        return false;
    }
}
