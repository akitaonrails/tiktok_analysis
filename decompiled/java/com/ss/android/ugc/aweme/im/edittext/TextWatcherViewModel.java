package com.ss.android.ugc.aweme.im.edittext;

import X.AnonymousClass0950;
import X.C09IC;
import X.C09IR;
import X.C2252331DDr;
import X.C23250099c;
import X.C459490I0d;
import X.C459500I0e;
import X.C463090IDz;
import X.InterfaceC0148002o;
import android.text.TextWatcher;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public final class TextWatcherViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final C2252331DDr LL;
    public final AnonymousClass0950 LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final AnonymousClass0950 LLILZ;
    public final CopyOnWriteArraySet<TextWatcher> LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(4);
    }

    public TextWatcherViewModel() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 3, null, 5);
        this.LL = c2252331DDrLIZIZ;
        this.LLILLJJLI = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 3, null, 5);
        this.LLILLL = c2252331DDrLIZIZ2;
        this.LLILZ = C09IC.LIZ(c2252331DDrLIZIZ2);
        this.LLILZIL = new CopyOnWriteArraySet<>();
    }

    public final void vQ2(TextWatcher textWatcher) {
        if (!this.LLILZIL.add(textWatcher)) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C459490I0d(this, textWatcher, null), 3);
    }

    public final void wQ2(TextWatcher textWatcher) {
        this.LLILZIL.remove(textWatcher);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C459500I0e(this, textWatcher, null), 3);
    }
}
