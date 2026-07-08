package com.ss.android.ugc.aweme.tako.botpage.bottombox;

import X.AbstractC19994813Le;
import X.AnonymousClass1418;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C076V;
import X.C07I8;
import X.C09R3;
import X.C0DQF;
import X.C0DSB;
import X.C0PEM;
import X.C0WZX;
import X.C1153090g71;
import X.C1155550gAz;
import X.C1308910kAL;
import X.C1355270lN7;
import X.C1355280lN8;
import X.C1360910lWD;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391600mJi;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C13MK;
import X.C14KQ;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1578630rBN;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1818807Ak;
import X.C1842270y2b;
import X.C1845400y7e;
import X.C1852120yIU;
import X.C1852140yIW;
import X.C1852310yIn;
import X.C1852750yJV;
import X.C1852820yJc;
import X.C1854150yLl;
import X.C1854470yMH;
import X.C1854530yMN;
import X.C1854540yMO;
import X.C1854600yMU;
import X.C1854650yMZ;
import X.C1854760yMk;
import X.C1854790yMn;
import X.C1854970yN5;
import X.C1855050yND;
import X.C1855350yNh;
import X.C1855370yNj;
import X.C1855450yNr;
import X.C1855550yO1;
import X.C1855670yOD;
import X.C1855770yON;
import X.C1857750yRZ;
import X.C1860520yW2;
import X.C1860640yWE;
import X.C1862330yYx;
import X.C1862920yZu;
import X.C1863850ybP;
import X.C1864200yby;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19751612Pq;
import X.C19EG;
import X.C1DFH;
import X.C20189513zB;
import X.C20230914Dz;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2173301A3s;
import X.C2204961BRm;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C320490ChL;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C449180HjQ;
import X.C450720Hlu;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.ChoreographerFrameCallbackC1855380yNk;
import X.EnumC1235690iGF;
import X.EnumC1355290lN9;
import X.EnumC1355300lNA;
import X.EnumC1801380wye;
import X.EnumC1852100yIS;
import X.EnumC1854500yMK;
import X.EnumC1854550yMP;
import X.EnumC1855310yNd;
import X.EnumC1855560yO2;
import X.EnumC1863020ya4;
import X.InterfaceC1360930lWF;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1864650ych;
import Y.ARunnableS38S0101000_27;
import Y.ARunnableS46S0110000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoDisplayViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoPickerPanelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.image.TakoAIImageConvertStyleFragment;
import com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionAIImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetVM;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS29S1400000_27;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BottomInputAssem extends UISlotAssem implements TakoInputViewUIAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZIL;
    public String LLJJI;
    public EnumC1854550yMP LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public C1854760yMk LLJJJ;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(366));
    public FrameLayout LLJJJJ;
    public C1855350yNh LLJJJJJIL;
    public C1855370yNj LLJJJJLIIL;
    public FrameLayout LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public View LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxIconView LLJLLIL;
    public C19751612Pq LLJLLL;
    public C19751612Pq LLJZ;
    public C19751612Pq LLJZIJLIL;
    public Drawable LLL;
    public Drawable LLLF;
    public ViewOnLayoutChangeListenerC1864650ych LLLFF;
    public final AssemVMLazy LLLFFI;
    public C1855550yO1 LLLFZ;
    public final AssemVMLazy LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final AssemVMLazy LLLIIIIL;
    public final AssemVMLazy LLLIIIL;
    public final AssemVMLazy LLLIIL;
    public boolean LLLIILIL;
    public C1852310yIn LLLIL;
    public View LLLILZ;
    public FrameLayout LLLILZJ;
    public final AssemVMLazy LLLILZLLLI;
    public final C1559260qg8 LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public int LLLJL;
    public String LLLL;
    public int LLLLII;
    public Boolean LLLLIIIILLL;
    public Boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public final C01GW LLLLILI;
    public boolean LLLLJ;
    public final AssemVMLazy LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public Balloon LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public final C01GW LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final C01GW LLLLLLL;
    public boolean LLLLLLLLL;
    public final List<Integer> LLLLLLLLLL;
    public final List<Integer> LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final AssemVMLazy LLLLLLZZ;
    public String LLLLLZ;
    public final AssemVMLazy LLLLLZIL;
    public final C01GW LLLLLZL;
    public final C01GW LLLLZ;
    public TakoEditAskInfo LLLLZI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void kp() {
        if (this.LLLLJ) {
            return;
        }
        Ap().zQ2(Ip(), getCommonParams());
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0yMx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 115), 4);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217371BqR() { // from class: X.0yN0
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1854530yMN) obj).LLILLJJLI = (TakoStandardRatio) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 116), 4);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217371BqR() { // from class: X.0yN1
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1854530yMN) obj).LLILLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1854530yMN) obj).LLILLL = (ConvertStyleItem) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 117), 4);
        C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 315));
        this.LLLLJ = true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 584814039) {
            return null;
        }
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomInputAssem.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BottomInputAssem.class, "speechViewModel", "getSpeechViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoSpeechViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BottomInputAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BottomInputAssem.class, "photoDisplayViewModel", "getPhotoDisplayViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoPhotoDisplayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(BottomInputAssem.class, "photoPickerPanelViewModel", "getPhotoPickerPanelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoPhotoPickerPanelViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(BottomInputAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(BottomInputAssem.class, "skillLabelViewModel", "getSkillLabelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/skilllabel/TakoInputSkillLabelViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(BottomInputAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(BottomInputAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/tako/otherpage/sheet/TakoSheetVM;", 0);
        c09r3.getClass();
        LLLLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public BottomInputAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMenuWindowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1231), AFwS269S0000000_27.get$arr$(161), null, true);
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(423));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoSpeechViewModel.class);
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ, new AwS568S0100000_24(c19719912DlLIZ2, 1232), AFwS269S0000000_27.get$arr$(162), null, true);
        this.LLLII = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(170));
        this.LLLIIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1223));
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(421));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLLIIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ2, new AwS568S0100000_24(c19719912DlLIZ3, 1233), AFwS269S0000000_27.get$arr$(163), null, true);
        C1637906bB c1637906bBLIZ3 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(422));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoPhotoDisplayViewModel.class);
        this.LLLIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bBLIZ3, new AwS568S0100000_24(c19719912DlLIZ4, 1234), AFwS269S0000000_27.get$arr$(164), null, true);
        C1637906bB c1637906bBLIZ4 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(419));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(TakoPhotoPickerPanelViewModel.class);
        this.LLLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bBLIZ4, new AwS568S0100000_24(c19719912DlLIZ5, 1235), AFwS269S0000000_27.get$arr$(156), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MessageViewModel.class);
        this.LLLILZLLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ6, 1226), AFwS269S0000000_27.get$arr$(157), null, true);
        this.LLLIZZ = new C1559260qg8(new C723580SZw(this, C1155550gAz.class, null), checkSupervisorPrepared());
        this.LLLLIILL = true;
        C1860520yW2.LIZ.getClass();
        this.LLLLIL = C1860520yW2.LJI();
        this.LLLLILI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1225));
        C1637906bB c1637906bBLIZ5 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(420));
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(TakoInputSkillLabelViewModel.class);
        this.LLLLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bBLIZ5, new AwS568S0100000_24(c19719912DlLIZ7, 1227), AFwS269S0000000_27.get$arr$(158), null, true);
        this.LLLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1224));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1222));
        this.LLLLLJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1229));
        this.LLLLLJLJLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1220));
        this.LLLLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 653));
        this.LLLLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1221));
        this.LLLLLLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 652));
        this.LLLLLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 651));
        this.LLLLLLLLLL = C1697810uHb.LJIIJJI(1, 3, 4, 5);
        this.LLLLLLLZIL = C1697810uHb.LJIIJJI(1, 4);
        this.LLLLLLZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(171));
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLLLLLZZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ8, 1228), AFwS269S0000000_27.get$arr$(159), null, true);
        this.LLLLLZ = "manual_input";
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(TakoSheetVM.class);
        this.LLLLLZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ9), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ9, 1230), AFwS269S0000000_27.get$arr$(160), null, true);
        this.LLLLLZL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 655));
        this.LLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 656));
    }

    public final TakoInputSkillLabelViewModel Ap() {
        AssemVMLazy assemVMLazy = this.LLLLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (TakoInputSkillLabelViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final boolean BF() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            return c1854760yMk.getAddTextFromVoice();
        }
        return false;
    }

    public final TakoSpeechViewModel Bp() {
        AssemVMLazy assemVMLazy = this.LLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (TakoSpeechViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        C1854970yN5.LIZ.getClass();
        return (C1854970yN5.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) ? R.layout.fkc : R.layout.fka;
    }

    public final TakoSubModeBarAbility Ep() {
        return (TakoSubModeBarAbility) this.LLLLLJLJLL.getValue();
    }

    public final ITakoContextAbility Fp() {
        return (ITakoContextAbility) this.LLLLLIL.getValue();
    }

    public final TakoMenuWindowViewModel Gp() {
        AssemVMLazy assemVMLazy = this.LLLFFI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (TakoMenuWindowViewModel) assemVMLazy.getValue();
    }

    public final C1852820yJc Ip() {
        return (C1852820yJc) this.LLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Pt2() {
        C1854650yMZ photoDisplayLayout;
        C1842270y2b inputView;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null && (inputView = c1854760yMk.getInputView()) != null) {
            inputView.setText("");
        }
        C1854760yMk c1854760yMk2 = this.LLJJJ;
        if (c1854760yMk2 != null && (photoDisplayLayout = c1854760yMk2.getPhotoDisplayLayout()) != null) {
            photoDisplayLayout.LIZIZ();
        }
        Jd(null, false);
        fg(null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Qp() {
        C20600815jK<InterfaceC1891350zJl> state;
        ArrayList arrayList;
        C20600815jK<InterfaceC1891350zJl> state2;
        C1854650yMZ photoDisplayLayout;
        C1854760yMk c1854760yMk = this.LLJJJ;
        int displayItemCount = (c1854760yMk == null || (photoDisplayLayout = c1854760yMk.getPhotoDisplayLayout()) == null) ? 0 : photoDisplayLayout.getDisplayItemCount();
        C1854760yMk c1854760yMk2 = this.LLJJJ;
        if (c1854760yMk2 != null) {
            EnumC1854500yMK enumC1854500yMK = null;
            Object[] objArr = 0;
            if (displayItemCount != 0) {
                C1855770yON.LIZ.getClass();
                if (!C1855770yON.LIZIZ()) {
                    int i = 1;
                    if (displayItemCount == 1) {
                        List<ActionBarImageItem> list = Ip().LIZJ;
                        arrayList = new ArrayList();
                        for (ActionBarImageItem actionBarImageItem : list) {
                            if (this.LLLLLLLLLL.contains(Integer.valueOf(actionBarImageItem.actionType))) {
                                arrayList.add(actionBarImageItem);
                            }
                        }
                    } else {
                        List<ActionBarImageItem> list2 = Ip().LIZJ;
                        arrayList = new ArrayList();
                        for (ActionBarImageItem actionBarImageItem2 : list2) {
                            if (this.LLLLLLLZIL.contains(Integer.valueOf(actionBarImageItem2.actionType))) {
                                arrayList.add(actionBarImageItem2);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    int i2 = 0;
                    for (Object obj : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        ActionBarImageItem actionBarImageItem3 = (ActionBarImageItem) obj;
                        String str = actionBarImageItem3.name;
                        if (str == null) {
                            str = "";
                        }
                        arrayList2.add(new C1854470yMH(str, i2, Ip().LIZ, actionBarImageItem3.actionType == 5 ? Integer.valueOf(R.raw.icon_ai_video) : null, C960203pA.LIZIZ(c1854760yMk2.getContext()) ? actionBarImageItem3.darkIcon : actionBarImageItem3.lightIcon, actionBarImageItem3, new AwS462S0200000_27(this, actionBarImageItem3, 2), enumC1854500yMK, actionBarImageItem3.actionType != i ? null : Integer.valueOf(R.raw.icon_arrow_right_ltr), objArr == true ? 1 : 0, 27056));
                        i2 = i3;
                        i = 1;
                    }
                    c1854760yMk2.setActionBarSugListData(arrayList2);
                    ViewOnAttachStateChangeListenerC20604515jv actionBarSugList = c1854760yMk2.getActionBarSugList();
                    if (actionBarSugList != null && (state2 = actionBarSugList.getState()) != null) {
                        state2.LJIILL(arrayList2, null);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv actionBarSugList2 = c1854760yMk2.getActionBarSugList();
                    if (actionBarSugList2 != null) {
                        C786410Ut5.LLF(0, actionBarSugList2);
                    }
                    yq();
                    return;
                }
            }
            c1854760yMk2.setActionBarSugListData(null);
            ViewOnAttachStateChangeListenerC20604515jv actionBarSugList3 = c1854760yMk2.getActionBarSugList();
            if (actionBarSugList3 != null && (state = actionBarSugList3.getState()) != null) {
                state.LJFF(null);
            }
            ViewOnAttachStateChangeListenerC20604515jv actionBarSugList4 = c1854760yMk2.getActionBarSugList();
            if (actionBarSugList4 != null) {
                C786410Ut5.LLF(8, actionBarSugList4);
            }
            yq();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final List<BaseImage> TG1() {
        C1854650yMZ photoDisplayLayout;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk == null || (photoDisplayLayout = c1854760yMk.getPhotoDisplayLayout()) == null) {
            return null;
        }
        return photoDisplayLayout.getDisplayPhotoList();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Tc() {
        C1855370yNj c1855370yNj = this.LLJJJJLIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
    }

    public final void Tp() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1852140yIW(this, null), 3);
    }

    public final boolean Vp() {
        C1854760yMk c1854760yMk;
        C1854150yLl activeSubModeItem;
        C1854150yLl activeSubModeItem2;
        C1854150yLl activeSubModeItem3;
        C1854760yMk c1854760yMk2 = this.LLJJJ;
        if (((c1854760yMk2 == null || (activeSubModeItem3 = c1854760yMk2.getActiveSubModeItem()) == null) ? null : Integer.valueOf(activeSubModeItem3.LL)) == null || !((c1854760yMk = this.LLJJJ) == null || (activeSubModeItem2 = c1854760yMk.getActiveSubModeItem()) == null || activeSubModeItem2.LL != 0)) {
            return true;
        }
        C1854760yMk c1854760yMk3 = this.LLJJJ;
        return (c1854760yMk3 == null || (activeSubModeItem = c1854760yMk3.getActiveSubModeItem()) == null || activeSubModeItem.LL != 1) ? false : true;
    }

    public final C1855370yNj Xp() {
        C1855370yNj c1855370yNj = this.LLJJJJLIIL;
        if (c1855370yNj != null) {
            return c1855370yNj;
        }
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C1855370yNj c1855370yNj2 = new C1855370yNj(context);
        c1855370yNj2.LIZLLL();
        this.LLJJJJLIIL = c1855370yNj2;
        return c1855370yNj2;
    }

    public final void dq() {
        C1854150yLl activeSubModeItem;
        TakoSubModeBarAbility takoSubModeBarAbility;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk == null || (activeSubModeItem = c1854760yMk.getActiveSubModeItem()) == null || activeSubModeItem.LL != 1) {
            return;
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ() || (takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoSubModeBarAbility.class, null)) == null) {
            return;
        }
        takoSubModeBarAbility.mJ1();
    }

    public final void fq() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            C426750GoL.LJIIIZ(c1854760yMk.getPhotoDisplayLayout(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
            c1854760yMk.getPhotoDisplayLayout().LIZIZ();
            c1854760yMk.setActiveSubModeItem(null);
            C786410Ut5.LL(8, c1854760yMk.getActionBarModeLayout());
            ViewOnAttachStateChangeListenerC20604515jv actionBarSugList = c1854760yMk.getActionBarSugList();
            if (actionBarSugList != null) {
                C786410Ut5.LLF(8, actionBarSugList);
            }
            View actionModeSplitLine = c1854760yMk.getActionModeSplitLine();
            if (actionModeSplitLine != null) {
                C786410Ut5.LJLLLLLL(8, actionModeSplitLine);
            }
            c1854760yMk.getInputView().setHintTextWithEndEllipsize(NV1());
            Editable editableV = C2204961BRm.v(c1854760yMk.getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6tRPcGwZ0K8PXyTijw2/29g==", null));
            if (editableV != null) {
                editableV.clear();
            }
        }
        TakoSubModeBarAbility takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoSubModeBarAbility.class, null);
        if (takoSubModeBarAbility != null) {
            takoSubModeBarAbility.CE();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final View getInput() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            return c1854760yMk.getInputView();
        }
        return null;
    }

    public final void io() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            c1854760yMk.LJIIJJI();
        }
    }

    public final void ip() {
        C1854650yMZ photoDisplayLayout;
        List<BaseImage> displayPhotoList;
        C1854760yMk c1854760yMk;
        C1854650yMZ photoDisplayLayout2;
        C1854760yMk c1854760yMk2 = this.LLJJJ;
        if (c1854760yMk2 == null || (photoDisplayLayout = c1854760yMk2.getPhotoDisplayLayout()) == null || (displayPhotoList = photoDisplayLayout.getDisplayPhotoList()) == null || displayPhotoList.isEmpty() || (c1854760yMk = this.LLJJJ) == null || (photoDisplayLayout2 = c1854760yMk.getPhotoDisplayLayout()) == null) {
            return;
        }
        photoDisplayLayout2.LIZIZ();
    }

    public final void kq() {
        FrameLayout frameLayout;
        Context context;
        if (this.LLLLIL) {
            return;
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            Boolean bool = this.LLLLIIL;
            Boolean bool2 = Boolean.FALSE;
            if (!Intrinsics.LJFF(bool, bool2) || !Intrinsics.LJFF(this.LLLLIIIILLL, bool2) || this.LLLLIILLL || !this.LLLIILIL || ((Boolean) C320490ChL.LIZIZ.getValue()).booleanValue() || r41()) {
                return;
            }
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) this.LLLLLLL.getValue();
            if (C13MK.LIZ(iTakoScreenTypeAbility != null ? Boolean.valueOf(iTakoScreenTypeAbility.cA()) : null) || !C1578630rBN.LJIIJ(this)) {
                return;
            }
            TuxIconView tuxIconView = this.LLJLL;
            if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
                return;
            }
            int i = C1860640yWE.LIZ;
            if (C1860640yWE.LIZ(getContext()) || (frameLayout = this.LLJL) == null || (context = getContext()) == null) {
                return;
            }
            C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(context, false);
            C450720Hlu c450720Hlu = new C450720Hlu(c1361400lX0LIZ);
            c450720Hlu.LJIIJ(2131822545);
            c450720Hlu.LLILLJJLI.LIZIZ = frameLayout;
            c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0d, c1361400lX0LIZ);
            c450720Hlu.LJI(numLIZJ != null ? numLIZJ.intValue() : 0);
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            C2173301A3s.LIZ(c450720Hlu);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJLL, "rotation", 0.0f, 100.0f);
            objectAnimatorOfFloat.setDuration(330L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJLL, "scaleX", 1.0f, 1.2f);
            objectAnimatorOfFloat2.setDuration(330L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJLL, "scaleY", 1.0f, 1.2f);
            objectAnimatorOfFloat3.setDuration(330L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJLL, "rotation", 100.0f, 90.0f);
            objectAnimatorOfFloat4.setDuration(100L);
            objectAnimatorOfFloat4.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLJLL, "scaleX", 1.2f, 1.0f);
            objectAnimatorOfFloat5.setDuration(100L);
            objectAnimatorOfFloat5.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLJLL, "scaleY", 1.2f, 1.0f);
            objectAnimatorOfFloat6.setDuration(100L);
            objectAnimatorOfFloat6.setStartDelay(30L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
            animatorSet.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
            animatorSet.setStartDelay(200L);
            animatorSet.start();
            this.LLLLIL = true;
            C1860520yW2.LIZ.getClass();
            C1860520yW2.LJJII();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = getCommonParams().get("enter_from");
            String str2 = getCommonParams().get("enter_method");
            String str3 = getCommonParams().get("process_id");
            String str4 = getCommonParams().get("tako_session_id");
            if (str4 == null) {
                str4 = "";
            }
            C1862330yYx.LJLJI(c1862330yYx, str, str2, str3, "popup", null, C1857750yRZ.LJII(2131822545), null, null, null, null, null, null, null, str4, getCommonParams().get("tako_chat_id"), 40912);
        }
    }

    public final TakoFragmentViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLLIIIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (TakoFragmentViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C1855350yNh c1855350yNh = this.LLJJJJJIL;
        if (c1855350yNh != null && Bp().getState().LL) {
            Bp().yQ2(EnumC1801380wye.PAUSE);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> commonParams = getCommonParams();
            C1855550yO1 c1855550yO1 = this.LLLFZ;
            String str = (c1855550yO1 == null || !c1855550yO1.LIZJ) ? "long_press" : "button_click";
            c1862330yYx.getClass();
            C1862330yYx.LLFFF("passive", str, commonParams);
            c1855350yNh.LIZ(false);
            C1855350yNh c1855350yNh2 = this.LLJJJJJIL;
            if (c1855350yNh2 != null) {
                c1855350yNh2.setState(EnumC1855310yNd.INITIATE);
            }
        }
        kd();
        C1855370yNj c1855370yNj = this.LLJJJJLIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
        super.onPause();
    }

    public final IMessageAbility op() {
        return (IMessageAbility) this.LLLLLJIL.getValue();
    }

    public final void pq() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null && c1854760yMk.LLIZ) {
            ChoreographerFrameCallbackC1855380yNk voiceWaveView = c1854760yMk.getVoiceWaveView();
            if (voiceWaveView != null) {
                voiceWaveView.LIZJ();
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> commonParams = getCommonParams();
            c1862330yYx.getClass();
            C1862330yYx.LLFFF("click", "button_click", commonParams);
            return;
        }
        if (!this.LLLLIL) {
            this.LLLLIL = true;
            C1860520yW2.LIZ.getClass();
            C1860520yW2.LJJII();
        }
        C1855370yNj c1855370yNj = this.LLJJJJLIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
        mp().setState(AFwS264S0000000_24.get$arr$(713));
    }

    public final void qW1() {
        C1854150yLl activeSubModeItem;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk == null || (activeSubModeItem = c1854760yMk.getActiveSubModeItem()) == null || activeSubModeItem.LL != 2) {
            return;
        }
        TakoSubModeBarAbility takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoSubModeBarAbility.class, null);
        if (takoSubModeBarAbility != null) {
            takoSubModeBarAbility.qW1();
        }
        C1854760yMk c1854760yMk2 = this.LLJJJ;
        if (c1854760yMk2 != null) {
            C426750GoL.LJIIIZ(c1854760yMk2.getPhotoDisplayLayout(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
            c1854760yMk2.getPhotoDisplayLayout().LIZIZ();
            c1854760yMk2.setActiveSubModeItem(null);
            C786410Ut5.LL(8, c1854760yMk2.getActionBarModeLayout());
            ViewOnAttachStateChangeListenerC20604515jv actionBarSugList = c1854760yMk2.getActionBarSugList();
            if (actionBarSugList != null) {
                C786410Ut5.LLF(8, actionBarSugList);
            }
            View actionModeSplitLine = c1854760yMk2.getActionModeSplitLine();
            if (actionModeSplitLine != null) {
                C786410Ut5.LJLLLLLL(8, actionModeSplitLine);
            }
            c1854760yMk2.getInputView().setHintTextWithEndEllipsize(NV1());
            Editable editableV = C2204961BRm.v(c1854760yMk2.getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6tRPcGwZ0K8PXyTijw2/29g==", null));
            if (editableV != null) {
                editableV.clear();
            }
            C1852120yIU photoPickerEntranceView = c1854760yMk2.getPhotoPickerEntranceView();
            if ((photoPickerEntranceView != null ? photoPickerEntranceView.getCurrentViewState() : null) == EnumC1852100yIS.PHOTO_PICKER_PANEL_OPEN) {
                Tp();
            }
        }
        TakoSubModeBarAbility takoSubModeBarAbility2 = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoSubModeBarAbility.class, null);
        if (takoSubModeBarAbility2 != null) {
            takoSubModeBarAbility2.CE();
        }
    }

    public final boolean r41() {
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) this.LLLLLLL.getValue();
        return C13MK.LIZ(iTakoScreenTypeAbility != null ? Boolean.valueOf(iTakoScreenTypeAbility.r41()) : null);
    }

    public final MessageViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLLILZLLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLZIL;
        return (MessageViewModel) assemVMLazy.getValue();
    }

    public final String tp() {
        C1854150yLl activeSubModeItem;
        C1855670yOD.LIZ.getClass();
        if (C1855670yOD.LIZ()) {
            return up(Ap().getState().LL.LIZ);
        }
        C1854760yMk c1854760yMk = this.LLJJJ;
        return (c1854760yMk == null || (activeSubModeItem = c1854760yMk.getActiveSubModeItem()) == null || activeSubModeItem.LL != 2) ? "default_entrance" : "homework";
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final TakoReferenceAskInfo xr2() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            return c1854760yMk.getTakoReferenceAskInfo();
        }
        return null;
    }

    public final C1863850ybP yp() {
        return (C1863850ybP) this.LLLLLLJ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (X.C1855770yON.LIZLLL() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yq() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem.yq():void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final C1854150yLl z22() {
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            return c1854760yMk.getActiveSubModeItem();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final String za1() {
        C1854650yMZ photoDisplayLayout;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk == null || (photoDisplayLayout = c1854760yMk.getPhotoDisplayLayout()) == null) {
            return null;
        }
        return photoDisplayLayout.getScene();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final String zi1() {
        C1842270y2b inputView;
        Editable editableV;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk == null || (inputView = c1854760yMk.getInputView()) == null || (editableV = C2204961BRm.v(inputView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6tRPcGwZ0K8PXyTijw2/29g==", null))) == null) {
            return null;
        }
        return editableV.toString();
    }

    public final void zq() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        C1855770yON.LIZ.getClass();
        boolean z = true;
        boolean z2 = C1855770yON.LIZIZ() && Intrinsics.LJFF(this.LLLLIIL, Boolean.TRUE);
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(z2 ? 0 : 8, view2);
        }
        FrameLayout frameLayout = this.LLJJJJ;
        if (frameLayout == null || (view = this.LLJJLIIIJLLLLLLLZ) == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(frameLayout.getHeight());
        int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : frameLayout.getMeasuredHeight();
        int iLIZIZ = z2 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : 0;
        int i = iIntValue + iLIZIZ;
        if (iIntValue <= 0 || layoutParams.height == i) {
            z = false;
        } else {
            layoutParams.height = i;
        }
        C786410Ut5.ed(view, -iLIZIZ);
        if (z) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final String NV1() {
        int i;
        C1854760yMk c1854760yMk;
        C1842270y2b inputView;
        C1854760yMk c1854760yMk2;
        C1842270y2b inputView2;
        C1854760yMk c1854760yMk3;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            i = 2131849707;
        } else {
            C1854760yMk c1854760yMk4 = this.LLJJJ;
            i = (c1854760yMk4 == null || (inputView2 = c1854760yMk4.getInputView()) == null || inputView2.hasFocus() || !((c1854760yMk3 = this.LLJJJ) == null || c1854760yMk3.getTakoReferenceAskInfo() == null)) ? (((Number) C076V.LIZ.getValue()).intValue() != 1 || (c1854760yMk = this.LLJJJ) == null || (inputView = c1854760yMk.getInputView()) == null || inputView.hasFocus() || !((c1854760yMk2 = this.LLJJJ) == null || c1854760yMk2.getTakoReferenceAskInfo() == null)) ? 2131835714 : 2131849837 : 2131849833;
        }
        return context.getString(i);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final C1854790yMn Y5() {
        C1854530yMN state = Ap().getState();
        C1854540yMO c1854540yMO = state.LL;
        if (c1854540yMO.LIZ != EnumC1854550yMP.NONE) {
            return new C1854790yMn(c1854540yMO, state.LLILLJJLI, state.LLILLL, Ap().LLILLL, Ap().LLILZIL, this.LLJJIJI);
        }
        return null;
    }

    public final AIBotInfo getBotInfo() {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        long j = (iTakoContextAbility == null || (c13lcT713 = iTakoContextAbility.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null) ? 0L : c1863850ybP3.LLJJ;
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        int i = (iTakoContextAbility2 == null || (c13lcT712 = iTakoContextAbility2.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null) ? 0 : c1863850ybP2.LLJJI;
        ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility3 == null || (c13lcT71 = iTakoContextAbility3.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLJJIII) == null) {
            str = "";
        }
        return new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null);
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final boolean isTako() {
        return getBotInfo().botSource == 1 && getBotInfo().botId == 1;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void kd() {
        C1854760yMk c1854760yMk;
        ChoreographerFrameCallbackC1855380yNk voiceWaveView;
        if (!Bp().getState().LLILLJJLI || (c1854760yMk = this.LLJJJ) == null || (voiceWaveView = c1854760yMk.getVoiceWaveView()) == null) {
            return;
        }
        voiceWaveView.LIZJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1855370yNj c1855370yNj = this.LLJJJJLIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final TakoEditAskInfo Oo0() {
        return this.LLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Pd2() {
        Tp();
    }

    public static void tq(final BottomInputAssem bottomInputAssem) {
        EnumC1855560yO2 enumC1855560yO2;
        ChoreographerFrameCallbackC1855380yNk voiceWaveView;
        bottomInputAssem.getClass();
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.TAKO_VOICE_MESSAGE;
            Set<? extends EnumC1355290lN9> setLJLIIL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.AUDIO_FOCUS, EnumC1355290lN9.MICROPHONE});
            C1360910lWD c1360910lWD = new C1360910lWD(Collections.singleton(EnumC1355300lNA.VOICE_CALL), new InterfaceC1360930lWF() { // from class: X.0yMu
                @Override // X.InterfaceC1360930lWF
                public final void LIZ(EnumC1355300lNA enumC1355300lNA2, Set set) {
                    this.LIZ.pq();
                }
            });
            businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
            if (C1355270lN7.LIZIZ(businessCapabilityServiceLIZ.LJFF(enumC1355300lNA, setLJLIIL, c1360910lWD))) {
                C19EG c19egLIZ = C724240Sb0.LIZ(bottomInputAssem);
                if (c19egLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                    c1389890mGx.LJIIIZ(2131832241);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
        }
        C1855770yON c1855770yON = C1855770yON.LIZ;
        c1855770yON.getClass();
        if (!C1855770yON.LJ()) {
            bottomInputAssem.io();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> commonParams = bottomInputAssem.getCommonParams();
        c1862330yYx.getClass();
        C1862330yYx.LJJLIIIJLJLI("voice", "button_click", commonParams);
        bottomInputAssem.vq("click_voice_button");
        c1855770yON.getClass();
        if (C1855770yON.LJ()) {
            C1854760yMk c1854760yMk = bottomInputAssem.LLJJJ;
            if (c1854760yMk != null && (voiceWaveView = c1854760yMk.getVoiceWaveView()) != null) {
                voiceWaveView.LIZIZ();
            }
        } else {
            C1855550yO1 c1855550yO1 = bottomInputAssem.LLLFZ;
            if (c1855550yO1 != null && (enumC1855560yO2 = EnumC1855560yO2.HOLD_TO_TALK) != c1855550yO1.LIZIZ) {
                c1855550yO1.LIZIZ(enumC1855560yO2, true);
            }
            C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
            EnumC1855560yO2 enumC1855560yO22 = EnumC1855560yO2.HOLD_TO_TALK;
            c1860520yW2.getClass();
            C1860520yW2.LJJIJIIJI(enumC1855560yO22);
        }
        bottomInputAssem.yq();
    }

    public final void Jp(boolean z) {
        ViewOnAttachStateChangeListenerC20604515jv actionBarSugList;
        C20600815jK<InterfaceC1891350zJl> state;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            C1854150yLl activeSubModeItem = c1854760yMk.getActiveSubModeItem();
            if (activeSubModeItem != null && activeSubModeItem.LL == 2) {
                if (z && (actionBarSugList = c1854760yMk.getActionBarSugList()) != null && (state = actionBarSugList.getState()) != null && state.LJIIIIZZ() > 0) {
                    ViewOnAttachStateChangeListenerC20604515jv actionBarSugList2 = c1854760yMk.getActionBarSugList();
                    if (actionBarSugList2 != null) {
                        C0DSB.LIZJ(actionBarSugList2);
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv actionBarSugList3 = c1854760yMk.getActionBarSugList();
                    if (actionBarSugList3 != null) {
                        C0DSB.LIZIZ(actionBarSugList3);
                    }
                }
            }
            yq();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String M11(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel r0 = r4.Ap()
            X.002o r0 = r0.getState()
            X.0yMN r0 = (X.C1854530yMN) r0
            X.0yMO r2 = r0.LL
            X.0yMP r1 = r2.LIZ
            X.0yMP r0 = X.EnumC1854550yMP.NONE
            r3 = 0
            if (r1 != r0) goto L15
            r4.LLJJIJI = r3
        L15:
            if (r5 == 0) goto L9c
            if (r1 != r0) goto L97
            X.0yON r0 = X.C1855770yON.LIZ
            r0.getClass()
            boolean r0 = X.C1855770yON.LIZIZ()
            if (r0 == 0) goto L53
            X.0yNJ r0 = X.C1855110yNJ.LIZ
            r0.getClass()
            boolean r0 = X.C1855110yNJ.LIZ()
            if (r0 == 0) goto L53
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L3c
            r0 = 2131849707(0x7f1171eb, float:1.9332956E38)
            java.lang.String r3 = r1.getString(r0)
        L3c:
            X.0yOD r0 = X.C1855670yOD.LIZ
            r0.getClass()
            boolean r0 = X.C1855670yOD.LIZ()
            if (r0 == 0) goto L52
            X.0yMk r1 = r4.LLJJJ
            if (r1 == 0) goto L52
            X.0yMn r0 = r4.Y5()
            r1.setActiveSkillLabelData(r0)
        L52:
            return r3
        L53:
            boolean r0 = r4.isTako()
            if (r0 == 0) goto L6d
            boolean r0 = X.C07II.LIZ()
            if (r0 == 0) goto L6d
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L3c
            r0 = 2131849882(0x7f11729a, float:1.933331E38)
            java.lang.String r3 = r1.getString(r0)
            goto L3c
        L6d:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L3c
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L3c
            X.0yMk r0 = r4.LLJJJ
            if (r0 == 0) goto L95
            X.0yMZ r0 = r0.getPhotoDisplayLayout()
            if (r0 == 0) goto L95
            java.util.List r0 = r0.getDisplayPhotoList()
            if (r0 == 0) goto L95
            int r1 = r0.size()
        L8d:
            r0 = 2131755744(0x7f1002e0, float:1.9142376E38)
            java.lang.String r3 = r2.getQuantityString(r0, r1)
            goto L3c
        L95:
            r1 = 0
            goto L8d
        L97:
            java.lang.String r3 = r4.zp(r2)
            goto L3c
        L9c:
            java.lang.String r3 = r4.zp(r2)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem.M11(boolean):java.lang.String");
    }

    public final void Up(List<C1854470yMH> list) {
        int displayItemCount;
        boolean z;
        boolean z2;
        boolean z3;
        ViewOnAttachStateChangeListenerC20604515jv actionBarSugList;
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv actionBarSugList2;
        ViewOnAttachStateChangeListenerC20604515jv actionBarSugList3;
        ViewOnAttachStateChangeListenerC20604515jv actionBarSugList4;
        C20600815jK<InterfaceC1891350zJl> state2;
        C1854650yMZ photoDisplayLayout;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            c1854760yMk.setActionBarSugListData(list);
        }
        C1854760yMk c1854760yMk2 = this.LLJJJ;
        if (c1854760yMk2 != null && (photoDisplayLayout = c1854760yMk2.getPhotoDisplayLayout()) != null) {
            displayItemCount = photoDisplayLayout.getDisplayItemCount();
        } else {
            displayItemCount = 0;
        }
        if (displayItemCount > 0) {
            z = true;
        } else {
            z = false;
        }
        if (list != null && (!((ArrayList) list).isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C1854760yMk c1854760yMk3 = this.LLJJJ;
            if (c1854760yMk3 != null && (actionBarSugList4 = c1854760yMk3.getActionBarSugList()) != null && (state2 = actionBarSugList4.getState()) != null) {
                state2.LJIILL(list, null);
            }
            z3 = true;
        } else {
            C1854760yMk c1854760yMk4 = this.LLJJJ;
            if (c1854760yMk4 != null && (actionBarSugList = c1854760yMk4.getActionBarSugList()) != null && (state = actionBarSugList.getState()) != null) {
                state.LJFF(null);
            }
            z3 = false;
        }
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((C1854470yMH) it2.next()).LLJILJIL == EnumC1854500yMK.AUTO_SEND_PROMPT) {
                    break;
                }
            }
            z = z3;
        } else {
            z = z3;
        }
        if (z) {
            C1854760yMk c1854760yMk5 = this.LLJJJ;
            if (c1854760yMk5 != null && (actionBarSugList3 = c1854760yMk5.getActionBarSugList()) != null) {
                C0DSB.LIZJ(actionBarSugList3);
            }
            yq();
            return;
        }
        C1854760yMk c1854760yMk6 = this.LLJJJ;
        if (c1854760yMk6 != null && (actionBarSugList2 = c1854760yMk6.getActionBarSugList()) != null) {
            C0DSB.LIZIZ(actionBarSugList2);
        }
        yq();
    }

    public final void hp(int i) {
        FrameLayout frameLayout;
        if (C14KQ.LIZLLL(getContext()) <= 0 && (frameLayout = this.LLLILZJ) != null) {
            C426750GoL.LJIIIZ(frameLayout, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), false, 23);
        }
    }

    public final void iq(boolean z) {
        Integer numValueOf;
        int i;
        if (z) {
            FrameLayout frameLayout = this.LLJJL;
            if (frameLayout != null) {
                C19751612Pq c19751612PqLIZ = this.LLJLLL;
                if (c19751612PqLIZ == null) {
                    C19659111vp c19659111vp = new C19659111vp();
                    C1855770yON.LIZ.getClass();
                    if (C1855770yON.LIZIZ()) {
                        i = 6;
                    } else {
                        i = 1;
                    }
                    c19659111vp.LIZJ = C418440Gaw.LIZIZ(i);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(20);
                    if (C1855770yON.LIZIZ()) {
                        c19659111vp.LJFF = Integer.valueOf(Color.argb(31, 0, 0, 0));
                    } else {
                        c19659111vp.LJ = Integer.valueOf(R.attr.oz);
                    }
                    c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
                    c19751612PqLIZ = c19659111vp.LIZ(frameLayout.getContext());
                    this.LLJLLL = c19751612PqLIZ;
                }
                frameLayout.setBackground(c19751612PqLIZ);
                FrameLayout frameLayout2 = this.LLJJJJ;
                if (frameLayout2 != null) {
                    Drawable drawableLIZ = this.LLL;
                    if (drawableLIZ == null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                        C1855770yON.LIZ.getClass();
                        if (C1855770yON.LIZIZ()) {
                            numValueOf = Integer.valueOf(R.attr.a1b);
                        } else {
                            numValueOf = Integer.valueOf(R.attr.zm);
                        }
                        c384050F3z.LIZIZ = numValueOf;
                        if (C1855770yON.LIZIZ()) {
                            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                            c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
                        }
                        drawableLIZ = c384050F3z.LIZ(frameLayout.getContext());
                        this.LLL = drawableLIZ;
                    }
                    frameLayout2.setBackground(drawableLIZ);
                }
                C1855770yON.LIZ.getClass();
                if (C1855770yON.LIZIZ()) {
                    View view = this.LLJJLIIIJLLLLLLLZ;
                    if (view != null) {
                        C19751612Pq c19751612PqLIZ2 = this.LLJZ;
                        if (c19751612PqLIZ2 == null) {
                            C19659111vp c19659111vp2 = new C19659111vp();
                            c19659111vp2.LIZJ = -C418440Gaw.LIZIZ(2);
                            c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(12);
                            c19659111vp2.LJFF = Integer.valueOf(Color.argb(8, 0, 0, 0));
                            c19659111vp2.LIZ = C418440Gaw.LIZIZ(16);
                            c19751612PqLIZ2 = c19659111vp2.LIZ(frameLayout.getContext());
                            this.LLJZ = c19751612PqLIZ2;
                        }
                        view.setBackground(c19751612PqLIZ2);
                    }
                    zq();
                    if (this.LLLFF == null) {
                        ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych = new ViewOnLayoutChangeListenerC1864650ych(this, 2);
                        this.LLLFF = viewOnLayoutChangeListenerC1864650ych;
                        frameLayout.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
                    }
                } else {
                    View view2 = this.LLJJLIIIJLLLLLLLZ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                }
            }
            FrameLayout frameLayout3 = this.LLJL;
            if (frameLayout3 != null) {
                C19751612Pq c19751612PqLIZ3 = this.LLJZIJLIL;
                if (c19751612PqLIZ3 == null) {
                    C19659111vp c19659111vp3 = new C19659111vp();
                    c19659111vp3.LIZJ = C418440Gaw.LIZIZ(6);
                    c19659111vp3.LIZLLL = C418440Gaw.LIZIZ(30);
                    c19659111vp3.LJ = Integer.valueOf(R.attr.oz);
                    c19659111vp3.LIZ = C418440Gaw.LIZIZ(999);
                    c19751612PqLIZ3 = c19659111vp3.LIZ(frameLayout3.getContext());
                    this.LLJZIJLIL = c19751612PqLIZ3;
                }
                frameLayout3.setBackground(c19751612PqLIZ3);
                FrameLayout frameLayout4 = this.LLJLIL;
                if (frameLayout4 != null) {
                    Drawable drawableLIZ2 = this.LLLF;
                    if (drawableLIZ2 == null) {
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1b);
                        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                        c384050F3z2.LJFF = Integer.valueOf(R.attr.a03);
                        drawableLIZ2 = c384050F3z2.LIZ(frameLayout3.getContext());
                        this.LLLF = drawableLIZ2;
                    }
                    frameLayout4.setBackground(drawableLIZ2);
                    return;
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout5 = this.LLJJL;
        if (frameLayout5 != null) {
            frameLayout5.setBackground(null);
        }
        FrameLayout frameLayout6 = this.LLJJL;
        if (frameLayout6 != null) {
            frameLayout6.setBackground(null);
        }
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    public final boolean jq(String str) {
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            yq();
            return false;
        }
        C1855670yOD.LIZ.getClass();
        if (C1855670yOD.LIZ()) {
            if (!(!Ip().LIZJ.isEmpty())) {
                return false;
            }
            C1854760yMk c1854760yMk = this.LLJJJ;
            if (c1854760yMk != null && c1854760yMk.getActiveSubModeItem() != null) {
                return false;
            }
        } else {
            if (!isTako()) {
                return false;
            }
            if ((!Intrinsics.LJFF(str, "default_entrance") && !Intrinsics.LJFF(str, "guide_view")) || !(!Ip().LIZJ.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Runnable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(X.C1854150yLl r21) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem.lp(X.0yLl):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x0a14, code lost:
    
        if (r6 != null) goto L327;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05cc A[PHI: r4 r7
      0x05cc: PHI (r4v15 boolean) = (r4v13 boolean), (r4v13 boolean), (r4v16 boolean) binds: [B:238:0x0814, B:239:0x0816, B:148:0x05ca] A[DONT_GENERATE, DONT_INLINE]
      0x05cc: PHI (r7v36 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v37 java.lang.String) binds: [B:238:0x0814, B:239:0x0816, B:148:0x05ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0285  */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v79 */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r38) {
        /*
            Method dump skipped, instruction units count: 2821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem.onViewCreated(android.view.View):void");
    }

    public final void qq(boolean z) {
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        EnumC1855560yO2 enumC1855560yO2 = EnumC1855560yO2.KEYBOARD;
        c1860520yW2.getClass();
        C1860520yW2.LJJIJIIJI(enumC1855560yO2);
        if (!z) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> commonParams = getCommonParams();
            c1862330yYx.getClass();
            C1862330yYx.LJJLIIIJLJLI("input", null, commonParams);
            Cz0(0L, false);
        }
        C1855550yO1 c1855550yO1 = this.LLLFZ;
        if (c1855550yO1 != null && enumC1855560yO2 != c1855550yO1.LIZIZ) {
            c1855550yO1.LIZIZ(enumC1855560yO2, false);
        }
        yq();
    }

    public final String up(EnumC1854550yMP enumC1854550yMP) {
        int i = C1854600yMU.LIZ[enumC1854550yMP.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "default_entrance";
                }
                return "image_to_video";
            }
            return "edit_image";
        }
        return "homework";
    }

    public final void vq(String str) {
        String str2;
        String str3;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strUN0;
        EnumC1863020ya4 enumC1863020ya4JS1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLLLLLIL.getValue();
        if (takoChatUIAbility != null && takoChatUIAbility.Ve0()) {
            ITakoContextAbility iTakoContextAbilityFp = Fp();
            String mobOnboardingStyle = null;
            if (iTakoContextAbilityFp != null && (c13lcAp02 = iTakoContextAbilityFp.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str2 = c1864200yby2.LL;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            ITakoContextAbility iTakoContextAbilityFp2 = Fp();
            if (iTakoContextAbilityFp2 != null && (c13lcAp0 = iTakoContextAbilityFp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str3 = c1864200yby.LLILLJJLI;
            } else {
                str3 = null;
            }
            ITakoContextAbility iTakoContextAbilityFp3 = Fp();
            if (iTakoContextAbilityFp3 != null && (c13lcT71 = iTakoContextAbilityFp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP.LL;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = c1863850ybP.LLILLJJLI;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = c1863850ybP.LLILZIL;
                if (str7 == null) {
                    str7 = "";
                }
                TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) this.LLLLLLIL.getValue();
                if (takoChatUIAbility2 != null) {
                    strUN0 = takoChatUIAbility2.uN0();
                } else {
                    strUN0 = null;
                }
                String str8 = c1863850ybP.LLJ;
                if (str8 == null) {
                    str8 = "";
                }
                if (str3 != null) {
                    str4 = str3;
                }
                TakoChatUIAbility takoChatUIAbility3 = (TakoChatUIAbility) this.LLLLLLIL.getValue();
                if (takoChatUIAbility3 != null && (enumC1863020ya4JS1 = takoChatUIAbility3.jS1()) != null) {
                    mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                }
                C1862330yYx.LJJZ(512, c1862330yYx, str5, str6, str7, str2, c1863850ybP.LLIZ, strUN0, str8, str4, str, mobOnboardingStyle);
            }
        }
    }

    public final String zp(C1854540yMO c1854540yMO) {
        boolean z;
        C1855450yNr.LIZ.getClass();
        C1153090g71.LIZ.getClass();
        if (C1153090g71.LIZIZ(0, C1855450yNr.class) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LLJJIJI = null;
            String str = c1854540yMO.LIZJ;
            if (str != null && str.length() > 0) {
                return str;
            }
            return NV1();
        }
        EnumC1854550yMP enumC1854550yMP = c1854540yMO.LIZ;
        if (enumC1854550yMP != this.LLJJIII) {
            this.LLJJI = null;
            this.LLJJIII = enumC1854550yMP;
            this.LLJJIJI = null;
        }
        List<String> list = c1854540yMO.LJIIJ;
        if (list != null && !list.isEmpty()) {
            if (this.LLJJI == null) {
                String str2 = (String) C13LP.LJLJJI(list, AbstractC19994813Le.Default);
                this.LLJJI = str2;
                this.LLJJIJI = str2;
            }
        } else {
            this.LLJJIJI = null;
        }
        String str3 = this.LLJJI;
        if (str3 != null || ((str3 = c1854540yMO.LIZJ) != null && str3.length() > 0)) {
            return str3;
        }
        return NV1();
    }

    public final void Cz0(long j, boolean z) {
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIIJJI() != EnumC1855560yO2.KEYBOARD) {
            return;
        }
        this.LLJJIJIIJIL = false;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null) {
            if (C1862920yZu.LIZ()) {
                C1842270y2b inputView = c1854760yMk.getInputView();
                if (inputView != null) {
                    HandlerHook.viewPostDelay(inputView, new ARunnableS46S0110000_27(inputView, z, 3), j);
                    return;
                }
                return;
            }
            HandlerHook.viewPostDelay(c1854760yMk, new ARunnableS46S0110000_27(c1854760yMk, z, 2), j);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Jd(TakoReferenceAskInfo takoReferenceAskInfo, boolean z) {
        C1854760yMk c1854760yMk;
        C1854650yMZ photoDisplayLayout;
        List<BaseImage> displayPhotoList;
        C1854760yMk c1854760yMk2;
        C1842270y2b inputView;
        C1854760yMk c1854760yMk3 = this.LLJJJ;
        if (c1854760yMk3 != null) {
            c1854760yMk3.setTakoReferenceAskInfo(takoReferenceAskInfo);
        }
        if (C1855050yND.LIZIZ(takoReferenceAskInfo)) {
            C1854760yMk c1854760yMk4 = this.LLJJJ;
            if (c1854760yMk4 != null) {
                C1855770yON.LIZ.getClass();
                c1854760yMk4.LJIIIZ(C1855770yON.LIZIZ());
            }
        } else {
            C1854760yMk c1854760yMk5 = this.LLJJJ;
            if (c1854760yMk5 != null) {
                c1854760yMk5.LJIIIZ(true);
            }
        }
        if (Vp() && (c1854760yMk = this.LLJJJ) != null && (photoDisplayLayout = c1854760yMk.getPhotoDisplayLayout()) != null && (displayPhotoList = photoDisplayLayout.getDisplayPhotoList()) != null && displayPhotoList.isEmpty() && (c1854760yMk2 = this.LLJJJ) != null && (inputView = c1854760yMk2.getInputView()) != null) {
            inputView.setHintTextWithEndEllipsize(NV1());
        }
        if (z) {
            qq(true);
            Cz0(0L, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void eh(String str, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        AwS110S1200000_27 awS110S1200000_27 = new AwS110S1200000_27(this, (BottomInputAssem) str, (String) function2, (Function2<? super BaseImage, ? super Integer, Unit>) 3);
        if (c19egLIZ != null) {
            C449180HjQ c449180HjQ = C449180HjQ.LIZ;
            AwS396S0200000_30 awS396S0200000_30 = new AwS396S0200000_30(c19egLIZ, awS110S1200000_27, 0);
            c449180HjQ.getClass();
            C449180HjQ.LIZLLL(awS396S0200000_30);
        }
        Tp();
        dq();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fg(com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem.fg(com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void na(String str, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        C20189513zB.LJIIIIZZ(1, C724240Sb0.LIZ(this), new AwS110S1200000_27(this, (BottomInputAssem) str, (String) function2, (Function2<? super BaseImage, ? super Integer, Unit>) 4));
        Tp();
        dq();
    }

    public final void wq(C1854150yLl c1854150yLl, String str) {
        if (c1854150yLl != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = getCommonParams().get("enter_from");
            String str3 = getCommonParams().get("enter_method");
            String str4 = getCommonParams().get("process_id");
            String str5 = getCommonParams().get("tako_session_id");
            if (str5 == null) {
                str5 = "";
            }
            C1862330yYx.LJLI(c1862330yYx, str2, str3, str4, str5, getCommonParams().get("tako_chat_id"), "off", c1854150yLl.LLJ, c1854150yLl.LLJJI, str, null, null, "base", 5632);
        }
    }

    public final void xq(C1854470yMH c1854470yMH, C1854470yMH c1854470yMH2) {
        List<C1854470yMH> actionBarSugListData;
        int iIndexOf;
        ArrayList arrayList;
        ViewOnAttachStateChangeListenerC20604515jv actionBarSugList;
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk != null && (actionBarSugListData = c1854760yMk.getActionBarSugListData()) != null && (iIndexOf = actionBarSugListData.indexOf(c1854470yMH)) >= 0) {
            C1854760yMk c1854760yMk2 = this.LLJJJ;
            if (c1854760yMk2 != null && (actionBarSugList = c1854760yMk2.getActionBarSugList()) != null) {
                C20600815jK<InterfaceC1891350zJl> state = actionBarSugList.getState();
                if (state != null) {
                    state.LJIILJJIL(iIndexOf, c1854470yMH2);
                }
                HandlerHook.viewPost(actionBarSugList, new ARunnableS38S0101000_27(iIndexOf, actionBarSugList, 0));
            }
            C1854760yMk c1854760yMk3 = this.LLJJJ;
            if (c1854760yMk3 != null) {
                List<C1854470yMH> actionBarSugListData2 = c1854760yMk3.getActionBarSugListData();
                if (actionBarSugListData2 != null) {
                    arrayList = new ArrayList(actionBarSugListData2);
                    ListProtector.set(arrayList, iIndexOf, c1854470yMH2);
                } else {
                    arrayList = null;
                }
                c1854760yMk3.setActionBarSugListData(arrayList);
            }
        }
    }

    public final void aq(String str, C1852750yJV c1852750yJV, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        C1854150yLl activeSubModeItem;
        C1854760yMk c1854760yMk;
        C1854650yMZ photoDisplayLayout;
        C1854760yMk c1854760yMk2;
        C1852120yIU photoPickerEntranceView;
        if (c1852750yJV.LIZIZ()) {
            BaseImage baseImage = c1852750yJV.LIZIZ;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 654);
            if (baseImage != null && (c1854760yMk = this.LLJJJ) != null && (photoDisplayLayout = c1854760yMk.getPhotoDisplayLayout()) != null) {
                photoDisplayLayout.LIZ(str, baseImage, awS571S0100000_27);
                if (photoDisplayLayout.getDisplayItemCount() == C20189513zB.LJI(str) && (c1854760yMk2 = this.LLJJJ) != null && (photoPickerEntranceView = c1854760yMk2.getPhotoPickerEntranceView()) != null) {
                    photoPickerEntranceView.LIZ(EnumC1852100yIS.PHOTO_PICKER_PANEL_DISABLE);
                    C1852310yIn c1852310yIn = this.LLLIL;
                    if (c1852310yIn != null) {
                        int visibility = c1852310yIn.getVisibility();
                        c1852310yIn.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c1852310yIn);
                    }
                }
            }
            if (function2 != null) {
                function2.invoke(c1852750yJV.LIZIZ, 0);
            }
        } else {
            if (c1852750yJV.LIZ != 4) {
                String strLIZ = c1852750yJV.LIZ();
                if (C07I8.LIZIZ) {
                    C0DQF.LJ(getContentView(), strLIZ, null, null, false, 28);
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
        if (c1852750yJV.LIZ == 4) {
            C1854760yMk c1854760yMk3 = this.LLJJJ;
            if (c1854760yMk3 != null && (activeSubModeItem = c1854760yMk3.getActiveSubModeItem()) != null && activeSubModeItem.LL == 2) {
                C1855770yON.LIZ.getClass();
                if (!C1855770yON.LIZIZ()) {
                    Cz0(300L, false);
                    return;
                }
                return;
            }
            return;
        }
        if (C1862920yZu.LIZ()) {
            Cz0(200L, true);
        } else {
            Cz0(0L, false);
        }
    }

    public final void Wp(final String str, Context context, BaseImage baseImage, NewActionAIImageItem newActionAIImageItem) {
        C19EG c19egLIZIZ;
        View contentView = getContentView();
        ConvertStyle convertStyle = null;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        FragmentManager fragmentManagerLIZ = C20230914Dz.LIZ(contentView, c19egLIZIZ);
        if (fragmentManagerLIZ == null) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        C1845400y7e c1845400y7e = TakoAIImageConvertStyleFragment.LLJJIJI;
        String str2 = baseImage.uri;
        if (newActionAIImageItem != null) {
            convertStyle = newActionAIImageItem.convertStyle;
        }
        String str3 = getCommonParams().get("enter_from");
        String str4 = getCommonParams().get("enter_method");
        String str5 = getCommonParams().get("process_id");
        String str6 = getCommonParams().get("tako_session_id");
        String str7 = getCommonParams().get("tako_chat_id");
        c1845400y7e.getClass();
        TakoAIImageConvertStyleFragment takoAIImageConvertStyleFragment = new TakoAIImageConvertStyleFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("key_image_url", str2, bundle);
        C786410Ut5.LJJIZ(bundle, "key_data", convertStyle);
        C786410Ut5.LJJJI("key_enter_from", str3, bundle);
        C786410Ut5.LJJJI("key_enter_method", str4, bundle);
        C786410Ut5.LJJJI("key_process_id", str5, bundle);
        C786410Ut5.LJJJI("key_tako_session_id", str6, bundle);
        C786410Ut5.LJJJI("key_tako_chat_id", str7, bundle);
        takoAIImageConvertStyleFragment.setArguments(bundle);
        takoAIImageConvertStyleFragment.LLJJI = new AwS29S1400000_27(this, context, baseImage, str, takoAIImageConvertStyleFragment, 0);
        if (!Intrinsics.LJFF(str, "image_shortcuts")) {
            takoAIImageConvertStyleFragment.LLJJIII = new AwS271S0300000_27(this, context, newActionAIImageItem, 4);
        }
        c1390920mIc.LIZ.LLJJIJI = takoAIImageConvertStyleFragment;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener(this) { // from class: X.0yG1
            public final /* synthetic */ BottomInputAssem LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str8;
                if (Intrinsics.LJFF(str, "image_shortcuts")) {
                    String str9 = TuxSheet._pnsPageId;
                    if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C1845440y7i.LIZ)) {
                        this.LLILLJJLI.ip();
                        this.LLILLJJLI.Qp();
                    }
                } else {
                    TakoSubModeBarAbility takoSubModeBarAbility = (TakoSubModeBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), TakoSubModeBarAbility.class, null);
                    if (takoSubModeBarAbility != null) {
                        takoSubModeBarAbility.zJ0();
                    }
                    this.LLILLJJLI.ip();
                }
                String str10 = TuxSheet._pnsPageId;
                if (!Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C1845420y7g.LIZ)) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str11 = this.LLILLJJLI.getCommonParams().get("enter_from");
                    String str12 = this.LLILLJJLI.getCommonParams().get("enter_method");
                    String str13 = this.LLILLJJLI.getCommonParams().get("process_id");
                    String str14 = this.LLILLJJLI.getCommonParams().get("tako_session_id");
                    if (str14 == null) {
                        str14 = "";
                    }
                    if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C1845430y7h.LIZ)) {
                        str8 = "click_close";
                    } else {
                        str8 = "swipe_down";
                    }
                    C1862330yYx.LJLI(c1862330yYx, str11, str12, str13, str14, this.LLILLJJLI.getCommonParams().get("tako_chat_id"), "off", "ai_image", "convert_style", str8, null, null, "base", 5632);
                }
            }
        };
        tuxSheet.show(fragmentManagerLIZ, "TakoAIImageConvertStyleFragment");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void w7(EnumC1854550yMP enumC1854550yMP, String str, String str2, List<BaseImage> list, Integer num, String str3, TakoTemplateInfo takoTemplateInfo, boolean z, boolean z2) {
        List<BaseImage> listLIZ;
        BaseImage baseImage;
        int iWQ2;
        C1842270y2b inputView;
        C1842270y2b inputView2;
        C1854650yMZ photoDisplayLayout;
        C1854650yMZ photoDisplayLayout2;
        C1854650yMZ photoDisplayLayout3;
        List<BaseImage> displayPhotoList;
        Integer num2 = num;
        C1855670yOD.LIZ.getClass();
        if (!C1855670yOD.LIZ()) {
            return;
        }
        if (C1818807Ak.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            kp();
        }
        if (enumC1854550yMP != EnumC1854550yMP.NONE) {
            C1860520yW2.LIZ.getClass();
            if (C1860520yW2.LJIIJJI() != EnumC1855560yO2.KEYBOARD) {
                C1855770yON.LIZ.getClass();
                if (!C1855770yON.LIZLLL() || z2) {
                    qq(true);
                }
            }
        }
        if (list != null) {
            listLIZ = AnonymousClass1418.LIZ(list);
        } else {
            listLIZ = null;
        }
        C1854760yMk c1854760yMk = this.LLJJJ;
        if (c1854760yMk == null || (photoDisplayLayout3 = c1854760yMk.getPhotoDisplayLayout()) == null || (displayPhotoList = photoDisplayLayout3.getDisplayPhotoList()) == null || (baseImage = (BaseImage) C13LP.LJJJLL(displayPhotoList)) == null) {
            if (listLIZ != null) {
                baseImage = (BaseImage) C13LP.LJJJLL(listLIZ);
            } else {
                baseImage = null;
            }
        }
        if ((num2 != null && num2.intValue() > 0) || (takoTemplateInfo != null && (num2 = takoTemplateInfo.defaultStdSize) != null && num2.intValue() > 0)) {
            iWQ2 = num2.intValue();
        } else {
            Ap();
            iWQ2 = TakoInputSkillLabelViewModel.wQ2(baseImage);
        }
        Ap().AQ2(enumC1854550yMP, str, str3, Integer.valueOf(iWQ2), takoTemplateInfo, z);
        if (listLIZ != null) {
            C1854760yMk c1854760yMk2 = this.LLJJJ;
            if (c1854760yMk2 != null && (photoDisplayLayout2 = c1854760yMk2.getPhotoDisplayLayout()) != null) {
                photoDisplayLayout2.LIZIZ();
            }
            for (BaseImage baseImage2 : listLIZ) {
                C1854760yMk c1854760yMk3 = this.LLJJJ;
                if (c1854760yMk3 != null && (photoDisplayLayout = c1854760yMk3.getPhotoDisplayLayout()) != null) {
                    photoDisplayLayout.LIZ(up(enumC1854550yMP), baseImage2, null);
                }
            }
        }
        if (str2 != null) {
            C1854760yMk c1854760yMk4 = this.LLJJJ;
            if (c1854760yMk4 != null && (inputView2 = c1854760yMk4.getInputView()) != null) {
                inputView2.setText(str2);
            }
            C1854760yMk c1854760yMk5 = this.LLJJJ;
            if (c1854760yMk5 != null && (inputView = c1854760yMk5.getInputView()) != null) {
                inputView.setSelection(str2.length());
            }
        }
    }
}
