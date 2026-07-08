package com.ss.android.ugc.aweme.choosemusic.view;

import X.AnonymousClass1250;
import X.C11NZ;
import X.C11S5;
import X.C15HO;
import X.C15IC;
import X.C15IS;
import X.C1701940uOG;
import X.C19EG;
import X.C1D92;
import X.C20494415Hi;
import X.C20498815Ja;
import X.C786410Ut5;
import X.InterfaceC1485120okY;
import Y.ACListenerS165S0100000_31;
import Y.ACallableS237S0200000_3;
import Y.AObserverS217S0100000_13;
import Y.AObserverS231S0100000_29;
import Y.AObserverS233S0100000_31;
import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class ChooseMusicSelectView implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public View LLILLJJLI;
    public View LLILLL;
    public ViewGroup LLILZ;
    public SmartImageView LLILZIL;
    public C1D92 LLILZLL;
    public TuxIconView LLIZ;
    public TextView LLIZLLLIL;
    public ImageView LLJ;
    public TuxIconView LLJI;
    public ImageView LLJIJIL;
    public C20498815Ja LLJILJIL;
    public C19EG LLJILJILJ;
    public C15IC LLJILLL;
    public SelectedMusicViewModel LLJJ;
    public ChooseMusicCutViewModel LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public MusicModel LLJJIJIL;
    public C15HO LLJJJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        SelectedMusicViewModel selectedMusicViewModel = this.LLJJ;
        if (selectedMusicViewModel == null) {
            selectedMusicViewModel = null;
        }
        selectedMusicViewModel.yQ2().removeObservers(this.LL);
        selectedMusicViewModel.wQ2().removeObservers(this.LL);
        selectedMusicViewModel.xQ2().removeObservers(this.LL);
        ((LiveData) selectedMusicViewModel.LLILZ.getValue()).removeObservers(this.LL);
        ((LiveData) selectedMusicViewModel.LLILZIL.getValue()).removeObservers(this.LL);
        selectedMusicViewModel.vQ2().removeObservers(this.LL);
        C20494415Hi.LIZIZ = null;
        C20494415Hi.LIZ = null;
    }

    public final void LIZIZ() {
        SelectedMusicViewModel selectedMusicViewModel = this.LLJJ;
        if (selectedMusicViewModel == null) {
            selectedMusicViewModel = null;
        }
        selectedMusicViewModel.xQ2().postValue(1);
        C20498815Ja c20498815Ja = this.LLJILJIL;
        (c20498815Ja != null ? c20498815Ja : null).pause();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel r0 = r3.LLJJ
            r2 = 0
            if (r0 != 0) goto L6
            r0 = r2
        L6:
            androidx.lifecycle.MutableLiveData r0 = r0.xQ2()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L19
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L30
        L19:
            com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel r0 = r3.LLJJ
            if (r0 != 0) goto L1e
            r0 = r2
        L1e:
            androidx.lifecycle.MutableLiveData r0 = r0.xQ2()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L49
            int r0 = r0.intValue()
            if (r0 != 0) goto L49
        L30:
            X.15Ja r0 = r3.LLJILJIL
            if (r0 != 0) goto L35
            r0 = r2
        L35:
            r0.pause()
            com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel r0 = r3.LLJJ
            if (r0 != 0) goto L3d
            r0 = r2
        L3d:
            androidx.lifecycle.MutableLiveData r1 = r0.xQ2()
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.postValue(r0)
        L49:
            X.15Ja r0 = r3.LLJILJIL
            if (r0 == 0) goto L4e
            r2 = r0
        L4e:
            r2.release()
            r3.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView.onDestroy():void");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        SelectedMusicViewModel selectedMusicViewModel = this.LLJJ;
        if (selectedMusicViewModel == null) {
            selectedMusicViewModel = null;
        }
        Integer value = selectedMusicViewModel.xQ2().getValue();
        if (value == null || value.intValue() != 2) {
            SelectedMusicViewModel selectedMusicViewModel2 = this.LLJJ;
            if (selectedMusicViewModel2 == null) {
                selectedMusicViewModel2 = null;
            }
            Integer value2 = selectedMusicViewModel2.xQ2().getValue();
            if (value2 == null || value2.intValue() != 0) {
                return;
            }
        }
        C20498815Ja c20498815Ja = this.LLJILJIL;
        if (c20498815Ja == null) {
            c20498815Ja = null;
        }
        c20498815Ja.pause();
        SelectedMusicViewModel selectedMusicViewModel3 = this.LLJJ;
        (selectedMusicViewModel3 != null ? selectedMusicViewModel3 : null).xQ2().postValue(1);
    }

    public final void LIZJ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C11NZ.LJJJJI(new ACallableS237S0200000_3(bitmap, this, 3)).LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 9));
    }

    public ChooseMusicSelectView(View view, C19EG c19eg, LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider) {
        this.LL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLJILJILJ = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = (view == null ? null : view).findViewById(R.id.dss);
        View view2 = this.LLILLJJLI;
        this.LLILZ = (ViewGroup) (view2 == null ? null : view2).findViewById(R.id.to1);
        View view3 = this.LLILLJJLI;
        this.LLILZIL = (SmartImageView) (view3 == null ? null : view3).findViewById(R.id.lp_);
        View view4 = this.LLILLJJLI;
        this.LLILZLL = (C1D92) (view4 == null ? null : view4).findViewById(R.id.lpa);
        View view5 = this.LLILLJJLI;
        this.LLIZ = (TuxIconView) (view5 == null ? null : view5).findViewById(R.id.lpb);
        View view6 = this.LLILLJJLI;
        this.LLIZLLLIL = (TextView) (view6 == null ? null : view6).findViewById(R.id.zyf);
        View view7 = this.LLILLJJLI;
        this.LLJ = (ImageView) (view7 == null ? null : view7).findViewById(R.id.loz);
        View view8 = this.LLILLJJLI;
        TuxIconView tuxIconView = (TuxIconView) (view8 == null ? null : view8).findViewById(R.id.lox);
        this.LLJI = tuxIconView;
        C15IS.LIZIZ(tuxIconView == null ? null : tuxIconView, 1);
        View view9 = this.LLILLJJLI;
        this.LLJIJIL = (ImageView) (view9 == null ? null : view9).findViewById(R.id.lp0);
        C20498815Ja c20498815Ja = new C20498815Ja();
        this.LLJILJIL = c20498815Ja;
        c20498815Ja.LJ(new InterfaceC1485120okY() { // from class: X.129n
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                SelectedMusicViewModel selectedMusicViewModel = this.LIZ.LLJJ;
                if (selectedMusicViewModel == null) {
                    selectedMusicViewModel = null;
                }
                selectedMusicViewModel.xQ2().postValue(2);
            }
        });
        this.LLJILJILJ = c19eg;
        SelectedMusicViewModel selectedMusicViewModel = (SelectedMusicViewModel) viewModelProvider.get(SelectedMusicViewModel.class);
        this.LLJJ = selectedMusicViewModel;
        C20494415Hi.LIZIZ = selectedMusicViewModel == null ? null : selectedMusicViewModel;
        C20494415Hi.LIZ = this;
        this.LLJJI = (ChooseMusicCutViewModel) viewModelProvider.get(ChooseMusicCutViewModel.class);
        SelectedMusicViewModel selectedMusicViewModel2 = this.LLJJ;
        selectedMusicViewModel2 = selectedMusicViewModel2 == null ? null : selectedMusicViewModel2;
        selectedMusicViewModel2.yQ2().observe(this.LL, new AObserverS217S0100000_13(this, 14));
        MutableLiveData<MusicModel> mutableLiveDataWQ2 = selectedMusicViewModel2.wQ2();
        if (mutableLiveDataWQ2 != null) {
            mutableLiveDataWQ2.observe(this.LL, new AObserverS231S0100000_29(this, 121));
        }
        selectedMusicViewModel2.xQ2().observe(this.LL, new AObserverS233S0100000_31(this, 21));
        selectedMusicViewModel2.vQ2().observe(this.LL, new AObserverS233S0100000_31(this, 22));
        ((LiveData) selectedMusicViewModel2.LLILZIL.getValue()).observe(this.LL, new AObserverS217S0100000_13(this, 12));
        ((LiveData) selectedMusicViewModel2.LLILZ.getValue()).observe(this.LL, new AObserverS217S0100000_13(this, 13));
        ViewGroup viewGroup = this.LLILZ;
        C786410Ut5.K7(viewGroup == null ? null : viewGroup, new ACListenerS165S0100000_31(this, 101));
        ImageView imageView = this.LLJ;
        C786410Ut5.Q7(imageView == null ? null : imageView, new ACListenerS165S0100000_31(this, 102));
        ImageView imageView2 = this.LLJ;
        AnonymousClass1250.LIZIZ(imageView2 == null ? null : imageView2);
        TuxIconView tuxIconView2 = this.LLJI;
        AnonymousClass1250.LIZIZ(tuxIconView2 == null ? null : tuxIconView2);
        ImageView imageView3 = this.LLJIJIL;
        AnonymousClass1250.LIZIZ(imageView3 == null ? null : imageView3);
        TuxIconView tuxIconView3 = this.LLJI;
        C786410Ut5.a9(tuxIconView3 == null ? null : tuxIconView3, new ACListenerS165S0100000_31(this, 103));
        ImageView imageView4 = this.LLJIJIL;
        C786410Ut5.Q7(imageView4 != null ? imageView4 : null, new ACListenerS165S0100000_31(this, 104));
    }
}
