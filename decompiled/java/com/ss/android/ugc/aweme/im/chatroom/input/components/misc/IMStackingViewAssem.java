package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C0HV8;
import X.C1697810uHb;
import X.C442000HUw;
import X.C459000HzG;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC346290Dhr;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class IMStackingViewAssem extends UiStateViewAssem<C0HV8, C442000HUw, FrameLayout> {
    public static final List<Integer> LLJJIJI = C1697810uHb.LJIILJJIL(Integer.valueOf(R.id.kr2), Integer.valueOf(R.id.kr9), Integer.valueOf(R.id.kr_), Integer.valueOf(R.id.kra), Integer.valueOf(R.id.krb), Integer.valueOf(R.id.krc), Integer.valueOf(R.id.krd), Integer.valueOf(R.id.kre), Integer.valueOf(R.id.krf), Integer.valueOf(R.id.kr3), Integer.valueOf(R.id.kr4), Integer.valueOf(R.id.kr5), Integer.valueOf(R.id.kr6), Integer.valueOf(R.id.kr7), Integer.valueOf(R.id.kr8));
    public static final ConcurrentHashMap<Integer, Integer> LLJJIJIIJIL = new ConcurrentHashMap<>();
    public final ViewOnAttachStateChangeListenerC346290Dhr LLJJIII = new ViewOnAttachStateChangeListenerC346290Dhr(0);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r2 = 0;
     */
    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LLLILZJ() {
        /*
            r6 = this;
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L76
            r3.<init>(r0)
            com.bytedance.assem.arch.core.AssemSupervisor r0 = r6.getSupervisor()
            android.view.View r0 = r0.LLJJIII
            androidx.fragment.app.Fragment r0 = X.C946803n0.LIZ(r0)
            if (r0 == 0) goto L61
            int r5 = r0.hashCode()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r4 = com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem.LLJJIJIIJIL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L33
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.putIfAbsent(r1, r2)
            if (r0 == 0) goto L33
            r2 = r0
        L33:
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            int r0 = r2.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r1, r0)
            java.util.List<java.lang.Integer> r1 = com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem.LLJJIJI
            int r0 = r2.intValue()
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L6e
            int r0 = r0.intValue()
        L58:
            r3.setId(r0)
            X.0Dhr r0 = r6.LLJJIII
            r3.addOnAttachStateChangeListener(r0)
            return r3
        L61:
            java.util.List<java.lang.Integer> r0 = com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem.LLJJIJI
            java.lang.Object r0 = X.C13LP.LJJLIIIJJI(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L58
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "View id pool is empty, if you want more, declare a new id and append to the viewIdPool"
            r1.<init>(r0)
            throw r1
        L76:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem.LLLILZJ():android.view.View");
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, frameLayout);
        }
    }
}
