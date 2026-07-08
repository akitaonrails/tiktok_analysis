package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC443520HaI;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C090F;
import X.C099F;
import X.C0GUL;
import X.C0PEM;
import X.C1180600gpO;
import X.C1180700gpY;
import X.C1180720gpa;
import X.C1189360h3W;
import X.C1200090hKp;
import X.C1200690hLn;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C1848410yCV;
import X.C19EG;
import X.C19EH;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C23250099c;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC1338240kve;
import X.InterfaceC1177250gjz;
import X.InterfaceC1331910klR;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import avg.f;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import mf.a;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimMapAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public InterfaceC1177250gjz LLJ;
    public C0GUL LLJI;
    public final C099F LLJIJIL;
    public Fragment LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public final C01GW LLJJ;

    public PoiClaimMapAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(276);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(PoiClaimPoiListViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(279), new AwS562S0100000_18((AbstractC738140SxQ) this, 883), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C090F.LIZIZ();
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 882));
    }

    public final void Go(final PoiData poiData) {
        AbstractC443520HaI abstractC443520HaI;
        Context context = getContext();
        if (context == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addMarker poi name=");
        sbLIZ.append(poiData.name);
        C2188811AlT.LIZIZ(sbLIZ);
        final C1180700gpY c1180700gpY = new C1180700gpY(context);
        final AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 240);
        final String str = poiData.poiTitleImg;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateData imgUrl=");
            sbLIZ2.append(str);
            sbLIZ2.append(", generator hashCode=");
            sbLIZ2.append(c1180700gpY.hashCode());
            C2188811AlT.LIZIZ(sbLIZ2);
            SoftReference<AbstractC443520HaI> softReferenceLIZJ = C1180720gpa.LIZ.LIZJ(str);
            if (softReferenceLIZJ != null && (abstractC443520HaI = softReferenceLIZJ.get()) != null) {
                c1180700gpY.LIZJ(poiData, abstractC443520HaI, awS597S0100000_18);
                return;
            }
            C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_claim", "poi_claim_map_marker", null).LIZIZ(str);
            c1189360h3WLIZIZ.LIZ.LJIL = Bitmap.Config.RGB_565;
            int i = c1180700gpY.LIZJ;
            c1189360h3WLIZIZ.LJI(i, i);
            c1189360h3WLIZIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZIZ.LJ(new InterfaceC1331910klR() { // from class: X.0gpZ
                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        C1180700gpY c1180700gpY2 = c1180700gpY;
                        String str2 = str;
                        PoiData poiData2 = poiData;
                        Function1<View, Unit> function1 = awS597S0100000_18;
                        C443530HaJ c443530HaJLIZIZ = C1180700gpY.LIZIZ(c1180700gpY2.LIZ, bitmap);
                        C1180720gpa.LIZ.LIZLLL(str2, new SoftReference<>(c443530HaJLIZIZ));
                        c1180700gpY2.LIZJ(poiData2, c443530HaJLIZIZ, function1);
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    c1180700gpY.LIZ(poiData, awS597S0100000_18);
                }

                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }
            });
            return;
        }
        c1180700gpY.LIZ(poiData, awS597S0100000_18);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Fragment fragmentYj2;
        Fragment fragment;
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        C19EG c19egLIZIZ2;
        FragmentManager supportFragmentManager2;
        super.onViewCreated(view);
        C0GUL c0gul = (C0GUL) view.findViewById(R.id.qym);
        this.LLJI = c0gul;
        if (c0gul != null) {
            View.OnClickListener aCListenerS153S0100000_18 = new ACListenerS153S0100000_18(this, 174);
            if (C1848410yCV.LIZ) {
                aCListenerS153S0100000_18 = new f(aCListenerS153S0100000_18);
            }
            a aVar = new a(aCListenerS153S0100000_18);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0gul);
            }
            c0gul.setOnClickListener(aVar);
        }
        IPoiClaimFragmentAbility iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) this.LLJJ.getValue();
        if (iPoiClaimFragmentAbility != null) {
            fragmentYj2 = iPoiClaimFragmentAbility.yj2();
        } else {
            fragmentYj2 = null;
        }
        this.LLJILJIL = fragmentYj2;
        Context context2 = getContext();
        if ((context2 == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) == null || (supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager()) == null || supportFragmentManager2.LJJJJZ(R.id.qym) == null) && (fragment = this.LLJILJIL) != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(R.id.qym, fragment);
            c19ehLJIIJ.LJIIIZ();
        }
        IPoiClaimFragmentAbility iPoiClaimFragmentAbility2 = (IPoiClaimFragmentAbility) this.LLJJ.getValue();
        if (iPoiClaimFragmentAbility2 != null) {
            iPoiClaimFragmentAbility2.X(new AwS597S0100000_18(this, 899));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0hKt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1200090hKp) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 271), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0hLk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1200090hKp) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 272), 4);
        if (((C1200090hKp) ((AssemViewModel) this.LLIZLLLIL.getValue()).getState()).LLILLJJLI == null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1200690hLn(this, null), 2);
        }
    }
}
