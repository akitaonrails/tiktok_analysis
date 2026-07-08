package com.ss.android.ugc.aweme.image.progressbar;

import X.C11A0;
import X.C19717412Cm;
import X.InterfaceC1453410nvP;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ImageProgressViewModel extends LifecycleAwareViewModel<ImagesProgressState> implements InterfaceC1453410nvP {
    public static final int LLIZLLLIL = 8;
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Pair<Integer, Float>> LLIZ = new MutableLiveData<>();

    @Override // X.InterfaceC1453410nvP
    public void Qf0() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(69));
    }

    @Override // X.InterfaceC1453410nvP
    public void dj0() {
        setState(AFwS273S0000000_29.get$arr$(70));
    }

    @Override // X.InterfaceC1453410nvP
    public void e0() {
        this.LLILZLL.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC1453410nvP
    public void hide() {
        setState(AFwS273S0000000_29.get$arr$(66));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public ImagesProgressState zQ2() {
        return new ImagesProgressState(new C11A0(), null, null, null, null, null, null, null, null, null);
    }

    @Override // X.InterfaceC1453410nvP
    public void resume() {
        setState(AFwS273S0000000_29.get$arr$(67));
    }

    @Override // X.InterfaceC1453410nvP
    public void show() {
        setState(AFwS273S0000000_29.get$arr$(68));
    }

    @Override // X.InterfaceC1453410nvP
    public MutableLiveData<Pair<Integer, Float>> Ms1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1453410nvP
    public LiveData<Boolean> Zm0() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1453410nvP
    public void LLLIIL(int i) {
        setState(new AwS41S0001000_29(i, 6));
    }

    @Override // X.InterfaceC1453410nvP
    public void RM2(LivePhotoPreviewMode livePhotoPreviewMode) {
        setStateImmediate(new AwS608S0100000_29(livePhotoPreviewMode, 106));
    }

    @Override // X.InterfaceC1453410nvP
    public void Xm2(boolean z) {
        setState(new AwS41S0010000_29(z, 9));
    }

    @Override // X.InterfaceC1453410nvP
    public void ct1(boolean z) {
        setState(new AwS41S0010000_29(z, 10));
    }

    @Override // X.InterfaceC1453410nvP
    public void pause(boolean z) {
        setStateImmediate(new AwS41S0010000_29(z, 8));
    }

    @Override // X.InterfaceC1453410nvP
    public void kM1(int i, float f) {
        this.LLIZ.setValue(new Pair<>(Integer.valueOf(i), Float.valueOf(f)));
        setState(new C19717412Cm(i, f));
    }
}
