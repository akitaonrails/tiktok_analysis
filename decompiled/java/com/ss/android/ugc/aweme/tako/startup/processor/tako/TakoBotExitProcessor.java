package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C07I5;
import X.C14FD;
import X.C1860520yW2;
import X.C1861580yXk;
import X.C1861630yXp;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C298860BnY;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBotExitProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 6;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        if (C07I5.LIZ()) {
            C1860520yW2.LIZ.getClass();
            List<TakoActiveBotItem> list = C1860520yW2.LIZIZ().items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<TakoActiveBotItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isActive()) {
                        return true;
                    }
                }
            }
        }
        if (C298860BnY.LIZ()) {
            C1860520yW2.LIZ.getClass();
            List<TakoActiveBotItem> list2 = C1860520yW2.LIZJ().items;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<TakoActiveBotItem> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (it3.next().isActive()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        C1860520yW2.LIZ.getClass();
        List<TakoActiveBotItem> list = C1860520yW2.LIZIZ().items;
        ArrayList arrayList = new ArrayList();
        for (TakoActiveBotItem takoActiveBotItem : list) {
            if (takoActiveBotItem.isActive()) {
                arrayList.add(takoActiveBotItem);
            }
        }
        if (!arrayList.isEmpty()) {
            iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS606S0100000_27(arrayList, (List<TakoActiveBotItem>) 4)));
            C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
            TakoActiveBotHistory takoActiveBotHistory = new TakoActiveBotHistory(new ArrayList());
            c1860520yW2.getClass();
            C1860520yW2.LJIJJLI(takoActiveBotHistory);
        }
        C1861580yXk.LIZ(iMessageAbility);
        return false;
    }
}
