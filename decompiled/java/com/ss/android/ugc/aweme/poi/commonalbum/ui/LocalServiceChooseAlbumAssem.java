package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01GW;
import X.C0H7B;
import X.C13LE;
import X.C15438062q;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C433740Gzc;
import X.C436060H8a;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ALAdapterS1S0210000_6;
import Y.ARunnableS106S0100000_6;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceChooseAlbumAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 513));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceChooseAlbumAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocalServiceChooseAlbumAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 512), AFwS236S0000000_6.get$arr$(249), null, true);
    }

    public final C436060H8a Go() {
        return (C436060H8a) this.LLIZLLLIL.getValue();
    }

    public final void Jo() {
        if (Go().LLILLL.getVisibility() == 0) {
            Ho(false);
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = Go().LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList = ((LocalServiceAlbumVM) assemVMLazy.getValue()).LLILZIL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<C0H7B> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LLILLJJLI);
        }
        arrayList.add(new C433740Gzc("Recent", arrayList2, true, 4));
        AssemVMLazy assemVMLazy2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
        ConcurrentHashMap<String, CopyOnWriteArrayList<C0H7B>> concurrentHashMap = ((LocalServiceAlbumVM) assemVMLazy2.getValue()).LLILZLL;
        ArrayList arrayList3 = new ArrayList(concurrentHashMap.size());
        for (Map.Entry<String, CopyOnWriteArrayList<C0H7B>> entry : concurrentHashMap.entrySet()) {
            String key = entry.getKey();
            CopyOnWriteArrayList<C0H7B> value = entry.getValue();
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(value, 10));
            Iterator<T> it3 = value.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C0H7B) it3.next()).LLILLJJLI);
            }
            arrayList3.add(new C433740Gzc(key, arrayList4, false, 12));
        }
        arrayList.addAll(arrayList3);
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, new ARunnableS106S0100000_6(this, 87));
    }

    public final void Ho(boolean z) {
        float f;
        ConstraintLayout constraintLayout = Go().LLILLL;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = Go().LLILLJJLI;
        int measuredHeight = constraintLayout.getMeasuredHeight();
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = -measuredHeight;
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = -measuredHeight;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewOnAttachStateChangeListenerC20604515jv, "translationY", fArr);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new ALAdapterS1S0210000_6(constraintLayout, viewOnAttachStateChangeListenerC20604515jv, z, 0));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LLILLJJLI.LJIILJJIL(LocalServiceAlbumCell.class);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0H8V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 175), 4);
    }
}
