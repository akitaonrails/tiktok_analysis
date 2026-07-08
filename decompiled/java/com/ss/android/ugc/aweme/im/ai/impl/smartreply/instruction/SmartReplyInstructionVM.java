package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction;

import X.C1503105uX;
import X.C15373060d;
import X.C15407061l;
import X.C15408061m;
import X.InterfaceC0148002o;
import X.InterfaceC15414061s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartReplyInstructionVM extends AssemViewModel<C15373060d> implements InterfaceC15414061s {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15373060d(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C15408061m.LIZ.getClass();
        C15407061l c15407061l = C15408061m.LIZIZ;
        synchronized (c15407061l.LLILZIL) {
            try {
                ((ArrayList) c15407061l.LLILZIL).remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        setState(new AwS581S0100000_2(C1503105uX.LIZIZ(), 613));
        C15408061m.LIZ.getClass();
        C15408061m.LIZIZ.LJ(this);
    }

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
        long j = getState().LL;
        if (j == 0) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<IMAIBotInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().id == j) {
                setState(AFwS229S0000000_2.get$arr$(222));
                return;
            }
        }
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        Object obj;
        Object next;
        long j = getState().LL;
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((IMAIBotInfo) next).id == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IMAIBotInfo iMAIBotInfo = (IMAIBotInfo) next;
        if (iMAIBotInfo == null) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                IMAIBotInfo iMAIBotInfo2 = (IMAIBotInfo) next2;
                IMAIBotInfo iMAIBotInfoLIZIZ = C1503105uX.LIZIZ();
                if (iMAIBotInfoLIZIZ != null && iMAIBotInfo2.id == iMAIBotInfoLIZIZ.id) {
                    obj = next2;
                    break;
                }
            }
            iMAIBotInfo = (IMAIBotInfo) obj;
            if (iMAIBotInfo == null) {
                return;
            }
        }
        setState(new AwS581S0100000_2(iMAIBotInfo, 613));
    }
}
