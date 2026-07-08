package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C0HZQ;
import X.C13LE;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C889503dl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.CCDCAddCardLongTextAdjust;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveNewCardViewHolder extends PowerCell<C889503dl> implements C03H8, c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public C0HZQ LL;
    public C0HZQ LLILLJJLI;
    public C21411818qq LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SaveNewCardViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // p8b.c
    public final String getViewName() {
        return "SaveNewCardViewHolder";
    }

    public SaveNewCardViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1167);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(208);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1157), awS545S0100000_1, AFwS207S0000000_19.get$arr$(222), new AwS545S0100000_1((C03K6) this, 1159), new AwS545S0100000_1((C03K6) this, 1161), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1163), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1348), null, new AwS545S0100000_1((C03K6) this, 1165));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1160);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1162);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1164);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 83));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1349);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1350);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1351);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1352);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1353);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1166), awS545S0100000_1, AFwS207S0000000_19.get$arr$(223), new AwS545S0100000_1((C03K6) this, 1168), new AwS545S0100000_1((C03K6) this, 1169), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1170), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1354), null, new AwS545S0100000_1((C03K6) this, 1171));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1172), awS545S0100000_1, AFwS207S0000000_19.get$arr$(224), new AwS545S0100000_1((C03K6) this, 1173), new AwS545S0100000_1((C03K6) this, 1174), new AwS545S0100000_1((C03K6) this, 1175), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1176));
        }
        this.LLJI = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1158));
    }

    public final C0HZQ I5() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj8) : null;
            this.LLILLJJLI = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final C0HZQ L5() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj9) : null;
            this.LL = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final TuxIconView N5() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jxe) : null;
            this.LLILZ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final C21411818qq P5() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tz9) : null;
            this.LLILLL = (C21411818qq) viewFindViewById;
        }
        return (C21411818qq) viewFindViewById;
    }

    public final TuxTextView R5() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z6l) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView S5() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z6n) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final CCDCAddCardViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0445 A[PHI: r0
      0x0445: PHI (r0v31 android.view.View) = (r0v30 android.view.View), (r0v34 android.view.View) binds: [B:135:0x0435, B:140:0x0443] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r22) {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.SaveNewCardViewHolder.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            return C0H1U.LIZJ(R.layout.ahr, viewGroup, false);
        }
        return C0H1U.LIZJ(R.layout.ahq, viewGroup, false);
    }
}
