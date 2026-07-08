package com.bytedance.creativex.recorder.sticker.panel;

import X.C01GW;
import X.C0ETY;
import X.C1622560sKE;
import X.C1624010sMZ;
import X.C1637230sht;
import X.C194561119z;
import X.C1DRG;
import X.C452501pT;
import X.InterfaceC1623390sLZ;
import X.InterfaceC1625000sOA;
import X.InterfaceC1638740skK;
import X.InterfaceC579050MnP;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordStickerPanelViewModel extends LifecycleAwareViewModel<StickerPanelState> implements InterfaceC579050MnP {
    public final C1DRG LLILZLL;
    public final C1637230sht LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(78));
    public boolean LLJI;

    private final HashSet<InterfaceC1638740skK> kR2() {
        return (HashSet) this.LLJ.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public StickerPanelState zQ2() {
        return new StickerPanelState(new C194561119z());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        ((C0ETY) this.LLILZLL.LJII(C0ETY.class, null)).Sd(InterfaceC1625000sOA.class, new AwS604S0100000_25(this, 69));
    }

    @Override // X.InterfaceC579050MnP
    public LiveData<Boolean> hl1() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC579050MnP
    public void VB0(InterfaceC1638740skK interfaceC1638740skK) {
        kR2().add(interfaceC1638740skK);
    }

    public final boolean lR2(int i) {
        Function0<Boolean> function0;
        InterfaceC1623390sLZ interfaceC1623390sLZ;
        if (i != 4 || (((function0 = this.LLIZ.LIZJ) != null && function0.invoke().booleanValue()) || (interfaceC1623390sLZ = (InterfaceC1623390sLZ) ((C0ETY) this.LLILZLL.LJII(C0ETY.class, null)).MY1(InterfaceC1625000sOA.class)) == null || !C1624010sMZ.LIZJ(interfaceC1623390sLZ))) {
            return false;
        }
        My0(false, false);
        if (interfaceC1623390sLZ != null) {
            C1622560sKE.LIZ(interfaceC1623390sLZ);
        }
        return true;
    }

    @Override // X.InterfaceC579050MnP
    public void sY(boolean z) {
        this.LLJI = z;
        if (z) {
            My0(false, false);
        }
    }

    @Override // X.InterfaceC579050MnP
    public void yu2(InterfaceC1638740skK interfaceC1638740skK) {
        kR2().remove(interfaceC1638740skK);
    }

    public RecordStickerPanelViewModel(C1DRG c1drg, C1637230sht c1637230sht) {
        this.LLILZLL = c1drg;
        this.LLIZ = c1637230sht;
    }

    @Override // X.InterfaceC579050MnP
    public void My0(boolean z, boolean z2) {
        Function1<? super Boolean, Boolean> function1 = this.LLIZ.LIZIZ;
        if (function1 != null && function1.invoke(Boolean.valueOf(z)).booleanValue()) {
            return;
        }
        if (z) {
            HashSet<InterfaceC1638740skK> hashSetKR2 = kR2();
            if (!(hashSetKR2 instanceof Collection) || !hashSetKR2.isEmpty()) {
                Iterator<InterfaceC1638740skK> it2 = hashSetKR2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZ()) {
                        return;
                    }
                }
            }
        }
        setStateImmediate(new AwS111S0110000_25(z, this, 2));
    }
}
