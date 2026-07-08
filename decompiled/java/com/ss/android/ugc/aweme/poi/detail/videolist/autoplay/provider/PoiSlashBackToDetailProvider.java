package com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider;

import X.AbstractC1203660hQa;
import X.C14EU;
import X.C1558520qew;
import X.C588480N6g;
import X.C588500N6i;
import X.C622680Oba;
import X.C737030Svd;
import X.InterfaceC1203630hQX;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSlashBackToDetailProvider extends AbstractC1203660hQa {
    public final Lifecycle LIZIZ;
    public final InterfaceC665370Q7z LIZJ;
    public final ViewOnAttachStateChangeListenerC20604515jv LIZLLL;

    @Override // X.InterfaceC1193590hAL
    public final void init() {
        C622680Oba.LIZJ(this);
        Lifecycle lifecycle = this.LIZIZ;
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashBackToDetailProvider.init.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C622680Oba.LIZLLL(PoiSlashBackToDetailProvider.this);
                    }
                }
            });
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        String aid;
        Object objFindViewHolderForAdapterPosition;
        InterfaceC1203630hQX interfaceC1203630hQX;
        if (c737030Svd.LIZ == 66) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZLLL;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                } else {
                    layoutManager = null;
                }
                if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    ArrayList arrayList = new ArrayList();
                    if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                        while (true) {
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LIZLLL;
                            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                                objFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jv2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            } else {
                                objFindViewHolderForAdapterPosition = null;
                            }
                            if ((objFindViewHolderForAdapterPosition instanceof InterfaceC1203630hQX) && (interfaceC1203630hQX = (InterfaceC1203630hQX) objFindViewHolderForAdapterPosition) != null && interfaceC1203630hQX.t()) {
                                arrayList.add(interfaceC1203630hQX);
                            }
                            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                                break;
                            } else {
                                iFindFirstVisibleItemPosition++;
                            }
                        }
                    }
                    for (Object obj2 : arrayList) {
                        Aweme awemeLJIIIIZZ = ((InterfaceC1203630hQX) obj2).LJIIIIZZ();
                        if (awemeLJIIIIZZ != null) {
                            aid = awemeLJIIIIZZ.getAid();
                        } else {
                            aid = null;
                        }
                        if (Intrinsics.LJFF(aid, aweme.getAid())) {
                            if (obj2 != null) {
                                LIZIZ(Collections.singletonList(obj2));
                                C588500N6i c588500N6i = new C588500N6i(Collections.singletonList(obj2), null);
                                C588480N6g c588480N6g = this.LIZ;
                                if (c588480N6g != null) {
                                    c588480N6g.LIZ(c588500N6i);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public PoiSlashBackToDetailProvider(Lifecycle lifecycle, InterfaceC665370Q7z interfaceC665370Q7z) {
        IPoiPostsAutoPlayAbility iPoiPostsAutoPlayAbility;
        this.LIZIZ = lifecycle;
        this.LIZJ = interfaceC665370Q7z;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHx1 = null;
        if (interfaceC665370Q7z != null && (iPoiPostsAutoPlayAbility = (IPoiPostsAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiPostsAutoPlayAbility.class, null)) != null) {
            viewOnAttachStateChangeListenerC20604515jvHx1 = iPoiPostsAutoPlayAbility.Hx1();
        }
        this.LIZLLL = viewOnAttachStateChangeListenerC20604515jvHx1;
    }
}
