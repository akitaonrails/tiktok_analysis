package com.ss.android.ugc.aweme.inbox.widget.v2.ability;

import X.C1900580zYe;
import X.C2252321DDq;
import X.InterfaceC1891350zJl;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface NotificationAbilityCenter {
    public static final C1900580zYe LIZ = C1900580zYe.LIZ;

    public interface INotificationFragmentAbility extends InterfaceC494301wD {
        void MF2(boolean z);

        void Mv(InboxWidgetContainer inboxWidgetContainer);

        boolean Nm1();

        void Pd0(List<? extends InterfaceC1891350zJl> list);

        C2252321DDq X71();

        void lL0();

        void qf2(String str);

        ViewOnAttachStateChangeListenerC20604515jv qp();
    }

    public interface INotificationUserCardWidgetContainerAbility extends InterfaceC494301wD {
        boolean FQ();
    }

    public interface INotificationWidgetContainerAbility extends InterfaceC494301wD {
        void Ao1(String str);

        InterfaceC332260D0u RK1();

        void ri0();
    }

    public interface IRecommendUserAbility extends InboxCommonAbilityCenter$IBaseRecommendUserAbility {
    }
}
