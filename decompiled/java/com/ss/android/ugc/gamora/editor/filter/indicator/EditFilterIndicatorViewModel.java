package com.ss.android.ugc.gamora.editor.filter.indicator;

import X.C194561119z;
import X.InterfaceC1465710oFF;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS14S0120000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class EditFilterIndicatorViewModel extends LifecycleAwareViewModel<EditFilterIndicatorState> implements InterfaceC1465710oFF {
    public boolean LLILZLL;
    public boolean LLIZ = true;
    public boolean LLIZLLLIL = true;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public EditFilterIndicatorState zQ2() {
        return new EditFilterIndicatorState(true, true, null, new C194561119z());
    }

    @Override // X.InterfaceC1465710oFF
    public void kt() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(102));
    }

    @Override // X.InterfaceC1465710oFF
    public void qu() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(101));
    }

    public final boolean kR2() {
        return this.LLIZLLLIL;
    }

    public final boolean lR2() {
        return this.LLILZLL;
    }

    public final boolean mR2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1465710oFF
    public void Oc(boolean z, FilterBean filterBean, boolean z2, boolean z3) {
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        setState(new AwS14S0120000_35(filterBean, z, z2, 1));
    }
}
