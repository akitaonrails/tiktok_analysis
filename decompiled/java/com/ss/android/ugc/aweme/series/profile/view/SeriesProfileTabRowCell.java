package com.ss.android.ugc.aweme.series.profile.view;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C01GW;
import X.C0DXR;
import X.C118300cf;
import X.C1220000hqw;
import X.C1324840ka2;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1572790r1x;
import X.C1572800r1y;
import X.C1572810r1z;
import X.C1572840r22;
import X.C1697810uHb;
import X.C19350310n7;
import X.C197039127h;
import X.C20600815jK;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1578890rBn;
import X.InterfaceC1572780r1w;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1620810sHP;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.series.feed.profile.view.SeriesProfileItemCell;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import com.ss.android.ugc.aweme.series.profile.view.SeriesProfileTabRowCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileTabRowCell extends PowerCell<C1572840r22> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1054));
    public final C736950SvV LLILLJJLI;
    public AwS568S0100000_24 LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public RemoteImageView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public final C1572810r1z LLJI;
    public ViewTreeObserverOnGlobalLayoutListenerC1620810sHP LLJIJIL;

    public final void I5() {
        View view;
        if (this.LLJIJIL == null && (view = this.itemView) != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.LLJIJIL = new ViewTreeObserverOnGlobalLayoutListenerC1620810sHP(this, 0);
            C786410Ut5.x3(viewTreeObserver, this.LLJIJIL);
        }
    }

    public final SeriesProfileTabViewModel L5() {
        return (SeriesProfileTabViewModel) this.LLILLJJLI.getValue();
    }

    public final void P5() {
        View view;
        if (this.LLJIJIL == null || (view = this.itemView) == null) {
            return;
        }
        C786410Ut5.C3(view.getViewTreeObserver(), this.LLJIJIL);
    }

    public final void R5() {
        Rect rect = new Rect();
        boolean globalVisibleRect = this.itemView.getGlobalVisibleRect(rect);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1572840r22 item = getItem();
        sbLIZ.append(item != null ? item.LLILLJJLI : null);
        C1572840r22 item2 = getItem();
        sbLIZ.append(item2 != null ? Long.valueOf(item2.LLILZIL) : null);
        sbLIZ.append(" visibleRect.H:");
        sbLIZ.append(rect.height());
        sbLIZ.append(" isVisible : ");
        sbLIZ.append(globalVisibleRect);
        C2188811AlT.LIZIZ(sbLIZ);
        if (rect.height() <= 0 || !globalVisibleRect) {
            return;
        }
        AwS568S0100000_24 awS568S0100000_24 = this.LLILLL;
        if (awS568S0100000_24 != null) {
            awS568S0100000_24.invoke();
        }
        this.LLILLL = null;
        P5();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C1572840r22 item3 = getItem();
        sbLIZ2.append(item3 != null ? item3.LLILLJJLI : null);
        C1572840r22 item4 = getItem();
        sbLIZ2.append(item4 != null ? Long.valueOf(item4.LLILZIL) : null);
        sbLIZ2.append(" logShow");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0r1z] */
    public SeriesProfileTabRowCell() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1055);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(SeriesProfileTabViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(327), null, null, null);
        this.LLJI = new InterfaceC1572780r1w() { // from class: X.0r1z
            @Override // X.InterfaceC1572780r1w
            public final void LIZ() {
                SeriesProfileTabRowCell seriesProfileTabRowCell = this.LIZ;
                if (seriesProfileTabRowCell.LLILLL != null) {
                    seriesProfileTabRowCell.R5();
                }
            }
        };
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        P5();
        SeriesProfileTabViewModel seriesProfileTabViewModelL5 = L5();
        if (seriesProfileTabViewModelL5 != null) {
            seriesProfileTabViewModelL5.LLILLL.remove(this.LLJI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.qmu);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_PLAY.id());
        }
        this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) this.itemView.findViewById(R.id.e7t);
        this.LLILZIL = (RemoteImageView) this.itemView.findViewById(R.id.e6s);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.e81);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.fy7);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.hal);
        this.LLJ = (C197039127h) this.itemView.findViewById(R.id.watch_series_button);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(SeriesProfileItemCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.addItemDecoration(new C0DXR() { // from class: X.03Io
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (childAdapterPosition != -1 && childAdapterPosition <= 0 && childAdapterPosition == 0) {
                        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        I5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        R5();
        P5();
        SeriesProfileTabViewModel seriesProfileTabViewModelL5 = L5();
        if (seriesProfileTabViewModelL5 != null) {
            seriesProfileTabViewModelL5.LLILLL.remove(this.LLJI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C20600815jK<InterfaceC1891350zJl> state;
        super.unBind();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJFF(null);
        }
        R5();
        P5();
        SeriesProfileTabViewModel seriesProfileTabViewModelL5 = L5();
        if (seriesProfileTabViewModelL5 != null) {
            seriesProfileTabViewModelL5.LLILLL.remove(this.LLJI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String string;
        List<String> urlList;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        int iIntValue;
        final C1572840r22 c1572840r22 = (C1572840r22) interfaceC1891350zJl;
        I5();
        C118300cf c118300cf = new C118300cf();
        List<C1572800r1y> list = c1572840r22.LLJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (C1572800r1y c1572800r1y : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1572800r1y c1572800r1y2 = c1572800r1y;
                Boolean bool = c1572800r1y2.LJ;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    c118300cf.element = i;
                }
                long j = c1572840r22.LL;
                UrlModel urlModel = c1572840r22.LLILLL;
                Integer num = c1572800r1y2.LIZIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                arrayList.add(new C1572790r1x(j, urlModel, iIntValue, Intrinsics.LJFF(c1572800r1y2.LJ, bool2), c1572800r1y2, c1572840r22.LLJILJIL));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state2.LJFF(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LIZLLL(arrayList, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv3, new ARunnableS79S0200000_10(this, c118300cf, 105), 100L);
        }
        RemoteImageView remoteImageView = this.LLILZIL;
        UrlModel urlModel2 = c1572840r22.LLILLL;
        if (urlModel2 == null || (urlList = urlModel2.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1324840ka2.LJIIJ(remoteImageView, str, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            tuxTextView.setText(C19350310n7.LIZ(c1572840r22.LLILZIL));
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c1572840r22.LLILLJJLI);
        }
        Context context = getContext();
        if (context != null) {
            C197039127h c197039127h = this.LLJ;
            if (c197039127h != null) {
                if (c1572840r22.LLILZLL < 0) {
                    string = context.getString(2131847436);
                } else {
                    string = context.getString(2131836541);
                }
                c197039127h.setText(string);
            }
            TuxTextView tuxTextView3 = this.LLIZLLLIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(context.getString(2131847435, Long.valueOf(c1572840r22.LLILZ)));
            }
        }
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0r20
                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view) {
                    String str2;
                    if (view != null) {
                        SeriesProfileTabRowCell seriesProfileTabRowCell = this.LLILZ;
                        C1572840r22 c1572840r222 = c1572840r22;
                        if (c1572840r222.LLILZLL >= 0) {
                            str2 = "continue";
                        } else {
                            str2 = "watch";
                        }
                        seriesProfileTabRowCell.N5(c1572840r222, str2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, c197039127h2);
        }
        View view = this.itemView;
        if (view != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0r21
                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        this.LLILZ.N5(c1572840r22, "blank_space");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, view);
        }
        this.LLILLL = new AwS568S0100000_24(this, 1912);
        I5();
        L5().LLILLL.add(this.LLJI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bi6, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.C1572840r22 r12, java.lang.String r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getContext()
            java.lang.String r3 = ""
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel r5 = r11.L5()
            long r0 = r12.LL
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r0 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.util.List<X.0r1y> r0 = r12.LLJI
            if (r0 == 0) goto L45
            java.util.Iterator r4 = r0.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.0r1y r0 = (X.C1572800r1y) r0
            java.lang.Boolean r1 = r0.LJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L20
        L37:
            X.0r1y r2 = (X.C1572800r1y) r2
            if (r2 == 0) goto L45
            java.lang.Long r0 = r2.LIZLLL
            if (r0 == 0) goto L45
            java.lang.String r8 = r0.toString()
            if (r8 != 0) goto L46
        L45:
            r8 = r3
        L46:
            r9 = 0
            java.lang.String r0 = "continue"
            boolean r10 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r0)
            com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel.wQ2(r5, r6, r7, r8, r9, r10)
        L50:
            X.0rG2 r4 = X.C1581520rG2.LJI
            com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel r0 = r11.L5()
            X.002o r0 = r0.getState()
            X.0r2H r0 = (X.C1572990r2H) r0
            boolean r0 = r0.LLILLL
            if (r0 == 0) goto L6c
            java.lang.String r2 = "personal_homepage"
        L62:
            long r0 = r12.LL
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.LJJIJL(r2, r0, r3, r13)
            return
        L6c:
            java.lang.String r2 = "others_homepage"
            goto L62
        L6f:
            r2 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.profile.view.SeriesProfileTabRowCell.N5(X.0r22, java.lang.String):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        super.onBindItemView(interfaceC1891350zJl, list);
    }
}
