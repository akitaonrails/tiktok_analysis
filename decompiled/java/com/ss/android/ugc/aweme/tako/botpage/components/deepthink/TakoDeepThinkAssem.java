package com.ss.android.ugc.aweme.tako.botpage.components.deepthink;

import X.C01GW;
import X.C07QJ;
import X.C0DSB;
import X.C0GY8;
import X.C0HXO;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C14S3;
import X.C1558520qew;
import X.C1859250yTz;
import X.C1859260yU0;
import X.C1859280yU2;
import X.C1859290yU3;
import X.C1859300yU4;
import X.C1859370yUB;
import X.C1859620yUa;
import X.C1859900yV2;
import X.C2097608Jq;
import X.C21380418lm;
import X.C21419418s4;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C689230R1t;
import X.C689290R1z;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1859270yU1;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1864690ycl;
import Y.ACListenerS141S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.larus.business.markdown.api.model.CustomSpaceScene;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDeepThinkAssem extends ReusedUISlotAssem<TakoDeepThinkAssem> implements InterfaceC712990Rxx<InterfaceC1859270yU1> {
    public TuxTextView LLJL;
    public C1295960jpS LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public C1859370yUB LLJLLIL;
    public InterfaceC1859270yU1 LLJLLL;
    public boolean LLJZ;
    public ValueAnimator LLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 774));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(176));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkj;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZ()) {
            C0GY8 c0gy8 = (C0GY8) this.LLJZIJLIL.getValue();
            ValueAnimator valueAnimator = c0gy8.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c0gy8.LIZ = null;
            c0gy8.LIZIZ = null;
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZ()) {
            C0GY8 c0gy8 = (C0GY8) this.LLJZIJLIL.getValue();
            ValueAnimator valueAnimator = c0gy8.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c0gy8.LIZ = null;
            c0gy8.LIZIZ = null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0DSB.LIZIZ(LJJIJL());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.erm);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS141S0100000_6(this, 78));
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zhi);
        this.LLJL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(52);
        }
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.b3n);
        Context context = c1295960jpS.getContext();
        boolean z = true;
        if (context != null && C960203pA.LIZIZ(context)) {
            c1295960jpS.setAnimation("social_dm_input_loading_dark_tux_lottie.json");
        } else {
            c1295960jpS.setAnimation("social_dm_input_loading_light_tux_lottie.json");
        }
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setRepeatMode(1);
        this.LLJLIL = c1295960jpS;
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.le9);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.erl);
        if (frameLayout != null) {
            if (C1859620yUa.LIZ()) {
                frameLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
            }
        } else {
            frameLayout = null;
        }
        this.LLJLL = frameLayout;
        C1859370yUB c1859370yUB = (C1859370yUB) view.findViewById(R.id.o01);
        if (c1859370yUB != null) {
            C1859900yV2.LIZIZ.LJFF(c1859370yUB.getContext(), c1859370yUB, 51, R.attr.a1h);
            c1859370yUB.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 5));
        } else {
            c1859370yUB = null;
        }
        this.LLJLLIL = c1859370yUB;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoChatUIAbility.class, null);
        if (takoChatUIAbility == null || !takoChatUIAbility.Gx1()) {
            z = false;
        }
        this.LLJZ = z;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC1859270yU1 interfaceC1859270yU1) {
        InterfaceC1859270yU1 interfaceC1859270yU12 = interfaceC1859270yU1;
        sp(interfaceC1859270yU12);
        this.LLJLLL = interfaceC1859270yU12;
    }

    public final void sp(InterfaceC1859270yU1 interfaceC1859270yU1) {
        boolean z;
        String strLLIIIL;
        boolean z2;
        InterfaceC1859270yU1 interfaceC1859270yU12 = this.LLJLLL;
        if (interfaceC1859270yU12 != null && interfaceC1859270yU12.LJJLIIIJL() == interfaceC1859270yU1.LJJLIIIJL()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        InterfaceC1859270yU1 interfaceC1859270yU13 = this.LLJLLL;
        Boolean boolLJJIL = null;
        if (interfaceC1859270yU13 != null) {
            strLLIIIL = interfaceC1859270yU13.LLIIIL();
        } else {
            strLLIIIL = null;
        }
        boolean z4 = !Intrinsics.LJFF(strLLIIIL, interfaceC1859270yU1.LLIIIL());
        InterfaceC1859270yU1 interfaceC1859270yU14 = this.LLJLLL;
        if (interfaceC1859270yU14 != null) {
            boolLJJIL = interfaceC1859270yU14.LJJIL();
        }
        boolean z5 = !Intrinsics.LJFF(boolLJJIL, interfaceC1859270yU1.LJJIL());
        boolean zLJFF = Intrinsics.LJFF(interfaceC1859270yU1.LJJIL(), Boolean.TRUE);
        InterfaceC1859270yU1 interfaceC1859270yU15 = this.LLJLLL;
        if (interfaceC1859270yU15 != null && interfaceC1859270yU15.LLJJJJ() == interfaceC1859270yU1.LLJJJJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !z2;
        if (interfaceC1859270yU1.LLILIL()) {
            yp(interfaceC1859270yU1, zLJFF, z3, z4, z5, z6);
            return;
        }
        int iLJJLIIIJL = interfaceC1859270yU1.LJJLIIIJL();
        if (iLJJLIIIJL != 1 && iLJJLIIIJL != 2 && iLJJLIIIJL != 4) {
            if (iLJJLIIIJL != 5) {
                C0DSB.LIZIZ(LJJIJL());
                return;
            }
            C0DSB.LIZJ(LJJIJL());
            tp(z6, zLJFF, true, null, z3, z5);
            op(interfaceC1859270yU1.LLIIIL(), z4, zLJFF);
            return;
        }
        InterfaceC1859270yU1 interfaceC1859270yU16 = this.LLJLLL;
        if (interfaceC1859270yU16 != null && interfaceC1859270yU1.LJJLIIIJL() == interfaceC1859270yU16.LJJLIIIJL()) {
            return;
        }
        yp(interfaceC1859270yU1, zLJFF, z3, z4, z5, z6);
    }

    public final void up(boolean z) {
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        if (tuxIconView != null) {
            if (z) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_up;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                tuxIconView.setTuxIcon(c419910GdJ);
            } else {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_down;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                tuxIconView.setTuxIcon(c419910GdJ2);
            }
            C786410Ut5.Fb(tuxIconView, 0.0f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1859270yU1 interfaceC1859270yU1) {
        return true;
    }

    public final void zp(boolean z) {
        Message messageYy1;
        up(z);
        if (this.LLJZ) {
            InterfaceC1859270yU1 interfaceC1859270yU1 = this.LLJLLL;
            if (interfaceC1859270yU1 != null) {
                interfaceC1859270yU1.LLJJIJIIJIL(Boolean.valueOf(z));
                sp(interfaceC1859270yU1);
                return;
            }
            return;
        }
        Message messageLIZLLL = null;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoCardAbility.class, null);
        if (takoCardAbility != null) {
            messageYy1 = takoCardAbility.Yy1();
        } else {
            messageYy1 = null;
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility == null) {
            return;
        }
        if (messageYy1 != null) {
            messageLIZLLL = Message.LIZLLL(messageYy1, null, 0, false, 0, false, null, false, -1, 2097151);
            messageLIZLLL.LJIIIIZZ = Boolean.valueOf(z);
        }
        iMessageAbility.ua2(messageLIZLLL, false, true);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1859270yU1 interfaceC1859270yU1) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }

    public final void op(String str, boolean z, boolean z2) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        C689290R1z c689290R1z;
        if (str != null && str.length() != 0) {
            if (z2) {
                FrameLayout frameLayout = this.LLJLL;
                if (frameLayout != null) {
                    C0DSB.LIZJ(frameLayout);
                }
            } else {
                FrameLayout frameLayout2 = this.LLJLL;
                if (frameLayout2 != null) {
                    C0DSB.LIZIZ(frameLayout2);
                }
            }
            if (z) {
                Message messageYy1 = null;
                TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoCardAbility.class, null);
                if (takoCardAbility != null) {
                    messageYy1 = takoCardAbility.Yy1();
                }
                C1859370yUB c1859370yUB = this.LLJLLIL;
                if (c1859370yUB != null) {
                    C21419418s4 c21419418s4LIZ = C1859250yTz.LIZ(c1859370yUB, C1558520qew.LJIIL(this));
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1859370yUB.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, c1859370yUB.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    C21380418lm c21380418lm = new C21380418lm(iIntValue, iLIZIZ, iIntValue2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, c1859370yUB.getContext());
                    if (numLIZJ3 != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    if (C1859620yUa.LIZ()) {
                        c689290R1z = new C689290R1z(CustomSpaceScene.V2, C2097608Jq.LJIIIIZZ(new Pair(C14S3.V2_SPACE_HEADING_1, 20), new Pair(C14S3.V2_SPACE_HEADING_2, 16), new Pair(C14S3.V2_SPACE_NATURAL_SEGMENT, 8), new Pair(C14S3.V2_SPACE_HEADING_BETWEEN, 8), new Pair(C14S3.V2_SPACE_ITEM_BETWEEN, 4), new Pair(C14S3.V2_SPACE_HEADING_EXTRA_TOP, 4)), 4);
                    } else {
                        CustomSpaceScene customSpaceScene = CustomSpaceScene.V2;
                        Pair[] pairArr = new Pair[6];
                        pairArr[0] = new Pair(C14S3.V2_SPACE_HEADING_1, 20);
                        pairArr[1] = new Pair(C14S3.V2_SPACE_HEADING_2, 16);
                        int i = 12;
                        pairArr[2] = new Pair(C14S3.V2_SPACE_NATURAL_SEGMENT, 12);
                        C14S3 c14s3 = C14S3.V2_SPACE_HEADING_BETWEEN;
                        if (!C1859620yUa.LIZ()) {
                            i = 8;
                        }
                        pairArr[3] = new Pair(c14s3, Integer.valueOf(i));
                        pairArr[4] = new Pair(C14S3.V2_SPACE_ITEM_BETWEEN, 6);
                        pairArr[5] = new Pair(C14S3.V2_SPACE_HEADING_EXTRA_TOP, 4);
                        c689290R1z = new C689290R1z(customSpaceScene, C2097608Jq.LJIIIIZZ(pairArr), 4);
                    }
                    C21419418s4 c21419418s4LIZ2 = C21419418s4.LIZ(c21419418s4LIZ, null, iIntValue3, false, 1.4f, iLIZIZ4, 0, iLIZIZ2, null, null, null, null, null, null, false, c21380418lm, iLIZIZ3, false, false, 0, false, null, null, false, c689290R1z, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -151017985, 16777199);
                    C07QJ.LIZ.getClass();
                    if (C07QJ.LIZ() && ((messageYy1 != null && (messageYy1.LIZIZ == 5 || messageYy1.LIZIZ == 4)) || c1859370yUB.LLJJJJLIIL.LJIIIIZZ)) {
                        C1859370yUB.LJJJJLL(c1859370yUB, null, null, null, null, str, c21419418s4LIZ2, C1859250yTz.LIZJ(C1558520qew.LJIIL(this)), new C689230R1t(C1558520qew.LJIIL(this)), new C1859280yU2(C1558520qew.LJIIL(this)), new C1859260yU0(C1558520qew.LJIIL(this)), new C1859290yU3(C1558520qew.LJIIL(this)), new C1859300yU4(C1558520qew.LJIIL(this)), null, null, 126976);
                    } else {
                        C1859900yV2.LIZIZ.LJIIIIZZ(c1859370yUB, str, c21419418s4LIZ2, new C0HXO(C1558520qew.LJIIL(this), "think"), new C689230R1t(C1558520qew.LJIIL(this)), new C1859280yU2(C1558520qew.LJIIL(this)), new C1859260yU0(C1558520qew.LJIIL(this)), new C1859290yU3(C1558520qew.LJIIL(this)), new C1859300yU4(C1558520qew.LJIIL(this)));
                    }
                }
            }
        }
    }

    public final void tp(boolean z, boolean z2, boolean z3, Long l, boolean z4, boolean z5) {
        String strJ4;
        if (z4 || z) {
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                if (z3) {
                    strJ4 = tuxTextView.getContext().getString(2131822443);
                } else {
                    strJ4 = C786410Ut5.j4(tuxTextView.getContext().getString(2131822442), Arrays.copyOf(new Object[]{String.valueOf(l)}, 1));
                }
                tuxTextView.setText(strJ4);
                if (z3) {
                    C07QJ.LIZ.getClass();
                    if (C07QJ.LIZ()) {
                        C0GY8.LIZ((C0GY8) this.LLJZIJLIL.getValue(), this.LLJL, false, 30);
                    }
                }
            }
            C1295960jpS c1295960jpS = this.LLJLIL;
            if (c1295960jpS != null) {
                C07QJ.LIZ.getClass();
                if (C07QJ.LIZ()) {
                    C0DSB.LIZIZ(c1295960jpS);
                } else if (z3) {
                    C0DSB.LIZJ(c1295960jpS);
                    if (!c1295960jpS.isAnimating()) {
                        c1295960jpS.setProgress(0.0f);
                        c1295960jpS.playAnimation();
                    }
                } else {
                    C0DSB.LIZIZ(c1295960jpS);
                    c1295960jpS.cancelAnimation();
                }
            }
        }
        if (z5) {
            up(z2);
        }
    }

    public final void yp(InterfaceC1859270yU1 interfaceC1859270yU1, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String strLLIIIL = interfaceC1859270yU1.LLIIIL();
        if (strLLIIIL != null && strLLIIIL.length() != 0) {
            C0DSB.LIZJ(LJJIJL());
            tp(z5, z, false, interfaceC1859270yU1.LJJLIIIIJ(), z2, z4);
            op(interfaceC1859270yU1.LLIIIL(), z3, z);
            return;
        }
        C0DSB.LIZIZ(LJJIJL());
    }
}
