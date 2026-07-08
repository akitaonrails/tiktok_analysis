package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1322110kVd;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C13LE;
import X.C1853550yKn;
import X.C1853570yKp;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23031090r;
import X.C384050F3z;
import X.C418440Gaw;
import X.C423410Gix;
import X.C452080Ho6;
import X.C452501pT;
import X.C462630ICf;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1767370w5n;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS109S0100000_9;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PhotoCell extends PowerCell<C1853550yKn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public InterfaceC420801kM LLJ;
    public final AssemVMLazy LLJIJIL;
    public final float LL = C418440Gaw.LIZIZ(4);
    public final float LLILLJJLI = C418440Gaw.LIZIZ(8);
    public final int LLILLL = 3;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3480));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3476));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3474));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3473));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3481));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3478));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoCell.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PhotoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3496);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(249);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3479), awS577S0100000_33, AFwS224S0000000_33.get$arr$(483), new AwS577S0100000_33((C03K6) this, 3482), new AwS577S0100000_33((C03K6) this, 3484), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3486), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3488), null, new AwS577S0100000_33((C03K6) this, 3489));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3483);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3485);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3487);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 135));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3490);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3491);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3492);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3493);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3494);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3495), awS577S0100000_33, AFwS224S0000000_33.get$arr$(484), new AwS577S0100000_33((C03K6) this, 3497), new AwS577S0100000_33((C03K6) this, 3498), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3499), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3500), null, new AwS577S0100000_33((C03K6) this, 3501));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3470), awS577S0100000_33, AFwS224S0000000_33.get$arr$(482), new AwS577S0100000_33((C03K6) this, 3471), new AwS577S0100000_33((C03K6) this, 3472), new AwS577S0100000_33((C03K6) this, 3475), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3477));
        }
        this.LLJIJIL = assemVMLazy;
    }

    public final C1322110kVd N5() {
        return (C1322110kVd) this.LLILZ.getValue();
    }

    public final void I5(C1853550yKn c1853550yKn) {
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        if (c1853550yKn.LLILLL != EnumC1767370w5n.NONE) {
            float fLIZIZ4 = C418440Gaw.LIZIZ(4);
            if (c1853550yKn.LLILLL == EnumC1767370w5n.TOP_LEFT) {
                fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            } else {
                fLIZIZ = fLIZIZ4;
            }
            if (c1853550yKn.LLILLL == EnumC1767370w5n.TOP_RIGHT) {
                fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            } else {
                fLIZIZ2 = fLIZIZ4;
            }
            if (c1853550yKn.LLILLL == EnumC1767370w5n.BOTTOM_LEFT) {
                fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            } else {
                fLIZIZ3 = fLIZIZ4;
            }
            if (c1853550yKn.LLILLL == EnumC1767370w5n.BOTTOM_RIGHT) {
                fLIZIZ4 = C418440Gaw.LIZIZ(Float.valueOf(10.0f));
            }
            ((RoundingCornerLayout) this.LLILZIL.getValue()).setRoundingParams(new C462630ICf(fLIZIZ, fLIZIZ2, fLIZIZ4, fLIZIZ3));
            return;
        }
        ((RoundingCornerLayout) this.LLILZIL.getValue()).setRoundingParams(new C462630ICf(C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4)));
    }

    public final void L5(C1853550yKn c1853550yKn) {
        if (c1853550yKn.LL.selectIndex > 0) {
            ((TextView) this.LLILZLL.getValue()).setText(String.valueOf(c1853550yKn.LL.selectIndex));
            View view = (View) this.LLILZLL.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        } else {
            ((TextView) this.LLILZLL.getValue()).setText("");
            View view2 = (View) this.LLILZLL.getValue();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1a);
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            c384050F3z2.LJFF = Integer.valueOf(R.attr.zi);
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            view2.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853550yKn, 10), (View) this.LLIZ.getValue());
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853550yKn, 11), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1853550yKn c1853550yKn = (C1853550yKn) interfaceC1891350zJl;
        super.onBindItemView(c1853550yKn);
        View view = (View) this.LLILZIL.getValue();
        ViewGroup.LayoutParams layoutParams = ((View) this.LLILZIL.getValue()).getLayoutParams();
        layoutParams.height = ((Size) this.LLJI.getValue()).getHeight();
        layoutParams.width = ((Size) this.LLJI.getValue()).getWidth();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setLayoutParams(layoutParams);
        N5().setScaleType(ImageView.ScaleType.CENTER_CROP);
        C1322110kVd c1322110kVdN5 = N5();
        C1331070kk5 hierarchy = c1322110kVdN5.getHierarchy();
        if (hierarchy != null) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LJII(C418440Gaw.LIZIZ(4));
            hierarchy.LJJIII(c1331100kk8);
        }
        C01GW c01gw = C23031090r.LIZ;
        this.LLJ = C23031090r.LIZIZ(c1322110kVdN5, c1853550yKn.LL, (Size) this.LLJI.getValue(), new AwS612S0100000_33(this, 247));
        N5().getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(4)));
        N5().setOutlineProvider(new C423410Gix(Float.valueOf(C418440Gaw.LIZIZ(4))));
        N5().setClipToOutline(true);
        L5(c1853550yKn);
        I5(c1853550yKn);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fqq, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        boolean z;
        C1853550yKn c1853550yKn = (C1853550yKn) interfaceC1891350zJl;
        super.onBindItemView(c1853550yKn, list);
        for (Object obj : list) {
            if (obj instanceof C1853570yKp) {
                C1853570yKp c1853570yKp = (C1853570yKp) obj;
                if (c1853570yKp.LIZ) {
                    L5(c1853550yKn);
                    if (c1853550yKn.LL.selectIndex > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        N5().animate().scaleY(1.1f).scaleX(1.1f).setDuration(300L).start();
                        C786410Ut5.LJLLLLLL(0, (View) this.LLIZLLLIL.getValue());
                        ((View) this.LLIZLLLIL.getValue()).animate().alpha(1.0f).setDuration(300L).start();
                    } else {
                        N5().animate().scaleY(1.0f).scaleX(1.0f).setDuration(300L).start();
                        ((View) this.LLIZLLLIL.getValue()).animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS109S0100000_9(this, 223)).start();
                    }
                }
                if (c1853570yKp.LIZIZ) {
                    I5(c1853550yKn);
                }
            }
        }
    }
}
