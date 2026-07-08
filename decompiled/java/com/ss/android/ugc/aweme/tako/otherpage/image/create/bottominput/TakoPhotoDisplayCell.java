package com.ss.android.ugc.aweme.tako.otherpage.image.create.bottominput;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0VSJ;
import X.C1163410gNf;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1852560yJC;
import X.C1854460yMG;
import X.C1857690yRT;
import X.C19719912Dl;
import X.C2137908Zd;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C346180Dhg;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS512S0200000_27;

/* JADX INFO: loaded from: classes34.dex */
public final class TakoPhotoDisplayCell extends PowerCell<C1852560yJC> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public SmartImageView LL;
    public FrameLayout LLILLJJLI;
    public View LLILLL;
    public final AssemVMLazy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoPhotoDisplayCell.class, "createBottomInputVM", "getCreateBottomInputVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/bottominput/TakoCreateBottomInputViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fps;
    }

    public TakoPhotoDisplayCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoCreateBottomInputViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3544);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(251);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3555), awS577S0100000_33, AFwS224S0000000_33.get$arr$(490), new AwS577S0100000_33((C03K6) this, 3530), new AwS577S0100000_33((C03K6) this, 3532), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3534), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3536), null, new AwS577S0100000_33((C03K6) this, 3537));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3531);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3533);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3535);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 137));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3538);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3539);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3540);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3541);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3542);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3543), awS577S0100000_33, AFwS224S0000000_33.get$arr$(488), new AwS577S0100000_33((C03K6) this, 3545), new AwS577S0100000_33((C03K6) this, 3546), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3547), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3548), null, new AwS577S0100000_33((C03K6) this, 3549));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3550), awS577S0100000_33, AFwS224S0000000_33.get$arr$(489), new AwS577S0100000_33((C03K6) this, 3551), new AwS577S0100000_33((C03K6) this, 3552), new AwS577S0100000_33((C03K6) this, 3553), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3554));
        }
        this.LLILZ = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1852560yJC c1852560yJC = (C1852560yJC) interfaceC1891350zJl;
        super.onBindItemView(c1852560yJC);
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.xak);
        this.LLILLJJLI = (FrameLayout) this.itemView.findViewById(R.id.xai);
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZ()) {
            C1857690yRT.LJIILJJIL(this.LL, Float.valueOf(C418440Gaw.LIZIZ(12)));
        }
        BaseImage baseImage = c1852560yJC.LL;
        Context context = this.itemView.getContext();
        C346180Dhg c346180Dhg = new C346180Dhg(this, context, 0);
        if (C2137908Zd.LIZJ.LJFF(baseImage.localCachePath)) {
            String str = baseImage.localCachePath;
            if (str == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LJJIJL(context);
            c1331670kl3LJII.LJJ(this.LL);
            c1331670kl3LJII.LJIIL(c346180Dhg);
        } else {
            String str2 = baseImage.uri;
            if (str2 != null) {
                if (C1854460yMG.LIZIZ(str2)) {
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str2));
                    c1331670kl3LJI.LJJIJL(context);
                    c1331670kl3LJI.LJJ(this.LL);
                    c1331670kl3LJI.LJIIL(c346180Dhg);
                } else if (C1854460yMG.LIZ(str2)) {
                    C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str2));
                    c1331670kl3LJII2.LJJIJL(context);
                    c1331670kl3LJII2.LJJ(this.LL);
                    c1331670kl3LJII2.LJIIL(c346180Dhg);
                }
            }
        }
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.I7(new AbS512S0200000_27(this, c1852560yJC, 0), frameLayout);
        }
        this.LLILLL = this.itemView.findViewById(R.id.o1o);
    }
}
