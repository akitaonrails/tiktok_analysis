package com.ss.android.ugc.aweme.tako.menuwindow;

import X.AbstractC1177930gl5;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0T6L;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1853010yJv;
import X.C1853550yKn;
import X.C1853560yKo;
import X.C1853870yLJ;
import X.C1854080yLe;
import X.C1854150yLl;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C540120LGg;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1767370w5n;
import X.EnumC1854550yMP;
import X.EnumC540140LGi;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC540160LGk;
import X.InterfaceC540170LGl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAssem;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS133S0101000_27;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS39S0001000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMenuWindowAssem extends UISlotAssem implements TakoMenuWindowAbility, TakoSubModeBarAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public C197039127h LLJJJIL;
    public View LLJJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJLIIL;
    public C1854080yLe LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final AssemVMLazy LLJLIL;
    public List<C1854150yLl> LLJLILLLLZIIL;
    public View LLJLL;
    public final C01GW LLJLLIL;
    public final C1559260qg8 LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public View LLLF;
    public boolean LLLFF;
    public TakoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1 LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public Function1<? super C1853870yLJ, Unit> LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMenuWindowAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoMenuWindowAssem.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoMenuWindowAssem.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TakoMenuWindowAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1302), AFwS269S0000000_27.get$arr$(243), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMenuWindowViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1303), AFwS269S0000000_27.get$arr$(244), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ3, 1304), AFwS269S0000000_27.get$arr$(245), null, true);
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1300));
        this.LLJLLL = new C1559260qg8(new C723580SZw(this, C1853010yJv.class, null), checkSupervisorPrepared());
        this.LLLFZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1299));
        this.LLLI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(179));
        this.LLLII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1301));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void CE() {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fqg;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void Sd1() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void br0() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void dy1() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void kN2() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -951877212 || iHashCode == 583447868) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void zJ0() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final List<C1854150yLl> E12() {
        List<C1854150yLl> list = this.LLJLILLLLZIIL;
        ArrayList arrayList = new ArrayList();
        for (C1854150yLl c1854150yLl : list) {
            if (c1854150yLl != null) {
                arrayList.add(c1854150yLl);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void Qo2() {
        TakoInputViewUIAbility takoInputViewUIAbilityLp;
        for (Object obj : (ArrayList) this.LLJLILLLLZIIL) {
            C1854150yLl c1854150yLl = (C1854150yLl) obj;
            if (c1854150yLl != null && c1854150yLl.LL == 5 && c1854150yLl.LLJILJILJ) {
                if (obj == null || (takoInputViewUIAbilityLp = lp()) == null) {
                    return;
                }
                takoInputViewUIAbilityLp.w7(EnumC1854550yMP.NONE, "", null, null, null, null, null, false, false);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility
    public final void Un2() {
        View view = this.LLJLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (kp().getState().LLILLJJLI.LIZ.booleanValue()) {
            this.LLJZ = true;
            this.LLJZIJLIL = true;
            kp().Sx2(false);
            return;
        }
        BottomSheetBehavior<View> bottomSheetBehavior = mp().LL;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            BottomSheetBehavior<View> bottomSheetBehavior2 = mp().LL;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
            }
        } else {
            View view2 = this.LLJLL;
            if (view2 != null) {
                HandlerHook.viewPostDelay(view2, new ARunnableS127S0100000_27(this, 53), 50L);
            }
        }
        AwS571S0100000_27 awS571S0100000_27 = mp().LLJ;
        if (awS571S0100000_27 != null) {
            awS571S0100000_27.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void jA2() {
        TakoInputViewUIAbility takoInputViewUIAbilityLp;
        for (Object obj : (ArrayList) this.LLJLILLLLZIIL) {
            C1854150yLl c1854150yLl = (C1854150yLl) obj;
            if (c1854150yLl != null && c1854150yLl.LL == 6 && c1854150yLl.LLJILJILJ) {
                if (obj == null || (takoInputViewUIAbilityLp = lp()) == null) {
                    return;
                }
                takoInputViewUIAbilityLp.w7(EnumC1854550yMP.NONE, "", null, null, null, null, null, false, false);
                return;
            }
        }
    }

    public final TakoFragmentViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (TakoFragmentViewModel) assemVMLazy.getValue();
    }

    public final TakoInputViewUIAbility lp() {
        return (TakoInputViewUIAbility) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void mJ1() {
        TakoInputViewUIAbility takoInputViewUIAbilityLp;
        for (Object obj : (ArrayList) this.LLJLILLLLZIIL) {
            C1854150yLl c1854150yLl = (C1854150yLl) obj;
            if (c1854150yLl != null && c1854150yLl.LL == 1 && c1854150yLl.LLJILJILJ) {
                if (obj == null || (takoInputViewUIAbilityLp = lp()) == null) {
                    return;
                }
                takoInputViewUIAbilityLp.w7(EnumC1854550yMP.NONE, "", null, null, null, null, null, false, false);
                return;
            }
        }
    }

    public final TakoMenuWindowViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (TakoMenuWindowViewModel) assemVMLazy.getValue();
    }

    public final TakoPhotoChooseViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void qW1() {
        TakoInputViewUIAbility takoInputViewUIAbilityLp;
        for (Object obj : (ArrayList) this.LLJLILLLLZIIL) {
            C1854150yLl c1854150yLl = (C1854150yLl) obj;
            if (c1854150yLl != null && c1854150yLl.LL == 2 && c1854150yLl.LLJILJILJ) {
                if (obj == null || (takoInputViewUIAbilityLp = lp()) == null) {
                    return;
                }
                takoInputViewUIAbilityLp.w7(EnumC1854550yMP.NONE, "", null, null, null, null, null, false, false);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility
    public final boolean Xy() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        BottomSheetBehavior<View> bottomSheetBehavior2 = mp().LLILLJJLI;
        if ((bottomSheetBehavior2 == null || bottomSheetBehavior2.getState() != 3) && ((bottomSheetBehavior = mp().LLILLJJLI) == null || bottomSheetBehavior.getState() != 4)) {
            return false;
        }
        BottomSheetBehavior<View> bottomSheetBehavior3 = mp().LLILLJJLI;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setState(5);
        }
        kp().setState(AFwS264S0000000_24.get$arr$(714));
        return true;
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final void ip() {
        op().LLILLL = -1;
        op().LLILZ = -1;
        mp().LLILLL = -1;
        mp().LLILZ = -1;
        this.LLLIIII = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Fragment fragmentLJI;
        Lifecycle lifecycle;
        mp().LLJ = null;
        TakoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1 takoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1 = this.LLLFFI;
        if (takoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1 != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (lifecycle = fragmentLJI.getLifecycle()) != null) {
            lifecycle.removeObserver(takoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1);
        }
        this.LLLFFI = null;
        this.LLL = false;
        this.LLLF = null;
        this.LLLFF = false;
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility
    public final boolean zp2() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        BottomSheetBehavior<View> bottomSheetBehavior2 = mp().LL;
        if ((bottomSheetBehavior2 == null || bottomSheetBehavior2.getState() != 3) && ((bottomSheetBehavior = mp().LL) == null || bottomSheetBehavior.getState() != 4)) {
            return false;
        }
        BottomSheetBehavior<View> bottomSheetBehavior3 = mp().LL;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setState(5);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility
    public final void Dj2(final View view) {
        View viewFindViewById = view.findViewById(R.id.o8p);
        this.LLJJJ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.o8o);
        this.LLJLL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View view2 = this.LLJLL;
        if (view2 != null) {
            mp().LL = BottomSheetBehavior.from(view2);
            BottomSheetBehavior<View> bottomSheetBehavior = mp().LL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setDraggable(true);
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = mp().LL;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yL4
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view3, float f) {
                        float fLIZLLL = C13LZ.LIZLLL(1 + f, 0.0f, 1.0f);
                        View view4 = this.LLJJJ;
                        if (view4 != null) {
                            C786410Ut5.T4(view4, fLIZLLL);
                        }
                        View view5 = this.LLJJJ;
                        if (view5 != null) {
                            C786410Ut5.LJLLLLLL(0, view5);
                        }
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i, View view3) {
                        View viewFindViewById3;
                        View viewFindViewById4;
                        if (i != 3 && i != 4) {
                            if (i == 5) {
                                View view4 = view;
                                if (view4 != null && (viewFindViewById4 = view4.findViewById(R.id.o8o)) != null) {
                                    C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                                }
                                View view5 = this.LLJJJ;
                                if (view5 != null) {
                                    C786410Ut5.LJLLLLLL(8, view5);
                                }
                                this.kp().setState(new AwS36S0010000_24(false, 36));
                                TakoMenuWindowViewModel takoMenuWindowViewModelMp = this.mp();
                                takoMenuWindowViewModelMp.withState(new AwS606S0100000_27(takoMenuWindowViewModelMp, 390));
                                TakoPhotoChooseViewModel takoPhotoChooseViewModelOp = this.op();
                                takoPhotoChooseViewModelOp.withState(new AwS606S0100000_27(takoPhotoChooseViewModelOp, 608));
                                TakoPhotoChooseViewModel takoPhotoChooseViewModelOp2 = this.op();
                                takoPhotoChooseViewModelOp2.LL = false;
                                takoPhotoChooseViewModelOp2.setState(AFwS269S0000000_27.get$arr$(478));
                                if (C07MR.LIZ()) {
                                    ((C1852420yIy) this.LLLI.getValue()).LIZIZ(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        View view6 = view;
                        if (view6 != null && (viewFindViewById3 = view6.findViewById(R.id.o8o)) != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                        }
                        View view7 = this.LLJJJ;
                        if (view7 != null) {
                            C786410Ut5.LJLLLLLL(0, view7);
                        }
                        this.kp().setState(new AwS36S0010000_24(true, 36));
                        if (!C07MR.LIZ()) {
                            return;
                        }
                        ((C1852420yIy) this.LLLI.getValue()).LIZIZ(false);
                    }
                });
            }
            zp2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0389  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r46) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility
    public final void t22(final View view) {
        View viewFindViewById = view.findViewById(R.id.qd3);
        if (viewFindViewById != null) {
            mp().LLILLJJLI = BottomSheetBehavior.from(viewFindViewById);
            BottomSheetBehavior<View> bottomSheetBehavior = mp().LLILLJJLI;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(5);
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = mp().LLILLJJLI;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setDraggable(true);
            }
            BottomSheetBehavior<View> bottomSheetBehavior3 = mp().LLILLJJLI;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yL5
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view2, float f) {
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i, View view2) {
                        int i2;
                        TakoPhotoChooseViewModel takoPhotoChooseViewModelOp = this.op();
                        takoPhotoChooseViewModelOp.withState(new AwS133S0101000_27(i, takoPhotoChooseViewModelOp, 4));
                        if (i == 5) {
                            if (this.mp().LLILZIL) {
                                this.ip();
                            }
                            View view3 = view;
                            C1561230qjJ.LIZ.getClass();
                            if (C1561230qjJ.LIZ()) {
                                i2 = R.id.cb0;
                            } else {
                                i2 = R.id.cae;
                            }
                            View viewFindViewById2 = view3.findViewById(i2);
                            if (viewFindViewById2 != null) {
                                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                            }
                        }
                    }
                });
            }
        }
    }

    public static final void tp(InterfaceC1891350zJl interfaceC1891350zJl, EnumC1767370w5n enumC1767370w5n) {
        if (interfaceC1891350zJl instanceof C1853560yKo) {
            ((C1853560yKo) interfaceC1891350zJl).LLILLL = enumC1767370w5n;
        } else {
            if (!(interfaceC1891350zJl instanceof C1853550yKn)) {
                return;
            }
            ((C1853550yKn) interfaceC1891350zJl).LLILLL = enumC1767370w5n;
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowAbility
    public final void RP2(final View view, final boolean z) {
        C19EG activity;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
            C540120LGg.LJFF(activity, new TokenCert("bpea-tako_image_uplad_request_permission_photo_album_read"), EnumC540140LGi.IMAGE, new InterfaceC540170LGl() { // from class: X.0yLA
                @Override // X.InterfaceC540170LGl
                public final void LIZ(boolean z2) {
                    TakoMenuWindowAssem takoMenuWindowAssem = this.LIZ;
                    takoMenuWindowAssem.LLL = true;
                    takoMenuWindowAssem.LLLF = view;
                    takoMenuWindowAssem.LLLFF = z;
                    C449180HjQ c449180HjQ = C449180HjQ.LIZ;
                    Context context = takoMenuWindowAssem.getContext();
                    c449180HjQ.getClass();
                    C449180HjQ.LIZIZ(context);
                }
            }, new InterfaceC540160LGk() { // from class: X.0yLI
                @Override // X.InterfaceC540160LGk
                public final void LIZ(C0L9V c0l9v) {
                    this.LIZ.hp(view, z);
                }
            });
        }
    }

    public final void hp(View view, boolean z) {
        BottomSheetBehavior<View> bottomSheetBehavior = mp().LLILLJJLI;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            BottomSheetBehavior<View> bottomSheetBehavior2 = mp().LLILLJJLI;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
            }
            View viewFindViewById = view.findViewById(R.id.qd3);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            op().LLILZIL = z;
            mp().LLILZIL = z;
            if (z) {
                mp().LLILZLL = C0T6L.LIZIZ(mp().getState().LLILZ);
                mp().LLIZ = C0T6L.LIZIZ(mp().getState().LLILLL.LIZ);
                TakoPhotoChooseViewModel takoPhotoChooseViewModelOp = op();
                takoPhotoChooseViewModelOp.withState(new AwS606S0100000_27(takoPhotoChooseViewModelOp, 608));
            }
            View view2 = this.LLJLL;
            if (view2 != null) {
                HandlerHook.viewPostDelay(view2, new ARunnableS127S0100000_27(this, 31), 50L);
            }
            op().setState(AFwS269S0000000_27.get$arr$(479));
            return;
        }
        BottomSheetBehavior<View> bottomSheetBehavior3 = mp().LLILLJJLI;
        if (bottomSheetBehavior3 == null) {
            return;
        }
        bottomSheetBehavior3.setState(5);
    }

    public final void sp(int i, int i2, Function1<? super C1853870yLJ, Unit> function1) {
        op().LLILLL = i;
        op().LLILZ = i2;
        mp().LLILLL = i;
        mp().LLILZ = i2;
        this.LLLIIII = function1;
        mp().setState(new AwS39S0001000_27(i, 6));
        if (op().LLILLJJLI > 0) {
            function1.invoke(new C1853870yLJ(i2, true, (List) null));
            zp2();
            return;
        }
        TakoPhotoChooseViewModel takoPhotoChooseViewModelOp = op();
        while (takoPhotoChooseViewModelOp.getState().LLIZ.size() > takoPhotoChooseViewModelOp.LLILLL) {
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJLIIIJL(takoPhotoChooseViewModelOp.getState().LLIZ);
            if (tikTokMediaModel != null) {
                takoPhotoChooseViewModelOp.AQ2(tikTokMediaModel, true);
            }
        }
        RP2((View) LJJIJL().getParent(), true);
    }
}
