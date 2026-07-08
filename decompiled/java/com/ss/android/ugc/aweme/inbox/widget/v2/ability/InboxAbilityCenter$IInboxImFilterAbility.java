package com.ss.android.ugc.aweme.inbox.widget.v2.ability;

import X.EnumC880480YgQ;
import X.InterfaceC494301wD;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public interface InboxAbilityCenter$IInboxImFilterAbility extends InterfaceC494301wD {
    Boolean Ef2(Pair<? extends FilterTabType, ? extends Set<? extends EnumC880480YgQ>> pair);

    void Qe0();

    void Xg2();

    boolean gL2(FilterTabType filterTabType, String str, String str2);

    MutableLiveData jp2();
}
