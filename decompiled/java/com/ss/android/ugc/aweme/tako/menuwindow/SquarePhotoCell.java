package com.ss.android.ugc.aweme.tako.menuwindow;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C1196320hEk;
import X.C1322110kVd;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C13LE;
import X.C1558520qew;
import X.C1853550yKn;
import X.C1853570yKp;
import X.C19719912Dl;
import X.C2097608Jq;
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
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS112S0100000_12;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SquarePhotoCell extends PowerCell<C1853550yKn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public InterfaceC420801kM LLIZ;
    public final C01GW LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SquarePhotoCell.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SquarePhotoCell.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SquarePhotoCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        C418440Gaw.LIZIZ(4);
        C418440Gaw.LIZIZ(8);
        this.LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3372));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3365));
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3370));
        this.LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3363));
        this.LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3360));
        this.LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3374));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(471));
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMenuWindowViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 623);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(245);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3390), awS556S0100000_12, AFwS224S0000000_33.get$arr$(468), new AwS577S0100000_33((C03K6) this, 3380), new AwS577S0100000_33((C03K6) this, 3391), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3394), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3397), null, new AwS577S0100000_33((C03K6) this, 3400));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 3376);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3378);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 3381);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 131));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 3386);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3389);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3392);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3395);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3398);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS556S0100000_12, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3401), awS556S0100000_12, AFwS224S0000000_33.get$arr$(474), new AwS577S0100000_33((C03K6) this, 3404), new AwS577S0100000_33((C03K6) this, 3406), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3408), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3410), null, new AwS577S0100000_33((C03K6) this, 3355));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3357), awS556S0100000_12, AFwS224S0000000_33.get$arr$(469), new AwS577S0100000_33((C03K6) this, 3359), new AwS577S0100000_33((C03K6) this, 3361), new AwS577S0100000_33((C03K6) this, 3366), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3368));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(c19719912DlLIZ2, 622);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(246);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3375), awS556S0100000_122, AFwS224S0000000_33.get$arr$(473), new AwS577S0100000_33((C03K6) this, 3379), new AwS577S0100000_33((C03K6) this, 3382), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3384), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3387), null, new AwS577S0100000_33((C03K6) this, 3393));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33((C03K6) this, 3396);
            AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3399);
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33(c19719912DlLIZ2, 3402);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_339, 132));
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33(c01gwLIZIZ2, 3403);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c01gwLIZIZ2, 3405);
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 3407);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 3409);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 3356);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3311, awS556S0100000_122, new C452080Ho6(), awS577S0100000_3312, awS577S0100000_3313, awS577S0100000_3310, aFwS279S0000000_332, awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3316);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3358), awS556S0100000_122, AFwS224S0000000_33.get$arr$(470), new AwS577S0100000_33((C03K6) this, 3362), new AwS577S0100000_33((C03K6) this, 3364), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3367), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 3369), null, new AwS577S0100000_33((C03K6) this, 3371));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 3373), awS556S0100000_122, AFwS224S0000000_33.get$arr$(472), new AwS577S0100000_33((C03K6) this, 3377), new AwS577S0100000_33((C03K6) this, 3383), new AwS577S0100000_33((C03K6) this, 3385), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 3388));
        }
        this.LLJI = assemVMLazy2;
    }

    public final C1322110kVd N5() {
        return (C1322110kVd) this.LL.getValue();
    }

    public final View P5() {
        return (View) this.LLILZLL.getValue();
    }

    public final Map<String, String> getCommonParams() {
        ITakoContextAbility iTakoContextAbility;
        Map<String, String> commonParams;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        return (interfaceC665370Q7zLIZ == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ITakoContextAbility.class, null)) == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final void I5(C1853550yKn c1853550yKn) {
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        if (c1853550yKn.LLILLL != EnumC1767370w5n.NONE) {
            float fLIZIZ4 = C418440Gaw.LIZIZ(8);
            if (c1853550yKn.LLILLL == EnumC1767370w5n.TOP_LEFT) {
                fLIZIZ = C418440Gaw.LIZIZ(8);
            } else {
                fLIZIZ = fLIZIZ4;
            }
            if (c1853550yKn.LLILLL == EnumC1767370w5n.TOP_RIGHT) {
                fLIZIZ2 = C418440Gaw.LIZIZ(8);
            } else {
                fLIZIZ2 = fLIZIZ4;
            }
            if (c1853550yKn.LLILLL == EnumC1767370w5n.BOTTOM_LEFT) {
                fLIZIZ3 = C418440Gaw.LIZIZ(8);
            } else {
                fLIZIZ3 = fLIZIZ4;
            }
            if (c1853550yKn.LLILLL == EnumC1767370w5n.BOTTOM_RIGHT) {
                fLIZIZ4 = C418440Gaw.LIZIZ(8);
            }
            ((RoundingCornerLayout) this.LLILLJJLI.getValue()).setRoundingParams(new C462630ICf(fLIZIZ, fLIZIZ2, fLIZIZ4, fLIZIZ3));
            ((RoundingCornerLayout) this.LLILLL.getValue()).setRoundingParams(new C462630ICf(fLIZIZ, fLIZIZ2, fLIZIZ4, fLIZIZ3));
            return;
        }
        ((RoundingCornerLayout) this.LLILLJJLI.getValue()).setRoundingParams(new C462630ICf(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8)));
        ((RoundingCornerLayout) this.LLILLL.getValue()).setRoundingParams(new C462630ICf(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8)));
    }

    public final void L5(C1853550yKn c1853550yKn) {
        if (c1853550yKn.LL.selectIndex > 0) {
            ((TextView) this.LLILZ.getValue()).setText(String.valueOf(c1853550yKn.LL.selectIndex));
            View view = (View) this.LLILZ.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        } else {
            ((TextView) this.LLILZ.getValue()).setText("");
            View view2 = (View) this.LLILZ.getValue();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            c384050F3z2.LJFF = Integer.valueOf(R.attr.zi);
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1a);
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            view2.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853550yKn, 4), (View) this.LLILZIL.getValue());
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853550yKn, 5), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1853550yKn c1853550yKn = (C1853550yKn) interfaceC1891350zJl;
        super.onBindItemView(c1853550yKn);
        View view = (View) this.LLILLJJLI.getValue();
        ViewGroup.LayoutParams layoutParams = ((View) this.LLILLJJLI.getValue()).getLayoutParams();
        layoutParams.height = ((Size) this.LLIZLLLIL.getValue()).getHeight();
        layoutParams.width = ((Size) this.LLIZLLLIL.getValue()).getWidth();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setLayoutParams(layoutParams);
        N5().setScaleType(ImageView.ScaleType.CENTER_CROP);
        C1322110kVd c1322110kVdN5 = N5();
        C1331070kk5 hierarchy = c1322110kVdN5.getHierarchy();
        if (hierarchy != null) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LJII(C418440Gaw.LIZIZ(8));
            hierarchy.LJJIII(c1331100kk8);
        }
        C01GW c01gw = C23031090r.LIZ;
        this.LLIZ = C23031090r.LIZIZ(c1322110kVdN5, c1853550yKn.LL, (Size) this.LLIZLLLIL.getValue(), new AwS612S0100000_33(this, 156));
        N5().getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(8)));
        N5().setOutlineProvider(new C423410Gix(Float.valueOf(C418440Gaw.LIZIZ(8))));
        N5().setClipToOutline(true);
        if (c1853550yKn.LL.selectIndex > 0) {
            C786410Ut5.Ec(N5(), 1.1f);
            C786410Ut5.jc(N5(), 1.1f);
            C786410Ut5.LJLLLLLL(0, P5());
        } else {
            C786410Ut5.Ec(N5(), 1.0f);
            C786410Ut5.jc(N5(), 1.0f);
            C786410Ut5.LJLLLLLL(8, P5());
        }
        L5(c1853550yKn);
        I5(c1853550yKn);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fqu, viewGroup, false);
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
                        C786410Ut5.LJLLLLLL(0, P5());
                        P5().animate().alpha(1.0f).setDuration(300L).start();
                    } else {
                        P5().animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS112S0100000_12(this, 340)).start();
                    }
                }
                if (c1853570yKp.LIZIZ) {
                    I5(c1853550yKn);
                }
            }
        }
    }
}
