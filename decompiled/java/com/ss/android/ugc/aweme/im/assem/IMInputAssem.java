package com.ss.android.ugc.aweme.im.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0HVA;
import X.C0IDP;
import X.C0RUV;
import X.C0SZ4;
import X.C13DA;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C432670Gxt;
import X.C452501pT;
import X.C457590Hwz;
import X.C696620RUe;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C738530Sy3;
import X.C738560Sy6;
import X.EnumC457820HxM;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IMInputAssem extends UISlotAssem implements C0HVA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final Map<String, Integer> LLJLILLLLZIIL;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final C0IDP LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMInputAssem.class, "inputHeightVM", "getInputHeightVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C13DA c13da = new C13DA();
        c13da.put("SLOT_RIGHT_AREA", Integer.valueOf(R.id.tks));
        c13da.put("SLOT_LEFT_AREA", Integer.valueOf(R.id.mjp));
        c13da.put("SLOT_TOP_AREA", Integer.valueOf(R.id.y_b));
        c13da.put("SLOT_INPUT_LEFT_AREA", Integer.valueOf(R.id.kqy));
        c13da.put("SLOT_INPUT_RIGHT_AREA", Integer.valueOf(R.id.kqz));
        c13da.put("SLOT_INPUT_FIELD", Integer.valueOf(R.id.kqw));
        c13da.put("SLOT_REPLY_LAYOUT", Integer.valueOf(R.id.t7h));
        c13da.put("SLOT_PANEL", Integer.valueOf(R.id.q1i));
        c13da.put("SLOT_INPUT_AREA", Integer.valueOf(R.id.kqv));
        LLJLILLLLZIIL = c13da.build();
    }

    public IMInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 118), AFwS236S0000000_6.get$arr$(78), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 117));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 115));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 113));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 112));
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 110));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 116));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 111));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 114));
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = new C0IDP(this, 4);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.coq;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract void hp();

    public abstract void kp();

    public final LinearLayout ip() {
        return (LinearLayout) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
        hp();
        for (C0RUV<? extends AbstractC738140SxQ> c0ruv : getConfig().LLIZ) {
            if (c0ruv instanceof C0SZ4) {
                C0SZ4 c0sz4 = (C0SZ4) c0ruv;
                Integer num = LLJLILLLLZIIL.get(c0sz4.LLILZ.get("input_area"));
                if (num == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0sz4.LLILZ.get("input_area"));
                    sbLIZ.append(" is not a valid ID");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c0sz4.LLIZLLLIL = num.intValue();
            } else if (c0ruv instanceof C696620RUe) {
                C696620RUe c696620RUe = (C696620RUe) c0ruv;
                Integer num2 = LLJLILLLLZIIL.get(c696620RUe.LLILZ.get("input_area"));
                if (num2 == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c696620RUe.LLILZ.get("input_area"));
                    sbLIZ2.append(" is not a valid ID");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                c696620RUe.LLIZLLLIL = num2.intValue();
            } else {
                continue;
            }
        }
        super.mo127do();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        if (isHitTrack()) {
            C738560Sy6 c738560Sy6 = C738560Sy6.LL;
            String strLIZ = C432670Gxt.LIZ(this);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            C23250099c.LIZLLL(c738560Sy6, null, null, new C738530Sy3(fragmentLJI.hashCode(), strLIZ, null), 3);
        }
        super.onCreate();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (this.LLJJL && this.LLJJJJLIIL) {
            LJJIJL().removeOnLayoutChangeListener(this.LLJL);
        }
        this.LLJJJJLIIL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (!this.LLJJL || this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        getContentView().addOnLayoutChangeListener(this.LLJL);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean isHitTrack() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public static int lp(EnumC457820HxM enumC457820HxM) {
        Integer num = LLJLILLLLZIIL.get(enumC457820HxM.name());
        if (num != null) {
            return num.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457590Hwz(this, null), 3);
        this.LLJJL = true;
        this.LLJJJJLIIL = true;
        getContentView().addOnLayoutChangeListener(this.LLJL);
        kp();
    }
}
