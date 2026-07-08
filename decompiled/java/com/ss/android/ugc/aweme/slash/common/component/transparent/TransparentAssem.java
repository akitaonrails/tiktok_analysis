package com.ss.android.ugc.aweme.slash.common.component.transparent;

import X.C019F;
import X.C13LE;
import X.C14K4;
import X.C1533950q1J;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C2217381BqS;
import X.C338990DQr;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TransparentAssem extends BaseSlashReusedComponent<TransparentModule> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final int LLJL;
    public C338990DQr LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TransparentAssem.class, "slashHeaderLayoutVm", "getSlashHeaderLayoutVm()Lcom/ss/android/ugc/aweme/slash/common/component/transparent/PoiSlashHeaderLayoutViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TransparentAssem() {
        this(0);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f9f;
    }

    public final int tp() {
        Window window;
        View decorView;
        C20246014Ju c20246014JuLIZ;
        C20244914Jj c20244914JjLIZ;
        Resources resources;
        Context context = getContext();
        int i = 0;
        int dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.b3i);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (c20246014JuLIZ = C14K4.LIZ(decorView)) != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(1)) != null) {
            i = c20244914JjLIZ.LIZIZ;
        }
        return dimensionPixelSize + i;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    public TransparentAssem(int i) {
        this.LLJL = 0;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiSlashHeaderLayoutViewModel.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2229), AFwS256S0000000_18.get$arr$(750), null, true);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLIL = (C338990DQr) view.findViewById(R.id.yje);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final void up(TransparentModule transparentModule) {
        int iLIZIZ;
        int iTp;
        int iLIZIZ2;
        C338990DQr c338990DQr;
        ViewGroup.LayoutParams layoutParams;
        super.up(transparentModule);
        if (C1533950q1J.LJ(transparentModule.getTopHeightStyle())) {
            Context context = LJJIJL().getContext();
            if (context != null) {
                int iLIZLLL = C418440Gaw.LIZLLL(context);
                float f = 1.3384615f;
                if (Intrinsics.LJFF(transparentModule.getTopHeightStyle(), "3")) {
                    AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
                    iLIZIZ = ((PoiSlashHeaderLayoutViewModel) assemVMLazy.getValue()).LL;
                    if (iLIZIZ > 0) {
                        iTp = tp();
                    } else {
                        iLIZIZ = ((int) (((int) (((iLIZLLL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / 2.8f)) * 1.3384615f)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148));
                        iTp = tp();
                    }
                } else {
                    float fLIZIZ = (int) (((iLIZLLL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) / 2.8f);
                    String topHeightStyle = transparentModule.getTopHeightStyle();
                    if (!Intrinsics.LJFF(topHeightStyle, "1")) {
                        Intrinsics.LJFF(topHeightStyle, "2");
                        f = 1.0f;
                    }
                    iLIZIZ2 = ((int) (fLIZIZ * f)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    if (this.LLJL != 0 && (c338990DQr = this.LLJLIL) != null && (layoutParams = c338990DQr.getLayoutParams()) != null) {
                        layoutParams.height = iLIZIZ2;
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(transparentModule.getHeight())));
            AssemVMLazy assemVMLazy2 = this.LLJLILLLLZIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJLL;
            Integer numValueOf = Integer.valueOf(((PoiSlashHeaderLayoutViewModel) assemVMLazy2.getValue()).LL);
            if (numValueOf.intValue() > iLIZIZ) {
                iLIZIZ = numValueOf.intValue();
            }
            iTp = tp();
        }
        iLIZIZ2 = iLIZIZ - iTp;
        if (this.LLJL != 0) {
        }
    }
}
