package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.components.loading;

import X.C1077410e8x;
import X.C1077420e8y;
import X.C1295090jo3;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C13LP;
import X.C14J3;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1295080jo2;
import X.InterfaceC1296040jpa;
import X.InterfaceC1587906Jp;
import X.InterfaceC321350Cij;
import X.InterfaceC712990Rxx;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentProcessInfo;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS314S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceAgentLoadingAssem extends ReusedUISlotAssem<CommerceAgentLoadingAssem> implements InterfaceC712990Rxx<InterfaceC321350Cij> {
    public LinearLayoutCompat LLJJLIIIJLLLLLLLZ;
    public C1295960jpS LLJL;
    public C14J3 LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ajt;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        LinearLayoutCompat linearLayoutCompat = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayoutCompat != null) {
            AFwS314S0000000_27 aFwS314S0000000_27 = AFwS314S0000000_27.get$arr$(5);
            Iterator it2 = new C1077420e8y(linearLayoutCompat, 28).iterator();
            int i = 0;
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                Object next = c1077410e8x.next();
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                aFwS314S0000000_27.invoke(Integer.valueOf(i), ((View) next).findViewById(R.id.zvv));
                i = i2;
            }
        }
        C1295960jpS c1295960jpS = this.LLJL;
        if (c1295960jpS == null || !c1295960jpS.isAnimating()) {
            return;
        }
        C1295960jpS c1295960jpS2 = this.LLJL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setProgress(1.0f);
        }
        C1295960jpS c1295960jpS3 = this.LLJL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.pauseAnimation();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        final int iIntValue;
        this.LLJL = (C1295960jpS) view.findViewById(R.id.nrk);
        this.LLJLIL = (C14J3) view.findViewById(R.id.ety);
        C1295960jpS c1295960jpS = this.LLJL;
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation("social_dm_input_loading_dark_tux_lottie.json");
        }
        this.LLJJLIIIJLLLLLLLZ = (LinearLayoutCompat) view.findViewById(R.id.nlo);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a8n, new ContextThemeWrapper(view.getContext(), R.style.y0));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C1295960jpS c1295960jpS2 = this.LLJL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (InterfaceC1296040jpa<ColorFilter>) new InterfaceC1296040jpa() { // from class: X.0yLo
                @Override // X.InterfaceC1296040jpa
                public final Object LIZ(C1295570jop c1295570jop) {
                    return new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.OVERLAY);
                }
            });
        }
        C1295960jpS c1295960jpS3 = this.LLJL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.setRepeatCount(-1);
        }
        C1295960jpS c1295960jpS4 = this.LLJL;
        if (c1295960jpS4 != null) {
            c1295960jpS4.setRepeatMode(1);
        }
        C14J3 c14j3 = this.LLJLIL;
        if (c14j3 != null) {
            c14j3.setBackground(null);
            c14j3.setHasLeftTail(true);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC321350Cij interfaceC321350Cij) {
        Integer numValueOf;
        C1295960jpS c1295960jpS;
        InterfaceC321350Cij interfaceC321350Cij2 = interfaceC321350Cij;
        if (interfaceC321350Cij2.LIZ() == 3) {
            C1295960jpS c1295960jpS2 = this.LLJL;
            if (c1295960jpS2 != null && c1295960jpS2.isAnimating() && (c1295960jpS = this.LLJL) != null) {
                c1295960jpS.pauseAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LLJL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setProgress(0.0f);
            }
            C1295960jpS c1295960jpS4 = this.LLJL;
            if (c1295960jpS4 != null) {
                c1295960jpS4.playAnimation();
            }
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindDotLoading: animation started, repeatCount=");
            C1295960jpS c1295960jpS5 = this.LLJL;
            Integer numValueOf2 = null;
            if (c1295960jpS5 != null) {
                numValueOf = Integer.valueOf(c1295960jpS5.getRepeatCount());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", repeatMode=");
            C1295960jpS c1295960jpS6 = this.LLJL;
            if (c1295960jpS6 != null) {
                numValueOf2 = Integer.valueOf(c1295960jpS6.getRepeatMode());
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", this=");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
            new Exception("Stack trace");
            C14J3 c14j3 = this.LLJLIL;
            if (c14j3 != null) {
                int visibility = c14j3.getVisibility();
                c14j3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c14j3);
            }
            List<CommerceAgentProcessInfo> listLJJIFFI = interfaceC321350Cij2.LJJIFFI();
            if (!(listLJJIFFI instanceof Collection) || !listLJJIFFI.isEmpty()) {
                Iterator<CommerceAgentProcessInfo> it2 = listLJJIFFI.iterator();
                while (it2.hasNext()) {
                    int i = it2.next().stage;
                    if (100 <= i && i < 201) {
                        C13LP.LJJLIIIJL(interfaceC321350Cij2.LJJIFFI());
                        return;
                    }
                }
            }
            interfaceC321350Cij2.LJJIFFI();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC321350Cij interfaceC321350Cij) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC321350Cij interfaceC321350Cij) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
