package com.ss.android.ugc.aweme.im.quickchat;

import X.C0I08;
import X.C19EH;
import X.C1AF0;
import X.C456970Hvz;
import X.InterfaceC457250HwR;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class QuickMessageServiceImpl implements QuickMessageService {
    @Override // com.ss.android.ugc.aweme.im.quickchat.QuickMessageService
    public final IMUnifiedQuickInputDialogFragment LIZ(FragmentManager fragmentManager, C456970Hvz c456970Hvz, C0I08 c0i08, Function1 function1) {
        IMUnifiedQuickInputDialogFragment.LLJILJILJ.getClass();
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("IMUnifiedQuickInputDialogFragment");
        if ((fragmentLJJJJZI instanceof IMUnifiedQuickInputDialogFragment) && fragmentLJJJJZI != null && fragmentLJJJJZI.isAdded()) {
            try {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        IMUnifiedQuickInputDialogFragment iMUnifiedQuickInputDialogFragment = new IMUnifiedQuickInputDialogFragment();
        iMUnifiedQuickInputDialogFragment.LLILZ = c456970Hvz;
        iMUnifiedQuickInputDialogFragment.LLILLL = c0i08;
        iMUnifiedQuickInputDialogFragment.LLILLJJLI = (InterfaceC457250HwR) function1.invoke(iMUnifiedQuickInputDialogFragment);
        iMUnifiedQuickInputDialogFragment.show(fragmentManager, "IMUnifiedQuickInputDialogFragment");
        if (c0i08 != null) {
            c0i08.TG();
        }
        return iMUnifiedQuickInputDialogFragment;
    }
}
