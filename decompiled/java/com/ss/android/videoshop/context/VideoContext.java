package com.ss.android.videoshop.context;

import X.C12ES;
import X.C1467470oI5;
import X.C1474420oTI;
import X.C1474460oTM;
import X.C1474510oTR;
import X.C1486280omQ;
import X.C1554570qYZ;
import X.C19353610ne;
import X.C1A79;
import X.C1AMD;
import X.C1AME;
import X.C1AMG;
import X.C1AOU;
import X.C1AP8;
import X.C20098213kS;
import X.C2178631AOf;
import X.C2178641AOg;
import X.C2178651AOh;
import X.C2178661AOi;
import X.C2178681AOk;
import X.C2178721AOo;
import X.C2178731AOp;
import X.C2178751AOr;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C789950Uyn;
import X.C790900V0u;
import X.C807710VmL;
import X.EnumC2281151EQn;
import X.EnumC807700VmK;
import X.InterfaceC1471800oP4;
import X.InterfaceC1474240oT0;
import X.InterfaceC1474380oTE;
import X.InterfaceC1474410oTH;
import X.InterfaceC1487050onf;
import X.InterfaceC1487060ong;
import X.InterfaceC2178671AOj;
import X.InterfaceC2178711AOn;
import X.InterfaceC2178741AOq;
import X.InterfaceC2178771AOt;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS123S0100000_23;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.videoshop.context.VideoContext;
import fyo.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public class VideoContext extends C2178681AOk implements WeakHandler.IHandler, KeyEvent.Callback, InterfaceC1474410oTH, GenericLifecycleObserver {
    public final C2178651AOh LL;
    public final Context LLILLJJLI;
    public C2178641AOg LLILLL;
    public C1AME LLILZ;
    public FrameLayout LLILZIL;
    public ViewGroup LLILZLL;
    public C2178661AOi LLIZ;
    public final List<C2178641AOg> LLIZLLLIL;
    public final Map<Lifecycle, LifeCycleObserver> LLJ;
    public final List<InterfaceC1487050onf> LLJI;
    public C19353610ne LLJIJIL;
    public C789950Uyn LLJILJIL;
    public int LLJILLL;
    public int LLJJ;
    public C1AMG LLJJI;
    public C20098213kS LLJJIII;
    public Window.Callback LLJJIJI;
    public final TreeSet<Integer> LLJJIJIL;
    public final WeakHandler LLJILJILJ = new WeakHandler(this);
    public boolean LLJJIJIIJIL = false;
    public final C1474510oTR LLJJJ = new C1474510oTR();
    public final Set<Integer> LLJJJIL = new TreeSet();
    public final KeyEvent.DispatcherState LLJJJJ = new KeyEvent.DispatcherState();

    @Override // X.C2178681AOk, X.InterfaceC2178771AOt
    public final void LJJII(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // X.C2178681AOk, X.InterfaceC2178771AOt
    public final void LJJIIJZLJL(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, InterfaceC1474410oTH interfaceC1474410oTH, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onLifeCycleOnCreate(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onLifeCycleOnStart(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onLifeCycleOnResume(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onLifeCycleOnPause(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_STOP) {
            onLifeCycleOnStop(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onLifeCycleOnDestroy(lifecycleOwner);
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public final void LJIIIZ() {
        ViewGroup viewGroup;
        View childAt;
        Activity activityLIZ = C1474460oTM.LIZ(this.LLILLJJLI);
        if (activityLIZ == null || (viewGroup = (ViewGroup) activityLIZ.findViewById(R.id.content)) == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(i);
            if (childAt != null && com.zhiliaoapp.musically.R.id.videoshop_helper_view == childAt.getId() && (childAt instanceof C2178661AOi)) {
                break;
            } else {
                i++;
            }
        }
        if (childAt == null) {
            C2178661AOi c2178661AOi = this.LLIZ;
            if (c2178661AOi == null) {
                C2178661AOi c2178661AOi2 = new C2178661AOi(this.LLILLJJLI);
                this.LLIZ = c2178661AOi2;
                c2178661AOi2.setVideoContext(this);
                this.LLIZ.setId(com.zhiliaoapp.musically.R.id.videoshop_helper_view);
            } else {
                C1486280omQ.LIZ(c2178661AOi);
            }
            viewGroup.addView(this.LLIZ, new ViewGroup.LayoutParams(1, 1));
            return;
        }
        if (childAt instanceof C2178661AOi) {
            this.LLIZ = (C2178661AOi) childAt;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find helpview is illegal type: ");
        sbLIZ.append(childAt.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        C1486280omQ.LIZ(this.LLIZ);
        C1486280omQ.LIZ(childAt);
        C2178661AOi c2178661AOi3 = new C2178661AOi(this.LLILLJJLI);
        this.LLIZ = c2178661AOi3;
        c2178661AOi3.setVideoContext(this);
        this.LLIZ.setId(com.zhiliaoapp.musically.R.id.videoshop_helper_view);
        viewGroup.addView(this.LLIZ, new ViewGroup.LayoutParams(1, 1));
    }

    public final void LJJJ() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg == null || !c2178641AOg.LJJL()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss surface capture view. post = ");
        sbLIZ.append(true);
        C2188811AlT.LIZIZ(sbLIZ);
        HandlerHook.viewPostDelay(this.LLILLL, new ARunnableS113S0100000_13(this, 135), 50);
    }

    public final Lifecycle LJJJJJL() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg.getObservedLifecycle();
        }
        return null;
    }

    public final C1474420oTI LJJJJLI() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg.getPlayEntity();
        }
        return null;
    }

    public final boolean LJJJLIIL() {
        return this.LL.LLILZLL == 2;
    }

    public final boolean LJJJLZIJ() {
        C2178641AOg c2178641AOg = this.LLILLL;
        return c2178641AOg == null || c2178641AOg.LJJJZ();
    }

    public final boolean LJJJZ() {
        List<C2178631AOf> list;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg == null || (list = c2178641AOg.LLLF) == null) {
            return false;
        }
        Iterator<C2178631AOf> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJJLZIJ()) {
                return true;
            }
        }
        return false;
    }

    public final void LJJLIIIJJI() {
        C1474510oTR c1474510oTR = this.LLJJJ;
        c1474510oTR.getClass();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseAllPreparedVideoControllers context:");
            sbLIZ.append(c1474510oTR.LIZLLL.LLILLJJLI.getClass().getSimpleName());
            sbLIZ.append(" size:");
            sbLIZ.append(((LinkedList) c1474510oTR.LIZJ).size());
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((LinkedList) c1474510oTR.LIZJ).clear();
        Iterator it2 = ((HashMap) c1474510oTR.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            C1A79 c1a79 = (C1A79) ((Map.Entry) it2.next()).getValue();
            if (c1a79 != null) {
                c1a79.setSurfaceTextureListener(null);
            }
            C12ES.LIZIZ(c1a79);
        }
        ((HashMap) c1474510oTR.LIZIZ).clear();
        Iterator it3 = ((HashMap) c1474510oTR.LIZ).entrySet().iterator();
        while (it3.hasNext()) {
            ((InterfaceC2178671AOj) ((Map.Entry) it3.next()).getValue()).release();
        }
        ((HashMap) c1474510oTR.LIZ).clear();
    }

    public final void LJJLIIIJLJLI() {
        C2178721AOo c2178721AOo;
        C2178651AOh c2178651AOh = this.LL;
        c2178651AOh.LLILZ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRotateEnabled enabled:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        WeakHandler weakHandler = c2178651AOh.LLILLJJLI;
        if (weakHandler != null) {
            weakHandler.removeMessages(1);
        }
        C2178731AOp c2178731AOp = c2178651AOh.LL;
        if (c2178731AOp.LIZLLL && (c2178721AOo = c2178731AOp.LIZIZ) != null) {
            c2178721AOo.disable();
            c2178731AOp.LIZLLL = false;
        }
        c2178651AOh.LL.LIZ.LJ(c2178651AOh);
    }

    public final void LJJLIIJ() {
        C19353610ne c19353610ne = this.LLJIJIL;
        if (c19353610ne == null || c19353610ne.LLILLL.get() == null) {
            return;
        }
        try {
            c19353610ne.LLILLJJLI.abandonAudioFocus(c19353610ne);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c19353610ne.LLILZ = true;
        c19353610ne.LL.removeCallbacksAndMessages(null);
    }

    public final boolean isPaused() {
        InterfaceC2178671AOj interfaceC2178671AOj;
        C2178641AOg c2178641AOg = this.LLILLL;
        return (c2178641AOg == null || (interfaceC2178671AOj = c2178641AOg.LLJI) == null || !interfaceC2178671AOj.isPaused()) ? false : true;
    }

    public final void pause() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.LJJLIIIJILLIZJL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoContext(final Context context) {
        this.LLILLJJLI = context;
        C2178651AOh c2178651AOh = new C2178651AOh(context);
        this.LL = c2178651AOh;
        c2178651AOh.LLJJIJI = 400;
        c2178651AOh.LLIZLLLIL = this;
        c2178651AOh.LLJJJ = this;
        this.LLJ = new ConcurrentHashMap();
        this.LLJI = new CopyOnWriteArrayList();
        if (this.LLJJ <= 0 || this.LLJILLL <= 0) {
            this.LLJILLL = C1486280omQ.LIZLLL(context);
            this.LLJJ = C1486280omQ.LIZJ(context);
        }
        try {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        } catch (Exception th) {
        }
        this.LLJJIJIL = new TreeSet<>();
        this.LLIZLLLIL = new ArrayList();
        this.LLJJJ.LIZLLL = this;
        if (C1554570qYZ.LIZIZ == null) {
            synchronized (C1554570qYZ.class) {
                try {
                    if (C1554570qYZ.LIZIZ == null) {
                        C1554570qYZ.LIZIZ = new C1554570qYZ();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        new Object(context, this) { // from class: X.1AOs
            public final VideoContext LIZ;
            public final List<Object> LIZIZ = new ArrayList();

            {
                this.LIZ = this;
            }
        };
    }

    public static void LJIIJJI(C2178641AOg c2178641AOg) {
        if (c2178641AOg != null && c2178641AOg.LJJL() && c2178641AOg.LLJI != null && c2178641AOg.getSurface() != null && c2178641AOg.getSurface().isValid()) {
            c2178641AOg.LLJI.LJJJJIZL();
        }
    }

    public static void LJJIJIIJI(C2178641AOg c2178641AOg) {
        if (c2178641AOg != null && c2178641AOg.getParent() != null) {
            ViewParent parent = c2178641AOg.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            try {
                C786410Ut5.LJJJLZIJ(c2178641AOg, (ViewGroup) parent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(C786410Ut5.u3())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("class:");
                        sbLIZ.append(stackTraceElement.getClassName());
                        sbLIZ.append(", method:");
                        sbLIZ.append(stackTraceElement.getMethodName());
                        sbLIZ.append(", file:");
                        sbLIZ.append(stackTraceElement.getFileName());
                        sbLIZ.append(", lineNum:");
                        sbLIZ.append(stackTraceElement.getLineNumber());
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    public static VideoContext LJJJJLL(Context context) {
        return EnumC807700VmK.KEEPER.getVideoContext(context);
    }

    public final void LJJJJJ(Runnable runnable) {
        int width;
        int height;
        Pair pair;
        int i;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            if (!c2178641AOg.LLLFFI.LJJJLZIJ() && c2178641AOg.LJJL()) {
                C1AP8 c1ap8 = new C1AP8(runnable);
                if (Build.VERSION.SDK_INT >= 24) {
                    if (c2178641AOg.LLILLL.getSurface() != null && c2178641AOg.LLILLL.getSurface().isValid()) {
                        InterfaceC2178741AOq interfaceC2178741AOq = c2178641AOg.LLILLL;
                        if (interfaceC2178741AOq == null) {
                            width = 0;
                        } else {
                            width = interfaceC2178741AOq.getWidth();
                        }
                        InterfaceC2178741AOq interfaceC2178741AOq2 = c2178641AOg.LLILLL;
                        if (interfaceC2178741AOq2 == null) {
                            height = 0;
                        } else {
                            height = interfaceC2178741AOq2.getHeight();
                        }
                        if (width != 0 && height != 0) {
                            int i2 = 960;
                            if (width > height) {
                                i = 960;
                            } else {
                                i = 540;
                            }
                            if (width > height) {
                                i2 = 540;
                            }
                            while (width > i) {
                                width >>= 1;
                                height >>= 1;
                            }
                            while (height > i2) {
                                width >>= 1;
                                height >>= 1;
                            }
                            pair = new Pair(Integer.valueOf(width), Integer.valueOf(height));
                        } else {
                            pair = new Pair(0, 0);
                        }
                        if (((Integer) pair.first).intValue() != 0 && ((Integer) pair.second).intValue() != 0) {
                            c1ap8.LIZ.run();
                            return;
                        } else {
                            c1ap8.LIZ.run();
                            return;
                        }
                    }
                    runnable.run();
                    return;
                }
                InterfaceC2178711AOn interfaceC2178711AOn = c2178641AOg.LLILLJJLI;
                c2178641AOg.LLJI.LJIILLIIL();
                interfaceC2178711AOn.LIZIZ(null);
                runnable.run();
                return;
            }
            runnable.run();
            return;
        }
        runnable.run();
    }

    public final boolean LJJJJZ(C1474420oTI c1474420oTI) {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null && c1474420oTI != null && c1474420oTI.equals(c2178641AOg.getPlayEntity())) {
            return true;
        }
        return false;
    }

    public final boolean LJJJJZI(View view) {
        if (view != null && this.LLILZ == view) {
            return true;
        }
        return false;
    }

    public final void LJJL(C790900V0u c790900V0u) {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null && !c2178641AOg.LJJJZ() && this.LLILLL.getObservedLifecycle() == null) {
            this.LLILLL.LJJLJ(c790900V0u);
        }
    }

    public final boolean LJJLI(C1AOU c1aou) {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null && !c2178641AOg.LJJJZ()) {
            return this.LLILLL.LJJLJ(c1aou);
        }
        return false;
    }

    public final void LJJLIIIJL(C2178641AOg c2178641AOg) {
        int iHashCode;
        String str;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null && c2178641AOg2.LJJL()) {
            this.LLILLL.LJJJJLL();
        }
        this.LLILLL = c2178641AOg;
        ((ArrayList) this.LLIZLLLIL).remove(c2178641AOg);
        if (c2178641AOg != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setLayerHostMediaLayout parent hash:");
            if (c2178641AOg.getParent() != null) {
                iHashCode = c2178641AOg.getParent().hashCode();
            } else {
                iHashCode = -1;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(" entity vid:");
            if (c2178641AOg.getPlayEntity() != null) {
                str = c2178641AOg.getPlayEntity().LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLILZ == null && c2178641AOg != null) {
            this.LLILZ = c2178641AOg.getParentView();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setLayerHostMediaLayout set simpleMediaView:");
            sbLIZ2.append(this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(C1AME c1ame) {
        Integer numValueOf;
        this.LLILZ = c1ame;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSimpleMediaView hash:");
        if (c1ame != null) {
            numValueOf = Integer.valueOf(c1ame.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i == 100) {
            C1AME c1ame = (C1AME) HandlerHook.getMessageObj(message.obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MSG_DISPATCH_DETACH simpleMediaView:");
            sbLIZ.append(c1ame.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            C1AMD attachListener = c1ame.getAttachListener();
            if (attachListener != null) {
                attachListener.LIZJ(c1ame);
                return;
            }
            return;
        }
        if (i == 101) {
            C1AME c1ame2 = (C1AME) HandlerHook.getMessageObj(message.obj);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MSG_DISPATCH_ATTACH simpleMediaView:");
            sbLIZ2.append(c1ame2.hashCode());
            C2188811AlT.LIZIZ(sbLIZ2);
            C1AMD attachListener2 = c1ame2.getAttachListener();
            if (attachListener2 == null) {
                return;
            }
            attachListener2.LIZIZ(c1ame2);
            return;
        }
        if (i != 102) {
            return;
        }
        C1AME c1ame3 = (C1AME) HandlerHook.getMessageObj(message.obj);
        C1474510oTR c1474510oTR = this.LLJJJ;
        C1474420oTI playEntity = c1ame3.getPlayEntity();
        if (playEntity != null) {
            C1A79 c1a79LIZ = c1474510oTR.LIZ(playEntity);
            if (c1a79LIZ != null) {
                c1a79LIZ.setSurfaceTextureListener(null);
            }
            C786410Ut5.LJJZZIII(c1474510oTR.LJ, new ARunnableS123S0100000_23(c1a79LIZ, 48));
            InterfaceC2178671AOj interfaceC2178671AOjLIZIZ = c1474510oTR.LIZIZ(playEntity);
            ((LinkedList) c1474510oTR.LIZJ).remove(playEntity);
            if (interfaceC2178671AOjLIZIZ == null) {
                return;
            }
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("releasePreparedVideoController vid:");
                sbLIZ3.append(playEntity.LIZ);
                sbLIZ3.append(" title:");
                sbLIZ3.append((String) null);
                sbLIZ3.append(" size:");
                sbLIZ3.append(((LinkedList) c1474510oTR.LIZJ).size());
                sbLIZ3.append(" context:");
                sbLIZ3.append(c1474510oTR.LIZLLL.LLILLJJLI.getClass().getSimpleName());
                C2188811AlT.LIZIZ(sbLIZ3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            interfaceC2178671AOjLIZIZ.release();
            return;
        }
        c1474510oTR.getClass();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnCreate owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnDestroy owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        EnumC807700VmK.KEEPER.onActDestroy(this.LLILLJJLI, this);
        LJJLIIIJJI();
        lifecycle.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onLifeCycleOnPause(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnPause owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onLifeCycleOnResume(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnResume owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIZ();
        if (LJJJLIIL()) {
            this.LL.LIZJ();
        }
        EnumC807700VmK.KEEPER.onActResume(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onLifeCycleOnStart(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnStart owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onLifeCycleOnStop(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnStop owner:");
        sbLIZ.append(lifecycleOwner.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        LJJLIIIJJI();
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LIZJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LIZJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LIZLLL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        C2178721AOo c2178721AOo;
        C2178651AOh c2178651AOh = this.LL;
        C2178731AOp c2178731AOp = c2178651AOh.LL;
        if (c2178731AOp.LIZLLL && (c2178721AOo = c2178731AOp.LIZIZ) != null) {
            c2178721AOo.disable();
            c2178731AOp.LIZLLL = false;
        }
        c2178651AOh.LL.LIZ.LJ(c2178651AOh);
        LJJLIIJ();
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LIZLLL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        if (LJJJLIIL()) {
            LJIIIZ();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJII(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIILJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILJJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIIZILJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIIZILJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIJJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        C1AMG c1amg = this.LLJJI;
        if (c1amg != null && (c1amg.LJIIIIZZ & 4) != 0) {
            LJJLIIJ();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIII(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        C1AMG c1amg = this.LLJJI;
        if (c1amg != null && (c1amg.LJIIIIZZ & 8) != 0) {
            LJJLIIJ();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIIZ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIIZI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIIZI(c2178751AOr, c1474420oTI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x000f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(X.C2178751AOr r4, X.C1474420oTI r5) {
        /*
            r3 = this;
            X.0Uyn r2 = r3.LLJILJIL
            if (r2 == 0) goto L29
            r1 = 0
            android.os.PowerManager r0 = r2.LIZJ     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto Lf
            boolean r0 = r0.isInteractive()     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L24
        Lf:
            android.app.KeyguardManager r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L24
            boolean r0 = r0.isKeyguardLocked()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L24
            goto L23
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L24
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L23:
            r1 = 1
        L24:
            r2.LJ = r1
            r2.LIZIZ()
        L29:
            r3.LJIIIZ()
            X.1AOh r0 = r3.LL
            r0.LJIIJ()
            boolean r0 = r3.LJJJLIIL()
            if (r0 == 0) goto L3a
            r3.LJIIIZ()
        L3a:
            java.util.List<X.0onf> r0 = r3.LLJI
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L42:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r1.next()
            X.0oT0 r0 = (X.InterfaceC1474240oT0) r0
            r0.LJJIJ(r4, r5)
            goto L42
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.context.VideoContext.LJJIJ(X.1AOr, X.0oTI):void");
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIJLIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJLIJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC2178771AOt
    public final void LJJJJIZL(int i, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2178771AOt) it2.next()).LJJJJIZL(i, z);
        }
    }

    public final void LJJLIIIJJIZ(int i, boolean z) {
        LJIIIZ();
        if (this.LLIZ != null) {
            if (z) {
                ((TreeSet) this.LLJJJIL).add(Integer.valueOf(i));
            } else {
                ((TreeSet) this.LLJJJIL).remove(Integer.valueOf(i));
            }
            this.LLIZ.setKeepScreenOn(!((TreeSet) this.LLJJJIL).isEmpty());
        }
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            keyEvent.startTracking();
            return true;
        }
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg.LJJLJ(new C790900V0u(308, Integer.valueOf(i)));
        }
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.LJJLJ(new C790900V0u(310, Integer.valueOf(i)));
            return false;
        }
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean zLIZ;
        if (LJJJLIIL()) {
            if (i == 4 && keyEvent.isTracking() && !keyEvent.isCanceled()) {
                C2178641AOg c2178641AOg = this.LLILLL;
                if (c2178641AOg != null) {
                    zLIZ = c2178641AOg.LLJLL.LIZ(new C790900V0u(307));
                } else {
                    zLIZ = false;
                }
                if (!zLIZ) {
                    Iterator it2 = ((ConcurrentHashMap) this.LLJ).entrySet().iterator();
                    while (it2.hasNext()) {
                        C807710VmL c807710VmL = (C807710VmL) ((Map.Entry) it2.next()).getValue();
                        if (c807710VmL != null) {
                            if (!zLIZ && !c807710VmL.onBackPressedWhenFullScreen(this)) {
                                zLIZ = false;
                            } else {
                                zLIZ = true;
                            }
                        }
                    }
                    if (zLIZ) {
                    }
                }
                return true;
            }
            C2178641AOg c2178641AOg2 = this.LLILLL;
            if (c2178641AOg2 != null) {
                return c2178641AOg2.LJJLJ(new C790900V0u(309, Integer.valueOf(i)));
            }
        }
        return false;
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LIZ(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, C1467470oI5 c1467470oI5) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJ(c2178751AOr, c1474420oTI, c1467470oI5);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJFF(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, long j) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJFF(c2178751AOr, c1474420oTI, j);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIIIIZZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIIIIZZ(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIIJ(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIILL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIJI(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, e eVar) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJ(c2178751AOr, c1474420oTI, eVar);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIIJ(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIJIIJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        C19353610ne c19353610ne;
        C1AMG c1amg = this.LLJJI;
        int i2 = 1;
        if ((c1amg == null || (c1amg.LJIIIIZZ & 2) == 0 || !c1474420oTI.LJIIIIZZ.LIZLLL) && (c19353610ne = this.LLJIJIL) != null) {
            if (c1amg != null) {
                i2 = c1amg.LJIIIZ;
            }
            c19353610ne.LIZIZ(i2);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJIIJIL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474380oTE
    public final void LJJIJL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474380oTE) it2.next()).LJJIJL(c2178751AOr, c1474420oTI, str);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, long j) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIZ(c2178751AOr, c1474420oTI, j);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1487050onf
    public final boolean LJJJJI(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, InterfaceC1487060ong interfaceC1487060ong) {
        while (true) {
            boolean z = false;
            for (InterfaceC1487050onf interfaceC1487050onf : (CopyOnWriteArrayList) this.LLJI) {
                if (z || interfaceC1487050onf.LJJJJI(interfaceC1471800oP4, c1474420oTI, interfaceC1487060ong)) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJJJL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJJL(c2178751AOr, c1474420oTI, i);
        }
    }

    public final boolean LJJLIIIJ(boolean z, int i, boolean z2) {
        Iterator it2 = ((ConcurrentHashMap) this.LLJ).entrySet().iterator();
        while (it2.hasNext()) {
            C807710VmL c807710VmL = (C807710VmL) ((Map.Entry) it2.next()).getValue();
            if (c807710VmL != null && c807710VmL.onInterceptFullScreen(z, i, true)) {
                return true;
            }
        }
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg == null) {
            return false;
        }
        for (InterfaceC2178771AOt interfaceC2178771AOt : (CopyOnWriteArrayList) this.LLJI) {
            c2178641AOg.getVideoStateInquirer();
            c2178641AOg.getPlayEntity();
            interfaceC2178771AOt.LJIJ();
        }
        return false;
    }

    @Override // X.C2178681AOk, X.InterfaceC1474380oTE
    public final void LJIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474380oTE) it2.next()).LJIIL(c2178751AOr, c1474420oTI, i, str);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIILIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILIIL(c2178751AOr, c1474420oTI, i, i2);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIILLIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, EnumC2281151EQn enumC2281151EQn, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILLIIL(c2178751AOr, c1474420oTI, enumC2281151EQn, i);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJIJJLI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, EnumC2281151EQn enumC2281151EQn, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIJJLI(c2178751AOr, c1474420oTI, enumC2281151EQn, z);
        }
    }

    @Override // X.C2178681AOk, X.InterfaceC1474240oT0
    public final void LJJIFFI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIFFI(c2178751AOr, c1474420oTI, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.13kS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIIJ(int r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.context.VideoContext.LJJLIIIIJ(int, boolean, boolean, boolean):void");
    }

    public final void LJJLIIIJILLIZJL(int i, boolean z, boolean z2, boolean z3) {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg == null) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2178771AOt) it2.next()).LJJIIJZLJL(c2178641AOg.getVideoStateInquirer(), c2178641AOg.getPlayEntity(), this, z, i, z2, z3);
        }
    }
}
