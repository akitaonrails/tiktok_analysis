package com.ss.android.ugc.aweme.search.middle;

import X.C01GW;
import X.C0QJ5;
import X.C0QJ6;
import X.C0QLX;
import X.C1935507i5;
import X.EnumC668740QKy;
import X.InterfaceC664090Q3b;
import X.InterfaceC669910QPl;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchStartViewModel extends ViewModel {
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C0QJ5 LLJJJ;
    public C0QJ6 LLJJJIL;
    public InterfaceC664090Q3b LLJJJJ;
    public C0QLX LLJJJJJIL;
    public C0QLX LLJJJJLIIL;
    public InterfaceC669910QPl LLJJL;
    public SearchResultParam LLJJLIIIJLLLLLLLZ;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LL = true;
    public final C01GW LLIZLLLIL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(241));
    public final C01GW LLJ = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(250));
    public final C01GW LLJI = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(243));
    public final C01GW LLJIJIL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(242));
    public final C01GW LLJILJIL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(252));
    public final C01GW LLJILJILJ = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(244));
    public final C01GW LLJILLL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(245));
    public final C01GW LLJJ = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(247));
    public final C01GW LLJJI = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(248));
    public final C01GW LLJJIII = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(249));
    public final C01GW LLJJIJI = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(251));
    public final C01GW LLJJIJIIJIL = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(246));
    public final String LLJJIJIL = "";
    public int LLJL = -1;
    public final HashMap<String, Long> LLJLIL = new HashMap<>();
    public EnumC668740QKy LLJLLIL = EnumC668740QKy.ENTER;

    public final NextLiveData<Boolean> AQ2() {
        return (NextLiveData) this.LLJ.getValue();
    }

    public final NextLiveData<Integer> BQ2() {
        return (NextLiveData) this.LLJJIJI.getValue();
    }

    public final NextLiveData<Boolean> vQ2() {
        return (NextLiveData) this.LLIZLLLIL.getValue();
    }

    public final NextLiveData<Word> wQ2() {
        return (NextLiveData) this.LLJIJIL.getValue();
    }

    public final NextLiveData<Integer> xQ2() {
        return (NextLiveData) this.LLJILJILJ.getValue();
    }

    public final NextLiveData<Integer> yQ2() {
        return (NextLiveData) this.LLJJ.getValue();
    }

    public final NextLiveData<Integer> zQ2() {
        return (NextLiveData) this.LLJJIII.getValue();
    }
}
