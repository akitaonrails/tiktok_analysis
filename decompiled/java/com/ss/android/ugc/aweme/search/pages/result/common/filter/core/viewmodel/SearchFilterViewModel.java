package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel;

import X.C01BM;
import X.C01GW;
import X.C0Q93;
import X.C0Q98;
import X.C19EG;
import X.C452501pT;
import X.InterfaceC0148002o;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFilterViewModel extends AssemViewModel<C0Q93> {
    public OptionConfigParams LLIZ;
    public Map<SubSwitchStruct, Boolean> LLJ;
    public C19EG LLJI;
    public Fragment LLJIJIL;
    public Map<String, String> LLJILJIL;
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZLLLIL = "";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 477));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0Q93(0);
    }

    public static void vQ2(List list, FilterOptionStruct filterOptionStruct) {
        String title = filterOptionStruct.getTitle();
        if (title == null) {
            title = "";
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C01BM(title));
        List<SubFilterOptionStruct> optionStuct = filterOptionStruct.getOptionStuct();
        if (optionStuct != null) {
            for (SubFilterOptionStruct subFilterOptionStruct : optionStuct) {
                String title2 = filterOptionStruct.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                arrayList.add(new C0Q98(subFilterOptionStruct, title2));
            }
        }
    }
}
