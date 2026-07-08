package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content;

import X.AnonymousClass0956;
import X.C09AE;
import X.C0GU0;
import X.C0ZXC;
import X.C0ZXF;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXU;
import X.C0ZXV;
import X.C0ZXX;
import X.C0ZXY;
import X.C0ZXZ;
import X.C1954807lC;
import X.C2441009hQ;
import X.C389930FQp;
import X.C418440Gaw;
import X.C419910GdJ;
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
public final class VoiceSendAssem extends VoiceAssem {
    public final C0ZXF Iq() {
        int iIp;
        int iIp2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C901200ZXa c901200ZXaLIZ = null;
        C0ZXL c0zxl = ((C0ZXC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJII().LIZJ;
        if (c0zxl instanceof C0ZXY) {
            LJJIJL().getContext();
            iIp = ((C0ZXY) c0zxl).LIZ;
        } else if (c0zxl instanceof C0ZXZ) {
            iIp = ((C0ZXZ) c0zxl).LIZ(LJJIJL().getContext());
        } else if (c0zxl instanceof C0ZXV) {
            iIp = Ip(R.attr.t9);
        } else {
            if (!(c0zxl instanceof C0ZXU)) {
                throw new C1954807lC();
            }
            View view = (View) this.LLJL.getValue();
            C0ZXU c0zxu = (C0ZXU) c0zxl;
            if (Intrinsics.LJFF(view != null ? view.getTag(R.id.bot) : null, c0zxu.LIZ.resourceId)) {
                c901200ZXaLIZ = c0zxu.LIZ.LIZ();
                iIp = 0;
            } else {
                iIp = Ip(R.attr.t9);
            }
        }
        int iLJI = C2441009hQ.LJI(0.5f, Ip(R.attr.zi), iIp);
        int iIp3 = c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.zi);
        if (c901200ZXaLIZ != null) {
            iLJI = c901200ZXaLIZ.LJ;
        }
        int iIp4 = c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.zi);
        if (c901200ZXaLIZ == null) {
            iIp2 = Ip(R.attr.zi);
        } else {
            iIp = 0;
            iIp2 = c901200ZXaLIZ.LIZLLL;
        }
        return new C0ZXF(iIp3, iLJI, iIp4, iIp, iIp2, c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZ : Ip(R.attr.zj), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZJ : Ip(R.attr.zl), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZ : Ip(R.attr.zj), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : Ip(R.attr.zi));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final C0ZXF Aq() {
        return Iq();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final C0ZXF qq() {
        return Iq();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem
    public final void Qp(C0ZXF c0zxf) {
        View view = (View) this.LLLFZ.getValue();
        Float fValueOf = Float.valueOf(12.0f);
        C389930FQp c389930FQp = new C389930FQp(C418440Gaw.LIZIZ(fValueOf), c0zxf.LJ);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_play_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LJ = numValueOf;
        view.setBackground(new C0GU0(c389930FQp, c419910GdJ.LIZ(getContentView().getContext())));
        View view2 = (View) this.LLLI.getValue();
        C389930FQp c389930FQp2 = new C389930FQp(C418440Gaw.LIZIZ(fValueOf), c0zxf.LJ);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_pause_fill;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        c419910GdJ2.LJ = numValueOf;
        view2.setBackground(new C0GU0(c389930FQp2, c419910GdJ2.LIZ(getContentView().getContext())));
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
        AnonymousClass0956 anonymousClass0956LIZ = null;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (iIMMessageBubbleService != null) {
            anonymousClass0956LIZ = iIMMessageBubbleService.LIZ(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL, c0zxs, z2, LifecycleOwnerKt.getLifecycleScope(this), new AwS558S0100000_14(this, 800), new AwS593S0100000_14(this, 94), C0ZXX.LIZ);
        }
        this.LLLJL = anonymousClass0956LIZ;
    }
}
