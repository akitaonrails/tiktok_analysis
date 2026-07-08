package com.ss.android.ugc.profile.business.ur.aigc;

import X.AbstractC19486711Lt;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C08CX;
import X.C09JN;
import X.C0CCH;
import X.C0PEM;
import X.C1157130gDX;
import X.C11L2;
import X.C11NJ;
import X.C11NZ;
import X.C11PQ;
import X.C11S5;
import X.C1220990hsX;
import X.C1221030hsb;
import X.C1221150hsn;
import X.C1221230hsv;
import X.C1221260hsy;
import X.C1221370ht9;
import X.C1221520htO;
import X.C1221530htP;
import X.C1221580htU;
import X.C1221880hty;
import X.C1239300iM4;
import X.C1255030ilR;
import X.C1331660kl2;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1770850wBP;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2179208gI;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2314511Fij;
import X.C291001Au;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C477601tW;
import X.C627660Ojc;
import X.C948503nH;
import X.EnumC1221220hsu;
import X.EnumC1221250hsx;
import X.EnumC1221310ht3;
import X.EnumC1221420htE;
import X.EnumC584790Mwf;
import X.InterfaceC0148002o;
import X.InterfaceC1221470htJ;
import X.InterfaceC1221570htT;
import X.InterfaceC1221660htc;
import X.InterfaceC1364105Vn;
import X.InterfaceC20013113Sf;
import Y.AfS188S0100000_19;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcAvatarViewModel extends AssemListViewModel<C1221150hsn, C1220990hsX, C2314511Fij> {
    public C1221530htP LL;
    public String LLILZ;
    public InterfaceC1221470htJ LLILZIL;
    public int LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public C11L2 LLJILJIL;
    public List<AIGCQuota> LLJILLL;
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(403));
    public boolean LLJ = true;
    public final C2179208gI LLJI = new C2179208gI();
    public final C1221370ht9 LLJIJIL = new C1221370ht9(this);
    public final C11PQ<List<AIGCQuota>> LLJILJILJ = new C11PQ<>();
    public final C1221520htO LLJJ = new InterfaceC1221660htc() { // from class: X.0htO
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
        @Override // X.InterfaceC1221660htc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onUpdate(X.C1221710hth r22) {
            /*
                Method dump skipped, instruction units count: 381
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1221520htO.onUpdate(X.0hth):void");
        }
    };
    public final List<C1220990hsX> LLJJI = new ArrayList();
    public final C1221230hsv LLJJIII = new C1221230hsv(EnumC1221220hsu.IDLE, 0);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1221150hsn(new C291001Au(C13BV.INSTANCE), new C291001Au(C08CX.INSTANCE), new C291001Au(null), new C291001Au(EnumC1221420htE.AVATAR_CHANGE), new C291001Au(EnumC584790Mwf.FAST), new C291001Au(new C1221260hsy(EnumC1221310ht3.DISABLE, 0)), new C291001Au(EnumC1221250hsx.DISMISS), new C291001Au(new C1221230hsv(EnumC1221220hsu.IDLE, 0, 6)), new C291001Au(C0CCH.IDLE), new C627660Ojc(null, null, null, null, 15));
    }

    public final void xQ2() {
        final String str = this.LLILZ;
        if (str == null) {
            L1(2131820651);
            return;
        }
        AQ2(EnumC1221310ht3.GENERATING, 0);
        this.LLILZLL++;
        this.LLILLJJLI.LIZ(C1239300iM4.LJFF(AbstractC19486711Lt.LJIIL(new Callable() { // from class: X.0ht5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2;
                C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.fetchMoreAvatars$1$1");
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LL;
                profileAigcAvatarViewModel.LLILZIL = ((IAIGCAvatarService) profileAigcAvatarViewModel.LLILLL.getValue()).dr(str);
                InterfaceC1221470htJ interfaceC1221470htJ = this.LL.LLILZIL;
                if (interfaceC1221470htJ != null) {
                    interfaceC1221470htJ.start();
                }
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = this.LL;
                InterfaceC1221470htJ interfaceC1221470htJ2 = profileAigcAvatarViewModel2.LLILZIL;
                if (interfaceC1221470htJ2 != null) {
                    interfaceC1221470htJ2.registerListener(profileAigcAvatarViewModel2.LLJJ);
                }
                C1221880hty c1221880hty = C1221880hty.LIZ;
                String string = ((C1221150hsn) this.LL.getState()).LLILZIL.LIZ.toString();
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel3 = this.LL;
                C1221530htP c1221530htP = profileAigcAvatarViewModel3.LL;
                String str3 = null;
                if (c1221530htP != null) {
                    str3 = c1221530htP.LLILLJJLI;
                    str2 = c1221530htP.LLILLL;
                } else {
                    str2 = null;
                }
                C1221880hty.LIZLLL(c1221880hty, string, "generate_more", str3, str2, 0, Integer.valueOf(profileAigcAvatarViewModel3.LLILZLL), null, 64);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.fetchMoreAvatars$1$1");
                return unit;
            }
        }).LJIJJLI(C11S5.LIZ()), AFwS257S0000000_19.get$arr$(362)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.LJ();
        InterfaceC1221470htJ interfaceC1221470htJ = this.LLILZIL;
        if (interfaceC1221470htJ != null) {
            interfaceC1221470htJ.unregisterListener(this.LLJJ);
        }
    }

    public final void BQ2(EnumC1221420htE enumC1221420htE) {
        setState(new AwS598S0100000_19(enumC1221420htE, 346));
    }

    public final void CQ2(List<String> list) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update avatar list: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            ArrayList arrayList2 = (ArrayList) this.LLJJI;
            arrayList.add(Boolean.valueOf(arrayList2.add(new C1220990hsX(new C1221030hsb(String.valueOf(arrayList2.size() + 1), str)))));
        }
        listSetItems(this.LLJJI);
        setState(new AwS598S0100000_19(this, 347));
    }

    public final void L1(int i) {
        C19EG c19eg;
        if (!this.LLJ) {
            return;
        }
        this.LLJ = false;
        this.LLILLJJLI.LIZ(C11NZ.LJLJJLL(3000L, TimeUnit.MILLISECONDS).LJJLL(new AfS188S0100000_19(this, 41), new C09JN() { // from class: X.0htF
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.showToast$2");
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZLLL((Throwable) obj);
                C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.showToast$2");
            }
        }));
        C1221530htP c1221530htP = this.LL;
        if (c1221530htP != null && (c19eg = c1221530htP.LLILZIL) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJI(this, C2107308Nj.LIZ, new C477601tW(c19eg, i, null));
        } else {
            int i2 = C2187451AjH.LIZ;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1220990hsX> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 343));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C2314511Fij>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<C1220990hsX> list = this.LLJJI;
        c317290CcB.getClass();
        return new C316640Cb8(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0htB] */
    public final void vQ2(final C19EG c19eg) {
        final String str;
        String str2;
        String str3;
        C1221030hsb c1221030hsb = ((C1221150hsn) getState()).LLILLL.LIZ;
        if (c1221030hsb != null && (str = c1221030hsb.LIZIZ) != null) {
            C1221880hty c1221880hty = C1221880hty.LIZ;
            String string = ((C1221150hsn) getState()).LLILZIL.LIZ.toString();
            C1221530htP c1221530htP = this.LL;
            if (c1221530htP != null) {
                str2 = c1221530htP.LLILLJJLI;
                str3 = c1221530htP.LLILLL;
            } else {
                str2 = null;
                str3 = null;
            }
            C1221880hty.LIZLLL(c1221880hty, string, "continue", str2, str3, 0, null, null, 112);
            final C1255030ilR c1255030ilR = new C1255030ilR();
            c1255030ilR.LJI(c19eg, null, -1, null);
            final ?? r13 = new InterfaceC20013113Sf() { // from class: X.0htB
                @Override // X.InterfaceC20013113Sf
                public final void LIZIZ() {
                    this.LIZ.setState(AFwS257S0000000_19.get$arr$(714));
                }

                @Override // X.InterfaceC20013113Sf
                public final void LIZJ(String str4) {
                    this.LIZ.setState(AFwS257S0000000_19.get$arr$(719));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC20013113Sf
                public final void LIZ(Uri uri, String str4) {
                    this.LIZ.setState(AFwS257S0000000_19.get$arr$(713));
                    if (uri != null) {
                        C1255030ilR c1255030ilR2 = c1255030ilR;
                        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZ;
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("file uri: ");
                        sbLIZ.append(uri);
                        C2188811AlT.LIZIZ(sbLIZ);
                        Intent intent = new Intent();
                        intent.setData(uri);
                        intent.putExtra("path_mode", ((C1221150hsn) profileAigcAvatarViewModel.getState()).LLILZIL.LIZ.toString());
                        c1255030ilR2.onActivityResult(10015, -1, intent);
                    }
                }
            };
            C1331660kl2.LIZJ().LJIIIIZZ(UriProtector.parse(str), new C1221580htU(new InterfaceC1221570htT() { // from class: X.0htC
                @Override // X.InterfaceC1221570htT
                public final void LIZ() {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to find the url from cache: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    final String str4 = str;
                    final Activity activity = c19eg;
                    final C1221390htB c1221390htB = r13;
                    this.LLILLJJLI.LIZ(C1239300iM4.LJFF(AbstractC19486711Lt.LJIIL(new Callable() { // from class: X.0htH
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.changeAvatar$1$onFileFoundFailed$1");
                            C20012913Sd c20012913Sd = C20012913Sd.LIZ;
                            String str5 = str4;
                            Activity activity2 = activity;
                            C1221390htB c1221390htB2 = c1221390htB;
                            c20012913Sd.getClass();
                            C20012913Sd.LIZIZ(str5, activity2, c1221390htB2);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.changeAvatar$1$onFileFoundFailed$1");
                            return unit;
                        }
                    }).LJIJJLI(C11S5.LIZ()), AFwS257S0000000_19.get$arr$(383)));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1221570htT
                public final void LIZIZ(Uri uri) {
                    C1255030ilR c1255030ilR2 = c1255030ilR;
                    Intent intent = new Intent();
                    ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this;
                    intent.setData(uri);
                    intent.putExtra("path_mode", ((C1221150hsn) profileAigcAvatarViewModel.getState()).LLILZIL.LIZ.toString());
                    c1255030ilR2.onActivityResult(10015, -1, intent);
                }
            }));
            return;
        }
        int i = C2187451AjH.LIZ;
    }

    public final void AQ2(EnumC1221310ht3 enumC1221310ht3, int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set footer state: ");
        sbLIZ.append(enumC1221310ht3);
        sbLIZ.append(", count: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS127S0101000_19(enumC1221310ht3, i, 5));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C2314511Fij c2314511Fij, InterfaceC1364105Vn<? super AbstractC316870CbV<C2314511Fij>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<C1220990hsX> list = this.LLJJI;
        c317290CcB.getClass();
        return new C316640Cb8(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zQ2(C1221030hsb c1221030hsb, boolean z) {
        EnumC1221420htE enumC1221420htE;
        Set setLLIIIZ = C13LP.LLIIIZ(((C1221150hsn) getState()).LLILLJJLI.LIZ);
        if (z) {
            setLLIIIZ.add(c1221030hsb);
        } else {
            setLLIIIZ.remove(c1221030hsb);
        }
        if (setLLIIIZ.size() == ((C1221150hsn) getState()).LL.LIZ.size()) {
            enumC1221420htE = EnumC1221420htE.DOWNLOAD_ALL_SELECTED;
        } else {
            enumC1221420htE = EnumC1221420htE.DOWNLOAD_NOT_ALL_SELECTED;
        }
        setState(new AwS598S0100000_19(setLLIIIZ, (Set<C1221030hsb>) 344));
        setState(new AwS598S0100000_19(enumC1221420htE, 345));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wQ2(int i, int i2, int i3) {
        String str;
        int i4 = i + i2;
        if (i4 < i3) {
            C1221370ht9 c1221370ht9 = this.LLJIJIL;
            c1221370ht9.getClass();
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on save in progress, count: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            c1221370ht9.LIZ.setState(new AwS33S0001000_19(i, 1));
            return;
        }
        if (i4 == i3) {
            if (i == i3) {
                C1221370ht9 c1221370ht92 = this.LLJIJIL;
                c1221370ht92.getClass();
                int i6 = C2187451AjH.LIZ;
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel = c1221370ht92.LIZ;
                C2179208gI c2179208gI = profileAigcAvatarViewModel.LLJI;
                String string = ((C1221150hsn) profileAigcAvatarViewModel.getState()).LLILZIL.LIZ.toString();
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = c1221370ht92.LIZ;
                C1221530htP c1221530htP = profileAigcAvatarViewModel2.LL;
                String str2 = null;
                if (c1221530htP != null) {
                    str2 = c1221530htP.LLILLJJLI;
                    str = c1221530htP.LLILLL;
                } else {
                    str = null;
                }
                c2179208gI.LIZ(((C1221150hsn) profileAigcAvatarViewModel2.getState()).LLILLJJLI.LIZ.size(), string, "download_success", str2, str);
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel3 = c1221370ht92.LIZ;
                profileAigcAvatarViewModel3.getClass();
                profileAigcAvatarViewModel3.setState(AFwS257S0000000_19.get$arr$(716));
                c1221370ht92.LIZ.BQ2(EnumC1221420htE.AVATAR_CHANGE);
                c1221370ht92.LIZ.L1(2131820597);
                c1221370ht92.LIZ.setState(AFwS257S0000000_19.get$arr$(382));
                return;
            }
            this.LLJIJIL.LIZ();
            return;
        }
        int i7 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("invalid save count, success: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", fail: ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", total: ");
        sbLIZ2.append(i3);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void yQ2(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, C2217381BqS c2217381BqS, LifecycleOwner lifecycleOwner, Function1 function1) {
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        AssemViewModel.selectSubscribe$default(profileAigcAvatarViewModel, c2217381BqS, c1770850wBP, lifecycleOwner, null, function1, 8, null);
    }
}
