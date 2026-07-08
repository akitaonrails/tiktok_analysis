package com.ss.android.ugc.aweme.music.assem;

import X.C019F;
import X.C01GW;
import X.C036E;
import X.C09R3;
import X.C1257170iot;
import X.C1264160j0A;
import X.C127G;
import X.C1390410mHn;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C615950ODx;
import X.C631230OpN;
import X.C632120Oqo;
import X.C632210Oqx;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1749320vcg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC633970Otn;
import Y.AObjectS384S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicStatusAssem extends UISlotAssem implements InterfaceC633970Otn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJJJIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final AssemVMLazy LLJLIL;
    public ViewModelProvider.Factory LLJLILLLLZIIL;
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public boolean LLJJJJ = true;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 923));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 917));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicStatusAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicStatusAssem.class, "legacyViewModel", "getLegacyViewModel()Lcom/ss/android/ugc/aweme/music/vm/LegacyCommunicateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MusicStatusAssem.class, "musicPlayModel", "getMusicPlayModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLLIL = 8;
    }

    public MusicStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 920), AFwS240S0000000_9.get$arr$(419), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LegacyCommunicateViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 921), AFwS240S0000000_9.get$arr$(420), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 922), AFwS240S0000000_9.get$arr$(421), null, true);
    }

    private Function0 Bp() {
        return new AObjectS384S0100000_9(this, 18);
    }

    private Function0 Ep() {
        return new AObjectS384S0100000_9(this, 17);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.egp;
    }

    @Override // X.InterfaceC633970Otn, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Gp() {
        /*
            r2 = this;
            boolean r0 = r2.LLJJI
            if (r0 != 0) goto L3e
            boolean r0 = r2.LLJJIJIIJIL
            if (r0 != 0) goto L3e
            boolean r0 = r2.LLJJIII
            if (r0 != 0) goto L3e
            boolean r0 = r2.LLJJIJI
            if (r0 != 0) goto L3e
            boolean r0 = r2.LLJJIJIL
            if (r0 != 0) goto L3e
            boolean r0 = r2.LLJJJ
            if (r0 != 0) goto L3e
            X.0Oqx r0 = X.C632210Oqx.LIZ
            r0.getClass()
            boolean r0 = X.C632210Oqx.LJI()
            if (r0 != 0) goto L3e
            r1 = 0
        L24:
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r0 = r2.op()
            boolean r0 = r0.LLIZ
            if (r0 == r1) goto L3d
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r0 = r2.op()
            r0.LLIZ = r1
            boolean r0 = r2.LLILZ
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r0 = r2.op()
            r0.refresh()
        L3d:
            return
        L3e:
            r1 = 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.MusicStatusAssem.Gp():void");
    }

    public final OriginMusicArg lp() {
        return (OriginMusicArg) this.LLJJJIL.getValue();
    }

    public final LegacyCommunicateViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (LegacyCommunicateViewModel) assemVMLazy.getValue();
    }

    public final OriginMusicListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    public final C1390410mHn sp() {
        return (C1390410mHn) this.LLJJL.getValue();
    }

    public final MusicPlayViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc up() {
        return (C1749280vcc) this.LLJJJJLIIL.getValue();
    }

    private final void yp() {
        up().LIZ(new InterfaceC1749320vcg() { // from class: X.0OtW
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                this.LIZ.sp().LIZLLL();
                C786410Ut5.LLLZZIL(this.LIZ.sp(), 8);
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                this.LIZ.sp().LIZJ();
                C786410Ut5.LLLZZIL(this.LIZ.sp(), 0);
            }
        });
        C2211631BhB.LJ(up(), new AwS588S0100000_9(this, 256));
    }

    public final void Fp() {
        String string;
        Resources resources;
        String string2;
        Resources resources2;
        Context context;
        String string3;
        Context context2;
        String string4;
        User user;
        Resources resources3;
        String string5;
        Resources resources4;
        String string6;
        Resources resources5;
        String string7;
        Resources resources6;
        String string8;
        String string9;
        Resources resources7;
        String string10;
        Resources resources8;
        String string11;
        Resources resources9;
        C631230OpN.LIZJ(up());
        up().setTopMargin(C418440Gaw.LIZIZ(86));
        String str = "";
        if (this.LLJJI) {
            C1749280vcc c1749280vccUp = up();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            Context context3 = getContext();
            if (context3 == null || (resources9 = context3.getResources()) == null || (string10 = resources9.getString(2131850172)) == null) {
                string10 = "";
            }
            c1722300uv6.LJI = string10;
            Context context4 = getContext();
            if (context4 != null && (resources8 = context4.getResources()) != null && (string11 = resources8.getString(2131829000)) != null) {
                str = string11;
            }
            c1722300uv6.LJIIIIZZ = str;
            c1749280vccUp.setStatus(c1722300uv6);
        } else if (this.LLJJIJIL || this.LLJJIJI) {
            C1749280vcc c1749280vccUp2 = up();
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            Context context5 = getContext();
            if (context5 == null || (resources2 = context5.getResources()) == null || (string = resources2.getString(2131822989)) == null) {
                string = "";
            }
            c1722300uv62.LJI = string;
            Context context6 = getContext();
            if (context6 != null && (resources = context6.getResources()) != null && (string2 = resources.getString(2131822987)) != null) {
                str = string2;
            }
            c1722300uv62.LJIIIIZZ = str;
            c1749280vccUp2.setStatus(c1722300uv62);
        } else {
            if (this.LLJJIJIIJIL) {
                C1749280vcc c1749280vccUp3 = up();
                C1722300uv6 c1722300uv63 = new C1722300uv6();
                Context context7 = getContext();
                if (context7 == null || (resources7 = context7.getResources()) == null || (string8 = resources7.getString(2131822977)) == null) {
                    string8 = "";
                }
                c1722300uv63.LJI = string8;
                Context context8 = getContext();
                if (context8 != null && (string9 = context8.getString(2131822976)) != null) {
                    str = string9;
                }
                Object[] objArr = new Object[1];
                C632210Oqx c632210Oqx = C632210Oqx.LIZ;
                OriginMusicArg originMusicArgLp = lp();
                user = originMusicArgLp != null ? originMusicArgLp.getUser() : null;
                c632210Oqx.getClass();
                objArr[0] = C632210Oqx.LJ(user);
                c1722300uv63.LJIIIIZZ = C786410Ut5.j4(str, Arrays.copyOf(objArr, 1));
                c1749280vccUp3.setStatus(c1722300uv63);
            } else if (this.LLJJJ) {
                C1749280vcc c1749280vccUp4 = up();
                C1722300uv6 c1722300uv64 = new C1722300uv6();
                Context context9 = getContext();
                if (context9 == null || (resources6 = context9.getResources()) == null || (string6 = resources6.getString(2131824639)) == null) {
                    string6 = "";
                }
                Object[] objArr2 = new Object[1];
                C632210Oqx c632210Oqx2 = C632210Oqx.LIZ;
                OriginMusicArg originMusicArgLp2 = lp();
                user = originMusicArgLp2 != null ? originMusicArgLp2.getUser() : null;
                c632210Oqx2.getClass();
                objArr2[0] = C632210Oqx.LJ(user);
                c1722300uv64.LJI = C786410Ut5.j4(string6, Arrays.copyOf(objArr2, 1));
                Context context10 = getContext();
                if (context10 != null && (resources5 = context10.getResources()) != null && (string7 = resources5.getString(2131824638)) != null) {
                    str = string7;
                }
                c1722300uv64.LJIIIIZZ = str;
                c1749280vccUp4.setStatus(c1722300uv64);
            } else if (this.LLJJIII) {
                C1749280vcc c1749280vccUp5 = up();
                C1722300uv6 c1722300uv65 = new C1722300uv6();
                Context context11 = getContext();
                if (context11 == null || (resources4 = context11.getResources()) == null || (string4 = resources4.getString(2131822983)) == null) {
                    string4 = "";
                }
                Object[] objArr3 = new Object[1];
                C632210Oqx c632210Oqx3 = C632210Oqx.LIZ;
                OriginMusicArg originMusicArgLp3 = lp();
                user = originMusicArgLp3 != null ? originMusicArgLp3.getUser() : null;
                c632210Oqx3.getClass();
                objArr3[0] = C632210Oqx.LJ(user);
                c1722300uv65.LJI = C786410Ut5.j4(string4, Arrays.copyOf(objArr3, 1));
                Context context12 = getContext();
                if (context12 != null && (resources3 = context12.getResources()) != null && (string5 = resources3.getString(2131822982)) != null) {
                    str = string5;
                }
                c1722300uv65.LJIIIIZZ = str;
                c1749280vccUp5.setStatus(c1722300uv65);
            } else if (kp(getContext())) {
                C1749280vcc c1749280vccUp6 = up();
                C1722300uv6 c1722300uv66 = new C1722300uv6();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_2pt_info_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                c1722300uv66.LIZJ = 0;
                c1722300uv66.LIZIZ = c419910GdJ;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c1722300uv66.LIZLLL = iLIZIZ;
                c1722300uv66.LJ = iLIZIZ2;
                OriginMusicArg originMusicArgLp4 = lp();
                if (originMusicArgLp4 == null || !originMusicArgLp4.isMe() ? !((context = getContext()) == null || (string3 = context.getString(2131838145)) == null) : !((context2 = getContext()) == null || (string3 = context2.getString(2131838144)) == null)) {
                    str = string3;
                }
                c1722300uv66.LJI = str;
                c1749280vccUp6.setStatus(c1722300uv66);
            } else {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    OriginMusicArg originMusicArgLp5 = lp();
                    C1257170iot.LIZIZ(c19egLIZ, (originMusicArgLp5 == null || !originMusicArgLp5.isMe()) ? "others_music_tab" : "personal_music_tab", null, up());
                }
                C1749280vcc c1749280vccUp7 = up();
                OriginMusicArg originMusicArgLp6 = lp();
                C1264160j0A.LIZIZ(c1749280vccUp7, (originMusicArgLp6 == null || !originMusicArgLp6.isMe()) ? "others_music_tab" : "personal_music_tab", null, new AwS553S0100000_9(this, 919));
            }
        }
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showError ");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(' ');
        sbLIZ.append(kp(getContext()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        ViewModelProvider.Factory factory = this.LLJLILLLLZIIL;
        if (factory == null) {
            synchronized (this) {
                factory = this.LLJLILLLLZIIL;
                if (factory == null) {
                    C127G c127g = new C127G(new Object[]{OriginMusicListViewModel.class, Bp(), MusicPlayViewModel.class, Ep()}, defaultViewModelProviderFactory);
                    this.LLJLILLLLZIIL = c127g;
                    return c127g;
                }
            }
        }
        return factory;
    }

    public static MusicPlayViewModel Ap(MusicStatusAssem musicStatusAssem) {
        return new MusicPlayViewModel();
    }

    public static boolean kp(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static OriginMusicListViewModel zp(MusicStatusAssem musicStatusAssem) {
        return new OriginMusicListViewModel(new C615950ODx());
    }

    @Override // X.InterfaceC633970Otn
    public void HP(boolean z) {
        this.LLJJIJIIJIL = z;
        Gp();
    }

    @Override // X.InterfaceC633970Otn
    public void Sl(boolean z) {
        this.LLJJIJIL = z;
        Gp();
    }

    @Override // X.InterfaceC633970Otn
    public void Wb(boolean z) {
        this.LLJJIII = z;
        Gp();
    }

    @Override // X.InterfaceC633970Otn
    public void b(boolean z) {
        this.LLJJI = z;
        Gp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        OriginMusicListViewModel originMusicListViewModelOp = op();
        AssemViewModel.asyncSubscribe$default(originMusicListViewModelOp, new C2217381BqS() { // from class: X.0OtU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZLLL(c632540OrU);
            }
        }, null, new AwS588S0100000_9(this, 257), new AwS553S0100000_9(this, 918), new AwS375S0200000_9(originMusicListViewModelOp, this, 62), 2, null);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelOp, new C2217381BqS() { // from class: X.0OtV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZ(c632540OrU);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 88), 4);
        C736680Sv4.LJIIIIZZ(this, originMusicListViewModelOp, new C2217381BqS() { // from class: X.0Ot2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C632540OrU) obj).LL);
            }
        }, null, new AwS623S0100000_9(this, 89), 6);
        yp();
        Gp();
    }

    @Override // X.InterfaceC633970Otn
    public void ro(boolean z) {
        this.LLJJIJI = z;
        Gp();
    }

    @Override // X.InterfaceC633970Otn
    public void vs(boolean z) {
        this.LLJJJ = z;
        Gp();
    }
}
