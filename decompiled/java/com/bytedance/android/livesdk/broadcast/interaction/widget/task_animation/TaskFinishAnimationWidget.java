package com.bytedance.android.livesdk.broadcast.interaction.widget.task_animation;

import X.C0T9L;
import X.C0TLE;
import X.C11NJ;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C12ES;
import X.C2118908Rv;
import X.C784440Upu;
import X.C785550Urh;
import X.C785580Urk;
import X.C785600Urm;
import X.InterfaceC1294390jmv;
import X.InterfaceC785570Urj;
import Y.AAListenerS323S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements WeakHandler.IHandler {
    public C1295960jpS LL;
    public TextView LLILLJJLI;
    public AlphaAnimation LLILLL;
    public ARunnableS112S0100000_12 LLILZ;
    public AlphaAnimation LLILZIL;
    public final WeakHandler LLILZLL = new WeakHandler(Looper.getMainLooper(), this);
    public final C11NJ LLIZ = new C11NJ();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.fye;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C11NJ c11nj = this.LLIZ;
        if (c11nj != null) {
            c11nj.LJ();
        }
        AlphaAnimation alphaAnimation = this.LLILZIL;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.LLILZIL = null;
        }
        AlphaAnimation alphaAnimation2 = this.LLILLL;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
            this.LLILLL = null;
        }
        if (this.LLILZ != null) {
            this.LLILZ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0Urg] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        InterfaceC785570Urj interfaceC785570Urj;
        if (message != null && message.what == 100 && (HandlerHook.getMessageObj(message.obj) instanceof C2118908Rv)) {
            final C2118908Rv c2118908Rv = (C2118908Rv) HandlerHook.getMessageObj(message.obj);
            final C1295960jpS c1295960jpS = this.LL;
            C0TLE c0tleLIZ = 0;
            c0tleLIZ = 0;
            c0tleLIZ = 0;
            if (c2118908Rv != null && c2118908Rv.LIZ != null && c2118908Rv.LIZIZ != null && c1295960jpS != null) {
                C12ES.LJIILL(0, c1295960jpS);
                c1295960jpS.cancelAnimation();
                c1295960jpS.setProgress(0.0f);
                final HashMap<String, Bitmap> map = c2118908Rv.LIZLLL;
                if (map != null) {
                    c1295960jpS.setImageAssetDelegate(new InterfaceC1294390jmv() { // from class: X.0Lu7
                        @Override // X.InterfaceC1294390jmv
                        public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                            Bitmap bitmap;
                            String str = c1294320jmo.LIZLLL;
                            if (TextUtils.isEmpty(str) || !map.containsKey(str) || (bitmap = map.get(str)) == null || bitmap.isRecycled()) {
                                return null;
                            }
                            return bitmap;
                        }
                    });
                }
                C1294720jnS c1294720jnS = (C1294720jnS) ((WeakHashMap) C785550Urh.LIZ).get(c2118908Rv.LIZ);
                try {
                    if (c1294720jnS == null) {
                        Map<Class, InterfaceC785570Urj<?>> map2 = C785580Urk.LIZ;
                        if (map2 != null && ((HashMap) map2).containsKey(C0TLE.class) && (interfaceC785570Urj = (InterfaceC785570Urj) ((HashMap) C785580Urk.LIZ).get(C0TLE.class)) != null) {
                            c0tleLIZ = interfaceC785570Urj.LIZ();
                        }
                        c1295960jpS.getContext();
                        c0tleLIZ.LIZ(c2118908Rv.LIZJ, new C0T9L() { // from class: X.0Urg
                            public final /* synthetic */ boolean LIZJ = true;

                            @Override // X.C0T9L
                            public final void LIZ(C1294720jnS c1294720jnS2) {
                                if (c1294720jnS2 == null) {
                                    return;
                                }
                                try {
                                    ((WeakHashMap) C785550Urh.LIZ).put(c2118908Rv.LIZ, c1294720jnS2);
                                    c1295960jpS.setComposition(c1294720jnS2);
                                    if (this.LIZJ) {
                                        c1295960jpS.playAnimation();
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        });
                        return;
                    }
                    c1295960jpS.setComposition(c1294720jnS);
                    c1295960jpS.playAnimation();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLJJLI = (TextView) findViewById(R.id.yo9);
        this.LL = (C1295960jpS) findViewById(R.id.yo8);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LLIZ.LIZ(C784440Upu.LIZ().LJ(C785600Urm.class).LJJLJLI(new AfS181S0100000_12(this, 64)));
        this.LL.addAnimatorListener(new AAListenerS323S0100000_12(this, 2));
    }
}
