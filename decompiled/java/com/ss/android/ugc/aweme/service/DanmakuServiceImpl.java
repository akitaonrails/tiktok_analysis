package com.ss.android.ugc.aweme.service;

import X.C03H5;
import X.C0OM1;
import X.C0SXF;
import X.C11G4;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C1308910kAL;
import X.C1361050lWR;
import X.C1361150lWb;
import X.C1361160lWc;
import X.C1383760m74;
import X.C1383770m75;
import X.C1384500m8G;
import X.C1385270m9V;
import X.C1390920mIc;
import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C19EG;
import X.C2510709sf;
import X.C2510809sg;
import X.C300940Bqu;
import X.C523420Kfs;
import X.C692470REf;
import X.C786410Ut5;
import X.EnumC1361130lWZ;
import X.EnumC1361140lWa;
import X.EnumC255700yp;
import X.EnumC726810Sf9;
import X.InterfaceC1384330m7z;
import Y.ACListenerS31S1300000_21;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel;
import com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem;
import com.ss.android.ugc.aweme.DanmakuLandscapePresentAssem;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.DanmakuSwitchAssem;
import com.ss.android.ugc.aweme.IDanmakuService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.panel.DanmakuListFragment;
import com.ss.android.ugc.aweme.service.DanmakuServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuServiceImpl implements IDanmakuService {
    public final List<Integer> LIZ = C1697810uHb.LJIIJJI(40, 150, 160, 41, 43);

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIJ() {
        return C13LE.LIZ(DanmakuSwitchAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILL() {
        return C13LE.LIZ(DanmakuLandscapePresentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIJJ() {
        return C13LE.LIZ(DanmakuCreateEntranceAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJIIZI() {
        return C13LE.LIZ(DanmakuPresentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIILLIIL() {
        int i = C2510709sf.LIZ;
        int i2 = C2510709sf.LIZ;
        return i2 == 1 || i2 == 2;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIZILJ() {
        return ((Boolean) C1385270m9V.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIIJ() {
        boolean z = C2510809sg.LIZ;
        return C2510809sg.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIIZ() {
        int i = C2510709sf.LIZ;
        return C2510709sf.LIZ == 2;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIIZZ() {
        return C1385270m9V.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJII() {
        return C1361160lWc.LIZ();
    }

    public static boolean LIZ(Aweme aweme) {
        CommentService.LIZ.getClass();
        boolean zLJJIJIIJIL = C523420Kfs.LIZ().LJJIJIIJIL(aweme);
        if (!C523420Kfs.LIZ().LJIILLIIL(aweme) && zLJJIJIIJIL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIZ(Aweme aweme) {
        if (aweme == null || !aweme.isSupportDanmaku()) {
            return false;
        }
        if ((!C1385270m9V.LIZIZ() && !LJIILIIL(aweme)) || !LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIL(Aweme aweme) {
        if (aweme != null && !this.LIZ.contains(Integer.valueOf(aweme.getAwemeType())) && !AwemeExtKt.isAdTraffic(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIILIIL(Aweme aweme) {
        boolean z;
        String authorUid;
        if (C300940Bqu.LIZ() || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            return false;
        }
        if (aweme != null && aweme.isHasDanmaku()) {
            z = true;
        } else {
            z = false;
        }
        String curUserId = C1383770m75.LIZ().LJIIJ().getCurUserId();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (!Intrinsics.LJFF(curUserId, authorUid) || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJJ(String str) {
        IDanmakuDebugService iDanmakuDebugService = (IDanmakuDebugService) C1383770m75.LIZIZ.getValue();
        if (iDanmakuDebugService != null) {
            iDanmakuDebugService.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIFFI(Aweme aweme) {
        String authorUid;
        if (aweme == null || !aweme.isSupportDanmaku()) {
            return false;
        }
        String curUserId = C1383770m75.LIZ().LJIIJ().getCurUserId();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        boolean zLJFF = Intrinsics.LJFF(curUserId, authorUid);
        if (!LIZ(aweme) && !zLJFF) {
            return false;
        }
        if (C1385270m9V.LIZIZ() || LJIILIIL(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIII(Aweme aweme) {
        if (!((Boolean) C1385270m9V.LIZJ.getValue()).booleanValue()) {
            if (LJIILIIL(aweme) && !C1385270m9V.LIZIZ()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        if (aweme == null || !aweme.isSupportDanmaku()) {
            return false;
        }
        if ((!C1385270m9V.LIZIZ() && !LJIILIIL(aweme)) || !C1361160lWc.LIZ() || !LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIILJJIL(ViewGroup viewGroup, Aweme aweme) {
        IDanmakuDebugService iDanmakuDebugService;
        if (viewGroup != null && (iDanmakuDebugService = (IDanmakuDebugService) C1383770m75.LIZIZ.getValue()) != null) {
            iDanmakuDebugService.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r4
      0x000f: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:7:0x000d, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.IDanmakuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.feed.model.Aweme r9, final java.lang.String r10) {
        /*
            r8 = this;
            X.00HD r2 = new X.00HD
            java.lang.String r5 = ""
            if (r9 == 0) goto Lc
            java.lang.String r4 = r9.getAid()
            if (r4 != 0) goto Lf
        Lc:
            r4 = r5
            if (r9 == 0) goto L16
        Lf:
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r9)
            if (r0 == 0) goto L16
            r5 = r0
        L16:
            com.ss.android.ugc.aweme.IAccountService r0 = X.C1383770m75.LIZ()
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            java.lang.String r6 = r0.getCurUserId()
            if (r9 == 0) goto L40
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r9)
        L28:
            com.ss.android.ugc.aweme.IAccountService r0 = X.C1383770m75.LIZ()
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            java.lang.String r0 = r0.getCurUserId()
            boolean r7 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            X.C1355310lNB.LIZ(r2)
            return
        L40:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.DanmakuServiceImpl.LJIJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIJJLI(Lifecycle lifecycle, EnumC726810Sf9 enumC726810Sf9) {
        String strLJJIFFI;
        String str;
        if (!C692470REf.LIZ()) {
            return;
        }
        DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModel = (DanmakuContinuallyPlayViewModel) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycle, DanmakuContinuallyPlayViewModel.class);
        danmakuContinuallyPlayViewModel.LLJILJIL = enumC726810Sf9;
        if (!C1383760m74.LIZIZ.LJJIIJZLJL(danmakuContinuallyPlayViewModel.LL)) {
            danmakuContinuallyPlayViewModel.LLJIJIL = false;
            danmakuContinuallyPlayViewModel.reset();
            return;
        }
        danmakuContinuallyPlayViewModel.LLJIJIL = true;
        Function0<Unit> function0 = danmakuContinuallyPlayViewModel.LLJ;
        if (function0 != null) {
            function0.invoke();
        }
        AwS565S0100000_21 awS565S0100000_21 = danmakuContinuallyPlayViewModel.LLJILJILJ;
        if (awS565S0100000_21 != null) {
            awS565S0100000_21.invoke();
        }
        C1384500m8G c1384500m8G = danmakuContinuallyPlayViewModel.LLJI;
        if (c1384500m8G != null) {
            c1384500m8G.LIZ = null;
        }
        InterfaceC1384330m7z interfaceC1384330m7z = danmakuContinuallyPlayViewModel.LLILLJJLI;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.pause();
        }
        DanmakuViewModel danmakuViewModel = danmakuContinuallyPlayViewModel.LLIZLLLIL.get();
        if (danmakuViewModel == null) {
            return;
        }
        danmakuContinuallyPlayViewModel.LLILZ = danmakuViewModel.LLILLJJLI;
        danmakuContinuallyPlayViewModel.LLILZIL = danmakuViewModel.LLILZIL;
        VideoItemParams item = danmakuViewModel.getItem();
        if (item != null && (str = item.mEventType) != null) {
            strLJJIFFI = C0SXF.LJJIFFI(null, Boolean.FALSE, str);
        } else {
            strLJJIFFI = null;
        }
        danmakuContinuallyPlayViewModel.LLILZLL = strLJJIFFI;
        danmakuContinuallyPlayViewModel.LLIZ = danmakuViewModel.AQ2();
        danmakuViewModel.LLILLJJLI = null;
        danmakuViewModel.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJJIJ(String str, String str2) {
        IDanmakuDebugService iDanmakuDebugService = (IDanmakuDebugService) C1383770m75.LIZIZ.getValue();
        if (iDanmakuDebugService != null) {
            iDanmakuDebugService.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIIJJI(C19EG c19eg, String str, Aweme aweme) {
        if (c19eg == null || aweme == null) {
            return;
        }
        DanmakuListFragment danmakuListFragment = new DanmakuListFragment();
        danmakuListFragment.LLILZIL = aweme;
        danmakuListFragment.LLILZLL = str;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJI = danmakuListFragment;
        tuxSheet.LLJJIJIIJIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19eg);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJI = numLIZJ;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "DanmakuList");
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIJ(Aweme aweme, String str, boolean z) {
        if (aweme == null) {
            return;
        }
        C1361050lWR c1361050lWR = C1361050lWR.LIZ;
        EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.LONG_PRESS;
        EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
        c1361050lWR.getClass();
        C1361050lWR.LIZJ(z, aweme, str, enumC1361130lWZ, enumC255700yp);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIL(Aweme aweme, String str, boolean z) {
        EnumC1361140lWa enumC1361140lWa;
        if (C2510809sg.LIZ) {
            enumC1361140lWa = EnumC1361140lWa.DANMAKU_SETTING;
        } else if (z) {
            enumC1361140lWa = EnumC1361140lWa.HIDE;
        } else {
            enumC1361140lWa = EnumC1361140lWa.SHOW;
        }
        C1361150lWb c1361150lWb = C1361150lWb.LIZ;
        EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.LONG_PRESS;
        EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
        c1361150lWb.getClass();
        C1361150lWb.LJIIIIZZ(aweme, str, enumC1361140lWa, enumC1361130lWZ, enumC255700yp);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJJI(C19EG c19eg, final String str, final Aweme aweme) {
        if (c19eg == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(c19eg);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        C127K c127k = new C127K(c19eg, null, 6);
        c127k.setTitle(c127k.getContext().getString(2131838773));
        final C127A c127a = new C127A(c127k.getContext());
        c127a.LJIILJJIL(C1383760m74.LIZIZ.LJJII());
        c127a.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0lR9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                c127a.LJIILJJIL(z);
                DanmakuServiceImpl danmakuServiceImpl = this;
                Aweme aweme2 = aweme;
                String str2 = str;
                danmakuServiceImpl.getClass();
                if (aweme2 != null) {
                    C1361050lWR c1361050lWR = C1361050lWR.LIZ;
                    EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.LONG_PRESS;
                    EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
                    c1361050lWR.getClass();
                    C1361050lWR.LIZJ(z, aweme2, str2, enumC1361130lWZ, enumC255700yp);
                    String aid = aweme2.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    C1355310lNB.LIZ(new C255600yo(str2, aid, AwemeExtKt.getAuthorUid(aweme2), C1383770m75.LIZ().LJIIJ().getCurUserId(), Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme2), C1383770m75.LIZ().LJIIJ().getCurUserId()), z, EnumC1361130lWZ.DANMAKU_LIST.getValue()));
                }
            }
        });
        c127k.setAccessory(c127a);
        linearLayout.addView(c127k);
        C127K c127k2 = new C127K(c19eg, null, 6);
        c127k2.setTitle(c127k2.getContext().getString(2131838774));
        C11G4 c11g4 = new C11G4(c127k2.getContext(), null);
        c11g4.LJIILL(new ACListenerS31S1300000_21(linearLayout, c19eg, aweme, str, 0));
        c127k2.setAccessory(c11g4);
        linearLayout.addView(c127k2);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = c19eg.getString(2131838775);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS550S0100000_6(linearLayout, 1167));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = false;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LLJJIII = linearLayout;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c19eg);
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJI = numLIZJ;
        tuxSheet3.show(c19eg.getSupportFragmentManager(), "DanmakuControl");
    }
}
