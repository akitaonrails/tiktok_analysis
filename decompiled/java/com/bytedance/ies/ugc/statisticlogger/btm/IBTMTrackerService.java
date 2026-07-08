package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C18C6;
import X.C2211641BhC;
import X.C443120HZe;
import X.C739840T0k;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public interface IBTMTrackerService {
    void LJIIIZ(Fragment fragment, String str);

    C739840T0k LJIIJ(Object obj, String str, boolean z);

    Map<String, String> LJIIJJI();

    Pair<C18C6, C18C6> LJIIL(View view, String str);

    String LJIILIIL(String str, boolean z);

    List<C443120HZe<String, String, JSONObject>> getBDBTMList(View view);

    Pair<Boolean, Boolean> getBDBTMReplaceSwitch();

    List<C2211641BhC> getPageRecordChain(View view, boolean z);

    List<C2211641BhC> getPageRecordChain(boolean z);

    String getPageRecordChainStringDataSubPage(View view, boolean z, String str);
}
