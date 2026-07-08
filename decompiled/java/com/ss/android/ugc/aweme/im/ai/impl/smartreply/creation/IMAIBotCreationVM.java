package com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation;

import X.AnonymousClass0956;
import X.C061Z;
import X.C062E;
import X.C062L;
import X.C06I1;
import X.C0I0B;
import X.C0PEM;
import X.C13LQ;
import X.C1400340mXo;
import X.C1497705tf;
import X.C1503105uX;
import X.C1508705vR;
import X.C1523905xt;
import X.C1530205yu;
import X.C15377060h;
import X.C15380060k;
import X.C15383060n;
import X.C15407061l;
import X.C15408061m;
import X.C1559260qg8;
import X.C23250099c;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC15414061s;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAIBotCreationVM extends AssemViewModel<C061Z> implements InterfaceC15414061s {
    public static final int LLILLJJLI = C062L.BOT_SCENE_SMART_REPLY.getValue();
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C15377060h.class, null), true);

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        String str;
        C15380060k c15380060k;
        String str2;
        C15380060k c15380060k2;
        C15408061m.LIZ.getClass();
        C15408061m.LIZIZ.LJ(this);
        setState(new AwS581S0100000_2(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser(), 203));
        setState(AFwS229S0000000_2.get$arr$(691));
        C06I1 c06i1 = C06I1.LIZIZ;
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(this, 482);
        c06i1.getClass();
        if (C06I1.LIZLLL != null && Intrinsics.LJFF(C06I1.LJ, Boolean.valueOf(C06I1.LIZJ()))) {
            awS581S0100000_2.invoke(C06I1.LIZLLL);
        } else {
            C23250099c.LIZLLL(C06I1.LJI, null, null, new C15383060n(awS581S0100000_2, null), 3);
        }
        if (getState().LL == 1) {
            C1508705vR.LL.getClass();
            C1508705vR.LLJILJIL = SystemClock.elapsedRealtime();
            C15377060h c15377060hVQ2 = vQ2();
            String str3 = "";
            if (c15377060hVQ2 == null || (c15380060k2 = c15377060hVQ2.LL) == null || (str = c15380060k2.LIZ) == null) {
                str = "";
            }
            C15377060h c15377060hVQ22 = vQ2();
            if (c15377060hVQ22 != null && (c15380060k = c15377060hVQ22.LL) != null && (str2 = c15380060k.LIZIZ) != null) {
                str3 = str2;
            }
            C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1530205yu(str3, str, null), 3);
        }
    }

    public final C15377060h vQ2() {
        return (C15377060h) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        IMAIBotInfo iMAIBotInfoLIZIZ = C1503105uX.LIZIZ();
        int i = 254;
        float f = 0.0f;
        String str = null;
        int i2 = 1;
        if (iMAIBotInfoLIZIZ != null) {
            int i3 = 2;
            if (C13LQ.LJJIJIIJI(Integer.valueOf(iMAIBotInfoLIZIZ.status), new Integer[]{Integer.valueOf(C062E.BOT_STATUS_UNKNOWN.getValue()), Integer.valueOf(C062E.BOT_STATUS_DELETED.getValue())}) < 0) {
                return iMAIBotInfoLIZIZ.status == C062E.BOT_STATUS_FAILED.getValue() ? new C061Z(3, str, f, i) : new C061Z(i3, iMAIBotInfoLIZIZ.progressText, (float) iMAIBotInfoLIZIZ.progressPercentage, 206);
            }
        }
        return new C061Z(i2, str, f, i);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
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
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        Object next;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((IMAIBotInfo) next).scene == LLILLJJLI) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IMAIBotInfo iMAIBotInfo = (IMAIBotInfo) next;
        if (iMAIBotInfo == null) {
            return;
        }
        if (iMAIBotInfo.status == C062E.BOT_STATUS_CREATING.getValue()) {
            setState(new AwS581S0100000_2(iMAIBotInfo, 200));
        } else if (iMAIBotInfo.status == C062E.BOT_STATUS_WORKING.getValue()) {
            setState(new AwS581S0100000_2(iMAIBotInfo, 201));
        } else {
            if (iMAIBotInfo.status != C062E.BOT_STATUS_FAILED.getValue()) {
                return;
            }
            setState(AFwS229S0000000_2.get$arr$(207));
        }
    }

    public final void wQ2(Context context) {
        C1508705vR c1508705vR = C1508705vR.LL;
        int i = LLILLJJLI;
        c1508705vR.getClass();
        C1508705vR.LLJILJILJ = SystemClock.elapsedRealtime();
        C1508705vR.LLJILLL = i;
        C15408061m.LIZ.getClass();
        C15408061m.LIZIZ.LJ(c1508705vR);
        AnonymousClass0956 anonymousClass0956 = C1508705vR.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1508705vR.LLJJ = C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1497705tf(null), 3);
        setState(AFwS229S0000000_2.get$arr$(208));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1523905xt(this, new WeakReference(context), null), 2);
    }
}
