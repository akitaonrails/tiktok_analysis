package com.ss.android.ugc.aweme.im.messagelist.ui;

import X.AbstractC21674919sB;
import X.C098200Yq;
import X.C0I80;
import X.C0I90;
import X.C0I91;
import X.C1383370m6R;
import X.C13BV;
import X.C13LP;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C1761906vB;
import X.C1762006vC;
import X.C189200o6;
import X.C19719612Di;
import X.C1AF0;
import X.C269700Ahc;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1891350zJl;
import X.InterfaceC459890I1r;
import X.InterfaceC665370Q7z;
import X.InterfaceC904740ZeS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ALAdapterS3S0200000_6;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MessageListItemAnimator extends AbstractC21674919sB implements IMessagePowerAdapterProtocol {
    public final LifecycleOwner LLIZLLLIL;
    public final RecyclerView LLJ;
    public final boolean LLJI;
    public final InterfaceC459890I1r LLJIJIL;
    public final boolean LLJJI;
    public final Set<Integer> LLJJIJI;
    public final List<RecyclerView.ViewHolder> LLJILJIL = new ArrayList();
    public final List<RecyclerView.ViewHolder> LLJILJILJ = new ArrayList();
    public final List<RecyclerView.ViewHolder> LLJILLL = new ArrayList();
    public final List<RecyclerView.ViewHolder> LLJJ = new ArrayList();
    public boolean LLJJIII = true;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void C() {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void Fj() {
    }

    @Override // X.AbstractC21673719rz
    public final long LJIILIIL() {
        throw null;
    }

    @Override // X.AbstractC21673719rz
    public final long LJIILL() {
        return 300L;
    }

    @Override // X.AbstractC21673719rz
    public final long LJIILLIIL() {
        return 300L;
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        for (RecyclerView.ViewHolder viewHolder : this.LLJILJIL) {
            viewHolder.itemView.animate().setListener(null).cancel();
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
            LJJIIJ(viewHolder);
        }
        ((ArrayList) this.LLJILJIL).clear();
        for (RecyclerView.ViewHolder viewHolder2 : this.LLJILJILJ) {
            viewHolder2.itemView.animate().setListener(null).cancel();
            C786410Ut5.T4(viewHolder2.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder2.itemView, 0.0f);
            C786410Ut5.Ob(viewHolder2.itemView, 1.0f);
            C786410Ut5.pc(viewHolder2.itemView, 1.0f);
            C786410Ut5.ed(viewHolder2.itemView, 0.0f);
            LJJIIJ(viewHolder2);
        }
        ((ArrayList) this.LLJILJILJ).clear();
        for (RecyclerView.ViewHolder viewHolder3 : this.LLJJ) {
            viewHolder3.itemView.animate().setListener(null).cancel();
            if (this.LLJJI) {
                C786410Ut5.Jc(viewHolder3.itemView, 0.0f);
                C786410Ut5.Ob(viewHolder3.itemView, 1.0f);
                C786410Ut5.pc(viewHolder3.itemView, 1.0f);
            }
            C786410Ut5.T4(viewHolder3.itemView, 1.0f);
            C786410Ut5.ed(viewHolder3.itemView, 0.0f);
            LJIIIZ(viewHolder3);
        }
        ((ArrayList) this.LLJJ).clear();
        for (RecyclerView.ViewHolder viewHolder4 : this.LLJILLL) {
            viewHolder4.itemView.animate().setListener(null).cancel();
            if (this.LLJJI) {
                C786410Ut5.Jc(viewHolder4.itemView, 0.0f);
                C786410Ut5.Ob(viewHolder4.itemView, 1.0f);
                C786410Ut5.pc(viewHolder4.itemView, 1.0f);
            }
            C786410Ut5.T4(viewHolder4.itemView, 1.0f);
            C786410Ut5.ed(viewHolder4.itemView, 0.0f);
            LJIIIZ(viewHolder4);
        }
        ((ArrayList) this.LLJILLL).clear();
        LJJIIZI();
        if (this.LLJJIII) {
            this.LLJJIII = false;
        }
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJJ.isEmpty() ^ true) || (this.LLJILLL.isEmpty() ^ true) || (this.LLJILJIL.isEmpty() ^ true) || (this.LLJILJILJ.isEmpty() ^ true);
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJI() {
        if (this.LLJJIII) {
            this.LLJJIII = false;
        }
        this.LLJJIJI.clear();
    }

    public final void LJJIIZI() {
        ViewGroup viewGroup;
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
        ViewParent parent = this.LLJ.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        viewGroup.setClipChildren(true);
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (this.LLJJI) {
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            C786410Ut5.Ob(viewHolder.itemView, 1.0f);
            C786410Ut5.pc(viewHolder.itemView, 1.0f);
        }
        C786410Ut5.T4(viewHolder.itemView, 1.0f);
        C786410Ut5.ed(viewHolder.itemView, 0.0f);
        if (((ArrayList) this.LLJILJILJ).remove(viewHolder)) {
            C1AF0.LIZJ("MessageListItemAnimator: [animatingAnchorAddList] Item should have been removed by the list");
        }
        if (((ArrayList) this.LLJILJIL).remove(viewHolder)) {
            C1AF0.LIZJ("MessageListItemAnimator: [animatingAddList] Item should have been removed by the list");
        }
        if (((ArrayList) this.LLJJ).remove(viewHolder)) {
            C1AF0.LIZJ("MessageListItemAnimator: [animatingMoveList] Item should have been removed by the list");
        }
        if (((ArrayList) this.LLJILLL).remove(viewHolder)) {
            C1AF0.LIZJ("MessageListItemAnimator: [animatingMoveList] Item should have been removed by the list");
        }
        LJJIIZI();
        if (this.LLJJIII) {
            this.LLJJIII = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        C0I90 c0i90;
        Pair pair;
        PowerCell powerCell;
        InterfaceC1891350zJl item;
        if (viewHolder != 0 && !this.LLJJIII) {
            Rect rectLIZIZ = null;
            if (this.LLJIJIL.LIZJ(viewHolder) || ((viewHolder instanceof PowerCell) && (powerCell = (PowerCell) viewHolder) != null && (item = powerCell.getItem()) != null && this.LLJJIJI.contains(Integer.valueOf(item.hashCode())))) {
                LJJIIJ(viewHolder);
                return true;
            }
            LJJIIZ(viewHolder);
            if (viewHolder instanceof C0I90) {
                c0i90 = (C0I90) viewHolder;
            } else {
                c0i90 = null;
            }
            if (this.LLJJI && c0i90 != null) {
                String strF5 = c0i90.F5();
                if (strF5 != null) {
                    rectLIZIZ = this.LLJIJIL.LIZIZ(strF5);
                }
                pair = new Pair(rectLIZIZ, c0i90.Yi());
            } else {
                pair = new Pair(null, null);
            }
            Rect rect = (Rect) pair.getFirst();
            Rect rect2 = (Rect) pair.getSecond();
            if (rect != null && rect2 != null) {
                float pivotX = viewHolder.itemView.getPivotX();
                float pivotY = viewHolder.itemView.getPivotY() + rect2.top;
                float fWidth = rect.width() / rect2.width();
                float fHeight = rect.height() / rect2.height();
                float f = rect.left - (pivotX + ((rect2.left - pivotX) * fWidth));
                float f2 = rect.top - (pivotY + ((rect2.top - pivotY) * fHeight));
                float fLJII = C1383370m6R.LJII(this.LLJ, this.LLJI);
                C786410Ut5.Ob(viewHolder.itemView, fWidth);
                C786410Ut5.pc(viewHolder.itemView, fHeight);
                C786410Ut5.ed(viewHolder.itemView, f2 - fLJII);
                C786410Ut5.Jc(viewHolder.itemView, f);
                ((ArrayList) this.LLJILJILJ).add(viewHolder);
                viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).translationX(0.0f).setDuration(300L).setListener(new ALAdapterS3S0200000_6(viewHolder, this, 9));
                return true;
            }
            ((ArrayList) this.LLJILJIL).add(viewHolder);
            C786410Ut5.ed(viewHolder.itemView, r3.getHeight());
            C786410Ut5.T4(viewHolder.itemView, 0.0f);
            viewHolder.itemView.animate().translationY(0.0f).alpha(1.0f).setDuration(300L).setListener(new ALAdapterS3S0200000_6(viewHolder, this, 10));
            return true;
        }
        LJJIIJ(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null && viewHolder.getBindingAdapterPosition() == -1 && !this.LLJJIII) {
            LJJIIZ(viewHolder);
            ((ArrayList) this.LLJILLL).add(viewHolder);
            viewHolder.itemView.animate().alpha(0.0f).setDuration(300L).setListener(new ALAdapterS3S0200000_6(viewHolder, this, 12));
            return true;
        }
        LJIIIZ(viewHolder);
        return false;
    }

    public final void LJJIIZ(RecyclerView.ViewHolder viewHolder) {
        ((ArrayList) this.LLJILJILJ).remove(viewHolder);
        ((ArrayList) this.LLJILJIL).remove(viewHolder);
        ((ArrayList) this.LLJJ).remove(viewHolder);
        ((ArrayList) this.LLJILLL).remove(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        boolean z;
        if (!((Boolean) C269700Ahc.LIZ.getValue()).booleanValue()) {
            return LJII(viewHolder);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C0I80) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((C0I80) it2.next()).LIZ()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void YP2(List<? extends C869590Y9l> list, List<? extends InterfaceC904740ZeS> list2, List<? extends InterfaceC1891350zJl> list3) {
        Object objLJJJLZIJ;
        Integer numValueOf;
        Iterable iterable;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC904740ZeS interfaceC904740ZeS : list2) {
            if (interfaceC904740ZeS instanceof C1761906vB) {
                iterable = ((C1761906vB) interfaceC904740ZeS).LIZ;
            } else if (interfaceC904740ZeS instanceof C1762006vC) {
                iterable = ((C1762006vC) interfaceC904740ZeS).LIZ;
            } else {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Integer numValueOf2 = Integer.valueOf(list.indexOf(it2.next()));
            if (numValueOf2.intValue() != -1 && 1 != 0 && (objLJJJLZIJ = C13LP.LJJJLZIJ(numValueOf2.intValue(), list3)) != null && (numValueOf = Integer.valueOf(objLJJJLZIJ.hashCode())) != null) {
                arrayList2.add(numValueOf);
            }
        }
        this.LLJJIJI.addAll(arrayList2);
    }

    public MessageListItemAnimator(LifecycleOwner lifecycleOwner, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, boolean z, InterfaceC459890I1r interfaceC459890I1r, C0I91 c0i91) {
        Lifecycle lifecycle;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        this.LLJI = z;
        this.LLJIJIL = interfaceC459890I1r;
        this.LLJJI = c0i91.LIZ;
        this.LLIZ = ((Boolean) C269700Ahc.LIZ.getValue()).booleanValue();
        try {
            final InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jv, null);
            C1554610qYd.LIZJ(interfaceC665370Q7zLJ, IMessagePowerAdapterProtocol.class, C1697810uHb.LJIILJJIL(this));
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.ui.MessageListItemAnimator$_init_$lambda$0$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJ, IMessagePowerAdapterProtocol.class, this);
                        }
                    }
                });
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLJJIJI = new LinkedHashSet();
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        int i5 = i2 - i4;
        if (viewHolder != null && !this.LLJJIII) {
            if (i5 == 0) {
                LJIIIZ(viewHolder);
                return false;
            }
            LJJIIZ(viewHolder);
            ((ArrayList) this.LLJJ).add(viewHolder);
            viewHolder.itemView.animate().cancel();
            View view = viewHolder.itemView;
            C786410Ut5.ed(view, view.getTranslationY() + i5);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder.itemView.animate();
            if (this.LLJJI) {
                viewPropertyAnimatorAnimate.translationX(0.0f);
                viewPropertyAnimatorAnimate.scaleX(1.0f);
                viewPropertyAnimatorAnimate.scaleY(1.0f);
            }
            viewPropertyAnimatorAnimate.alpha(1.0f).translationY(0.0f).setDuration(300L).setListener(new ALAdapterS3S0200000_6(viewHolder, this, 11));
            return true;
        }
        LJIIIZ(viewHolder);
        return false;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (!Intrinsics.LJFF(viewHolder, viewHolder2)) {
            LJIIIZ(viewHolder);
        }
        return LJJII(viewHolder2, i, i2, i3, i4);
    }
}
