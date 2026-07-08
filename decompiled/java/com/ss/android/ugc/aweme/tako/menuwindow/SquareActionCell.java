package com.ss.android.ugc.aweme.tako.menuwindow;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1196320hEk;
import X.C13LE;
import X.C1558520qew;
import X.C1853560yKo;
import X.C1853750yL7;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1767370w5n;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SquareActionCell extends PowerCell<C1853560yKo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SquareActionCell.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SquareActionCell.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SquareActionCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMenuWindowViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3334);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(244);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3321), awS577S0100000_33, AFwS224S0000000_33.get$arr$(465), new AwS577S0100000_33((C03K6) this, 3311), new AwS577S0100000_33((C03K6) this, 3322), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3325), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3328), null, new AwS577S0100000_33((C03K6) this, 3331));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3307);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3309);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3312);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 129));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3317);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3320);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3323);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3326);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3329);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3332), awS577S0100000_33, AFwS224S0000000_33.get$arr$(464), new AwS577S0100000_33((C03K6) this, 3336), new AwS577S0100000_33((C03K6) this, 3338), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3340), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3342), null, new AwS577S0100000_33((C03K6) this, 3344));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3345), awS577S0100000_33, AFwS224S0000000_33.get$arr$(466), new AwS577S0100000_33((C03K6) this, 3347), new AwS577S0100000_33((C03K6) this, 3349), new AwS577S0100000_33((C03K6) this, 3352), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3354));
        }
        this.LLILLL = assemVMLazy;
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoFragmentViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 3303);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(243);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3306), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(463), new AwS577S0100000_33((C03K6) this, 3310), new AwS577S0100000_33((C03K6) this, 3313), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3315), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3318), null, new AwS577S0100000_33((C03K6) this, 3324));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 3327);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3330);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 3333);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj2, awS577S0100000_3311, 130));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 3335);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 3337);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 3339);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 3341);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 3343);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3346), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(467), new AwS577S0100000_33((C03K6) this, 3348), new AwS577S0100000_33((C03K6) this, 3350), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3351), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3353), null, new AwS577S0100000_33((C03K6) this, 3304));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3305), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(462), new AwS577S0100000_33((C03K6) this, 3308), new AwS577S0100000_33((C03K6) this, 3314), new AwS577S0100000_33((C03K6) this, 3316), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 3319));
        }
        this.LLILZ = assemVMLazy2;
        this.LLILZIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(461));
    }

    public final TakoMenuWindowViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (TakoMenuWindowViewModel) assemVMLazy.getValue();
    }

    public final Map<String, String> getCommonParams() {
        ITakoContextAbility iTakoContextAbility;
        Map<String, String> commonParams;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        return (interfaceC665370Q7zLIZ == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ITakoContextAbility.class, null)) == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.a3c);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.a4x);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        C1853560yKo c1853560yKo = (C1853560yKo) interfaceC1891350zJl;
        super.onBindItemView(c1853560yKo);
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = ((Size) this.LLILZIL.getValue()).getHeight();
        layoutParams.width = ((Size) this.LLILZIL.getValue()).getWidth();
        C786410Ut5.W5(view, layoutParams);
        EnumC1767370w5n enumC1767370w5n = c1853560yKo.LLILLL;
        EnumC1767370w5n enumC1767370w5n2 = EnumC1767370w5n.NONE;
        Float fValueOf = Float.valueOf(0.5f);
        Integer numValueOf = Integer.valueOf(R.attr.a03);
        if (enumC1767370w5n != enumC1767370w5n2) {
            float fLIZIZ4 = C418440Gaw.LIZIZ(8);
            if (c1853560yKo.LLILLL == EnumC1767370w5n.TOP_LEFT) {
                fLIZIZ = fLIZIZ4;
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(8);
            }
            if (c1853560yKo.LLILLL == EnumC1767370w5n.TOP_RIGHT) {
                fLIZIZ2 = fLIZIZ4;
            } else {
                fLIZIZ2 = C418440Gaw.LIZIZ(8);
            }
            if (c1853560yKo.LLILLL == EnumC1767370w5n.BOTTOM_RIGHT) {
                fLIZIZ3 = fLIZIZ4;
            } else {
                fLIZIZ3 = C418440Gaw.LIZIZ(8);
            }
            if (c1853560yKo.LLILLL != EnumC1767370w5n.BOTTOM_LEFT) {
                fLIZIZ4 = C418440Gaw.LIZIZ(8);
            }
            View view2 = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = numValueOf;
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ2);
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ3);
            c384050F3z.LJIIJ = Float.valueOf(fLIZIZ4);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
            c384050F3z.LJ = Integer.valueOf(ColorProtector.parseColor("#0D000000"));
            view2.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        } else {
            View view3 = this.itemView;
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
            c384050F3z2.LJ = Integer.valueOf(ColorProtector.parseColor("#0D000000"));
            view3.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        int i = C1853750yL7.LIZ[c1853560yKo.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TuxIconView tuxIconView = this.LL;
                    if (tuxIconView != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZ = R.raw.icon_image_alt_1_fill;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                        tuxIconView.setTuxIcon(c419910GdJ);
                    }
                    TuxTextView tuxTextView = this.LLILLJJLI;
                    if (tuxTextView != null) {
                        tuxTextView.setText(this.itemView.getContext().getString(2131849673));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                TuxIconView tuxIconView2 = this.LL;
                if (tuxIconView2 != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ2.LIZ = R.raw.icon_image_alt_1_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                    tuxIconView2.setTuxIcon(c419910GdJ2);
                }
                TuxTextView tuxTextView2 = this.LLILLJJLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(this.itemView.getContext().getString(2131822524));
                }
            }
        } else {
            TuxIconView tuxIconView3 = this.LL;
            if (tuxIconView3 != null) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ3.LIZ = R.raw.icon_camera_fill;
                c419910GdJ3.LJ = Integer.valueOf(R.attr.a1h);
                tuxIconView3.setTuxIcon(c419910GdJ3);
            }
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(this.itemView.getContext().getString(2131822528));
            }
        }
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853560yKo, 16), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fqt, viewGroup, false);
    }
}
