package com.ss.android.ugc.aweme.shortvideo.model;

import X.C11G4;
import X.C11GO;
import X.C127A;
import X.C127K;
import X.C786410Ut5;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public class CommonViewStatus extends ViewModel {
    public static final int $stable = 8;
    public final MutableLiveData<Integer> _visibility = new MutableLiveData<>();
    public final MutableLiveData<Float> _alpha = new MutableLiveData<>();
    public final MutableLiveData<Boolean> _enable = new MutableLiveData<>();
    public final List<Function1<View, Unit>> mClickListenerList = new ArrayList();

    public final MutableLiveData<Float> getAlpha() {
        return this._alpha;
    }

    public final MutableLiveData<Boolean> getEnable() {
        return this._enable;
    }

    public final MutableLiveData<Integer> getVisibility() {
        return this._visibility;
    }

    public final void addOnClickListener(Function1<? super View, Unit> function1) {
        this.mClickListenerList.add(function1);
    }

    public final void click(View view) {
        Iterator<Function1<View, Unit>> it2 = this.mClickListenerList.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(view);
        }
    }

    public final void setOnClickListener(Function1<? super View, Unit> function1) {
        this.mClickListenerList.clear();
        this.mClickListenerList.add(function1);
    }

    public void bindView(final View view, LifecycleOwner lifecycleOwner) {
        this._visibility.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus.bindView.1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Integer num) {
                C786410Ut5.LJLLLLLL(num.intValue(), view);
            }
        });
        this._alpha.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus.bindView.2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Float f) {
                C786410Ut5.T4(view, f.floatValue());
            }
        });
        this._enable.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus.bindView.3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Boolean bool) {
                view.setEnabled(bool.booleanValue());
            }
        });
        if (view instanceof C127K) {
            C127K c127k = (C127K) view;
            if (c127k.getAccessory() instanceof C127A) {
                ((C11GO) c127k.getAccessory()).LJIILL(new AwS420S0200000_19(this, view, 100));
            }
            if (c127k.getAccessory() instanceof C11G4) {
                ((C11G4) c127k.getAccessory()).LJIILL(new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus.bindView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CommonViewStatus.this.click(view2);
                    }
                });
                return;
            }
            return;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus.bindView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommonViewStatus.this.click(view2);
            }
        }, view);
    }
}
