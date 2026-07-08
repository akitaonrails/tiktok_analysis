package com.ss.android.ugc.aweme.tako.startup.protocol;

import X.C06KX;
import X.C14FD;
import X.C1862660yZU;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;

/* JADX INFO: loaded from: classes28.dex */
public interface ITakoProcessorProtocol extends C06KX {
    boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd);

    boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams);

    int getPriority();
}
