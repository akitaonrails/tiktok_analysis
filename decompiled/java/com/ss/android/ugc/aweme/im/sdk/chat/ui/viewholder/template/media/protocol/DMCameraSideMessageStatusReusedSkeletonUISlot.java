package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C01GW;
import X.C09KK;
import X.C09KS;
import X.C0I6Y;
import X.C0OPV;
import X.C0PEM;
import X.C0ZDX;
import X.C1383370m6R;
import X.C1898507c7;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C278890AwR;
import X.C418440Gaw;
import X.C426320Gne;
import X.C444530Hbv;
import X.C452501pT;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C896400ZEo;
import X.C912060ZqG;
import X.C912070ZqH;
import X.InterfaceC461380I7k;
import X.InterfaceC891770Yyd;
import X.ViewTreeObserverOnGlobalLayoutListenerC441620HTk;
import Y.ACListenerS106S0200000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ForwardOrReply;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LoadingIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DMCameraSideMessageStatusReusedSkeletonUISlot extends SideMessageStatusReusedSkeletonUISlot implements C09KS<C09KK> {
    public boolean LLLILZJ;
    public boolean LLLIZZ;
    public int LLLJIL;
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 969));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(229));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 970));

    @Override // X.C09KS
    public final void Uj(C0OPV c0opv) {
    }

    @Override // X.C09KS
    public final void Z3(C912060ZqG c912060ZqG) {
    }

    @Override // X.C09KS
    public final void l1(C09KK c09kk) {
    }

    @Override // X.C09KS
    public final void m4(String str) {
    }

    @Override // X.C09KS
    public final void rf(C1898507c7 c1898507c7) {
    }

    public final View Jp() {
        return (View) this.LLLILZ.getValue();
    }

    public final void Qp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJJI(this, C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)).getUuid());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        Qp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Qp();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        super.Ap(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.iid);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            C786410Ut5.W5(viewStub, layoutParams);
            viewStub.setLayoutResource(R.layout.cgq);
            ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.nni);
            ViewGroup.LayoutParams layoutParams2 = viewStub2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.W5(viewStub2, layoutParams2);
                viewStub2.setLayoutResource(R.layout.cfg);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // X.C09KS
    public final void onProgress(int i) {
        Object obj;
        if (i >= 0) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C0ZDX.LJJJJ(C0I6Y.LIZ((InterfaceC461380I7k) obj))) {
                this.LLLJIL = Math.min(99, Math.max(this.LLLJIL, C814420VxA.LIZIZ(i * 0.99f)));
                ((C426320Gne) this.LLLJ.getValue()).LIZ(this.LLLJIL, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot
    /* JADX INFO: renamed from: Gp */
    public final void tp(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState) {
        super.tp(c869590Y9l, messageLeftIconState);
        Object obj = null;
        if (Intrinsics.LJFF(messageLeftIconState, ForwardOrReply.INSTANCE)) {
            if (((Number) C278890AwR.LIZ.getValue()).intValue() != 0 && !C896400ZEo.LJIIJ(c869590Y9l) && !C896400ZEo.LJI(c869590Y9l)) {
                C786410Ut5.I7(new ACListenerS106S0200000_2(this, c869590Y9l, 14), Jp());
                C786410Ut5.LJLLLLLL(0, Jp());
                if (!this.LLLIZZ) {
                    this.LLLIZZ = true;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "chat");
                    c2344009Gk.LJIIIIZZ("enter_method", "dm_cell_accessory");
                    C20684815ws.LJIILLIIL("share_to_story_show", c2344009Gk.LIZ);
                }
                if (!this.LLLILZJ) {
                    this.LLLILZJ = true;
                    int i = ((Keva) this.LLLILZLLLI.getValue()).getInt("show_count", 0);
                    if (i <= 1) {
                        C259800zU c259800zU = new C259800zU();
                        View viewJp = Jp();
                        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c259800zU, (C259800zU<List<InterfaceC891770Yyd>>) 1435);
                        Context context = C1383370m6R.LIZ;
                        ViewTreeObserverOnGlobalLayoutListenerC441620HTk viewTreeObserverOnGlobalLayoutListenerC441620HTk = new ViewTreeObserverOnGlobalLayoutListenerC441620HTk(viewJp, awS558S0100000_14);
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C444530Hbv(c259800zU, this, i, viewTreeObserverOnGlobalLayoutListenerC441620HTk, null), 2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(messageLeftIconState, LoadingIcon.INSTANCE)) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) obj);
        if (C0ZDX.LJJJJ(c869590Y9lLIZ)) {
            C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LIZIZ(this, c869590Y9lLIZ.getUuid());
        }
        if (c869590Y9l.getMsgStatus() == 0) {
            onProgress(C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJ(c869590Y9l.getUuid()));
        } else {
            if (c869590Y9l.getMsgStatus() != 1) {
                return;
            }
            onProgress(99);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final /* bridge */ /* synthetic */ void tp(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState) {
        tp(c869590Y9l, messageLeftIconState);
    }
}
