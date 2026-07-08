package com.ss.android.ugc.aweme.inbox.widget.v2;

import X.AbstractC1865990yer;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1569910qxJ;
import X.C1865630yeH;
import X.C1889180zGG;
import X.C1889200zGI;
import X.C1889340zGW;
import X.C1889350zGX;
import X.C1889360zGY;
import X.C1889370zGZ;
import X.C2188811AlT;
import X.C2450909j1;
import X.C452501pT;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.InterfaceC1891350zJl;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerPageWidgetContainer;
import defpackage.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class InboxWidgetContainer extends InboxWidget {
    public boolean LLJILJIL;
    public volatile boolean LLIZLLLIL = true;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(225));
    public List<C1889180zGG> LLJI = C13BV.INSTANCE;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 268));
    public InboxWidgetStatus LLJILJILJ = C1889370zGZ.LIZ;

    public abstract List<C1889180zGG> Oo();

    public boolean Vo() {
        return this instanceof FollowerPageWidgetContainer;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public List<InterfaceC1891350zJl> Ao() {
        ArrayList arrayList = new ArrayList();
        for (InboxWidget inboxWidget : Jo()) {
            if (inboxWidget.ko().isShow()) {
                arrayList.addAll(inboxWidget.Ao());
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        ArrayList arrayList = new ArrayList();
        Iterator<InboxWidget> it2 = Jo().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().Bo());
        }
        return arrayList;
    }

    public final boolean Ho() {
        InboxWidgetStatus inboxWidgetStatusKo;
        if (this.LLJI.isEmpty()) {
            return true;
        }
        List<C1889180zGG> list = this.LLJI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C1889180zGG> it2 = list.iterator();
            while (it2.hasNext()) {
                C13IQ<? extends InboxWidget> c13iq = it2.next().LIZ;
                List<AbstractC738140SxQ> children = getChildren();
                Object obj = null;
                if (children == null) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : children) {
                    if (abstractC738140SxQ instanceof InboxWidget) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (Intrinsics.LJFF(C13LE.LIZ(next.getClass()), c13iq)) {
                        obj = next;
                        break;
                    }
                }
                InboxWidget inboxWidget = (InboxWidget) obj;
                if (inboxWidget == null || (inboxWidgetStatusKo = inboxWidget.ko()) == null || !inboxWidgetStatusKo.isCompleted()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final List<InboxWidget> Jo() {
        ArrayList arrayList = new ArrayList();
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                if (!(abstractC738140SxQ instanceof InboxWidget) || abstractC738140SxQ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error : ");
                    sbLIZ.append(new RuntimeException() { // from class: X.0zGb
                    }.getMessage());
                    C1569910qxJ.LIZ(this, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    arrayList.add(abstractC738140SxQ);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public List<C13IQ<? extends PowerCell<?>>> fo() {
        ArrayList arrayList = new ArrayList();
        for (InboxWidget inboxWidget : Jo()) {
            if (inboxWidget.ko().isEnable()) {
                arrayList.addAll(inboxWidget.fo());
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public InboxWidgetStatus ko() {
        InboxWidget inboxWidget;
        ArrayList arrayList = new ArrayList();
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            ArrayList<AbstractC738140SxQ> arrayList2 = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
                if ((abstractC738140SxQ2 instanceof InboxWidget) && ((InboxWidget) abstractC738140SxQ2).ko().isEnable()) {
                    arrayList2.add(abstractC738140SxQ);
                }
            }
            for (AbstractC738140SxQ abstractC738140SxQ3 : arrayList2) {
                if ((abstractC738140SxQ3 instanceof InboxWidget) && (inboxWidget = (InboxWidget) abstractC738140SxQ3) != null) {
                    arrayList.add(inboxWidget.ko());
                }
            }
        }
        if (arrayList.isEmpty()) {
            C1889370zGZ c1889370zGZ = C1889370zGZ.LIZ;
            this.LLJILJILJ = c1889370zGZ;
            return c1889370zGZ;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((InboxWidgetStatus) it2.next()).isShow()) {
                    C1889360zGY c1889360zGY = C1889360zGY.LIZ;
                    this.LLJILJILJ = c1889360zGY;
                    return c1889360zGY;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!((InboxWidgetStatus) it3.next()).isHide()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (!((InboxWidgetStatus) it4.next()).isInit()) {
                                return this.LLJILJILJ;
                            }
                        }
                    }
                    C1889350zGX c1889350zGX = C1889350zGX.LIZ;
                    this.LLJILJILJ = c1889350zGX;
                    return c1889350zGX;
                }
            }
        }
        C1889340zGW c1889340zGW = C1889340zGW.LIZ;
        this.LLJILJILJ = c1889340zGW;
        return c1889340zGW;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void LJJIIJ() {
        Object objPrevious;
        ArrayList arrayList = (ArrayList) Jo();
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (Intrinsics.LJFF(((InboxWidget) objPrevious).ko(), C1889360zGY.LIZ)) {
                    break;
                }
            }
        }
        InboxWidget inboxWidget = (InboxWidget) objPrevious;
        if (inboxWidget == null || !inboxWidget.ko().isEnable()) {
            return;
        }
        inboxWidget.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public EnumC1889520zGo bo() {
        AbstractC738140SxQ abstractC738140SxQ;
        InboxWidget inboxWidget;
        EnumC1889520zGo enumC1889520zGoBo;
        AbstractC738140SxQ abstractC738140SxQPrevious;
        InboxWidget inboxWidget2;
        InboxWidgetStatus inboxWidgetStatusKo;
        List<AbstractC738140SxQ> children = getChildren();
        if (children != null) {
            ListIterator<AbstractC738140SxQ> listIterator = children.listIterator(children.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC738140SxQPrevious = null;
                    break;
                }
                abstractC738140SxQPrevious = listIterator.previous();
                AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQPrevious;
                if ((abstractC738140SxQ2 instanceof InboxWidget) && (inboxWidget2 = (InboxWidget) abstractC738140SxQ2) != null && (inboxWidgetStatusKo = inboxWidget2.ko()) != null && inboxWidgetStatusKo.isShow()) {
                    break;
                }
            }
            abstractC738140SxQ = abstractC738140SxQPrevious;
        } else {
            abstractC738140SxQ = null;
        }
        return (!(abstractC738140SxQ instanceof InboxWidget) || (inboxWidget = (InboxWidget) abstractC738140SxQ) == null || (enumC1889520zGoBo = inboxWidget.bo()) == null) ? EnumC1889520zGo.COMPLETE : enumC1889520zGoBo;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public void lo() {
        Iterator<InboxWidget> it2 = Jo().iterator();
        while (it2.hasNext()) {
            it2.next().lo();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        List list = (List) this.LLJIJIL.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.LJFF(((C1889180zGG) obj).LJ, C1889200zGI.LIZ)) {
                arrayList.add(obj);
            }
        }
        this.LLJI = arrayList;
        C2450909j1.LIZIZ(new AwS429S0200000_28(this, C1865630yeH.LIZ, 140));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void wo() {
        for (InboxWidget inboxWidget : Jo()) {
            if (inboxWidget.ko().isEnable()) {
                inboxWidget.wo();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public void Fo(InboxWidgetStatus inboxWidgetStatus) {
        this.LLJILJILJ = inboxWidgetStatus;
    }

    public final InboxWidget Lo(AbstractC1865990yer abstractC1865990yer) {
        List<AbstractC738140SxQ> children = getChildren();
        Object obj = null;
        if (children == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : children) {
            if (abstractC738140SxQ instanceof InboxWidget) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((InboxWidget) next).identity(), abstractC1865990yer)) {
                obj = next;
                break;
            }
        }
        return (InboxWidget) obj;
    }

    public final void No(InboxWidget inboxWidget) {
        List<InboxWidget> list;
        if (!this.LLJILJIL && Vo() && this.LLIZLLLIL) {
            if (!So(inboxWidget)) {
                if (!Ho()) {
                    List<InboxWidget> list2 = ((i2) this.LLJ.getValue()).LIZ.get(i2.a.MAIN_NOT_READY);
                    if (list2 != null) {
                        list2.add(inboxWidget);
                        return;
                    }
                    return;
                }
                this.LLJILJIL = true;
            } else {
                if (!Ho()) {
                    Zo(inboxWidget);
                    return;
                }
                this.LLJILJIL = true;
                this.LLIZLLLIL = false;
                i2 i2Var = (i2) this.LLJ.getValue();
                i2.a aVar = i2.a.MAIN_NOT_READY;
                if (i2Var.LIZ.get(aVar) != null && (!r0.isEmpty()) && (list = ((i2) this.LLJ.getValue()).LIZ.get(aVar)) != null) {
                    list.clear();
                }
                Zo(this);
                return;
            }
        }
        Zo(inboxWidget);
    }

    public final boolean So(InboxWidget inboxWidget) {
        if (Intrinsics.LJFF(inboxWidget, this)) {
            return true;
        }
        List<C1889180zGG> list = this.LLJI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<C1889180zGG> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZ, C13LE.LIZ(inboxWidget.getClass()))) {
                return true;
            }
        }
        return false;
    }

    public void Zo(InboxWidget inboxWidget) {
        InboxWidgetContainer inboxWidgetContainer;
        LifecycleOwner parent = getParent();
        if ((parent instanceof InboxWidgetContainer) && (inboxWidgetContainer = (InboxWidgetContainer) parent) != null) {
            inboxWidgetContainer.No(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void onNewIntent(Intent intent) {
        for (InboxWidget inboxWidget : Jo()) {
            if (inboxWidget.ko().isEnable()) {
                inboxWidget.onNewIntent(intent);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void oo(RecyclerView recyclerView) {
        for (InboxWidget inboxWidget : Jo()) {
            if (inboxWidget.ko().isEnable()) {
                inboxWidget.oo(recyclerView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public void vo(EnumC1599580rjA enumC1599580rjA) {
        for (InboxWidget inboxWidget : Jo()) {
            if (inboxWidget.ko().isEnable()) {
                inboxWidget.vo(enumC1599580rjA);
            }
        }
    }
}
