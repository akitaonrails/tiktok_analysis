package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0PEM;
import X.C0SY5;
import X.C127A;
import X.C127K;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C13LE;
import X.C16GF;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C888970Yu7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC497601wk;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class ArchiveSettingPageCell extends PowerCell<C888970Yu7> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2318));
    public final AssemVMLazy LLILLJJLI;
    public C888970Yu7 LLILLL;
    public final InterfaceC497601wk LLILZ;
    public boolean LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArchiveSettingPageCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/archive/settings/ArchiveSettingPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.r_;
    }

    public ArchiveSettingPageCell() {
        AssemVMLazy assemVMLazy;
        InterfaceC497601wk lifecycleScope;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArchiveSettingPageViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2324);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(159);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2335), awS577S0100000_33, AFwS224S0000000_33.get$arr$(329), new AwS577S0100000_33((C03K6) this, 2309), new AwS577S0100000_33((C03K6) this, 2311), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2313), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2315), null, new AwS577S0100000_33((C03K6) this, 2316));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2310);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2312);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2314);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 89));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2317);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2319);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2320);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2321);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2322);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2323), awS577S0100000_33, AFwS224S0000000_33.get$arr$(330), new AwS577S0100000_33((C03K6) this, 2325), new AwS577S0100000_33((C03K6) this, 2326), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2327), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2328), null, new AwS577S0100000_33((C03K6) this, 2329));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2330), awS577S0100000_33, AFwS224S0000000_33.get$arr$(331), new AwS577S0100000_33((C03K6) this, 2331), new AwS577S0100000_33((C03K6) this, 2332), new AwS577S0100000_33((C03K6) this, 2333), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2334));
        }
        this.LLILLJJLI = assemVMLazy;
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.itemView.getContext());
        this.LLILZ = (lifecycleOwnerLIZIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) ? C2296808zG.LIZ(C0PEM.LIZJ) : lifecycleScope;
        this.LLILZIL = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        LayerDrawable layerDrawable;
        Drawable drawable;
        C888970Yu7 c888970Yu7 = (C888970Yu7) interfaceC1891350zJl;
        super.onBindItemView(c888970Yu7);
        this.LLILLL = c888970Yu7;
        this.LLILZIL = true;
        C127K c127k = (C127K) this.LL.getValue();
        if (c127k != null) {
            C127A c127a = new C127A(c127k.getContext());
            c127k.setTitle(c888970Yu7.LLILLJJLI);
            c127k.setSubtitle(c888970Yu7.LLILLL);
            c127a.LJIILJJIL(c888970Yu7.LLILZ);
            c127a.LJIILL(new AwS415S0200000_14(this, c888970Yu7, 140));
            c127k.setAccessory(c127a);
            c127k.LJ(c888970Yu7.LLILZIL, c888970Yu7.LLILZLL);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, c127k.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                Drawable background = c127k.getBackground();
                if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null && (drawable = layerDrawable.getDrawable(0)) != null) {
                    C16GF.LJI(drawable, iIntValue);
                }
            }
            C1383370m6R.LIZIZ(c127k, new AwS591S0100000_12(c888970Yu7, 1224));
        }
    }
}
