package com.ss.android.ugc.aweme.tools.draft.draftbox;

import X.AnonymousClass0880;
import X.C01GW;
import X.C0M16;
import X.C20684815ws;
import X.C2097608Jq;
import X.C452501pT;
import X.C497720JfW;
import X.InterfaceC561350Lzx;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftBoxPageViewModel extends ViewModel {
    public final MutableLiveData<Integer> LL = new MutableLiveData<>(-1);
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>(-1);
    public final MutableLiveData<Long> LLILLL = new MutableLiveData<>(-1L);
    public final MutableLiveData<Unit> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>(null);
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>(Boolean.TRUE);
    public final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>(null);
    public final MutableLiveData<Long> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLJ = new MutableLiveData<>();
    public final MutableLiveData<AwemeDraft> LLJI = new MutableLiveData<>(null);
    public final MutableLiveData<Map<String, Boolean>> LLJIJIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJILJIL = new MutableLiveData<>(Boolean.FALSE);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(235));
    public boolean LLJILLL;

    public final InterfaceC561350Lzx vQ2() {
        return (InterfaceC561350Lzx) this.LLJILJILJ.getValue();
    }

    public final void xQ2() {
        AnonymousClass0880.LIZ(this.LLILZLL, Boolean.valueOf(!vQ2().vw()));
    }

    public final void wQ2(int i, String str, String str2, boolean z) {
        String str3;
        int iCw = vQ2().Cw();
        if (z) {
            if (i == 0) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            C0M16 c0m16 = C0M16.LIZ;
            Map<String, Boolean> value = this.LLJIJIL.getValue();
            if (value == null) {
                value = C2097608Jq.LJ();
            }
            c0m16.getClass();
            C0M16.LJFF(iCw, "select_all", str, str3, value);
            C497720JfW c497720JfW = C497720JfW.LIZ;
            c497720JfW.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c497720JfW.getClass();
            C497720JfW.LIZ(str, str2, linkedHashMap);
            C20684815ws.LJIILLIIL("select_all_draft", linkedHashMap);
        } else {
            C497720JfW c497720JfW2 = C497720JfW.LIZ;
            c497720JfW2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            c497720JfW2.getClass();
            C497720JfW.LIZ(str, str2, linkedHashMap2);
            C20684815ws.LJIILLIIL("deselect_all_draft", linkedHashMap2);
        }
        AnonymousClass0880.LIZ(this.LLJ, Integer.valueOf(iCw));
        AnonymousClass0880.LIZ(this.LLIZLLLIL, Long.valueOf(vQ2().yw()));
    }
}
