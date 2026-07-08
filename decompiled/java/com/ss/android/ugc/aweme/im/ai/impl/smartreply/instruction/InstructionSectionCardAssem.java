package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C060Z;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LE;
import X.C15372060c;
import X.C15373060d;
import X.C1607106Qz;
import X.C1637806bA;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditConfig;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditFragment;
import com.ss.android.ugc.aweme.im.common.view.IgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionSectionCardAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InstructionSectionCardAssem.class, "viewmodel", "getViewmodel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/instruction/SmartReplyInstructionVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InstructionSectionCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SmartReplyInstructionVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 268), AFwS229S0000000_2.get$arr$(220), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ces;
    }

    public final void hp() {
        String str;
        C19EG c19eg;
        Activity activityLIZIZ;
        C060Z c060z = (C060Z) C723850SaN.LJFF(this, "sectionType");
        if (c060z == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C15373060d c15373060d = (C15373060d) assemVMLazy.getValue().getState();
        C15372060c c15372060c = c15373060d.LLILLJJLI.get(c060z);
        if (c15372060c == null || (str = c15372060c.LLILLJJLI) == null) {
            str = "";
        }
        InstructionEditConfig instructionEditConfig = new InstructionEditConfig(c060z, str, c15373060d.LL, true);
        InstructionEditFragment.LLJIJIL.getClass();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZ = (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ);
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
            return;
        }
        InstructionEditFragment instructionEditFragment = new InstructionEditFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "instruction_edit_config", instructionEditConfig);
        instructionEditFragment.setArguments(bundle);
        int iLIZ = C1607106Qz.LIZ(c19eg);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = instructionEditFragment;
        c1390920mIc.LJIIIIZZ(2);
        c1390920mIc.LIZIZ((int) (iLIZ * 0.7f), iLIZ);
        c1390920mIc.LJI(48);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJILJIL = true;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLLL = false;
        IgnoreRecyclerAndPagerBottomSheetBehaviour ignoreRecyclerAndPagerBottomSheetBehaviour = new IgnoreRecyclerAndPagerBottomSheetBehaviour();
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLLIIII = ignoreRecyclerAndPagerBottomSheetBehaviour;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.InstructionSectionCardAssem.onViewCreated(android.view.View):void");
    }
}
