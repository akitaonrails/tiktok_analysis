package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2;

import X.C019F;
import X.C01GW;
import X.C054G;
import X.C07I1;
import X.C07QF;
import X.C07QK;
import X.C09R3;
import X.C1155550gAz;
import X.C1163410gNf;
import X.C12KQ;
import X.C12P5;
import X.C13LC;
import X.C13LE;
import X.C13MK;
import X.C14KQ;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1854150yLl;
import X.C1854470yMH;
import X.C1854790yMn;
import X.C1855220yNU;
import X.C1861390yXR;
import X.C1863850ybP;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19751612Pq;
import X.C2217381BqS;
import X.C319390CfZ;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.EnumC1854550yMP;
import X.EnumC197015126j;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnLayoutChangeListenerC1864650ych;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.IPhotoPickerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.reference.IReferenceAskInfoAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.IImageShortcutsAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.FeedbarDrawCreateInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class BottomInputAssemV2 extends UISlotAssem implements TakoInputViewUIAbility, IBottomInputHostAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public View LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public C19751612Pq LLJJJJLIIL;
    public C19751612Pq LLJJL;
    public Drawable LLJJLIIIJLLLLLLLZ;
    public ViewOnLayoutChangeListenerC1864650ych LLJL;
    public Boolean LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public final C1559260qg8 LLJLL;
    public final C01GW LLJLLIL;
    public final AssemVMLazy LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomInputAssemV2.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BottomInputAssemV2.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BottomInputAssemV2.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BottomInputAssemV2.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public BottomInputAssemV2() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(166));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2285), AFwS269S0000000_27.get$arr$(167), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(165));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2286), AFwS269S0000000_27.get$arr$(168), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ3, 2287), AFwS269S0000000_27.get$arr$(169), null, true);
        this.LLJLL = new C1559260qg8(new C723580SZw(this, C1155550gAz.class, null), checkSupervisorPrepared());
        this.LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 663));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ4, 2288), AFwS269S0000000_27.get$arr$(170), null, true);
        this.LLJZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 664));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 662));
        this.LLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 661));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fkb;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Pd2() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 327361765 || iHashCode == 584814039) {
            return this;
        }
        return null;
    }

    public final void TZ1() {
        if (this.LLLFFI) {
            return;
        }
        C1163410gNf.LIZ.getClass();
        if (!C1163410gNf.LIZJ()) {
            this.LLLFFI = true;
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 581));
            return;
        }
        this.LLLFFI = true;
        IInputInnerAbility iInputInnerAbility = (IInputInnerAbility) this.LLJZIJLIL.getValue();
        if (iInputInnerAbility != null) {
            iInputInnerAbility.TZ1();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Tc() {
        IVoiceInputAbility iVoiceInputAbility = (IVoiceInputAbility) this.LLJZ.getValue();
        if (iVoiceInputAbility != null) {
            iVoiceInputAbility.Tc();
        }
    }

    public final void YA() {
        if (this.LLLF) {
            return;
        }
        C1163410gNf.LIZ.getClass();
        if (!C1163410gNf.LIZJ()) {
            this.LLLF = true;
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 584));
            return;
        }
        this.LLLF = true;
        IInputInnerAbility iInputInnerAbility = (IInputInnerAbility) this.LLJZIJLIL.getValue();
        if (iInputInnerAbility != null) {
            iInputInnerAbility.YA();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final View getInput() {
        IInputInnerAbility iInputInnerAbility = (IInputInnerAbility) this.LLJZIJLIL.getValue();
        if (iInputInnerAbility != null) {
            return iInputInnerAbility.getInput();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void kd() {
        IVoiceInputAbility iVoiceInputAbility = (IVoiceInputAbility) this.LLJZ.getValue();
        if (iVoiceInputAbility != null) {
            iVoiceInputAbility.kd();
        }
    }

    public final void lp() {
        if (this.LLLFF) {
            return;
        }
        this.LLLFF = true;
        C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 583));
    }

    public final BottomInputViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    public final float op() {
        C1163410gNf.LIZ.getClass();
        return C1163410gNf.LIZJ() ? mp().getState().LLJJIJI ? C418440Gaw.LIZIZ(24) : C418440Gaw.LIZIZ(999) : C418440Gaw.LIZIZ(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp() {
        /*
            r8 = this;
            java.lang.Boolean r1 = r8.LLJLIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r7 = 1
            if (r0 == 0) goto L71
            X.0gNf r0 = X.C1163410gNf.LIZ
            r0.getClass()
            boolean r0 = X.C1163410gNf.LIZ()
            if (r0 != 0) goto L71
            r6 = 1
        L17:
            android.view.View r1 = r8.LLJJJ
            if (r1 == 0) goto L21
            if (r6 == 0) goto L6e
            r0 = 0
        L1e:
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L21:
            android.view.View r2 = r8.LLJJJIL
            if (r2 == 0) goto L64
            android.view.View r5 = r8.LLJJJ
            if (r5 == 0) goto L64
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            if (r4 == 0) goto L64
            int r0 = r2.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L69
            int r3 = r1.intValue()
        L41:
            if (r6 == 0) goto L67
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r2 = X.C814420VxA.LIZIZ(r0)
        L50:
            int r1 = r3 + r2
            if (r3 <= 0) goto L65
            int r0 = r4.height
            if (r0 == r1) goto L65
            r4.height = r1
        L5a:
            float r0 = (float) r2
            float r0 = -r0
            X.C786410Ut5.ed(r5, r0)
            if (r7 == 0) goto L64
            X.C786410Ut5.W5(r5, r4)
        L64:
            return
        L65:
            r7 = 0
            goto L5a
        L67:
            r2 = 0
            goto L50
        L69:
            int r3 = r2.getMeasuredHeight()
            goto L41
        L6e:
            r0 = 8
            goto L1e
        L71:
            r6 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.BottomInputAssemV2.tp():void");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final void yl0() {
        TakoBotInfo takoBotInfo;
        if (this.LLLFZ) {
            return;
        }
        if (getBotInfo().botSource != 1 || getBotInfo().botId != 1) {
            C1155550gAz c1155550gAz = (C1155550gAz) this.LLJLL.getValue();
            if (!C13MK.LIZ((c1155550gAz == null || (takoBotInfo = c1155550gAz.LL) == null) ? null : Boolean.valueOf(takoBotInfo.supportImage))) {
                return;
            }
        }
        if (C07I1.LIZ()) {
            this.LLLFZ = true;
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 582));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final boolean BF() {
        return mp().getState().LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final View C62() {
        return getContentView();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final String NV1() {
        Context context = getContext();
        if (context != null) {
            return context.getString(2131849707);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final TakoEditAskInfo Oo0() {
        return mp().getState().LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Pt2() {
        mp().AQ2("");
        FB1(true);
        Jd(null, false);
        fg(null, true);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final List<BaseImage> TG1() {
        return mp().TG1();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final C1854790yMn Y5() {
        ISkillLabelAbilityV2 iSkillLabelAbilityV2 = (ISkillLabelAbilityV2) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISkillLabelAbilityV2.class, null);
        if (iSkillLabelAbilityV2 != null) {
            return iSkillLabelAbilityV2.Y5();
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

    public final void ip() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            C19751612Pq c19751612PqLIZ = this.LLJJJJLIIL;
            if (c19751612PqLIZ == null) {
                C19659111vp c19659111vp = new C19659111vp();
                C1163410gNf.LIZ.getClass();
                if (C1163410gNf.LIZ()) {
                    c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
                    c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(24);
                    c19659111vp.LJ = Integer.valueOf(R.attr.ox);
                    c19659111vp.LIZ = op();
                } else {
                    c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(20);
                    c19659111vp.LJFF = Integer.valueOf(Color.argb(31, 0, 0, 0));
                    c19659111vp.LIZ = op();
                }
                c19751612PqLIZ = c19659111vp.LIZ(context);
                this.LLJJJJLIIL = c19751612PqLIZ;
            }
            view.setBackground(c19751612PqLIZ);
            View view2 = this.LLJJJ;
            if (view2 != null) {
                C19751612Pq c19751612PqLIZ2 = this.LLJJL;
                if (c19751612PqLIZ2 == null) {
                    C19659111vp c19659111vp2 = new C19659111vp();
                    c19659111vp2.LIZJ = -C418440Gaw.LIZIZ(2);
                    c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(12);
                    c19659111vp2.LJFF = Integer.valueOf(Color.argb(8, 0, 0, 0));
                    c19659111vp2.LIZ = op();
                    c19751612PqLIZ2 = c19659111vp2.LIZ(context);
                    this.LLJJL = c19751612PqLIZ2;
                }
                view2.setBackground(c19751612PqLIZ2);
            }
            tp();
            if (this.LLJL == null) {
                ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych = new ViewOnLayoutChangeListenerC1864650ych(this, 3);
                this.LLJL = viewOnLayoutChangeListenerC1864650ych;
                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
            }
        }
        View view3 = this.LLJJJIL;
        if (view3 != null) {
            Drawable drawableLIZ = this.LLJJLIIIJLLLLLLLZ;
            if (drawableLIZ == null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(op());
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
                drawableLIZ = c384050F3z.LIZ(context);
                this.LLJJLIIIJLLLLLLLZ = drawableLIZ;
            }
            view3.setBackground(drawableLIZ);
        }
    }

    public final void kp() {
        View view;
        Drawable drawableLIZ;
        Context context = getContext();
        if (context == null || (view = this.LLJJJJJIL) == null) {
            return;
        }
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) this.LLL.getValue();
        if (C13MK.LIZ(iTakoAIBotUIAbility != null ? Boolean.valueOf(iTakoAIBotUIAbility.RL()) : null)) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(op());
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
            drawableLIZ = c384050F3z.LIZ(context);
        } else {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(op());
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.c3);
            drawableLIZ = c384050F3z2.LIZ(context);
        }
        view.setBackground(drawableLIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final IPhotoPickerAbility sp() {
        return (IPhotoPickerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoPickerAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final TakoReferenceAskInfo xr2() {
        return mp().getState().LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final C1854150yLl z22() {
        return mp().getState().LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final String za1() {
        return mp().getState().LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final String zi1() {
        return mp().getState().LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final void FB1(boolean z) {
        yl0();
        IPhotoPickerAbility iPhotoPickerAbilitySp = sp();
        if (iPhotoPickerAbilitySp != null) {
            iPhotoPickerAbilitySp.OQ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final void GU1(int[] iArr) {
        View view = this.LLJJIJI;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final void en(List<C1854470yMH> list) {
        TZ1();
        IImageShortcutsAbility iImageShortcutsAbility = (IImageShortcutsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IImageShortcutsAbility.class, null);
        if (iImageShortcutsAbility != null) {
            iImageShortcutsAbility.en(list);
        }
    }

    public final void hp(int i) {
        FrameLayout frameLayout;
        if (C14KQ.LIZLLL(getContext()) <= 0 && (frameLayout = this.LLJJIJIIJIL) != null) {
            C426750GoL.LJIIIZ(frameLayout, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), false, 23);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TakoInteractGuideData takoInteractGuideData;
        int iLIZIZ;
        int iLIZIZ2;
        FeedbarDrawCreateInfo feedbarDrawCreateInfo;
        TakoInteractGuideData takoInteractGuideData2;
        C13LC<C1863850ybP> c13lcT71;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onViewCreated(view);
        this.LLJJIJIL = view.findViewById(R.id.kqi);
        C723850SaN.LIZLLL(this, new AwS384S0200000_18(this, view, 255));
        C1863850ybP c1863850ybP = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null) {
            c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
        }
        if (C1861390yXR.LJIIIIZZ() || C1861390yXR.LJIIIZ()) {
            lp();
        }
        C07QF.LIZ.getClass();
        if ((C07QF.LIZ() && C1861390yXR.LJ() && C1861390yXR.LIZIZ.LJIIIIZZ != null) || (c1863850ybP != null && (takoInteractGuideData = c1863850ybP.LLJLILLLLZIIL) != null && takoInteractGuideData.inputSkillLabel != null)) {
            YA();
        }
        if (C1861390yXR.LJ() || (c1863850ybP != null && (((feedbarDrawCreateInfo = c1863850ybP.LLJJLIIIJLLLLLLLZ) != null && feedbarDrawCreateInfo.valid) || ((takoInteractGuideData2 = c1863850ybP.LLJLILLLLZIIL) != null && takoInteractGuideData2.inputImageUrls != null)))) {
            yl0();
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        Context context = getContext();
        if (context != null) {
            this.LLJJIJI = view.findViewById(R.id.kqm);
            this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.kqc);
            this.LLJJJIL = view.findViewById(R.id.kqf);
            this.LLJJJ = view.findViewById(R.id.kqj);
            this.LLJJJJ = view.findViewById(R.id.xob);
            this.LLJJJJJIL = view.findViewById(R.id.krt);
            hp(12);
            View viewFindViewById = view.findViewById(R.id.kqg);
            C07QK.LIZ.getClass();
            if (C07QK.LIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            C1163410gNf.LIZ.getClass();
            if (C1163410gNf.LIZJ()) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                iLIZIZ2 = 0;
            }
            C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(iLIZIZ2), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(iLIZIZ), false, 16);
            View viewFindViewById2 = view.findViewById(R.id.kqh);
            if (viewFindViewById2 != null) {
                C12P5 c12p5 = new C12P5();
                c12p5.LIZLLL = Integer.valueOf(R.attr.zm);
                c12p5.LJ = Float.valueOf(0.0f);
                c12p5.LJFF = Float.valueOf(1.0f);
                c12p5.LJII = EnumC197015126j.LINEAR;
                c12p5.LJI = C12KQ.VERTICAL;
                viewFindViewById2.setBackground(c12p5.LIZ(context));
            }
            ip();
            View view2 = this.LLJJJJ;
            if (view2 != null) {
                C426750GoL.LJIIL(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
            }
            kp();
            C054G c054g = C319390CfZ.LIZ;
            C319390CfZ.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime2, "tako_bottom_input_assem_init_input_area_container");
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        mp().AQ2("");
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJLLIL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.tx1(new AwS606S0100000_27(this, 536));
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0yNL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 137), 6);
        ((TakoFragmentViewModel) this.LLJJI.getValue()).wQ2(new AwS606S0100000_27(this, 537));
        AssemViewModel.selectSubscribe$default(this.LLJLILLLLZIIL.getValue(), C1855220yNU.LL, null, null, null, new AwS581S0100000_2((Function1) new AwS606S0100000_27(this, 538), (Function1<Object, String>) 39), 14, null);
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZJ()) {
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0yNN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1855040yNC) obj).LLJJIJI);
                }
            }, null, new AwS641S0100000_27(this, 138), 6);
        }
        ((TakoMultipleSelectVM) this.LLJLLL.getValue()).GQ2(new AwS606S0100000_27(this, 539));
        C054G c054g2 = C319390CfZ.LIZ;
        C319390CfZ.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime3, "tako_bottom_input_assem_init_vm");
        C319390CfZ.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, "tako_bottom_input_assem_on_view_created");
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void Jd(TakoReferenceAskInfo takoReferenceAskInfo, boolean z) {
        lp();
        IReferenceAskInfoAbility iReferenceAskInfoAbility = (IReferenceAskInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IReferenceAskInfoAbility.class, null);
        if (iReferenceAskInfoAbility != null) {
            iReferenceAskInfoAbility.Jd(takoReferenceAskInfo, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void eh(String str, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        yl0();
        IPhotoPickerAbility iPhotoPickerAbilitySp = sp();
        if (iPhotoPickerAbilitySp != null) {
            iPhotoPickerAbilitySp.eh(str, function2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void fg(TakoEditAskInfo takoEditAskInfo, boolean z) {
        lp();
        YA();
        IReferenceAskInfoAbility iReferenceAskInfoAbility = (IReferenceAskInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IReferenceAskInfoAbility.class, null);
        if (iReferenceAskInfoAbility != null) {
            iReferenceAskInfoAbility.fg(takoEditAskInfo, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void na(String str, Function2<? super BaseImage, ? super Integer, Unit> function2) {
        yl0();
        IPhotoPickerAbility iPhotoPickerAbilitySp = sp();
        if (iPhotoPickerAbilitySp != null) {
            iPhotoPickerAbilitySp.na(str, function2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final void wu(BaseImage baseImage, String str) {
        yl0();
        IPhotoPickerAbility iPhotoPickerAbilitySp = sp();
        if (iPhotoPickerAbilitySp != null) {
            iPhotoPickerAbilitySp.wu(baseImage, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility
    public final void Gr(List list, TakoStandardRatio takoStandardRatio, int i, AwS606S0100000_27 awS606S0100000_27, AwS571S0100000_27 awS571S0100000_27) {
        TZ1();
        IImageShortcutsAbility iImageShortcutsAbility = (IImageShortcutsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IImageShortcutsAbility.class, null);
        if (iImageShortcutsAbility != null) {
            iImageShortcutsAbility.Gr(list, takoStandardRatio, i, awS606S0100000_27, awS571S0100000_27);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility
    public final void w7(EnumC1854550yMP enumC1854550yMP, String str, String str2, List<BaseImage> list, Integer num, String str3, TakoTemplateInfo takoTemplateInfo, boolean z, boolean z2) {
        YA();
        ISkillLabelAbilityV2 iSkillLabelAbilityV2 = (ISkillLabelAbilityV2) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISkillLabelAbilityV2.class, null);
        if (iSkillLabelAbilityV2 != null) {
            iSkillLabelAbilityV2.w7(enumC1854550yMP, str, str2, list, num, str3, takoTemplateInfo, z, z2);
        }
    }
}
