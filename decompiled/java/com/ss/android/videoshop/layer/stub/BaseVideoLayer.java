package com.ss.android.videoshop.layer.stub;

import X.C12ES;
import X.C1473460oRk;
import X.C1474420oTI;
import X.C1A79;
import X.C1A7B;
import X.C1AME;
import X.C1AON;
import X.C1AOO;
import X.C1AOQ;
import X.C1AOR;
import X.C1AOT;
import X.C1AOU;
import X.C1AOW;
import X.C1AOX;
import X.C1AOY;
import X.C1AOZ;
import X.C2178581AOa;
import X.C2178631AOf;
import X.C2178641AOg;
import X.C2178651AOh;
import X.C786410Ut5;
import X.C790900V0u;
import X.EnumC2281151EQn;
import X.InterfaceC1471800oP4;
import X.InterfaceC1487060ong;
import X.InterfaceC2178591AOb;
import X.InterfaceC2178601AOc;
import X.InterfaceC2178671AOj;
import X.InterfaceC2178711AOn;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public abstract class BaseVideoLayer implements C1AOO, Comparable<BaseVideoLayer>, WeakHandler.IHandler {
    public boolean activated;
    public InterfaceC2178591AOb mLayerHost;
    public InterfaceC2178601AOc mLayerStateInquirer;
    public Map<ViewGroup, List<View>> lastAddedViews = new HashMap();
    public WeakHandler handler = new WeakHandler(this);

    public InterfaceC2178601AOc createLayerStateInquirer() {
        return null;
    }

    @Override // X.C1AOO
    public Set<Integer> getActivateEvents() {
        return null;
    }

    public abstract /* synthetic */ ArrayList<Integer> getSupportEvents();

    public abstract /* synthetic */ int getZIndex();

    @Override // X.C1AOO
    public boolean handleVideoEvent(C1AOU c1aou) {
        return false;
    }

    @Override // X.C1AOO
    public boolean isShowing() {
        return false;
    }

    @Override // X.C1AOO
    public void onActivate(List<Integer> list, InterfaceC1471800oP4 interfaceC1471800oP4) {
    }

    public List<Pair<View, RelativeLayout.LayoutParams>> onCreateView(Context context, LayoutInflater layoutInflater) {
        return null;
    }

    public Map<View, RelativeLayout.LayoutParams> onCreateView(Context context) {
        return null;
    }

    public InterfaceC1471800oP4 getVideoStateInquirer() {
        C2178641AOg c2178641AOg;
        InterfaceC2178591AOb interfaceC2178591AOb = this.mLayerHost;
        if (interfaceC2178591AOb == null || (c2178641AOg = ((C1AON) interfaceC2178591AOb).LJ) == null) {
            return null;
        }
        return c2178641AOg.getVideoStateInquirer();
    }

    @Override // X.C1AOO
    public boolean hasUI() {
        List<View> list = this.lastAddedViews.get(getLayerMainContainer());
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void removeAllView() {
        for (Map.Entry<ViewGroup, List<View>> entry : this.lastAddedViews.entrySet()) {
            if (entry.getValue() != null) {
                Iterator<View> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    C12ES.LIZIZ(it2.next());
                }
            }
        }
        this.lastAddedViews.clear();
    }

    public void addViews() {
        Context context = getContext();
        List<Pair<View, RelativeLayout.LayoutParams>> listOnCreateView = onCreateView(context, getInflater(context));
        if (listOnCreateView != null && !listOnCreateView.isEmpty()) {
            for (Pair<View, RelativeLayout.LayoutParams> pair : listOnCreateView) {
                if (pair != null) {
                    addView2Host((View) pair.first, getLayerMainContainer(), (ViewGroup.LayoutParams) pair.second);
                }
            }
            return;
        }
        Map<View, RelativeLayout.LayoutParams> mapOnCreateView = onCreateView(getContext());
        if (mapOnCreateView == null || mapOnCreateView.isEmpty()) {
            return;
        }
        for (Map.Entry entry : new HashMap(mapOnCreateView).entrySet()) {
            addView2Host((View) entry.getKey(), getLayerMainContainer(), (ViewGroup.LayoutParams) entry.getValue());
        }
    }

    public C1474420oTI getBindPlayEntity() {
        C2178641AOg c2178641AOg;
        InterfaceC2178591AOb host = getHost();
        if (host == null || (c2178641AOg = ((C1AON) host).LJ) == null) {
            return null;
        }
        return c2178641AOg.getBindPlayEntity();
    }

    public Context getContext() {
        C2178641AOg c2178641AOg;
        if (getHost() == null || (c2178641AOg = ((C1AON) getHost()).LJ) == null) {
            return null;
        }
        return c2178641AOg.getContext();
    }

    public Object getData() {
        getHost();
        return null;
    }

    public ViewGroup getLayerMainContainer() {
        C2178641AOg c2178641AOg;
        InterfaceC2178591AOb host = getHost();
        if (host == null || (c2178641AOg = ((C1AON) host).LJ) == null) {
            return null;
        }
        return c2178641AOg.getLayerMainContainer();
    }

    public ViewGroup getLayerRootContainer() {
        C2178641AOg c2178641AOg;
        InterfaceC2178591AOb host = getHost();
        if (host == null || (c2178641AOg = ((C1AON) host).LJ) == null) {
            return null;
        }
        return c2178641AOg.getLayerRootContainer();
    }

    public int getLayerType() {
        return getZIndex();
    }

    public Lifecycle getObservedLifecycle() {
        C2178641AOg c2178641AOg;
        InterfaceC2178591AOb host = getHost();
        if (host == null || (c2178641AOg = ((C1AON) host).LJ) == null) {
            return null;
        }
        return c2178641AOg.getObservedLifecycle();
    }

    public C1474420oTI getPlayEntity() {
        C2178641AOg c2178641AOg;
        InterfaceC2178591AOb host = getHost();
        if (host == null || (c2178641AOg = ((C1AON) host).LJ) == null) {
            return null;
        }
        return c2178641AOg.getPlayEntity();
    }

    public InterfaceC2178591AOb getHost() {
        return this.mLayerHost;
    }

    public WeakHandler getInternalHandler() {
        return this.handler;
    }

    public InterfaceC2178601AOc getLayerStateInquirer() {
        return this.mLayerStateInquirer;
    }

    @Override // X.C1AOO
    public boolean isActivated() {
        return this.activated;
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseVideoLayer baseVideoLayer) {
        if (baseVideoLayer == null || getZIndex() > baseVideoLayer.getZIndex()) {
            return 1;
        }
        if (getZIndex() < baseVideoLayer.getZIndex()) {
            return -1;
        }
        return 0;
    }

    public void execCommand(InterfaceC1487060ong interfaceC1487060ong) {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2;
        InterfaceC2178671AOj interfaceC2178671AOj;
        InterfaceC2178671AOj interfaceC2178671AOj2;
        InterfaceC2178591AOb interfaceC2178591AOb = this.mLayerHost;
        if (interfaceC2178591AOb != null && (c2178641AOg = ((C1AON) interfaceC2178591AOb).LJ) != null && interfaceC1487060ong != null) {
            VideoContext videoContext = c2178641AOg.LLLFFI;
            boolean zEquals = false;
            if (videoContext != null && videoContext.LJJJJZ(c2178641AOg.LLILZLL) && c2178641AOg.LLLFFI.LJJJJI(c2178641AOg.getVideoStateInquirer(), c2178641AOg.LLILZLL, interfaceC1487060ong)) {
                return;
            }
            int i = ((C1AOR) interfaceC1487060ong).LIZ;
            if (i != 209) {
                if (i == 208) {
                    VideoContext videoContext2 = c2178641AOg.LLLFFI;
                    if (videoContext2 == null) {
                        return;
                    }
                    videoContext2.pause();
                    return;
                }
                if (i != 207 && i != 214) {
                    if (i != 103 && i != 102) {
                        if (i == 104) {
                            VideoContext videoContext3 = c2178641AOg.LLLFFI;
                            if (videoContext3 == null) {
                                return;
                            }
                            if (videoContext3.LJJJJLI() != null && (!TextUtils.isEmpty(null))) {
                                return;
                            }
                            videoContext3.LL.LJ(false, false);
                            return;
                        }
                        if (i != 213) {
                            if (i == 211) {
                                if (interfaceC1487060ong instanceof C1AOQ) {
                                    zEquals = "".equals(((C1AOQ) interfaceC1487060ong).LIZIZ);
                                }
                                if (TextUtils.isEmpty(null)) {
                                    return;
                                }
                                EnumC2281151EQn enumC2281151EQnLIZ = C1473460oRk.LIZ(null);
                                InterfaceC2178671AOj interfaceC2178671AOj3 = c2178641AOg.LLJI;
                                if (interfaceC2178671AOj3 == null) {
                                    return;
                                }
                                interfaceC2178671AOj3.LJJIII(enumC2281151EQnLIZ, zEquals);
                                return;
                            }
                            if (i == 217 || i == 216 || i == 218) {
                                return;
                            }
                            if (i == 219) {
                                if (!(interfaceC1487060ong instanceof C1AOT) || (interfaceC2178671AOj2 = c2178641AOg.LLJI) == null) {
                                    return;
                                }
                                interfaceC2178671AOj2.LJJLIIIJJI();
                                return;
                            }
                            if (i == 220 || i == 221) {
                                return;
                            }
                            if (i == 222) {
                                if (!(interfaceC1487060ong instanceof C1AOX) || TextUtils.isEmpty(null) || (interfaceC2178671AOj = c2178641AOg.LLJI) == null) {
                                    return;
                                }
                                interfaceC2178671AOj.LJJI("byUser".equals(null));
                                return;
                            }
                            if (i == 223) {
                                return;
                            }
                            if (i == 400) {
                                if (!(interfaceC1487060ong instanceof C1AOW)) {
                                    return;
                                }
                                InterfaceC2178711AOn interfaceC2178711AOn = c2178641AOg.LLILLJJLI;
                                if (interfaceC2178711AOn != null) {
                                    Object videoView = interfaceC2178711AOn.getVideoView();
                                    if (videoView instanceof C1A7B) {
                                        ViewGroup.LayoutParams layoutParams = c2178641AOg.LLILLJJLI.getLayoutParams();
                                        if (layoutParams instanceof FrameLayout.LayoutParams) {
                                            C2178631AOf.LJJLIIIJLLLLLLLZ((FrameLayout.LayoutParams) layoutParams);
                                        }
                                    } else if (videoView instanceof C1A79) {
                                        ViewGroup.LayoutParams layoutParams2 = ((View) videoView).getLayoutParams();
                                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                                            C2178631AOf.LJJLIIIJLLLLLLLZ((FrameLayout.LayoutParams) layoutParams2);
                                        }
                                    }
                                }
                                c2178641AOg.LLJLL.LIZ(new C790900V0u() { // from class: X.1AOV
                                });
                                return;
                            }
                            if (i == 401) {
                                TTVideoEngine videoEngine = c2178641AOg.getVideoEngine();
                                if ((interfaceC1487060ong instanceof C2178581AOa) && videoEngine == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            if (i == 402) {
                                TTVideoEngine videoEngine2 = c2178641AOg.getVideoEngine();
                                if ((interfaceC1487060ong instanceof C1AOY) && videoEngine2 == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            if (i != 403) {
                                return;
                            }
                            TTVideoEngine videoEngine3 = c2178641AOg.getVideoEngine();
                            if ((interfaceC1487060ong instanceof C1AOZ) && videoEngine3 == null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        throw null;
                    }
                    VideoContext videoContext4 = c2178641AOg.LLLFFI;
                    if (videoContext4 == null) {
                        return;
                    }
                    if (videoContext4.LJJJJLI() != null && (!TextUtils.isEmpty(null))) {
                        return;
                    }
                    C2178651AOh c2178651AOh = videoContext4.LL;
                    if (c2178651AOh.LLILZLL != 0) {
                        return;
                    }
                    c2178651AOh.LLJJJ.LJJJJJ(new ARunnableS128S0100000_28(c2178651AOh, 61));
                    return;
                }
                C1AME parentView = c2178641AOg.getParentView();
                if (parentView != null) {
                    parentView.LJI();
                    return;
                }
                VideoContext videoContext5 = c2178641AOg.LLLFFI;
                if (videoContext5 == null || (c2178641AOg2 = videoContext5.LLILLL) == null) {
                    return;
                }
                c2178641AOg2.LJJLIIIJJI();
                return;
            }
            throw null;
        }
    }

    public <T> T getData(Class<T> cls) {
        if (getHost() != null && cls != null) {
            cls.isInstance(null);
        }
        return null;
    }

    @Override // X.C1AOO
    public View getFirstAddedViewForGroup(ViewGroup viewGroup) {
        List<View> list = this.lastAddedViews.get(viewGroup);
        if (list != null && !list.isEmpty()) {
            return (View) ListProtector.get(list, list.size() - 1);
        }
        return null;
    }

    public LayoutInflater getInflater(Context context) {
        if (context == null) {
            return null;
        }
        return C786410Ut5.ne(context);
    }

    @Override // X.C1AOO
    public View getLastAddedViewForGroup(ViewGroup viewGroup) {
        List<View> list = this.lastAddedViews.get(viewGroup);
        if (list != null && !list.isEmpty()) {
            return (View) ListProtector.get(list, 0);
        }
        return null;
    }

    public <T extends InterfaceC2178601AOc> T getLayerStateInquirer(Class<T> cls) {
        InterfaceC2178591AOb interfaceC2178591AOb = this.mLayerHost;
        if (interfaceC2178591AOb != null) {
            C1AON c1aon = (C1AON) interfaceC2178591AOb;
            if (cls == null) {
                c1aon.getClass();
            } else {
                if (((HashMap) c1aon.LJFF).containsKey(cls)) {
                    return (T) ((HashMap) c1aon.LJFF).get(cls);
                }
                for (T t : ((HashMap) c1aon.LJFF).values()) {
                    if (cls.isInstance(t)) {
                        return t;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i == 100) {
            this.handler.removeMessages(100);
            removeAllView();
        } else {
            if (i != 101 || !(HandlerHook.getMessageObj(message.obj) instanceof View)) {
                return;
            }
            C12ES.LIZIZ((View) HandlerHook.getMessageObj(message.obj));
        }
    }

    public boolean isLayerShowing(List<Integer> list) {
        C1AOO c1aoo;
        if (list != null && this.mLayerHost != null) {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                SparseArray<C1AOO> sparseArray = ((C1AON) this.mLayerHost).LIZJ;
                if (sparseArray != null && (c1aoo = sparseArray.get(iIntValue)) != null && c1aoo.isShowing()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean notifyEvent(C1AOU c1aou) {
        InterfaceC2178591AOb interfaceC2178591AOb = this.mLayerHost;
        if (interfaceC2178591AOb != null && ((C1AON) interfaceC2178591AOb).LIZ(c1aou)) {
            return true;
        }
        return false;
    }

    public void onRegister(InterfaceC2178591AOb interfaceC2178591AOb) {
        setHost(interfaceC2178591AOb);
        addViews();
        this.mLayerStateInquirer = createLayerStateInquirer();
    }

    public void onUnregister(InterfaceC2178591AOb interfaceC2178591AOb) {
        removeAllView();
    }

    public void removeViewFromHost(View view) {
        ViewParent parent;
        List<View> list;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (list = this.lastAddedViews.get(parent)) != null) {
            list.remove(view);
            if (list.isEmpty()) {
                this.lastAddedViews.remove(parent);
            }
        }
        C12ES.LIZIZ(view);
    }

    @Override // X.C1AOO
    public void setActivated(boolean z) {
        this.activated = z;
    }

    public void setHost(InterfaceC2178591AOb interfaceC2178591AOb) {
        this.mLayerHost = interfaceC2178591AOb;
    }

    public boolean isLayerShowing(int... iArr) {
        C1AOO c1aoo;
        if (iArr != null && this.mLayerHost != null) {
            for (int i : iArr) {
                SparseArray<C1AOO> sparseArray = ((C1AON) this.mLayerHost).LIZJ;
                if (sparseArray != null && (c1aoo = sparseArray.get(i)) != null && c1aoo.isShowing()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int findPositionForChild(View view, ViewGroup viewGroup) {
        if (view != null && viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (view == viewGroup.getChildAt(i)) {
                    return i;
                }
            }
        }
        return -2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r1 < 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        if (r1 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
    
        r1 = r7.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addView2Host(android.view.View r6, android.view.ViewGroup r7, android.view.ViewGroup.LayoutParams r8) {
        /*
            r5 = this;
            if (r6 == 0) goto Lc6
            if (r7 == 0) goto Lc6
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto Lc6
            X.1AOb r0 = r5.getHost()
            if (r0 == 0) goto Lc6
            android.view.View r0 = r5.getLastAddedViewForGroup(r7)
            int r0 = r5.findPositionForChild(r0, r7)
            int r1 = r0 + 1
            r3 = 0
            if (r1 >= 0) goto L62
            X.1AOb r4 = r5.getHost()
            X.1AON r4 = (X.C1AON) r4
            r4.getClass()
            java.util.TreeSet<X.1AOO> r0 = r4.LIZLLL
            if (r0 == 0) goto Lc6
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto Lc6
            java.util.TreeSet<X.1AOO> r0 = r4.LIZLLL
            java.lang.Object r1 = r0.lower(r5)
            X.1AOO r1 = (X.C1AOO) r1
        L38:
            if (r1 == 0) goto L8f
            boolean r0 = r1.hasUI()
            if (r0 != 0) goto L49
            java.util.TreeSet<X.1AOO> r0 = r4.LIZLLL
            java.lang.Object r1 = r0.lower(r1)
            X.1AOO r1 = (X.C1AOO) r1
            goto L38
        L49:
            android.view.View r2 = r1.getLastAddedViewForGroup(r7)
            if (r2 == 0) goto L8f
            r1 = 0
        L50:
            int r0 = r7.getChildCount()
            if (r1 >= r0) goto L8f
            android.view.View r0 = r7.getChildAt(r1)
            if (r2 != r0) goto L8c
            if (r1 < 0) goto L8f
            int r1 = r1 + 1
        L60:
            if (r1 < 0) goto Lc6
        L62:
            if (r8 == 0) goto L88
            r7.addView(r6, r1, r8)
        L67:
            java.util.Map<android.view.ViewGroup, java.util.List<android.view.View>> r0 = r5.lastAddedViews
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L82
            java.util.Map<android.view.ViewGroup, java.util.List<android.view.View>> r0 = r5.lastAddedViews
            java.lang.Object r1 = r0.get(r7)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lc6
        L79:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, r3, r6)
            java.util.Map<android.view.ViewGroup, java.util.List<android.view.View>> r0 = r5.lastAddedViews
            r0.put(r7, r1)
            return
        L82:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L79
        L88:
            r7.addView(r6, r1)
            goto L67
        L8c:
            int r1 = r1 + 1
            goto L50
        L8f:
            java.util.TreeSet<X.1AOO> r0 = r4.LIZLLL
            java.lang.Object r1 = r0.higher(r5)
            X.1AOO r1 = (X.C1AOO) r1
        L97:
            if (r1 == 0) goto Lc1
            boolean r0 = r1.hasUI()
            if (r0 != 0) goto La8
            java.util.TreeSet<X.1AOO> r0 = r4.LIZLLL
            java.lang.Object r1 = r0.higher(r1)
            X.1AOO r1 = (X.C1AOO) r1
            goto L97
        La8:
            android.view.View r2 = r1.getFirstAddedViewForGroup(r7)
            if (r2 == 0) goto Lc1
            r1 = 0
        Laf:
            int r0 = r7.getChildCount()
            if (r1 >= r0) goto Lc1
            android.view.View r0 = r7.getChildAt(r1)
            if (r2 != r0) goto Lbe
            if (r1 < 0) goto Lc1
            goto L62
        Lbe:
            int r1 = r1 + 1
            goto Laf
        Lc1:
            int r1 = r7.getChildCount()
            goto L60
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.layer.stub.BaseVideoLayer.addView2Host(android.view.View, android.view.ViewGroup, android.view.ViewGroup$LayoutParams):void");
    }
}
