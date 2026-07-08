package com.ss.android.ugc.aweme.inbox.v2;

import X.AbstractC1889640zH0;
import X.C0Z31;
import X.C1508630pMT;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1889570zGt;
import X.C1889650zH1;
import X.C1889670zH3;
import X.C1889690zH5;
import X.C1889700zH6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C890330YwJ;
import X.InterfaceC1890280zI2;
import X.InterfaceC1891350zJl;
import X.InterfaceC895400ZAs;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2ViewModel;
import com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxFragmentV2ViewModel extends ViewModel {
    public static final C1889700zH6 LLJILJIL = new Object() { // from class: X.0zH6
    };
    public Function1<? super AbstractC1889640zH0, Unit> LL;
    public Fragment LLILLJJLI;
    public final NextLiveData<Boolean> LLILLL;
    public final NextLiveData<Boolean> LLILZ;
    public AbstractC1889640zH0 LLILZIL;
    public final NextLiveData<Integer> LLILZLL;
    public final NextLiveData LLIZ;
    public InboxPageWidgetContainer LLIZLLLIL;
    public boolean LLJ;
    public final C1889570zGt LLJI;
    public int LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0zGt] */
    public InboxFragmentV2ViewModel() {
        NextLiveData<Boolean> nextLiveData = new NextLiveData<>();
        this.LLILLL = nextLiveData;
        this.LLILZ = nextLiveData;
        this.LLILZIL = C1889690zH5.LIZ;
        NextLiveData<Integer> nextLiveData2 = new NextLiveData<>();
        this.LLILZLL = nextLiveData2;
        this.LLIZ = nextLiveData2;
        this.LLJI = new InterfaceC1890280zI2() { // from class: X.0zGt
            @Override // X.InterfaceC1890280zI2
            public final void LIZIZ() {
                AbstractC1889640zH0 abstractC1889640zH0 = this.LIZ.LLILZIL;
                C1889680zH4 c1889680zH4 = new AbstractC1889640zH0() { // from class: X.0zH4
                };
                if (Intrinsics.LJFF(abstractC1889640zH0, c1889680zH4)) {
                    return;
                }
                InboxFragmentV2ViewModel inboxFragmentV2ViewModel = this.LIZ;
                inboxFragmentV2ViewModel.LLILZIL = c1889680zH4;
                InboxPageWidgetContainer inboxPageWidgetContainer = inboxFragmentV2ViewModel.LLIZLLLIL;
                if (inboxPageWidgetContainer != null) {
                    inboxPageWidgetContainer.LJJIIJ();
                }
            }

            @Override // X.InterfaceC1890280zI2
            public final void LIZ(List<? extends InterfaceC1891350zJl> list) {
                InterfaceC887660Ys0 interfaceC887660Ys0;
                InboxPageWidgetContainer inboxPageWidgetContainer = this.LIZ.LLIZLLLIL;
                if (inboxPageWidgetContainer != null) {
                    Iterator it2 = ((ArrayList) inboxPageWidgetContainer.Jo()).iterator();
                    while (it2.hasNext()) {
                        ((InboxWidget) it2.next()).wo();
                    }
                    if (!((ArrayList) list).isEmpty()) {
                        Iterator it3 = ((ArrayList) list).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it3.next();
                            if ((interfaceC1891350zJl instanceof InterfaceC887660Ys0) && (interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJl) != null && interfaceC887660Ys0.isSwitchingMode()) {
                                inboxPageWidgetContainer.k41(inboxPageWidgetContainer.LLJJJIL, false);
                                if (!inboxPageWidgetContainer.LLJJJIL && inboxPageWidgetContainer.LLJJJJJIL) {
                                    inboxPageWidgetContainer.LLJJJJJIL = false;
                                    C1440005kM.LIZ(new C1618730sE3());
                                }
                            }
                        }
                    }
                }
                IMChatListApi.LJJIII.getClass();
                if (C890330YwJ.LIZ().LJIILIIL().LIZIZ()) {
                    C890330YwJ.LIZ().LJIILIIL().LJFF(list);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1890280zI2
            public final void LIZJ(RecyclerView.ViewHolder viewHolder) {
                InterfaceC892580Yzw interfaceC892580Yzw;
                InboxPageWidgetContainer inboxPageWidgetContainer = this.LIZ.LLIZLLLIL;
                if (inboxPageWidgetContainer != null) {
                    InboxWidget inboxWidget = inboxPageWidgetContainer.LLJJIII.get(C13LE.LIZ(viewHolder.getClass()));
                    if (inboxWidget != null) {
                        inboxWidget.zo(viewHolder);
                    }
                    if ((viewHolder instanceof InterfaceC892580Yzw) && (interfaceC892580Yzw = (InterfaceC892580Yzw) viewHolder) != null) {
                        interfaceC892580Yzw.LJLJI(null);
                    }
                }
            }

            @Override // X.InterfaceC1890280zI2
            public final void LJ(RecyclerView recyclerView) {
                InboxPageWidgetContainer inboxPageWidgetContainer = this.LIZ.LLIZLLLIL;
                if (inboxPageWidgetContainer != null) {
                    inboxPageWidgetContainer.oo(recyclerView);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1890280zI2
            public final void LJII(RecyclerView.ViewHolder viewHolder) {
                InboxWidget inboxWidget;
                InboxPageWidgetContainer inboxPageWidgetContainer = this.LIZ.LLIZLLLIL;
                if (inboxPageWidgetContainer != null && (inboxWidget = inboxPageWidgetContainer.LLJJIII.get(C13LE.LIZ(viewHolder.getClass()))) != null && inboxWidget.ko().isEnable()) {
                    inboxWidget.xo(viewHolder);
                }
                if (viewHolder instanceof InterfaceC1598970riB) {
                    ((InterfaceC1598970riB) viewHolder).j(true);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1890280zI2
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl) {
                InboxWidget inboxWidget;
                InterfaceC892580Yzw interfaceC892580Yzw;
                InboxPageWidgetContainer inboxPageWidgetContainer = this.LIZ.LLIZLLLIL;
                if (inboxPageWidgetContainer != null && (inboxWidget = inboxPageWidgetContainer.LLJJIII.get(C13LE.LIZ(viewHolder.getClass()))) != null && inboxWidget.ko().isEnable()) {
                    inboxWidget.yo(viewHolder);
                    InterfaceC887660Ys0<?> interfaceC887660Ys0 = null;
                    if ((viewHolder instanceof InterfaceC892580Yzw) && (interfaceC892580Yzw = (InterfaceC892580Yzw) viewHolder) != null) {
                        if (interfaceC1891350zJl instanceof InterfaceC887660Ys0) {
                            interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJl;
                        }
                        interfaceC892580Yzw.LJLJI(interfaceC887660Ys0);
                    }
                }
                if (viewHolder instanceof InterfaceC1598970riB) {
                    ((InterfaceC1598970riB) viewHolder).j(false);
                }
            }

            @Override // X.InterfaceC1890280zI2
            public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
                InboxWidget inboxWidget;
                InboxPageWidgetContainer inboxPageWidgetContainer = this.LIZ.LLIZLLLIL;
                if (inboxPageWidgetContainer != null && (inboxWidget = inboxPageWidgetContainer.LLJJI.get(c13iq)) != null && inboxWidget.ko().isEnable()) {
                    RecyclerView.ViewHolder viewHolderUo = inboxWidget.uo(viewGroup, c13iq);
                    if (viewHolderUo != null) {
                        inboxPageWidgetContainer.LLJJIII.put(C13LE.LIZ(viewHolderUo.getClass()), inboxWidget);
                    }
                    return viewHolderUo;
                }
                return null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:
            
                r0 = r4.Lo(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
            
                if (r0 == null) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
            
                if (r0.ko().isHide() == true) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
            
                continue;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1890280zI2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, X.InterfaceC1891350zJl r10, int r11) {
                /*
                    Method dump skipped, instruction units count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1889570zGt.LJI(androidx.recyclerview.widget.RecyclerView$ViewHolder, X.0zJl, int):void");
            }
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = null;
    }

    public final void vQ2(AbstractC1889640zH0 abstractC1889640zH0) {
        Function1<? super AbstractC1889640zH0, Unit> function1;
        if (this.LL == null) {
            return;
        }
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LIZ(10);
        }
        this.LLILZIL = abstractC1889640zH0;
        if (abstractC1889640zH0 instanceof C1889650zH1) {
            C0Z31 c0z31LJIIZILJ2 = C890330YwJ.LIZ().LJIIZILJ();
            if (c0z31LJIIZILJ2 != null) {
                c0z31LJIIZILJ2.LIZ(11);
            }
            C1508630pMT.LIZ.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vm refresh: -- ");
            sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
            C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
            Function1<? super AbstractC1889640zH0, Unit> function12 = this.LL;
            if (function12 != null) {
                function12.invoke(this.LLILZIL);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(abstractC1889640zH0, C1889670zH3.LIZ) || (function1 = this.LL) == null) {
            return;
        }
        function1.invoke(this.LLILZIL);
    }

    public final void wQ2(int i, boolean z) {
        List<? extends InterfaceC1891350zJl> list;
        InterfaceC895400ZAs interfaceC895400ZAs;
        List<? extends InterfaceC1891350zJl> list2;
        InboxPageWidgetContainer inboxPageWidgetContainer = this.LLIZLLLIL;
        this.LLJIJIL = i;
        if (!z && inboxPageWidgetContainer != null && (list2 = inboxPageWidgetContainer.LLJJIJI) != null) {
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                    if (i2 > this.LLJIJIL && (interfaceC1891350zJl2 instanceof InterfaceC895400ZAs) && ((InterfaceC895400ZAs) interfaceC1891350zJl2).getHasUnReadCountInInbox()) {
                        this.LLILZLL.postValue(Integer.valueOf(i2));
                        this.LLJIJIL = i2;
                        return;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        this.LLJIJIL = 0;
        InboxPageWidgetContainer inboxPageWidgetContainer2 = this.LLIZLLLIL;
        if (inboxPageWidgetContainer2 != null && (list = inboxPageWidgetContainer2.LLJJIJI) != null) {
            ArrayList<InterfaceC1891350zJl> arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                for (InterfaceC1891350zJl interfaceC1891350zJl3 : arrayList) {
                    if ((interfaceC1891350zJl3 instanceof InterfaceC895400ZAs) && (interfaceC895400ZAs = (InterfaceC895400ZAs) interfaceC1891350zJl3) != null && interfaceC895400ZAs.getHasUnReadCountInInbox()) {
                        wQ2(0, false);
                        return;
                    }
                }
            }
        }
        this.LLILZLL.postValue(0);
    }
}
