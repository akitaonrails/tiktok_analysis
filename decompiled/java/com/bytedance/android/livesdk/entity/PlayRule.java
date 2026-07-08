package com.bytedance.android.livesdk.entity;

import X.C20357914lF;
import X.C20358314lJ;
import X.C20358614lM;
import X.C20359914lZ;
import X.C20361214lm;
import X.C20361314ln;
import X.C20362514lz;
import X.C20368314mv;
import X.C20424814w2;
import X.C334801Rq;
import X.InterfaceC20354714kj;
import X.InterfaceC20356214ky;
import X.InterfaceC20357214l8;
import X.InterfaceC20357514lB;
import X.InterfaceC20357614lC;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS432S0200000_31;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public interface PlayRule {
    Playbook LIZ();

    void LIZIZ(DataChannel dataChannel);

    void LIZJ(InterfaceC20357614lC interfaceC20357614lC);

    C20361314ln LIZLLL(C20424814w2 c20424814w2, String str);

    void LJ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context);

    void LJFF(C20361214lm c20361214lm);

    void LJI(Function2 function2);

    void LJII(InterfaceC20354714kj interfaceC20354714kj);

    void LJIIIIZZ(C20361214lm c20361214lm, AwS432S0200000_31 awS432S0200000_31);

    void LJIIIZ(C20358614lM c20358614lM);

    void LJIIJ();

    void LJIIJJI(String str);

    List<C20368314mv> LJIIL(C20361214lm c20361214lm);

    void LJIILIIL(String str);

    void LJIILJJIL();

    void LJIILL(C20359914lZ c20359914lZ);

    void LJIILLIIL(String str);

    void LJIIZILJ(C20361214lm c20361214lm, boolean z, boolean z2, Function0<Unit> function0);

    void LJIJ();

    void LJIJI(WeakReference<Context> weakReference);

    boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z);

    void LJIJJLI(C20358314lJ c20358314lJ);

    void LJIL();

    void LJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3);

    void LJJI(InterfaceC20357214l8 interfaceC20357214l8);

    void LJJIFFI(InterfaceC20357514lB interfaceC20357514lB);

    void LJJII();

    void LJJIII(C20361214lm c20361214lm);

    void LJJIIJ(Playbook playbook);

    void LJJIIJZLJL(InterfaceC20356214ky interfaceC20356214ky);

    void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner);

    void LJJIIZI(C20424814w2 c20424814w2);

    void LJJIJ();

    void LJJIJIIJI();

    void LJJIJIIJIL(C20362514lz c20362514lz);

    String LJJIJIL();

    boolean LJJIJL(C20361214lm c20361214lm, boolean z);

    void destroy();

    C20357914lF getConfig();

    boolean isRunning();
}
