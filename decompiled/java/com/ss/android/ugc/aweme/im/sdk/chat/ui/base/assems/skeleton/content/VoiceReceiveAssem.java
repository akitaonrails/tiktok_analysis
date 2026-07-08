package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content;

import X.AnonymousClass0956;
import X.C09AE;
import X.C0GU0;
import X.C0ZXC;
import X.C0ZXF;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXU;
import X.C0ZXX;
import X.C2441009hQ;
import X.C389930FQp;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C724270Sb3;
import X.C814420VxA;
import X.C898900ZOe;
import X.C901200ZXa;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class VoiceReceiveAssem extends VoiceAssem {
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final C0ZXF Aq() {
        int iLJI;
        int iIp;
        int iIp2;
        int iIp3;
        int iIp4;
        int iIp5;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C901200ZXa c901200ZXaLIZ = null;
        C0ZXL c0zxl = ((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJII().LIZJ;
        if (c0zxl instanceof C0ZXU) {
            View view = (View) this.LLJL.getValue();
            C0ZXU c0zxu = (C0ZXU) c0zxl;
            if (Intrinsics.LJFF(view != null ? view.getTag(R.id.bot) : null, c0zxu.LIZ.resourceId)) {
                c901200ZXaLIZ = c0zxu.LIZ.LIZ();
            }
        }
        int iIp6 = c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.a1h);
        if (c901200ZXaLIZ != null) {
            iLJI = c901200ZXaLIZ.LJ;
            iIp = c901200ZXaLIZ.LIZLLL;
            iIp2 = 0;
        } else {
            iLJI = C2441009hQ.LJI(0.75f, Ip(R.attr.a1h), Ip(R.attr.zq));
            iIp = Ip(R.attr.a1h);
            iIp2 = Ip(R.attr.zq);
        }
        int iIp7 = c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.a1h);
        if (c901200ZXaLIZ != null) {
            iIp3 = c901200ZXaLIZ.LIZ;
            iIp4 = c901200ZXaLIZ.LIZJ;
            iIp5 = c901200ZXaLIZ.LIZ;
        } else {
            iIp3 = Ip(R.attr.a03);
            iIp4 = Ip(R.attr.a1j);
            iIp5 = Ip(R.attr.a03);
        }
        return new C0ZXF(iIp6, iLJI, iIp, iIp2, iIp7, iIp3, iIp4, iIp5, c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.a1h));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final C0ZXF qq() {
        int iIp;
        int iLJI;
        int iIp2;
        int iIp3;
        int iIp4;
        int iIp5;
        int iIp6;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C901200ZXa c901200ZXaLIZ = null;
        C0ZXL c0zxl = ((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJII().LIZJ;
        if (c0zxl instanceof C0ZXU) {
            View view = (View) this.LLJL.getValue();
            C0ZXU c0zxu = (C0ZXU) c0zxl;
            if (Intrinsics.LJFF(view != null ? view.getTag(R.id.bot) : null, c0zxu.LIZ.resourceId)) {
                c901200ZXaLIZ = c0zxu.LIZ.LIZ();
            }
        }
        if (c901200ZXaLIZ != null) {
            iIp = c901200ZXaLIZ.LIZLLL;
            iLJI = c901200ZXaLIZ.LJ;
            iIp2 = c901200ZXaLIZ.LIZLLL;
        } else {
            iIp = Ip(R.attr.a1j);
            iLJI = C2441009hQ.LJI(0.75f, Ip(R.attr.a1j), Ip(R.attr.zq));
            iIp2 = Ip(R.attr.a1j);
        }
        if (c901200ZXaLIZ != null) {
            iIp3 = c901200ZXaLIZ.LIZLLL;
            iIp4 = c901200ZXaLIZ.LIZ;
        } else {
            iIp3 = Ip(R.attr.a1h);
            iIp4 = Ip(R.attr.zo);
        }
        if (c901200ZXaLIZ != null) {
            iIp5 = c901200ZXaLIZ.LIZ;
            iIp6 = c901200ZXaLIZ.LIZJ;
        } else {
            iIp5 = Ip(R.attr.a03);
            iIp6 = Ip(R.attr.a1j);
        }
        return new C0ZXF(iIp, iLJI, iIp2, iIp3, iIp4, iIp5, iIp6, c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZ : Ip(R.attr.a03), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.a1h));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final void Qp(C0ZXF c0zxf) {
        int i = c0zxf.LIZLLL;
        Float fValueOf = Float.valueOf(12.0f);
        if (i == 0) {
            View view = (View) this.LLLFZ.getValue();
            C389930FQp c389930FQp = new C389930FQp(C418440Gaw.LIZIZ(fValueOf), c0zxf.LJ);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_play_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            view.setBackground(new C0GU0(c389930FQp, c419910GdJ.LIZ(getContentView().getContext())));
            View view2 = (View) this.LLLI.getValue();
            C389930FQp c389930FQp2 = new C389930FQp(C418440Gaw.LIZIZ(fValueOf), c0zxf.LJ);
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_pause_fill;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            view2.setBackground(new C0GU0(c389930FQp2, c419910GdJ2.LIZ(getContentView().getContext())));
            return;
        }
        View view3 = (View) this.LLLFZ.getValue();
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_play_fill;
        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ3.LIZLLL = Integer.valueOf(c0zxf.LIZLLL);
        view3.setBackground(C426750GoL.LJIILIIL(c419910GdJ3.LIZ(getContentView().getContext()), new C389930FQp(C418440Gaw.LIZIZ(fValueOf), c0zxf.LJ)));
        View view4 = (View) this.LLLI.getValue();
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZ = R.raw.icon_pause_fill;
        c419910GdJ4.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ4.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ4.LIZLLL = Integer.valueOf(c0zxf.LIZLLL);
        view4.setBackground(C426750GoL.LJIILIIL(c419910GdJ4.LIZ(getContentView().getContext()), new C389930FQp(C418440Gaw.LIZIZ(fValueOf), c0zxf.LJ)));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final void tp(C0ZXS c0zxs, boolean z) {
        boolean z2;
        super.tp(c0zxs, z);
        if (z && !(c0zxs.LIZJ instanceof C0ZXU)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C09AE c09ae = this.LLLJL;
        AnonymousClass0956 anonymousClass0956LJII = null;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (iIMMessageBubbleService != null) {
            anonymousClass0956LJII = iIMMessageBubbleService.LJII(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL, c0zxs, z2, LifecycleOwnerKt.getLifecycleScope(this), new AwS558S0100000_14(this, 799), new AwS593S0100000_14(this, 93), C0ZXX.LIZ);
        }
        this.LLLJL = anonymousClass0956LJII;
    }
}
