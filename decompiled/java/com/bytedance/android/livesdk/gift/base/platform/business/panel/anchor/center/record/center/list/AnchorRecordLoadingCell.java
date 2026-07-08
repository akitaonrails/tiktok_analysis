package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1146050fvf;
import X.C13LE;
import X.C16FZ;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AnchorRecordLoadingCell extends PowerCell<C1146050fvf> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public FrameLayout LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnchorRecordLoadingCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/record/center/GiftAnchorPanelRecordPageCenterAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AnchorRecordLoadingCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelRecordPageCenterAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 152);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(19);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 163), awS577S0100000_33, AFwS224S0000000_33.get$arr$(24), new AwS577S0100000_33((C03K6) this, 138), new AwS577S0100000_33((C03K6) this, 140), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 142), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 144), null, new AwS577S0100000_33((C03K6) this, 145));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 139);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 141);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 143);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 5));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 146);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 147);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 148);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 149);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 150);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 151), awS577S0100000_33, AFwS224S0000000_33.get$arr$(22), new AwS577S0100000_33((C03K6) this, 153), new AwS577S0100000_33((C03K6) this, 154), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 155), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 156), null, new AwS577S0100000_33((C03K6) this, 157));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 158), awS577S0100000_33, AFwS224S0000000_33.get$arr$(23), new AwS577S0100000_33((C03K6) this, 159), new AwS577S0100000_33((C03K6) this, 160), new AwS577S0100000_33((C03K6) this, 161), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 162));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (FrameLayout) this.itemView.findViewById(R.id.eqx);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C16FZ c16fz = new C16FZ(this.itemView.getContext(), null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C439101nJ.LIZ(48), C439101nJ.LIZ(48));
            layoutParams.gravity = 17;
            frameLayout.addView(c16fz, layoutParams);
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        ((GiftAnchorPanelRecordPageCenterAssemViewModel) assemVMLazy.getValue()).AQ2();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        ((GiftAnchorPanelRecordPageCenterAssemViewModel) assemVMLazy.getValue()).AQ2();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpg, viewGroup, false);
    }
}
