package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.C0H9H;
import X.C13LP;
import X.C1744320vUc;
import X.C1C7U;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.InterfaceC1744490vUt;
import X.InterfaceC1744500vUu;
import X.InterfaceC747600TUg;
import Y.ARunnableS37S0101000_26;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SearchHelper<T> implements InterfaceC747600TUg {
    public final Context LIZ;
    public final View LIZIZ;
    public final InterfaceC1744500vUu LIZJ;
    public Boolean LIZLLL;
    public boolean LJ = true;
    public final View LJFF;
    public RecyclerView LJI;
    public PopupWindow LJII;
    public SearchResultAdapter LJIIIIZZ;
    public WeakReference<InterfaceC1744490vUt<T>> LJIIIZ;
    public List<C1744320vUc<T>> LJIIJ;
    public boolean LJIIJJI;
    public final SearchHelper$handler$1 LJIIL;

    public final void LIZIZ() {
        removeMessages(2);
        removeMessages(3);
        sendEmptyMessage(2);
    }

    @Override // X.InterfaceC747600TUg
    public final void LIZ(int i) {
        InterfaceC1744490vUt<T> interfaceC1744490vUt;
        List<C1744320vUc<T>> list = this.LJIIJ;
        if (list != null) {
            C1744320vUc<T> c1744320vUc = (C1744320vUc) C13LP.LJJJLZIJ(i, list);
            int size = 0;
            if (c1744320vUc != null && c1744320vUc.LJ) {
                LIZIZ();
                WeakReference<InterfaceC1744490vUt<T>> weakReference = this.LJIIIZ;
                if (weakReference != null && (interfaceC1744490vUt = weakReference.get()) != null) {
                    List<C1744320vUc<T>> list2 = this.LJIIJ;
                    if (list2 != null) {
                        size = list2.size();
                    }
                    interfaceC1744490vUt.EC(c1744320vUc, size, i + 1);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchHelper$handler$1] */
    public SearchHelper(Context context, View view, InterfaceC1744500vUu interfaceC1744500vUu) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = interfaceC1744500vUu;
        this.LJFF = C954703oH.LIZ(context, R.layout.ay7, null, false);
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIL = new BPEAHandler(this, mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchHelper$handler$1
            public final /* synthetic */ SearchHelper<T> LL;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                PopupWindow popupWindow;
                View contentView;
                SearchHelper<T> searchHelper;
                PopupWindow popupWindow2;
                int i;
                C1C7U.LIZ("SearchHelper@1c1d.handler$1");
                int i2 = message.what;
                if (i2 != 1) {
                    int height = 0;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            SearchHelper<T> searchHelper2 = this.LL;
                            List<C1744320vUc<T>> list = searchHelper2.LJIIJ;
                            searchHelper2.getClass();
                            ArrayList arrayList = new ArrayList();
                            if (list != 0) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C1744320vUc c1744320vUc = (C1744320vUc) it2.next();
                                    arrayList.add(new SearchResultAdapter.SearchResultItemVO(c1744320vUc.LIZLLL, c1744320vUc.LIZIZ, c1744320vUc.LIZJ, c1744320vUc.LJFF, null, null));
                                }
                            }
                            if (arrayList.isEmpty()) {
                                this.LL.LIZIZ();
                            } else {
                                View viewFindViewById = this.LL.LJFF.findViewById(R.id.ue1);
                                if (viewFindViewById != null) {
                                    if (this.LL.LJIIJJI) {
                                        i = 0;
                                    } else {
                                        i = 8;
                                    }
                                    C786410Ut5.LJLLLLLL(i, viewFindViewById);
                                }
                                SearchResultAdapter searchResultAdapter = this.LL.LJIIIIZZ;
                                if (searchResultAdapter != null) {
                                    searchResultAdapter.LLILLJJLI = arrayList;
                                    searchResultAdapter.notifyDataSetChanged();
                                }
                                PopupWindow popupWindow3 = this.LL.LJII;
                                if (popupWindow3 != null && !popupWindow3.isShowing() && (popupWindow2 = (searchHelper = this.LL).LJII) != null) {
                                    C786410Ut5.i3(popupWindow2, searchHelper.LIZIZ, 0, 0);
                                }
                                SearchHelper<T> searchHelper3 = this.LL;
                                if (searchHelper3.LJ) {
                                    HandlerHook.viewPost(searchHelper3.LJFF, new ARunnableS37S0101000_26(searchHelper3, searchHelper3.LIZIZ.getWidth(), 0));
                                } else {
                                    PopupWindow popupWindow4 = searchHelper3.LJII;
                                    if (popupWindow4 != null) {
                                        int width = searchHelper3.LIZIZ.getWidth();
                                        PopupWindow popupWindow5 = this.LL.LJII;
                                        if (popupWindow5 != null) {
                                            height = popupWindow5.getHeight();
                                        }
                                        popupWindow4.update(width, height);
                                    }
                                }
                                PopupWindow popupWindow6 = this.LL.LJII;
                                if (popupWindow6 != null) {
                                    contentView = popupWindow6.getContentView();
                                } else {
                                    contentView = null;
                                }
                                C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), contentView);
                            }
                        }
                    } else {
                        PopupWindow popupWindow7 = this.LL.LJII;
                        if (popupWindow7 != null && popupWindow7.isShowing() && (popupWindow = this.LL.LJII) != null) {
                            popupWindow.dismiss();
                        }
                    }
                } else {
                    this.LL.LIZJ.LIZ();
                }
                C1C7U.LIZIZ("SearchHelper@1c1d.handler$1");
            }

            {
                this.LL = this;
            }
        };
    }
}
