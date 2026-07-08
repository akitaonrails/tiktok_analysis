package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.reference;

import X.C019F;
import X.C01GW;
import X.C1163410gNf;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1854150yLl;
import X.C1855050yND;
import X.C1861390yXR;
import X.C1919007fQ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1854550yMP;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.IInputInnerAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.skilllabel.ISkillLabelAbilityV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoReferenceInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ReferenceAskInfoAssem extends UISlotAssem implements IReferenceAskInfoAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public View LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReferenceAskInfoAssem.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReferenceAskInfoAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(192));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2302), AFwS269S0000000_27.get$arr$(193), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 684));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 685));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 683));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 682));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpd;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1899802385) {
            return null;
        }
        return this;
    }

    public final BottomInputViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        this.LLJJI = getContentView();
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.xbm);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.f828xbk);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.xbj);
        View view2 = this.LLJJI;
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            C1163410gNf.LIZ.getClass();
            if (C1163410gNf.LIZ()) {
                i = 10;
            } else {
                i = 8;
            }
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            view2.setBackground(c384050F3z.LIZ(view2.getContext()));
        }
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 57));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0yNK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1855040yNC) obj).LLILZ;
            }
        }, null, new AwS641S0100000_27(this, 38), 6);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJJ.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.aC2(new AwS606S0100000_27(this, 195));
        }
        if (C1861390yXR.LJIIIIZZ()) {
            fg(C1861390yXR.LIZIZ.LJIILIIL, true);
        }
        if (C1861390yXR.LJIIIZ()) {
            Jd(C1861390yXR.LIZIZ.LJIIL, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.reference.IReferenceAskInfoAbility
    public final void Jd(TakoReferenceAskInfo takoReferenceAskInfo, boolean z) {
        String strNV1;
        String strNV12;
        IInputInnerAbility iInputInnerAbility;
        int i;
        BottomInputViewModel bottomInputViewModelHp = hp();
        bottomInputViewModelHp.setState(new AwS606S0100000_27(takoReferenceAskInfo, 340));
        bottomInputViewModelHp.withState(new AwS606S0100000_27(bottomInputViewModelHp, 336));
        BottomInputViewModel bottomInputViewModelHp2 = hp();
        boolean zLIZIZ = C1855050yND.LIZIZ(takoReferenceAskInfo);
        IBottomInputHostAbility iBottomInputHostAbility = (IBottomInputHostAbility) this.LLJJJJJIL.getValue();
        if (iBottomInputHostAbility == null || (strNV1 = iBottomInputHostAbility.NV1()) == null) {
            strNV1 = "";
        }
        if (zLIZIZ) {
            if (bottomInputViewModelHp2.LL == null) {
                bottomInputViewModelHp2.LL = bottomInputViewModelHp2.getState().LLJILJILJ;
                bottomInputViewModelHp2.zQ2(strNV1);
            }
        } else {
            String str = bottomInputViewModelHp2.LL;
            if (Intrinsics.LJFF(bottomInputViewModelHp2.getState().LLJILJILJ, strNV1) && str != null) {
                bottomInputViewModelHp2.zQ2(str);
            }
        }
        IVoiceInputAbility iVoiceInputAbility = (IVoiceInputAbility) this.LLJJJIL.getValue();
        if (iVoiceInputAbility != null) {
            iVoiceInputAbility.RR1();
        }
        C1854150yLl c1854150yLl = hp().getState().LLILLJJLI;
        if ((c1854150yLl == null || (i = c1854150yLl.LL) == 0 || i == 1) && hp().vQ2() == 0) {
            BottomInputViewModel bottomInputViewModelHp3 = hp();
            IBottomInputHostAbility iBottomInputHostAbility2 = (IBottomInputHostAbility) this.LLJJJJJIL.getValue();
            if (iBottomInputHostAbility2 != null) {
                strNV12 = iBottomInputHostAbility2.NV1();
            } else {
                strNV12 = null;
            }
            bottomInputViewModelHp3.zQ2(strNV12);
        }
        if (z && (iInputInnerAbility = (IInputInnerAbility) this.LLJJJJ.getValue()) != null) {
            iInputInnerAbility.Cz0(0L, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.reference.IReferenceAskInfoAbility
    public final void fg(TakoEditAskInfo takoEditAskInfo, boolean z) {
        boolean z2;
        List<BaseImage> list;
        TakoReferenceInfo takoReferenceInfo;
        String str;
        String str2;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoMixFeed takoMixFeedLJIIIZ2;
        String str3;
        Message message;
        Message message2;
        MessageExt messageExt;
        String str4;
        hp().setState(new AwS606S0100000_27(takoEditAskInfo, 339));
        if (z) {
            return;
        }
        IInputInnerAbility iInputInnerAbility = (IInputInnerAbility) this.LLJJJJ.getValue();
        if (iInputInnerAbility != null) {
            iInputInnerAbility.Cz0(0L, true);
        }
        if (takoEditAskInfo != null && (message2 = takoEditAskInfo.editMessage) != null && (messageExt = message2.ext) != null && (Intrinsics.LJFF(messageExt.inputSkillMode, EnumC1854550yMP.DEEP_THINK.getSkillModeType()) || (((str4 = messageExt.inputSkillMode) == null || str4.length() == 0) && messageExt.activeActionBar == 1))) {
            z2 = true;
        } else {
            z2 = false;
        }
        TakoReferenceInfo takoReferenceInfo2 = null;
        if (!z2) {
            ISkillLabelAbilityV2 iSkillLabelAbilityV2 = (ISkillLabelAbilityV2) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISkillLabelAbilityV2.class, null);
            if (iSkillLabelAbilityV2 != null) {
                iSkillLabelAbilityV2.L40(takoEditAskInfo);
            }
        } else if (takoEditAskInfo != null) {
            Message message3 = takoEditAskInfo.editMessage;
            if (message3 != null && (takoMixFeedLJIIIZ2 = message3.LJIIIZ()) != null && (str3 = takoMixFeedLJIIIZ2.text) != null) {
                hp().AQ2(str3);
            }
            IBottomInputHostAbility iBottomInputHostAbility = (IBottomInputHostAbility) this.LLJJJJJIL.getValue();
            if (iBottomInputHostAbility != null) {
                iBottomInputHostAbility.FB1(true);
            }
            Message message4 = takoEditAskInfo.editMessage;
            if (message4 == null || (takoMixFeedLJIIIZ = message4.LJIIIZ()) == null || (list = takoMixFeedLJIIIZ.images) == null) {
                list = C13BV.INSTANCE;
            }
            for (BaseImage baseImage : list) {
                IBottomInputHostAbility iBottomInputHostAbility2 = (IBottomInputHostAbility) this.LLJJJJJIL.getValue();
                if (iBottomInputHostAbility2 != null) {
                    iBottomInputHostAbility2.wu(baseImage, "default_entrance");
                }
            }
            Message message5 = takoEditAskInfo.editMessage;
            if (message5 != null && (takoReferenceInfo = message5.referenceInfo) != null && (str = takoReferenceInfo.msgId) != null && (str2 = takoReferenceInfo.content) != null) {
                Jd(new TakoReferenceAskInfo(str2, str), false);
            }
        }
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZ()) {
            if (takoEditAskInfo != null && (message = takoEditAskInfo.editMessage) != null) {
                takoReferenceInfo2 = message.referenceInfo;
            }
            Jd(C1855050yND.LJFF(takoReferenceInfo2), false);
        }
    }
}
