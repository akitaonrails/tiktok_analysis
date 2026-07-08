package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C07I8;
import X.C09R3;
import X.C0DQF;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1852750yJV;
import X.C1854650yMZ;
import X.C1862920yZu;
import X.C19719912Dl;
import X.C19EG;
import X.C20189513zB;
import X.C2217381BqS;
import X.C449180HjQ;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoDisplayViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class PhotoPickerEntrancePanelAssem extends UISlotAssem implements IPhotoPickerAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C1854650yMZ LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoPickerEntrancePanelAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoPickerEntrancePanelAssem.class, "photoDisplayViewModel", "getPhotoDisplayViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoPhotoDisplayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PhotoPickerEntrancePanelAssem.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PhotoPickerEntrancePanelAssem.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public PhotoPickerEntrancePanelAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(188));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2299), AFwS269S0000000_27.get$arr$(190), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(189));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoPhotoDisplayViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2300), AFwS269S0000000_27.get$arr$(191), null, true);
        C1637906bB c1637906bBLIZ3 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(186));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ3, new AwS562S0100000_18(c19719912DlLIZ3, 2301), AFwS269S0000000_27.get$arr$(185), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoMenuWindowViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ4, 2298), AFwS269S0000000_27.get$arr$(187), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 679));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 677));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpc;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 181225616) {
            return null;
        }
        return this;
    }

    public final IInputInnerAbility hp() {
        return (IInputInnerAbility) this.LLJJJJ.getValue();
    }

    public final TakoMenuWindowViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (TakoMenuWindowViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        C1854650yMZ c1854650yMZ = this.LLJJJ;
        if (c1854650yMZ == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        BottomInputViewModel bottomInputViewModel = (BottomInputViewModel) assemVMLazy.getValue();
        List listLLIIII = C13LP.LLIIII(c1854650yMZ.getDisplayPhotoList());
        String scene = c1854650yMZ.getScene();
        if (scene.length() <= 0) {
            scene = null;
        }
        bottomInputViewModel.setState(new AwS141S1100000_27(listLLIIII, (List<BaseImage>) scene, (String) 10));
        bottomInputViewModel.yQ2();
        bottomInputViewModel.withState(new AwS606S0100000_27(bottomInputViewModel, 336));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.IPhotoPickerAbility
    public final void OQ(boolean z) {
        List<BaseImage> displayPhotoList;
        C1854650yMZ c1854650yMZ;
        C1854650yMZ c1854650yMZ2 = this.LLJJJ;
        if (c1854650yMZ2 != null && (displayPhotoList = c1854650yMZ2.getDisplayPhotoList()) != null && !displayPhotoList.isEmpty() && (c1854650yMZ = this.LLJJJ) != null) {
            c1854650yMZ.LIZIZ();
        }
    }

    public final String mp(boolean z) {
        ISkillLabelAbilityV2 iSkillLabelAbilityV2 = (ISkillLabelAbilityV2) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISkillLabelAbilityV2.class, null);
        if (iSkillLabelAbilityV2 != null) {
            return iSkillLabelAbilityV2.M11(z);
        }
        IBottomInputHostAbility iBottomInputHostAbility = (IBottomInputHostAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBottomInputHostAbility.class, null);
        if (iBottomInputHostAbility == null) {
            return null;
        }
        return iBottomInputHostAbility.NV1();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0224  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r31) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.PhotoPickerEntrancePanelAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.IPhotoPickerAbility
    public final void eh(String str, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        AwS110S1200000_27 awS110S1200000_27 = new AwS110S1200000_27(this, (PhotoPickerEntrancePanelAssem) str, (String) function2, (Function2<? super BaseImage, ? super Integer, Unit>) 5);
        if (c19egLIZ != null) {
            C449180HjQ c449180HjQ = C449180HjQ.LIZ;
            AwS396S0200000_30 awS396S0200000_30 = new AwS396S0200000_30(c19egLIZ, awS110S1200000_27, 0);
            c449180HjQ.getClass();
            C449180HjQ.LIZLLL(awS396S0200000_30);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.IPhotoPickerAbility
    public final void na(String str, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        C20189513zB.LJIIIIZZ(1, C724240Sb0.LIZ(this), new AwS110S1200000_27(this, (PhotoPickerEntrancePanelAssem) str, (String) function2, (Function2<? super BaseImage, ? super Integer, Unit>) 6));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.IPhotoPickerAbility
    public final void wu(BaseImage baseImage, String str) {
        C1854650yMZ c1854650yMZ = this.LLJJJ;
        if (c1854650yMZ != null) {
            c1854650yMZ.LIZ(str, baseImage, null);
        }
    }

    public final void kp(String str, C1852750yJV c1852750yJV, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        C1854650yMZ c1854650yMZ;
        if (c1852750yJV.LIZIZ()) {
            BaseImage baseImage = c1852750yJV.LIZIZ;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 676);
            if (baseImage != null && (c1854650yMZ = this.LLJJJ) != null) {
                c1854650yMZ.LIZ(str, baseImage, awS571S0100000_27);
            }
            if (function2 != null) {
                function2.invoke(c1852750yJV.LIZIZ, 0);
            }
        } else {
            if (c1852750yJV.LIZ != 4) {
                String strLIZ = c1852750yJV.LIZ();
                if (C07I8.LIZIZ) {
                    C0DQF.LJ(LJJIJL(), strLIZ, null, null, false, 28);
                } else {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null && !c19egLIZ.isFinishing() && !c19egLIZ.isDestroyed()) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                        c1389890mGx.LJIIJ(strLIZ);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
            if (function2 != null) {
                function2.invoke(null, Integer.valueOf(c1852750yJV.LIZ));
            }
        }
        if (c1852750yJV.LIZ != 4) {
            if (C1862920yZu.LIZ()) {
                IInputInnerAbility iInputInnerAbilityHp = hp();
                if (iInputInnerAbilityHp != null) {
                    iInputInnerAbilityHp.Cz0(200L, true);
                    return;
                }
                return;
            }
            IInputInnerAbility iInputInnerAbilityHp2 = hp();
            if (iInputInnerAbilityHp2 == null) {
                return;
            }
            iInputInnerAbilityHp2.Cz0(0L, false);
        }
    }
}
