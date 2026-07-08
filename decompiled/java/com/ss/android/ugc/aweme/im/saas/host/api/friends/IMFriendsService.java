package com.ss.android.ugc.aweme.im.saas.host.api.friends;

import X.C0XIR;
import X.C1252380ihA;
import X.C1260960iv0;
import X.C1908830zlx;
import X.C1908890zm3;
import X.C19EG;
import X.C898270ZLt;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public interface IMFriendsService {
    public static final C898270ZLt LIZ = C898270ZLt.LIZ;

    String LIZ(User user);

    String LIZIZ(String str, String str2);

    String LIZJ(User user);

    C1260960iv0 LIZLLL(Map map);

    void LJ(C19EG c19eg, C1252380ihA c1252380ihA, String str, Function2<? super Boolean, ? super C0XIR, Unit> function2);

    void LJFF(RelationButton relationButton, User user, boolean z, LifecycleOwner lifecycleOwner, C1908890zm3 c1908890zm3);

    LifecycleOwner LJI(Context context);

    boolean LJII();

    C1908830zlx LJIIIIZZ(User user);

    EventLiveData<FollowStatus> getRelationObservable();
}
