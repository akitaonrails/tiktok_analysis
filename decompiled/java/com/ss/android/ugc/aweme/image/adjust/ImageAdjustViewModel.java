package com.ss.android.ugc.aweme.image.adjust;

import X.C194561119z;
import X.InterfaceC1452460nts;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageAdjustViewModel extends LifecycleAwareViewModel<ImageAdjustState> implements InterfaceC1452460nts {
    public static final int LLIZLLLIL = 8;
    public boolean LLILZLL;
    public final MutableLiveData<Unit> LLIZ = new MutableLiveData<>();

    @Override // X.InterfaceC1452460nts
    public void gM1() {
        this.LLIZ.setValue(Unit.LIZ);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public ImageAdjustState zQ2() {
        return new ImageAdjustState(new C194561119z(), null);
    }

    @Override // X.InterfaceC1452460nts
    public void show() {
        setState(AFwS261S0000000_22.get$arr$(62));
    }

    @Override // X.InterfaceC1452460nts
    public boolean LJJII() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1452460nts
    public LiveData<Unit> SF2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1452460nts
    public void si(boolean z) {
        this.LLILZLL = z;
    }
}
