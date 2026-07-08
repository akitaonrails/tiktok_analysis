package com.ss.android.ugc.aweme.feed.flexible;

import X.C019F;
import X.C13LE;
import X.C1594190raT;
import X.C1594210raV;
import X.C1594220raW;
import X.C1637806bA;
import X.C16BC;
import X.C16G1;
import X.C19719912Dl;
import X.C20571215eY;
import X.C21659719pj;
import X.C2217381BqS;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleSupportAbility;
import com.ss.android.ugc.aweme.feed.flexible.ui.FlexibleBottomSheetBehavior;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class FlexibleVideoShrinkAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public VideoShrinkAbility LLJ;
    public FlexibleBottomSheetBehavior LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public int LLJILJILJ;
    public final C20571215eY LLJILLL;
    public float LLJJ;
    public boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FlexibleVideoShrinkAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/feed/flexible/FlexiblePanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FlexibleVideoShrinkAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FlexiblePanelVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 406), AFwS274S0000000_30.get$arr$(61), null, true);
        this.LLJILJILJ = 1;
        this.LLJILLL = new C20571215eY(false, 0, 895);
    }

    public final VideoShrinkAbility Go() {
        C1594220raW c1594220raW;
        FlexibleSupportAbility flexibleSupportAbility;
        if (this.LLJ == null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            VideoShrinkAbility videoShrinkAbilityQX0 = null;
            C1594210raV c1594210raVLIZIZ = C1594190raT.LIZIZ(C724240Sb0.LJI(this), fragmentLJI != null ? fragmentLJI.getActivity() : null);
            if (c1594210raVLIZIZ != null && (c1594220raW = c1594210raVLIZIZ.LIZJ) != null && (flexibleSupportAbility = c1594220raW.LIZ) != null) {
                videoShrinkAbilityQX0 = flexibleSupportAbility.qX0();
            }
            this.LLJ = videoShrinkAbilityQX0;
        }
        return this.LLJ;
    }

    public final FlexiblePanelVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (FlexiblePanelVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        VideoShrinkAbility videoShrinkAbility = this.LLJ;
        if (videoShrinkAbility != null) {
            videoShrinkAbility.t1(this.LLJILJILJ, 1);
        }
        this.LLJ = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        FlexibleBottomSheetBehavior flexibleBottomSheetBehavior;
        super.onViewCreated(view);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.14Tb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.LL.LLJIJIL = view.getMeasuredHeight();
                this.LL.LLJILJIL = view.getMeasuredHeight() * 0.73f;
            }
        });
        View viewFindViewById = view.findViewById(R.id.icm);
        if (viewFindViewById != null) {
            FlexibleBottomSheetBehavior.Companion.getClass();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams instanceof C16G1) {
                C16BC c16bc = ((C16G1) layoutParams).LIZ;
                if ((c16bc instanceof FlexibleBottomSheetBehavior) && (flexibleBottomSheetBehavior = (FlexibleBottomSheetBehavior) c16bc) != null) {
                    this.LLJI = flexibleBottomSheetBehavior;
                    C21659719pj c21659719pj = (C21659719pj) C723850SaN.LJFF(this, "flexible_sheet_config_param");
                    if (c21659719pj != null && !c21659719pj.enableVideoScale) {
                        return;
                    }
                    C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.14Kq
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Integer.valueOf(((C20247714Kl) obj).LLILLL);
                        }
                    }, null, new AwS644S0100000_30(this, 8), 6);
                    C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.14Kr
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Float.valueOf(((C20247714Kl) obj).LLILZ);
                        }
                    }, C736820SvI.LIZLLL(), new AwS644S0100000_30(this, 9), 4);
                }
            }
        }
    }
}
