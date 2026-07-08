package com.ss.android.ugc.aweme.shortvideo.autocut;

import X.C1398350mUb;
import X.C13LP;
import X.C201955140j;
import X.C2188811AlT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutProcessViewModel extends ViewModel {
    public final MutableLiveData<List<AutoCutThemeData>> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();

    public final void vQ2(List<AutoCutThemeData> list) {
        String str;
        int size = list.size();
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLL(list);
        if (autoCutThemeData == null || (str = autoCutThemeData.templateId) == null) {
            str = "null";
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutProcessViewModel#templateList_update: setTemplateList size=");
        sbLIZ.append(size);
        sbLIZ.append(", firstId=");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        this.LL.setValue(list);
    }
}
