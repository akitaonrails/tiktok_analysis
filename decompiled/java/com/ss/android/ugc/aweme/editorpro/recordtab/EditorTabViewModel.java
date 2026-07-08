package com.ss.android.ugc.aweme.editorpro.recordtab;

import X.C004I;
import X.C01GW;
import X.C0CHQ;
import X.C0PEM;
import X.C13BV;
import X.C1410150mnd;
import X.C1647240sy2;
import X.C23250099c;
import X.C452501pT;
import X.C569510MVh;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class EditorTabViewModel extends BaseJediViewModel<EditorTabState> {
    public ShortVideoContext LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public List<AwemeDraft> LLIZLLLIL = C13BV.INSTANCE;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(59));

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new EditorTabState(false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        if (C1647240sy2.LIZ().preloadDraftOpt) {
            return;
        }
        lR2(null);
    }

    public final void lR2(Function0<Unit> function0) {
        if (C569510MVh.LIZ() && C0CHQ.LIZ().getAccountService().isLogin()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1410150mnd(this, function0, null), 2);
        } else if (function0 != null) {
            function0.invoke();
        }
    }
}
