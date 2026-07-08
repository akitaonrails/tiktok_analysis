package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent;

import X.C01GW;
import X.C1369010ljH;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C19Y3;
import X.C20514415Pa;
import X.C20632315oP;
import X.C339190DRl;
import X.C397901gf;
import X.C452501pT;
import X.InterfaceC1206470hV7;
import X.InterfaceC20516715Px;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventGuestShareDialog;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.sharer.model.MultiGuestLiveEventRegisteredUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveEventGuestShareDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGs/HELIOSIS4hLWs5IGE/ITMpLDk2JjFiBSYlLQA6LCEnDzApOjsAICQ+LAs6KSkjLg==";
    public final Activity LL;
    public final SharePackage LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public Pair<? extends List<Long>, ? extends List<MultiGuestLiveEventRegisteredUser>> LLILZIL;
    public View LLILZLL;
    public final boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C1369010ljH LLJILJIL;

    public final void NR() {
        C20632315oP c20632315oPMR;
        C339190DRl.LIZIZ((View) this.LLJIJIL.getValue());
        C339190DRl.LIZLLL(MR());
        C20632315oP c20632315oPMR2 = MR();
        if (c20632315oPMR2 != null) {
            c20632315oPMR2.setOffscreenPageLimit(1);
        }
        this.LLJILJIL = new C1369010ljH(this, this.LLILLJJLI, this.LLILLL, this.LLILZIL, this.LLILZ);
        C20632315oP c20632315oPMR3 = MR();
        if (c20632315oPMR3 != null) {
            C1369010ljH c1369010ljH = this.LLJILJIL;
            if (c1369010ljH != null) {
                List<MultiGuestLiveEventRegisteredUser> second = this.LLILZIL.getSecond();
                if (second == null || second.size() <= 0) {
                    C339190DRl.LIZIZ((View) this.LLJ.getValue());
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(0);
                    ((ArrayList) c1369010ljH.LLJILLL).clear();
                    ((ArrayList) c1369010ljH.LLJILLL).addAll(listLJIILJJIL);
                    c1369010ljH.notifyDataSetChanged();
                    c1369010ljH.notifyDataSetChanged();
                } else {
                    C339190DRl.LIZLLL((View) this.LLJ.getValue());
                    List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(0, 1);
                    ((ArrayList) c1369010ljH.LLJILLL).clear();
                    ((ArrayList) c1369010ljH.LLJILLL).addAll(listLJIILJJIL2);
                    c1369010ljH.notifyDataSetChanged();
                    c1369010ljH.notifyDataSetChanged();
                }
            } else {
                c1369010ljH = null;
            }
            c20632315oPMR3.setAdapter(c1369010ljH);
        }
        if (this.LLILZ > 0) {
            C20632315oP c20632315oPMR4 = MR();
            if (c20632315oPMR4 != null) {
                c20632315oPMR4.LJ(1, false);
            }
        } else {
            C20632315oP c20632315oPMR5 = MR();
            if (c20632315oPMR5 != null) {
                c20632315oPMR5.LJ(0, false);
            }
        }
        C19Y3 c19y3 = (C19Y3) this.LLJ.getValue();
        if (c19y3 != null) {
            c19y3.LIZIZ(new InterfaceC20516715Px() { // from class: X.0m3S
                @Override // X.InterfaceC20516715Px
                public final void LIZ(C19Y5 c19y5) {
                }

                @Override // X.InterfaceC20516715Px
                public final void LIZIZ(C19Y5 c19y5) {
                }

                @Override // X.InterfaceC20516715Px
                public final void LIZJ(C19Y5 c19y5) {
                }
            });
        }
        C19Y3 c19y32 = (C19Y3) this.LLJ.getValue();
        if (c19y32 == null || (c20632315oPMR = MR()) == null) {
            return;
        }
        new C20514415Pa(c19y32, c20632315oPMR, true, new InterfaceC1206470hV7() { // from class: X.0m3R
            @Override // X.InterfaceC1206470hV7
            public final void LIZ(C19Y5 c19y5, int i) {
                String string;
                LiveEventGuestShareDialog liveEventGuestShareDialog = this.LIZ;
                if (i != 0) {
                    if (i != 1) {
                        liveEventGuestShareDialog.getClass();
                        string = "";
                    } else {
                        string = liveEventGuestShareDialog.LL.getString(2131852246);
                    }
                } else {
                    string = liveEventGuestShareDialog.LL.getString(2131852245);
                }
                c19y5.LIZIZ(string);
            }
        }).LIZ();
    }

    public final C20632315oP MR() {
        return (C20632315oP) this.LLJI.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.adm);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C397901gf c397901gf = new C397901gf(System.currentTimeMillis(), null, "viewAppeared");
        c397901gf.LLILZ = false;
        C1548820qPI.LIZIZ(c397901gf);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventGuestShareDialog.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public LiveEventGuestShareDialog(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair) {
        Object obj;
        this.LL = activity;
        this.LLILLJJLI = liveEventSharePackage;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = pair;
        boolean z = false;
        if (!liveEventSharePackage.LJIILJJIL() && liveEventSharePackage.extras.containsKey("is_share_live")) {
            try {
                obj = liveEventSharePackage.extras.get("is_share_live");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                z = true;
            }
        }
        this.LLIZ = z;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1594));
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1596));
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1597));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1595));
    }
}
