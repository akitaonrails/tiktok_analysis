package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C1853560yKo;
import X.C1853770yL9;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C540120LGg;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1767370w5n;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class ActionCell extends PowerCell<C1853560yKo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LLILLL = 3;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ActionCell.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ActionCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3459);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(248);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3443), awS577S0100000_33, AFwS224S0000000_33.get$arr$(479), new AwS577S0100000_33((C03K6) this, 3445), new AwS577S0100000_33((C03K6) this, 3447), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3449), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3451), null, new AwS577S0100000_33((C03K6) this, 3452));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3446);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3448);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3450);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 134));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3453);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3454);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3455);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3456);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3457);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3458), awS577S0100000_33, AFwS224S0000000_33.get$arr$(480), new AwS577S0100000_33((C03K6) this, 3460), new AwS577S0100000_33((C03K6) this, 3461), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3462), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3463), null, new AwS577S0100000_33((C03K6) this, 3464));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3465), awS577S0100000_33, AFwS224S0000000_33.get$arr$(481), new AwS577S0100000_33((C03K6) this, 3466), new AwS577S0100000_33((C03K6) this, 3467), new AwS577S0100000_33((C03K6) this, 3468), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3469));
        }
        this.LLILZLL = assemVMLazy;
        this.LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3444));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.a3c);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.a4x);
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
        layoutParams.height = ((Size) this.LLIZ.getValue()).getHeight();
        boolean zLIZLLL = C540120LGg.LIZLLL();
        boolean zLJ = C540120LGg.LJ();
        if (zLIZLLL || zLJ || c1853560yKo.LLILZ) {
            layoutParams.width = ((Size) this.LLIZ.getValue()).getWidth();
        } else {
            layoutParams.width = -1;
        }
        C786410Ut5.W5(view, layoutParams);
        if (c1853560yKo.LLILLL != EnumC1767370w5n.NONE) {
            float fLIZIZ4 = C418440Gaw.LIZIZ(4);
            if (c1853560yKo.LLILLL == EnumC1767370w5n.TOP_LEFT) {
                fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            } else {
                fLIZIZ = fLIZIZ4;
            }
            if (c1853560yKo.LLILLL == EnumC1767370w5n.TOP_RIGHT) {
                fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            } else {
                fLIZIZ2 = fLIZIZ4;
            }
            if (c1853560yKo.LLILLL == EnumC1767370w5n.BOTTOM_RIGHT) {
                fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            } else {
                fLIZIZ3 = fLIZIZ4;
            }
            if (c1853560yKo.LLILLL == EnumC1767370w5n.BOTTOM_LEFT) {
                fLIZIZ4 = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            }
            View view2 = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ2);
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ3);
            c384050F3z.LJIIJ = Float.valueOf(fLIZIZ4);
            view2.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        } else {
            View view3 = this.itemView;
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            view3.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        int i = C1853770yL9.LIZ[c1853560yKo.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TuxIconView tuxIconView = this.LLILZ;
                    if (tuxIconView != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                        c419910GdJ.LIZ = R.raw.icon_image_stack_fill;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                        tuxIconView.setTuxIcon(c419910GdJ);
                    }
                    TuxTextView tuxTextView = this.LLILZIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(this.itemView.getContext().getString(2131849673));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                TuxIconView tuxIconView2 = this.LLILZ;
                if (tuxIconView2 != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    c419910GdJ2.LIZ = R.raw.icon_image_stack_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                    tuxIconView2.setTuxIcon(c419910GdJ2);
                }
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(this.itemView.getContext().getString(2131822524));
                }
            }
        } else {
            TuxIconView tuxIconView3 = this.LLILZ;
            if (tuxIconView3 != null) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ3.LIZ = R.raw.icon_camera_fill;
                c419910GdJ3.LJ = Integer.valueOf(R.attr.a1h);
                tuxIconView3.setTuxIcon(c419910GdJ3);
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(this.itemView.getContext().getString(2131822528));
            }
        }
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853560yKo, 21), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fqp, viewGroup, false);
    }
}
