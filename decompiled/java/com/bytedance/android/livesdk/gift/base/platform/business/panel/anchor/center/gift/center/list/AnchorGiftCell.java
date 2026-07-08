package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1119920fFW;
import X.C1146350fw9;
import X.C11NJ;
import X.C1324720kZq;
import X.C13LE;
import X.C16F5;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnLongClickListenerC1151640g4g;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AnchorGiftCell extends PowerCell<C1146350fw9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C16F5 LL;
    public C1324720kZq LLILLJJLI;
    public C1324720kZq LLILLL;
    public ImageView LLILZ;
    public C16F5 LLILZIL;
    public ImageView LLILZLL;
    public C16F5 LLIZ;
    public View LLIZLLLIL;
    public final C11NJ LLJ = new C11NJ();
    public final AssemVMLazy LLJI;
    public C1146350fw9 LLJIJIL;
    public ImageModel LLJILJIL;
    public ImageModel LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnchorGiftCell.class, "centerVM", "getCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/gift/center/GiftAnchorPanelGiftPageCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AnchorGiftCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelGiftPageCenterViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 101);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(17);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 86), awS577S0100000_33, AFwS224S0000000_33.get$arr$(16), new AwS577S0100000_33((C03K6) this, 87), new AwS577S0100000_33((C03K6) this, 89), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 91), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 93), null, new AwS577S0100000_33((C03K6) this, 94));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 88);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 90);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 92);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 3));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 95);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 96);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 97);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 98);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 99);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 100), awS577S0100000_33, AFwS224S0000000_33.get$arr$(17), new AwS577S0100000_33((C03K6) this, 102), new AwS577S0100000_33((C03K6) this, 103), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 104), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 105), null, new AwS577S0100000_33((C03K6) this, 106));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 107), awS577S0100000_33, AFwS224S0000000_33.get$arr$(18), new AwS577S0100000_33((C03K6) this, 108), new AwS577S0100000_33((C03K6) this, 109), new AwS577S0100000_33((C03K6) this, 110), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 111));
        }
        this.LLJI = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C16F5) this.itemView.findViewById(R.id.iyo);
        this.LLILLJJLI = (C1324720kZq) this.itemView.findViewById(R.id.iy1);
        this.LLILLL = (C1324720kZq) this.itemView.findViewById(R.id.iwx);
        this.LLILZ = (ImageView) this.itemView.findViewById(R.id.mk_);
        this.LLILZIL = (C16F5) this.itemView.findViewById(R.id.iwf);
        this.LLILZLL = (ImageView) this.itemView.findViewById(R.id.e3l);
        this.LLIZ = (C16F5) this.itemView.findViewById(R.id.t19);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.ulz);
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 33), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 4));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    public final void I5(boolean z) {
        if (z) {
            C16F5 c16f5 = this.LL;
            if (c16f5 != null) {
                c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, this.itemView.getContext()));
            }
            C16F5 c16f52 = this.LL;
            if (c16f52 != null) {
                c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), 500, this.itemView.getContext()));
            }
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                c16f53.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, this.itemView.getContext()));
            }
            C16F5 c16f54 = this.LLILZIL;
            if (c16f54 != null) {
                c16f54.setTypeface(C1119920fFW.LIZJ(c16f54.getTextSize(), 500, this.itemView.getContext()));
                return;
            }
            return;
        }
        C16F5 c16f55 = this.LL;
        if (c16f55 != null) {
            c16f55.setTextColor(C497740JfY.LIZLLL(R.attr.c9k, this.itemView.getContext()));
        }
        C16F5 c16f56 = this.LL;
        if (c16f56 != null) {
            c16f56.setTypeface(C1119920fFW.LIZJ(c16f56.getTextSize(), 400, this.itemView.getContext()));
        }
        C16F5 c16f57 = this.LLILZIL;
        if (c16f57 != null) {
            c16f57.setTextColor(C497740JfY.LIZLLL(R.attr.c9k, this.itemView.getContext()));
        }
        C16F5 c16f58 = this.LLILZIL;
        if (c16f58 == null) {
            return;
        }
        c16f58.setTypeface(C1119920fFW.LIZJ(c16f58.getTextSize(), 400, this.itemView.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[PHI: r6
      0x0082: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:33:0x0080, B:31:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r20) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list.AnchorGiftCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpc, viewGroup, false);
    }
}
