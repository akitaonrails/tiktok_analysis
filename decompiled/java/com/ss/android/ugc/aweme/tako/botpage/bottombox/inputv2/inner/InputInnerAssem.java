package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner;

import X.AnonymousClass1418;
import X.C019F;
import X.C01GW;
import X.C07ED;
import X.C09R3;
import X.C0B14;
import X.C0DQF;
import X.C0PEM;
import X.C0WZX;
import X.C1146830fwv;
import X.C1163410gNf;
import X.C123100dR;
import X.C13LC;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1842270y2b;
import X.C1846330y99;
import X.C1852810yJb;
import X.C1854150yLl;
import X.C1854540yMO;
import X.C1854790yMn;
import X.C1855050yND;
import X.C1858150ySD;
import X.C1860520yW2;
import X.C1862920yZu;
import X.C1863850ybP;
import X.C1864200yby;
import X.C19719912Dl;
import X.C19EG;
import X.C19MB;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C320020Cga;
import X.C320030Cgb;
import X.C324800CoI;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C830490Whz;
import X.EnumC1855560yO2;
import X.EnumC1858090yS7;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ARunnableS26S0210000_27;
import Y.ARunnableS46S0110000_27;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.photo.IPhotoPickerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.shortcuts.IImageShortcutsAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS77S1000000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes28.dex */
public final class InputInnerAssem extends UISlotAssem implements IInputInnerAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public C1842270y2b LLJJI;
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public TuxIconView LLJJJJ;
    public InputMethodManager LLJJJJJIL;
    public View LLJJJJLIIL;
    public long LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public String LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLL;
    public long LLJZ;
    public C19MB LLL;
    public C19MB LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final AssemVMLazy LLLIIL;
    public final AssemVMLazy LLLIILIL;
    public final AssemVMLazy LLLIL;
    public final AssemVMLazy LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public String LLJLLIL = "";
    public boolean LLJZIJLIL = true;
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2293));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InputInnerAssem.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InputInnerAssem.class, "skillLabelViewModel", "getSkillLabelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/skilllabel/TakoInputSkillLabelViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(InputInnerAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(InputInnerAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public InputInnerAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(178));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BottomInputViewModel.class);
        this.LLLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2294), AFwS269S0000000_27.get$arr$(181), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(180));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoInputSkillLabelViewModel.class);
        this.LLLIILIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2295), AFwS269S0000000_27.get$arr$(182), null, true);
        C1637906bB c1637906bBLIZ3 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(179));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ3, new AwS562S0100000_18(c19719912DlLIZ3, 2296), AFwS269S0000000_27.get$arr$(183), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MessageViewModel.class);
        this.LLLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ4, 2297), AFwS269S0000000_27.get$arr$(184), null, true);
        this.LLLILZJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 675));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 671));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 670));
        this.LLLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 674));
        this.LLLJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 673));
        this.LLLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 672));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1346407788) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0205 A[PHI: r13
      0x0205: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v0 java.lang.String), (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:70:0x017a, B:72:0x0180, B:74:0x0195, B:78:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bp() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem.Bp():void");
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        C1163410gNf.LIZ.getClass();
        return C1163410gNf.LIZJ() ? R.layout.fkv : R.layout.fkt;
    }

    public final void Gp() {
        Editable editableV;
        int width;
        C1842270y2b c1842270y2b = this.LLJJI;
        boolean z = (c1842270y2b == null || (editableV = C2204961BRm.v(c1842270y2b, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6nhLYGh1vUIPO0iKHwjLa9X/q/FNbF5CsFbvlvZk=", null))) == null || editableV.length() == 0 || (width = (c1842270y2b.getWidth() - c1842270y2b.getCompoundPaddingLeft()) - c1842270y2b.getCompoundPaddingRight()) <= 0 || StaticLayout.Builder.obtain(editableV, 0, editableV.length(), c1842270y2b.getPaint(), width).setLineSpacing(c1842270y2b.getLineSpacingExtra(), c1842270y2b.getLineSpacingMultiplier()).setBreakStrategy(c1842270y2b.getBreakStrategy()).setHyphenationFrequency(c1842270y2b.getHyphenationFrequency()).build().getLineCount() < 6) ? false : true;
        View view = this.LLJJJIL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS46S0110000_27(this, z, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void TZ1() {
        if (this.LLLFZ) {
            return;
        }
        if (!this.LLLI) {
            this.LLLIIII = true;
            return;
        }
        this.LLLFZ = true;
        ip();
        C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 585));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void YA() {
        if (this.LLLFFI) {
            return;
        }
        if (!this.LLLI) {
            this.LLLII = true;
            return;
        }
        this.LLLFFI = true;
        ip();
        C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 586));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void io() {
        C1842270y2b c1842270y2b = this.LLJJI;
        if (c1842270y2b != null) {
            if (C1862920yZu.LIZ()) {
                C1846330y99.LIZ(c1842270y2b);
                return;
            }
            c1842270y2b.clearFocus();
            InputMethodManager inputMethodManager = this.LLJJJJJIL;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(c1842270y2b.getWindowToken(), 0);
            }
        }
    }

    public final void ip() {
        ViewGroup viewGroup;
        if (this.LLLFF) {
            return;
        }
        if (!this.LLLI) {
            this.LLLIIIIL = true;
            return;
        }
        this.LLLFF = true;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null || (viewGroup = (ViewGroup) viewLJJIJL.findViewById(R.id.ds0)) == null) {
            return;
        }
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fnt, viewGroup, true);
        C1146830fwv c1146830fwv = (C1146830fwv) viewGroup.findViewById(R.id.drz);
        if (c1146830fwv != null) {
            c1146830fwv.setOnCompactChange(new AwS606S0100000_27(this, 188));
        }
    }

    public final BottomInputViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    public final IMessageAbility lp() {
        return (IMessageAbility) this.LLLILZLLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void oO1() {
        String strLJJIFFI;
        String str;
        boolean z;
        Context context;
        Resources resources;
        String quantityString;
        C1854540yMO c1854540yMO;
        ConvertStyleItem convertStyleItem;
        Editable editableV;
        C1842270y2b c1842270y2b = this.LLJJI;
        if (c1842270y2b == null || (editableV = C2204961BRm.v(c1842270y2b, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6nhLYGh1vUIPO0iKHwjLa9X/q/FNbF5CsFbvlvZk=", null))) == null || (strLJJIFFI = editableV.toString()) == null) {
            strLJJIFFI = "";
        }
        List<BaseImage> listLLIIII = C13LP.LLIIII(kp().TG1());
        ISkillLabelAbilityV2 iSkillLabelAbilityV2Mp = mp();
        C1854790yMn c1854790yMnY5 = iSkillLabelAbilityV2Mp != null ? iSkillLabelAbilityV2Mp.Y5() : null;
        if (c1854790yMnY5 == null || (convertStyleItem = c1854790yMnY5.LIZJ) == null || (str = convertStyleItem.stylePromptContent) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            if (strLJJIFFI.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJIFFI);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                strLJJIFFI = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLJJIFFI = str;
            }
        }
        if (a0.LJJJIL(strLJJIFFI) && (!listLLIIII.isEmpty())) {
            if ((c1854790yMnY5 == null || (((strLJJIFFI = c1854790yMnY5.LJFF) == null || !(!a0.LJJJIL(strLJJIFFI))) && ((c1854540yMO = c1854790yMnY5.LIZ) == null || (strLJJIFFI = c1854540yMO.LIZLLL) == null))) && ((context = getContext()) == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(2131755744, listLLIIII.size())) == null || (strLJJIFFI = u.LJJIFFI(quantityString, "...", "", false)) == null)) {
                strLJJIFFI = "";
            }
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !listLLIIII.isEmpty();
        if (!z2 || strLJJIFFI.length() != 0) {
            int length = strLJJIFFI.length() - 1;
            int i = 0;
            boolean z3 = false;
            while (i <= length) {
                boolean z4 = Intrinsics.LJI(strLJJIFFI.charAt(!z3 ? i : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i++;
                } else {
                    z3 = true;
                }
            }
            if (TextUtils.isEmpty(strLJJIFFI.subSequence(i, length + 1).toString()) && (!kp().wQ2() || kp().BQ2(strLJJIFFI, z2))) {
                return;
            }
        }
        IMessageAbility iMessageAbilityLp = lp();
        if (iMessageAbilityLp == null || !iMessageAbilityLp.oj()) {
            return;
        }
        IMessageAbility iMessageAbilityLp2 = lp();
        if (iMessageAbilityLp2 == null || !iMessageAbilityLp2.oj()) {
            Fp();
        } else {
            Ep(strLJJIFFI, z, listLLIIII);
            kp().AQ2("");
        }
    }

    public final TakoInputSkillLabelViewModel op() {
        AssemVMLazy assemVMLazy = this.LLLIILIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        return (TakoInputSkillLabelViewModel) assemVMLazy.getValue();
    }

    public final ITakoContextAbility sp() {
        return (ITakoContextAbility) this.LLLJ.getValue();
    }

    public final void zp() {
        IVoiceInputAbility iVoiceInputAbility = (IVoiceInputAbility) this.LLLILZJ.getValue();
        if (iVoiceInputAbility == null || !iVoiceInputAbility.Uz0()) {
            if (C0B14.LIZ()) {
                up(0L, false);
            } else {
                if (this.LLJJL != 0) {
                    up(Long.valueOf(System.currentTimeMillis() - this.LLJJL), false);
                }
                Bp();
            }
            this.LLJJL = 0L;
        }
    }

    public final void Fp() {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C0DQF c0dqf = C0DQF.LIZ;
            View viewLJJIJL = LJJIJL();
            Map<String, String> commonParams = getCommonParams();
            ITakoContextAbility iTakoContextAbilitySp = sp();
            long j = (iTakoContextAbilitySp == null || (c13lcT713 = iTakoContextAbilitySp.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null) ? 0L : c1863850ybP3.LLJJ;
            ITakoContextAbility iTakoContextAbilitySp2 = sp();
            int i = (iTakoContextAbilitySp2 == null || (c13lcT712 = iTakoContextAbilitySp2.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null) ? 0 : c1863850ybP2.LLJJI;
            ITakoContextAbility iTakoContextAbilitySp3 = sp();
            if (iTakoContextAbilitySp3 == null || (c13lcT71 = iTakoContextAbilitySp3.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLJJIII) == null) {
                str = "";
            }
            c0dqf.LJIIL(c19egLIZ, viewLJJIJL, commonParams, new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
        }
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbilitySp = sp();
        return (iTakoContextAbilitySp == null || (commonParams = iTakoContextAbilitySp.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final ISkillLabelAbilityV2 mp() {
        return (ISkillLabelAbilityV2) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISkillLabelAbilityV2.class, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void Se2() {
        zp();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final View getInput() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void QR(String str) {
        BottomInputViewModel bottomInputViewModelKp = kp();
        bottomInputViewModelKp.setState(new AwS39S0010000_27(true, 15));
        bottomInputViewModelKp.yQ2();
        C1842270y2b c1842270y2b = this.LLJJI;
        if (c1842270y2b == null) {
            return;
        }
        InputFilter[] filters = c1842270y2b.getFilters();
        c1842270y2b.setFilters(new InputFilter[0]);
        this.LLJLLIL = str;
        c1842270y2b.append(str);
        c1842270y2b.setFilters(filters);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void bQ0(String str) {
        if (str == null) {
            str = "";
        }
        List<BaseImage> listLLIIII = C13LP.LLIIII(kp().TG1());
        IMessageAbility iMessageAbilityLp = lp();
        if (iMessageAbilityLp != null && iMessageAbilityLp.oj()) {
            Ep(str, false, listLLIIII);
            kp().AQ2("");
        } else {
            Fp();
        }
    }

    public final void hp(boolean z) {
        Float fValueOf;
        float f;
        TuxIconView tuxIconView = this.LLJJIII;
        if (tuxIconView != null) {
            tuxIconView.setActivated(z);
            C384050F3z c384050F3z = new C384050F3z();
            C1163410gNf.LIZ.getClass();
            if (C1163410gNf.LIZ()) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(500));
            } else {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(16));
            }
            c384050F3z.LIZJ = fValueOf;
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            if (z) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.x5(tuxIconView, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 1521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem.onViewCreated(android.view.View):void");
    }

    public static List yp(List list, TakoEditAskInfo takoEditAskInfo) {
        if (!C1855050yND.LIZ(takoEditAskInfo)) {
            return list;
        }
        List<BaseImage> listLIZ = AnonymousClass1418.LIZ(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        for (BaseImage baseImage : listLIZ) {
            arrayList.add(baseImage.copy(baseImage.imageId, baseImage.innerUrlList, baseImage.urlList, baseImage.thumbnailUrlList, baseImage.width, baseImage.height, baseImage.uri, baseImage.uploadProgress, baseImage.localCachePath, baseImage.compressedFilePath, baseImage.compressedFileSize, baseImage.imageSource, baseImage.uploadStatus, baseImage.originalFileSize, baseImage.imageUuid, baseImage.stdSize, 0, null));
        }
        return arrayList;
    }

    public final void Ap(MotionEvent motionEvent, View view) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.LLJJL = 0L;
                    up(null, true);
                    return;
                }
                return;
            }
            if (view.isPressed()) {
                return;
            }
            up(null, true);
            return;
        }
        this.LLJJL = System.currentTimeMillis();
        if (!C0B14.LIZ()) {
            return;
        }
        Bp();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility
    public final void Cz0(long j, boolean z) {
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIIJJI() != EnumC1855560yO2.KEYBOARD) {
            return;
        }
        this.LLJLLL = false;
        C1842270y2b c1842270y2b = this.LLJJI;
        if (c1842270y2b != null) {
            if (C1862920yZu.LIZ()) {
                HandlerHook.viewPostDelay(c1842270y2b, new ARunnableS46S0110000_27(c1842270y2b, z, 3), j);
            } else {
                HandlerHook.viewPostDelay(c1842270y2b, new ARunnableS26S0210000_27(c1842270y2b, z, this, 1), j);
            }
        }
    }

    public final void tp(String str, boolean z) {
        boolean z2 = true;
        if (this.LLJLIL == 1) {
            this.LLJLIL = 2;
        }
        if (this.LLJLL && C123100dR.LIZ(str)) {
            this.LLJLIL = 1;
            this.LLJLILLLLZIIL = str;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C320030Cgb(this, str, null), 3);
        }
        this.LLJLL = false;
        String str2 = kp().getState().LLJ;
        if (kp().getState().LLJILJIL.length() != 0) {
            z2 = false;
        }
        if (z2) {
            kp().setState(new AwS77S1000000_27("manual_input", 12));
            BottomInputViewModel bottomInputViewModelKp = kp();
            bottomInputViewModelKp.setState(new AwS39S0010000_27(false, 15));
            bottomInputViewModelKp.yQ2();
            this.LLJLLIL = "";
            return;
        }
        if (!z) {
            if (!Intrinsics.LJFF(str2, "voice_input")) {
                return;
            }
            kp().setState(new AwS77S1000000_27("voice_and_manual", 12));
        } else {
            if (!Intrinsics.LJFF(str2, "manual_input")) {
                return;
            }
            kp().setState(new AwS77S1000000_27("voice_input", 12));
        }
    }

    public final void up(Long l, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C320020Cga(this, z, l, null), 3);
    }

    public final void Ep(String str, boolean z, List<BaseImage> list) {
        Long lValueOf;
        boolean z2;
        String str2;
        String str3;
        String string;
        boolean z3;
        int i;
        boolean z4;
        String str4;
        boolean z5;
        String strL81;
        String strL812;
        ITakoContextAbility iTakoContextAbilitySp;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        long j = this.LLJZ;
        String strNV1 = null;
        if (j > 0) {
            lValueOf = Long.valueOf(System.currentTimeMillis() - j);
        } else {
            lValueOf = null;
        }
        this.LLJZ = 0L;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
        c830490Whz.put("interaction_type", kp().getState().LLJ);
        c830490Whz.put("paste_type", String.valueOf(this.LLJLIL));
        c830490Whz.put("paste_content", String.valueOf(this.LLJLILLLLZIIL));
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = null;
        if (lValueOf != null && lValueOf.longValue() > 0) {
            c830490Whz.put("input_duration", String.valueOf(lValueOf.longValue()));
        }
        C324800CoI.LIZ.getClass();
        if (C324800CoI.LIZ() && (iTakoContextAbilitySp = sp()) != null && (c13lcAp0 = iTakoContextAbilitySp.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
            c830490Whz.put("tako_session_id", c1864200yby.LL);
            c830490Whz.put("session_source", c1864200yby.LLILLJJLI);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapYQ2 = op().yQ2();
        if (mapYQ2 != null) {
            c830490Whz.putAll(mapYQ2);
        }
        TakoInputSkillLabelViewModel takoInputSkillLabelViewModelOp = op();
        if (list != null && (!list.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        Map<String, Object> mapVQ2 = takoInputSkillLabelViewModelOp.vQ2(z2);
        if (mapVQ2 != null) {
            linkedHashMap.putAll(mapVQ2);
        }
        TakoTemplateInfo takoTemplateInfo = op().LLILZIL;
        if (takoTemplateInfo != null) {
            str2 = takoTemplateInfo.originalPrompt;
        } else {
            str2 = null;
        }
        if (takoTemplateInfo == null || (str3 = takoTemplateInfo.templateId) == null) {
            str3 = "";
        }
        if (a0.LJJJIL(str3)) {
            z3 = false;
        } else {
            if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null) {
                string = "";
            }
            z3 = !Intrinsics.LJFF(string, a0.LJLIIIL(str).toString());
        }
        linkedHashMap.put("image_template_id", str3);
        if (((Boolean) C07ED.LIZ.getValue()).booleanValue() && (!a0.LJJJIL(str3))) {
            linkedHashMap.put("is_unchanged_tako_template", Boolean.valueOf(!z3));
        }
        TakoEditAskInfo takoEditAskInfo = kp().getState().LLILLL;
        C1855050yND.LIZLLL(takoEditAskInfo, linkedHashMap, c830490Whz);
        Integer numXQ2 = op().xQ2();
        C1854150yLl c1854150yLl = kp().getState().LLILLJJLI;
        if (c1854150yLl != null) {
            i = c1854150yLl.LL;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            c830490Whz.put("message_type", "text");
            IMessageAbility iMessageAbilityLp = lp();
            if (iMessageAbilityLp != null) {
                EnumC1858090yS7 enumC1858090yS7 = EnumC1858090yS7.CUSTOM;
                Map<String, String> commonParams = getCommonParams();
                TakoReferenceAskInfo takoReferenceAskInfo = kp().getState().LLILZ;
                IMessageAbility iMessageAbilityLp2 = lp();
                if (iMessageAbilityLp2 != null) {
                    strL812 = iMessageAbilityLp2.L81();
                } else {
                    strL812 = null;
                }
                iMessageAbilityLp.Rl2(str, true, enumC1858090yS7, commonParams, c830490Whz, new LinkedHashMap(), null, null, "", i, numXQ2, C1852810yJb.LIZJ(strL812), 205, new ExtraRequestInfo(null, null, null, linkedHashMap, null, null, false), null, UUID.randomUUID().toString(), takoReferenceAskInfo, takoEditAskInfo);
            }
            z5 = true;
        } else {
            List listYp = yp(list, takoEditAskInfo);
            IPhotoPickerAbility iPhotoPickerAbility = (IPhotoPickerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoPickerAbility.class, null);
            if (iPhotoPickerAbility != null) {
                iPhotoPickerAbility.OQ(true);
            }
            if (z) {
                str4 = "text_image";
            } else {
                str4 = "image";
            }
            c830490Whz.put("message_type", str4);
            IMessageAbility iMessageAbilityLp3 = lp();
            if (iMessageAbilityLp3 != null) {
                EnumC1858090yS7 enumC1858090yS72 = EnumC1858090yS7.CUSTOM;
                IMessageAbility iMessageAbilityLp4 = lp();
                if (iMessageAbilityLp4 != null) {
                    strL81 = iMessageAbilityLp4.L81();
                } else {
                    strL81 = null;
                }
                int iLIZJ = C1852810yJb.LIZJ(strL81);
                Map<String, String> commonParams2 = getCommonParams();
                TakoReferenceAskInfo takoReferenceAskInfo2 = kp().getState().LLILZ;
                ExtraRequestInfo extraRequestInfo = new ExtraRequestInfo(null, null, null, linkedHashMap, null, null, false);
                z5 = true;
                C1858150ySD.LIZIZ(iMessageAbilityLp3, str, listYp, null, true, enumC1858090yS72, i, numXQ2, iLIZJ, null, null, commonParams2, c830490Whz, false, extraRequestInfo, null, null, takoReferenceAskInfo2, takoEditAskInfo, 119556);
            } else {
                z5 = true;
            }
        }
        IMessageAbility iMessageAbilityLp5 = lp();
        if (iMessageAbilityLp5 != null && iMessageAbilityLp5.L81() != null) {
            IPhotoPickerAbility iPhotoPickerAbility2 = (IPhotoPickerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoPickerAbility.class, null);
            if (iPhotoPickerAbility2 != null) {
                iPhotoPickerAbility2.OQ(z5);
            }
            BottomInputViewModel bottomInputViewModelKp = kp();
            bottomInputViewModelKp.setState(new AwS606S0100000_27((C1854150yLl) null, 337));
            bottomInputViewModelKp.yQ2();
            IImageShortcutsAbility iImageShortcutsAbility = (IImageShortcutsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IImageShortcutsAbility.class, null);
            if (iImageShortcutsAbility != null) {
                iImageShortcutsAbility.xp2(false);
            }
            BottomInputViewModel bottomInputViewModelKp2 = kp();
            IBottomInputHostAbility iBottomInputHostAbility = (IBottomInputHostAbility) this.LLLIZZ.getValue();
            if (iBottomInputHostAbility != null) {
                strNV1 = iBottomInputHostAbility.NV1();
            }
            bottomInputViewModelKp2.zQ2(strNV1);
            kp().AQ2("");
        }
    }
}
