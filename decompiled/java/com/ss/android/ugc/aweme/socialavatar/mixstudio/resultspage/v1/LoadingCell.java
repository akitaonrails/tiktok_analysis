package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0HQN;
import X.C12YD;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C19772912Xv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C435650H6l;
import X.C440930HQt;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LoadingCell extends PowerCell<C440930HQt> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(204));
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public TuxSpinner LLILZ;
    public TuxIconView LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LoadingCell.class, "baseVM", "getBaseVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/framework/MixStudioBaseViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LoadingCell.class, "resultsVM", "getResultsVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/resultspage/MixStudioResultsPageViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public LoadingCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioBaseViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 357);
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(151);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 344), awS573S0100000_29, AFwS218S0000000_29.get$arr$(193), new AwS573S0100000_29((C03K6) this, 334), new AwS573S0100000_29((C03K6) this, 345), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 348), aFwS273S0000000_29, new AwS573S0100000_29((C03K6) this, 351), null, new AwS573S0100000_29((C03K6) this, 354));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS573S0100000_29 awS573S0100000_292 = new AwS573S0100000_29((C03K6) this, 330);
            AwS573S0100000_29 awS573S0100000_293 = new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 332);
            AwS573S0100000_29 awS573S0100000_294 = new AwS573S0100000_29(c19719912DlLIZ, 335);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS430S0200000_29((InterfaceC451590HnJ) obj, awS573S0100000_292, 36));
            AwS573S0100000_29 awS573S0100000_295 = new AwS573S0100000_29(c01gwLIZIZ, 340);
            AwS573S0100000_29 awS573S0100000_296 = new AwS573S0100000_29(c01gwLIZIZ, 343);
            AwS573S0100000_29 awS573S0100000_297 = new AwS573S0100000_29(c01gwLIZIZ, 346);
            AwS573S0100000_29 awS573S0100000_298 = new AwS573S0100000_29(c01gwLIZIZ, 349);
            AwS573S0100000_29 awS573S0100000_299 = new AwS573S0100000_29(c01gwLIZIZ, 352);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS573S0100000_294, awS573S0100000_29, new C452080Ho6(), awS573S0100000_295, awS573S0100000_296, awS573S0100000_293, aFwS273S0000000_29, awS573S0100000_297, awS573S0100000_298, awS573S0100000_299);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 355), awS573S0100000_29, AFwS218S0000000_29.get$arr$(205), new AwS573S0100000_29((C03K6) this, 359), new AwS573S0100000_29((C03K6) this, 361), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 363), aFwS273S0000000_29, new AwS573S0100000_29((C03K6) this, 365), null, new AwS573S0100000_29((C03K6) this, 367));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 316), awS573S0100000_29, AFwS218S0000000_29.get$arr$(195), new AwS573S0100000_29((C03K6) this, 318), new AwS573S0100000_29((C03K6) this, 319), new AwS573S0100000_29((C03K6) this, 322), aFwS273S0000000_29, null, null, new AwS573S0100000_29((C03K6) this, 324));
        }
        this.LLILLJJLI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixStudioResultsPageViewModel.class);
        AwS573S0100000_29 awS573S0100000_2910 = new AwS573S0100000_29(c19719912DlLIZ2, 326);
        AFwS273S0000000_29 aFwS273S0000000_292 = AFwS273S0000000_29.get$arr$(152);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 329), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(203), new AwS573S0100000_29((C03K6) this, 333), new AwS573S0100000_29((C03K6) this, 336), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 338), aFwS273S0000000_292, new AwS573S0100000_29((C03K6) this, 341), null, new AwS573S0100000_29((C03K6) this, 347));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS573S0100000_29 awS573S0100000_2911 = new AwS573S0100000_29((C03K6) this, 350);
            AwS573S0100000_29 awS573S0100000_2912 = new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 353);
            AwS573S0100000_29 awS573S0100000_2913 = new AwS573S0100000_29(c19719912DlLIZ2, 356);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS430S0200000_29((InterfaceC451590HnJ) obj, awS573S0100000_2911, 37));
            AwS573S0100000_29 awS573S0100000_2914 = new AwS573S0100000_29(c01gwLIZIZ2, 358);
            AwS573S0100000_29 awS573S0100000_2915 = new AwS573S0100000_29(c01gwLIZIZ2, 360);
            AwS573S0100000_29 awS573S0100000_2916 = new AwS573S0100000_29(c01gwLIZIZ2, 362);
            AwS573S0100000_29 awS573S0100000_2917 = new AwS573S0100000_29(c01gwLIZIZ2, 364);
            AwS573S0100000_29 awS573S0100000_2918 = new AwS573S0100000_29(c01gwLIZIZ2, 366);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS573S0100000_2913, awS573S0100000_2910, new C452080Ho6(), awS573S0100000_2914, awS573S0100000_2915, awS573S0100000_2912, aFwS273S0000000_292, awS573S0100000_2916, awS573S0100000_2917, awS573S0100000_2918);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 317), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(197), new AwS573S0100000_29((C03K6) this, 320), new AwS573S0100000_29((C03K6) this, 321), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 323), aFwS273S0000000_292, new AwS573S0100000_29((C03K6) this, 325), null, new AwS573S0100000_29((C03K6) this, 327));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 328), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(202), new AwS573S0100000_29((C03K6) this, 331), new AwS573S0100000_29((C03K6) this, 337), new AwS573S0100000_29((C03K6) this, 339), aFwS273S0000000_292, null, null, new AwS573S0100000_29((C03K6) this, 342));
        }
        this.LLILLL = assemVMLazy2;
        this.LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(199));
        this.LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(198));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(196));
        this.LLJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(194));
        this.LLJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(201));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(200));
    }

    public final int I5() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final MixStudioStatusRepository L5() {
        return (MixStudioStatusRepository) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        AssemViewModel.selectSubscribe$default(assemVMLazy.getValue(), C0HQN.LL, null, null, null, new AwS581S0100000_2((Function1) new AwS585S0100000_6(this, 188), (Function1<Object, String>) 572), 14, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, C435650H6l.LIZ(((Number) this.LLILZLL.getValue()).intValue(), ((Number) this.LLILZLL.getValue()).intValue(), ((Number) this.LLIZ.getValue()).intValue(), 0, 0, 248));
        View view = new View(viewGroup.getContext());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, view.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        view.setClipToOutline(true);
        view.setOutlineProvider(new C19772912Xv(this, 1));
        view.setElevation(3.0f);
        view.addOnLayoutChangeListener(new C12YD(view, 1));
        frameLayout.addView(view, new FrameLayout.LayoutParams(((Number) this.LLIZLLLIL.getValue()).intValue(), ((Number) this.LLIZLLLIL.getValue()).intValue(), 17));
        TuxSpinner tuxSpinner = new TuxSpinner(viewGroup.getContext(), null, 6, 0);
        tuxSpinner.setElevation(3.0f);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, viewGroup.getContext());
        if (numLIZJ2 != null) {
            tuxSpinner.LIZ(R.raw.icon_spinner_normal, numLIZJ2.intValue());
        }
        this.LLILZ = tuxSpinner;
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setIconWidth(I5());
        tuxIconView.setIconHeight(I5());
        tuxIconView.setIconRes(R.raw.icon_plus);
        tuxIconView.setTintColorRes(R.attr.a1k);
        tuxIconView.setElevation(3.0f);
        this.LLILZIL = tuxIconView;
        frameLayout.addView(this.LLILZ, new FrameLayout.LayoutParams(((Number) this.LLJIJIL.getValue()).intValue(), ((Number) this.LLJIJIL.getValue()).intValue(), 17));
        frameLayout.addView(this.LLILZIL, new FrameLayout.LayoutParams(I5(), I5(), 17));
        return frameLayout;
    }
}
