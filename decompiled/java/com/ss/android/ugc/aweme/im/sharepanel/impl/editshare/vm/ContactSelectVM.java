package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm;

import X.AbstractC595720NYc;
import X.AnonymousClass0956;
import X.C0O21;
import X.C0O22;
import X.C0O23;
import X.C0O26;
import X.C0PEM;
import X.C0YNP;
import X.C1231704rr;
import X.C1362550lYr;
import X.C1382450m4x;
import X.C1382460m4y;
import X.C1382470m4z;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C1431840nMc;
import X.C15438062q;
import X.C1697810uHb;
import X.C19719612Di;
import X.C20616415lq;
import X.C20617115lx;
import X.C20617515m1;
import X.C20617615m2;
import X.C20617715m3;
import X.C20617915m5;
import X.C20618015m6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C461720I8s;
import X.C595700NYa;
import X.C595710NYb;
import X.C639070P4v;
import X.C896480ZEw;
import X.C897370ZIh;
import X.EnumC20616515lr;
import X.EnumC20618215m8;
import X.InterfaceC0148002o;
import X.InterfaceC897330ZId;
import X.InterfaceC897380ZIi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes32.dex */
public final class ContactSelectVM extends AssemViewModel<C20617115lx> implements C0O23 {
    public static final /* synthetic */ int LLJJ = 0;
    public C20617915m5 LL;
    public final C1231704rr LLILLJJLI;
    public String LLILLL;
    public final AtomicBoolean LLILZ;
    public final AtomicBoolean LLILZIL;
    public final AtomicInteger LLILZLL;
    public final AtomicBoolean LLIZ;
    public final C639070P4v LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public final C1382470m4z LLJILJIL;
    public final C1382450m4x LLJILJILJ;
    public final CopyOnWriteArrayList<C20618015m6> LLJILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C20617115lx(C13BV.INSTANCE, false, false, this.LLILZLL.get(), new C20617715m3("", System.currentTimeMillis(), null), false, false, null);
    }

    public final void wQ2() {
        if (this.LLILZIL.getAndSet(true)) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ.plus(this.LLIZLLLIL), null, new C1382460m4y(this, null), 2);
    }

    public ContactSelectVM() {
        C1231704rr c1231704rr = new C1231704rr("EditShare", null, 6);
        this.LLILLJJLI = c1231704rr;
        this.LLILLL = "";
        this.LLILZ = new AtomicBoolean(false);
        this.LLILZIL = new AtomicBoolean(false);
        this.LLILZLL = new AtomicInteger(0);
        this.LLIZ = new AtomicBoolean(false);
        this.LLIZLLLIL = new C639070P4v(CoroutineExceptionHandler.LJJLIL, this, 1);
        this.LLJ = "";
        this.LLJI = "";
        C1382470m4z c1382470m4z = new C1382470m4z(new AwS610S0100000_31(this, 208));
        this.LLJILJIL = c1382470m4z;
        C0O22.LIZ.getClass();
        List<WeakReference<C0O23>> list = C0O22.LJFF;
        C19719612Di.LJJIIJ(list, AFwS240S0000000_9.get$arr$(973), true);
        ((ArrayList) list).add(new WeakReference(this));
        this.LLJILJILJ = new C1382450m4x(c1231704rr, c1382470m4z);
        this.LLJILLL = new CopyOnWriteArrayList<>();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        boolean z;
        Fragment fragment;
        super.onCleared();
        C20617915m5 c20617915m5 = this.LL;
        if (c20617915m5 != null) {
            c20617915m5.LJI = null;
        }
        if (c20617915m5 != null) {
            synchronized (c20617915m5.LJFF) {
                try {
                    Iterator it2 = ((LinkedHashMap) c20617915m5.LJ).values().iterator();
                    z = false;
                    while (it2.hasNext()) {
                        z |= !((C20616415lq) it2.next()).LIZ();
                    }
                    ((LinkedHashMap) c20617915m5.LJ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z && (fragment = c20617915m5.LIZIZ) != null) {
                String string = fragment.getString(2131836994);
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
            EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
        }
        InterfaceC897330ZId interfaceC897330ZId = this.LLJILJIL.LIZIZ;
        if (interfaceC897330ZId != null) {
            interfaceC897330ZId.destroy();
        }
        C0O22.LIZ.getClass();
        C19719612Di.LJJIIJ(C0O22.LJFF, new AwS588S0100000_9((C0O23) this, 683), true);
    }

    public final void AQ2(boolean z) {
        Pair pair;
        Map<String, EnumC20616515lr> mapLJ;
        int iIncrementAndGet;
        boolean z2 = false;
        if (this.LLIZ.get()) {
            C0O22.LIZ.getClass();
            ArrayList arrayList = new ArrayList(C0O22.LIZIZ);
            if (arrayList.size() > 30) {
                pair = new Pair(arrayList.subList(0, 30), Boolean.TRUE);
            } else {
                pair = new Pair(arrayList, Boolean.FALSE);
            }
        } else {
            C0O22.LIZ.getClass();
            pair = new Pair(new ArrayList(C0O22.LIZIZ), Boolean.FALSE);
        }
        List list = (List) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        C20617915m5 c20617915m5 = this.LL;
        if (c20617915m5 != null) {
            mapLJ = c20617915m5.LIZ();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        if (mapLJ.containsValue(EnumC20616515lr.SENDING) || mapLJ.containsValue(EnumC20616515lr.SENT)) {
            z2 = true;
        }
        if (z) {
            iIncrementAndGet = this.LLILZLL.incrementAndGet();
        } else {
            iIncrementAndGet = this.LLILZLL.get();
        }
        setState(new C20617615m2(this, list, mapLJ, z2, iIncrementAndGet, zBooleanValue));
    }

    public final void BQ2(C20618015m6 c20618015m6) {
        C20616415lq c20616415lq;
        C20617915m5 c20617915m5 = this.LL;
        if (c20617915m5 != null) {
            String strLIZ = c20618015m6.LIZ();
            if (strLIZ.length() == 0) {
                c20617915m5.LIZLLL.LIZIZ();
                return;
            }
            synchronized (c20617915m5.LJFF) {
                try {
                    c20616415lq = (C20616415lq) ((LinkedHashMap) c20617915m5.LJ).get(strLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c20616415lq == null) {
                c20617915m5.LIZLLL.LIZIZ();
                return;
            }
            if (c20616415lq.LJI != EnumC20616515lr.SENDING) {
                C1231704rr c1231704rr = c20616415lq.LJFF;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try to undo sending msg, wrong state, current state is ");
                sbLIZ.append(c20616415lq.LJI);
                sbLIZ.append(", contact is ");
                sbLIZ.append(c20618015m6);
                C2188811AlT.LIZIZ(sbLIZ);
                c1231704rr.LIZIZ();
                return;
            }
            C1231704rr c1231704rr2 = c20616415lq.LJFF;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("undo sending msg, contact is ");
            sbLIZ2.append(c20618015m6);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1231704rr2.getClass();
            c20616415lq.LJI = EnumC20616515lr.NOT_SEND;
            c20616415lq.LIZJ.invoke();
            AnonymousClass0956 anonymousClass0956 = c20616415lq.LJII;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c20616415lq.LJII = null;
        }
    }

    public final void LJJZZIII(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LLILLL = str2;
        if (str != null && str.length() != 0) {
            final String str3 = this.LLILLL;
            C1382450m4x c1382450m4x = this.LLJILJILJ;
            List listLLIIII = C13LP.LLIIII(c1382450m4x.LJI);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLLIIII) {
                String displayName = ((BaseContact) obj).getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                if (a0.LJJIIZI(displayName, str3, true)) {
                    arrayList.add(obj);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new Comparator<IMContact>(str3) { // from class: X.0y6t
                public final String LL;

                {
                    this.LL = str3;
                }

                @Override // java.util.Comparator
                public final int compare(IMContact iMContact, IMContact iMContact2) {
                    IMContact iMContact3 = iMContact;
                    IMContact iMContact4 = iMContact2;
                    if (iMContact3 == null) {
                        return 1;
                    }
                    if (iMContact4 == null) {
                        return -1;
                    }
                    String displayName2 = iMContact3.getDisplayName();
                    String str4 = "";
                    if (displayName2 == null) {
                        displayName2 = "";
                    }
                    String displayName3 = iMContact4.getDisplayName();
                    if (displayName3 != null) {
                        str4 = displayName3;
                    }
                    int iLJJIJLIJ = a0.LJJIJLIJ(0, displayName2, this.LL, true);
                    int iLJJIJLIJ2 = a0.LJJIJLIJ(0, str4, this.LL, true);
                    if (iLJJIJLIJ != iLJJIJLIJ2) {
                        return iLJJIJLIJ - iLJJIJLIJ2;
                    }
                    return displayName2.compareTo(str4);
                }
            }, arrayList);
            ((ArrayList) c1382450m4x.LJII).clear();
            ((ArrayList) c1382450m4x.LJII).addAll(listLJLLLL);
            zQ2(str3, true, listLJLLLL);
            return;
        }
        this.LLILLJJLI.LIZIZ();
        AQ2(true);
        ((ArrayList) this.LLJILJILJ.LJII).clear();
    }

    public final void xQ2(boolean z) {
        if (this.LLILZ.getAndSet(true)) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0O21(this, z, null), 2);
    }

    @Override // X.C0O23
    public final void xS1(List<? extends IMContact> list) {
        List<AbstractC595720NYc> listLIZ;
        InterfaceC897330ZId interfaceC897330ZId;
        C1382470m4z c1382470m4z = this.LLJILJIL;
        c1382470m4z.getClass();
        IActiveStatusObserverProducer.LIZ.getClass();
        IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
        if (iActiveStatusObserverProducerLIZ != null && (listLIZ = iActiveStatusObserverProducerLIZ.LIZ(list)) != null && (interfaceC897330ZId = c1382470m4z.LIZIZ) != null) {
            interfaceC897330ZId.LJFF(listLIZ);
        }
    }

    public final void yQ2(C20618015m6 c20618015m6) {
        C20616415lq c20616415lq;
        C20617915m5 c20617915m5 = this.LL;
        if (c20617915m5 != null) {
            String strLIZ = c20618015m6.LIZ();
            if (strLIZ.length() == 0) {
                c20617915m5.LIZLLL.LIZIZ();
                return;
            }
            synchronized (c20617915m5.LJFF) {
                try {
                    c20616415lq = (C20616415lq) ((LinkedHashMap) c20617915m5.LJ).get(strLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c20616415lq == null) {
                c20617915m5.LIZLLL.LIZIZ();
                return;
            }
            if (c20616415lq.LJI != EnumC20616515lr.SENT) {
                C1231704rr c1231704rr = c20616415lq.LJFF;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try to undo sending msg, wrong state, current state is ");
                sbLIZ.append(c20616415lq.LJI);
                sbLIZ.append(", contact is ");
                sbLIZ.append(c20618015m6);
                C2188811AlT.LIZIZ(sbLIZ);
                c1231704rr.LIZIZ();
                return;
            }
            c20616415lq.LJFF.getClass();
            setState(new AwS610S0100000_31(c20618015m6, 209));
        }
    }

    public final List vQ2(String str, List list, Map map) {
        boolean zBooleanValue;
        C20618015m6 c20618015m6;
        boolean zBooleanValue2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IMUser) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof IMConversation) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String uid = ((BaseContact) it2.next()).getUid();
            if (uid == null) {
                uid = "";
            }
            arrayList3.add(uid);
        }
        this.LLJILJIL.getClass();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList3, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj3 : arrayList3) {
            C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS276S0000000_31.get$arr$(345), obj3);
            InterfaceC897380ZIi.LIZIZ.getClass();
            linkedHashMap.put(obj3, Boolean.valueOf(C896480ZEw.LIZJ(C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ))));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            C595700NYa c595700NYaLIZIZ = null;
            if (!it3.hasNext()) {
                break;
            }
            IMConversation iMConversation = (IMConversation) it3.next();
            IActiveStatusObserverProducer.LIZ.getClass();
            IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
            if (iActiveStatusObserverProducerLIZ != null) {
                c595700NYaLIZIZ = iActiveStatusObserverProducerLIZ.LIZIZ(iMConversation);
            }
            InterfaceC897380ZIi.LIZIZ.getClass();
            boolean zLIZJ = C896480ZEw.LIZJ(C897370ZIh.LIZ().LIZIZ(c595700NYaLIZIZ));
            String conversationId = iMConversation.getConversationId();
            if (conversationId != null) {
                linkedHashMap2.put(conversationId, Boolean.valueOf(zLIZJ));
            }
        }
        Map mapLJIIL = C2097608Jq.LJIIL(linkedHashMap, linkedHashMap2);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (!Intrinsics.LJFF(((BaseContact) obj4).getUid(), C461720I8s.LIZIZ())) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int i = 0;
        for (Object obj5 : arrayList4) {
            int i2 = i + 1;
            if (i >= 0) {
                IMContact iMContact = (IMContact) obj5;
                if (iMContact instanceof IMUser) {
                    String uid2 = iMContact.getUid();
                    EnumC20616515lr enumC20616515lr = (EnumC20616515lr) map.get(C0YNP.LJ(uid2));
                    if (enumC20616515lr == null) {
                        enumC20616515lr = EnumC20616515lr.NOT_SEND;
                    }
                    Boolean bool = (Boolean) ((LinkedHashMap) mapLJIIL).get(uid2);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    c20618015m6 = new C20618015m6(EnumC20618215m8.USER, iMContact.getDisplayName(), uid2, iMContact.getDisplayAvatar(), enumC20616515lr, str, i, zBooleanValue2, iMContact);
                } else if (!(iMContact instanceof IMConversation)) {
                    i = i2;
                } else {
                    IMConversation iMConversation2 = (IMConversation) iMContact;
                    EnumC20616515lr enumC20616515lr2 = (EnumC20616515lr) map.get(iMConversation2.getConversationId());
                    if (enumC20616515lr2 == null) {
                        enumC20616515lr2 = EnumC20616515lr.NOT_SEND;
                    }
                    Boolean bool2 = (Boolean) ((LinkedHashMap) mapLJIIL).get(iMConversation2.getConversationId());
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    c20618015m6 = new C20618015m6(EnumC20618215m8.GROUP_CHAT, iMConversation2.getDisplayName(), iMConversation2.getConversationId(), iMConversation2.getDisplayAvatar(), enumC20616515lr2, str, i, zBooleanValue, iMContact);
                }
                arrayList5.add(c20618015m6);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLJILLL.clear();
        this.LLJILLL.addAll(arrayList5);
        return arrayList5;
    }

    public final void zQ2(String str, boolean z, List list) {
        Map<String, EnumC20616515lr> mapLJ;
        boolean z2;
        int iIncrementAndGet;
        boolean zIsEmpty = list.isEmpty();
        C20617915m5 c20617915m5 = this.LL;
        if (c20617915m5 != null) {
            mapLJ = c20617915m5.LIZ();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        if (!mapLJ.containsValue(EnumC20616515lr.SENDING) && !mapLJ.containsValue(EnumC20616515lr.SENT)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            iIncrementAndGet = this.LLILZLL.incrementAndGet();
        } else {
            iIncrementAndGet = this.LLILZLL.get();
        }
        setState(new C20617515m1(this, list, mapLJ, str, z2, zIsEmpty, iIncrementAndGet));
    }
}
