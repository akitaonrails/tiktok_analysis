package com.ss.android.ugc.aweme.shortvideo.inlinecaption.als;

import X.AnonymousClass1264;
import X.C128A;
import X.C194561119z;
import X.C560530Lyd;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EditCaptionFontViewModel extends LifecycleAwareViewModel<EditCaptionFontState> implements AnonymousClass1264 {
    public static final int LLJJ = 8;
    public List<TextStickerData> LLILZLL = new ArrayList();
    public final MutableLiveData<Integer> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Pair<String, Integer>> LLJ = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLJI = new MutableLiveData<>();
    public final MutableLiveData<C128A> LLJIJIL = new MutableLiveData<>();
    public final C560530Lyd<ArrayList<TextStickerData>> LLJILJIL;
    public final LiveEvent<ArrayList<TextStickerData>> LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.AnonymousClass1264
    public void hide() {
        this.LLJILLL = false;
        setStateImmediate(AFwS273S0000000_29.get$arr$(136));
    }

    @Override // X.AnonymousClass1264
    public void show() {
        this.LLJILLL = true;
        setStateImmediate(AFwS273S0000000_29.get$arr$(137));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public EditCaptionFontState zQ2() {
        return new EditCaptionFontState(new C194561119z());
    }

    public EditCaptionFontViewModel() {
        C560530Lyd<ArrayList<TextStickerData>> c560530Lyd = new C560530Lyd<>();
        this.LLJILJIL = c560530Lyd;
        this.LLJILJILJ = c560530Lyd;
    }

    @Override // X.AnonymousClass1264
    public MutableLiveData<C128A> GR1() {
        return this.LLJIJIL;
    }

    @Override // X.AnonymousClass1264
    public MutableLiveData<Integer> Gl() {
        return this.LLIZLLLIL;
    }

    @Override // X.AnonymousClass1264
    public boolean LJJII() {
        return this.LLJILLL;
    }

    @Override // X.AnonymousClass1264
    public MutableLiveData<Integer> Rv() {
        return this.LLJI;
    }

    @Override // X.AnonymousClass1264
    public MutableLiveData<Pair<String, Integer>> Vn() {
        return this.LLJ;
    }

    @Override // X.AnonymousClass1264
    public LiveEvent<ArrayList<TextStickerData>> WD() {
        return this.LLJILJILJ;
    }

    public final List<TextStickerData> kR2() {
        return this.LLILZLL;
    }

    @Override // X.AnonymousClass1264
    public MutableLiveData<Integer> tk() {
        return this.LLIZ;
    }

    @Override // X.AnonymousClass1264
    public void M8(int i) {
        Rv().setValue(Integer.valueOf(i));
    }

    @Override // X.AnonymousClass1264
    public void NG0(C128A c128a) {
        GR1().setValue(c128a);
    }

    @Override // X.AnonymousClass1264
    public void Xf(int i) {
        Gl().setValue(Integer.valueOf(i));
    }

    public final void lR2(List<TextStickerData> list) {
        this.LLILZLL = list;
    }

    @Override // X.AnonymousClass1264
    public void z6(int i) {
        tk().setValue(Integer.valueOf(i));
    }

    @Override // X.AnonymousClass1264
    public void za0(ArrayList<TextStickerData> arrayList) {
        this.LLJILJIL.LJIIJ(arrayList);
    }

    @Override // X.AnonymousClass1264
    public void FL(String str, int i) {
        Vn().setValue(new Pair<>(str, Integer.valueOf(i)));
    }
}
