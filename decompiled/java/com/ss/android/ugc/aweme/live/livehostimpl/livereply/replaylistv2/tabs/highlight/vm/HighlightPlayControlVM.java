package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm;

import X.C1005830cHV;
import X.C1160660gJE;
import X.C13BV;
import X.C13LP;
import X.C1835580xro;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AComparatorS37S0000000_18;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS33S0000100_18;

/* JADX INFO: loaded from: classes19.dex */
public final class HighlightPlayControlVM extends AssemViewModel<C1005830cHV> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1005830cHV(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v18, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.util.List] */
    public final void vQ2(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        ?? arrayList;
        int childAdapterPosition;
        C1835580xro c1835580xro;
        boolean z;
        boolean z2;
        C1160660gJE c1160660gJE;
        Object next;
        Object next2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleScrollEnd: childCount=");
        sbLIZ.append(viewOnAttachStateChangeListenerC20604515jv.getChildCount());
        C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1891350zJl> listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems();
        if (listItems == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            int height = viewOnAttachStateChangeListenerC20604515jv.getHeight();
            int width = viewOnAttachStateChangeListenerC20604515jv.getWidth();
            if (height > 0 && width > 0) {
                Rect rect = new Rect(0, 0, width, height);
                arrayList = new ArrayList(viewOnAttachStateChangeListenerC20604515jv.getChildCount());
                int childCount = viewOnAttachStateChangeListenerC20604515jv.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i);
                    if (childAt != null && (childAdapterPosition = viewOnAttachStateChangeListenerC20604515jv.getChildAdapterPosition(childAt)) != -1) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(childAdapterPosition, listItems);
                        if ((objLJJJLZIJ instanceof C1835580xro) && (c1835580xro = (C1835580xro) objLJJJLZIJ) != null) {
                            Rect rect2 = new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            float fWidth = rect2.width() * rect2.height();
                            float fMax = 0.0f;
                            if (fWidth > 0.0f) {
                                if (new Rect(rect2).intersect(rect)) {
                                    fMax = Math.max(0.0f, r13.width() * r13.height());
                                }
                                arrayList.add(new C1160660gJE(fMax / fWidth, childAdapterPosition, rect2.top, c1835580xro.LL));
                            }
                        }
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
        }
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            if (viewOnAttachStateChangeListenerC20604515jv.canScrollVertically(-1) && viewOnAttachStateChangeListenerC20604515jv.computeVerticalScrollOffset() > 1) {
                z = false;
            } else {
                z = true;
            }
            if (viewOnAttachStateChangeListenerC20604515jv.canScrollVertically(1) && viewOnAttachStateChangeListenerC20604515jv.computeVerticalScrollOffset() + viewOnAttachStateChangeListenerC20604515jv.computeVerticalScrollExtent() < viewOnAttachStateChangeListenerC20604515jv.computeVerticalScrollRange() - 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        int i2 = ((C1160660gJE) next2).LIZ;
                        do {
                            Object next3 = it2.next();
                            int i3 = ((C1160660gJE) next3).LIZ;
                            if (i2 > i3) {
                                next2 = next3;
                                i2 = i3;
                            }
                        } while (it2.hasNext());
                    }
                }
                c1160660gJE = (C1160660gJE) next2;
            } else if (z2) {
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    next = null;
                } else {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int i4 = ((C1160660gJE) next).LIZ;
                        do {
                            Object next4 = it3.next();
                            int i5 = ((C1160660gJE) next4).LIZ;
                            if (i4 < i5) {
                                next = next4;
                                i4 = i5;
                            }
                        } while (it3.hasNext());
                    }
                }
                c1160660gJE = (C1160660gJE) next;
            } else {
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    float fMax2 = ((C1160660gJE) it4.next()).LIZJ;
                    while (it4.hasNext()) {
                        fMax2 = Math.max(fMax2, ((C1160660gJE) it4.next()).LIZJ);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (Math.abs(((C1160660gJE) obj).LIZJ - fMax2) < 0.001f) {
                            arrayList2.add(obj);
                        }
                    }
                    if (arrayList2.size() <= 1) {
                        c1160660gJE = (C1160660gJE) C13LP.LJJJLL(arrayList2);
                    } else {
                        Iterator it5 = arrayList2.iterator();
                        if (it5.hasNext()) {
                            int i6 = ((C1160660gJE) it5.next()).LIZLLL;
                            while (it5.hasNext()) {
                                int i7 = ((C1160660gJE) it5.next()).LIZLLL;
                                if (i6 > i7) {
                                    i6 = i7;
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : arrayList2) {
                                if (Math.abs(((C1160660gJE) obj2).LIZLLL - i6) < 0.5f) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (arrayList3.size() <= 1) {
                                c1160660gJE = (C1160660gJE) C13LP.LJJJLL(arrayList3);
                                if (c1160660gJE == null) {
                                    c1160660gJE = (C1160660gJE) C13LP.LJJJLL(arrayList2);
                                }
                            } else {
                                List listLJLLLL = C13LP.LJLLLL(new AComparatorS37S0000000_18(13), arrayList3);
                                c1160660gJE = (C1160660gJE) C13LP.LJJJJZI(listLJLLLL);
                                C1160660gJE c1160660gJE2 = (C1160660gJE) C13LP.LJJLIIIJJI(listLJLLLL);
                                if (c1160660gJE.LIZLLL < viewOnAttachStateChangeListenerC20604515jv.getHeight() / 3.0f) {
                                    c1160660gJE = c1160660gJE2;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("handleScrollEnd: chosen position=");
                                sbLIZ2.append(c1160660gJE.LIZ);
                                sbLIZ2.append(" id=");
                                sbLIZ2.append(c1160660gJE.LIZIZ);
                                sbLIZ2.append(" ratio=");
                                sbLIZ2.append(c1160660gJE.LIZJ);
                                C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ2));
                                setState(new AwS33S0000100_18(c1160660gJE.LIZIZ, 8));
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            if (c1160660gJE == null) {
                return;
            }
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("handleScrollEnd: chosen position=");
            sbLIZ22.append(c1160660gJE.LIZ);
            sbLIZ22.append(" id=");
            sbLIZ22.append(c1160660gJE.LIZIZ);
            sbLIZ22.append(" ratio=");
            sbLIZ22.append(c1160660gJE.LIZJ);
            C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ22));
            setState(new AwS33S0000100_18(c1160660gJE.LIZIZ, 8));
        }
    }
}
