package com.ss.android.ugc.aweme.business.sticker.assem;

import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C20612315lB;
import X.C20612815lG;
import X.C315740CZg;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1356670lPN;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS24S1201000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS81S1000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class CommonHorizontalContainerAssem extends UISlotAssem implements InterfaceC1356670lPN {
    public C20612815lG LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, C13LE.LIZ(MentionContainerViewModel.class), C1637806bA.LIZ, new AwS575S0100000_31(this, 317), AFwS276S0000000_31.get$arr$(290), (Function0) null, 4));
    public final Set<String> LLJJIJI = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        Integer num;
        C20612815lG c20612815lG = this.LLJJI;
        return (c20612815lG == null || (num = c20612815lG.LJIIJ) == null) ? R.layout.dls : num.intValue();
    }

    @Override // X.InterfaceC1356670lPN
    public final void Df() {
        C20612815lG c20612815lG = this.LLJJI;
        if (Intrinsics.LJFF(c20612815lG != null ? c20612815lG.LIZJ : null, "profile_bio")) {
            ((ViewGroup.MarginLayoutParams) LJJIJL().getLayoutParams()).bottomMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) LJJIJL().getLayoutParams()).bottomMargin = 0;
        }
        LJJIJL().requestLayout();
    }

    @Override // X.InterfaceC1356670lPN
    public final boolean Be() {
        return LJJIJL().getVisibility() == 0;
    }

    @Override // X.InterfaceC1356670lPN
    public final void LLJI() {
        View contentView = getContentView();
        contentView.setPadding(contentView.getPaddingLeft(), contentView.getPaddingTop(), contentView.getPaddingRight(), 0);
    }

    @Override // X.InterfaceC1356670lPN
    public final void LLJL(User user) {
        String uid = user.getUid();
        if (uid != null && uid.length() != 0) {
            this.LLJJIJI.add(user.getUid());
        }
    }

    @Override // X.InterfaceC1356670lPN
    public final void LLLLJI(boolean z) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIII.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AwS43S0010000_31(z, 15));
    }

    @Override // X.InterfaceC1356670lPN
    public final void Rd(String str) {
        this.LLJJIJI.remove(str);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIII.getValue();
        assemViewModel.getClass();
        assemViewModel.setStateImmediate(new AwS81S1000000_31(str, 9));
    }

    @Override // X.InterfaceC1356670lPN
    public final void he(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LLJJIJI.add(str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C20612815lG c20612815lG = this.LLJJI;
        if (c20612815lG != null) {
            C723850SaN.LIZLLL(this, new AwS24S1201000_31(R.id.o87, this, c20612815lG, c20612815lG.LIZJ, 0));
        }
    }

    @Override // X.InterfaceC1356670lPN
    public final void Hi(int i, boolean z) {
        boolean z2;
        String str;
        C786410Ut5.LJLLLLLL(i, LJJIJL());
        if (i == 0) {
            C786410Ut5.T4(LJJIJL(), 1.0f);
        }
        if (!z) {
            C20612815lG c20612815lG = this.LLJJI;
            String str2 = null;
            if (c20612815lG != null) {
                str = c20612815lG.LIZJ;
                str2 = c20612815lG.LIZLLL.get("is_note");
            } else {
                str = null;
            }
            if (!C315740CZg.LIZ(str, Intrinsics.LJFF(str2, "1"))) {
                return;
            }
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIII.getValue();
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        assemViewModel.getClass();
        assemViewModel.setState(new AwS43S0010000_31(z2, 16));
    }

    @Override // X.InterfaceC1356670lPN
    public final void Ml(String str, String str2, boolean z) {
        String str3;
        try {
            MentionContainerViewModel mentionContainerViewModel = (MentionContainerViewModel) this.LLJJIII.getValue();
            if (str == null) {
                str = "";
            }
            Set<String> set = this.LLJJIJI;
            mentionContainerViewModel.LLILZ = str2;
            mentionContainerViewModel.LLILZLL = str;
            mentionContainerViewModel.setState(new C20612315lB(str, set, z));
            if (Be()) {
                C20612815lG c20612815lG = this.LLJJI;
                String str4 = null;
                if (c20612815lG != null) {
                    str3 = c20612815lG.LIZJ;
                    str4 = c20612815lG.LIZLLL.get("is_note");
                } else {
                    str3 = null;
                }
                if (C315740CZg.LIZ(str3, Intrinsics.LJFF(str4, "1"))) {
                    MentionContainerViewModel mentionContainerViewModel2 = (MentionContainerViewModel) this.LLJJIII.getValue();
                    mentionContainerViewModel2.getClass();
                    mentionContainerViewModel2.setState(new AwS43S0010000_31(true, 16));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
