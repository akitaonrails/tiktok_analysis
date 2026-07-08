package com.ss.android.ugc.aweme.inbox.widget.v2;

import X.AbstractC1865990yer;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C054G;
import X.C09IR;
import X.C1330305In;
import X.C1330905It;
import X.C1331005Iu;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1490960oty;
import X.C1508630pMT;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1720106oR;
import X.C1776300wKC;
import X.C1867960yi2;
import X.C1889350zGX;
import X.C1889370zGZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2232408os;
import X.C2252331DDr;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C723580SZw;
import X.C786410Ut5;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.InterfaceC1889260zGO;
import X.InterfaceC1889380zGa;
import X.InterfaceC1891350zJl;
import android.content.Intent;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.MessageInboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntranceWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public abstract class InboxWidget extends AbstractC738140SxQ {
    public final C054G LL = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()));
    public final C1559260qg8 LLILLJJLI;
    public volatile AtomicBoolean LLILLL;
    public final C2252331DDr LLILZ;
    public InboxWidgetStatus LLILZIL;
    public EnumC1889520zGo LLILZLL;
    public final C01GW LLIZ;

    public abstract List<InterfaceC1891350zJl> Ao();

    public abstract List<C13IQ<? extends InterfaceC1891350zJl>> Bo();

    public long Go() {
        return 0L;
    }

    public void LJJIIJ() {
    }

    /* JADX INFO: renamed from: do */
    public boolean mo250do() {
        return this instanceof InboxEntranceWidgetContainer;
    }

    public abstract void lo();

    public void onNewIntent(Intent intent) {
    }

    public void oo(RecyclerView recyclerView) {
    }

    public void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
    }

    public RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        return null;
    }

    public void vo(EnumC1599580rjA enumC1599580rjA) {
    }

    public void wo() {
    }

    public void xo(RecyclerView.ViewHolder viewHolder) {
    }

    public void yo(RecyclerView.ViewHolder viewHolder) {
    }

    public void zo(RecyclerView.ViewHolder viewHolder) {
    }

    public final AbstractC1865990yer identity() {
        AbstractC1865990yer abstractC1865990yer;
        C1867960yi2 c1867960yi2 = (C1867960yi2) this.LLILLJJLI.getValue();
        return (c1867960yi2 == null || (abstractC1865990yer = c1867960yi2.LL) == null) ? new AbstractC1865990yer() { // from class: X.0yfH
        } : abstractC1865990yer;
    }

    public InboxWidget() {
        String strLIZ = C1776300wKC.LIZ(C13LE.LIZ(getClass()).LJI());
        this.LLILLJJLI = new C1559260qg8(new C723580SZw(this, C1867960yi2.class, strLIZ), checkSupervisorPrepared());
        this.LLILLL = new AtomicBoolean(false);
        this.LLILZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZIL = C1889370zGZ.LIZ;
        this.LLILZLL = EnumC1889520zGo.COMPLETE;
        this.LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(224));
    }

    public final int mo() {
        Integer num;
        InterfaceC1889260zGO interfaceC1889260zGOHo = ho(this);
        if (interfaceC1889260zGOHo == null || (num = interfaceC1889260zGOHo.LIZJ().get(identity())) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        InboxAbilityCenter$IInboxPageWidgetContainerAbility inboxAbilityCenter$IInboxPageWidgetContainerAbility;
        super.onCreate();
        C1508630pMT.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate widget: ");
        sbLIZ.append(identity());
        sbLIZ.append(" -- ");
        sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
        C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
        Fo(C1889350zGX.LIZ);
        List<C13IQ<? extends InterfaceC1891350zJl>> listBo = Bo();
        if ((!listBo.isEmpty()) && (inboxAbilityCenter$IInboxPageWidgetContainerAbility = (InboxAbilityCenter$IInboxPageWidgetContainerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxPageWidgetContainerAbility.class, null)) != null) {
            inboxAbilityCenter$IInboxPageWidgetContainerAbility.Fq0(listBo, this);
        }
        lo();
        if (this instanceof MessageInboxWidget) {
            C23250099c.LIZLLL(this.LL, null, null, new C1331005Iu(this, Go(), null), 3);
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LL, null);
    }

    public EnumC1889520zGo bo() {
        return this.LLILZLL;
    }

    public List<C13IQ<? extends PowerCell<?>>> fo() {
        return C13BV.INSTANCE;
    }

    public InboxWidgetStatus ko() {
        return this.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1889260zGO ho(InboxWidget inboxWidget) {
        InboxWidget inboxWidget2;
        if (inboxWidget instanceof InterfaceC1889380zGa) {
            return ((InterfaceC1889380zGa) inboxWidget).bc();
        }
        LifecycleOwner parent = inboxWidget.getParent();
        if (!(parent instanceof InboxWidget) || (inboxWidget2 = (InboxWidget) parent) == null) {
            return null;
        }
        return ho(inboxWidget2);
    }

    public final void Co(InboxWidgetStatus inboxWidgetStatus) {
        if (this instanceof MessageInboxWidget) {
            if (!this.LLILLL.getAndSet(true)) {
                C23250099c.LIZLLL(this.LL, null, null, new C1330305In(this, null), 3);
                Eo(inboxWidgetStatus);
                return;
            } else {
                C23250099c.LIZLLL(this.LL, null, null, new C1330905It(this, inboxWidgetStatus, null), 3);
                return;
            }
        }
        Eo(inboxWidgetStatus);
    }

    public final void Eo(InboxWidgetStatus inboxWidgetStatus) {
        InboxWidgetContainer inboxWidgetContainer;
        Fo(inboxWidgetStatus);
        C1508630pMT.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set Widget State: widget: ");
        sbLIZ.append(identity());
        sbLIZ.append(" --- status: ");
        sbLIZ.append(ko());
        sbLIZ.append(" -- ");
        sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
        sbLIZ.append(" --- thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
        String str = identity().LIZ;
        ConcurrentHashMap<String, C1490960oty> concurrentHashMap = C1508630pMT.LIZJ;
        C1490960oty c1490960oty = concurrentHashMap.get(str);
        long jUptimeMillis = -1;
        if (c1490960oty != null) {
            int i2 = c1490960oty.LIZ + 1;
            if (C1508630pMT.LIZIZ > 0) {
                jUptimeMillis = SystemClock.uptimeMillis() - C1508630pMT.LIZIZ;
            }
            concurrentHashMap.put(str, new C1490960oty(i2, jUptimeMillis));
        } else {
            if (C1508630pMT.LIZIZ > 0) {
                jUptimeMillis = SystemClock.uptimeMillis() - C1508630pMT.LIZIZ;
            }
            concurrentHashMap.put(str, new C1490960oty(1, jUptimeMillis));
        }
        LifecycleOwner parent = getParent();
        if ((parent instanceof InboxWidgetContainer) && (inboxWidgetContainer = (InboxWidgetContainer) parent) != null) {
            inboxWidgetContainer.No(this);
        }
    }

    public void Fo(InboxWidgetStatus inboxWidgetStatus) {
        this.LLILZIL = inboxWidgetStatus;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPreload(boolean z) {
        super.onPreload(z);
        C1508630pMT.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreload widget: ");
        sbLIZ.append(getClass());
        sbLIZ.append("} -- ");
        sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
        C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }
}
