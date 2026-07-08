package com.ss.android.ugc.aweme.search.result;

import X.C0PRW;
import X.C0PSG;
import X.C2097608Jq;
import X.EnumC669620QOi;
import android.view.View;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbsSearchBaseFragment extends AmeBaseFragment {
    public EnumC669620QOi LL;
    public boolean LLILLJJLI;
    public C0PSG LLILZ;
    public boolean LLILLL = true;
    public final C0PRW LLILZIL = new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null);

    public abstract Object MR();

    public boolean NR() {
        return false;
    }

    public abstract int OR();

    public abstract String RR(int i);

    public abstract Object SR(View view, String str);

    public abstract void UR(int i);

    public abstract void VR(int i);

    public abstract void WR(SearchResultParam searchResultParam);

    public Map<String, String> PR() {
        return C2097608Jq.LJ();
    }
}
